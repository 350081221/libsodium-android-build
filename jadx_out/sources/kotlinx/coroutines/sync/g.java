package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.t0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\bJ\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086\bJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086\bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086\bJ\"\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00178\u0006¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/sync/g;", "Lkotlinx/coroutines/internal/q0;", "", "index", "", bi.aK, t0.b.f22420d, "Lkotlin/r2;", "x", "expected", "", bi.aL, "w", "", "cause", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "q", "", "toString", bi.aA, "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "acquirers", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/g;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* loaded from: classes4.dex */
public final class g extends q0<g> {

    /* renamed from: e, reason: collision with root package name */
    @l
    private final AtomicReferenceArray f20630e;

    public g(long j5, @m g gVar, int i5) {
        super(j5, gVar, i5);
        int i6;
        i6 = f.f20629f;
        this.f20630e = new AtomicReferenceArray(i6);
    }

    @Override // kotlinx.coroutines.internal.q0
    public int p() {
        int i5;
        i5 = f.f20629f;
        return i5;
    }

    @Override // kotlinx.coroutines.internal.q0
    public void q(int i5, @m Throwable th, @l kotlin.coroutines.g gVar) {
        t0 t0Var;
        t0Var = f.f20628e;
        v().set(i5, t0Var);
        r();
    }

    public final boolean t(int i5, @m Object obj, @m Object obj2) {
        return q.a(v(), i5, obj, obj2);
    }

    @l
    public String toString() {
        return "SemaphoreSegment[id=" + this.f20383c + ", hashCode=" + hashCode() + ']';
    }

    @m
    public final Object u(int i5) {
        return v().get(i5);
    }

    @l
    public final AtomicReferenceArray v() {
        return this.f20630e;
    }

    @m
    public final Object w(int i5, @m Object obj) {
        return v().getAndSet(i5, obj);
    }

    public final void x(int i5, @m Object obj) {
        v().set(i5, obj);
    }
}
