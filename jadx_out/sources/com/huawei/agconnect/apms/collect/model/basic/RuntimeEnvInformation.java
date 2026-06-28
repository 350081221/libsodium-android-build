package com.huawei.agconnect.apms.collect.model.basic;

import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.t1;
import com.huawei.agconnect.apms.util.Session;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class RuntimeEnvInformation extends CollectableArray {
    public boolean appBackgrounded;
    public int batteryPercentage;
    public boolean deviceCharging;
    public long diskAvailable;
    public long memoryUsage;
    public String networkWanType;
    public int orientation;
    public JSONArray sessionArray = new JSONArray();

    public RuntimeEnvInformation() {
    }

    public void addSession(Session session) {
        this.sessionArray.put(session.asJsonArray());
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(Boolean.valueOf(this.deviceCharging)));
        abc.abc(this.batteryPercentage, jSONArray);
        String str = this.networkWanType;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.orientation, jSONArray);
        jSONArray.put(t1.abc(Boolean.valueOf(this.appBackgrounded)));
        jSONArray.put(this.sessionArray);
        abc.abc(this.diskAvailable, jSONArray);
        abc.abc(this.memoryUsage, jSONArray);
        return jSONArray;
    }

    public void setAppBackgrounded(boolean z4) {
        this.appBackgrounded = z4;
    }

    public void setBatteryPercentage(int i5) {
        this.batteryPercentage = i5;
    }

    public void setDeviceCharging(boolean z4) {
        this.deviceCharging = z4;
    }

    public void setDiskAvailable(long j5) {
        this.diskAvailable = j5;
    }

    public void setMemoryUsage(long j5) {
        this.memoryUsage = j5;
    }

    public void setNetworkWanType(String str) {
        this.networkWanType = str;
    }

    public void setOrientation(int i5) {
        this.orientation = i5;
    }

    public void setSessionArray(JSONArray jSONArray) {
        this.sessionArray = jSONArray;
    }

    public RuntimeEnvInformation(long j5, int i5, String str, long j6) {
        this.memoryUsage = j5;
        this.orientation = i5;
        this.networkWanType = str;
        this.diskAvailable = j6;
    }
}
