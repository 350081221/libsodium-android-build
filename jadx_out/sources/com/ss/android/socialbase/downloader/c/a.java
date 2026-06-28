package com.ss.android.socialbase.downloader.c;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f10487a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static AbstractC0199a f10488b;

    /* renamed from: com.ss.android.socialbase.downloader.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0199a {
        public void a(String str, String str2) {
        }

        public void a(String str, String str2, Throwable th) {
        }

        public void b(String str, String str2) {
        }

        public void c(String str, String str2) {
        }

        public void d(String str, String str2) {
        }

        public void e(String str, String str2) {
        }
    }

    public static void a(int i5) {
        f10487a = i5;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "DownloaderLogger";
        }
        return "Downloader-" + str;
    }

    public static void c(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (f10487a <= 4) {
            Log.i(b(str), str2);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.c(b(str), str2);
        }
    }

    public static void d(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (f10487a <= 5) {
            Log.w(b(str), str2);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.e(b(str), str2);
        }
    }

    public static void e(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (f10487a <= 6) {
            Log.e(b(str), str2);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.d(b(str), str2);
        }
    }

    public static boolean a() {
        return f10487a <= 3;
    }

    public static void a(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (f10487a <= 2) {
            Log.v(str, str2);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.a(b(str), str2);
        }
    }

    public static void b(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (f10487a <= 3) {
            Log.d(b(str), str2);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.b(b(str), str2);
        }
    }

    public static void c(String str) {
        d("DownloaderLogger", str);
    }

    public static void a(String str) {
        b("DownloaderLogger", str);
    }

    public static void b(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (f10487a <= 6) {
            Log.e(b(str), str2, th);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.a(b(str), str2, th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        if (f10487a <= 3) {
            Log.d(b(str), str2, th);
        }
        AbstractC0199a abstractC0199a = f10488b;
        if (abstractC0199a != null) {
            abstractC0199a.b(b(str), str2 + th);
        }
    }
}
