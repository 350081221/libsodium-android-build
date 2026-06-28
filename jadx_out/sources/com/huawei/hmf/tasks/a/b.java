package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hmf.tasks.f f8043a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f8044b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8045c = new Object();

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this.f8045c) {
                if (b.this.f8043a != null) {
                    b.this.f8043a.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Executor executor, com.huawei.hmf.tasks.f fVar) {
        this.f8043a = fVar;
        this.f8044b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f8045c) {
            this.f8043a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.e
    public final void onComplete(Task<TResult> task) {
        if (task.t()) {
            this.f8044b.execute(new a());
        }
    }
}
