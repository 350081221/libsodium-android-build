package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OwnerSnapshotObserver$clearInvalidObservations$1 extends n0 implements l<Object, Boolean> {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
    }
}
