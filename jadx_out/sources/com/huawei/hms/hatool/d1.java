package com.huawei.hms.hatool;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class d1 extends v {

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8531a;

        static {
            int[] iArr = new int[y0.values().length];
            f8531a = iArr;
            try {
                iArr[y0.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8531a[y0.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8531a[y0.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e1 a(String str, String str2) {
        e1 a5 = v.a(str, str2);
        x0 c5 = z0.a().c(str, str2);
        a5.g(z0.a().a(c.c(str, str2)));
        a5.f(c.o(str, str2));
        a5.c(z0.a().f(str, str2));
        int i5 = a.f8531a[c5.a().ordinal()];
        if (i5 == 1) {
            a5.d(c5.b());
        } else if (i5 == 2) {
            a5.b(c5.b());
        } else if (i5 == 3) {
            a5.e(c5.b());
        }
        return a5;
    }

    public static f1 a(String str, String str2, String str3, String str4) {
        f1 a5 = v.a(str, str2, str3, str4);
        String a6 = z0.a().a(c.c(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String b5 = b2.d.b(b.f() + a6 + currentTimeMillis);
        a5.f(String.valueOf(currentTimeMillis));
        a5.g(b5);
        return a5;
    }

    public static g1 a(String str, String str2, String str3) {
        g1 a5 = v.a(str, str2, str3);
        Pair<String, String> e5 = z0.a().e(str2, str);
        a5.f((String) e5.first);
        a5.g((String) e5.second);
        a5.h(f.b());
        a5.d(z0.a().d(str2, str));
        return a5;
    }

    public static C0670r a(List<q> list, String str, String str2, String str3, String str4) {
        y.c("hmsSdk", "generate UploadData");
        C0670r b5 = v.b(str, str2);
        if (b5 == null) {
            return null;
        }
        b5.a(a(x.d().a(), str, str2, str3));
        b5.a(a(str, str2));
        b5.a(a(str2, str, str4));
        b5.a(c.g(str, str2));
        b5.a(list);
        return b5;
    }

    public static Map<String, String> b(String str, String str2, String str3) {
        Map<String, String> c5 = v.c(str, str3);
        Map<String, String> i5 = c.i(str, str2);
        if (i5 == null) {
            return c5;
        }
        c5.putAll(i5);
        return c5;
    }
}
