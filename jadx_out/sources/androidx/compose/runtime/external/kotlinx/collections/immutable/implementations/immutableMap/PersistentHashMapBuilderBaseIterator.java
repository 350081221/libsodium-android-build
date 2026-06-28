package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import org.apache.http.cookie.ClientCookie;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import w3.d;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"0!¢\u0006\u0004\b$\u0010%J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\fH\u0016J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "", "keyHash", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", DatabaseFileArchive.COLUMN_KEY, "pathIndex", "Lkotlin/r2;", "resetPath", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Ljava/lang/Object;I)V", "checkNextWasInvoked", "checkForComodification", "next", "()Ljava/lang/Object;", "remove", "newValue", "setValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "lastIteratedKey", "Ljava/lang/Object;", "", "nextWasInvoked", "Z", "expectedModCount", "I", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", ClientCookie.PATH_ATTR, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, d {
    public static final int $stable = 8;

    @l
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;

    @m
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(@l PersistentHashMapBuilder<K, V> persistentHashMapBuilder, @l TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() == this.expectedModCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked) {
        } else {
            throw new IllegalStateException();
        }
    }

    private final void resetPath(int i5, TrieNode<?, ?> trieNode, K k5, int i6) {
        int i7 = i6 * 5;
        if (i7 > 30) {
            getPath()[i6].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!l0.g(getPath()[i6].currentKey(), k5)) {
                getPath()[i6].moveToNextKey();
            }
            setPathLastIndex(i6);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i7);
        if (trieNode.hasEntryAt$runtime_release(indexSegment)) {
            getPath()[i6].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(indexSegment));
            setPathLastIndex(i6);
        } else {
            int nodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(indexSegment);
            TrieNode<?, ?> nodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            getPath()[i6].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, nodeIndex$runtime_release);
            resetPath(i5, nodeAtIndex$runtime_release, k5, i6 + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        int i5;
        checkNextWasInvoked();
        if (hasNext()) {
            K currentKey = currentKey();
            u1.k(this.builder).remove(this.lastIteratedKey);
            if (currentKey != null) {
                i5 = currentKey.hashCode();
            } else {
                i5 = 0;
            }
            resetPath(i5, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            u1.k(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k5, V v4) {
        int i5;
        if (!this.builder.containsKey(k5)) {
            return;
        }
        if (hasNext()) {
            K currentKey = currentKey();
            this.builder.put(k5, v4);
            if (currentKey != null) {
                i5 = currentKey.hashCode();
            } else {
                i5 = 0;
            }
            resetPath(i5, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            this.builder.put(k5, v4);
        }
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
