package androidx.compose.foundation;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.android.dx.io.Opcodes;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n222#2:517\n262#2,11:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n*L\n329#1:517\n329#1:518,11\n*E\n"})
/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends n0 implements v3.l<ContentDrawScope, r2> {
    final /* synthetic */ long $borderSize;
    final /* synthetic */ Stroke $borderStroke;
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $cornerRadius;
    final /* synthetic */ boolean $fillArea;
    final /* synthetic */ float $halfStroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $topLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z4, Brush brush, long j5, float f5, float f6, long j6, long j7, Stroke stroke) {
        super(1);
        this.$fillArea = z4;
        this.$brush = brush;
        this.$cornerRadius = j5;
        this.$halfStroke = f5;
        this.$strokeWidth = f6;
        this.$topLeft = j6;
        this.$borderSize = j7;
        this.$borderStroke = stroke;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
        long m216shrinkKibmq7A;
        contentDrawScope.drawContent();
        if (this.$fillArea) {
            DrawScope.m4273drawRoundRectZuiqVtQ$default(contentDrawScope, this.$brush, 0L, 0L, this.$cornerRadius, 0.0f, null, null, 0, 246, null);
            return;
        }
        float m3468getXimpl = CornerRadius.m3468getXimpl(this.$cornerRadius);
        float f5 = this.$halfStroke;
        if (m3468getXimpl < f5) {
            float f6 = this.$strokeWidth;
            float m3562getWidthimpl = Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - this.$strokeWidth;
            float m3559getHeightimpl = Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc()) - this.$strokeWidth;
            int m3722getDifferencertfAjoo = ClipOp.Companion.m3722getDifferencertfAjoo();
            Brush brush = this.$brush;
            long j5 = this.$cornerRadius;
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4205clipRectN_I0leg(f6, f6, m3562getWidthimpl, m3559getHeightimpl, m3722getDifferencertfAjoo);
            DrawScope.m4273drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j5, 0.0f, null, null, 0, 246, null);
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
            return;
        }
        Brush brush2 = this.$brush;
        long j6 = this.$topLeft;
        long j7 = this.$borderSize;
        m216shrinkKibmq7A = BorderKt.m216shrinkKibmq7A(this.$cornerRadius, f5);
        DrawScope.m4273drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, j6, j7, m216shrinkKibmq7A, 0.0f, this.$borderStroke, null, 0, Opcodes.ADD_INT_LIT16, null);
    }
}
