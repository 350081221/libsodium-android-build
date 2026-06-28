package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/material/DraggableAnchors;", "Landroidx/compose/material/BottomSheetValue;", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Landroidx/compose/material/DraggableAnchors;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1 extends n0 implements l<IntSize, DraggableAnchors<BottomSheetValue>> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/BottomSheetValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<DraggableAnchorsConfig<BottomSheetValue>, r2> {
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ float $peekHeightPx;
        final /* synthetic */ float $sheetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i5, float f5, float f6) {
            super(1);
            this.$layoutHeight = i5;
            this.$peekHeightPx = f5;
            this.$sheetHeight = f6;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
            invoke2(draggableAnchorsConfig);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
            draggableAnchorsConfig.at(BottomSheetValue.Collapsed, this.$layoutHeight - this.$peekHeightPx);
            float f5 = this.$sheetHeight;
            if (f5 > 0.0f) {
                if (f5 == this.$peekHeightPx) {
                    return;
                }
                draggableAnchorsConfig.at(BottomSheetValue.Expanded, this.$layoutHeight - f5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1(int i5, float f5) {
        super(1);
        this.$layoutHeight = i5;
        this.$peekHeightPx = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ DraggableAnchors<BottomSheetValue> invoke(IntSize intSize) {
        return m1238invokeozmzZPI(intSize.m6218unboximpl());
    }

    @p4.l
    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final DraggableAnchors<BottomSheetValue> m1238invokeozmzZPI(long j5) {
        return AnchoredDraggableKt.DraggableAnchors(new AnonymousClass1(this.$layoutHeight, this.$peekHeightPx, IntSize.m6213getHeightimpl(j5)));
    }
}
