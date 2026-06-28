package kotlin.collections;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.g1(version = "1.1")
@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0088\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", DatabaseFileArchive.COLUMN_KEY, "(Ljava/lang/Object;)Z", "containsValue", t0.b.f22420d, "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", TTDownloadField.TT_HASHCODE, "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1747#2,3:154\n1726#2,3:157\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class d<K, V> implements Map<K, V>, w3.a {

    @p4.l
    public static final a Companion = new a(null);

    @p4.m
    private volatile Set<? extends K> _keys;

    @p4.m
    private volatile Collection<? extends V> _values;

    @kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final boolean a(@p4.l Map.Entry<?, ?> e5, @p4.m Object obj) {
            kotlin.jvm.internal.l0.p(e5, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!kotlin.jvm.internal.l0.g(e5.getKey(), entry.getKey()) || !kotlin.jvm.internal.l0.g(e5.getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        public final int b(@p4.l Map.Entry<?, ?> e5) {
            int i5;
            kotlin.jvm.internal.l0.p(e5, "e");
            Object key = e5.getKey();
            int i6 = 0;
            if (key != null) {
                i5 = key.hashCode();
            } else {
                i5 = 0;
            }
            Object value = e5.getValue();
            if (value != null) {
                i6 = value.hashCode();
            }
            return i5 ^ i6;
        }

        @p4.l
        public final String c(@p4.l Map.Entry<?, ?> e5) {
            kotlin.jvm.internal.l0.p(e5, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(e5.getKey());
            sb.append(o0.a.f20835h);
            sb.append(e5.getValue());
            return sb.toString();
        }
    }

    @kotlin.i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends i<K> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<K, V> f19112a;

        @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/AbstractMap$keys$1$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Iterator<K>, w3.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f19113a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f19113a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19113a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f19113a.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(d<K, ? extends V> dVar) {
            this.f19112a = dVar;
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f19112a.containsKey(obj);
        }

        @Override // kotlin.collections.a
        public int getSize() {
            return this.f19112a.size();
        }

        @Override // kotlin.collections.i, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @p4.l
        public Iterator<K> iterator() {
            return new a(this.f19112a.entrySet().iterator());
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "K", "V", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.n0 implements v3.l<Map.Entry<? extends K, ? extends V>, CharSequence> {
        final /* synthetic */ d<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d<K, ? extends V> dVar) {
            super(1);
            this.this$0 = dVar;
        }

        @Override // v3.l
        @p4.l
        public final CharSequence invoke(@p4.l Map.Entry<? extends K, ? extends V> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return this.this$0.toString((Map.Entry) it);
        }
    }

    @kotlin.i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0545d extends kotlin.collections.a<V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<K, V> f19114a;

        @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/AbstractMap$values$1$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements Iterator<V>, w3.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f19115a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f19115a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19115a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f19115a.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C0545d(d<K, ? extends V> dVar) {
            this.f19114a = dVar;
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f19114a.containsValue(obj);
        }

        @Override // kotlin.collections.a
        public int getSize() {
            return this.f19114a.size();
        }

        @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @p4.l
        public Iterator<V> iterator() {
            return new a(this.f19114a.entrySet().iterator());
        }
    }

    private final Map.Entry<K, V> implFindEntry(K k5) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.l0.g(((Map.Entry) obj).getKey(), k5)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@p4.m Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v4 = get(key);
        if (!kotlin.jvm.internal.l0.g(value, v4)) {
            return false;
        }
        if (v4 == null) {
            kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!containsKey(key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return implFindEntry(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.l0.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@p4.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @p4.m
    public V get(Object obj) {
        Map.Entry<K, V> implFindEntry = implFindEntry(obj);
        if (implFindEntry != null) {
            return implFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    @p4.l
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new b(this);
        }
        Set<? extends K> set = this._keys;
        kotlin.jvm.internal.l0.m(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    @p4.l
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new C0545d(this);
        }
        Collection<? extends V> collection = this._values;
        kotlin.jvm.internal.l0.m(collection);
        return collection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k5, V v4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @p4.l
    public String toString() {
        String j32;
        j32 = e0.j3(entrySet(), ", ", "{", a1.i.f138d, 0, null, new c(this), 24, null);
        return j32;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + o0.a.f20835h + toString(entry.getValue());
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }
}
