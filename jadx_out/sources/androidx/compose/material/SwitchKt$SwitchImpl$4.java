package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ a<Float> $thumbValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$4(BoxScope boxScope, boolean z4, boolean z5, SwitchColors switchColors, a<Float> aVar, InteractionSource interactionSource, int i5) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z4;
        this.$enabled = z5;
        this.$colors = switchColors;
        this.$thumbValue = aVar;
        this.$interactionSource = interactionSource;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        SwitchKt.SwitchImpl(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
