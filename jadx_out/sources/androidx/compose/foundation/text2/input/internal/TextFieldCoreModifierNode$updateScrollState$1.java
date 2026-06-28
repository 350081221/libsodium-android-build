package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ float $offsetDifference;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f5, d<? super TextFieldCoreModifierNode$updateScrollState$1> dVar) {
        super(2, dVar);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        ScrollState scrollState;
        float roundToNext;
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
            scrollState = this.this$0.scrollState;
            roundToNext = TextFieldCoreModifierKt.roundToNext(this.$offsetDifference);
            this.label = 1;
            if (ScrollExtensionsKt.scrollBy(scrollState, roundToNext, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
