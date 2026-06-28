package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"EmptyLazyStaggeredGridLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "itemIndex", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {

    @l
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        List E;
        MeasureResult measureResult = new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1

            @l
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final int width;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                Map<AlignmentLine, Integer> z4;
                z4 = a1.z();
                this.alignmentLines = z4;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @l
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
        E = w.E();
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(new int[0], new int[0], 0.0f, measureResult, false, false, false, 0, E, IntSize.Companion.m6219getZeroYbymL2g(), 0, 0, 0, 0, 0, null);
    }

    @m
    public static final LazyStaggeredGridItemInfo findVisibleItem(@l LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i5) {
        Object y22;
        Object m32;
        int w4;
        Object T2;
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        y22 = e0.y2(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo());
        int index = ((LazyStaggeredGridItemInfo) y22).getIndex();
        m32 = e0.m3(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo());
        boolean z4 = false;
        if (i5 <= ((LazyStaggeredGridItemInfo) m32).getIndex() && index <= i5) {
            z4 = true;
        }
        if (!z4) {
            return null;
        }
        w4 = w.w(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i5), 3, null);
        T2 = e0.T2(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), w4);
        return (LazyStaggeredGridItemInfo) T2;
    }

    @l
    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }
}
