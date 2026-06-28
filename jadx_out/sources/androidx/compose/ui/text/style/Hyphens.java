package androidx.compose.ui.text.style;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int None = m5840constructorimpl(1);
    private static final int Auto = m5840constructorimpl(2);
    private static final int Unspecified = m5840constructorimpl(Integer.MIN_VALUE);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens$Companion;", "", "()V", "Auto", "Landroidx/compose/ui/text/style/Hyphens;", "getAuto-vmbZdU8", "()I", "I", "None", "getNone-vmbZdU8", "Unspecified", "getUnspecified-vmbZdU8", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m5846getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m5847getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m5848getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }
    }

    private /* synthetic */ Hyphens(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m5839boximpl(int i5) {
        return new Hyphens(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5840constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5841equalsimpl(int i5, Object obj) {
        return (obj instanceof Hyphens) && i5 == ((Hyphens) obj).m5845unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5842equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5843hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5844toStringimpl(int i5) {
        if (m5842equalsimpl0(i5, None)) {
            return "Hyphens.None";
        }
        if (m5842equalsimpl0(i5, Auto)) {
            return "Hyphens.Auto";
        }
        if (m5842equalsimpl0(i5, Unspecified)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5841equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5843hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5844toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5845unboximpl() {
        return this.value;
    }
}
