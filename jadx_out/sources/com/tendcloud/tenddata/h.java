package com.tendcloud.tenddata;

import android.util.Log;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11713a = true;

    public static void a(String str, Throwable th) {
        if (f11713a) {
            a(str, 4);
            th.printStackTrace();
        }
    }

    private static void b(String str, int i5) {
        String a5 = a();
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    if (i5 != 5) {
                        if (i5 == 6) {
                            Log.e(a5, str);
                            return;
                        }
                        return;
                    }
                    Log.w(a5, str);
                    return;
                }
                Log.i(a5, str);
                return;
            }
            Log.d(a5, str);
            return;
        }
        Log.v(a5, str);
    }

    public static void dForDeveloper(String str) {
        if (f11713a) {
            a(str, 3);
        }
    }

    public static void dForInternal(String... strArr) {
    }

    public static void eForDeveloper(String str) {
        if (f11713a) {
            a(str, 6);
        }
    }

    public static void eForInternal(Throwable th) {
    }

    public static void eForInternal(String... strArr) {
    }

    public static void iForDeveloper(String str) {
        if (f11713a) {
            a(str, 4);
        }
    }

    public static void iForInternal(String... strArr) {
    }

    public static void json(String str) {
    }

    private static void a(String str, int i5) {
        if (str == null) {
            return;
        }
        try {
            int length = str.length();
            int i6 = 2000;
            int i7 = 0;
            int i8 = 0;
            while (i7 < 100) {
                if (length > i6) {
                    b(str.substring(i8, i6), i5);
                    i7++;
                    i8 = i6;
                    i6 += 2000;
                } else {
                    b(str.substring(i8, length), i5);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private static synchronized String a() {
        synchronized (h.class) {
            try {
                new Exception().getStackTrace()[4].getClassName().lastIndexOf(".");
            } catch (Throwable unused) {
                return ab.f11364t;
            }
        }
        return ab.f11364t;
    }
}
