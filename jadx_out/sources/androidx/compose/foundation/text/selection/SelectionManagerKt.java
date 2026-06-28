package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\r\u001a\u00020\f2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00000\u00070\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001b\u001a\u00020\f*\u00020\nH\u0000\u001a\u001e\u0010 \u001a\u00020\u001d*\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "merge", "T", "", "firstAndLast", "Lkotlin/u0;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/geometry/Rect;", "getSelectedRegionRect", "Landroidx/compose/foundation/text/selection/SelectionManager;", "manager", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "getMagnifierCenter", "visibleBounds", TypedValues.CycleType.S_WAVE_OFFSET, "", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "containsInclusive", "invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,991:1\n33#2,6:992\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n870#1:992,6\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManagerKt {

    @l
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1030calculateSelectionMagnifierCenterAndroidO0kMr_c(@l SelectionManager selectionManager, long j5) {
        int i5;
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        if (draggingHandle == null) {
            i5 = -1;
        } else {
            i5 = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i5 != -1) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new j0();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                }
                return m1032getMagnifierCenterJVtK1S4(selectionManager, j5, selection.getEnd());
            }
            return m1032getMagnifierCenterJVtK1S4(selectionManager, j5, selection.getStart());
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1031containsInclusiveUv8p0NA(@l Rect rect, long j5) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        if (left <= m3493getXimpl && m3493getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float m3494getYimpl = Offset.m3494getYimpl(j5);
            if (top <= m3494getYimpl && m3494getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        Object y22;
        Object m32;
        List<T> L;
        int size = list.size();
        if (size != 0 && size != 1) {
            y22 = e0.y2(list);
            m32 = e0.m3(list);
            L = w.L(y22, m32);
            return L;
        }
        return list;
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1032getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j5, Selection.AnchorInfo anchorInfo) {
        float H;
        boolean z4;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        Offset m1019getCurrentDragPosition_m7T9E = selectionManager.m1019getCurrentDragPosition_m7T9E();
        l0.m(m1019getCurrentDragPosition_m7T9E);
        float m3493getXimpl = Offset.m3493getXimpl(layoutCoordinates.mo5006localPositionOfR5De75A(containerLayoutCoordinates, m1019getCurrentDragPosition_m7T9E.m3503unboximpl()));
        long mo981getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo981getRangeOfLineContainingjx7JFs(offset);
        boolean z5 = true;
        if (TextRange.m5539getCollapsedimpl(mo981getRangeOfLineContainingjx7JFs)) {
            H = anchorSelectable$foundation_release.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m5545getStartimpl(mo981getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m5540getEndimpl(mo981getRangeOfLineContainingjx7JFs) - 1);
            H = u.H(m3493getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (H == -1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        if (Math.abs(m3493getXimpl - H) > IntSize.m6214getWidthimpl(j5) / 2) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
        if (centerYForOffset != -1.0f) {
            z5 = false;
        }
        if (z5) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(H, centerYForOffset));
    }

    @l
    @VisibleForTesting
    public static final Rect getSelectedRegionRect(@l List<? extends u0<? extends Selectable, Selection>> list, @l LayoutCoordinates layoutCoordinates) {
        int i5;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float component1 = rect.component1();
        float component2 = rect.component2();
        float component3 = rect.component3();
        float component4 = rect.component4();
        int size = list.size();
        char c5 = 0;
        int i6 = 0;
        while (i6 < size) {
            u0<? extends Selectable, Selection> u0Var = list.get(i6);
            Selectable component12 = u0Var.component1();
            Selection component22 = u0Var.component2();
            int offset = component22.getStart().getOffset();
            int offset2 = component22.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = component12.getLayoutCoordinates()) != null) {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c5] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c5] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float component13 = rect2.component1();
                float component23 = rect2.component2();
                float component32 = rect2.component3();
                float component42 = rect2.component4();
                int length = iArr.length;
                i5 = size;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = length;
                    Rect boundingBox = component12.getBoundingBox(iArr[i7]);
                    component13 = Math.min(component13, boundingBox.getLeft());
                    component23 = Math.min(component23, boundingBox.getTop());
                    component32 = Math.max(component32, boundingBox.getRight());
                    component42 = Math.max(component42, boundingBox.getBottom());
                    i7++;
                    length = i8;
                }
                long Offset = OffsetKt.Offset(component13, component23);
                long Offset2 = OffsetKt.Offset(component32, component42);
                long mo5006localPositionOfR5De75A = layoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates2, Offset);
                long mo5006localPositionOfR5De75A2 = layoutCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates2, Offset2);
                component1 = Math.min(component1, Offset.m3493getXimpl(mo5006localPositionOfR5De75A));
                component2 = Math.min(component2, Offset.m3494getYimpl(mo5006localPositionOfR5De75A));
                component3 = Math.max(component3, Offset.m3493getXimpl(mo5006localPositionOfR5De75A2));
                component4 = Math.max(component4, Offset.m3494getYimpl(mo5006localPositionOfR5De75A2));
            } else {
                i5 = size;
            }
            i6++;
            size = i5;
            c5 = 0;
        }
        return new Rect(component1, component2, component3, component4);
    }

    @m
    public static final Selection merge(@m Selection selection, @m Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    @l
    public static final Rect visibleBounds(@l LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m3531Rect0a9Yr6o(layoutCoordinates.mo5010windowToLocalMKHz9U(boundsInWindow.m3528getTopLeftF1C5BW0()), layoutCoordinates.mo5010windowToLocalMKHz9U(boundsInWindow.m3522getBottomRightF1C5BW0()));
    }
}
