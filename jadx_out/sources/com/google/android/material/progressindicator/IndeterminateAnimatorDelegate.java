package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected final List<DrawingDelegate.ActiveIndicator> activeIndicators = new ArrayList();
    protected IndeterminateDrawable drawable;

    /* JADX INFO: Access modifiers changed from: protected */
    public IndeterminateAnimatorDelegate(int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            this.activeIndicators.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void cancelAnimatorImmediately();

    /* JADX INFO: Access modifiers changed from: protected */
    public float getFractionInRange(int i5, int i6, int i7) {
        return (i5 - i6) / i7;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerDrawable(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void requestCancelAnimatorAfterCurrentCycle();

    @VisibleForTesting
    abstract void resetPropertiesForNewStart();

    @VisibleForTesting
    abstract void setAnimationFraction(float f5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
