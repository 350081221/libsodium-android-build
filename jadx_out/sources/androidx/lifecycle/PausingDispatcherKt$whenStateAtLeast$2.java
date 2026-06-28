package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends o implements p<s0, kotlin.coroutines.d<? super T>, Object> {
    final /* synthetic */ p<s0, kotlin.coroutines.d<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, kotlin.coroutines.d<? super PausingDispatcherKt$whenStateAtLeast$2> dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super T> dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        LifecycleController lifecycleController;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    e1.n(obj);
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            l2 l2Var = (l2) ((s0) this.L$0).getCoroutineContext().get(l2.U);
            if (l2Var != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, l2Var);
                try {
                    p<s0, kotlin.coroutines.d<? super T>, Object> pVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = kotlinx.coroutines.i.h(pausingDispatcher, pVar, this);
                    if (obj == l5) {
                        return l5;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        }
        lifecycleController.finish();
        return obj;
    }
}
