package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/w$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n167#2:472\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1 extends n0 implements l<LazyStaggeredGridLaneInfo.SpannedItem, Integer> {
    final /* synthetic */ Comparable $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(Comparable comparable) {
        super(1);
        this.$key = comparable;
    }

    @Override // v3.l
    @p4.l
    public final Integer invoke(LazyStaggeredGridLaneInfo.SpannedItem spannedItem) {
        int l5;
        l5 = g.l(Integer.valueOf(spannedItem.getIndex()), this.$key);
        return Integer.valueOf(l5);
    }
}
