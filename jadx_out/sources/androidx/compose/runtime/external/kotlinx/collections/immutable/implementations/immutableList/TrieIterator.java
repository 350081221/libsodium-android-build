package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u000f\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "index", "startLevel", "Lkotlin/r2;", "fillPath", "indexPredicate", "fillPathIfNeeded", "elementAtCurrentIndex", "()Ljava/lang/Object;", "", "", "root", "size", "height", "reset$runtime_release", "([Ljava/lang/Object;III)V", "reset", "next", "previous", "I", ClientCookie.PATH_ATTR, "[Ljava/lang/Object;", "", "isInRightEdge", "Z", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private int height;
    private boolean isInRightEdge;

    @l
    private Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(@l Object[] objArr, int i5, int i6, int i7) {
        super(i5, i6);
        ?? r5;
        this.height = i7;
        Object[] objArr2 = new Object[i7];
        this.path = objArr2;
        if (i5 == i6) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.isInRightEdge = r5;
        objArr2[0] = objArr;
        fillPath(i5 - r5, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void fillPath(int i5, int i6) {
        int i7 = (this.height - i6) * 5;
        while (i6 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i6 - 1];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i6] = ((Object[]) obj)[UtilsKt.indexSegment(i5, i7)];
            i7 -= 5;
            i6++;
        }
    }

    private final void fillPathIfNeeded(int i5) {
        int i6 = 0;
        while (UtilsKt.indexSegment(getIndex(), i6) == i5) {
            i6 += 5;
        }
        if (i6 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i6 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E elementAtCurrentIndex = elementAtCurrentIndex();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return elementAtCurrentIndex;
            }
            fillPathIfNeeded(0);
            return elementAtCurrentIndex;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
                return elementAtCurrentIndex();
            }
            fillPathIfNeeded(31);
            return elementAtCurrentIndex();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(@l Object[] objArr, int i5, int i6, int i7) {
        setIndex(i5);
        setSize(i6);
        this.height = i7;
        if (this.path.length < i7) {
            this.path = new Object[i7];
        }
        ?? r02 = 0;
        this.path[0] = objArr;
        if (i5 == i6) {
            r02 = 1;
        }
        this.isInRightEdge = r02;
        fillPath(i5 - r02, 1);
    }
}
