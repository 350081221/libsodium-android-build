package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,503:1\n1#2:504\n154#3:505\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetState$anchoredDraggableState$1\n*L\n269#1:505\n*E\n"})
/* loaded from: classes.dex */
public final class SheetState$anchoredDraggableState$1 extends kotlin.jvm.internal.n0 implements v3.l<Float, Float> {
    final /* synthetic */ SheetState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$anchoredDraggableState$1(SheetState sheetState) {
        super(1);
        this.this$0 = sheetState;
    }

    @p4.l
    public final Float invoke(float f5) {
        Density requireDensity;
        requireDensity = this.this$0.requireDensity();
        return Float.valueOf(requireDensity.mo304toPx0680j_4(Dp.m6044constructorimpl(56)));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }
}
