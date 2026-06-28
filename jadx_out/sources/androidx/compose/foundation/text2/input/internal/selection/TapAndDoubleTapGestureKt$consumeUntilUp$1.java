package androidx.compose.foundation.text2.input.internal.selection;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt", f = "TapAndDoubleTapGesture.kt", i = {0}, l = {108}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TapAndDoubleTapGestureKt$consumeUntilUp$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapAndDoubleTapGestureKt$consumeUntilUp$1(kotlin.coroutines.d<? super TapAndDoubleTapGestureKt$consumeUntilUp$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object consumeUntilUp;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        consumeUntilUp = TapAndDoubleTapGestureKt.consumeUntilUp(null, this);
        return consumeUntilUp;
    }
}
