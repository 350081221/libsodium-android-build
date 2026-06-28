package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002ABBJ\u0012A\u0010'\u001a=\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b&¢\u0006\u0004\b@\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0013\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u001a\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001f\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001e\u0010\u0019J#\u0010!\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010\u0019R]\u0010'\u001a=\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010.\u001a\u00060-R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u001c\u0010>\u001a\b\u0018\u00010=R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "onAttach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "lookaheadConstraints", "intermediateMeasure-Te-uZzU", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;JJJ)Landroidx/compose/ui/layout/MeasureResult;", "intermediateMeasure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntermediateIntrinsicWidth$ui_release", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntermediateIntrinsicWidth", "width", "minIntermediateIntrinsicHeight$ui_release", "minIntermediateIntrinsicHeight", "maxIntermediateIntrinsicWidth$ui_release", "maxIntermediateIntrinsicWidth", "maxIntermediateIntrinsicHeight$ui_release", "maxIntermediateIntrinsicHeight", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Lkotlin/v0;", "name", "Lkotlin/u;", "measureBlock", "Lv3/q;", "getMeasureBlock$ui_release", "()Lv3/q;", "setMeasureBlock$ui_release", "(Lv3/q;)V", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "localLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "closestLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "", "isIntermediateChangeActive", "Z", "()Z", "setIntermediateChangeActive", "(Z)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "intermediateMeasurable", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "<init>", "IntermediateMeasurablePlaceable", "IntermediateMeasureScopeImpl", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,317:1\n1#2:318\n1#2:326\n88#3:319\n230#4,5:320\n58#4:325\n59#4,8:327\n385#4,6:335\n395#4,2:342\n397#4,8:347\n405#4,9:358\n414#4,8:370\n68#4,7:378\n261#5:341\n234#6,3:344\n237#6,3:367\n1208#7:355\n1187#7,2:356\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode\n*L\n99#1:326\n99#1:319\n99#1:320,5\n99#1:325\n99#1:327,8\n99#1:335,6\n99#1:342,2\n99#1:347,8\n99#1:358,9\n99#1:370,8\n99#1:378,7\n99#1:341\n99#1:344,3\n99#1:367,3\n99#1:355\n99#1:356,2\n*E\n"})
/* loaded from: classes.dex */
public final class IntermediateLayoutModifierNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @l
    private LookaheadScope closestLookaheadScope;

    @m
    private IntermediateMeasurablePlaceable intermediateMeasurable;

    @l
    private final IntermediateMeasureScopeImpl intermediateMeasureScope = new IntermediateMeasureScopeImpl();
    private boolean isIntermediateChangeActive;

    @l
    private final LookaheadScopeImpl localLookaheadScope;

    @m
    private Constraints lookaheadConstraints;

    @l
    private q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\b\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0016R\"\u0010\u001e\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "wrappedMeasurable", "Landroidx/compose/ui/layout/Measurable;", "getWrappedMeasurable", "()Landroidx/compose/ui/layout/Measurable;", "setWrappedMeasurable", "(Landroidx/compose/ui/layout/Measurable;)V", "wrappedPlaceable", "Landroidx/compose/ui/layout/Placeable;", "getWrappedPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "setWrappedPlaceable", "(Landroidx/compose/ui/layout/Placeable;)V", "", "getParentData", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;Landroidx/compose/ui/layout/Measurable;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class IntermediateMeasurablePlaceable extends Placeable implements Measurable {

        @l
        private Measurable wrappedMeasurable;

        @m
        private Placeable wrappedPlaceable;

        public IntermediateMeasurablePlaceable(@l Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@l AlignmentLine alignmentLine) {
            Placeable placeable = this.wrappedPlaceable;
            l0.m(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        @l
        public final Measurable getWrappedMeasurable() {
            return this.wrappedMeasurable;
        }

        @m
        public final Placeable getWrappedPlaceable() {
            return this.wrappedPlaceable;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            return this.wrappedMeasurable.maxIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            return this.wrappedMeasurable.maxIntrinsicWidth(i5);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @l
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4998measureBRTryo0(long j5) {
            Placeable mo4998measureBRTryo0;
            long mo5001getLookaheadSizeYbymL2g;
            if (IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                mo4998measureBRTryo0 = this.wrappedMeasurable.mo4998measureBRTryo0(j5);
                m5048setMeasurementConstraintsBRTryo0(j5);
                m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight()));
            } else {
                Measurable measurable = this.wrappedMeasurable;
                Constraints constraints = IntermediateLayoutModifierNode.this.lookaheadConstraints;
                l0.m(constraints);
                mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(constraints.m6006unboximpl());
                IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                Constraints constraints2 = intermediateLayoutModifierNode.lookaheadConstraints;
                l0.m(constraints2);
                m5048setMeasurementConstraintsBRTryo0(constraints2.m6006unboximpl());
                if (intermediateLayoutModifierNode.isIntermediateChangeActive()) {
                    mo5001getLookaheadSizeYbymL2g = IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight());
                } else {
                    mo5001getLookaheadSizeYbymL2g = intermediateLayoutModifierNode.intermediateMeasureScope.mo5001getLookaheadSizeYbymL2g();
                }
                m5047setMeasuredSizeozmzZPI(mo5001getLookaheadSizeYbymL2g);
            }
            this.wrappedPlaceable = mo4998measureBRTryo0;
            return this;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            return this.wrappedMeasurable.minIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            return this.wrappedMeasurable.minIntrinsicWidth(i5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
            r2 r2Var;
            if (!IntermediateLayoutModifierNode.this.isIntermediateChangeActive()) {
                j5 = IntOffset.Companion.m6182getZeronOccac();
            }
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getNode().getCoordinator$ui_release();
            l0.m(coordinator$ui_release);
            Placeable.PlacementScope placementScope = coordinator$ui_release.getPlacementScope();
            if (lVar != null) {
                Placeable placeable = this.wrappedPlaceable;
                if (placeable != null) {
                    placementScope.m5058placeWithLayeraW9wM(placeable, j5, f5, lVar);
                    r2Var = r2.f19517a;
                } else {
                    r2Var = null;
                }
                if (r2Var != null) {
                    return;
                }
            }
            Placeable placeable2 = this.wrappedPlaceable;
            if (placeable2 != null) {
                placementScope.m5053place70tqf50(placeable2, j5, f5);
                r2 r2Var2 = r2.f19517a;
            }
        }

        public final void setWrappedMeasurable(@l Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        public final void setWrappedPlaceable(@m Placeable placeable) {
            this.wrappedPlaceable = placeable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b-\u0010.J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0016JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016R(\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u0003*\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "J", "getLookaheadSize-YbymL2g", "()J", "setLookaheadSize-ozmzZPI", "(J)V", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "<init>", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @ExperimentalComposeUiApi
    @r1({"SMAP\nIntermediateLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,317:1\n1#2:318\n120#3,5:319\n*S KotlinDebug\n*F\n+ 1 IntermediateLayoutModifierNode.kt\nandroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl\n*L\n292#1:319,5\n*E\n"})
    /* loaded from: classes.dex */
    public final class IntermediateMeasureScopeImpl implements IntermediateMeasureScope, s0 {
        private long lookaheadSize = IntSize.Companion.m6219getZeroYbymL2g();

        public IntermediateMeasureScopeImpl() {
        }

        @Override // kotlinx.coroutines.s0
        @l
        public g getCoroutineContext() {
            return IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            l0.m(coordinator$ui_release);
            return coordinator$ui_release.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            l0.m(coordinator$ui_release);
            return coordinator$ui_release.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @l
        public LayoutDirection getLayoutDirection() {
            NodeCoordinator coordinator$ui_release = IntermediateLayoutModifierNode.this.getCoordinator$ui_release();
            l0.m(coordinator$ui_release);
            return coordinator$ui_release.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        @l
        public LayoutCoordinates getLookaheadScopeCoordinates(@l Placeable.PlacementScope placementScope) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.ui.layout.IntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g, reason: not valid java name */
        public long mo5001getLookaheadSizeYbymL2g() {
            return this.lookaheadSize;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
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
                final IntermediateLayoutModifierNode intermediateLayoutModifierNode = IntermediateLayoutModifierNode.this;
                return new MeasureResult(i5, i6, map, lVar, intermediateLayoutModifierNode) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1
                    final /* synthetic */ v3.l<Placeable.PlacementScope, r2> $placementBlock;

                    @l
                    private final Map<AlignmentLine, Integer> alignmentLines;
                    private final int height;
                    final /* synthetic */ IntermediateLayoutModifierNode this$0;
                    private final int width;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$placementBlock = lVar;
                        this.this$0 = intermediateLayoutModifierNode;
                        this.width = i5;
                        this.height = i6;
                        this.alignmentLines = map;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    @l
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return this.alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.height;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.width;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        v3.l<Placeable.PlacementScope, r2> lVar2 = this.$placementBlock;
                        NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator$ui_release();
                        l0.m(coordinator$ui_release);
                        lVar2.invoke(coordinator$ui_release.getPlacementScope());
                    }
                };
            }
            throw new IllegalStateException(("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        /* renamed from: setLookaheadSize-ozmzZPI, reason: not valid java name */
        public void m5002setLookaheadSizeozmzZPI(long j5) {
            this.lookaheadSize = j5;
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        @l
        public LayoutCoordinates toLookaheadCoordinates(@l LayoutCoordinates layoutCoordinates) {
            return IntermediateLayoutModifierNode.this.closestLookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        }
    }

    public IntermediateLayoutModifierNode(@l q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
        LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$localLookaheadScope$1(this));
        this.localLookaheadScope = lookaheadScopeImpl;
        this.closestLookaheadScope = lookaheadScopeImpl;
        this.isIntermediateChangeActive = true;
    }

    @l
    public final q<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    @l
    /* renamed from: intermediateMeasure-Te-uZzU, reason: not valid java name */
    public final MeasureResult m5000intermediateMeasureTeuZzU(@l MeasureScope measureScope, @l Measurable measurable, long j5, long j6, long j7) {
        this.intermediateMeasureScope.m5002setLookaheadSizeozmzZPI(j6);
        this.lookaheadConstraints = Constraints.m5988boximpl(j7);
        IntermediateMeasurablePlaceable intermediateMeasurablePlaceable = this.intermediateMeasurable;
        if (intermediateMeasurablePlaceable == null) {
            intermediateMeasurablePlaceable = new IntermediateMeasurablePlaceable(measurable);
        }
        this.intermediateMeasurable = intermediateMeasurablePlaceable;
        intermediateMeasurablePlaceable.setWrappedMeasurable(measurable);
        return this.measureBlock.invoke(this.intermediateMeasureScope, intermediateMeasurablePlaceable, Constraints.m5988boximpl(j5));
    }

    public final boolean isIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @l
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo5003measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5988boximpl(j5));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo5003measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5988boximpl(j5));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new IntermediateLayoutModifierNode$measure$1$1(mo4998measureBRTryo0), 4, null);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo5003measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5988boximpl(j5));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    public final int minIntermediateIntrinsicWidth$ui_release(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            @l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo5003measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
                return IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, Constraints.m5988boximpl(j5));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i5);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        boolean z4;
        LookaheadScopeImpl lookaheadScopeImpl;
        LookaheadScopeImpl lookaheadScopeImpl2;
        NodeChain nodes$ui_release;
        boolean z5;
        boolean z6;
        LookaheadDelegate lookaheadDelegate;
        NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
        if (coordinator$ui_release != null && (lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate()) != null) {
            lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates();
        } else {
            lookaheadLayoutCoordinates = null;
        }
        if (lookaheadLayoutCoordinates != null) {
            LayoutNode lookaheadRoot$ui_release = DelegatableNodeKt.requireLayoutNode(this).getLookaheadRoot$ui_release();
            if (lookaheadRoot$ui_release != null && lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                lookaheadScopeImpl2 = new LookaheadScopeImpl(new IntermediateLayoutModifierNode$onAttach$2(lookaheadRoot$ui_release));
            } else {
                int m5204constructorimpl = NodeKind.m5204constructorimpl(512);
                if (getNode().isAttached()) {
                    Modifier.Node parent$ui_release = getNode().getParent$ui_release();
                    LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
                    IntermediateLayoutModifierNode intermediateLayoutModifierNode = null;
                    while (requireLayoutNode != null) {
                        if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    MutableVector mutableVector = null;
                                    Modifier.Node node = parent$ui_release;
                                    while (node != null) {
                                        if (node instanceof IntermediateLayoutModifierNode) {
                                            intermediateLayoutModifierNode = (IntermediateLayoutModifierNode) node;
                                        } else {
                                            if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (z5 && (node instanceof DelegatingNode)) {
                                                int i5 = 0;
                                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            node = delegate$ui_release;
                                                        } else {
                                                            if (mutableVector == null) {
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (node != null) {
                                                                mutableVector.add(node);
                                                                node = null;
                                                            }
                                                            mutableVector.add(delegate$ui_release);
                                                        }
                                                    }
                                                }
                                                if (i5 == 1) {
                                                }
                                            }
                                        }
                                        node = DelegatableNodeKt.pop(mutableVector);
                                    }
                                }
                                parent$ui_release = parent$ui_release.getParent$ui_release();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui_release();
                        if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                            parent$ui_release = nodes$ui_release.getTail$ui_release();
                        } else {
                            parent$ui_release = null;
                        }
                    }
                    if (intermediateLayoutModifierNode == null || (lookaheadScopeImpl = intermediateLayoutModifierNode.localLookaheadScope) == null) {
                        lookaheadScopeImpl = this.localLookaheadScope;
                    }
                    lookaheadScopeImpl2 = lookaheadScopeImpl;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            this.closestLookaheadScope = lookaheadScopeImpl2;
            return;
        }
        throw new IllegalStateException("could not fetch lookahead coordinates".toString());
    }

    public final void setIntermediateChangeActive(boolean z4) {
        this.isIntermediateChangeActive = z4;
    }

    public final void setMeasureBlock$ui_release(@l q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }
}
