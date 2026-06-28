package com.bytedance.pangle.g;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    static class a extends Exception {
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<X509Certificate> f4416a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Integer> f4417b;

        public b(List<X509Certificate> list, List<Integer> list2) {
            this.f4416a = list;
            this.f4417b = list2;
        }
    }

    /* renamed from: com.bytedance.pangle.g.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0120c {

        /* renamed from: a, reason: collision with root package name */
        public final X509Certificate[] f4418a;

        /* renamed from: b, reason: collision with root package name */
        public final b f4419b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f4420c;

        public C0120c(X509Certificate[] x509CertificateArr, b bVar) {
            this.f4418a = x509CertificateArr;
            this.f4419b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0120c a(RandomAccessFile randomAccessFile, m mVar) {
        ArrayMap arrayMap = new ArrayMap();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a5 = f.a(mVar.f4436a);
                int i5 = 0;
                C0120c c0120c = null;
                while (a5.hasRemaining()) {
                    try {
                        c0120c = a(f.a(a5), arrayMap, certificateFactory);
                        i5++;
                    } catch (a unused) {
                    } catch (IOException e5) {
                        e = e5;
                        throw new SecurityException("Failed to parse/verify signer #" + i5 + " block", e);
                    } catch (SecurityException e6) {
                        e = e6;
                        throw new SecurityException("Failed to parse/verify signer #" + i5 + " block", e);
                    } catch (BufferUnderflowException e7) {
                        e = e7;
                        throw new SecurityException("Failed to parse/verify signer #" + i5 + " block", e);
                    }
                }
                if (i5 <= 0 || c0120c == null) {
                    throw new SecurityException("No signers found");
                }
                if (i5 == 1) {
                    if (!arrayMap.isEmpty()) {
                        f.a(arrayMap, randomAccessFile, mVar);
                        if (arrayMap.containsKey(3)) {
                            c0120c.f4420c = f.a((byte[]) arrayMap.get(3), randomAccessFile.length(), mVar);
                        }
                        return c0120c;
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("APK Signature Scheme V3 only supports one signer: multiple signers found.");
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0058. Please report as an issue. */
    private static C0120c a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) {
        ByteBuffer a5 = f.a(byteBuffer);
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        ByteBuffer a6 = f.a(byteBuffer);
        byte[] b5 = f.b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = -1;
        byte[] bArr = null;
        while (true) {
            int i9 = 8;
            boolean z4 = true;
            if (!a6.hasRemaining()) {
                if (i8 == -1) {
                    if (i7 == 0) {
                        throw new SecurityException("No signatures found");
                    }
                    throw new SecurityException("No supported signatures found");
                }
                String c5 = f.c(i8);
                Pair<String, ? extends AlgorithmParameterSpec> d5 = f.d(i8);
                String str = (String) d5.first;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) d5.second;
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(c5).generatePublic(new X509EncodedKeySpec(b5));
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(generatePublic);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(a5);
                    if (signature.verify(bArr)) {
                        a5.clear();
                        ByteBuffer a7 = f.a(a5);
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = 0;
                        byte[] bArr2 = null;
                        while (a7.hasRemaining()) {
                            i10++;
                            try {
                                ByteBuffer a8 = f.a(a7);
                                if (a8.remaining() >= i9) {
                                    int i11 = a8.getInt();
                                    arrayList2.add(Integer.valueOf(i11));
                                    if (i11 == i8) {
                                        bArr2 = f.b(a8);
                                    }
                                    i9 = 8;
                                } else {
                                    throw new IOException("Record too short");
                                }
                            } catch (IOException | BufferUnderflowException e5) {
                                throw new IOException("Failed to parse digest record #".concat(String.valueOf(i10)), e5);
                            }
                        }
                        if (arrayList.equals(arrayList2)) {
                            int a9 = f.a(i8);
                            byte[] put = map.put(Integer.valueOf(a9), bArr2);
                            if (put != null && !MessageDigest.isEqual(put, bArr2)) {
                                throw new SecurityException(f.b(a9) + " contents digest does not match the digest specified by a preceding signer");
                            }
                            ByteBuffer a10 = f.a(a5);
                            ArrayList arrayList3 = new ArrayList();
                            int i12 = 0;
                            while (a10.hasRemaining()) {
                                i12++;
                                byte[] b6 = f.b(a10);
                                try {
                                    arrayList3.add(new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b6)), b6));
                                } catch (CertificateException e6) {
                                    throw new SecurityException("Failed to decode certificate #".concat(String.valueOf(i12)), e6);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                if (Arrays.equals(b5, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                    if (a5.getInt() == i5) {
                                        if (a5.getInt() == i6) {
                                            return a(f.a(a5), arrayList3, certificateFactory);
                                        }
                                        throw new SecurityException("maxSdkVersion mismatch between signed and unsigned in v3 signer block.");
                                    }
                                    throw new SecurityException("minSdkVersion mismatch between signed and unsigned in v3 signer block.");
                                }
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                            throw new SecurityException("No certificates listed");
                        }
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                    throw new SecurityException(str + " signature did not verify");
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e7) {
                    throw new SecurityException("Failed to verify " + str + " signature", e7);
                }
            }
            i7++;
            try {
                ByteBuffer a11 = f.a(a6);
                if (a11.remaining() >= 8) {
                    int i13 = a11.getInt();
                    arrayList.add(Integer.valueOf(i13));
                    if (i13 != 513 && i13 != 514 && i13 != 769 && i13 != 1057 && i13 != 1059 && i13 != 1061) {
                        switch (i13) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                z4 = false;
                                break;
                        }
                    }
                    if (z4 && (i8 == -1 || f.a(i13, i8) > 0)) {
                        bArr = f.b(a11);
                        i8 = i13;
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e8) {
                throw new SecurityException("Failed to parse signature record #".concat(String.valueOf(i7)), e8);
            }
        }
    }

    private static C0120c a(ByteBuffer byteBuffer, List<X509Certificate> list, CertificateFactory certificateFactory) {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
        b bVar = null;
        while (byteBuffer.hasRemaining()) {
            ByteBuffer a5 = f.a(byteBuffer);
            if (a5.remaining() >= 4) {
                if (a5.getInt() == 1000370060) {
                    if (bVar == null) {
                        bVar = a(a5, certificateFactory);
                        try {
                            if (bVar.f4416a.size() > 0) {
                                if (!Arrays.equals(bVar.f4416a.get(r1.size() - 1).getEncoded(), x509CertificateArr[0].getEncoded())) {
                                    throw new SecurityException("Terminal certificate in Proof-of-rotation record does not match APK signing certificate");
                                }
                            } else {
                                continue;
                            }
                        } catch (CertificateEncodingException e5) {
                            throw new SecurityException("Failed to encode certificate when comparing Proof-of-rotation record and signing certificate", e5);
                        }
                    } else {
                        throw new SecurityException("Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature");
                    }
                }
            } else {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + a5.remaining());
            }
        }
        return new C0120c(x509CertificateArr, bVar);
    }

    private static b a(ByteBuffer byteBuffer, CertificateFactory certificateFactory) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        try {
            byteBuffer.getInt();
            HashSet hashSet = new HashSet();
            int i6 = -1;
            p pVar = null;
            while (byteBuffer.hasRemaining()) {
                i5++;
                ByteBuffer a5 = f.a(byteBuffer);
                ByteBuffer a6 = f.a(a5);
                int i7 = a5.getInt();
                int i8 = a5.getInt();
                byte[] b5 = f.b(a5);
                if (pVar != null) {
                    Pair<String, ? extends AlgorithmParameterSpec> d5 = f.d(i6);
                    PublicKey publicKey = pVar.getPublicKey();
                    Signature signature = Signature.getInstance((String) d5.first);
                    signature.initVerify(publicKey);
                    Object obj = d5.second;
                    if (obj != null) {
                        signature.setParameter((AlgorithmParameterSpec) obj);
                    }
                    signature.update(a6);
                    if (!signature.verify(b5)) {
                        throw new SecurityException("Unable to verify signature of certificate #" + i5 + " using " + ((String) d5.first) + " when verifying Proof-of-rotation record");
                    }
                }
                a6.rewind();
                byte[] b6 = f.b(a6);
                int i9 = a6.getInt();
                if (pVar != null && i6 != i9) {
                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i5 + " when verifying Proof-of-rotation record");
                }
                pVar = new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b6)), b6);
                if (!hashSet.contains(pVar)) {
                    hashSet.add(pVar);
                    arrayList.add(pVar);
                    arrayList2.add(Integer.valueOf(i7));
                    i6 = i8;
                } else {
                    throw new SecurityException("Encountered duplicate entries in Proof-of-rotation record at certificate #" + i5 + ".  All signing certificates should be unique");
                }
            }
            return new b(arrayList, arrayList2);
        } catch (IOException e5) {
            e = e5;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (BufferUnderflowException e6) {
            e = e6;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (InvalidKeyException e8) {
            e = e8;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (SignatureException e10) {
            e = e10;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (CertificateException e11) {
            throw new SecurityException("Failed to decode certificate #0 when verifying Proof-of-rotation record", e11);
        }
    }
}
