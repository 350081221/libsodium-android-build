package com.google.gson.internal;

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

/* loaded from: classes2.dex */
public final class i<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private i<K, V>.d entrySet;
    final g<K, V> header;
    private i<K, V>.e keySet;
    int modCount;
    int size;
    g<K, V>[] table;
    int threshold;

    /* loaded from: classes2.dex */
    static class a implements Comparator<Comparable> {
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
        private g<K, V> f7673a;

        /* renamed from: b, reason: collision with root package name */
        private int f7674b;

        /* renamed from: c, reason: collision with root package name */
        private int f7675c;

        /* renamed from: d, reason: collision with root package name */
        private int f7676d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f7688c = null;
            gVar.f7686a = null;
            gVar.f7687b = null;
            gVar.f7694i = 1;
            int i5 = this.f7674b;
            if (i5 > 0) {
                int i6 = this.f7676d;
                if ((i6 & 1) == 0) {
                    this.f7676d = i6 + 1;
                    this.f7674b = i5 - 1;
                    this.f7675c++;
                }
            }
            gVar.f7686a = this.f7673a;
            this.f7673a = gVar;
            int i7 = this.f7676d + 1;
            this.f7676d = i7;
            int i8 = this.f7674b;
            if (i8 > 0 && (i7 & 1) == 0) {
                this.f7676d = i7 + 1;
                this.f7674b = i8 - 1;
                this.f7675c++;
            }
            int i9 = 4;
            while (true) {
                int i10 = i9 - 1;
                if ((this.f7676d & i10) == i10) {
                    int i11 = this.f7675c;
                    if (i11 == 0) {
                        g<K, V> gVar2 = this.f7673a;
                        g<K, V> gVar3 = gVar2.f7686a;
                        g<K, V> gVar4 = gVar3.f7686a;
                        gVar3.f7686a = gVar4.f7686a;
                        this.f7673a = gVar3;
                        gVar3.f7687b = gVar4;
                        gVar3.f7688c = gVar2;
                        gVar3.f7694i = gVar2.f7694i + 1;
                        gVar4.f7686a = gVar3;
                        gVar2.f7686a = gVar3;
                    } else if (i11 == 1) {
                        g<K, V> gVar5 = this.f7673a;
                        g<K, V> gVar6 = gVar5.f7686a;
                        this.f7673a = gVar6;
                        gVar6.f7688c = gVar5;
                        gVar6.f7694i = gVar5.f7694i + 1;
                        gVar5.f7686a = gVar6;
                        this.f7675c = 0;
                    } else if (i11 == 2) {
                        this.f7675c = 0;
                    }
                    i9 *= 2;
                } else {
                    return;
                }
            }
        }

        void b(int i5) {
            this.f7674b = ((Integer.highestOneBit(i5) * 2) - 1) - i5;
            this.f7676d = 0;
            this.f7675c = 0;
            this.f7673a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f7673a;
            if (gVar.f7686a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f7677a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f7677a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f7686a;
            gVar.f7686a = null;
            g<K, V> gVar3 = gVar.f7688c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f7686a = gVar4;
                    gVar3 = gVar2.f7687b;
                } else {
                    this.f7677a = gVar4;
                    return gVar;
                }
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f7686a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f7687b;
            }
            this.f7677a = gVar2;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends i<K, V>.f<Map.Entry<K, V>> {
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
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && i.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = i.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            i.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size;
        }
    }

    /* loaded from: classes2.dex */
    final class e extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends i<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f7691f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return i.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f7682a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f7683b = null;

        /* renamed from: c, reason: collision with root package name */
        int f7684c;

        f() {
            this.f7682a = i.this.header.f7689d;
            this.f7684c = i.this.modCount;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f7682a;
            i iVar = i.this;
            if (gVar != iVar.header) {
                if (iVar.modCount == this.f7684c) {
                    this.f7682a = gVar.f7689d;
                    this.f7683b = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7682a != i.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f7683b;
            if (gVar != null) {
                i.this.removeInternal(gVar, true);
                this.f7683b = null;
                this.f7684c = i.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public i() {
        this(NATURAL_ORDER);
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
            g<K, V> gVar2 = gVar.f7687b;
            g<K, V> gVar3 = gVar.f7688c;
            int i9 = 0;
            if (gVar2 != null) {
                i5 = gVar2.f7694i;
            } else {
                i5 = 0;
            }
            if (gVar3 != null) {
                i6 = gVar3.f7694i;
            } else {
                i6 = 0;
            }
            int i10 = i5 - i6;
            if (i10 == -2) {
                g<K, V> gVar4 = gVar3.f7687b;
                g<K, V> gVar5 = gVar3.f7688c;
                if (gVar5 != null) {
                    i8 = gVar5.f7694i;
                } else {
                    i8 = 0;
                }
                if (gVar4 != null) {
                    i9 = gVar4.f7694i;
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
                g<K, V> gVar6 = gVar2.f7687b;
                g<K, V> gVar7 = gVar2.f7688c;
                if (gVar7 != null) {
                    i7 = gVar7.f7694i;
                } else {
                    i7 = 0;
                }
                if (gVar6 != null) {
                    i9 = gVar6.f7694i;
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
                gVar.f7694i = i5 + 1;
                if (z4) {
                    return;
                }
            } else {
                gVar.f7694i = Math.max(i5, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            gVar = gVar.f7686a;
        }
    }

    private void replaceInParent(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f7686a;
        gVar.f7686a = null;
        if (gVar2 != null) {
            gVar2.f7686a = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.f7687b == gVar) {
                gVar3.f7687b = gVar2;
                return;
            } else {
                gVar3.f7688c = gVar2;
                return;
            }
        }
        int i5 = gVar.f7692g;
        this.table[i5 & (r0.length - 1)] = gVar2;
    }

    private void rotateLeft(g<K, V> gVar) {
        int i5;
        int i6;
        g<K, V> gVar2 = gVar.f7687b;
        g<K, V> gVar3 = gVar.f7688c;
        g<K, V> gVar4 = gVar3.f7687b;
        g<K, V> gVar5 = gVar3.f7688c;
        gVar.f7688c = gVar4;
        if (gVar4 != null) {
            gVar4.f7686a = gVar;
        }
        replaceInParent(gVar, gVar3);
        gVar3.f7687b = gVar;
        gVar.f7686a = gVar3;
        int i7 = 0;
        if (gVar2 != null) {
            i5 = gVar2.f7694i;
        } else {
            i5 = 0;
        }
        if (gVar4 != null) {
            i6 = gVar4.f7694i;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        gVar.f7694i = max;
        if (gVar5 != null) {
            i7 = gVar5.f7694i;
        }
        gVar3.f7694i = Math.max(max, i7) + 1;
    }

    private void rotateRight(g<K, V> gVar) {
        int i5;
        int i6;
        g<K, V> gVar2 = gVar.f7687b;
        g<K, V> gVar3 = gVar.f7688c;
        g<K, V> gVar4 = gVar2.f7687b;
        g<K, V> gVar5 = gVar2.f7688c;
        gVar.f7687b = gVar5;
        if (gVar5 != null) {
            gVar5.f7686a = gVar;
        }
        replaceInParent(gVar, gVar2);
        gVar2.f7688c = gVar;
        gVar.f7686a = gVar2;
        int i7 = 0;
        if (gVar3 != null) {
            i5 = gVar3.f7694i;
        } else {
            i5 = 0;
        }
        if (gVar5 != null) {
            i6 = gVar5.f7694i;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        gVar.f7694i = max;
        if (gVar4 != null) {
            i7 = gVar4.f7694i;
        }
        gVar2.f7694i = Math.max(max, i7) + 1;
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
        g<K, V> gVar2 = gVar.f7689d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f7689d;
            gVar2.f7690e = null;
            gVar2.f7689d = null;
            gVar2 = gVar3;
        }
        gVar.f7690e = gVar;
        gVar.f7689d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        i<K, V>.d dVar = this.entrySet;
        if (dVar == null) {
            i<K, V>.d dVar2 = new d();
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
                    i5 = comparable.compareTo(gVar3.f7691f);
                } else {
                    i5 = comparator.compare(k5, gVar3.f7691f);
                }
                if (i5 == 0) {
                    return gVar3;
                }
                if (i5 < 0) {
                    gVar2 = gVar3.f7687b;
                } else {
                    gVar2 = gVar3.f7688c;
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
            gVar = new g<>(gVar4, k5, secondaryHash, gVar5, gVar5.f7690e);
            gVarArr[length] = gVar;
        } else {
            gVar = new g<>(gVar4, k5, secondaryHash, gVar5, gVar5.f7690e);
            if (i6 < 0) {
                gVar4.f7687b = gVar;
            } else {
                gVar4.f7688c = gVar;
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
        if (findByObject != null && equal(findByObject.f7693h, entry.getValue())) {
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
            return findByObject.f7693h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i<K, V>.e eVar = this.keySet;
        if (eVar == null) {
            i<K, V>.e eVar2 = new e();
            this.keySet = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k5, V v4) {
        if (k5 != null) {
            g<K, V> find = find(k5, true);
            V v5 = find.f7693h;
            find.f7693h = v4;
            return v5;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f7693h;
        }
        return null;
    }

    void removeInternal(g<K, V> gVar, boolean z4) {
        g<K, V> a5;
        int i5;
        if (z4) {
            g<K, V> gVar2 = gVar.f7690e;
            gVar2.f7689d = gVar.f7689d;
            gVar.f7689d.f7690e = gVar2;
            gVar.f7690e = null;
            gVar.f7689d = null;
        }
        g<K, V> gVar3 = gVar.f7687b;
        g<K, V> gVar4 = gVar.f7688c;
        g<K, V> gVar5 = gVar.f7686a;
        int i6 = 0;
        if (gVar3 != null && gVar4 != null) {
            if (gVar3.f7694i > gVar4.f7694i) {
                a5 = gVar3.b();
            } else {
                a5 = gVar4.a();
            }
            removeInternal(a5, false);
            g<K, V> gVar6 = gVar.f7687b;
            if (gVar6 != null) {
                i5 = gVar6.f7694i;
                a5.f7687b = gVar6;
                gVar6.f7686a = a5;
                gVar.f7687b = null;
            } else {
                i5 = 0;
            }
            g<K, V> gVar7 = gVar.f7688c;
            if (gVar7 != null) {
                i6 = gVar7.f7694i;
                a5.f7688c = gVar7;
                gVar7.f7686a = a5;
                gVar.f7688c = null;
            }
            a5.f7694i = Math.max(i5, i6) + 1;
            replaceInParent(gVar, a5);
            return;
        }
        if (gVar3 != null) {
            replaceInParent(gVar, gVar3);
            gVar.f7687b = null;
        } else if (gVar4 != null) {
            replaceInParent(gVar, gVar4);
            gVar.f7688c = null;
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

    public i(Comparator<? super K> comparator) {
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
                    if ((a5.f7692g & length) == 0) {
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
                    if ((a6.f7692g & length) == 0) {
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
        g<K, V> f7686a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f7687b;

        /* renamed from: c, reason: collision with root package name */
        g<K, V> f7688c;

        /* renamed from: d, reason: collision with root package name */
        g<K, V> f7689d;

        /* renamed from: e, reason: collision with root package name */
        g<K, V> f7690e;

        /* renamed from: f, reason: collision with root package name */
        final K f7691f;

        /* renamed from: g, reason: collision with root package name */
        final int f7692g;

        /* renamed from: h, reason: collision with root package name */
        V f7693h;

        /* renamed from: i, reason: collision with root package name */
        int f7694i;

        g() {
            this.f7691f = null;
            this.f7692g = -1;
            this.f7690e = this;
            this.f7689d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f7687b; gVar2 != null; gVar2 = gVar2.f7687b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f7688c; gVar2 != null; gVar2 = gVar2.f7688c) {
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
            K k5 = this.f7691f;
            if (k5 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k5.equals(entry.getKey())) {
                return false;
            }
            V v4 = this.f7693h;
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
            return this.f7691f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7693h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k5 = this.f7691f;
            int i5 = 0;
            if (k5 == null) {
                hashCode = 0;
            } else {
                hashCode = k5.hashCode();
            }
            V v4 = this.f7693h;
            if (v4 != null) {
                i5 = v4.hashCode();
            }
            return hashCode ^ i5;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = this.f7693h;
            this.f7693h = v4;
            return v5;
        }

        public String toString() {
            return this.f7691f + ContainerUtils.KEY_VALUE_DELIMITER + this.f7693h;
        }

        g(g<K, V> gVar, K k5, int i5, g<K, V> gVar2, g<K, V> gVar3) {
            this.f7686a = gVar;
            this.f7691f = k5;
            this.f7692g = i5;
            this.f7694i = 1;
            this.f7689d = gVar2;
            this.f7690e = gVar3;
            gVar3.f7689d = this;
            gVar2.f7690e = this;
        }
    }
}
