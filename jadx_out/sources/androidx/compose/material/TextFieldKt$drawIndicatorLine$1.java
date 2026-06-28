package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldKt$drawIndicatorLine$1 extends n0 implements l<ContentDrawScope, r2> {
    final /* synthetic */ BorderStroke $indicatorBorder;
    final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f5, BorderStroke borderStroke) {
        super(1);
        this.$strokeWidthDp = f5;
        this.$indicatorBorder = borderStroke;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (Dp.m6049equalsimpl0(this.$strokeWidthDp, Dp.Companion.m6062getHairlineD9Ej5fM())) {
            return;
        }
        float density = this.$strokeWidthDp * contentDrawScope.getDensity();
        float m3559getHeightimpl = Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc()) - (density / 2);
        DrawScope.m4263drawLine1RTmtNc$default(contentDrawScope, this.$indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, m3559getHeightimpl), OffsetKt.Offset(Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()), m3559getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
    }
}
