package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(ZLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SegmentedButtonDefaults$Icon$2 extends kotlin.jvm.internal.n0 implements v3.q<Boolean, Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $activeContent;
    final /* synthetic */ v3.p<Composer, Integer, r2> $inactiveContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonDefaults$Icon$2(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
        super(3);
        this.$activeContent = pVar;
        this.$inactiveContent = pVar2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(boolean z4, @p4.m Composer composer, int i5) {
        v3.p<Composer, Integer, r2> pVar;
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(z4) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1364873619, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:589)");
        }
        if (z4) {
            composer.startReplaceableGroup(-412602680);
            pVar = this.$activeContent;
        } else {
            composer.startReplaceableGroup(-412602659);
            pVar = this.$inactiveContent;
        }
        pVar.invoke(composer, 0);
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
