package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,310:1\n13644#2,3:311\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n*L\n171#1:311,3\n*E\n"})
/* loaded from: classes.dex */
final class BoxMeasurePolicy$measure$5 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ k1.f $boxHeight;
    final /* synthetic */ k1.f $boxWidth;
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ BoxMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxMeasurePolicy$measure$5(Placeable[] placeableArr, List<? extends Measurable> list, MeasureScope measureScope, k1.f fVar, k1.f fVar2, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.$placeables = placeableArr;
        this.$measurables = list;
        this.$this_measure = measureScope;
        this.$boxWidth = fVar;
        this.$boxHeight = fVar2;
        this.this$0 = boxMeasurePolicy;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Alignment alignment;
        Placeable[] placeableArr = this.$placeables;
        List<Measurable> list = this.$measurables;
        MeasureScope measureScope = this.$this_measure;
        k1.f fVar = this.$boxWidth;
        k1.f fVar2 = this.$boxHeight;
        BoxMeasurePolicy boxMeasurePolicy = this.this$0;
        int length = placeableArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            Placeable placeable = placeableArr[i5];
            l0.n(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            Measurable measurable = list.get(i6);
            LayoutDirection layoutDirection = measureScope.getLayoutDirection();
            int i7 = fVar.element;
            int i8 = fVar2.element;
            alignment = boxMeasurePolicy.alignment;
            BoxKt.placeInBox(placementScope, placeable, measurable, layoutDirection, i7, i8, alignment);
            i5++;
            i6++;
        }
    }
}
