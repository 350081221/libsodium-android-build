package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000ø\u0001\u0000\u001a#\u0010\r\u001a\u00028\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0016\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082\b\"\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/q0;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/r0;", socket.g.f22386a, "Lkotlinx/coroutines/internal/f;", "N", "d", "(Lkotlinx/coroutines/internal/f;)Lkotlinx/coroutines/internal/f;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", "condition", "addConditionally", bi.ay, "I", "POINTERS_SHIFT", "Lkotlinx/coroutines/internal/t0;", "b", "Lkotlinx/coroutines/internal/t0;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a */
    private static final int f20342a = 16;

    /* renamed from: b */
    @p4.l
    private static final t0 f20343b = new t0("CLOSED");

    private static final boolean b(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i5, v3.l<? super Integer, Boolean> lVar) {
        int i6;
        do {
            i6 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i6)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i6, i6 + i5));
        return true;
    }

    private static final boolean c(Object obj, AtomicIntegerArray atomicIntegerArray, int i5, int i6, v3.l<? super Integer, Boolean> lVar) {
        int i7;
        do {
            i7 = atomicIntegerArray.get(i5);
            if (!lVar.invoke(Integer.valueOf(i7)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i5, i7, i7 + i6));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.f] */
    @p4.l
    public static final <N extends f<N>> N d(@p4.l N n5) {
        while (true) {
            Object f5 = n5.f();
            if (f5 == f20343b) {
                return n5;
            }
            ?? r02 = (f) f5;
            if (r02 == 0) {
                if (n5.j()) {
                    return n5;
                }
            } else {
                n5 = r02;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final Object e(@p4.m Object obj, @p4.l AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j5, @p4.l Object obj2, @p4.l v3.p<? super Long, Object, Object> pVar) {
        Object g5;
        boolean z4;
        do {
            g5 = g(obj2, j5, pVar);
            if (!r0.h(g5)) {
                q0 f5 = r0.f(g5);
                while (true) {
                    q0 q0Var = (q0) atomicReferenceFieldUpdater.get(obj);
                    z4 = true;
                    if (q0Var.f20383c >= f5.f20383c) {
                        break;
                    }
                    if (!f5.s()) {
                        z4 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, q0Var, f5)) {
                        if (q0Var.o()) {
                            q0Var.l();
                        }
                    } else if (f5.o()) {
                        f5.l();
                    }
                }
            } else {
                break;
            }
        } while (!z4);
        return g5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static final Object f(@p4.m Object obj, @p4.l AtomicReferenceArray atomicReferenceArray, int i5, long j5, @p4.l Object obj2, @p4.l v3.p<? super Long, Object, Object> pVar) {
        Object g5;
        boolean z4;
        do {
            g5 = g(obj2, j5, pVar);
            if (!r0.h(g5)) {
                q0 f5 = r0.f(g5);
                while (true) {
                    q0 q0Var = (q0) atomicReferenceArray.get(i5);
                    z4 = true;
                    if (q0Var.f20383c >= f5.f20383c) {
                        break;
                    }
                    if (!f5.s()) {
                        z4 = false;
                        break;
                    }
                    if (kotlinx.coroutines.channels.q.a(atomicReferenceArray, i5, q0Var, f5)) {
                        if (q0Var.o()) {
                            q0Var.l();
                        }
                    } else if (f5.o()) {
                        f5.l();
                    }
                }
            } else {
                break;
            }
        } while (!z4);
        return g5;
    }

    @p4.l
    public static final <S extends q0<S>> Object g(@p4.l S s5, long j5, @p4.l v3.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s5.f20383c >= j5 && !s5.h()) {
                return r0.b(s5);
            }
            Object f5 = s5.f();
            if (f5 == f20343b) {
                return r0.b(f20343b);
            }
            S s6 = (S) ((f) f5);
            if (s6 == null) {
                s6 = pVar.invoke(Long.valueOf(s5.f20383c + 1), s5);
                if (s5.m(s6)) {
                    if (s5.h()) {
                        s5.l();
                    }
                }
            }
            s5 = s6;
        }
    }

    private static final void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private static final void i(AtomicReferenceArray atomicReferenceArray, int i5, v3.l<Object, r2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceArray.get(i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j(@p4.m Object obj, @p4.l AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, @p4.l Object obj2) {
        while (true) {
            q0 q0Var = (q0) atomicReferenceFieldUpdater.get(obj);
            if (q0Var.f20383c >= obj2.f20383c) {
                return true;
            }
            if (!obj2.s()) {
                return false;
            }
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, q0Var, obj2)) {
                if (q0Var.o()) {
                    q0Var.l();
                }
                return true;
            }
            if (obj2.o()) {
                obj2.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k(@p4.m Object obj, @p4.l AtomicReferenceArray atomicReferenceArray, int i5, @p4.l Object obj2) {
        while (true) {
            q0 q0Var = (q0) atomicReferenceArray.get(i5);
            if (q0Var.f20383c >= obj2.f20383c) {
                return true;
            }
            if (!obj2.s()) {
                return false;
            }
            if (kotlinx.coroutines.channels.q.a(atomicReferenceArray, i5, q0Var, obj2)) {
                if (q0Var.o()) {
                    q0Var.l();
                }
                return true;
            }
            if (obj2.o()) {
                obj2.l();
            }
        }
    }
}
