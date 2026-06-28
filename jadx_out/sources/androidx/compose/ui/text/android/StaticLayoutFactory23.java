package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(23)
/* loaded from: classes.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @p4.l
    @DoNotInline
    public StaticLayout create(@p4.l StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth());
        obtain.setTextDirection(staticLayoutParams.getTextDir());
        obtain.setAlignment(staticLayoutParams.getAlignment());
        obtain.setMaxLines(staticLayoutParams.getMaxLines());
        obtain.setEllipsize(staticLayoutParams.getEllipsize());
        obtain.setEllipsizedWidth(staticLayoutParams.getEllipsizedWidth());
        obtain.setLineSpacing(staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getLineSpacingMultiplier());
        obtain.setIncludePad(staticLayoutParams.getIncludePadding());
        obtain.setBreakStrategy(staticLayoutParams.getBreakStrategy());
        obtain.setHyphenationFrequency(staticLayoutParams.getHyphenationFrequency());
        obtain.setIndents(staticLayoutParams.getLeftIndents(), staticLayoutParams.getRightIndents());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            StaticLayoutFactory26.setJustificationMode(obtain, staticLayoutParams.getJustificationMode());
        }
        if (i5 >= 28) {
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, staticLayoutParams.getUseFallbackLineSpacing());
        }
        if (i5 >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(obtain, staticLayoutParams.getLineBreakStyle(), staticLayoutParams.getLineBreakWordStyle());
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(@p4.l StaticLayout staticLayout, boolean z4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(staticLayout);
        }
        if (i5 < 28) {
            return false;
        }
        return z4;
    }
}
