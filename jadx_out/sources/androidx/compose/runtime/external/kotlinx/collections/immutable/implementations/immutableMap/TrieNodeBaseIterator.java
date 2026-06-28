package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\"\u0010#J-\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0015J\u0006\u0010\u0017\u001a\u00020\u000bJ\t\u0010\u0018\u001a\u00020\u000fH\u0096\u0002R4\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\"\u0010\n\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "", "", "buffer", "", "dataSize", "index", "Lkotlin/r2;", "reset", "([Ljava/lang/Object;II)V", "([Ljava/lang/Object;I)V", "", "hasNextKey", "currentKey", "()Ljava/lang/Object;", "moveToNextKey", "hasNextNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "currentNode", "moveToNextNode", "hasNext", "<set-?>", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "I", "getIndex", "()I", "setIndex", "(I)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, a {
    public static final int $stable = 8;

    @l
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m3350assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    @l
    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m3350assert(hasNextNode());
        Object obj = this.buffer[this.index];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final Object[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        boolean z4;
        if (this.index >= this.dataSize) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m3350assert(z4);
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m3350assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m3350assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(@l Object[] objArr, int i5, int i6) {
        this.buffer = objArr;
        this.dataSize = i5;
        this.index = i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIndex(int i5) {
        this.index = i5;
    }

    public final void reset(@l Object[] objArr, int i5) {
        reset(objArr, i5, 0);
    }
}
