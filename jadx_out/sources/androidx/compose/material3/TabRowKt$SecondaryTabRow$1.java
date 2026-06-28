package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$SecondaryTabRow$1 extends kotlin.jvm.internal.n0 implements v3.q<TabIndicatorScope, Composer, Integer, r2> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$SecondaryTabRow$1(int i5) {
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
        if ((i5 & 6) == 0) {
            i5 |= (i5 & 8) == 0 ? composer.changed(tabIndicatorScope) : composer.changedInstance(tabIndicatorScope) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286693261, i5, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:210)");
        }
        TabRowDefaults.INSTANCE.m2351SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, this.$selectedTabIndex, false), 0.0f, 0L, composer, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
