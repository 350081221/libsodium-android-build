package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J0\u0010\u0016\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010/R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R$\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010+R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010/R\u001c\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010/R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010+R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u0018\u0010C\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0013\u0010I\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bJ\u00107R\u0013\u0010N\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "Lkotlin/r2;", "updateCache", "Landroidx/compose/ui/geometry/Rect;", "rect", "updateCacheWithRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "updateCacheWithRoundRect", "Landroidx/compose/ui/graphics/Path;", "composePath", "updateCacheWithPath", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Size;", "size", "", "radius", "", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "isSameBounds", "Landroidx/compose/ui/graphics/Shape;", "shape", "alpha", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "update", "position", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "update-uvyYCjk", "(J)V", "Landroidx/compose/ui/unit/Density;", "isSupportedOutline", "Z", "Landroid/graphics/Outline;", "cachedOutline", "Landroid/graphics/Outline;", "J", "Landroidx/compose/ui/graphics/Shape;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "<set-?>", "cacheIsDirty", "getCacheIsDirty$ui_release", "()Z", "usePathForClip", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "roundedCornerRadius", "F", "rectTopLeft", "rectSize", "outlineNeeded", "Landroidx/compose/ui/unit/LayoutDirection;", "tmpTouchPointPath", "tmpOpPath", "Landroidx/compose/ui/graphics/Outline;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "getOutline", "()Landroid/graphics/Outline;", "outline", "getOutlineClipSupported", "outlineClipSupported", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,357:1\n1#2:358\n35#3,5:359\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n331#1:359,5\n*E\n"})
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;

    @p4.l
    private final Outline cachedOutline;

    @p4.m
    private Path cachedRrectPath;

    @p4.m
    private androidx.compose.ui.graphics.Outline calculatedOutline;

    @p4.l
    private Density density;
    private boolean isSupportedOutline = true;

    @p4.l
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;

    @p4.m
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;

    @p4.l
    private Shape shape;
    private long size;

    @p4.m
    private Path tmpOpPath;

    @p4.m
    private Path tmpPath;

    @p4.m
    private RoundRect tmpRoundRect;

    @p4.m
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(@p4.l Density density) {
        this.density = density;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.Companion;
        this.size = companion.m3571getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m3509getZeroF1C5BW0();
        this.rectSize = companion.m3571getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m5346isSameBounds4L21HEs(RoundRect roundRect, long j5, long j6, float f5) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (roundRect.getLeft() == Offset.m3493getXimpl(j5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (roundRect.getTop() == Offset.m3494getYimpl(j5)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (roundRect.getRight() == Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (roundRect.getBottom() == Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) == f5) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        return true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m3509getZeroF1C5BW0();
            long j5 = this.size;
            this.rectSize = j5;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && Size.m3562getWidthimpl(j5) > 0.0f && Size.m3559getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo251createOutlinePq9zytI = this.shape.mo251createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo251createOutlinePq9zytI;
                if (mo251createOutlinePq9zytI instanceof Outline.Rectangle) {
                    updateCacheWithRect(((Outline.Rectangle) mo251createOutlinePq9zytI).getRect());
                    return;
                } else if (mo251createOutlinePq9zytI instanceof Outline.Rounded) {
                    updateCacheWithRoundRect(((Outline.Rounded) mo251createOutlinePq9zytI).getRoundRect());
                    return;
                } else {
                    if (mo251createOutlinePq9zytI instanceof Outline.Generic) {
                        updateCacheWithPath(((Outline.Generic) mo251createOutlinePq9zytI).getPath());
                        return;
                    }
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT <= 28 && !path.isConvex()) {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        } else {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        int L0;
        int L02;
        int L03;
        int L04;
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        android.graphics.Outline outline = this.cachedOutline;
        L0 = kotlin.math.d.L0(rect.getLeft());
        L02 = kotlin.math.d.L0(rect.getTop());
        L03 = kotlin.math.d.L0(rect.getRight());
        L04 = kotlin.math.d.L0(rect.getBottom());
        outline.setRect(L0, L02, L03, L04);
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        int L0;
        int L02;
        int L03;
        int L04;
        float m3468getXimpl = CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            android.graphics.Outline outline = this.cachedOutline;
            L0 = kotlin.math.d.L0(roundRect.getLeft());
            L02 = kotlin.math.d.L0(roundRect.getTop());
            L03 = kotlin.math.d.L0(roundRect.getRight());
            L04 = kotlin.math.d.L0(roundRect.getBottom());
            outline.setRoundRect(L0, L02, L03, L04, m3468getXimpl);
            this.roundedCornerRadius = m3468getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    public final void clipToOutline(@p4.l Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m3705clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f5 = this.roundedCornerRadius;
        if (f5 > 0.0f) {
            Path path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (path == null || !m5346isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f5)) {
                RoundRect m3547RoundRectgG7oq9Y = RoundRectKt.m3547RoundRectgG7oq9Y(Offset.m3493getXimpl(this.rectTopLeft), Offset.m3494getYimpl(this.rectTopLeft), Offset.m3493getXimpl(this.rectTopLeft) + Size.m3562getWidthimpl(this.rectSize), Offset.m3494getYimpl(this.rectTopLeft) + Size.m3559getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m3547RoundRectgG7oq9Y);
                this.tmpRoundRect = m3547RoundRectgG7oq9Y;
                this.tmpPath = path;
            }
            Canvas.m3705clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        Canvas.m3706clipRectN_I0leg$default(canvas, Offset.m3493getXimpl(this.rectTopLeft), Offset.m3494getYimpl(this.rectTopLeft), Offset.m3493getXimpl(this.rectTopLeft) + Size.m3562getWidthimpl(this.rectSize), Offset.m3494getYimpl(this.rectTopLeft) + Size.m3559getHeightimpl(this.rectSize), 0, 16, null);
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    @p4.m
    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    @p4.m
    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m5347isInOutlinek4lQ0M(long j5) {
        androidx.compose.ui.graphics.Outline outline;
        if (!this.outlineNeeded || (outline = this.calculatedOutline) == null) {
            return true;
        }
        return ShapeContainingUtilKt.isInOutline(outline, Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), this.tmpTouchPointPath, this.tmpOpPath);
    }

    public final boolean update(@p4.l Shape shape, float f5, boolean z4, float f6, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
        boolean z5;
        this.cachedOutline.setAlpha(f5);
        boolean z6 = !kotlin.jvm.internal.l0.g(this.shape, shape);
        if (z6) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        if (!z4 && f6 <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (this.outlineNeeded != z5) {
            this.outlineNeeded = z5;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!kotlin.jvm.internal.l0.g(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z6;
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m5348updateuvyYCjk(long j5) {
        if (!Size.m3558equalsimpl0(this.size, j5)) {
            this.size = j5;
            this.cacheIsDirty = true;
        }
    }
}
