package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous parameter 0>", "Landroidx/compose/ui/geometry/Offset;", "delta", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$5 extends n0 implements p<PointerInputChange, Offset, r2> {
    final /* synthetic */ k1.g $dragBeginPosition;
    final /* synthetic */ k1.g $dragTotalDistance;
    final /* synthetic */ Handle $handle;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$5(k1.g gVar, TextFieldSelectionState textFieldSelectionState, Handle handle, k1.g gVar2, boolean z4) {
        super(2);
        this.$dragTotalDistance = gVar;
        this.this$0 = textFieldSelectionState;
        this.$handle = handle;
        this.$dragBeginPosition = gVar2;
        this.$isStartHandle = z4;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
        m1184invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m1184invokeUv8p0NA(@l PointerInputChange pointerInputChange, long j5) {
        TextLayoutState textLayoutState;
        TransformedTextFieldState transformedTextFieldState;
        int m5545getStartimpl;
        int m5517getOffsetForPositionk4lQ0M;
        TransformedTextFieldState transformedTextFieldState2;
        TransformedTextFieldState transformedTextFieldState3;
        TransformedTextFieldState transformedTextFieldState4;
        TransformedTextFieldState transformedTextFieldState5;
        k1.g gVar = this.$dragTotalDistance;
        gVar.element = Offset.m3498plusMKHz9U(gVar.element, j5);
        textLayoutState = this.this$0.textLayoutState;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        this.this$0.m1176updateHandleDraggingUv8p0NA(this.$handle, Offset.m3498plusMKHz9U(this.$dragBeginPosition.element, this.$dragTotalDistance.element));
        if (this.$isStartHandle) {
            m5545getStartimpl = layoutResult.m5517getOffsetForPositionk4lQ0M(this.this$0.m1179getHandleDragPositionF1C5BW0());
        } else {
            transformedTextFieldState = this.this$0.textFieldState;
            m5545getStartimpl = TextRange.m5545getStartimpl(transformedTextFieldState.getText().mo1076getSelectionInCharsd9O1mEE());
        }
        int i5 = m5545getStartimpl;
        if (this.$isStartHandle) {
            transformedTextFieldState5 = this.this$0.textFieldState;
            m5517getOffsetForPositionk4lQ0M = TextRange.m5540getEndimpl(transformedTextFieldState5.getText().mo1076getSelectionInCharsd9O1mEE());
        } else {
            m5517getOffsetForPositionk4lQ0M = layoutResult.m5517getOffsetForPositionk4lQ0M(this.this$0.m1179getHandleDragPositionF1C5BW0());
        }
        int i6 = m5517getOffsetForPositionk4lQ0M;
        transformedTextFieldState2 = this.this$0.textFieldState;
        long mo1076getSelectionInCharsd9O1mEE = transformedTextFieldState2.getText().mo1076getSelectionInCharsd9O1mEE();
        TextFieldSelectionState textFieldSelectionState = this.this$0;
        transformedTextFieldState3 = textFieldSelectionState.textFieldState;
        long m1178updateSelectionQNhciaU$default = TextFieldSelectionState.m1178updateSelectionQNhciaU$default(textFieldSelectionState, transformedTextFieldState3.getText(), i5, i6, this.$isStartHandle, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, 32, null);
        if (TextRange.m5539getCollapsedimpl(mo1076getSelectionInCharsd9O1mEE) || !TextRange.m5539getCollapsedimpl(m1178updateSelectionQNhciaU$default)) {
            transformedTextFieldState4 = this.this$0.textFieldState;
            transformedTextFieldState4.m1146selectCharsIn5zctL8(m1178updateSelectionQNhciaU$default);
        }
    }
}
