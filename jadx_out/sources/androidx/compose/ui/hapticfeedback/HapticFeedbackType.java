package androidx.compose.ui.hapticfeedback;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class HapticFeedbackType {

    @l
    public static final Companion Companion = new Companion(null);
    private final int value;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m4407getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m4409getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m4408getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m4410getTextHandleMove5zf0vsI();
        }

        @l
        public final List<HapticFeedbackType> values() {
            List<HapticFeedbackType> L;
            L = kotlin.collections.w.L(HapticFeedbackType.m4400boximpl(m4407getLongPress5zf0vsI()), HapticFeedbackType.m4400boximpl(m4408getTextHandleMove5zf0vsI()));
            return L;
        }
    }

    private /* synthetic */ HapticFeedbackType(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m4400boximpl(int i5) {
        return new HapticFeedbackType(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4401constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4402equalsimpl(int i5, Object obj) {
        return (obj instanceof HapticFeedbackType) && i5 == ((HapticFeedbackType) obj).m4406unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4403equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4404hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4405toStringimpl(int i5) {
        Companion companion = Companion;
        if (m4403equalsimpl0(i5, companion.m4407getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m4403equalsimpl0(i5, companion.m4408getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4402equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4404hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m4405toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4406unboximpl() {
        return this.value;
    }
}
