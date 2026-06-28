package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b'\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bs\u0010tJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u0004*\u00060\bj\u0002`\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J9\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u001e\u0010\u001bJ\u0006\u0010\u001f\u001a\u00020\u0015J\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!J\u000e\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!J\u0016\u0010(\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!J?\u00100\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u00152&\u0010,\u001a\"\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u0001`+H\u0000¢\u0006\u0004\b.\u0010/J\u007f\u00100\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00042\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105042\u0006\u00107\u001a\u00020\u00042\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020!08j\b\u0012\u0004\u0012\u00020!`92&\u0010,\u001a\"\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u0001`+H\u0000¢\u0006\u0004\b.\u0010;Jw\u0010>\u001a\u00020-2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00042\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105042\u0006\u00107\u001a\u00020\u00042\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020!08j\b\u0012\u0004\u0012\u00020!`92&\u0010,\u001a\"\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u0001`+H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010?\u001a\u00020\u0004H\u0000¢\u0006\u0004\b@\u0010AJ\u0006\u0010C\u001a\u00020%J\u0010\u0010D\u001a\u0004\u0018\u00010*2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010E\u001a\u00020-J\u0006\u0010G\u001a\u00020FJ\u001f\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\bH\u0010AJ!\u0010M\u001a\u0004\u0018\u0001052\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030NH\u0096\u0002J\u0012\u0010Q\u001a\u0004\u0018\u00010\u00032\u0006\u0010P\u001a\u000205H\u0016R$\u00102\u001a\u0002012\u0006\u0010R\u001a\u0002018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010S\u001a\u0004\bT\u0010UR$\u00103\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u0010V\u001a\u0004\bW\u0010XR4\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105042\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010Y\u001a\u0004\bZ\u0010[R$\u00107\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u0010V\u001a\u0004\b\\\u0010XR\u0016\u0010]\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010VR$\u0010\u001d\u001a\u00020%2\u0006\u0010R\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010^\u001a\u0004\b_\u0010`R\"\u0010a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010V\u001a\u0004\bb\u0010X\"\u0004\bc\u0010dR2\u0010:\u001a\u0012\u0012\u0004\u0012\u00020!08j\b\u0012\u0004\u0012\u00020!`98\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iRB\u0010,\u001a\"\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u0001`+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010`R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006u"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "group", "Landroidx/compose/runtime/RecomposeScopeImpl;", "findEffectiveRecomposeScope", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "index", "level", "emitGroup", "", "keys", "nodes", "parentIndexes", "dataIndexes", "groupSizes", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/v0;", "name", "reader", "block", "read", "(Lv3/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "openWriter", "Landroidx/compose/runtime/Anchor;", "anchor", "tryAnchor", "anchorIndex", "", "ownsAnchor", "groupIndex", "groupContainsAnchor", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Lkotlin/r2;", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", ILivePush.ClickType.CLOSE, "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "setTo", TypedValues.AttributesType.S_TARGET, "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "sourceInformationOf", "verifyWellFormed", "", "asString", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "identityToFind", "find", "<set-?>", "[I", "getGroups", "()[I", "I", "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "readers", "Z", "getWriter$runtime_release", "()Z", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n150#1,8:3794\n166#1,4:3802\n171#1,3:3812\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3768\n4178#2,5:3773\n4178#2,5:3778\n4178#2,5:3783\n4178#2,5:3788\n1#3:3761\n3616#4,6:3762\n82#5:3793\n33#6,6:3806\n33#6,6:3815\n33#6,6:3821\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n338#1:3794,8\n367#1:3802,4\n367#1:3812,3\n194#1:3746,5\n195#1:3751,5\n211#1:3756,5\n222#1:3768,5\n233#1:3773,5\n253#1:3778,5\n254#1:3783,5\n266#1:3788,5\n213#1:3762,6\n269#1:3793\n369#1:3806,6\n500#1:3815,6\n509#1:3821,6\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, w3.a {
    public static final int $stable = 8;
    private int groupsSize;
    private int readers;
    private int slotsSize;

    @m
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;

    @l
    private int[] groups = new int[0];

    @l
    private Object[] slots = new Object[0];

    @l
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int emitGroup(java.lang.StringBuilder r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.emitGroup(java.lang.StringBuilder, int, int):int");
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i5) {
        return i5 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i5);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i5) {
        int i6 = i5;
        while (i6 > 0) {
            Iterator<Object> it = new DataIterator(this, i6).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i6 != i5) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i6 = SlotTableKt.access$parentAnchor(this.groups, i6);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$16$scanGroup(SlotReader slotReader, int i5, List<Anchor> list, k1.a aVar, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        int groupKey = slotReader.getGroupKey();
        if (groupKey != i5 && groupKey != -3) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$16$scanGroup(slotReader, i5, list, aVar, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (aVar.element) {
            RecomposeScopeImpl findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (findEffectiveRecomposeScope != null) {
                list2.add(findEffectiveRecomposeScope);
            } else {
                aVar.element = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    private static final int verifyWellFormed$validateGroup(k1.f fVar, SlotTable slotTable, int i5, int i6) {
        ?? r5;
        ?? r52;
        ?? r12;
        int access$dataAnchor;
        ?? r53;
        ?? r54;
        ?? r55;
        ?? r122;
        ?? r13;
        ?? r6;
        ?? r22;
        int i7 = fVar.element;
        int i8 = i7 + 1;
        fVar.element = i8;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i7);
        boolean z4 = false;
        if (access$parentAnchor == i5) {
            r5 = true;
        } else {
            r5 = false;
        }
        if (r5 != false) {
            int access$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i7) + i7;
            if (access$groupSize <= slotTable.groupsSize) {
                r52 = true;
            } else {
                r52 = false;
            }
            if (r52 != false) {
                if (access$groupSize <= i6) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                if (r12 != false) {
                    int access$dataAnchor2 = SlotTableKt.access$dataAnchor(slotTable.groups, i7);
                    if (i7 >= slotTable.groupsSize - 1) {
                        access$dataAnchor = slotTable.slotsSize;
                    } else {
                        access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i8);
                    }
                    if (access$dataAnchor <= slotTable.slots.length) {
                        r53 = true;
                    } else {
                        r53 = false;
                    }
                    if (r53 != false) {
                        if (access$dataAnchor2 <= access$dataAnchor) {
                            r54 = true;
                        } else {
                            r54 = false;
                        }
                        if (r54 != false) {
                            if (SlotTableKt.access$slotAnchor(slotTable.groups, i7) <= access$dataAnchor) {
                                r55 = true;
                            } else {
                                r55 = false;
                            }
                            if (r55 != false) {
                                if (access$dataAnchor - access$dataAnchor2 >= (SlotTableKt.access$isNode(slotTable.groups, i7) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i7) ? 1 : 0) + (SlotTableKt.access$hasAux(slotTable.groups, i7) ? 1 : 0)) {
                                    r122 = true;
                                } else {
                                    r122 = false;
                                }
                                if (r122 != false) {
                                    boolean access$isNode = SlotTableKt.access$isNode(slotTable.groups, i7);
                                    if (access$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i7)] == null) {
                                        r13 = false;
                                    } else {
                                        r13 = true;
                                    }
                                    if (r13 != false) {
                                        int i9 = 0;
                                        while (fVar.element < access$groupSize) {
                                            i9 += verifyWellFormed$validateGroup(fVar, slotTable, i7, access$groupSize);
                                        }
                                        int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i7);
                                        int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i7);
                                        if (access$nodeCount == i9) {
                                            r6 = true;
                                        } else {
                                            r6 = false;
                                        }
                                        if (r6 != false) {
                                            int i10 = fVar.element - i7;
                                            if (access$groupSize2 == i10) {
                                                r22 = true;
                                            } else {
                                                r22 = false;
                                            }
                                            if (r22 != false) {
                                                if (SlotTableKt.access$containsAnyMark(slotTable.groups, i7)) {
                                                    if (i7 <= 0 || SlotTableKt.access$containsMark(slotTable.groups, i5)) {
                                                        z4 = true;
                                                    }
                                                    if (!z4) {
                                                        throw new IllegalStateException(("Expected group " + i5 + " to record it contains a mark because " + i7 + " does").toString());
                                                    }
                                                }
                                                if (access$isNode) {
                                                    return 1;
                                                }
                                                return i9;
                                            }
                                            throw new IllegalStateException(("Incorrect slot count detected at " + i7 + ", expected " + access$groupSize2 + ", received " + i10).toString());
                                        }
                                        throw new IllegalStateException(("Incorrect node count detected at " + i7 + ", expected " + access$nodeCount + ", received " + i9).toString());
                                    }
                                    throw new IllegalStateException(("No node recorded for a node group at " + i7).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i7).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i7).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i7).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i7 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i7).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i7).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i7 + ", expected parent index to be " + i5 + " found " + access$parentAnchor).toString());
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = groups.get(i5);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (anchor.getValid()) {
                        if (!slotTable.ownsAnchor(anchor)) {
                            throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    @l
    public final Anchor anchor(int i5) {
        if (!this.writer) {
            boolean z4 = false;
            if (i5 >= 0 && i5 < this.groupsSize) {
                z4 = true;
            }
            if (z4) {
                ArrayList<Anchor> arrayList = this.anchors;
                int access$search = SlotTableKt.access$search(arrayList, i5, this.groupsSize);
                if (access$search < 0) {
                    Anchor anchor = new Anchor(i5);
                    arrayList.add(-(access$search + 1), anchor);
                    return anchor;
                }
                return arrayList.get(access$search);
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead".toString());
        throw new y();
    }

    public final int anchorIndex(@l Anchor anchor) {
        if (!this.writer) {
            if (anchor.getValid()) {
                return anchor.getLocation$runtime_release();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new y();
    }

    @l
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i5 = this.groupsSize;
        if (i5 > 0) {
            int i6 = 0;
            while (i6 < i5) {
                i6 += emitGroup(sb, i6, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void close$runtime_release(@l SlotReader slotReader, @m HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (slotReader.getTable$runtime_release() == this && this.readers > 0) {
            this.readers--;
            if (hashMap != null) {
                synchronized (this) {
                    HashMap<Anchor, GroupSourceInformation> hashMap2 = this.sourceInformationMap;
                    if (hashMap2 != null) {
                        hashMap2.putAll(hashMap);
                    } else {
                        this.sourceInformationMap = hashMap;
                    }
                    r2 r2Var = r2.f19517a;
                }
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
        throw new y();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.access$containsMark(this.groups, 0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @m
    public CompositionGroup find(@l Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    @l
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @l
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @l
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @l
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    @m
    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i5, @l Anchor anchor) {
        boolean z4;
        boolean z5;
        if (!this.writer) {
            if (i5 >= 0 && i5 < this.groupsSize) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (ownsAnchor(anchor)) {
                    int access$groupSize = SlotTableKt.access$groupSize(this.groups, i5) + i5;
                    int location$runtime_release = anchor.getLocation$runtime_release();
                    if (i5 <= location$runtime_release && location$runtime_release < access$groupSize) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new y();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new y();
    }

    @m
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i5) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        k1.a aVar = new k1.a();
        aVar.element = true;
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$16$scanGroup(openReader, i5, arrayList, aVar, this, arrayList2);
            r2 r2Var = r2.f19517a;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Anchor anchor = (Anchor) arrayList.get(i6);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close();
                if (!aVar.element) {
                    return null;
                }
                return arrayList2;
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @l
    public final SlotReader openReader() {
        if (!this.writer) {
            this.readers++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @l
    public final SlotWriter openWriter() {
        boolean z4;
        if (!this.writer) {
            if (this.readers <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new y();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new y();
    }

    public final boolean ownsAnchor(@l Anchor anchor) {
        boolean z4;
        if (!anchor.getValid()) {
            return false;
        }
        int access$search = SlotTableKt.access$search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize);
        if (access$search >= 0 && l0.g(this.anchors.get(access$search), anchor)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    public final <T> T read(@l v3.l<? super SlotReader, ? extends T> lVar) {
        SlotReader openReader = openReader();
        try {
            return lVar.invoke(openReader);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            openReader.close();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final void setAnchors$runtime_release(@l ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setSourceInformationMap$runtime_release(@m HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final void setTo$runtime_release(@l int[] iArr, int i5, @l Object[] objArr, int i6, @l ArrayList<Anchor> arrayList, @m HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.groups = iArr;
        this.groupsSize = i5;
        this.slots = objArr;
        this.slotsSize = i6;
        this.anchors = arrayList;
        this.sourceInformationMap = hashMap;
    }

    public final void setVersion$runtime_release(int i5) {
        this.version = i5;
    }

    @m
    public final Object slot$runtime_release(int i5, int i6) {
        int length;
        int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i5);
        boolean z4 = true;
        int i7 = i5 + 1;
        if (i7 < this.groupsSize) {
            length = SlotTableKt.access$dataAnchor(this.groups, i7);
        } else {
            length = this.slots.length;
        }
        int i8 = length - access$slotAnchor;
        if (i6 < 0 || i6 >= i8) {
            z4 = false;
        }
        if (z4) {
            return this.slots[access$slotAnchor + i6];
        }
        return Composer.Companion.getEmpty();
    }

    @l
    public final List<Object> slotsOf$runtime_release(int i5) {
        int length;
        List Jy;
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, i5);
        int i6 = i5 + 1;
        if (i6 < this.groupsSize) {
            length = SlotTableKt.access$dataAnchor(this.groups, i6);
        } else {
            length = this.slots.length;
        }
        Jy = p.Jy(this.slots);
        return Jy.subList(access$dataAnchor, length);
    }

    @m
    public final GroupSourceInformation sourceInformationOf(int i5) {
        Anchor tryAnchor;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(i5)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    @m
    public final Anchor tryAnchor(int i5) {
        boolean z4 = true;
        if (!this.writer) {
            if (i5 < 0 || i5 >= this.groupsSize) {
                z4 = false;
            }
            if (z4) {
                return SlotTableKt.access$find(this.anchors, i5, this.groupsSize);
            }
            return null;
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to crate an anchor for location instead".toString());
        throw new y();
    }

    public final void verifyWellFormed() {
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        boolean z7;
        k1.f fVar = new k1.f();
        int i7 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i5 = fVar.element;
                i6 = this.groupsSize;
                if (i5 >= i6) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(fVar, this, -1, i5 + SlotTableKt.access$groupSize(this.groups, i5));
                }
            }
            if (i5 == i6) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                throw new IllegalStateException(("Incomplete group at root " + fVar.element + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int i8 = this.slotsSize; i8 < length; i8++) {
            if (this.slots[i8] == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                throw new IllegalStateException(("Non null value in the slot gap at index " + i8).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            int indexFor = arrayList.get(i9).toIndexFor(this);
            if (indexFor >= 0 && indexFor <= this.groupsSize) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i7 < indexFor) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    i9++;
                    i7 = indexFor;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
        }
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : hashMap.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (key.getValid()) {
                    if (ownsAnchor(key)) {
                        verifyWellFormed$verifySourceGroup(this, value);
                    } else {
                        throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                }
            }
        }
    }

    public final <T> T write(@l v3.l<? super SlotWriter, ? extends T> lVar) {
        SlotWriter openWriter = openWriter();
        try {
            return lVar.invoke(openWriter);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            openWriter.close();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final void close$runtime_release(@l SlotWriter slotWriter, @l int[] iArr, int i5, @l Object[] objArr, int i6, @l ArrayList<Anchor> arrayList, @m HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (slotWriter.getTable$runtime_release() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(iArr, i5, objArr, i6, arrayList, hashMap);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
}
