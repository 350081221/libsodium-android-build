package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CheckboxColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ToggleableState $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$2(boolean z4, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i5) {
        super(2);
        this.$enabled = z4;
        this.$value = toggleableState;
        this.$modifier = modifier;
        this.$colors = checkboxColors;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        CheckboxKt.CheckboxImpl(this.$enabled, this.$value, this.$modifier, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
