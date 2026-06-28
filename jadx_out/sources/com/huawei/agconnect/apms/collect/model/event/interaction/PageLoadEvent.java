package com.huawei.agconnect.apms.collect.model.event.interaction;

import a1.b;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.ghi;
import com.huawei.agconnect.apms.l0;
import com.huawei.agconnect.apms.t1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class PageLoadEvent extends Event {
    public long loadTime;
    public l0 pageLoadInfo;
    public String viewName;

    /* loaded from: classes3.dex */
    public interface PageLoadType {
        public static final int NORMAL = 0;
        public static final int SLOW_INTERACTION = 2;
        public static final int SLOW_LOAD = 1;
    }

    public PageLoadEvent(String str, l0 l0Var) {
        this.timestamp = l0Var.def.abc;
        this.viewName = str;
        this.loadTime = l0Var.bcd();
        this.pageLoadInfo = l0Var;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    private int isSlowInteraction(long j5, long j6) {
        ghi.def().bcd();
        if (j5 >= 1000) {
            return 1;
        }
        ghi.def().cde();
        if (j6 >= b.f90a) {
            return 2;
        }
        return 0;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.viewName;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.loadTime, jSONArray);
        jSONArray.put(t1.abc(Long.valueOf(this.pageLoadInfo.abc())));
        int isSlowInteraction = isSlowInteraction(this.loadTime, this.pageLoadInfo.abc());
        jSONArray.put(isSlowInteraction);
        if (isSlowInteraction > 0) {
            jSONObject = this.pageLoadInfo.asJsonObject();
        } else {
            jSONObject = new JSONObject();
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }
}
