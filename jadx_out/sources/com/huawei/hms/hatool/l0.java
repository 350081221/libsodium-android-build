package com.huawei.hms.hatool;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public String f8625a;

    /* renamed from: b, reason: collision with root package name */
    public String f8626b;

    /* renamed from: c, reason: collision with root package name */
    public String f8627c;

    /* renamed from: d, reason: collision with root package name */
    public List<q> f8628d;

    public l0(List<q> list, String str, String str2, String str3) {
        this.f8625a = str;
        this.f8626b = str2;
        this.f8627c = str3;
        this.f8628d = list;
    }

    public final void a() {
        g0.a(b.i(), "backup_event", u0.a(this.f8625a, this.f8627c, this.f8626b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<q> list = this.f8628d;
        if (list == null || list.size() == 0) {
            y.d("hmsSdk", "failed events is empty");
            return;
        }
        if (q0.a(b.i(), "cached_v2_1", b.k() * 1048576)) {
            y.e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.f8626b);
            return;
        }
        String a5 = u0.a(this.f8625a, this.f8627c);
        List<q> list2 = w.b(b.i(), "cached_v2_1", a5).get(a5);
        if (list2 != null && list2.size() != 0) {
            this.f8628d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<q> it = this.f8628d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().d());
            } catch (JSONException unused) {
                y.e("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > b.h() * 1048576) {
            y.e("hmsSdk", "this failed data is too long,can not writing it");
            this.f8628d = null;
            return;
        }
        y.d("hmsSdk", "data send failed, write to cache file...reqID:" + this.f8626b);
        g0.b(b.i(), "cached_v2_1", a5, jSONArray2);
        a();
    }
}
