package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$pointerInputNode$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, d<? super TextFieldDecoratorModifierNode$pointerInputNode$1> dVar) {
        super(2, dVar);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldDecoratorModifierNode$pointerInputNode$1 textFieldDecoratorModifierNode$pointerInputNode$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1(this.this$0, dVar);
        textFieldDecoratorModifierNode$pointerInputNode$1.L$0 = obj;
        return textFieldDecoratorModifierNode$pointerInputNode$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            TextFieldDecoratorModifierNode$pointerInputNode$1$1$1 textFieldDecoratorModifierNode$pointerInputNode$1$1$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1(textFieldSelectionState, textFieldDecoratorModifierNode);
            TextFieldDecoratorModifierNode$pointerInputNode$1$1$2 textFieldDecoratorModifierNode$pointerInputNode$1$1$2 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1$2(textFieldDecoratorModifierNode);
            this.label = 1;
            if (textFieldSelectionState.textFieldGestures(pointerInputScope, textFieldDecoratorModifierNode$pointerInputNode$1$1$1, textFieldDecoratorModifierNode$pointerInputNode$1$1$2, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
