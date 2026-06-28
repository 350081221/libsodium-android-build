package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/style/TextDecorationSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/r2;", "updateDrawState", "", "isUnderlineText", "Z", "()Z", "isStrikethroughText", "<init>", "(ZZ)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextDecorationSpan extends CharacterStyle {
    public static final int $stable = 0;
    private final boolean isStrikethroughText;
    private final boolean isUnderlineText;

    public TextDecorationSpan(boolean z4, boolean z5) {
        this.isUnderlineText = z4;
        this.isStrikethroughText = z5;
    }

    public final boolean isStrikethroughText() {
        return this.isStrikethroughText;
    }

    public final boolean isUnderlineText() {
        return this.isUnderlineText;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.setUnderlineText(this.isUnderlineText);
        textPaint.setStrikeThruText(this.isStrikethroughText);
    }
}
