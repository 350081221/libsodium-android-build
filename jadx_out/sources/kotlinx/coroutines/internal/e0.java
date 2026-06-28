package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.x2;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/e0;", "", "Lkotlinx/coroutines/x2;", bi.ay, "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lkotlinx/coroutines/x2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final e0 f20344a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f20345b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final x2 f20346c;

    static {
        e0 e0Var = new e0();
        f20344a = e0Var;
        f20345b = w0.f("kotlinx.coroutines.fast.service.loader", true);
        f20346c = e0Var.a();
    }

    private e0() {
    }

    private final x2 a() {
        kotlin.sequences.m e5;
        List<d0> c32;
        Object next;
        x2 f5;
        try {
            if (f20345b) {
                c32 = p.f20378a.d();
            } else {
                e5 = kotlin.sequences.s.e(ServiceLoader.load(d0.class, d0.class.getClassLoader()).iterator());
                c32 = kotlin.sequences.u.c3(e5);
            }
            Iterator<T> it = c32.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c5 = ((d0) next).c();
                    do {
                        Object next2 = it.next();
                        int c6 = ((d0) next2).c();
                        if (c5 < c6) {
                            next = next2;
                            c5 = c6;
                        }
                    } while (it.hasNext());
                }
            }
            d0 d0Var = (d0) next;
            if (d0Var == null || (f5 = f0.f(d0Var, c32)) == null) {
                return f0.b(null, null, 3, null);
            }
            return f5;
        } catch (Throwable th) {
            return f0.b(th, null, 2, null);
        }
    }
}
