package com.huawei.hms.analytics;

import android.os.Bundle;
import com.huawei.hms.analytics.core.crypto.RandomUtil;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.type.HAParamType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dj {
    private final Map<String, String> bcd;
    private String cde;
    private String def;
    private boolean efg;
    private String fgh;
    private String ghi;
    private int hij;
    public JSONObject ijk;
    public final ArrayList<JSONObject> ikl;
    public Bundle klm;
    public Bundle lmn;

    public dj(String str, Bundle bundle) {
        this.hij = -1;
        this.def = null;
        this.cde = "_openness_config_tag";
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        this.ikl = arrayList;
        this.bcd = new HashMap();
        lmn(str);
        this.lmn = bundle;
        JSONObject lmn = dm.lmn(bundle);
        lmn(lmn, this.ghi, this.fgh, "");
        arrayList.add(lmn);
    }

    public dj(String str, String str2) {
        this.hij = -1;
        this.def = null;
        this.cde = "_openness_config_tag";
        this.ikl = new ArrayList<>();
        this.bcd = new HashMap();
        this.efg = false;
        this.cde = str2;
        lmn(str);
    }

    public dj(String str, JSONObject jSONObject) {
        this.hij = -1;
        this.def = null;
        this.cde = "_openness_config_tag";
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        this.ikl = arrayList;
        this.bcd = new HashMap();
        lmn(str);
        lmn(jSONObject, str, this.fgh, "");
        arrayList.add(jSONObject);
    }

    public dj(String str, boolean z4) {
        this.hij = -1;
        this.def = null;
        this.cde = "_openness_config_tag";
        this.ikl = new ArrayList<>();
        this.bcd = new HashMap();
        this.efg = z4;
        lmn(str);
    }

    private static List<ax> ghi(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.size());
        for (String str : bundle.keySet()) {
            if (str != null) {
                arrayList.add(new ax(str, bundle.get(str)));
            } else {
                HiLog.w("P_CEvtHandler", "event params key is null");
            }
        }
        Collections.sort(arrayList, new df());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Bundle hij(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        this.ikl.clear();
        JSONObject jSONObject = new JSONObject();
        Bundle bundle2 = new Bundle();
        Iterator<ax> it = ghi(bundle).iterator();
        int i5 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ax next = it.next();
            if (i5 >= 2048) {
                HiLog.w("P_CEvtHandler", HiLog.ErrorCode.PE005, "The bundle size exceeds the limit.Unnecessary data is discarded.Limit size: 2048");
                break;
            }
            Object obj = next.klm;
            if (obj instanceof Bundle) {
                if (!z4) {
                    this.hij++;
                    bundle2.putBundle(next.lmn, klm(next.lmn, ghi((Bundle) obj)));
                    z4 = true;
                    i5++;
                }
            } else if (obj instanceof List) {
                if (!z5) {
                    ArrayList<?> lmn = lmn(next.lmn, (List) obj);
                    lmn(jSONObject, next.lmn, this.def);
                    bundle2.putParcelableArrayList(next.lmn, lmn);
                    z5 = true;
                    i5++;
                }
            } else if (!dc.lmn(obj)) {
                HiLog.w("P_CEvtHandler", "The current data type is invalid.Key:" + next.lmn);
            } else if (klm(next.lmn)) {
                bundle2.putSerializable(next.lmn, (Serializable) obj);
                lmn(jSONObject, next.lmn, obj);
                i5++;
            }
        }
        lmn(jSONObject);
        this.ikl.add(jSONObject);
        return bundle2;
    }

    private Bundle ijk(Bundle bundle) {
        JSONObject jSONObject = this.ijk;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!bundle.containsKey(next)) {
                        bundle.putSerializable(next, (Serializable) this.ijk.get(next));
                    }
                } catch (Exception unused) {
                    HiLog.w("P_CEvtHandler", "def event params error");
                }
            }
        }
        return bundle;
    }

    private Bundle klm(String str, List<ax> list) {
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        int i5 = 0;
        for (ax axVar : list) {
            if (i5 >= 2048) {
                break;
            }
            if (klm(axVar.lmn)) {
                i5++;
                String str2 = axVar.lmn;
                Object obj = axVar.klm;
                if (dc.lmn(obj)) {
                    bundle.putSerializable(str2, (Serializable) obj);
                    lmn(jSONObject, str2, obj);
                } else {
                    HiLog.e("P_CEvtHandler", "bundle value is error");
                }
            }
        }
        String str3 = this.fgh;
        String str4 = "$sub_" + this.ghi + "_" + str + "_" + this.hij;
        String generateSecureRandomStr = RandomUtil.getInstance().generateSecureRandomStr(16);
        String uuid = UUID.randomUUID().toString();
        String str5 = "$sub_evt_rel_" + this.hij;
        this.bcd.put(str5, uuid);
        lmn(jSONObject, str5, uuid);
        lmn(jSONObject, str4, generateSecureRandomStr, str3);
        this.ikl.add(jSONObject);
        return bundle;
    }

    private boolean klm(String str) {
        if (!this.efg || dc.lmn("bundleKey", str, am.klm)) {
            return true;
        }
        HiLog.w("P_CEvtHandler", "bundle key check failed! ".concat(String.valueOf(str)));
        return false;
    }

    private ArrayList<?> lmn(String str, List<?> list) {
        ArrayList<?> arrayList = new ArrayList<>();
        int size = list.size();
        ArrayList arrayList2 = null;
        int i5 = 0;
        for (int i6 = 0; i6 < size && i5 < 50; i6++) {
            Object obj = list.get(i6);
            if (obj instanceof Bundle) {
                this.hij++;
                i5++;
                arrayList.add(klm(str, ghi((Bundle) obj)));
            } else if (dc.lmn(obj)) {
                i5++;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList.add(obj);
                arrayList2.add(obj);
            }
        }
        if (arrayList2 != null) {
            this.def = new JSONArray((Collection) arrayList2).toString();
        }
        return arrayList;
    }

    private void lmn(String str) {
        this.ghi = str;
        this.fgh = RandomUtil.getInstance().generateSecureRandomStr(16);
    }

    private void lmn(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.bcd.entrySet()) {
            lmn(jSONObject, entry.getKey(), entry.getValue());
        }
        lmn(jSONObject, this.ghi, this.fgh, "");
    }

    private static void lmn(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HiLog.w("P_CEvtHandler", "put json exception ");
        }
    }

    private void lmn(JSONObject jSONObject, String str, String str2, String str3) {
        lmn(jSONObject, "^eventId", str);
        lmn(jSONObject, "^id", str2);
        lmn(jSONObject, "^pid", str3);
        if ("_openness_config_tag".equals(this.cde) || "AGC_TAG".equals(this.cde)) {
            lmn(jSONObject, HAParamType.TASKID, ar.lmn().lmn.f8143e);
            if ("$EnterScreen".equals(str) || "$ExitScreen".equals(str)) {
                return;
            }
            Bundle bundle = bcd.lmn().cde;
            lmn(jSONObject, "$PrePageId", bundle.getString("$PrevActivityClass", ""));
            lmn(jSONObject, "$CurrPageId", bundle.getString("$CurActivityClass", ""));
        }
    }

    public final void ikl(Bundle bundle) {
        this.klm = ijk(bundle);
    }

    public final boolean klm(Bundle bundle) {
        Bundle hij = hij(bundle);
        this.lmn = hij;
        return hij.toString().length() <= 204800;
    }

    public final boolean lmn(Bundle bundle) {
        ijk(bundle);
        Bundle hij = hij(bundle);
        this.lmn = hij;
        return hij.toString().length() <= 204800;
    }
}
