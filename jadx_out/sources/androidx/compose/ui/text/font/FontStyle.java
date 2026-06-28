package androidx.compose.ui.text.font;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m5652constructorimpl(0);
    private static final int Italic = m5652constructorimpl(1);

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u001f\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "()V", "Italic", "Landroidx/compose/ui/text/font/FontStyle;", "getItalic-_-LCdwA$annotations", "getItalic-_-LCdwA", "()I", "I", "Normal", "getNormal-_-LCdwA$annotations", "getNormal-_-LCdwA", "values", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m5658getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m5659getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m5660getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m5661getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        @l
        public final List<FontStyle> values() {
            List<FontStyle> L;
            L = kotlin.collections.w.L(FontStyle.m5651boximpl(m5661getNormal_LCdwA()), FontStyle.m5651boximpl(m5660getItalic_LCdwA()));
            return L;
        }
    }

    @k(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @b1(expression = "FontStyle.", imports = {}))
    private /* synthetic */ FontStyle(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m5651boximpl(int i5) {
        return new FontStyle(i5);
    }

    @k(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @b1(expression = "FontStyle.", imports = {}))
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5652constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5653equalsimpl(int i5, Object obj) {
        return (obj instanceof FontStyle) && i5 == ((FontStyle) obj).m5657unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5654equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5655hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5656toStringimpl(int i5) {
        if (m5654equalsimpl0(i5, Normal)) {
            return "Normal";
        }
        if (m5654equalsimpl0(i5, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5653equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5655hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5656toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5657unboximpl() {
        return this.value;
    }
}
