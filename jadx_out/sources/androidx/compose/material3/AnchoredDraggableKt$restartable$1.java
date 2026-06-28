package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {732}, m = "restartable", n = {}, s = {})
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnchoredDraggableKt$restartable$1(kotlin.coroutines.d<? super AnchoredDraggableKt$restartable$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object restartable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restartable = AnchoredDraggableKt.restartable(null, null, this);
        return restartable;
    }
}
