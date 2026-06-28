package androidx.compose.foundation.lazy.grid;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8\n*L\n1#1,563:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$8 extends n0 implements p<LazyGridItemSpanScope, Integer, GridItemSpan> {
    final /* synthetic */ T[] $items;
    final /* synthetic */ q<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$8(q<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> qVar, T[] tArr) {
        super(2);
        this.$span = qVar;
        this.$items = tArr;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m670boximpl(m682invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m682invoke_orMbw(@l LazyGridItemSpanScope lazyGridItemSpanScope, int i5) {
        return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i5), this.$items[i5]).m677unboximpl();
    }
}
