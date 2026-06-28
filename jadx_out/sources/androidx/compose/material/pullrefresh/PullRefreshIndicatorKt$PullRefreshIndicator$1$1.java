package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
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
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "Lkotlin/r2;", "invoke", "(ZLandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,250:1\n69#2,5:251\n74#2:284\n78#2:291\n79#3,11:256\n92#3:290\n456#4,8:267\n464#4,3:281\n467#4,3:287\n3737#5,6:275\n51#6:285\n92#6:286\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n*L\n105#1:251,5\n105#1:284\n105#1:291\n105#1:256,11\n105#1:290\n105#1:267,8\n105#1:281,3\n105#1:287,3\n105#1:275,6\n109#1:285\n109#1:286\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$PullRefreshIndicator$1$1 extends n0 implements q<Boolean, Composer, Integer, r2> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$1$1(long j5, PullRefreshState pullRefreshState) {
        super(3);
        this.$contentColor = j5;
        this.$state = pullRefreshState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(boolean z4, @m Composer composer, int i5) {
        int i6;
        float f5;
        float f6;
        float f7;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(z4) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1853731063, i6, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Alignment center = Alignment.Companion.getCenter();
        long j5 = this.$contentColor;
        PullRefreshState pullRefreshState = this.$state;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        f5 = PullRefreshIndicatorKt.ArcRadius;
        f6 = PullRefreshIndicatorKt.StrokeWidth;
        float m6044constructorimpl = Dp.m6044constructorimpl(Dp.m6044constructorimpl(f5 + f6) * 2);
        if (z4) {
            composer.startReplaceableGroup(-2035147035);
            f7 = PullRefreshIndicatorKt.StrokeWidth;
            ProgressIndicatorKt.m1399CircularProgressIndicatorLxG7B9w(SizeKt.m602size3ABfNKs(companion, m6044constructorimpl), j5, f7, 0L, 0, composer, 390, 24);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2035146781);
            PullRefreshIndicatorKt.m1527CircularArrowIndicatoriJQMabo(pullRefreshState, j5, SizeKt.m602size3ABfNKs(companion, m6044constructorimpl), composer, 392);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
