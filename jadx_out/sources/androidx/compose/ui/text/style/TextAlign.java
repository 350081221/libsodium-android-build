package androidx.compose.ui.text.style;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Left = m5930constructorimpl(1);
    private static final int Right = m5930constructorimpl(2);
    private static final int Center = m5930constructorimpl(3);
    private static final int Justify = m5930constructorimpl(4);
    private static final int Start = m5930constructorimpl(5);
    private static final int End = m5930constructorimpl(6);
    private static final int Unspecified = m5930constructorimpl(Integer.MIN_VALUE);

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign$Companion;", "", "()V", "Center", "Landroidx/compose/ui/text/style/TextAlign;", "getCenter-e0LSkKk", "()I", "I", "End", "getEnd-e0LSkKk", "Justify", "getJustify-e0LSkKk", "Left", "getLeft-e0LSkKk", "Right", "getRight-e0LSkKk", "Start", "getStart-e0LSkKk", "Unspecified", "getUnspecified-e0LSkKk", "values", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m5936getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m5937getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m5938getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m5939getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m5940getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m5941getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m5942getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        @l
        public final List<TextAlign> values() {
            List<TextAlign> L;
            L = kotlin.collections.w.L(TextAlign.m5929boximpl(m5939getLefte0LSkKk()), TextAlign.m5929boximpl(m5940getRighte0LSkKk()), TextAlign.m5929boximpl(m5936getCentere0LSkKk()), TextAlign.m5929boximpl(m5938getJustifye0LSkKk()), TextAlign.m5929boximpl(m5941getStarte0LSkKk()), TextAlign.m5929boximpl(m5937getEnde0LSkKk()));
            return L;
        }
    }

    private /* synthetic */ TextAlign(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m5929boximpl(int i5) {
        return new TextAlign(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5930constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5931equalsimpl(int i5, Object obj) {
        return (obj instanceof TextAlign) && i5 == ((TextAlign) obj).m5935unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5932equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5933hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5934toStringimpl(int i5) {
        if (m5932equalsimpl0(i5, Left)) {
            return "Left";
        }
        if (m5932equalsimpl0(i5, Right)) {
            return "Right";
        }
        if (m5932equalsimpl0(i5, Center)) {
            return "Center";
        }
        if (m5932equalsimpl0(i5, Justify)) {
            return "Justify";
        }
        if (m5932equalsimpl0(i5, Start)) {
            return "Start";
        }
        if (m5932equalsimpl0(i5, End)) {
            return "End";
        }
        if (m5932equalsimpl0(i5, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5931equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5933hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5934toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5935unboximpl() {
        return this.value;
    }
}
