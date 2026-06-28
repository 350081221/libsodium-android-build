package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1223:1\n81#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1\n*L\n684#1:1224\n*E\n"})
/* loaded from: classes.dex */
final class TabRowKt$PrimaryScrollableTabRow$1 extends kotlin.jvm.internal.n0 implements v3.q<List<? extends TabPosition>, Composer, Integer, r2> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$PrimaryScrollableTabRow$1(int i5) {
        super(3);
        this.$selectedTabIndex = i5;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m6058unboximpl();
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
            ComposerKt.traceEventStart(438091970, i5, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:682)");
        }
        if (this.$selectedTabIndex < list.size()) {
            State<Dp> m108animateDpAsStateAjpBEmI = AnimateAsStateKt.m108animateDpAsStateAjpBEmI(list.get(this.$selectedTabIndex).m2345getContentWidthD9Ej5fM(), null, null, null, composer, 0, 14);
            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
            tabRowDefaults.m2350PrimaryIndicator10LGxhE(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, list.get(this.$selectedTabIndex)), invoke$lambda$0(m108animateDpAsStateAjpBEmI), 0.0f, 0L, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
