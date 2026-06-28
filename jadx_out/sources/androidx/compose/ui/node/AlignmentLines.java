package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b>\u0010?J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bJ\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0006\u0010\u000e\u001a\u00020\bJ\u000f\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H$ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010*\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010-\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\"\u00100\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u0018\u00103\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001aR \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0014\u0010:\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010!R$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0001\u0002@A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "Lkotlin/r2;", "addAlignmentLine", "recalculateQueryOwner", "", "getLastCalculation", "getPositionFor", "recalculate", "reset$ui_release", "()V", "reset", "onAlignmentsChanged", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculatePositionInParent", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "dirty", "Z", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "usedDuringParentMeasurement", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "usedDuringParentLayout", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "previousUsedDuringParentLayout", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "usedByModifierMeasurement", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedByModifierLayout", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "queryOwner", "", "alignmentLineMap", "Ljava/util/Map;", "getQueried$ui_release", "queried", "getRequired$ui_release", "required", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "<init>", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class AlignmentLines {
    public static final int $stable = 8;

    @l
    private final Map<AlignmentLine, Integer> alignmentLineMap;

    @l
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;

    @m
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, w wVar) {
        this(alignmentLinesOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i5, NodeCoordinator nodeCoordinator) {
        int L0;
        Object K;
        float f5 = i5;
        long Offset = OffsetKt.Offset(f5, f5);
        while (true) {
            Offset = mo5086calculatePositionInParentR5De75A(nodeCoordinator, Offset);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            l0.m(nodeCoordinator);
            if (l0.g(nodeCoordinator, this.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
                Offset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            L0 = d.L0(Offset.m3494getYimpl(Offset));
        } else {
            L0 = d.L0(Offset.m3493getXimpl(Offset));
        }
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            K = a1.K(this.alignmentLineMap, alignmentLine);
            L0 = AlignmentLineKt.merge(alignmentLine, ((Number) K).intValue(), L0);
        }
        map.put(alignmentLine, Integer.valueOf(L0));
    }

    /* renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    protected abstract long mo5086calculatePositionInParentR5De75A(@l NodeCoordinator nodeCoordinator, long j5);

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(@l NodeCoordinator nodeCoordinator);

    @l
    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    @l
    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getPositionFor(@l NodeCoordinator nodeCoordinator, @l AlignmentLine alignmentLine);

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        if (!this.usedDuringParentMeasurement && !this.previousUsedDuringParentLayout && !this.usedByModifierMeasurement && !this.usedByModifierLayout) {
            return false;
        }
        return true;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        if (this.queryOwner != null) {
            return true;
        }
        return false;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new AlignmentLines$recalculate$1(this));
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner;
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            alignmentLinesOwner = this.alignmentLinesOwner;
        } else {
            AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                if (alignmentLinesOwner2 != null && !alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                        alignmentLines2.recalculateQueryOwner();
                    }
                    AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                    if (parentAlignmentLinesOwner3 != null && (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) != null) {
                        alignmentLinesOwner = alignmentLines.queryOwner;
                    } else {
                        alignmentLinesOwner = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z4) {
        this.dirty = z4;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z4) {
        this.previousUsedDuringParentLayout = z4;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z4) {
        this.usedByModifierLayout = z4;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z4) {
        this.usedByModifierMeasurement = z4;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z4) {
        this.usedDuringParentLayout = z4;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z4) {
        this.usedDuringParentMeasurement = z4;
    }
}
