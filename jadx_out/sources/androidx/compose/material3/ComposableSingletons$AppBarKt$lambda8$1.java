package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-8$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda8$1 extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
    public static final ComposableSingletons$AppBarKt$lambda8$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda8$1();

    ComposableSingletons$AppBarKt$lambda8$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@p4.l RowScope rowScope, @p4.m Composer composer, int i5) {
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-994959539, i5, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-8.<anonymous> (AppBar.kt:284)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
