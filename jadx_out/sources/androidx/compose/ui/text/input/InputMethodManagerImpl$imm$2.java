package androidx.compose.ui.text.input;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl$imm$2 extends n0 implements v3.a<android.view.inputmethod.InputMethodManager> {
    final /* synthetic */ InputMethodManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.this$0 = inputMethodManagerImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final android.view.inputmethod.InputMethodManager invoke() {
        View view;
        view = this.this$0.view;
        Object systemService = view.getContext().getSystemService("input_method");
        l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
