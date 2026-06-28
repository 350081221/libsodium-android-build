package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", t0.b.f22420d, "Lkotlinx/coroutines/n3;", bi.ay, "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/n3;", "", "e", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/r2;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n266#1:289\n1#2:290\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n287#1:289\n*E\n"})
/* loaded from: classes4.dex */
public final class o3 {
    @p4.l
    public static final <T> n3<T> a(@p4.l ThreadLocal<T> threadLocal, T t5) {
        return new kotlinx.coroutines.internal.a1(t5, threadLocal);
    }

    public static /* synthetic */ n3 b(ThreadLocal threadLocal, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @p4.m
    public static final Object c(@p4.l ThreadLocal<?> threadLocal, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        boolean z4;
        if (dVar.getContext().get(new kotlinx.coroutines.internal.b1(threadLocal)) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return kotlin.r2.f19517a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + dVar.getContext()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super kotlin.r2> dVar) {
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    @p4.m
    public static final Object e(@p4.l ThreadLocal<?> threadLocal, @p4.l kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlin.coroutines.jvm.internal.b.a(dVar.getContext().get(new kotlinx.coroutines.internal.b1(threadLocal)) != null);
    }

    private static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super Boolean> dVar) {
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }
}
