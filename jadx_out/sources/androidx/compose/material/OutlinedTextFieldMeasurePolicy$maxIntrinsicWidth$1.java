package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "intrinsicMeasurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", bi.aJ, "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1 extends n0 implements p<IntrinsicMeasurable, Integer, Integer> {
    public static final OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1 INSTANCE = new OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1();

    OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
        return invoke(intrinsicMeasurable, num.intValue());
    }

    @l
    public final Integer invoke(@l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i5));
    }
}
