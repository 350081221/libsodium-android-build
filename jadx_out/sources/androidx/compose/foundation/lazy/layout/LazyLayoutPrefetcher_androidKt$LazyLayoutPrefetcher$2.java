package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;
    final /* synthetic */ SubcomposeLayoutState $subcomposeLayoutState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, int i5) {
        super(2);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$subcomposeLayoutState = subcomposeLayoutState;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.$prefetchState, this.$itemContentFactory, this.$subcomposeLayoutState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
