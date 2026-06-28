package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NavigationBarKt$placeLabelAndIcon$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ int $containerWidth;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ float $labelY;
    final /* synthetic */ float $offset;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ float $rippleY;
    final /* synthetic */ float $selectedIconY;
    final /* synthetic */ MeasureScope $this_placeLabelAndIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeLabelAndIcon$1(Placeable placeable, boolean z4, float f5, Placeable placeable2, int i5, float f6, float f7, Placeable placeable3, int i6, float f8, Placeable placeable4, int i7, float f9, int i8, MeasureScope measureScope) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$alwaysShowLabel = z4;
        this.$animationProgress = f5;
        this.$labelPlaceable = placeable2;
        this.$labelX = i5;
        this.$labelY = f6;
        this.$offset = f7;
        this.$iconPlaceable = placeable3;
        this.$iconX = i6;
        this.$selectedIconY = f8;
        this.$indicatorRipplePlaceable = placeable4;
        this.$rippleX = i7;
        this.$rippleY = f9;
        this.$containerWidth = i8;
        this.$this_placeLabelAndIcon = measureScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if ((r16.$animationProgress == 0.0f) == false) goto L12;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(@p4.l androidx.compose.ui.layout.Placeable.PlacementScope r17) {
        /*
            r16 = this;
            r0 = r16
            androidx.compose.ui.layout.Placeable r2 = r0.$indicatorPlaceable
            if (r2 == 0) goto L2f
            int r1 = r0.$containerWidth
            float r3 = r0.$selectedIconY
            androidx.compose.ui.layout.MeasureScope r4 = r0.$this_placeLabelAndIcon
            float r5 = r0.$offset
            int r6 = r2.getWidth()
            int r1 = r1 - r6
            int r6 = r1 / 2
            float r1 = androidx.compose.material3.NavigationBarKt.getIndicatorVerticalPadding()
            int r1 = r4.mo298roundToPx0680j_4(r1)
            float r1 = (float) r1
            float r3 = r3 - r1
            float r3 = r3 + r5
            int r4 = kotlin.math.b.L0(r3)
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r17
            r3 = r6
            r6 = r7
            r7 = r8
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
        L2f:
            boolean r1 = r0.$alwaysShowLabel
            if (r1 != 0) goto L3f
            float r1 = r0.$animationProgress
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 != 0) goto L54
        L3f:
            androidx.compose.ui.layout.Placeable r3 = r0.$labelPlaceable
            int r4 = r0.$labelX
            float r1 = r0.$labelY
            float r2 = r0.$offset
            float r1 = r1 + r2
            int r5 = kotlin.math.b.L0(r1)
            r6 = 0
            r7 = 4
            r8 = 0
            r2 = r17
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r2, r3, r4, r5, r6, r7, r8)
        L54:
            androidx.compose.ui.layout.Placeable r10 = r0.$iconPlaceable
            int r11 = r0.$iconX
            float r1 = r0.$selectedIconY
            float r2 = r0.$offset
            float r1 = r1 + r2
            int r12 = kotlin.math.b.L0(r1)
            r13 = 0
            r14 = 4
            r15 = 0
            r9 = r17
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.layout.Placeable r2 = r0.$indicatorRipplePlaceable
            int r3 = r0.$rippleX
            float r1 = r0.$rippleY
            float r4 = r0.$offset
            float r1 = r1 + r4
            int r4 = kotlin.math.b.L0(r1)
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r17
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
    }
}
