package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.r2;

@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$SecondaryScrollableTabRow$1 extends kotlin.jvm.internal.n0 implements v3.q<List<? extends TabPosition>, Composer, Integer, r2> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$SecondaryScrollableTabRow$1(int i5) {
        super(3);
        this.$selectedTabIndex = i5;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        invoke((List<TabPosition>) list, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l List<TabPosition> list, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-115843248, i5, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:754)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
        tabRowDefaults.m2351SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, list.get(this.$selectedTabIndex)), 0.0f, 0L, composer, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
