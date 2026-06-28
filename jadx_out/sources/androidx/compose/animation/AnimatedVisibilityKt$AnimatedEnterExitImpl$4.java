package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, r2> $content;
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ OnLookaheadMeasured $onLookaheadMeasured;
    final /* synthetic */ p<EnterExitState, EnterExitState, Boolean> $shouldDisposeBlock;
    final /* synthetic */ Transition<T> $transition;
    final /* synthetic */ l<T, Boolean> $visible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$4(Transition<T> transition, l<? super T, Boolean> lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, p<? super EnterExitState, ? super EnterExitState, Boolean> pVar, OnLookaheadMeasured onLookaheadMeasured, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$transition = transition;
        this.$visible = lVar;
        this.$modifier = modifier;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
        this.$shouldDisposeBlock = pVar;
        this.$onLookaheadMeasured = onLookaheadMeasured;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AnimatedVisibilityKt.AnimatedEnterExitImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$onLookaheadMeasured, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
