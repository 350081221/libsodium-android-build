package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,436:1\n64#2,5:437\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1\n*L\n127#1:437,5\n*E\n"})
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ a<r2> $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1(PopupLayout popupLayout, a<r2> aVar, LayoutDirection layoutDirection) {
        super(1);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = aVar;
        this.$layoutDirection = layoutDirection;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        this.$popupLayout.show();
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$layoutDirection);
        final PopupLayout popupLayout = this.$popupLayout;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PopupLayout.this.disposeComposition();
                PopupLayout.this.dismiss();
            }
        };
    }
}
