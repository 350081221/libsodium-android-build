package com.bytedance.pangle.g;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4447a;

    /* renamed from: b, reason: collision with root package name */
    private int f4448b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f4448b = -1;
        this.f4447a = bArr;
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((p) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // com.bytedance.pangle.g.r, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f4447a;
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (this.f4448b == -1) {
            try {
                this.f4448b = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.f4448b = 0;
            }
        }
        return this.f4448b;
    }
}
