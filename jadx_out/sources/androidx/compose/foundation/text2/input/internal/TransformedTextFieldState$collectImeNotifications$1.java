package androidx.compose.foundation.text2.input.internal;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.text2.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {394}, m = "collectImeNotifications", n = {"this", "notifyImeListener"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class TransformedTextFieldState$collectImeNotifications$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransformedTextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, kotlin.coroutines.d<? super TransformedTextFieldState$collectImeNotifications$1> dVar) {
        super(dVar);
        this.this$0 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collectImeNotifications(null, this);
    }
}
