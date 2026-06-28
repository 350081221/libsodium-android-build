package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/BaseInputConnection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextInputServiceAndroid$baseInputConnection$2 extends n0 implements v3.a<BaseInputConnection> {
    final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.getView(), false);
    }
}
