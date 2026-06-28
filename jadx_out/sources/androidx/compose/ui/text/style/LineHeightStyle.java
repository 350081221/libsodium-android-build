package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.f;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0015\u0017B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "F", "getAlignment-PIaL0Z0", "()F", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "I", "getTrim-EVpEnUU", "()I", "<init>", "(FILkotlin/jvm/internal/w;)V", "Companion", "Alignment", "Trim", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;

    @l
    public static final Companion Companion;

    @l
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int trim;

    @f
    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "topRatio", "", "constructor-impl", "(F)F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Alignment {
        private final float topRatio;

        @l
        public static final Companion Companion = new Companion(null);
        private static final float Top = m5906constructorimpl(0.0f);
        private static final float Center = m5906constructorimpl(0.5f);
        private static final float Proportional = m5906constructorimpl(-1.0f);
        private static final float Bottom = m5906constructorimpl(1.0f);

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "getBottom-PIaL0Z0", "()F", "F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Top", "getTop-PIaL0Z0", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m5912getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m5913getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m5914getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m5915getTopPIaL0Z0() {
                return Alignment.Top;
            }
        }

        private /* synthetic */ Alignment(float f5) {
            this.topRatio = f5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m5905boximpl(float f5) {
            return new Alignment(f5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m5906constructorimpl(float f5) {
            boolean z4 = true;
            if (!(0.0f <= f5 && f5 <= 1.0f)) {
                if (!(f5 == -1.0f)) {
                    z4 = false;
                }
            }
            if (z4) {
                return f5;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5907equalsimpl(float f5, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f5, ((Alignment) obj).m5911unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5908equalsimpl0(float f5, float f6) {
            return Float.compare(f5, f6) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5909hashCodeimpl(float f5) {
            return Float.hashCode(f5);
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5910toStringimpl(float f5) {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = true;
            if (f5 == Top) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f5 == Center) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f5 == Proportional) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f5 != Bottom) {
                z7 = false;
            }
            if (z7) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f5 + ')';
        }

        public boolean equals(Object obj) {
            return m5907equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m5909hashCodeimpl(this.topRatio);
        }

        @l
        public String toString() {
            return m5910toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m5911unboximpl() {
            return this.topRatio;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }
    }

    @f
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", b.f22420d, "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "isTrimFirstLineTop", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimLastLineBottom", "isTrimLastLineBottom-impl$ui_text_release", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;

        @l
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m5917constructorimpl(1);
        private static final int LastLineBottom = m5917constructorimpl(16);
        private static final int Both = m5917constructorimpl(17);
        private static final int None = m5917constructorimpl(0);

        @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "()V", "Both", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "getBoth-EVpEnUU", "()I", "I", "FirstLineTop", "getFirstLineTop-EVpEnUU", "FlagTrimBottom", "", "FlagTrimTop", "LastLineBottom", "getLastLineBottom-EVpEnUU", "None", "getNone-EVpEnUU", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m5925getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m5926getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m5927getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m5928getNoneEVpEnUU() {
                return Trim.None;
            }
        }

        private /* synthetic */ Trim(int i5) {
            this.value = i5;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m5916boximpl(int i5) {
            return new Trim(i5);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5917constructorimpl(int i5) {
            return i5;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5918equalsimpl(int i5, Object obj) {
            return (obj instanceof Trim) && i5 == ((Trim) obj).m5924unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5919equalsimpl0(int i5, int i6) {
            return i5 == i6;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5920hashCodeimpl(int i5) {
            return Integer.hashCode(i5);
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m5921isTrimFirstLineTopimpl$ui_text_release(int i5) {
            return (i5 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m5922isTrimLastLineBottomimpl$ui_text_release(int i5) {
            return (i5 & 16) > 0;
        }

        @l
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5923toStringimpl(int i5) {
            if (i5 == FirstLineTop) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i5 == LastLineBottom) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i5 == Both) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i5 == None) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5918equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5920hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return m5923toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5924unboximpl() {
            return this.value;
        }
    }

    static {
        w wVar = null;
        Companion = new Companion(wVar);
        Default = new LineHeightStyle(Alignment.Companion.m5914getProportionalPIaL0Z0(), Trim.Companion.m5925getBothEVpEnUU(), wVar);
    }

    private LineHeightStyle(float f5, int i5) {
        this.alignment = f5;
        this.trim = i5;
    }

    public /* synthetic */ LineHeightStyle(float f5, int i5, w wVar) {
        this(f5, i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        if (Alignment.m5908equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m5919equalsimpl0(this.trim, lineHeightStyle.trim)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m5903getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m5904getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (Alignment.m5909hashCodeimpl(this.alignment) * 31) + Trim.m5920hashCodeimpl(this.trim);
    }

    @l
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m5910toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m5923toStringimpl(this.trim)) + ')';
    }
}
