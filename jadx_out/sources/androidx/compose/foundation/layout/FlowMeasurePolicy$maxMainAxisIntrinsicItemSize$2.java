package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2 extends n0 implements q<IntrinsicMeasurable, Integer, Integer, Integer> {
    public static final FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2 INSTANCE = new FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2();

    FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
        return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
    }

    @l
    public final Integer invoke(@l IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i6));
    }
}
