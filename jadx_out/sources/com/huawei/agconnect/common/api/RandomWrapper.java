package com.huawei.agconnect.common.api;

import f2.b;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class RandomWrapper {
    public static byte[] generateSecureRandom(int i5) {
        b.i(true);
        byte[] d5 = b.d(i5);
        if (d5.length != 0) {
            return d5;
        }
        byte[] bArr = new byte[i5];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
