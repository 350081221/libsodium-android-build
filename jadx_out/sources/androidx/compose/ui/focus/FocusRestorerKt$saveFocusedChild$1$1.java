package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRestorerKt$saveFocusedChild$1$1 extends n0 implements a<Object> {
    final /* synthetic */ FocusTargetNode $this_saveFocusedChild;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.$this_saveFocusedChild = focusTargetNode;
    }

    @Override // v3.a
    @m
    public final Object invoke() {
        return Integer.valueOf(this.$this_saveFocusedChild.getPreviouslyFocusedChildHash());
    }
}
