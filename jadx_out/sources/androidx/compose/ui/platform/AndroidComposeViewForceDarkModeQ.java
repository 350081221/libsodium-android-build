package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewForceDarkModeQ;", "", "Landroid/view/View;", "view", "Lkotlin/r2;", "disallowForceDark", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
final class AndroidComposeViewForceDarkModeQ {

    @p4.l
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    @DoNotInline
    @RequiresApi(29)
    public final void disallowForceDark(@p4.l View view) {
        view.setForceDarkAllowed(false);
    }
}
