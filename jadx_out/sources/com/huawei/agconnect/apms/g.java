package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: classes3.dex */
public class g extends HttpEntityWrapper implements l {
    public final HttpEntity abc;
    public final fed bcd;
    public i cde;

    public g(HttpResponse httpResponse, fed fedVar) {
        super(httpResponse.getEntity());
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

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        try {
            this.abc.consumeContent();
        } catch (IOException e5) {
            d.abc(this.bcd, e5);
            throw e5;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() throws IOException, IllegalStateException {
        i iVar = this.cde;
        if (iVar != null) {
            return iVar;
        }
        try {
            HttpEntity httpEntity = this.abc;
            boolean z4 = true;
            if (httpEntity instanceof HttpEntityWrapper) {
                z4 = true ^ ((HttpEntityWrapper) httpEntity).isChunked();
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

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.abc.getContentEncoding();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public long getContentLength() {
        return this.abc.getContentLength();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public Header getContentType() {
        return this.abc.getContentType();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.abc.isChunked();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.abc.isRepeatable();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.abc.isStreaming();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeTo(java.io.OutputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            com.huawei.agconnect.apms.fed r0 = r3.bcd
            boolean r0 = r0.fgh()
            if (r0 == 0) goto Le
            org.apache.http.HttpEntity r0 = r3.abc
            r0.writeTo(r4)
            return
        Le:
            r0 = 0
            com.huawei.agconnect.apms.fed r1 = r3.bcd     // Catch: java.lang.Exception -> L2a
            com.huawei.agconnect.apms.dcb.abc(r1)     // Catch: java.lang.Exception -> L2a
            com.huawei.agconnect.apms.fed r1 = r3.bcd     // Catch: java.lang.Exception -> L2a
            int r2 = com.huawei.agconnect.apms.edc.abc(r1)     // Catch: java.lang.Exception -> L2a
            r1.tuv = r2     // Catch: java.lang.Exception -> L2a
            com.huawei.agconnect.apms.j r1 = new com.huawei.agconnect.apms.j     // Catch: java.lang.Exception -> L2a
            r1.<init>(r4)     // Catch: java.lang.Exception -> L2a
            org.apache.http.HttpEntity r4 = r3.abc     // Catch: java.lang.Exception -> L27
            r4.writeTo(r1)     // Catch: java.lang.Exception -> L27
            goto L31
        L27:
            r4 = move-exception
            r0 = r1
            goto L2b
        L2a:
            r4 = move-exception
        L2b:
            com.huawei.agconnect.apms.fed r1 = r3.bcd
            com.huawei.agconnect.apms.d.abc(r1, r4)
            r1 = r0
        L31:
            if (r1 == 0) goto L3a
            com.huawei.agconnect.apms.fed r4 = r3.bcd
            long r0 = r1.bcd
            r4.abc(r0)
        L3a:
            com.huawei.agconnect.apms.fed r4 = r3.bcd
            int r0 = com.huawei.agconnect.apms.edc.abc(r4)
            r4.uvw = r0
            com.huawei.agconnect.apms.fed r4 = r3.bcd
            com.huawei.agconnect.apms.d.abc(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.g.writeTo(java.io.OutputStream):void");
    }
}
