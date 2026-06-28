package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi24;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "sendKeyEvent", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(24)
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(@l View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(@l KeyEvent keyEvent) {
        requireImm().dispatchKeyEventFromInputMethod(getView(), keyEvent);
    }
}
