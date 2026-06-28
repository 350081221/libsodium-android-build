package com.huawei.agconnect.apms.collect.model.event.resource;

import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.f1;
import com.huawei.agconnect.apms.g1;
import com.huawei.agconnect.apms.util.Session;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class CPUMemoryEvent extends Event {
    public List<f1> appMemoryResourceList;
    public List<g1> cpuResourceList;

    public CPUMemoryEvent() {
        this.eventName = EventType.CPU_MEMORY;
        this.cpuResourceList = new ArrayList();
        this.appMemoryResourceList = new ArrayList();
        this.runtimeEnvInformation = new RuntimeEnvInformation();
    }

    private JSONArray changeCpuAsJsonArray(List<g1> list) {
        JSONArray jSONArray = new JSONArray();
        for (g1 g1Var : list) {
            if (g1Var != null) {
                jSONArray.put(g1Var.asJsonArray());
            }
        }
        return jSONArray;
    }

    private JSONArray changeMemoryAsJsonArray(List<f1> list) {
        JSONArray jSONArray = new JSONArray();
        for (f1 f1Var : list) {
            if (f1Var != null) {
                jSONArray.put(f1Var.asJsonArray());
            }
        }
        return jSONArray;
    }

    public void addSession(Session session) {
        this.runtimeEnvInformation.addSession(session);
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        jSONArray.put(changeCpuAsJsonArray(this.cpuResourceList));
        jSONArray.put(changeMemoryAsJsonArray(this.appMemoryResourceList));
        return jSONArray;
    }

    public List<f1> getAppMemoryResourceList() {
        return this.appMemoryResourceList;
    }

    public List<g1> getCpuResourceList() {
        return this.cpuResourceList;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event
    public void setTimestamp(long j5) {
        this.timestamp = j5;
    }
}
