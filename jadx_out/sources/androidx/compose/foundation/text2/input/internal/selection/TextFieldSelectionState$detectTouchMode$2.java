package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTouchMode$2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTouchMode$2(TextFieldSelectionState textFieldSelectionState, d<? super TextFieldSelectionState$detectTouchMode$2> dVar) {
        super(2, dVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(this.this$0, dVar);
        textFieldSelectionState$detectTouchMode$2.L$0 = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((TextFieldSelectionState$detectTouchMode$2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r7)
            r3 = r1
            r1 = r0
            r0 = r6
            goto L39
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.e1.n(r7)
            java.lang.Object r7 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            r1 = r7
            r7 = r6
        L27:
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r3 = r1.awaitPointerEvent(r3, r7)
            if (r3 != r0) goto L34
            return r0
        L34:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L39:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r4 = r0.this$0
            boolean r7 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r7)
            r7 = r7 ^ r2
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$setInTouchMode(r4, r7)
            r7 = r0
            r0 = r1
            r1 = r3
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTouchMode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
