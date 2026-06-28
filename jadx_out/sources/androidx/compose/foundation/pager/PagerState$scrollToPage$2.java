package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {438}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n437#1:788,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerState$scrollToPage$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f5, int i5, d<? super PagerState$scrollToPage$2> dVar) {
        super(2, dVar);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f5;
        this.$page = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((PagerState$scrollToPage$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        Object awaitScrollDependencies;
        int coerceInPageRange;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        boolean z4 = true;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            awaitScrollDependencies = pagerState.awaitScrollDependencies(this);
            if (awaitScrollDependencies == l5) {
                return l5;
            }
        }
        float f5 = this.$pageOffsetFraction;
        double d5 = f5;
        if (-0.5d > d5 || d5 > 0.5d) {
            z4 = false;
        }
        if (z4) {
            coerceInPageRange = this.this$0.coerceInPageRange(this.$page);
            this.this$0.snapToItem$foundation_release(coerceInPageRange, this.$pageOffsetFraction);
            return r2.f19517a;
        }
        throw new IllegalArgumentException(("pageOffsetFraction " + f5 + " is not within the range -0.5 to 0.5").toString());
    }
}
