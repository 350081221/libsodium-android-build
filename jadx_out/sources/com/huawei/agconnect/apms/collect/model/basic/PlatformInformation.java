package com.huawei.agconnect.apms.collect.model.basic;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.t1;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class PlatformInformation extends CollectableArray {
    public String aaid;
    public String agcAppID;
    public String clientID;
    public String cpID;
    public String haVersion;
    public String osVersion;
    public String productID;
    public String rcVersion;
    public String romName;
    public String romVersion;
    public String osName = "Android";
    public String agentName = Agent.NAME;
    public String agentVersion = Agent.VERSION;

    public PlatformInformation(String str, String str2, String str3) {
        this.aaid = str;
        this.haVersion = str2;
        this.rcVersion = str3;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(t1.abc(this.cpID));
        String str = this.productID;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        String str3 = this.clientID;
        if (str3 == null) {
            str3 = "null";
        }
        jSONArray.put(str3);
        String str4 = this.agcAppID;
        if (str4 == null) {
            str4 = "null";
        }
        jSONArray.put(str4);
        String str5 = this.osName;
        if (str5 == null) {
            str5 = "null";
        }
        jSONArray.put(str5);
        String str6 = this.osVersion;
        if (str6 == null) {
            str6 = "null";
        }
        jSONArray.put(str6);
        String str7 = this.romName;
        if (str7 == null) {
            str7 = "null";
        }
        jSONArray.put(str7);
        String str8 = this.romVersion;
        if (str8 == null) {
            str8 = "null";
        }
        jSONArray.put(str8);
        String str9 = this.agentName;
        if (str9 == null) {
            str9 = "null";
        }
        jSONArray.put(str9);
        String str10 = this.agentVersion;
        if (str10 == null) {
            str10 = "null";
        }
        jSONArray.put(str10);
        String str11 = this.aaid;
        if (str11 == null) {
            str11 = "null";
        }
        jSONArray.put(str11);
        String str12 = this.haVersion;
        if (str12 == null) {
            str12 = "null";
        }
        jSONArray.put(str12);
        String str13 = this.rcVersion;
        if (str13 != null) {
            str2 = str13;
        }
        jSONArray.put(str2);
        return jSONArray;
    }

    public void setAgcAppID(String str) {
        this.agcAppID = str;
    }

    public void setAgentName(String str) {
        this.agentName = str;
    }

    public void setAgentVersion(String str) {
        this.agentVersion = str;
    }

    public void setClientID(String str) {
        this.clientID = str;
    }

    public void setCpID(String str) {
        this.cpID = str;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setProductID(String str) {
        this.productID = str;
    }

    public void setRomName(String str) {
        this.romName = str;
    }

    public void setRomVersion(String str) {
        this.romVersion = str;
    }
}
