package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.math.d;
import p4.l;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRectKt {
    @Stable
    @l
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m6203IntRectE1MhUcY(long j5, long j6) {
        return new IntRect(IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5), IntOffset.m6172getXimpl(j6), IntOffset.m6173getYimpl(j6));
    }

    @Stable
    @l
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m6204IntRectVbeCjmY(long j5, long j6) {
        return new IntRect(IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5), IntOffset.m6172getXimpl(j5) + IntSize.m6214getWidthimpl(j6), IntOffset.m6173getYimpl(j5) + IntSize.m6213getHeightimpl(j6));
    }

    @Stable
    @l
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m6205IntRectar5cAso(long j5, int i5) {
        return new IntRect(IntOffset.m6172getXimpl(j5) - i5, IntOffset.m6173getYimpl(j5) - i5, IntOffset.m6172getXimpl(j5) + i5, IntOffset.m6173getYimpl(j5) + i5);
    }

    @Stable
    @l
    public static final IntRect lerp(@l IntRect intRect, @l IntRect intRect2, float f5) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f5), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f5), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f5), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f5));
    }

    @Stable
    @l
    public static final IntRect roundToIntRect(@l Rect rect) {
        int L0;
        int L02;
        int L03;
        int L04;
        L0 = d.L0(rect.getLeft());
        L02 = d.L0(rect.getTop());
        L03 = d.L0(rect.getRight());
        L04 = d.L0(rect.getBottom());
        return new IntRect(L0, L02, L03, L04);
    }

    @Stable
    @l
    public static final Rect toRect(@l IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
