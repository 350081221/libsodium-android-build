package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.y;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "table", "Landroidx/compose/runtime/SlotTable;", "group", "Landroidx/compose/runtime/GroupSourceInformation;", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/GroupSourceInformation;)V", "getGroup", "()Landroidx/compose/runtime/GroupSourceInformation;", "index", "", "getTable", "()Landroidx/compose/runtime/SlotTable;", "version", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n1#2:3746\n*E\n"})
/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, w3.a {

    @l
    private final GroupSourceInformation group;
    private int index;

    @l
    private final SlotTable table;
    private final int version;

    public SourceInformationGroupIterator(@l SlotTable slotTable, @l GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.group = groupSourceInformation;
        this.version = slotTable.getVersion$runtime_release();
    }

    @l
    public final GroupSourceInformation getGroup() {
        return this.group;
    }

    @l
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @l
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i5 = this.index;
            this.index = i5 + 1;
            obj = groups.get(i5);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.table, ((Anchor) obj).getLocation$runtime_release(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, (GroupSourceInformation) obj);
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new y();
    }
}
