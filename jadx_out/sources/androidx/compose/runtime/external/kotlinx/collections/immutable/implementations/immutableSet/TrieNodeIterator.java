package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\nJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "", "buffer", "", "index", "Lkotlin/r2;", "reset", "([Ljava/lang/Object;I)V", "", "hasNextCell", "moveToNextCell", "hasNextElement", "currentElement", "()Ljava/lang/Object;", "nextElement", "hasNextNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "currentNode", "[Ljava/lang/Object;", "I", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;

    @l
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        trieNodeIterator.reset(objArr, i5);
    }

    public final E currentElement() {
        CommonFunctionsKt.m3350assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    @l
    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m3350assert(hasNextNode());
        Object obj = this.buffer[this.index];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m3350assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m3350assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i5 = this.index;
        this.index = i5 + 1;
        return (E) objArr[i5];
    }

    public final void reset(@l Object[] objArr, int i5) {
        this.buffer = objArr;
        this.index = i5;
    }
}
