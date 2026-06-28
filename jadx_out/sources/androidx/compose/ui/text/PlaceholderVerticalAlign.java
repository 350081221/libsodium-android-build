package androidx.compose.ui.text;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m5470constructorimpl(1);
    private static final int Top = m5470constructorimpl(2);
    private static final int Bottom = m5470constructorimpl(3);
    private static final int Center = m5470constructorimpl(4);
    private static final int TextTop = m5470constructorimpl(5);
    private static final int TextBottom = m5470constructorimpl(6);
    private static final int TextCenter = m5470constructorimpl(7);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/PlaceholderVerticalAlign$Companion;", "", "()V", "AboveBaseline", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getAboveBaseline-J6kI3mc", "()I", "I", "Bottom", "getBottom-J6kI3mc", "Center", "getCenter-J6kI3mc", "TextBottom", "getTextBottom-J6kI3mc", "TextCenter", "getTextCenter-J6kI3mc", "TextTop", "getTextTop-J6kI3mc", "Top", "getTop-J6kI3mc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m5476getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m5477getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m5478getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m5479getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m5480getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m5481getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m5482getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m5469boximpl(int i5) {
        return new PlaceholderVerticalAlign(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5470constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5471equalsimpl(int i5, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i5 == ((PlaceholderVerticalAlign) obj).m5475unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5472equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5473hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5474toStringimpl(int i5) {
        if (m5472equalsimpl0(i5, AboveBaseline)) {
            return "AboveBaseline";
        }
        if (m5472equalsimpl0(i5, Top)) {
            return "Top";
        }
        if (m5472equalsimpl0(i5, Bottom)) {
            return "Bottom";
        }
        if (m5472equalsimpl0(i5, Center)) {
            return "Center";
        }
        if (m5472equalsimpl0(i5, TextTop)) {
            return "TextTop";
        }
        if (m5472equalsimpl0(i5, TextBottom)) {
            return "TextBottom";
        }
        if (m5472equalsimpl0(i5, TextCenter)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5471equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5473hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5474toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5475unboximpl() {
        return this.value;
    }
}
