package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetState$anchoredDraggableState$1 extends n0 implements l<Float, Float> {
    final /* synthetic */ BottomSheetState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState$anchoredDraggableState$1(BottomSheetState bottomSheetState) {
        super(1);
        this.this$0 = bottomSheetState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }

    @p4.l
    public final Float invoke(float f5) {
        Density requireDensity;
        float f6;
        requireDensity = this.this$0.requireDensity();
        f6 = BottomSheetScaffoldKt.BottomSheetScaffoldPositionalThreshold;
        return Float.valueOf(requireDensity.mo304toPx0680j_4(f6));
    }
}
