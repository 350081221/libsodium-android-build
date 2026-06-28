package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,831:1\n13579#2,2:832\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n802#1:832,2\n*E\n"})
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy$measure$3 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i5, int i6) {
        super(1);
        this.$placeables = placeableArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i5;
        this.$maxHeight = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Placeable[] placeableArr = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i5 = this.$maxWidth;
        int i6 = this.$maxHeight;
        for (Placeable placeable : placeableArr) {
            if (placeable != null) {
                long mo3370alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo3370alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i5, i6), LayoutDirection.Ltr);
                Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m6172getXimpl(mo3370alignKFBX0sM), IntOffset.m6173getYimpl(mo3370alignKFBX0sM), 0.0f, 4, null);
            }
        }
    }
}
