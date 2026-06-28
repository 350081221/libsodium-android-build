package androidx.compose.foundation.text.selection;

import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {119, 123}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelection$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionGesturesKt$touchSelection$1(kotlin.coroutines.d<? super SelectionGesturesKt$touchSelection$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = SelectionGesturesKt.touchSelection(null, null, null, this);
        return obj2;
    }
}
