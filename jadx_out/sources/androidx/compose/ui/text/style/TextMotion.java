package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.f;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "copy", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "I", "getLinearity-4e0Vf04$ui_text_release", "()I", "Z", "getSubpixelTextPositioning$ui_text_release", "()Z", "<init>", "(IZLkotlin/jvm/internal/w;)V", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;

    @l
    private static final TextMotion Animated;

    @l
    public static final Companion Companion;

    @l
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        @l
        public final TextMotion getStatic() {
            return TextMotion.Static;
        }
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Linearity {
        private final int value;

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m5966constructorimpl(1);
        private static final int FontHinting = m5966constructorimpl(2);
        private static final int None = m5966constructorimpl(3);

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", "I", "Linear", "getLinear-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m5972getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m5973getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m5974getNone4e0Vf04() {
                return Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m5965boximpl(int i5) {
            return new Linearity(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5966constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5967equalsimpl(int i5, Object obj) {
            return (obj instanceof Linearity) && i5 == ((Linearity) obj).m5971unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5968equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5969hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5970toStringimpl(int i5) {
            if (m5968equalsimpl0(i5, Linear)) {
                return "Linearity.Linear";
            }
            if (m5968equalsimpl0(i5, FontHinting)) {
                return "Linearity.FontHinting";
            }
            if (m5968equalsimpl0(i5, None)) {
                return "Linearity.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5967equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5969hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m5970toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5971unboximpl() {
            return this.value;
        }
    }

    static {
        w wVar = null;
        Companion = new Companion(wVar);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m5972getFontHinting4e0Vf04(), false, wVar);
        Animated = new TextMotion(companion.m5973getLinear4e0Vf04(), true, wVar);
    }

    private TextMotion(int i5, boolean z4) {
        this.linearity = i5;
        this.subpixelTextPositioning = z4;
    }

    public /* synthetic */ TextMotion(int i5, boolean z4, w wVar) {
        this(i5, z4);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m5962copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = textMotion.linearity;
        }
        if ((i6 & 2) != 0) {
            z4 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m5963copyJdDtMQo$ui_text_release(i5, z4);
    }

    @l
    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m5963copyJdDtMQo$ui_text_release(int i5, boolean z4) {
        return new TextMotion(i5, z4, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        if (Linearity.m5968equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning) {
            return true;
        }
        return false;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m5964getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m5969hashCodeimpl(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    @l
    public String toString() {
        if (l0.g(this, Static)) {
            return "TextMotion.Static";
        }
        if (l0.g(this, Animated)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
