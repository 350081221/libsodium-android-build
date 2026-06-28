package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002\u001a%\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0010\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000f\u001a*\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001f\u0010 \u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001f\u0010#\u001a\u00020\u001b*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "roundToTenths", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLv3/a;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,198:1\n130#1:202\n25#2,3:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:202\n31#1:199,3\n*E\n"})
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f5, float f6) {
        return ScaleFactor.m5062constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m5076divUQTWf7w(long j5, long j6) {
        return SizeKt.Size(Size.m3562getWidthimpl(j5) / ScaleFactor.m5068getScaleXimpl(j6), Size.m3559getHeightimpl(j5) / ScaleFactor.m5069getScaleYimpl(j6));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m5077isSpecifiedFK8aYYs(long j5) {
        return j5 != ScaleFactor.Companion.m5075getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m5078isSpecifiedFK8aYYs$annotations(long j5) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m5079isUnspecifiedFK8aYYs(long j5) {
        return j5 == ScaleFactor.Companion.m5075getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m5080isUnspecifiedFK8aYYs$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m5081lerpbDIf60(long j5, long j6, float f5) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m5068getScaleXimpl(j5), ScaleFactor.m5068getScaleXimpl(j6), f5), MathHelpersKt.lerp(ScaleFactor.m5069getScaleYimpl(j5), ScaleFactor.m5069getScaleYimpl(j6), f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f5) {
        float f6 = 10;
        float f7 = f5 * f6;
        int i5 = (int) f7;
        if (f7 - i5 >= 0.5f) {
            i5++;
        }
        return i5 / f6;
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m5082takeOrElseoyDd2qo(long j5, @l a<ScaleFactor> aVar) {
        boolean z4;
        if (j5 != ScaleFactor.Companion.m5075getUnspecified_hLwfpc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return aVar.invoke().m5073unboximpl();
        }
        return j5;
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m5083timesUQTWf7w(long j5, long j6) {
        return SizeKt.Size(Size.m3562getWidthimpl(j5) * ScaleFactor.m5068getScaleXimpl(j6), Size.m3559getHeightimpl(j5) * ScaleFactor.m5069getScaleYimpl(j6));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m5084timesmw2e94(long j5, long j6) {
        return m5083timesUQTWf7w(j6, j5);
    }
}
