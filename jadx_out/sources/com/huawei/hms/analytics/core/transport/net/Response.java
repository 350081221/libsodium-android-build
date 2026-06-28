package com.huawei.hms.analytics.core.transport.net;

/* loaded from: classes3.dex */
public class Response {
    private String content;
    private int httpCode;

    public Response(int i5, String str) {
        this.httpCode = i5;
        this.content = str;
    }

    public String getContent() {
        return this.content;
    }

    public int getHttpCode() {
        return this.httpCode;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setHttpCode(int i5) {
        this.httpCode = i5;
    }
}
