package android.net.http;

import com.efs.sdk.base.Constants;
import com.tendcloud.tenddata.aa;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.RequestContent;

/* loaded from: assets/org.apache.http.legacy.boot */
class Request {
    private static final String ACCEPT_ENCODING_HEADER = "Accept-Encoding";
    private static final String CONTENT_LENGTH_HEADER = "content-length";
    private static final String HOST_HEADER = "Host";
    private static RequestContent requestContentProcessor = new RequestContent();
    private int mBodyLength;
    private InputStream mBodyProvider;
    private Connection mConnection;
    EventHandler mEventHandler;
    HttpHost mHost;
    BasicHttpRequest mHttpRequest;
    String mPath;
    HttpHost mProxyHost;
    volatile boolean mCancelled = false;
    int mFailCount = 0;
    private int mReceivedBytes = 0;
    private final Object mClientResource = new Object();
    private boolean mLoadingPaused = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request(String method, HttpHost host, HttpHost proxyHost, String path, InputStream bodyProvider, int bodyLength, EventHandler eventHandler, Map<String, String> headers) {
        this.mEventHandler = eventHandler;
        this.mHost = host;
        this.mProxyHost = proxyHost;
        this.mPath = path;
        this.mBodyProvider = bodyProvider;
        this.mBodyLength = bodyLength;
        if (bodyProvider == null && !HttpPost.METHOD_NAME.equalsIgnoreCase(method)) {
            this.mHttpRequest = new BasicHttpRequest(method, getUri());
        } else {
            this.mHttpRequest = new BasicHttpEntityEnclosingRequest(method, getUri());
            if (bodyProvider != null) {
                setBodyProvider(bodyProvider, bodyLength);
            }
        }
        addHeader("Host", getHostPort());
        addHeader(ACCEPT_ENCODING_HEADER, Constants.CP_GZIP);
        addHeaders(headers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void setLoadingPaused(boolean pause) {
        this.mLoadingPaused = pause;
        if (!this.mLoadingPaused) {
            notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setConnection(Connection connection) {
        this.mConnection = connection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventHandler getEventHandler() {
        return this.mEventHandler;
    }

    void addHeader(String name, String value) {
        if (name == null) {
            HttpLog.e("Null http header name");
            throw new NullPointerException("Null http header name");
        }
        if (value == null || value.length() == 0) {
            String damage = "Null or empty value for header \"" + name + "\"";
            HttpLog.e(damage);
            throw new RuntimeException(damage);
        }
        this.mHttpRequest.addHeader(name, value);
    }

    void addHeaders(Map<String, String> headers) {
        if (headers == null) {
            return;
        }
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            addHeader(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendRequest(AndroidHttpClientConnection httpClientConnection) throws org.apache.http.HttpException, IOException {
        if (this.mCancelled) {
            return;
        }
        requestContentProcessor.process(this.mHttpRequest, this.mConnection.getHttpContext());
        httpClientConnection.sendRequestHeader(this.mHttpRequest);
        if (this.mHttpRequest instanceof HttpEntityEnclosingRequest) {
            httpClientConnection.sendRequestEntity((HttpEntityEnclosingRequest) this.mHttpRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:30|31|33)|34|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0114, code lost:
    
        if (r13 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014c, code lost:
    
        if (r13 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014e, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012b, code lost:
    
        if (r13 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112 A[EDGE_INSN: B:101:0x0112->B:102:0x0112 BREAK  A[LOOP:1: B:23:0x0098->B:87:0x00e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #3 {all -> 0x0145, blocks: (B:63:0x0132, B:64:0x0137, B:49:0x013f), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:? -> B:70:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readResponse(android.net.http.AndroidHttpClientConnection r20) throws java.io.IOException, org.apache.http.ParseException {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.net.http.Request.readResponse(android.net.http.AndroidHttpClientConnection):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void cancel() {
        this.mLoadingPaused = false;
        notify();
        this.mCancelled = true;
        if (this.mConnection != null) {
            this.mConnection.cancel();
        }
    }

    String getHostPort() {
        String myScheme = this.mHost.getSchemeName();
        int myPort = this.mHost.getPort();
        if ((myPort != 80 && myScheme.equals("http")) || (myPort != 443 && myScheme.equals("https"))) {
            return this.mHost.toHostString();
        }
        return this.mHost.getHostName();
    }

    String getUri() {
        if (this.mProxyHost == null || this.mHost.getSchemeName().equals("https")) {
            return this.mPath;
        }
        return this.mHost.getSchemeName() + aa.f11324a + getHostPort() + this.mPath;
    }

    public String toString() {
        return this.mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        this.mHttpRequest.removeHeaders("content-length");
        if (this.mBodyProvider != null) {
            try {
                this.mBodyProvider.reset();
            } catch (IOException e5) {
            }
            setBodyProvider(this.mBodyProvider, this.mBodyLength);
        }
        if (this.mReceivedBytes > 0) {
            this.mFailCount = 0;
            HttpLog.v("*** Request.reset() to range:" + this.mReceivedBytes);
            this.mHttpRequest.setHeader("Range", "bytes=" + this.mReceivedBytes + "-");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void waitUntilComplete() {
        synchronized (this.mClientResource) {
            try {
                this.mClientResource.wait();
            } catch (InterruptedException e5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void complete() {
        synchronized (this.mClientResource) {
            this.mClientResource.notifyAll();
        }
    }

    private static boolean canResponseHaveBody(HttpRequest request, int status) {
        return (HttpHead.METHOD_NAME.equalsIgnoreCase(request.getRequestLine().getMethod()) || status < 200 || status == 204 || status == 304) ? false : true;
    }

    private void setBodyProvider(InputStream bodyProvider, int bodyLength) {
        if (!bodyProvider.markSupported()) {
            throw new IllegalArgumentException("bodyProvider must support mark()");
        }
        bodyProvider.mark(Integer.MAX_VALUE);
        ((BasicHttpEntityEnclosingRequest) this.mHttpRequest).setEntity(new InputStreamEntity(bodyProvider, bodyLength));
    }

    public void handleSslErrorResponse(boolean proceed) {
        HttpsConnection connection = (HttpsConnection) this.mConnection;
        if (connection != null) {
            connection.restartConnection(proceed);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void error(int errorId, String errorMessage) {
        this.mEventHandler.error(errorId, errorMessage);
    }
}
