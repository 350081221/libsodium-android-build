package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {182, 280}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n1#2:318\n41#3,4:319\n41#3,4:323\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n174#1:319,4\n277#1:323,4\n*E\n"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ int $index;
    final /* synthetic */ int $numOfItemsForTeleport;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n41#2,4:326\n41#2,4:330\n41#2,4:334\n41#2,4:338\n41#2,4:342\n41#2,4:346\n41#2,4:350\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n195#1:318,4\n201#1:322,4\n204#1:326,4\n212#1:330,4\n217#1:334,4\n228#1:338,4\n240#1:342,4\n253#1:346,4\n264#1:350,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements l<AnimationScope<Float, AnimationVector1D>, r2> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ k1.h<AnimationState<Float, AnimationVector1D>> $anim;
        final /* synthetic */ float $boundDistancePx;
        final /* synthetic */ boolean $forward;
        final /* synthetic */ int $index;
        final /* synthetic */ k1.a $loop;
        final /* synthetic */ k1.f $loops;
        final /* synthetic */ int $numOfItemsForTeleport;
        final /* synthetic */ k1.e $prevValue;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ float $target;
        final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i5, float f5, k1.e eVar, ScrollScope scrollScope, k1.a aVar, boolean z4, float f6, k1.f fVar, int i6, int i7, k1.h<AnimationState<Float, AnimationVector1D>> hVar) {
            super(1);
            this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
            this.$index = i5;
            this.$target = f5;
            this.$prevValue = eVar;
            this.$$this$scroll = scrollScope;
            this.$loop = aVar;
            this.$forward = z4;
            this.$boundDistancePx = f6;
            this.$loops = fVar;
            this.$numOfItemsForTeleport = i6;
            this.$scrollOffset = i7;
            this.$anim = hVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AnimationScope<Float, AnimationVector1D> animationScope) {
            float t5;
            if (!LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                if (this.$target > 0.0f) {
                    t5 = u.A(animationScope.getValue().floatValue(), this.$target);
                } else {
                    t5 = u.t(animationScope.getValue().floatValue(), this.$target);
                }
                float f5 = t5 - this.$prevValue.element;
                float scrollBy = this.$$this$scroll.scrollBy(f5);
                if (!LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index) && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                    if (!(f5 == scrollBy)) {
                        animationScope.cancelAnimation();
                        this.$loop.element = false;
                        return;
                    }
                    this.$prevValue.element += f5;
                    if (this.$forward) {
                        if (animationScope.getValue().floatValue() > this.$boundDistancePx) {
                            animationScope.cancelAnimation();
                        }
                    } else if (animationScope.getValue().floatValue() < (-this.$boundDistancePx)) {
                        animationScope.cancelAnimation();
                    }
                    if (this.$forward) {
                        if (this.$loops.element >= 2) {
                            int lastVisibleItemIndex = this.$index - this.$this_animateScrollToItem.getLastVisibleItemIndex();
                            int i5 = this.$numOfItemsForTeleport;
                            if (lastVisibleItemIndex > i5) {
                                this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, this.$index - i5, 0);
                            }
                        }
                    } else if (this.$loops.element >= 2) {
                        int firstVisibleItemIndex = this.$this_animateScrollToItem.getFirstVisibleItemIndex();
                        int i6 = this.$index;
                        int i7 = firstVisibleItemIndex - i6;
                        int i8 = this.$numOfItemsForTeleport;
                        if (i7 > i8) {
                            this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, i6 + i8, 0);
                        }
                    }
                }
            }
            if (LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, this.$index, this.$scrollOffset);
                this.$loop.element = false;
                animationScope.cancelAnimation();
            } else if (LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                throw new ItemFoundInScroll(this.$this_animateScrollToItem.getVisibleItemScrollOffset(this.$index), this.$anim.element);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,317:1\n41#2,4:318\n41#2,4:322\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n295#1:318,4\n300#1:322,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends n0 implements l<AnimationScope<Float, AnimationVector1D>, r2> {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ k1.e $prevValue;
        final /* synthetic */ float $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(float f5, k1.e eVar, ScrollScope scrollScope) {
            super(1);
            this.$target = f5;
            this.$prevValue = eVar;
            this.$$this$scroll = scrollScope;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return r2.f19517a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            if ((r1 == r6.getValue().floatValue()) == false) goto L18;
         */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(@p4.l androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6) {
            /*
                r5 = this;
                float r0 = r5.$target
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L18
                java.lang.Object r0 = r6.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.$target
                float r1 = kotlin.ranges.s.A(r0, r1)
                goto L2c
            L18:
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L2c
                java.lang.Object r0 = r6.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.$target
                float r1 = kotlin.ranges.s.t(r0, r1)
            L2c:
                kotlin.jvm.internal.k1$e r0 = r5.$prevValue
                float r0 = r0.element
                float r0 = r1 - r0
                androidx.compose.foundation.gestures.ScrollScope r2 = r5.$$this$scroll
                float r2 = r2.scrollBy(r0)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L40
                r2 = r3
                goto L41
            L40:
                r2 = r4
            L41:
                if (r2 == 0) goto L55
                java.lang.Object r2 = r6.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto L52
                goto L53
            L52:
                r3 = r4
            L53:
                if (r3 != 0) goto L58
            L55:
                r6.cancelAnimation()
            L58:
                kotlin.jvm.internal.k1$e r6 = r5.$prevValue
                float r1 = r6.element
                float r1 = r1 + r0
                r6.element = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.AnonymousClass5.invoke2(androidx.compose.animation.core.AnimationScope):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i5, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i6, int i7, d<? super LazyAnimateScrollKt$animateScrollToItem$2> dVar) {
        super(2, dVar);
        this.$index = i5;
        this.$density = density;
        this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
        this.$scrollOffset = i6;
        this.$numOfItemsForTeleport = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z4, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i5, int i6) {
        if (z4) {
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i5 && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i5 || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i6)) {
                return false;
            }
        } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i5 && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i5 || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i6)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, dVar);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd A[Catch: ItemFoundInScroll -> 0x01d9, TryCatch #3 {ItemFoundInScroll -> 0x01d9, blocks: (B:20:0x00c9, B:22:0x00cd, B:24:0x00d5, B:29:0x00fc, B:34:0x0143, B:37:0x0150), top: B:19:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0238  */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01b0 -> B:16:0x01b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
