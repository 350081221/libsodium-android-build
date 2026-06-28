package com.bytedance.sdk.openadsdk.api;

import android.util.Log;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4830a = false;

    /* renamed from: b, reason: collision with root package name */
    private static int f4831b = 4;

    public static void a(int i5) {
        f4831b = i5;
    }

    public static void b(String str, String str2) {
        if (f4830a && str2 != null && f4831b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f4830a && str2 != null && f4831b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (f4830a && str2 != null && f4831b <= 5) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f4830a && str2 != null && f4831b <= 6) {
            Log.e(str, str2);
        }
    }

    public static void a() {
        f4830a = true;
        a(3);
    }

    public static void a(String str, String str2) {
        if (f4830a && str2 != null && f4831b <= 2) {
            Log.v(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f4830a) {
            if (!(str2 == null && th == null) && f4831b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f4830a) {
            if (!(str2 == null && th == null) && f4831b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f4830a) {
            if (!(str2 == null && th == null) && f4831b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void b(String str, Object... objArr) {
        if (f4830a && objArr != null && f4831b <= 5) {
            Log.v(str, a(objArr));
        }
    }

    public static void a(String str, Object... objArr) {
        if (f4830a && objArr != null && f4831b <= 3) {
            Log.d(str, a(objArr));
        }
    }

    public static void a(String str) {
        if (f4830a) {
            d("TTLogger", str);
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
