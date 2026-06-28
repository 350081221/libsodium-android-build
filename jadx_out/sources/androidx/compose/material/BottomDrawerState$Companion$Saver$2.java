package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/BottomDrawerState;", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerState$Companion$Saver$2 extends n0 implements l<BottomDrawerValue, BottomDrawerState> {
    final /* synthetic */ l<BottomDrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomDrawerState$Companion$Saver$2(Density density, l<? super BottomDrawerValue, Boolean> lVar) {
        super(1);
        this.$density = density;
        this.$confirmStateChange = lVar;
    }

    @Override // v3.l
    @m
    public final BottomDrawerState invoke(@p4.l BottomDrawerValue bottomDrawerValue) {
        return DrawerKt.BottomDrawerState(bottomDrawerValue, this.$density, this.$confirmStateChange);
    }
}
