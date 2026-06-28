package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.i0;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"calculateCellsCrossAxisSizeImpl", "", "gridSize", "", "slotCount", "spacing", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i5, int i6, int i7) {
        int i8;
        int i9 = i5 - (i7 * (i6 - 1));
        int i10 = i9 / i6;
        int i11 = i9 % i6;
        int[] iArr = new int[i6];
        for (int i12 = 0; i12 < i6; i12++) {
            if (i12 < i11) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            iArr[i12] = i8 + i10;
        }
        return iArr;
    }
}
