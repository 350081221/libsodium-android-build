package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.math.d;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$4 extends n0 implements l<Long, r2> {
    final /* synthetic */ l<Float, r2> $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, float f5, l<? super Float, r2> lVar) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f5;
        this.$beforeFrame = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke(l5.longValue());
        return r2.f19517a;
    }

    public final void invoke(long j5) {
        long j6;
        long j7;
        long N0;
        VectorizedAnimationSpec vectorizedAnimationSpec;
        UpdatableAnimationState.Companion companion;
        AnimationVector1D animationVector1D;
        VectorizedAnimationSpec vectorizedAnimationSpec2;
        UpdatableAnimationState.Companion companion2;
        AnimationVector1D animationVector1D2;
        VectorizedAnimationSpec vectorizedAnimationSpec3;
        UpdatableAnimationState.Companion companion3;
        AnimationVector1D animationVector1D3;
        j6 = this.this$0.lastFrameTime;
        if (j6 == Long.MIN_VALUE) {
            this.this$0.lastFrameTime = j5;
        }
        AnimationVector1D animationVector1D4 = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            vectorizedAnimationSpec3 = this.this$0.vectorizedSpec;
            AnimationVector1D animationVector1D5 = new AnimationVector1D(this.this$0.getValue());
            companion3 = UpdatableAnimationState.Companion;
            AnimationVector1D zeroVector = companion3.getZeroVector();
            animationVector1D3 = this.this$0.lastVelocity;
            N0 = vectorizedAnimationSpec3.getDurationNanos(animationVector1D5, zeroVector, animationVector1D3);
        } else {
            j7 = this.this$0.lastFrameTime;
            N0 = d.N0(((float) (j5 - j7)) / this.$durationScale);
        }
        long j8 = N0;
        vectorizedAnimationSpec = this.this$0.vectorizedSpec;
        companion = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector2 = companion.getZeroVector();
        animationVector1D = this.this$0.lastVelocity;
        float value = ((AnimationVector1D) vectorizedAnimationSpec.getValueFromNanos(j8, animationVector1D4, zeroVector2, animationVector1D)).getValue();
        UpdatableAnimationState updatableAnimationState = this.this$0;
        vectorizedAnimationSpec2 = updatableAnimationState.vectorizedSpec;
        companion2 = UpdatableAnimationState.Companion;
        AnimationVector1D zeroVector3 = companion2.getZeroVector();
        animationVector1D2 = this.this$0.lastVelocity;
        updatableAnimationState.lastVelocity = (AnimationVector1D) vectorizedAnimationSpec2.getVelocityFromNanos(j8, animationVector1D4, zeroVector3, animationVector1D2);
        this.this$0.lastFrameTime = j5;
        float value2 = this.this$0.getValue() - value;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(value2));
    }
}
