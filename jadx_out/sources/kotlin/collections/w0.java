package kotlin.collections;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B<\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\u0018\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020+H\u0016R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MapWithDefault;", "map", "", "default", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", DatabaseFileArchive.COLUMN_KEY, "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "getMap", "()Ljava/util/Map;", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "(Ljava/lang/Object;)Z", "containsValue", t0.b.f22420d, "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", TTDownloadField.TT_HASHCODE, "isEmpty", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapWithDefaultImpl\n*L\n80#1:105,6\n*E\n"})
/* loaded from: classes3.dex */
final class w0<K, V> implements v0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Map<K, V> f19189a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<K, V> f19190b;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(@p4.l Map<K, ? extends V> map, @p4.l v3.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(map, "map");
        kotlin.jvm.internal.l0.p(lVar, "default");
        this.f19189a = map;
        this.f19190b = lVar;
    }

    @p4.l
    public Set<Map.Entry<K, V>> a() {
        return f().entrySet();
    }

    @p4.l
    public Set<K> b() {
        return f().keySet();
    }

    public int c() {
        return f().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return f().containsValue(obj);
    }

    @p4.l
    public Collection<V> d() {
        return f().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@p4.m Object obj) {
        return f().equals(obj);
    }

    @Override // kotlin.collections.v0
    @p4.l
    public Map<K, V> f() {
        return this.f19189a;
    }

    @Override // java.util.Map
    @p4.m
    public V get(Object obj) {
        return f().get(obj);
    }

    @Override // kotlin.collections.v0
    public V h(K k5) {
        Map<K, V> f5 = f();
        V v4 = f5.get(k5);
        if (v4 == null && !f5.containsKey(k5)) {
            return this.f19190b.invoke(k5);
        }
        return v4;
    }

    @Override // java.util.Map
    public int hashCode() {
        return f().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return f().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public V put(K k5, V v4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @p4.l
    public String toString() {
        return f().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
