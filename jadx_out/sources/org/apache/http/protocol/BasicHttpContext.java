package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class BasicHttpContext implements HttpContext {
    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this(null);
    }

    public BasicHttpContext(HttpContext parentContext) {
        this.map = null;
        this.parentContext = parentContext;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = null;
        if (this.map != null) {
            obj = this.map.get(id);
        }
        if (obj == null && this.parentContext != null) {
            Object obj2 = this.parentContext.getAttribute(id);
            return obj2;
        }
        return obj;
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String id, Object obj) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.map == null) {
            this.map = new HashMap();
        }
        this.map.put(id, obj);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.map != null) {
            return this.map.remove(id);
        }
        return null;
    }
}
