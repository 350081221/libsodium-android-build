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
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n256#2,3:1224\n33#2,4:1227\n259#2,2:1231\n38#2:1233\n261#2:1234\n151#2,3:1235\n33#2,4:1238\n154#2,2:1242\n38#2:1244\n156#2:1245\n92#3:1246\n58#3:1247\n92#3:1249\n154#4:1248\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1\n*L\n597#1:1224,3\n597#1:1227,4\n597#1:1231,2\n597#1:1233\n597#1:1234\n601#1:1235,3\n601#1:1238,4\n601#1:1242,2\n601#1:1244\n601#1:1245\n615#1:1246\n615#1:1247\n618#1:1249\n617#1:1248\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt$TabRowWithSubcomposeImpl$1$1$1 extends kotlin.jvm.internal.n0 implements v3.p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1223:1\n69#2,6:1224\n33#2,6:1230\n33#2,6:1236\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1\n*L\n622#1:1224,6\n626#1:1230,6\n633#1:1236,6\n*E\n"})
    /* renamed from: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ long $constraints;
        final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
        final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ List<TabPosition> $tabPositions;
        final /* synthetic */ int $tabRowHeight;
        final /* synthetic */ int $tabRowWidth;
        final /* synthetic */ k1.f $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1$1$3, reason: invalid class name */
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
                    ComposerKt.traceEventStart(1621992604, i5, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:631)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, v3.p<? super Composer, ? super Integer, r2> pVar, k1.f fVar, long j5, int i5, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, List<TabPosition> list2, int i6) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = pVar;
            this.$tabWidth = fVar;
            this.$constraints = j5;
            this.$tabRowHeight = i5;
            this.$indicator = qVar;
            this.$tabPositions = list2;
            this.$tabRowWidth = i6;
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
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j5 = this.$constraints;
            int i6 = this.$tabRowHeight;
            int size2 = subcompose.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Placeable mo4998measureBRTryo0 = subcompose.get(i7).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(placementScope, mo4998measureBRTryo0, 0, i6 - mo4998measureBRTryo0.getHeight(), 0.0f, 4, null);
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new AnonymousClass3(this.$indicator, this.$tabPositions)));
            int i8 = this.$tabRowWidth;
            int i9 = this.$tabRowHeight;
            int size3 = subcompose2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i10).mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(i8, i9)), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRowWithSubcomposeImpl$1$1$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m2367invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m2367invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        Comparable X;
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        k1.f fVar = new k1.f();
        if (size > 0) {
            fVar.element = m6000getMaxWidthimpl / size;
        }
        Integer num = 0;
        int size2 = subcompose.size();
        for (int i5 = 0; i5 < size2; i5++) {
            num = Integer.valueOf(Math.max(subcompose.get(i5).maxIntrinsicHeight(fVar.element), num.intValue()));
        }
        int intValue = num.intValue();
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size3 = subcompose.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Measurable measurable = subcompose.get(i6);
            int i7 = fVar.element;
            arrayList.add(measurable.mo4998measureBRTryo0(Constraints.m5990copyZbe2FdA(j5, i7, i7, intValue, intValue)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            X = kotlin.comparisons.h.X(Dp.m6042boximpl(Dp.m6044constructorimpl(subcomposeMeasureScope.mo301toDpu2uoSUM(Math.min(subcompose.get(i8).maxIntrinsicWidth(intValue), fVar.element)) - Dp.m6044constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6042boximpl(Dp.m6044constructorimpl(24)));
            arrayList2.add(new TabPosition(Dp.m6044constructorimpl(subcomposeMeasureScope.mo301toDpu2uoSUM(fVar.element) * i8), subcomposeMeasureScope.mo301toDpu2uoSUM(fVar.element), ((Dp) X).m6058unboximpl(), null));
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, intValue, null, new AnonymousClass1(arrayList, subcomposeMeasureScope, this.$divider, fVar, j5, intValue, this.$indicator, arrayList2, m6000getMaxWidthimpl), 4, null);
    }
}
