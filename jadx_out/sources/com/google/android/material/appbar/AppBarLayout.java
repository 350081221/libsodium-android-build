package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;

    @Nullable
    private WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;

    @Nullable
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;

    @Nullable
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;

    @Nullable
    private WeakReference<View> liftOnScrollTargetView;

    @IdRes
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;

    @Nullable
    private Drawable statusBarForeground;

    @Nullable
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;

        @Nullable
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        /* loaded from: classes2.dex */
        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(@NonNull T t5);
        }

        public BaseBehavior() {
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, @NonNull final T t5) {
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AccessibilityDelegateCompat() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        View childWithScrollingBehavior;
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                        if (t5.getTotalScrollRange() == 0 || (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) == null || !BaseBehavior.this.childrenHaveScrollFlags(t5)) {
                            return;
                        }
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t5.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                        if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                            if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                if ((-t5.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                    accessibilityNodeInfoCompat.setScrollable(true);
                                    return;
                                }
                                return;
                            }
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
                        if (i5 == 4096) {
                            t5.setExpanded(false);
                            return true;
                        }
                        if (i5 == 8192) {
                            if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                                View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                                if (childWithScrollingBehavior.canScrollVertically(-1)) {
                                    int i6 = -t5.getDownNestedPreScrollRange();
                                    if (i6 != 0) {
                                        BaseBehavior.this.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) t5, childWithScrollingBehavior, 0, i6, new int[]{0, 0}, 1);
                                        return true;
                                    }
                                } else {
                                    t5.setExpanded(true);
                                    return true;
                                }
                            }
                            return false;
                        }
                        return super.performAccessibilityAction(view, i5, bundle);
                    }
                });
            }
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @NonNull T t5, int i5, float f5) {
            int height;
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i5);
            float abs2 = Math.abs(f5);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t5.getHeight()) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t5, i5, height);
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t5, int i5, int i6) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i5) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.offsetAnimator.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t5, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i6, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i5);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i5, int i6, int i7) {
            return i5 < (i6 + i7) / 2 ? i6 : i7;
        }

        private boolean canScrollChildren(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, @NonNull View view) {
            if (t5.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= t5.getHeight()) {
                return true;
            }
            return false;
        }

        private static boolean checkFlag(int i5, int i6) {
            return (i5 & i6) == i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (((LayoutParams) appBarLayout.getChildAt(i5).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        private View findFirstScrollingChild(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Nullable
        private static View getAppBarChildOnOffset(@NonNull AppBarLayout appBarLayout, int i5) {
            int abs = Math.abs(i5);
            int childCount = appBarLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = appBarLayout.getChildAt(i6);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@NonNull T t5, int i5) {
            int childCount = t5.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t5.getChildAt(i6);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i7 = -i5;
                if (top <= i7 && bottom >= i7) {
                    return i6;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@NonNull T t5, int i5) {
            int abs = Math.abs(i5);
            int childCount = t5.getChildCount();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = t5.getChildAt(i7);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (scrollInterpolator != null) {
                        int scrollFlags = layoutParams.getScrollFlags();
                        if ((scrollFlags & 1) != 0) {
                            i6 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((scrollFlags & 2) != 0) {
                                i6 -= ViewCompat.getMinimumHeight(childAt);
                            }
                        }
                        if (ViewCompat.getFitsSystemWindows(childAt)) {
                            i6 -= t5.getTopInset();
                        }
                        if (i6 > 0) {
                            float f5 = i6;
                            return Integer.signum(i5) * (childAt.getTop() + Math.round(f5 * scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f5)));
                        }
                    }
                } else {
                    i7++;
                }
            }
            return i5;
        }

        private boolean shouldJumpElevationState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5) {
            List<View> dependents = coordinatorLayout.getDependents(t5);
            int size = dependents.size();
            for (int i5 = 0; i5 < size; i5++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i5).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).getOverlayTop() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t5) {
            int topInset = t5.getTopInset() + t5.getPaddingTop();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - topInset;
            int childIndexOnOffset = getChildIndexOnOffset(t5, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t5.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i5 = -childAt.getTop();
                    int i6 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && ViewCompat.getFitsSystemWindows(t5) && ViewCompat.getFitsSystemWindows(childAt)) {
                        i5 -= t5.getTopInset();
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        i6 += ViewCompat.getMinimumHeight(childAt);
                    } else if (checkFlag(scrollFlags, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt) + i6;
                        if (topBottomOffsetForScrollingSibling < minimumHeight) {
                            i5 = minimumHeight;
                        } else {
                            i6 = minimumHeight;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        i5 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t5, MathUtils.clamp(calculateSnapOffset(topBottomOffsetForScrollingSibling, i6, i5) + topInset, -t5.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, int i5, int i6, boolean z4) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t5, i5);
            boolean z5 = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(appBarChildOnOffset);
                    if (i6 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i5) < (appBarChildOnOffset.getBottom() - minimumHeight) - t5.getTopInset()) : (-i5) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t5.getTopInset()) {
                        z5 = true;
                    }
                }
            }
            if (t5.isLiftOnScroll()) {
                z5 = t5.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t5.setLiftedState(z5);
            if (z4 || (liftedState && shouldJumpElevationState(coordinatorLayout, t5))) {
                if (t5.getBackground() != null) {
                    t5.getBackground().jumpToCurrentState();
                }
                if (t5.getForeground() != null) {
                    t5.getForeground().jumpToCurrentState();
                }
                if (t5.getStateListAnimator() != null) {
                    t5.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @VisibleForTesting
        boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        void restoreScrollState(@Nullable SavedState savedState, boolean z4) {
            if (this.savedState == null || z4) {
                this.savedState = savedState;
            }
        }

        @Nullable
        SavedState saveScrollState(@Nullable Parcelable parcelable, @NonNull T t5) {
            boolean z4;
            boolean z5;
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t5.getChildCount();
            boolean z6 = false;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t5.getChildAt(i5);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (topAndBottomOffset == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    savedState.fullyExpanded = z4;
                    if (!z4 && (-topAndBottomOffset) >= t5.getTotalScrollRange()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    savedState.fullyScrolled = z5;
                    savedState.firstVisibleChildIndex = i5;
                    if (bottom == ViewCompat.getMinimumHeight(childAt) + t5.getTopInset()) {
                        z6 = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z6;
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(@Nullable BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t5) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t5);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(@NonNull T t5) {
            return (-t5.getDownNestedScrollRange()) + t5.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(@NonNull T t5) {
            return t5.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5) {
            snapToChildIfNeeded(coordinatorLayout, t5);
            if (t5.isLiftOnScroll()) {
                t5.setLiftedState(t5.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, int i5) {
            int round;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) t5, i5);
            int pendingAction = t5.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z4 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i6 = -t5.getUpNestedPreScrollRange();
                        if (z4) {
                            animateOffsetTo(coordinatorLayout, t5, i6, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t5, i6);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z4) {
                            animateOffsetTo(coordinatorLayout, t5, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t5, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t5, -t5.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t5, 0);
            } else {
                View childAt = t5.getChildAt(savedState.firstVisibleChildIndex);
                int i7 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    round = ViewCompat.getMinimumHeight(childAt) + t5.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t5, i7 + round);
            }
            t5.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -t5.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t5, getTopAndBottomOffset(), 0, true);
            t5.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t5);
            return onLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, int i5, int i6, int i7, int i8) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) t5.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(t5, i5, i6, View.MeasureSpec.makeMeasureSpec(0, 0), i8);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) t5, i5, i6, i7, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t5, View view, int i5, int i6, int[] iArr, int i7) {
            int i8;
            int i9;
            if (i6 != 0) {
                if (i6 < 0) {
                    i8 = -t5.getTotalScrollRange();
                    i9 = t5.getDownNestedPreScrollRange() + i8;
                } else {
                    i8 = -t5.getUpNestedPreScrollRange();
                    i9 = 0;
                }
                int i10 = i8;
                int i11 = i9;
                if (i10 != i11) {
                    iArr[1] = scroll(coordinatorLayout, t5, i6, i10, i11);
                }
            }
            if (t5.isLiftOnScroll()) {
                t5.setLiftedState(t5.shouldLift(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t5, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            if (i8 < 0) {
                iArr[1] = scroll(coordinatorLayout, t5, i8, -t5.getDownNestedScrollRange(), 0);
            }
            if (i8 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout, t5);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t5, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) t5, parcelable);
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) t5);
            SavedState saveScrollState = saveScrollState(onSaveInstanceState, t5);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, @NonNull View view, View view2, int i5, int i6) {
            ValueAnimator valueAnimator;
            boolean z4 = (i5 & 2) != 0 && (t5.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t5, view));
            if (z4 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i6;
            return z4;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t5, View view, int i5) {
            if (this.lastStartedType == 0 || i5 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t5);
                if (t5.isLiftOnScroll()) {
                    t5.setLiftedState(t5.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t5, int i5, int i6, int i7) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i8 = 0;
            if (i6 != 0 && topBottomOffsetForScrollingSibling >= i6 && topBottomOffsetForScrollingSibling <= i7) {
                int clamp = MathUtils.clamp(i5, i6, i7);
                if (topBottomOffsetForScrollingSibling != clamp) {
                    int interpolateOffset = t5.hasChildWithInterpolator() ? interpolateOffset(t5, clamp) : clamp;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i9 = topBottomOffsetForScrollingSibling - clamp;
                    this.offsetDelta = clamp - interpolateOffset;
                    if (topAndBottomOffset) {
                        while (i8 < t5.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t5.getChildAt(i8).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t5, t5.getChildAt(i8), getTopAndBottomOffset());
                            }
                            i8++;
                        }
                    }
                    if (!topAndBottomOffset && t5.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t5);
                    }
                    t5.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t5, clamp, clamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i8 = i9;
                }
            } else {
                this.offsetDelta = 0;
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t5);
            return i8;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                @NonNull
                public SavedState[] newArray(int i5) {
                    return new SavedState[i5];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public SavedState createFromParcel(@NonNull Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i5) {
                super.writeToParcel(parcel, i5);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t5, int i5);
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes2.dex */
        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i5) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i5, int i6, int i7, int i8) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i5, i6, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i5, int i6, int[] iArr, int i7) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5, i6, iArr, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5, i6, i7, i8, i9, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i5, int i6) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i5) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(@Nullable BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z4) {
            super.setHorizontalOffsetEnabled(z4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i5) {
            return super.setLeftAndRightOffset(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i5) {
            return super.setTopAndBottomOffset(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z4) {
            super.setVerticalOffsetEnabled(z4);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f5);
    }

    /* loaded from: classes2.dex */
    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f5) {
            updateRelativeRect(this.relativeRect, appBarLayout, view);
            float abs = this.relativeRect.top - Math.abs(f5);
            if (abs <= 0.0f) {
                float clamp = 1.0f - MathUtils.clamp(Math.abs(abs / this.relativeRect.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (clamp * clamp)));
                view.setTranslationY(height);
                view.getDrawingRect(this.ghostRect);
                this.ghostRect.offset(0, (int) (-height));
                if (height >= this.ghostRect.height()) {
                    view.setVisibility(4);
                } else {
                    view.setVisibility(0);
                }
                ViewCompat.setClipBounds(view, this.ghostRect);
                return;
            }
            ViewCompat.setClipBounds(view, null);
            view.setTranslationY(0.0f);
            view.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes2.dex */
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i5 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i5)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i5, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @Nullable
        private ChildScrollEffect createScrollEffectFromInt(int i5) {
            if (i5 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        @Nullable
        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            int i5 = this.scrollFlags;
            return (i5 & 1) == 1 && (i5 & 10) != 0;
        }

        public void setScrollEffect(@Nullable ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public void setScrollFlags(int i5) {
            this.scrollFlags = i5;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(int i5) {
            this.scrollEffect = createScrollEffectFromInt(i5);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i5, int i6, float f5) {
            super(i5, i6, f5);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        @RequiresApi(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    /* loaded from: classes2.dex */
    public interface LiftOnScrollListener {
        void onUpdate(@Dimension float f5, @ColorInt int i5);
    }

    /* loaded from: classes2.dex */
    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i5);
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).offsetDelta) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        /* bridge */ /* synthetic */ View findFirstDependency(@NonNull List list) {
            return findFirstDependency((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(View view) {
            int i5;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i5 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i5) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
            return super.onLayoutChild(coordinatorLayout, view, i5);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5, int i6, int i7, int i8) {
            return super.onMeasureChild(coordinatorLayout, view, i5, i6, i7, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z4) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z4);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z4) {
            super.setHorizontalOffsetEnabled(z4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i5) {
            return super.setLeftAndRightOffset(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i5) {
            return super.setTopAndBottomOffset(i5);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z4) {
            super.setVerticalOffsetEnabled(z4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        @Nullable
        AppBarLayout findFirstDependency(@NonNull List<View> list) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = list.get(i5);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    @Nullable
    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @Nullable
    private View findLiftOnScrollTargetView(@Nullable View view) {
        int i5;
        View view2;
        if (this.liftOnScrollTargetView == null && (i5 = this.liftOnScrollTargetViewId) != -1) {
            if (view != null) {
                view2 = view.findViewById(i5);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (view2 != null) {
                this.liftOnScrollTargetView = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, @NonNull final ColorStateList colorStateList, @NonNull final ColorStateList colorStateList2) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, materialShapeDrawable);
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
        ViewCompat.setBackground(this, materialShapeDrawable);
    }

    private void invalidateScrollRanges() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.behavior;
        if (behavior != null && this.totalScrollRange != -1 && this.pendingAction == 0) {
            savedState = behavior.saveScrollState(AbsSavedState.EMPTY_STATE, this);
        } else {
            savedState = null;
        }
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedState != null) {
            this.behavior.restoreScrollState(savedState, false);
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int layer = MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(layer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            DrawableCompat.setTint(this.statusBarForeground, layer);
        }
        if (!this.liftOnScrollListeners.isEmpty()) {
            for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
                if (materialShapeDrawable.getFillColor() != null) {
                    liftOnScrollListener.onUpdate(0.0f, layer);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(floatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private boolean setLiftableState(boolean z4) {
        if (this.liftable != z4) {
            this.liftable = z4;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) {
            return false;
        }
        return true;
    }

    private void startLiftOnScrollColorAnimation(float f5, float f6) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f6);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i5;
        int minimumHeight;
        int i6 = this.downPreScrollRange;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 5) == 5) {
                    int i9 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i8 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i8 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i5 = i9 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            i5 = Math.min(i5, measuredHeight - getTopInset());
                        }
                        i7 += i5;
                    }
                    i5 = i9 + minimumHeight;
                    if (childCount == 0) {
                        i5 = Math.min(i5, measuredHeight - getTopInset());
                    }
                    i7 += i5;
                } else if (i7 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i7);
        this.downPreScrollRange = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i5 = this.downScrollRange;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 1) == 0) {
                    break;
                }
                i7 += measuredHeight;
                if ((i8 & 2) != 0) {
                    i7 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.downScrollRange = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = ViewCompat.getMinimumHeight(getChildAt(childCount - 1));
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i5 = this.totalScrollRange;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = layoutParams.scrollFlags;
                if ((i8 & 1) == 0) {
                    break;
                }
                i7 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i6 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                    i7 -= getTopInset();
                }
                if ((i8 & 2) != 0) {
                    i7 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.totalScrollRange = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int i6;
        int i7;
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + iArr.length);
        boolean z4 = this.liftable;
        int i8 = R.attr.state_liftable;
        if (!z4) {
            i8 = -i8;
        }
        iArr[0] = i8;
        if (z4 && this.lifted) {
            i6 = R.attr.state_lifted;
        } else {
            i6 = -R.attr.state_lifted;
        }
        iArr[1] = i6;
        int i9 = R.attr.state_collapsible;
        if (!z4) {
            i9 = -i9;
        }
        iArr[2] = i9;
        if (z4 && this.lifted) {
            i7 = R.attr.state_collapsed;
        } else {
            i7 = -R.attr.state_collapsed;
        }
        iArr[3] = i7;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        boolean z5 = true;
        if (ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i9).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i9++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z5 = false;
            }
            setLiftableState(z5);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = MathUtils.clamp(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i6));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    void onOffsetChanged(int i5) {
        this.currentOffset = i5;
        if (!willNotDraw()) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i6);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i5);
                }
            }
        }
    }

    WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            updateWillNotDraw();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public boolean removeLiftOnScrollListener(@NonNull LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(@Nullable BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setExpanded(boolean z4) {
        setExpanded(z4, ViewCompat.isLaidOut(this));
    }

    public void setLiftOnScroll(boolean z4) {
        this.liftOnScroll = z4;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i5) {
        this.liftOnScrollTargetViewId = i5;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z4) {
        this.liftableOverride = true;
        return setLiftableState(z4);
    }

    public void setLiftableOverrideEnabled(boolean z4) {
        this.liftableOverride = z4;
    }

    public boolean setLifted(boolean z4) {
        return setLiftedState(z4, true);
    }

    boolean setLiftedState(boolean z4) {
        return setLiftedState(z4, !this.liftableOverride);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i5) {
        if (i5 == 1) {
            super.setOrientation(i5);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        boolean z4;
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarForeground = drawable3;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable4 = this.statusBarForeground;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarForeground, ViewCompat.getLayoutDirection(this));
                Drawable drawable5 = this.statusBarForeground;
                if (getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                drawable5.setVisible(z4, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i5) {
        setStatusBarForeground(new ColorDrawable(i5));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i5) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i5));
    }

    @Deprecated
    public void setTargetElevation(float f5) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f5);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        boolean z4;
        super.setVisibility(i5);
        if (i5 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
    }

    boolean shouldLift(@Nullable View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z4, boolean z5) {
        setExpanded(z4, z5, true);
    }

    boolean setLiftedState(boolean z4, boolean z5) {
        if (!z5 || this.lifted == z4) {
            return false;
        }
        this.lifted = z4;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z4 ? 0.0f : this.appBarElevation, z4 ? this.appBarElevation : 0.0f);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.totalScrollRange = r11
            r10.downPreScrollRange = r11
            r10.downScrollRange = r11
            r6 = 0
            r10.pendingAction = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.liftOnScrollListeners = r0
            android.content.Context r7 = r10.getContext()
            r8 = 1
            r10.setOrientation(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r10.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.ViewUtilsLollipop.setBoundsViewOutlineProvider(r10)
        L2f:
            com.google.android.material.appbar.ViewUtilsLollipop.setStateListAnimatorFromAttrs(r10, r12, r13, r4)
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.ViewCompat.setBackground(r10, r13)
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollColor
            android.content.res.ColorStateList r13 = com.google.android.material.resources.MaterialResources.getColorStateList(r7, r12, r13)
            if (r13 == 0) goto L4f
            goto L50
        L4f:
            r8 = r6
        L50:
            r10.hasLiftOnScrollColor = r8
            android.graphics.drawable.Drawable r0 = r10.getBackground()
            android.content.res.ColorStateList r0 = com.google.android.material.drawable.DrawableUtils.getColorStateListOrNull(r0)
            if (r0 == 0) goto L6d
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r1.setFillColor(r0)
            if (r13 == 0) goto L6a
            r10.initializeLiftOnScrollWithColor(r1, r0, r13)
            goto L6d
        L6a:
            r10.initializeLiftOnScrollWithElevation(r7, r1)
        L6d:
            int r13 = com.google.android.material.R.attr.motionDurationMedium2
            android.content.res.Resources r0 = r10.getResources()
            int r1 = com.google.android.material.R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            int r13 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r7, r13, r0)
            long r0 = (long) r13
            r10.liftOnScrollColorDuration = r0
            int r13 = com.google.android.material.R.attr.motionEasingStandardInterpolator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            android.animation.TimeInterpolator r13 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r7, r13, r0)
            r10.liftOnScrollColorInterpolator = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L99
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setExpanded(r13, r6, r6)
        L99:
            int r13 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La9
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r10, r13)
        La9:
            r13 = 26
            if (r9 < r13) goto Lcb
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lbc
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        Lbc:
            int r13 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lcb
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        Lcb:
            android.content.res.Resources r13 = r10.getResources()
            int r0 = com.google.android.material.R.dimen.design_appbar_elevation
            float r13 = r13.getDimension(r0)
            r10.appBarElevation = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r13 = r12.getBoolean(r13, r6)
            r10.liftOnScroll = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r11 = r12.getResourceId(r13, r11)
            r10.liftOnScrollTargetViewId = r11
            int r11 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$1 r11 = new com.google.android.material.appbar.AppBarLayout$1
            r11.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setExpanded(boolean z4, boolean z5, boolean z6) {
        this.pendingAction = (z4 ? 1 : 2) | (z5 ? 4 : 0) | (z6 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
