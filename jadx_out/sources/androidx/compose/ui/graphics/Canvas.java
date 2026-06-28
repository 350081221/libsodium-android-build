package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010!\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b&\u0010'J$\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J*\u00102\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0018\u00103\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00103\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J@\u00106\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u00107\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00107\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J*\u0010<\u001a\u00020\u00022\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b:\u0010;J0\u0010A\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0016JH\u0010A\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010D\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020\n2\u0006\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010E\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020\u0007H&J*\u0010K\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJJ\u0010T\u001a\u00020\u00022\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020L2\b\b\u0002\u0010Q\u001a\u00020N2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ0\u0010[\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020-0W2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ*\u0010_\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020\\2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b]\u0010^J*\u0010f\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\b\u0010g\u001a\u00020\u0002H&J\b\u0010h\u001a\u00020\u0002H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006iÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "Lkotlin/r2;", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "sxRad", "syRad", "skewRad", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "rect", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "clipRect", "left", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "startAngleRad", "sweepAngleRad", "drawArcRad", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Canvas {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m3712clipRectmtrdDE(@p4.l Canvas canvas, @p4.l Rect rect, int i5) {
            Canvas.super.m3709clipRectmtrdDE(rect, i5);
        }

        @Deprecated
        public static void drawArc(@p4.l Canvas canvas, @p4.l Rect rect, float f5, float f6, boolean z4, @p4.l Paint paint) {
            Canvas.super.drawArc(rect, f5, f6, z4, paint);
        }

        @Deprecated
        public static void drawArcRad(@p4.l Canvas canvas, @p4.l Rect rect, float f5, float f6, boolean z4, @p4.l Paint paint) {
            Canvas.super.drawArcRad(rect, f5, f6, z4, paint);
        }

        @Deprecated
        public static void drawOval(@p4.l Canvas canvas, @p4.l Rect rect, @p4.l Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(@p4.l Canvas canvas, @p4.l Rect rect, @p4.l Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(@p4.l Canvas canvas, float f5, float f6) {
            Canvas.super.skewRad(f5, f6);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m3705clipPathmtrdDE$default(Canvas canvas, Path path, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i6 & 2) != 0) {
            i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
        }
        canvas.mo3587clipPathmtrdDE(path, i5);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m3706clipRectN_I0leg$default(Canvas canvas, float f5, float f6, float f7, float f8, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 16) != 0) {
                i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
            }
            canvas.mo3588clipRectN_I0leg(f5, f6, f7, f8, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m3707clipRectmtrdDE$default(Canvas canvas, Rect rect, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i6 & 2) != 0) {
            i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
        }
        canvas.m3709clipRectmtrdDE(rect, i5);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m3708drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, Paint paint, int i5, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        if (obj == null) {
            if ((i5 & 2) != 0) {
                j9 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j9 = j5;
            }
            if ((i5 & 4) != 0) {
                j10 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j10 = j6;
            }
            if ((i5 & 8) != 0) {
                j11 = IntOffset.Companion.m6182getZeronOccac();
            } else {
                j11 = j7;
            }
            if ((i5 & 16) != 0) {
                j12 = j10;
            } else {
                j12 = j8;
            }
            canvas.mo3592drawImageRectHPBpro0(imageBitmap, j9, j10, j11, j12, paint);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f5, float f6, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i5 & 2) != 0) {
            f6 = f5;
        }
        canvas.scale(f5, f6);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo3587clipPathmtrdDE(@p4.l Path path, int i5);

    /* renamed from: clipRect-N_I0leg */
    void mo3588clipRectN_I0leg(float f5, float f6, float f7, float f8, int i5);

    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m3709clipRectmtrdDE(@p4.l Rect rect, int i5) {
        mo3588clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i5);
    }

    /* renamed from: concat-58bKbWc */
    void mo3589concat58bKbWc(@p4.l float[] fArr);

    void disableZ();

    void drawArc(float f5, float f6, float f7, float f8, float f9, float f10, boolean z4, @p4.l Paint paint);

    default void drawArc(@p4.l Rect rect, float f5, float f6, boolean z4, @p4.l Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f5, f6, z4, paint);
    }

    default void drawArcRad(@p4.l Rect rect, float f5, float f6, boolean z4, @p4.l Paint paint) {
        drawArc(rect, DegreesKt.degrees(f5), DegreesKt.degrees(f6), z4, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo3590drawCircle9KIMszo(long j5, float f5, @p4.l Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo3591drawImaged4ec7I(@p4.l ImageBitmap imageBitmap, long j5, @p4.l Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo3592drawImageRectHPBpro0(@p4.l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @p4.l Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo3593drawLineWko1d7g(long j5, long j6, @p4.l Paint paint);

    void drawOval(float f5, float f6, float f7, float f8, @p4.l Paint paint);

    default void drawOval(@p4.l Rect rect, @p4.l Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(@p4.l Path path, @p4.l Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo3594drawPointsO7TthRY(int i5, @p4.l List<Offset> list, @p4.l Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo3595drawRawPointsO7TthRY(int i5, @p4.l float[] fArr, @p4.l Paint paint);

    void drawRect(float f5, float f6, float f7, float f8, @p4.l Paint paint);

    default void drawRect(@p4.l Rect rect, @p4.l Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f5, float f6, float f7, float f8, float f9, float f10, @p4.l Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo3596drawVerticesTPEHhCM(@p4.l Vertices vertices, int i5, @p4.l Paint paint);

    void enableZ();

    void restore();

    void rotate(float f5);

    void save();

    void saveLayer(@p4.l Rect rect, @p4.l Paint paint);

    void scale(float f5, float f6);

    void skew(float f5, float f6);

    default void skewRad(float f5, float f6) {
        skew(DegreesKt.degrees(f5), DegreesKt.degrees(f6));
    }

    void translate(float f5, float f6);
}
