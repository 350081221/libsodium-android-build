package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.k1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\f*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"UNASSIGNED_SLOT", "", "getTextFieldSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "previousSelectionRange", "Landroidx/compose/ui/text/TextRange;", "isStartOfSelection", "", "isStartHandle", "getTextFieldSelectionLayout-RcvT-LA", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "resolve2dDirection", "Landroidx/compose/foundation/text/selection/Direction;", "x", "y", "getTextDirectionForOffset", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", TypedValues.CycleType.S_WAVE_OFFSET, "isCollapsed", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "isOffsetAnEmptyLine", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult textLayoutResult, int i5) {
        if (isOffsetAnEmptyLine(textLayoutResult, i5)) {
            return textLayoutResult.getParagraphDirection(i5);
        }
        return textLayoutResult.getBidiRunDirection(i5);
    }

    @l
    /* renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m997getTextFieldSelectionLayoutRcvTLA(@l TextLayoutResult textLayoutResult, int i5, int i6, int i7, long j5, boolean z4, boolean z5) {
        Selection selection;
        if (z4) {
            selection = null;
        } else {
            selection = new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m5545getStartimpl(j5)), TextRange.m5545getStartimpl(j5), 1L), new Selection.AnchorInfo(getTextDirectionForOffset(textLayoutResult, TextRange.m5540getEndimpl(j5)), TextRange.m5540getEndimpl(j5), 1L), TextRange.m5544getReversedimpl(j5));
        }
        return new SingleSelectionLayout(z5, 1, 1, selection, new SelectableInfo(1L, 1, i5, i6, i7, textLayoutResult));
    }

    public static final boolean isCollapsed(@m Selection selection, @m SelectionLayout selectionLayout) {
        Selection.AnchorInfo end;
        Selection.AnchorInfo start;
        if (selection == null || selectionLayout == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            if (selection.getStart().getOffset() == selection.getEnd().getOffset()) {
                return true;
            }
            return false;
        }
        if (selection.getHandlesCrossed()) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        if (end.getOffset() != 0) {
            return false;
        }
        if (selection.getHandlesCrossed()) {
            start = selection.getEnd();
        } else {
            start = selection.getStart();
        }
        if (selectionLayout.getFirstInfo().getTextLength() != start.getOffset()) {
            return false;
        }
        k1.a aVar = new k1.a();
        aVar.element = true;
        selectionLayout.forEachMiddleInfo(new SelectionLayoutKt$isCollapsed$1(aVar));
        return aVar.element;
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult textLayoutResult, int i5) {
        boolean z4;
        boolean z5;
        if (textLayoutResult.getLayoutInput().getText().length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            int lineForOffset = textLayoutResult.getLineForOffset(i5);
            if ((i5 != 0 && lineForOffset == textLayoutResult.getLineForOffset(i5 - 1)) || (i5 != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i5 + 1))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Direction resolve2dDirection(@l Direction direction, @l Direction direction2) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i5 = iArr[direction2.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return Direction.AFTER;
                }
                throw new j0();
            }
            int i6 = iArr[direction.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        return Direction.AFTER;
                    }
                    throw new j0();
                }
                return Direction.ON;
            }
            return Direction.BEFORE;
        }
        return Direction.BEFORE;
    }
}
