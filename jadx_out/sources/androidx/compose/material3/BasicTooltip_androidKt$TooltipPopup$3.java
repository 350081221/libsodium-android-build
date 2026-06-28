package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt$TooltipPopup$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ boolean $focusable;
    final /* synthetic */ PopupPositionProvider $positionProvider;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ BasicTooltipState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTooltip_androidKt$TooltipPopup$3(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, s0 s0Var, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, int i5) {
        super(2);
        this.$positionProvider = popupPositionProvider;
        this.$state = basicTooltipState;
        this.$scope = s0Var;
        this.$focusable = z4;
        this.$content = pVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        BasicTooltip_androidKt.TooltipPopup(this.$positionProvider, this.$state, this.$scope, this.$focusable, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
