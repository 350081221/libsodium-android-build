package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@u3.f
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\u0088\u0001\u0002¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "packedValue", "", "constructor-impl", "(J)J", "endInclusive", "", "getEndInclusive$annotations", "()V", "getEndInclusive-impl", "(J)F", "getPackedValue", "()J", "start", "getStart$annotations", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2151:1\n34#2:2152\n41#2:2153\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderRange\n*L\n2076#1:2152\n2089#1:2153\n*E\n"})
/* loaded from: classes.dex */
public final class SliderRange {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "()V", "Unspecified", "Landroidx/compose/material3/SliderRange;", "getUnspecified-FYbKRX4$annotations", "getUnspecified-FYbKRX4", "()J", "J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m2215getUnspecifiedFYbKRX4$annotations() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m2216getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }
    }

    private /* synthetic */ SliderRange(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m2206boximpl(long j5) {
        return new SliderRange(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2207constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2208equalsimpl(long j5, Object obj) {
        return (obj instanceof SliderRange) && j5 == ((SliderRange) obj).m2214unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2209equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @Stable
    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m2210getEndInclusiveimpl(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f19382a;
            return Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m2211getStartimpl(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f19382a;
            return Float.intBitsToFloat((int) (j5 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2212hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2213toStringimpl(long j5) {
        if (SliderKt.m2200isSpecifiedIf1S1O4(j5)) {
            return m2211getStartimpl(j5) + ".." + m2210getEndInclusiveimpl(j5);
        }
        return "FloatRange.Unspecified";
    }

    public boolean equals(Object obj) {
        return m2208equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2212hashCodeimpl(this.packedValue);
    }

    @p4.l
    public String toString() {
        return m2213toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2214unboximpl() {
        return this.packedValue;
    }
}
