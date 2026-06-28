package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {714}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2$1$emit$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.d<? super AnchoredDraggableKt$restartable$2$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
