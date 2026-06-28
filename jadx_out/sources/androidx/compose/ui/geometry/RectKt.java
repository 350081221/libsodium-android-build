package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", "center", "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", "start", "stop", "fraction", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    @l
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m3531Rect0a9Yr6o(long j5, long j6) {
        return new Rect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6));
    }

    @Stable
    @l
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m3532Rect3MmeM6k(long j5, float f5) {
        return new Rect(Offset.m3493getXimpl(j5) - f5, Offset.m3494getYimpl(j5) - f5, Offset.m3493getXimpl(j5) + f5, Offset.m3494getYimpl(j5) + f5);
    }

    @Stable
    @l
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m3533Recttz77jQw(long j5, long j6) {
        return new Rect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j5) + Size.m3562getWidthimpl(j6), Offset.m3494getYimpl(j5) + Size.m3559getHeightimpl(j6));
    }

    @Stable
    @l
    public static final Rect lerp(@l Rect rect, @l Rect rect2, float f5) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f5), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f5), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f5), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f5));
    }
}
