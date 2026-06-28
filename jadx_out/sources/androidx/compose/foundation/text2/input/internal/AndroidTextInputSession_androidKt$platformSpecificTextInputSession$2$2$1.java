package androidx.compose.foundation.text2.input.internal;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$1 extends n0 implements v3.a<String> {
    final /* synthetic */ TransformedTextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$1(TransformedTextFieldState transformedTextFieldState) {
        super(0);
        this.$state = transformedTextFieldState;
    }

    @Override // v3.a
    @l
    public final String invoke() {
        return "createInputConnection(value=\"" + ((Object) this.$state.getText()) + "\")";
    }
}
