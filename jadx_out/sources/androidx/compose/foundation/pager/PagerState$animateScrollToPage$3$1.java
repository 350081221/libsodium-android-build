package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1", f = "PagerState.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n772#2,4:792\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1\n*L\n531#1:788,4\n550#1:792,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerState$animateScrollToPage$3$1 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ int $targetPageOffsetToSnappedPosition;
    final /* synthetic */ LazyLayoutAnimateScrollScope $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1$3\n*L\n555#1:788,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements p<Float, Float, r2> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ k1.e $previousValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(k1.e eVar, ScrollScope scrollScope) {
            super(2);
            this.$previousValue = eVar;
            this.$$this$scroll = scrollScope;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Float f5, Float f6) {
            invoke(f5.floatValue(), f6.floatValue());
            return r2.f19517a;
        }

        public final void invoke(float f5, float f6) {
            this.$previousValue.element += this.$$this$scroll.scrollBy(f5 - this.$previousValue.element);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3$1(PagerState pagerState, int i5, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i6, AnimationSpec<Float> animationSpec, d<? super PagerState$animateScrollToPage$3$1> dVar) {
        super(2, dVar);
        this.this$0 = pagerState;
        this.$targetPage = i5;
        this.$this_with = lazyLayoutAnimateScrollScope;
        this.$targetPageOffsetToSnappedPosition = i6;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new PagerState$animateScrollToPage$3$1(this.this$0, this.$targetPage, this.$this_with, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, dVar);
        pagerState$animateScrollToPage$3$1.L$0 = obj;
        return pagerState$animateScrollToPage$3$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((PagerState$animateScrollToPage$3$1) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        boolean z4;
        int B;
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
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.this$0.updateTargetPage(scrollScope, this.$targetPage);
            if (this.$targetPage > this.$this_with.getFirstVisibleItemIndex()) {
                z4 = true;
            } else {
                z4 = false;
            }
            int lastVisibleItemIndex = (this.$this_with.getLastVisibleItemIndex() - this.$this_with.getFirstVisibleItemIndex()) + 1;
            if (((z4 && this.$targetPage > this.$this_with.getLastVisibleItemIndex()) || (!z4 && this.$targetPage < this.$this_with.getFirstVisibleItemIndex())) && Math.abs(this.$targetPage - this.$this_with.getFirstVisibleItemIndex()) >= 3) {
                if (z4) {
                    B = u.u(this.$targetPage - lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                } else {
                    B = u.B(this.$targetPage + lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                }
                this.$this_with.snapToItem(scrollScope, B, 0);
            }
            int visibleItemsAverageSize = this.$this_with.getVisibleItemsAverageSize();
            int currentPage = this.this$0.getCurrentPage();
            int i6 = this.$targetPage * visibleItemsAverageSize;
            int i7 = currentPage * visibleItemsAverageSize;
            float currentPageOffsetFraction = ((i6 - i7) + this.$targetPageOffsetToSnappedPosition) - (visibleItemsAverageSize * this.this$0.getCurrentPageOffsetFraction());
            k1.e eVar = new k1.e();
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(eVar, scrollScope);
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, currentPageOffsetFraction, 0.0f, animationSpec, anonymousClass3, this, 4, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
