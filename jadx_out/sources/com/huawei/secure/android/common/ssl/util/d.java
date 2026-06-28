package com.huawei.secure.android.common.ssl.util;

import android.net.http.SslCertificate;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9024a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9025b = 5;

    public static X509Certificate a(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
            } catch (CertificateException e5) {
                i.c(f9024a, "exception", e5);
            }
        }
        return null;
    }

    public static X509Certificate b(String str) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(str.getBytes()));
        } catch (CertificateException e5) {
            i.d(f9024a, "generateX509FromStr: CertificateException" + e5.getMessage());
            return null;
        }
    }

    public static boolean c(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean d(X509Certificate x509Certificate, String str) {
        if (!str.equals(x509Certificate.getSubjectDN().getName())) {
            i.d(f9024a, "verify: subject name is error");
            return false;
        }
        return true;
    }

    public static boolean e(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            if (j(new X509Certificate[]{x509Certificate, x509Certificate2})) {
                return true;
            }
            i.d(f9024a, "verify: date not right");
            return false;
        } catch (InvalidKeyException e5) {
            i.d(f9024a, "verify: publickey InvalidKeyException " + e5.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e6) {
            i.d(f9024a, "verify: publickey NoSuchAlgorithmException " + e6.getMessage());
            return false;
        } catch (NoSuchProviderException e7) {
            i.d(f9024a, "verify: publickey NoSuchProviderException " + e7.getMessage());
            return false;
        } catch (SignatureException e8) {
            i.d(f9024a, "verify: publickey SignatureException " + e8.getMessage());
            return false;
        } catch (CertificateException e9) {
            i.d(f9024a, "verify: publickey CertificateException " + e9.getMessage());
            return false;
        } catch (Exception e10) {
            i.d(f9024a, "verify: Exception " + e10.getMessage());
            return false;
        }
    }

    public static boolean f(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) throws NoSuchProviderException, CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Principal principal = null;
        int i5 = 0;
        while (i5 < x509CertificateArr.length) {
            X509Certificate x509Certificate2 = x509CertificateArr[i5];
            Principal issuerDN = x509Certificate2.getIssuerDN();
            Principal subjectDN = x509Certificate2.getSubjectDN();
            if (principal != null) {
                if (issuerDN.equals(principal)) {
                    x509CertificateArr[i5].verify(x509CertificateArr[i5 - 1].getPublicKey());
                } else {
                    i.d(f9024a, "verify: principalIssuer not match");
                    return false;
                }
            }
            i5++;
            principal = subjectDN;
        }
        if (!e(x509Certificate, x509CertificateArr[0]) || !j(x509CertificateArr) || !c(x509Certificate) || !h(x509CertificateArr)) {
            return false;
        }
        return true;
    }

    public static boolean g(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr, X509CRL x509crl, String str) throws NoSuchAlgorithmException, CertificateException, NoSuchProviderException, InvalidKeyException, SignatureException {
        if (f(x509Certificate, x509CertificateArr) || i(x509CertificateArr, x509crl) || !d(x509CertificateArr[x509CertificateArr.length - 1], str) || !j(x509CertificateArr)) {
            return false;
        }
        return true;
    }

    public static boolean h(X509Certificate[] x509CertificateArr) {
        for (int i5 = 0; i5 < x509CertificateArr.length - 1; i5++) {
            if (!c(x509CertificateArr[i5])) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(X509Certificate[] x509CertificateArr, X509CRL x509crl) {
        ArrayList arrayList = new ArrayList();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            arrayList.add(x509Certificate.getSerialNumber());
        }
        if (x509crl != null) {
            try {
                Set<? extends X509CRLEntry> revokedCertificates = x509crl.getRevokedCertificates();
                if (revokedCertificates != null && !revokedCertificates.isEmpty()) {
                    Iterator<? extends X509CRLEntry> it = revokedCertificates.iterator();
                    while (it.hasNext()) {
                        if (arrayList.contains(it.next().getSerialNumber())) {
                            i.d(f9024a, "verify: certificate revoked");
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            } catch (Exception e5) {
                i.d(f9024a, "verify: revoked verify exception : " + e5.getMessage());
                return false;
            }
        }
        return true;
    }

    public static boolean j(X509Certificate[] x509CertificateArr) {
        Date date = new Date();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            try {
                x509Certificate.checkValidity(date);
            } catch (CertificateExpiredException e5) {
                e = e5;
                i.d(f9024a, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (CertificateNotYetValidException e6) {
                e = e6;
                i.d(f9024a, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (Exception e7) {
                i.d(f9024a, "verifyCertificateDate : exception : " + e7.getMessage());
                return false;
            }
        }
        return true;
    }
}
