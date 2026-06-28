package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Lkotlin/r2;", "validateRead", "", "hasNext", "next", "Landroidx/compose/runtime/SlotTable;", "table", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "", "end", "I", "getEnd", "()I", "index", "version", "start", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, w3.a {
    private final int end;
    private int index;

    @l
    private final SlotTable table;
    private final int version;

    public GroupIterator(@l SlotTable slotTable, int i5, int i6) {
        this.table = slotTable;
        this.end = i6;
        this.index = i5;
        this.version = slotTable.getVersion$runtime_release();
        if (!slotTable.getWriter$runtime_release()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    @l
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @l
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i5 = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i5);
        this.index = groupSize + i5;
        return new SlotTableGroup(this.table, i5, this.version);
    }
}
