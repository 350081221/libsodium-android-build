package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private AtomicInteger f6614c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f6615d = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public AtomicInteger f6613b = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private AtomicInteger f6616e = new AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f6617f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        f fVar;
        if ((this.f6614c.get() != 0 || this.f6615d.get() != 0 || this.f6613b.get() != 0 || this.f6617f.get() != 0 || this.f6616e.get() != 0) && this.f6605a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            ControllerCenter controllerCenter = this.f6605a;
            int i5 = this.f6614c.get();
            int i6 = this.f6615d.get();
            int i7 = this.f6613b.get();
            int i8 = this.f6617f.get();
            int i9 = this.f6616e.get();
            fVar = f.a.f6622a;
            b bVar = new b("efs_core", "lf_st", fVar.f6618a.f6612c);
            bVar.put("create_cnt", Integer.valueOf(i5));
            bVar.put("cache_cnt", Integer.valueOf(i6));
            bVar.put("req_cnt", Integer.valueOf(i7));
            bVar.put("err_cnt", Integer.valueOf(i8));
            bVar.put("expire_cnt", Integer.valueOf(i9));
            this.f6614c.addAndGet(i5 * (-1));
            this.f6615d.addAndGet(i6 * (-1));
            this.f6613b.addAndGet(i7 * (-1));
            this.f6617f.addAndGet(i8 * (-1));
            this.f6616e.addAndGet(i9 * (-1));
            controllerCenter.send(bVar);
        }
    }

    public final void b() {
        this.f6614c.incrementAndGet();
    }

    public final void c() {
        this.f6615d.incrementAndGet();
    }

    public final void d() {
        this.f6616e.incrementAndGet();
    }

    public final void e() {
        this.f6617f.incrementAndGet();
    }
}
