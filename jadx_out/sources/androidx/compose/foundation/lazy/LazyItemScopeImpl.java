package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "width", "height", "Lkotlin/r2;", "setMaxSize", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "animateItemPlacement", "Landroidx/compose/runtime/MutableIntState;", "maxWidthState", "Landroidx/compose/runtime/MutableIntState;", "maxHeightState", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyItemScopeImpl implements LazyItemScope {
    public static final int $stable = 0;

    @l
    private MutableIntState maxWidthState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @l
    private MutableIntState maxHeightState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @l
    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(@l Modifier modifier, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return LazyItemScopeImplKt.animateItem(modifier, null, finiteAnimationSpec);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier fillParentMaxHeight(@l Modifier modifier, float f5) {
        return modifier.then(new ParentSizeElement(f5, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier fillParentMaxSize(@l Modifier modifier, float f5) {
        return modifier.then(new ParentSizeElement(f5, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier fillParentMaxWidth(@l Modifier modifier, float f5) {
        return modifier.then(new ParentSizeElement(f5, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    public final void setMaxSize(int i5, int i6) {
        this.maxWidthState.setIntValue(i5);
        this.maxHeightState.setIntValue(i6);
    }
}
