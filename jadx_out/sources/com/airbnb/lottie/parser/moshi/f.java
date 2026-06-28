package com.airbnb.lottie.parser.moshi;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private f<K, V>.d entrySet;
    final g<K, V> header;
    private f<K, V>.e keySet;
    int modCount;
    int size;
    g<K, V>[] table;
    int threshold;

    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f1672a;

        /* renamed from: b, reason: collision with root package name */
        private int f1673b;

        /* renamed from: c, reason: collision with root package name */
        private int f1674c;

        /* renamed from: d, reason: collision with root package name */
        private int f1675d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f1687c = null;
            gVar.f1685a = null;
            gVar.f1686b = null;
            gVar.f1693i = 1;
            int i5 = this.f1673b;
            if (i5 > 0) {
                int i6 = this.f1675d;
                if ((i6 & 1) == 0) {
                    this.f1675d = i6 + 1;
                    this.f1673b = i5 - 1;
                    this.f1674c++;
                }
            }
            gVar.f1685a = this.f1672a;
            this.f1672a = gVar;
            int i7 = this.f1675d + 1;
            this.f1675d = i7;
            int i8 = this.f1673b;
            if (i8 > 0 && (i7 & 1) == 0) {
                this.f1675d = i7 + 1;
                this.f1673b = i8 - 1;
                this.f1674c++;
            }
            int i9 = 4;
            while (true) {
                int i10 = i9 - 1;
                if ((this.f1675d & i10) == i10) {
                    int i11 = this.f1674c;
                    if (i11 == 0) {
                        g<K, V> gVar2 = this.f1672a;
                        g<K, V> gVar3 = gVar2.f1685a;
                        g<K, V> gVar4 = gVar3.f1685a;
                        gVar3.f1685a = gVar4.f1685a;
                        this.f1672a = gVar3;
                        gVar3.f1686b = gVar4;
                        gVar3.f1687c = gVar2;
                        gVar3.f1693i = gVar2.f1693i + 1;
                        gVar4.f1685a = gVar3;
                        gVar2.f1685a = gVar3;
                    } else if (i11 == 1) {
                        g<K, V> gVar5 = this.f1672a;
                        g<K, V> gVar6 = gVar5.f1685a;
                        this.f1672a = gVar6;
                        gVar6.f1687c = gVar5;
                        gVar6.f1693i = gVar5.f1693i + 1;
                        gVar5.f1685a = gVar6;
                        this.f1674c = 0;
                    } else if (i11 == 2) {
                        this.f1674c = 0;
                    }
                    i9 *= 2;
                } else {
                    return;
                }
            }
        }

        void b(int i5) {
            this.f1673b = ((Integer.highestOneBit(i5) * 2) - 1) - i5;
            this.f1675d = 0;
            this.f1674c = 0;
            this.f1672a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f1672a;
            if (gVar.f1685a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f1676a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f1676a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f1685a;
            gVar.f1685a = null;
            g<K, V> gVar3 = gVar.f1687c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f1685a = gVar4;
                    gVar3 = gVar2.f1686b;
                } else {
                    this.f1676a = gVar4;
                    return gVar;
                }
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f1685a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f1686b;
            }
            this.f1676a = gVar2;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends f<K, V>.AbstractC0093f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = f.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            f.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.size;
        }
    }

    /* loaded from: classes2.dex */
    final class e extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends f<K, V>.AbstractC0093f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f1690f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return f.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.parser.moshi.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public abstract class AbstractC0093f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f1681a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f1682b = null;

        /* renamed from: c, reason: collision with root package name */
        int f1683c;

        AbstractC0093f() {
            this.f1681a = f.this.header.f1688d;
            this.f1683c = f.this.modCount;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f1681a;
            f fVar = f.this;
            if (gVar != fVar.header) {
                if (fVar.modCount == this.f1683c) {
                    this.f1681a = gVar.f1688d;
                    this.f1682b = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1681a != f.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f1682b;
            if (gVar != null) {
                f.this.removeInternal(gVar, true);
                this.f1682b = null;
                this.f1683c = f.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    f() {
        this(null);
    }

    private void doubleCapacity() {
        g<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(g<K, V> gVar, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i8;
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f1686b;
            g<K, V> gVar3 = gVar.f1687c;
            int i9 = 0;
            if (gVar2 != null) {
                i5 = gVar2.f1693i;
            } else {
                i5 = 0;
            }
            if (gVar3 != null) {
                i6 = gVar3.f1693i;
            } else {
                i6 = 0;
            }
            int i10 = i5 - i6;
            if (i10 == -2) {
                g<K, V> gVar4 = gVar3.f1686b;
                g<K, V> gVar5 = gVar3.f1687c;
                if (gVar5 != null) {
                    i8 = gVar5.f1693i;
                } else {
                    i8 = 0;
                }
                if (gVar4 != null) {
                    i9 = gVar4.f1693i;
                }
                int i11 = i9 - i8;
                if (i11 != -1 && (i11 != 0 || z4)) {
                    rotateRight(gVar3);
                    rotateLeft(gVar);
                } else {
                    rotateLeft(gVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 2) {
                g<K, V> gVar6 = gVar2.f1686b;
                g<K, V> gVar7 = gVar2.f1687c;
                if (gVar7 != null) {
                    i7 = gVar7.f1693i;
                } else {
                    i7 = 0;
                }
                if (gVar6 != null) {
                    i9 = gVar6.f1693i;
                }
                int i12 = i9 - i7;
                if (i12 != 1 && (i12 != 0 || z4)) {
                    rotateLeft(gVar2);
                    rotateRight(gVar);
                } else {
                    rotateRight(gVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 0) {
                gVar.f1693i = i5 + 1;
                if (z4) {
                    return;
                }
            } else {
                gVar.f1693i = Math.max(i5, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            gVar = gVar.f1685a;
        }
    }

    private void replaceInParent(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f1685a;
        gVar.f1685a = null;
        if (gVar2 != null) {
            gVar2.f1685a = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.f1686b == gVar) {
                gVar3.f1686b = gVar2;
                return;
            } else {
                gVar3.f1687c = gVar2;
                return;
            }
        }
        int i5 = gVar.f1691g;
        this.table[i5 & (r0.length - 1)] = gVar2;
    }

    private void rotateLeft(g<K, V> gVar) {
        int i5;
        int i6;
        g<K, V> gVar2 = gVar.f1686b;
        g<K, V> gVar3 = gVar.f1687c;
        g<K, V> gVar4 = gVar3.f1686b;
        g<K, V> gVar5 = gVar3.f1687c;
        gVar.f1687c = gVar4;
        if (gVar4 != null) {
            gVar4.f1685a = gVar;
        }
        replaceInParent(gVar, gVar3);
        gVar3.f1686b = gVar;
        gVar.f1685a = gVar3;
        int i7 = 0;
        if (gVar2 != null) {
            i5 = gVar2.f1693i;
        } else {
            i5 = 0;
        }
        if (gVar4 != null) {
            i6 = gVar4.f1693i;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        gVar.f1693i = max;
        if (gVar5 != null) {
            i7 = gVar5.f1693i;
        }
        gVar3.f1693i = Math.max(max, i7) + 1;
    }

    private void rotateRight(g<K, V> gVar) {
        int i5;
        int i6;
        g<K, V> gVar2 = gVar.f1686b;
        g<K, V> gVar3 = gVar.f1687c;
        g<K, V> gVar4 = gVar2.f1686b;
        g<K, V> gVar5 = gVar2.f1687c;
        gVar.f1686b = gVar5;
        if (gVar5 != null) {
            gVar5.f1685a = gVar;
        }
        replaceInParent(gVar, gVar2);
        gVar2.f1687c = gVar;
        gVar.f1685a = gVar2;
        int i7 = 0;
        if (gVar3 != null) {
            i5 = gVar3.f1693i;
        } else {
            i5 = 0;
        }
        if (gVar5 != null) {
            i6 = gVar5.f1693i;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        gVar.f1693i = max;
        if (gVar4 != null) {
            i7 = gVar4.f1693i;
        }
        gVar2.f1693i = Math.max(max, i7) + 1;
    }

    private static int secondaryHash(int i5) {
        int i6 = i5 ^ ((i5 >>> 20) ^ (i5 >>> 12));
        return (i6 >>> 4) ^ ((i6 >>> 7) ^ i6);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        g<K, V> gVar = this.header;
        g<K, V> gVar2 = gVar.f1688d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f1688d;
            gVar2.f1689e = null;
            gVar2.f1688d = null;
            gVar2 = gVar3;
        }
        gVar.f1689e = gVar;
        gVar.f1688d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.d dVar = this.entrySet;
        if (dVar == null) {
            f<K, V>.d dVar2 = new d();
            this.entrySet = dVar2;
            return dVar2;
        }
        return dVar;
    }

    g<K, V> find(K k5, boolean z4) {
        int i5;
        g<K, V> gVar;
        Comparable comparable;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.comparator;
        g<K, V>[] gVarArr = this.table;
        int secondaryHash = secondaryHash(k5.hashCode());
        int length = (gVarArr.length - 1) & secondaryHash;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k5;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i5 = comparable.compareTo(gVar3.f1690f);
                } else {
                    i5 = comparator.compare(k5, gVar3.f1690f);
                }
                if (i5 == 0) {
                    return gVar3;
                }
                if (i5 < 0) {
                    gVar2 = gVar3.f1686b;
                } else {
                    gVar2 = gVar3.f1687c;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i5 = 0;
        }
        g<K, V> gVar4 = gVar3;
        int i6 = i5;
        if (!z4) {
            return null;
        }
        g<K, V> gVar5 = this.header;
        if (gVar4 == null) {
            if (comparator == NATURAL_ORDER && !(k5 instanceof Comparable)) {
                throw new ClassCastException(k5.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar4, k5, secondaryHash, gVar5, gVar5.f1689e);
            gVarArr[length] = gVar;
        } else {
            gVar = new g<>(gVar4, k5, secondaryHash, gVar5, gVar5.f1689e);
            if (i6 < 0) {
                gVar4.f1686b = gVar;
            } else {
                gVar4.f1687c = gVar;
            }
            rebalance(gVar4, true);
        }
        int i7 = this.size;
        this.size = i7 + 1;
        if (i7 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return gVar;
    }

    g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z4;
        g<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.f1692h, entry.getValue())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f1692h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        f<K, V>.e eVar = this.keySet;
        if (eVar == null) {
            f<K, V>.e eVar2 = new e();
            this.keySet = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k5, V v4) {
        if (k5 != null) {
            g<K, V> find = find(k5, true);
            V v5 = find.f1692h;
            find.f1692h = v4;
            return v5;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f1692h;
        }
        return null;
    }

    void removeInternal(g<K, V> gVar, boolean z4) {
        g<K, V> a5;
        int i5;
        if (z4) {
            g<K, V> gVar2 = gVar.f1689e;
            gVar2.f1688d = gVar.f1688d;
            gVar.f1688d.f1689e = gVar2;
            gVar.f1689e = null;
            gVar.f1688d = null;
        }
        g<K, V> gVar3 = gVar.f1686b;
        g<K, V> gVar4 = gVar.f1687c;
        g<K, V> gVar5 = gVar.f1685a;
        int i6 = 0;
        if (gVar3 != null && gVar4 != null) {
            if (gVar3.f1693i > gVar4.f1693i) {
                a5 = gVar3.b();
            } else {
                a5 = gVar4.a();
            }
            removeInternal(a5, false);
            g<K, V> gVar6 = gVar.f1686b;
            if (gVar6 != null) {
                i5 = gVar6.f1693i;
                a5.f1686b = gVar6;
                gVar6.f1685a = a5;
                gVar.f1686b = null;
            } else {
                i5 = 0;
            }
            g<K, V> gVar7 = gVar.f1687c;
            if (gVar7 != null) {
                i6 = gVar7.f1693i;
                a5.f1687c = gVar7;
                gVar7.f1685a = a5;
                gVar.f1687c = null;
            }
            a5.f1693i = Math.max(i5, i6) + 1;
            replaceInParent(gVar, a5);
            return;
        }
        if (gVar3 != null) {
            replaceInParent(gVar, gVar3);
            gVar.f1686b = null;
        } else if (gVar4 != null) {
            replaceInParent(gVar, gVar4);
            gVar.f1687c = null;
        } else {
            replaceInParent(gVar, null);
        }
        rebalance(gVar5, false);
        this.size--;
        this.modCount++;
    }

    g<K, V> removeInternalByKey(Object obj) {
        g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    f(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static <K, V> g<K, V>[] doubleCapacity(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i5 = 0; i5 < length; i5++) {
            g<K, V> gVar = gVarArr[i5];
            if (gVar != null) {
                cVar.b(gVar);
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    g<K, V> a5 = cVar.a();
                    if (a5 == null) {
                        break;
                    }
                    if ((a5.f1691g & length) == 0) {
                        i6++;
                    } else {
                        i7++;
                    }
                }
                bVar.b(i6);
                bVar2.b(i7);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a6 = cVar.a();
                    if (a6 == null) {
                        break;
                    }
                    if ((a6.f1691g & length) == 0) {
                        bVar.a(a6);
                    } else {
                        bVar2.a(a6);
                    }
                }
                gVarArr2[i5] = i6 > 0 ? bVar.c() : null;
                gVarArr2[i5 + length] = i7 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f1685a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f1686b;

        /* renamed from: c, reason: collision with root package name */
        g<K, V> f1687c;

        /* renamed from: d, reason: collision with root package name */
        g<K, V> f1688d;

        /* renamed from: e, reason: collision with root package name */
        g<K, V> f1689e;

        /* renamed from: f, reason: collision with root package name */
        final K f1690f;

        /* renamed from: g, reason: collision with root package name */
        final int f1691g;

        /* renamed from: h, reason: collision with root package name */
        V f1692h;

        /* renamed from: i, reason: collision with root package name */
        int f1693i;

        g() {
            this.f1690f = null;
            this.f1691g = -1;
            this.f1689e = this;
            this.f1688d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f1686b; gVar2 != null; gVar2 = gVar2.f1686b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f1687c; gVar2 != null; gVar2 = gVar2.f1687c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k5 = this.f1690f;
            if (k5 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k5.equals(entry.getKey())) {
                return false;
            }
            V v4 = this.f1692h;
            if (v4 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v4.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1690f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1692h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k5 = this.f1690f;
            int i5 = 0;
            if (k5 == null) {
                hashCode = 0;
            } else {
                hashCode = k5.hashCode();
            }
            V v4 = this.f1692h;
            if (v4 != null) {
                i5 = v4.hashCode();
            }
            return hashCode ^ i5;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = this.f1692h;
            this.f1692h = v4;
            return v5;
        }

        public String toString() {
            return this.f1690f + ContainerUtils.KEY_VALUE_DELIMITER + this.f1692h;
        }

        g(g<K, V> gVar, K k5, int i5, g<K, V> gVar2, g<K, V> gVar3) {
            this.f1685a = gVar;
            this.f1690f = k5;
            this.f1691g = i5;
            this.f1693i = 1;
            this.f1688d = gVar2;
            this.f1689e = gVar3;
            gVar3.f1688d = this;
            gVar2.f1689e = this;
        }
    }
}
