package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i5, @GravityInt int i6) {
        if ((GravityCompat.getAbsoluteGravity(i5, ViewCompat.getLayoutDirection(this.view)) & i6) == i6) {
            return true;
        }
        return false;
    }

    private int getEdgeMargin(boolean z4) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z4) {
                return marginLayoutParams.leftMargin;
            }
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v4 = this.view;
        if (v4 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v4;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i5), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i5, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z4;
        if (backEventCompat.getSwipeEdge() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        float width = (this.view.getWidth() * this.view.getScaleX()) + getEdgeMargin(checkAbsoluteGravity);
        V v4 = this.view;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (checkAbsoluteGravity) {
            width = -width;
        }
        fArr[0] = width;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v4, (Property<V, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z4, i5);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i5) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i5);
    }

    @VisibleForTesting
    public void updateBackProgress(float f5, boolean z4, @GravityInt int i5) {
        int i6;
        float interpolateProgress = interpolateProgress(f5);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i5, 3);
        boolean z5 = z4 == checkAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f6 = width;
        if (f6 > 0.0f) {
            float f7 = height;
            if (f7 <= 0.0f) {
                return;
            }
            float f8 = this.maxScaleXDistanceShrink / f6;
            float f9 = this.maxScaleXDistanceGrow / f6;
            float f10 = this.maxScaleYDistance / f7;
            V v4 = this.view;
            if (checkAbsoluteGravity) {
                f6 = 0.0f;
            }
            v4.setPivotX(f6);
            if (!z5) {
                f9 = -f8;
            }
            float lerp = AnimationUtils.lerp(0.0f, f9, interpolateProgress);
            float f11 = lerp + 1.0f;
            this.view.setScaleX(f11);
            float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f10, interpolateProgress);
            this.view.setScaleY(lerp2);
            V v5 = this.view;
            if (v5 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v5;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (checkAbsoluteGravity) {
                        i6 = (width - childAt.getRight()) + childAt.getWidth();
                    } else {
                        i6 = -childAt.getLeft();
                    }
                    childAt.setPivotX(i6);
                    childAt.setPivotY(-childAt.getTop());
                    float f12 = z5 ? 1.0f - lerp : 1.0f;
                    float f13 = lerp2 != 0.0f ? (f11 / lerp2) * f12 : 1.0f;
                    childAt.setScaleX(f12);
                    childAt.setScaleY(f13);
                }
            }
        }
    }
}
