package androidx.compose.material;

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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,521:1\n487#2,4:522\n491#2,2:530\n495#2:536\n25#3:526\n50#3:537\n49#3:538\n1116#4,3:527\n1119#4,3:533\n1116#4,6:539\n487#5:532\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2\n*L\n251#1:522,4\n251#1:530,2\n251#1:536\n251#1:526\n252#1:537\n252#1:538\n251#1:527,3\n251#1:533,3\n252#1:539,6\n251#1:532\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,521:1\n151#2,3:522\n33#2,4:525\n154#2,2:529\n38#2:531\n156#2:532\n33#2,6:533\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1\n*L\n270#1:522,3\n270#1:525,4\n270#1:529,2\n270#1:531\n270#1:532\n274#1:533,6\n*E\n"})
    /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
        final /* synthetic */ p<Composer, Integer, r2> $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
        final /* synthetic */ ScrollableTabData $scrollableTabData;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ p<Composer, Integer, r2> $tabs;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,521:1\n33#2,6:522\n33#2,6:528\n33#2,6:534\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$ScrollableTabRow$2$1$2\n*L\n284#1:522,6\n292#1:528,6\n307#1:534,6\n*E\n"})
        /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends n0 implements l<Placeable.PlacementScope, r2> {
            final /* synthetic */ long $constraints;
            final /* synthetic */ p<Composer, Integer, r2> $divider;
            final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
            final /* synthetic */ k1.f $layoutHeight;
            final /* synthetic */ k1.f $layoutWidth;
            final /* synthetic */ int $padding;
            final /* synthetic */ ScrollableTabData $scrollableTabData;
            final /* synthetic */ int $selectedTabIndex;
            final /* synthetic */ List<Placeable> $tabPlaceables;
            final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2$3, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends n0 implements p<Composer, Integer, r2> {
                final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
                final /* synthetic */ List<TabPosition> $tabPositions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, List<TabPosition> list) {
                    super(2);
                    this.$indicator = qVar;
                    this.$tabPositions = list;
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return r2.f19517a;
                }

                @Composable
                public final void invoke(@m Composer composer, int i5) {
                    if ((i5 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-411868839, i5, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:305)");
                    }
                    this.$indicator.invoke(this.$tabPositions, composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(int i5, List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, p<? super Composer, ? super Integer, r2> pVar, ScrollableTabData scrollableTabData, int i6, long j5, k1.f fVar, k1.f fVar2, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
                super(1);
                this.$padding = i5;
                this.$tabPlaceables = list;
                this.$this_SubcomposeLayout = subcomposeMeasureScope;
                this.$divider = pVar;
                this.$scrollableTabData = scrollableTabData;
                this.$selectedTabIndex = i6;
                this.$constraints = j5;
                this.$layoutWidth = fVar;
                this.$layoutHeight = fVar2;
                this.$indicator = qVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                ArrayList arrayList = new ArrayList();
                int i5 = this.$padding;
                List<Placeable> list = this.$tabPlaceables;
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Placeable placeable = list.get(i6);
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, 0, 0.0f, 4, null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.mo301toDpu2uoSUM(i5), subcomposeMeasureScope.mo301toDpu2uoSUM(placeable.getWidth()), null));
                    i5 += placeable.getWidth();
                }
                List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
                long j5 = this.$constraints;
                k1.f fVar = this.$layoutWidth;
                k1.f fVar2 = this.$layoutHeight;
                int i7 = 0;
                for (int size2 = subcompose.size(); i7 < size2; size2 = size2) {
                    Measurable measurable = subcompose.get(i7);
                    int i8 = fVar.element;
                    Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, i8, i8, 0, 0, 8, null));
                    Placeable.PlacementScope.placeRelative$default(placementScope, mo4998measureBRTryo0, 0, fVar2.element - mo4998measureBRTryo0.getHeight(), 0.0f, 4, null);
                    i7++;
                }
                List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new AnonymousClass3(this.$indicator, arrayList)));
                k1.f fVar3 = this.$layoutWidth;
                k1.f fVar4 = this.$layoutHeight;
                int size3 = subcompose2.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i9).mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(fVar3.element, fVar4.element)), 0, 0, 0.0f, 4, null);
                }
                this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f5, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, ScrollableTabData scrollableTabData, int i5, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
            super(2);
            this.$edgePadding = f5;
            this.$tabs = pVar;
            this.$divider = pVar2;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i5;
            this.$indicator = qVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
            return m1485invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
        }

        @p4.l
        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final MeasureResult m1485invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
            float f5;
            f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
            int mo298roundToPx0680j_4 = subcomposeMeasureScope.mo298roundToPx0680j_4(f5);
            int mo298roundToPx0680j_42 = subcomposeMeasureScope.mo298roundToPx0680j_4(this.$edgePadding);
            long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, mo298roundToPx0680j_4, 0, 0, 0, 14, null);
            List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, this.$tabs);
            ArrayList arrayList = new ArrayList(subcompose.size());
            int size = subcompose.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(subcompose.get(i5).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
            }
            k1.f fVar = new k1.f();
            fVar.element = mo298roundToPx0680j_42 * 2;
            k1.f fVar2 = new k1.f();
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Placeable placeable = (Placeable) arrayList.get(i6);
                fVar.element += placeable.getWidth();
                fVar2.element = Math.max(fVar2.element, placeable.getHeight());
            }
            return MeasureScope.layout$default(subcomposeMeasureScope, fVar.element, fVar2.element, null, new AnonymousClass2(mo298roundToPx0680j_42, arrayList, subcomposeMeasureScope, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, j5, fVar, fVar2, this.$indicator), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRow$2(float f5, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, int i5, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$edgePadding = f5;
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$selectedTabIndex = i5;
        this.$indicator = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1455860572, i5, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:249)");
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null))), new AnonymousClass1(this.$edgePadding, this.$tabs, this.$divider, (ScrollableTabData) rememberedValue2, this.$selectedTabIndex, this.$indicator), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
