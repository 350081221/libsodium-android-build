package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,786:1\n33#2,6:787\n33#2,6:793\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonContentMeasurePolicy$measure$2\n*L\n381#1:787,6\n388#1:793,6\n*E\n"})
/* loaded from: classes.dex */
final class SegmentedButtonContentMeasurePolicy$measure$2 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ List<Placeable> $contentPlaceables;
    final /* synthetic */ int $height;
    final /* synthetic */ List<Placeable> $iconPlaceables;
    final /* synthetic */ int $offsetX;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ SegmentedButtonContentMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonContentMeasurePolicy$measure$2(List<? extends Placeable> list, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i5, List<? extends Placeable> list2, int i6) {
        super(1);
        this.$iconPlaceables = list;
        this.$this_measure = measureScope;
        this.this$0 = segmentedButtonContentMeasurePolicy;
        this.$offsetX = i5;
        this.$contentPlaceables = list2;
        this.$height = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        float f5;
        List<Placeable> list = this.$iconPlaceables;
        int i5 = this.$height;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = list.get(i6);
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, (i5 - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        int mo298roundToPx0680j_4 = this.$this_measure.mo298roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m2151getIconSizeD9Ej5fM());
        MeasureScope measureScope = this.$this_measure;
        f5 = SegmentedButtonKt.IconSpacing;
        int mo298roundToPx0680j_42 = mo298roundToPx0680j_4 + measureScope.mo298roundToPx0680j_4(f5);
        Animatable<Integer, AnimationVector1D> animatable = this.this$0.getAnimatable();
        int intValue = mo298roundToPx0680j_42 + (animatable != null ? animatable.getValue().intValue() : this.$offsetX);
        List<Placeable> list2 = this.$contentPlaceables;
        int i7 = this.$height;
        int size2 = list2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Placeable placeable2 = list2.get(i8);
            Placeable.PlacementScope.place$default(placementScope, placeable2, intValue, (i7 - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
    }
}
