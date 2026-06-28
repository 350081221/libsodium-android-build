package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", i = {}, l = {495}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyListState$updateScrollDeltaForPostLookahead$2$1 extends o implements p<s0, d<? super r2>, Object> {
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$updateScrollDeltaForPostLookahead$2$1(LazyListState lazyListState, d<? super LazyListState$updateScrollDeltaForPostLookahead$2$1> dVar) {
        super(2, dVar);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$1(this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((LazyListState$updateScrollDeltaForPostLookahead$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        AnimationState animationState;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            animationState = this.this$0._scrollDeltaBetweenPasses;
            Float e5 = b.e(0.0f);
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, b.e(0.5f), 1, null);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, e5, spring$default, true, null, this, 8, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
