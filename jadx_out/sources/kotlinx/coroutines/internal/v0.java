package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.g2;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", bi.ay, "(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,33:1\n20#2:34\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n31#1:34\n*E\n"})
/* loaded from: classes4.dex */
public final class v0 {
    @g2
    public static final <T> T a(@p4.l Object obj, @p4.l v3.a<? extends T> aVar) {
        T invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return invoke;
    }
}
