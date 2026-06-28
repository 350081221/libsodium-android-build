package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class CircularPropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;

    private static float distance(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        return (float) Math.sqrt((f9 * f9) + (f10 * f10));
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i5;
        int round;
        int i6;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 != null && getViewVisibility(transitionValues) != 0) {
            transitionValues = transitionValues2;
            i5 = 1;
        } else {
            i5 = -1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i6 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i6 = round2;
        }
        float distance = distance(viewX, viewY, i6, round) / distance(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i5)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f5) {
        if (f5 != 0.0f) {
            this.mPropagationSpeed = f5;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
