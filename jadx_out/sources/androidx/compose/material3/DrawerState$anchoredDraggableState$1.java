package androidx.compose.material3;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "distance", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerState$anchoredDraggableState$1 extends kotlin.jvm.internal.n0 implements v3.l<Float, Float> {
    public static final DrawerState$anchoredDraggableState$1 INSTANCE = new DrawerState$anchoredDraggableState$1();

    DrawerState$anchoredDraggableState$1() {
        super(1);
    }

    @p4.l
    public final Float invoke(float f5) {
        return Float.valueOf(f5 * NavigationDrawerKt.access$getDrawerPositionalThreshold$p());
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }
}
