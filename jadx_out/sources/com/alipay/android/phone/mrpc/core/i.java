package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* loaded from: classes2.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa f2720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2721b;

    public i(h hVar, aa aaVar) {
        this.f2721b = hVar;
        this.f2720a = aaVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final String a() {
        return this.f2720a.a();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final ab b() {
        Context context;
        context = this.f2721b.f2719a;
        return l.a(context.getApplicationContext());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final aa c() {
        return this.f2720a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final boolean d() {
        return this.f2720a.c();
    }
}
