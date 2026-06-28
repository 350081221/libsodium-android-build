package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {400}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class LifecycleCoroutineScope$launchWhenResumed$1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ p<s0, kotlin.coroutines.d<? super r2>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenResumed$1(LifecycleCoroutineScope lifecycleCoroutineScope, p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, kotlin.coroutines.d<? super LifecycleCoroutineScope$launchWhenResumed$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.this$0, this.$block, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            p<s0, kotlin.coroutines.d<? super r2>, Object> pVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, pVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
