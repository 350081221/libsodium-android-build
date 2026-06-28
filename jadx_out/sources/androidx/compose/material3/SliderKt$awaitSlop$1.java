package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1262}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SliderKt$awaitSlop$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SliderKt$awaitSlop$1(kotlin.coroutines.d<? super SliderKt$awaitSlop$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object m2199awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m2199awaitSlop8vUncbI = SliderKt.m2199awaitSlop8vUncbI(null, 0L, 0, this);
        return m2199awaitSlop8vUncbI;
    }
}
