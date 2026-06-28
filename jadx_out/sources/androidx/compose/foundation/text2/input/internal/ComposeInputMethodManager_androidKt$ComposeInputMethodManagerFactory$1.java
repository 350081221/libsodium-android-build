package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 extends n0 implements l<View, ComposeInputMethodManager> {
    public static final ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 INSTANCE = new ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1();

    ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final ComposeInputMethodManager invoke(@p4.l View view) {
        return new ComposeInputMethodManagerImplApi24(view);
    }
}
