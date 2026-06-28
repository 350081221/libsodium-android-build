package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.custom.ApmsLog;
import com.huawei.agconnect.apms.custom.CustomTrace;
import com.huawei.agconnect.apms.custom.NetworkMeasure;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.common.network.AccessNetworkManager;

/* loaded from: classes3.dex */
public class APMS {
    public static volatile APMS apmsInstance;
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static final efg AGENT_CONFIGURATION = new efg();
    public static boolean hasInit = false;
    public ijk preferencesHolder = null;
    public boolean isUserPrivacyAgreed = true;

    public static APMS getInstance() {
        if (apmsInstance == null) {
            synchronized (APMS.class) {
                if (apmsInstance == null) {
                    apmsInstance = new APMS();
                }
            }
        }
        return apmsInstance;
    }

    private boolean isDisableByUser() {
        return AGENT_CONFIGURATION.abc;
    }

    private boolean isInstrumented() {
        return true;
    }

    public ApmsLog createApmsLog() {
        return yxw.bcd;
    }

    public CustomTrace createCustomTrace(String str) {
        return CustomTrace.getInstance(str);
    }

    public NetworkMeasure createNetworkMeasure(String str, String str2) {
        return new NetworkMeasure(str, str2);
    }

    public void enableAnrMonitor(boolean z4) {
        Agent.enableAnrMonitor(z4);
    }

    public void enableApmsLog(boolean z4) {
        if (z4 && !yxw.bcd.abc) {
            wvu.abc(Agent.getContext(), this.preferencesHolder);
        } else if (!z4 && yxw.bcd.abc) {
            onm onmVar = wvu.bcd;
            if (onmVar != null) {
                onmVar.release();
            }
            wvu.bcd = null;
        }
        yxw.bcd.abc = z4;
    }

    public void enableCollection(boolean z4) {
        Agent.enableCollectionByUser(z4);
    }

    public boolean isUserPrivacyAgreed() {
        return this.isUserPrivacyAgreed;
    }

    @Deprecated
    public void setAnalyticsEnabled(boolean z4) {
        AccessNetworkManager.getInstance().setAccessNetwork(z4);
        HiAnalyticsManager.getInstance().setAnalyticsEnable(z4);
    }

    public void setUserIdentifier(String str) {
        Agent.setUserIdentifier(str);
    }

    public void setUserPrivacyAgreed(boolean z4) {
        this.isUserPrivacyAgreed = z4;
        Agent.setUserPrivacyAgreed(z4);
        AccessNetworkManager.getInstance().setAccessNetwork(z4);
        HiAnalyticsManager.getInstance().setAnalyticsEnable(z4);
    }

    public void start(Context context) {
        int i5;
        if (hasInit) {
            LOG.debug("APMS has already been initialized.");
            return;
        }
        ghi.def().abc(context);
        try {
            boolean z4 = ghi.def().abc.getBoolean("apms_debug_log_enabled", false);
            AgentLog agentLog = LOG;
            if (z4) {
                i5 = 3;
            } else {
                i5 = 4;
            }
            agentLog.setLevel(i5);
            ijk ijkVar = new ijk(context);
            this.preferencesHolder = ijkVar;
            efg efgVar = AGENT_CONFIGURATION;
            efgVar.abc = ijkVar.abc("apms.disabled_by_user");
            if (isDisableByUser()) {
                agentLog.info("APMS has been disabled by user, do not need init.");
                Agent.setImpl(new hij(efgVar, ijkVar));
                return;
            }
            def.abc(context, efgVar, ijkVar);
            boolean z5 = ghi.def().abc.getBoolean("apms_hilog_enabled", false);
            if (z5) {
                if (z4) {
                    wvu.abc();
                }
                wvu.abc(context, ijkVar);
            }
            yxw.bcd.abc = z5;
            hasInit = true;
        } catch (Throwable th) {
            abc.abc(th, abc.abc("error occurred while init APMS: "), LOG);
        }
    }
}
