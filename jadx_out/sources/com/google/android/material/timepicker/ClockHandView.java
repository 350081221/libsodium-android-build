package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;

    @Px
    private final int selectorStrokeWidth;

    /* loaded from: classes2.dex */
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f5, boolean z4);
    }

    /* loaded from: classes2.dex */
    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f5, boolean z4);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void adjustLevel(float f5, float f6) {
        int i5 = 2;
        if (MathUtils.dist(getWidth() / 2, getHeight() / 2, f5, f6) > getLeveledCircleRadius(2) + ViewUtils.dpToPx(getContext(), 12)) {
            i5 = 1;
        }
        this.currentLevel = i5;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f5 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f5;
        float f6 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f6;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f5, f6, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.paint);
        canvas.drawCircle(f5, f6, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f5, float f6) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f6 - (getHeight() / 2), f5 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    @Dimension
    private int getLeveledCircleRadius(int i5) {
        return i5 == 2 ? Math.round(this.circleRadius * 0.66f) : this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f5) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f5) > 180.0f) {
            if (handRotation > 180.0f && f5 < 180.0f) {
                f5 += 360.0f;
            }
            if (handRotation < 180.0f && f5 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f5));
    }

    private boolean handleTouchInput(float f5, float f6, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        float degreesFromXY = getDegreesFromXY(f5, f6);
        boolean z8 = false;
        if (getHandRotation() != degreesFromXY) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z5 && z7) {
            return true;
        }
        if (!z7 && !z4) {
            return false;
        }
        if (z6 && this.animatingOnTouchUp) {
            z8 = true;
        }
        setHandRotation(degreesFromXY, z8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHandRotation$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, to = 360.0d) float f5, boolean z4) {
        float f6 = f5 % 360.0f;
        this.originalDeg = f6;
        this.degRad = Math.toRadians(f6 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float sin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i5 = this.selectorRadius;
        rectF.set(cos - i5, sin - i5, cos + i5, sin + i5);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f6, z4);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        if (!this.rotationAnimator.isRunning()) {
            setHandRotation(getHandRotation());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        boolean z6;
        OnActionUpListener onActionUpListener;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z4 = false;
                z5 = false;
                z6 = false;
            } else {
                int i5 = (int) (x4 - this.downX);
                int i6 = (int) (y4 - this.downY);
                if ((i5 * i5) + (i6 * i6) > this.scaledTouchSlop) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.isInTapRegion = z7;
                boolean z8 = this.changedDuringTouch;
                if (actionMasked == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.isMultiLevel) {
                    adjustLevel(x4, y4);
                }
                z6 = false;
                z5 = z8;
            }
        } else {
            this.downX = x4;
            this.downY = y4;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z4 = false;
            z5 = false;
            z6 = true;
        }
        boolean handleTouchInput = handleTouchInput(x4, y4, z5, z6, z4) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z4 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x4, y4), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z4) {
        this.animatingOnTouchUp = z4;
    }

    public void setCircleRadius(@Dimension int i5) {
        this.circleRadius = i5;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCurrentLevel(int i5) {
        this.currentLevel = i5;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f5) {
        setHandRotation(f5, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMultiLevel(boolean z4) {
        if (this.isMultiLevel && !z4) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z4;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f5, boolean z4) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z4) {
            setHandRotationInternal(f5, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f5);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.lambda$setHandRotation$0(valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i5, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }
}
