package androidx.compose.foundation.text;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2 extends n0 implements a<Boolean> {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(0);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        return Boolean.valueOf(this.$scrollerPosition.getOffset() > 0.0f);
    }
}
