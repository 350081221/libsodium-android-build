package androidx.compose.ui.text.android;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "packedValue", "", "constructor-impl", "(J)J", "bottomPadding", "", "getBottomPadding-impl", "(J)I", "topPadding", "getTopPadding-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n*L\n1#1,1031:1\n32#2:1032\n39#2:1033\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n890#1:1032\n893#1:1033\n*E\n"})
/* loaded from: classes.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j5) {
        this.packedValue = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m5592boximpl(long j5) {
        return new VerticalPaddings(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5593constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5594equalsimpl(long j5, Object obj) {
        return (obj instanceof VerticalPaddings) && j5 == ((VerticalPaddings) obj).m5600unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5595equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m5596getBottomPaddingimpl(long j5) {
        return (int) (j5 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m5597getTopPaddingimpl(long j5) {
        return (int) (j5 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5598hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5599toStringimpl(long j5) {
        return "VerticalPaddings(packedValue=" + j5 + ')';
    }

    public boolean equals(Object obj) {
        return m5594equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5598hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5599toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5600unboximpl() {
        return this.packedValue;
    }
}
