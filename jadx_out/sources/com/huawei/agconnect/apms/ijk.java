package com.huawei.agconnect.apms;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class ijk extends vwx {
    public final wxy abc;
    public final SharedPreferences bcd;
    public final SharedPreferences.Editor cde;
    public final Lock def;

    @SuppressLint({"CommitPrefEdits"})
    public ijk(Context context) {
        wxy wxyVar = new wxy();
        this.abc = wxyVar;
        wxyVar.bcd();
        this.def = new ReentrantLock();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.agconnect.apms.v1_" + context.getPackageName(), 0);
        this.bcd = sharedPreferences;
        this.cde = sharedPreferences.edit();
    }

    public void abc(String str, String str2) {
        this.def.lock();
        try {
            this.cde.putString(str, str2);
            this.cde.apply();
        } finally {
            this.def.unlock();
        }
    }

    public String bcd(String str) {
        if (!this.bcd.contains(str)) {
            return "";
        }
        try {
            return this.bcd.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void abc(String str, boolean z4) {
        this.def.lock();
        try {
            this.cde.putBoolean(str, z4);
            this.cde.apply();
        } finally {
            this.def.unlock();
        }
    }

    public final boolean abc(String str) {
        try {
            return this.bcd.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void abc(boolean z4) {
        abc("apms.disabled_by_user", z4);
    }

    @Override // com.huawei.agconnect.apms.vwx, com.huawei.agconnect.apms.xyz
    public void abc() {
        this.def.lock();
        try {
            this.cde.clear();
            this.cde.apply();
            this.abc.bcd();
        } finally {
            this.def.unlock();
        }
    }
}
