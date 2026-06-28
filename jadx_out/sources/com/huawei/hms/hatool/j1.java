package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public String f8584a;

    /* renamed from: b, reason: collision with root package name */
    public m f8585b;

    public j1(String str) {
        this.f8584a = str;
        this.f8585b = new m(str);
        i.c().a(this.f8584a, this.f8585b);
    }

    public void a(int i5) {
        y.d("hmsSdk", "onReport. TAG: " + this.f8584a + ", TYPE: " + i5);
        i1.a().a(this.f8584a, i5);
    }

    public void a(int i5, String str, LinkedHashMap<String, String> linkedHashMap) {
        y.d("hmsSdk", "onEvent. TAG: " + this.f8584a + ", TYPE: " + i5 + ", eventId : " + str);
        if (s0.a(str) || !c(i5)) {
            y.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f8584a + ", TYPE: " + i5);
            return;
        }
        if (!s0.a(linkedHashMap)) {
            y.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f8584a + ", TYPE: " + i5);
            linkedHashMap = null;
        }
        i1.a().a(this.f8584a, i5, str, linkedHashMap);
    }

    public void a(Context context, String str, String str2) {
        y.d("hmsSdk", "onEvent(context). TAG: " + this.f8584a + ", eventId : " + str);
        if (context == null) {
            y.e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (s0.a(str) || !c(0)) {
            y.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f8584a);
            return;
        }
        if (!s0.a(t0.b.f22420d, str2, 65536)) {
            y.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f8584a);
            str2 = "";
        }
        i1.a().a(this.f8584a, context, str, str2);
    }

    public void a(k kVar) {
        y.c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f8584a);
        if (kVar != null) {
            this.f8585b.a(kVar);
        } else {
            y.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f8585b.a((k) null);
        }
    }

    public final k b(int i5) {
        if (i5 == 0) {
            return this.f8585b.c();
        }
        if (i5 == 1) {
            return this.f8585b.b();
        }
        if (i5 == 2) {
            return this.f8585b.d();
        }
        if (i5 != 3) {
            return null;
        }
        return this.f8585b.a();
    }

    public void b(k kVar) {
        y.c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f8584a);
        if (kVar != null) {
            this.f8585b.b(kVar);
        } else {
            this.f8585b.b(null);
            y.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    public final boolean c(int i5) {
        String str;
        if (i5 != 2) {
            k b5 = b(i5);
            if (b5 != null && !TextUtils.isEmpty(b5.h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i5;
        } else {
            if ("_default_config_tag".equals(this.f8584a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        y.e("hmsSdk", str);
        return false;
    }
}
