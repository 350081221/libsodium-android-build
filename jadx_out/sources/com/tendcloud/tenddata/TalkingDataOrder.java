package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TalkingDataOrder extends JSONObject {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11285a = "id";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11286b = "category";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11287c = "name";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11288d = "unitPrice";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11289e = "count";
    public static final String keyCurrencyType = "keyCurrencyType";
    public static final String keyOrderDetail = "keyOrderDetail";
    public static final String keyOrderId = "keyOrderId";
    public static final String keyTotalPrice = "keyTotalPrice";

    /* renamed from: f, reason: collision with root package name */
    private JSONArray f11290f = null;

    private TalkingDataOrder(String str, int i5, String str2) {
        try {
            put(keyOrderId, str);
            put(keyTotalPrice, i5);
            put(keyCurrencyType, str2);
        } catch (JSONException unused) {
        }
    }

    public static TalkingDataOrder createOrder(String str, int i5, String str2) {
        try {
            h.iForDeveloper("createOrder called --> orderId: " + str + " ,totalPrice: " + i5 + " ,currencyType: " + str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            h.eForDeveloper("createOrder: orderId could not be null or empty");
            return null;
        }
        if (TextUtils.isEmpty(str2) || str2.trim().length() != 3) {
            h.eForDeveloper("createOrder: currencyType length must be 3 ,likes CNY");
            return null;
        }
        return new TalkingDataOrder(str, i5, str2);
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, int i5, int i6) {
        try {
            if (this.f11290f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f11290f = jSONArray;
                put(keyOrderDetail, jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f11286b, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("name", str2);
            }
            jSONObject.put(f11288d, i5);
            jSONObject.put(f11289e, i6);
            this.f11290f.put(jSONObject);
        } catch (JSONException unused) {
        }
        return this;
    }

    private TalkingDataOrder() {
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, String str3, int i5, int i6) {
        try {
            if (this.f11290f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f11290f = jSONArray;
                put(keyOrderDetail, jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f11286b, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("name", str3);
            }
            jSONObject.put(f11288d, i5);
            jSONObject.put(f11289e, i6);
            this.f11290f.put(jSONObject);
        } catch (JSONException unused) {
        }
        return this;
    }
}
