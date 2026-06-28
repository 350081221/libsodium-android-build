package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AbstractClickablePointerInputNode$delayPressInteraction$1 extends n0 implements v3.a<Boolean> {
    final /* synthetic */ AbstractClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$delayPressInteraction$1(AbstractClickablePointerInputNode abstractClickablePointerInputNode) {
        super(0);
        this.this$0 = abstractClickablePointerInputNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Boolean invoke() {
        return Boolean.valueOf(((Boolean) this.this$0.getCurrent(ScrollableKt.getModifierLocalScrollableContainer())).booleanValue() || Clickable_androidKt.isComposeRootInScrollableContainer(this.this$0));
    }
}
