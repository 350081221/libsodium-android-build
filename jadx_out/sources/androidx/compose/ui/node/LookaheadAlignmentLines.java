package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\b*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0014R$\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LookaheadAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "alignmentLinesMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "Landroidx/compose/ui/node/NodeCoordinator;", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "calculatePositionInParent", "Landroidx/compose/ui/geometry/Offset;", "position", "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "getPositionFor", "alignmentLine", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,247:1\n157#2:248\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:248\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(@l AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected long mo5086calculatePositionInParentR5De75A(@l NodeCoordinator nodeCoordinator, long j5) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        long mo5151getPositionnOccac = lookaheadDelegate.mo5151getPositionnOccac();
        return Offset.m3498plusMKHz9U(OffsetKt.Offset(IntOffset.m6172getXimpl(mo5151getPositionnOccac), IntOffset.m6173getYimpl(mo5151getPositionnOccac)), j5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    @l
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(@l NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(@l NodeCoordinator nodeCoordinator, @l AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
