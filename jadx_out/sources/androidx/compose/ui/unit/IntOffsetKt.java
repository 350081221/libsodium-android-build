package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0017\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,180:1\n48#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:181\n*E\n"})
/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i5, int i6) {
        return IntOffset.m6166constructorimpl((i6 & 4294967295L) | (i5 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m6183lerp81ZRxRo(long j5, long j6, float f5) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m6172getXimpl(j5), IntOffset.m6172getXimpl(j6), f5), MathHelpersKt.lerp(IntOffset.m6173getYimpl(j5), IntOffset.m6173getYimpl(j6), f5));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m6184minusNvtHpc(long j5, long j6) {
        return OffsetKt.Offset(Offset.m3493getXimpl(j5) - IntOffset.m6172getXimpl(j6), Offset.m3494getYimpl(j5) - IntOffset.m6173getYimpl(j6));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m6185minusoCl6YwE(long j5, long j6) {
        return OffsetKt.Offset(IntOffset.m6172getXimpl(j5) - Offset.m3493getXimpl(j6), IntOffset.m6173getYimpl(j5) - Offset.m3494getYimpl(j6));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m6186plusNvtHpc(long j5, long j6) {
        return OffsetKt.Offset(Offset.m3493getXimpl(j5) + IntOffset.m6172getXimpl(j6), Offset.m3494getYimpl(j5) + IntOffset.m6173getYimpl(j6));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m6187plusoCl6YwE(long j5, long j6) {
        return OffsetKt.Offset(IntOffset.m6172getXimpl(j5) + Offset.m3493getXimpl(j6), IntOffset.m6173getYimpl(j5) + Offset.m3494getYimpl(j6));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m6188roundk4lQ0M(long j5) {
        int L0;
        int L02;
        L0 = d.L0(Offset.m3493getXimpl(j5));
        L02 = d.L0(Offset.m3494getYimpl(j5));
        return IntOffset(L0, L02);
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m6189toOffsetgyyYBs(long j5) {
        return OffsetKt.Offset(IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5));
    }
}
