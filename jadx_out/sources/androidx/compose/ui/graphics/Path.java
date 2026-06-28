package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 P2\u00020\u0001:\u0001PJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J(\u0010%\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001cH&J \u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&J \u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H&J$\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020/H&ø\u0001\u0000¢\u0006\u0004\b1\u00102J\b\u00104\u001a\u00020\u0005H&J\b\u00105\u001a\u00020\u0005H&J\b\u00106\u001a\u00020\u0005H\u0016J\u001a\u00109\u001a\u00020\u00052\u0006\u00100\u001a\u00020/H&ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001a\u0010>\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010?\u001a\u00020\u001cH&J*\u0010F\u001a\u00020 2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BH&ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\"\u0010L\u001a\u00020G8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006QÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "x", "y", "Lkotlin/r2;", "moveTo", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "arcToRad", "startAngleDegrees", "sweepAngleDegrees", "arcTo", "addRect", "oval", "addOval", "addArcRad", "addArc", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", ILivePush.ClickType.CLOSE, "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isEmpty", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Path {

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @p4.l
        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m4004combinexh6zSI8(int i5, @p4.l Path path, @p4.l Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo3626opN5in7k0(path, path2, i5)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void arcToRad(@p4.l Path path, @p4.l Rect rect, float f5, float f6, boolean z4) {
            Path.super.arcToRad(rect, f5, f6, z4);
        }

        @Deprecated
        public static void rewind(@p4.l Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m4006transform58bKbWc(@p4.l Path path, @p4.l float[] fArr) {
            Path.super.mo3628transform58bKbWc(fArr);
        }
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4003addPathUv8p0NA$default(Path path, Path path2, long j5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i5 & 2) != 0) {
            j5 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        path.mo3624addPathUv8p0NA(path2, j5);
    }

    void addArc(@p4.l Rect rect, float f5, float f6);

    void addArcRad(@p4.l Rect rect, float f5, float f6);

    void addOval(@p4.l Rect rect);

    /* renamed from: addPath-Uv8p0NA */
    void mo3624addPathUv8p0NA(@p4.l Path path, long j5);

    void addRect(@p4.l Rect rect);

    void addRoundRect(@p4.l RoundRect roundRect);

    void arcTo(@p4.l Rect rect, float f5, float f6, boolean z4);

    default void arcToRad(@p4.l Rect rect, float f5, float f6, boolean z4) {
        arcTo(rect, DegreesKt.degrees(f5), DegreesKt.degrees(f6), z4);
    }

    void close();

    void cubicTo(float f5, float f6, float f7, float f8, float f9, float f10);

    @p4.l
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo3625getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f5, float f6);

    void moveTo(float f5, float f6);

    /* renamed from: op-N5in7k0 */
    boolean mo3626opN5in7k0(@p4.l Path path, @p4.l Path path2, int i5);

    void quadraticBezierTo(float f5, float f6, float f7, float f8);

    void relativeCubicTo(float f5, float f6, float f7, float f8, float f9, float f10);

    void relativeLineTo(float f5, float f6);

    void relativeMoveTo(float f5, float f6);

    void relativeQuadraticBezierTo(float f5, float f6, float f7, float f8);

    void reset();

    default void rewind() {
        reset();
    }

    /* renamed from: setFillType-oQ8Xj4U */
    void mo3627setFillTypeoQ8Xj4U(int i5);

    /* renamed from: transform-58bKbWc */
    default void mo3628transform58bKbWc(@p4.l float[] fArr) {
    }

    /* renamed from: translate-k-4lQ0M */
    void mo3629translatek4lQ0M(long j5);
}
