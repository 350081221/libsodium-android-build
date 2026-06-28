package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.u1;
import p4.l;
import p4.m;
import w3.d;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "element", "pathIndex", "Lkotlin/r2;", "resetPath", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "", "isCollision", "checkNextWasInvoked", "checkForComodification", "next", "()Ljava/lang/Object;", "remove", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "Z", "expectedModCount", "I", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, d {
    public static final int $stable = 8;

    @l
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;

    @m
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(@l PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime_release());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime_release();
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

    private final boolean isCollision(TrieNode<?> trieNode) {
        return trieNode.getBitmap() == 0;
    }

    private final void resetPath(int i5, TrieNode<?> trieNode, E e5, int i6) {
        int If;
        boolean z4 = true;
        if (isCollision(trieNode)) {
            If = p.If(trieNode.getBuffer(), e5);
            if (If == -1) {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            getPath().get(i6).reset(trieNode.getBuffer(), If);
            setPathLastIndex(i6);
            return;
        }
        int indexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i5, i6 * 5));
        getPath().get(i6).reset(trieNode.getBuffer(), indexOfCellAt$runtime_release);
        Object obj = trieNode.getBuffer()[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            resetPath(i5, (TrieNode) obj, e5, i6 + 1);
        } else {
            setPathLastIndex(i6);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e5 = (E) super.next();
        this.lastIteratedElement = e5;
        this.nextWasInvoked = true;
        return e5;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        int i5;
        checkNextWasInvoked();
        if (hasNext()) {
            E currentElement = currentElement();
            u1.a(this.builder).remove(this.lastIteratedElement);
            if (currentElement != null) {
                i5 = currentElement.hashCode();
            } else {
                i5 = 0;
            }
            resetPath(i5, this.builder.getNode$runtime_release(), currentElement, 0);
        } else {
            u1.a(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
