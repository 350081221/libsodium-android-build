package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\bC\u0010DJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00105\u001a\u00020.2\u0006\u0010\r\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R&\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u0000088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "build", DatabaseFileArchive.COLUMN_KEY, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", b.f22420d, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", TypedValues.TransitionType.S_FROM, "Lkotlin/r2;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnership", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnership", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "setOperationResult$runtime_release", "(Ljava/lang/Object;)V", "", "modCount", "I", "getModCount$runtime_release", "()I", "setModCount$runtime_release", "(I)V", "size", "getSize", "setSize", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PersistentHashMapBuilder<K, V> extends g<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    @l
    private PersistentHashMap<K, V> map;
    private int modCount;

    @l
    private TrieNode<K, V> node;

    @m
    private V operationResult;

    @l
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private int size;

    public PersistentHashMapBuilder(@l PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        l0.n(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k5) {
        return this.node.containsKey(k5 != null ? k5.hashCode() : 0, k5, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @m
    public V get(K k5) {
        return this.node.get(k5 != null ? k5.hashCode() : 0, k5, 0);
    }

    @Override // kotlin.collections.g
    @l
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.g
    @l
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @l
    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @m
    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    @l
    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    @Override // kotlin.collections.g
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.g
    @l
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // kotlin.collections.g, java.util.AbstractMap, java.util.Map
    @m
    public V put(K k5, V v4) {
        int i5;
        this.operationResult = null;
        TrieNode<K, V> trieNode = this.node;
        if (k5 != null) {
            i5 = k5.hashCode();
        } else {
            i5 = 0;
        }
        this.node = trieNode.mutablePut(i5, k5, v4, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@l Map<? extends K, ? extends V> map) {
        PersistentHashMap<K, V> persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build();
            } else {
                persistentHashMap = null;
            }
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<K, V> trieNode = this.node;
            TrieNode<K, V> node$runtime_release = persistentHashMap.getNode$runtime_release();
            l0.n(node$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.node = trieNode.mutablePutAll(node$runtime_release, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @m
    public V remove(K k5) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(k5 != null ? k5.hashCode() : 0, k5, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            l0.n(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    public final void setModCount$runtime_release(int i5) {
        this.modCount = i5;
    }

    public final void setNode$runtime_release(@l TrieNode<K, V> trieNode) {
        this.node = trieNode;
    }

    public final void setOperationResult$runtime_release(@m V v4) {
        this.operationResult = v4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOwnership(@l MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public void setSize(int i5) {
        this.size = i5;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @l
    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
            l0.n(mutableRemove, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = mutableRemove;
        return size != size();
    }
}
