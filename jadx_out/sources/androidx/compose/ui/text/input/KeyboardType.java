package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import u3.f;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", t0.b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Text = m5754constructorimpl(1);
    private static final int Ascii = m5754constructorimpl(2);
    private static final int Number = m5754constructorimpl(3);
    private static final int Phone = m5754constructorimpl(4);
    private static final int Uri = m5754constructorimpl(5);
    private static final int Email = m5754constructorimpl(6);
    private static final int Password = m5754constructorimpl(7);
    private static final int NumberPassword = m5754constructorimpl(8);
    private static final int Decimal = m5754constructorimpl(9);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "()V", "Ascii", "Landroidx/compose/ui/text/input/KeyboardType;", "getAscii-PjHm6EE$annotations", "getAscii-PjHm6EE", "()I", "I", "Decimal", "getDecimal-PjHm6EE$annotations", "getDecimal-PjHm6EE", "Email", "getEmail-PjHm6EE$annotations", "getEmail-PjHm6EE", "Number", "getNumber-PjHm6EE$annotations", "getNumber-PjHm6EE", "NumberPassword", "getNumberPassword-PjHm6EE$annotations", "getNumberPassword-PjHm6EE", "Password", "getPassword-PjHm6EE$annotations", "getPassword-PjHm6EE", "Phone", "getPhone-PjHm6EE$annotations", "getPhone-PjHm6EE", "Text", "getText-PjHm6EE$annotations", "getText-PjHm6EE", "Uri", "getUri-PjHm6EE$annotations", "getUri-PjHm6EE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5760getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5761getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5762getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5763getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5764getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5765getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5766getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5767getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5768getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m5769getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m5770getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m5771getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m5772getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m5773getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m5774getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m5775getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m5776getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m5777getUriPjHm6EE() {
            return KeyboardType.Uri;
        }
    }

    private /* synthetic */ KeyboardType(int i5) {
        this.value = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m5753boximpl(int i5) {
        return new KeyboardType(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5754constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5755equalsimpl(int i5, Object obj) {
        return (obj instanceof KeyboardType) && i5 == ((KeyboardType) obj).m5759unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5756equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5757hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5758toStringimpl(int i5) {
        if (m5756equalsimpl0(i5, Text)) {
            return "Text";
        }
        if (m5756equalsimpl0(i5, Ascii)) {
            return "Ascii";
        }
        if (m5756equalsimpl0(i5, Number)) {
            return "Number";
        }
        if (m5756equalsimpl0(i5, Phone)) {
            return "Phone";
        }
        if (m5756equalsimpl0(i5, Uri)) {
            return "Uri";
        }
        if (m5756equalsimpl0(i5, Email)) {
            return "Email";
        }
        if (m5756equalsimpl0(i5, Password)) {
            return "Password";
        }
        if (m5756equalsimpl0(i5, NumberPassword)) {
            return "NumberPassword";
        }
        if (m5756equalsimpl0(i5, Decimal)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5755equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5757hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m5758toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5759unboximpl() {
        return this.value;
    }
}
