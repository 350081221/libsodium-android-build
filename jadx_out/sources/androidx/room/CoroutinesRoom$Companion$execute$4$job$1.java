package androidx.room;

import java.util.concurrent.Callable;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ kotlinx.coroutines.p<R> $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, kotlinx.coroutines.p<? super R> pVar, kotlin.coroutines.d<? super CoroutinesRoom$Companion$execute$4$job$1> dVar) {
        super(2, dVar);
        this.$callable = callable;
        this.$continuation = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            try {
                Object call = this.$callable.call();
                kotlin.coroutines.d dVar = this.$continuation;
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(call));
            } catch (Throwable th) {
                kotlin.coroutines.d dVar2 = this.$continuation;
                d1.a aVar2 = d1.Companion;
                dVar2.resumeWith(d1.m6444constructorimpl(e1.a(th)));
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
