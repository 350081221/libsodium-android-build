package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.o0;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/o0;", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* loaded from: classes4.dex */
public final class p0 {

    @kotlin.i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/p0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/o0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n*L\n1#1,110:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.a implements o0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p<kotlin.coroutines.g, Throwable, kotlin.r2> f20435a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(v3.p<? super kotlin.coroutines.g, ? super Throwable, kotlin.r2> pVar, o0.b bVar) {
            super(bVar);
            this.f20435a = pVar;
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@p4.l kotlin.coroutines.g gVar, @p4.l Throwable th) {
            this.f20435a.invoke(gVar, th);
        }
    }

    @p4.l
    public static final o0 a(@p4.l v3.p<? super kotlin.coroutines.g, ? super Throwable, kotlin.r2> pVar) {
        return new a(pVar, o0.T);
    }

    @g2
    public static final void b(@p4.l kotlin.coroutines.g gVar, @p4.l Throwable th) {
        try {
            o0 o0Var = (o0) gVar.get(o0.T);
            if (o0Var != null) {
                o0Var.handleException(gVar, th);
            } else {
                kotlinx.coroutines.internal.i.a(gVar, th);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.internal.i.a(gVar, c(th, th2));
        }
    }

    @p4.l
    public static final Throwable c(@p4.l Throwable th, @p4.l Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        kotlin.p.a(runtimeException, th);
        return runtimeException;
    }
}
