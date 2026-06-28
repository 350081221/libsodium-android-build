package com.huawei.agconnect.apms.instrument;

import android.content.Context;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.k0;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.u0;
import com.huawei.agconnect.apms.v0;

/* loaded from: classes3.dex */
public class AppInstrumentation {
    public static final String METHOD_NAME_APPLICATION_CREATE = "#onCreate";
    public static final String METHOD_NAME_ATTACH_BASE_CONTEXT = "#attachBaseContext";
    public static final String METHOD_NAME_ON_CREATE = "#onCreate";
    public static final String METHOD_NAME_ON_RESTART = "#onRestart";
    public static final String METHOD_NAME_ON_RESUME = "#onResume";
    public static final String METHOD_NAME_ON_START = "#onStart";
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static volatile boolean isBackground = true;
    public static volatile boolean selfApplication = false;
    public static k0 activityTrace = new u0();

    public static void applicationCreateBegin(Context context) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            v0.ijk().abc(context, "#onCreate");
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.applicationCreateBegin() has an error: "), LOG);
        }
    }

    public static void applicationCreateEnd() {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            v0.ijk().def();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.applicationCreateEnd() has an error: "), LOG);
        }
    }

    public static void attachBaseContextBegin(Context context) {
        try {
            v0.ijk().bcd(context, METHOD_NAME_ATTACH_BASE_CONTEXT);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.attachBaseContextBegin() has an error: "), LOG);
        }
        selfApplication = true;
    }

    public static void attachBaseContextEnd() {
        try {
            v0.ijk().efg();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.attachBaseContextEnd() has an error: "), LOG);
        }
    }

    public static void onActivityCreateBegin(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.bcd(str, "#onCreate");
            if (!isBackground) {
                return;
            }
            v0.ijk().abc(str, "#onCreate");
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityCreateBegin() has an error: "), LOG);
        }
    }

    public static void onActivityCreateEnd() {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.abc();
            if (!isBackground) {
                return;
            }
            v0.ijk().abc();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityCreateEnd() has an error: "), LOG);
        }
    }

    public static void onActivityRestartBegin(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.bcd(str, METHOD_NAME_ON_RESTART);
            if (!isBackground) {
                return;
            }
            v0.ijk().bcd(str, METHOD_NAME_ON_RESTART);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityRestartBegin() has an error: "), LOG);
        }
    }

    public static void onActivityRestartEnd() {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.abc();
            if (!isBackground) {
                return;
            }
            v0 ijk = v0.ijk();
            if (0 == ijk.klm) {
                ijk.klm = System.currentTimeMillis();
                if (selfApplication) {
                    ijk.abc.abc();
                }
            }
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityRestartEnd() has an error: "), LOG);
        }
    }

    public static void onActivityResumeBegin(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.cde(str, "#onResume");
            if (!isBackground) {
                return;
            }
            v0.ijk().cde(str, "#onResume");
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityResumeBegin() has an error: "), LOG);
        }
    }

    public static void onActivityResumeEnd() {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.bcd();
            if (!isBackground) {
                return;
            }
            v0.ijk().bcd();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityResumeEnd() has an error: "), LOG);
        }
    }

    public static void onActivityStartBegin(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.abc(str, "#onStart");
            if (!isBackground) {
                return;
            }
            v0.ijk().def(str, "#onStart");
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityStartBegin() has an error: "), LOG);
        }
    }

    public static void onActivityStartEnd() {
        if (Agent.isDisabled()) {
            return;
        }
        try {
            activityTrace.cde();
            if (!isBackground) {
                return;
            }
            v0.ijk().cde();
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("AppInstrumentation.onActivityStartEnd() has an error: "), LOG);
        }
    }
}
