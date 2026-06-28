package com.huawei.hmf.tasks;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hmf.tasks.a.c f8100a = new com.huawei.hmf.tasks.a.c();

    public void a() {
        com.huawei.hmf.tasks.a.c cVar = this.f8100a;
        if (cVar.f8049c) {
            return;
        }
        synchronized (cVar.f8048b) {
            cVar.f8049c = true;
            Iterator<Runnable> it = cVar.f8047a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public b b() {
        return this.f8100a;
    }
}
