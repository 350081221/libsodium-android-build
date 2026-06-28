package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.comparisons.h;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    @l
    public static final Rect boundsInParent(@l LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) {
            return new Rect(0.0f, 0.0f, IntSize.m6214getWidthimpl(layoutCoordinates.mo5005getSizeYbymL2g()), IntSize.m6213getHeightimpl(layoutCoordinates.mo5005getSizeYbymL2g()));
        }
        return localBoundingBoxOf$default;
    }

    @l
    public static final Rect boundsInRoot(@l LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @l
    public static final Rect boundsInWindow(@l LayoutCoordinates layoutCoordinates) {
        float H;
        float H2;
        float H3;
        float H4;
        boolean z4;
        boolean z5;
        float l02;
        float l03;
        float Q;
        float Q2;
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m6214getWidthimpl = IntSize.m6214getWidthimpl(findRootCoordinates.mo5005getSizeYbymL2g());
        float m6213getHeightimpl = IntSize.m6213getHeightimpl(findRootCoordinates.mo5005getSizeYbymL2g());
        H = u.H(boundsInRoot.getLeft(), 0.0f, m6214getWidthimpl);
        H2 = u.H(boundsInRoot.getTop(), 0.0f, m6213getHeightimpl);
        H3 = u.H(boundsInRoot.getRight(), 0.0f, m6214getWidthimpl);
        H4 = u.H(boundsInRoot.getBottom(), 0.0f, m6213getHeightimpl);
        if (H == H3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (H2 == H4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                long mo5008localToWindowMKHz9U = findRootCoordinates.mo5008localToWindowMKHz9U(OffsetKt.Offset(H, H2));
                long mo5008localToWindowMKHz9U2 = findRootCoordinates.mo5008localToWindowMKHz9U(OffsetKt.Offset(H3, H2));
                long mo5008localToWindowMKHz9U3 = findRootCoordinates.mo5008localToWindowMKHz9U(OffsetKt.Offset(H3, H4));
                long mo5008localToWindowMKHz9U4 = findRootCoordinates.mo5008localToWindowMKHz9U(OffsetKt.Offset(H, H4));
                l02 = h.l0(Offset.m3493getXimpl(mo5008localToWindowMKHz9U), Offset.m3493getXimpl(mo5008localToWindowMKHz9U2), Offset.m3493getXimpl(mo5008localToWindowMKHz9U4), Offset.m3493getXimpl(mo5008localToWindowMKHz9U3));
                l03 = h.l0(Offset.m3494getYimpl(mo5008localToWindowMKHz9U), Offset.m3494getYimpl(mo5008localToWindowMKHz9U2), Offset.m3494getYimpl(mo5008localToWindowMKHz9U4), Offset.m3494getYimpl(mo5008localToWindowMKHz9U3));
                Q = h.Q(Offset.m3493getXimpl(mo5008localToWindowMKHz9U), Offset.m3493getXimpl(mo5008localToWindowMKHz9U2), Offset.m3493getXimpl(mo5008localToWindowMKHz9U4), Offset.m3493getXimpl(mo5008localToWindowMKHz9U3));
                Q2 = h.Q(Offset.m3494getYimpl(mo5008localToWindowMKHz9U), Offset.m3494getYimpl(mo5008localToWindowMKHz9U2), Offset.m3494getYimpl(mo5008localToWindowMKHz9U4), Offset.m3494getYimpl(mo5008localToWindowMKHz9U3));
                return new Rect(l02, l03, Q, Q2);
            }
        }
        return Rect.Companion.getZero();
    }

    @l
    public static final LayoutCoordinates findRootCoordinates(@l LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy$ui_release;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy$ui_release = nodeCoordinator.getWrappedBy$ui_release();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final long positionInParent(@l LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3509getZeroF1C5BW0()) : Offset.Companion.m3509getZeroF1C5BW0();
    }

    public static final long positionInRoot(@l LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5007localToRootMKHz9U(Offset.Companion.m3509getZeroF1C5BW0());
    }

    public static final long positionInWindow(@l LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5008localToWindowMKHz9U(Offset.Companion.m3509getZeroF1C5BW0());
    }
}
