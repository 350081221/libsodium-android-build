package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/z;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/d1;", "result", "Lkotlin/r2;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", bi.ay, "Lkotlin/coroutines/d;", "uCont", "Lkotlin/coroutines/g;", "b", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class z<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.d<T> f20149a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f20150b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@p4.l kotlin.coroutines.d<? super T> dVar, @p4.l kotlin.coroutines.g gVar) {
        this.f20149a = dVar;
        this.f20150b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f20149a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        return this.f20150b;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @p4.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@p4.l Object obj) {
        this.f20149a.resumeWith(obj);
    }
}
