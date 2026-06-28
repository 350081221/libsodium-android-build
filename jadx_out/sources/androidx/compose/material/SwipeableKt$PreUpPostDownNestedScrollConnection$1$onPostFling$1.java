package androidx.compose.material;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {896}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
/* loaded from: classes.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.d<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo390onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
