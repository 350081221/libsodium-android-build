package com.tendcloud.tenddata;

import com.tendcloud.tenddata.n;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes3.dex */
final class au {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11427a = 128;

    /* renamed from: b, reason: collision with root package name */
    private static final int f11428b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static final String f11429c = "iv";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11430d = "salt";

    /* renamed from: e, reason: collision with root package name */
    private static final int f11431e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11432f = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final String f11433g = "AES/CBC/PKCS5Padding";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11434h = "PBKDF2WithHmacSHA1";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11435i = "AES";

    au() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IvParameterSpec a() {
        try {
            n.b bVar = n.b.AES_IV_LOCK;
            n.getFileLock(bVar.toString());
            byte[] a5 = av.a(f11429c, 16);
            if (a5 == null) {
                a5 = a(16);
                av.a(f11429c, a5);
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a5);
            n.releaseFileLock(bVar.toString());
            return ivParameterSpec;
        } catch (Throwable unused) {
            n.releaseFileLock(n.b.AES_IV_LOCK.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b() {
        String bVar;
        byte[] bArr = null;
        try {
            n.b bVar2 = n.b.AES_SALT_LOCK;
            n.getFileLock(bVar2.toString());
            bArr = av.a(f11430d, 32);
            if (bArr == null || bArr.length == 0) {
                bArr = a(32);
                av.a(f11430d, bArr);
            }
            bVar = bVar2.toString();
        } catch (Throwable unused) {
            bVar = n.b.AES_SALT_LOCK.toString();
        }
        n.releaseFileLock(bVar);
        return bArr;
    }

    private static byte[] a(int i5) {
        byte[] bArr = new byte[i5];
        y.b().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        Cipher cipher = Cipher.getInstance(y.b(19) ? f11435i : f11433g);
        cipher.init(2, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SecretKey a(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(f11434h).generateSecret(new PBEKeySpec(cArr, bArr, 10000, 128));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
        Cipher cipher = Cipher.getInstance(y.b(19) ? f11435i : f11433g);
        cipher.init(1, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
