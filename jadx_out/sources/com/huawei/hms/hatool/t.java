package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public List<q> f8677a;

    /* renamed from: b, reason: collision with root package name */
    public String f8678b;

    /* renamed from: c, reason: collision with root package name */
    public String f8679c;

    /* renamed from: d, reason: collision with root package name */
    public String f8680d;

    public t(List<q> list, String str, String str2, String str3) {
        this.f8677a = list;
        this.f8678b = str;
        this.f8679c = str2;
        this.f8680d = str3;
    }

    public void a() {
        if (!"_default_config_tag".equals(this.f8679c)) {
            a(this.f8677a, this.f8679c, this.f8678b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (q qVar : this.f8677a) {
            String c5 = qVar.c();
            if (TextUtils.isEmpty(c5) || "oper".equals(c5)) {
                arrayList4.add(qVar);
            } else if ("maint".equals(c5)) {
                arrayList.add(qVar);
            } else if ("preins".equals(c5)) {
                arrayList2.add(qVar);
            } else if ("diffprivacy".equals(c5)) {
                arrayList3.add(qVar);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }

    public final void a(List<q> list, String str, String str2) {
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = i5 * 500;
            List<q> subList = list.subList(i6, Math.min(list.size(), i6 + 500));
            String replace = UUID.randomUUID().toString().replace("-", "");
            long currentTimeMillis = System.currentTimeMillis();
            long b5 = c.b(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (q qVar : subList) {
                if (!q0.a(qVar.b(), currentTimeMillis, b5)) {
                    arrayList.add(qVar);
                }
            }
            if (arrayList.size() > 0) {
                new u(str2, str, this.f8680d, arrayList, replace).a();
            } else {
                y.e("hmsSdk", "No data to report handler");
            }
        }
    }
}
