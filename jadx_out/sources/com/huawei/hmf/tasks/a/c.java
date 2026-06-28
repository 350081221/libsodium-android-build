package com.huawei.hmf.tasks.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends com.huawei.hmf.tasks.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<Runnable> f8047a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f8048b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8049c = false;

    @Override // com.huawei.hmf.tasks.b
    public final boolean a() {
        return this.f8049c;
    }

    @Override // com.huawei.hmf.tasks.b
    public final com.huawei.hmf.tasks.b b(Runnable runnable) {
        synchronized (this.f8048b) {
            if (this.f8049c) {
                runnable.run();
            } else {
                this.f8047a.add(runnable);
            }
        }
        return this;
    }
}
