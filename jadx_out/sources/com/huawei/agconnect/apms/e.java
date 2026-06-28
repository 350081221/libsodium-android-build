package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* loaded from: classes3.dex */
public class e implements HttpEntity, l {
    public final HttpEntity abc;
    public final fed bcd;

    public e(HttpEntity httpEntity, fed fedVar) {
        this.abc = httpEntity;
        this.bcd = fedVar;
    }

    @Override // com.huawei.agconnect.apms.l
    public void abc(k kVar) {
        ((n) kVar.getSource()).abc(this);
        d.abc(this.bcd, kVar.bcd);
    }

    @Override // com.huawei.agconnect.apms.l
    public void bcd(k kVar) {
        ((n) kVar.getSource()).abc(this);
        this.bcd.bcd(kVar.abc);
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        try {
            this.abc.consumeContent();
        } catch (IOException e5) {
            d.abc(this.bcd, e5);
            throw e5;
        }
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException, IllegalStateException {
        try {
            if (!this.bcd.mno()) {
                i iVar = new i(this.abc.getContent());
                iVar.bcd.abc(this);
                return iVar;
            }
            return this.abc.getContent();
        } catch (IOException e5) {
            d.abc(this.bcd, e5);
            throw e5;
        } catch (IllegalStateException e6) {
            d.abc(this.bcd, e6);
            throw e6;
        }
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.abc.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.abc.getContentLength();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.abc.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.abc.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.abc.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.abc.isStreaming();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        try {
            if (!this.bcd.mno()) {
                j jVar = new j(outputStream);
                this.abc.writeTo(jVar);
                this.bcd.bcd(jVar.bcd);
                return;
            }
            this.abc.writeTo(outputStream);
        } catch (IOException e5) {
            d.abc(this.bcd, e5);
            throw e5;
        }
    }
}
