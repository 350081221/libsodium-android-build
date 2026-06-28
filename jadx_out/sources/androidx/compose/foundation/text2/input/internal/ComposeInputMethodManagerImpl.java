package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0004R\u001a\u0010\u0014\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "Landroid/view/inputmethod/InputMethodManager;", "createImm", "Lkotlin/r2;", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "requireImm", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "imm", "Landroid/view/inputmethod/InputMethodManager;", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "softwareKeyboardControllerCompat", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "<init>", "(Landroid/view/View;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
/* loaded from: classes.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    @m
    private InputMethodManager imm;

    @l
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @l
    private final View view;

    public ComposeInputMethodManagerImpl(@l View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final InputMethodManager createImm() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final InputMethodManager requireImm() {
        InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager createImm = createImm();
        this.imm = createImm;
        return createImm;
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void restartInput() {
        requireImm().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void updateExtractedText(int i5, @l ExtractedText extractedText) {
        requireImm().updateExtractedText(this.view, i5, extractedText);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void updateSelection(int i5, int i6, int i7, int i8) {
        requireImm().updateSelection(this.view, i5, i6, i7, i8);
    }
}
