package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b\u001a.\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b\u001a:\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b\u001a:\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b\u001aB\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aB\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012\u001aJ\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aB\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012\u001ab\u0010!\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aB\u0010&\u001a\u00020\u0007*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b\u001a?\u0010,\u001a\u00020\u0007*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\b\u001aP\u00106\u001a\u00020\u0007*\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'2\u0006\u00103\u001a\u0002022\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "left", "top", "right", "bottom", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlin/u;", "block", "inset", "horizontal", "vertical", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLv3/l;)V", "rotate", "radians", "rotateRad-Rg1IO4c", "rotateRad", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLv3/l;)V", "scale", "scale-Rg1IO4c", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILv3/l;)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILv3/l;)V", "clipPath", "Landroidx/compose/ui/graphics/Canvas;", "drawIntoCanvas", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "transformBlock", "drawBlock", "withTransform", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "canvas", "Landroidx/compose/ui/geometry/Size;", "size", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLv3/l;)V", MediationConstant.RIT_TYPE_DRAW, "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1000:1\n67#1,4:1001\n262#1,11:1005\n262#1,11:1016\n262#1,11:1027\n262#1,11:1038\n262#1,11:1049\n262#1,11:1060\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n105#1:1001,4\n141#1:1005,11\n158#1:1016,11\n179#1:1027,11\n196#1:1038,11\n222#1:1049,11\n238#1:1060,11\n*E\n"})
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m4314clipPathKD09W0M(@l DrawScope drawScope, @l Path path, int i5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4204clipPathmtrdDE(path, i5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m4315clipPathKD09W0M$default(DrawScope drawScope, Path path, int i5, v3.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4204clipPathmtrdDE(path, i5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m4316clipRectrOu3jXo(@l DrawScope drawScope, float f5, float f6, float f7, float f8, int i5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4205clipRectN_I0leg(f5, f6, f7, f8, i5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m4317clipRectrOu3jXo$default(DrawScope drawScope, float f5, float f6, float f7, float f8, int i5, v3.l lVar, int i6, Object obj) {
        float f9;
        float f10;
        if ((i6 & 1) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f5;
        }
        if ((i6 & 2) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f6;
        }
        if ((i6 & 4) != 0) {
            f7 = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
        }
        float f11 = f7;
        if ((i6 & 8) != 0) {
            f8 = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
        }
        float f12 = f8;
        if ((i6 & 16) != 0) {
            i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4205clipRectN_I0leg(f9, f10, f11, f12, i5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final void m4318drawGRGpd60(@l DrawScope drawScope, @l Density density, @l LayoutDirection layoutDirection, @l Canvas canvas, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo4202getSizeNHjbRc = drawScope.getDrawContext().mo4202getSizeNHjbRc();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo4203setSizeuvyYCjk(j5);
        canvas.save();
        lVar.invoke(drawScope);
        canvas.restore();
        DrawContext drawContext2 = drawScope.getDrawContext();
        drawContext2.setDensity(density2);
        drawContext2.setLayoutDirection(layoutDirection2);
        drawContext2.setCanvas(canvas2);
        drawContext2.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@l DrawScope drawScope, @l v3.l<? super Canvas, r2> lVar) {
        lVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@l DrawScope drawScope, float f5, float f6, float f7, float f8, @l v3.l<? super DrawScope, r2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f5, f6, f7, f8);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f5, -f6, -f7, -f8);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f5, float f6, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f5, f6, f5, f6);
        lVar.invoke(drawScope);
        float f7 = -f5;
        float f8 = -f6;
        drawScope.getDrawContext().getTransform().inset(f7, f8, f7, f8);
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m4319rotateRg1IO4c(@l DrawScope drawScope, float f5, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(f5, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4320rotateRg1IO4c$default(DrawScope drawScope, float f5, long j5, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = drawScope.mo4276getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(f5, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m4321rotateRadRg1IO4c(@l DrawScope drawScope, float f5, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(DegreesKt.degrees(f5), j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4322rotateRadRg1IO4c$default(DrawScope drawScope, float f5, long j5, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = drawScope.mo4276getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4208rotateUv8p0NA(DegreesKt.degrees(f5), j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m4323scaleFgt4K4Q(@l DrawScope drawScope, float f5, float f6, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4209scale0AR0LA0(f5, f6, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m4324scaleFgt4K4Q$default(DrawScope drawScope, float f5, float f6, long j5, v3.l lVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j5 = drawScope.mo4276getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4209scale0AR0LA0(f5, f6, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m4325scaleRg1IO4c(@l DrawScope drawScope, float f5, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4209scale0AR0LA0(f5, f5, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4326scaleRg1IO4c$default(DrawScope drawScope, float f5, long j5, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = drawScope.mo4276getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4209scale0AR0LA0(f5, f5, j5);
        lVar.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    public static final void translate(@l DrawScope drawScope, float f5, float f6, @l v3.l<? super DrawScope, r2> lVar) {
        drawScope.getDrawContext().getTransform().translate(f5, f6);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f5, -f6);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f5, float f6, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f5, f6);
        lVar.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f5, -f6);
    }

    public static final void withTransform(@l DrawScope drawScope, @l v3.l<? super DrawTransform, r2> lVar, @l v3.l<? super DrawScope, r2> lVar2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        lVar.invoke(drawContext.getTransform());
        lVar2.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    public static final void inset(@l DrawScope drawScope, float f5, @l v3.l<? super DrawScope, r2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f5, f5, f5, f5);
        lVar.invoke(drawScope);
        float f6 = -f5;
        drawScope.getDrawContext().getTransform().inset(f6, f6, f6, f6);
    }

    public static final void inset(@l DrawScope drawScope, float f5, float f6, @l v3.l<? super DrawScope, r2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f5, f6, f5, f6);
        lVar.invoke(drawScope);
        float f7 = -f5;
        float f8 = -f6;
        drawScope.getDrawContext().getTransform().inset(f7, f8, f7, f8);
    }
}
