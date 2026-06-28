package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends n0 implements l<LazyGridSpanLayoutProvider.Bucket, Integer> {
    final /* synthetic */ int $itemIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i5) {
        super(1);
        this.$itemIndex = i5;
    }

    @Override // v3.l
    @p4.l
    public final Integer invoke(@p4.l LazyGridSpanLayoutProvider.Bucket bucket) {
        return Integer.valueOf(bucket.getFirstItemIndex() - this.$itemIndex);
    }
}
