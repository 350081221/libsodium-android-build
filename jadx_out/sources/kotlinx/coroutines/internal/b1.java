package kotlinx.coroutines.internal;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/b1;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/internal/a1;", "Ljava/lang/ThreadLocal;", bi.ay, "threadLocal", "b", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.a1
/* loaded from: classes4.dex */
public final class b1 implements g.c<a1<?>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final ThreadLocal<?> f20336a;

    public b1(@p4.l ThreadLocal<?> threadLocal) {
        this.f20336a = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.f20336a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b1 c(b1 b1Var, ThreadLocal threadLocal, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            threadLocal = b1Var.f20336a;
        }
        return b1Var.b(threadLocal);
    }

    @p4.l
    public final b1 b(@p4.l ThreadLocal<?> threadLocal) {
        return new b1(threadLocal);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && kotlin.jvm.internal.l0.g(this.f20336a, ((b1) obj).f20336a);
    }

    public int hashCode() {
        return this.f20336a.hashCode();
    }

    @p4.l
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f20336a + ')';
    }
}
