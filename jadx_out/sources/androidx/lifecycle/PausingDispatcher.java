package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.n0;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "isDispatchNeeded", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatch", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PausingDispatcher extends n0 {

    @l
    @u3.e
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.n0
    public void dispatch(@l kotlin.coroutines.g context, @l Runnable block) {
        l0.p(context, "context");
        l0.p(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // kotlinx.coroutines.n0
    public boolean isDispatchNeeded(@l kotlin.coroutines.g context) {
        l0.p(context, "context");
        if (k1.e().C0().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
