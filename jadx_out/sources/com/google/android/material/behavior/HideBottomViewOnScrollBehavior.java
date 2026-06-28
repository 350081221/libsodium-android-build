package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;

    @Nullable
    private ViewPropertyAnimator currentAnimator;

    @ScrollState
    private int currentState;
    private int enterAnimDuration;
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private TimeInterpolator exitAnimInterpolator;
    private int height;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private static final int ENTER_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    /* loaded from: classes2.dex */
    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, @ScrollState int i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(@NonNull V v4, int i5, long j5, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v4.animate().translationY(i5).setInterpolator(timeInterpolator).setDuration(j5).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    private void updateCurrentState(@NonNull V v4, @ScrollState int i5) {
        this.currentState = i5;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v4, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        this.height = v4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v4.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v4.getContext(), ENTER_ANIM_DURATION_ATTR, 225);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v4.getContext(), EXIT_ANIM_DURATION_ATTR, 175);
        Context context = v4.getContext();
        int i6 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i6, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v4.getContext(), i6, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v4, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, int i5, int i6, int i7, int i8, int i9, @NonNull int[] iArr) {
        if (i6 > 0) {
            slideDown(v4);
        } else if (i6 < 0) {
            slideUp(v4);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, @NonNull View view2, int i5, int i6) {
        return i5 == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v4, @Dimension int i5) {
        this.additionalHiddenOffsetY = i5;
        if (this.currentState == 1) {
            v4.setTranslationY(this.height + i5);
        }
    }

    public void slideDown(@NonNull V v4) {
        slideDown(v4, true);
    }

    public void slideUp(@NonNull V v4) {
        slideUp(v4, true);
    }

    public void slideDown(@NonNull V v4, boolean z4) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v4.clearAnimation();
        }
        updateCurrentState(v4, 1);
        int i5 = this.height + this.additionalHiddenOffsetY;
        if (z4) {
            animateChildTo(v4, i5, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v4.setTranslationY(i5);
        }
    }

    public void slideUp(@NonNull V v4, boolean z4) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v4.clearAnimation();
        }
        updateCurrentState(v4, 2);
        if (z4) {
            animateChildTo(v4, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v4.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
