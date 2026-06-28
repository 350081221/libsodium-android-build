package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001ABO\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0015\u0012\b\b\u0002\u0010$\u001a\u00020\u0015\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\b\b\u0002\u0010&\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\b\u0010\u0002\u001a\u00020\u0000H\u0002J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0018\u001a\u00020\u0015HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u0015HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0016\u0010\u001c\u001a\u00020\u0015HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u0016\u0010\u001e\u001a\u00020\u0015HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010%\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u0015HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\t\u0010+\u001a\u00020*HÖ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b1\u00100R\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\"\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b3\u00100R\u001d\u0010#\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u00104\u001a\u0004\b5\u0010\u0017R\u001d\u0010$\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b6\u0010\u0017R\u001d\u0010%\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u0010\u0017R\u001d\u0010&\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b8\u0010\u0017R\u0018\u00109\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010<\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u00100R\u0011\u0010>\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "scaledRadiiRect", "", "min", "radius1", "radius2", "limit", "minRadius", "Landroidx/compose/ui/geometry/Offset;", "point", "", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "component1", "component2", "component3", "component4", "Landroidx/compose/ui/geometry/CornerRadius;", "component5-kKHJgLs", "()J", "component5", "component6-kKHJgLs", "component6", "component7-kKHJgLs", "component7", "component8-kKHJgLs", "component8", "left", "top", "right", "bottom", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "copy", "", TTDownloadField.TT_HASHCODE, "other", "equals", "F", "getLeft", "()F", "getTop", "getRight", "getBottom", "J", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "getBottomRightCornerRadius-kKHJgLs", "getBottomLeftCornerRadius-kKHJgLs", "_scaledRadiiRect", "Landroidx/compose/ui/geometry/RoundRect;", "getWidth", "width", "getHeight", "height", "<init>", "(FFFFJJJJLkotlin/jvm/internal/w;)V", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final RoundRect Zero = RoundRectKt.m3547RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m3478getZerokKHJgLs());

    @m
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @u3.m
        public static /* synthetic */ void getZero$annotations() {
        }

        @l
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    private RoundRect(float f5, float f6, float f7, float f8, long j5, long j6, long j7, long j8) {
        this.left = f5;
        this.top = f6;
        this.right = f7;
        this.bottom = f8;
        this.topLeftCornerRadius = j5;
        this.topRightCornerRadius = j6;
        this.bottomRightCornerRadius = j7;
        this.bottomLeftCornerRadius = j8;
    }

    public /* synthetic */ RoundRect(float f5, float f6, float f7, float f8, long j5, long j6, long j7, long j8, w wVar) {
        this(f5, f6, f7, f8, j5, j6, j7, j8);
    }

    @l
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f5, float f6, float f7, float f8) {
        float f9 = f6 + f7;
        if (f9 > f8) {
            return !((f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) == 0) ? Math.min(f5, f8 / f9) : f5;
        }
        return f5;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m3469getYimpl(this.bottomLeftCornerRadius), CornerRadius.m3469getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m3468getXimpl(this.topLeftCornerRadius), CornerRadius.m3468getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m3469getYimpl(this.topRightCornerRadius), CornerRadius.m3469getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m3468getXimpl(this.bottomRightCornerRadius), CornerRadius.m3468getXimpl(this.bottomLeftCornerRadius), getWidth());
            RoundRect roundRect2 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m3468getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m3469getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3468getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m3469getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3468getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m3469getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m3468getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m3469getYimpl(this.bottomLeftCornerRadius) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m3535component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m3536component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m3537component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m3538component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m3539containsk4lQ0M(long j5) {
        float m3493getXimpl;
        float m3494getYimpl;
        float m3468getXimpl;
        float m3469getYimpl;
        if (Offset.m3493getXimpl(j5) < this.left || Offset.m3493getXimpl(j5) >= this.right || Offset.m3494getYimpl(j5) < this.top || Offset.m3494getYimpl(j5) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m3493getXimpl(j5) < this.left + CornerRadius.m3468getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m3494getYimpl(j5) < this.top + CornerRadius.m3469getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            m3493getXimpl = (Offset.m3493getXimpl(j5) - this.left) - CornerRadius.m3468getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m3494getYimpl = (Offset.m3494getYimpl(j5) - this.top) - CornerRadius.m3469getYimpl(scaledRadiiRect.topLeftCornerRadius);
            m3468getXimpl = CornerRadius.m3468getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m3469getYimpl = CornerRadius.m3469getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m3493getXimpl(j5) > this.right - CornerRadius.m3468getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m3494getYimpl(j5) < this.top + CornerRadius.m3469getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            m3493getXimpl = (Offset.m3493getXimpl(j5) - this.right) + CornerRadius.m3468getXimpl(scaledRadiiRect.topRightCornerRadius);
            m3494getYimpl = (Offset.m3494getYimpl(j5) - this.top) - CornerRadius.m3469getYimpl(scaledRadiiRect.topRightCornerRadius);
            m3468getXimpl = CornerRadius.m3468getXimpl(scaledRadiiRect.topRightCornerRadius);
            m3469getYimpl = CornerRadius.m3469getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m3493getXimpl(j5) > this.right - CornerRadius.m3468getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m3494getYimpl(j5) > this.bottom - CornerRadius.m3469getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            m3493getXimpl = (Offset.m3493getXimpl(j5) - this.right) + CornerRadius.m3468getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m3494getYimpl = (Offset.m3494getYimpl(j5) - this.bottom) + CornerRadius.m3469getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            m3468getXimpl = CornerRadius.m3468getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m3469getYimpl = CornerRadius.m3469getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m3493getXimpl(j5) >= this.left + CornerRadius.m3468getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m3494getYimpl(j5) <= this.bottom - CornerRadius.m3469getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            m3493getXimpl = (Offset.m3493getXimpl(j5) - this.left) - CornerRadius.m3468getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m3494getYimpl = (Offset.m3494getYimpl(j5) - this.bottom) + CornerRadius.m3469getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m3468getXimpl = CornerRadius.m3468getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m3469getYimpl = CornerRadius.m3469getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f5 = m3493getXimpl / m3468getXimpl;
        float f6 = m3494getYimpl / m3469getYimpl;
        if ((f5 * f5) + (f6 * f6) > 1.0f) {
            return false;
        }
        return true;
    }

    @l
    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m3540copyMDFrsts(float f5, float f6, float f7, float f8, long j5, long j6, long j7, long j8) {
        return new RoundRect(f5, f6, f7, f8, j5, j6, j7, j8, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m3467equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m3467equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m3467equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m3467equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3541getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3542getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3543getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m3544getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m3470hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m3470hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m3470hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m3470hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @l
    public String toString() {
        boolean z4;
        long j5 = this.topLeftCornerRadius;
        long j6 = this.topRightCornerRadius;
        long j7 = this.bottomRightCornerRadius;
        long j8 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (CornerRadius.m3467equalsimpl0(j5, j6) && CornerRadius.m3467equalsimpl0(j6, j7) && CornerRadius.m3467equalsimpl0(j7, j8)) {
            if (CornerRadius.m3468getXimpl(j5) == CornerRadius.m3469getYimpl(j5)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3468getXimpl(j5), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3468getXimpl(j5), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m3469getYimpl(j5), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m3474toStringimpl(j5)) + ", topRight=" + ((Object) CornerRadius.m3474toStringimpl(j6)) + ", bottomRight=" + ((Object) CornerRadius.m3474toStringimpl(j7)) + ", bottomLeft=" + ((Object) CornerRadius.m3474toStringimpl(j8)) + ')';
    }

    public /* synthetic */ RoundRect(float f5, float f6, float f7, float f8, long j5, long j6, long j7, long j8, int i5, w wVar) {
        this(f5, f6, f7, f8, (i5 & 16) != 0 ? CornerRadius.Companion.m3478getZerokKHJgLs() : j5, (i5 & 32) != 0 ? CornerRadius.Companion.m3478getZerokKHJgLs() : j6, (i5 & 64) != 0 ? CornerRadius.Companion.m3478getZerokKHJgLs() : j7, (i5 & 128) != 0 ? CornerRadius.Companion.m3478getZerokKHJgLs() : j8, null);
    }
}
