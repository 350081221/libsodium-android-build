package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpResponseInterceptor;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpResponseInterceptorList {
    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor);

    void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i5);

    void clearResponseInterceptors();

    HttpResponseInterceptor getResponseInterceptor(int i5);

    int getResponseInterceptorCount();

    void removeResponseInterceptorByClass(Class cls);

    void setInterceptors(List list);
}
