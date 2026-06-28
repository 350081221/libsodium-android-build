package com.huawei.agconnect.apms.collect.model.basic;

import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.t1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class UserSettingsInformation extends CollectableArray {
    public String defaultLanguage;
    public String dns;
    public String timeZone;

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.timeZone));
        String str = this.defaultLanguage;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.dns;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        return jSONArray;
    }

    public void setDefaultLanguage(String str) {
        this.defaultLanguage = str;
    }

    public void setDns(String str) {
        this.dns = str;
    }

    public void setTimeZone(String str) {
        this.timeZone = str;
    }
}
