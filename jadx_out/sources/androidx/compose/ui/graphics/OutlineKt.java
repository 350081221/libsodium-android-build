package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aN\u0010\u0012\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aN\u0010\u0012\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001dH\u0002¢\u0006\u0004\b\u001c\u0010\u001e\u001a\u009f\u0001\u0010)\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012,\u0010$\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b#2,\u0010&\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b#2,\u0010(\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0002\b#H\u0082\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020*2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+\u001a\f\u0010.\u001a\u00020-*\u00020\u001dH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "Lkotlin/r2;", "addOutline", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "(Landroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)J", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "rect", "Lkotlin/u;", "drawRectBlock", "rrect", "drawRoundedRectBlock", ClientCookie.PATH_ATTR, "drawPathBlock", "drawOutlineHelper", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Paint;", "paint", "", "hasSameCornerRadius", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,306:1\n244#1,16:307\n244#1,16:323\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:307,16\n194#1:323,16\n*E\n"})
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(@p4.l Path path, @p4.l Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else {
            if (outline instanceof Outline.Generic) {
                Path.m4003addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
                return;
            }
            throw new kotlin.j0();
        }
    }

    public static final void drawOutline(@p4.l Canvas canvas, @p4.l Outline outline, @p4.l Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
                return;
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m3468getXimpl(rounded.getRoundRect().m3541getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m3469getYimpl(rounded.getRoundRect().m3541getBottomLeftCornerRadiuskKHJgLs()), paint);
                return;
            }
        }
        if (outline instanceof Outline.Generic) {
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
            return;
        }
        throw new kotlin.j0();
    }

    /* renamed from: drawOutline-hn5TExg */
    public static final void m3989drawOutlinehn5TExg(@p4.l DrawScope drawScope, @p4.l Outline outline, @p4.l Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f5, @p4.l DrawStyle drawStyle, @p4.m ColorFilter colorFilter, int i5) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4193drawRectAsUm42w(brush, topLeft(rect), size(rect), f5, drawStyle, colorFilter, i5);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo4195drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f5, drawStyle, colorFilter, i5);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new kotlin.j0();
        }
        drawScope.mo4189drawPathGBMwjPU(path, brush, f5, drawStyle, colorFilter, i5);
    }

    /* renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m3990drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            f5 = 1.0f;
        }
        float f6 = f5;
        if ((i6 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i6 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i6 & 32) != 0) {
            i5 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        }
        m3989drawOutlinehn5TExg(drawScope, outline, brush, f6, drawStyle2, colorFilter2, i5);
    }

    /* renamed from: drawOutline-wDX37Ww */
    public static final void m3991drawOutlinewDX37Ww(@p4.l DrawScope drawScope, @p4.l Outline outline, long j5, @FloatRange(from = 0.0d, to = 1.0d) float f5, @p4.l DrawStyle drawStyle, @p4.m ColorFilter colorFilter, int i5) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo4194drawRectnJ9OG0(j5, topLeft(rect), size(rect), f5, drawStyle, colorFilter, i5);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo4196drawRoundRectuAw5IA(j5, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f5, colorFilter, i5);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new kotlin.j0();
        }
        drawScope.mo4190drawPathLG529CI(path, j5, f5, drawStyle, colorFilter, i5);
    }

    /* renamed from: drawOutline-wDX37Ww$default */
    public static /* synthetic */ void m3992drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j5, float f5, DrawStyle drawStyle, ColorFilter colorFilter, int i5, int i6, Object obj) {
        float f6;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i7;
        if ((i6 & 4) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        if ((i6 & 8) != 0) {
            drawStyle2 = Fill.INSTANCE;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 16) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i6 & 32) != 0) {
            i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i5;
        }
        m3991drawOutlinewDX37Ww(drawScope, outline, j5, f6, drawStyle2, colorFilter2, i7);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, v3.p<? super DrawScope, ? super Rect, r2> pVar, v3.p<? super DrawScope, ? super RoundRect, r2> pVar2, v3.p<? super DrawScope, ? super Path, r2> pVar3) {
        if (outline instanceof Outline.Rectangle) {
            pVar.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                pVar3.invoke(drawScope, roundRectPath$ui_graphics_release);
                return;
            } else {
                pVar2.invoke(drawScope, rounded.getRoundRect());
                return;
            }
        }
        if (outline instanceof Outline.Generic) {
            pVar3.invoke(drawScope, ((Outline.Generic) outline).getPath());
            return;
        }
        throw new kotlin.j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect r6) {
        /*
            long r0 = r6.m3541getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r0)
            long r1 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r1 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L4f
            long r3 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r3)
            long r3 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L4f
            long r3 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r3)
            long r3 = r6.m3543getTopLeftCornerRadiuskKHJgLs()
            float r3 = androidx.compose.ui.geometry.CornerRadius.m3468getXimpl(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            long r3 = r6.m3541getBottomLeftCornerRadiuskKHJgLs()
            float r3 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r3)
            long r4 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r4 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L9d
            long r3 = r6.m3542getBottomRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r3)
            long r4 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r4 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7f
            r3 = r1
            goto L80
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L9d
            long r3 = r6.m3544getTopRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r3)
            long r4 = r6.m3543getTopLeftCornerRadiuskKHJgLs()
            float r6 = androidx.compose.ui.geometry.CornerRadius.m3469getYimpl(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = r1
            goto L99
        L98:
            r6 = r2
        L99:
            if (r6 == 0) goto L9d
            r6 = r1
            goto L9e
        L9d:
            r6 = r2
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r1 = r2
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.OutlineKt.hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
