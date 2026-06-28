package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bB\u0010\nJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\f\u0010\r\u001a\u00020\b*\u00020\fH\u0004JE\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014H\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020&8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u00100\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00168 X \u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020\u00188VX\u0096\u0004¢\u0006\f\u0012\u0004\bA\u0010\n\u001a\u0004\b@\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "calculateAlignmentLine", "Lkotlin/r2;", "replace$ui_release", "()V", "replace", "Landroidx/compose/ui/node/NodeCoordinator;", "invalidateAlignmentLinesFromPositionChange", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "", "isShallowPlacing", "Z", "isShallowPlacing$ui_release", "()Z", "setShallowPlacing$ui_release", "(Z)V", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "position", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getParent", "parent", "getHasMeasureResult", "hasMeasureResult", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "isLookingAhead", "isLookingAhead$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,255:1\n120#2,5:256\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n97#1:256,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {
    public static final int $stable = 0;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;

    @l
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);

    public static /* synthetic */ void isLookingAhead$annotations() {
    }

    public abstract int calculateAlignmentLine(@l AlignmentLine alignmentLine);

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@l AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        int m6173getYimpl;
        if (!getHasMeasureResult() || (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            m6173getYimpl = IntOffset.m6172getXimpl(m5044getApparentToRealOffsetnOccac());
        } else {
            m6173getYimpl = IntOffset.m6173getYimpl(m5044getApparentToRealOffsetnOccac());
        }
        return calculateAlignmentLine + m6173getYimpl;
    }

    @l
    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    @m
    public abstract LookaheadCapablePlaceable getChild();

    @l
    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @l
    public abstract LayoutNode getLayoutNode();

    @l
    public abstract MeasureResult getMeasureResult$ui_release();

    @m
    public abstract LookaheadCapablePlaceable getParent();

    @l
    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo5151getPositionnOccac();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidateAlignmentLinesFromPositionChange(@l NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            layoutNode = wrapped$ui_release.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (!l0.g(layoutNode, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner != null && (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) != null) {
            alignmentLines.onAlignmentsChanged();
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @l
    public MeasureResult layout(final int i5, final int i6, @l final Map<AlignmentLine, Integer> map, @l final v3.l<? super Placeable.PlacementScope, r2> lVar) {
        boolean z4;
        if ((i5 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i6) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                @l
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i6;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i5;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    lVar.invoke(this.getPlacementScope());
                }
            };
        }
        throw new IllegalStateException(("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract void replace$ui_release();

    public final void setPlacingForAlignment$ui_release(boolean z4) {
        this.isPlacingForAlignment = z4;
    }

    public final void setShallowPlacing$ui_release(boolean z4) {
        this.isShallowPlacing = z4;
    }
}
