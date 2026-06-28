package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\f\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0019R$\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R$\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lkotlin/r2;", "calculateTargetMetrics", "", "text", "", "start", "end", "spanStartVertical", "lineHeight", "chooseHeight", "startIndex", "endIndex", "", "trimFirstLineTop", "copy$ui_text_release", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "copy", "", "F", "getLineHeight", "()F", "I", "Z", "trimLastLineBottom", "getTrimLastLineBottom", "()Z", "topRatio", "firstAscent", "ascent", "descent", "lastDescent", "<set-?>", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescentDiff", "getLastDescentDiff", "<init>", "(FIIZZF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f5, int i5, int i6, boolean z4, boolean z5, @FloatRange(from = -1.0d, to = 1.0d) float f6) {
        boolean z6;
        boolean z7;
        this.lineHeight = f5;
        this.startIndex = i5;
        this.endIndex = i6;
        this.trimFirstLineTop = z4;
        this.trimLastLineBottom = z5;
        this.topRatio = f6;
        boolean z8 = true;
        if (0.0f <= f6 && f6 <= 1.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            if (f6 == -1.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                z8 = false;
            }
        }
        if (z8) {
        } else {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        boolean z4;
        double ceil;
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil2 - LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        float f5 = this.topRatio;
        if (f5 == -1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f5 = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        }
        if (lineHeight <= 0) {
            ceil = Math.ceil(lineHeight * f5);
        } else {
            ceil = Math.ceil(lineHeight * (1.0f - f5));
        }
        int i5 = (int) ceil;
        int i6 = fontMetricsInt.descent;
        int i7 = i5 + i6;
        this.descent = i7;
        int i8 = i7 - ceil2;
        this.ascent = i8;
        if (this.trimFirstLineTop) {
            i8 = fontMetricsInt.ascent;
        }
        this.firstAscent = i8;
        if (this.trimLastLineBottom) {
            i7 = i6;
        }
        this.lastDescent = i7;
        this.firstAscentDiff = fontMetricsInt.ascent - i8;
        this.lastDescentDiff = i7 - i6;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z4 = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i5, i6, z4);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@l CharSequence charSequence, int i5, int i6, int i7, int i8, @l Paint.FontMetricsInt fontMetricsInt) {
        boolean z4;
        int i9;
        int i10;
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z5 = true;
        if (i5 == this.startIndex) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i6 != this.endIndex) {
            z5 = false;
        }
        if (z4 && z5 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        if (z4) {
            i9 = this.firstAscent;
        } else {
            i9 = this.ascent;
        }
        fontMetricsInt.ascent = i9;
        if (z5) {
            i10 = this.lastDescent;
        } else {
            i10 = this.descent;
        }
        fontMetricsInt.descent = i10;
    }

    @l
    public final LineHeightStyleSpan copy$ui_text_release(int i5, int i6, boolean z4) {
        return new LineHeightStyleSpan(this.lineHeight, i5, i6, z4, this.trimLastLineBottom, this.topRatio);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
