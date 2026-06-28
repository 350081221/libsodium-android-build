package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b.\u0010/J\u0015\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u000e\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00028\u0006@BX\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/TextFieldSize;", "", "Landroidx/compose/ui/unit/IntSize;", "computeMinSize-YbymL2g", "()J", "computeMinSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/TextStyle;", "resolvedStyle", "typeface", "Lkotlin/r2;", "update", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/TextStyle;", "getResolvedStyle", "()Landroidx/compose/ui/text/TextStyle;", "setResolvedStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "Ljava/lang/Object;", "getTypeface", "()Ljava/lang/Object;", "setTypeface", "(Ljava/lang/Object;)V", "<set-?>", "minSize", "J", "getMinSize-YbymL2g", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/TextStyle;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldSize {

    @l
    private Density density;

    @l
    private FontFamily.Resolver fontFamilyResolver;

    @l
    private LayoutDirection layoutDirection;
    private long minSize = m919computeMinSizeYbymL2g();

    @l
    private TextStyle resolvedStyle;

    @l
    private Object typeface;

    public TextFieldSize(@l LayoutDirection layoutDirection, @l Density density, @l FontFamily.Resolver resolver, @l TextStyle textStyle, @l Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    /* renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m919computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
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
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m920getMinSizeYbymL2g() {
        return this.minSize;
    }

    @l
    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    @l
    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(@l Density density) {
        this.density = density;
    }

    public final void setFontFamilyResolver(@l FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(@l LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setResolvedStyle(@l TextStyle textStyle) {
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(@l Object obj) {
        this.typeface = obj;
    }

    public final void update(@l LayoutDirection layoutDirection, @l Density density, @l FontFamily.Resolver resolver, @l TextStyle textStyle, @l Object obj) {
        if (layoutDirection != this.layoutDirection || !l0.g(density, this.density) || !l0.g(resolver, this.fontFamilyResolver) || !l0.g(textStyle, this.resolvedStyle) || !l0.g(obj, this.typeface)) {
            this.layoutDirection = layoutDirection;
            this.density = density;
            this.fontFamilyResolver = resolver;
            this.resolvedStyle = textStyle;
            this.typeface = obj;
            this.minSize = m919computeMinSizeYbymL2g();
        }
    }
}
