package org.apache.http.impl.cookie;

import java.util.StringTokenizer;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class RFC2965PortAttributeHandler implements CookieAttributeHandler {
    private static int[] parsePortAttribute(String portValue) throws MalformedCookieException {
        StringTokenizer st = new StringTokenizer(portValue, ",");
        int[] ports = new int[st.countTokens()];
        int i5 = 0;
        while (st.hasMoreTokens()) {
            try {
                ports[i5] = Integer.parseInt(st.nextToken().trim());
                if (ports[i5] < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i5++;
            } catch (NumberFormatException e5) {
                throw new MalformedCookieException("Invalid Port attribute: " + e5.getMessage());
            }
        }
        return ports;
    }

    private static boolean portMatch(int port, int[] ports) {
        for (int i5 : ports) {
            if (port == i5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie cookie, String portValue) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (cookie instanceof SetCookie2) {
            SetCookie2 cookie2 = (SetCookie2) cookie;
            if (portValue != null && portValue.trim().length() > 0) {
                int[] ports = parsePortAttribute(portValue);
                cookie2.setPorts(ports);
            }
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        int port = origin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR) && !portMatch(port, cookie.getPorts())) {
            throw new MalformedCookieException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin origin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        int port = origin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR)) {
            return cookie.getPorts() != null && portMatch(port, cookie.getPorts());
        }
        return true;
    }
}
