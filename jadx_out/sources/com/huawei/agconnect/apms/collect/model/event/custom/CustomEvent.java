package com.huawei.agconnect.apms.collect.model.event.custom;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.event.Event;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class CustomEvent extends Event {
    public JSONArray attributeArray;
    public JSONArray metricArray;
    public long traceCost;
    public String traceName;

    public CustomEvent(long j5, String str, long j6, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        this.timestamp = j5;
        this.eventName = EventType.CUSTOM_TRACE;
        this.traceName = str;
        this.traceCost = j6;
        this.attributeArray = jSONArray2;
        this.metricArray = jSONArray3;
        RuntimeEnvInformation runtimeEnvInformation = Agent.getRuntimeEnvInformation();
        runtimeEnvInformation.setSessionArray(jSONArray);
        this.runtimeEnvInformation = runtimeEnvInformation;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.traceName;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.traceCost, jSONArray);
        jSONArray.put(this.attributeArray);
        jSONArray.put(this.metricArray);
        return jSONArray;
    }
}
