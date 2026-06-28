package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ComposableSingletons$ListItemKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$ListItemKt$lambda2$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    public static final ComposableSingletons$ListItemKt$lambda2$1 INSTANCE = new ComposableSingletons$ListItemKt$lambda2$1();

    ComposableSingletons$ListItemKt$lambda2$1() {
        super(2);
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
            ComposerKt.traceEventStart(-1538071006, i5, -1, "androidx.compose.material3.ComposableSingletons$ListItemKt.lambda-2.<anonymous> (ListItem.kt:173)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
