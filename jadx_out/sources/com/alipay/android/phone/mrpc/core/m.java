package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class m extends FutureTask<u> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f2738b = lVar;
        this.f2737a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o a5 = this.f2737a.a();
        if (a5.f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || a5.h()) {
                a5.g();
                if (isCancelled() && isDone()) {
                    return;
                }
                cancel(false);
            }
        } catch (InterruptedException e5) {
            e5.toString();
        } catch (CancellationException unused) {
            a5.g();
        } catch (ExecutionException e6) {
            if (e6.getCause() == null || !(e6.getCause() instanceof HttpException)) {
                e6.toString();
                return;
            }
            HttpException httpException = (HttpException) e6.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
