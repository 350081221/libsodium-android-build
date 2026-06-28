package com.huawei.agconnect.apms.collect.model.basic;

import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.t1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class DeviceInformation extends CollectableArray {
    public String architecture;
    public int cpuCores;
    public String cpuModel;
    public String deviceModel;
    public long diskSize;
    public String manufacturer;
    public long ramMemory;
    public double refreshRate;
    public String resolution;
    public double screenSize;
    public String screenType;

    public DeviceInformation(String str, String str2, String str3) {
        this.manufacturer = str;
        this.architecture = str2;
        this.deviceModel = str3;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.manufacturer));
        String str = this.architecture;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.deviceModel;
        if (str3 == null) {
            str3 = "null";
        }
        jSONArray.put(str3);
        jSONArray.put(t1.abc(Double.valueOf(this.screenSize)));
        String str4 = this.resolution;
        if (str4 == null) {
            str4 = "null";
        }
        jSONArray.put(str4);
        String str5 = this.screenType;
        if (str5 == null) {
            str5 = "null";
        }
        jSONArray.put(str5);
        jSONArray.put(t1.abc(Double.valueOf(this.refreshRate)));
        String str6 = this.cpuModel;
        if (str6 != null) {
            str2 = str6;
        }
        jSONArray.put(str2);
        abc.abc(this.cpuCores, jSONArray);
        abc.abc(this.ramMemory, jSONArray);
        abc.abc(this.diskSize, jSONArray);
        return jSONArray;
    }

    public void setCpuCores(int i5) {
        this.cpuCores = i5;
    }

    public void setCpuModel(String str) {
        this.cpuModel = str;
    }

    public void setDiskSize(long j5) {
        this.diskSize = j5;
    }

    public void setRamMemory(long j5) {
        this.ramMemory = j5;
    }

    public void setRefreshRate(double d5) {
        this.refreshRate = d5;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setScreenSize(double d5) {
        this.screenSize = d5;
    }

    public void setScreenType(String str) {
        this.screenType = str;
    }
}
