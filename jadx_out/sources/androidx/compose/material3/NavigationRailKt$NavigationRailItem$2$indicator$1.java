package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,742:1\n1116#2,6:743\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt$NavigationRailItem$2$indicator$1\n*L\n254#1:743,6\n*E\n"})
/* loaded from: classes.dex */
final class NavigationRailKt$NavigationRailItem$2$indicator$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ NavigationRailItemColors $colors;
    final /* synthetic */ Shape $indicatorShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2$indicator$1(State<Float> state, NavigationRailItemColors navigationRailItemColors, Shape shape) {
        super(2);
        this.$animationProgress = state;
        this.$colors = navigationRailItemColors;
        this.$indicatorShape = shape;
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
            ComposerKt.traceEventStart(-1862011490, i5, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:250)");
        }
        Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
        composer.startReplaceableGroup(540475060);
        boolean changed = composer.changed(this.$animationProgress);
        State<Float> state = this.$animationProgress;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NavigationRailKt$NavigationRailItem$2$indicator$1$1$1(state);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BoxKt.Box(BackgroundKt.m200backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(layoutId, (v3.l) rememberedValue), this.$colors.m2039getIndicatorColor0d7_KjU$material3_release(), this.$indicatorShape), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
