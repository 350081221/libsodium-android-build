package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @l
    private final SnapFlingBehavior originalFlingBehavior;

    @l
    private final PagerState pagerState;

    public PagerWrapperFlingBehavior(@l SnapFlingBehavior snapFlingBehavior, @l PagerState pagerState) {
        this.originalFlingBehavior = snapFlingBehavior;
        this.pagerState = pagerState;
    }

    @l
    public final SnapFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    @l
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(@p4.l androidx.compose.foundation.gestures.ScrollScope r5, float r6, @p4.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e1.n(r7)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7 = r4.originalFlingBehavior
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r7 = r7.performFling(r5, r6, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.d):java.lang.Object");
    }
}
