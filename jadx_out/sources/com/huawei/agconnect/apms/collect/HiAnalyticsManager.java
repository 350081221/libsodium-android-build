package com.huawei.agconnect.apms.collect;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.z1;
import com.huawei.hms.analytics.HiAnalyticsTools;
import v1.a;

/* loaded from: classes3.dex */
public class HiAnalyticsManager {
    public static final String APM_EVENT_ID = "APMS";
    public static final String HTTP_HEADER = "com.huawei.agconnect.apms";
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static final String SERVICE_TAG = "APMS";
    public static volatile HiAnalyticsManager instance;
    public a analyticsInternalInstance;

    public static HiAnalyticsManager getInstance() {
        if (instance == null) {
            synchronized (HiAnalyticsManager.class) {
                if (instance == null) {
                    instance = new HiAnalyticsManager();
                }
            }
        }
        return instance;
    }

    private void initDebugLog() {
        try {
            if (LOG.getLevel() == 3) {
                HiAnalyticsTools.enableLog(3);
            } else {
                HiAnalyticsTools.enableLog(4);
            }
        } catch (Throwable th) {
            abc.abc(th, abc.abc("exception occurred when init HiAnalytics log: "), LOG);
        }
    }

    public void init(Context context) {
        if (this.analyticsInternalInstance == null) {
            initDebugLog();
            try {
                this.analyticsInternalInstance = z1.abc(context, "APMS", HTTP_HEADER);
            } catch (Throwable th) {
                abc.abc(th, abc.abc("exception occurred when init HiAnalytics: "), LOG);
            }
        }
        a aVar = this.analyticsInternalInstance;
        if (aVar == null) {
            LOG.error("failed to init HiAnalytics instance.");
            return;
        }
        try {
            aVar.setEnableAndroidID(false);
        } catch (Throwable th2) {
            abc.abc(th2, abc.abc("exception occurred when disable Android ID: "), LOG);
        }
    }

    public void onEvent(String str, Bundle bundle) {
        a aVar = this.analyticsInternalInstance;
        if (aVar == null) {
            LOG.error("can not operate with HiAnalytics null instance.");
            return;
        }
        try {
            aVar.onEvent(str, bundle);
        } catch (Throwable th) {
            abc.abc(th, abc.abc("exception occurred when operate HiAnalytics: "), LOG);
        }
    }

    public void onReport() {
        a aVar = this.analyticsInternalInstance;
        if (aVar == null) {
            LOG.error("can not operate with HiAnalytics null instance.");
            return;
        }
        try {
            aVar.onReport();
        } catch (Throwable th) {
            abc.abc(th, abc.abc("exception occurred when operate HiAnalytics: "), LOG);
        }
    }

    public void setAnalyticsEnable(boolean z4) {
        a aVar = this.analyticsInternalInstance;
        if (aVar == null) {
            LOG.error("can not operate with HiAnalytics null instance.");
            return;
        }
        try {
            aVar.setAnalyticsEnabled(z4);
        } catch (Throwable th) {
            abc.abc(th, abc.abc("exception occurred when set Analytics Enable : "), LOG);
        }
    }
}
