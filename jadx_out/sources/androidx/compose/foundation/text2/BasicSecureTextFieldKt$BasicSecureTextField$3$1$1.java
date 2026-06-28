package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.ImeActionHandler;
import kotlin.i0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.v;
import p4.l;
import p4.m;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class BasicSecureTextFieldKt$BasicSecureTextField$3$1$1 implements ImeActionHandler, d0 {
    final /* synthetic */ ImeActionHandler $tmp0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(ImeActionHandler imeActionHandler) {
        this.$tmp0 = imeActionHandler;
    }

    public final boolean equals(@m Object obj) {
        if ((obj instanceof ImeActionHandler) && (obj instanceof d0)) {
            return l0.g(getFunctionDelegate(), ((d0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    @l
    public final v<?> getFunctionDelegate() {
        return new h0(1, this.$tmp0, ImeActionHandler.class, "onImeAction", "onImeAction-KlQnJC8(I)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text2.input.ImeActionHandler
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public final boolean mo1062onImeActionKlQnJC8(int i5) {
        return this.$tmp0.mo1062onImeActionKlQnJC8(i5);
    }
}
