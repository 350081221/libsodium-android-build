package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0&j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,0&j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050+j\b\u0012\u0004\u0012\u00020\u0005`,`(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", DatabaseFileArchive.COLUMN_KEY, "dataKey", "Landroidx/compose/runtime/KeyInfo;", "getNext", "keyInfo", "", "recordUsed", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Lkotlin/r2;", "registerMoveSlot", "count", "registerMoveNode", "insertIndex", "registerInsert", "group", "newCount", "updateNodeCount", "slotPositionOf", "nodePositionOf", "updatedNodeCountOf", "", "keyInfos", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "startIndex", "I", "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "groupInfos", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "keyMap$delegate", "Lkotlin/d0;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap", "", "getUsed", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4197:1\n1#2:4198\n1855#3,2:4199\n1855#3,2:4201\n1855#3,2:4203\n1855#3,2:4205\n1855#3,2:4207\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n153#1:4199,2\n159#1:4201,2\n169#1:4203,2\n175#1:4205,2\n195#1:4207,2\n*E\n"})
/* loaded from: classes.dex */
public final class Pending {
    private int groupIndex;

    @l
    private final HashMap<Integer, GroupInfo> groupInfos;

    @l
    private final List<KeyInfo> keyInfos;

    @l
    private final d0 keyMap$delegate;
    private final int startIndex;

    @l
    private final List<KeyInfo> usedKeys;

    public Pending(@l List<KeyInfo> list, int i5) {
        boolean z4;
        d0 c5;
        this.keyInfos = list;
        this.startIndex = i5;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.usedKeys = new ArrayList();
            HashMap<Integer, GroupInfo> hashMap = new HashMap<>();
            int size = list.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                KeyInfo keyInfo = this.keyInfos.get(i7);
                hashMap.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i7, i6, keyInfo.getNodes()));
                i6 += keyInfo.getNodes();
            }
            this.groupInfos = hashMap;
            c5 = f0.c(new Pending$keyMap$2(this));
            this.keyMap$delegate = c5;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @l
    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    @l
    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap$delegate.getValue();
    }

    @m
    public final KeyInfo getNext(int i5, @m Object obj) {
        Object valueOf;
        Object pop;
        if (obj != null) {
            valueOf = new JoinedKey(Integer.valueOf(i5), obj);
        } else {
            valueOf = Integer.valueOf(i5);
        }
        pop = ComposerKt.pop(getKeyMap(), valueOf);
        return (KeyInfo) pop;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @l
    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(@l KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(@l KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(@l KeyInfo keyInfo, int i5) {
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i5, 0));
    }

    public final void registerMoveNode(int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (i5 > i6) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i5 <= nodeIndex && nodeIndex < i5 + i7) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    groupInfo.setNodeIndex((nodeIndex - i5) + i6);
                } else {
                    if (i6 <= nodeIndex && nodeIndex < i5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        groupInfo.setNodeIndex(nodeIndex + i7);
                    }
                }
            }
            return;
        }
        if (i6 > i5) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i5 <= nodeIndex2 && nodeIndex2 < i5 + i7) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    groupInfo2.setNodeIndex((nodeIndex2 - i5) + i6);
                } else {
                    if (i5 + 1 <= nodeIndex2 && nodeIndex2 < i6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        groupInfo2.setNodeIndex(nodeIndex2 - i7);
                    }
                }
            }
        }
    }

    public final void registerMoveSlot(int i5, int i6) {
        boolean z4;
        boolean z5;
        if (i5 > i6) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i5) {
                    groupInfo.setSlotIndex(i6);
                } else {
                    if (i6 <= slotIndex && slotIndex < i5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        groupInfo.setSlotIndex(slotIndex + 1);
                    }
                }
            }
            return;
        }
        if (i6 > i5) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i5) {
                    groupInfo2.setSlotIndex(i6);
                } else {
                    if (i5 + 1 <= slotIndex2 && slotIndex2 < i6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        groupInfo2.setSlotIndex(slotIndex2 - 1);
                    }
                }
            }
        }
    }

    public final void setGroupIndex(int i5) {
        this.groupIndex = i5;
    }

    public final int slotPositionOf(@l KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i5, int i6) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(i5));
        if (groupInfo != null) {
            int nodeIndex2 = groupInfo.getNodeIndex();
            int nodeCount = i6 - groupInfo.getNodeCount();
            groupInfo.setNodeCount(i6);
            if (nodeCount != 0) {
                for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                    if (groupInfo2.getNodeIndex() >= nodeIndex2 && !l0.g(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                        groupInfo2.setNodeIndex(nodeIndex);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int updatedNodeCountOf(@l KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
