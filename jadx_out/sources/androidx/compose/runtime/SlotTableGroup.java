package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0096\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010,\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0013¨\u0006/"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "Lkotlin/r2;", "validateRead", "", "iterator", "", "identityToFind", "find", "Landroidx/compose/runtime/SlotTable;", "table", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "", "group", "I", "getGroup", "()I", "version", "getVersion", "", "isEmpty", "()Z", "getKey", "()Ljava/lang/Object;", DatabaseFileArchive.COLUMN_KEY, "", "getSourceInfo", "()Ljava/lang/String;", "sourceInfo", "getNode", "node", "getData", "()Ljava/lang/Iterable;", "data", "getIdentity", HTTP.IDENTITY_CODING, "getCompositionGroups", "compositionGroups", "getGroupSize", "groupSize", "getSlotsSize", "slotsSize", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n150#2,8:3746\n1#3:3754\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3277#1:3746,8\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, w3.a {
    private final int group;

    @l
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(@l SlotTable slotTable, int i5, int i6) {
        this.table = slotTable;
        this.group = i5;
        this.version = i6;
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @m
    public CompositionGroup find(@l Object obj) {
        Anchor anchor;
        int anchorIndex;
        int i5;
        int groupSize;
        if (obj instanceof Anchor) {
            anchor = (Anchor) obj;
        } else {
            anchor = null;
        }
        if (anchor == null || !this.table.ownsAnchor(anchor) || (anchorIndex = this.table.anchorIndex(anchor)) < (i5 = this.group)) {
            return null;
        }
        int i6 = anchorIndex - i5;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        if (i6 >= groupSize) {
            return null;
        }
        return new SlotTableGroup(this.table, anchorIndex, this.version);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @l
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Iterable<Object> getData() {
        return new DataIterator(this.table, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object getIdentity() {
        validateRead();
        SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @l
    public Object getKey() {
        boolean hasObjectKey;
        int key;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(this.table.getGroups(), this.group);
        if (hasObjectKey) {
            Object[] slots = this.table.getSlots();
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group);
            Object obj = slots[objectKeyIndex];
            l0.m(obj);
            return obj;
        }
        key = SlotTableKt.key(this.table.getGroups(), this.group);
        return Integer.valueOf(key);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @m
    public Object getNode() {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(this.table.getGroups(), this.group);
        if (isNode) {
            Object[] slots = this.table.getSlots();
            nodeIndex = SlotTableKt.nodeIndex(this.table.getGroups(), this.group);
            return slots[nodeIndex];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int dataAnchor;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        dataAnchor = SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
        return slotsSize - dataAnchor;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @m
    public String getSourceInfo() {
        boolean hasAux;
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release;
        GroupSourceInformation groupSourceInformation;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(this.table.getGroups(), this.group);
        if (hasAux) {
            Object[] slots = this.table.getSlots();
            auxIndex = SlotTableKt.auxIndex(this.table.getGroups(), this.group);
            Object obj = slots[auxIndex];
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
        Anchor tryAnchor = this.table.tryAnchor(this.group);
        if (tryAnchor == null || (sourceInformationMap$runtime_release = this.table.getSourceInformationMap$runtime_release()) == null || (groupSourceInformation = sourceInformationMap$runtime_release.get(tryAnchor)) == null) {
            return null;
        }
        return groupSourceInformation.getSourceInformation();
    }

    @l
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize == 0;
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        if (sourceInformationOf != null) {
            return new SourceInformationGroupIterator(this.table, sourceInformationOf);
        }
        SlotTable slotTable = this.table;
        int i5 = this.group;
        groupSize = SlotTableKt.groupSize(slotTable.getGroups(), this.group);
        return new GroupIterator(slotTable, i5 + 1, i5 + groupSize);
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i5, int i6, int i7, w wVar) {
        this(slotTable, i5, (i7 & 4) != 0 ? slotTable.getVersion$runtime_release() : i6);
    }
}
