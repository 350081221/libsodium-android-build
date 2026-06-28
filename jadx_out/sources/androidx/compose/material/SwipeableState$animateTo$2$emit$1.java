package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {340}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class SwipeableState$animateTo$2$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$animateTo$2<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2<? super T> swipeableState$animateTo$2, kotlin.coroutines.d<? super SwipeableState$animateTo$2$emit$1> dVar) {
        super(dVar);
        this.this$0 = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (kotlin.coroutines.d<? super r2>) this);
    }
}
