package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0002\b\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR;\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "Lkotlin/r2;", "maybeRun", "cancel", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Landroidx/lifecycle/CoroutineLiveData;", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "block", "Lv3/p;", "", "timeoutInMs", "J", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/s0;", "Lkotlin/Function0;", "onDone", "Lv3/a;", "Lkotlinx/coroutines/l2;", "runningJob", "Lkotlinx/coroutines/l2;", "cancellationJob", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lv3/p;JLkotlinx/coroutines/s0;Lv3/a;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BlockRunner<T> {

    @l
    private final p<LiveDataScope<T>, kotlin.coroutines.d<? super r2>, Object> block;

    @m
    private l2 cancellationJob;

    @l
    private final CoroutineLiveData<T> liveData;

    @l
    private final v3.a<r2> onDone;

    @m
    private l2 runningJob;

    @l
    private final s0 scope;
    private final long timeoutInMs;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(@l CoroutineLiveData<T> liveData, @l p<? super LiveDataScope<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block, long j5, @l s0 scope, @l v3.a<r2> onDone) {
        l0.p(liveData, "liveData");
        l0.p(block, "block");
        l0.p(scope, "scope");
        l0.p(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j5;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        l2 f5;
        if (this.cancellationJob == null) {
            f5 = k.f(this.scope, k1.e().E0(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = f5;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @MainThread
    public final void maybeRun() {
        l2 f5;
        l2 l2Var = this.cancellationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        f5 = k.f(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
        this.runningJob = f5;
    }
}
