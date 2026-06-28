package androidx.compose.ui.geometry;

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
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000bJ'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,226:1\n34#2:227\n41#2:228\n152#3:229\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:227\n61#1:228\n138#1:229\n*E\n"})
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Zero = SizeKt.Size(0.0f, 0.0f);
    private static final long Unspecified = SizeKt.Size(Float.NaN, Float.NaN);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m3568getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m3569getZeroNHjbRc$annotations() {
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m3570getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m3571getZeroNHjbRc() {
            return Size.Zero;
        }
    }

    private /* synthetic */ Size(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m3550boximpl(long j5) {
        return new Size(j5);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m3551component1impl(long j5) {
        return m3562getWidthimpl(j5);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m3552component2impl(long j5) {
        return m3559getHeightimpl(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3553constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m3554copyxjbvk4A(long j5, float f5, float f6) {
        return SizeKt.Size(f5, f6);
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m3555copyxjbvk4A$default(long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m3562getWidthimpl(j5);
        }
        if ((i5 & 2) != 0) {
            f6 = m3559getHeightimpl(j5);
        }
        return m3554copyxjbvk4A(j5, f5, f6);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m3556div7Ah8Wj8(long j5, float f5) {
        return SizeKt.Size(m3562getWidthimpl(j5) / f5, m3559getHeightimpl(j5) / f5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3557equalsimpl(long j5, Object obj) {
        return (obj instanceof Size) && j5 == ((Size) obj).m3567unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3558equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m3559getHeightimpl(long j5) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m3560getMaxDimensionimpl(long j5) {
        return Math.max(Math.abs(m3562getWidthimpl(j5)), Math.abs(m3559getHeightimpl(j5)));
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m3561getMinDimensionimpl(long j5) {
        return Math.min(Math.abs(m3562getWidthimpl(j5)), Math.abs(m3559getHeightimpl(j5)));
    }

    @a1
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m3562getWidthimpl(long j5) {
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
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3563hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3564isEmptyimpl(long j5) {
        return m3562getWidthimpl(j5) <= 0.0f || m3559getHeightimpl(j5) <= 0.0f;
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m3565times7Ah8Wj8(long j5, float f5) {
        return SizeKt.Size(m3562getWidthimpl(j5) * f5, m3559getHeightimpl(j5) * f5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3566toStringimpl(long j5) {
        boolean z4;
        if (j5 != Companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "Size(" + GeometryUtilsKt.toStringAsFixed(m3562getWidthimpl(j5), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m3559getHeightimpl(j5), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return m3557equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3563hashCodeimpl(this.packedValue);
    }

    @l
    public String toString() {
        return m3566toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3567unboximpl() {
        return this.packedValue;
    }
}
