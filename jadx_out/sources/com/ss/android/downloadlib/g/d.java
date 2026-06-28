package com.ss.android.downloadlib.g;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    public static String a(String str, String str2, boolean z4, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("notification_jump_url", str2);
            }
            jSONObject.put("show_toast", z4);
            jSONObject.put("business_type", str3);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }
}
