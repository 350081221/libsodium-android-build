package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.r;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1 extends n0 implements v3.a<PagerLayoutIntervalContent> {
    final /* synthetic */ State<r<PagerScope, Integer, Composer, Integer, r2>> $latestContent;
    final /* synthetic */ State<l<Integer, Object>> $latestKey;
    final /* synthetic */ v3.a<Integer> $pageCount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(State<? extends r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2>> state, State<? extends l<? super Integer, ? extends Object>> state2, v3.a<Integer> aVar) {
        super(0);
        this.$latestContent = state;
        this.$latestKey = state2;
        this.$pageCount = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final PagerLayoutIntervalContent invoke() {
        return new PagerLayoutIntervalContent(this.$latestContent.getValue(), this.$latestKey.getValue(), this.$pageCount.invoke().intValue());
    }
}
