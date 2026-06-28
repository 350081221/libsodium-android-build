package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$3$1 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$3$1(float f5, float f6, DrawerState drawerState) {
        super(0);
        this.$minValue = f5;
        this.$maxValue = f6;
        this.$drawerState = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = NavigationDrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.requireOffset$material3_release());
        return Float.valueOf(calculateFraction);
    }
}
