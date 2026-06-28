package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.r2;

@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$PrimaryTabRow$1 extends kotlin.jvm.internal.n0 implements v3.q<TabIndicatorScope, Composer, Integer, r2> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$PrimaryTabRow$1(int i5) {
        super(3);
        this.$selectedTabIndex = i5;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(TabIndicatorScope tabIndicatorScope, Composer composer, Integer num) {
        invoke(tabIndicatorScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l TabIndicatorScope tabIndicatorScope, @p4.m Composer composer, int i5) {
        int i6;
        if ((i5 & 6) == 0) {
            i6 = ((i5 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2021049253, i6, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:153)");
        }
        TabRowDefaults.INSTANCE.m2350PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, this.$selectedTabIndex, true), Dp.Companion.m6064getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer, 196656, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
