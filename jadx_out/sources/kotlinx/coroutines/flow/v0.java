package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"T", t0.b.f22420d, "Lkotlinx/coroutines/flow/e0;", bi.ay, "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e0;", "Lkotlin/Function1;", "function", socket.g.f22386a, "(Lkotlinx/coroutines/flow/e0;Lv3/l;)Ljava/lang/Object;", "e", "Lkotlin/r2;", "f", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20248a = new kotlinx.coroutines.internal.t0("NONE");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final kotlinx.coroutines.internal.t0 f20249b = new kotlinx.coroutines.internal.t0("PENDING");

    @p4.l
    public static final <T> e0<T> a(T t5) {
        if (t5 == null) {
            t5 = (T) kotlinx.coroutines.flow.internal.u.f20143a;
        }
        return new u0(t5);
    }

    @p4.l
    public static final <T> i<T> d(@p4.l t0<? extends T> t0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < 2) {
            z4 = true;
        }
        if ((z4 || i5 == -2) && iVar == kotlinx.coroutines.channels.i.DROP_OLDEST) {
            return t0Var;
        }
        return k0.e(t0Var, gVar, i5, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@p4.l e0<T> e0Var, @p4.l v3.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) e0Var.getValue();
        } while (!e0Var.compareAndSet(r02, lVar.invoke(r02)));
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@p4.l e0<T> e0Var, @p4.l v3.l<? super T, ? extends T> lVar) {
        a1.b bVar;
        do {
            bVar = (Object) e0Var.getValue();
        } while (!e0Var.compareAndSet(bVar, lVar.invoke(bVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@p4.l e0<T> e0Var, @p4.l v3.l<? super T, ? extends T> lVar) {
        a1.b bVar;
        T invoke;
        do {
            bVar = (Object) e0Var.getValue();
            invoke = lVar.invoke(bVar);
        } while (!e0Var.compareAndSet(bVar, invoke));
        return invoke;
    }
}
