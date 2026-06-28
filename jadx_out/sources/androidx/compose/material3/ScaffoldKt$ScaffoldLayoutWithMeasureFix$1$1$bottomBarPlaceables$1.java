package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bottomBarPlaceables$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ FabPlacement $fabPlacement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bottomBarPlaceables$1(FabPlacement fabPlacement, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$fabPlacement = fabPlacement;
        this.$bottomBar = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1843374446, i5, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:258)");
        }
        CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(this.$fabPlacement), this.$bottomBar, composer, ProvidedValue.$stable | 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
