package androidx.compose.material;

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
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,521:1\n151#2,3:522\n33#2,4:525\n154#2,2:529\n38#2:531\n156#2:532\n171#2,13:533\n92#3:546\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n*L\n160#1:522,3\n160#1:525,4\n160#1:529,2\n160#1:531\n160#1:532\n164#1:533,13\n167#1:546\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$2$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ p<Composer, Integer, r2> $divider;
    final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,521:1\n69#2,6:522\n33#2,6:528\n33#2,6:534\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1$1\n*L\n171#1:522,6\n175#1:528,6\n182#1:534,6\n*E\n"})
    /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ long $constraints;
        final /* synthetic */ p<Composer, Integer, r2> $divider;
        final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ List<TabPosition> $tabPositions;
        final /* synthetic */ int $tabRowHeight;
        final /* synthetic */ int $tabRowWidth;
        final /* synthetic */ int $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3, reason: invalid class name */
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
                    ComposerKt.traceEventStart(-641946361, i5, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:180)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, p<? super Composer, ? super Integer, r2> pVar, int i5, long j5, int i6, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, List<TabPosition> list2, int i7) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = pVar;
            this.$tabWidth = i5;
            this.$constraints = j5;
            this.$tabRowHeight = i6;
            this.$indicator = qVar;
            this.$tabPositions = list2;
            this.$tabRowWidth = i7;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            List<Placeable> list = this.$tabPlaceables;
            int i5 = this.$tabWidth;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i6), i6 * i5, 0, 0.0f, 4, null);
            }
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j5 = this.$constraints;
            int i7 = this.$tabRowHeight;
            int size2 = subcompose.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Placeable mo4998measureBRTryo0 = subcompose.get(i8).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(placementScope, mo4998measureBRTryo0, 0, i7 - mo4998measureBRTryo0.getHeight(), 0.0f, 4, null);
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new AnonymousClass3(this.$indicator, this.$tabPositions)));
            int i9 = this.$tabRowWidth;
            int i10 = this.$tabRowHeight;
            int size3 = subcompose2.size();
            for (int i11 = 0; i11 < size3; i11++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i11).mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(i9, i10)), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$2$1$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1486invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1486invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        Object obj;
        int G;
        int i5;
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i6 = m6000getMaxWidthimpl / size;
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size2 = subcompose.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size2) {
            arrayList.add(subcompose.get(i8).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, i6, i6, 0, 0, 12, null)));
            i8++;
            i7 = i7;
            subcompose = subcompose;
        }
        int i9 = i7;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(i9);
            int height = ((Placeable) obj).getHeight();
            G = w.G(arrayList);
            int i10 = 1;
            if (1 <= G) {
                while (true) {
                    Object obj2 = arrayList.get(i10);
                    int height2 = ((Placeable) obj2).getHeight();
                    if (height < height2) {
                        obj = obj2;
                        height = height2;
                    }
                    if (i10 == G) {
                        break;
                    }
                    i10++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        if (placeable != null) {
            i5 = placeable.getHeight();
        } else {
            i5 = i9;
        }
        ArrayList arrayList2 = new ArrayList(size);
        while (i9 < size) {
            arrayList2.add(new TabPosition(Dp.m6044constructorimpl(subcomposeMeasureScope.mo301toDpu2uoSUM(i6) * i9), subcomposeMeasureScope.mo301toDpu2uoSUM(i6), null));
            i9++;
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, i5, null, new AnonymousClass1(arrayList, subcomposeMeasureScope, this.$divider, i6, j5, i5, this.$indicator, arrayList2, m6000getMaxWidthimpl), 4, null);
    }
}
