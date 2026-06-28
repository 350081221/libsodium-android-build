package com.huawei.agconnect.apms;

import android.content.Context;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class mlk implements kji {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public final Context abc;
    public ijk bcd;

    public mlk(Context context) {
        this.abc = context.getApplicationContext();
    }
}
