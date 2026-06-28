package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends kotlin.jvm.internal.n0 implements v3.l<KeyEvent, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m5288invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m5288invokeZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        FocusDirection mo5259getFocusDirectionP8AzH3I = this.this$0.mo5259getFocusDirectionP8AzH3I(keyEvent);
        if (mo5259getFocusDirectionP8AzH3I != null && KeyEventType.m4729equalsimpl0(KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4733getKeyDownCS__XNY())) {
            return Boolean.valueOf(this.this$0.getFocusOwner().mo3427moveFocus3ESFkO8(mo5259getFocusDirectionP8AzH3I.m3416unboximpl()));
        }
        return Boolean.FALSE;
    }
}
