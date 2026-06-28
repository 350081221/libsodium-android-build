package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008a\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jt\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;

    @l
    private final Density defaultDensity;

    @l
    private final FontFamily.Resolver defaultFontFamilyResolver;

    @l
    private final LayoutDirection defaultLayoutDirection;

    @m
    private final TextLayoutCache textLayoutCache;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            boolean z4;
            int i5;
            int maxLines;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(textLayoutInput.m5513getConstraintsmsEJaDk());
            boolean z5 = false;
            if (!textLayoutInput.getSoftWrap() && !TextOverflow.m5978equalsimpl0(textLayoutInput.m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5986getEllipsisgIe3tQ8())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 && Constraints.m5996getHasBoundedWidthimpl(textLayoutInput.m5513getConstraintsmsEJaDk())) {
                i5 = Constraints.m6000getMaxWidthimpl(textLayoutInput.m5513getConstraintsmsEJaDk());
            } else {
                i5 = Integer.MAX_VALUE;
            }
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m5978equalsimpl0(textLayoutInput.m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5986getEllipsisgIe3tQ8())) {
                z5 = true;
            }
            if (z5) {
                maxLines = 1;
            } else {
                maxLines = textLayoutInput.getMaxLines();
            }
            if (m6002getMinWidthimpl != i5) {
                i5 = u.I(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m6002getMinWidthimpl, i5);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, i5, 0, Constraints.m5999getMaxHeightimpl(textLayoutInput.m5513getConstraintsmsEJaDk()), 5, null), maxLines, TextOverflow.m5978equalsimpl0(textLayoutInput.m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5986getEllipsisgIe3tQ8()), null), ConstraintsKt.m6011constrain4WqzIAM(textLayoutInput.m5513getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) Math.ceil(r2.getWidth()), (int) Math.ceil(r2.getHeight()))), null);
        }
    }

    public TextMeasurer(@l FontFamily.Resolver resolver, @l Density density, @l LayoutDirection layoutDirection, int i5) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i5;
        this.textLayoutCache = i5 > 0 ? new TextLayoutCache(i5) : null;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m5520measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i5, boolean z4, int i6, long j5, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z5, int i7, Object obj) {
        TextStyle textStyle2;
        int i8;
        boolean z6;
        int i9;
        long j6;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z7;
        if ((i7 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i7 & 4) != 0) {
            i8 = TextOverflow.Companion.m5985getClipgIe3tQ8();
        } else {
            i8 = i5;
        }
        if ((i7 & 8) != 0) {
            z6 = true;
        } else {
            z6 = z4;
        }
        if ((i7 & 16) != 0) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = i6;
        }
        if ((i7 & 32) != 0) {
            j6 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j6 = j5;
        }
        if ((i7 & 64) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i7 & 128) != 0) {
            density2 = textMeasurer.defaultDensity;
        } else {
            density2 = density;
        }
        if ((i7 & 256) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i7 & 512) != 0) {
            z7 = false;
        } else {
            z7 = z5;
        }
        return textMeasurer.m5522measurewNUYSr0(str, textStyle2, i8, z6, i9, j6, layoutDirection2, density2, resolver2, z7);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m5521measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i5, boolean z4, int i6, List list, long j5, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z5, int i7, Object obj) {
        TextStyle textStyle2;
        int i8;
        boolean z6;
        int i9;
        List list2;
        long j6;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z7;
        if ((i7 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i7 & 4) != 0) {
            i8 = TextOverflow.Companion.m5985getClipgIe3tQ8();
        } else {
            i8 = i5;
        }
        if ((i7 & 8) != 0) {
            z6 = true;
        } else {
            z6 = z4;
        }
        if ((i7 & 16) != 0) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = i6;
        }
        if ((i7 & 32) != 0) {
            list2 = kotlin.collections.w.E();
        } else {
            list2 = list;
        }
        if ((i7 & 64) != 0) {
            j6 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j6 = j5;
        }
        if ((i7 & 128) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i7 & 256) != 0) {
            density2 = textMeasurer.defaultDensity;
        } else {
            density2 = density;
        }
        if ((i7 & 512) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i7 & 1024) != 0) {
            z7 = false;
        } else {
            z7 = z5;
        }
        return textMeasurer.m5523measurexDpz5zY(annotatedString, textStyle2, i8, z6, i9, list2, j6, layoutDirection2, density2, resolver2, z7);
    }

    @Stable
    @l
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m5522measurewNUYSr0(@l String str, @l TextStyle textStyle, int i5, boolean z4, int i6, long j5, @l LayoutDirection layoutDirection, @l Density density, @l FontFamily.Resolver resolver, boolean z5) {
        return m5521measurexDpz5zY$default(this, new AnnotatedString(str, null, null, 6, null), textStyle, i5, z4, i6, null, j5, layoutDirection, density, resolver, z5, 32, null);
    }

    @Stable
    @l
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m5523measurexDpz5zY(@l AnnotatedString annotatedString, @l TextStyle textStyle, int i5, boolean z4, int i6, @l List<AnnotatedString.Range<Placeholder>> list, long j5, @l LayoutDirection layoutDirection, @l Density density, @l FontFamily.Resolver resolver, boolean z5) {
        TextLayoutResult textLayoutResult;
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i6, z4, i5, density, layoutDirection, resolver, j5, (w) null);
        if (!z5 && (textLayoutCache = this.textLayoutCache) != null) {
            textLayoutResult = textLayoutCache.get(textLayoutInput);
        } else {
            textLayoutResult = null;
        }
        if (textLayoutResult != null) {
            return textLayoutResult.m5516copyO0kMr_c(textLayoutInput, ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult layout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, layout);
            return layout;
        }
        return layout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i5, int i6, w wVar) {
        this(resolver, density, layoutDirection, (i6 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i5);
    }
}
