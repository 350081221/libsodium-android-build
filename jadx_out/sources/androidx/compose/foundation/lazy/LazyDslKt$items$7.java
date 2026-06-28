package androidx.compose.foundation.lazy;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,426:1\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt$items$7 extends n0 implements l<Integer, Object> {
    final /* synthetic */ l<T, Object> $contentType;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$7(l<? super T, ? extends Object> lVar, T[] tArr) {
        super(1);
        this.$contentType = lVar;
        this.$items = tArr;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @m
    public final Object invoke(int i5) {
        return this.$contentType.invoke(this.$items[i5]);
    }
}
