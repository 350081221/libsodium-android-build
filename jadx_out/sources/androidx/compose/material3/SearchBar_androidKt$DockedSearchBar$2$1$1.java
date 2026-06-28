package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,741:1\n74#2:742\n154#3:743\n1116#4,3:744\n1119#4,3:748\n1116#4,6:751\n88#5:747\n74#6,6:757\n80#6:791\n84#6:796\n78#7,11:763\n91#7:795\n456#8,8:774\n464#8,3:788\n467#8,3:792\n3737#9,6:782\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1$1\n*L\n398#1:742\n398#1:743\n399#1:744,3\n399#1:748,3\n402#1:751,6\n400#1:747\n406#1:757,6\n406#1:791\n406#1:796\n406#1:763,11\n406#1:795\n406#1:774,8\n406#1:788,3\n406#1:792,3\n406#1:782,6\n*E\n"})
/* loaded from: classes.dex */
final class SearchBar_androidKt$DockedSearchBar$2$1$1 extends kotlin.jvm.internal.n0 implements v3.q<AnimatedVisibilityScope, Composer, Integer, r2> {
    final /* synthetic */ SearchBarColors $colors;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBar_androidKt$DockedSearchBar$2$1$1(SearchBarColors searchBarColors, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar) {
        super(3);
        this.$colors = searchBarColors;
        this.$content = qVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l AnimatedVisibilityScope animatedVisibilityScope, @p4.m Composer composer, int i5) {
        Comparable D;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1804538904, i5, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:397)");
        }
        float m6044constructorimpl = Dp.m6044constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        composer.startReplaceableGroup(747855826);
        boolean changed = composer.changed(m6044constructorimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m6042boximpl(Dp.m6044constructorimpl(m6044constructorimpl * 0.6666667f));
            composer.updateRememberedValue(rememberedValue);
        }
        float m6058unboximpl = ((Dp) rememberedValue).m6058unboximpl();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(747855974);
        boolean changed2 = composer.changed(m6058unboximpl);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            D = kotlin.ranges.u.D(Dp.m6042boximpl(SearchBar_androidKt.getDockedActiveTableMinHeight()), Dp.m6042boximpl(m6058unboximpl));
            rememberedValue2 = Dp.m6042boximpl(((Dp) D).m6058unboximpl());
            composer.updateRememberedValue(rememberedValue2);
        }
        float m6058unboximpl2 = ((Dp) rememberedValue2).m6058unboximpl();
        composer.endReplaceableGroup();
        Modifier m589heightInVpY3zN4 = SizeKt.m589heightInVpY3zN4(Modifier.Companion, m6058unboximpl2, m6058unboximpl);
        SearchBarColors searchBarColors = this.$colors;
        v3.q<ColumnScope, Composer, Integer, r2> qVar = this.$content;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m589heightInVpY3zN4);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m2116getDividerColor0d7_KjU(), composer, 0, 3);
        qVar.invoke(columnScopeInstance, composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
