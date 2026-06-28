package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "inputTextStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lineHeightCache", "", "oneLineHeightCache", "resolvedStyle", "coerceMinLines", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "minLines", "", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinLinesConstrainer {

    @m
    private static MinLinesConstrainer last;

    @l
    private final Density density;

    @l
    private final FontFamily.Resolver fontFamilyResolver;

    @l
    private final TextStyle inputTextStyle;

    @l
    private final LayoutDirection layoutDirection;
    private float lineHeightCache;
    private float oneLineHeightCache;

    @l
    private final TextStyle resolvedStyle;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "()V", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", TypedValues.TransitionType.S_FROM, "minMaxUtil", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "paramStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final MinLinesConstrainer from(@m MinLinesConstrainer minLinesConstrainer, @l LayoutDirection layoutDirection, @l TextStyle textStyle, @l Density density, @l FontFamily.Resolver resolver) {
            boolean z4;
            boolean z5 = true;
            if (minLinesConstrainer != null && layoutDirection == minLinesConstrainer.getLayoutDirection() && l0.g(textStyle, minLinesConstrainer.getInputTextStyle())) {
                if (density.getDensity() == minLinesConstrainer.getDensity().getDensity()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && resolver == minLinesConstrainer.getFontFamilyResolver()) {
                    return minLinesConstrainer;
                }
            }
            MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
            if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && l0.g(textStyle, minLinesConstrainer2.getInputTextStyle())) {
                if (density.getDensity() != minLinesConstrainer2.getDensity().getDensity()) {
                    z5 = false;
                }
                if (z5 && resolver == minLinesConstrainer2.getFontFamilyResolver()) {
                    return minLinesConstrainer2;
                }
            }
            MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(textStyle, layoutDirection), density, resolver, null);
            Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer.last = minLinesConstrainer3;
            return minLinesConstrainer3;
        }
    }

    private MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }

    public /* synthetic */ MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver, w wVar) {
        this(layoutDirection, textStyle, density, resolver);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m950coerceMinLinesOh53vG4$foundation_release(long j5, int i5) {
        String str;
        String str2;
        int m6001getMinHeightimpl;
        int L0;
        int u4;
        float f5 = this.oneLineHeightCache;
        float f6 = this.lineHeightCache;
        if (Float.isNaN(f5) || Float.isNaN(f6)) {
            str = MinLinesConstrainerKt.EmptyTextReplacement;
            f5 = ParagraphKt.m5437ParagraphUdtVg6A$default(str, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 1, false, 96, null).getHeight();
            str2 = MinLinesConstrainerKt.TwoLineTextReplacement;
            f6 = ParagraphKt.m5437ParagraphUdtVg6A$default(str2, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, false, 96, null).getHeight() - f5;
            this.oneLineHeightCache = f5;
            this.lineHeightCache = f6;
        }
        if (i5 != 1) {
            L0 = d.L0(f5 + (f6 * (i5 - 1)));
            u4 = u.u(L0, 0);
            m6001getMinHeightimpl = u.B(u4, Constraints.m5999getMaxHeightimpl(j5));
        } else {
            m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        }
        return ConstraintsKt.Constraints(Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5), m6001getMinHeightimpl, Constraints.m5999getMaxHeightimpl(j5));
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @l
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    @l
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
