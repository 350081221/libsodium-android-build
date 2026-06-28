package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import java.util.List;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u001b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J8\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u001c\u0010\u0019\u001a\u00020\u000e2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u0017H\u0016J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u001b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010.\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0014\u0010C\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010<R\u0014\u0010E\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "other", "", "shouldAnyInfoRecomputeSelection", "", "", "Landroidx/compose/foundation/text/selection/Selection;", "selection", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "info", "", "minOffset", "maxOffset", "Lkotlin/r2;", "createAndPutSubSelection", "slot", "isStartSlot", "startOrEndSlotToIndex", "isMinimumSlot", "slotToIndex", "id", "getInfoListIndexBySelectableId", "Lkotlin/Function1;", "block", "forEachMiddleInfo", "shouldRecomputeSelection", "", "createSubSelections", "", "toString", "selectableIdToInfoListIndex", "Ljava/util/Map;", "getSelectableIdToInfoListIndex", "()Ljava/util/Map;", "", "infoList", "Ljava/util/List;", "getInfoList", "()Ljava/util/List;", "startSlot", "I", "getStartSlot", "()I", "endSlot", "getEndSlot", "isStartHandle", "Z", "()Z", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getStartInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "getEndInfo", "endInfo", "getCurrentInfo", "currentInfo", "getFirstInfo", "firstInfo", "getLastInfo", "lastInfo", "<init>", "(Ljava/util/Map;Ljava/util/List;IIZLandroidx/compose/foundation/text/selection/Selection;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,714:1\n1#2:715\n69#3,6:716\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n263#1:716,6\n*E\n"})
/* loaded from: classes.dex */
public final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;

    @l
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;

    @m
    private final Selection previousSelection;

    @l
    private final Map<Long, Integer> selectableIdToInfoListIndex;
    private final int startSlot;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(@l Map<Long, Integer> map, @l List<SelectableInfo> list, int i5, int i6, boolean z4, @m Selection selection) {
        this.selectableIdToInfoListIndex = map;
        this.infoList = list;
        this.startSlot = i5;
        this.endSlot = i6;
        this.isStartHandle = z4;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        throw new IllegalStateException(("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + external.org.apache.commons.lang3.d.f15957a).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(Map<Long, Selection> map, Selection selection, SelectableInfo selectableInfo, int i5, int i6) {
        Selection makeSingleLayoutSelection;
        boolean z4;
        if (selection.getHandlesCrossed()) {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i6, i5);
        } else {
            makeSingleLayoutSelection = selectableInfo.makeSingleLayoutSelection(i5, i6);
        }
        if (i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            map.put(Long.valueOf(selectableInfo.getSelectableId()), makeSingleLayoutSelection);
            return;
        }
        throw new IllegalStateException(("minOffset should be less than or equal to maxOffset: " + makeSingleLayoutSelection).toString());
    }

    private final int getInfoListIndexBySelectableId(long j5) {
        Integer num = this.selectableIdToInfoListIndex.get(Long.valueOf(j5));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(("Invalid selectableId: " + j5).toString());
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.infoList.get(i5).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i5))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i5, boolean z4) {
        return (i5 - (!z4 ? 1 : 0)) / 2;
    }

    private final int startOrEndSlotToIndex(int i5, boolean z4) {
        int i6 = WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    if (z4) {
                        z4 = false;
                    }
                } else {
                    throw new j0();
                }
            }
            return slotToIndex(i5, z4);
        }
        z4 = true;
        return slotToIndex(i5, z4);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public Map<Long, Selection> createSubSelections(@l Selection selection) {
        Map<Long, Selection> g5;
        Selection.AnchorInfo start;
        Selection.AnchorInfo end;
        Map<Long, Selection> d5;
        boolean z4;
        Map<Long, Selection> k5;
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if ((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                k5 = z0.k(q1.a(Long.valueOf(selection.getStart().getSelectableId()), selection));
                return k5;
            }
            throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
        }
        g5 = z0.g();
        if (selection.getHandlesCrossed()) {
            start = selection.getEnd();
        } else {
            start = selection.getStart();
        }
        createAndPutSubSelection(g5, selection, getFirstInfo(), start.getOffset(), getFirstInfo().getTextLength());
        forEachMiddleInfo(new MultiSelectionLayout$createSubSelections$2$1(this, g5, selection));
        if (selection.getHandlesCrossed()) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        createAndPutSubSelection(g5, selection, getLastInfo(), 0, end.getOffset());
        d5 = z0.d(g5);
        return d5;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(@l v3.l<? super SelectableInfo, r2> lVar) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i5 = infoListIndexBySelectableId + 1;
        if (i5 >= infoListIndexBySelectableId2) {
            return;
        }
        while (i5 < infoListIndexBySelectableId2) {
            lVar.invoke(this.infoList.get(i5));
            i5++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public CrossStatus getCrossStatus() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.NOT_CROSSED;
        }
        if (getStartSlot() > getEndSlot()) {
            return CrossStatus.CROSSED;
        }
        return this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @l
    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @m
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @l
    public final Map<Long, Integer> getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(@m SelectionLayout selectionLayout) {
        if (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout)) {
            MultiSelectionLayout multiSelectionLayout = (MultiSelectionLayout) selectionLayout;
            if (isStartHandle() == multiSelectionLayout.isStartHandle() && getStartSlot() == multiSelectionLayout.getStartSlot() && getEndSlot() == multiSelectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection(multiSelectionLayout)) {
                return false;
            }
        }
        return true;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiSelectionLayout(isStartHandle=");
        sb.append(isStartHandle());
        sb.append(", startPosition=");
        boolean z4 = true;
        float f5 = 2;
        sb.append((getStartSlot() + 1) / f5);
        sb.append(", endPosition=");
        sb.append((getEndSlot() + 1) / f5);
        sb.append(", crossed=");
        sb.append(getCrossStatus());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            SelectableInfo selectableInfo = list.get(i5);
            if (z4) {
                z4 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i5++;
            sb3.append(i5);
            sb3.append(" -> ");
            sb3.append(selectableInfo);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String sb4 = sb2.toString();
        l0.o(sb4, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb4);
        sb.append(')');
        return sb.toString();
    }
}
