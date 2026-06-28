package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "sendKeyEvent", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/view/inputmethod/BaseInputConnection;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {

    @m
    private BaseInputConnection baseInputConnection;

    public ComposeInputMethodManagerImplApi21(@l View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(@l KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.baseInputConnection;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(getView(), false);
            this.baseInputConnection = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
