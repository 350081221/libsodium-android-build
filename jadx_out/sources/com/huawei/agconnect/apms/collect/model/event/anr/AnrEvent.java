package com.huawei.agconnect.apms.collect.model.event.anr;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.rst;
import com.huawei.agconnect.apms.stu;
import com.huawei.agconnect.apms.t1;
import com.huawei.agconnect.apms.tuv;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class AnrEvent extends Event {
    public List<tuv> allThreadStack;
    public stu anrMemInfo;
    public long anrTimeStamp;
    public boolean isRoot;
    public String longMsg;
    public String parentActivity;
    public String tracesInfo;

    public AnrEvent(rst rstVar) {
        this.isRoot = rstVar.abc;
        this.parentActivity = rstVar.bcd;
        this.allThreadStack = rstVar.cde;
        this.longMsg = rstVar.def;
        this.anrMemInfo = rstVar.efg;
        this.runtimeEnvInformation = Agent.getRuntimeEnvInformation();
        this.anrTimeStamp = rstVar.fgh;
        this.tracesInfo = rstVar.ghi;
    }

    private JSONArray changeThreadStackListAsJsonArray(List<tuv> list) {
        JSONArray jSONArray = new JSONArray();
        for (tuv tuvVar : list) {
            if (tuvVar != null) {
                jSONArray.put(tuvVar.asJsonArray());
            }
        }
        return jSONArray;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        RuntimeEnvInformation runtimeEnvInformation = this.runtimeEnvInformation;
        if (runtimeEnvInformation != null) {
            jSONArray.put(runtimeEnvInformation.asJsonArray());
        }
        abc.abc(this.anrTimeStamp, jSONArray);
        jSONArray.put(t1.abc(Boolean.valueOf(this.isRoot)));
        String str = this.parentActivity;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.longMsg;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        jSONArray.put(changeThreadStackListAsJsonArray(this.allThreadStack));
        jSONArray.put(this.anrMemInfo.asJsonArray());
        jSONArray.put(this.tracesInfo);
        return jSONArray;
    }

    public List<tuv> getAllThreadStack() {
        return this.allThreadStack;
    }

    public stu getAnrMemInfo() {
        return this.anrMemInfo;
    }

    public long getAnrTimeStamp() {
        return this.anrTimeStamp;
    }

    public boolean getIsRoot() {
        return this.isRoot;
    }

    public String getLongMsg() {
        return this.longMsg;
    }

    public String getParentActivity() {
        return this.parentActivity;
    }

    public String getTracesInfo() {
        return this.tracesInfo;
    }
}
