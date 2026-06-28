package com.umeng.powersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f13587a;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13588a = new b(0);
    }

    private b() {
    }

    /* synthetic */ b(byte b5) {
        this();
    }

    public static b a(Context context) {
        if (f13587a == null && context != null) {
            f13587a = context.getApplicationContext();
        }
        return a.f13588a;
    }

    public final synchronized com.umeng.powersdk.a a() {
        com.umeng.powersdk.a aVar;
        com.umeng.powersdk.a aVar2 = null;
        try {
            Intent registerReceiver = f13587a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i5 = 0;
            int intExtra = registerReceiver.getIntExtra("level", 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            int i6 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i6 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i6 = 0;
                } else if (intExtra4 == 5) {
                    i6 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i5 = 1;
            } else if (intExtra5 == 2) {
                i5 = 2;
            }
            aVar = new com.umeng.powersdk.a();
            try {
                aVar.f13581a = intExtra;
                aVar.f13582b = intExtra2;
                aVar.f13584d = i6;
                aVar.f13583c = intExtra3;
                aVar.f13585e = i5;
                aVar.f13586f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
                return aVar;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }
}
