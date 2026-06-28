package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {708}, m = "restartable", n = {}, s = {})
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnchoredDraggableKt$restartable$1(kotlin.coroutines.d<? super AnchoredDraggableKt$restartable$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object restartable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restartable = AnchoredDraggableKt.restartable(null, null, this);
        return restartable;
    }
}
