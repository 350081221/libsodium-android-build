package androidx.compose.foundation.lazy.staggeredgrid;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\n\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0088\u0001\u0007¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "lane", "", "span", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "end", "getEnd-impl", "(J)I", "getPackedValue", "()J", "size", "getSize-impl", "start", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n952#1:1229\n951#1:1231\n48#2:1226\n55#2:1227\n62#2:1228\n62#2:1230\n55#2:1232\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n953#1:1229\n953#1:1231\n949#1:1226\n951#1:1227\n952#1:1228\n953#1:1230\n953#1:1232\n*E\n"})
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m762boximpl(long j5) {
        return new SpanRange(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m763constructorimpl(int i5, int i6) {
        return m764constructorimpl(((i6 + i5) & 4294967295L) | (i5 << 32));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m764constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m765equalsimpl(long j5, Object obj) {
        return (obj instanceof SpanRange) && j5 == ((SpanRange) obj).m772unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m766equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m767getEndimpl(long j5) {
        return (int) (j5 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m768getSizeimpl(long j5) {
        return ((int) (4294967295L & j5)) - ((int) (j5 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m769getStartimpl(long j5) {
        return (int) (j5 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m770hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m771toStringimpl(long j5) {
        return "SpanRange(packedValue=" + j5 + ')';
    }

    public boolean equals(Object obj) {
        return m765equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m770hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m771toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m772unboximpl() {
        return this.packedValue;
    }
}
