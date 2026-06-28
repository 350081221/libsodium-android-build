package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> ANIMATION_FRACTION;
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> COMPLETE_END_FRACTION;
    private static final int CONSTANT_ROTATION_DEGREES = 1520;
    private static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    private static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    private static final int DURATION_TO_EXPAND_IN_MS = 667;
    private static final int DURATION_TO_FADE_IN_MS = 333;
    private static final int EXTRA_DEGREES_PER_CYCLE = 250;
    private static final int TAIL_DEGREES_OFFSET = -20;
    private static final int TOTAL_CYCLES = 4;
    private static final int TOTAL_DURATION_IN_MS = 5400;
    private float animationFraction;
    private ObjectAnimator animator;
    Animatable2Compat.AnimationCallback animatorCompleteCallback;
    private final BaseProgressIndicatorSpec baseSpec;
    private ObjectAnimator completeEndAnimator;
    private float completeEndFraction;
    private int indicatorColorIndexOffset;
    private final FastOutSlowInInterpolator interpolator;
    private static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    private static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    private static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};

    static {
        Class<Float> cls = Float.class;
        ANIMATION_FRACTION = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
            @Override // android.util.Property
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.getAnimationFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f5) {
                circularIndeterminateAnimatorDelegate.setAnimationFraction(f5.floatValue());
            }
        };
        COMPLETE_END_FRACTION = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.4
            @Override // android.util.Property
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.getCompleteEndFraction());
            }

            @Override // android.util.Property
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f5) {
                circularIndeterminateAnimatorDelegate.setCompleteEndFraction(f5.floatValue());
            }
        };
    }

    public CircularIndeterminateAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(5400L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset + 4) % CircularIndeterminateAnimatorDelegate.this.baseSpec.indicatorColors.length;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, 0.0f, 1.0f);
            this.completeEndAnimator = ofFloat2;
            ofFloat2.setDuration(333L);
            this.completeEndAnimator.setInterpolator(this.interpolator);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.animatorCompleteCallback;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    private void maybeUpdateSegmentColors(int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            float fractionInRange = getFractionInRange(i5, DELAY_TO_FADE_IN_MS[i6], 333);
            if (fractionInRange >= 0.0f && fractionInRange <= 1.0f) {
                int i7 = i6 + this.indicatorColorIndexOffset;
                int[] iArr = this.baseSpec.indicatorColors;
                int length = i7 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i8 = iArr[length];
                int i9 = iArr[length2];
                this.activeIndicators.get(0).color = ArgbEvaluatorCompat.getInstance().evaluate(this.interpolator.getInterpolation(fractionInRange), Integer.valueOf(i8), Integer.valueOf(i9)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompleteEndFraction(float f5) {
        this.completeEndFraction = f5;
    }

    private void updateSegmentPositions(int i5) {
        DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        float f5 = this.animationFraction;
        activeIndicator.startFraction = (f5 * 1520.0f) - 20.0f;
        activeIndicator.endFraction = f5 * 1520.0f;
        for (int i6 = 0; i6 < 4; i6++) {
            activeIndicator.endFraction += this.interpolator.getInterpolation(getFractionInRange(i5, DELAY_TO_EXPAND_IN_MS[i6], 667)) * 250.0f;
            activeIndicator.startFraction += this.interpolator.getInterpolation(getFractionInRange(i5, DELAY_TO_COLLAPSE_IN_MS[i6], 667)) * 250.0f;
        }
        float f6 = activeIndicator.startFraction;
        float f7 = activeIndicator.endFraction;
        activeIndicator.startFraction = (f6 + ((f7 - f6) * this.completeEndFraction)) / 360.0f;
        activeIndicator.endFraction = f7 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.animatorCompleteCallback = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.drawable.isVisible()) {
                this.completeEndAnimator.start();
            } else {
                cancelAnimatorImmediately();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    void resetPropertiesForNewStart() {
        this.indicatorColorIndexOffset = 0;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    void setAnimationFraction(float f5) {
        this.animationFraction = f5;
        int i5 = (int) (f5 * 5400.0f);
        updateSegmentPositions(i5);
        maybeUpdateSegmentColors(i5);
        this.drawable.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }
}
