package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b9\u0010:J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020+8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010%R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00107\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lkotlin/r2;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadOffset-F1C5BW0", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,134:1\n1#2:135\n179#3:136\n157#3:139\n179#3:141\n157#3:144\n86#4:137\n79#4:138\n86#4:140\n86#4:142\n79#4:143\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n83#1:136\n84#1:139\n89#1:141\n95#1:144\n83#1:137\n83#1:138\n88#1:140\n91#1:142\n88#1:143\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;

    @l
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(@l LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m5015getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m3497minusMKHz9U(mo5006localPositionOfR5De75A(coordinates, companion.m3509getZeroF1C5BW0()), getCoordinator().mo5006localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m3509getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(@l AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    @l
    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @l
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null && (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) != null) {
                return lookaheadDelegate.getCoordinates();
            }
            return null;
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @m
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (isAttached()) {
            NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
                return null;
            }
            return lookaheadDelegate.getCoordinates();
        }
        throw new IllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo5005getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public Rect localBoundingBoxOf(@l LayoutCoordinates layoutCoordinates, boolean z4) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z4);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo5006localPositionOfR5De75A(@l LayoutCoordinates layoutCoordinates, long j5) {
        int L0;
        int L02;
        int L03;
        int L04;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
            lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
            LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                long m5156positionInBjo55l4$ui_release = lookaheadDelegate.m5156positionInBjo55l4$ui_release(lookaheadDelegate2);
                L03 = d.L0(Offset.m3493getXimpl(j5));
                L04 = d.L0(Offset.m3494getYimpl(j5));
                long IntOffset = IntOffsetKt.IntOffset(L03, L04);
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m5156positionInBjo55l4$ui_release) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(m5156positionInBjo55l4$ui_release) + IntOffset.m6173getYimpl(IntOffset));
                long m5156positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m5156positionInBjo55l4$ui_release(lookaheadDelegate2);
                long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset2) - IntOffset.m6172getXimpl(m5156positionInBjo55l4$ui_release2), IntOffset.m6173getYimpl(IntOffset2) - IntOffset.m6173getYimpl(m5156positionInBjo55l4$ui_release2));
                return OffsetKt.Offset(IntOffset.m6172getXimpl(IntOffset3), IntOffset.m6173getYimpl(IntOffset3));
            }
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
            long m5156positionInBjo55l4$ui_release3 = lookaheadDelegate.m5156positionInBjo55l4$ui_release(rootLookaheadDelegate);
            long mo5151getPositionnOccac = rootLookaheadDelegate.mo5151getPositionnOccac();
            long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m5156positionInBjo55l4$ui_release3) + IntOffset.m6172getXimpl(mo5151getPositionnOccac), IntOffset.m6173getYimpl(m5156positionInBjo55l4$ui_release3) + IntOffset.m6173getYimpl(mo5151getPositionnOccac));
            L0 = d.L0(Offset.m3493getXimpl(j5));
            L02 = d.L0(Offset.m3494getYimpl(j5));
            long IntOffset5 = IntOffsetKt.IntOffset(L0, L02);
            long IntOffset6 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset4) + IntOffset.m6172getXimpl(IntOffset5), IntOffset.m6173getYimpl(IntOffset4) + IntOffset.m6173getYimpl(IntOffset5));
            LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
            long m5156positionInBjo55l4$ui_release4 = lookaheadDelegate3.m5156positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
            long mo5151getPositionnOccac2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).mo5151getPositionnOccac();
            long IntOffset7 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m5156positionInBjo55l4$ui_release4) + IntOffset.m6172getXimpl(mo5151getPositionnOccac2), IntOffset.m6173getYimpl(m5156positionInBjo55l4$ui_release4) + IntOffset.m6173getYimpl(mo5151getPositionnOccac2));
            long IntOffset8 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset6) - IntOffset.m6172getXimpl(IntOffset7), IntOffset.m6173getYimpl(IntOffset6) - IntOffset.m6173getYimpl(IntOffset7));
            NodeCoordinator wrappedBy$ui_release = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy$ui_release();
            l0.m(wrappedBy$ui_release);
            NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate.getCoordinator().getWrappedBy$ui_release();
            l0.m(wrappedBy$ui_release2);
            return wrappedBy$ui_release.mo5006localPositionOfR5De75A(wrappedBy$ui_release2, OffsetKt.Offset(IntOffset.m6172getXimpl(IntOffset8), IntOffset.m6173getYimpl(IntOffset8)));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        return Offset.m3498plusMKHz9U(mo5006localPositionOfR5De75A(rootLookaheadDelegate2.getLookaheadLayoutCoordinates(), j5), rootLookaheadDelegate2.getCoordinator().getCoordinates().mo5006localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3509getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo5007localToRootMKHz9U(long j5) {
        return getCoordinator().mo5007localToRootMKHz9U(Offset.m3498plusMKHz9U(j5, m5015getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo5008localToWindowMKHz9U(long j5) {
        return getCoordinator().mo5008localToWindowMKHz9U(Offset.m3498plusMKHz9U(j5, m5015getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo5009transformFromEL8BTi8(@l LayoutCoordinates layoutCoordinates, @l float[] fArr) {
        getCoordinator().mo5009transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo5010windowToLocalMKHz9U(long j5) {
        return Offset.m3498plusMKHz9U(getCoordinator().mo5010windowToLocalMKHz9U(j5), m5015getLookaheadOffsetF1C5BW0());
    }
}
