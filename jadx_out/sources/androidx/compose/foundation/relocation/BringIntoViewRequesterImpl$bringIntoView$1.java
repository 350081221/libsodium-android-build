package androidx.compose.foundation.relocation;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {119}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, kotlin.coroutines.d<? super BringIntoViewRequesterImpl$bringIntoView$1> dVar) {
        super(dVar);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bringIntoView(null, this);
    }
}
