package androidx.compose.foundation;

import kotlin.i0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {108}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class HoverableNode$emitEnter$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, kotlin.coroutines.d<? super HoverableNode$emitEnter$1> dVar) {
        super(dVar);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitEnter(this);
    }
}
