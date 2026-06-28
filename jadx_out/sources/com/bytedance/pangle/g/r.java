package com.bytedance.pangle.g;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* loaded from: classes2.dex */
class r extends X509Certificate {

    /* renamed from: a, reason: collision with root package name */
    private final X509Certificate f4450a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(X509Certificate x509Certificate) {
        this.f4450a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        this.f4450a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return this.f4450a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return this.f4450a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return this.f4450a.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return this.f4450a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return this.f4450a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return this.f4450a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.f4450a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f4450a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f4450a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f4450a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return this.f4450a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f4450a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.f4450a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f4450a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return this.f4450a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f4450a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return this.f4450a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return this.f4450a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        return this.f4450a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f4450a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return this.f4450a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.f4450a.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        this.f4450a.verify(publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        this.f4450a.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        this.f4450a.verify(publicKey, str);
    }
}
