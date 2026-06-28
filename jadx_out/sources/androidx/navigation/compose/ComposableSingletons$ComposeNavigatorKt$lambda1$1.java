package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "Lu3/n;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$ComposeNavigatorKt$lambda1$1 extends n0 implements r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, r2> {
    public static final ComposableSingletons$ComposeNavigatorKt$lambda1$1 INSTANCE = new ComposableSingletons$ComposeNavigatorKt$lambda1$1();

    ComposableSingletons$ComposeNavigatorKt$lambda1$1() {
        super(4);
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@l AnimatedContentScope animatedContentScope, @l NavBackStackEntry navBackStackEntry, @m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(127448943, i5, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:62)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
