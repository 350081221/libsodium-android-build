package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,245:1\n74#2:246\n1116#3,6:247\n1116#3,6:328\n68#4,6:253\n74#4:287\n78#4:378\n79#5,11:259\n79#5,11:294\n92#5:326\n79#5,11:340\n92#5:372\n92#5:377\n456#6,8:270\n464#6,3:284\n456#6,8:305\n464#6,3:319\n467#6,3:323\n456#6,8:351\n464#6,3:365\n467#6,3:369\n467#6,3:374\n3737#7,6:278\n3737#7,6:313\n3737#7,6:359\n87#8,6:288\n93#8:322\n97#8:327\n87#8,6:334\n93#8:368\n97#8:373\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n*L\n185#1:246\n191#1:247,6\n219#1:328,6\n198#1:253,6\n198#1:287\n198#1:378\n198#1:259,11\n213#1:294,11\n213#1:326\n217#1:340,11\n217#1:372\n198#1:377\n198#1:270,8\n198#1:284,3\n213#1:305,8\n213#1:319,3\n213#1:323,3\n217#1:351,8\n217#1:365,3\n217#1:369,3\n198#1:374,3\n198#1:278,6\n213#1:313,6\n217#1:359,6\n213#1:288,6\n213#1:322\n213#1:327\n217#1:334,6\n217#1:368\n217#1:373\n*E\n"})
/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$2 extends n0 implements q<BoxWithConstraintsScope, Composer, Integer, r2> {
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $dismissContent;
    final /* synthetic */ l<DismissDirection, ThresholdConfig> $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, l<? super DismissDirection, ? extends ThresholdConfig> lVar, DismissState dismissState, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = lVar;
        this.$state = dismissState;
        this.$background = qVar;
        this.$dismissContent = qVar2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l BoxWithConstraintsScope boxWithConstraintsScope, @m Composer composer, int i5) {
        int i6;
        Map j02;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(338007641, i6, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:183)");
        }
        float m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(boxWithConstraintsScope.mo489getConstraintsmsEJaDk());
        boolean z4 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Float valueOf = Float.valueOf(0.0f);
        DismissValue dismissValue = DismissValue.Default;
        j02 = a1.j0(q1.a(valueOf, dismissValue));
        Set<DismissDirection> set = this.$directions;
        DismissDirection dismissDirection = DismissDirection.StartToEnd;
        if (set.contains(dismissDirection)) {
            u0 a5 = q1.a(Float.valueOf(m6000getMaxWidthimpl), DismissValue.DismissedToEnd);
            j02.put(a5.getFirst(), a5.getSecond());
        }
        Set<DismissDirection> set2 = this.$directions;
        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
        if (set2.contains(dismissDirection2)) {
            u0 a6 = q1.a(Float.valueOf(-m6000getMaxWidthimpl), DismissValue.DismissedToStart);
            j02.put(a6.getFirst(), a6.getSecond());
        }
        composer.startReplaceableGroup(96530892);
        boolean changedInstance = composer.changedInstance(this.$dismissThresholds);
        l<DismissDirection, ThresholdConfig> lVar = this.$dismissThresholds;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(lVar);
            composer.updateRememberedValue(rememberedValue);
        }
        p pVar = (p) rememberedValue;
        composer.endReplaceableGroup();
        float f5 = this.$directions.contains(dismissDirection2) ? 10.0f : 20.0f;
        float f6 = this.$directions.contains(dismissDirection) ? 10.0f : 20.0f;
        Modifier.Companion companion = Modifier.Companion;
        Modifier m1465swipeablepPrIpRY$default = SwipeableKt.m1465swipeablepPrIpRY$default(companion, this.$state, j02, Orientation.Horizontal, this.$state.getCurrentValue() == dismissValue, z4, null, pVar, new ResistanceConfig(m6000getMaxWidthimpl, f5, f6), 0.0f, 288, null);
        q<RowScope, Composer, Integer, r2> qVar = this.$background;
        DismissState dismissState = this.$state;
        q<RowScope, Composer, Integer, r2> qVar2 = this.$dismissContent;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m1465swipeablepPrIpRY$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
        composer.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        a<ComposeUiNode> constructor2 = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(matchParentSize);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        qVar.invoke(rowScopeInstance, composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(96531876);
        boolean changed = composer.changed(dismissState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SwipeToDismissKt$SwipeToDismiss$2$1$1$1(dismissState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier offset = OffsetKt.offset(companion, (l) rememberedValue2);
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        a<ComposeUiNode> constructor3 = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(offset);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl3 = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        qVar2.invoke(rowScopeInstance, composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
