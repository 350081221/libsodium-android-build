package com.huawei.agconnect.apms;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* loaded from: classes3.dex */
public class e0 extends ResponseBody {
    public fed abc;
    public ResponseBody bcd;
    public BufferedSource cde;

    public e0(ResponseBody responseBody, fed fedVar) {
        this.abc = fedVar;
        this.bcd = responseBody;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bcd.close();
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.bcd.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.bcd.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.cde == null) {
            this.cde = okio.y0.e(new d0(this, this.bcd.source()));
        }
        return this.cde;
    }
}
