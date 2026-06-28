package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class a1 {
    public final x0 a(int i5) {
        String str;
        if (i5 != 0) {
            str = f();
            if (!TextUtils.isEmpty(str)) {
                return new x0(y0.UDID, str);
            }
        } else {
            str = "";
        }
        return new x0(y0.EMPTY, str);
    }

    public x0 a(Context context) {
        String c5 = c();
        if (!TextUtils.isEmpty(c5)) {
            return new x0(y0.UDID, c5);
        }
        String a5 = a();
        if (!TextUtils.isEmpty(a5)) {
            return new x0(y0.IMEI, a5);
        }
        boolean e5 = e();
        String b5 = b();
        return !TextUtils.isEmpty(b5) ? e5 ? new x0(y0.SN, b5) : new x0(y0.UDID, a(b5)) : e5 ? a(d()) : b(d());
    }

    public abstract String a();

    public abstract String a(String str);

    public final x0 b(int i5) {
        String str;
        if ((i5 & 4) != 0) {
            str = f();
            if (!TextUtils.isEmpty(str)) {
                return new x0(y0.UDID, str);
            }
        } else {
            str = "";
        }
        return new x0(y0.EMPTY, str);
    }

    public abstract String b();

    public abstract String c();

    public abstract int d();

    public final boolean e() {
        l b5 = i.c().b();
        if (TextUtils.isEmpty(b5.l())) {
            b5.h(f.a());
        }
        return !TextUtils.isEmpty(b5.l());
    }

    public final String f() {
        l b5 = i.c().b();
        if (TextUtils.isEmpty(b5.i())) {
            b5.e(b1.c());
        }
        return b5.i();
    }
}
