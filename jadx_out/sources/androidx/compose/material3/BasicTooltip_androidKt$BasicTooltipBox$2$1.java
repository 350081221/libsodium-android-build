package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$BasicTooltipBox$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,225:1\n64#2,5:226\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$BasicTooltipBox$2$1\n*L\n104#1:226,5\n*E\n"})
/* loaded from: classes.dex */
final class BasicTooltip_androidKt$BasicTooltipBox$2$1 extends kotlin.jvm.internal.n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ BasicTooltipState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$BasicTooltipBox$2$1(BasicTooltipState basicTooltipState) {
        super(1);
        this.$state = basicTooltipState;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final BasicTooltipState basicTooltipState = this.$state;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BasicTooltipState.this.onDispose();
            }
        };
    }
}
