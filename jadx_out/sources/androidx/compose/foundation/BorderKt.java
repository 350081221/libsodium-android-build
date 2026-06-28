package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;

@i0(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a>\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", t0.b.f22420d, "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderKt {
    @Stable
    @p4.l
    public static final Modifier border(@p4.l Modifier modifier, @p4.l BorderStroke borderStroke, @p4.l Shape shape) {
        return m214borderziNgDLE(modifier, borderStroke.m227getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    @p4.l
    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m212borderxT4_qwU(@p4.l Modifier modifier, float f5, long j5, @p4.l Shape shape) {
        return m214borderziNgDLE(modifier, f5, new SolidColor(j5, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m213borderxT4_qwU$default(Modifier modifier, float f5, long j5, Shape shape, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m212borderxT4_qwU(modifier, f5, j5, shape);
    }

    @Stable
    @p4.l
    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m214borderziNgDLE(@p4.l Modifier modifier, float f5, @p4.l Brush brush, @p4.l Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f5, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f5, RoundRect roundRect) {
        return new RoundRect(f5, f5, roundRect.getWidth() - f5, roundRect.getHeight() - f5, m216shrinkKibmq7A(roundRect.m3543getTopLeftCornerRadiuskKHJgLs(), f5), m216shrinkKibmq7A(roundRect.m3544getTopRightCornerRadiuskKHJgLs(), f5), m216shrinkKibmq7A(roundRect.m3542getBottomRightCornerRadiuskKHJgLs(), f5), m216shrinkKibmq7A(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs(), f5), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f5, boolean z4) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z4) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f5, roundRect));
            path.mo3626opN5in7k0(path, Path, PathOperation.Companion.m4024getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(BorderKt$drawContentWithoutBorder$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m215drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, Brush brush, long j5, long j6, boolean z4, float f5) {
        long j7;
        long j8;
        DrawStyle stroke;
        if (z4) {
            j7 = Offset.Companion.m3509getZeroF1C5BW0();
        } else {
            j7 = j5;
        }
        if (z4) {
            j8 = cacheDrawScope.m3400getSizeNHjbRc();
        } else {
            j8 = j6;
        }
        if (z4) {
            stroke = Fill.INSTANCE;
        } else {
            stroke = new Stroke(f5, 0.0f, 0, 0, null, 30, null);
        }
        return cacheDrawScope.onDrawWithContent(new BorderKt$drawRectBorder$1(brush, j7, j8, stroke));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m216shrinkKibmq7A(long j5, float f5) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m3468getXimpl(j5) - f5), Math.max(0.0f, CornerRadius.m3469getYimpl(j5) - f5));
    }
}
