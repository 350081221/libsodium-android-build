package com.tendcloud.tenddata;

import android.content.Context;

/* loaded from: classes3.dex */
public final class cm {
    public static boolean a() {
        try {
            if (!bx.a()) {
                return false;
            }
            Class.forName("com.android.id.impl.IdProviderImpl");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectMiUi(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            Object newInstance = cls.newInstance();
            try {
                df.a().setUDID((String) cls.getMethod("getUDID", Context.class).invoke(newInstance, context));
            } catch (Throwable unused) {
            }
            try {
                df.a().setOAID((String) cls.getMethod("getOAID", Context.class).invoke(newInstance, context));
            } catch (Throwable unused2) {
            }
            try {
                df.a().setVAID((String) cls.getMethod("getVAID", Context.class).invoke(newInstance, context));
            } catch (Throwable unused3) {
            }
            df.a().setAAID((String) cls.getMethod("getAAID", Context.class).invoke(newInstance, context));
        } catch (Throwable unused4) {
        }
    }
}
