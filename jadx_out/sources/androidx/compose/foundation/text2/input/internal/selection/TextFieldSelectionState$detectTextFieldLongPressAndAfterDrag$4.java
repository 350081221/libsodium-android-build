package androidx.compose.foundation.text2.input.internal.selection;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4 extends n0 implements a<r2> {
    final /* synthetic */ k1.f $dragBeginOffsetInText;
    final /* synthetic */ k1.g $dragBeginPosition;
    final /* synthetic */ k1.g $dragTotalDistance;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4(k1.g gVar, TextFieldSelectionState textFieldSelectionState, k1.f fVar, k1.g gVar2) {
        super(0);
        this.$dragBeginPosition = gVar;
        this.this$0 = textFieldSelectionState;
        this.$dragBeginOffsetInText = fVar;
        this.$dragTotalDistance = gVar2;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextFieldSelectionState.detectTextFieldLongPressAndAfterDrag$onDragStop$1(this.$dragBeginPosition, this.this$0, this.$dragBeginOffsetInText, this.$dragTotalDistance);
    }
}
