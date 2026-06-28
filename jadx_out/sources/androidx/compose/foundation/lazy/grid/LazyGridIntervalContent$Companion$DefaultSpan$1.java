package androidx.compose.foundation.lazy.grid;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridIntervalContent$Companion$DefaultSpan$1 extends n0 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
    public static final LazyGridIntervalContent$Companion$DefaultSpan$1 INSTANCE = new LazyGridIntervalContent$Companion$DefaultSpan$1();

    LazyGridIntervalContent$Companion$DefaultSpan$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m670boximpl(m685invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m685invoke_orMbw(@l LazyGridItemSpanScope lazyGridItemSpanScope, int i5) {
        return LazyGridSpanKt.GridItemSpan(1);
    }
}
