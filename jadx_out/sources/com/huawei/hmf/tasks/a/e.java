package com.huawei.hmf.tasks.a;

import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class e<TResult> implements com.huawei.hmf.tasks.f, com.huawei.hmf.tasks.h, com.huawei.hmf.tasks.i<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8055a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f8056b;

    /* renamed from: c, reason: collision with root package name */
    private final i<Void> f8057c;

    /* renamed from: d, reason: collision with root package name */
    private int f8058d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f8059e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8060f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i5, i<Void> iVar) {
        this.f8056b = i5;
        this.f8057c = iVar;
    }

    private void b() {
        if (this.f8058d >= this.f8056b) {
            if (this.f8059e != null) {
                this.f8057c.z(new ExecutionException("a task failed", this.f8059e));
            } else if (this.f8060f) {
                this.f8057c.B();
            } else {
                this.f8057c.A(null);
            }
        }
    }

    @Override // com.huawei.hmf.tasks.f
    public final void a() {
        synchronized (this.f8055a) {
            this.f8058d++;
            this.f8060f = true;
            b();
        }
    }

    @Override // com.huawei.hmf.tasks.h
    public final void onFailure(Exception exc) {
        synchronized (this.f8055a) {
            this.f8058d++;
            this.f8059e = exc;
            b();
        }
    }

    @Override // com.huawei.hmf.tasks.i
    public final void onSuccess(TResult tresult) {
        synchronized (this.f8055a) {
            this.f8058d++;
            b();
        }
    }
}
