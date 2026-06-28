package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import com.tendcloud.tenddata.af;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static ao f11371a;

    public static synchronized void a(Context context, a aVar) {
        synchronized (ac.class) {
            try {
                f(context, aVar);
                f11371a.a(context, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String b(Context context, a aVar) {
        return ab.a(context, aVar);
    }

    public static String c(Context context, a aVar) {
        return ab.b(context, aVar);
    }

    public static synchronized String d(Context context, a aVar) {
        String b5;
        synchronized (ac.class) {
            try {
                f(context, aVar);
                b5 = f11371a.b(context, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return b5;
    }

    public static synchronized String e(Context context, a aVar) {
        String e5;
        synchronized (ac.class) {
            try {
                f(context, aVar);
                e5 = f11371a.e(context, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return e5;
    }

    private static synchronized void f(Context context, a aVar) {
        synchronized (ac.class) {
            if (context != null) {
                ab.f11351g = context.getApplicationContext();
            }
            if (ab.f11351g == null) {
                h.eForDeveloper("Init failed Context is null ");
                return;
            }
            if (f11371a == null) {
                System.currentTimeMillis();
                f11371a = zz.a();
            }
        }
    }

    public static void setConfig(TalkingDataSDKConfig talkingDataSDKConfig) {
        ab.setCofig(talkingDataSDKConfig);
    }

    public static synchronized void setConfigurationDisable(int i5) {
        synchronized (ac.class) {
            try {
                ab.setConfigurationDisable(i5);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void setProfileId(String str) {
        try {
            ab.f11362r = str;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Context b() {
        return f11371a.d();
    }

    public static void c() {
        try {
            h.f11713a = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Activity activity, a aVar) {
        try {
            f(activity, aVar);
            f11371a.b(activity, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(Context context, String str, a aVar) {
        b(context, str, "", aVar);
    }

    public static synchronized void a(Context context, String str, String str2, a aVar) {
        synchronized (ac.class) {
            try {
                f(context, aVar);
                f11371a.a(context, str, str2, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void c(String str, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(String str, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.c(str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Context context, String str, a aVar) {
        try {
            f(context, aVar);
            f11371a.b(context, str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(String str, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.c(str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(String str, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.d(str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized void a(Context context, String str, String str2, String str3, a aVar) {
        synchronized (ac.class) {
            try {
                f(context, aVar);
                f11371a.a(context, str, str2, str3, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(Context context, String str, String str2, a aVar) {
        a(context, str, str2, (Map<String, Object>) null, aVar);
    }

    public static int b(Context context) {
        return k.c(context);
    }

    public static void b(String str, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean a() {
        return zz.f11852b;
    }

    public static synchronized String a(Context context) {
        String b5;
        synchronized (ac.class) {
            try {
                f(context, null);
                b5 = f11371a.b(context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return b5;
    }

    public static void b(String str, af.ProfileType profileType, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, profileType, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2, int i5, String str3, String str4, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, i5, str3, str4, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Activity activity, String str, String str2, a aVar) {
        try {
            f(activity, aVar);
            f11371a.a(activity, str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, int i5, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, i5, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Activity activity, a aVar) {
        try {
            f(activity, aVar);
            f11371a.a(activity, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.c(str, str2, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, Object obj, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, obj);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.removeGlobalKV(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, Map<String, Object> map, a aVar) {
        a(context, str, "null", map, aVar);
    }

    public static void a(Context context, String str, Map<String, Object> map, Map<String, Object> map2, a aVar) {
        a(context, str, (String) null, map, map2, aVar);
    }

    public static void a(Context context, String str, String str2, Map<String, Object> map, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, str, str2, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, Map<String, Object> map, Map<String, Object> map2, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, str, str2, map, map2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, String str2, Map<String, Object> map, double d5, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, str, str2, map, d5, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str, double d5, Map<String, Object> map, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, str, map, d5, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(a aVar, String str) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(ab.f11351g, str, "", (Map<String, Object>) null, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(boolean z4, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.c(z4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, Throwable th, a aVar) {
        try {
            f(context, aVar);
            f11371a.a(context, th, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(String str, af.ProfileType profileType, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, profileType, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, TalkingDataProfile talkingDataProfile, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, talkingDataProfile, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, TalkingDataProfile talkingDataProfile, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, talkingDataProfile, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataProfile talkingDataProfile, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataProfile, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, TalkingDataProfile talkingDataProfile, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, talkingDataProfile, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, TalkingDataProfile talkingDataProfile, String str2, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, talkingDataProfile, str2, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, str3, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, int i5, String str3, String str4, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, str2, i5, str3, str4, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, int i5, String str3, String str4, String str5, int i6, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, i5, str3, str4, str5, i6, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, int i5, String str2, String str3, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, i5, str2, str3, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataOrder talkingDataOrder, String str, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataOrder, str, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, int i5, String str2, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, i5, str2, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataOrder talkingDataOrder, String str, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataOrder, str, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataOrder talkingDataOrder, String str, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataOrder, str, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataOrder talkingDataOrder, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataOrder, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, int i5, int i6, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, str3, i5, i6, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, int i5, int i6, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, str3, i5, i6, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, int i5, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, str3, i5, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3, int i5, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(str, str2, str3, i5, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataShoppingCart talkingDataShoppingCart, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataShoppingCart, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataSearch talkingDataSearch, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(talkingDataSearch, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.b(str, str2, map, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Map<String, Object> map, TDGenerateUrl tDGenerateUrl, a aVar) {
        try {
            f(ab.f11351g, aVar);
            f11371a.a(map, tDGenerateUrl);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(TalkingDataSharingFilter talkingDataSharingFilter, a aVar) {
        ab.f11365u = talkingDataSharingFilter;
    }
}
