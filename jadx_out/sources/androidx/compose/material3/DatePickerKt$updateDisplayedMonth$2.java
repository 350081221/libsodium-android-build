package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DatePickerKt$updateDisplayedMonth$2 extends kotlin.jvm.internal.n0 implements v3.a<Integer> {
    final /* synthetic */ LazyListState $lazyListState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$updateDisplayedMonth$2(LazyListState lazyListState) {
        super(0);
        this.$lazyListState = lazyListState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Integer invoke() {
        return Integer.valueOf(this.$lazyListState.getFirstVisibleItemIndex());
    }
}
