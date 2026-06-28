package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    @Override // org.apache.http.ConnectionReuseStrategy
    public boolean keepAlive(HttpResponse response, HttpContext context) {
        if (response == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (context == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        return false;
    }
}
