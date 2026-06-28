package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.i;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingDecay", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setFlingDecay", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "", "lastAnimationCycleCount", "I", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @l
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;

    @l
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(@l DecayAnimationSpec<Float> decayAnimationSpec, @l MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    @l
    public final DecayAnimationSpec<Float> getFlingDecay() {
        return this.flingDecay;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @m
    public Object performFling(@l ScrollScope scrollScope, float f5, @l d<? super Float> dVar) {
        this.lastAnimationCycleCount = 0;
        return i.h(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f5, this, scrollScope, null), dVar);
    }

    public final void setFlingDecay(@l DecayAnimationSpec<Float> decayAnimationSpec) {
        this.flingDecay = decayAnimationSpec;
    }

    public final void setLastAnimationCycleCount(int i5) {
        this.lastAnimationCycleCount = i5;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i5, w wVar) {
        this(decayAnimationSpec, (i5 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
