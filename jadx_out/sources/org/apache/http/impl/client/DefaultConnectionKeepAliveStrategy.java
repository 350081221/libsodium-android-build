package org.apache.http.impl.client;

import m0.a;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class DefaultConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {
    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        HeaderElementIterator it = new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
        while (it.hasNext()) {
            HeaderElement he = it.nextElement();
            String param = he.getName();
            String value = he.getValue();
            if (value != null && param.equalsIgnoreCase(a.Z)) {
                try {
                    return Long.parseLong(value) * 1000;
                } catch (NumberFormatException e5) {
                }
            }
        }
        return -1L;
    }
}
