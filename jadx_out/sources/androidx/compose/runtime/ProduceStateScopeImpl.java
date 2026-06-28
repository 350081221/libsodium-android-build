package androidx.compose.runtime;

import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0003J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", "T", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/r2;", "component2", "Lkotlin/Function0;", "onDispose", "", "awaitDispose", "(Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "getValue", "setValue", "(Ljava/lang/Object;)V", b.f22420d, "state", "<init>", "(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/g;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n314#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;

    @l
    private final g coroutineContext;

    public ProduceStateScopeImpl(@l MutableState<T> mutableState, @l g gVar) {
        this.coroutineContext = gVar;
        this.$$delegate_0 = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.compose.runtime.ProduceStateScope
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitDispose(@p4.l v3.a<kotlin.r2> r5, @p4.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$0
            v3.a r5 = (v3.a) r5
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L5e
            goto L58
        L35:
            kotlin.e1.n(r6)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r3     // Catch: java.lang.Throwable -> L5e
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L5e
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5e
            r6.B()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.E()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> L5e
            if (r6 != r2) goto L55
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L5e
        L55:
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.y r6 = new kotlin.y     // Catch: java.lang.Throwable -> L5e
            r6.<init>()     // Catch: java.lang.Throwable -> L5e
            throw r6     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(v3.a, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    @l
    public v3.l<T, r2> component2() {
        return this.$$delegate_0.component2();
    }

    @Override // kotlinx.coroutines.s0
    @l
    public g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t5) {
        this.$$delegate_0.setValue(t5);
    }
}
