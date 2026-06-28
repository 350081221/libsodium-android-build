package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class DefaultRequestDirector implements RequestDirector {
    private static Method cleartextTrafficPermittedMethod;
    private static Object networkSecurityPolicy;
    protected final ClientConnectionManager connManager;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    private final AuthenticationHandler proxyAuthHandler;
    private final AuthState proxyAuthState;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    private final AuthenticationHandler targetAuthHandler;
    private final AuthState targetAuthState;
    private final UserTokenHandler userTokenHandler;

    public DefaultRequestDirector(HttpRequestExecutor requestExec, ClientConnectionManager conman, ConnectionReuseStrategy reustrat, ConnectionKeepAliveStrategy kastrat, HttpRoutePlanner rouplan, HttpProcessor httpProcessor, HttpRequestRetryHandler retryHandler, RedirectHandler redirectHandler, AuthenticationHandler targetAuthHandler, AuthenticationHandler proxyAuthHandler, UserTokenHandler userTokenHandler, HttpParams params) {
        if (requestExec == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        }
        if (conman == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        }
        if (reustrat == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        }
        if (kastrat == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        }
        if (rouplan == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        }
        if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        }
        if (retryHandler == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        }
        if (redirectHandler == null) {
            throw new IllegalArgumentException("Redirect handler may not be null.");
        }
        if (targetAuthHandler == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        }
        if (proxyAuthHandler == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        }
        if (userTokenHandler == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.requestExec = requestExec;
        this.connManager = conman;
        this.reuseStrategy = reustrat;
        this.keepAliveStrategy = kastrat;
        this.routePlanner = rouplan;
        this.httpProcessor = httpProcessor;
        this.retryHandler = retryHandler;
        this.redirectHandler = redirectHandler;
        this.targetAuthHandler = targetAuthHandler;
        this.proxyAuthHandler = proxyAuthHandler;
        this.userTokenHandler = userTokenHandler;
        this.params = params;
        this.managedConn = null;
        this.redirectCount = 0;
        this.maxRedirects = this.params.getIntParameter(ClientPNames.MAX_REDIRECTS, 100);
        this.targetAuthState = new AuthState();
        this.proxyAuthState = new AuthState();
    }

    private RequestWrapper wrapRequest(HttpRequest request) throws ProtocolException {
        if (request instanceof HttpEntityEnclosingRequest) {
            return new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) request);
        }
        return new RequestWrapper(request);
    }

    protected void rewriteRequestURI(RequestWrapper request, HttpRoute route) throws ProtocolException {
        try {
            URI uri = request.getURI();
            if (route.getProxyHost() != null && !route.isTunnelled()) {
                if (!uri.isAbsolute()) {
                    HttpHost target = route.getTargetHost();
                    request.setURI(URIUtils.rewriteURI(uri, target));
                    return;
                }
                return;
            }
            if (uri.isAbsolute()) {
                request.setURI(URIUtils.rewriteURI(uri, null));
            }
        } catch (URISyntaxException ex) {
            throw new ProtocolException("Invalid URI: " + request.getRequestLine().getUri(), ex);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0261, code lost:
    
        r23 = r5;
        r11.setParams(r24.params);
        r24.requestExec.postProcess(r11, r24.httpProcessor, r27);
        r10 = r24.reuseStrategy.keepAlive(r11, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0278, code lost:
    
        if (r10 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x027a, code lost:
    
        r3 = r24.keepAliveStrategy.getKeepAliveDuration(r11, r27);
        r24.managedConn.setIdleDuration(r3, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0287, code lost:
    
        r0 = handleResponse(r6, r11, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028b, code lost:
    
        if (r0 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c0, code lost:
    
        r3 = r24.userTokenHandler.getUserToken(r27);
        r27.setAttribute(org.apache.http.client.protocol.ClientContext.USER_TOKEN, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02cd, code lost:
    
        if (r24.managedConn == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02cf, code lost:
    
        r24.managedConn.setState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d4, code lost:
    
        r4 = r17;
        r3 = r21;
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0290, code lost:
    
        if (r10 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0292, code lost:
    
        r24.log.debug("Connection kept alive");
        r3 = r11.getEntity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029d, code lost:
    
        if (r3 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029f, code lost:
    
        r3.consumeContent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a2, code lost:
    
        r24.managedConn.markReusable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b9, code lost:
    
        if (r0.getRoute().equals(r6.getRoute()) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02bb, code lost:
    
        releaseConnection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02be, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a8, code lost:
    
        r24.managedConn.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0367, code lost:
    
        r24.managedConn.markReusable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        throw new org.apache.http.client.NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity");
     */
    @Override // org.apache.http.client.RequestDirector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r25, org.apache.http.HttpRequest r26, org.apache.http.protocol.HttpContext r27) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    protected void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException ignored) {
            this.log.debug("IOException releasing connection", ignored);
        }
        this.managedConn = null;
    }

    protected HttpRoute determineRoute(HttpHost target, HttpRequest request, HttpContext context) throws HttpException {
        URI uri;
        if (target == null) {
            target = (HttpHost) request.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        if (target == null) {
            String scheme = null;
            String host = null;
            String path = null;
            if ((request instanceof HttpUriRequest) && (uri = ((HttpUriRequest) request).getURI()) != null) {
                scheme = uri.getScheme();
                host = uri.getHost();
                path = uri.getPath();
            }
            throw new IllegalStateException("Target host must not be null, or set in parameters. scheme=" + scheme + ", host=" + host + ", path=" + path);
        }
        return this.routePlanner.determineRoute(target, request, context);
    }

    protected void establishRoute(HttpRoute route, HttpContext context) throws HttpException, IOException {
        int step;
        HttpRouteDirector rowdy = new BasicRouteDirector();
        do {
            HttpRoute fact = this.managedConn.getRoute();
            step = rowdy.nextStep(route, fact);
            switch (step) {
                case -1:
                    throw new IllegalStateException("Unable to establish route.\nplanned = " + route + "\ncurrent = " + fact);
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(route, context, this.params);
                    break;
                case 3:
                    boolean secure = createTunnelToTarget(route, context);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(secure, this.params);
                    break;
                case 4:
                    int hop = fact.getHopCount() - 1;
                    boolean secure2 = createTunnelToProxy(route, hop, context);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(route.getHopTarget(hop), secure2, this.params);
                    break;
                case 5:
                    this.managedConn.layerProtocol(context, this.params);
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + step + " from RouteDirector.");
            }
        } while (step > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute r22, org.apache.http.protocol.HttpContext r23) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.createTunnelToTarget(org.apache.http.conn.routing.HttpRoute, org.apache.http.protocol.HttpContext):boolean");
    }

    protected boolean createTunnelToProxy(HttpRoute route, int hop, HttpContext context) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    protected HttpRequest createConnectRequest(HttpRoute route, HttpContext context) {
        HttpHost target = route.getTargetHost();
        String host = target.getHostName();
        int port = target.getPort();
        if (port < 0) {
            Scheme scheme = this.connManager.getSchemeRegistry().getScheme(target.getSchemeName());
            port = scheme.getDefaultPort();
        }
        StringBuilder buffer = new StringBuilder(host.length() + 6);
        buffer.append(host);
        buffer.append(':');
        buffer.append(Integer.toString(port));
        String authority = buffer.toString();
        ProtocolVersion ver = HttpProtocolParams.getVersion(this.params);
        HttpRequest req = new BasicHttpRequest("CONNECT", authority, ver);
        return req;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.apache.http.impl.client.RoutedRequest handleResponse(org.apache.http.impl.client.RoutedRequest r20, org.apache.http.HttpResponse r21, org.apache.http.protocol.HttpContext r22) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.handleResponse(org.apache.http.impl.client.RoutedRequest, org.apache.http.HttpResponse, org.apache.http.protocol.HttpContext):org.apache.http.impl.client.RoutedRequest");
    }

    private void abortConnection() {
        ManagedClientConnection mcc = this.managedConn;
        if (mcc != null) {
            this.managedConn = null;
            try {
                mcc.abortConnection();
            } catch (IOException ex) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(ex.getMessage(), ex);
                }
            }
            try {
                mcc.releaseConnection();
            } catch (IOException ignored) {
                this.log.debug("Error releasing connection", ignored);
            }
        }
    }

    private void processChallenges(Map<String, Header> challenges, AuthState authState, AuthenticationHandler authHandler, HttpResponse response, HttpContext context) throws MalformedChallengeException, AuthenticationException {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = authHandler.selectScheme(challenges, response, context);
            authState.setAuthScheme(authScheme);
        }
        String id = authScheme.getSchemeName();
        Header challenge = challenges.get(id.toLowerCase(Locale.ENGLISH));
        if (challenge == null) {
            throw new AuthenticationException(id + " authorization challenge expected, but not found");
        }
        authScheme.processChallenge(challenge);
        this.log.debug("Authorization challenge processed");
    }

    private void updateAuthState(AuthState authState, HttpHost host, CredentialsProvider credsProvider) {
        if (!authState.isValid()) {
            return;
        }
        String hostname = host.getHostName();
        int port = host.getPort();
        if (port < 0) {
            Scheme scheme = this.connManager.getSchemeRegistry().getScheme(host);
            port = scheme.getDefaultPort();
        }
        AuthScheme authScheme = authState.getAuthScheme();
        AuthScope authScope = new AuthScope(hostname, port, authScheme.getRealm(), authScheme.getSchemeName());
        if (this.log.isDebugEnabled()) {
            this.log.debug("Authentication scope: " + authScope);
        }
        Credentials creds = authState.getCredentials();
        if (creds == null) {
            creds = credsProvider.getCredentials(authScope);
            if (this.log.isDebugEnabled()) {
                if (creds != null) {
                    this.log.debug("Found credentials");
                } else {
                    this.log.debug("Credentials not found");
                }
            }
        } else if (authScheme.isComplete()) {
            this.log.debug("Authentication failed");
            creds = null;
        }
        authState.setAuthScope(authScope);
        authState.setCredentials(creds);
    }

    private static boolean isCleartextTrafficPermitted(String hostname) {
        Object policy;
        Method method;
        try {
            synchronized (DefaultRequestDirector.class) {
                if (cleartextTrafficPermittedMethod == null) {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    Method getInstanceMethod = cls.getMethod("getInstance", new Class[0]);
                    networkSecurityPolicy = getInstanceMethod.invoke(null, new Object[0]);
                    cleartextTrafficPermittedMethod = cls.getMethod("isCleartextTrafficPermitted", String.class);
                }
                policy = networkSecurityPolicy;
                method = cleartextTrafficPermittedMethod;
            }
            return ((Boolean) method.invoke(policy, hostname)).booleanValue();
        } catch (ReflectiveOperationException e5) {
            return true;
        }
    }
}
