package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@f
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010,J\u001e\u0010/\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010\u0019J\u001e\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n34#2:267\n41#2:268\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n70#1:267\n80#1:268\n*E\n"})
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Zero = OffsetKt.Offset(0.0f, 0.0f);
    private static final long Infinite = OffsetKt.Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long Unspecified = OffsetKt.Offset(Float.NaN, Float.NaN);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m3504getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m3505getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m3506getZeroF1C5BW0$annotations() {
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m3507getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m3508getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m3509getZeroF1C5BW0() {
            return Offset.Zero;
        }
    }

    private /* synthetic */ Offset(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m3482boximpl(long j5) {
        return new Offset(j5);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m3483component1impl(long j5) {
        return m3493getXimpl(j5);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m3484component2impl(long j5) {
        return m3494getYimpl(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3485constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m3486copydBAh8RU(long j5, float f5, float f6) {
        return OffsetKt.Offset(f5, f6);
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m3487copydBAh8RU$default(long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m3493getXimpl(j5);
        }
        if ((i5 & 2) != 0) {
            f6 = m3494getYimpl(j5);
        }
        return m3486copydBAh8RU(j5, f5, f6);
    }

    @Stable
    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m3488divtuRUvjQ(long j5, float f5) {
        return OffsetKt.Offset(m3493getXimpl(j5) / f5, m3494getYimpl(j5) / f5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3489equalsimpl(long j5, Object obj) {
        return (obj instanceof Offset) && j5 == ((Offset) obj).m3503unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3490equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @Stable
    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m3491getDistanceimpl(long j5) {
        return (float) Math.sqrt((m3493getXimpl(j5) * m3493getXimpl(j5)) + (m3494getYimpl(j5) * m3494getYimpl(j5)));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m3492getDistanceSquaredimpl(long j5) {
        return (m3493getXimpl(j5) * m3493getXimpl(j5)) + (m3494getYimpl(j5) * m3494getYimpl(j5));
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m3493getXimpl(long j5) {
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
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m3494getYimpl(long j5) {
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
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3495hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m3496isValidimpl(long j5) {
        if ((Float.isNaN(m3493getXimpl(j5)) || Float.isNaN(m3494getYimpl(j5))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @Stable
    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m3497minusMKHz9U(long j5, long j6) {
        return OffsetKt.Offset(m3493getXimpl(j5) - m3493getXimpl(j6), m3494getYimpl(j5) - m3494getYimpl(j6));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m3498plusMKHz9U(long j5, long j6) {
        return OffsetKt.Offset(m3493getXimpl(j5) + m3493getXimpl(j6), m3494getYimpl(j5) + m3494getYimpl(j6));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m3499remtuRUvjQ(long j5, float f5) {
        return OffsetKt.Offset(m3493getXimpl(j5) % f5, m3494getYimpl(j5) % f5);
    }

    @Stable
    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m3500timestuRUvjQ(long j5, float f5) {
        return OffsetKt.Offset(m3493getXimpl(j5) * f5, m3494getYimpl(j5) * f5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3501toStringimpl(long j5) {
        if (OffsetKt.m3512isSpecifiedk4lQ0M(j5)) {
            return "Offset(" + GeometryUtilsKt.toStringAsFixed(m3493getXimpl(j5), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m3494getYimpl(j5), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m3502unaryMinusF1C5BW0(long j5) {
        return OffsetKt.Offset(-m3493getXimpl(j5), -m3494getYimpl(j5));
    }

    public boolean equals(Object obj) {
        return m3489equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3495hashCodeimpl(this.packedValue);
    }

    @l
    public String toString() {
        return m3501toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3503unboximpl() {
        return this.packedValue;
    }
}
