package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1223:1\n487#2,4:1224\n491#2,2:1232\n495#2:1238\n25#3:1228\n1116#4,3:1229\n1119#4,3:1235\n1116#4,6:1239\n1116#4,6:1245\n487#5:1234\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1\n*L\n862#1:1224,4\n862#1:1232,2\n862#1:1238\n862#1:1228\n862#1:1229,3\n862#1:1235,3\n863#1:1239,6\n876#1:1245,6\n862#1:1234\n*E\n"})
/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRowImp$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRowImp$1(ScrollState scrollState, float f5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, int i5) {
        super(2);
        this.$scrollState = scrollState;
        this.$edgePadding = f5;
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
        this.$selectedTabIndex = i5;
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
            ComposerKt.traceEventStart(-1178901494, i5, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous> (TabRow.kt:861)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(121290627);
        boolean changed = composer.changed(this.$scrollState) | composer.changed(coroutineScope);
        ScrollState scrollState = this.$scrollState;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(scrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
        composer.endReplaceableGroup();
        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), this.$scrollState, false, null, false, 14, null)));
        composer.startReplaceableGroup(121291080);
        boolean changed2 = composer.changed(this.$edgePadding) | composer.changed(this.$tabs) | composer.changed(this.$divider) | composer.changed(this.$indicator) | composer.changedInstance(scrollableTabData) | composer.changed(this.$selectedTabIndex);
        float f5 = this.$edgePadding;
        v3.p<Composer, Integer, r2> pVar = this.$tabs;
        v3.p<Composer, Integer, r2> pVar2 = this.$divider;
        int i6 = this.$selectedTabIndex;
        v3.q<List<TabPosition>, Composer, Integer, r2> qVar = this.$indicator;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TabRowKt$ScrollableTabRowImp$1$1$1(f5, pVar, pVar2, scrollableTabData, i6, qVar);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (v3.p) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
