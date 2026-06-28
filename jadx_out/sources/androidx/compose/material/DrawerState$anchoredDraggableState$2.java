package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerState$anchoredDraggableState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,915:1\n1#2:916\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerState$anchoredDraggableState$2 extends n0 implements a<Float> {
    final /* synthetic */ DrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$anchoredDraggableState$2(DrawerState drawerState) {
        super(0);
        this.this$0 = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Float invoke() {
        Density requireDensity;
        float f5;
        requireDensity = this.this$0.requireDensity();
        f5 = DrawerKt.DrawerVelocityThreshold;
        return Float.valueOf(requireDensity.mo304toPx0680j_4(f5));
    }
}
