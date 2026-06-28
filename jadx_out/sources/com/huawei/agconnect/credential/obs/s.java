package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private Boolean f7950a;

    /* renamed from: b, reason: collision with root package name */
    private String f7951b;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = "backup")
    String backUrl;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = TTAdSdk.S_C)
    String mainUrl;

    @SharedPreference(fileName = "agc_site", isDynamic = true, key = "validTime")
    long validTime;

    private s() {
        this.validTime = 0L;
        this.f7950a = Boolean.FALSE;
        this.f7951b = null;
    }

    public s(String str, String str2) {
        this.validTime = 0L;
        this.f7950a = Boolean.FALSE;
        this.f7951b = null;
        this.mainUrl = str;
        this.backUrl = str2;
        if (TextUtils.isEmpty(str)) {
            this.f7950a = Boolean.TRUE;
        }
    }

    private int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static void a(String str, long j5) {
        s sVar = new s();
        sVar.validTime = j5;
        t.a().c(sVar, str);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static s b(String str) {
        s sVar = new s();
        t.a().d(sVar, str);
        t.a().e(sVar, str);
        t.a().f(sVar, str);
        return sVar;
    }

    public static void c(String str) {
        t.a().a(str);
        t.a().b(str);
    }

    public String a() {
        return this.mainUrl;
    }

    public void a(Boolean bool) {
        this.f7950a = bool;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(this.mainUrl)) {
            t.a().a(this, str);
        }
        if (TextUtils.isEmpty(this.backUrl)) {
            return;
        }
        t.a().b(this, str);
    }

    public void a(String str, boolean z4) {
        this.f7951b = str;
        this.f7950a = Boolean.valueOf(z4);
    }

    public String b() {
        return this.backUrl;
    }

    public String c() {
        return this.f7950a.booleanValue() ? this.backUrl : this.mainUrl;
    }

    public Boolean d() {
        return this.f7950a;
    }

    public String e() {
        return this.f7951b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return a(this.mainUrl, sVar.mainUrl) && a(this.backUrl, sVar.backUrl);
    }

    public long f() {
        return this.validTime;
    }

    public boolean g() {
        return (TextUtils.isEmpty(this.mainUrl) && TextUtils.isEmpty(this.backUrl)) ? false : true;
    }

    public int hashCode() {
        return a(this.mainUrl, this.backUrl);
    }
}
