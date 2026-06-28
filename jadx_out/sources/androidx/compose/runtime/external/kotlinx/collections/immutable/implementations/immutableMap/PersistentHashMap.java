package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000 /*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001/B#\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b-\u0010.J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0002J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\bH\u0001J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J*\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0016R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010&¨\u00060"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "createEntries", "", "getEntries", DatabaseFileArchive.COLUMN_KEY, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", b.f22420d, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "m", "putAll", "clear", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "size", "I", "getSize", "()I", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPersistentHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,85:1\n53#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentHashMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap\n*L\n69#1:86\n*E\n"})
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends d<K, V> implements PersistentMap<K, V> {

    @l
    private final TrieNode<K, V> node;
    private final int size;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\bH\u0000¢\u0006\u0002\b\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "emptyOf", "K", "V", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            l0.n(persistentHashMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }
    }

    public PersistentHashMap(@l TrieNode<K, V> trieNode, int i5) {
        this.node = trieNode;
        this.size = i5;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // kotlin.collections.d, java.util.Map
    public boolean containsKey(K k5) {
        return this.node.containsKey(k5 != null ? k5.hashCode() : 0, k5, 0);
    }

    @Override // kotlin.collections.d, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // kotlin.collections.d, java.util.Map
    @m
    public V get(K k5) {
        return this.node.get(k5 != null ? k5.hashCode() : 0, k5, 0);
    }

    @Override // kotlin.collections.d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @l
    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Override // kotlin.collections.d
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.d, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentMap<K, V> putAll(@l Map<? extends K, ? extends V> map) {
        l0.n(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = builder2();
        builder2.putAll(map);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj) {
        return remove((PersistentHashMap<K, V>) obj);
    }

    @Override // kotlin.collections.d, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    /* renamed from: builder */
    public PersistentHashMapBuilder<K, V> builder2() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // kotlin.collections.d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    @a1
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // kotlin.collections.d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // kotlin.collections.d, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @l
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentHashMap<K, V> put(K k5, V v4) {
        TrieNode.ModificationResult<K, V> put = this.node.put(k5 != null ? k5.hashCode() : 0, k5, v4, 0);
        return put == null ? this : new PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // kotlin.collections.d, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentHashMap<K, V> remove(K k5) {
        TrieNode<K, V> remove = this.node.remove(k5 != null ? k5.hashCode() : 0, k5, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    @l
    public PersistentHashMap<K, V> remove(K k5, V v4) {
        TrieNode<K, V> remove = this.node.remove(k5 != null ? k5.hashCode() : 0, k5, v4, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(remove, size() - 1);
    }
}
