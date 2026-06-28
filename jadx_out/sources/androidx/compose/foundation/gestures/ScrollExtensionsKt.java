package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", b.f22420d, "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "scrollBy", "(Landroidx/compose/foundation/gestures/ScrollableState;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/r2;", "stopScroll", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateScrollBy(@p4.l androidx.compose.foundation.gestures.ScrollableState r7, float r8, @p4.l androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, @p4.l kotlin.coroutines.d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.k1$e r7 = (kotlin.jvm.internal.k1.e) r7
            kotlin.e1.n(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.e1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r10
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.element
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f5, AnimationSpec animationSpec, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f5, animationSpec, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollBy(@p4.l androidx.compose.foundation.gestures.ScrollableState r7, float r8, @p4.l kotlin.coroutines.d<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.k1$e r7 = (kotlin.jvm.internal.k1.e) r7
            kotlin.e1.n(r9)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.e1.n(r9)
            kotlin.jvm.internal.k1$e r9 = new kotlin.jvm.internal.k1$e
            r9.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r1 = 0
            r5.<init>(r9, r8, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r9
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r9
        L57:
            float r7 = r7.element
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public static final Object stopScroll(@l ScrollableState scrollableState, @l MutatePriority mutatePriority, @l d<? super r2> dVar) {
        Object l5;
        Object scroll = scrollableState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll == l5 ? scroll : r2.f19517a;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, dVar);
    }
}
