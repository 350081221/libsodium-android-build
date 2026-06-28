package androidx.compose.ui.input.pointer;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import u3.f;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerId;", "", t0.b.f22420d, "", "constructor-impl", "(J)J", "getValue", "()J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j5) {
        this.value = j5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m4851boximpl(long j5) {
        return new PointerId(j5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4852constructorimpl(long j5) {
        return j5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4853equalsimpl(long j5, Object obj) {
        return (obj instanceof PointerId) && j5 == ((PointerId) obj).m4857unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4854equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4855hashCodeimpl(long j5) {
        return Long.hashCode(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4856toStringimpl(long j5) {
        return "PointerId(value=" + j5 + ')';
    }

    public boolean equals(Object obj) {
        return m4853equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4855hashCodeimpl(this.value);
    }

    public String toString() {
        return m4856toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4857unboximpl() {
        return this.value;
    }
}
