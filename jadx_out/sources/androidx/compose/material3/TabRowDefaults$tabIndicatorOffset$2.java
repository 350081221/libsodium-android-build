package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1223:1\n81#2:1224\n81#2:1225\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n*L\n1135#1:1224\n1139#1:1225\n*E\n"})
/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 extends kotlin.jvm.internal.n0 implements v3.q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m6058unboximpl();
    }

    private static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m6058unboximpl();
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1541271084);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i5, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1134)");
        }
        State<Dp> m108animateDpAsStateAjpBEmI = AnimateAsStateKt.m108animateDpAsStateAjpBEmI(this.$currentTabPosition.m2348getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        Modifier m607width3ABfNKs = SizeKt.m607width3ABfNKs(OffsetKt.m514offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null), invoke$lambda$1(AnimateAsStateKt.m108animateDpAsStateAjpBEmI(this.$currentTabPosition.m2346getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12)), 0.0f, 2, null), invoke$lambda$0(m108animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m607width3ABfNKs;
    }
}
