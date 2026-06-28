package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.i0;
import kotlin.r2;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/NoOpOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILv3/l;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "performFling", "Lkotlin/r2;", "applyToFling-BMRW4eQ", "(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "applyToFling", "", "isInProgress", "()Z", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "effectModifier", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;

    @p4.l
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    private NoOpOverscrollEffect() {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @p4.m
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo181applyToFlingBMRW4eQ(long j5, @p4.l v3.p<? super Velocity, ? super kotlin.coroutines.d<? super Velocity>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object invoke = pVar.invoke(Velocity.m6270boximpl(j5), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return invoke == l5 ? invoke : r2.f19517a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo182applyToScrollRhakbz0(long j5, int i5, @p4.l v3.l<? super Offset, Offset> lVar) {
        return lVar.invoke(Offset.m3482boximpl(j5)).m3503unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @p4.l
    public Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return false;
    }
}
