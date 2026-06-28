package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@f
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0013\u0010\fJ'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "scaleX", "", "getScaleX$annotations", "getScaleX-impl", "(J)F", "scaleY", "getScaleY$annotations", "getScaleY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-8GGzs04", "(JFF)J", "div", "operand", "div-44nBxM0", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "times", "times-44nBxM0", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,198:1\n34#2:199\n41#2:200\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:199\n65#1:200\n*E\n"})
/* loaded from: classes.dex */
public final class ScaleFactor {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/layout/ScaleFactor;", "getUnspecified-_hLwfpc$annotations", "getUnspecified-_hLwfpc", "()J", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m5074getUnspecified_hLwfpc$annotations() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m5075getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }
    }

    private /* synthetic */ ScaleFactor(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m5059boximpl(long j5) {
        return new ScaleFactor(j5);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5060component1impl(long j5) {
        return m5068getScaleXimpl(j5);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5061component2impl(long j5) {
        return m5069getScaleYimpl(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5062constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m5063copy8GGzs04(long j5, float f5, float f6) {
        return ScaleFactorKt.ScaleFactor(f5, f6);
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m5064copy8GGzs04$default(long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m5068getScaleXimpl(j5);
        }
        if ((i5 & 2) != 0) {
            f6 = m5069getScaleYimpl(j5);
        }
        return m5063copy8GGzs04(j5, f5, f6);
    }

    @Stable
    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m5065div44nBxM0(long j5, float f5) {
        return ScaleFactorKt.ScaleFactor(m5068getScaleXimpl(j5) / f5, m5069getScaleYimpl(j5) / f5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5066equalsimpl(long j5, Object obj) {
        return (obj instanceof ScaleFactor) && j5 == ((ScaleFactor) obj).m5073unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5067equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @a1
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m5068getScaleXimpl(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a0 a0Var = a0.f19382a;
            return Float.intBitsToFloat((int) (j5 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m5069getScaleYimpl(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a0 a0Var = a0.f19382a;
            return Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5070hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m5071times44nBxM0(long j5, float f5) {
        return ScaleFactorKt.ScaleFactor(m5068getScaleXimpl(j5) * f5, m5069getScaleYimpl(j5) * f5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5072toStringimpl(long j5) {
        float roundToTenths;
        float roundToTenths2;
        StringBuilder sb = new StringBuilder();
        sb.append("ScaleFactor(");
        roundToTenths = ScaleFactorKt.roundToTenths(m5068getScaleXimpl(j5));
        sb.append(roundToTenths);
        sb.append(", ");
        roundToTenths2 = ScaleFactorKt.roundToTenths(m5069getScaleYimpl(j5));
        sb.append(roundToTenths2);
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return m5066equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5070hashCodeimpl(this.packedValue);
    }

    @l
    public String toString() {
        return m5072toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5073unboximpl() {
        return this.packedValue;
    }
}
