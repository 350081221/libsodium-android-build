package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/DrawerState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt$rememberDrawerState$2$1 extends n0 implements a<DrawerState> {
    final /* synthetic */ l<DrawerValue, Boolean> $confirmStateChange;
    final /* synthetic */ DrawerValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$rememberDrawerState$2$1(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        super(0);
        this.$initialValue = drawerValue;
        this.$confirmStateChange = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final DrawerState invoke() {
        return new DrawerState(this.$initialValue, this.$confirmStateChange);
    }
}
