package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LabelKt$Label$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isPersistent;
    final /* synthetic */ v3.q<CaretScope, Composer, Integer, r2> $label;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LabelKt$Label$3(v3.q<? super CaretScope, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$label = qVar;
        this.$modifier = modifier;
        this.$interactionSource = mutableInteractionSource;
        this.$isPersistent = z4;
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
        LabelKt.Label(this.$label, this.$modifier, this.$interactionSource, this.$isPersistent, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
