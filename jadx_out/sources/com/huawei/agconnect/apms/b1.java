package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class b1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static String abc(int i5) {
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    if (i5 != 5) {
                        if (i5 != 6) {
                            abc.warn("Level unknown input " + i5);
                            return String.valueOf(i5);
                        }
                        return "E";
                    }
                    return "W";
                }
                return "I";
            }
            return "D";
        }
        return "V";
    }
}
