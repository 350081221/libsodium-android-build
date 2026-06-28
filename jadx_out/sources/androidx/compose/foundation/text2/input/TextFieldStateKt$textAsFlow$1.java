package androidx.compose.foundation.text2.input;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldStateKt$textAsFlow$1 extends n0 implements a<TextFieldCharSequence> {
    final /* synthetic */ TextFieldState $this_textAsFlow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldStateKt$textAsFlow$1(TextFieldState textFieldState) {
        super(0);
        this.$this_textAsFlow = textFieldState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final TextFieldCharSequence invoke() {
        return this.$this_textAsFlow.getText();
    }
}
