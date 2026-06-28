package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class abc {
    public static String abc(StringBuilder sb, String str) {
        sb.append(x1.bcd());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder abc(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder abc(String str, int i5, StringBuilder sb, String str2, String str3, String str4, String str5) {
        sb.append(w1.abc(str, i5));
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void abc(int i5, JSONArray jSONArray) {
        jSONArray.put(t1.abc(Integer.valueOf(i5)));
    }

    public static void abc(long j5, JSONArray jSONArray) {
        jSONArray.put(t1.abc(Long.valueOf(j5)));
    }

    public static void abc(Throwable th, StringBuilder sb, AgentLog agentLog) {
        sb.append(th.getMessage());
        agentLog.error(sb.toString());
    }

    public static void bcd(Throwable th, StringBuilder sb, AgentLog agentLog) {
        sb.append(th.getMessage());
        agentLog.warn(sb.toString());
    }
}
