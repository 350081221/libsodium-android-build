package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$2", f = "BasicTextField2.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: classes.dex */
final class BasicTextField2Kt$TextFieldSelectionHandles$2 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    final /* synthetic */ TextFieldSelectionState $selectionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextField2Kt$TextFieldSelectionHandles$2(TextFieldSelectionState textFieldSelectionState, d<? super BasicTextField2Kt$TextFieldSelectionHandles$2> dVar) {
        super(2, dVar);
        this.$selectionState = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        BasicTextField2Kt$TextFieldSelectionHandles$2 basicTextField2Kt$TextFieldSelectionHandles$2 = new BasicTextField2Kt$TextFieldSelectionHandles$2(this.$selectionState, dVar);
        basicTextField2Kt$TextFieldSelectionHandles$2.L$0 = obj;
        return basicTextField2Kt$TextFieldSelectionHandles$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((BasicTextField2Kt$TextFieldSelectionHandles$2) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            TextFieldSelectionState textFieldSelectionState = this.$selectionState;
            this.label = 1;
            if (textFieldSelectionState.selectionHandleGestures(pointerInputScope, true, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
