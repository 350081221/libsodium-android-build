package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "Lkotlin/r2;", "setPointerIcon", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(24)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {

    @p4.l
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(@p4.l View view, @p4.m PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        if (pointerIcon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else if (pointerIcon instanceof AndroidPointerIconType) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType());
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!kotlin.jvm.internal.l0.g(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
