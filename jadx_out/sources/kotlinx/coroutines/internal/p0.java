package kotlinx.coroutines.internal;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/p0;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", "state", "Lkotlin/r2;", "W", "s1", "Lkotlin/coroutines/d;", "d", "Lkotlin/coroutines/d;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "K0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class p0<T> extends kotlinx.coroutines.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlin.coroutines.d<T> f20380d;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(@p4.l kotlin.coroutines.g gVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        super(gVar, true, true);
        this.f20380d = dVar;
    }

    @Override // kotlinx.coroutines.t2
    protected final boolean K0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.t2
    public void W(@p4.m Object obj) {
        kotlin.coroutines.d e5;
        e5 = kotlin.coroutines.intrinsics.c.e(this.f20380d);
        m.e(e5, kotlinx.coroutines.j0.a(obj, this.f20380d), null, 2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f20380d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.a
    protected void s1(@p4.m Object obj) {
        kotlin.coroutines.d<T> dVar = this.f20380d;
        dVar.resumeWith(kotlinx.coroutines.j0.a(obj, dVar));
    }
}
