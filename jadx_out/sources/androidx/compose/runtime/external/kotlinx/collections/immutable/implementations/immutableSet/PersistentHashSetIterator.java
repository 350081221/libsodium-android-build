package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.w;
import kotlin.i0;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\t\u0010\t\u001a\u00020\bH\u0096\u0002J\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u000bR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\t\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "", "pathIndex", "moveToNextNodeWithData", "Lkotlin/r2;", "ensureNextElementIsReady", "", "hasNext", "next", "()Ljava/lang/Object;", "currentElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", ClientCookie.PATH_ATTR, "Ljava/util/List;", "getPath", "()Ljava/util/List;", "pathLastIndex", "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "Z", "getHasNext$annotations", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private boolean hasNext;

    @l
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(@l TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> P;
        P = w.P(new TrieNodeIterator());
        this.path = P;
        this.hasNext = true;
        TrieNodeIterator.reset$default(P.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i5 = this.pathLastIndex; -1 < i5; i5--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i5);
            if (moveToNextNodeWithData == -1 && this.path.get(i5).hasNextCell()) {
                this.path.get(i5).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i5);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i5 > 0) {
                this.path.get(i5 - 1).moveToNextCell();
            }
            this.path.get(i5).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i5) {
        if (this.path.get(i5).hasNextElement()) {
            return i5;
        }
        if (this.path.get(i5).hasNextNode()) {
            TrieNode<? extends E> currentNode = this.path.get(i5).currentNode();
            int i6 = i5 + 1;
            if (i6 == this.path.size()) {
                this.path.add(new TrieNodeIterator<>());
            }
            TrieNodeIterator.reset$default(this.path.get(i6), currentNode.getBuffer(), 0, 2, null);
            return moveToNextNodeWithData(i6);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E currentElement() {
        CommonFunctionsKt.m3350assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.hasNext) {
            E nextElement = this.path.get(this.pathLastIndex).nextElement();
            ensureNextElementIsReady();
            return nextElement;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPathLastIndex(int i5) {
        this.pathLastIndex = i5;
    }
}
