package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import v3.q;

/* JADX INFO: Add missing generic type declarations: [S] */
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,1382:1\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt$animateIntOffset$1<S> extends n0 implements q<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>> {
    public static final TransitionKt$animateIntOffset$1 INSTANCE = new TransitionKt$animateIntOffset$1();

    public TransitionKt$animateIntOffset$1() {
        super(3);
    }

    @l
    @Composable
    public final SpringSpec<IntOffset> invoke(@l Transition.Segment<S> segment, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1953479610);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1953479610, i5, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1285)");
        }
        SpringSpec<IntOffset> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6163boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Object obj, Composer composer, Integer num) {
        return invoke((Transition.Segment) obj, composer, num.intValue());
    }
}
