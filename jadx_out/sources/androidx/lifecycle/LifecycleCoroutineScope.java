package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\t\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ8\u0010\f\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0010\u001a\u00020\r8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/s0;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/l2;", "launchWhenCreated", "(Lv3/p;)Lkotlinx/coroutines/l2;", "launchWhenStarted", "launchWhenResumed", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class LifecycleCoroutineScope implements s0 {
    @l
    public abstract Lifecycle getLifecycle$lifecycle_common();

    @l
    @k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final l2 launchWhenCreated(@l p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l2 f5;
        l0.p(block, "block");
        f5 = kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return f5;
    }

    @l
    @k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final l2 launchWhenResumed(@l p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l2 f5;
        l0.p(block, "block");
        f5 = kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return f5;
    }

    @l
    @k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final l2 launchWhenStarted(@l p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> block) {
        l2 f5;
        l0.p(block, "block");
        f5 = kotlinx.coroutines.k.f(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return f5;
    }
}
