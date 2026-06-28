package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SliderState $state;
    final /* synthetic */ v3.q<SliderState, Composer, Integer, r2> $thumb;
    final /* synthetic */ v3.q<SliderState, Composer, Integer, r2> $track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$SliderImpl$3(Modifier modifier, SliderState sliderState, boolean z4, MutableInteractionSource mutableInteractionSource, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar2, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$state = sliderState;
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$thumb = qVar;
        this.$track = qVar2;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SliderKt.SliderImpl(this.$modifier, this.$state, this.$enabled, this.$interactionSource, this.$thumb, this.$track, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
