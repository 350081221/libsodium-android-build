package com.huawei.secure.android.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9055a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: b, reason: collision with root package name */
    private static final char f9056b = '*';

    /* renamed from: c, reason: collision with root package name */
    private static final int f9057c = 2;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends Throwable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f9058d = 7129050843360571879L;

        /* renamed from: a, reason: collision with root package name */
        private String f9059a;

        /* renamed from: b, reason: collision with root package name */
        private Throwable f9060b;

        /* renamed from: c, reason: collision with root package name */
        private Throwable f9061c;

        public a(Throwable th) {
            this.f9061c = th;
        }

        public void a(Throwable th) {
            this.f9060b = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.f9060b;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f9059a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.f9061c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f9059a != null) {
                String str = name + ": ";
                if (this.f9059a.startsWith(str)) {
                    return this.f9059a;
                }
                return str + this.f9059a;
            }
            return name;
        }

        public void a(String str) {
            this.f9059a = str;
        }
    }

    public static void A(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.w(str, c(str2, false), d(th));
    }

    public static void B(String str, String str2, Throwable th, boolean z4) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.w(str, c(str2, z4), d(th));
    }

    public static void C(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, c(str2, z4));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i5 = 1;
        if (1 == length) {
            return String.valueOf(f9056b);
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (f9055a.matcher(String.valueOf(charAt)).matches()) {
                if (i5 % 2 == 0) {
                    charAt = '*';
                }
                i5++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(a(str2));
        }
        return sb.toString();
    }

    private static String c(String str, boolean z4) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z4) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private static Throwable d(Throwable th) {
        if (th == null) {
            return null;
        }
        a aVar = new a(th);
        aVar.setStackTrace(th.getStackTrace());
        aVar.a(e(th.getMessage()));
        Throwable cause = th.getCause();
        a aVar2 = aVar;
        while (cause != null) {
            a aVar3 = new a(cause);
            aVar3.setStackTrace(cause.getStackTrace());
            aVar3.a(e(cause.getMessage()));
            aVar2.a(aVar3);
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            if (i5 % 2 == 0) {
                charArray[i5] = f9056b;
            }
        }
        return new String(charArray);
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, false));
    }

    public static void g(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, b(str2, str3));
    }

    public static void h(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, b(str2, str3), d(th));
    }

    public static void i(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.d(str, c(str2, false), d(th));
    }

    public static void j(String str, String str2, Throwable th, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, z4), d(th));
    }

    public static void k(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, c(str2, z4));
    }

    public static void l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, c(str2, false));
    }

    public static void m(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, b(str2, str3));
    }

    public static void n(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, b(str2, str3), d(th));
    }

    public static void o(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.e(str, c(str2, false), d(th));
    }

    public static void p(String str, String str2, Throwable th, boolean z4) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.e(str, c(str2, z4), d(th));
    }

    public static void q(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, c(str2, z4));
    }

    public static void r(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, c(str2, false));
    }

    public static void s(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, b(str2, str3));
    }

    public static void t(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, b(str2, str3), d(th));
    }

    public static void u(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.i(str, c(str2, false), d(th));
    }

    public static void v(String str, String str2, Throwable th, boolean z4) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.i(str, c(str2, z4), d(th));
    }

    public static void w(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, c(str2, z4));
    }

    public static void x(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, c(str2, false));
    }

    public static void y(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, b(str2, str3));
    }

    public static void z(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, b(str2, str3), d(th));
    }
}
