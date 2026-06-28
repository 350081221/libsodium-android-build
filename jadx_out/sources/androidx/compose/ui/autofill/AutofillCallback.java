package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", "view", "", "virtualId", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "onAutofillEvent", "Landroidx/compose/ui/autofill/AndroidAutofill;", "autofill", "register", "unregister", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final int $stable = 0;

    @l
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@l View view, int i5, int i6) {
        String str;
        super.onAutofillEvent(view, i5, i6);
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(@l AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(@l AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().unregisterCallback(this);
    }
}
