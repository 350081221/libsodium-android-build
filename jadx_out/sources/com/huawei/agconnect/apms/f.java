package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class f implements HttpEntity, l {
    public final HttpEntity abc;
    public final fed bcd;
    public i cde;

    public f(HttpResponse httpResponse, fed fedVar) {
        this.abc = httpResponse.getEntity();
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
        fed fedVar = this.bcd;
        fedVar.uvw = edc.abc(fedVar);
        this.bcd.abc(kVar.abc);
        d.abc(this.bcd);
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
        i iVar = this.cde;
        if (iVar != null) {
            return iVar;
        }
        try {
            Object obj = this.abc;
            boolean z4 = true;
            if (obj instanceof AbstractHttpMessage) {
                Header lastHeader = ((AbstractHttpMessage) obj).getLastHeader(HTTP.TRANSFER_ENCODING);
                if (lastHeader != null && HTTP.CHUNK_CODING.equalsIgnoreCase(lastHeader.getValue())) {
                    z4 = false;
                }
            } else if (obj instanceof HttpEntityWrapper) {
                z4 = true ^ ((HttpEntityWrapper) obj).isChunked();
            }
            dcb.abc(this.bcd);
            fed fedVar = this.bcd;
            fedVar.tuv = edc.abc(fedVar);
            i iVar2 = new i(this.abc.getContent(), z4);
            this.cde = iVar2;
            iVar2.bcd.abc(this);
            return this.cde;
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
        if (this.bcd.fgh()) {
            this.abc.writeTo(outputStream);
            return;
        }
        try {
            dcb.abc(this.bcd);
            fed fedVar = this.bcd;
            fedVar.tuv = edc.abc(fedVar);
            j jVar = new j(outputStream);
            this.abc.writeTo(jVar);
            this.bcd.abc(jVar.bcd);
            fed fedVar2 = this.bcd;
            fedVar2.uvw = edc.abc(fedVar2);
            d.abc(this.bcd);
        } catch (IOException e5) {
            d.abc(this.bcd, e5);
            throw e5;
        }
    }
}
