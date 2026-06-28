package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyStaggeredGridIntervalContent$item$3$1 extends n0 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ StaggeredGridItemSpan $span;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridIntervalContent$item$3$1(StaggeredGridItemSpan staggeredGridItemSpan) {
        super(1);
        this.$span = staggeredGridItemSpan;
    }

    @p4.l
    public final StaggeredGridItemSpan invoke(int i5) {
        return this.$span;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
