package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JØ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0003\u0010\u0016\u001a\u00020\f2\b\b\u0003\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "()V", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "create", "Landroid/text/StaticLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "start", "end", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "leftIndents", "", "rightIndents", "isFallbackLineSpacingEnabled", "layout", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalPlatformTextApi
/* loaded from: classes.dex */
public final class StaticLayoutFactory {

    @p4.l
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();

    @p4.l
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();
    public static final int $stable = 8;

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i5, int i6, int i7, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i8, TextUtils.TruncateAt truncateAt, int i9, float f5, float f6, int i10, boolean z4, boolean z5, int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2, int i15, Object obj) {
        int i16;
        int i17;
        TextDirectionHeuristic textDirectionHeuristic2;
        Layout.Alignment alignment2;
        int i18;
        TextUtils.TruncateAt truncateAt2;
        int i19;
        float f7;
        float f8;
        int i20;
        boolean z6;
        boolean z7;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr3;
        int[] iArr4;
        if ((i15 & 8) != 0) {
            i16 = 0;
        } else {
            i16 = i6;
        }
        if ((i15 & 16) != 0) {
            i17 = charSequence.length();
        } else {
            i17 = i7;
        }
        if ((i15 & 32) != 0) {
            textDirectionHeuristic2 = LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        } else {
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        if ((i15 & 64) != 0) {
            alignment2 = LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        } else {
            alignment2 = alignment;
        }
        if ((i15 & 128) != 0) {
            i18 = Integer.MAX_VALUE;
        } else {
            i18 = i8;
        }
        if ((i15 & 256) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i15 & 512) != 0) {
            i19 = i5;
        } else {
            i19 = i9;
        }
        if ((i15 & 1024) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f5;
        }
        if ((i15 & 2048) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f6;
        }
        if ((i15 & 4096) != 0) {
            i20 = 0;
        } else {
            i20 = i10;
        }
        if ((i15 & 8192) != 0) {
            z6 = false;
        } else {
            z6 = z4;
        }
        if ((i15 & 16384) != 0) {
            z7 = true;
        } else {
            z7 = z5;
        }
        if ((32768 & i15) != 0) {
            i21 = 0;
        } else {
            i21 = i11;
        }
        if ((65536 & i15) != 0) {
            i22 = 0;
        } else {
            i22 = i12;
        }
        if ((131072 & i15) != 0) {
            i23 = 0;
        } else {
            i23 = i13;
        }
        if ((262144 & i15) != 0) {
            i24 = 0;
        } else {
            i24 = i14;
        }
        if ((524288 & i15) != 0) {
            iArr3 = null;
        } else {
            iArr3 = iArr;
        }
        if ((i15 & 1048576) != 0) {
            iArr4 = null;
        } else {
            iArr4 = iArr2;
        }
        return staticLayoutFactory.create(charSequence, textPaint, i5, i16, i17, textDirectionHeuristic2, alignment2, i18, truncateAt2, i19, f7, f8, i20, z6, z7, i21, i22, i23, i24, iArr3, iArr4);
    }

    @p4.l
    public final StaticLayout create(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint, int i5, int i6, int i7, @p4.l TextDirectionHeuristic textDirectionHeuristic, @p4.l Layout.Alignment alignment, @IntRange(from = 0) int i8, @p4.m TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i9, @FloatRange(from = 0.0d) float f5, float f6, int i10, boolean z4, boolean z5, int i11, int i12, int i13, int i14, @p4.m int[] iArr, @p4.m int[] iArr2) {
        return delegate.create(new StaticLayoutParams(charSequence, i6, i7, textPaint, i5, textDirectionHeuristic, alignment, i8, truncateAt, i9, f5, f6, i10, z4, z5, i11, i12, i13, i14, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(@p4.l StaticLayout staticLayout, boolean z4) {
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z4);
    }
}
