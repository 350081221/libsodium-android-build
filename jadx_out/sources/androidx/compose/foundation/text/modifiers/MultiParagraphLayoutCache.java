package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\u0012\u0012\b\b\u0002\u0010*\u001a\u00020\u0016\u0012\b\b\u0002\u0010+\u001a\u00020\u0016\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0018\u00010,¢\u0006\u0004\bU\u0010VJ*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u0012*\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002J^\u00102\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0018\u00010,ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u000e\u00103\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00104\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00105R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00106R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u001c\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u00108R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00109R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00108R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00108R$\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R.\u0010C\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00108R\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00108R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010T\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bS\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Constraints;", "finalConstraints", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult-VKLhPVY", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/MultiParagraph;)Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setLayoutDirection", "constraints", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutText", "", "newLayoutWillBeDifferent-VKLhPVY", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/unit/LayoutDirection;)Z", "newLayoutWillBeDifferent", "", "maxWidth-BRTryo0", "(J)I", "maxWidth", "Lkotlin/r2;", "markDirty", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "update-ZNqEYIc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;)V", "update", "maxIntrinsicWidth", "minIntrinsicWidth", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "lastDensity", "J", "Landroidx/compose/ui/unit/Density;", b.f22420d, "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutCache", "Landroidx/compose/ui/text/TextLayoutResult;", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutOrNull", "layoutOrNull", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @m
    private Density density;

    @l
    private FontFamily.Resolver fontFamilyResolver;

    @m
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;

    @m
    private TextLayoutResult layoutCache;

    @m
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @m
    private MultiParagraphIntrinsics paragraphIntrinsics;

    @m
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;

    @l
    private TextStyle style;

    @l
    private AnnotatedString text;

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        this.placeholders = list;
        this.lastDensity = InlineDensity.Companion.m946getUnspecifiedL26CHvs();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, List list, w wVar) {
        this(annotatedString, textStyle, resolver, i5, z4, i6, i7, list);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m952layoutTextK40F9xA(long j5, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m947finalConstraintstfFHcEY(j5, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m948finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8()), null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    /* renamed from: maxWidth-BRTryo0, reason: not valid java name */
    private final int m953maxWidthBRTryo0(long j5) {
        boolean z4 = this.softWrap;
        int i5 = this.overflow;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        l0.m(multiParagraphIntrinsics);
        return LayoutUtilsKt.m949finalMaxWidthtfFHcEY(j5, z4, i5, multiParagraphIntrinsics.getMaxIntrinsicWidth());
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m954newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j5, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m5993equalsimpl0(j5, textLayoutResult.getLayoutInput().m5513getConstraintsmsEJaDk())) {
            return false;
        }
        if (Constraints.m6000getMaxWidthimpl(j5) != Constraints.m6000getMaxWidthimpl(textLayoutResult.getLayoutInput().m5513getConstraintsmsEJaDk()) || Constraints.m5999getMaxHeightimpl(j5) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            l0.m(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list == null) {
                list = kotlin.collections.w.E();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    private final TextLayoutResult m955textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j5, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list == null) {
            list = kotlin.collections.w.E();
        }
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        int i5 = this.maxLines;
        boolean z4 = this.softWrap;
        int i6 = this.overflow;
        Density density = this.density;
        l0.m(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list2, i5, z4, i6, density, layoutDirection, this.fontFamilyResolver, j5, (w) null), multiParagraph, ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(min), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    @m
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    @m
    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    @l
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i5, @l LayoutDirection layoutDirection) {
        int i6 = this.cachedIntrinsicHeightInputWidth;
        int i7 = this.cachedIntrinsicHeight;
        if (i5 == i6 && i6 != -1) {
            return i7;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m952layoutTextK40F9xA(ConstraintsKt.Constraints(0, i5, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i5;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m956layoutWithConstraintsK40F9xA(long j5, @l LayoutDirection layoutDirection) {
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            l0.m(density);
            MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            j5 = from.m950coerceMinLinesOh53vG4$foundation_release(j5, this.minLines);
        }
        if (!m954newLayoutWillBeDifferentVKLhPVY(this.layoutCache, j5, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            l0.m(textLayoutResult);
            if (Constraints.m5993equalsimpl0(j5, textLayoutResult.getLayoutInput().m5513getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            l0.m(textLayoutResult2);
            this.layoutCache = m955textLayoutResultVKLhPVY(layoutDirection, j5, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.layoutCache = m955textLayoutResultVKLhPVY(layoutDirection, j5, m952layoutTextK40F9xA(j5, layoutDirection));
        return true;
    }

    public final int maxIntrinsicWidth(@l LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@l LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@m Density density) {
        long m946getUnspecifiedL26CHvs;
        Density density2 = this.density;
        if (density != null) {
            m946getUnspecifiedL26CHvs = InlineDensity.m938constructorimpl(density);
        } else {
            m946getUnspecifiedL26CHvs = InlineDensity.Companion.m946getUnspecifiedL26CHvs();
        }
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m946getUnspecifiedL26CHvs;
        } else if (density == null || !InlineDensity.m940equalsimpl0(this.lastDensity, m946getUnspecifiedL26CHvs)) {
            this.density = density;
            this.lastDensity = m946getUnspecifiedL26CHvs;
            markDirty();
        }
    }

    /* renamed from: update-ZNqEYIc, reason: not valid java name */
    public final void m957updateZNqEYIc(@l AnnotatedString annotatedString, @l TextStyle textStyle, @l FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, @m List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        this.placeholders = list;
        markDirty();
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, List list, int i8, w wVar) {
        this(annotatedString, textStyle, resolver, (i8 & 8) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 16) != 0 ? true : z4, (i8 & 32) != 0 ? Integer.MAX_VALUE : i6, (i8 & 64) != 0 ? 1 : i7, (i8 & 128) != 0 ? null : list, null);
    }
}
