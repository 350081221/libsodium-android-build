package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;
import u3.f;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001e\u001f !B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u0088\u0001\n\u0092\u0001\u00020\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "wordBreak", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "constructor-impl", "(III)I", "mask", "", "(I)I", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "copy", "copy-gijOMQM", "(IIII)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "Strategy", "Strictness", "WordBreak", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@f
/* loaded from: classes.dex */
public final class LineBreak {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k$annotations", "getHeading-rAG3T2k", "()I", "I", "Paragraph", "getParagraph-rAG3T2k$annotations", "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k$annotations", "getSimple-rAG3T2k", "Unspecified", "getUnspecified-rAG3T2k$annotations", "getUnspecified-rAG3T2k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5862getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5863getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5864getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5865getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m5866getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m5867getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m5868getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m5869getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Strategy {
        private final int value;

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m5871constructorimpl(1);
        private static final int HighQuality = m5871constructorimpl(2);
        private static final int Balanced = m5871constructorimpl(3);
        private static final int Unspecified = m5871constructorimpl(0);

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "()V", "Balanced", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getBalanced-fcGXIks", "()I", "I", "HighQuality", "getHighQuality-fcGXIks", "Simple", "getSimple-fcGXIks", "Unspecified", "getUnspecified-fcGXIks", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m5877getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m5878getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m5879getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m5880getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }
        }

        private /* synthetic */ Strategy(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m5870boximpl(int i5) {
            return new Strategy(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5871constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5872equalsimpl(int i5, Object obj) {
            return (obj instanceof Strategy) && i5 == ((Strategy) obj).m5876unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5873equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5874hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5875toStringimpl(int i5) {
            if (m5873equalsimpl0(i5, Simple)) {
                return "Strategy.Simple";
            }
            if (m5873equalsimpl0(i5, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m5873equalsimpl0(i5, Balanced)) {
                return "Strategy.Balanced";
            }
            if (m5873equalsimpl0(i5, Unspecified)) {
                return "Strategy.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5872equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5874hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m5875toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5876unboximpl() {
            return this.value;
        }
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Strictness {

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5882constructorimpl(1);
        private static final int Loose = m5882constructorimpl(2);
        private static final int Normal = m5882constructorimpl(3);
        private static final int Strict = m5882constructorimpl(4);
        private static final int Unspecified = m5882constructorimpl(0);
        private final int value;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getDefault-usljTpc", "()I", "I", "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "Unspecified", "getUnspecified-usljTpc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m5888getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m5889getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m5890getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m5891getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m5892getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }
        }

        private /* synthetic */ Strictness(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m5881boximpl(int i5) {
            return new Strictness(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5882constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5883equalsimpl(int i5, Object obj) {
            return (obj instanceof Strictness) && i5 == ((Strictness) obj).m5887unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5884equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5885hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5886toStringimpl(int i5) {
            if (m5884equalsimpl0(i5, Default)) {
                return "Strictness.None";
            }
            if (m5884equalsimpl0(i5, Loose)) {
                return "Strictness.Loose";
            }
            if (m5884equalsimpl0(i5, Normal)) {
                return "Strictness.Normal";
            }
            if (m5884equalsimpl0(i5, Strict)) {
                return "Strictness.Strict";
            }
            if (m5884equalsimpl0(i5, Unspecified)) {
                return "Strictness.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5883equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5885hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m5886toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5887unboximpl() {
            return this.value;
        }
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class WordBreak {

        @l
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5894constructorimpl(1);
        private static final int Phrase = m5894constructorimpl(2);
        private static final int Unspecified = m5894constructorimpl(0);
        private final int value;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getDefault-jp8hJ3c", "()I", "I", "Phrase", "getPhrase-jp8hJ3c", "Unspecified", "getUnspecified-jp8hJ3c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m5900getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m5901getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m5902getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }
        }

        private /* synthetic */ WordBreak(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m5893boximpl(int i5) {
            return new WordBreak(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5894constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5895equalsimpl(int i5, Object obj) {
            return (obj instanceof WordBreak) && i5 == ((WordBreak) obj).m5899unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5896equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5897hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5898toStringimpl(int i5) {
            if (m5896equalsimpl0(i5, Default)) {
                return "WordBreak.None";
            }
            if (m5896equalsimpl0(i5, Phrase)) {
                return "WordBreak.Phrase";
            }
            if (m5896equalsimpl0(i5, Unspecified)) {
                return "WordBreak.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5895equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5897hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m5898toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5899unboximpl() {
            return this.value;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m5879getSimplefcGXIks = companion.m5879getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m5890getNormalusljTpc = companion2.m5890getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m5879getSimplefcGXIks, m5890getNormalusljTpc, companion3.m5900getDefaultjp8hJ3c());
        Simple = m5850constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m5877getBalancedfcGXIks(), companion2.m5889getLooseusljTpc(), companion3.m5901getPhrasejp8hJ3c());
        Heading = m5850constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m5878getHighQualityfcGXIks(), companion2.m5891getStrictusljTpc(), companion3.m5900getDefaultjp8hJ3c());
        Paragraph = m5850constructorimpl(packBytes3);
        Unspecified = m5850constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i5) {
        this.mask = i5;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m5849boximpl(int i5) {
        return new LineBreak(i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5850constructorimpl(int i5) {
        return i5;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5851constructorimpl(int i5, int i6, int i7) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i5, i6, i7);
        return m5850constructorimpl(packBytes);
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m5852copygijOMQM(int i5, int i6, int i7, int i8) {
        return m5851constructorimpl(i6, i7, i8);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m5853copygijOMQM$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i6 = m5856getStrategyfcGXIks(i5);
        }
        if ((i9 & 2) != 0) {
            i7 = m5857getStrictnessusljTpc(i5);
        }
        if ((i9 & 4) != 0) {
            i8 = m5858getWordBreakjp8hJ3c(i5);
        }
        return m5852copygijOMQM(i5, i6, i7, i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5854equalsimpl(int i5, Object obj) {
        return (obj instanceof LineBreak) && i5 == ((LineBreak) obj).m5861unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5855equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m5856getStrategyfcGXIks(int i5) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i5);
        return Strategy.m5871constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m5857getStrictnessusljTpc(int i5) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i5);
        return Strictness.m5882constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m5858getWordBreakjp8hJ3c(int i5) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i5);
        return WordBreak.m5894constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5859hashCodeimpl(int i5) {
        return Integer.hashCode(i5);
    }

    @l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5860toStringimpl(int i5) {
        return "LineBreak(strategy=" + ((Object) Strategy.m5875toStringimpl(m5856getStrategyfcGXIks(i5))) + ", strictness=" + ((Object) Strictness.m5886toStringimpl(m5857getStrictnessusljTpc(i5))) + ", wordBreak=" + ((Object) WordBreak.m5898toStringimpl(m5858getWordBreakjp8hJ3c(i5))) + ')';
    }

    public boolean equals(Object obj) {
        return m5854equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m5859hashCodeimpl(this.mask);
    }

    @l
    public String toString() {
        return m5860toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5861unboximpl() {
        return this.mask;
    }
}
