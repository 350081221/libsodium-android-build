package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002ghB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\be\u0010fJ\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0004J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020#8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R$\u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0016\u0010,\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R$\u0010-\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R$\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u0016\u00101\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010 R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R*\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"\"\u0004\b9\u0010:R*\u0010;\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010 \u001a\u0004\b<\u0010\"\"\u0004\b=\u0010:R*\u0010>\u001a\u0002022\u0006\u00106\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010D\u001a\u00060CR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR0\u0010I\u001a\b\u0018\u00010HR\u00020\u00002\f\u0010\u001e\u001a\b\u0018\u00010HR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010M\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0019\u0010X\u001a\u0004\u0018\u00010\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0019\u0010Z\u001a\u0004\u0018\u00010\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0014\u0010\\\u001a\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010@R\u0014\u0010^\u001a\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010@R\u0014\u0010b\u001a\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010d\u001a\u0004\u0018\u00010_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/r2;", "performMeasure-BRTryo0", "(J)V", "performMeasure", "performLookaheadMeasure-BRTryo0", "performLookaheadMeasure", "markLayoutPending$ui_release", "()V", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "onCoordinatesUsed", "ensureLookaheadDelegateCreated$ui_release", "ensureLookaheadDelegateCreated", "updateParentData", "invalidateParentData", "resetAlignmentLines", "markChildrenDirty", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "", "<set-?>", "detachedFromParentLookaheadPass", "Z", "getDetachedFromParentLookaheadPass$ui_release", "()Z", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "measurePending", "getMeasurePending$ui_release", "layoutPending", "getLayoutPending$ui_release", "layoutPendingForAlignment", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPendingForAlignment", "", "nextChildLookaheadPlaceOrder", "I", "nextChildPlaceOrder", b.f22420d, "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "(Z)V", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "setCoordinatesAccessedDuringModifierPlacement", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "performMeasureConstraints", "J", "Lkotlin/Function0;", "performMeasureBlock", "Lv3/a;", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLastLookaheadConstraints-DWUhwKw", "lastLookaheadConstraints", "getHeight$ui_release", "height", "getWidth$ui_release", "width", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1#2:1782\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;

    @l
    private final LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;

    @m
    private LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;

    @l
    private LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;

    @l
    private final MeasurePassDelegate measurePassDelegate = new MeasurePassDelegate();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @l
    private final v3.a<r2> performMeasureBlock = new LayoutNodeLayoutDelegate$performMeasureBlock$1(this);

    @i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J!\u0010\b\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082\bJ\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0006\u0010\u001a\u001a\u00020\u0006J\u001a\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010#\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J=\u0010-\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0019\u0010*\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b)H\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0011\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0014H\u0096\u0002J\u0010\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0016J\u0010\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0016J\u000e\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020 J\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u00020 J\u000f\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b:\u0010;J\u0006\u0010=\u001a\u00020\u0006J\u0006\u0010>\u001a\u00020\u0006R\u0016\u0010?\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010C\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010@\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010U\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010@\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\u0016\u0010X\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010@R\u001e\u0010Y\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010[\u001a\u00020$2\u0006\u0010A\u001a\u00020$8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010_\u001a\u00020&2\u0006\u0010A\u001a\u00020&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bRJ\u0010c\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b)2\u0019\u0010A\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b)8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\"\u0010g\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010@\u001a\u0004\bg\u0010R\"\u0004\bh\u0010TR\u001a\u0010j\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001e\u0010o\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00050n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\"\u0010q\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010@\u001a\u0004\br\u0010R\"\u0004\bs\u0010TR$\u0010t\u001a\u00020 2\u0006\u0010A\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010@\u001a\u0004\bu\u0010RR\u0016\u0010v\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010@R(\u0010x\u001a\u0004\u0018\u00010w2\b\u0010A\u001a\u0004\u0018\u00010w8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010@R\u0019\u0010\u0080\u0001\u001a\u00060}R\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\"\u0010\u008b\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020\u00050\u0088\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0090\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010FR\u0016\u0010\u0092\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Lkotlin/r2;", "block", "forEachChildDelegate", "checkChildrenPlaceOrderForUpdates", "markSubtreeAsNotPlaced", "Landroidx/compose/ui/node/LayoutNode;", "node", "trackLookaheadMeasurementByParent", "onIntrinsicsQueried", "clearPlaceOrder", "markNodeAndSubtreeAsPlaced", "onBeforeLayoutChildren", "layoutChildren", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "forEachChildAlignmentLinesOwner", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "alignmentLine", "get", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRequest", "invalidateIntrinsicsParent", "invalidateParentData", "updateParentData", "onNodePlaced$ui_release", "()V", "onNodePlaced", "replace", "onNodeDetached", "relayoutWithoutParentInProgress", "Z", "<set-?>", "previousPlaceOrder", "I", "placeOrder", "getPlaceOrder$ui_release", "()I", "setPlaceOrder$ui_release", "(I)V", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "placedOnce", "getPlacedOnce$ui_release", "setPlacedOnce$ui_release", "measuredOnce", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "lastPosition", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastZIndex", "F", "getLastZIndex$ui_release", "()F", "lastLayerBlock", "Lv3/l;", "getLastLayerBlock$ui_release", "()Lv3/l;", "isPlaced", "setPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "childDelegatesDirty", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "layingOutChildren", "getLayingOutChildren", "parentDataDirty", "", "parentData", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "onNodePlacedCalled", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1078#1:1820\n1079#1,2:1829\n1078#1:1835\n1079#1,2:1844\n1078#1:1874\n1079#1,2:1883\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n197#4:1836\n197#4:1850\n197#4:1862\n197#4:1875\n197#4:1889\n197#4:1901\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,7:1837\n467#5,4:1846\n460#5,11:1851\n460#5,11:1863\n460#5,7:1876\n467#5,4:1885\n460#5,11:1890\n460#5,11:1902\n1#6:1913\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1141#1:1820\n1141#1:1829,2\n1156#1:1835\n1156#1:1844,2\n1512#1:1874\n1512#1:1883,2\n1058#1:1782,2\n1067#1:1784\n1067#1:1793,6\n1067#1:1803,5\n1067#1:1785\n1078#1:1808\n1141#1:1821\n1156#1:1836\n1183#1:1850\n1209#1:1862\n1512#1:1875\n1534#1:1889\n1567#1:1901\n1067#1:1786,7\n1067#1:1799,4\n1078#1:1809,11\n1141#1:1822,7\n1141#1:1831,4\n1156#1:1837,7\n1156#1:1846,4\n1183#1:1851,11\n1209#1:1863,11\n1512#1:1876,7\n1512#1:1885,4\n1534#1:1890,11\n1567#1:1902,11\n*E\n"})
    /* loaded from: classes.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;

        @m
        private v3.l<? super GraphicsLayerScope, r2> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;

        @m
        private Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;

        @l
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = IntOffset.Companion.m6182getZeronOccac();

        @l
        private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);

        @l
        private final MutableVector<LookaheadPassDelegate> _childDelegates = new MutableVector<>(new LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;

        @m
        private Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i5].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    l0.m(lookaheadPassDelegate$ui_release);
                    int i6 = lookaheadPassDelegate$ui_release.previousPlaceOrder;
                    int i7 = lookaheadPassDelegate$ui_release.placeOrder;
                    if (i6 != i7 && i7 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i5 = 0;
            LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i5].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    l0.m(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.previousPlaceOrder = lookaheadPassDelegate$ui_release.placeOrder;
                    lookaheadPassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void forEachChildDelegate(v3.l<? super LookaheadPassDelegate, r2> lVar) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i5].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    l0.m(lookaheadPassDelegate$ui_release);
                    lVar.invoke(lookaheadPassDelegate$ui_release);
                    i5++;
                } while (i5 < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced(true);
            int i5 = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i5];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        l0.m(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i5 = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i5].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        l0.m(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markSubtreeAsNotPlaced();
                        i5++;
                    } while (i5 < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        l0.m(lookaheadPassDelegate$ui_release);
                        Constraints m5144getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate$ui_release().m5144getLastLookaheadConstraintsDWUhwKw();
                        l0.m(m5144getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m5147remeasureBRTryo0(m5144getLastLookaheadConstraintsDWUhwKw.m6006unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                int i5 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i5 != 2) {
                    if (i5 != 3) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
            boolean z4;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    int i5 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                    if (i5 != 1 && i5 != 2) {
                        if (i5 != 3 && i5 != 4) {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                        }
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    }
                    this.measuredByParent = usageByParent;
                    return;
                }
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@l v3.l<? super AlignmentLinesOwner, r2> lVar) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i5].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    l0.m(lookaheadAlignmentLinesOwner$ui_release);
                    lVar.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i5++;
                } while (i5 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@l AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            int i5 = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i5;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        @l
        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LookaheadPassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (mutableVector.getSize() <= i5) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        l0.m(lookaheadPassDelegate$ui_release);
                        mutableVector.add(lookaheadPassDelegate$ui_release);
                    } else {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        l0.m(lookaheadPassDelegate$ui_release2);
                        mutableVector.set(i5, lookaheadPassDelegate$ui_release2);
                    }
                    i5++;
                } while (i5 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @m
        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m5145getLastConstraintsDWUhwKw() {
            return this.lookaheadConstraints;
        }

        @m
        public final v3.l<GraphicsLayerScope, r2> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name */
        public final long m5146getLastPositionnOccac$ui_release() {
            return this.lastPosition;
        }

        public final float getLastZIndex$ui_release() {
            return this.lastZIndex;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @l
        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        @l
        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @m
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object getParentData() {
            return this.parentData;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final boolean getPlacedOnce$ui_release() {
            return this.placedOnce;
        }

        public final void invalidateIntrinsicsParent(boolean z4) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i5 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                            parent$ui_release2.requestLookaheadRelayout$ui_release(z4);
                            return;
                        } else {
                            parent$ui_release2.requestRelayout$ui_release(z4);
                            return;
                        }
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, z4, false, 2, null);
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z4, false, 2, null);
                }
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, lookaheadDelegate, LayoutNodeLayoutDelegate.this), 2, null);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if (r1 == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
         */
        @Override // androidx.compose.ui.layout.Measurable
        @p4.l
        /* renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.compose.ui.layout.Placeable mo4998measureBRTryo0(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                r1 = 0
                if (r0 == 0) goto L12
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
                goto L13
            L12:
                r0 = r1
            L13:
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
                if (r0 == r2) goto L2b
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
                if (r0 == 0) goto L27
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.getLayoutState$ui_release()
            L27:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                r1 = 0
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$setDetachedFromParentLookaheadPass$p(r0, r1)
            L31:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r3.trackLookaheadMeasurementByParent(r0)
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.getIntrinsicsUsageByParent$ui_release()
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
                if (r0 != r1) goto L51
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.access$getLayoutNode$p(r0)
                r0.clearSubtreeIntrinsicsUsage$ui_release()
            L51:
                r3.m5147remeasureBRTryo0(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.mo4998measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            onIntrinsicsQueried();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i5);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            boolean z4;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode = content[i5];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if (!layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() && !layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4 && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                    if (lookaheadPassDelegate$ui_release != null) {
                        lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            boolean z4 = false;
            if (!isPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        z4 = true;
                    }
                    if (z4) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                if (!IntOffset.m6171equalsimpl0(j5, this.lastPosition)) {
                    if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                    }
                    notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                    LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                    l0.m(lookaheadDelegate);
                    lookaheadDelegate.m5155placeSelfApparentToRealOffsetgyyYBs$ui_release(j5);
                    onNodePlaced$ui_release();
                } else {
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.layoutNode, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2(LayoutNodeLayoutDelegate.this, requireOwner, j5), 2, null);
                }
                this.lastPosition = j5;
                this.lastZIndex = f5;
                this.lastLayerBlock = lVar;
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m5147remeasureBRTryo0(long j5) {
            boolean z4;
            long IntSize;
            boolean z5;
            boolean m5993equalsimpl0;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                layoutNode.setCanMultiMeasure$ui_release(z4);
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release()) {
                    Constraints constraints = this.lookaheadConstraints;
                    if (constraints == null) {
                        m5993equalsimpl0 = false;
                    } else {
                        m5993equalsimpl0 = Constraints.m5993equalsimpl0(constraints.m6006unboximpl(), j5);
                    }
                    if (m5993equalsimpl0) {
                        Owner owner$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getOwner$ui_release();
                        if (owner$ui_release != null) {
                            owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.layoutNode, true);
                        }
                        LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                        return false;
                    }
                }
                this.lookaheadConstraints = Constraints.m5988boximpl(j5);
                m5048setMeasurementConstraintsBRTryo0(j5);
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2.INSTANCE);
                if (this.measuredOnce) {
                    IntSize = m5045getMeasuredSizeYbymL2g();
                } else {
                    IntSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.measuredOnce = true;
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    LayoutNodeLayoutDelegate.this.m5141performLookaheadMeasureBRTryo0(j5);
                    m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                    if (IntSize.m6214getWidthimpl(IntSize) != lookaheadDelegate.getWidth() || IntSize.m6213getHeightimpl(IntSize) != lookaheadDelegate.getHeight()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (this.placedOnce) {
                    this.onNodePlacedCalled = false;
                    boolean isPlaced = isPlaced();
                    mo4999placeAtf8xVGno(this.lastPosition, 0.0f, null);
                    if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                    }
                    return;
                }
                throw new IllegalStateException("replace() called on item that was not placed".toString());
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z4) {
            this.childDelegatesDirty = z4;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z4) {
            this.duringAlignmentLinesQuery = z4;
        }

        public final void setMeasuredByParent$ui_release(@l LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final void setPlaceOrder$ui_release(int i5) {
            this.placeOrder = i5;
        }

        public void setPlaced(boolean z4) {
            this.isPlaced = z4;
        }

        public final void setPlacedOnce$ui_release(boolean z4) {
            this.placedOnce = z4;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                l0.m(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            l0.m(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }
    }

    @i0(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J!\u0010\f\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0082\bJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J=\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0002\b\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u000f\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010*\u001a\u00020'2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0011\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0096\u0002J=\u00100\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0002\b\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0018J\u0006\u00101\u001a\u00020\u0004J\u0010\u00103\u001a\u00020-2\u0006\u00102\u001a\u00020-H\u0016J\u0010\u00104\u001a\u00020-2\u0006\u00102\u001a\u00020-H\u0016J\u0010\u00106\u001a\u00020-2\u0006\u00105\u001a\u00020-H\u0016J\u0010\u00107\u001a\u00020-2\u0006\u00105\u001a\u00020-H\u0016J\u0006\u00108\u001a\u00020\u0004J\u0006\u00109\u001a\u00020'J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020-0:H\u0016J\u001c\u0010<\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\tH\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\u0006\u0010?\u001a\u00020\u0004J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020'J\u0006\u0010B\u001a\u00020\u0004J\u0006\u0010C\u001a\u00020\u0004J\u0006\u0010D\u001a\u00020\u0004R\u0016\u0010E\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010H\u001a\u00020-2\u0006\u0010G\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010L\u001a\u00020-2\u0006\u0010G\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0016\u0010N\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010O\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\"\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010W\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010F\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\\\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\\\u0010]R)\u0010^\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0002\b\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010FR(\u0010d\u001a\u0004\u0018\u00010c2\b\u0010G\u001a\u0004\u0018\u00010c8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR*\u0010h\u001a\u00020'2\u0006\u0010G\u001a\u00020'8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010F\u001a\u0004\bh\u0010Y\"\u0004\bi\u0010[R*\u0010j\u001a\u00020'2\u0006\u0010G\u001a\u00020'8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010F\u001a\u0004\bj\u0010Y\"\u0004\bk\u0010[R\u001a\u0010m\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001e\u0010r\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\n0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\"\u0010t\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010F\u001a\u0004\bu\u0010Y\"\u0004\bv\u0010[R$\u0010w\u001a\u00020'2\u0006\u0010G\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bw\u0010F\u001a\u0004\bx\u0010YR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00040y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010FR)\u0010\u007f\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0002\b\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010_R\u001e\u0010\u0080\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010]R\u0018\u0010\u0081\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010aR\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040y8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010{R\u001c\u0010\u0085\u0001\u001a\u0004\u0018\u00010\"8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u008d\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020\n0\u008a\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008f\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010KR\u0016\u0010\u0091\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010KR\u0019\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Lkotlin/r2;", "checkChildrenPlaceOrderForUpdates", "markSubtreeAsNotPlaced", "markNodeAndSubtreeAsPlaced", "clearPlaceOrder", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "block", "forEachChildDelegate", "Landroidx/compose/ui/node/LayoutNode;", "node", "trackMeasurementByParent", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeOuterCoordinator-f8xVGno", "(JFLv3/l;)V", "placeOuterCoordinator", "onIntrinsicsQueried", "onBeforeLayoutChildren", "markDetachedFromParentLookaheadPass$ui_release", "()V", "markDetachedFromParentLookaheadPass", "layoutChildren", "onNodePlaced$ui_release", "onNodePlaced", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "placeAt-f8xVGno", "placeAt", "replace", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "invalidateParentData", "updateParentData", "", "calculateAlignmentLines", "forEachChildAlignmentLinesOwner", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "forceRequest", "invalidateIntrinsicsParent", "onNodeDetached", "measureBasedOnLookahead", "placeBasedOnLookahead", "relayoutWithoutParentInProgress", "Z", "<set-?>", "previousPlaceOrder", "I", "getPreviousPlaceOrder$ui_release", "()I", "placeOrder", "getPlaceOrder$ui_release", "measuredOnce", "placedOnce", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "lastPosition", "J", "lastLayerBlock", "Lv3/l;", "lastZIndex", "F", "parentDataDirty", "", "parentData", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "isPlaced", "setPlaced$ui_release", "isPlacedByParent", "setPlacedByParent$ui_release", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "childDelegatesDirty", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "layingOutChildren", "getLayingOutChildren", "Lkotlin/Function0;", "layoutChildrenBlock", "Lv3/a;", "getZIndex$ui_release", "()F", "onNodePlacedCalled", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "placeOuterCoordinatorBlock", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n571#1:1820\n572#1,2:1829\n574#1:1835\n571#1:1862\n572#1,2:1871\n574#1:1877\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n1247#4,7:1836\n197#4:1843\n1235#4,7:1855\n197#4:1863\n197#4:1878\n197#4:1891\n197#4:1903\n197#4:1915\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,11:1844\n460#5,7:1864\n467#5,4:1873\n460#5,11:1879\n460#5,11:1892\n460#5,11:1904\n460#5,11:1916\n1#6:1890\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n437#1:1820\n437#1:1829,2\n437#1:1835\n557#1:1862\n557#1:1871,2\n557#1:1877\n336#1:1782,2\n346#1:1784\n346#1:1793,6\n346#1:1803,5\n346#1:1785\n419#1:1808\n437#1:1821\n456#1:1836,7\n461#1:1843\n511#1:1855,7\n557#1:1863\n571#1:1878\n863#1:1891\n889#1:1903\n925#1:1915\n346#1:1786,7\n346#1:1799,4\n419#1:1809,11\n437#1:1822,7\n437#1:1831,4\n461#1:1844,11\n557#1:1864,7\n557#1:1873,4\n571#1:1879,11\n863#1:1892,11\n889#1:1904,11\n925#1:1916,11\n*E\n"})
    /* loaded from: classes.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {

        @l
        private final MutableVector<MeasurePassDelegate> _childDelegates;

        @l
        private final AlignmentLines alignmentLines;
        private boolean childDelegatesDirty;
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;

        @m
        private v3.l<? super GraphicsLayerScope, r2> lastLayerBlock;
        private long lastPosition;
        private float lastZIndex;
        private boolean layingOutChildren;

        @l
        private final v3.a<r2> layoutChildrenBlock;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;

        @m
        private Object parentData;
        private boolean parentDataDirty;

        @l
        private final v3.a<r2> placeOuterCoordinatorBlock;

        @m
        private v3.l<? super GraphicsLayerScope, r2> placeOuterCoordinatorLayerBlock;
        private long placeOuterCoordinatorPosition;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;

        @l
        private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
            IntOffset.Companion companion = IntOffset.Companion;
            this.lastPosition = companion.m6182getZeronOccac();
            this.parentDataDirty = true;
            this.alignmentLines = new LayoutNodeAlignmentLines(this);
            this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1(this);
            this.placeOuterCoordinatorPosition = companion.m6182getZeronOccac();
            this.placeOuterCoordinatorBlock = new LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate.this, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i5].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void forEachChildDelegate(v3.l<? super MeasurePassDelegate, r2> lVar) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    lVar.invoke(content[i5].getMeasurePassDelegate$ui_release());
                    i5++;
                } while (i5 < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            int i5 = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !l0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (isPlaced()) {
                int i5 = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i5].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i5++;
                    } while (i5 < size);
                }
            }
        }

        private final void onBeforeLayoutChildren() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m5126remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i5++;
                } while (i5 < size);
            }
        }

        private final void onIntrinsicsQueried() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                int i5 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        /* renamed from: placeOuterCoordinator-f8xVGno, reason: not valid java name */
        private final void m5148placeOuterCoordinatorf8xVGno(long j5, float f5, v3.l<? super GraphicsLayerScope, r2> lVar) {
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                this.lastPosition = j5;
                this.lastZIndex = f5;
                this.lastLayerBlock = lVar;
                this.placedOnce = true;
                this.onNodePlacedCalled = false;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                    LayoutNodeLayoutDelegate.this.getOuterCoordinator().m5194placeSelfApparentToRealOffsetf8xVGno(j5, f5, lVar);
                    onNodePlaced$ui_release();
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                    LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                    this.placeOuterCoordinatorLayerBlock = lVar;
                    this.placeOuterCoordinatorPosition = j5;
                    this.placeOuterCoordinatorZIndex = f5;
                    requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                    this.placeOuterCoordinatorLayerBlock = null;
                }
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.Idle;
                return;
            }
            throw new IllegalArgumentException("place is called on a deactivated node".toString());
        }

        private final void trackMeasurementByParent(LayoutNode layoutNode) {
            boolean z4;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    int i5 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                        } else {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                        }
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    }
                    this.measuredByParent = usageByParent;
                    return;
                }
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@l v3.l<? super AlignmentLinesOwner, r2> lVar) {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    lVar.invoke(content[i5].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i5++;
                } while (i5 < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@l AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int i5 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i5;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        @l
        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
            MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector2.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode2 = content[i5];
                    if (mutableVector.getSize() <= i5) {
                        mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    } else {
                        mutableVector.set(i5, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                    }
                    i5++;
                } while (i5 < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.childDelegatesDirty;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @l
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @m
        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m5149getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return Constraints.m5988boximpl(m5046getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @l
        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        @m
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
                return null;
            }
            return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        @m
        public Object getParentData() {
            return this.parentData;
        }

        public final int getPlaceOrder$ui_release() {
            return this.placeOrder;
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.previousPlaceOrder;
        }

        public final float getZIndex$ui_release() {
            return this.zIndex;
        }

        public final void invalidateIntrinsicsParent(boolean z4) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i5 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        parent$ui_release2.requestRelayout$ui_release(z4);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z4, false, 2, null);
            }
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.isPlaced;
        }

        public final boolean isPlacedByParent() {
            return this.isPlacedByParent;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                onBeforeLayoutChildren();
            }
            if (LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.layoutPending = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.layoutState = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                LayoutNodeLayoutDelegate.this.layoutState = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i5) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i5) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i5);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @l
        /* renamed from: measure-BRTryo0 */
        public Placeable mo4998measureBRTryo0(long j5) {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent$ui_release();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent$ui_release == usageByParent) {
                LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                l0.m(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                lookaheadPassDelegate$ui_release.mo4998measureBRTryo0(j5);
            }
            trackMeasurementByParent(LayoutNodeLayoutDelegate.this.layoutNode);
            m5150remeasureBRTryo0(j5);
            return this;
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (lookaheadPassDelegate$ui_release != null) {
                    if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                        Constraints m5145getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m5145getLastConstraintsDWUhwKw();
                        l0.m(m5145getLastConstraintsDWUhwKw);
                        mo4998measureBRTryo0(m5145getLastConstraintsDWUhwKw.m6006unboximpl());
                        return;
                    } else {
                        if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                            Constraints m5145getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m5145getLastConstraintsDWUhwKw();
                            l0.m(m5145getLastConstraintsDWUhwKw2);
                            mo4998measureBRTryo0(m5145getLastConstraintsDWUhwKw2.m6006unboximpl());
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException("invalid lookaheadDelegate".toString());
            }
            throw new IllegalStateException("layoutNode parent is not set".toString());
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i5) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i5);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i5) {
            onIntrinsicsQueried();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i5);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            boolean z4;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i5 = 0;
                do {
                    LayoutNode layoutNode = content[i5];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if (!layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() && !layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4 && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                    i5++;
                } while (i5 < size);
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            boolean z4;
            this.onNodePlacedCalled = true;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                l0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            boolean z5 = false;
            if (zIndex == this.zIndex) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        z5 = true;
                    }
                    if (z5) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder;
                        parent$ui_release.getLayoutDelegate$ui_release().nextChildPlaceOrder++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
            Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!IntOffset.m6171equalsimpl0(j5, this.lastPosition)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            boolean z4 = false;
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(LayoutNodeLayoutDelegate.this.layoutNode)) {
                NodeCoordinator wrappedBy$ui_release = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
                l0.m(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate$ui_release, IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5), 0.0f, 4, null);
            }
            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release2 != null && !lookaheadPassDelegate$ui_release2.getPlacedOnce$ui_release()) {
                z4 = true;
            }
            if (true ^ z4) {
                m5148placeOuterCoordinatorf8xVGno(j5, f5, lVar);
                return;
            }
            throw new IllegalArgumentException("Error: Placement happened before lookahead.".toString());
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                mo4999placeAtf8xVGno(lookaheadPassDelegate$ui_release.m5146getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release());
                return;
            }
            throw new IllegalStateException("invalid lookaheadDelegate".toString());
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m5150remeasureBRTryo0(long j5) {
            boolean z4;
            boolean z5 = true;
            if (!LayoutNodeLayoutDelegate.this.layoutNode.isDeactivated()) {
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.layoutNode);
                LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.layoutNode;
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                layoutNode.setCanMultiMeasure$ui_release(z4);
                if (!LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && Constraints.m5993equalsimpl0(m5046getMeasurementConstraintsmsEJaDk(), j5)) {
                    Owner.forceMeasureTheSubtree$default(requireOwner, LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                    LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2.INSTANCE);
                this.measuredOnce = true;
                long mo5005getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo5005getSizeYbymL2g();
                m5048setMeasurementConstraintsBRTryo0(j5);
                LayoutNodeLayoutDelegate.this.m5142performMeasureBRTryo0(j5);
                if (IntSize.m6212equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo5005getSizeYbymL2g(), mo5005getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z5 = false;
                }
                m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z5;
            }
            throw new IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        public final void replace() {
            LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (this.placedOnce) {
                    boolean isPlaced = isPlaced();
                    m5148placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                    if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                        LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                    }
                    return;
                }
                throw new IllegalStateException("replace called on unplaced item".toString());
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z4) {
            this.childDelegatesDirty = z4;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z4) {
            this.duringAlignmentLinesQuery = z4;
        }

        public final void setMeasuredByParent$ui_release(@l LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public void setPlaced$ui_release(boolean z4) {
            this.isPlaced = z4;
        }

        public final void setPlacedByParent$ui_release(boolean z4) {
            this.isPlacedByParent = z4;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }
    }

    public LayoutNodeLayoutDelegate(@l LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0, reason: not valid java name */
    public final void m5141performLookaheadMeasureBRTryo0(long j5) {
        this.layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j5), 2, null);
        markLookaheadLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = LayoutNode.LayoutState.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
    public final void m5142performMeasureBRTryo0(long j5) {
        boolean z4;
        LayoutNode.LayoutState layoutState = this.layoutState;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState == layoutState2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            this.layoutState = layoutState3;
            this.measurePending = false;
            this.performMeasureConstraints = j5;
            LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
            if (this.layoutState == layoutState3) {
                markLayoutPending$ui_release();
                this.layoutState = layoutState2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new LookaheadPassDelegate();
        }
    }

    @l
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final boolean getDetachedFromParentLookaheadPass$ui_release() {
        return this.detachedFromParentLookaheadPass;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    @m
    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5143getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m5149getLastConstraintsDWUhwKw();
    }

    @m
    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5144getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m5145getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    @l
    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    @m
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.lookaheadLayoutPending;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.lookaheadMeasurePending;
    }

    @m
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.lookaheadPassDelegate;
    }

    @l
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.measurePassDelegate;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    @l
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            boolean z4 = false;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                z4 = true;
            }
            if (z4) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null && (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) != null) {
            alignmentLines.reset$ui_release();
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i5) {
        boolean z4;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i6 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i5;
        boolean z5 = false;
        if (i6 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i5 == 0) {
            z5 = true;
        }
        if (z4 != z5) {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNodeLayoutDelegate = parent$ui_release.getLayoutDelegate$ui_release();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate != null) {
                if (i5 == 0) {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z4) {
        if (this.coordinatesAccessedDuringModifierPlacement != z4) {
            this.coordinatesAccessedDuringModifierPlacement = z4;
            if (z4 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (!z4 && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z4) {
        if (this.coordinatesAccessedDuringPlacement != z4) {
            this.coordinatesAccessedDuringPlacement = z4;
            if (z4 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else if (!z4 && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0.updateParentData() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateParentData() {
        /*
            r5 = this;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate r0 = r5.measurePassDelegate
            boolean r0 = r0.updateParentData()
            r1 = 0
            r2 = 3
            r3 = 0
            if (r0 == 0) goto L16
            androidx.compose.ui.node.LayoutNode r0 = r5.layoutNode
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            if (r0 == 0) goto L16
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(r0, r3, r3, r2, r1)
        L16:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate r0 = r5.lookaheadPassDelegate
            if (r0 == 0) goto L22
            boolean r0 = r0.updateParentData()
            r4 = 1
            if (r0 != r4) goto L22
            goto L23
        L22:
            r4 = r3
        L23:
            if (r4 == 0) goto L44
            androidx.compose.ui.node.LayoutNode r0 = r5.layoutNode
            boolean r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(r0)
            if (r0 == 0) goto L39
            androidx.compose.ui.node.LayoutNode r0 = r5.layoutNode
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            if (r0 == 0) goto L44
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(r0, r3, r3, r2, r1)
            goto L44
        L39:
            androidx.compose.ui.node.LayoutNode r0 = r5.layoutNode
            androidx.compose.ui.node.LayoutNode r0 = r0.getParent$ui_release()
            if (r0 == 0) goto L44
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(r0, r3, r3, r2, r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.updateParentData():void");
    }
}
