package kotlinx.coroutines.internal;

import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/k;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "getLocalizedMessage", "", "fillInStackTrace", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/g;", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,50:1\n26#2:51\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/DiagnosticCoroutineContextException\n*L\n46#1:51\n*E\n"})
/* loaded from: classes4.dex */
public final class k extends RuntimeException {

    @p4.l
    private final transient kotlin.coroutines.g context;

    public k(@p4.l kotlin.coroutines.g gVar) {
        this.context = gVar;
    }

    @Override // java.lang.Throwable
    @p4.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @p4.l
    public String getLocalizedMessage() {
        return this.context.toString();
    }
}
