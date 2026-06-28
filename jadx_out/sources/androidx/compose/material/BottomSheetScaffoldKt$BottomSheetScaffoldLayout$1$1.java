package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.FabPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,812:1\n151#2,3:813\n33#2,4:816\n154#2,2:820\n38#2:822\n156#2:823\n151#2,3:824\n33#2,4:827\n154#2,2:831\n38#2:833\n156#2:834\n171#2,13:835\n151#2,3:848\n33#2,4:851\n154#2,2:855\n38#2:857\n156#2:858\n151#2,3:859\n33#2,4:862\n154#2,2:866\n38#2:868\n156#2:869\n171#2,13:870\n171#2,13:883\n151#2,3:896\n33#2,4:899\n154#2,2:903\n38#2:905\n156#2:906\n171#2,13:907\n171#2,13:920\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n*L\n695#1:813,3\n695#1:816,4\n695#1:820,2\n695#1:822\n695#1:823\n699#1:824,3\n699#1:827,4\n699#1:831,2\n699#1:833\n699#1:834\n701#1:835,13\n706#1:848,3\n706#1:851,4\n706#1:855,2\n706#1:857\n706#1:858\n709#1:859,3\n709#1:862,4\n709#1:866,2\n709#1:868\n709#1:869\n713#1:870,13\n714#1:883,13\n717#1:896,3\n717#1:899,4\n717#1:903,2\n717#1:905\n717#1:906\n718#1:907,13\n719#1:920,13\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ q<PaddingValues, Composer, Integer, r2> $body;
    final /* synthetic */ q<Integer, Composer, Integer, r2> $bottomSheet;
    final /* synthetic */ p<Composer, Integer, r2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,812:1\n33#2,6:813\n33#2,6:819\n33#2,6:825\n33#2,6:831\n33#2,6:837\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n*L\n742#1:813,6\n743#1:819,6\n744#1:825,6\n745#1:831,6\n746#1:837,6\n*E\n"})
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
        final /* synthetic */ List<Placeable> $bodyPlaceables;
        final /* synthetic */ int $fabHeight;
        final /* synthetic */ List<Placeable> $fabPlaceable;
        final /* synthetic */ int $fabWidth;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ a<Float> $sheetOffset;
        final /* synthetic */ float $sheetPeekHeight;
        final /* synthetic */ List<Placeable> $sheetPlaceables;
        final /* synthetic */ BottomSheetState $sheetState;
        final /* synthetic */ int $snackbarHeight;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $snackbarWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BottomSheetValue.values().length];
                try {
                    iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(a<Float> aVar, int i5, SubcomposeMeasureScope subcomposeMeasureScope, int i6, int i7, float f5, int i8, int i9, BottomSheetState bottomSheetState, int i10, int i11, List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, List<? extends Placeable> list5, int i12) {
            super(1);
            this.$sheetOffset = aVar;
            this.$floatingActionButtonPosition = i5;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$layoutWidth = i6;
            this.$fabWidth = i7;
            this.$sheetPeekHeight = f5;
            this.$fabHeight = i8;
            this.$snackbarWidth = i9;
            this.$sheetState = bottomSheetState;
            this.$snackbarHeight = i10;
            this.$layoutHeight = i11;
            this.$bodyPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$sheetPlaceables = list3;
            this.$fabPlaceable = list4;
            this.$snackbarPlaceables = list5;
            this.$topBarHeight = i12;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            int L0;
            float f5;
            int mo298roundToPx0680j_4;
            int i5;
            int i6;
            float f6;
            float f7;
            L0 = d.L0(this.$sheetOffset.invoke().floatValue());
            int i7 = this.$floatingActionButtonPosition;
            FabPosition.Companion companion = FabPosition.Companion;
            if (FabPosition.m1347equalsimpl0(i7, companion.m1353getStart5ygKITE())) {
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                f7 = BottomSheetScaffoldKt.FabSpacing;
                mo298roundToPx0680j_4 = subcomposeMeasureScope.mo298roundToPx0680j_4(f7);
            } else if (FabPosition.m1347equalsimpl0(i7, companion.m1351getCenter5ygKITE())) {
                mo298roundToPx0680j_4 = (this.$layoutWidth - this.$fabWidth) / 2;
            } else {
                int i8 = this.$layoutWidth - this.$fabWidth;
                SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
                f5 = BottomSheetScaffoldKt.FabSpacing;
                mo298roundToPx0680j_4 = i8 - subcomposeMeasureScope2.mo298roundToPx0680j_4(f5);
            }
            int i9 = mo298roundToPx0680j_4;
            float mo304toPx0680j_4 = this.$this_SubcomposeLayout.mo304toPx0680j_4(this.$sheetPeekHeight);
            int i10 = this.$fabHeight;
            if (mo304toPx0680j_4 < i10 / 2) {
                int i11 = L0 - i10;
                SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                f6 = BottomSheetScaffoldKt.FabSpacing;
                i5 = i11 - subcomposeMeasureScope3.mo298roundToPx0680j_4(f6);
            } else {
                i5 = L0 - (i10 / 2);
            }
            int i12 = i5;
            int i13 = (this.$layoutWidth - this.$snackbarWidth) / 2;
            int i14 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new j0();
                }
                i6 = this.$layoutHeight - this.$snackbarHeight;
            } else {
                i6 = i12 - this.$snackbarHeight;
            }
            int i15 = i6;
            List<Placeable> list = this.$bodyPlaceables;
            int i16 = this.$topBarHeight;
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i17), 0, i16, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i18), 0, 0, 0.0f, 4, null);
                }
            }
            List<Placeable> list3 = this.$sheetPlaceables;
            int size3 = list3.size();
            for (int i19 = 0; i19 < size3; i19++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i19), 0, L0, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$fabPlaceable;
            if (list4 != null) {
                int size4 = list4.size();
                for (int i20 = 0; i20 < size4; i20++) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, list4.get(i20), i9, i12, 0.0f, 4, null);
                }
            }
            List<Placeable> list5 = this.$snackbarPlaceables;
            int size5 = list5.size();
            for (int i21 = 0; i21 < size5; i21++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i21), i13, i15, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, q<? super Integer, ? super Composer, ? super Integer, r2> qVar, q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar2, float f5, a<Float> aVar, int i5, BottomSheetState bottomSheetState) {
        super(2);
        this.$topBar = pVar;
        this.$floatingActionButton = pVar2;
        this.$snackbarHost = pVar3;
        this.$bottomSheet = qVar;
        this.$body = qVar2;
        this.$sheetPeekHeight = f5;
        this.$sheetOffset = aVar;
        this.$floatingActionButtonPosition = i5;
        this.$sheetState = bottomSheetState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1239invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1 A[LOOP:2: B:20:0x00ef->B:21:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6 A[LOOP:4: B:45:0x01c4->B:46:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.MeasureResult m1239invoke0kLqBqw(@p4.l androidx.compose.ui.layout.SubcomposeMeasureScope r29, long r30) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.m1239invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
    }
}
