package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import p4.l;
import p4.m;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/future/a;", "T", "Lkotlinx/coroutines/a;", "Ljava/util/function/BiFunction;", "", "Lkotlin/r2;", t0.b.f22420d, "exception", "x1", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", com.alipay.sdk.m.x.c.f3016c, "(Ljava/lang/Object;)V", "cause", "", "handled", "u1", "Ljava/util/concurrent/CompletableFuture;", "d", "Ljava/util/concurrent/CompletableFuture;", "future", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlin/coroutines/g;Ljava/util/concurrent/CompletableFuture;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class a<T> extends kotlinx.coroutines.a<T> implements BiFunction<T, Throwable, r2> {

    /* renamed from: d, reason: collision with root package name */
    @l
    private final CompletableFuture<T> f20285d;

    public a(@l g gVar, @l CompletableFuture<T> completableFuture) {
        super(gVar, true, true);
        this.f20285d = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ r2 apply(Object obj, Throwable th) {
        x1(obj, th);
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.a
    protected void u1(@l Throwable th, boolean z4) {
        this.f20285d.completeExceptionally(th);
    }

    @Override // kotlinx.coroutines.a
    protected void v1(T t5) {
        this.f20285d.complete(t5);
    }

    public void x1(@m T t5, @m Throwable th) {
        l2.a.b(this, null, 1, null);
    }
}
