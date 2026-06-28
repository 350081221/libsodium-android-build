package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.InternalMutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.g;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 138}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/InternalMutatorMutex$mutateWith$2\n*L\n136#1:172,10\n*E\n"})
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutateWith$2<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super R>, Object> {
    final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, T t5, kotlin.coroutines.d<? super InternalMutatorMutex$mutateWith$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = pVar;
        this.$receiver = t5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, dVar);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super R> dVar) {
        return ((InternalMutatorMutex$mutateWith$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlinx.coroutines.sync.a aVar;
        v3.p pVar;
        Object obj2;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex.Mutator mutator2;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
        kotlinx.coroutines.sync.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        l5 = kotlin.coroutines.intrinsics.d.l();
        ?? r12 = this.label;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                            aVar2 = (kotlinx.coroutines.sync.a) this.L$1;
                            mutator2 = (InternalMutatorMutex.Mutator) this.L$0;
                            try {
                                e1.n(obj);
                                atomicReference2 = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.h.a(atomicReference2, mutator2, null);
                                aVar2.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = internalMutatorMutex2.currentMutator;
                                androidx.compose.animation.core.h.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    pVar = (v3.p) this.L$2;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$1;
                    mutator = (InternalMutatorMutex.Mutator) this.L$0;
                    e1.n(obj);
                    aVar = aVar3;
                } else {
                    e1.n(obj);
                    s0 s0Var = (s0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = s0Var.getCoroutineContext().get(l2.U);
                    kotlin.jvm.internal.l0.m(bVar);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (l2) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    aVar = this.this$0.mutex;
                    pVar = this.$block;
                    Object obj3 = this.$receiver;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = pVar;
                    this.L$3 = obj3;
                    this.L$4 = internalMutatorMutex3;
                    this.label = 1;
                    if (aVar.f(null, this) == l5) {
                        return l5;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = pVar.invoke(obj2, this);
                if (invoke == l5) {
                    return l5;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                aVar2 = aVar;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.h.a(atomicReference2, mutator2, null);
                aVar2.g(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.currentMutator;
                androidx.compose.animation.core.h.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.g(null);
            throw th4;
        }
    }
}
