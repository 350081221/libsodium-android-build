package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004JW\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tH¦@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "scope", TypedValues.CycleType.S_WAVE_OFFSET, "velocity", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "delta", "Lkotlin/r2;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approachAnimation", "(Landroidx/compose/foundation/gestures/ScrollScope;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ApproachAnimation<T, V extends AnimationVector> {
    @m
    Object approachAnimation(@l ScrollScope scrollScope, T t5, T t6, @l v3.l<? super T, r2> lVar, @l d<? super AnimationResult<T, V>> dVar);
}
