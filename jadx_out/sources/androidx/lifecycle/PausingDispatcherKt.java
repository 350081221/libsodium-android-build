package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\u000b\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\t\u001aC\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\f\u0010\u000b\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\t\u001aC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\r\u0010\u000b\u001aK\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "whenCreated", "(Landroidx/lifecycle/LifecycleOwner;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "whenStarted", "whenResumed", "Landroidx/lifecycle/Lifecycle$State;", "minState", "whenStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PausingDispatcherKt {
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenCreated(@l LifecycleOwner lifecycleOwner, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenResumed(@l LifecycleOwner lifecycleOwner, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenStarted(@l LifecycleOwner lifecycleOwner, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, dVar);
    }

    @k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenStateAtLeast(@l Lifecycle lifecycle, @l Lifecycle.State state, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return kotlinx.coroutines.i.h(k1.e().E0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, null), dVar);
    }

    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenCreated(@l Lifecycle lifecycle, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, dVar);
    }

    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenResumed(@l Lifecycle lifecycle, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, dVar);
    }

    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @m
    public static final <T> Object whenStarted(@l Lifecycle lifecycle, @l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, dVar);
    }
}
