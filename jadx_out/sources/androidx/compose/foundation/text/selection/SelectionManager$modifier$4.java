package androidx.compose.foundation.text.selection;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionManager$modifier$4 extends n0 implements l<Boolean, r2> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$4(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return r2.f19517a;
    }

    public final void invoke(boolean z4) {
        this.this$0.setInTouchMode(z4);
    }
}
