package com.huawei.agconnect.apms.collect.model.event.interaction;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.event.Event;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ActivityRenderEvent extends Event {
    public String activityName;
    public long duration;
    public long frozenFrameNum;
    public long slowFrameNum;
    public long totalFrameNum;

    public ActivityRenderEvent(long j5, String str, long j6, long j7, long j8, long j9) {
        this.timestamp = j5;
        this.eventName = EventType.ACTIVITY_RENDER;
        this.duration = j6;
        this.activityName = str;
        this.slowFrameNum = j7;
        this.frozenFrameNum = j8;
        this.totalFrameNum = j9;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.activityName;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.duration, jSONArray);
        abc.abc(this.slowFrameNum, jSONArray);
        abc.abc(this.frozenFrameNum, jSONArray);
        abc.abc(this.totalFrameNum, jSONArray);
        return jSONArray;
    }
}
