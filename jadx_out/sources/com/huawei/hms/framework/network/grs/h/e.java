package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8513a = "e";

    public static boolean a(Long l5) {
        if (l5 == null) {
            Logger.v(f8513a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(f8513a, "isSpExpire spValue NumberFormatException.");
        }
        if (l5.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i(f8513a, "isSpExpire false.");
            return false;
        }
        Logger.i(f8513a, "isSpExpire true.");
        return true;
    }

    public static boolean a(Long l5, long j5) {
        if (l5 == null) {
            Logger.v(f8513a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l5.longValue() - (System.currentTimeMillis() + j5) >= 0) {
                Logger.v(f8513a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f8513a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
