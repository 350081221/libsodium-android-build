package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends h0 implements p<Integer, Integer, int[]> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    @l
    public final int[] invoke(int i5, int i6) {
        int[] fillNearestIndices;
        fillNearestIndices = ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i5, i6);
        return fillNearestIndices;
    }
}
