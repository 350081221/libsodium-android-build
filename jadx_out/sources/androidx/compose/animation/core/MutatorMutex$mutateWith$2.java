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
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {184, 171}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,178:1\n120#2,10:179\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n169#1:179,10\n*E\n"})
/* loaded from: classes.dex */
public final class MutatorMutex$mutateWith$2<R> extends o implements p<s0, kotlin.coroutines.d<? super R>, Object> {
    final /* synthetic */ p<T, kotlin.coroutines.d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, T t5, kotlin.coroutines.d<? super MutatorMutex$mutateWith$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = pVar;
        this.$receiver = t5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, dVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super R> dVar) {
        return ((MutatorMutex$mutateWith$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        kotlinx.coroutines.sync.a aVar;
        p pVar;
        Object obj2;
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
                    mutatorMutex = (MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    pVar = (p) this.L$2;
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
                    pVar = this.$block;
                    Object obj3 = this.$receiver;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = pVar;
                    this.L$3 = obj3;
                    this.L$4 = mutatorMutex3;
                    this.label = 1;
                    if (aVar.f(null, this) == l5) {
                        return l5;
                    }
                    obj2 = obj3;
                    mutator = mutator3;
                    mutatorMutex = mutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = pVar.invoke(obj2, this);
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
