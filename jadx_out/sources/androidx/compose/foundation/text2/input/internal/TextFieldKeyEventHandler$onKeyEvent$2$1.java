package androidx.compose.foundation.text2.input.internal;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldKeyEventHandler$onKeyEvent$2$1 extends n0 implements l<TextFieldPreparedSelection, r2> {
    public static final TextFieldKeyEventHandler$onKeyEvent$2$1 INSTANCE = new TextFieldKeyEventHandler$onKeyEvent$2$1();

    TextFieldKeyEventHandler$onKeyEvent$2$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        invoke2(textFieldPreparedSelection);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorLeft();
    }
}
