package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\u000eH$J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0014J2\u0010\u0019\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R%\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00158&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "Landroidx/compose/ui/graphics/Paint;", "obtainPaint", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Lkotlin/r2;", "configureColorFilter", "", "alpha", "configureAlpha", "Landroidx/compose/ui/unit/LayoutDirection;", "rtl", "configureLayoutDirection", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "", "applyAlpha", "applyColorFilter", "layoutDirection", "applyLayoutDirection", "Landroidx/compose/ui/geometry/Size;", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", MediationConstant.RIT_TYPE_DRAW, "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "useLayer", "Z", "Landroidx/compose/ui/graphics/ColorFilter;", "F", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Function1;", "Lkotlin/u;", "drawLambda", "Lv3/l;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,218:1\n67#2,2:219\n246#2:221\n69#2,2:229\n111#3,7:222\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:219,2\n206#1:221\n195#1:229,2\n207#1:222,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class Painter {

    @m
    private ColorFilter colorFilter;

    @m
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;

    @l
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @l
    private final v3.l<DrawScope, r2> drawLambda = new Painter$drawLambda$1(this);

    private final void configureAlpha(float f5) {
        boolean z4;
        boolean z5;
        if (this.alpha == f5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (!applyAlpha(f5)) {
                if (f5 == 1.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setAlpha(f5);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setAlpha(f5);
                    this.useLayer = true;
                }
            }
            this.alpha = f5;
        }
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (!l0.g(this.colorFilter, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.setColorFilter(null);
                    }
                    this.useLayer = false;
                } else {
                    obtainPaint().setColorFilter(colorFilter);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter;
        }
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m4352drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j5, float f5, ColorFilter colorFilter, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i5 & 2) != 0) {
            f5 = 1.0f;
        }
        float f6 = f5;
        if ((i5 & 4) != 0) {
            colorFilter = null;
        }
        painter.m4353drawx_KDEd0(drawScope, j5, f6, colorFilter);
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.layerPaint = Paint;
            return Paint;
        }
        return paint;
    }

    protected boolean applyAlpha(float f5) {
        return false;
    }

    protected boolean applyColorFilter(@m ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(@l LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m4353drawx_KDEd0(@l DrawScope drawScope, long j5, float f5, @m ColorFilter colorFilter) {
        configureAlpha(f5);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) - Size.m3562getWidthimpl(j5);
        float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()) - Size.m3559getHeightimpl(j5);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, m3562getWidthimpl, m3559getHeightimpl);
        if (f5 > 0.0f && Size.m3562getWidthimpl(j5) > 0.0f && Size.m3559getHeightimpl(j5) > 0.0f) {
            if (this.useLayer) {
                Rect m3533Recttz77jQw = RectKt.m3533Recttz77jQw(Offset.Companion.m3509getZeroF1C5BW0(), SizeKt.Size(Size.m3562getWidthimpl(j5), Size.m3559getHeightimpl(j5)));
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m3533Recttz77jQw, obtainPaint());
                    onDraw(drawScope);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(drawScope);
            }
        }
        drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -m3562getWidthimpl, -m3559getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo4347getIntrinsicSizeNHjbRc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onDraw(@l DrawScope drawScope);
}
