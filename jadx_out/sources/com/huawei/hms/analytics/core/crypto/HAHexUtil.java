package com.huawei.hms.analytics.core.crypto;

import f2.c;

/* loaded from: classes3.dex */
public abstract class HAHexUtil {
    public static String byteArray2HexString(byte[] bArr) {
        return c.b(bArr);
    }

    public static byte[] hexString2ByteArray(String str) {
        return c.c(str);
    }
}
