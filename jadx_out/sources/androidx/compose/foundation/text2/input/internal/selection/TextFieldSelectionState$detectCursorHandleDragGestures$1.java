package androidx.compose.foundation.text2.input.internal.selection;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0}, l = {498}, m = "detectCursorHandleDragGestures", n = {"this", "cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.d<? super TextFieldSelectionState$detectCursorHandleDragGestures$1> dVar) {
        super(dVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object detectCursorHandleDragGestures;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        detectCursorHandleDragGestures = this.this$0.detectCursorHandleDragGestures(null, this);
        return detectCursorHandleDragGestures;
    }
}
