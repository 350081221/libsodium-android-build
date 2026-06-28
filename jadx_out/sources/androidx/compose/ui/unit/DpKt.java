package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.s;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\t\u001a'\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\t\u001a\u001f\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\t\u001a*\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018\u001a\"\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a%\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\"\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010'\u001a%\u0010\u0005\u001a\u00020/*\u00020/2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u0010*\u001a\u001f\u0010\n\u001a\u00020/*\u00020\r2\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u0010\n\u001a\u00020/*\u00020\u00062\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u00106\u001a*\u0010\"\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010,\"\u001f\u0010=\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\"\u001f\u0010@\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010:\"\u001f\u0010E\u001a\u00020\u0000*\u00020\r8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\u001f\u0010E\u001a\u00020\u0000*\u00020\u000b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010G\u001a\u0004\bA\u0010F\"\u001f\u0010E\u001a\u00020\u0000*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010H\"\u001f\u0010K\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010:\"\u001f\u0010=\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\"\u001f\u0010@\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010O\u001a\u0004\bP\u0010M\"\u001f\u0010=\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\"\u001f\u0010@\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M\"\u001e\u0010Y\u001a\u00020%*\u00020/8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010O\u001a\u0004\bV\u0010W\"\u001f\u0010-\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\\"\u001f\u0010.\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010\\\"\u001f\u00103\u001a\u00020/*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010^\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "block", "takeOrElse-D5KLDUw", "(FLv3/a;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", bi.ay, "b", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "start", "stop", "fraction", "lerp-Md-fbLM", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLv3/a;)J", "lerp-xhh869w", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", "size", "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", "center", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "getHeight$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations", "ui-unit_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m6065DpOffsetYgX7TsA(float f5, float f6) {
        return DpOffset.m6100constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m6066DpSizeYgX7TsA(float f5, float f6) {
        return DpSize.m6133constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m6067coerceAtLeastYgX7TsA(float f5, float f6) {
        return Dp.m6044constructorimpl(s.t(f5, f6));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m6068coerceAtMostYgX7TsA(float f5, float f6) {
        return Dp.m6044constructorimpl(s.A(f5, f6));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m6069coerceIn2z7ARbQ(float f5, float f6, float f7) {
        return Dp.m6044constructorimpl(s.H(f5, f6, f7));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m6070getCenterEaSLcWc(long j5) {
        return m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(DpSize.m6142getWidthD9Ej5fM(j5) / 2.0f), Dp.m6044constructorimpl(DpSize.m6140getHeightD9Ej5fM(j5) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6071getCenterEaSLcWc$annotations(long j5) {
    }

    public static final float getDp(int i5) {
        return Dp.m6044constructorimpl(i5);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d5) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f5) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i5) {
    }

    public static final float getHeight(@l DpRect dpRect) {
        return Dp.m6044constructorimpl(dpRect.m6126getBottomD9Ej5fM() - dpRect.m6129getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@l DpRect dpRect) {
        return m6066DpSizeYgX7TsA(Dp.m6044constructorimpl(dpRect.m6128getRightD9Ej5fM() - dpRect.m6127getLeftD9Ej5fM()), Dp.m6044constructorimpl(dpRect.m6126getBottomD9Ej5fM() - dpRect.m6129getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@l DpRect dpRect) {
        return Dp.m6044constructorimpl(dpRect.m6128getRightD9Ej5fM() - dpRect.m6127getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m6072isFinite0680j_4(float f5) {
        return !(f5 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6073isFinite0680j_4$annotations(float f5) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m6074isSpecified0680j_4(float f5) {
        return !Float.isNaN(f5);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6075isSpecified0680j_4$annotations(float f5) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6076isSpecifiedEaSLcWc(long j5) {
        return j5 != DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6077isSpecifiedEaSLcWc$annotations(long j5) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6078isSpecifiedjoFl9I(long j5) {
        return j5 != DpOffset.Companion.m6114getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6079isSpecifiedjoFl9I$annotations(long j5) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m6080isUnspecified0680j_4(float f5) {
        return Float.isNaN(f5);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6081isUnspecified0680j_4$annotations(float f5) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6082isUnspecifiedEaSLcWc(long j5) {
        return j5 == DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6083isUnspecifiedEaSLcWc$annotations(long j5) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6084isUnspecifiedjoFl9I(long j5) {
        return j5 == DpOffset.Companion.m6114getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6085isUnspecifiedjoFl9I$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m6086lerpIDex15A(long j5, long j6, float f5) {
        return m6066DpSizeYgX7TsA(m6087lerpMdfbLM(DpSize.m6142getWidthD9Ej5fM(j5), DpSize.m6142getWidthD9Ej5fM(j6), f5), m6087lerpMdfbLM(DpSize.m6140getHeightD9Ej5fM(j5), DpSize.m6140getHeightD9Ej5fM(j6), f5));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m6087lerpMdfbLM(float f5, float f6, float f7) {
        return Dp.m6044constructorimpl(MathHelpersKt.lerp(f5, f6, f7));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m6088lerpxhh869w(long j5, long j6, float f5) {
        return m6065DpOffsetYgX7TsA(m6087lerpMdfbLM(DpOffset.m6105getXD9Ej5fM(j5), DpOffset.m6105getXD9Ej5fM(j6), f5), m6087lerpMdfbLM(DpOffset.m6107getYD9Ej5fM(j5), DpOffset.m6107getYD9Ej5fM(j6), f5));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m6089maxYgX7TsA(float f5, float f6) {
        return Dp.m6044constructorimpl(Math.max(f5, f6));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m6090minYgX7TsA(float f5, float f6) {
        return Dp.m6044constructorimpl(Math.min(f5, f6));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m6091takeOrElseD5KLDUw(float f5, @l a<Dp> aVar) {
        if (!(!Float.isNaN(f5))) {
            return aVar.invoke().m6058unboximpl();
        }
        return f5;
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m6092takeOrElsegVKV90s(long j5, @l a<DpOffset> aVar) {
        boolean z4;
        if (j5 != DpOffset.Companion.m6114getUnspecifiedRKDOV3M()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return aVar.invoke().m6113unboximpl();
        }
        return j5;
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m6093takeOrElseitqla9I(long j5, @l a<DpSize> aVar) {
        boolean z4;
        if (j5 != DpSize.Companion.m6151getUnspecifiedMYxV2XQ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return aVar.invoke().m6150unboximpl();
        }
        return j5;
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6095times3ABfNKs(float f5, float f6) {
        return Dp.m6044constructorimpl(f5 * f6);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6098times6HolHcs(int i5, long j5) {
        return DpSize.m6148timesGh9hcWk(j5, i5);
    }

    public static final float getDp(double d5) {
        return Dp.m6044constructorimpl((float) d5);
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6094times3ABfNKs(double d5, float f5) {
        return Dp.m6044constructorimpl(((float) d5) * f5);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6097times6HolHcs(float f5, long j5) {
        return DpSize.m6147timesGh9hcWk(j5, f5);
    }

    public static final float getDp(float f5) {
        return Dp.m6044constructorimpl(f5);
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6096times3ABfNKs(int i5, float f5) {
        return Dp.m6044constructorimpl(i5 * f5);
    }
}
