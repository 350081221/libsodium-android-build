package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntermediateLayoutModifierNode;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0017\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010<\u001a\u00020\"¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J=\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0002\b\u0017H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016R*\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R.\u0010-\u001a\u0004\u0018\u00010,2\b\u0010#\u001a\u0004\u0018\u00010,8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00109\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lkotlin/r2;", "ensureLookaheadDelegateCreated", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "performDraw", "Landroidx/compose/ui/node/LayoutModifierNode;", "<set-?>", "layoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "Companion", "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n286#2,2:218\n1#3:220\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n106#1:218,2\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Paint modifierBoundsPaint;

    @l
    private LayoutModifierNode layoutModifierNode;

    @m
    private Constraints lookaheadConstraints;

    @m
    private LookaheadDelegate lookaheadDelegate;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,217:1\n221#2,3:218\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n61#1:218,3\n*E\n"})
    /* loaded from: classes.dex */
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(@l AlignmentLine alignmentLine) {
            int calculateAlignmentAndPlaceChildAsNeeded;
            calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(calculateAlignmentAndPlaceChildAsNeeded));
            return calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i5);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i5);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @l
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4998measureBRTryo0(long j5) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            LookaheadDelegate.m5152access$setMeasurementConstraintsBRTryo0(this, j5);
            layoutModifierNodeCoordinator.lookaheadConstraints = Constraints.m5988boximpl(j5);
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            LookaheadDelegate.access$set_measureResult(this, layoutModifierNode.mo82measure3p2s80s(this, lookaheadDelegate, j5));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i5);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i5);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo3613setColor8_81llA(Color.Companion.m3761getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4001getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(@l LayoutNode layoutNode, @l LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode;
        this.layoutModifierNode = layoutModifierNode;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            lookaheadDelegateForLayoutModifierNode = new LookaheadDelegateForLayoutModifierNode();
        } else {
            lookaheadDelegateForLayoutModifierNode = null;
        }
        this.lookaheadDelegate = lookaheadDelegateForLayoutModifierNode;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(@l AlignmentLine alignmentLine) {
        int calculateAlignmentAndPlaceChildAsNeeded;
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine);
        }
        calculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
        return calculateAlignmentAndPlaceChildAsNeeded;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    @l
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @m
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    @l
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    @l
    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        l0.m(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i5) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i5);
        }
        return layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i5);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i5) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i5);
        }
        return layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i5);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @l
    /* renamed from: measure-BRTryo0 */
    public Placeable mo4998measureBRTryo0(long j5) {
        MeasureResult mo82measure3p2s80s;
        m5048setMeasurementConstraintsBRTryo0(j5);
        LayoutModifierNode layoutModifierNode = getLayoutModifierNode();
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            IntermediateLayoutModifierNode intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
            NodeCoordinator wrappedNonNull = getWrappedNonNull();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
            long IntSize = IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
            Constraints constraints = this.lookaheadConstraints;
            l0.m(constraints);
            mo82measure3p2s80s = intermediateLayoutModifierNode.m5000intermediateMeasureTeuZzU(this, wrappedNonNull, j5, IntSize, constraints.m6006unboximpl());
        } else {
            mo82measure3p2s80s = layoutModifierNode.mo82measure3p2s80s(this, getWrappedNonNull(), j5);
        }
        setMeasureResult$ui_release(mo82measure3p2s80s);
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i5) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), i5);
        }
        return layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i5);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i5) {
        IntermediateLayoutModifierNode intermediateLayoutModifierNode;
        LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        if (layoutModifierNode instanceof IntermediateLayoutModifierNode) {
            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) layoutModifierNode;
        } else {
            intermediateLayoutModifierNode = null;
        }
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), i5);
        }
        return layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i5);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(@l Canvas canvas) {
        getWrappedNonNull().draw(canvas);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        super.mo4999placeAtf8xVGno(j5, f5, lVar);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getMeasureResult$ui_release().placeChildren();
    }

    public final void setLayoutModifierNode$ui_release(@l LayoutModifierNode layoutModifierNode) {
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(@m LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }
}
