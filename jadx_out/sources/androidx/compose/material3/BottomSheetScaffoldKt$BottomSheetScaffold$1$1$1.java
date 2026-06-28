package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/material3/DraggableAnchors;", "Landroidx/compose/material3/SheetValue;", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Landroidx/compose/material3/DraggableAnchors;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<IntSize, DraggableAnchors<SheetValue>> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ int $peekHeightPx;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/DraggableAnchorsConfig;", "Landroidx/compose/material3/SheetValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<DraggableAnchorsConfig<SheetValue>, r2> {
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $peekHeightPx;
        final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        final /* synthetic */ int $sheetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, int i5, int i6, int i7) {
            super(1);
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$layoutHeight = i5;
            this.$peekHeightPx = i6;
            this.$sheetHeight = i7;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
            invoke2(draggableAnchorsConfig);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
            if (!this.$scaffoldState.getBottomSheetState().getSkipPartiallyExpanded$material3_release()) {
                draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, this.$layoutHeight - this.$peekHeightPx);
            }
            if (this.$sheetHeight != this.$peekHeightPx) {
                draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(this.$layoutHeight - r0, 0));
            }
            if (this.$scaffoldState.getBottomSheetState().getSkipHiddenState$material3_release()) {
                return;
            }
            draggableAnchorsConfig.at(SheetValue.Hidden, this.$layoutHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1(BottomSheetScaffoldState bottomSheetScaffoldState, int i5, int i6) {
        super(1);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$layoutHeight = i5;
        this.$peekHeightPx = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ DraggableAnchors<SheetValue> invoke(IntSize intSize) {
        return m1583invokeozmzZPI(intSize.m6218unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final DraggableAnchors<SheetValue> m1583invokeozmzZPI(long j5) {
        return AnchoredDraggableKt.DraggableAnchors(new AnonymousClass1(this.$scaffoldState, this.$layoutHeight, this.$peekHeightPx, IntSize.m6213getHeightimpl(j5)));
    }
}
