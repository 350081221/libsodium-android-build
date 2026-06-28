package androidx.compose.foundation.lazy.grid;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9\n*L\n1#1,563:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridDslKt$itemsIndexed$9 extends n0 implements l<Integer, Object> {
    final /* synthetic */ p<Integer, T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$9(p<? super Integer, ? super T, ? extends Object> pVar, T[] tArr) {
        super(1);
        this.$contentType = pVar;
        this.$items = tArr;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @m
    public final Object invoke(int i5) {
        return this.$contentType.invoke(Integer.valueOf(i5), this.$items[i5]);
    }
}
