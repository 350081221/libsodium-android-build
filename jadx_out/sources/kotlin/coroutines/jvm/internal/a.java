package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.d1;
import kotlin.e1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", t0.b.f22420d, "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes3.dex */
public abstract class a implements kotlin.coroutines.d<Object>, e, Serializable {

    @p4.m
    private final kotlin.coroutines.d<Object> completion;

    public a(@p4.m kotlin.coroutines.d<Object> dVar) {
        this.completion = dVar;
    }

    @p4.l
    public kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> completion) {
        l0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public e getCallerFrame() {
        kotlin.coroutines.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @p4.m
    public final kotlin.coroutines.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }

    @p4.m
    protected abstract Object invokeSuspend(@p4.l Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.d
    public final void resumeWith(@p4.l Object obj) {
        Object invokeSuspend;
        Object l5;
        kotlin.coroutines.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            kotlin.coroutines.d dVar2 = aVar.completion;
            l0.m(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                l5 = kotlin.coroutines.intrinsics.d.l();
            } catch (Throwable th) {
                d1.a aVar2 = d1.Companion;
                obj = d1.m6444constructorimpl(e1.a(th));
            }
            if (invokeSuspend == l5) {
                return;
            }
            d1.a aVar3 = d1.Companion;
            obj = d1.m6444constructorimpl(invokeSuspend);
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    @p4.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @p4.l
    public kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> completion) {
        l0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
