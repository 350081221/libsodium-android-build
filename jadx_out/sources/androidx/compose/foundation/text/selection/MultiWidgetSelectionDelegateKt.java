package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import java.util.Comparator;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a6\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\u0013\u001a\u00020\u0011*\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u001c\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002\u001a\"\u0010%\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "previousHandlePosition", "", "selectableId", "Lkotlin/r2;", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "appendSelectableInfo", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "currentSelectableId", "", "currentTextLength", "getPreviousAdjustedOffset", "position", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/foundation/text/selection/Direction;", "getXDirection-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "getXDirection", "getYDirection-3MmeM6k", "getYDirection", "anchorSelectableId", "getDirectionById", "currentDirection", "otherDirection", "", "isSelected", "getOffsetForPosition-3MmeM6k", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "getOffsetForPosition", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m982appendSelectableInfoParwq6A(@l SelectionLayoutBuilder selectionLayoutBuilder, @l TextLayoutResult textLayoutResult, long j5, long j6, long j7) {
        Selection.AnchorInfo anchorInfo;
        Direction appendSelectableInfo_Parwq6A$otherDirection;
        Direction direction;
        Direction direction2;
        Direction direction3;
        Direction direction4;
        int i5;
        int i6;
        int i7;
        Selection.AnchorInfo start;
        int m983getOffsetForPosition3MmeM6k;
        int i8;
        Selection.AnchorInfo end;
        Selection.AnchorInfo anchorInfo2;
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g()));
        Direction m984getXDirection3MmeM6k = m984getXDirection3MmeM6k(j5, rect);
        Direction m985getYDirection3MmeM6k = m985getYDirection3MmeM6k(j5, rect);
        if (selectionLayoutBuilder.isStartHandle()) {
            Selection previousSelection = selectionLayoutBuilder.getPreviousSelection();
            if (previousSelection != null) {
                anchorInfo2 = previousSelection.getEnd();
            } else {
                anchorInfo2 = null;
            }
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(m984getXDirection3MmeM6k, m985getYDirection3MmeM6k, selectionLayoutBuilder, j7, anchorInfo2);
            direction3 = appendSelectableInfo_Parwq6A$otherDirection;
            direction4 = direction3;
            direction = m984getXDirection3MmeM6k;
            direction2 = m985getYDirection3MmeM6k;
        } else {
            Selection previousSelection2 = selectionLayoutBuilder.getPreviousSelection();
            if (previousSelection2 != null) {
                anchorInfo = previousSelection2.getStart();
            } else {
                anchorInfo = null;
            }
            appendSelectableInfo_Parwq6A$otherDirection = appendSelectableInfo_Parwq6A$otherDirection(m984getXDirection3MmeM6k, m985getYDirection3MmeM6k, selectionLayoutBuilder, j7, anchorInfo);
            direction = appendSelectableInfo_Parwq6A$otherDirection;
            direction2 = direction;
            direction3 = m984getXDirection3MmeM6k;
            direction4 = m985getYDirection3MmeM6k;
        }
        if (!isSelected(SelectionLayoutKt.resolve2dDirection(m984getXDirection3MmeM6k, m985getYDirection3MmeM6k), appendSelectableInfo_Parwq6A$otherDirection)) {
            return;
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (selectionLayoutBuilder.isStartHandle()) {
            int m983getOffsetForPosition3MmeM6k2 = m983getOffsetForPosition3MmeM6k(j5, textLayoutResult);
            Selection previousSelection3 = selectionLayoutBuilder.getPreviousSelection();
            if (previousSelection3 != null && (end = previousSelection3.getEnd()) != null) {
                i8 = getPreviousAdjustedOffset(end, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j7, length);
            } else {
                i8 = m983getOffsetForPosition3MmeM6k2;
            }
            i7 = m983getOffsetForPosition3MmeM6k2;
            i6 = i8;
        } else {
            int m983getOffsetForPosition3MmeM6k3 = m983getOffsetForPosition3MmeM6k(j5, textLayoutResult);
            Selection previousSelection4 = selectionLayoutBuilder.getPreviousSelection();
            if (previousSelection4 != null && (start = previousSelection4.getStart()) != null) {
                i5 = getPreviousAdjustedOffset(start, selectionLayoutBuilder.getSelectableIdOrderingComparator(), j7, length);
            } else {
                i5 = m983getOffsetForPosition3MmeM6k3;
            }
            i6 = m983getOffsetForPosition3MmeM6k3;
            i7 = i5;
        }
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(j6)) {
            m983getOffsetForPosition3MmeM6k = -1;
        } else {
            m983getOffsetForPosition3MmeM6k = m983getOffsetForPosition3MmeM6k(j6, textLayoutResult);
        }
        selectionLayoutBuilder.appendInfo(j7, i7, direction, direction2, i6, direction3, direction4, m983getOffsetForPosition3MmeM6k, textLayoutResult);
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j5, Selection.AnchorInfo anchorInfo) {
        Direction directionById;
        if (anchorInfo == null || (directionById = getDirectionById(selectionLayoutBuilder, anchorInfo.getSelectableId(), j5)) == null) {
            return SelectionLayoutKt.resolve2dDirection(direction, direction2);
        }
        return directionById;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder selectionLayoutBuilder, long j5, long j6) {
        int compare = selectionLayoutBuilder.getSelectableIdOrderingComparator().compare(Long.valueOf(j5), Long.valueOf(j6));
        if (compare < 0) {
            return Direction.BEFORE;
        }
        if (compare > 0) {
            return Direction.AFTER;
        }
        return Direction.ON;
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m983getOffsetForPosition3MmeM6k(long j5, TextLayoutResult textLayoutResult) {
        if (Offset.m3494getYimpl(j5) <= 0.0f) {
            return 0;
        }
        if (Offset.m3494getYimpl(j5) >= textLayoutResult.getMultiParagraph().getHeight()) {
            return textLayoutResult.getLayoutInput().getText().length();
        }
        return textLayoutResult.m5517getOffsetForPositionk4lQ0M(j5);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo anchorInfo, Comparator<Long> comparator, long j5, int i5) {
        int compare = comparator.compare(Long.valueOf(anchorInfo.getSelectableId()), Long.valueOf(j5));
        if (compare < 0) {
            return 0;
        }
        if (compare <= 0) {
            return anchorInfo.getOffset();
        }
        return i5;
    }

    /* renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m984getXDirection3MmeM6k(long j5, Rect rect) {
        if (Offset.m3493getXimpl(j5) < rect.getLeft()) {
            return Direction.BEFORE;
        }
        if (Offset.m3493getXimpl(j5) > rect.getRight()) {
            return Direction.AFTER;
        }
        return Direction.ON;
    }

    /* renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m985getYDirection3MmeM6k(long j5, Rect rect) {
        if (Offset.m3494getYimpl(j5) < rect.getTop()) {
            return Direction.BEFORE;
        }
        if (Offset.m3494getYimpl(j5) > rect.getBottom()) {
            return Direction.AFTER;
        }
        return Direction.ON;
    }

    private static final boolean isSelected(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }
}
