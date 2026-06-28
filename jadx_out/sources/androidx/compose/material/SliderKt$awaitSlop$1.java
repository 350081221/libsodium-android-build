package androidx.compose.material;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {816}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SliderKt$awaitSlop$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SliderKt$awaitSlop$1(kotlin.coroutines.d<? super SliderKt$awaitSlop$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object m1433awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1433awaitSlop8vUncbI = SliderKt.m1433awaitSlop8vUncbI(null, 0L, 0, this);
        return m1433awaitSlop8vUncbI;
    }
}
