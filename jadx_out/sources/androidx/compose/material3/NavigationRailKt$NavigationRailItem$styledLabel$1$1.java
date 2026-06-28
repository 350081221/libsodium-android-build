package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,742:1\n81#2:743\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1\n*L\n188#1:743\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ NavigationRailItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItem$styledLabel$1$1(NavigationRailItemColors navigationRailItemColors, boolean z4, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$colors = navigationRailItemColors;
        this.$selected = z4;
        this.$enabled = z5;
        this.$label = pVar;
    }

    private static final long invoke$lambda$0(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-105269599, i5, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:186)");
        }
        ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(invoke$lambda$0(this.$colors.textColor$material3_release(this.$selected, this.$enabled, composer, 0)), TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), NavigationRailTokens.INSTANCE.getLabelTextFont()), this.$label, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
