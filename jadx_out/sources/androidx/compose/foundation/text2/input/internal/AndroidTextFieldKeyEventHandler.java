package androidx.compose.foundation.text2.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "()V", "onPreKeyEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo1092onPreKeyEventMyFupTE(@l KeyEvent keyEvent, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l FocusManager focusManager, @l SoftwareKeyboardController softwareKeyboardController) {
        boolean m1122isKeyCodeYhN2O0w;
        boolean m1122isKeyCodeYhN2O0w2;
        boolean m1122isKeyCodeYhN2O0w3;
        boolean m1122isKeyCodeYhN2O0w4;
        boolean m1122isKeyCodeYhN2O0w5;
        if (super.mo1092onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m4729equalsimpl0(KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4733getKeyDownCS__XNY())) {
            m1122isKeyCodeYhN2O0w = TextFieldKeyEventHandler_androidKt.m1122isKeyCodeYhN2O0w(keyEvent, 19);
            if (m1122isKeyCodeYhN2O0w) {
                return focusManager.mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3426getUpdhqQ8s());
            }
            m1122isKeyCodeYhN2O0w2 = TextFieldKeyEventHandler_androidKt.m1122isKeyCodeYhN2O0w(keyEvent, 20);
            if (m1122isKeyCodeYhN2O0w2) {
                return focusManager.mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3419getDowndhqQ8s());
            }
            m1122isKeyCodeYhN2O0w3 = TextFieldKeyEventHandler_androidKt.m1122isKeyCodeYhN2O0w(keyEvent, 21);
            if (m1122isKeyCodeYhN2O0w3) {
                return focusManager.mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3422getLeftdhqQ8s());
            }
            m1122isKeyCodeYhN2O0w4 = TextFieldKeyEventHandler_androidKt.m1122isKeyCodeYhN2O0w(keyEvent, 22);
            if (m1122isKeyCodeYhN2O0w4) {
                return focusManager.mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3425getRightdhqQ8s());
            }
            m1122isKeyCodeYhN2O0w5 = TextFieldKeyEventHandler_androidKt.m1122isKeyCodeYhN2O0w(keyEvent, 23);
            if (m1122isKeyCodeYhN2O0w5) {
                softwareKeyboardController.show();
                return true;
            }
        }
        return false;
    }
}
