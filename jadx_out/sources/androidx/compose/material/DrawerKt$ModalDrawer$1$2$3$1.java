package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1$2$3$1 extends n0 implements a<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f5, float f6, DrawerState drawerState) {
        super(0);
        this.$minValue = f5;
        this.$maxValue = f6;
        this.$drawerState = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = DrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.requireOffset$material_release());
        return Float.valueOf(calculateFraction);
    }
}
