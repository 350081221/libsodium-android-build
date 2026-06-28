package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.collect.model.event.anr.AnrEvent;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class qrs {
    public AnrEvent fgh;
    public String abc = Agent.getVersion();
    public ApplicationInformation efg = Agent.getApplicationInformation();
    public DeviceInformation bcd = Agent.getDeviceInformation();
    public PlatformInformation cde = Agent.getPlatformInformation();
    public UserSettingsInformation def = Agent.getUserSettingsInformation();

    public qrs(rst rstVar) {
        this.fgh = new AnrEvent(rstVar);
    }

    public String abc() {
        String str;
        HashMap hashMap = new HashMap();
        List<tuv> allThreadStack = this.fgh.getAllThreadStack();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < allThreadStack.size(); i5++) {
            jSONArray.put(allThreadStack.get(i5).asJsonArray());
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(Agent.getRuntimeEnvInformation().asJsonArray());
        jSONArray2.put(this.fgh.getAnrTimeStamp());
        jSONArray2.put(this.fgh.getIsRoot());
        jSONArray2.put(this.fgh.getParentActivity());
        jSONArray2.put(this.fgh.getLongMsg());
        jSONArray2.put(jSONArray);
        jSONArray2.put(this.fgh.getAnrMemInfo().asJsonArray());
        jSONArray2.put(this.fgh.getTracesInfo());
        hashMap.put("anrInfo", jSONArray2);
        hashMap.put("applicationInformation", this.efg.asJsonArray().toString());
        hashMap.put("platformInformation", this.cde.asJsonArray().toString());
        if (TextUtils.isEmpty(this.abc)) {
            str = "";
        } else {
            str = this.abc;
        }
        hashMap.put("agentVersion", str);
        hashMap.put("deviceInformation", this.bcd.asJsonArray().toString());
        hashMap.put("userSettingsInformation", this.def.asJsonArray().toString());
        return new JSONObject(hashMap).toString();
    }
}
