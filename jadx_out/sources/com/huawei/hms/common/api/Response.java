package com.huawei.hms.common.api;

import com.huawei.hms.support.api.client.Result;

/* loaded from: classes3.dex */
public class Response<T extends Result> {
    protected T result;

    public Response() {
    }

    protected T getResult() {
        return this.result;
    }

    public void setResult(T t5) {
        this.result = t5;
    }

    protected Response(T t5) {
        this.result = t5;
    }
}
