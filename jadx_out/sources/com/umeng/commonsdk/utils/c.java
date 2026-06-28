package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.au;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f13475b = "lastReqTime";

    /* renamed from: c, reason: collision with root package name */
    private static final int f13476c = 48;

    /* renamed from: d, reason: collision with root package name */
    private static final int f13477d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f13478e = 720;

    /* renamed from: f, reason: collision with root package name */
    private static final String f13479f = "iss";

    /* renamed from: g, reason: collision with root package name */
    private static final String f13480g = "sinr";

    /* renamed from: h, reason: collision with root package name */
    private static final String f13481h = "clean";

    /* renamed from: i, reason: collision with root package name */
    private static boolean f13482i;

    /* renamed from: j, reason: collision with root package name */
    private static int f13483j;

    /* renamed from: a, reason: collision with root package name */
    private static final String f13474a = au.b().b(au.f12218z);

    /* renamed from: k, reason: collision with root package name */
    private static Object f13484k = new Object();

    static {
        f13482i = false;
        f13483j = f13478e;
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(appContext, f13479f, "");
            if (!TextUtils.isEmpty(imprintProperty) && "1".equals(imprintProperty)) {
                synchronized (f13484k) {
                    f13482i = true;
                }
                String imprintProperty2 = UMEnvelopeBuild.imprintProperty(appContext, f13480g, "");
                if (!TextUtils.isEmpty(imprintProperty)) {
                    try {
                        f13483j = a(Integer.parseInt(imprintProperty2));
                        return;
                    } catch (Throwable unused) {
                        f13483j = 48;
                        return;
                    }
                }
                f13483j = 48;
            }
        }
    }

    private static int a(int i5) {
        if (i5 > f13478e) {
            return f13478e;
        }
        if (i5 < 1) {
            return 1;
        }
        return i5;
    }

    public static boolean a() {
        boolean z4;
        synchronized (f13484k) {
            z4 = f13482i;
        }
        return z4;
    }

    public static long b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f13474a, 0);
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(f13475b, 0L);
    }

    public static void c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f13474a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f13481h, true).commit();
        }
    }

    public static void d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f13474a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f13481h, false).commit();
        }
    }

    public static boolean e(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f13474a, 0);
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean(f13481h, false);
    }

    public static int a(Context context) {
        int i5;
        synchronized (f13484k) {
            i5 = f13483j;
        }
        return i5;
    }

    public static boolean a(long j5, long j6, int i5) {
        Date date = new Date(j6);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j5));
        calendar.add(10, i5);
        return date.after(calendar.getTime());
    }

    public static void a(Context context, long j5) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f13474a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(f13475b, j5).commit();
        }
    }
}
