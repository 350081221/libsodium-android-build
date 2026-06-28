package com.huawei.agconnect.apms.custom;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.event.custom.CustomHttpEvent;
import com.huawei.agconnect.apms.e1;
import com.huawei.agconnect.apms.fed;
import com.huawei.agconnect.apms.gfe;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.v1;
import com.huawei.agconnect.apms.x1;
import com.huawei.agconnect.apms.xwv;
import com.huawei.agconnect.apms.yza;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NetworkMeasure {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public String def;
    public String efg;
    public Map<String, String> cde = new ConcurrentHashMap();
    public volatile boolean bcd = false;
    public xwv abc = new xwv();

    public NetworkMeasure(String str, String str2) {
        this.def = str;
        this.efg = str2;
    }

    public Map<String, String> getProperties() {
        return this.cde;
    }

    public String getProperty(String str) {
        if (str == null) {
            fgh.warn("can't get a property because the property name is null.");
            return "";
        }
        return this.cde.get(str.trim());
    }

    public void putProperty(String str, String str2) {
        if (Agent.isDisabled()) {
            return;
        }
        String abc = x1.abc(new AbstractMap.SimpleEntry(str, str2));
        if (abc != null) {
            fgh.error(String.format(Locale.ENGLISH, "%s, can not set property '%s' with value '%s'.", abc, str, str2));
            return;
        }
        if (this.bcd) {
            fgh.error(String.format(Locale.ENGLISH, "networkMeasure has already been stopped, can not set property '%s' with value '%s'.", str, str2));
            return;
        }
        String abc2 = x1.abc(this.cde, str);
        if (abc2 != null) {
            fgh.error(String.format(Locale.ENGLISH, "%s, can not set property '%s' with value '%s'.", abc2, str, str2));
        } else {
            this.cde.put(str.trim(), str2.trim());
        }
    }

    public void removeProperty(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        if (this.bcd) {
            fgh.error("can't remove a property from a networkMeasure which has been stopped.");
        } else {
            this.cde.remove(str);
        }
    }

    public void setBytesReceived(long j5) {
        fed fedVar = this.abc.abc;
        if (fedVar != null) {
            fedVar.abc(j5);
        }
    }

    public void setBytesSent(long j5) {
        fed fedVar = this.abc.abc;
        if (fedVar != null) {
            fedVar.bcd(j5);
        }
    }

    public void setContentType(String str) {
        fed fedVar = this.abc.abc;
        if (fedVar != null) {
            fedVar.efg = str;
        }
    }

    public void setStatusCode(int i5) {
        fed fedVar = this.abc.abc;
        if (fedVar != null && !fedVar.ijk()) {
            fedVar.jkl = i5;
        }
    }

    public void start() {
        if (Agent.isDisabled()) {
            return;
        }
        fed fedVar = new fed();
        fedVar.def(this.def);
        fedVar.bcd(this.efg);
        this.abc.abc(fedVar);
    }

    public void stop() {
        if (Agent.isDisabled()) {
            return;
        }
        xwv xwvVar = this.abc;
        Map<String, String> map = this.cde;
        fed fedVar = xwvVar.abc;
        if (fedVar == null) {
            xwv.cde.error("network Trace has not been started so unable to stop.");
        } else if (fedVar.ijk()) {
            xwv.cde.error(String.format(Locale.ENGLISH, "network Trace '%s' has already stopped, should not stop again.", xwvVar.abc.bcd));
        } else {
            v1.jkl().bcd(xwvVar);
            if (v1.jkl().abc.isSampled()) {
                e1.cde().abc();
            }
            gfe bcd = xwvVar.abc.bcd();
            if (bcd != null) {
                JSONArray jSONArray = xwvVar.bcd;
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    } catch (JSONException e5) {
                        AgentLog agentLog = xwv.cde;
                        StringBuilder abc = abc.abc("getPropertyArray ");
                        abc.append(e5.getMessage());
                        agentLog.error(abc.toString());
                    }
                    jSONArray2.put(jSONObject);
                }
                yza.abc(new CustomHttpEvent(bcd, jSONArray, jSONArray2));
            }
        }
        this.bcd = true;
    }
}
