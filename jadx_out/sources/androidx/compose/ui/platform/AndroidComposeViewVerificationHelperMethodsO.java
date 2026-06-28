package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsO;", "", "Landroid/view/View;", "view", "", "focusable", "", "defaultFocusHighlightEnabled", "Lkotlin/r2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsO {

    @p4.l
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void focusable(@p4.l View view, int i5, boolean z4) {
        view.setFocusable(i5);
        view.setDefaultFocusHighlightEnabled(z4);
    }
}
