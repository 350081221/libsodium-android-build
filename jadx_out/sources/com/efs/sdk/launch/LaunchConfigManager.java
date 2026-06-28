package com.efs.sdk.launch;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class LaunchConfigManager {

    /* renamed from: a, reason: collision with root package name */
    private final String f6677a = "LaunchConfigManager";

    /* renamed from: b, reason: collision with root package name */
    private final int f6678b = 0;

    /* renamed from: c, reason: collision with root package name */
    private EfsReporter f6679c;

    /* renamed from: d, reason: collision with root package name */
    private int f6680d;

    /* renamed from: e, reason: collision with root package name */
    private int f6681e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6682f;

    /* renamed from: g, reason: collision with root package name */
    private Context f6683g;

    public LaunchConfigManager(Context context, EfsReporter efsReporter) {
        boolean z4;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.f6680d = 100;
        this.f6682f = false;
        Context applicationContext = context.getApplicationContext();
        this.f6683g = applicationContext;
        this.f6679c = efsReporter;
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences2 != null) {
            this.f6681e = sharedPreferences2.getInt("apm_startperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences3 = this.f6683g.getSharedPreferences("efs_launch", 0);
        int i5 = sharedPreferences3 != null ? sharedPreferences3.getInt("apm_startperf_sampling_rate", -1) : -1;
        this.f6679c.getAllSdkConfig(new String[]{"apm_startperf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.launch.LaunchConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences sharedPreferences4;
                SharedPreferences.Editor edit6;
                try {
                    Object obj = map.get("apm_startperf_sampling_rate");
                    if (obj == null || (sharedPreferences4 = LaunchConfigManager.this.f6683g.getSharedPreferences("efs_launch", 0)) == null || (edit6 = sharedPreferences4.edit()) == null) {
                        return;
                    }
                    edit6.putInt("apm_startperf_sampling_rate", Integer.parseInt(obj.toString()));
                    edit6.commit();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i5 != -1) {
            this.f6680d = i5;
        }
        SharedPreferences sharedPreferences4 = this.f6683g.getSharedPreferences("efs_launch", 0);
        long j5 = sharedPreferences4 != null ? sharedPreferences4.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
        boolean z5 = sharedPreferences4 != null ? sharedPreferences4.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
        if (this.f6680d != 0) {
            z4 = true;
            if (!SamplingWhiteListUtil.isHitWL()) {
                boolean z6 = this.f6680d != this.f6681e;
                Long valueOf = Long.valueOf(j5);
                int i6 = this.f6680d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z5 || valueOf3.longValue() >= 86400000 || z6) {
                    if (valueOf3.longValue() >= 86400000 || z6) {
                        if (!(i6 != 0 && (i6 == 100 || new Random().nextInt(100) <= i6))) {
                            if (LaunchManager.isDebug) {
                                Log.d("LaunchConfigManager", "random not check in!");
                            }
                            z4 = false;
                        } else if (LaunchManager.isDebug) {
                            Log.d("LaunchConfigManager", "random check in");
                        }
                        SharedPreferences sharedPreferences5 = this.f6683g.getSharedPreferences("efs_launch", 0);
                        if (sharedPreferences5 != null && (edit2 = sharedPreferences5.edit()) != null) {
                            edit2.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z4);
                            edit2.commit();
                        }
                        if (sharedPreferences5 != null && (edit = sharedPreferences5.edit()) != null) {
                            edit.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit.commit();
                        }
                    } else if (LaunchManager.isDebug) {
                        Log.d("LaunchConfigManager", "un repeat check in 24 hour!");
                    }
                } else if (LaunchManager.isDebug) {
                    Log.d("LaunchConfigManager", " check in allready");
                }
            }
            this.f6682f = z4;
            sharedPreferences = this.f6683g.getSharedPreferences("efs_launch", 0);
            if (sharedPreferences != null || (edit3 = sharedPreferences.edit()) == null) {
            }
            edit3.putInt("apm_startperf_sampling_rate_last", this.f6680d);
            edit3.commit();
            return;
        }
        if (z5 && sharedPreferences4 != null && (edit5 = sharedPreferences4.edit()) != null) {
            edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
            edit5.commit();
        }
        if (j5 != 0 && sharedPreferences4 != null && (edit4 = sharedPreferences4.edit()) != null) {
            edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
            edit4.commit();
        }
        z4 = false;
        this.f6682f = z4;
        sharedPreferences = this.f6683g.getSharedPreferences("efs_launch", 0);
        if (sharedPreferences != null) {
        }
    }

    public boolean enableTracer() {
        return this.f6682f;
    }
}
