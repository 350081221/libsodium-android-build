package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.Executor;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/j1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "execute", "", "toString", "Lkotlinx/coroutines/n0;", bi.ay, "Lkotlinx/coroutines/n0;", "dispatcher", "<init>", "(Lkotlinx/coroutines/n0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class j1 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final n0 f20415a;

    public j1(@p4.l n0 n0Var) {
        this.f20415a = n0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@p4.l Runnable runnable) {
        n0 n0Var = this.f20415a;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.INSTANCE;
        if (n0Var.isDispatchNeeded(iVar)) {
            this.f20415a.dispatch(iVar, runnable);
        } else {
            runnable.run();
        }
    }

    @p4.l
    public String toString() {
        return this.f20415a.toString();
    }
}
