package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR%\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "Lkotlin/r2;", "onProvideShadowMetrics", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "J", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/u;", "drawDragDecoration", "Lv3/l;", "<init>", "(Landroidx/compose/ui/unit/Density;JLv3/l;Lkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,63:1\n542#2,17:64\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n54#1:64,17\n*E\n"})
/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 0;
    private final long decorationSize;

    @l
    private final Density density;

    @l
    private final v3.l<DrawScope, r2> drawDragDecoration;

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(Density density, long j5, v3.l<? super DrawScope, r2> lVar) {
        this.density = density;
        this.decorationSize = j5;
        this.drawDragDecoration = lVar;
    }

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j5, v3.l lVar, w wVar) {
        this(density, j5, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@l Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j5 = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        v3.l<DrawScope, r2> lVar = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas component3 = drawParams.component3();
        long m4198component4NHjbRc = drawParams.m4198component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m4201setSizeuvyYCjk(j5);
        Canvas.save();
        lVar.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m4201setSizeuvyYCjk(m4198component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@l Point point, @l Point point2) {
        Density density = this.density;
        point.set(density.mo298roundToPx0680j_4(density.mo300toDpu2uoSUM(Size.m3562getWidthimpl(this.decorationSize))), density.mo298roundToPx0680j_4(density.mo300toDpu2uoSUM(Size.m3559getHeightimpl(this.decorationSize))));
        point2.set(point.x / 2, point.y / 2);
    }
}
