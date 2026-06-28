package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bp\u0010qJ\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0007J\b\u0010\u001d\u001a\u00020\u0005H\u0014J)\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u001d\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0007R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010C\u001a\u0004\u0018\u00010!2\b\u0010B\u001a\u0004\u0018\u00010!8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\"\u0004\bE\u0010FR&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020!8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010OR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0016\u0010_\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010KR\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "Lkotlin/r2;", "placeSelf--gyyYBs", "(J)V", "placeSelf", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui_release", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getCachedAlignmentLine", "replace$ui_release", "()V", "replace", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "placeAt-f8xVGno", "(JFLv3/l;)V", "placeAt", "placeSelfApparentToRealOffset--gyyYBs$ui_release", "placeSelfApparentToRealOffset", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLv3/a;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "positionIn", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "", "oldAlignmentLines", "Ljava/util/Map;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "result", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "set_measureResult", "(Landroidx/compose/ui/layout/MeasureResult;)V", "cachedAlignmentLinesMap", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "", "getHasMeasureResult", "()Z", "hasMeasureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "", "getParentData", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,255:1\n1#2:256\n86#3:257\n86#3:258\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n210#1:257\n249#1:258\n*E\n"})
/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;

    @m
    private MeasureResult _measureResult;

    @l
    private final NodeCoordinator coordinator;

    @m
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m6182getZeronOccac();

    @l
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    @l
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();

    public LookaheadDelegate(@l NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: access$setMeasurementConstraints-BRTryo0 */
    public static final /* synthetic */ void m5152access$setMeasurementConstraintsBRTryo0(LookaheadDelegate lookaheadDelegate, long j5) {
        lookaheadDelegate.m5048setMeasurementConstraintsBRTryo0(j5);
    }

    public static final /* synthetic */ void access$set_measureResult(LookaheadDelegate lookaheadDelegate, MeasureResult measureResult) {
        lookaheadDelegate.set_measureResult(measureResult);
    }

    /* renamed from: placeSelf--gyyYBs */
    private final void m5153placeSelfgyyYBs(long j5) {
        if (!IntOffset.m6171equalsimpl0(mo5151getPositionnOccac(), j5)) {
            m5157setPositiongyyYBs(j5);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
    }

    public final void set_measureResult(MeasureResult measureResult) {
        r2 r2Var;
        boolean z4;
        if (measureResult != null) {
            m5047setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            m5047setMeasuredSizeozmzZPI(IntSize.Companion.m6219getZeroYbymL2g());
        }
        if (!l0.g(this._measureResult, measureResult) && measureResult != null) {
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (map != null && !map.isEmpty()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((!z4 || (!measureResult.getAlignmentLines().isEmpty())) && !l0.g(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(measureResult.getAlignmentLines());
            }
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        l0.m(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@l AlignmentLine alignmentLine) {
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @l
    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @l
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @l
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @l
    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @m
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @m
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo5151getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i5) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        l0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i5);
    }

    public int maxIntrinsicWidth(int i5) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        l0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i5);
    }

    public int minIntrinsicHeight(int i5) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        l0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i5);
    }

    public int minIntrinsicWidth(int i5) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        l0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        l0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i5);
    }

    @l
    /* renamed from: performingMeasure-K40F9xA */
    public final Placeable m5154performingMeasureK40F9xA(long j5, @l v3.a<? extends MeasureResult> aVar) {
        m5048setMeasurementConstraintsBRTryo0(j5);
        set_measureResult(aVar.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo4999placeAtf8xVGno(long j5, float f5, @m v3.l<? super GraphicsLayerScope, r2> lVar) {
        m5153placeSelfgyyYBs(j5);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release */
    public final void m5155placeSelfApparentToRealOffsetgyyYBs$ui_release(long j5) {
        long m5044getApparentToRealOffsetnOccac = m5044getApparentToRealOffsetnOccac();
        m5153placeSelfgyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(j5) + IntOffset.m6172getXimpl(m5044getApparentToRealOffsetnOccac), IntOffset.m6173getYimpl(j5) + IntOffset.m6173getYimpl(m5044getApparentToRealOffsetnOccac)));
    }

    /* renamed from: positionIn-Bjo55l4$ui_release */
    public final long m5156positionInBjo55l4$ui_release(@l LookaheadDelegate lookaheadDelegate) {
        long m6182getZeronOccac = IntOffset.Companion.m6182getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!l0.g(lookaheadDelegate2, lookaheadDelegate)) {
            long mo5151getPositionnOccac = lookaheadDelegate2.mo5151getPositionnOccac();
            m6182getZeronOccac = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6182getZeronOccac) + IntOffset.m6172getXimpl(mo5151getPositionnOccac), IntOffset.m6173getYimpl(m6182getZeronOccac) + IntOffset.m6173getYimpl(mo5151getPositionnOccac));
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            l0.m(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            l0.m(lookaheadDelegate2);
        }
        return m6182getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4999placeAtf8xVGno(mo5151getPositionnOccac(), 0.0f, null);
    }

    /* renamed from: setPosition--gyyYBs */
    public void m5157setPositiongyyYBs(long j5) {
        this.position = j5;
    }
}
