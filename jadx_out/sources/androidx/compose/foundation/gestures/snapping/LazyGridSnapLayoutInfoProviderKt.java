package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    @l
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@l final LazyGridState lazyGridState, @l final SnapPositionInLayout snapPositionInLayout) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final LazyGridLayoutInfo getLayoutInfo() {
                return LazyGridState.this.getLayoutInfo();
            }

            private final List<LazyGridItemInfo> singleAxisItems() {
                List<LazyGridItemInfo> visibleItemsInfo = LazyGridState.this.getLayoutInfo().getVisibleItemsInfo();
                LazyGridState lazyGridState2 = LazyGridState.this;
                ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                for (int i5 = 0; i5 < size; i5++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i5);
                    LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    boolean z4 = true;
                    if (lazyGridState2.getLayoutInfo().getOrientation() != Orientation.Horizontal ? lazyGridItemInfo2.getColumn() != 0 : lazyGridItemInfo2.getRow() != 0) {
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(lazyGridItemInfo);
                    }
                }
                return arrayList;
            }

            public final float averageItemSize() {
                int i5;
                List<LazyGridItemInfo> singleAxisItems = singleAxisItems();
                if (!singleAxisItems.isEmpty()) {
                    int i6 = 0;
                    if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
                        int size = singleAxisItems.size();
                        i5 = 0;
                        while (i6 < size) {
                            i5 += IntSize.m6213getHeightimpl(singleAxisItems.get(i6).mo688getSizeYbymL2g());
                            i6++;
                        }
                    } else {
                        int size2 = singleAxisItems.size();
                        i5 = 0;
                        while (i6 < size2) {
                            i5 += IntSize.m6214getWidthimpl(singleAxisItems.get(i6).mo688getSizeYbymL2g());
                            i6++;
                        }
                    }
                    return i5 / singleAxisItems.size();
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f5) {
                float t5;
                boolean z4;
                t5 = u.t((((float) Math.floor(Math.abs(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(LazyGridState.this.getDensity$foundation_release()), 0.0f, f5))) / averageItemSize())) * averageItemSize()) - averageItemSize(), 0.0f);
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
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout2 = snapPositionInLayout;
                int size = visibleItemsInfo.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                for (int i5 = 0; i5 < size; i5++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i5);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout2);
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f6) {
                        f6 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f7) {
                        f7 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m428calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(LazyGridState.this.getDensity$foundation_release(), f5), f6, f7);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPositionInLayout snapPositionInLayout, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.Companion.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    public static final int getSingleAxisViewportSize(@l LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m6213getHeightimpl(lazyGridLayoutInfo.mo690getViewportSizeYbymL2g());
        }
        return IntSize.m6214getWidthimpl(lazyGridLayoutInfo.mo690getViewportSizeYbymL2g());
    }

    public static final int offsetOnMainAxis(@l LazyGridItemInfo lazyGridItemInfo, @l Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntOffset.m6173getYimpl(lazyGridItemInfo.mo687getOffsetnOccac());
        }
        return IntOffset.m6172getXimpl(lazyGridItemInfo.mo687getOffsetnOccac());
    }

    public static final int sizeOnMainAxis(@l LazyGridItemInfo lazyGridItemInfo, @l Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntSize.m6213getHeightimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
        }
        return IntSize.m6214getWidthimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
    }
}
