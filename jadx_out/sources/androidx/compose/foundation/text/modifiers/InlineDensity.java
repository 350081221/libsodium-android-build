package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\t\u0092\u0001\u00020\n¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "density", "", "fontScale", "constructor-impl", "(FF)J", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)J", "packedValue", "", "(J)J", "getDensity-impl", "(J)F", "getFontScale-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
@r1({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,50:1\n25#2,3:51\n34#2:54\n41#2:55\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n32#1:51,3\n37#1:54\n40#1:55\n*E\n"})
/* loaded from: classes.dex */
public final class InlineDensity {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m936constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "()V", "Unspecified", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "getUnspecified-L26CHvs", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m946getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }
    }

    private /* synthetic */ InlineDensity(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m935boximpl(long j5) {
        return new InlineDensity(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m937constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m938constructorimpl(@l Density density) {
        return m936constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m939equalsimpl(long j5, Object obj) {
        return (obj instanceof InlineDensity) && j5 == ((InlineDensity) obj).m945unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m940equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m941getDensityimpl(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m942getFontScaleimpl(long j5) {
        a0 a0Var = a0.f19382a;
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m943hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m944toStringimpl(long j5) {
        return "InlineDensity(density=" + m941getDensityimpl(j5) + ", fontScale=" + m942getFontScaleimpl(j5) + ')';
    }

    public boolean equals(Object obj) {
        return m939equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m943hashCodeimpl(this.packedValue);
    }

    @l
    public String toString() {
        return m944toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m945unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m936constructorimpl(float f5, float f6) {
        return m937constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }
}
