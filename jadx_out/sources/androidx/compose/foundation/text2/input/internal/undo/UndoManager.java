package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B1\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;", "T", "", "undoableAction", "Lkotlin/r2;", "record", "(Ljava/lang/Object;)V", "undo", "()Ljava/lang/Object;", "redo", "clearHistory", "", "capacity", "I", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "undoStack", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "redoStack", "", "getCanUndo$foundation_release", "()Z", "canUndo", "getCanRedo$foundation_release", "canRedo", "getSize", "()I", "size", "", "initialUndoStack", "initialRedoStack", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UndoManager<T> {
    private final int capacity;

    @l
    private SnapshotStateList<T> redoStack;

    @l
    private SnapshotStateList<T> undoStack;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u0004\"\u0006\b\u0001\u0010\u0006\u0018\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion;", "", "()V", "createSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;", "T", "itemSaver", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> saver) {
            l0.w();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text2.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                @l
                public UndoManager<T> restore(@l Object obj) {
                    List i5;
                    List a5;
                    List i6;
                    List a6;
                    l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int intValue = ((Number) list.get(0)).intValue();
                    int intValue2 = ((Number) list.get(1)).intValue();
                    int intValue3 = ((Number) list.get(2)).intValue();
                    Saver<T, Object> saver2 = saver;
                    i5 = v.i();
                    int i7 = 3;
                    while (i7 < intValue2 + 3) {
                        T restore = saver2.restore(list.get(i7));
                        l0.m(restore);
                        i5.add(restore);
                        i7++;
                    }
                    a5 = v.a(i5);
                    Saver<T, Object> saver3 = saver;
                    i6 = v.i();
                    while (i7 < intValue2 + intValue3 + 3) {
                        T restore2 = saver3.restore(list.get(i7));
                        l0.m(restore2);
                        i6.add(restore2);
                        i7++;
                    }
                    a6 = v.a(i6);
                    return new UndoManager<>(a5, a6, intValue);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                @l
                public Object save(@l SaverScope saverScope, @l UndoManager<T> undoManager) {
                    List i5;
                    int i6;
                    SnapshotStateList snapshotStateList;
                    SnapshotStateList snapshotStateList2;
                    SnapshotStateList snapshotStateList3;
                    SnapshotStateList snapshotStateList4;
                    List a5;
                    Saver<T, Object> saver2 = saver;
                    i5 = v.i();
                    i6 = ((UndoManager) undoManager).capacity;
                    i5.add(Integer.valueOf(i6));
                    snapshotStateList = ((UndoManager) undoManager).undoStack;
                    i5.add(Integer.valueOf(snapshotStateList.size()));
                    snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                    i5.add(Integer.valueOf(snapshotStateList2.size()));
                    snapshotStateList3 = ((UndoManager) undoManager).undoStack;
                    int size = snapshotStateList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        i5.add(saver2.save(saverScope, snapshotStateList3.get(i7)));
                    }
                    snapshotStateList4 = ((UndoManager) undoManager).redoStack;
                    int size2 = snapshotStateList4.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        i5.add(saver2.save(saverScope, snapshotStateList4.get(i8)));
                    }
                    a5 = v.a(i5);
                    return a5;
                }
            };
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public UndoManager(@l List<? extends T> list, @l List<? extends T> list2, int i5) {
        this.capacity = i5;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
        if (i5 >= 0) {
            if (getSize() <= i5) {
                return;
            }
            throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + getSize() + ") greater than the given capacity=(" + i5 + ").").toString());
        }
        throw new IllegalArgumentException("Capacity must be a positive integer".toString());
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.redoStack.isEmpty();
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.undoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T t5) {
        this.redoStack.clear();
        while (getSize() > this.capacity - 1) {
            b0.J0(this.undoStack);
        }
        this.undoStack.add(t5);
    }

    public final T redo() {
        Object L0;
        if (getCanRedo$foundation_release()) {
            L0 = b0.L0(this.redoStack);
            T t5 = (T) L0;
            this.undoStack.add(t5);
            return t5;
        }
        throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.".toString());
    }

    public final T undo() {
        Object L0;
        if (getCanUndo$foundation_release()) {
            L0 = b0.L0(this.undoStack);
            T t5 = (T) L0;
            this.redoStack.add(t5);
            return t5;
        }
        throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.".toString());
    }

    public /* synthetic */ UndoManager(List list, List list2, int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? kotlin.collections.w.E() : list, (i6 & 2) != 0 ? kotlin.collections.w.E() : list2, (i6 & 4) != 0 ? 100 : i5);
    }
}
