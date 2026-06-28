package androidx.compose.runtime;

import com.android.dx.io.Opcodes;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {Opcodes.SHL_INT_LIT8}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl$awaitDispose$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProduceStateScopeImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl<T> produceStateScopeImpl, kotlin.coroutines.d<? super ProduceStateScopeImpl$awaitDispose$1> dVar) {
        super(dVar);
        this.this$0 = produceStateScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitDispose(null, this);
    }
}
