package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,671:1\n154#2:672\n154#2:673\n91#3,2:674\n93#3:704\n97#3:709\n78#4,11:676\n91#4:708\n456#5,8:687\n464#5,3:701\n467#5,3:705\n3737#6,6:695\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5\n*L\n352#1:672\n353#1:673\n355#1:674,2\n355#1:704\n355#1:709\n355#1:676,11\n355#1:708\n355#1:687,8\n355#1:701,3\n355#1:705,3\n355#1:695,6\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$5(boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
        super(2);
        this.$expanded = z4;
        this.$icon = pVar;
        this.$text = pVar2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        EnterTransition enterTransition;
        ExitTransition exitTransition;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1172118032, i5, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:351)");
        }
        Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(SizeKt.m606sizeInqDBjuR0$default(Modifier.Companion, this.$expanded ? FloatingActionButtonKt.ExtendedFabMinimumWidth : FabPrimaryTokens.INSTANCE.m2839getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), this.$expanded ? FloatingActionButtonKt.ExtendedFabStartIconPadding : Dp.m6044constructorimpl(0), 0.0f, this.$expanded ? FloatingActionButtonKt.ExtendedFabTextPadding : Dp.m6044constructorimpl(0), 0.0f, 10, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Arrangement.Horizontal start = this.$expanded ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
        v3.p<Composer, Integer, r2> pVar = this.$icon;
        boolean z4 = this.$expanded;
        v3.p<Composer, Integer, r2> pVar2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        enterTransition = FloatingActionButtonKt.ExtendedFabExpandAnimation;
        exitTransition = FloatingActionButtonKt.ExtendedFabCollapseAnimation;
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.composableLambda(composer, 176242764, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(pVar2)), composer, 1600518, 18);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
