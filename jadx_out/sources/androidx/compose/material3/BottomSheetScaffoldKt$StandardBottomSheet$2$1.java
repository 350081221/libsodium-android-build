package androidx.compose.material3;

import androidx.compose.ui.unit.IntSize;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "layoutSize", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$2$1 extends kotlin.jvm.internal.n0 implements v3.l<IntSize, r2> {
    final /* synthetic */ v3.l<IntSize, DraggableAnchors<SheetValue>> $calculateAnchors;
    final /* synthetic */ SheetState $state;

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
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1(v3.l<? super IntSize, ? extends DraggableAnchors<SheetValue>> lVar, SheetState sheetState) {
        super(1);
        this.$calculateAnchors = lVar;
        this.$state = sheetState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m1585invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1585invokeozmzZPI(long j5) {
        SheetValue sheetValue;
        DraggableAnchors<SheetValue> invoke = this.$calculateAnchors.invoke(IntSize.m6206boximpl(j5));
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$state.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                sheetValue = SheetValue.Expanded;
                if (!invoke.hasAnchorFor(sheetValue)) {
                    sheetValue = SheetValue.PartiallyExpanded;
                }
            } else {
                throw new kotlin.j0();
            }
        } else {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        this.$state.getAnchoredDraggableState$material3_release().updateAnchors(invoke, sheetValue);
    }
}
