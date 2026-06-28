package androidx.compose.ui.text.font;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m5639constructorimpl(0);
    private static final int OptionalLocal = m5639constructorimpl(1);
    private static final int Async = m5639constructorimpl(2);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;", "", "()V", "Async", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getAsync-PKNRLFQ", "()I", "I", "Blocking", "getBlocking-PKNRLFQ", "OptionalLocal", "getOptionalLocal-PKNRLFQ", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m5645getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m5646getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m5647getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m5638boximpl(int i5) {
        return new FontLoadingStrategy(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5639constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5640equalsimpl(int i5, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i5 == ((FontLoadingStrategy) obj).m5644unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5641equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5642hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5643toStringimpl(int i5) {
        if (m5641equalsimpl0(i5, Blocking)) {
            return "Blocking";
        }
        if (m5641equalsimpl0(i5, OptionalLocal)) {
            return "Optional";
        }
        if (m5641equalsimpl0(i5, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i5 + ')';
    }

    public boolean equals(Object obj) {
        return m5640equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5642hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5643toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5644unboximpl() {
        return this.value;
    }
}
