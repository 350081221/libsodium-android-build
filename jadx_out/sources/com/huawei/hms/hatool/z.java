package com.huawei.hms.hatool;

import android.util.Log;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8704a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f8705b = 4;

    public static String a() {
        return "FormalHASDK_2.2.0.313" + k1.a();
    }

    public void a(int i5) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f8705b = i5;
        this.f8704a = true;
    }

    public void a(int i5, String str, String str2) {
        if (i5 == 3) {
            Log.d(str, str2);
            return;
        }
        if (i5 == 5) {
            Log.w(str, str2);
        } else if (i5 != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void b(int i5, String str, String str2) {
        a(i5, "FormalHASDK", str + "=> " + str2);
    }

    public boolean b(int i5) {
        return this.f8704a && i5 >= this.f8705b;
    }
}
