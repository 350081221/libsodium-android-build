package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import java.util.Set;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&J\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH¦\u0002R\u001a\u0010\"\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006.À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "Landroidx/compose/ui/geometry/Offset;", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lkotlin/r2;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface LayoutCoordinates {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m5011transformFromEL8BTi8(@l LayoutCoordinates layoutCoordinates, @l LayoutCoordinates layoutCoordinates2, @l float[] fArr) {
            LayoutCoordinates.super.mo5009transformFromEL8BTi8(layoutCoordinates2, fArr);
        }
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z4);
    }

    int get(@l AlignmentLine alignmentLine);

    @m
    LayoutCoordinates getParentCoordinates();

    @m
    LayoutCoordinates getParentLayoutCoordinates();

    @l
    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo5005getSizeYbymL2g();

    boolean isAttached();

    @l
    Rect localBoundingBoxOf(@l LayoutCoordinates layoutCoordinates, boolean z4);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo5006localPositionOfR5De75A(@l LayoutCoordinates layoutCoordinates, long j5);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo5007localToRootMKHz9U(long j5);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo5008localToWindowMKHz9U(long j5);

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo5009transformFromEL8BTi8(@l LayoutCoordinates layoutCoordinates, @l float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo5010windowToLocalMKHz9U(long j5);
}
