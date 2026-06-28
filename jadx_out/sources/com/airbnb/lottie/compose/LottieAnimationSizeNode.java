package com.airbnb.lottie.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J)\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationSizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: a, reason: collision with root package name */
    private int f1169a;

    /* renamed from: b, reason: collision with root package name */
    private int f1170b;

    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope layout) {
            l0.p(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, 0, 0.0f, 4, null);
        }
    }

    public LottieAnimationSizeNode(int i5, int i6) {
        this.f1169a = i5;
        this.f1170b = i6;
    }

    public final int a() {
        return this.f1170b;
    }

    public final int b() {
        return this.f1169a;
    }

    public final void c(int i5) {
        this.f1170b = i5;
    }

    public final void d(int i5) {
        this.f1169a = i5;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measure, @p4.l Measurable measurable, long j5) {
        long Constraints;
        l0.p(measure, "$this$measure");
        l0.p(measurable, "measurable");
        long m6011constrain4WqzIAM = ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(this.f1169a, this.f1170b));
        if (Constraints.m5999getMaxHeightimpl(j5) == Integer.MAX_VALUE && Constraints.m6000getMaxWidthimpl(j5) != Integer.MAX_VALUE) {
            Constraints = ConstraintsKt.Constraints(IntSize.m6214getWidthimpl(m6011constrain4WqzIAM), IntSize.m6214getWidthimpl(m6011constrain4WqzIAM), (IntSize.m6214getWidthimpl(m6011constrain4WqzIAM) * this.f1170b) / this.f1169a, (IntSize.m6214getWidthimpl(m6011constrain4WqzIAM) * this.f1170b) / this.f1169a);
        } else if (Constraints.m6000getMaxWidthimpl(j5) == Integer.MAX_VALUE && Constraints.m5999getMaxHeightimpl(j5) != Integer.MAX_VALUE) {
            Constraints = ConstraintsKt.Constraints((IntSize.m6213getHeightimpl(m6011constrain4WqzIAM) * this.f1169a) / this.f1170b, (IntSize.m6213getHeightimpl(m6011constrain4WqzIAM) * this.f1169a) / this.f1170b, IntSize.m6213getHeightimpl(m6011constrain4WqzIAM), IntSize.m6213getHeightimpl(m6011constrain4WqzIAM));
        } else {
            Constraints = ConstraintsKt.Constraints(IntSize.m6214getWidthimpl(m6011constrain4WqzIAM), IntSize.m6214getWidthimpl(m6011constrain4WqzIAM), IntSize.m6213getHeightimpl(m6011constrain4WqzIAM), IntSize.m6213getHeightimpl(m6011constrain4WqzIAM));
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measure, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new a(mo4998measureBRTryo0), 4, null);
    }
}
