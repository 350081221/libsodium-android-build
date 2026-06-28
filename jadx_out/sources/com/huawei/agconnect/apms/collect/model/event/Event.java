package com.huawei.agconnect.apms.collect.model.event;

import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public abstract class Event extends CollectableArray {
    public String eventName;
    public RuntimeEnvInformation runtimeEnvInformation;
    public long timestamp;

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.eventName;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        return jSONArray;
    }

    public String getEventName() {
        return this.eventName;
    }

    public RuntimeEnvInformation getRuntimeEnvInformation() {
        return this.runtimeEnvInformation;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setRuntimeEnvInformation(RuntimeEnvInformation runtimeEnvInformation) {
        this.runtimeEnvInformation = runtimeEnvInformation;
    }

    public void setTimestamp(long j5) {
        this.timestamp = j5;
    }
}
