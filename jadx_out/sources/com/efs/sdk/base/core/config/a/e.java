package com.efs.sdk.base.core.config.a;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    volatile SharedPreferences f6572a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        File a5 = com.efs.sdk.base.core.util.a.a(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (a5.exists()) {
            a5.delete();
        }
    }

    private void d() {
        if (this.f6572a == null) {
            synchronized (com.efs.sdk.base.core.c.b.class) {
                if (this.f6572a == null) {
                    this.f6572a = SharedPreferencesUtils.getSharedPreferences(ControllerCenter.getGlobalEnvStruct().mAppContext, com.efs.sdk.base.core.util.b.b.a(("config_" + ControllerCenter.getGlobalEnvStruct().getAppid().toLowerCase()).getBytes()));
                    this.f6572a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(@NonNull b bVar) {
        c();
        if (this.f6572a == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.f6572a.edit();
        edit.clear();
        edit.putInt("cver", bVar.f6552a);
        edit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : bVar.f6558g.entrySet()) {
            edit.putString(entry.getKey(), entry.getValue());
        }
        edit.putString("sign", bVar.f6553b);
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        try {
            d();
        } catch (Throwable th) {
            Log.e("efs.config", "init sharedpreferences error", th);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        f fVar;
        fVar = f.a.f6531a;
        if (fVar.a()) {
            return;
        }
        c.a().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        GlobalEnvStruct globalEnvStruct = ControllerCenter.getGlobalEnvStruct();
        File b5 = com.efs.sdk.base.core.util.a.b(globalEnvStruct.mAppContext, globalEnvStruct.getAppid());
        if (!b5.exists()) {
            return false;
        }
        com.efs.sdk.base.core.util.b.b(b5);
        return true;
    }
}
