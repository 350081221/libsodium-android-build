package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$1 extends n0 implements l<DismissDirection, FixedThreshold> {
    public static final SwipeToDismissKt$SwipeToDismiss$1 INSTANCE = new SwipeToDismissKt$SwipeToDismiss$1();

    SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final FixedThreshold invoke(@p4.l DismissDirection dismissDirection) {
        float f5;
        f5 = SwipeToDismissKt.DISMISS_THRESHOLD;
        return new FixedThreshold(f5, null);
    }
}
