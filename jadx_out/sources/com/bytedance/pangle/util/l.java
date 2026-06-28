package com.bytedance.pangle.util;

import android.content.SharedPreferences;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import java.util.Locale;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    private static volatile l f4649b;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f4650a = Zeus.getAppApplication().getSharedPreferences("pangle_meta_data_sp", 0);

    private l() {
    }

    public static l a() {
        if (f4649b == null) {
            synchronized (l.class) {
                if (f4649b == null) {
                    f4649b = new l();
                }
            }
        }
        return f4649b;
    }

    public final String b(String str) {
        String string = this.f4650a.getString("HOST_IDENTITY_".concat(String.valueOf(str)), "");
        ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils getHostIdentity pluginPKg = " + str + ", hostIdentity = " + string);
        return string;
    }

    public final void c(String str, int i5, boolean z4) {
        SharedPreferences.Editor edit = this.f4650a.edit();
        edit.putBoolean("dex_remove_state_" + str + "_" + i5, z4);
        edit.apply();
    }

    public final void b(String str, int i5, boolean z4) {
        SharedPreferences.Editor edit = this.f4650a.edit();
        edit.putBoolean("dex_opt_state_" + str + "_" + i5, z4);
        edit.apply();
    }

    public final int a(String str) {
        int i5 = this.f4650a.getInt("PLUGIN_API_VERSION_".concat(String.valueOf(str)), 0);
        ZeusLogger.i(ZeusLogger.TAG_INIT, "ZeusSpUtils getPluginApiVersion pluginPKg = " + str + ", pluginApiVersion = " + i5);
        return i5;
    }

    public final int b(String str, int i5) {
        return this.f4650a.getInt("remove_entry_flag_" + str + "_" + i5, 0);
    }

    public final void a(String str, int i5, boolean z4) {
        SharedPreferences.Editor edit = this.f4650a.edit();
        String str2 = "INSTALLED_" + str + "-" + i5;
        if (z4) {
            edit.putBoolean(str2, true);
        } else {
            edit.remove(str2);
        }
        edit.apply();
    }

    public final int b(String str, int i5, String str2) {
        return this.f4650a.getInt(str2 + "_failed_count_when_rm_entry_" + str + "_" + i5, 0);
    }

    public final boolean a(String str, int i5) {
        return this.f4650a.getBoolean(String.format(Locale.getDefault(), "INSTALLED_%s-%d", str, Integer.valueOf(i5)), false);
    }

    public final void a(String str, int i5, String str2) {
        int b5 = b(str, i5, str2);
        SharedPreferences.Editor edit = this.f4650a.edit();
        edit.putInt(str2 + "_failed_count_when_rm_entry_" + str + "_" + i5, b5 + 1);
        edit.apply();
    }
}
