package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.bi;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.y;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.internal.t0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import u3.w;
import v3.p;
import w3.g;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0015+,B\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020(¢\u0006\u0004\b)\u0010*J\b\u0010\u0006\u001a\u00020\u0005H\u0002J#\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0006\u0010\u0013\u001a\u00020\u0005R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u000b\u0010$\u001a\u00020#8\u0002X\u0082\u0004R!\u0010'\u001a\u0018\u0012\u0014\u0012\u00120&R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000%8\u0002X\u0082\u0004¨\u0006-"}, d2 = {"Lkotlinx/coroutines/debug/internal/b;", "", "K", "V", "Lkotlin/collections/g;", "Lkotlin/r2;", "e", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, socket.g.f22386a, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/k;", "w", "d", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "i", "Ljava/lang/ref/ReferenceQueue;", bi.ay, "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getEntries", "entries", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/b$a;", "core", "", "<init>", "(Z)V", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
/* loaded from: classes4.dex */
public final class b<K, V> extends kotlin.collections.g<K, V> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f19955b = AtomicIntegerFieldUpdater.newUpdater(b.class, "_size");

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19956c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "core");

    @w
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final ReferenceQueue<K> f19957a;

    @w
    @p4.m
    private volatile Object core;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010J\u0012\u0010\u0013\u001a\u00020\u00062\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\fJ,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0017\"\u0004\b\u0002\u0010\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0015R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0019\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f0 8\u0002X\u0082\u0004R\u000b\u0010#\u001a\u00020\"8\u0002X\u0082\u0004R\u0013\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 8\u0002X\u0082\u0004¨\u0006'"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a;", "", "", "hash", "f", "index", "Lkotlin/r2;", "k", DatabaseFileArchive.COLUMN_KEY, "e", "(Ljava/lang/Object;)Ljava/lang/Object;", t0.b.f22420d, "Lkotlinx/coroutines/debug/internal/k;", "weakKey0", bi.aJ, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/k;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/b;", "j", "weakRef", "d", "E", "Lkotlin/Function2;", "factory", "", socket.g.f22386a, bi.ay, "I", "allocated", "b", "shift", "c", "threshold", "Lkotlinx/atomicfu/AtomicArray;", "keys", "Lkotlinx/atomicfu/AtomicInt;", "load", "values", "<init>", "(Lkotlinx/coroutines/debug/internal/b;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class a {

        /* renamed from: g, reason: collision with root package name */
        @p4.l
        private static final AtomicIntegerFieldUpdater f19958g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* renamed from: a, reason: collision with root package name */
        private final int f19959a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19960b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19961c;

        /* renamed from: d, reason: collision with root package name */
        @p4.l
        private final AtomicReferenceArray f19962d;

        /* renamed from: e, reason: collision with root package name */
        @p4.l
        private final AtomicReferenceArray f19963e;

        @w
        private volatile int load;

        /* JADX INFO: Access modifiers changed from: private */
        @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0013\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a$a;", "E", "", "Lkotlin/r2;", bi.ay, "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "Lkotlin/Function2;", "Lv3/p;", "factory", "", "I", "index", "c", "Ljava/lang/Object;", DatabaseFileArchive.COLUMN_KEY, "d", t0.b.f22420d, "<init>", "(Lkotlinx/coroutines/debug/internal/b$a;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
        @r1({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
        /* renamed from: kotlinx.coroutines.debug.internal.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C0572a<E> implements Iterator<E>, w3.d {

            /* renamed from: a, reason: collision with root package name */
            @p4.l
            private final p<K, V, E> f19965a;

            /* renamed from: b, reason: collision with root package name */
            private int f19966b = -1;

            /* renamed from: c, reason: collision with root package name */
            private K f19967c;

            /* renamed from: d, reason: collision with root package name */
            private V f19968d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0572a(@p4.l p<? super K, ? super V, ? extends E> pVar) {
                this.f19965a = pVar;
                a();
            }

            private final void a() {
                K k5;
                while (true) {
                    int i5 = this.f19966b + 1;
                    this.f19966b = i5;
                    if (i5 < ((a) a.this).f19959a) {
                        k kVar = (k) ((a) a.this).f19962d.get(this.f19966b);
                        if (kVar != null && (k5 = (K) kVar.get()) != null) {
                            this.f19967c = k5;
                            Object obj = (V) ((a) a.this).f19963e.get(this.f19966b);
                            if (obj instanceof l) {
                                obj = (V) ((l) obj).f20010a;
                            }
                            if (obj != null) {
                                this.f19968d = (V) obj;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.util.Iterator
            @p4.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.c.e();
                throw new y();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19966b < ((a) a.this).f19959a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f19966b < ((a) a.this).f19959a) {
                    p<K, V, E> pVar = this.f19965a;
                    K k5 = this.f19967c;
                    if (k5 == false) {
                        l0.S(DatabaseFileArchive.COLUMN_KEY);
                        k5 = (K) r2.f19517a;
                    }
                    V v4 = this.f19968d;
                    if (v4 == false) {
                        l0.S(t0.b.f22420d);
                        v4 = (V) r2.f19517a;
                    }
                    E e5 = (E) pVar.invoke(k5, v4);
                    a();
                    return e5;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i5) {
            this.f19959a = i5;
            this.f19960b = Integer.numberOfLeadingZeros(i5) + 1;
            this.f19961c = (i5 * 2) / 3;
            this.f19962d = new AtomicReferenceArray(i5);
            this.f19963e = new AtomicReferenceArray(i5);
        }

        private final int f(int i5) {
            return (i5 * (-1640531527)) >>> this.f19960b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object i(a aVar, Object obj, Object obj2, k kVar, int i5, Object obj3) {
            if ((i5 & 4) != 0) {
                kVar = null;
            }
            return aVar.h(obj, obj2, kVar);
        }

        private final void k(int i5) {
            Object obj;
            do {
                obj = this.f19963e.get(i5);
                if (obj == null || (obj instanceof l)) {
                    return;
                }
            } while (!q.a(this.f19963e, i5, obj, null));
            b.this.e();
        }

        private final void l(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, Integer> lVar, Object obj) {
            int i5;
            do {
                i5 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i5, lVar.invoke(Integer.valueOf(i5)).intValue()));
        }

        public final void d(@p4.l k<?> kVar) {
            int f5 = f(kVar.f20009a);
            while (true) {
                k<?> kVar2 = (k) this.f19962d.get(f5);
                if (kVar2 == null) {
                    return;
                }
                if (kVar2 == kVar) {
                    k(f5);
                    return;
                } else {
                    if (f5 == 0) {
                        f5 = this.f19959a;
                    }
                    f5--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.m
        public final V e(@p4.l K k5) {
            int f5 = f(k5.hashCode());
            while (true) {
                k kVar = (k) this.f19962d.get(f5);
                if (kVar == null) {
                    return null;
                }
                T t5 = kVar.get();
                if (l0.g(k5, t5)) {
                    V v4 = (V) this.f19963e.get(f5);
                    if (v4 instanceof l) {
                        return (V) ((l) v4).f20010a;
                    }
                    return v4;
                }
                if (t5 == 0) {
                    k(f5);
                }
                if (f5 == 0) {
                    f5 = this.f19959a;
                }
                f5--;
            }
        }

        @p4.l
        public final <E> Iterator<E> g(@p4.l p<? super K, ? super V, ? extends E> pVar) {
            return new C0572a(pVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = r5.f19963e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.l) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (kotlinx.coroutines.channels.q.a(r5.f19963e, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.c.f19976c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            return r6;
         */
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object h(@p4.l K r6, @p4.m V r7, @p4.m kotlinx.coroutines.debug.internal.k<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.f(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f19962d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.k r2 = (kotlinx.coroutines.debug.internal.k) r2
                if (r2 != 0) goto L47
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L31
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.debug.internal.b.a.f19958g
            L1b:
                int r1 = r3.get(r5)
                int r4 = r5.f19961c
                if (r1 < r4) goto L28
                kotlinx.coroutines.internal.t0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L28:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1b
                r1 = 1
            L31:
                if (r8 != 0) goto L3e
                kotlinx.coroutines.debug.internal.k r8 = new kotlinx.coroutines.debug.internal.k
                kotlinx.coroutines.debug.internal.b<K, V> r3 = kotlinx.coroutines.debug.internal.b.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.b.c(r3)
                r8.<init>(r6, r3)
            L3e:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f19962d
                boolean r2 = kotlinx.coroutines.channels.q.a(r3, r0, r2, r8)
                if (r2 != 0) goto L58
                goto L9
            L47:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.l0.g(r6, r2)
                if (r3 == 0) goto L70
                if (r1 == 0) goto L58
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.b.a.f19958g
                r6.decrementAndGet(r5)
            L58:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f19963e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.l
                if (r8 == 0) goto L67
                kotlinx.coroutines.internal.t0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L67:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f19963e
                boolean r8 = kotlinx.coroutines.channels.q.a(r8, r0, r6, r7)
                if (r8 == 0) goto L58
                return r6
            L70:
                if (r2 != 0) goto L75
                r5.k(r0)
            L75:
                if (r0 != 0) goto L79
                int r0 = r5.f19959a
            L79:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.b.a.h(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.k):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.l
        public final b<K, V>.a j() {
            int u4;
            Object obj;
            Object obj2;
            t0 t0Var;
            l d5;
            while (true) {
                u4 = u.u(b.this.size(), 4);
                b<K, V>.a aVar = (b<K, V>.a) new a(Integer.highestOneBit(u4) * 4);
                int i5 = this.f19959a;
                for (int i6 = 0; i6 < i5; i6++) {
                    k kVar = (k) this.f19962d.get(i6);
                    if (kVar != null) {
                        obj = kVar.get();
                    } else {
                        obj = null;
                    }
                    if (kVar != null && obj == null) {
                        k(i6);
                    }
                    while (true) {
                        obj2 = this.f19963e.get(i6);
                        if (obj2 instanceof l) {
                            obj2 = ((l) obj2).f20010a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f19963e;
                        d5 = kotlinx.coroutines.debug.internal.c.d(obj2);
                        if (q.a(atomicReferenceArray, i6, obj2, d5)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object h5 = aVar.h(obj, obj2, kVar);
                        t0Var = kotlinx.coroutines.debug.internal.c.f19976c;
                        if (h5 != t0Var) {
                        }
                    }
                }
                return aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$b;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", bi.ay, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", DatabaseFileArchive.COLUMN_KEY, "b", "getValue", t0.b.f22420d, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.debug.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0573b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: a, reason: collision with root package name */
        private final K f19970a;

        /* renamed from: b, reason: collision with root package name */
        private final V f19971b;

        public C0573b(K k5, V v4) {
            this.f19970a = k5;
            this.f19971b = v4;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f19970a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f19971b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            kotlinx.coroutines.debug.internal.c.e();
            throw new y();
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$c;", "E", "Lkotlin/collections/h;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", bi.ay, "Lv3/p;", "factory", "", "getSize", "()I", "size", "<init>", "(Lkotlinx/coroutines/debug/internal/b;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    private final class c<E> extends kotlin.collections.h<E> {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final p<K, V, E> f19972a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@p4.l p<? super K, ? super V, ? extends E> pVar) {
            this.f19972a = pVar;
        }

        @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e5) {
            kotlinx.coroutines.debug.internal.c.e();
            throw new y();
        }

        @Override // kotlin.collections.h
        public int getSize() {
            return b.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @p4.l
        public Iterator<E> iterator() {
            return ((a) b.f19956c.get(b.this)).g(this.f19972a);
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "V", "", "k", "v", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class d extends n0 implements p<K, V, Map.Entry<K, V>> {
        public static final d INSTANCE = new d();

        d() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((d) obj, obj2);
        }

        @Override // v3.p
        @p4.l
        public final Map.Entry<K, V> invoke(@p4.l K k5, @p4.l V v4) {
            return new C0573b(k5, v4);
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class e extends n0 implements p<K, V, K> {
        public static final e INSTANCE = new e();

        e() {
            super(2);
        }

        @Override // v3.p
        @p4.l
        public final K invoke(@p4.l K k5, @p4.l V v4) {
            return k5;
        }
    }

    public b() {
        this(false, 1, null);
    }

    public /* synthetic */ b(boolean z4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? false : z4);
    }

    private final void d(k<?> kVar) {
        ((a) f19956c.get(this)).d(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        f19955b.decrementAndGet(this);
    }

    private final synchronized V g(K k5, V v4) {
        V v5;
        t0 t0Var;
        a aVar = (a) f19956c.get(this);
        while (true) {
            v5 = (V) a.i(aVar, k5, v4, null, 4, null);
            t0Var = kotlinx.coroutines.debug.internal.c.f19976c;
            if (v5 == t0Var) {
                aVar = aVar.j();
                f19956c.set(this, aVar);
            }
        }
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @p4.m
    public V get(@p4.m Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) f19956c.get(this)).e(obj);
    }

    @Override // kotlin.collections.g
    @p4.l
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(d.INSTANCE);
    }

    @Override // kotlin.collections.g
    @p4.l
    public Set<K> getKeys() {
        return new c(e.INSTANCE);
    }

    @Override // kotlin.collections.g
    public int getSize() {
        return f19955b.get(this);
    }

    public final void i() {
        boolean z4;
        if (this.f19957a != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f19957a.remove();
                l0.n(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                d((k) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.g, java.util.AbstractMap, java.util.Map
    @p4.m
    public V put(@p4.l K k5, @p4.l V v4) {
        t0 t0Var;
        V v5 = (V) a.i((a) f19956c.get(this), k5, v4, null, 4, null);
        t0Var = kotlinx.coroutines.debug.internal.c.f19976c;
        if (v5 == t0Var) {
            v5 = g(k5, v4);
        }
        if (v5 == null) {
            f19955b.incrementAndGet(this);
        }
        return v5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @p4.m
    public V remove(@p4.m Object obj) {
        t0 t0Var;
        if (obj == 0) {
            return null;
        }
        V v4 = (V) a.i((a) f19956c.get(this), obj, null, null, 4, null);
        t0Var = kotlinx.coroutines.debug.internal.c.f19976c;
        if (v4 == t0Var) {
            v4 = g(obj, null);
        }
        if (v4 != null) {
            f19955b.decrementAndGet(this);
        }
        return v4;
    }

    public b(boolean z4) {
        this.core = new a(16);
        this.f19957a = z4 ? new ReferenceQueue<>() : null;
    }
}
