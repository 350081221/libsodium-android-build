package com.huawei.agconnect.apms.collect.model.basic;

import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.t1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class ApplicationInformation extends CollectableArray {
    public String appName;
    public String appVersion;
    public String packageId;
    public int versionCode;

    public ApplicationInformation() {
        this.versionCode = -1;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.appName));
        String str = this.appVersion;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.versionCode, jSONArray);
        String str3 = this.packageId;
        if (str3 != null) {
            str2 = str3;
        }
        jSONArray.put(str2);
        return jSONArray;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setPackageId(String str) {
        this.packageId = str;
    }

    public void setVersionCode(int i5) {
        this.versionCode = i5;
    }

    public ApplicationInformation(String str, String str2, String str3) {
        this();
        this.appName = str;
        this.appVersion = str2;
        this.packageId = str3;
    }
}
