package androidx.compose.material;

import androidx.compose.animation.core.h;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.t0;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J>\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0004\b\f\u0010\rJW\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0002\b\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex;", "", "Landroidx/compose/material/InternalMutatorMutex$Mutator;", "mutator", "Lkotlin/r2;", "tryMutateOrCancel", "R", "Landroidx/compose/foundation/MutatePriority;", LogFactory.PRIORITY_KEY, "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/u;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "tryMutate", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "<init>", "()V", "Mutator", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InternalMutatorMutex {
    public static final int $stable = 0;

    @l
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);

    @l
    private final a mutex = c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/InternalMutatorMutex$Mutator;", "", "other", "", "canInterrupt", "Lkotlin/r2;", "cancel", "Landroidx/compose/foundation/MutatePriority;", LogFactory.PRIORITY_KEY, "Landroidx/compose/foundation/MutatePriority;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", "getJob", "()Lkotlinx/coroutines/l2;", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/l2;)V", "material_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Mutator {

        @l
        private final l2 job;

        @l
        private final MutatePriority priority;

        public Mutator(@l MutatePriority mutatePriority, @l l2 l2Var) {
            this.priority = mutatePriority;
            this.job = l2Var;
        }

        public final boolean canInterrupt(@l Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            l2.a.b(this.job, null, 1, null);
        }

        @l
        public final l2 getJob() {
            return this.job;
        }

        @l
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, v3.l lVar, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, lVar, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, p pVar, d dVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!h.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    @m
    public final <R> Object mutate(@l MutatePriority mutatePriority, @l v3.l<? super d<? super R>, ? extends Object> lVar, @l d<? super R> dVar) {
        return t0.g(new InternalMutatorMutex$mutate$2(mutatePriority, this, lVar, null), dVar);
    }

    @m
    public final <T, R> Object mutateWith(T t5, @l MutatePriority mutatePriority, @l p<? super T, ? super d<? super R>, ? extends Object> pVar, @l d<? super R> dVar) {
        return t0.g(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, pVar, t5, null), dVar);
    }

    public final boolean tryMutate(@l v3.a<r2> aVar) {
        boolean c5 = a.C0615a.c(this.mutex, null, 1, null);
        if (c5) {
            try {
                aVar.invoke();
            } finally {
                a.C0615a.d(this.mutex, null, 1, null);
            }
        }
        return c5;
    }
}
