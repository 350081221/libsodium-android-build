package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "pullRefreshState", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.pulltorefresh.ComposableSingletons$PullToRefreshKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$PullToRefreshKt$lambda1$1 extends n0 implements q<PullToRefreshState, Composer, Integer, r2> {
    public static final ComposableSingletons$PullToRefreshKt$lambda1$1 INSTANCE = new ComposableSingletons$PullToRefreshKt$lambda1$1();

    ComposableSingletons$PullToRefreshKt$lambda1$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(PullToRefreshState pullToRefreshState, Composer composer, Integer num) {
        invoke(pullToRefreshState, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l PullToRefreshState pullToRefreshState, @m Composer composer, int i5) {
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(pullToRefreshState) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1116780789, i5, -1, "androidx.compose.material3.pulltorefresh.ComposableSingletons$PullToRefreshKt.lambda-1.<anonymous> (PullToRefresh.kt:110)");
        }
        PullToRefreshDefaults.INSTANCE.m2617IndicatorFNF3uiM(pullToRefreshState, null, 0L, composer, (i5 & 14) | 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
