package androidx.compose.animation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$16 extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedVisibility$16(p<? super Composer, ? super Integer, r2> pVar) {
        super(3);
        this.$content = pVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l AnimatedVisibilityScope animatedVisibilityScope, @m Composer composer, int i5) {
        if ((i5 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1996320812, i5, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:721)");
        }
        this.$content.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
