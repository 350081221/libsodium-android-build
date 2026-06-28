package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class i {
    public static final void a(@p4.l kotlin.coroutines.g gVar, @p4.l Throwable th) {
        Iterator<kotlinx.coroutines.o0> it = h.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(gVar, th);
            } catch (n unused) {
                return;
            } catch (Throwable th2) {
                h.c(kotlinx.coroutines.p0.c(th, th2));
            }
        }
        try {
            kotlin.p.a(th, new k(gVar));
        } catch (Throwable unused2) {
        }
        h.c(th);
    }
}
