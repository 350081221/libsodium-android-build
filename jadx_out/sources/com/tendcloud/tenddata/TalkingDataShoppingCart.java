package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TalkingDataShoppingCart extends JSONArray {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11319a = "id";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11320b = "category";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11321c = "name";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11322d = "unitPrice";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11323e = "count";

    private TalkingDataShoppingCart() {
    }

    public static TalkingDataShoppingCart createShoppingCart() {
        return new TalkingDataShoppingCart();
    }

    public synchronized TalkingDataShoppingCart addItem(String str, String str2, String str3, int i5, int i6) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f11320b, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("name", str3);
            }
            jSONObject.put(f11322d, i5);
            jSONObject.put(f11323e, i6);
            put(jSONObject);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return this;
    }
}
