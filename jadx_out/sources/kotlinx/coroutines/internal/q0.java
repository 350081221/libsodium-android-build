package kotlinx.coroutines.internal;

import androidx.core.internal.view.SupportMenu;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.b3;
import kotlinx.coroutines.internal.q0;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&J\u0006\u0010\u0010\u001a\u00020\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u000b\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/q0;", "S", "Lkotlinx/coroutines/internal/f;", "Lkotlinx/coroutines/b3;", "", bi.aE, "()Z", "o", "", "index", "", "cause", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/r2;", "q", "r", "", "c", "J", "id", bi.aA, "()I", "numberOfSlots", bi.aJ, "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/internal/q0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* loaded from: classes4.dex */
public abstract class q0<S extends q0<S>> extends f<S> implements b3 {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20382d = AtomicIntegerFieldUpdater.newUpdater(q0.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public final long f20383c;

    @u3.w
    private volatile int cleanedAndPointers;

    public q0(long j5, @p4.m S s5, int i5) {
        super(s5);
        this.f20383c = j5;
        this.cleanedAndPointers = i5 << 16;
    }

    @Override // kotlinx.coroutines.internal.f
    public boolean h() {
        if (f20382d.get(this) == p() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (f20382d.addAndGet(this, SupportMenu.CATEGORY_MASK) == p() && !i()) {
            return true;
        }
        return false;
    }

    public abstract int p();

    public abstract void q(int i5, @p4.m Throwable th, @p4.l kotlin.coroutines.g gVar);

    public final void r() {
        if (f20382d.incrementAndGet(this) == p()) {
            l();
        }
    }

    public final boolean s() {
        int i5;
        boolean z4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20382d;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 == p() && !i()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 65536 + i5));
        return true;
    }
}
