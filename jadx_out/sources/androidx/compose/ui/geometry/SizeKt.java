package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0015\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u0018*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001c\"\u001f\u0010\"\u001a\u00020\u001d*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"\u001f\u0010%\u001a\u00020\u001d*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f\"\u001e\u0010*\u001a\u00020&*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"", "width", "height", "Landroidx/compose/ui/geometry/Size;", "Size", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-TmRCtEA", "(JLv3/a;)J", "takeOrElse", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "lerp", "", "size", "times-d16Qtg0", "(IJ)J", "times", "", "(DJ)J", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "toRect", "(FJ)J", "", "isSpecified-uvyYCjk", "(J)Z", "isSpecified-uvyYCjk$annotations", "(J)V", "isSpecified", "isUnspecified-uvyYCjk", "isUnspecified-uvyYCjk$annotations", "isUnspecified", "Landroidx/compose/ui/geometry/Offset;", "getCenter-uvyYCjk", "(J)J", "getCenter-uvyYCjk$annotations", "center", "ui-geometry_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,226:1\n152#1:230\n25#2,3:227\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:230\n33#1:227,3\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f5, float f6) {
        return Size.m3553constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m3572getCenteruvyYCjk(long j5) {
        return OffsetKt.Offset(Size.m3562getWidthimpl(j5) / 2.0f, Size.m3559getHeightimpl(j5) / 2.0f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3573getCenteruvyYCjk$annotations(long j5) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m3574isSpecifieduvyYCjk(long j5) {
        return j5 != Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3575isSpecifieduvyYCjk$annotations(long j5) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m3576isUnspecifieduvyYCjk(long j5) {
        return j5 == Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3577isUnspecifieduvyYCjk$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m3578lerpVgWVRYQ(long j5, long j6, float f5) {
        return Size(MathHelpersKt.lerp(Size.m3562getWidthimpl(j5), Size.m3562getWidthimpl(j6), f5), MathHelpersKt.lerp(Size.m3559getHeightimpl(j5), Size.m3559getHeightimpl(j6), f5));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m3579takeOrElseTmRCtEA(long j5, @l a<Size> aVar) {
        boolean z4;
        if (j5 != Size.Companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return aVar.invoke().m3567unboximpl();
        }
        return j5;
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3582timesd16Qtg0(int i5, long j5) {
        return Size.m3565times7Ah8Wj8(j5, i5);
    }

    @Stable
    @l
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m3583toRectuvyYCjk(long j5) {
        return RectKt.m3533Recttz77jQw(Offset.Companion.m3509getZeroF1C5BW0(), j5);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3580timesd16Qtg0(double d5, long j5) {
        return Size.m3565times7Ah8Wj8(j5, (float) d5);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3581timesd16Qtg0(float f5, long j5) {
        return Size.m3565times7Ah8Wj8(j5, f5);
    }
}
