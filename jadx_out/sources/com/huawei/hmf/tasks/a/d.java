package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.hmf.tasks.g<TResult> f8050a;

    /* renamed from: b, reason: collision with root package name */
    Executor f8051b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8052c = new Object();

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f8053a;

        a(Task task) {
            this.f8053a = task;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d.this.f8052c) {
                if (d.this.f8050a != null) {
                    d.this.f8050a.onComplete(this.f8053a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Executor executor, com.huawei.hmf.tasks.g<TResult> gVar) {
        this.f8050a = gVar;
        this.f8051b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f8052c) {
            this.f8050a = null;
        }
    }

    @Override // com.huawei.hmf.tasks.e
    public final void onComplete(Task<TResult> task) {
        this.f8051b.execute(new a(task));
    }
}
