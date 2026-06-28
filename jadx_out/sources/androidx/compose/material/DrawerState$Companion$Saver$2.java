package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/DrawerState;", "it", "Landroidx/compose/material/DrawerValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerState$Companion$Saver$2 extends n0 implements l<DrawerValue, DrawerState> {
    final /* synthetic */ l<DrawerValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerState$Companion$Saver$2(l<? super DrawerValue, Boolean> lVar) {
        super(1);
        this.$confirmStateChange = lVar;
    }

    @Override // v3.l
    @m
    public final DrawerState invoke(@p4.l DrawerValue drawerValue) {
        return new DrawerState(drawerValue, this.$confirmStateChange);
    }
}
