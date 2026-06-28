package androidx.compose.foundation.pager;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerStateImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PagerStateKt$rememberPagerState$1$1 extends n0 implements v3.a<PagerStateImpl> {
    final /* synthetic */ int $initialPage;
    final /* synthetic */ float $initialPageOffsetFraction;
    final /* synthetic */ v3.a<Integer> $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$1$1(int i5, float f5, v3.a<Integer> aVar) {
        super(0);
        this.$initialPage = i5;
        this.$initialPageOffsetFraction = f5;
        this.$pageCount = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final PagerStateImpl invoke() {
        return new PagerStateImpl(this.$initialPage, this.$initialPageOffsetFraction, this.$pageCount);
    }
}
