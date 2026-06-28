package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
@r1({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,558:1\n69#2,5:559\n74#2:592\n78#2:603\n78#3,11:564\n91#3:602\n456#4,8:575\n464#4,3:589\n467#4,3:599\n3737#5,6:583\n1116#6,6:593\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshDefaults$Indicator$1\n*L\n172#1:559,5\n172#1:592\n172#1:603\n172#1:564,11\n172#1:602\n172#1:575,8\n172#1:589,3\n172#1:599,3\n172#1:583,6\n184#1:593,6\n*E\n"})
/* loaded from: classes.dex */
public final class PullToRefreshDefaults$Indicator$1 extends n0 implements q<Boolean, Composer, Integer, r2> {
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PullToRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshDefaults$Indicator$1(Modifier modifier, long j5, PullToRefreshState pullToRefreshState) {
        super(3);
        this.$modifier = modifier;
        this.$color = j5;
        this.$state = pullToRefreshState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, Composer composer, Integer num) {
        invoke(bool.booleanValue(), composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(boolean z4, @m Composer composer, int i5) {
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(z4) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1378661396, i5, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:171)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
        Alignment center = Alignment.Companion.getCenter();
        long j5 = this.$color;
        PullToRefreshState pullToRefreshState = this.$state;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z4) {
            composer.startReplaceableGroup(-1849687637);
            ProgressIndicatorKt.m2071CircularProgressIndicatorLxG7B9w(SizeKt.m602size3ABfNKs(Modifier.Companion, PullToRefreshKt.getSpinnerSize()), j5, PullToRefreshKt.access$getStrokeWidth$p(), 0L, 0, composer, 390, 24);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1849687390);
            composer.startReplaceableGroup(-1849687301);
            boolean changed = composer.changed(pullToRefreshState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new PullToRefreshDefaults$Indicator$1$1$1$1(pullToRefreshState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            PullToRefreshKt.m2621access$CircularArrowProgressIndicatorRPmYEkk((a) rememberedValue, j5, composer, 0);
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
