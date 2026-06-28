package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "K", "", "V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "initialCapacity", "", "loadFactor", "", "(IF)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "isEmpty", "", "()Z", "map", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "get", DatabaseFileArchive.COLUMN_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "put", b.f22420d, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LruHashMap<K, V> {

    @l
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int i5, float f5) {
        this.map = new LinkedHashMap<>(i5, f5, true);
    }

    @m
    public final V get(@l K key) {
        l0.p(key, "key");
        return this.map.get(key);
    }

    @l
    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        l0.o(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @m
    public final V put(@l K key, @l V value) {
        l0.p(key, "key");
        l0.p(value, "value");
        return this.map.put(key, value);
    }

    @m
    public final V remove(@l K key) {
        l0.p(key, "key");
        return this.map.remove(key);
    }

    public /* synthetic */ LruHashMap(int i5, float f5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 16 : i5, (i6 & 2) != 0 ? 0.75f : f5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(@l LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        l0.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
