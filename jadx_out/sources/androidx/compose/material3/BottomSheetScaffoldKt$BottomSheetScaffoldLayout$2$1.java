package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1 extends kotlin.jvm.internal.n0 implements v3.p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ v3.q<PaddingValues, Composer, Integer, r2> $body;
    final /* synthetic */ v3.q<Integer, Composer, Integer, r2> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ v3.p<Composer, Integer, r2> $snackbarHost;
    final /* synthetic */ v3.p<Composer, Integer, r2> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ Placeable $bodyPlaceable;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ v3.a<Float> $sheetOffset;
        final /* synthetic */ Placeable $sheetPlaceable;
        final /* synthetic */ SheetState $sheetState;
        final /* synthetic */ Placeable $snackbarPlaceable;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ Placeable $topBarPlaceable;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SheetValue.values().length];
                try {
                    iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SheetValue.Expanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SheetValue.Hidden.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(v3.a<Float> aVar, int i5, Placeable placeable, Placeable placeable2, SheetState sheetState, int i6, Placeable placeable3, int i7, Placeable placeable4) {
            super(1);
            this.$sheetOffset = aVar;
            this.$layoutWidth = i5;
            this.$sheetPlaceable = placeable;
            this.$snackbarPlaceable = placeable2;
            this.$sheetState = sheetState;
            this.$layoutHeight = i6;
            this.$bodyPlaceable = placeable3;
            this.$topBarHeight = i7;
            this.$topBarPlaceable = placeable4;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            int L0;
            int height;
            L0 = kotlin.math.d.L0(this.$sheetOffset.invoke().floatValue());
            int max = Integer.max(0, (this.$layoutWidth - this.$sheetPlaceable.getWidth()) / 2);
            int width = (this.$layoutWidth - this.$snackbarPlaceable.getWidth()) / 2;
            int i5 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
            if (i5 == 1) {
                height = L0 - this.$snackbarPlaceable.getHeight();
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw new kotlin.j0();
                }
                height = this.$layoutHeight - this.$snackbarPlaceable.getHeight();
            }
            int i6 = height;
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$bodyPlaceable, 0, this.$topBarHeight, 0.0f, 4, null);
            Placeable placeable = this.$topBarPlaceable;
            if (placeable != null) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$sheetPlaceable, max, L0, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$snackbarPlaceable, width, i6, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.q<? super Integer, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, long j5, long j6, v3.q<? super PaddingValues, ? super Composer, ? super Integer, r2> qVar2, float f5, v3.a<Float> aVar, SheetState sheetState) {
        super(2);
        this.$topBar = pVar;
        this.$snackbarHost = pVar2;
        this.$bottomSheet = qVar;
        this.$modifier = modifier;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$body = qVar2;
        this.$sheetPeekHeight = f5;
        this.$sheetOffset = aVar;
        this.$sheetState = sheetState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1584invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1584invoke0kLqBqw(@p4.l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        Placeable placeable;
        int i5;
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        Placeable mo4998measureBRTryo0 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceable$1(this.$bottomSheet, m5999getMaxHeightimpl))).get(0).mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        v3.p<Composer, Integer, r2> pVar = this.$topBar;
        if (pVar != null) {
            placeable = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceable$1$1(pVar))).get(0).mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        Placeable placeable2 = placeable;
        if (placeable2 != null) {
            i5 = placeable2.getHeight();
        } else {
            i5 = 0;
        }
        Placeable mo4998measureBRTryo02 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceable$1(this.$modifier, this.$containerColor, this.$contentColor, this.$body, this.$sheetPeekHeight))).get(0).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(m5991copyZbe2FdA$default, 0, 0, 0, m5999getMaxHeightimpl - i5, 7, null));
        return MeasureScope.layout$default(subcomposeMeasureScope, m6000getMaxWidthimpl, m5999getMaxHeightimpl, null, new AnonymousClass1(this.$sheetOffset, m6000getMaxWidthimpl, mo4998measureBRTryo0, subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).mo4998measureBRTryo0(m5991copyZbe2FdA$default), this.$sheetState, m5999getMaxHeightimpl, mo4998measureBRTryo02, i5, placeable2), 4, null);
    }
}
