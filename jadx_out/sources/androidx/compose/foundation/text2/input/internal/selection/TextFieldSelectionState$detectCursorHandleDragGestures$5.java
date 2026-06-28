package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "change", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$5 extends n0 implements p<PointerInputChange, Offset, r2> {
    final /* synthetic */ k1.g $cursorDragDelta;
    final /* synthetic */ k1.g $cursorDragStart;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$5(k1.g gVar, TextFieldSelectionState textFieldSelectionState, k1.g gVar2) {
        super(2);
        this.$cursorDragDelta = gVar;
        this.this$0 = textFieldSelectionState;
        this.$cursorDragStart = gVar2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
        m1182invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m1182invokeUv8p0NA(@l PointerInputChange pointerInputChange, long j5) {
        TextLayoutState textLayoutState;
        TransformedTextFieldState transformedTextFieldState;
        HapticFeedback hapticFeedback;
        TransformedTextFieldState transformedTextFieldState2;
        k1.g gVar = this.$cursorDragDelta;
        gVar.element = Offset.m3498plusMKHz9U(gVar.element, j5);
        this.this$0.m1176updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m3498plusMKHz9U(this.$cursorDragStart.element, this.$cursorDragDelta.element));
        textLayoutState = this.this$0.textLayoutState;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        long TextRange = TextRangeKt.TextRange(layoutResult.m5517getOffsetForPositionk4lQ0M(this.this$0.m1179getHandleDragPositionF1C5BW0()));
        transformedTextFieldState = this.this$0.textFieldState;
        if (TextRange.m5538equalsimpl0(TextRange, transformedTextFieldState.getText().mo1076getSelectionInCharsd9O1mEE())) {
            return;
        }
        pointerInputChange.consume();
        hapticFeedback = this.this$0.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
        }
        transformedTextFieldState2 = this.this$0.textFieldState;
        transformedTextFieldState2.m1146selectCharsIn5zctL8(TextRange);
    }
}
