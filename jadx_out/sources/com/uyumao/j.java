package com.uyumao;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static Context f13678a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f13679a = new j();
    }

    public synchronized i a() {
        i iVar;
        iVar = null;
        try {
            Intent registerReceiver = f13678a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i5 = 0;
            int intExtra = registerReceiver.getIntExtra("level", 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            int i6 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 != 2) {
                    if (intExtra4 != 3 && intExtra4 != 4) {
                        if (intExtra4 == 5) {
                            i6 = 2;
                        }
                    } else {
                        i6 = 0;
                    }
                } else {
                    i6 = 1;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 != 1) {
                if (intExtra5 == 2) {
                    i5 = 2;
                }
            } else {
                i5 = 1;
            }
            i iVar2 = new i();
            try {
                iVar2.f13672a = intExtra;
                iVar2.f13673b = intExtra2;
                iVar2.f13675d = i6;
                iVar2.f13674c = intExtra3;
                iVar2.f13676e = i5;
                iVar2.f13677f = System.currentTimeMillis();
            } catch (Throwable unused) {
            }
            iVar = iVar2;
        } catch (Throwable unused2) {
        }
        return iVar;
    }
}
