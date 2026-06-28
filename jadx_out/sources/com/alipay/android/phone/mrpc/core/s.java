package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f2769a;

    public static final boolean a(Context context) {
        Boolean bool = f2769a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f2769a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
