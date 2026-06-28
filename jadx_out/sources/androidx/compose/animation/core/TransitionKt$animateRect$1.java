package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Add missing generic type declarations: [S] */
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,1382:1\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$animateRect$1<S> extends n0 implements q<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>> {
    public static final TransitionKt$animateRect$1 INSTANCE = new TransitionKt$animateRect$1();

    public TransitionKt$animateRect$1() {
        super(3);
    }

    @l
    @Composable
    public final SpringSpec<Rect> invoke(@l Transition.Segment<S> segment, @m Composer composer, int i5) {
        composer.startReplaceableGroup(691336298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(691336298, i5, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1376)");
        }
        SpringSpec<Rect> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
