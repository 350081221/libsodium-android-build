package com.huawei.agconnect.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.credential.obs.ai;
import com.huawei.agconnect.credential.obs.aj;
import com.huawei.agconnect.credential.obs.ak;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class HaConnector {
    private static final String HA_HTTP_HEADER = "com.huawei.agconnect";
    private static final String HA_SERVICE_TAG = "AGC_TAG";
    private static final HaConnector INSTANCE = new HaConnector();
    private static final String TAG = "HaConnector";
    private ak hiAnalytics;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private HaConnector() {
    }

    public static synchronized HaConnector getInstance() {
        HaConnector haConnector;
        synchronized (HaConnector.class) {
            haConnector = INSTANCE;
        }
        return haConnector;
    }

    private void initHiAnalytics(Context context) {
        try {
            this.hiAnalytics = useOldHaInitFunction() ? aj.a(context, HA_SERVICE_TAG, HA_HTTP_HEADER) : aj.a(context, HA_SERVICE_TAG, HA_HTTP_HEADER, AGConnectInstance.getInstance().getOptions().getRoutePolicy().getRouteName());
            if (this.hiAnalytics == null) {
                Logger.e(TAG, "init HiAnalyticsBridge SDK error, please make sure the project inherits HiAnalytics SDK correctlyor download the latest agconnect-services.json file and try again.");
            } else {
                Logger.i(TAG, "init HiAnalyticsBridge SDK end.");
            }
        } catch (Error e5) {
            if (e5 instanceof NoSuchMethodError) {
                Logger.e(TAG, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version");
            }
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initInMainThread(Context context) {
        initHiAnalytics(context);
    }

    private boolean useOldHaInitFunction() {
        return TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_ru")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_sg")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_de")) || TextUtils.isEmpty(AGConnectInstance.getInstance().getOptions().getString("/service/analytics/collector_url_cn"));
    }

    public boolean containHaInstance() {
        return this.hiAnalytics != null;
    }

    public Map<String, String> getUserProfiles(boolean z4) {
        HashMap hashMap = new HashMap();
        ak akVar = this.hiAnalytics;
        return akVar != null ? akVar.b(z4) : hashMap;
    }

    public void init(final Context context) {
        AccessNetworkManager.getInstance().addCallback(new AccessNetworkManager.AccessNetworkCallback() { // from class: com.huawei.agconnect.common.api.HaConnector.1
            @Override // com.huawei.agconnect.common.network.AccessNetworkManager.AccessNetworkCallback
            public void onNetWorkReady() {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    HaConnector.this.initInMainThread(context);
                } else {
                    HaConnector.this.mainHandler.post(new Runnable() { // from class: com.huawei.agconnect.common.api.HaConnector.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            HaConnector.this.initInMainThread(context);
                        }
                    });
                }
                HaConnector.this.mainHandler.postDelayed(new Runnable() { // from class: com.huawei.agconnect.common.api.HaConnector.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HaConnector.this.hiAnalytics != null) {
                            Logger.i(HaConnector.TAG, "Auto onReport");
                            HaConnector.this.hiAnalytics.a();
                        }
                    }
                }, 5000L);
            }
        });
    }

    public void onEvent(String str, Bundle bundle) {
        ak akVar = this.hiAnalytics;
        if (akVar != null) {
            akVar.a(str, bundle);
        }
    }

    public void onReport() {
        ak akVar = this.hiAnalytics;
        if (akVar != null) {
            akVar.a();
        }
    }

    public void setAnalyticsEnabled(boolean z4) {
        ak akVar = this.hiAnalytics;
        if (akVar != null) {
            akVar.c(z4);
        }
    }

    public void syncOAID(final HaSyncCallBack haSyncCallBack) {
        if (this.hiAnalytics != null) {
            Logger.i(TAG, "start sync ha oaid");
            this.hiAnalytics.syncOaid(new ai() { // from class: com.huawei.agconnect.common.api.HaConnector.2
                @Override // com.huawei.agconnect.credential.obs.ai
                public void result(int i5, String str) {
                    haSyncCallBack.syncCallBack(i5, str);
                    Logger.i(HaConnector.TAG, "end sync ha oaid:code:--->" + i5 + ", msg---->" + str);
                }
            });
        }
    }
}
