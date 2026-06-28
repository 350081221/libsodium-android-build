package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.Future;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/l;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/r2;", "j", "", "toString", "Ljava/util/concurrent/Future;", bi.ay, "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Future<?> f20426a;

    public l(@p4.l Future<?> future) {
        this.f20426a = future;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        j(th);
        return kotlin.r2.f19517a;
    }

    @Override // kotlinx.coroutines.o
    public void j(@p4.m Throwable th) {
        if (th != null) {
            this.f20426a.cancel(false);
        }
    }

    @p4.l
    public String toString() {
        return "CancelFutureOnCancel[" + this.f20426a + ']';
    }
}
