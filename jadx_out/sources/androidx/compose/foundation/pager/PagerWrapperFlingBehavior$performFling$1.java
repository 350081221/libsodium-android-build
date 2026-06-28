package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "Pager.kt", i = {}, l = {829}, m = "performFling", n = {}, s = {})
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior$performFling$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, kotlin.coroutines.d<? super PagerWrapperFlingBehavior$performFling$1> dVar) {
        super(dVar);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
