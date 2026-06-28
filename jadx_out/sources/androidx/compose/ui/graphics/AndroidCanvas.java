package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bv\u0010qJ\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u001a\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J:\u0010+\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\"\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0014\u00104\u001a\u000201*\u00020'ø\u0001\u0000¢\u0006\u0004\b2\u00103J*\u00109\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J0\u0010:\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J@\u0010=\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J0\u0010>\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J*\u0010C\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\bA\u0010BJH\u0010H\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u00142\u0006\u0010E\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010I\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J*\u0010O\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJB\u0010X\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ0\u0010\b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u00020\u0007H\u0016J\b\u0010^\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J*\u0010g\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\be\u0010fR,\u0010j\u001a\u00060hj\u0002`i8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bp\u0010q\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "Lkotlin/r2;", "drawPoints", "", "stepBy", "drawLines", "", "drawRawPoints", "drawRawLines", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", "scale", "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "enableZ", "disableZ", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@kotlin.a1
@kotlin.jvm.internal.r1({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n35#2,5:436\n35#2,5:441\n33#3,6:446\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:436,5\n242#1:441,5\n319#1:446,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {

    @p4.m
    private Rect dstRect;

    @p4.l
    private android.graphics.Canvas internalCanvas;

    @p4.m
    private Rect srcRect;

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
    }

    private final void drawLines(List<Offset> list, Paint paint, int i5) {
        if (list.size() >= 2) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i6 = 0;
            while (i6 < list.size() - 1) {
                long m3503unboximpl = list.get(i6).m3503unboximpl();
                long m3503unboximpl2 = list.get(i6 + 1).m3503unboximpl();
                this.internalCanvas.drawLine(Offset.m3493getXimpl(m3503unboximpl), Offset.m3494getYimpl(m3503unboximpl), Offset.m3493getXimpl(m3503unboximpl2), Offset.m3494getYimpl(m3503unboximpl2), asFrameworkPaint);
                i6 += i5;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            long m3503unboximpl = list.get(i5).m3503unboximpl();
            this.internalCanvas.drawPoint(Offset.m3493getXimpl(m3503unboximpl), Offset.m3494getYimpl(m3503unboximpl), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i5) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i6 = 0;
            while (i6 < fArr.length - 3) {
                this.internalCanvas.drawLine(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], asFrameworkPaint);
                i6 += i5 * 2;
            }
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i5) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i6 = 0;
            while (i6 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i6], fArr[i6 + 1], asFrameworkPaint);
                i6 += i5;
            }
        }
    }

    @kotlin.a1
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo3587clipPathmtrdDE(@p4.l Path path, int i5) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m3597toRegionOp7u2Bmg(i5));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo3588clipRectN_I0leg(float f5, float f6, float f7, float f8, int i5) {
        this.internalCanvas.clipRect(f5, f6, f7, f8, m3597toRegionOp7u2Bmg(i5));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo3589concat58bKbWc(@p4.l float[] fArr) {
        if (!MatrixKt.m3988isIdentity58bKbWc(fArr)) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            AndroidMatrixConversions_androidKt.m3604setFromEL8BTi8(matrix, fArr);
            this.internalCanvas.concat(matrix);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f5, float f6, float f7, float f8, float f9, float f10, boolean z4, @p4.l Paint paint) {
        this.internalCanvas.drawArc(f5, f6, f7, f8, f9, f10, z4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo3590drawCircle9KIMszo(long j5, float f5, @p4.l Paint paint) {
        this.internalCanvas.drawCircle(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo3591drawImaged4ec7I(@p4.l ImageBitmap imageBitmap, long j5, @p4.l Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo3592drawImageRectHPBpro0(@p4.l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @p4.l Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        kotlin.jvm.internal.l0.m(rect);
        rect.left = IntOffset.m6172getXimpl(j5);
        rect.top = IntOffset.m6173getYimpl(j5);
        rect.right = IntOffset.m6172getXimpl(j5) + IntSize.m6214getWidthimpl(j6);
        rect.bottom = IntOffset.m6173getYimpl(j5) + IntSize.m6213getHeightimpl(j6);
        r2 r2Var = r2.f19517a;
        Rect rect2 = this.dstRect;
        kotlin.jvm.internal.l0.m(rect2);
        rect2.left = IntOffset.m6172getXimpl(j7);
        rect2.top = IntOffset.m6173getYimpl(j7);
        rect2.right = IntOffset.m6172getXimpl(j7) + IntSize.m6214getWidthimpl(j8);
        rect2.bottom = IntOffset.m6173getYimpl(j7) + IntSize.m6213getHeightimpl(j8);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo3593drawLineWko1d7g(long j5, long j6, @p4.l Paint paint) {
        this.internalCanvas.drawLine(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f5, float f6, float f7, float f8, @p4.l Paint paint) {
        this.internalCanvas.drawOval(f5, f6, f7, f8, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@p4.l Path path, @p4.l Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo3594drawPointsO7TthRY(int i5, @p4.l List<Offset> list, @p4.l Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m4033equalsimpl0(i5, companion.m4037getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m4033equalsimpl0(i5, companion.m4039getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m4033equalsimpl0(i5, companion.m4038getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo3595drawRawPointsO7TthRY(int i5, @p4.l float[] fArr, @p4.l Paint paint) {
        if (fArr.length % 2 == 0) {
            PointMode.Companion companion = PointMode.Companion;
            if (PointMode.m4033equalsimpl0(i5, companion.m4037getLinesr_lszbg())) {
                drawRawLines(fArr, paint, 2);
                return;
            } else if (PointMode.m4033equalsimpl0(i5, companion.m4039getPolygonr_lszbg())) {
                drawRawLines(fArr, paint, 1);
                return;
            } else {
                if (PointMode.m4033equalsimpl0(i5, companion.m4038getPointsr_lszbg())) {
                    drawRawPoints(fArr, paint, 2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("points must have an even number of values");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f5, float f6, float f7, float f8, @p4.l Paint paint) {
        this.internalCanvas.drawRect(f5, f6, f7, f8, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f5, float f6, float f7, float f8, float f9, float f10, @p4.l Paint paint) {
        this.internalCanvas.drawRoundRect(f5, f6, f7, f8, f9, f10, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo3596drawVerticesTPEHhCM(@p4.l Vertices vertices, int i5, @p4.l Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m3640toAndroidVertexModeJOOmi9M(vertices.m4134getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @p4.l
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f5) {
        this.internalCanvas.rotate(f5);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@p4.l androidx.compose.ui.geometry.Rect rect, @p4.l Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f5, float f6) {
        this.internalCanvas.scale(f5, f6);
    }

    public final void setInternalCanvas(@p4.l android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f5, float f6) {
        this.internalCanvas.skew(f5, f6);
    }

    @p4.l
    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m3597toRegionOp7u2Bmg(int i5) {
        if (ClipOp.m3718equalsimpl0(i5, ClipOp.Companion.m3722getDifferencertfAjoo())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f5, float f6) {
        this.internalCanvas.translate(f5, f6);
    }
}
