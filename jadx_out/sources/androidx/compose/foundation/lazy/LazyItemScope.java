package androidx.compose.foundation.lazy;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;
import p4.l;

@LazyScopeMarker
@Stable
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&J\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "animateItemPlacement", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "fillParentMaxHeight", "fraction", "", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyItemScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItemPlacement$default(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m6163boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
            }
            return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope, Modifier modifier, float f5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f5);
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope, Modifier modifier, float f5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f5);
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope, Modifier modifier, float f5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f5);
    }

    @l
    @ExperimentalFoundationApi
    Modifier animateItemPlacement(@l Modifier modifier, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec);

    @l
    Modifier fillParentMaxHeight(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5);

    @l
    Modifier fillParentMaxSize(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5);

    @l
    Modifier fillParentMaxWidth(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5);
}
