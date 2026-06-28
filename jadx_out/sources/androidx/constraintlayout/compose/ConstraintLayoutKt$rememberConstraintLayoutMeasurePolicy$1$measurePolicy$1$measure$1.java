package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
final class ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ Measurer $measurer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1(Measurer measurer, List<? extends Measurable> list) {
        super(1);
        this.$measurer = measurer;
        this.$measurables = list;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope layout) {
        l0.p(layout, "$this$layout");
        this.$measurer.performLayout(layout, this.$measurables);
    }
}
