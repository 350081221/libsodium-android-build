package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathOperation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010H\u001a\u00020G¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J8\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J8\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J(\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0002H\u0016J \u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0016J \u0010*\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0016J\"\u00103\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00012\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\b\u00104\u001a\u00020\tH\u0016J\b\u00105\u001a\u00020\tH\u0016J\b\u00106\u001a\u00020\tH\u0016J\u001a\u00109\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001a\u0010>\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010?\u001a\u00020\u0002H\u0016J*\u0010F\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010C\u001a\u00020BH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010[\u001a\u00020U2\u0006\u0010V\u001a\u00020U8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010\\\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010_\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "_rectIsValid", "", "x", "y", "Lkotlin/r2;", "moveTo", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "dx3", "dy3", "relativeCubicTo", "startAngleDegrees", "sweepAngleDegrees", "forceMoveTo", "arcTo", "addRect", "oval", "addOval", "startAngleRadians", "sweepAngleRadians", "addArcRad", "addArc", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", ILivePush.ClickType.CLOSE, "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroid/graphics/Path;", "internalPath", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "", "radii", "[F", "Landroid/graphics/Matrix;", "mMatrix", "Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/PathFillType;", t0.b.f22420d, "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "()V", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,258:1\n1#2:259\n35#3,5:260\n35#3,5:265\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n181#1:260,5\n234#1:265,5\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPath implements Path {

    @p4.l
    private final android.graphics.Path internalPath;

    @p4.m
    private android.graphics.Matrix mMatrix;

    @p4.m
    private float[] radii;

    @p4.m
    private RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AndroidPath(@p4.l android.graphics.Path path) {
        this.internalPath = path;
    }

    private final boolean _rectIsValid(Rect rect) {
        if (!Float.isNaN(rect.getLeft())) {
            if (!Float.isNaN(rect.getTop())) {
                if (!Float.isNaN(rect.getRight())) {
                    if (!Float.isNaN(rect.getBottom())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(@p4.l Rect rect, float f5, float f6) {
        if (_rectIsValid(rect)) {
            if (this.rectF == null) {
                this.rectF = new RectF();
            }
            RectF rectF = this.rectF;
            kotlin.jvm.internal.l0.m(rectF);
            rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            android.graphics.Path path = this.internalPath;
            RectF rectF2 = this.rectF;
            kotlin.jvm.internal.l0.m(rectF2);
            path.addArc(rectF2, f5, f6);
            return;
        }
        throw new IllegalStateException("invalid rect".toString());
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(@p4.l Rect rect, float f5, float f6) {
        addArc(rect, DegreesKt.degrees(f5), DegreesKt.degrees(f6));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(@p4.l Rect rect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.addOval(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo3624addPathUv8p0NA(@p4.l Path path, long j5) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(@p4.l Rect rect) {
        if (_rectIsValid(rect)) {
            if (this.rectF == null) {
                this.rectF = new RectF();
            }
            RectF rectF = this.rectF;
            kotlin.jvm.internal.l0.m(rectF);
            rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            android.graphics.Path path = this.internalPath;
            RectF rectF2 = this.rectF;
            kotlin.jvm.internal.l0.m(rectF2);
            path.addRect(rectF2, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("invalid rect".toString());
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(@p4.l RoundRect roundRect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        kotlin.jvm.internal.l0.m(fArr);
        fArr[0] = CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs());
        fArr[1] = CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs());
        fArr[3] = CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs());
        fArr[4] = CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        float[] fArr2 = this.radii;
        kotlin.jvm.internal.l0.m(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(@p4.l Rect rect, float f5, float f6, boolean z4) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.arcTo(rectF2, f5, f6, z4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.internalPath.cubicTo(f5, f6, f7, f8, f9, f10);
    }

    @Override // androidx.compose.ui.graphics.Path
    @p4.l
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo3625getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m4015getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m4016getNonZeroRgk1Os();
    }

    @p4.l
    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f5, float f6) {
        this.internalPath.lineTo(f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f5, float f6) {
        this.internalPath.moveTo(f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo3626opN5in7k0(@p4.l Path path, @p4.l Path path2, int i5) {
        Path.Op op;
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m4020equalsimpl0(i5, companion.m4024getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m4020equalsimpl0(i5, companion.m4025getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m4020equalsimpl0(i5, companion.m4026getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (PathOperation.m4020equalsimpl0(i5, companion.m4027getUnionb3I0S0c())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        android.graphics.Path path3 = this.internalPath;
        if (path instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f5, float f6, float f7, float f8) {
        this.internalPath.quadTo(f5, f6, f7, f8);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.internalPath.rCubicTo(f5, f6, f7, f8, f9, f10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f5, float f6) {
        this.internalPath.rLineTo(f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f5, float f6) {
        this.internalPath.rMoveTo(f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f5, float f6, float f7, float f8) {
        this.internalPath.rQuadTo(f5, f6, f7, f8);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo3627setFillTypeoQ8Xj4U(int i5) {
        Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m4011equalsimpl0(i5, PathFillType.Companion.m4015getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo3628transform58bKbWc(@p4.l float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix);
        AndroidMatrixConversions_androidKt.m3604setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo3629translatek4lQ0M(long j5) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            kotlin.jvm.internal.l0.m(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix2);
        matrix2.setTranslate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix3);
        path.transform(matrix3);
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
