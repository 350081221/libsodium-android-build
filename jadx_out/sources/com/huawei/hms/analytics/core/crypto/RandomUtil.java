package com.huawei.hms.analytics.core.crypto;

import com.huawei.hms.analytics.core.log.HiLog;
import f2.b;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class RandomUtil {

    /* renamed from: a, reason: collision with root package name */
    private static RandomUtil f8191a;

    /* renamed from: b, reason: collision with root package name */
    private final SecureRandom f8192b;

    private RandomUtil() {
        try {
            b.i(false);
        } catch (Throwable th) {
            HiLog.w("RandomUtil", "setBouncycastleFlag exception. " + th.getMessage());
        }
        this.f8192b = b.c();
    }

    private static synchronized void a() {
        synchronized (RandomUtil.class) {
            if (f8191a == null) {
                f8191a = new RandomUtil();
            }
        }
    }

    public static RandomUtil getInstance() {
        if (f8191a == null) {
            a();
        }
        return f8191a;
    }

    public final byte[] generateSecureRandom(int i5) {
        byte[] bArr = new byte[i5];
        this.f8192b.nextBytes(bArr);
        return bArr;
    }

    public final String generateSecureRandomStr(int i5) {
        byte[] bArr = new byte[i5];
        this.f8192b.nextBytes(bArr);
        return HAHexUtil.byteArray2HexString(bArr);
    }
}
