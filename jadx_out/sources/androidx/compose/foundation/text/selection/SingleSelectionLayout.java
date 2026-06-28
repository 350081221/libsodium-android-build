package androidx.compose.foundation.text.selection;

import java.util.Map;
import kotlin.collections.z0;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B1\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0011\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0014\u00101\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "Lkotlin/r2;", "block", "forEachMiddleInfo", "other", "", "shouldRecomputeSelection", "Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "", "createSubSelections", "", "toString", "isStartHandle", "Z", "()Z", "", "startSlot", "I", "getStartSlot", "()I", "endSlot", "getEndSlot", "previousSelection", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "info", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getStartInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "getEndInfo", "endInfo", "getCurrentInfo", "currentInfo", "getFirstInfo", "firstInfo", "getLastInfo", "lastInfo", "<init>", "(ZIILandroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectableInfo;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SingleSelectionLayout implements SelectionLayout {

    @l
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_SELECTABLE_ID = 1;
    public static final int DEFAULT_SLOT = 1;
    private final int endSlot;

    @l
    private final SelectableInfo info;
    private final boolean isStartHandle;

    @m
    private final Selection previousSelection;
    private final int startSlot;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout$Companion;", "", "()V", "DEFAULT_SELECTABLE_ID", "", "DEFAULT_SLOT", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public SingleSelectionLayout(boolean z4, int i5, int i6, @m Selection selection, @l SelectableInfo selectableInfo) {
        this.isStartHandle = z4;
        this.startSlot = i5;
        this.endSlot = i6;
        this.previousSelection = selection;
        this.info = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public Map<Long, Selection> createSubSelections(@l Selection selection) {
        boolean z4;
        Map<Long, Selection> k5;
        if ((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            k5 = z0.k(q1.a(Long.valueOf(this.info.getSelectableId()), selection));
            return k5;
        }
        throw new IllegalStateException(("unexpectedly miss-crossed selection: " + selection).toString());
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(@l v3.l<? super SelectableInfo, r2> lVar) {
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public CrossStatus getCrossStatus() {
        return this.info.getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getCurrentInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getEndInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getFirstInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getLastInfo() {
        return this.info;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @m
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public SelectableInfo getStartInfo() {
        return this.info;
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
        if (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof SingleSelectionLayout)) {
            SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) selectionLayout;
            if (isStartHandle() == singleSelectionLayout.isStartHandle() && !this.info.shouldRecomputeSelection(singleSelectionLayout.info)) {
                return false;
            }
        }
        return true;
    }

    @l
    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + isStartHandle() + ", crossed=" + getCrossStatus() + ", info=\n\t" + this.info + ')';
    }
}
