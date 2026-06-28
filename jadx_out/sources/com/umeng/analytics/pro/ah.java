package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ah {

    /* renamed from: a, reason: collision with root package name */
    private String f12128a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<ai> f12129b = new ArrayList<>();

    public ah(String str) {
        this.f12128a = "";
        this.f12128a = str;
        if (!TextUtils.isEmpty(str)) {
            a();
        }
    }

    private void a() {
        try {
            if (this.f12128a.contains(",")) {
                for (String str : this.f12128a.split(",")) {
                    if (!TextUtils.isEmpty(str)) {
                        String trim = str.trim();
                        if (this.f12129b != null) {
                            this.f12129b.add(new ai(trim));
                        }
                    }
                }
                return;
            }
            String str2 = this.f12128a;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String trim2 = str2.trim();
            if (this.f12129b != null) {
                this.f12129b.add(new ai(trim2));
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i5) {
        try {
            ArrayList<ai> arrayList = this.f12129b;
            if (arrayList == null) {
                return false;
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ai aiVar = this.f12129b.get(i6);
                if (aiVar != null && aiVar.a(i5)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
