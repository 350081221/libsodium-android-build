package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n443#1:468\n444#1:469\n445#1:470\n446#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    @l
    private PaddingValues paddingValues;

    public PaddingValuesModifier(@l PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @l
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        boolean z4 = false;
        float f5 = 0;
        if (Dp.m6043compareTo0680j_4(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m6044constructorimpl(f5)) >= 0 && Dp.m6043compareTo0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM(), Dp.m6044constructorimpl(f5)) >= 0 && Dp.m6043compareTo0680j_4(this.paddingValues.mo505calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m6044constructorimpl(f5)) >= 0 && Dp.m6043compareTo0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM(), Dp.m6044constructorimpl(f5)) >= 0) {
            z4 = true;
        }
        if (z4) {
            int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo298roundToPx0680j_4(this.paddingValues.mo505calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
            int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM()) + measureScope.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(j5, -mo298roundToPx0680j_4, -mo298roundToPx0680j_42));
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo4998measureBRTryo0.getWidth() + mo298roundToPx0680j_4), ConstraintsKt.m6013constrainHeightK40F9xA(j5, mo4998measureBRTryo0.getHeight() + mo298roundToPx0680j_42), null, new PaddingValuesModifier$measure$2(mo4998measureBRTryo0, measureScope, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    public final void setPaddingValues(@l PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
