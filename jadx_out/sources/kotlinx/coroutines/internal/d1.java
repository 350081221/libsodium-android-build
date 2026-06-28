package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.e1;

@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u00104J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082\u0010J\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0006\u0010\u000f\u001a\u00020\bJ2\u0010\u0016\u001a\u0004\u0018\u00018\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0018J&\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0010H\u0086\b¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00028\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00140\u0010H\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b'\u0010\u001dR \u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010-\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u00100\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/d1;", "Lkotlinx/coroutines/internal/e1;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "i", "Lkotlin/r2;", "q", bi.aA, "", "j", "()[Lkotlinx/coroutines/internal/e1;", "r", "d", "Lkotlin/Function1;", "Lkotlin/v0;", "name", t0.b.f22420d, "", "predicate", "e", "(Lv3/l;)Lkotlinx/coroutines/internal/e1;", "()Lkotlinx/coroutines/internal/e1;", "n", "m", "node", "b", "(Lkotlinx/coroutines/internal/e1;)V", "cond", "c", "(Lkotlinx/coroutines/internal/e1;Lv3/l;)Z", "k", "(Lkotlinx/coroutines/internal/e1;)Z", "f", "index", "l", "(I)Lkotlinx/coroutines/internal/e1;", bi.ay, "[Lkotlinx/coroutines/internal/e1;", socket.g.f22386a, "()I", "o", "(I)V", "size", bi.aJ, "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
@r1({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* loaded from: classes4.dex */
public class d1<T extends e1 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20340b = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_size");

    @u3.w
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private T[] f20341a;

    private final T[] j() {
        T[] tArr = this.f20341a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new e1[4];
            this.f20341a = tArr2;
            return tArr2;
        }
        if (g() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, g() * 2);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((e1[]) copyOf);
            this.f20341a = tArr3;
            return tArr3;
        }
        return tArr;
    }

    private final void o(int i5) {
        f20340b.set(this, i5);
    }

    private final void p(int i5) {
        while (true) {
            int i6 = (i5 * 2) + 1;
            if (i6 >= g()) {
                return;
            }
            T[] tArr = this.f20341a;
            kotlin.jvm.internal.l0.m(tArr);
            int i7 = i6 + 1;
            if (i7 < g()) {
                T t5 = tArr[i7];
                kotlin.jvm.internal.l0.m(t5);
                T t6 = tArr[i6];
                kotlin.jvm.internal.l0.m(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    i6 = i7;
                }
            }
            T t7 = tArr[i5];
            kotlin.jvm.internal.l0.m(t7);
            T t8 = tArr[i6];
            kotlin.jvm.internal.l0.m(t8);
            if (((Comparable) t7).compareTo(t8) <= 0) {
                return;
            }
            r(i5, i6);
            i5 = i6;
        }
    }

    private final void q(int i5) {
        while (i5 > 0) {
            T[] tArr = this.f20341a;
            kotlin.jvm.internal.l0.m(tArr);
            int i6 = (i5 - 1) / 2;
            T t5 = tArr[i6];
            kotlin.jvm.internal.l0.m(t5);
            T t6 = tArr[i5];
            kotlin.jvm.internal.l0.m(t6);
            if (((Comparable) t5).compareTo(t6) <= 0) {
                return;
            }
            r(i5, i6);
            i5 = i6;
        }
    }

    private final void r(int i5, int i6) {
        T[] tArr = this.f20341a;
        kotlin.jvm.internal.l0.m(tArr);
        T t5 = tArr[i6];
        kotlin.jvm.internal.l0.m(t5);
        T t6 = tArr[i5];
        kotlin.jvm.internal.l0.m(t6);
        tArr[i5] = t5;
        tArr[i6] = t6;
        t5.setIndex(i5);
        t6.setIndex(i6);
    }

    @kotlin.a1
    public final void a(@p4.l T t5) {
        t5.c(this);
        T[] j5 = j();
        int g5 = g();
        o(g5 + 1);
        j5[g5] = t5;
        t5.setIndex(g5);
        q(g5);
    }

    public final void b(@p4.l T t5) {
        synchronized (this) {
            a(t5);
            r2 r2Var = r2.f19517a;
        }
    }

    public final boolean c(@p4.l T t5, @p4.l v3.l<? super T, Boolean> lVar) {
        boolean z4;
        synchronized (this) {
            try {
                if (lVar.invoke(f()).booleanValue()) {
                    a(t5);
                    z4 = true;
                } else {
                    z4 = false;
                }
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return z4;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.f20341a;
            if (tArr != null) {
                kotlin.collections.o.V1(tArr, null, 0, 0, 6, null);
            }
            f20340b.set(this, 0);
            r2 r2Var = r2.f19517a;
        }
    }

    @p4.m
    public final T e(@p4.l v3.l<? super T, Boolean> lVar) {
        T t5;
        synchronized (this) {
            int g5 = g();
            int i5 = 0;
            while (true) {
                t5 = null;
                if (i5 >= g5) {
                    break;
                }
                T[] tArr = this.f20341a;
                if (tArr != null) {
                    t5 = (Object) tArr[i5];
                }
                kotlin.jvm.internal.l0.m(t5);
                if (lVar.invoke(t5).booleanValue()) {
                    break;
                }
                i5++;
            }
        }
        return t5;
    }

    @kotlin.a1
    @p4.m
    public final T f() {
        T[] tArr = this.f20341a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return f20340b.get(this);
    }

    public final boolean h() {
        return g() == 0;
    }

    @p4.m
    public final T i() {
        T f5;
        synchronized (this) {
            f5 = f();
        }
        return f5;
    }

    public final boolean k(@p4.l T t5) {
        boolean z4;
        synchronized (this) {
            if (t5.f() == null) {
                z4 = false;
            } else {
                l(t5.getIndex());
                z4 = true;
            }
        }
        return z4;
    }

    @p4.l
    @kotlin.a1
    public final T l(int i5) {
        T[] tArr = this.f20341a;
        kotlin.jvm.internal.l0.m(tArr);
        o(g() - 1);
        if (i5 < g()) {
            r(i5, g());
            int i6 = (i5 - 1) / 2;
            if (i5 > 0) {
                T t5 = tArr[i5];
                kotlin.jvm.internal.l0.m(t5);
                T t6 = tArr[i6];
                kotlin.jvm.internal.l0.m(t6);
                if (((Comparable) t5).compareTo(t6) < 0) {
                    r(i5, i6);
                    q(i6);
                }
            }
            p(i5);
        }
        T t7 = tArr[g()];
        kotlin.jvm.internal.l0.m(t7);
        t7.c(null);
        t7.setIndex(-1);
        tArr[g()] = null;
        return t7;
    }

    @p4.m
    public final T m(@p4.l v3.l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                T f5 = f();
                T t5 = null;
                if (f5 == null) {
                    kotlin.jvm.internal.i0.d(2);
                    kotlin.jvm.internal.i0.c(2);
                    return null;
                }
                if (lVar.invoke(f5).booleanValue()) {
                    t5 = l(0);
                }
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                return t5;
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
    }

    @p4.m
    public final T n() {
        T t5;
        synchronized (this) {
            if (g() > 0) {
                t5 = l(0);
            } else {
                t5 = null;
            }
        }
        return t5;
    }
}
