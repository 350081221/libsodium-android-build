package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\ba\u0010bJ\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bJ\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u001bJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&J\b\u0010*\u001a\u00020)H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u0010,\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R6\u0010;\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000209\u0018\u000108j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000209\u0018\u0001`:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010B\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bC\u0010DR$\u0010E\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010DR$\u0010\b\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\bG\u0010DR\u0016\u0010H\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00103R\u0016\u0010I\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00103R\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00103R\u0011\u0010L\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bM\u0010DR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010AR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bO\u0010DR\u0011\u0010P\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bP\u0010AR\u0011\u0010R\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bQ\u0010AR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bS\u0010DR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010DR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0011\u0010W\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bZ\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010DR\u0011\u0010`\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b_\u0010D¨\u0006c"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "", "", "index", "node", "aux", "objectKey", "parent", "", "isNode", "nodeCount", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "next", "Lkotlin/r2;", "beginEmpty", "endEmpty", ILivePush.ClickType.CLOSE, "startGroup", "startNode", "skipGroup", "skipToGroupEnd", "reposition", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "", "toString", "Landroidx/compose/runtime/SlotTable;", "table", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Ljava/util/HashMap;", "<set-?>", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "()I", "currentEnd", "getCurrentEnd", "getParent", "emptyCount", "currentSlot", "currentSlotEnd", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getGroupObjectKey", "()Ljava/lang/Object;", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getGroupSlotCount", "groupSlotCount", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3745:1\n1#2:3746\n4178#3,5:3747\n4178#3,5:3752\n4178#3,5:3757\n4178#3,5:3762\n4178#3,5:3767\n3616#4,6:3772\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1130#1:3747,5\n1140#1:3752,5\n1148#1:3757,5\n1167#1:3762,5\n1181#1:3767,5\n1223#1:3772,6\n*E\n"})
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;

    @l
    private final int[] groups;
    private final int groupsSize;
    private int parent;

    @l
    private final Object[] slots;
    private final int slotsSize;

    @m
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @l
    private final SlotTable table;

    public SlotReader(@l SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = slotReader.currentGroup;
        }
        return slotReader.anchor(i5);
    }

    private final Object aux(int[] iArr, int i5) {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(iArr, i5);
        if (hasAux) {
            Object[] objArr = this.slots;
            auxIndex = SlotTableKt.auxIndex(iArr, i5);
            return objArr[auxIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i5) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(iArr, i5);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i5);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    @l
    public final Anchor anchor(int i5) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = SlotTableKt.search(anchors$runtime_release, i5, this.groupsSize);
        if (search < 0) {
            Anchor anchor = new Anchor(i5);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        return anchors$runtime_release.get(search);
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final boolean containsMark(int i5) {
        boolean containsMark;
        containsMark = SlotTableKt.containsMark(this.groups, i5);
        return containsMark;
    }

    public final void endEmpty() {
        boolean z4;
        int i5 = this.emptyCount;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.emptyCount = i5 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void endGroup() {
        boolean z4;
        int parentAnchor;
        int groupSize;
        int i5;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = parentAnchor;
                if (parentAnchor < 0) {
                    i5 = this.groupsSize;
                } else {
                    groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                    i5 = parentAnchor + groupSize;
                }
                this.currentEnd = i5;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new y();
        }
    }

    @l
    public final List<KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int nodeCount;
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i5 = this.currentGroup;
        int i6 = 0;
        while (i5 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i5);
            Object objectKey = objectKey(this.groups, i5);
            isNode = SlotTableKt.isNode(this.groups, i5);
            if (isNode) {
                nodeCount = 1;
            } else {
                nodeCount = SlotTableKt.nodeCount(this.groups, i5);
            }
            arrayList.add(new KeyInfo(key, objectKey, i5, nodeCount, i6));
            groupSize = SlotTableKt.groupSize(this.groups, i5);
            i5 += groupSize;
            i6++;
        }
        return arrayList;
    }

    @m
    public final Object get(int i5) {
        int i6 = this.currentSlot + i5;
        if (i6 < this.currentSlotEnd) {
            return this.slots[i6];
        }
        return Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @m
    public final Object getGroupAux() {
        int i5 = this.currentGroup;
        if (i5 < this.currentEnd) {
            return aux(this.groups, i5);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int key;
        int i5 = this.currentGroup;
        if (i5 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i5);
            return key;
        }
        return 0;
    }

    @m
    public final Object getGroupNode() {
        int i5 = this.currentGroup;
        if (i5 < this.currentEnd) {
            return node(this.groups, i5);
        }
        return null;
    }

    @m
    public final Object getGroupObjectKey() {
        int i5 = this.currentGroup;
        if (i5 < this.currentEnd) {
            return objectKey(this.groups, i5);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i5;
        int i6 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i6);
        int i7 = i6 + 1;
        if (i7 < this.groupsSize) {
            i5 = SlotTableKt.dataAnchor(this.groups, i7);
        } else {
            i5 = this.slotsSize;
        }
        return i5 - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i5 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i5 - slotAnchor;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, this.currentGroup);
        return nodeCount;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i5 = this.parent;
        if (i5 < 0) {
            return 0;
        }
        nodeCount = SlotTableKt.nodeCount(this.groups, i5);
        return nodeCount;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i5 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i5 - slotAnchor;
    }

    @l
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @m
    public final Object groupAux(int i5) {
        return aux(this.groups, i5);
    }

    public final int groupEnd(int i5) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i5);
        return i5 + groupSize;
    }

    @m
    public final Object groupGet(int i5) {
        return groupGet(this.currentGroup, i5);
    }

    public final int groupKey(int i5) {
        int key;
        key = SlotTableKt.key(this.groups, i5);
        return key;
    }

    @m
    public final Object groupObjectKey(int i5) {
        return objectKey(this.groups, i5);
    }

    public final int groupSize(int i5) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i5);
        return groupSize;
    }

    public final boolean hasMark(int i5) {
        boolean hasMark;
        hasMark = SlotTableKt.hasMark(this.groups, i5);
        return hasMark;
    }

    public final boolean hasObjectKey(int i5) {
        boolean hasObjectKey;
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, i5);
        return hasObjectKey;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    @m
    public final Object next() {
        int i5;
        if (this.emptyCount <= 0 && (i5 = this.currentSlot) < this.currentSlotEnd) {
            Object[] objArr = this.slots;
            this.currentSlot = i5 + 1;
            return objArr[i5];
        }
        return Composer.Companion.getEmpty();
    }

    @m
    public final Object node(int i5) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i5);
        if (isNode) {
            return node(this.groups, i5);
        }
        return null;
    }

    public final int nodeCount(int i5) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, i5);
        return nodeCount;
    }

    public final int parent(int i5) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
        return parentAnchor;
    }

    public final int parentOf(int i5) {
        boolean z4;
        int parentAnchor;
        if (i5 >= 0 && i5 < this.groupsSize) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
            return parentAnchor;
        }
        throw new IllegalArgumentException(("Invalid group index " + i5).toString());
    }

    public final void reposition(int i5) {
        boolean z4;
        int i6;
        int groupSize;
        if (this.emptyCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.currentGroup = i5;
            if (i5 < this.groupsSize) {
                i6 = SlotTableKt.parentAnchor(this.groups, i5);
            } else {
                i6 = -1;
            }
            this.parent = i6;
            if (i6 < 0) {
                this.currentEnd = this.groupsSize;
            } else {
                groupSize = SlotTableKt.groupSize(this.groups, i6);
                this.currentEnd = i6 + groupSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new y();
    }

    public final void restoreParent(int i5) {
        int groupSize;
        boolean z4;
        groupSize = SlotTableKt.groupSize(this.groups, i5);
        int i6 = groupSize + i5;
        int i7 = this.currentGroup;
        if (i7 >= i5 && i7 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.parent = i5;
            this.currentEnd = i6;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i5 + " is not a parent of " + i7).toString());
        throw new y();
    }

    public final int skipGroup() {
        boolean z4;
        boolean isNode;
        int groupSize;
        int i5 = 1;
        if (this.emptyCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                i5 = SlotTableKt.nodeCount(this.groups, this.currentGroup);
            }
            int i6 = this.currentGroup;
            groupSize = SlotTableKt.groupSize(this.groups, i6);
            this.currentGroup = i6 + groupSize;
            return i5;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new y();
    }

    public final void skipToGroupEnd() {
        boolean z4;
        if (this.emptyCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.currentGroup = this.currentEnd;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new y();
        }
    }

    public final void startGroup() {
        int parentAnchor;
        boolean z4;
        int groupSize;
        int slotAnchor;
        int dataAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i5 = this.parent;
            int i6 = this.currentGroup;
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i6);
            if (parentAnchor == i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i5))) != null) {
                    groupSourceInformation.reportGroup(this.table, i6);
                }
                this.parent = i6;
                groupSize = SlotTableKt.groupSize(this.groups, i6);
                this.currentEnd = groupSize + i6;
                int i7 = i6 + 1;
                this.currentGroup = i7;
                slotAnchor = SlotTableKt.slotAnchor(this.groups, i6);
                this.currentSlot = slotAnchor;
                if (i6 >= this.groupsSize - 1) {
                    dataAnchor = this.slotsSize;
                } else {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, i7);
                }
                this.currentSlotEnd = dataAnchor;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (isNode) {
                startGroup();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    @l
    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    private final Object node(int[] iArr, int i5) {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(iArr, i5);
        if (isNode) {
            Object[] objArr = this.slots;
            nodeIndex = SlotTableKt.nodeIndex(iArr, i5);
            return objArr[nodeIndex];
        }
        return Composer.Companion.getEmpty();
    }

    @m
    public final Object groupGet(int i5, int i6) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i5);
        int i7 = i5 + 1;
        int i8 = slotAnchor + i6;
        return i8 < (i7 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i7) : this.slotsSize) ? this.slots[i8] : Composer.Companion.getEmpty();
    }

    public final int groupKey(@l Anchor anchor) {
        int key;
        if (!anchor.getValid()) {
            return 0;
        }
        key = SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        return key;
    }

    public final boolean isNode(int i5) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i5);
        return isNode;
    }
}
