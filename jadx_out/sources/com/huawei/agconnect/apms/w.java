package com.huawei.agconnect.apms;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import okio.BufferedSource;

/* loaded from: classes3.dex */
public class w extends ResponseBody {
    public fed abc;
    public ResponseBody bcd;
    public BufferedSource cde;

    public w(ResponseBody responseBody, fed fedVar) {
        this.abc = fedVar;
        this.bcd = responseBody;
    }

    public void close() throws IOException {
        this.bcd.close();
    }

    public long contentLength() throws IOException {
        return this.bcd.contentLength();
    }

    public MediaType contentType() {
        return this.bcd.contentType();
    }

    public BufferedSource source() throws IOException {
        if (this.cde == null) {
            this.cde = okio.y0.e(new v(this, this.bcd.source()));
        }
        return this.cde;
    }
}
