package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1382:1\n64#2,5:1383\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n980#1:1383,5\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$createDeferredAnimation$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Transition<S>.DeferredAnimation<T, V> $lazyAnim;
    final /* synthetic */ Transition<S> $this_createDeferredAnimation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1(Transition<S> transition, Transition<S>.DeferredAnimation<T, V> deferredAnimation) {
        super(1);
        this.$this_createDeferredAnimation = transition;
        this.$lazyAnim = deferredAnimation;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final Transition<S> transition = this.$this_createDeferredAnimation;
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = this.$lazyAnim;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Transition.this.removeAnimation$animation_core_release(deferredAnimation);
            }
        };
    }
}
