package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@f
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n337#3:564\n154#3:565\n58#4:562\n51#4:563\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n273#1:558\n286#1:560\n273#1:559\n286#1:561\n311#1:564\n321#1:565\n300#1:562\n307#1:563\n*E\n"})
/* loaded from: classes.dex */
public final class DpOffset {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m6114getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m6115getZeroRKDOV3M() {
            return DpOffset.Zero;
        }
    }

    static {
        float f5 = 0;
        Zero = DpKt.m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(f5));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m6065DpOffsetYgX7TsA(companion.m6064getUnspecifiedD9Ej5fM(), companion.m6064getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m6099boximpl(long j5) {
        return new DpOffset(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6100constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m6101copytPigGR8(long j5, float f5, float f6) {
        return DpKt.m6065DpOffsetYgX7TsA(f5, f6);
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m6102copytPigGR8$default(long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = m6105getXD9Ej5fM(j5);
        }
        if ((i5 & 2) != 0) {
            f6 = m6107getYD9Ej5fM(j5);
        }
        return m6101copytPigGR8(j5, f5, f6);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6103equalsimpl(long j5, Object obj) {
        return (obj instanceof DpOffset) && j5 == ((DpOffset) obj).m6113unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6104equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @a1
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m6105getXD9Ej5fM(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a0 a0Var = a0.f19382a;
            return Dp.m6044constructorimpl(Float.intBitsToFloat((int) (j5 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6106getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m6107getYD9Ej5fM(long j5) {
        boolean z4;
        if (j5 != Unspecified) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a0 a0Var = a0.f19382a;
            return Dp.m6044constructorimpl(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6108getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6109hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m6110minusCBMgk4(long j5, long j6) {
        return DpKt.m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(m6105getXD9Ej5fM(j5) - m6105getXD9Ej5fM(j6)), Dp.m6044constructorimpl(m6107getYD9Ej5fM(j5) - m6107getYD9Ej5fM(j6)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m6111plusCBMgk4(long j5, long j6) {
        return DpKt.m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(m6105getXD9Ej5fM(j5) + m6105getXD9Ej5fM(j6)), Dp.m6044constructorimpl(m6107getYD9Ej5fM(j5) + m6107getYD9Ej5fM(j6)));
    }

    @Stable
    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6112toStringimpl(long j5) {
        boolean z4;
        if (j5 != Companion.m6114getUnspecifiedRKDOV3M()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return '(' + ((Object) Dp.m6055toStringimpl(m6105getXD9Ej5fM(j5))) + ", " + ((Object) Dp.m6055toStringimpl(m6107getYD9Ej5fM(j5))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m6103equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6109hashCodeimpl(this.packedValue);
    }

    @Stable
    @l
    public String toString() {
        return m6112toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6113unboximpl() {
        return this.packedValue;
    }
}
