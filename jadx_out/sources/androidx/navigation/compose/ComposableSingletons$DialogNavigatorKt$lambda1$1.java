package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$DialogNavigatorKt$lambda1$1 extends n0 implements q<NavBackStackEntry, Composer, Integer, r2> {
    public static final ComposableSingletons$DialogNavigatorKt$lambda1$1 INSTANCE = new ComposableSingletons$DialogNavigatorKt$lambda1$1();

    ComposableSingletons$DialogNavigatorKt$lambda1$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(navBackStackEntry, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l NavBackStackEntry navBackStackEntry, @m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092249270, i5, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:64)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
