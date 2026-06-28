package com.umeng.powersdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import com.efs.sdk.pa.config.ConfigManager;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public class PowerConfigManager {

    /* renamed from: b, reason: collision with root package name */
    private Context f13570b;

    /* renamed from: c, reason: collision with root package name */
    private EfsReporter f13571c;

    /* renamed from: d, reason: collision with root package name */
    private int f13572d;

    /* renamed from: f, reason: collision with root package name */
    private int f13574f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13575g;

    /* renamed from: a, reason: collision with root package name */
    private final String f13569a = "PageConfigManager";

    /* renamed from: e, reason: collision with root package name */
    private final int f13573e = 0;

    public PowerConfigManager(Context context, EfsReporter efsReporter) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor edit2;
        SharedPreferences.Editor edit3;
        SharedPreferences.Editor edit4;
        SharedPreferences.Editor edit5;
        this.f13572d = 100;
        this.f13575g = false;
        Context applicationContext = context.getApplicationContext();
        this.f13570b = applicationContext;
        this.f13571c = efsReporter;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("efs_power", 0);
        if (sharedPreferences != null) {
            this.f13574f = sharedPreferences.getInt("apm_powerperf_sampling_rate_last", 0);
        }
        SharedPreferences sharedPreferences2 = this.f13570b.getSharedPreferences("efs_power", 0);
        int i5 = sharedPreferences2 != null ? sharedPreferences2.getInt("apm_powerperf_sampling_rate", -1) : -1;
        this.f13571c.getAllSdkConfig(new String[]{"apm_powerperf_sampling_rate", "apm_powerperf_collect_interval", "apm_powerperf_collect_max_period_sec"}, new IConfigCallback() { // from class: com.umeng.powersdk.PowerConfigManager.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                SharedPreferences.Editor edit6;
                try {
                    SharedPreferences sharedPreferences3 = PowerConfigManager.this.f13570b.getSharedPreferences("efs_power", 0);
                    if (sharedPreferences3 == null || (edit6 = sharedPreferences3.edit()) == null || map == null) {
                        return;
                    }
                    Object obj = map.get("apm_powerperf_sampling_rate");
                    if (obj != null) {
                        edit6.putInt("apm_powerperf_sampling_rate", Integer.parseInt(obj.toString()));
                    }
                    Object obj2 = map.get("apm_powerperf_collect_interval");
                    if (obj2 != null) {
                        edit6.putInt("apm_powerperf_collect_interval", Integer.parseInt(obj2.toString()));
                    }
                    Object obj3 = map.get("apm_powerperf_collect_max_period_sec");
                    if (obj3 != null) {
                        edit6.putInt("apm_powerperf_collect_max_period_sec", Integer.parseInt(obj3.toString()));
                    }
                    edit6.apply();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        if (i5 != -1) {
            this.f13572d = i5;
        }
        boolean z4 = true;
        if (!SamplingWhiteListUtil.isHitWL()) {
            SharedPreferences sharedPreferences3 = this.f13570b.getSharedPreferences("efs_power", 0);
            long j5 = sharedPreferences3 != null ? sharedPreferences3.getLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L) : 0L;
            boolean z5 = sharedPreferences3 != null ? sharedPreferences3.getBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false) : false;
            int i6 = this.f13572d;
            if (i6 == 0) {
                if (z5 && sharedPreferences3 != null && (edit5 = sharedPreferences3.edit()) != null) {
                    edit5.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, false);
                    edit5.commit();
                }
                if (j5 != 0 && sharedPreferences3 != null && (edit4 = sharedPreferences3.edit()) != null) {
                    edit4.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, 0L);
                    edit4.commit();
                }
            } else {
                boolean z6 = i6 != this.f13574f;
                Long valueOf = Long.valueOf(j5);
                int i7 = this.f13572d;
                Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                Long valueOf3 = Long.valueOf(valueOf2.longValue() - valueOf.longValue());
                if (!z5 || valueOf3.longValue() >= 86400000 || z6) {
                    if (valueOf3.longValue() >= 86400000 || z6) {
                        if (!(i7 != 0 && (i7 == 100 || new Random().nextInt(100) <= i7))) {
                            if (PowerManager.isDebug) {
                                Log.d("PageConfigManager", "check in page rate. random not check in!");
                            }
                            z4 = false;
                        } else if (PowerManager.isDebug) {
                            Log.d("PageConfigManager", "check in page rate. random check in");
                        }
                        SharedPreferences sharedPreferences4 = this.f13570b.getSharedPreferences("efs_power", 0);
                        if (sharedPreferences4 != null && (edit3 = sharedPreferences4.edit()) != null) {
                            edit3.putBoolean(ConfigManager.FLAG_PA_CHECK_IN_STATE, z4);
                            edit3.apply();
                        }
                        if (sharedPreferences4 != null && (edit2 = sharedPreferences4.edit()) != null) {
                            edit2.putLong(ConfigManager.FLAG_PA_FORE_CHECK_TIME, valueOf2.longValue());
                            edit2.apply();
                        }
                    } else if (PowerManager.isDebug) {
                        Log.d("PageConfigManager", "check in page rate. un repeat check in 24 hour!");
                    }
                } else if (PowerManager.isDebug) {
                    Log.d("PageConfigManager", "check in page rate. check in allready.");
                }
            }
            z4 = false;
        }
        this.f13575g = z4;
        SharedPreferences sharedPreferences5 = this.f13570b.getSharedPreferences("efs_power", 0);
        if (sharedPreferences5 == null || (edit = sharedPreferences5.edit()) == null) {
            return;
        }
        edit.putInt("apm_powerperf_sampling_rate_last", this.f13572d);
        edit.apply();
    }

    public boolean enableTracer() {
        return this.f13575g;
    }
}
