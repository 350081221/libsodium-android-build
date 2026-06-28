package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.d1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u000fB\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u000b\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/e;", "T", "", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/a1;", bi.ay, "[Lkotlinx/coroutines/a1;", "deferreds", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "<init>", "([Lkotlinx/coroutines/a1;)V", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n314#2,9:128\n323#2,2:141\n13#3:137\n19#3:140\n13579#4,2:138\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n71#1:128,9\n71#1:141,2\n78#1:137\n90#1:140\n83#1:138,2\n*E\n"})
/* loaded from: classes4.dex */
public final class e<T> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20013b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final a1<T>[] f20014a;

    @u3.w
    private volatile int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R<\u0010\u001a\u001a\u000e\u0018\u00010\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0015\u001a\u000e\u0018\u00010\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0013R\b\u0012\u0004\u0012\u00028\u00000\u00140\u001b8\u0002X\u0082\u0004¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/s2;", "", "cause", "Lkotlin/r2;", "x", "Lkotlinx/coroutines/p;", "", "e", "Lkotlinx/coroutines/p;", "continuation", "Lkotlinx/coroutines/n1;", "f", "Lkotlinx/coroutines/n1;", "B", "()Lkotlinx/coroutines/n1;", "D", "(Lkotlinx/coroutines/n1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", t0.b.f22420d, "A", "()Lkotlinx/coroutines/e$b;", "C", "(Lkotlinx/coroutines/e$b;)V", "disposer", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n11335#2:128\n11670#2,3:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n121#1:128\n121#1:129,3\n*E\n"})
    /* loaded from: classes4.dex */
    public final class a extends s2 {

        /* renamed from: h, reason: collision with root package name */
        @p4.l
        private static final AtomicReferenceFieldUpdater f20015h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");

        @u3.w
        @p4.m
        private volatile Object _disposer;

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final p<List<? extends T>> f20016e;

        /* renamed from: f, reason: collision with root package name */
        public n1 f20017f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@p4.l p<? super List<? extends T>> pVar) {
            this.f20016e = pVar;
        }

        @p4.m
        public final e<T>.b A() {
            return (b) f20015h.get(this);
        }

        @p4.l
        public final n1 B() {
            n1 n1Var = this.f20017f;
            if (n1Var != null) {
                return n1Var;
            }
            kotlin.jvm.internal.l0.S("handle");
            return null;
        }

        public final void C(@p4.m e<T>.b bVar) {
            f20015h.set(this, bVar);
        }

        public final void D(@p4.l n1 n1Var) {
            this.f20017f = n1Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
            x(th);
            return kotlin.r2.f19517a;
        }

        @Override // kotlinx.coroutines.f0
        public void x(@p4.m Throwable th) {
            if (th != null) {
                Object i5 = this.f20016e.i(th);
                if (i5 != null) {
                    this.f20016e.K(i5);
                    e<T>.b A = A();
                    if (A != null) {
                        A.k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f20013b.decrementAndGet(e.this) == 0) {
                p<List<? extends T>> pVar = this.f20016e;
                a1[] a1VarArr = ((e) e.this).f20014a;
                ArrayList arrayList = new ArrayList(a1VarArr.length);
                for (a1 a1Var : a1VarArr) {
                    arrayList.add(a1Var.j());
                }
                d1.a aVar = kotlin.d1.Companion;
                pVar.resumeWith(kotlin.d1.m6444constructorimpl(arrayList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "Lkotlin/r2;", "k", "", "cause", "j", "", "toString", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", bi.ay, "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n13579#2,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n96#1:128,2\n*E\n"})
    /* loaded from: classes4.dex */
    public final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final e<T>.a[] f20019a;

        public b(@p4.l e<T>.a[] aVarArr) {
            this.f20019a = aVarArr;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
            j(th);
            return kotlin.r2.f19517a;
        }

        @Override // kotlinx.coroutines.o
        public void j(@p4.m Throwable th) {
            k();
        }

        public final void k() {
            for (e<T>.a aVar : this.f20019a) {
                aVar.B().dispose();
            }
        }

        @p4.l
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f20019a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@p4.l a1<? extends T>[] a1VarArr) {
        this.f20014a = a1VarArr;
        this.notCompletedCount = a1VarArr.length;
    }

    @p4.m
    public final Object c(@p4.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        int length = this.f20014a.length;
        a[] aVarArr = new a[length];
        for (int i5 = 0; i5 < length; i5++) {
            a1 a1Var = this.f20014a[i5];
            a1Var.start();
            a aVar = new a(qVar);
            aVar.D(a1Var.t0(aVar));
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            aVarArr[i5] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i6 = 0; i6 < length; i6++) {
            aVarArr[i6].C(bVar);
        }
        if (qVar.d()) {
            bVar.k();
        } else {
            qVar.g(bVar);
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }
}
