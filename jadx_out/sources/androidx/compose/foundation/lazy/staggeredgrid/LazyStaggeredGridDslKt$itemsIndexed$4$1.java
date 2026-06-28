package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$4$1\n*L\n1#1,463:1\n*E\n"})
/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$itemsIndexed$4$1 extends n0 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List<T> $items;
    final /* synthetic */ p<Integer, T, StaggeredGridItemSpan> $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridDslKt$itemsIndexed$4$1(p<? super Integer, ? super T, StaggeredGridItemSpan> pVar, List<? extends T> list) {
        super(1);
        this.$span = pVar;
        this.$items = list;
    }

    @p4.l
    public final StaggeredGridItemSpan invoke(int i5) {
        return this.$span.invoke(Integer.valueOf(i5), this.$items.get(i5));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
