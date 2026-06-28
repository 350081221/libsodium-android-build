package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0082\bJ\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0082\bJ\u0006\u0010\u0007\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u000b\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004R\u0013\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0002X\u0082\u0004¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/i0;", "T", "", "", "f", "", "c", bi.ay, "", "b", "", "e", "()Ljava/lang/String;", "toString", "I", "maxCapacity", "Lkotlin/Function1;", "Lv3/l;", "create", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "<init>", "(ILv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
/* loaded from: classes4.dex */
public final class i0<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20363d = AtomicIntegerFieldUpdater.newUpdater(i0.class, "controlState");

    /* renamed from: a, reason: collision with root package name */
    private final int f20364a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<Integer, T> f20365b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final AtomicReferenceArray f20366c;

    @u3.w
    private volatile int controlState;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(int i5, @p4.l v3.l<? super Integer, ? extends T> lVar) {
        this.f20364a = i5;
        this.f20365b = lVar;
        this.f20366c = new AtomicReferenceArray(i5);
    }

    private final boolean c(int i5) {
        return (i5 & Integer.MIN_VALUE) != 0;
    }

    private final void d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final int f() {
        int i5;
        boolean z4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20363d;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & Integer.MIN_VALUE) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return 0;
            }
        } while (!f20363d.compareAndSet(this, i5, Integer.MIN_VALUE | i5));
        return i5;
    }

    public final boolean a() {
        int i5;
        boolean z4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20363d;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i5) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return false;
            }
            if (i5 >= this.f20364a) {
                return true;
            }
        } while (!f20363d.compareAndSet(this, i5, i5 + 1));
        this.f20366c.set(i5, this.f20365b.invoke(Integer.valueOf(i5)));
        return true;
    }

    @p4.l
    public final List<T> b() {
        int i5;
        boolean z4;
        kotlin.ranges.l W1;
        int Y;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20363d;
        while (true) {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & Integer.MIN_VALUE) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i5 = 0;
                break;
            }
            if (f20363d.compareAndSet(this, i5, Integer.MIN_VALUE | i5)) {
                break;
            }
        }
        W1 = kotlin.ranges.u.W1(0, i5);
        Y = kotlin.collections.x.Y(W1, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.s0) it).nextInt();
            do {
                andSet = this.f20366c.getAndSet(nextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    @p4.l
    public final String e() {
        kotlin.ranges.l W1;
        int Y;
        String str;
        int i5 = f20363d.get(this);
        boolean z4 = false;
        W1 = kotlin.ranges.u.W1(0, Integer.MAX_VALUE & i5);
        Y = kotlin.collections.x.Y(W1, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f20366c.get(((kotlin.collections.s0) it).nextInt()));
        }
        String obj = arrayList.toString();
        if ((i5 & Integer.MIN_VALUE) != 0) {
            z4 = true;
        }
        if (z4) {
            str = "[closed]";
        } else {
            str = "";
        }
        return obj + str;
    }

    @p4.l
    public String toString() {
        return "OnDemandAllocatingPool(" + e() + ')';
    }
}
