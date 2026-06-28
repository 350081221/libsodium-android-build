package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0670r implements s {

    /* renamed from: a, reason: collision with root package name */
    public List<q> f8671a;

    /* renamed from: b, reason: collision with root package name */
    public o f8672b;

    /* renamed from: c, reason: collision with root package name */
    public p f8673c;

    /* renamed from: d, reason: collision with root package name */
    public s f8674d;

    /* renamed from: e, reason: collision with root package name */
    public String f8675e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f8676f;

    public C0670r(String str) {
        this.f8676f = str;
    }

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        String str;
        List<q> list = this.f8671a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f8672b == null || this.f8673c == null || this.f8674d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f8672b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a5 = this.f8674d.a();
            a5.put("properties", this.f8673c.a());
            try {
                a5.put("events_global_properties", new JSONObject(this.f8675e));
            } catch (JSONException unused) {
                a5.put("events_global_properties", this.f8675e);
            }
            jSONObject2.put("events_common", a5);
            JSONArray jSONArray = new JSONArray();
            Iterator<q> it = this.f8671a.iterator();
            while (it.hasNext()) {
                JSONObject a6 = it.next().a();
                if (a6 != null) {
                    jSONArray.put(a6);
                } else {
                    y.e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put(com.umeng.analytics.pro.d.ax, jSONArray);
            try {
                String a7 = d.a(t0.a(jSONObject2.toString().getBytes("UTF-8")), this.f8676f);
                if (TextUtils.isEmpty(a7)) {
                    y.e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, a7);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        y.e("hmsSdk", str);
        return null;
    }

    public void a(e1 e1Var) {
        this.f8674d = e1Var;
    }

    public void a(o oVar) {
        this.f8672b = oVar;
    }

    public void a(p pVar) {
        this.f8673c = pVar;
    }

    public void a(String str) {
        if (str != null) {
            this.f8675e = str;
        }
    }

    public void a(List<q> list) {
        this.f8671a = list;
    }
}
