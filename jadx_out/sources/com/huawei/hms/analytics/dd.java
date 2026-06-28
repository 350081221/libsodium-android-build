package com.huawei.hms.analytics;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dd {
    private static final List<String> klm;
    private static final String[] lmn;

    static {
        String[] strArr = {"_campaign_info"};
        lmn = strArr;
        klm = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public static List<JSONObject> klm(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                arrayList.add(jSONArray.getJSONObject(i5));
            } catch (JSONException unused) {
                HiLog.w("ConvertMethod", "json array item is not jsonObject");
            }
        }
        return arrayList;
    }

    public static Map<String, String> klm(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static Bundle lmn(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (Bundle) bundle.clone();
    }

    public static String lmn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return new JSONObject(str).getString(str2);
        } catch (JSONException unused) {
            HiLog.w("ConvertMethod", "JSONException: Failed to obtain the key from jsonStr.");
            return "";
        }
    }

    public static Map<String, String> lmn(JSONObject jSONObject) {
        String sb;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("_restriction_shared".equals(next)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ar.lmn().lmn.def);
                    sb = sb2.toString();
                } else if (!dc.lmn(next, klm)) {
                    sb = jSONObject.optString(next);
                }
                hashMap.put(next, sb);
            }
        }
        return hashMap;
    }

    public static JSONArray lmn(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static JSONArray lmn(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new JSONArray();
        }
        if (1000 >= jSONArray.length()) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i5 = 0; i5 < 1000; i5++) {
            try {
                jSONArray2.put(jSONArray.get(i5));
            } catch (JSONException unused) {
                HiLog.w("ConvertMethod", "truncate JSONArray error");
            }
        }
        return jSONArray2;
    }

    public static JSONObject lmn(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                HiLog.w("ConvertMethod", "map to json exception");
            }
        }
        return jSONObject;
    }
}
