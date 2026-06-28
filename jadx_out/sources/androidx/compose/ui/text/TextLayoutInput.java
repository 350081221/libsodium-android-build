package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bD\u0010EBe\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bD\u0010FBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bD\u0010GJ\u0082\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0015\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/unit/Constraints;", "constraints", "copy-hu-1Yfo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Landroidx/compose/ui/text/TextLayoutInput;", "copy", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "I", "getMaxLines", "()I", "Z", "getSoftWrap", "()Z", "getOverflow-gIe3tQ8", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "J", "getConstraints-msEJaDk", "()J", "_developerSuppliedResourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader$annotations", "()V", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;JLkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;

    @m
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;

    @l
    private final Density density;

    @l
    private final FontFamily.Resolver fontFamilyResolver;

    @l
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;

    @l
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;

    @l
    private final TextStyle style;

    @l
    private final AnnotatedString text;

    @k(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @b1(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j5, w wVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i5, z4, i6, density, layoutDirection, resourceLoader, j5);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j5) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i5;
        this.softWrap = z4;
        this.overflow = i6;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j5;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j5, w wVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i5, z4, i6, density, layoutDirection, resolver, j5);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m5511copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j5, int i7, Object obj) {
        AnnotatedString annotatedString2;
        TextStyle textStyle2;
        List list2;
        int i8;
        boolean z5;
        int i9;
        Density density2;
        LayoutDirection layoutDirection2;
        Font.ResourceLoader resourceLoader2;
        long j6;
        if ((i7 & 1) != 0) {
            annotatedString2 = textLayoutInput.text;
        } else {
            annotatedString2 = annotatedString;
        }
        if ((i7 & 2) != 0) {
            textStyle2 = textLayoutInput.style;
        } else {
            textStyle2 = textStyle;
        }
        if ((i7 & 4) != 0) {
            list2 = textLayoutInput.placeholders;
        } else {
            list2 = list;
        }
        if ((i7 & 8) != 0) {
            i8 = textLayoutInput.maxLines;
        } else {
            i8 = i5;
        }
        if ((i7 & 16) != 0) {
            z5 = textLayoutInput.softWrap;
        } else {
            z5 = z4;
        }
        if ((i7 & 32) != 0) {
            i9 = textLayoutInput.overflow;
        } else {
            i9 = i6;
        }
        if ((i7 & 64) != 0) {
            density2 = textLayoutInput.density;
        } else {
            density2 = density;
        }
        if ((i7 & 128) != 0) {
            layoutDirection2 = textLayoutInput.layoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i7 & 256) != 0) {
            resourceLoader2 = textLayoutInput.getResourceLoader();
        } else {
            resourceLoader2 = resourceLoader;
        }
        if ((i7 & 512) != 0) {
            j6 = textLayoutInput.constraints;
        } else {
            j6 = j5;
        }
        return textLayoutInput.m5512copyhu1Yfo(annotatedString2, textStyle2, list2, i8, z5, i9, density2, layoutDirection2, resourceLoader2, j6);
    }

    @k(message = "Replaced with FontFamily.Resolver", replaceWith = @b1(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    @l
    @k(message = "Font.ResourceLoader is deprecated", replaceWith = @b1(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m5512copyhu1Yfo(@l AnnotatedString annotatedString, @l TextStyle textStyle, @l List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4, int i6, @l Density density, @l LayoutDirection layoutDirection, @l Font.ResourceLoader resourceLoader, long j5) {
        return new TextLayoutInput(annotatedString, textStyle, list, i5, z4, i6, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        if (l0.g(this.text, textLayoutInput.text) && l0.g(this.style, textLayoutInput.style) && l0.g(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m5978equalsimpl0(this.overflow, textLayoutInput.overflow) && l0.g(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && l0.g(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m5993equalsimpl0(this.constraints, textLayoutInput.constraints)) {
            return true;
        }
        return false;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m5513getConstraintsmsEJaDk() {
        return this.constraints;
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

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m5514getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @l
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @l
    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        if (resourceLoader == null) {
            return DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver);
        }
        return resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @l
    public final TextStyle getStyle() {
        return this.style;
    }

    @l
    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + TextOverflow.m5979hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m6003hashCodeimpl(this.constraints);
    }

    @l
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m5980toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m6005toStringimpl(this.constraints)) + ')';
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j5) {
        this(annotatedString, textStyle, list, i5, z4, i6, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j5);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i5, boolean z4, int i6, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j5) {
        this(annotatedString, textStyle, list, i5, z4, i6, density, layoutDirection, (Font.ResourceLoader) null, resolver, j5);
    }
}
