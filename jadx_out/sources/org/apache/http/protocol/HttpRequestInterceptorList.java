package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpRequestInterceptorList {
    void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor);

    void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i5);

    void clearRequestInterceptors();

    HttpRequestInterceptor getRequestInterceptor(int i5);

    int getRequestInterceptorCount();

    void removeRequestInterceptorByClass(Class cls);

    void setInterceptors(List list);
}
