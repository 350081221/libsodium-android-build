package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n33#2,4:1235\n38#2:1241\n256#2,3:1242\n33#2,4:1245\n259#2,2:1249\n38#2:1251\n261#2:1252\n92#3:1239\n58#3:1240\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1\n*L\n882#1:1224,3\n882#1:1227,4\n882#1:1231,2\n882#1:1233\n882#1:1234\n894#1:1235,4\n894#1:1241\n906#1:1242,3\n906#1:1245,4\n906#1:1249,2\n906#1:1251\n906#1:1252\n901#1:1239\n901#1:1240\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowImp$1$1$1 extends kotlin.jvm.internal.n0 implements v3.p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ ScrollableTabData $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$ScrollableTabRowImp$1$1$1$2\n*L\n915#1:1224,6\n929#1:1230,6\n944#1:1236,6\n*E\n"})
    /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ long $constraints;
        final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
        final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ int $padding;
        final /* synthetic */ ScrollableTabData $scrollableTabData;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ List<Dp> $tabContentWidths;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1$2$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
            final /* synthetic */ List<TabPosition> $tabPositions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, List<TabPosition> list) {
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
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(358596038, i5, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:942)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(int i5, List<Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, v3.p<? super Composer, ? super Integer, r2> pVar, ScrollableTabData scrollableTabData, int i6, List<Dp> list2, long j5, int i7, int i8, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
            super(1);
            this.$padding = i5;
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = pVar;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i6;
            this.$tabContentWidths = list2;
            this.$constraints = j5;
            this.$layoutWidth = i7;
            this.$layoutHeight = i8;
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
            List<Dp> list2 = this.$tabContentWidths;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Placeable placeable = list.get(i6);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, 0, 0.0f, 4, null);
                arrayList.add(new TabPosition(subcomposeMeasureScope.mo301toDpu2uoSUM(i5), subcomposeMeasureScope.mo301toDpu2uoSUM(placeable.getWidth()), list2.get(i6).m6058unboximpl(), null));
                i5 += placeable.getWidth();
            }
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j5 = this.$constraints;
            int i7 = this.$layoutWidth;
            int i8 = this.$layoutHeight;
            int i9 = 0;
            for (int size2 = subcompose.size(); i9 < size2; size2 = size2) {
                Placeable mo4998measureBRTryo0 = subcompose.get(i9).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, i7, i7, 0, 0, 8, null));
                Placeable.PlacementScope.placeRelative$default(placementScope, mo4998measureBRTryo0, 0, i8 - mo4998measureBRTryo0.getHeight(), 0.0f, 4, null);
                i9++;
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(358596038, true, new AnonymousClass3(this.$indicator, arrayList)));
            int i10 = this.$layoutWidth;
            int i11 = this.$layoutHeight;
            int size3 = subcompose2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i12).mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(i10, i11)), 0, 0, 0.0f, 4, null);
            }
            this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRowImp$1$1$1(float f5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, ScrollableTabData scrollableTabData, int i5, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
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
        return m2365invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m2365invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        float f5;
        f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
        int mo298roundToPx0680j_4 = subcomposeMeasureScope.mo298roundToPx0680j_4(f5);
        int mo298roundToPx0680j_42 = subcomposeMeasureScope.mo298roundToPx0680j_4(this.$edgePadding);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, this.$tabs);
        Integer num = 0;
        int size = subcompose.size();
        for (int i5 = 0; i5 < size; i5++) {
            num = Integer.valueOf(Math.max(num.intValue(), subcompose.get(i5).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        int intValue = num.intValue();
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, mo298roundToPx0680j_4, 0, intValue, intValue, 2, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = subcompose.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Measurable measurable = subcompose.get(i6);
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
            float m6044constructorimpl = Dp.m6044constructorimpl(subcomposeMeasureScope.mo301toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo4998measureBRTryo0.getHeight()), mo4998measureBRTryo0.getWidth())) - Dp.m6044constructorimpl(TabKt.getHorizontalTextPadding() * 2));
            arrayList.add(mo4998measureBRTryo0);
            arrayList2.add(Dp.m6042boximpl(m6044constructorimpl));
        }
        Integer valueOf = Integer.valueOf(mo298roundToPx0680j_42 * 2);
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i7)).getWidth());
        }
        int intValue2 = valueOf.intValue();
        return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new AnonymousClass2(mo298roundToPx0680j_42, arrayList, subcomposeMeasureScope, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, arrayList2, j5, intValue2, intValue, this.$indicator), 4, null);
    }
}
