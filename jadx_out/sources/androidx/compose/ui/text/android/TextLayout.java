package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BÎ\u0001\u0012\u0006\u0010s\u001a\u00020m\u0012\u0006\u0010t\u001a\u00020\u0004\u0012\u0006\u0010v\u001a\u00020u\u0012\b\b\u0002\u0010w\u001a\u00020\u0002\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010x\u0012\b\b\u0002\u0010z\u001a\u00020\u0002\u0012\b\b\u0002\u0010{\u001a\u00020\u0004\u0012\b\b\u0003\u0010|\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0013\u0012\b\b\u0002\u00109\u001a\u00020\u0013\u0012\b\b\u0002\u0010}\u001a\u00020\u0002\u0012\b\b\u0002\u0010~\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u007f\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0013J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$J&\u0010-\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u00102\u001a\u00020&2\u0006\u00101\u001a\u000200J\u000f\u00105\u001a\u00020\u0013H\u0000¢\u0006\u0004\b3\u00104R\u0017\u00106\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00104R\u0017\u00109\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u00104R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00104R \u0010C\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010M\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bM\u0010J\u0012\u0004\bO\u0010H\u001a\u0004\bN\u0010LR \u0010P\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bP\u0010J\u0012\u0004\bR\u0010H\u001a\u0004\bQ\u0010LR\u0014\u0010S\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010V\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R\u0016\u0010X\u001a\u0004\u0018\u00010W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010JR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0011\u0010j\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010l\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0011\u0010p\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bq\u0010L¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "line", "", "getHorizontalPadding", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "getLineVisibleEnd", "", "isLineEllipsized", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "Lkotlin/r2;", "getSelectionPath", "startOffset", "endOffset", "", "array", "arrayStart", "fillBoundingBoxes", "Landroid/graphics/RectF;", "getBoundingBox", "Landroid/graphics/Canvas;", "canvas", "paint", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "includePadding", "Z", "getIncludePadding", "fallbackLineSpacing", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "bottomPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "leftPadding", "F", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper$delegate", "Lkotlin/d0;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1031:1\n1#2:1032\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayout {
    public static final int $stable = 8;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;

    @p4.m
    private final Paint.FontMetricsInt lastLineFontMetrics;

    @p4.l
    private final Layout layout;

    @p4.l
    private final d0 layoutHelper$delegate;

    @p4.l
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;

    @p4.l
    private final LineHeightStyleSpan[] lineHeightSpans;

    @p4.l
    private final Rect rect;
    private final float rightPadding;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public TextLayout(@p4.l CharSequence charSequence, float f5, @p4.l TextPaint textPaint, int i5, @p4.m TextUtils.TruncateAt truncateAt, int i6, float f6, @Px float f7, boolean z4, boolean z5, int i7, int i8, int i9, int i10, int i11, int i12, @p4.m int[] iArr, @p4.m int[] iArr2, @p4.l LayoutIntrinsics layoutIntrinsics) {
        boolean z6;
        boolean z7;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout create;
        long verticalPaddings;
        LineHeightStyleSpan[] lineHeightSpans;
        long lineHeightPaddings;
        Paint.FontMetricsInt lastLineMetrics;
        d0 b5;
        this.includePadding = z4;
        this.fallbackLineSpacing = z5;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i6);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i5);
        boolean z8 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d5 = f5;
            int ceil = (int) Math.ceil(d5);
            if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f5 && !z8) {
                this.isBoringLayout = true;
                z6 = true;
                create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z4, z5, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z7 = false;
            } else {
                z6 = true;
                this.isBoringLayout = false;
                z7 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                create = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic2, alignment, i7, truncateAt, (int) Math.ceil(d5), f6, f7, i12, z4, z5, i8, i9, i10, i11, iArr, iArr2);
            }
            this.layout = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i7);
            this.lineCount = min;
            int i13 = min - 1;
            this.didExceedMaxLines = (min >= i7 && (create.getEllipsisCount(i13) > 0 || create.getLineEnd(i13) != charSequence.length())) ? z6 : z7;
            verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
            lineHeightSpans = TextLayoutKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this, lineHeightSpans);
            this.topPadding = Math.max(VerticalPaddings.m5597getTopPaddingimpl(verticalPaddings), VerticalPaddings.m5597getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m5596getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m5596getBottomPaddingimpl(lineHeightPaddings));
            lastLineMetrics = TextLayoutKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i13)) : z7;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding$default(create, i13, null, 2, null);
            this.rightPadding = IndentationFixSpanKt.getEllipsizedRightPadding$default(create, i13, null, 2, null);
            b5 = f0.b(h0.NONE, new TextLayout$layoutHelper$2(this));
            this.layoutHelper$delegate = b5;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int i5) {
        if (i5 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper$delegate.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return textLayout.getPrimaryHorizontal(i5, z4);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return textLayout.getSecondaryHorizontal(i5, z4);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int i5, int i6, @p4.l float[] fArr, int i7) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i8;
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        int i9 = 1;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 < length) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i6 > i5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (i6 <= length) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (fArr.length - i7 >= (i6 - i5) * 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            int lineForOffset = getLineForOffset(i5);
                            int lineForOffset2 = getLineForOffset(i6 - 1);
                            HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
                            if (lineForOffset <= lineForOffset2) {
                                int i10 = lineForOffset;
                                int i11 = i7;
                                while (true) {
                                    int lineStart = getLineStart(i10);
                                    int lineEnd = getLineEnd(i10);
                                    int min = Math.min(i6, lineEnd);
                                    float lineTop = getLineTop(i10);
                                    float lineBottom = getLineBottom(i10);
                                    if (getParagraphDirection(i10) == i9) {
                                        i8 = i9;
                                    } else {
                                        i8 = 0;
                                    }
                                    int i12 = i8 ^ 1;
                                    for (int max = Math.max(i5, lineStart); max < min; max++) {
                                        boolean isRtlCharAt = isRtlCharAt(max);
                                        if (i8 != 0 && !isRtlCharAt) {
                                            secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(max);
                                            secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        } else if (i8 != 0 && isRtlCharAt) {
                                            secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(max);
                                            secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        } else if (i12 != 0 && isRtlCharAt) {
                                            secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(max);
                                            secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        } else {
                                            secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(max);
                                            secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        }
                                        fArr[i11] = secondaryDownstream;
                                        fArr[i11 + 1] = lineTop;
                                        fArr[i11 + 2] = secondaryUpstream;
                                        fArr[i11 + 3] = lineBottom;
                                        i11 += 4;
                                    }
                                    if (i10 != lineForOffset2) {
                                        i10++;
                                        i9 = 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    @p4.l
    public final RectF getBoundingBox(int i5) {
        boolean z4;
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i5);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        if (getParagraphDirection(lineForOffset) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean isRtlCharAt = this.layout.isRtlCharAt(i5);
        if (z4 && !isRtlCharAt) {
            secondaryHorizontal = getPrimaryHorizontal(i5, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i5 + 1, true);
        } else {
            if (z4 && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i5, false);
                primaryHorizontal2 = getSecondaryHorizontal(i5 + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i5, false);
                primaryHorizontal2 = getPrimaryHorizontal(i5 + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i5, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i5 + 1, true);
            }
            float f5 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f5;
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @p4.l
    public final Layout getLayout() {
        return this.layout;
    }

    @p4.l
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i5) {
        int lineAscent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i5 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineAscent = fontMetricsInt.ascent;
        } else {
            lineAscent = this.layout.getLineAscent(i5);
        }
        return lineAscent;
    }

    public final float getLineBaseline(int i5) {
        float lineBaseline;
        float f5 = this.topPadding;
        if (i5 == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            lineBaseline = getLineTop(i5) - this.lastLineFontMetrics.ascent;
        } else {
            lineBaseline = this.layout.getLineBaseline(i5);
        }
        return f5 + lineBaseline;
    }

    public final float getLineBottom(int i5) {
        int i6;
        if (i5 == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            return this.layout.getLineBottom(i5 - 1) + this.lastLineFontMetrics.bottom;
        }
        float lineBottom = this.topPadding + this.layout.getLineBottom(i5);
        if (i5 == this.lineCount - 1) {
            i6 = this.bottomPadding;
        } else {
            i6 = 0;
        }
        return lineBottom + i6;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i5) {
        int lineDescent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i5 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineDescent = fontMetricsInt.descent;
        } else {
            lineDescent = this.layout.getLineDescent(i5);
        }
        return lineDescent;
    }

    public final int getLineEllipsisCount(int i5) {
        return this.layout.getEllipsisCount(i5);
    }

    public final int getLineEllipsisOffset(int i5) {
        return this.layout.getEllipsisStart(i5);
    }

    public final int getLineEnd(int i5) {
        if (this.layout.getEllipsisStart(i5) == 0) {
            return this.layout.getLineEnd(i5);
        }
        return this.layout.getText().length();
    }

    public final int getLineForOffset(int i5) {
        return this.layout.getLineForOffset(i5);
    }

    public final int getLineForVertical(int i5) {
        return this.layout.getLineForVertical(i5 - this.topPadding);
    }

    public final float getLineHeight(int i5) {
        return getLineBottom(i5) - getLineTop(i5);
    }

    public final float getLineLeft(int i5) {
        float f5;
        float lineLeft = this.layout.getLineLeft(i5);
        if (i5 == this.lineCount - 1) {
            f5 = this.leftPadding;
        } else {
            f5 = 0.0f;
        }
        return lineLeft + f5;
    }

    public final float getLineRight(int i5) {
        float f5;
        float lineRight = this.layout.getLineRight(i5);
        if (i5 == this.lineCount - 1) {
            f5 = this.rightPadding;
        } else {
            f5 = 0.0f;
        }
        return lineRight + f5;
    }

    public final int getLineStart(int i5) {
        return this.layout.getLineStart(i5);
    }

    public final float getLineTop(int i5) {
        int i6;
        float lineTop = this.layout.getLineTop(i5);
        if (i5 == 0) {
            i6 = 0;
        } else {
            i6 = this.topPadding;
        }
        return lineTop + i6;
    }

    public final int getLineVisibleEnd(int i5) {
        if (this.layout.getEllipsisStart(i5) == 0) {
            return getLayoutHelper().getLineVisibleEnd(i5);
        }
        return this.layout.getEllipsisStart(i5) + this.layout.getLineStart(i5);
    }

    public final float getLineWidth(int i5) {
        return this.layout.getLineWidth(i5);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i5, float f5) {
        return this.layout.getOffsetForHorizontal(i5, f5 + ((-1) * getHorizontalPadding(i5)));
    }

    public final int getParagraphDirection(int i5) {
        return this.layout.getParagraphDirection(i5);
    }

    public final float getPrimaryHorizontal(int i5, boolean z4) {
        return getLayoutHelper().getHorizontalPosition(i5, true, z4) + getHorizontalPadding(getLineForOffset(i5));
    }

    public final float getSecondaryHorizontal(int i5, boolean z4) {
        return getLayoutHelper().getHorizontalPosition(i5, false, z4) + getHorizontalPadding(getLineForOffset(i5));
    }

    public final void getSelectionPath(int i5, int i6, @p4.l Path path) {
        this.layout.getSelectionPath(i5, i6, path);
        if (this.topPadding != 0 && !path.isEmpty()) {
            path.offset(0.0f, this.topPadding);
        }
    }

    @p4.l
    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            l0.n(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        l0.n(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i5) {
        return TextLayoutKt.isLineEllipsized(this.layout, i5);
    }

    public final boolean isRtlCharAt(int i5) {
        return this.layout.isRtlCharAt(i5);
    }

    public final void paint(@p4.l Canvas canvas) {
        TextAndroidCanvas textAndroidCanvas;
        if (!canvas.getClipBounds(this.rect)) {
            return;
        }
        int i5 = this.topPadding;
        if (i5 != 0) {
            canvas.translate(0.0f, i5);
        }
        textAndroidCanvas = TextLayoutKt.SharedTextAndroidCanvas;
        textAndroidCanvas.setCanvas(canvas);
        this.layout.draw(textAndroidCanvas);
        int i6 = this.topPadding;
        if (i6 != 0) {
            canvas.translate(0.0f, (-1) * i6);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.w r44) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.w):void");
    }
}
