package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected d f8430a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8431b;

    /* renamed from: c, reason: collision with root package name */
    private final c f8432c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8433d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f8434e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8435f;

    /* renamed from: g, reason: collision with root package name */
    private final GrsBaseInfo f8436g;

    /* renamed from: h, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.c f8437h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0166a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public a(String str, int i5, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.f8431b = str;
        this.f8432c = cVar;
        this.f8433d = i5;
        this.f8434e = context;
        this.f8435f = str2;
        this.f8436g = grsBaseInfo;
        this.f8437h = cVar2;
    }

    private String a(String str) {
        return Uri.parse(str).getPath();
    }

    private EnumC0166a h() {
        if (this.f8431b.isEmpty()) {
            return EnumC0166a.GRSDEFAULT;
        }
        String a5 = a(this.f8431b);
        return a5.contains("1.0") ? EnumC0166a.GRSGET : a5.contains("2.0") ? EnumC0166a.GRSPOST : EnumC0166a.GRSDEFAULT;
    }

    public Context a() {
        return this.f8434e;
    }

    public c b() {
        return this.f8432c;
    }

    public String c() {
        return this.f8431b;
    }

    public int d() {
        return this.f8433d;
    }

    public String e() {
        return this.f8435f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.f8437h;
    }

    public Callable<d> g() {
        if (EnumC0166a.GRSDEFAULT.equals(h())) {
            return null;
        }
        return EnumC0166a.GRSGET.equals(h()) ? new f(this.f8431b, this.f8433d, this.f8432c, this.f8434e, this.f8435f, this.f8436g) : new g(this.f8431b, this.f8433d, this.f8432c, this.f8434e, this.f8435f, this.f8436g, this.f8437h);
    }
}
