package androidx.compose.material3;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/DrawerState;", "it", "Landroidx/compose/material3/DrawerValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerState$Companion$Saver$2 extends kotlin.jvm.internal.n0 implements v3.l<DrawerValue, DrawerState> {
    final /* synthetic */ v3.l<DrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerState$Companion$Saver$2(v3.l<? super DrawerValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    @Override // v3.l
    @p4.m
    public final DrawerState invoke(@p4.l DrawerValue drawerValue) {
        return new DrawerState(drawerValue, this.$confirmStateChange);
    }
}
