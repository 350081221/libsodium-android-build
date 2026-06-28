package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class f<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hmf.tasks.h f8061a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f8062b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8063c = new Object();

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f8064a;

        a(Task task) {
            this.f8064a = task;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this.f8063c) {
                if (f.this.f8061a != null) {
                    f.this.f8061a.onFailure(this.f8064a.q());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Executor executor, com.huawei.hmf.tasks.h hVar) {
        this.f8061a = hVar;
        this.f8062b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f8063c) {
            this.f8061a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.e
    public final void onComplete(Task<TResult> task) {
        if (task.v() || task.t()) {
            return;
        }
        this.f8062b.execute(new a(task));
    }
}
