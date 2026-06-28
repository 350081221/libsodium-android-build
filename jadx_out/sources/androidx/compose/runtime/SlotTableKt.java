package androidx.compose.runtime;

import android.net.http.Headers;
import com.ss.android.download.api.constant.BaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.j;
import kotlin.ranges.l;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import t0.b;

@i0(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a@\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\r\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u0010\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010\u0016\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010\u0018\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u001a\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0014\u0010\u001b\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002\u001a\u0014\u0010!\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010\"\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002\u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002\u001a\u0014\u0010$\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010%\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002\u001a\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002\u001a\u0014\u0010'\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010(\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002\u001a \u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0002\u001a\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002\u001a\u0014\u0010-\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\u001c\u0010/\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0002\u001a\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u001f*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002\u001aD\u00103\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\u0006\u0010-\u001a\u00020\bH\u0002\u001a\u001c\u00104\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002\u001a;\u0010:\u001a\u000205*\u0012\u0012\u0004\u0012\u0002050\u0001j\b\u0012\u0004\u0012\u000205`\u00022\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\b2\f\u00109\u001a\b\u0012\u0004\u0012\u00020508H\u0082\b\u001a.\u0010;\u001a\u0004\u0018\u000105*\u0012\u0012\u0004\u0012\u0002050\u0001j\b\u0012\u0004\u0012\u000205`\u00022\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0002\u001a,\u0010=\u001a\u00020\b*\u0012\u0012\u0004\u0012\u0002050\u0001j\b\u0012\u0004\u0012\u000205`\u00022\u0006\u0010<\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0002\u001a,\u0010>\u001a\u00020\b*\u0012\u0012\u0004\u0012\u0002050\u0001j\b\u0012\u0004\u0012\u000205`\u00022\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0002\"\u0014\u0010?\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010@\"\u0014\u0010B\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010@\"\u0014\u0010C\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010@\"\u0014\u0010D\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010@\"\u0014\u0010E\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010@\"\u0014\u0010F\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010@\"\u0014\u0010G\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010@\"\u0014\u0010H\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010@\"\u0014\u0010I\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010@\"\u0014\u0010J\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010@\"\u0014\u0010K\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010@\"\u0014\u0010L\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010@\"\u0014\u0010M\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010@\"\u0014\u0010N\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010@\"\u0014\u0010O\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010@\"\u0014\u0010P\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010@\"\u0014\u0010Q\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010@\"\u0014\u0010R\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010@¨\u0006S"}, d2 = {"T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/Function1;", "", "predicate", "fastLastOrNull", "(Ljava/util/ArrayList;Lv3/l;)Ljava/lang/Object;", "", "fastIndexOf", "", "address", "groupInfo", "isNode", "nodeIndex", "hasObjectKey", "objectKeyIndex", "hasAux", "Lkotlin/r2;", "addAux", "hasMark", b.f22420d, "updateMark", "containsMark", "updateContainsMark", "containsAnyMark", "auxIndex", "slotAnchor", "countOneBits", DatabaseFileArchive.COLUMN_KEY, "len", "", "keys", "nodeCount", "updateNodeCount", "nodeCounts", "parentAnchor", "updateParentAnchor", "parentAnchors", "groupSize", "updateGroupSize", "", "indices", "slice", "groupSizes", "dataAnchor", "anchor", "updateDataAnchor", "dataAnchors", "hasDataKey", "hasData", "initGroup", "updateGroupKey", "Landroidx/compose/runtime/Anchor;", "index", "effectiveSize", "Lkotlin/Function0;", "block", "getOrAdd", "find", Headers.LOCATION, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, "locationOf", "parentAnchorPivot", "I", "Key_Offset", "GroupInfo_Offset", "ParentAnchor_Offset", "Size_Offset", "DataAnchor_Offset", "Group_Fields_Size", "NodeBit_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "Aux_Mask", "Aux_Shift", "Mark_Mask", "ContainsMark_Mask", "Slots_Shift", "NodeCount_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "LIVE_EDIT_INVALID_KEY", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3745:1\n82#2,3:3746\n33#2,4:3749\n85#2,2:3753\n38#2:3755\n87#2:3756\n1#3:3757\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3539#1:3746,3\n3539#1:3749,4\n3539#1:3753,2\n3539#1:3755\n3539#1:3756\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final /* synthetic */ int access$auxIndex(int[] iArr, int i5) {
        return auxIndex(iArr, i5);
    }

    public static final /* synthetic */ boolean access$containsAnyMark(int[] iArr, int i5) {
        return containsAnyMark(iArr, i5);
    }

    public static final /* synthetic */ boolean access$containsMark(int[] iArr, int i5) {
        return containsMark(iArr, i5);
    }

    public static final /* synthetic */ int access$dataAnchor(int[] iArr, int i5) {
        return dataAnchor(iArr, i5);
    }

    public static final /* synthetic */ List access$dataAnchors(int[] iArr, int i5) {
        return dataAnchors(iArr, i5);
    }

    public static final /* synthetic */ Anchor access$find(ArrayList arrayList, int i5, int i6) {
        return find(arrayList, i5, i6);
    }

    public static final /* synthetic */ int access$groupSize(int[] iArr, int i5) {
        return groupSize(iArr, i5);
    }

    public static final /* synthetic */ List access$groupSizes(int[] iArr, int i5) {
        return groupSizes(iArr, i5);
    }

    public static final /* synthetic */ boolean access$hasAux(int[] iArr, int i5) {
        return hasAux(iArr, i5);
    }

    public static final /* synthetic */ boolean access$hasMark(int[] iArr, int i5) {
        return hasMark(iArr, i5);
    }

    public static final /* synthetic */ boolean access$hasObjectKey(int[] iArr, int i5) {
        return hasObjectKey(iArr, i5);
    }

    public static final /* synthetic */ boolean access$isNode(int[] iArr, int i5) {
        return isNode(iArr, i5);
    }

    public static final /* synthetic */ int access$key(int[] iArr, int i5) {
        return key(iArr, i5);
    }

    public static final /* synthetic */ List access$keys(int[] iArr, int i5) {
        return keys(iArr, i5);
    }

    public static final /* synthetic */ int access$nodeCount(int[] iArr, int i5) {
        return nodeCount(iArr, i5);
    }

    public static final /* synthetic */ List access$nodeCounts(int[] iArr, int i5) {
        return nodeCounts(iArr, i5);
    }

    public static final /* synthetic */ int access$nodeIndex(int[] iArr, int i5) {
        return nodeIndex(iArr, i5);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] iArr, int i5) {
        return objectKeyIndex(iArr, i5);
    }

    public static final /* synthetic */ int access$parentAnchor(int[] iArr, int i5) {
        return parentAnchor(iArr, i5);
    }

    public static final /* synthetic */ List access$parentAnchors(int[] iArr, int i5) {
        return parentAnchors(iArr, i5);
    }

    public static final /* synthetic */ int access$search(ArrayList arrayList, int i5, int i6) {
        return search(arrayList, i5, i6);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] iArr, int i5) {
        return slotAnchor(iArr, i5);
    }

    public static final void addAux(int[] iArr, int i5) {
        int i6 = (i5 * 5) + 1;
        iArr[i6] = iArr[i6] | Aux_Mask;
    }

    public static final int auxIndex(int[] iArr, int i5) {
        int i6 = i5 * 5;
        if (i6 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i6 + 1] >> 29) + iArr[i6 + 4];
    }

    public static final boolean containsAnyMark(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & 201326592) != 0;
    }

    public static final boolean containsMark(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & 67108864) != 0;
    }

    public static final int countOneBits(int i5) {
        switch (i5) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int dataAnchor(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 4];
    }

    public static final List<Integer> dataAnchors(int[] iArr, int i5) {
        l W1;
        j B1;
        W1 = u.W1(4, i5);
        B1 = u.B1(W1, 5);
        return slice(iArr, B1);
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = iArr.length;
        }
        return dataAnchors(iArr, i5);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, v3.l<? super T, Boolean> lVar) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (lVar.invoke(arrayList.get(i5)).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, v3.l<? super T, Boolean> lVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t5 = arrayList.get(size);
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
        }
        return null;
    }

    public static final Anchor find(ArrayList<Anchor> arrayList, int i5, int i6) {
        int search = search(arrayList, i5, i6);
        if (search >= 0) {
            return arrayList.get(search);
        }
        return null;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i5, int i6, v3.a<Anchor> aVar) {
        int search = search(arrayList, i5, i6);
        if (search < 0) {
            Anchor invoke = aVar.invoke();
            arrayList.add(-(search + 1), invoke);
            return invoke;
        }
        return arrayList.get(search);
    }

    public static final int groupInfo(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 1];
    }

    public static final int groupSize(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 3];
    }

    public static final List<Integer> groupSizes(int[] iArr, int i5) {
        l W1;
        j B1;
        W1 = u.W1(3, i5);
        B1 = u.B1(W1, 5);
        return slice(iArr, B1);
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = iArr.length;
        }
        return groupSizes(iArr, i5);
    }

    public static final boolean hasAux(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & Aux_Mask) != 0;
    }

    public static final boolean hasMark(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & 134217728) != 0;
    }

    public static final boolean hasObjectKey(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & ObjectKey_Mask) != 0;
    }

    public static final void initGroup(int[] iArr, int i5, int i6, boolean z4, boolean z5, boolean z6, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        if (z4) {
            i9 = 1073741824;
        } else {
            i9 = 0;
        }
        if (z5) {
            i10 = ObjectKey_Mask;
        } else {
            i10 = 0;
        }
        if (z6) {
            i11 = Aux_Mask;
        } else {
            i11 = 0;
        }
        int i12 = i5 * 5;
        iArr[i12 + 0] = i6;
        iArr[i12 + 1] = i9 | i10 | i11;
        iArr[i12 + 2] = i7;
        iArr[i12 + 3] = 0;
        iArr[i12 + 4] = i8;
    }

    public static final boolean isNode(int[] iArr, int i5) {
        return (iArr[(i5 * 5) + 1] & 1073741824) != 0;
    }

    public static final int key(int[] iArr, int i5) {
        return iArr[i5 * 5];
    }

    public static final List<Integer> keys(int[] iArr, int i5) {
        l W1;
        j B1;
        W1 = u.W1(0, i5);
        B1 = u.B1(W1, 5);
        return slice(iArr, B1);
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = iArr.length;
        }
        return keys(iArr, i5);
    }

    public static final int locationOf(ArrayList<Anchor> arrayList, int i5, int i6) {
        int search = search(arrayList, i5, i6);
        return search >= 0 ? search : -(search + 1);
    }

    public static final int nodeCount(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 1] & NodeCount_Mask;
    }

    public static final List<Integer> nodeCounts(int[] iArr, int i5) {
        l W1;
        j B1;
        W1 = u.W1(1, i5);
        B1 = u.B1(W1, 5);
        List<Integer> slice = slice(iArr, B1);
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(Integer.valueOf(slice.get(i6).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = iArr.length;
        }
        return nodeCounts(iArr, i5);
    }

    public static final int nodeIndex(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 4];
    }

    public static final int objectKeyIndex(int[] iArr, int i5) {
        int i6 = i5 * 5;
        return iArr[i6 + 4] + countOneBits(iArr[i6 + 1] >> 30);
    }

    public static final int parentAnchor(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 2];
    }

    public static final List<Integer> parentAnchors(int[] iArr, int i5) {
        l W1;
        j B1;
        W1 = u.W1(2, i5);
        B1 = u.B1(W1, 5);
        return slice(iArr, B1);
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = iArr.length;
        }
        return parentAnchors(iArr, i5);
    }

    public static final int search(ArrayList<Anchor> arrayList, int i5, int i6) {
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            int location$runtime_release = arrayList.get(i8).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i6;
            }
            int t5 = l0.t(location$runtime_release, i5);
            if (t5 < 0) {
                i7 = i8 + 1;
            } else if (t5 > 0) {
                size = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i7 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final int slotAnchor(int[] iArr, int i5) {
        int i6 = i5 * 5;
        return iArr[i6 + 4] + countOneBits(iArr[i6 + 1] >> 28);
    }

    public static final void updateContainsMark(int[] iArr, int i5, boolean z4) {
        int i6 = (i5 * 5) + 1;
        if (z4) {
            iArr[i6] = iArr[i6] | 67108864;
        } else {
            iArr[i6] = iArr[i6] & (-67108865);
        }
    }

    public static final void updateDataAnchor(int[] iArr, int i5, int i6) {
        iArr[(i5 * 5) + 4] = i6;
    }

    public static final void updateGroupKey(int[] iArr, int i5, int i6) {
        iArr[(i5 * 5) + 0] = i6;
    }

    public static final void updateGroupSize(int[] iArr, int i5, int i6) {
        boolean z4;
        if (i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ComposerKt.runtimeCheck(z4);
        iArr[(i5 * 5) + 3] = i6;
    }

    public static final void updateMark(int[] iArr, int i5, boolean z4) {
        int i6 = (i5 * 5) + 1;
        if (z4) {
            iArr[i6] = iArr[i6] | 134217728;
        } else {
            iArr[i6] = iArr[i6] & (-134217729);
        }
    }

    public static final void updateNodeCount(int[] iArr, int i5, int i6) {
        boolean z4;
        if (i6 >= 0 && i6 < NodeCount_Mask) {
            z4 = true;
        } else {
            z4 = false;
        }
        ComposerKt.runtimeCheck(z4);
        int i7 = (i5 * 5) + 1;
        iArr[i7] = i6 | (iArr[i7] & (-67108864));
    }

    public static final void updateParentAnchor(int[] iArr, int i5, int i6) {
        iArr[(i5 * 5) + 2] = i6;
    }
}
