package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "sheetSize", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt$modalBottomSheetAnchors$1 extends kotlin.jvm.internal.n0 implements v3.l<IntSize, r2> {
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ SheetState $sheetState;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$modalBottomSheetAnchors$1(SheetState sheetState, float f5) {
        super(1);
        this.$sheetState = sheetState;
        this.$fullHeight = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m2004invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2004invokeozmzZPI(long j5) {
        SheetValue sheetValue;
        DraggableAnchors<SheetValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new ModalBottomSheet_androidKt$modalBottomSheetAnchors$1$newAnchors$1(this.$fullHeight, j5, this.$sheetState));
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                throw new kotlin.j0();
            }
            sheetValue = SheetValue.PartiallyExpanded;
            if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                sheetValue = SheetValue.Expanded;
                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                    sheetValue = SheetValue.Hidden;
                }
            }
        } else {
            sheetValue = SheetValue.Hidden;
        }
        this.$sheetState.getAnchoredDraggableState$material3_release().updateAnchors(DraggableAnchors, sheetValue);
    }
}
