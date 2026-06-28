package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    private static final int CIRCLE_BG_LIGHT = -328966;

    @VisibleForTesting
    static final int CIRCLE_DIAMETER = 40;

    @VisibleForTesting
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "SwipeRefreshLayout";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private OnChildScrollUpCallback mChildScrollUpCallback;
    private int mCircleDiameter;
    CircleImageView mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final NestedScrollingChildHelper mNestedScrollingChildHelper;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    CircularProgressDrawable mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    /* loaded from: classes2.dex */
    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    /* loaded from: classes2.dex */
    public interface OnRefreshListener {
        void onRefresh();
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void animateOffsetToCorrectPosition(int i5, Animation.AnimationListener animationListener) {
        this.mFrom = i5;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200L);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i5, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i5, animationListener);
            return;
        }
        this.mFrom = i5;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200L);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext(), CIRCLE_BG_LIGHT);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.setStyle(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void finishSpinner(float f5) {
        Animation.AnimationListener animationListener;
        if (f5 > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.setStartEndTrim(0.0f, 0.0f);
        if (!this.mScale) {
            animationListener = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    if (!swipeRefreshLayout.mScale) {
                        swipeRefreshLayout.startScaleDownAnimation(null);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            };
        } else {
            animationListener = null;
        }
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, animationListener);
        this.mProgress.setArrowEnabled(false);
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void moveSpinner(float f5) {
        this.mProgress.setArrowEnabled(true);
        float min = Math.min(1.0f, Math.abs(f5 / this.mTotalDragDistance));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f5) - this.mTotalDragDistance;
        int i5 = this.mCustomSlingshotDistance;
        if (i5 <= 0) {
            if (this.mUsingCustomStart) {
                i5 = this.mSpinnerOffsetEnd - this.mOriginalOffsetTop;
            } else {
                i5 = this.mSpinnerOffsetEnd;
            }
        }
        float f6 = i5;
        double max2 = Math.max(0.0f, Math.min(abs, f6 * DECELERATE_INTERPOLATION_FACTOR) / f6) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i6 = this.mOriginalOffsetTop + ((int) ((f6 * min) + (f6 * pow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f5 / this.mTotalDragDistance));
        }
        if (f5 < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.setStartEndTrim(0.0f, Math.min(MAX_PROGRESS_ANGLE, max * MAX_PROGRESS_ANGLE));
        this.mProgress.setArrowScale(Math.min(1.0f, max));
        this.mProgress.setProgressRotation((((max * 0.4f) - 0.25f) + (pow * DECELERATE_INTERPOLATION_FACTOR)) * 0.5f);
        setTargetOffsetTopAndBottom(i6 - this.mCurrentTargetOffsetTop);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i5;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            this.mActivePointerId = motionEvent.getPointerId(i5);
        }
    }

    private void setColorViewAlpha(int i5) {
        this.mCircleView.getBackground().setAlpha(i5);
        this.mProgress.setAlpha(i5);
    }

    private Animation startAlphaAnimation(final int i5, final int i6) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                SwipeRefreshLayout.this.mProgress.setAlpha((int) (i5 + ((i6 - r0) * f5)));
            }
        };
        animation.setDuration(300L);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(animation);
        return animation;
    }

    private void startDragging(float f5) {
        float f6 = this.mInitialDownY;
        float f7 = f5 - f6;
        int i5 = this.mTouchSlop;
        if (f7 > i5 && !this.mIsBeingDragged) {
            this.mInitialMotionY = f6 + i5;
            this.mIsBeingDragged = true;
            this.mProgress.setAlpha(76);
        }
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    private void startScaleDownReturnToStartAnimation(int i5, Animation.AnimationListener animationListener) {
        this.mFrom = i5;
        this.mStartingScale = this.mCircleView.getScaleX();
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                float f6 = swipeRefreshLayout.mStartingScale;
                swipeRefreshLayout.setAnimationProgress(f6 + ((-f6) * f5));
                SwipeRefreshLayout.this.moveToStart(f5);
            }
        };
        this.mScaleDownToStartAnimation = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f5);
            }
        };
        this.mScaleAnimation = animation;
        animation.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public boolean canChildScrollUp() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.mChildScrollUpCallback;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        if (view instanceof ListView) {
            return ListViewCompat.canScrollList((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f5, float f6, boolean z4) {
        return this.mNestedScrollingChildHelper.dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f5, float f6) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i5, int i6, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(i5, i6, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, int[] iArr) {
        return this.mNestedScrollingChildHelper.dispatchNestedScroll(i5, i6, i7, i8, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        int i7 = this.mCircleViewIndex;
        return i7 < 0 ? i6 : i6 == i5 + (-1) ? i7 : i6 >= i7 ? i6 + 1 : i6;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    void moveToStart(float f5) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f5))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            onSecondaryPointerUp(motionEvent);
                        }
                    }
                } else {
                    int i5 = this.mActivePointerId;
                    if (i5 == -1) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i5);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    startDragging(motionEvent.getY(findPointerIndex));
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(findPointerIndex2);
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i9 = measuredWidth / 2;
        int i10 = measuredWidth2 / 2;
        int i11 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i9 - i10, i11, i9 + i10, measuredHeight2 + i11);
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) == this.mCircleView) {
                this.mCircleViewIndex = i7;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f5, float f6, boolean z4) {
        return dispatchNestedFling(f5, f6, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return dispatchNestedPreFling(f5, f6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr) {
        if (i6 > 0) {
            float f5 = this.mTotalUnconsumed;
            if (f5 > 0.0f) {
                float f6 = i6;
                if (f6 > f5) {
                    iArr[1] = i6 - ((int) f5);
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f5 - f6;
                    iArr[1] = i6;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i6 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i6 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i5 - iArr[0], i6 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8) {
        dispatchNestedScroll(i5, i6, i7, i8, this.mParentOffsetInWindow);
        if (i8 + this.mParentOffsetInWindow[1] < 0 && !canChildScrollUp()) {
            float abs = this.mTotalUnconsumed + Math.abs(r11);
            this.mTotalUnconsumed = abs;
            moveSpinner(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i5);
        startNestedScroll(i5 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i5 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        this.mNestedScrollInProgress = false;
        float f5 = this.mTotalUnconsumed;
        if (f5 > 0.0f) {
            finishSpinner(f5);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            onSecondaryPointerUp(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex < 0) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y4 = motionEvent.getY(findPointerIndex);
                    startDragging(y4);
                    if (this.mIsBeingDragged) {
                        float f5 = (y4 - this.mInitialMotionY) * 0.5f;
                        if (f5 <= 0.0f) {
                            return false;
                        }
                        moveSpinner(f5);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y5 = (motionEvent.getY(findPointerIndex2) - this.mInitialMotionY) * 0.5f;
                    this.mIsBeingDragged = false;
                    finishSpinner(y5);
                }
                this.mActivePointerId = -1;
                return false;
            }
        } else {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        View view = this.mTarget;
        if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
            super.requestDisallowInterceptTouchEvent(z4);
        }
    }

    void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    void setAnimationProgress(float f5) {
        this.mCircleView.setScaleX(f5);
        this.mCircleView.setScaleY(f5);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        ensureTarget();
        this.mProgress.setColorSchemeColors(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr2[i5] = ContextCompat.getColor(context, iArr[i5]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i5) {
        this.mTotalDragDistance = i5;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (!z4) {
            reset();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z4) {
        this.mNestedScrollingChildHelper.setNestedScrollingEnabled(z4);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.mChildScrollUpCallback = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.mListener = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i5) {
        setProgressBackgroundColorSchemeResource(i5);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i5) {
        this.mCircleView.setBackgroundColor(i5);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i5) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i5));
    }

    public void setProgressViewEndTarget(boolean z4, int i5) {
        this.mSpinnerOffsetEnd = i5;
        this.mScale = z4;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z4, int i5, int i6) {
        this.mScale = z4;
        this.mOriginalOffsetTop = i5;
        this.mSpinnerOffsetEnd = i6;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z4) {
        int i5;
        if (z4 && this.mRefreshing != z4) {
            this.mRefreshing = z4;
            if (!this.mUsingCustomStart) {
                i5 = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
            } else {
                i5 = this.mSpinnerOffsetEnd;
            }
            setTargetOffsetTopAndBottom(i5 - this.mCurrentTargetOffsetTop);
            this.mNotify = false;
            startScaleUpAnimation(this.mRefreshListener);
            return;
        }
        setRefreshing(z4, false);
    }

    public void setSize(int i5) {
        if (i5 != 0 && i5 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i5 == 0) {
            this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
        } else {
            this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        }
        this.mCircleView.setImageDrawable(null);
        this.mProgress.setStyle(i5);
        this.mCircleView.setImageDrawable(this.mProgress);
    }

    public void setSlingshotDistance(@Px int i5) {
        this.mCustomSlingshotDistance = i5;
    }

    void setTargetOffsetTopAndBottom(int i5) {
        this.mCircleView.bringToFront();
        ViewCompat.offsetTopAndBottom(this.mCircleView, i5);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i5) {
        return this.mNestedScrollingChildHelper.startNestedScroll(i5);
    }

    void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f5);
            }
        };
        this.mScaleDownAnimation = animation;
        animation.setDuration(150L);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.stopNestedScroll();
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (swipeRefreshLayout.mRefreshing) {
                    swipeRefreshLayout.mProgress.setAlpha(255);
                    SwipeRefreshLayout.this.mProgress.start();
                    SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                    if (swipeRefreshLayout2.mNotify && (onRefreshListener = swipeRefreshLayout2.mListener) != null) {
                        onRefreshListener.onRefresh();
                    }
                    SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                    swipeRefreshLayout3.mCurrentTargetOffsetTop = swipeRefreshLayout3.mCircleView.getTop();
                    return;
                }
                swipeRefreshLayout.reset();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.mAnimateToCorrectPosition = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                int i5;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.mUsingCustomStart) {
                    i5 = swipeRefreshLayout.mSpinnerOffsetEnd - Math.abs(swipeRefreshLayout.mOriginalOffsetTop);
                } else {
                    i5 = swipeRefreshLayout.mSpinnerOffsetEnd;
                }
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.mFrom + ((int) ((i5 - r1) * f5))) - swipeRefreshLayout2.mCircleView.getTop());
                SwipeRefreshLayout.this.mProgress.setArrowScale(1.0f - f5);
            }
        };
        this.mAnimateToStartPosition = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f5, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f5);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i5 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i5;
        this.mTotalDragDistance = i5;
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i6 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i6;
        this.mOriginalOffsetTop = i6;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setRefreshing(boolean z4, boolean z5) {
        if (this.mRefreshing != z4) {
            this.mNotify = z5;
            ensureTarget();
            this.mRefreshing = z4;
            if (z4) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }
}
