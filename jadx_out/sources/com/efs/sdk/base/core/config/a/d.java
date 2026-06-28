package com.efs.sdk.base.core.config.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f6571a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);

    public static boolean a(@NonNull String str, @NonNull b bVar) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("config");
            int i5 = jSONObject.getInt("cver");
            String str2 = "";
            if (optJSONObject != null && optJSONObject.length() > 0) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("common");
                if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, optJSONObject2.optString(next, ""));
                    }
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("app_configs");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                        JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i6);
                        if (jSONObject2 != null && jSONObject2.length() == 2) {
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray("conditions");
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray("actions");
                            if (optJSONArray2 != null && optJSONArray3 != null && optJSONArray3.length() > 0) {
                                a(hashMap, optJSONArray3);
                            }
                        }
                    }
                }
                str2 = optJSONObject.optString("sign");
            }
            bVar.a(hashMap);
            bVar.f6552a = i5;
            bVar.a(str2);
            return true;
        } catch (Throwable th) {
            Log.e("efs.config", "parseConfig error, data is ".concat(String.valueOf(str)), th);
            return false;
        }
    }

    private static void a(Map<String, String> map, JSONArray jSONArray) {
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i5);
                if (jSONObject != null && jSONObject.length() >= 2) {
                    String optString = jSONObject.optString("opt");
                    Object opt = jSONObject.opt("set");
                    if (optString != null && opt != null) {
                        String optString2 = jSONObject.optString("lt", null);
                        String optString3 = jSONObject.optString(i0.b.f16155k, null);
                        if (optString2 != null) {
                            optString = optString + "_" + optString2;
                        }
                        if (optString3 != null) {
                            optString = optString + "_" + optString3;
                        }
                        map.put(optString, String.valueOf(opt));
                    }
                }
            } catch (Throwable th) {
                Log.e("efs.config", "updateConfigCond error", th);
                return;
            }
        }
    }
}
