package androidx.compose.material3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/Selection;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u3.f
/* loaded from: classes.dex */
public final class Selection {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Hour = m2170constructorimpl(0);
    private static final int Minute = m2170constructorimpl(1);
    private final int value;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material3/Selection$Companion;", "", "()V", "Hour", "Landroidx/compose/material3/Selection;", "getHour-JiIwxys", "()I", "I", "Minute", "getMinute-JiIwxys", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* renamed from: getHour-JiIwxys, reason: not valid java name */
        public final int m2176getHourJiIwxys() {
            return Selection.Hour;
        }

        /* renamed from: getMinute-JiIwxys, reason: not valid java name */
        public final int m2177getMinuteJiIwxys() {
            return Selection.Minute;
        }
    }

    private /* synthetic */ Selection(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Selection m2169boximpl(int i5) {
        return new Selection(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2170constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2171equalsimpl(int i5, Object obj) {
        return (obj instanceof Selection) && i5 == ((Selection) obj).m2175unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2172equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2173hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2174toStringimpl(int i5) {
        return "Selection(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m2171equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2173hashCodeimpl(this.value);
    }

    public String toString() {
        return m2174toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2175unboximpl() {
        return this.value;
    }
}
