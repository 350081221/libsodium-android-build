package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.y;
import p4.l;
import w3.f;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", "T", "", "Lkotlin/r2;", "validateModification", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "set", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "list", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "index", "I", "lastRequested", "structure", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, f {
    private int index;
    private int lastRequested = -1;

    @l
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(@l SnapshotStateList<T> snapshotStateList, int i5) {
        this.list = snapshotStateList;
        this.index = i5 - 1;
        this.structure = snapshotStateList.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getStructure$runtime_release() == this.structure) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t5) {
        validateModification();
        this.list.add(this.index + 1, t5);
        this.lastRequested = -1;
        this.index++;
        this.structure = this.list.getStructure$runtime_release();
    }

    @l
    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i5 = this.index + 1;
        this.lastRequested = i5;
        SnapshotStateListKt.validateRange(i5, this.list.size());
        T t5 = this.list.get(i5);
        this.index = i5;
        return t5;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i5 = this.index;
        this.lastRequested = i5;
        this.index--;
        return this.list.get(i5);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.lastRequested = -1;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t5) {
        validateModification();
        int i5 = this.lastRequested;
        if (i5 >= 0) {
            this.list.set(i5, t5);
            this.structure = this.list.getStructure$runtime_release();
        } else {
            SnapshotStateListKt.invalidIteratorSet();
            throw new y();
        }
    }
}
