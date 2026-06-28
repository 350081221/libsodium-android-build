package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/style/FontFeatureSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/r2;", "updateMeasureState", "updateDrawState", "", "fontFeatureSettings", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {
    public static final int $stable = 0;

    @l
    private final String fontFeatureSettings;

    public FontFeatureSpan(@l String str) {
        this.fontFeatureSettings = str;
    }

    @l
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }
}
