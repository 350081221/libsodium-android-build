package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$pointerModifier$2 extends n0 implements l<Offset, r2> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$2(TextFieldState textFieldState, FocusRequester focusRequester, boolean z4, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = focusRequester;
        this.$readOnly = z4;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
        m846invokek4lQ0M(offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m846invokek4lQ0M(long j5) {
        boolean z4 = true;
        CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
        if (this.$state.getHasFocus()) {
            if (this.$state.getHandleState() != HandleState.Selection) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion.m903setCursorOffsetULxng0E$foundation_release(j5, layoutResult, textFieldState.getProcessor(), this.$offsetMapping, textFieldState.getOnValueChange());
                    if (textFieldState.getTextDelegate().getText().length() <= 0) {
                        z4 = false;
                    }
                    if (z4) {
                        textFieldState.setHandleState(HandleState.Cursor);
                        return;
                    }
                    return;
                }
                return;
            }
            this.$manager.m1050deselect_kEHs6E$foundation_release(Offset.m3482boximpl(j5));
        }
    }
}
