package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,155:1\n36#2:156\n1116#3,6:157\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n127#1:156\n127#1:157,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    @l
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@l final LazyListState lazyListState, @l final SnapPositionInLayout snapPositionInLayout) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final LazyListLayoutInfo getLayoutInfo() {
                return LazyListState.this.getLayoutInfo();
            }

            public final float averageItemSize() {
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        i5 += visibleItemsInfo.get(i6).getSize();
                    }
                    return i5 / layoutInfo.getVisibleItemsInfo().size();
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f5) {
                float t5;
                boolean z4;
                t5 = u.t((((float) Math.floor(Math.abs(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(LazyListState.this.getDensity$foundation_release()), 0.0f, f5))) / averageItemSize())) * averageItemSize()) - averageItemSize(), 0.0f);
                if (t5 == 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    return t5 * Math.signum(f5);
                }
                return t5;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float f5) {
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout2 = snapPositionInLayout;
                int size = visibleItemsInfo.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                for (int i5 = 0; i5 < size; i5++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i5);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPositionInLayout2);
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f6) {
                        f6 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f7) {
                        f7 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m428calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(LazyListState.this.getDensity$foundation_release(), f5), f6, f7);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPositionInLayout snapPositionInLayout, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.Companion.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyListState, snapPositionInLayout);
    }

    public static final int calculateFinalSnappingItem(@l Density density, float f5) {
        if (Math.abs(f5) < density.mo304toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp())) {
            return FinalSnappingItem.Companion.m425getClosestItembbeMdSM();
        }
        if (f5 > 0.0f) {
            return FinalSnappingItem.Companion.m426getNextItembbeMdSM();
        }
        return FinalSnappingItem.Companion.m427getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(@l LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m6213getHeightimpl(lazyListLayoutInfo.mo660getViewportSizeYbymL2g()) : IntSize.m6214getWidthimpl(lazyListLayoutInfo.mo660getViewportSizeYbymL2g());
    }

    @l
    @Composable
    @ExperimentalFoundationApi
    public static final FlingBehavior rememberSnapFlingBehavior(@l LazyListState lazyListState, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i5, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:125)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyListState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSnapFlingBehavior;
    }
}
