package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import t.d;

/* loaded from: classes2.dex */
public final class a {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            t.a b5 = b(context, str, str2, str3);
            d.b(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", b5.toString());
        }
    }

    public static synchronized void a(String str) {
        synchronized (a.class) {
            d.a(str);
        }
    }

    public static synchronized void a(Throwable th) {
        synchronized (a.class) {
            d.c(th);
        }
    }

    public static t.a b(Context context, String str, String str2, String str3) {
        String str4;
        try {
            str4 = context.getPackageName();
        } catch (Throwable unused) {
            str4 = "";
        }
        return new t.a(Build.MODEL, str4, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202311031119", str, str2, str3);
    }
}
