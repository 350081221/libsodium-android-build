package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,818:1\n151#2,3:819\n33#2,4:822\n154#2,2:826\n38#2:828\n156#2:829\n171#2,13:830\n151#2,3:843\n33#2,4:846\n154#2,2:850\n38#2:852\n156#2:853\n171#2,13:854\n151#2,3:867\n33#2,4:870\n154#2,2:874\n38#2:876\n156#2:877\n171#2,13:878\n171#2,13:891\n151#2,3:904\n33#2,4:907\n154#2,2:911\n38#2:913\n156#2:914\n171#2,13:915\n151#2,3:928\n33#2,4:931\n154#2,2:935\n38#2:937\n156#2:938\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n*L\n457#1:819,3\n457#1:822,4\n457#1:826,2\n457#1:828\n457#1:829\n461#1:830,13\n463#1:843,3\n463#1:846,4\n463#1:850,2\n463#1:852\n463#1:853\n479#1:854,13\n482#1:867,3\n482#1:870,4\n482#1:874,2\n482#1:876\n482#1:877\n498#1:878,13\n499#1:891,13\n540#1:904,3\n540#1:907,4\n540#1:911,2\n540#1:913\n540#1:914\n542#1:915,13\n588#1:928,3\n588#1:931,4\n588#1:935,2\n588#1:937\n588#1:938\n*E\n"})
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ p<Composer, Integer, r2> $bottomBar;
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ p<Composer, Integer, r2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ p<Composer, Integer, r2> $snackbar;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,818:1\n33#2,6:819\n33#2,6:825\n33#2,6:831\n33#2,6:837\n33#2,6:843\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n*L\n593#1:819,6\n596#1:825,6\n599#1:831,6\n603#1:837,6\n607#1:843,6\n*E\n"})
    /* renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ List<Placeable> $bodyContentPlaceables;
        final /* synthetic */ Integer $bottomBarHeight;
        final /* synthetic */ List<Placeable> $bottomBarPlaceables;
        final /* synthetic */ Integer $fabOffsetFromBottom;
        final /* synthetic */ List<Placeable> $fabPlaceables;
        final /* synthetic */ FabPlacement $fabPlacement;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $snackbarOffsetFromBottom;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, List<? extends Placeable> list5, int i5, int i6, int i7, Integer num, FabPlacement fabPlacement, Integer num2) {
            super(1);
            this.$bodyContentPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$snackbarPlaceables = list3;
            this.$bottomBarPlaceables = list4;
            this.$fabPlaceables = list5;
            this.$topBarHeight = i5;
            this.$layoutHeight = i6;
            this.$snackbarOffsetFromBottom = i7;
            this.$bottomBarHeight = num;
            this.$fabPlacement = fabPlacement;
            this.$fabOffsetFromBottom = num2;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            List<Placeable> list = this.$bodyContentPlaceables;
            int i5 = this.$topBarHeight;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Placeable.PlacementScope.place$default(placementScope, list.get(i6), 0, i5, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            int size2 = list2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Placeable.PlacementScope.place$default(placementScope, list2.get(i7), 0, 0, 0.0f, 4, null);
            }
            List<Placeable> list3 = this.$snackbarPlaceables;
            int i8 = this.$layoutHeight;
            int i9 = this.$snackbarOffsetFromBottom;
            int size3 = list3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Placeable.PlacementScope.place$default(placementScope, list3.get(i10), 0, i8 - i9, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$bottomBarPlaceables;
            int i11 = this.$layoutHeight;
            Integer num = this.$bottomBarHeight;
            int size4 = list4.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Placeable.PlacementScope.place$default(placementScope, list4.get(i12), 0, i11 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
            }
            List<Placeable> list5 = this.$fabPlaceables;
            FabPlacement fabPlacement = this.$fabPlacement;
            int i13 = this.$layoutHeight;
            Integer num2 = this.$fabOffsetFromBottom;
            int size5 = list5.size();
            for (int i14 = 0; i14 < size5; i14++) {
                Placeable.PlacementScope.place$default(placementScope, list5.get(i14), fabPlacement != null ? fabPlacement.getLeft() : 0, i13 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, int i5, boolean z4, WindowInsets windowInsets, p<? super Composer, ? super Integer, r2> pVar4, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i5;
        this.$isFabDocked = z4;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = pVar4;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1428invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0252 A[LOOP:3: B:48:0x0250->B:49:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0342 A[LOOP:4: B:67:0x0340->B:68:0x0342, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.MeasureResult m1428invoke0kLqBqw(@p4.l androidx.compose.ui.layout.SubcomposeMeasureScope r33, long r34) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1.m1428invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
    }
}
