package androidx.compose.material;

import androidx.compose.animation.core.h;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.sync.a;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@f(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {177, 99}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n120#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n*L\n97#1:172,10\n*E\n"})
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutate$2<R> extends o implements p<s0, d<? super R>, Object> {
    final /* synthetic */ l<d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, l<? super d<? super R>, ? extends Object> lVar, d<? super InternalMutatorMutex$mutate$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, dVar);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super R> dVar) {
        return ((InternalMutatorMutex$mutate$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.sync.a, int] */
    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        a aVar;
        l<d<? super R>, Object> lVar;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex.Mutator mutator2;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
        a aVar2;
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
                            aVar2 = (a) this.L$1;
                            mutator2 = (InternalMutatorMutex.Mutator) this.L$0;
                            try {
                                e1.n(obj);
                                atomicReference2 = internalMutatorMutex2.currentMutator;
                                h.a(atomicReference2, mutator2, null);
                                aVar2.g(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = internalMutatorMutex2.currentMutator;
                                h.a(atomicReference, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$3;
                    lVar = (l) this.L$2;
                    a aVar3 = (a) this.L$1;
                    mutator = (InternalMutatorMutex.Mutator) this.L$0;
                    e1.n(obj);
                    aVar = aVar3;
                } else {
                    e1.n(obj);
                    s0 s0Var = (s0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    g.b bVar = s0Var.getCoroutineContext().get(l2.U);
                    l0.m(bVar);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (l2) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    aVar = this.this$0.mutex;
                    l<d<? super R>, Object> lVar2 = this.$block;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = lVar2;
                    this.L$3 = internalMutatorMutex3;
                    this.label = 1;
                    if (aVar.f(null, this) == l5) {
                        return l5;
                    }
                    lVar = lVar2;
                    mutator = mutator3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = lVar.invoke(this);
                if (invoke == l5) {
                    return l5;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                aVar2 = aVar;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = internalMutatorMutex2.currentMutator;
                h.a(atomicReference2, mutator2, null);
                aVar2.g(null);
                return obj;
            } catch (Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.currentMutator;
                h.a(atomicReference, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.g(null);
            throw th4;
        }
    }
}
