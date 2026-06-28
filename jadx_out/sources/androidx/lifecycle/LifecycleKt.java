package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.m3;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/i;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/i;", "eventFlow", "lifecycle-common"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LifecycleKt {
    @l
    public static final LifecycleCoroutineScope getCoroutineScope(@l Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        l0.p(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, m3.c(null, 1, null).plus(k1.e().C0()));
        } while (!androidx.compose.animation.core.h.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    @l
    public static final kotlinx.coroutines.flow.i<Lifecycle.Event> getEventFlow(@l Lifecycle lifecycle) {
        l0.p(lifecycle, "<this>");
        return k.O0(k.s(new LifecycleKt$eventFlow$1(lifecycle, null)), k1.e().C0());
    }
}
