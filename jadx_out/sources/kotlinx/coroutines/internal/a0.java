package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0001\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0019j\b\u0012\u0004\u0012\u00028\u0000`\u001a0\u00188\u0002X\u0082\u0004¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/internal/a0;", "", "E", "Lkotlin/r2;", "b", "element", "", bi.ay, "(Ljava/lang/Object;)Z", bi.aJ, "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", socket.g.f22386a, "d", "e", "()Z", "isEmpty", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/b0;", "Lkotlinx/coroutines/internal/Core;", "_cur", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class a0<E> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20307a = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_cur");

    @u3.w
    @p4.m
    private volatile Object _cur;

    public a0(boolean z4) {
        this._cur = new b0(8, z4);
    }

    private final void f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean a(@p4.l E e5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20307a;
        while (true) {
            b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
            int a5 = b0Var.a(e5);
            if (a5 == 0) {
                return true;
            }
            if (a5 != 1) {
                if (a5 == 2) {
                    return false;
                }
            } else {
                androidx.concurrent.futures.a.a(f20307a, this, b0Var, b0Var.m());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20307a;
        while (true) {
            b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
            if (b0Var.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f20307a, this, b0Var, b0Var.m());
            }
        }
    }

    public final int c() {
        return ((b0) f20307a.get(this)).f();
    }

    public final boolean d() {
        return ((b0) f20307a.get(this)).g();
    }

    public final boolean e() {
        return ((b0) f20307a.get(this)).h();
    }

    @p4.l
    public final <R> List<R> g(@p4.l v3.l<? super E, ? extends R> lVar) {
        return ((b0) f20307a.get(this)).k(lVar);
    }

    @p4.m
    public final E h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20307a;
        while (true) {
            b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
            E e5 = (E) b0Var.n();
            if (e5 != b0.f20327t) {
                return e5;
            }
            androidx.concurrent.futures.a.a(f20307a, this, b0Var, b0Var.m());
        }
    }
}
