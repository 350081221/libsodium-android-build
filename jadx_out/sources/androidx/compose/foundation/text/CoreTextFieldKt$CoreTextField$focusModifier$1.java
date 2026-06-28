package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusState;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/focus/FocusState;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends n0 implements l<FocusState, r2> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, TextInputService textInputService, boolean z4, boolean z5, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, s0 s0Var, BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = textInputService;
        this.$enabled = z4;
        this.$readOnly = z5;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = s0Var;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(FocusState focusState) {
        invoke2(focusState);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l FocusState focusState) {
        TextLayoutResultProxy layoutResult;
        if (this.$state.getHasFocus() == focusState.isFocused()) {
            return;
        }
        this.$state.setHasFocus(focusState.isFocused());
        if (this.$textInputService != null) {
            if (this.$state.getHasFocus() && this.$enabled && !this.$readOnly) {
                CoreTextFieldKt.startInputSession(this.$textInputService, this.$state, this.$value, this.$imeOptions, this.$offsetMapping);
            } else {
                CoreTextFieldKt.endInputSession(this.$state);
            }
            if (focusState.isFocused() && (layoutResult = this.$state.getLayoutResult()) != null) {
                k.f(this.$coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, layoutResult, this.$offsetMapping, null), 3, null);
            }
        }
        if (focusState.isFocused()) {
            return;
        }
        TextFieldSelectionManager.m1046deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
    }
}
