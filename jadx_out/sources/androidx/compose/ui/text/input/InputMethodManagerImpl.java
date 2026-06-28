package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "", "isActive", "Lkotlin/r2;", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "imm$delegate", "Lkotlin/d0;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "softwareKeyboardControllerCompat", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;

    @l
    private final d0 imm$delegate;

    @l
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @l
    private final View view;

    public InputMethodManagerImpl(@l View view) {
        d0 b5;
        this.view = view;
        b5 = f0.b(h0.NONE, new InputMethodManagerImpl$imm$2(this));
        this.imm$delegate = b5;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(@l CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i5, @l ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i5, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i5, int i6, int i7, int i8) {
        getImm().updateSelection(this.view, i5, i6, i7, i8);
    }
}
