package com.bytedance.pangle.a;

import com.bytedance.pangle.d.e;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final CountDownLatch f4252a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f4253b;

    /* renamed from: com.bytedance.pangle.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0115a {
        void a();
    }

    private a(InterfaceC0115a[] interfaceC0115aArr) {
        this.f4252a = new CountDownLatch(interfaceC0115aArr.length);
        for (final InterfaceC0115a interfaceC0115a : interfaceC0115aArr) {
            e.a(new Runnable() { // from class: com.bytedance.pangle.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC0115a.a();
                    } catch (Throwable th) {
                        a.this.f4253b = th;
                    }
                    a.this.f4252a.countDown();
                }
            });
        }
    }

    public static void a(InterfaceC0115a... interfaceC0115aArr) {
        a aVar = new a(interfaceC0115aArr);
        try {
            aVar.f4252a.await();
            Throwable th = aVar.f4253b;
            if (th == null) {
            } else {
                throw th;
            }
        } catch (InterruptedException e5) {
            throw new RuntimeException(e5);
        }
    }
}
