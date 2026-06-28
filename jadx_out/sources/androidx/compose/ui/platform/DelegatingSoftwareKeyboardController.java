package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/DelegatingSoftwareKeyboardController;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Lkotlin/r2;", "show", "hide", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    public static final int $stable = 0;

    @p4.l
    private final TextInputService textInputService;

    public DelegatingSoftwareKeyboardController(@p4.l TextInputService textInputService) {
        this.textInputService = textInputService;
    }

    @p4.l
    public final TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void hide() {
        this.textInputService.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        this.textInputService.showSoftwareKeyboard();
    }
}
