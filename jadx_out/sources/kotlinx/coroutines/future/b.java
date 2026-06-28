package kotlinx.coroutines.future;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/future/b;", "T", "Ljava/util/function/BiFunction;", "", "Lkotlin/r2;", "result", "exception", bi.ay, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/d;", "cont", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class b<T> implements BiFunction<T, Throwable, r2> {

    @m
    @u3.e
    public volatile kotlin.coroutines.d<? super T> cont;

    public b(@m kotlin.coroutines.d<? super T> dVar) {
        this.cont = dVar;
    }

    public void a(@m T t5, @m Throwable th) {
        CompletionException completionException;
        Throwable cause;
        kotlin.coroutines.d<? super T> dVar = this.cont;
        if (dVar == null) {
            return;
        }
        if (th == null) {
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(t5));
            return;
        }
        if (th instanceof CompletionException) {
            completionException = (CompletionException) th;
        } else {
            completionException = null;
        }
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        d1.a aVar2 = d1.Companion;
        dVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ r2 apply(Object obj, Throwable th) {
        a(obj, th);
        return r2.f19517a;
    }
}
