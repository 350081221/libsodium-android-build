package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;
import kotlin.i0;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@i0(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\"\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J*\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J0\u0010-\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u00100\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00101\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J*\u00106\u001a\u00020\u00022\u0006\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105JH\u0010;\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010:\u001a\u0002092\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0016J*\u0010B\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJB\u0010K\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020E2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ0\u0010R\u001a\u00020\u00022\u0006\u0010M\u001a\u00020L2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020'0N2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ*\u0010V\u001a\u00020\u00022\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020S2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ*\u0010]\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010^\u001a\u00020\u0002H\u0016J\b\u0010_\u001a\u00020\u0002H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/r2;", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "enableZ", "disableZ", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {
    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo3587clipPathmtrdDE(@l Path path, int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo3588clipRectN_I0leg(float f5, float f6, float f7, float f8, int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo3589concat58bKbWc(@l float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f5, float f6, float f7, float f8, float f9, float f10, boolean z4, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo3590drawCircle9KIMszo(long j5, float f5, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo3591drawImaged4ec7I(@l ImageBitmap imageBitmap, long j5, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo3592drawImageRectHPBpro0(@l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo3593drawLineWko1d7g(long j5, long j6, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f5, float f6, float f7, float f8, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@l Path path, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo3594drawPointsO7TthRY(int i5, @l List<Offset> list, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo3595drawRawPointsO7TthRY(int i5, @l float[] fArr, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f5, float f6, float f7, float f8, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f5, float f6, float f7, float f8, float f9, float f10, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo3596drawVerticesTPEHhCM(@l Vertices vertices, int i5, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f5) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@l Rect rect, @l Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f5, float f6) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f5, float f6) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f5, float f6) {
        throw new UnsupportedOperationException();
    }
}
