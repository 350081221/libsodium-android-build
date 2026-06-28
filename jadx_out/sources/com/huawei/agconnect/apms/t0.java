package com.huawei.agconnect.apms;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.agconnect.apms.collect.type.CollectableObject;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class t0 extends CollectableObject {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public gfe abc;

    public t0(fed fedVar) {
        this.abc = fedVar.bcd();
    }

    public final JSONArray abc() {
        gfe gfeVar = this.abc;
        if (gfeVar == null) {
            return new JSONArray();
        }
        List<o> list = gfeVar.yza;
        if (list == null) {
            return new JSONArray();
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < size; i5++) {
            JSONArray jSONArray2 = new JSONArray();
            o oVar = list.get(i5);
            jSONArray2.put(t1.abc(oVar.abc));
            String str = oVar.def;
            if (str == null) {
                str = "null";
            }
            jSONArray2.put(str);
            abc.abc(oVar.bcd, jSONArray2);
            jSONArray2.put(t1.abc(Integer.valueOf(oVar.cde)));
            jSONArray2.put(t1.abc(Boolean.valueOf(oVar.abc())));
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableObject
    public JSONObject asJsonObject() {
        String hij;
        String fgh;
        int ghi;
        long abc;
        long bcd2;
        JSONObject jSONObject = new JSONObject();
        try {
            gfe gfeVar = this.abc;
            String str = "";
            if (gfeVar == null) {
                hij = "";
            } else {
                hij = gfeVar.hij();
            }
            jSONObject.put("url", t1.abc(hij));
            gfe gfeVar2 = this.abc;
            if (gfeVar2 == null) {
                fgh = "";
            } else {
                fgh = gfeVar2.fgh();
            }
            String str2 = "null";
            if (fgh == null) {
                fgh = "null";
            }
            jSONObject.put("serverIp", fgh);
            gfe gfeVar3 = this.abc;
            if (gfeVar3 == null) {
                ghi = -1;
            } else {
                ghi = gfeVar3.ghi();
            }
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, t1.abc(Integer.valueOf(ghi)));
            gfe gfeVar4 = this.abc;
            if (gfeVar4 != null) {
                str = gfeVar4.cde();
            }
            if (str != null) {
                str2 = str;
            }
            jSONObject.put(MediationConstant.KEY_ERROR_MSG, str2);
            gfe gfeVar5 = this.abc;
            long j5 = -1;
            if (gfeVar5 == null) {
                abc = -1;
            } else {
                abc = gfeVar5.abc();
            }
            jSONObject.put("bytesReceived", t1.abc(Long.valueOf(abc)));
            gfe gfeVar6 = this.abc;
            if (gfeVar6 == null) {
                bcd2 = -1;
            } else {
                bcd2 = gfeVar6.bcd();
            }
            jSONObject.put("bytesSent", t1.abc(Long.valueOf(bcd2)));
            jSONObject.put("dnsArray", abc());
            jSONObject.put("socketArray", bcd());
            gfe gfeVar7 = this.abc;
            if (gfeVar7 != null) {
                j5 = gfeVar7.def() - this.abc.efg();
            }
            jSONObject.put("responseHeaderCost", t1.abc(Long.valueOf(j5)));
        } catch (JSONException e5) {
            AgentLog agentLog = bcd;
            StringBuilder abc2 = abc.abc("asJsonObject ");
            abc2.append(e5.getMessage());
            agentLog.error(abc2.toString());
        }
        return jSONObject;
    }

    public final JSONArray bcd() {
        gfe gfeVar = this.abc;
        if (gfeVar == null) {
            return new JSONArray();
        }
        List<p> list = gfeVar.yxw;
        if (list == null) {
            return new JSONArray();
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < size; i5++) {
            JSONArray jSONArray2 = new JSONArray();
            p pVar = list.get(i5);
            jSONArray2.put(t1.abc(pVar.abc));
            jSONArray2.put(t1.abc(Integer.valueOf(pVar.bcd)));
            jSONArray2.put(t1.abc(Integer.valueOf(pVar.cde)));
            jSONArray2.put(t1.abc(Integer.valueOf(pVar.def)));
            jSONArray2.put(t1.abc(Integer.valueOf(pVar.efg)));
            jSONArray2.put(t1.abc(Boolean.valueOf(pVar.fgh)));
            String str = pVar.ghi;
            String str2 = "null";
            if (str == null) {
                str = "null";
            }
            jSONArray2.put(str);
            String str3 = pVar.hij;
            if (str3 == null) {
                str3 = "null";
            }
            jSONArray2.put(str3);
            String str4 = pVar.ijk;
            if (str4 == null) {
                str4 = "null";
            }
            jSONArray2.put(str4);
            jSONArray2.put(t1.abc(Boolean.valueOf(pVar.jkl)));
            String str5 = pVar.klm;
            if (str5 != null) {
                str2 = str5;
            }
            jSONArray2.put(str2);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }
}
