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
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final X509Certificate[][] f4414a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f4415b;

        public a(X509Certificate[][] x509CertificateArr, byte[] bArr) {
            this.f4414a = x509CertificateArr;
            this.f4415b = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(RandomAccessFile randomAccessFile, m mVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a5 = f.a(mVar.f4436a);
                int i5 = 0;
                while (a5.hasRemaining()) {
                    i5++;
                    try {
                        arrayList.add(a(f.a(a5), arrayMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e5) {
                        throw new SecurityException("Failed to parse/verify signer #" + i5 + " block", e5);
                    }
                }
                if (i5 > 0) {
                    if (!arrayMap.isEmpty()) {
                        f.a(arrayMap, randomAccessFile, mVar);
                        return new a((X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]), arrayMap.containsKey(3) ? f.a((byte[]) arrayMap.get(3), randomAccessFile.length(), mVar) : null);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e6) {
                throw new SecurityException("Failed to read list of signers", e6);
            }
        } catch (CertificateException e7) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e7);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004f. Please report as an issue. */
    private static X509Certificate[] a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) {
        ByteBuffer a5 = f.a(byteBuffer);
        ByteBuffer a6 = f.a(byteBuffer);
        byte[] b5 = f.b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i5 = 0;
        int i6 = -1;
        byte[] bArr2 = null;
        while (true) {
            boolean z4 = true;
            if (!a6.hasRemaining()) {
                if (i6 == -1) {
                    if (i5 == 0) {
                        throw new SecurityException("No signatures found");
                    }
                    throw new SecurityException("No supported signatures found");
                }
                String c5 = f.c(i6);
                Pair<String, ? extends AlgorithmParameterSpec> d5 = f.d(i6);
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
                    if (signature.verify(bArr2)) {
                        a5.clear();
                        ByteBuffer a7 = f.a(a5);
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = 0;
                        while (a7.hasRemaining()) {
                            i7++;
                            try {
                                ByteBuffer a8 = f.a(a7);
                                if (a8.remaining() >= 8) {
                                    int i8 = a8.getInt();
                                    arrayList2.add(Integer.valueOf(i8));
                                    if (i8 == i6) {
                                        bArr = f.b(a8);
                                    }
                                } else {
                                    throw new IOException("Record too short");
                                }
                            } catch (IOException | BufferUnderflowException e5) {
                                throw new IOException("Failed to parse digest record #".concat(String.valueOf(i7)), e5);
                            }
                        }
                        if (arrayList.equals(arrayList2)) {
                            int a9 = f.a(i6);
                            byte[] put = map.put(Integer.valueOf(a9), bArr);
                            if (put != null && !MessageDigest.isEqual(put, bArr)) {
                                throw new SecurityException(f.b(a9) + " contents digest does not match the digest specified by a preceding signer");
                            }
                            ByteBuffer a10 = f.a(a5);
                            ArrayList arrayList3 = new ArrayList();
                            int i9 = 0;
                            while (a10.hasRemaining()) {
                                i9++;
                                byte[] b6 = f.b(a10);
                                try {
                                    arrayList3.add(new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b6)), b6));
                                } catch (CertificateException e6) {
                                    throw new SecurityException("Failed to decode certificate #".concat(String.valueOf(i9)), e6);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                if (Arrays.equals(b5, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                    a(f.a(a5));
                                    return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
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
            i5++;
            try {
                ByteBuffer a11 = f.a(a6);
                if (a11.remaining() >= 8) {
                    int i10 = a11.getInt();
                    arrayList.add(Integer.valueOf(i10));
                    if (i10 != 513 && i10 != 514 && i10 != 769 && i10 != 1057 && i10 != 1059 && i10 != 1061) {
                        switch (i10) {
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
                    if (z4 && (i6 == -1 || f.a(i10, i6) > 0)) {
                        bArr2 = f.b(a11);
                        i6 = i10;
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e8) {
                throw new SecurityException("Failed to parse signature record #".concat(String.valueOf(i5)), e8);
            }
        }
    }

    private static void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            ByteBuffer a5 = f.a(byteBuffer);
            if (a5.remaining() >= 4) {
                if (a5.getInt() == -1091571699) {
                    if (a5.remaining() >= 4) {
                        if (a5.getInt() == 3) {
                            throw new SecurityException("V2 signature indicates APK is signed using APK Signature Scheme v3, but none was found. Signature stripped?");
                        }
                    } else {
                        throw new IOException("V2 Signature Scheme Stripping Protection Attribute  value too small. Expected 4 bytes, but found " + a5.remaining());
                    }
                }
            } else {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + a5.remaining());
            }
        }
    }
}
