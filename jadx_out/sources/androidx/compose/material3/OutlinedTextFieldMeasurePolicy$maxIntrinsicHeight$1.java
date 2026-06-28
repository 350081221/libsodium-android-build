package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1 extends kotlin.jvm.internal.n0 implements v3.p<IntrinsicMeasurable, Integer, Integer> {
    public static final OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1();

    OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
        return invoke(intrinsicMeasurable, num.intValue());
    }

    @p4.l
    public final Integer invoke(@p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i5));
    }
}
