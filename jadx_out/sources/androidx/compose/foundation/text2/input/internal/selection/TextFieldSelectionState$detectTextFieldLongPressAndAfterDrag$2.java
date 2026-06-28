package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "dragStartOffset", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2 extends n0 implements l<Offset, r2> {
    final /* synthetic */ k1.h<Handle> $actingHandle;
    final /* synthetic */ k1.f $dragBeginOffsetInText;
    final /* synthetic */ k1.g $dragBeginPosition;
    final /* synthetic */ k1.g $dragTotalDistance;
    final /* synthetic */ a<r2> $requestFocus;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements a<String> {
        final /* synthetic */ long $dragStartOffset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j5) {
            super(0);
            this.$dragStartOffset = j5;
        }

        @Override // v3.a
        @p4.l
        public final String invoke() {
            return "onDragStart after longPress " + ((Object) Offset.m3501toStringimpl(this.$dragStartOffset));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2(a<r2> aVar, TextFieldSelectionState textFieldSelectionState, k1.h<Handle> hVar, k1.g gVar, k1.g gVar2, k1.f fVar) {
        super(1);
        this.$requestFocus = aVar;
        this.this$0 = textFieldSelectionState;
        this.$actingHandle = hVar;
        this.$dragBeginPosition = gVar;
        this.$dragTotalDistance = gVar2;
        this.$dragBeginOffsetInText = fVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
        m1185invokek4lQ0M(offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m1185invokek4lQ0M(long j5) {
        TextLayoutState textLayoutState;
        TransformedTextFieldState transformedTextFieldState;
        TextLayoutState textLayoutState2;
        TransformedTextFieldState transformedTextFieldState2;
        TransformedTextFieldState transformedTextFieldState3;
        TextLayoutState textLayoutState3;
        HapticFeedback hapticFeedback;
        TransformedTextFieldState transformedTextFieldState4;
        TextFieldSelectionStateKt.logDebug(new AnonymousClass1(j5));
        this.$requestFocus.invoke();
        this.this$0.m1176updateHandleDraggingUv8p0NA(this.$actingHandle.element, j5);
        this.$dragBeginPosition.element = j5;
        this.$dragTotalDistance.element = Offset.Companion.m3509getZeroF1C5BW0();
        this.this$0.previousRawDragOffset = -1;
        textLayoutState = this.this$0.textLayoutState;
        boolean z4 = true;
        if (!textLayoutState.m1133isPositionOnTextk4lQ0M(j5)) {
            textLayoutState3 = this.this$0.textLayoutState;
            int m1130getOffsetForPosition3MmeM6k$default = TextLayoutState.m1130getOffsetForPosition3MmeM6k$default(textLayoutState3, j5, false, 2, null);
            hapticFeedback = this.this$0.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
            }
            transformedTextFieldState4 = this.this$0.textFieldState;
            transformedTextFieldState4.placeCursorBeforeCharAt(m1130getOffsetForPosition3MmeM6k$default);
            this.this$0.setShowCursorHandle(true);
            this.this$0.updateTextToolbarState(TextToolbarState.Cursor);
            return;
        }
        transformedTextFieldState = this.this$0.textFieldState;
        if (transformedTextFieldState.getText().length() != 0) {
            z4 = false;
        }
        if (z4) {
            return;
        }
        textLayoutState2 = this.this$0.textLayoutState;
        int m1130getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m1130getOffsetForPosition3MmeM6k$default(textLayoutState2, j5, false, 2, null);
        TextFieldSelectionState textFieldSelectionState = this.this$0;
        transformedTextFieldState2 = textFieldSelectionState.textFieldState;
        long m1178updateSelectionQNhciaU$default = TextFieldSelectionState.m1178updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m1078TextFieldCharSequence3r_uNRQ$default(transformedTextFieldState2.getText(), TextRange.Companion.m5550getZerod9O1mEE(), null, 4, null), m1130getOffsetForPosition3MmeM6k$default2, m1130getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, 32, null);
        transformedTextFieldState3 = this.this$0.textFieldState;
        transformedTextFieldState3.m1146selectCharsIn5zctL8(m1178updateSelectionQNhciaU$default);
        this.this$0.updateTextToolbarState(TextToolbarState.Selection);
        this.$dragBeginOffsetInText.element = TextRange.m5545getStartimpl(m1178updateSelectionQNhciaU$default);
    }
}
