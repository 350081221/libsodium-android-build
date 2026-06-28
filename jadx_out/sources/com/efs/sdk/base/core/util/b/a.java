package com.efs.sdk.base.core.util.b;

import com.efs.sdk.base.core.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final IvParameterSpec f6645a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    public static byte[] a(byte[] bArr, String str) {
        try {
            SecretKeySpec a5 = a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, a5, f6645a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            Log.e("efs.base", "aes decrypt error", e5);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKeySpec a5 = a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, a5, f6645a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            Log.e("efs.base", "aes encrypt error", e5);
            return null;
        }
    }

    private static SecretKeySpec a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    public static byte[] a(String str, String str2) {
        try {
            return b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e5) {
            Log.e("efs.base", "getBytes error", e5);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr3[i5] = (byte) ((bArr[i5] ^ bArr2[i5 % bArr2.length]) ^ (i5 & 255));
        }
        return bArr3;
    }
}
