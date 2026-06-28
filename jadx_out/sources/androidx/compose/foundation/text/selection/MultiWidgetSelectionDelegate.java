package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010!\u001a\u00020 \u0012\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0%\u0012\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001d\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u00020\u0013*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010.\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "Lkotlin/r2;", "appendSelectableInfoToBuilder", "Landroidx/compose/foundation/text/selection/Selection;", "getSelectAllSelection", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "", "getLineLeft", "getLineRight", "getCenterYForOffset", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "", "selectableId", "J", "getSelectableId", "()J", "Lkotlin/Function0;", "coordinatesCallback", "Lv3/a;", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "_previousTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "_previousLastVisibleOffset", "I", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "lastVisibleOffset", "<init>", "(JLv3/a;Lv3/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    private int _previousLastVisibleOffset = -1;

    @m
    private TextLayoutResult _previousTextLayoutResult;

    @l
    private final v3.a<LayoutCoordinates> coordinatesCallback;

    @l
    private final v3.a<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j5, @l v3.a<? extends LayoutCoordinates> aVar, @l v3.a<TextLayoutResult> aVar2) {
        this.selectableId = j5;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int lineCount;
        int B;
        if (this._previousTextLayoutResult != textLayoutResult) {
            if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                B = u.B(textLayoutResult.getLineForVerticalPosition(IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                while (B >= 0 && textLayoutResult.getLineTop(B) >= IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g())) {
                    B--;
                }
                lineCount = u.u(B, 0);
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
            lineCount = textLayoutResult.getLineCount() - 1;
            this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
            this._previousTextLayoutResult = textLayoutResult;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(@l SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult invoke;
        long m3497minusMKHz9U;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (invoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = selectionLayoutBuilder.getContainerCoordinates();
        Offset.Companion companion = Offset.Companion;
        long mo5006localPositionOfR5De75A = containerCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, companion.m3509getZeroF1C5BW0());
        long m3497minusMKHz9U2 = Offset.m3497minusMKHz9U(selectionLayoutBuilder.m995getCurrentPositionF1C5BW0(), mo5006localPositionOfR5De75A);
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(selectionLayoutBuilder.m996getPreviousHandlePositionF1C5BW0())) {
            m3497minusMKHz9U = companion.m3508getUnspecifiedF1C5BW0();
        } else {
            m3497minusMKHz9U = Offset.m3497minusMKHz9U(selectionLayoutBuilder.m996getPreviousHandlePositionF1C5BW0(), mo5006localPositionOfR5De75A);
        }
        MultiWidgetSelectionDelegateKt.m982appendSelectableInfoParwq6A(selectionLayoutBuilder, invoke, m3497minusMKHz9U2, m3497minusMKHz9U, getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @l
    public Rect getBoundingBox(int i5) {
        int I;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Rect.Companion.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.Companion.getZero();
        }
        I = u.I(i5, 0, length - 1);
        return invoke.getBoundingBox(I);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int i5) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(i5)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = invoke.getLineTop(lineForOffset);
        return ((invoke.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo980getHandlePositiondBAh8RU(@l Selection selection, boolean z4) {
        Selection.AnchorInfo end;
        int I;
        if ((z4 && selection.getStart().getSelectableId() != getSelectableId()) || (!z4 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        if (z4) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        I = u.I(end.getOffset(), 0, getLastVisibleOffset(invoke));
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, I, z4, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @m
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates invoke = this.coordinatesCallback.invoke();
        if (invoke != null && invoke.isAttached()) {
            return invoke;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int i5) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(i5)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        return invoke.getLineLeft(lineForOffset);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int i5) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(i5)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        return invoke.getLineRight(lineForOffset);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo981getRangeOfLineContainingjx7JFs(int i5) {
        int I;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return TextRange.Companion.m5550getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(invoke);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m5550getZerod9O1mEE();
        }
        I = u.I(i5, 0, lastVisibleOffset - 1);
        int lineForOffset = invoke.getLineForOffset(I);
        return TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @m
    public Selection getSelectAllSelection() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(invoke.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(invoke.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @l
    public AnnotatedString getText() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return new AnnotatedString("", null, null, 6, null);
        }
        return invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return getLastVisibleOffset(invoke);
    }
}
