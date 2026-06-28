package org.apache.http.params;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public abstract class HttpAbstractParamBean {
    protected final HttpParams params;

    public HttpAbstractParamBean(HttpParams params) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.params = params;
    }
}
