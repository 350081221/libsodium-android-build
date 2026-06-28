package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.util.NamedThreadFactory;
import com.huawei.agconnect.apms.util.Session;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class Agent {
    public static final String HA_VERSION = "";
    public static final Object IMPL_LOCK;
    public static final String NAME = "AndroidAgent";
    public static final fgh NOOP_AGENT_IMPL;
    public static final String OS_NAME = "Android";
    public static final String RC_VERSION = "";
    public static final String VERSION = "1.6.2.300";
    public static ExecutorService executor;
    public static fgh impl;

    static {
        hij hijVar = new hij();
        NOOP_AGENT_IMPL = hijVar;
        impl = hijVar;
        IMPL_LOCK = new Object();
        executor = Executors.newSingleThreadExecutor(new NamedThreadFactory("AgentReportEvent"));
    }

    public static void enableAnrMonitor(boolean z4) {
        getImpl().cde(z4);
    }

    public static void enableCollectionByUser(boolean z4) {
        getImpl().bcd(z4);
    }

    public static efg getAgentConfiguration() {
        return getImpl().lmn();
    }

    public static ApplicationInformation getApplicationInformation() {
        return getImpl().ghi();
    }

    public static Context getContext() {
        return getImpl().klm();
    }

    public static long getCreateTime() {
        return getImpl().abc();
    }

    public static DeviceInformation getDeviceInformation() {
        return getImpl().hij();
    }

    public static ExecutorService getExecutor() {
        return executor;
    }

    public static fgh getImpl() {
        fgh fghVar;
        synchronized (IMPL_LOCK) {
            fghVar = impl;
        }
        return fghVar;
    }

    public static PlatformInformation getPlatformInformation() {
        return getImpl().fgh();
    }

    public static RuntimeEnvInformation getRuntimeEnvInformation() {
        return getImpl().efg();
    }

    public static Session getSession() {
        return getImpl().ijk();
    }

    public static String getUserIdentifier() {
        return getImpl().jkl();
    }

    public static UserSettingsInformation getUserSettingsInformation() {
        return getImpl().def();
    }

    public static String getVersion() {
        return VERSION;
    }

    public static boolean isDisabled() {
        return getImpl().bcd();
    }

    public static void setImpl(fgh fghVar) {
        synchronized (IMPL_LOCK) {
            if (fghVar == null) {
                impl = NOOP_AGENT_IMPL;
            } else {
                impl = fghVar;
            }
        }
    }

    public static void setUserIdentifier(String str) {
        getImpl().abc(str);
    }

    public static void setUserPrivacyAgreed(boolean z4) {
        getImpl().abc(z4);
    }

    public static void start() {
        getImpl().cde();
    }
}
