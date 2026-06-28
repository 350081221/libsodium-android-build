package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.g;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.p2;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b,\u0010-J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lkotlinx/coroutines/flow/internal/v;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "uCont", t0.b.f22420d, "", "emit", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/n;", "exception", "exceptionTransparencyViolated", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/d1;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collector", "Lkotlinx/coroutines/flow/j;", "collectContext", "Lkotlin/coroutines/g;", "", "collectContextSize", "I", "lastEmissionContext", "completion", "Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* loaded from: classes4.dex */
public final class v<T> extends kotlin.coroutines.jvm.internal.d implements kotlinx.coroutines.flow.j<T>, kotlin.coroutines.jvm.internal.e {

    @p4.l
    @u3.e
    public final kotlin.coroutines.g collectContext;

    @u3.e
    public final int collectContextSize;

    @p4.l
    @u3.e
    public final kotlinx.coroutines.flow.j<T> collector;

    @p4.m
    private kotlin.coroutines.d<? super r2> completion;

    @p4.m
    private kotlin.coroutines.g lastEmissionContext;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lkotlin/coroutines/g$b;", "<anonymous parameter 1>", "invoke", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends n0 implements v3.p<Integer, g.b, Integer> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @p4.l
        public final Integer invoke(int i5, @p4.l g.b bVar) {
            return Integer.valueOf(i5 + 1);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return invoke(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.g gVar) {
        super(s.f20140a, kotlin.coroutines.i.INSTANCE);
        this.collector = jVar;
        this.collectContext = gVar;
        this.collectContextSize = ((Number) gVar.fold(0, a.INSTANCE)).intValue();
    }

    private final void checkContext(kotlin.coroutines.g gVar, kotlin.coroutines.g gVar2, T t5) {
        if (gVar2 instanceof n) {
            exceptionTransparencyViolated((n) gVar2, t5);
        }
        x.a(this, gVar);
    }

    private final void exceptionTransparencyViolated(n nVar, Object obj) {
        String p5;
        p5 = kotlin.text.x.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + nVar.f20137a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(p5.toString());
    }

    @Override // kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object l6;
        try {
            Object emit = emit(dVar, (kotlin.coroutines.d<? super r2>) t5);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (emit == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            return emit == l6 ? emit : r2.f19517a;
        } catch (Throwable th) {
            this.lastEmissionContext = new n(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @p4.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<? super r2> dVar = this.completion;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        kotlin.coroutines.g gVar = this.lastEmissionContext;
        return gVar == null ? kotlin.coroutines.i.INSTANCE : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @p4.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Throwable m6447exceptionOrNullimpl = d1.m6447exceptionOrNullimpl(obj);
        if (m6447exceptionOrNullimpl != null) {
            this.lastEmissionContext = new n(m6447exceptionOrNullimpl, getContext());
        }
        kotlin.coroutines.d<? super r2> dVar = this.completion;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        l5 = kotlin.coroutines.intrinsics.d.l();
        return l5;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(kotlin.coroutines.d<? super r2> dVar, T t5) {
        Object l5;
        kotlin.coroutines.g context = dVar.getContext();
        p2.z(context);
        kotlin.coroutines.g gVar = this.lastEmissionContext;
        if (gVar != context) {
            checkContext(context, gVar, t5);
            this.lastEmissionContext = context;
        }
        this.completion = dVar;
        v3.q a5 = w.a();
        kotlinx.coroutines.flow.j<T> jVar = this.collector;
        l0.n(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a5.invoke(jVar, t5, this);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (!l0.g(invoke, l5)) {
            this.completion = null;
        }
        return invoke;
    }
}
