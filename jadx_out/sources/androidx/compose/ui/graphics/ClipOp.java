package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/ClipOp;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@u3.f
/* loaded from: classes.dex */
public final class ClipOp {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m3716constructorimpl(0);
    private static final int Intersect = m3716constructorimpl(1);
    private final int value;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/ClipOp$Companion;", "", "()V", "Difference", "Landroidx/compose/ui/graphics/ClipOp;", "getDifference-rtfAjoo", "()I", "I", "Intersect", "getIntersect-rtfAjoo", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m3722getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m3723getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }
    }

    private /* synthetic */ ClipOp(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m3715boximpl(int i5) {
        return new ClipOp(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3716constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3717equalsimpl(int i5, Object obj) {
        return (obj instanceof ClipOp) && i5 == ((ClipOp) obj).m3721unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3718equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3719hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3720toStringimpl(int i5) {
        if (m3718equalsimpl0(i5, Difference)) {
            return "Difference";
        }
        if (m3718equalsimpl0(i5, Intersect)) {
            return "Intersect";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3717equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3719hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m3720toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3721unboximpl() {
        return this.value;
    }
}
