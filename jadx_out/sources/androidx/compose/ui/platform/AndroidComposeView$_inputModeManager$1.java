package androidx.compose.ui.platform;

import androidx.compose.ui.input.InputMode;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/InputMode;", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView$_inputModeManager$1 extends kotlin.jvm.internal.n0 implements v3.l<InputMode, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
        return m5286invokeiuPiT84(inputMode.m4417unboximpl());
    }

    @p4.l
    /* renamed from: invoke-iuPiT84, reason: not valid java name */
    public final Boolean m5286invokeiuPiT84(int i5) {
        boolean z4;
        InputMode.Companion companion = InputMode.Companion;
        if (InputMode.m4414equalsimpl0(i5, companion.m4419getTouchaOaMEAU())) {
            z4 = this.this$0.isInTouchMode();
        } else if (InputMode.m4414equalsimpl0(i5, companion.m4418getKeyboardaOaMEAU())) {
            if (this.this$0.isInTouchMode()) {
                z4 = this.this$0.requestFocusFromTouch();
            } else {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
