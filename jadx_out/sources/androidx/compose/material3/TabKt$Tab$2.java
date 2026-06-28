package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TabKt$Tab$2 extends kotlin.jvm.internal.n0 implements v3.q<ColumnScope, Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ v3.p<Composer, Integer, r2> $styledText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$Tab$2(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
        super(3);
        this.$styledText = pVar;
        this.$icon = pVar2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l ColumnScope columnScope, @p4.m Composer composer, int i5) {
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1540996038, i5, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:119)");
        }
        TabKt.TabBaselineLayout(this.$styledText, this.$icon, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
