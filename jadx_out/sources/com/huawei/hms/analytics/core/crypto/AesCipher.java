package com.huawei.hms.analytics.core.crypto;

import c2.b;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.secure.android.common.encrypt.aes.a;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class AesCipher {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8190a = Charset.forName("UTF-8");

    /* loaded from: classes3.dex */
    public interface AesLen {
        public static final int AES_128_CBC_IV_LEN = 16;
        public static final int AES_128_CBC_KEY_LEN = 16;
        public static final int ROOTKEY_COMPONET_LEN = 128;
    }

    public static String aesKsDecrypt(String str, String str2) {
        return b.d(str, str2);
    }

    public static String aesKsEncrypt(String str, String str2) {
        return b.g(str, str2);
    }

    public static String decryptCbc(String str, String str2) {
        return a.l(getCbcEncryptWord(str), str2, getCBCIv(str));
    }

    public static String encryptCbc(String str, String str2) {
        return HAHexUtil.byteArray2HexString(a.x(str.getBytes(f8190a), HAHexUtil.hexString2ByteArray(str2)));
    }

    public static String encryptCbc(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] hexString2ByteArray = HAHexUtil.hexString2ByteArray(str);
            if (hexString2ByteArray.length >= 16) {
                return HAHexUtil.byteArray2HexString(a.x(bArr, hexString2ByteArray));
            }
            str2 = "key length is not right";
        }
        HiLog.e("AesCypher", str2);
        return "";
    }

    public static String gcmDecrypt(String str, String str2) {
        return com.huawei.secure.android.common.encrypt.aes.b.h(str, str2);
    }

    public static String gcmEncrypt(String str, String str2) {
        return com.huawei.secure.android.common.encrypt.aes.b.q(str, str2);
    }

    public static String getCBCIv(String str) {
        if (str != null && str.length() >= 32) {
            return str.substring(0, 32);
        }
        HiLog.e("AesCypher", "cbc IV is invalid.");
        return "";
    }

    public static String getCbcEncryptWord(String str) {
        return (str == null || str.length() < 32) ? "" : str.substring(32);
    }
}
