package androidx.compose.animation.core;

import androidx.compose.animation.core.MutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {184, 132}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n130#1:179,10\n*E\n"})
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2<R> extends o implements p<s0, kotlin.coroutines.d<? super R>, Object> {
    final /* synthetic */ l<kotlin.coroutines.d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super MutatorMutex$mutate$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, dVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super R> dVar) {
        return ((MutatorMutex$mutate$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlinx.coroutines.sync.a aVar;
        l<kotlin.coroutines.d<? super R>, Object> lVar;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        MutatorMutex.Mutator mutator2;
        Throwable th;
        MutatorMutex mutatorMutex2;
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
                            mutatorMutex2 = (MutatorMutex) this.L$2;
                            aVar2 = (kotlinx.coroutines.sync.a) this.L$1;
                            mutator2 = (MutatorMutex.Mutator) this.L$0;
                            try {
                                e1.n(obj);
                                atomicReference2 = mutatorMutex2.currentMutator;
                                h.a(atomicReference2, mutator2, null);
                                aVar2.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = mutatorMutex2.currentMutator;
                                h.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex = (MutatorMutex) this.L$3;
                    lVar = (l) this.L$2;
                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$1;
                    mutator = (MutatorMutex.Mutator) this.L$0;
                    e1.n(obj);
                    aVar = aVar3;
                } else {
                    e1.n(obj);
                    s0 s0Var = (s0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = s0Var.getCoroutineContext().get(l2.U);
                    l0.m(bVar);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (l2) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    aVar = this.this$0.mutex;
                    l<kotlin.coroutines.d<? super R>, Object> lVar2 = this.$block;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = lVar2;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (aVar.f(null, this) == l5) {
                        return l5;
                    }
                    lVar = lVar2;
                    mutator = mutator3;
                    mutatorMutex = mutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = lVar.invoke(this);
                if (invoke == l5) {
                    return l5;
                }
                mutatorMutex2 = mutatorMutex;
                aVar2 = aVar;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.currentMutator;
                h.a(atomicReference2, mutator2, null);
                aVar2.g(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                h.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.g(null);
            throw th4;
        }
    }
}
