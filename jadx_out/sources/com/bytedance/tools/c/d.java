package com.bytedance.tools.c;

import android.content.Context;
import android.database.Cursor;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f6301a;

    /* renamed from: b, reason: collision with root package name */
    public String f6302b;

    /* renamed from: c, reason: collision with root package name */
    public String f6303c;

    /* renamed from: d, reason: collision with root package name */
    public String f6304d;

    /* renamed from: e, reason: collision with root package name */
    public String f6305e;

    /* renamed from: f, reason: collision with root package name */
    public String f6306f;

    /* renamed from: g, reason: collision with root package name */
    public int f6307g;

    /* renamed from: h, reason: collision with root package name */
    public String f6308h;

    /* renamed from: i, reason: collision with root package name */
    public String f6309i;

    /* renamed from: j, reason: collision with root package name */
    public String f6310j;

    public static d a(Context context, String str) {
        d dVar = new d();
        dVar.f6301a = str;
        Cursor cursor = null;
        try {
            Cursor b5 = com.bytedance.tools.d.d.b(context, "setting_rit", null, "rit=?", new String[]{str}, null, null, "rit ASC");
            if (b5 == null) {
                if (b5 != null) {
                    b5.close();
                }
                return dVar;
            }
            if (b5.moveToNext()) {
                try {
                    JSONObject jSONObject = new JSONObject(com.bytedance.tools.d.b.g(b5.getString(b5.getColumnIndex("slot"))));
                    dVar.f6303c = jSONObject.optString("img_width");
                    dVar.f6304d = jSONObject.optString("img_height");
                    dVar.f6305e = jSONObject.optString("express_width");
                    dVar.f6306f = jSONObject.optString("express_height");
                    dVar.f6307g = jSONObject.optInt("ad_count");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                try {
                    dVar.f6302b = d(new JSONObject(com.bytedance.tools.d.b.g(new JSONObject(b5.getString(b5.getColumnIndex(t0.b.f22420d))).optString(CrashHianalyticsData.MESSAGE))).optInt("slot_type"));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(com.bytedance.tools.d.b.g(b5.getString(b5.getColumnIndex("config"))));
                    dVar.f6308h = jSONObject2.optString("aid");
                    dVar.f6309i = jSONObject2.optString("cid");
                    dVar.f6310j = jSONObject2.optString("ext");
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
            b5.close();
            return dVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static d b(String str) {
        d dVar = new d();
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar.f6301a = jSONObject.getString("ritId");
            dVar.f6303c = jSONObject.getString("imgWidth");
            dVar.f6304d = jSONObject.getString("imgHeight");
            dVar.f6305e = jSONObject.getString("expressWidth");
            dVar.f6306f = jSONObject.getString("expressHeight");
            dVar.f6307g = jSONObject.getInt("adCount");
            dVar.f6308h = jSONObject.getString("previewAid");
            dVar.f6309i = jSONObject.getString("previewCid");
            dVar.f6310j = jSONObject.getString("previewExt");
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return dVar;
    }

    private static String d(int i5) {
        switch (i5) {
            case 1:
                return "Banner";
            case 2:
                return "插屏";
            case 3:
            case 4:
                return "开屏";
            case 5:
                return "信息流";
            case 6:
                return "贴片";
            case 7:
                return "激励";
            case 8:
                return "全屏";
            case 9:
                return "Draw";
            default:
                return "未知";
        }
    }

    public String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ritId", this.f6301a);
            jSONObject.put("imgWidth", this.f6303c);
            jSONObject.put("imgHeight", this.f6304d);
            jSONObject.put("expressWidth", this.f6305e);
            jSONObject.put("expressHeight", this.f6306f);
            jSONObject.put("adCount", this.f6307g);
            jSONObject.put("previewAid", this.f6308h);
            jSONObject.put("previewCid", this.f6309i);
            jSONObject.put("previewExt", this.f6310j);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject.toString();
    }
}
