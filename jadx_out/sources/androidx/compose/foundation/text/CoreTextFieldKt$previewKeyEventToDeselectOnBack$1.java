package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.input.key.KeyEvent;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends n0 implements l<KeyEvent, Boolean> {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m848invokeZmokQxo(keyEvent.m4725unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m848invokeZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
        boolean z4;
        if (this.$state.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m850cancelsTextSelectionZmokQxo(keyEvent)) {
            z4 = true;
            TextFieldSelectionManager.m1046deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
