package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipKt$TooltipBox$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ boolean $enableUserInput;
    final /* synthetic */ boolean $focusable;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PopupPositionProvider $positionProvider;
    final /* synthetic */ TooltipState $state;
    final /* synthetic */ v3.q<CaretScope, Composer, Integer, r2> $tooltip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$TooltipBox$2(PopupPositionProvider popupPositionProvider, v3.q<? super CaretScope, ? super Composer, ? super Integer, r2> qVar, TooltipState tooltipState, Modifier modifier, boolean z4, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$positionProvider = popupPositionProvider;
        this.$tooltip = qVar;
        this.$state = tooltipState;
        this.$modifier = modifier;
        this.$focusable = z4;
        this.$enableUserInput = z5;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TooltipKt.TooltipBox(this.$positionProvider, this.$tooltip, this.$state, this.$modifier, this.$focusable, this.$enableUserInput, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
