package com.umeng.commonsdk.framework;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class UMModuleRegister {
    public static final String ANALYTICS = "analytics";
    public static final String APPSTATUS = "appstatus";
    private static final int APPSTATUS_SWITCH_HIGH = 37136;
    private static final int APPSTATUS_SWITCH_LOW = 37121;
    public static final String INNER = "internal";
    private static final int INNER_EVENT_VALUE_HIGH = 36864;
    private static final int INNER_EVENT_VALUE_LOW = 32769;
    public static final String PROCESS = "process";
    private static final int PROCESS_EVENT_VALUE_HIGH = 37120;
    private static final int PROCESS_EVENT_VALUE_LOW = 36945;
    public static final String PUSH = "push";
    private static final int PUSH_EVENT_VALUE_HIGH = 20480;
    private static final int PUSH_EVENT_VALUE_LOW = 16385;
    public static final String SHARE = "share";
    private static final int SHARE_EVENT_VALUE_HIGH = 28672;
    private static final int SHARE_EVENT_VALUE_LOW = 24577;
    private static Context mModuleAppContext;
    private static HashMap<String, UMLogDataProtocol> mModuleMap;

    public static String eventType2ModuleName(int i5) {
        String str = (i5 < PUSH_EVENT_VALUE_LOW || i5 > PUSH_EVENT_VALUE_HIGH) ? "analytics" : "push";
        if (i5 >= SHARE_EVENT_VALUE_LOW && i5 <= SHARE_EVENT_VALUE_HIGH) {
            str = "share";
        }
        if (i5 >= 32769 && i5 <= INNER_EVENT_VALUE_HIGH) {
            str = INNER;
        }
        if (i5 >= 36945 && i5 <= PROCESS_EVENT_VALUE_HIGH) {
            str = PROCESS;
        }
        return (i5 < APPSTATUS_SWITCH_LOW || i5 > APPSTATUS_SWITCH_HIGH) ? str : APPSTATUS;
    }

    public static Context getAppContext() {
        return mModuleAppContext;
    }

    public static UMLogDataProtocol getCallbackFromModuleName(String str) {
        if (mModuleMap.containsKey(str)) {
            return mModuleMap.get(str);
        }
        return null;
    }

    public static void registerAppContext(Context context) {
        if (mModuleAppContext == null) {
            mModuleAppContext = context.getApplicationContext();
        }
    }

    public static boolean registerCallback(int i5, UMLogDataProtocol uMLogDataProtocol) {
        if (mModuleMap == null) {
            mModuleMap = new HashMap<>();
        }
        String eventType2ModuleName = eventType2ModuleName(i5);
        if (!mModuleMap.containsKey(eventType2ModuleName)) {
            mModuleMap.put(eventType2ModuleName, uMLogDataProtocol);
            return true;
        }
        return true;
    }
}
