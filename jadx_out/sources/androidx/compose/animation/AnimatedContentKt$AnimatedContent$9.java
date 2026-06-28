package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$9 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ r<AnimatedContentScope, S, Composer, Integer, r2> $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ l<S, Object> $contentKey;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ l<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$9(Transition<S> transition, Modifier modifier, l<? super AnimatedContentTransitionScope<S>, ContentTransform> lVar, Alignment alignment, l<? super S, ? extends Object> lVar2, r<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, r2> rVar, int i5, int i6) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$modifier = modifier;
        this.$transitionSpec = lVar;
        this.$contentAlignment = alignment;
        this.$contentKey = lVar2;
        this.$content = rVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AnimatedContentKt.AnimatedContent(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
