package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.type.CollectableObject;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class l0 extends CollectableObject {
    public static final AgentLog hij = AgentLogManager.getAgentLog();
    public static Comparator<c> ijk = new abc();
    public ConcurrentHashMap<UUID, c> abc;
    public Set<UUID> bcd;
    public boolean cde;
    public c def;
    public g0 efg;
    public long fgh;
    public long ghi;

    /* loaded from: classes3.dex */
    public static class abc implements Comparator<c> {
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            if (cVar.abc < cVar2.abc) {
                return -1;
            }
            return 0;
        }
    }

    public l0(c cVar, g0 g0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        this.def = cVar;
        cVar.abc = currentTimeMillis;
        this.efg = g0Var;
        this.cde = false;
        this.bcd = Collections.synchronizedSet(new HashSet());
        this.abc = new ConcurrentHashMap<>();
        this.fgh = currentTimeMillis;
    }

    public long abc() {
        long j5 = this.ghi - this.fgh;
        if (j5 < 0 || j5 > 300000) {
            return 0L;
        }
        return j5;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableObject
    public JSONObject asJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("traces", bcd(this.def));
        } catch (JSONException e5) {
            AgentLog agentLog = hij;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("asJsonObject ");
            abc2.append(e5.getMessage());
            agentLog.error(abc2.toString());
        }
        return jSONObject;
    }

    public long bcd() {
        c cVar = this.def;
        long j5 = cVar.bcd - cVar.abc;
        if (j5 < 0 || j5 > 300000) {
            return 0L;
        }
        return j5;
    }

    public void abc(c cVar) {
        UUID uuid = cVar.efg;
        this.bcd.remove(uuid);
        this.abc.put(uuid, cVar);
        AgentLog agentLog = hij;
        StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("add trace ");
        abc2.append(uuid.toString());
        abc2.append(", missing children: ");
        abc2.append(this.bcd.size());
        agentLog.debug(abc2.toString());
    }

    public final JSONArray bcd(c cVar) {
        long j5;
        JSONObject asJsonObject;
        JSONArray jSONArray = new JSONArray();
        if (cVar == null || cVar.klm == i0.NETWORK.abc) {
            return null;
        }
        long j6 = this.ghi;
        long bcd = bcd();
        ghi.def().bcd();
        if (bcd >= 1000) {
            j6 = this.def.bcd;
        }
        long j7 = cVar.abc;
        boolean z4 = true;
        if (j7 <= j6) {
            if (cVar.hij == h0.ASYNC.abc) {
                long j8 = cVar.bcd;
                if (j7 > j8) {
                    cVar.abc = j8;
                }
                if (j8 > j6) {
                    cVar.ijk = true;
                }
            }
            z4 = false;
        }
        if (z4) {
            return null;
        }
        long j9 = -1;
        if (cVar.hij == h0.ASYNC.abc) {
            j5 = cVar.abc;
            if (j5 != -1) {
                j5 -= this.fgh;
            }
        } else {
            j5 = 0;
        }
        com.huawei.agconnect.apms.abc.abc(j5, jSONArray);
        long j10 = cVar.abc;
        if (j10 != -1) {
            j10 -= this.fgh;
        }
        com.huawei.agconnect.apms.abc.abc(j10, jSONArray);
        if (this.efg != g0.PAGE_LOADING || !cVar.ijk) {
            long j11 = cVar.bcd;
            if (j11 != -1) {
                j9 = j11 - this.fgh;
            }
        }
        com.huawei.agconnect.apms.abc.abc(j9, jSONArray);
        String str = cVar.def;
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        long j12 = cVar.fgh;
        String str2 = cVar.ghi;
        JSONArray jSONArray2 = new JSONArray();
        com.huawei.agconnect.apms.abc.abc(j12, jSONArray2);
        jSONArray2.put(str2 != null ? str2 : "null");
        jSONArray.put(jSONArray2);
        t0 t0Var = cVar.jkl;
        if (t0Var == null) {
            asJsonObject = new JSONObject();
        } else {
            asJsonObject = t0Var.asJsonObject();
        }
        jSONArray.put(asJsonObject);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray3 = new JSONArray();
        if (!cVar.cde.isEmpty()) {
            Iterator<UUID> it = cVar.cde.iterator();
            while (it.hasNext()) {
                c cVar2 = this.abc.get(it.next());
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                }
            }
        }
        Collections.sort(arrayList, ijk);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            JSONArray bcd2 = bcd((c) it2.next());
            if (bcd2 != null) {
                jSONArray3.put(bcd2);
            }
        }
        jSONArray.put(jSONArray3);
        com.huawei.agconnect.apms.abc.abc(cVar.klm, jSONArray);
        return jSONArray;
    }
}
