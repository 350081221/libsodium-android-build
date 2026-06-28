package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    ViewDragHelper viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f5) {
            boolean z4;
            if (f5 != 0.0f) {
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i5 = SwipeDismissBehavior.this.swipeDirection;
                if (i5 == 2) {
                    return true;
                }
                if (i5 == 0) {
                    if (z4) {
                        if (f5 >= 0.0f) {
                            return false;
                        }
                    } else if (f5 <= 0.0f) {
                        return false;
                    }
                    return true;
                }
                if (i5 != 1) {
                    return false;
                }
                if (z4) {
                    if (f5 <= 0.0f) {
                        return false;
                    }
                } else if (f5 >= 0.0f) {
                    return false;
                }
                return true;
            }
            if (Math.abs(view.getLeft() - this.originalCapturedViewLeft) < Math.round(view.getWidth() * SwipeDismissBehavior.this.dragDismissThreshold)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i5, int i6) {
            boolean z4;
            int width;
            int width2;
            int width3;
            if (ViewCompat.getLayoutDirection(view) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i7 = SwipeDismissBehavior.this.swipeDirection;
            if (i7 == 0) {
                if (z4) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i7 == 1) {
                if (z4) {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i5, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i5) {
            this.activePointerId = i5;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i5) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i5);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(@NonNull View view, int i5, int i6, int i7, int i8) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float abs = Math.abs(i5 - this.originalCapturedViewLeft);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f5, float f6) {
            int i5;
            boolean z4;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f5)) {
                if (f5 >= 0.0f) {
                    int left = view.getLeft();
                    int i6 = this.originalCapturedViewLeft;
                    if (left >= i6) {
                        i5 = i6 + width;
                        z4 = true;
                    }
                }
                i5 = this.originalCapturedViewLeft - width;
                z4 = true;
            } else {
                i5 = this.originalCapturedViewLeft;
                z4 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i5, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(view, z4));
            } else if (z4 && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i5) {
            int i6 = this.activePointerId;
            if ((i6 == -1 || i6 == i5) && SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                return true;
            }
            return false;
        }
    };

    /* loaded from: classes2.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i5);
    }

    /* loaded from: classes2.dex */
    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(View view, boolean z4) {
            this.view = view;
            this.dismiss = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.viewDragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else if (this.dismiss && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    static float clamp(float f5, float f6, float f7) {
        return Math.min(Math.max(f5, f6), f7);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        ViewDragHelper create;
        if (this.viewDragHelper == null) {
            if (this.sensitivitySet) {
                create = ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback);
            } else {
                create = ViewDragHelper.create(viewGroup, this.dragCallback);
            }
            this.viewDragHelper = create;
        }
    }

    static float fraction(float f5, float f6, float f7) {
        return (f7 - f5) / (f6 - f5);
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view2, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z4;
                    boolean z5 = false;
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    if (ViewCompat.getLayoutDirection(view2) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i5 = SwipeDismissBehavior.this.swipeDirection;
                    if ((i5 == 0 && z4) || (i5 == 1 && !z4)) {
                        z5 = true;
                    }
                    int width = view2.getWidth();
                    if (z5) {
                        width = -width;
                    }
                    ViewCompat.offsetLeftAndRight(view2, width);
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull MotionEvent motionEvent) {
        boolean z4 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.interceptingEvents = false;
            }
        } else {
            z4 = coordinatorLayout.isPointInChildBounds(v4, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z4;
        }
        if (!z4) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v4, i5);
        if (ViewCompat.getImportantForAccessibility(v4) == 0) {
            ViewCompat.setImportantForAccessibility(v4, 1);
            updateAccessibilityActions(v4);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        if (this.viewDragHelper != null) {
            if (!this.requestingDisallowInterceptTouchEvent || motionEvent.getActionMasked() != 3) {
                this.viewDragHelper.processTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f5) {
        this.dragDismissThreshold = clamp(0.0f, f5, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f5) {
        this.alphaEndSwipeDistance = clamp(0.0f, f5, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f5) {
        this.sensitivity = f5;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f5) {
        this.alphaStartSwipeDistance = clamp(0.0f, f5, 1.0f);
    }

    public void setSwipeDirection(int i5) {
        this.swipeDirection = i5;
    }

    static int clamp(int i5, int i6, int i7) {
        return Math.min(Math.max(i5, i6), i7);
    }
}
