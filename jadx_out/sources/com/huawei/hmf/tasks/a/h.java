package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hmf.tasks.i<TResult> f8068a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f8069b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8070c = new Object();

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f8071a;

        a(Task task) {
            this.f8071a = task;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (h.this.f8070c) {
                if (h.this.f8068a != null) {
                    h.this.f8068a.onSuccess(this.f8071a.r());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Executor executor, com.huawei.hmf.tasks.i<TResult> iVar) {
        this.f8068a = iVar;
        this.f8069b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f8070c) {
            this.f8068a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.e
    public final void onComplete(Task<TResult> task) {
        if (!task.v() || task.t()) {
            return;
        }
        this.f8069b.execute(new a(task));
    }
}
