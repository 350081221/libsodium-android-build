package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Measurer$drawDebugBounds$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ float $forcedScaleFactor;
    final /* synthetic */ Measurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Measurer$drawDebugBounds$1(Measurer measurer, float f5) {
        super(1);
        this.this$0 = measurer;
        this.$forcedScaleFactor = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope Canvas) {
        l0.p(Canvas, "$this$Canvas");
        float layoutCurrentWidth = this.this$0.getLayoutCurrentWidth() * this.$forcedScaleFactor;
        float layoutCurrentHeight = this.this$0.getLayoutCurrentHeight() * this.$forcedScaleFactor;
        float m3562getWidthimpl = (Size.m3562getWidthimpl(Canvas.mo4277getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
        float m3559getHeightimpl = (Size.m3559getHeightimpl(Canvas.mo4277getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
        Color.Companion companion = Color.Companion;
        long m3771getWhite0d7_KjU = companion.m3771getWhite0d7_KjU();
        float f5 = m3562getWidthimpl + layoutCurrentWidth;
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3771getWhite0d7_KjU, OffsetKt.Offset(m3562getWidthimpl, m3559getHeightimpl), OffsetKt.Offset(f5, m3559getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long Offset = OffsetKt.Offset(f5, m3559getHeightimpl);
        float f6 = m3559getHeightimpl + layoutCurrentHeight;
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3771getWhite0d7_KjU, Offset, OffsetKt.Offset(f5, f6), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3771getWhite0d7_KjU, OffsetKt.Offset(f5, f6), OffsetKt.Offset(m3562getWidthimpl, f6), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3771getWhite0d7_KjU, OffsetKt.Offset(m3562getWidthimpl, f6), OffsetKt.Offset(m3562getWidthimpl, m3559getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f7 = 1;
        float f8 = m3562getWidthimpl + f7;
        float f9 = m3559getHeightimpl + f7;
        long m3760getBlack0d7_KjU = companion.m3760getBlack0d7_KjU();
        float f10 = layoutCurrentWidth + f8;
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3760getBlack0d7_KjU, OffsetKt.Offset(f8, f9), OffsetKt.Offset(f10, f9), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long Offset2 = OffsetKt.Offset(f10, f9);
        float f11 = f9 + layoutCurrentHeight;
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3760getBlack0d7_KjU, Offset2, OffsetKt.Offset(f10, f11), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3760getBlack0d7_KjU, OffsetKt.Offset(f10, f11), OffsetKt.Offset(f8, f11), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m4264drawLineNGM6Ib0$default(Canvas, m3760getBlack0d7_KjU, OffsetKt.Offset(f8, f11), OffsetKt.Offset(f8, f9), 0.0f, 0, null, 0.0f, null, 0, 504, null);
    }
}
