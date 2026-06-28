package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
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
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@InternalFoundationTextApi
@Stable
@i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PBe\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u00100\u001a\u00020/\u0012\u0014\b\u0002\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060504¢\u0006\u0004\bN\u0010OJ\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J,\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010(\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010?R\u0011\u0010K\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001fR\u0011\u0010M\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/MultiParagraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutText", "Lkotlin/r2;", "layoutIntrinsics", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layout", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "", "maxLines", "I", "getMaxLines", "()I", "minLines", "getMinLines", "", "softWrap", "Z", "getSoftWrap", "()Z", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "getOverflow-gIe3tQ8", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getNonNullIntrinsics", "nonNullIntrinsics", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Density density;

    @l
    private final FontFamily.Resolver fontFamilyResolver;

    @m
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;

    @m
    private MultiParagraphIntrinsics paragraphIntrinsics;

    @l
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;

    @l
    private final TextStyle style;

    @l
    private final AnnotatedString text;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/r2;", "paint", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final void paint(@l Canvas canvas, @l TextLayoutResult textLayoutResult) {
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i5, int i6, boolean z4, int i7, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i5;
        this.minLines = i6;
        this.softWrap = z4;
        this.overflow = i7;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i5 > 0)) {
            throw new IllegalArgumentException("no maxLines".toString());
        }
        if (!(i6 > 0)) {
            throw new IllegalArgumentException("no minLines".toString());
        }
        if (!(i6 <= i5)) {
            throw new IllegalArgumentException("minLines greater than maxLines".toString());
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i5, int i6, boolean z4, int i7, Density density, FontFamily.Resolver resolver, List list, w wVar) {
        this(annotatedString, textStyle, i5, i6, z4, i7, density, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m889layoutNN6EwU$default(TextDelegate textDelegate, long j5, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m892layoutNN6EwU(j5, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m890layoutTextK40F9xA(long j5, LayoutDirection layoutDirection) {
        boolean z4;
        int i5;
        layoutIntrinsics(layoutDirection);
        int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        boolean z5 = false;
        int i6 = 1;
        if (!this.softWrap && !TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 && Constraints.m5996getHasBoundedWidthimpl(j5)) {
            i5 = Constraints.m6000getMaxWidthimpl(j5);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        if (!this.softWrap && TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8())) {
            z5 = true;
        }
        if (!z5) {
            i6 = this.maxLines;
        }
        int i7 = i6;
        if (m6002getMinWidthimpl != i5) {
            i5 = u.I(getMaxIntrinsicWidth(), m6002getMinWidthimpl, i5);
        }
        return new MultiParagraph(getNonNullIntrinsics(), ConstraintsKt.Constraints$default(0, i5, 0, Constraints.m5999getMaxHeightimpl(j5), 5, null), i7, TextOverflow.m5978equalsimpl0(this.overflow, TextOverflow.Companion.m5986getEllipsisgIe3tQ8()), null);
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @m
    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m891getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @m
    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    @l
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
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

    @l
    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m892layoutNN6EwU(long j5, @l LayoutDirection layoutDirection, @m TextLayoutResult textLayoutResult) {
        if (textLayoutResult != null && TextLayoutHelperKt.m926canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j5)) {
            return textLayoutResult.m5516copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m5514getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j5, (w) null), ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph m890layoutTextK40F9xA = m890layoutTextK40F9xA(j5, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j5, (w) null), m890layoutTextK40F9xA, ConstraintsKt.m6011constrain4WqzIAM(j5, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m890layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m890layoutTextK40F9xA.getHeight()))), null);
    }

    public final void layoutIntrinsics(@l LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@m LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(@m MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextDelegate(androidx.compose.ui.text.AnnotatedString r14, androidx.compose.ui.text.TextStyle r15, int r16, int r17, boolean r18, int r19, androidx.compose.ui.unit.Density r20, androidx.compose.ui.text.font.FontFamily.Resolver r21, java.util.List r22, int r23, kotlin.jvm.internal.w r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto Lb
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto Ld
        Lb:
            r5 = r16
        Ld:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L14
            r6 = r2
            goto L16
        L14:
            r6 = r17
        L16:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            r7 = r2
            goto L1e
        L1c:
            r7 = r18
        L1e:
            r1 = r0 & 32
            if (r1 == 0) goto L2a
            androidx.compose.ui.text.style.TextOverflow$Companion r1 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r1 = r1.m5985getClipgIe3tQ8()
            r8 = r1
            goto L2c
        L2a:
            r8 = r19
        L2c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L36
            java.util.List r0 = kotlin.collections.u.E()
            r11 = r0
            goto L38
        L36:
            r11 = r22
        L38:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextDelegate.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, int, int, boolean, int, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
