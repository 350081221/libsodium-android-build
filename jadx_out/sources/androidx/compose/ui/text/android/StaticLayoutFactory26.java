package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory26;", "", "Landroid/text/StaticLayout$Builder;", "builder", "", "justificationMode", "Lkotlin/r2;", "setJustificationMode", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
final class StaticLayoutFactory26 {

    @p4.l
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    @DoNotInline
    @u3.m
    public static final void setJustificationMode(@p4.l StaticLayout.Builder builder, int i5) {
        builder.setJustificationMode(i5);
    }
}
