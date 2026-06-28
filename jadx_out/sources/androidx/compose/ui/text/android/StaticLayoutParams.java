package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$¨\u0006?"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutParams;", "", "text", "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "leftIndents", "", "rightIndents", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "getBreakStrategy", "()I", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "getEllipsizedWidth", "getEnd", "getHyphenationFrequency", "getIncludePadding", "()Z", "getJustificationMode", "getLeftIndents", "()[I", "getLineBreakStyle", "getLineBreakWordStyle", "getLineSpacingExtra", "()F", "getLineSpacingMultiplier", "getMaxLines", "getPaint", "()Landroid/text/TextPaint;", "getRightIndents", "getStart", "getText", "()Ljava/lang/CharSequence;", "getTextDir", "()Landroid/text/TextDirectionHeuristic;", "getUseFallbackLineSpacing", "getWidth", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStaticLayoutFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
/* loaded from: classes.dex */
final class StaticLayoutParams {

    @p4.l
    private final Layout.Alignment alignment;
    private final int breakStrategy;

    @p4.m
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;

    @p4.m
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;

    @p4.l
    private final TextPaint paint;

    @p4.m
    private final int[] rightIndents;
    private final int start;

    @p4.l
    private final CharSequence text;

    @p4.l
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(@p4.l CharSequence charSequence, int i5, int i6, @p4.l TextPaint textPaint, int i7, @p4.l TextDirectionHeuristic textDirectionHeuristic, @p4.l Layout.Alignment alignment, int i8, @p4.m TextUtils.TruncateAt truncateAt, int i9, float f5, float f6, int i10, boolean z4, boolean z5, int i11, int i12, int i13, int i14, @p4.m int[] iArr, @p4.m int[] iArr2) {
        this.text = charSequence;
        this.start = i5;
        this.end = i6;
        this.paint = textPaint;
        this.width = i7;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i8;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i9;
        this.lineSpacingMultiplier = f5;
        this.lineSpacingExtra = f6;
        this.justificationMode = i10;
        this.includePadding = z4;
        this.useFallbackLineSpacing = z5;
        this.breakStrategy = i11;
        this.lineBreakStyle = i12;
        this.lineBreakWordStyle = i13;
        this.hyphenationFrequency = i14;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i5 >= 0 && i5 <= i6)) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        if (!(i6 >= 0 && i6 <= charSequence.length())) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (!(f5 >= 0.0f)) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }

    @p4.l
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    @p4.m
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    @p4.m
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @p4.l
    public final TextPaint getPaint() {
        return this.paint;
    }

    @p4.m
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    @p4.l
    public final CharSequence getText() {
        return this.text;
    }

    @p4.l
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i5, int i6, TextPaint textPaint, int i7, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i8, TextUtils.TruncateAt truncateAt, int i9, float f5, float f6, int i10, boolean z4, boolean z5, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2, int i15, w wVar) {
        this(charSequence, (i15 & 2) != 0 ? 0 : i5, i6, textPaint, i7, textDirectionHeuristic, alignment, i8, truncateAt, i9, f5, f6, i10, z4, z5, i11, i12, i13, i14, iArr, iArr2);
    }
}
