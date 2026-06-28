package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.Future;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/n1;", "Lkotlin/r2;", "dispose", "", "toString", "Ljava/util/concurrent/Future;", bi.ay, "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class m1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Future<?> f20431a;

    public m1(@p4.l Future<?> future) {
        this.f20431a = future;
    }

    @Override // kotlinx.coroutines.n1
    public void dispose() {
        this.f20431a.cancel(false);
    }

    @p4.l
    public String toString() {
        return "DisposableFutureHandle[" + this.f20431a + ']';
    }
}
