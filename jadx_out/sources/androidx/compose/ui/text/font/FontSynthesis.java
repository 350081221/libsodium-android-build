package androidx.compose.ui.text.font;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "isStyleOn", "", "isStyleOn-impl$ui_text_release", "(I)Z", "isWeightOn", "isWeightOn-impl$ui_text_release", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int None = m5663constructorimpl(0);
    private static final int All = m5663constructorimpl(1);
    private static final int Weight = m5663constructorimpl(2);
    private static final int Style = m5663constructorimpl(3);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "()V", "All", "Landroidx/compose/ui/text/font/FontSynthesis;", "getAll-GVVA2EU", "()I", "I", "None", "getNone-GVVA2EU", "Style", "getStyle-GVVA2EU", "Weight", "getWeight-GVVA2EU", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m5671getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m5672getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m5673getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m5674getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }
    }

    private /* synthetic */ FontSynthesis(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m5662boximpl(int i5) {
        return new FontSynthesis(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5663constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5664equalsimpl(int i5, Object obj) {
        return (obj instanceof FontSynthesis) && i5 == ((FontSynthesis) obj).m5670unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5665equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5666hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m5667isStyleOnimpl$ui_text_release(int i5) {
        return m5665equalsimpl0(i5, All) || m5665equalsimpl0(i5, Style);
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m5668isWeightOnimpl$ui_text_release(int i5) {
        return m5665equalsimpl0(i5, All) || m5665equalsimpl0(i5, Weight);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5669toStringimpl(int i5) {
        if (m5665equalsimpl0(i5, None)) {
            return "None";
        }
        if (m5665equalsimpl0(i5, All)) {
            return "All";
        }
        if (m5665equalsimpl0(i5, Weight)) {
            return "Weight";
        }
        if (m5665equalsimpl0(i5, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5664equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5666hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5669toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5670unboximpl() {
        return this.value;
    }
}
