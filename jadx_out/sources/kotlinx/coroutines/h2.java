package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;

@kotlin.i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"T", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/g;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/g;Lv3/a;)Ljava/lang/Object;", "", bi.ay, "I", "WORKING", "FINISHED", "c", "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20295a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f20296b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f20297c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20298d = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super T>, Object> {
        final /* synthetic */ v3.a<T> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v3.a<? extends T> aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$block = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<kotlin.r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$block, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super T> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(kotlin.r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                kotlin.e1.n(obj);
                return h2.d(((s0) this.L$0).getCoroutineContext(), this.$block);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @p4.m
    public static final <T> Object b(@p4.l kotlin.coroutines.g gVar, @p4.l v3.a<? extends T> aVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        return i.h(gVar, new a(aVar, null), dVar);
    }

    public static /* synthetic */ Object c(kotlin.coroutines.g gVar, v3.a aVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        return b(gVar, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(kotlin.coroutines.g gVar, v3.a<? extends T> aVar) {
        try {
            s3 s3Var = new s3(p2.B(gVar));
            s3Var.e();
            try {
                return aVar.invoke();
            } finally {
                s3Var.a();
            }
        } catch (InterruptedException e5) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e5);
        }
    }
}
