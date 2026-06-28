package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class j<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private j<K, V>.b entrySet;
    final e<K, V> header;
    private j<K, V>.c keySet;
    int modCount;
    e<K, V> root;
    int size;

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

    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends j<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && j.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = j.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            j.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size;
        }
    }

    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends j<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f7708f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return j.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f7699a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f7700b = null;

        /* renamed from: c, reason: collision with root package name */
        int f7701c;

        d() {
            this.f7699a = j.this.header.f7706d;
            this.f7701c = j.this.modCount;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f7699a;
            j jVar = j.this;
            if (eVar != jVar.header) {
                if (jVar.modCount == this.f7701c) {
                    this.f7699a = eVar.f7706d;
                    this.f7700b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7699a != j.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f7700b;
            if (eVar != null) {
                j.this.removeInternal(eVar, true);
                this.f7700b = null;
                this.f7701c = j.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public j() {
        this(NATURAL_ORDER);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(e<K, V> eVar, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i8;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f7704b;
            e<K, V> eVar3 = eVar.f7705c;
            int i9 = 0;
            if (eVar2 != null) {
                i5 = eVar2.f7710h;
            } else {
                i5 = 0;
            }
            if (eVar3 != null) {
                i6 = eVar3.f7710h;
            } else {
                i6 = 0;
            }
            int i10 = i5 - i6;
            if (i10 == -2) {
                e<K, V> eVar4 = eVar3.f7704b;
                e<K, V> eVar5 = eVar3.f7705c;
                if (eVar5 != null) {
                    i8 = eVar5.f7710h;
                } else {
                    i8 = 0;
                }
                if (eVar4 != null) {
                    i9 = eVar4.f7710h;
                }
                int i11 = i9 - i8;
                if (i11 != -1 && (i11 != 0 || z4)) {
                    rotateRight(eVar3);
                    rotateLeft(eVar);
                } else {
                    rotateLeft(eVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 2) {
                e<K, V> eVar6 = eVar2.f7704b;
                e<K, V> eVar7 = eVar2.f7705c;
                if (eVar7 != null) {
                    i7 = eVar7.f7710h;
                } else {
                    i7 = 0;
                }
                if (eVar6 != null) {
                    i9 = eVar6.f7710h;
                }
                int i12 = i9 - i7;
                if (i12 != 1 && (i12 != 0 || z4)) {
                    rotateLeft(eVar2);
                    rotateRight(eVar);
                } else {
                    rotateRight(eVar);
                }
                if (z4) {
                    return;
                }
            } else if (i10 == 0) {
                eVar.f7710h = i5 + 1;
                if (z4) {
                    return;
                }
            } else {
                eVar.f7710h = Math.max(i5, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            eVar = eVar.f7703a;
        }
    }

    private void replaceInParent(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f7703a;
        eVar.f7703a = null;
        if (eVar2 != null) {
            eVar2.f7703a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f7704b == eVar) {
                eVar3.f7704b = eVar2;
                return;
            } else {
                eVar3.f7705c = eVar2;
                return;
            }
        }
        this.root = eVar2;
    }

    private void rotateLeft(e<K, V> eVar) {
        int i5;
        int i6;
        e<K, V> eVar2 = eVar.f7704b;
        e<K, V> eVar3 = eVar.f7705c;
        e<K, V> eVar4 = eVar3.f7704b;
        e<K, V> eVar5 = eVar3.f7705c;
        eVar.f7705c = eVar4;
        if (eVar4 != null) {
            eVar4.f7703a = eVar;
        }
        replaceInParent(eVar, eVar3);
        eVar3.f7704b = eVar;
        eVar.f7703a = eVar3;
        int i7 = 0;
        if (eVar2 != null) {
            i5 = eVar2.f7710h;
        } else {
            i5 = 0;
        }
        if (eVar4 != null) {
            i6 = eVar4.f7710h;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        eVar.f7710h = max;
        if (eVar5 != null) {
            i7 = eVar5.f7710h;
        }
        eVar3.f7710h = Math.max(max, i7) + 1;
    }

    private void rotateRight(e<K, V> eVar) {
        int i5;
        int i6;
        e<K, V> eVar2 = eVar.f7704b;
        e<K, V> eVar3 = eVar.f7705c;
        e<K, V> eVar4 = eVar2.f7704b;
        e<K, V> eVar5 = eVar2.f7705c;
        eVar.f7704b = eVar5;
        if (eVar5 != null) {
            eVar5.f7703a = eVar;
        }
        replaceInParent(eVar, eVar2);
        eVar2.f7705c = eVar;
        eVar.f7703a = eVar2;
        int i7 = 0;
        if (eVar3 != null) {
            i5 = eVar3.f7710h;
        } else {
            i5 = 0;
        }
        if (eVar5 != null) {
            i6 = eVar5.f7710h;
        } else {
            i6 = 0;
        }
        int max = Math.max(i5, i6) + 1;
        eVar.f7710h = max;
        if (eVar4 != null) {
            i7 = eVar4.f7710h;
        }
        eVar2.f7710h = Math.max(max, i7) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f7707e = eVar;
        eVar.f7706d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        j<K, V>.b bVar = this.entrySet;
        if (bVar == null) {
            j<K, V>.b bVar2 = new b();
            this.entrySet = bVar2;
            return bVar2;
        }
        return bVar;
    }

    e<K, V> find(K k5, boolean z4) {
        int i5;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar3 = this.root;
        if (eVar3 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k5;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i5 = comparable.compareTo(eVar3.f7708f);
                } else {
                    i5 = comparator.compare(k5, eVar3.f7708f);
                }
                if (i5 == 0) {
                    return eVar3;
                }
                if (i5 < 0) {
                    eVar2 = eVar3.f7704b;
                } else {
                    eVar2 = eVar3.f7705c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i5 = 0;
        }
        if (!z4) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar3 == null) {
            if (comparator == NATURAL_ORDER && !(k5 instanceof Comparable)) {
                throw new ClassCastException(k5.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar3, k5, eVar4, eVar4.f7707e);
            this.root = eVar;
        } else {
            eVar = new e<>(eVar3, k5, eVar4, eVar4.f7707e);
            if (i5 < 0) {
                eVar3.f7704b = eVar;
            } else {
                eVar3.f7705c = eVar;
            }
            rebalance(eVar3, true);
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        boolean z4;
        e<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && equal(findByObject.f7709g, entry.getValue())) {
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
    e<K, V> findByObject(Object obj) {
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
        e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f7709g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        j<K, V>.c cVar = this.keySet;
        if (cVar == null) {
            j<K, V>.c cVar2 = new c();
            this.keySet = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k5, V v4) {
        if (k5 != null) {
            e<K, V> find = find(k5, true);
            V v5 = find.f7709g;
            find.f7709g = v4;
            return v5;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f7709g;
        }
        return null;
    }

    void removeInternal(e<K, V> eVar, boolean z4) {
        e<K, V> a5;
        int i5;
        if (z4) {
            e<K, V> eVar2 = eVar.f7707e;
            eVar2.f7706d = eVar.f7706d;
            eVar.f7706d.f7707e = eVar2;
        }
        e<K, V> eVar3 = eVar.f7704b;
        e<K, V> eVar4 = eVar.f7705c;
        e<K, V> eVar5 = eVar.f7703a;
        int i6 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.f7710h > eVar4.f7710h) {
                a5 = eVar3.b();
            } else {
                a5 = eVar4.a();
            }
            removeInternal(a5, false);
            e<K, V> eVar6 = eVar.f7704b;
            if (eVar6 != null) {
                i5 = eVar6.f7710h;
                a5.f7704b = eVar6;
                eVar6.f7703a = a5;
                eVar.f7704b = null;
            } else {
                i5 = 0;
            }
            e<K, V> eVar7 = eVar.f7705c;
            if (eVar7 != null) {
                i6 = eVar7.f7710h;
                a5.f7705c = eVar7;
                eVar7.f7703a = a5;
                eVar.f7705c = null;
            }
            a5.f7710h = Math.max(i5, i6) + 1;
            replaceInParent(eVar, a5);
            return;
        }
        if (eVar3 != null) {
            replaceInParent(eVar, eVar3);
            eVar.f7704b = null;
        } else if (eVar4 != null) {
            replaceInParent(eVar, eVar4);
            eVar.f7705c = null;
        } else {
            replaceInParent(eVar, null);
        }
        rebalance(eVar5, false);
        this.size--;
        this.modCount++;
    }

    e<K, V> removeInternalByKey(Object obj) {
        e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public j(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new e<>();
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f7703a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f7704b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f7705c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f7706d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f7707e;

        /* renamed from: f, reason: collision with root package name */
        final K f7708f;

        /* renamed from: g, reason: collision with root package name */
        V f7709g;

        /* renamed from: h, reason: collision with root package name */
        int f7710h;

        e() {
            this.f7708f = null;
            this.f7707e = this;
            this.f7706d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f7704b; eVar2 != null; eVar2 = eVar2.f7704b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f7705c; eVar2 != null; eVar2 = eVar2.f7705c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k5 = this.f7708f;
            if (k5 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k5.equals(entry.getKey())) {
                return false;
            }
            V v4 = this.f7709g;
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
            return this.f7708f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7709g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k5 = this.f7708f;
            int i5 = 0;
            if (k5 == null) {
                hashCode = 0;
            } else {
                hashCode = k5.hashCode();
            }
            V v4 = this.f7709g;
            if (v4 != null) {
                i5 = v4.hashCode();
            }
            return hashCode ^ i5;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V v5 = this.f7709g;
            this.f7709g = v4;
            return v5;
        }

        public String toString() {
            return this.f7708f + ContainerUtils.KEY_VALUE_DELIMITER + this.f7709g;
        }

        e(e<K, V> eVar, K k5, e<K, V> eVar2, e<K, V> eVar3) {
            this.f7703a = eVar;
            this.f7708f = k5;
            this.f7710h = 1;
            this.f7706d = eVar2;
            this.f7707e = eVar3;
            eVar3.f7706d = this;
            eVar2.f7707e = this;
        }
    }
}
