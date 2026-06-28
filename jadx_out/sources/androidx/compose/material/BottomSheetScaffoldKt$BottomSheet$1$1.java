package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "layoutSize", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheet$1$1 extends n0 implements l<IntSize, r2> {
    final /* synthetic */ l<IntSize, DraggableAnchors<BottomSheetValue>> $calculateAnchors;
    final /* synthetic */ BottomSheetState $state;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheet$1$1(l<? super IntSize, ? extends DraggableAnchors<BottomSheetValue>> lVar, BottomSheetState bottomSheetState) {
        super(1);
        this.$calculateAnchors = lVar;
        this.$state = bottomSheetState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m1237invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1237invokeozmzZPI(long j5) {
        BottomSheetValue bottomSheetValue;
        DraggableAnchors<BottomSheetValue> invoke = this.$calculateAnchors.invoke(IntSize.m6206boximpl(j5));
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$state.getAnchoredDraggableState$material_release().getTargetValue().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                bottomSheetValue = BottomSheetValue.Expanded;
                if (!invoke.hasAnchorFor(bottomSheetValue)) {
                    bottomSheetValue = BottomSheetValue.Collapsed;
                }
            } else {
                throw new j0();
            }
        } else {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        this.$state.getAnchoredDraggableState$material_release().updateAnchors(invoke, bottomSheetValue);
    }
}
