package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {305, 320}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TapGestureDetectorKt$waitForUpOrCancellation$2(kotlin.coroutines.d<? super TapGestureDetectorKt$waitForUpOrCancellation$2> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
    }
}
