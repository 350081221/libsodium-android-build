package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,702:1\n64#2,5:703\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1\n*L\n474#1:703,5\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1 extends kotlin.jvm.internal.n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ ModalBottomSheetWindow $modalBottomSheetWindow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1(ModalBottomSheetWindow modalBottomSheetWindow, LayoutDirection layoutDirection) {
        super(1);
        this.$modalBottomSheetWindow = modalBottomSheetWindow;
        this.$layoutDirection = layoutDirection;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        this.$modalBottomSheetWindow.show();
        this.$modalBottomSheetWindow.superSetLayoutDirection(this.$layoutDirection);
        final ModalBottomSheetWindow modalBottomSheetWindow = this.$modalBottomSheetWindow;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ModalBottomSheetWindow.this.disposeComposition();
                ModalBottomSheetWindow.this.dismiss();
            }
        };
    }
}
