package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BlockRunner$cancel$1 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    int label;
    final /* synthetic */ BlockRunner<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(BlockRunner<T> blockRunner, kotlin.coroutines.d<? super BlockRunner$cancel$1> dVar) {
        super(2, dVar);
        this.this$0 = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        return new BlockRunner$cancel$1(this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((BlockRunner$cancel$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        long j5;
        CoroutineLiveData coroutineLiveData;
        l2 l2Var;
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
            j5 = ((BlockRunner) this.this$0).timeoutInMs;
            this.label = 1;
            if (d1.b(j5, this) == l5) {
                return l5;
            }
        }
        coroutineLiveData = ((BlockRunner) this.this$0).liveData;
        if (!coroutineLiveData.hasActiveObservers()) {
            l2Var = ((BlockRunner) this.this$0).runningJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            ((BlockRunner) this.this$0).runningJob = null;
        }
        return r2.f19517a;
    }
}
