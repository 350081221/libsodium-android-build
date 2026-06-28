package com.huawei.agconnect.apms;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes3.dex */
public class h<T> implements ResponseHandler<T> {
    public final ResponseHandler<T> abc;
    public final fed bcd;

    public h(ResponseHandler<T> responseHandler, fed fedVar) {
        this.abc = responseHandler;
        this.bcd = fedVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        d.abc(httpResponse, this.bcd);
        return this.abc.handleResponse(httpResponse);
    }
}
