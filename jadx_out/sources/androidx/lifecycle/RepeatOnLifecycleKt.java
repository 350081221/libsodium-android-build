package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\n\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {
    @m
    public static final Object repeatOnLifecycle(@l Lifecycle lifecycle, @l Lifecycle.State state, @l p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return r2.f19517a;
            }
            Object g5 = t0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            return g5 == l5 ? g5 : r2.f19517a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @m
    public static final Object repeatOnLifecycle(@l LifecycleOwner lifecycleOwner, @l Lifecycle.State state, @l p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, pVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return repeatOnLifecycle == l5 ? repeatOnLifecycle : r2.f19517a;
    }
}
