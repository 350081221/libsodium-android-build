package androidx.compose.animation.core;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/Motion;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", t0.b.f22420d, "", "getValue-impl", "(J)F", "velocity", "getVelocity-impl", "copy", "copy-XB9eQnU", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
@r1({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n34#2:244\n41#2:245\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n47#1:244\n49#1:245\n*E\n"})
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m123boximpl(long j5) {
        return new Motion(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m124constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m125copyXB9eQnU(long j5, float f5, float f6) {
        return SpringSimulationKt.Motion(f5, f6);
    }

    /* renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m126copyXB9eQnU$default(long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m129getValueimpl(j5);
        }
        if ((i5 & 2) != 0) {
            f6 = m130getVelocityimpl(j5);
        }
        return m125copyXB9eQnU(j5, f5, f6);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m127equalsimpl(long j5, Object obj) {
        return (obj instanceof Motion) && j5 == ((Motion) obj).m133unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m128equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m129getValueimpl(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m130getVelocityimpl(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m131hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m132toStringimpl(long j5) {
        return "Motion(packedValue=" + j5 + ')';
    }

    public boolean equals(Object obj) {
        return m127equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m131hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m132toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m133unboximpl() {
        return this.packedValue;
    }
}
