package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory33;", "", "Landroid/text/StaticLayout;", "layout", "", "isFallbackLineSpacingEnabled", "Landroid/text/StaticLayout$Builder;", "builder", "", "lineBreakStyle", "lineBreakWordStyle", "Lkotlin/r2;", "setLineBreakConfig", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(33)
/* loaded from: classes.dex */
final class StaticLayoutFactory33 {

    @p4.l
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @DoNotInline
    @u3.m
    public static final boolean isFallbackLineSpacingEnabled(@p4.l StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @DoNotInline
    @u3.m
    public static final void setLineBreakConfig(@p4.l StaticLayout.Builder builder, int i5, int i6) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i5).setLineBreakWordStyle(i6).build());
    }
}
