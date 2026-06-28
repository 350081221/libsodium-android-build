package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.r1;
import com.huawei.agconnect.remoteconfig.ConfigValues;

/* loaded from: classes3.dex */
public class bcd implements r1.def {
    public final /* synthetic */ def abc;

    public bcd(def defVar) {
        this.abc = defVar;
    }

    public void abc(Exception exc) {
        AgentLog agentLog = def.jkl;
        StringBuilder abc = abc.abc("failed to fetch remote config: ");
        abc.append(exc.getMessage());
        agentLog.info(abc.toString());
    }

    public void abc(ConfigValues configValues) {
        String valueAsString;
        String valueAsString2;
        Boolean valueAsBoolean;
        def.jkl.debug("succeeded to fetch remote config.");
        try {
            r1 def = r1.def();
            Boolean valueOf = Boolean.valueOf(this.abc.cde.abc("apms.disabled_android"));
            if (def.bcd() && (valueAsBoolean = def.abc.getValueAsBoolean("apms.disabled_android")) != null) {
                valueOf = valueAsBoolean;
            }
            boolean booleanValue = valueOf.booleanValue();
            r1 def2 = r1.def();
            String bcd = this.abc.cde.bcd("apms.disabled_android_app_versions");
            if (def2.bcd() && (valueAsString2 = def2.abc.getValueAsString("apms.disabled_android_app_versions")) != null) {
                bcd = valueAsString2;
            }
            r1 def3 = r1.def();
            String bcd2 = this.abc.cde.bcd("apms.cdn_header_name");
            if (def3.bcd() && (valueAsString = def3.abc.getValueAsString("apms.cdn_header_name")) != null) {
                bcd2 = valueAsString;
            }
            def defVar = this.abc;
            efg efgVar = defVar.def;
            efgVar.def = bcd2;
            efgVar.bcd = booleanValue;
            efgVar.cde = bcd;
            defVar.cde.abc("apms.cdn_header_name", bcd2);
            this.abc.cde.abc("apms.disabled_android", booleanValue);
            this.abc.cde.abc("apms.disabled_android_app_versions", bcd);
        } catch (Throwable th) {
            abc.abc(th, abc.abc("exception occurred when getting remote config: "), def.jkl);
        }
    }
}
