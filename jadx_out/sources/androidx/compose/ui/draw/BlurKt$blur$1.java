package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BlurKt$blur$1 extends n0 implements l<GraphicsLayerScope, r2> {
    final /* synthetic */ boolean $clip;
    final /* synthetic */ Shape $edgeTreatment;
    final /* synthetic */ float $radiusX;
    final /* synthetic */ float $radiusY;
    final /* synthetic */ int $tileMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f5, float f6, int i5, Shape shape, boolean z4) {
        super(1);
        this.$radiusX = f5;
        this.$radiusY = f6;
        this.$tileMode = i5;
        this.$edgeTreatment = shape;
        this.$clip = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l GraphicsLayerScope graphicsLayerScope) {
        float mo304toPx0680j_4 = graphicsLayerScope.mo304toPx0680j_4(this.$radiusX);
        float mo304toPx0680j_42 = graphicsLayerScope.mo304toPx0680j_4(this.$radiusY);
        graphicsLayerScope.setRenderEffect((mo304toPx0680j_4 <= 0.0f || mo304toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m4040BlurEffect3YTHUZs(mo304toPx0680j_4, mo304toPx0680j_42, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(this.$clip);
    }
}
