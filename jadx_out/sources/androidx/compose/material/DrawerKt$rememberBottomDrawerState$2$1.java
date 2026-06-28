package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/BottomDrawerState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$rememberBottomDrawerState$2$1 extends n0 implements a<BottomDrawerState> {
    final /* synthetic */ l<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ BottomDrawerValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$rememberBottomDrawerState$2$1(BottomDrawerValue bottomDrawerValue, Density density, l<? super BottomDrawerValue, Boolean> lVar) {
        super(0);
        this.$initialValue = bottomDrawerValue;
        this.$density = density;
        this.$confirmStateChange = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final BottomDrawerState invoke() {
        return DrawerKt.BottomDrawerState(this.$initialValue, this.$density, this.$confirmStateChange);
    }
}
