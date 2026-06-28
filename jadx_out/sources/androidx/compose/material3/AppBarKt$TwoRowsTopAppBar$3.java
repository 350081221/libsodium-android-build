package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2283:1\n73#2,7:2284\n80#2:2319\n84#2:2324\n78#3,11:2291\n91#3:2323\n456#4,8:2302\n464#4,3:2316\n467#4,3:2320\n3737#5,6:2310\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n*L\n1809#1:2284,7\n1809#1:2319\n1809#1:2324\n1809#1:2291,11\n1809#1:2323\n1809#1:2302,8\n1809#1:2316,3\n1809#1:2320,3\n1809#1:2310,6\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ k1.e $maxHeightPx;
    final /* synthetic */ v3.p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ k1.e $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ v3.p<Composer, Integer, r2> $smallTitle;
    final /* synthetic */ TextStyle $smallTitleTextStyle;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ k1.f $titleBottomPaddingPx;
    final /* synthetic */ TextStyle $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TwoRowsTopAppBar$3(WindowInsets windowInsets, k1.e eVar, TopAppBarColors topAppBarColors, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, float f5, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, k1.e eVar2, TopAppBarScrollBehavior topAppBarScrollBehavior, v3.p<? super Composer, ? super Integer, r2> pVar4, TextStyle textStyle2, float f6, k1.f fVar, boolean z5) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$pinnedHeightPx = eVar;
        this.$colors = topAppBarColors;
        this.$smallTitle = pVar;
        this.$smallTitleTextStyle = textStyle;
        this.$topTitleAlpha = f5;
        this.$hideTopRowSemantics = z4;
        this.$navigationIcon = pVar2;
        this.$actionsRow = pVar3;
        this.$maxHeightPx = eVar2;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$title = pVar4;
        this.$titleTextStyle = textStyle2;
        this.$bottomTitleAlpha = f6;
        this.$titleBottomPaddingPx = fVar;
        this.$hideBottomRowSemantics = z5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        TopAppBarState state;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985938853, i5, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1808)");
        }
        WindowInsets windowInsets = this.$windowInsets;
        k1.e eVar = this.$pinnedHeightPx;
        TopAppBarColors topAppBarColors = this.$colors;
        v3.p<Composer, Integer, r2> pVar = this.$smallTitle;
        TextStyle textStyle = this.$smallTitleTextStyle;
        float f5 = this.$topTitleAlpha;
        boolean z4 = this.$hideTopRowSemantics;
        v3.p<Composer, Integer, r2> pVar2 = this.$navigationIcon;
        v3.p<Composer, Integer, r2> pVar3 = this.$actionsRow;
        k1.e eVar2 = this.$maxHeightPx;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        v3.p<Composer, Integer, r2> pVar4 = this.$title;
        TextStyle textStyle2 = this.$titleTextStyle;
        float f6 = this.$bottomTitleAlpha;
        k1.f fVar = this.$titleBottomPaddingPx;
        boolean z5 = this.$hideBottomRowSemantics;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AppBarKt.m1559TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets)), eVar.element, topAppBarColors.m2604getNavigationIconContentColor0d7_KjU(), topAppBarColors.m2606getTitleContentColor0d7_KjU(), topAppBarColors.m2602getActionIconContentColor0d7_KjU(), pVar, textStyle, f5, arrangement.getCenter(), arrangement.getStart(), 0, z4, pVar2, pVar3, composer, 905969664, 3078);
        Modifier clipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(companion, WindowInsetsKt.m628onlybOOhFvg(windowInsets, WindowInsetsSides.Companion.m649getHorizontalJoeWqyM())));
        float heightOffset = ((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset()) + (eVar2.element - eVar.element);
        long m2604getNavigationIconContentColor0d7_KjU = topAppBarColors.m2604getNavigationIconContentColor0d7_KjU();
        long m2606getTitleContentColor0d7_KjU = topAppBarColors.m2606getTitleContentColor0d7_KjU();
        long m2602getActionIconContentColor0d7_KjU = topAppBarColors.m2602getActionIconContentColor0d7_KjU();
        Arrangement.Vertical bottom = arrangement.getBottom();
        Arrangement.Horizontal start = arrangement.getStart();
        int i6 = fVar.element;
        ComposableSingletons$AppBarKt composableSingletons$AppBarKt = ComposableSingletons$AppBarKt.INSTANCE;
        AppBarKt.m1559TopAppBarLayoutkXwM9vE(clipToBounds, heightOffset, m2604getNavigationIconContentColor0d7_KjU, m2606getTitleContentColor0d7_KjU, m2602getActionIconContentColor0d7_KjU, pVar4, textStyle2, f6, bottom, start, i6, z5, composableSingletons$AppBarKt.m1732getLambda11$material3_release(), composableSingletons$AppBarKt.m1733getLambda12$material3_release(), composer, 905969664, 3456);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
