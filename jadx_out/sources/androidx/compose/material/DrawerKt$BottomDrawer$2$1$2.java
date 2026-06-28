package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "drawerSize", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$2$1$2 extends n0 implements l<IntSize, r2> {
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ boolean $isLandscape;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomDrawerValue.values().length];
            try {
                iArr[BottomDrawerValue.Closed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomDrawerValue.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$2(BottomDrawerState bottomDrawerState, float f5, boolean z4) {
        super(1);
        this.$drawerState = bottomDrawerState;
        this.$fullHeight = f5;
        this.$isLandscape = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m1328invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1328invokeozmzZPI(long j5) {
        boolean z4;
        BottomDrawerValue bottomDrawerValue;
        DraggableAnchors<BottomDrawerValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new DrawerKt$BottomDrawer$2$1$2$newAnchors$1(this.$fullHeight, IntSize.m6213getHeightimpl(j5), this.$isLandscape));
        if (this.$drawerState.getAnchoredDraggableState$material_release().getAnchors().getSize() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && DraggableAnchors.hasAnchorFor(this.$drawerState.getCurrentValue())) {
            bottomDrawerValue = this.$drawerState.getCurrentValue();
        } else {
            int i5 = WhenMappings.$EnumSwitchMapping$0[this.$drawerState.getTargetValue().ordinal()];
            if (i5 != 1) {
                if (i5 != 2 && i5 != 3) {
                    throw new j0();
                }
                bottomDrawerValue = BottomDrawerValue.Open;
                if (!DraggableAnchors.hasAnchorFor(bottomDrawerValue)) {
                    bottomDrawerValue = BottomDrawerValue.Expanded;
                    if (!DraggableAnchors.hasAnchorFor(bottomDrawerValue)) {
                        bottomDrawerValue = BottomDrawerValue.Closed;
                    }
                }
            } else {
                bottomDrawerValue = BottomDrawerValue.Closed;
            }
        }
        this.$drawerState.getAnchoredDraggableState$material_release().updateAnchors(DraggableAnchors, bottomDrawerValue);
    }
}
