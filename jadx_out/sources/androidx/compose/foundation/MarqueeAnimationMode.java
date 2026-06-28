package androidx.compose.foundation;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
@u3.f
/* loaded from: classes.dex */
public final class MarqueeAnimationMode {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = m273constructorimpl(0);
    private static final int WhileFocused = m273constructorimpl(1);
    private final int value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/MarqueeAnimationMode$Companion;", "", "()V", "Immediately", "Landroidx/compose/foundation/MarqueeAnimationMode;", "getImmediately-ZbEOnfQ$annotations", "getImmediately-ZbEOnfQ", "()I", "I", "WhileFocused", "getWhileFocused-ZbEOnfQ$annotations", "getWhileFocused-ZbEOnfQ", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m279getImmediatelyZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m280getWhileFocusedZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m281getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m282getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }
    }

    private /* synthetic */ MarqueeAnimationMode(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m272boximpl(int i5) {
        return new MarqueeAnimationMode(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m273constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m274equalsimpl(int i5, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i5 == ((MarqueeAnimationMode) obj).m278unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m275equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m276hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m277toStringimpl(int i5) {
        if (m275equalsimpl0(i5, Immediately)) {
            return "Immediately";
        }
        if (m275equalsimpl0(i5, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i5).toString());
    }

    public boolean equals(Object obj) {
        return m274equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m276hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m277toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m278unboximpl() {
        return this.value;
    }
}
