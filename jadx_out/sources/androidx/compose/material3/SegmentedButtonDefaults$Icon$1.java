package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SegmentedButtonDefaults$Icon$1 extends kotlin.jvm.internal.n0 implements v3.q<AnimatedVisibilityScope, Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $activeContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonDefaults$Icon$1(v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(3);
        this.$activeContent = pVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@p4.l AnimatedVisibilityScope animatedVisibilityScope, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-750750819, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:585)");
        }
        this.$activeContent.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
