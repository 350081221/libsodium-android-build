package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001e\u0010\u0019\u001a\u00020\u0011*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013\"\u001e\u0010\u001c\u001a\u00020\u0011*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "x", "y", "Landroidx/compose/ui/geometry/Offset;", "Offset", "(FF)J", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "lerp", "Lkotlin/Function0;", "block", "takeOrElse-3MmeM6k", "(JLv3/a;)J", "takeOrElse", "", "isFinite-k-4lQ0M", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "isSpecified-k-4lQ0M", "isSpecified-k-4lQ0M$annotations", "isSpecified", "isUnspecified-k-4lQ0M", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f5, float f6) {
        return Offset.m3485constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m3510isFinitek4lQ0M(long j5) {
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        if ((Float.isInfinite(m3493getXimpl) || Float.isNaN(m3493getXimpl)) ? false : true) {
            float m3494getYimpl = Offset.m3494getYimpl(j5);
            if ((Float.isInfinite(m3494getYimpl) || Float.isNaN(m3494getYimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3511isFinitek4lQ0M$annotations(long j5) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m3512isSpecifiedk4lQ0M(long j5) {
        return j5 != Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3513isSpecifiedk4lQ0M$annotations(long j5) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m3514isUnspecifiedk4lQ0M(long j5) {
        return j5 == Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m3515isUnspecifiedk4lQ0M$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m3516lerpWko1d7g(long j5, long j6, float f5) {
        return Offset(MathHelpersKt.lerp(Offset.m3493getXimpl(j5), Offset.m3493getXimpl(j6), f5), MathHelpersKt.lerp(Offset.m3494getYimpl(j5), Offset.m3494getYimpl(j6), f5));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m3517takeOrElse3MmeM6k(long j5, @l a<Offset> aVar) {
        return m3512isSpecifiedk4lQ0M(j5) ? j5 : aVar.invoke().m3503unboximpl();
    }
}
