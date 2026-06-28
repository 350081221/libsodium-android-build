package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1 extends n0 implements l<LayoutCoordinates, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ WindowInfo $windowInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onPositionedModifier$1(TextFieldState textFieldState, boolean z4, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$enabled = z4;
        this.$windowInfo = windowInfo;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LayoutCoordinates layoutCoordinates) {
        this.$state.setLayoutCoordinates(layoutCoordinates);
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
        }
        if (this.$enabled) {
            if (this.$state.getHandleState() == HandleState.Selection) {
                if (this.$state.getShowFloatingToolbar() && CoreTextFieldKt.isWindowFocusedBehindFlag(this.$windowInfo)) {
                    this.$manager.showSelectionToolbar$foundation_release();
                } else {
                    this.$manager.hideSelectionToolbar$foundation_release();
                }
                this.$state.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.$manager, true));
                this.$state.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.$manager, false));
                this.$state.setShowCursorHandle(TextRange.m5539getCollapsedimpl(this.$value.m5783getSelectiond9O1mEE()));
            } else if (this.$state.getHandleState() == HandleState.Cursor) {
                this.$state.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.$manager, true));
            }
            CoreTextFieldKt.notifyFocusedRect(this.$state, this.$value, this.$offsetMapping);
            TextLayoutResultProxy layoutResult2 = this.$state.getLayoutResult();
            if (layoutResult2 != null) {
                TextFieldState textFieldState = this.$state;
                TextFieldValue textFieldValue = this.$value;
                OffsetMapping offsetMapping = this.$offsetMapping;
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null || !textFieldState.getHasFocus()) {
                    return;
                }
                TextFieldDelegate.Companion.updateTextLayoutResult$foundation_release(inputSession, textFieldValue, offsetMapping, layoutResult2);
            }
        }
    }
}
