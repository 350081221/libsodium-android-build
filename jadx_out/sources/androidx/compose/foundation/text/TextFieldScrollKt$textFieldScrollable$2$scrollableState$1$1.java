package androidx.compose.foundation.text;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "delta", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 extends n0 implements l<Float, Float> {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }

    @p4.l
    public final Float invoke(float f5) {
        float offset = this.$scrollerPosition.getOffset() + f5;
        if (offset > this.$scrollerPosition.getMaximum()) {
            f5 = this.$scrollerPosition.getMaximum() - this.$scrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f5 = -this.$scrollerPosition.getOffset();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f5);
        return Float.valueOf(f5);
    }
}
