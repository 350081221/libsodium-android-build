package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends n0 implements v3.l<CacheDrawScope, DrawResult> {
    final /* synthetic */ BorderModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.this$0 = borderModifierNode;
    }

    @Override // v3.l
    @p4.l
    public final DrawResult invoke(@p4.l CacheDrawScope cacheDrawScope) {
        DrawResult m215drawRectBorderNsqcLGU;
        DrawResult m218drawRoundRectBorderJqoCqck;
        DrawResult drawGenericBorder;
        DrawResult drawContentWithoutBorder;
        if (!(cacheDrawScope.mo304toPx0680j_4(this.this$0.m219getWidthD9Ej5fM()) >= 0.0f && Size.m3561getMinDimensionimpl(cacheDrawScope.m3400getSizeNHjbRc()) > 0.0f)) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
            return drawContentWithoutBorder;
        }
        float f5 = 2;
        float min = Math.min(Dp.m6049equalsimpl0(this.this$0.m219getWidthD9Ej5fM(), Dp.Companion.m6062getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo304toPx0680j_4(this.this$0.m219getWidthD9Ej5fM())), (float) Math.ceil(Size.m3561getMinDimensionimpl(cacheDrawScope.m3400getSizeNHjbRc()) / f5));
        float f6 = min / f5;
        long Offset = OffsetKt.Offset(f6, f6);
        long Size = SizeKt.Size(Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc()) - min, Size.m3559getHeightimpl(cacheDrawScope.m3400getSizeNHjbRc()) - min);
        boolean z4 = f5 * min > Size.m3561getMinDimensionimpl(cacheDrawScope.m3400getSizeNHjbRc());
        Outline mo251createOutlinePq9zytI = this.this$0.getShape().mo251createOutlinePq9zytI(cacheDrawScope.m3400getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (mo251createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            drawGenericBorder = borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) mo251createOutlinePq9zytI, z4, min);
            return drawGenericBorder;
        }
        if (mo251createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m218drawRoundRectBorderJqoCqck = borderModifierNode2.m218drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) mo251createOutlinePq9zytI, Offset, Size, z4, min);
            return m218drawRoundRectBorderJqoCqck;
        }
        if (!(mo251createOutlinePq9zytI instanceof Outline.Rectangle)) {
            throw new j0();
        }
        m215drawRectBorderNsqcLGU = BorderKt.m215drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), Offset, Size, z4, min);
        return m215drawRectBorderNsqcLGU;
    }
}
