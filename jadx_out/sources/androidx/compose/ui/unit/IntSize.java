package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@f
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0013\u0010\u000bJ\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)I", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "other", "div-YEO4UFw", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "times", "times-YEO4UFw", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,112:1\n55#2:113\n62#2:114\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:113\n53#1:114\n*E\n"})
/* loaded from: classes.dex */
public final class IntSize {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m6209constructorimpl(0);
    private final long packedValue;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m6219getZeroYbymL2g() {
            return IntSize.Zero;
        }
    }

    private /* synthetic */ IntSize(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m6206boximpl(long j5) {
        return new IntSize(j5);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m6207component1impl(long j5) {
        return m6214getWidthimpl(j5);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m6208component2impl(long j5) {
        return m6213getHeightimpl(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6209constructorimpl(long j5) {
        return j5;
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m6210divYEO4UFw(long j5, int i5) {
        return IntSizeKt.IntSize(m6214getWidthimpl(j5) / i5, m6213getHeightimpl(j5) / i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6211equalsimpl(long j5, Object obj) {
        return (obj instanceof IntSize) && j5 == ((IntSize) obj).m6218unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6212equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m6213getHeightimpl(long j5) {
        return (int) (j5 & 4294967295L);
    }

    @a1
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m6214getWidthimpl(long j5) {
        return (int) (j5 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6215hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m6216timesYEO4UFw(long j5, int i5) {
        return IntSizeKt.IntSize(m6214getWidthimpl(j5) * i5, m6213getHeightimpl(j5) * i5);
    }

    @Stable
    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6217toStringimpl(long j5) {
        return m6214getWidthimpl(j5) + " x " + m6213getHeightimpl(j5);
    }

    public boolean equals(Object obj) {
        return m6211equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6215hashCodeimpl(this.packedValue);
    }

    @Stable
    @l
    public String toString() {
        return m6217toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6218unboximpl() {
        return this.packedValue;
    }
}
