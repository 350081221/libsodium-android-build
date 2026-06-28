package androidx.compose.ui.text.input;

import androidx.compose.animation.core.h;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016j\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/r2;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextInputSession;", "startInput", com.umeng.analytics.pro.d.aC, "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "_currentInputSession", "Ljava/util/concurrent/atomic/AtomicReference;", "getCurrentInputSession$ui_text_release", "()Landroidx/compose/ui/text/input/TextInputSession;", "currentInputSession", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class TextInputService {
    public static final int $stable = 8;

    @l
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>(null);

    @l
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(@l PlatformTextInputService platformTextInputService) {
        this.platformTextInputService = platformTextInputService;
    }

    @m
    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    @k(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @b1(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    @k(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @b1(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if (getCurrentInputSession$ui_text_release() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    @l
    public TextInputSession startInput(@l TextFieldValue textFieldValue, @l ImeOptions imeOptions, @l v3.l<? super List<? extends EditCommand>, r2> lVar, @l v3.l<? super ImeAction, r2> lVar2) {
        this.platformTextInputService.startInput(textFieldValue, imeOptions, lVar, lVar2);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(@l TextInputSession textInputSession) {
        if (h.a(this._currentInputSession, textInputSession, null)) {
            this.platformTextInputService.stopInput();
        }
    }

    @InternalTextApi
    public final void stopInput() {
        this.platformTextInputService.stopInput();
    }

    @InternalTextApi
    public final void startInput() {
        this.platformTextInputService.startInput();
    }
}
