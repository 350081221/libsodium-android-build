package androidx.compose.foundation.text2.input;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/TextFieldState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldStateKt$rememberTextFieldState$1$1 extends n0 implements a<TextFieldState> {
    final /* synthetic */ long $initialSelectionInChars;
    final /* synthetic */ String $initialText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldStateKt$rememberTextFieldState$1$1(String str, long j5) {
        super(0);
        this.$initialText = str;
        this.$initialSelectionInChars = j5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final TextFieldState invoke() {
        return new TextFieldState(this.$initialText, this.$initialSelectionInChars, (w) null);
    }
}
