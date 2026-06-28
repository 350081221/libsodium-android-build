package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.event.Event;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ForeAndBackgroundEvent extends Event {
    public static final String BACKGROUND = "background";
    public static final String FOREGROUND = "foreground";
    public long duration;

    public ForeAndBackgroundEvent(long j5, String str, long j6) {
        this.timestamp = j5;
        this.eventName = str;
        this.duration = j6;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.eventName;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.duration, jSONArray);
        return jSONArray;
    }
}
