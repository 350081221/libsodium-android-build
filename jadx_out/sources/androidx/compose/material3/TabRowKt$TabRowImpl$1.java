package androidx.compose.material3;

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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1223:1\n1116#2,6:1224\n1116#2,6:1230\n1116#2,6:1240\n170#3,3:1236\n169#3:1246\n78#3,11:1247\n91#3:1278\n174#3:1279\n36#4:1239\n456#4,8:1258\n464#4,6:1272\n3737#5,6:1266\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1\n*L\n372#1:1224,6\n417#1:1230,6\n410#1:1240,6\n410#1:1236,3\n410#1:1246\n410#1:1247,11\n410#1:1278\n410#1:1279\n410#1:1239\n410#1:1258,8\n410#1:1272,6\n410#1:1266,6\n*E\n"})
/* loaded from: classes.dex */
final class TabRowKt$TabRowImpl$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ v3.q<TabIndicatorScope, Composer, Integer, r2> $indicator;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.TabRowKt$TabRowImpl$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ v3.q<TabIndicatorScope, Composer, Integer, r2> $indicator;
        final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(v3.q<? super TabIndicatorScope, ? super Composer, ? super Integer, r2> qVar, TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
            super(2);
            this.$indicator = qVar;
            this.$scope = tabRowKt$TabRowImpl$1$scope$1$1;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1236693605, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:414)");
            }
            this.$indicator.invoke(this.$scope, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRowImpl$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super TabIndicatorScope, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        List L;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-65106680, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:371)");
        }
        composer.startReplaceableGroup(474062752);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
            composer.updateRememberedValue(rememberedValue);
        }
        final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) rememberedValue;
        composer.endReplaceableGroup();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        L = kotlin.collections.w.L(this.$tabs, this.$divider, ComposableLambdaKt.composableLambda(composer, 1236693605, true, new AnonymousClass1(this.$indicator, tabRowKt$TabRowImpl$1$scope$1$1)));
        composer.startReplaceableGroup(474064303);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1

                @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2\n*L\n467#1:1224,6\n471#1:1230,6\n475#1:1236,6\n*E\n"})
                /* renamed from: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                    final /* synthetic */ List<Placeable> $dividerPlaceables;
                    final /* synthetic */ List<Placeable> $indicatorPlaceables;
                    final /* synthetic */ List<Placeable> $tabPlaceables;
                    final /* synthetic */ int $tabRowHeight;
                    final /* synthetic */ k1.f $tabWidth;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, k1.f fVar, int i5) {
                        super(1);
                        this.$tabPlaceables = list;
                        this.$dividerPlaceables = list2;
                        this.$indicatorPlaceables = list3;
                        this.$tabWidth = fVar;
                        this.$tabRowHeight = i5;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                        List<Placeable> list = this.$tabPlaceables;
                        k1.f fVar = this.$tabWidth;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), i5 * fVar.element, 0, 0.0f, 4, null);
                        }
                        List<Placeable> list2 = this.$dividerPlaceables;
                        int i6 = this.$tabRowHeight;
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            Placeable placeable = list2.get(i7);
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i6 - placeable.getHeight(), 0.0f, 4, null);
                        }
                        List<Placeable> list3 = this.$indicatorPlaceables;
                        int i8 = this.$tabRowHeight;
                        int size3 = list3.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            Placeable placeable2 = list3.get(i9);
                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i8 - placeable2.getHeight(), 0.0f, 4, null);
                        }
                    }
                }

                @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                @p4.l
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo1973measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends List<? extends Measurable>> list, long j5) {
                    Comparable X;
                    MeasureScope measureScope2 = measureScope;
                    List<? extends Measurable> list2 = list.get(0);
                    List<? extends Measurable> list3 = list.get(1);
                    int i6 = 2;
                    List<? extends Measurable> list4 = list.get(2);
                    int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
                    int size = list2.size();
                    k1.f fVar = new k1.f();
                    if (size > 0) {
                        fVar.element = m6000getMaxWidthimpl / size;
                    }
                    Integer num = 0;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        num = Integer.valueOf(Math.max(list2.get(i7).maxIntrinsicHeight(fVar.element), num.intValue()));
                    }
                    int intValue = num.intValue();
                    TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = TabRowKt$TabRowImpl$1$scope$1$1.this;
                    ArrayList arrayList = new ArrayList(size);
                    int i8 = 0;
                    while (i8 < size) {
                        X = kotlin.comparisons.h.X(Dp.m6042boximpl(Dp.m6044constructorimpl(measureScope2.mo301toDpu2uoSUM(Math.min(list2.get(i8).maxIntrinsicWidth(intValue), fVar.element)) - Dp.m6044constructorimpl(TabKt.getHorizontalTextPadding() * i6))), Dp.m6042boximpl(Dp.m6044constructorimpl(24)));
                        arrayList.add(new TabPosition(Dp.m6044constructorimpl(measureScope2.mo301toDpu2uoSUM(fVar.element) * i8), measureScope2.mo301toDpu2uoSUM(fVar.element), ((Dp) X).m6058unboximpl(), null));
                        i8++;
                        measureScope2 = measureScope;
                        i6 = 2;
                    }
                    tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        Measurable measurable = list2.get(i9);
                        int i10 = fVar.element;
                        arrayList2.add(measurable.mo4998measureBRTryo0(Constraints.m5990copyZbe2FdA(j5, i10, i10, intValue, intValue)));
                    }
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size4 = list3.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        arrayList3.add(list3.get(i11).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null)));
                    }
                    ArrayList arrayList4 = new ArrayList(list4.size());
                    int size5 = list4.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        Measurable measurable2 = list4.get(i12);
                        int i13 = fVar.element;
                        arrayList4.add(measurable2.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, i13, i13, 0, intValue, 4, null)));
                    }
                    return MeasureScope.layout$default(measureScope, m6000getMaxWidthimpl, intValue, null, new AnonymousClass2(arrayList2, arrayList3, arrayList4, fVar, intValue), 4, null);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1399185516);
        v3.p<Composer, Integer, r2> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(L);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(multiContentMeasurePolicy);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        combineAsVirtualLayouts.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
