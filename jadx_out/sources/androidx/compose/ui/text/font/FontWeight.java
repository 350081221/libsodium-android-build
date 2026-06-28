package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "equals", "", "", TTDownloadField.TT_HASHCODE, "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;

    @l
    private static final FontWeight Black;

    @l
    private static final FontWeight Bold;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final FontWeight ExtraBold;

    @l
    private static final FontWeight ExtraLight;

    @l
    private static final FontWeight Light;

    @l
    private static final FontWeight Medium;

    @l
    private static final FontWeight Normal;

    @l
    private static final FontWeight SemiBold;

    @l
    private static final FontWeight Thin;

    @l
    private static final FontWeight W100;

    @l
    private static final FontWeight W200;

    @l
    private static final FontWeight W300;

    @l
    private static final FontWeight W400;

    @l
    private static final FontWeight W500;

    @l
    private static final FontWeight W600;

    @l
    private static final FontWeight W700;

    @l
    private static final FontWeight W800;

    @l
    private static final FontWeight W900;

    @l
    private static final List<FontWeight> values;
    private final int weight;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R\u001c\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }

        @l
        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        @l
        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        @l
        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        @l
        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        @l
        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        @l
        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        @l
        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        @l
        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        @l
        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        @l
        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.values;
        }

        @l
        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        @l
        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        @l
        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        @l
        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        @l
        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        @l
        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        @l
        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        @l
        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        @l
        public final FontWeight getW900() {
            return FontWeight.W900;
        }
    }

    static {
        List<FontWeight> L;
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(TypedValues.TransitionType.TYPE_DURATION);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(TypedValues.Custom.TYPE_INT);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        L = kotlin.collections.w.L(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
        values = L;
    }

    public FontWeight(int i5) {
        this.weight = i5;
        boolean z4 = false;
        if (1 <= i5 && i5 < 1001) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i5).toString());
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FontWeight) && this.weight == ((FontWeight) obj).weight) {
            return true;
        }
        return false;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    @l
    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(@l FontWeight fontWeight) {
        return l0.t(this.weight, fontWeight.weight);
    }
}
