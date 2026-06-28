package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.Event;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class AppStartEvent extends Event {
    public String activityName;
    public long interactionCost;
    public long startCost;
    public String startType;
    public long viewPreparedCost;

    /* loaded from: classes3.dex */
    public interface StartType {
        public static final String COLD_START = "cold_start";
        public static final String HOT_START = "hot_start";
    }

    public AppStartEvent(long j5, String str, String str2, long j6, long j7, long j8) {
        this.timestamp = j5;
        this.eventName = EventType.APP_START;
        this.activityName = str;
        this.startType = str2;
        this.startCost = j6;
        this.viewPreparedCost = j7;
        this.interactionCost = j8;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.activityName;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.startType;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        abc.abc(this.startCost, jSONArray);
        abc.abc(this.viewPreparedCost, jSONArray);
        abc.abc(this.interactionCost, jSONArray);
        return jSONArray;
    }
}
