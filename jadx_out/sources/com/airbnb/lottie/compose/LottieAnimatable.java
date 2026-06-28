package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import com.airbnb.lottie.compose.LottieAnimationState;
import kotlin.i0;
import kotlin.r2;

@Stable
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0081\u0001\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "animate", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "iteration", "", "iterations", "reverseOnRepeat", "", "speed", "", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "progress", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LottieAnimatable extends LottieAnimationState {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ Object a(LottieAnimatable lottieAnimatable, com.airbnb.lottie.k kVar, int i5, int i6, boolean z4, float f5, g gVar, float f6, boolean z5, f fVar, boolean z6, boolean z7, kotlin.coroutines.d dVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int n5 = (i7 & 2) != 0 ? lottieAnimatable.n() : i5;
            int l5 = (i7 & 4) != 0 ? lottieAnimatable.l() : i6;
            boolean k5 = (i7 & 8) != 0 ? lottieAnimatable.k() : z4;
            float m5 = (i7 & 16) != 0 ? lottieAnimatable.m() : f5;
            g q5 = (i7 & 32) != 0 ? lottieAnimatable.q() : gVar;
            return lottieAnimatable.e(kVar, n5, l5, k5, m5, q5, (i7 & 64) != 0 ? c.b(kVar, q5, m5) : f6, (i7 & 128) != 0 ? false : z5, (i7 & 256) != 0 ? f.Immediately : fVar, (i7 & 512) != 0 ? false : z6, (i7 & 1024) != 0 ? false : z7, dVar);
        }

        public static long b(@p4.l LottieAnimatable lottieAnimatable) {
            return LottieAnimationState.a.a(lottieAnimatable);
        }

        public static /* synthetic */ Object c(LottieAnimatable lottieAnimatable, com.airbnb.lottie.k kVar, float f5, int i5, boolean z4, kotlin.coroutines.d dVar, int i6, Object obj) {
            boolean z5;
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    kVar = lottieAnimatable.getComposition();
                }
                com.airbnb.lottie.k kVar2 = kVar;
                if ((i6 & 2) != 0) {
                    f5 = lottieAnimatable.getProgress();
                }
                float f6 = f5;
                if ((i6 & 4) != 0) {
                    i5 = lottieAnimatable.n();
                }
                int i7 = i5;
                if ((i6 & 8) != 0) {
                    if (f6 == lottieAnimatable.getProgress()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 = !z5;
                }
                return lottieAnimatable.p(kVar2, f6, i7, z4, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
        }
    }

    @p4.m
    Object e(@p4.m com.airbnb.lottie.k kVar, int i5, int i6, boolean z4, float f5, @p4.m g gVar, float f6, boolean z5, @p4.l f fVar, boolean z6, boolean z7, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @p4.m
    Object p(@p4.m com.airbnb.lottie.k kVar, float f5, int i5, boolean z4, @p4.l kotlin.coroutines.d<? super r2> dVar);
}
