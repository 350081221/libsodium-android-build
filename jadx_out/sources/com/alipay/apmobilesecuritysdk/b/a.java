package com.alipay.apmobilesecuritysdk.b;

import v.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f2787b = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f2788a = 0;

    public static a a() {
        return f2787b;
    }

    public static String a(String str, String str2) {
        return str + str2;
    }

    public final void a(int i5) {
        this.f2788a = i5;
    }

    public final int b() {
        return this.f2788a;
    }

    public final String c() {
        String str;
        String a5 = d.a();
        if (f1.a.f(a5)) {
            return a5;
        }
        int i5 = this.f2788a;
        if (i5 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i5 == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i5 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i5 != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }
}
