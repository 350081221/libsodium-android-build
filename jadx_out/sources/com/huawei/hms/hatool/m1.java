package com.huawei.hms.hatool;

import android.content.Context;

/* loaded from: classes3.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public k f8636a;

    /* renamed from: b, reason: collision with root package name */
    public k f8637b;

    /* renamed from: c, reason: collision with root package name */
    public Context f8638c;

    /* renamed from: d, reason: collision with root package name */
    public String f8639d;

    public m1(Context context) {
        if (context != null) {
            this.f8638c = context.getApplicationContext();
        }
        this.f8636a = new k();
        this.f8637b = new k();
    }

    public m1 a(int i5, String str) {
        k kVar;
        y.c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i5);
        if (!v0.b(str)) {
            str = "";
        }
        if (i5 == 0) {
            kVar = this.f8636a;
        } else {
            if (i5 != 1) {
                y.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
                return this;
            }
            kVar = this.f8637b;
        }
        kVar.b(str);
        return this;
    }

    public m1 a(String str) {
        y.c("hmsSdk", "Builder.setAppID is execute");
        this.f8639d = str;
        return this;
    }

    @Deprecated
    public m1 a(boolean z4) {
        y.c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f8636a.j().a(z4);
        this.f8637b.j().a(z4);
        return this;
    }

    public void a() {
        if (this.f8638c == null) {
            y.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        y.c("hmsSdk", "Builder.create() is execute.");
        j1 j1Var = new j1("_hms_config_tag");
        j1Var.b(new k(this.f8636a));
        j1Var.a(new k(this.f8637b));
        h1.a().a(this.f8638c);
        i1.a().a(this.f8638c);
        o1.c().a(j1Var);
        h1.a().a(this.f8639d);
    }

    @Deprecated
    public m1 b(boolean z4) {
        y.c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f8636a.j().b(z4);
        this.f8637b.j().b(z4);
        return this;
    }

    @Deprecated
    public m1 c(boolean z4) {
        y.c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f8636a.j().c(z4);
        this.f8637b.j().c(z4);
        return this;
    }
}
