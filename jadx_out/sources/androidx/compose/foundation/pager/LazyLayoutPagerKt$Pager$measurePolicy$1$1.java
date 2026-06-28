package androidx.compose.foundation.pager;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutPagerKt$Pager$measurePolicy$1$1 extends n0 implements v3.a<Integer> {
    final /* synthetic */ PagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$measurePolicy$1$1(PagerState pagerState) {
        super(0);
        this.$state = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Integer invoke() {
        return Integer.valueOf(this.$state.getPageCount());
    }
}
