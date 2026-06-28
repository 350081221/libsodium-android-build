package com.efs.sdk.h5pagesdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.base.samplingwhitelist.SamplingWhiteListUtil;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class H5ConfigMananger {

    /* renamed from: b, reason: collision with root package name */
    private EfsReporter f6666b;
    private Context mContext;
    private final String TAG = "H5ConfigMananger";

    /* renamed from: a, reason: collision with root package name */
    private final int f6665a = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f6667c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6668d = false;

    public H5ConfigMananger(Context context, EfsReporter efsReporter) {
        this.mContext = context;
        this.f6666b = efsReporter;
        efsReporter.getAllSdkConfig(new String[]{"apm_native_h5perf_sampling_rate"}, new IConfigCallback() { // from class: com.efs.sdk.h5pagesdk.H5ConfigMananger.1
            @Override // com.efs.sdk.base.observer.IConfigCallback
            public final void onChange(Map<String, Object> map) {
                try {
                    Object obj = map.get("apm_native_h5perf_sampling_rate");
                    if (obj != null) {
                        H5ConfigMananger.this.f6667c = Integer.parseInt(obj.toString());
                        H5ConfigMananger h5ConfigMananger = H5ConfigMananger.this;
                        h5ConfigMananger.f6668d = H5ConfigMananger.a(h5ConfigMananger.f6667c);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public String generateLaunchOptions() {
        if (!this.f6668d && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            if (H5Manager.isDebug) {
                Log.e("H5ConfigMananger", "采样未命中，并且不处于集成测试模式");
                return "";
            }
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sample", this.f6667c);
            if (this.f6668d) {
                jSONObject.put("sampleResult", "Y");
            } else {
                jSONObject.put("sampleResult", "N");
            }
            Context context = this.mContext;
            if (context != null) {
                jSONObject.put(TTDownloadField.TT_APP_NAME, context.getApplicationInfo().packageName);
            }
            jSONObject.put("bridgeVersion", 1);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }

    public boolean isH5TracerEnable() {
        return this.f6668d;
    }

    public void sendData(final String str) {
        if (!this.f6668d && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            return;
        }
        a.execute(new Runnable() { // from class: com.efs.sdk.h5pagesdk.H5ConfigMananger.2
            @Override // java.lang.Runnable
            public final void run() {
                if (H5ConfigMananger.this.f6666b == null) {
                    return;
                }
                EfsJSONLog efsJSONLog = new EfsJSONLog("nativeh5perf");
                efsJSONLog.put("wk_native_h5log", str);
                H5ConfigMananger.this.f6666b.send(efsJSONLog);
            }
        });
    }

    static /* synthetic */ boolean a(int i5) {
        if (SamplingWhiteListUtil.isHitWL()) {
            return true;
        }
        if (i5 != 0) {
            return i5 == 100 || new Random().nextInt(100) <= i5;
        }
        return false;
    }
}
