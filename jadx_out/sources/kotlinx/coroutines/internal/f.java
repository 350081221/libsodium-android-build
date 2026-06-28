package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.f;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b$\u0010%J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010 \u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0002X\u0082\u0004R\u0013\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000!8\u0002X\u0082\u0004¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/f;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lv3/a;)Lkotlinx/coroutines/internal/f;", t0.b.f22420d, "", "m", "(Lkotlinx/coroutines/internal/f;)Z", "Lkotlin/r2;", "b", "j", "l", "f", "()Ljava/lang/Object;", "nextOrClosed", "c", "()Lkotlinx/coroutines/internal/f;", "aliveSegmentLeft", "d", "aliveSegmentRight", "e", "next", "i", "()Z", "isTail", socket.g.f22386a, "prev", bi.aJ, "isRemoved", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "<init>", "(Lkotlinx/coroutines/internal/f;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* loaded from: classes4.dex */
public abstract class f<N extends f<N>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20347a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20348b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");

    @u3.w
    @p4.m
    private volatile Object _next;

    @u3.w
    @p4.m
    private volatile Object _prev;

    public f(@p4.m N n5) {
        this._prev = n5;
    }

    private final N c() {
        N g5 = g();
        while (g5 != null && g5.h()) {
            g5 = (N) f20348b.get(g5);
        }
        return g5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.f] */
    private final N d() {
        N e5 = e();
        kotlin.jvm.internal.l0.m(e5);
        while (e5.h()) {
            ?? e6 = e5.e();
            if (e6 == 0) {
                return e5;
            }
            e5 = e6;
        }
        return e5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f20347a.get(this);
    }

    private final void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void b() {
        f20348b.lazySet(this, null);
    }

    @p4.m
    public final N e() {
        Object f5 = f();
        if (f5 == e.a()) {
            return null;
        }
        return (N) f5;
    }

    @p4.m
    public final N g() {
        return (N) f20348b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f20347a, this, null, e.a());
    }

    @p4.m
    public final N k(@p4.l v3.a aVar) {
        Object f5 = f();
        if (f5 != e.a()) {
            return (N) f5;
        }
        aVar.invoke();
        throw new kotlin.y();
    }

    public final void l() {
        Object obj;
        N n5;
        if (i()) {
            return;
        }
        while (true) {
            N c5 = c();
            N d5 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20348b;
            do {
                obj = atomicReferenceFieldUpdater.get(d5);
                if (((f) obj) == null) {
                    n5 = null;
                } else {
                    n5 = c5;
                }
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, d5, obj, n5));
            if (c5 != null) {
                f20347a.set(c5, d5);
            }
            if (!d5.h() || d5.i()) {
                if (c5 == null || !c5.h()) {
                    return;
                }
            }
        }
    }

    public final boolean m(@p4.l N n5) {
        return androidx.concurrent.futures.a.a(f20347a, this, null, n5);
    }
}
