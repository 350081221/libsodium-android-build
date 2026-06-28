package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\u0014¢\u0006\u0004\bW\u0010XJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002JH\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010'\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u001c\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,R\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u001c\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100R.\u00103\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010E\u001a\u00020D8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u00100\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bQ\u00100R\u0016\u0010R\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010,R\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010,R\u0014\u0010V\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "setLayoutDirection", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/Paragraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutText", "", "newLayoutWillBeDifferent-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "newLayoutWillBeDifferent", "Lkotlin/r2;", "markDirty", "layoutWithConstraints-K40F9xA", "layoutWithConstraints", "", "width", "intrinsicHeight", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "softWrap", "maxLines", "minLines", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "minIntrinsicWidth", "maxIntrinsicWidth", "Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "lastDensity", "J", "Landroidx/compose/ui/unit/Density;", b.f22420d, "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "didOverflow", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "prevConstraints", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "getObserveFontChanges$foundation_release", "()Lkotlin/r2;", "observeFontChanges", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n1#2:395\n*E\n"})
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;

    @m
    private Density density;
    private boolean didOverflow;

    @l
    private FontFamily.Resolver fontFamilyResolver;

    @m
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;

    @m
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;

    @m
    private Paragraph paragraph;

    @m
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;

    @l
    private TextStyle style;

    @l
    private String text;

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        this.lastDensity = InlineDensity.Companion.m946getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.Companion.m6008fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, w wVar) {
        this(str, textStyle, resolver, i5, z4, i6, i7);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final Paragraph m958layoutTextK40F9xA(long j5, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m5438Paragraph_EkL_Y(layoutDirection2, LayoutUtilsKt.m947finalConstraintstfFHcEY(j5, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m948finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8()));
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m6008fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m959newLayoutWillBeDifferentK40F9xA(long j5, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m5993equalsimpl0(j5, this.prevConstraints)) {
            return false;
        }
        if (Constraints.m6000getMaxWidthimpl(j5) != Constraints.m6000getMaxWidthimpl(this.prevConstraints) || Constraints.m5999getMaxHeightimpl(j5) < paragraph.getHeight() || paragraph.getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            l0.m(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, resolveDefaults, (List) null, (List) null, density, this.fontFamilyResolver, 12, (Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    @m
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m960getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    @l
    public final r2 getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return r2.f19517a;
    }

    @m
    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i5, @l LayoutDirection layoutDirection) {
        int i6 = this.cachedIntrinsicHeightInputWidth;
        int i7 = this.cachedIntrinsicHeight;
        if (i5 == i6 && i6 != -1) {
            return i7;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m958layoutTextK40F9xA(ConstraintsKt.Constraints(0, i5, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i5;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m961layoutWithConstraintsK40F9xA(long j5, @l LayoutDirection layoutDirection) {
        boolean z4 = true;
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
        boolean z5 = false;
        if (!m959newLayoutWillBeDifferentK40F9xA(j5, layoutDirection)) {
            if (!Constraints.m5993equalsimpl0(j5, this.prevConstraints)) {
                Paragraph paragraph = this.paragraph;
                l0.m(paragraph);
                this.layoutSize = ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(Math.min(paragraph.getMaxIntrinsicWidth(), paragraph.getWidth())), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                if (TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5987getVisiblegIe3tQ8()) || (IntSize.m6214getWidthimpl(r3) >= paragraph.getWidth() && IntSize.m6213getHeightimpl(r3) >= paragraph.getHeight())) {
                    z4 = false;
                }
                this.didOverflow = z4;
                this.prevConstraints = j5;
            }
            return false;
        }
        Paragraph m958layoutTextK40F9xA = m958layoutTextK40F9xA(j5, layoutDirection);
        this.prevConstraints = j5;
        this.layoutSize = ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m958layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m958layoutTextK40F9xA.getHeight())));
        if (!TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5987getVisiblegIe3tQ8()) && (IntSize.m6214getWidthimpl(r9) < m958layoutTextK40F9xA.getWidth() || IntSize.m6213getHeightimpl(r9) < m958layoutTextK40F9xA.getHeight())) {
            z5 = true;
        }
        this.didOverflow = z5;
        this.paragraph = m958layoutTextK40F9xA;
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

    public final void setDidOverflow$foundation_release(boolean z4) {
        this.didOverflow = z4;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m962setLayoutSizeozmzZPI$foundation_release(long j5) {
        this.layoutSize = j5;
    }

    public final void setParagraph$foundation_release(@m Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    @m
    public final TextLayoutResult slowCreateTextLayoutResultOrNull(@l TextStyle textStyle) {
        Density density;
        List E;
        List E2;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        E = kotlin.collections.w.E();
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, E, this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, m5991copyZbe2FdA$default, (w) null);
        E2 = kotlin.collections.w.E();
        return new TextLayoutResult(textLayoutInput, new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) E2, density, this.fontFamilyResolver), m5991copyZbe2FdA$default, this.maxLines, TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m963updateL6sJoHM(@l String str, @l TextStyle textStyle, @l FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i5;
        this.softWrap = z4;
        this.maxLines = i6;
        this.minLines = i7;
        markDirty();
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i5, boolean z4, int i6, int i7, int i8, w wVar) {
        this(str, textStyle, resolver, (i8 & 8) != 0 ? TextOverflow.Companion.m5985getClipgIe3tQ8() : i5, (i8 & 16) != 0 ? true : z4, (i8 & 32) != 0 ? Integer.MAX_VALUE : i6, (i8 & 64) != 0 ? 1 : i7, null);
    }
}
