package com.umeng.analytics.pro;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class ai {

    /* renamed from: a, reason: collision with root package name */
    private String f12130a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12134e = false;

    /* renamed from: d, reason: collision with root package name */
    private int f12133d = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f12132c = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f12131b = -1;

    public ai(String str) {
        this.f12130a = str;
        if (!TextUtils.isEmpty(str)) {
            a();
        }
    }

    private void a() {
        try {
            if (this.f12130a.contains("-")) {
                String[] split = this.f12130a.split("-");
                if (split.length == 2) {
                    this.f12131b = Integer.valueOf(split[0]).intValue();
                    int intValue = Integer.valueOf(split[1]).intValue();
                    this.f12132c = intValue;
                    if (this.f12131b < 1) {
                        this.f12131b = 1;
                    }
                    if (intValue > 24) {
                        this.f12132c = 24;
                    }
                }
                this.f12134e = true;
                return;
            }
            this.f12133d = Integer.valueOf(this.f12130a).intValue();
            this.f12134e = false;
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i5) {
        int i6;
        if (this.f12134e) {
            int i7 = this.f12131b;
            if (i7 != -1 && (i6 = this.f12132c) != -1 && i5 >= i7 && i5 <= i6) {
                return true;
            }
        } else {
            int i8 = this.f12133d;
            if (i8 != -1 && i5 == i8) {
                return true;
            }
        }
        return false;
    }
}
