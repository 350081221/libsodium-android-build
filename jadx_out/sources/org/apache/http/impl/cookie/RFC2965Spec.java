package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class RFC2965Spec extends RFC2109Spec {
    public RFC2965Spec() {
        this(null, false);
    }

    public RFC2965Spec(String[] datepatterns, boolean oneHeader) {
        super(datepatterns, oneHeader);
        registerAttribHandler(ClientCookie.DOMAIN_ATTR, new RFC2965DomainAttributeHandler());
        registerAttribHandler(ClientCookie.PORT_ATTR, new RFC2965PortAttributeHandler());
        registerAttribHandler(ClientCookie.COMMENTURL_ATTR, new RFC2965CommentUrlAttributeHandler());
        registerAttribHandler(ClientCookie.DISCARD_ATTR, new RFC2965DiscardAttributeHandler());
        registerAttribHandler("version", new RFC2965VersionAttributeHandler());
    }

    private BasicClientCookie createCookie(String name, String value, CookieOrigin origin) {
        BasicClientCookie cookie = new BasicClientCookie(name, value);
        cookie.setPath(getDefaultPath(origin));
        cookie.setDomain(getDefaultDomain(origin));
        return cookie;
    }

    private BasicClientCookie createCookie2(String name, String value, CookieOrigin origin) {
        BasicClientCookie2 cookie = new BasicClientCookie2(name, value);
        cookie.setPath(getDefaultPath(origin));
        cookie.setDomain(getDefaultDomain(origin));
        cookie.setPorts(new int[]{origin.getPort()});
        return cookie;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException {
        BasicClientCookie cookie;
        RFC2965Spec rFC2965Spec = this;
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        CookieOrigin origin2 = adjustEffectiveHost(origin);
        HeaderElement[] elems = header.getElements();
        List<Cookie> cookies = new ArrayList<>(elems.length);
        int length = elems.length;
        int i5 = 0;
        while (i5 < length) {
            HeaderElement headerelement = elems[i5];
            String name = headerelement.getName();
            String value = headerelement.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            if (header.getName().equals(SM.SET_COOKIE2)) {
                cookie = rFC2965Spec.createCookie2(name, value, origin2);
            } else {
                cookie = rFC2965Spec.createCookie(name, value, origin2);
            }
            NameValuePair[] attribs = headerelement.getParameters();
            Map<String, NameValuePair> attribmap = new HashMap<>(attribs.length);
            for (int j5 = attribs.length - 1; j5 >= 0; j5--) {
                NameValuePair param = attribs[j5];
                attribmap.put(param.getName().toLowerCase(Locale.ENGLISH), param);
            }
            Iterator<Map.Entry<String, NameValuePair>> it = attribmap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, NameValuePair> entry = it.next();
                NameValuePair attrib = entry.getValue();
                Iterator<Map.Entry<String, NameValuePair>> it2 = it;
                String s5 = attrib.getName().toLowerCase(Locale.ENGLISH);
                cookie.setAttribute(s5, attrib.getValue());
                CookieAttributeHandler handler = rFC2965Spec.findAttribHandler(s5);
                if (handler != null) {
                    handler.parse(cookie, attrib.getValue());
                }
                it = it2;
                rFC2965Spec = this;
            }
            cookies.add(cookie);
            i5++;
            rFC2965Spec = this;
        }
        return cookies;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        super.validate(cookie, adjustEffectiveHost(origin));
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin origin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        return super.match(cookie, adjustEffectiveHost(origin));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.cookie.RFC2109Spec
    public void formatCookieAsVer(CharArrayBuffer buffer, Cookie cookie, int version) {
        String s5;
        int[] ports;
        super.formatCookieAsVer(buffer, cookie, version);
        if ((cookie instanceof ClientCookie) && (s5 = ((ClientCookie) cookie).getAttribute(ClientCookie.PORT_ATTR)) != null) {
            buffer.append("; $Port");
            buffer.append("=\"");
            if (s5.trim().length() > 0 && (ports = cookie.getPorts()) != null) {
                int len = ports.length;
                for (int i5 = 0; i5 < len; i5++) {
                    if (i5 > 0) {
                        buffer.append(",");
                    }
                    buffer.append(Integer.toString(ports[i5]));
                }
            }
            buffer.append("\"");
        }
    }

    private static CookieOrigin adjustEffectiveHost(CookieOrigin origin) {
        String host = origin.getHost();
        boolean isLocalHost = true;
        for (int i5 = 0; i5 < host.length(); i5++) {
            char ch = host.charAt(i5);
            if (ch == '.' || ch == ':') {
                isLocalHost = false;
                break;
            }
        }
        if (isLocalHost) {
            return new CookieOrigin(host + ".local", origin.getPort(), origin.getPath(), origin.isSecure());
        }
        return origin;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 1;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        CharArrayBuffer buffer = new CharArrayBuffer(40);
        buffer.append(SM.COOKIE2);
        buffer.append(": ");
        buffer.append("$Version=");
        buffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(buffer);
    }
}
