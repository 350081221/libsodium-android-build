package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ v3.p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ MutableWindowInsets $safeInsets;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$2(int i5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, MutableWindowInsets mutableWindowInsets, v3.p<? super Composer, ? super Integer, r2> pVar4) {
        super(2);
        this.$floatingActionButtonPosition = i5;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$snackbarHost = pVar2;
        this.$floatingActionButton = pVar3;
        this.$safeInsets = mutableWindowInsets;
        this.$bottomBar = pVar4;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1979205334, i5, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:107)");
        }
        ScaffoldKt.m2108ScaffoldLayoutFMILGgc(this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$snackbarHost, this.$floatingActionButton, this.$safeInsets, this.$bottomBar, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
