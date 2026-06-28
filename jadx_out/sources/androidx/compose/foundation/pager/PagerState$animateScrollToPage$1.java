package androidx.compose.foundation.pager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {TypedValues.PositionType.TYPE_CURVE_FIT, 517}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
/* loaded from: classes.dex */
public final class PagerState$animateScrollToPage$1 extends d {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(PagerState pagerState, kotlin.coroutines.d<? super PagerState$animateScrollToPage$1> dVar) {
        super(dVar);
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateScrollToPage(0, 0.0f, null, this);
    }
}
