package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.g;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", com.umeng.analytics.pro.d.X, "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
@r1({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes3.dex */
public abstract class d extends a {

    @p4.m
    private final kotlin.coroutines.g _context;

    @p4.m
    private transient kotlin.coroutines.d<Object> intercepted;

    public d(@p4.m kotlin.coroutines.d<Object> dVar, @p4.m kotlin.coroutines.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        kotlin.coroutines.g gVar = this._context;
        l0.m(gVar);
        return gVar;
    }

    @p4.l
    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().get(kotlin.coroutines.e.S);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        kotlin.coroutines.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(kotlin.coroutines.e.S);
            l0.m(bVar);
            ((kotlin.coroutines.e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f19229a;
    }

    public d(@p4.m kotlin.coroutines.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
