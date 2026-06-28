package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Add missing generic type declarations: [S, T] */
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1382:1\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$1<S, T> extends n0 implements q<Transition.Segment<S>, Composer, Integer, SpringSpec<T>> {
    public static final TransitionKt$animateValue$1 INSTANCE = new TransitionKt$animateValue$1();

    public TransitionKt$animateValue$1() {
        super(3);
    }

    @l
    @Composable
    public final SpringSpec<T> invoke(@l Transition.Segment<S> segment, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-895531546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-895531546, i5, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1077)");
        }
        SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
