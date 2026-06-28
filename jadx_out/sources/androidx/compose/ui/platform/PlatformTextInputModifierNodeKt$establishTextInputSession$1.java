package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {101}, m = "establishTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(kotlin.coroutines.d<? super PlatformTextInputModifierNodeKt$establishTextInputSession$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
    }
}
