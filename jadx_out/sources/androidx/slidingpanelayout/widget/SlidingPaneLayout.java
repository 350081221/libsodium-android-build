package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    FoldingFeature mFoldingFeature;
    private FoldingFeatureObserver mFoldingFeatureObserver;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private FoldingFeatureObserver.OnFoldingFeatureChangeListener mOnFoldingFeatureChangeListener;

    @Nullable
    private PanelSlideListener mPanelSlideListener;
    private final List<PanelSlideListener> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final ArrayList<DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    /* loaded from: classes2.dex */
    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect = new Rect();

        AccessibilityDelegate() {
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        public boolean filter(View view) {
            return SlidingPaneLayout.this.isDimmed(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, obtain);
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i5);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!filter(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private class DisableLayerRunnable implements Runnable {
        final View mChildView;

        DisableLayerRunnable(View view) {
            this.mChildView = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mChildView.getParent() == SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, null);
                SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    /* loaded from: classes2.dex */
    private class DragHelperCallback extends ViewDragHelper.Callback {
        DragHelperCallback() {
        }

        private boolean isDraggable() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.mIsUnableToDrag || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            if (!SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 2) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i5, int i6) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.mSlideableView.getWidth());
                return Math.max(Math.min(i5, width), width - SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i5, paddingLeft), SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i5, int i6) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i6);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i5, int i6) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i6);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i5) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i5) {
            if (SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.mSlideOffset == 1.0f) {
                    slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                    SlidingPaneLayout.this.mPreservedOpenState = false;
                    return;
                }
                slidingPaneLayout.dispatchOnPanelOpened(slidingPaneLayout.mSlideableView);
                SlidingPaneLayout.this.mPreservedOpenState = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i5, int i6, int i7, int i8) {
            SlidingPaneLayout.this.onPanelDragged(i5);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f5, float f6) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f5 < 0.0f || (f5 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.mSlideRange;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f5 > 0.0f || (f5 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.mSlideRange;
                }
            }
            SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i5) {
            if (!isDraggable()) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }
    }

    /* loaded from: classes2.dex */
    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean isOpen;
        int mLockMode;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.mLockMode);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.mLockMode = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(@NonNull View view, float f5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class TouchBlocker extends FrameLayout {
        TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        sEdgeSizeUsingSystemGestureInsets = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private boolean closePane(int i5) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i5)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    @Nullable
    private static Activity getActivityOrNull(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect getFoldBoundsInView(@NonNull FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i5 = iArr[0];
        Rect rect = new Rect(i5, iArr[1], view.getWidth() + i5, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int getMinimumWidth(View view) {
        if (view instanceof TouchBlocker) {
            return ViewCompat.getMinimumWidth(((TouchBlocker) view).getChildAt(0));
        }
        return ViewCompat.getMinimumWidth(view);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) != null) {
            return rootWindowInsets.getSystemGestureInsets();
        }
        return null;
    }

    private static int measureChildHeight(@NonNull View view, int i5, int i6) {
        boolean z4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && layoutParams.weight > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return ViewGroup.getChildMeasureSpec(i5, i6, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private boolean openPane(int i5) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i5)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    private void parallaxOtherViews(float f5) {
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.mSlideableView) {
                float f6 = 1.0f - this.mParallaxOffset;
                int i6 = this.mParallaxBy;
                this.mParallaxOffset = f5;
                int i7 = ((int) (f6 * i6)) - ((int) ((1.0f - f5) * i6));
                if (isLayoutRtlSupport) {
                    i7 = -i7;
                }
                childAt.offsetLeftAndRight(i7);
            }
        }
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.mFoldingFeatureObserver = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.mOnFoldingFeatureChangeListener);
    }

    private ArrayList<Rect> splitViewPositions() {
        Rect foldBoundsInView;
        FoldingFeature foldingFeature = this.mFoldingFeature;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.mFoldingFeature.getBounds().left == 0 || this.mFoldingFeature.getBounds().top != 0 || (foldBoundsInView = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), foldBoundsInView.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, foldBoundsInView.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static boolean viewIsOpaque(View view) {
        return view.isOpaque();
    }

    public void addPanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.add(panelSlideListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i5, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i5, layoutParams);
        } else {
            super.addView(view, i5, layoutParams);
        }
    }

    protected boolean canScroll(View view, boolean z4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i6 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i9 = i7 + scrollY) >= childAt.getTop() && i9 < childAt.getBottom() && canScroll(childAt, true, i5, i10 - childAt.getLeft(), i9 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z4) {
            if (isLayoutRtlSupport()) {
                i8 = i5;
            } else {
                i8 = -i5;
            }
            if (view.canScrollHorizontally(i8)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (!this.mCanSlide) {
                this.mDragHelper.abort();
            } else {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    void dispatchOnPanelClosed(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelOpened(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    void dispatchOnPanelSlide(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelSlide(view, this.mSlideOffset);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i5;
        int i6;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        } else {
            drawable = this.mShadowDrawableLeft;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                i6 = view.getRight();
                i5 = intrinsicWidth + i6;
            } else {
                int left = view.getLeft();
                int i7 = left - intrinsicWidth;
                i5 = left;
                i6 = i7;
            }
            drawable.setBounds(i6, top, i5, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        if (isLayoutRtlSupport() ^ isOpen()) {
            this.mDragHelper.setEdgeTrackingEnabled(1);
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                ViewDragHelper viewDragHelper = this.mDragHelper;
                viewDragHelper.setEdgeSize(Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            }
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(2);
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                ViewDragHelper viewDragHelper2 = this.mDragHelper;
                viewDragHelper2.setEdgeSize(Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets2.right));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                Rect rect = this.mTmpRect;
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                Rect rect2 = this.mTmpRect;
                rect2.right = Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean drawChild = super.drawChild(canvas, view, j5);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    @Px
    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    void invalidateChildRegion(View view) {
        ViewCompat.setLayerPaint(view, ((LayoutParams) view.getLayoutParams()).dimPaint);
    }

    boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.mCanSlide || !layoutParams.dimWhenOffset || this.mSlideOffset <= 0.0f) {
            return false;
        }
        return true;
    }

    boolean isLayoutRtlSupport() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 0.0f;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityOrNull;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver != null && (activityOrNull = getActivityOrNull(getContext())) != null) {
            this.mFoldingFeatureObserver.registerLayoutStateChangeCallback(activityOrNull);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        FoldingFeatureObserver foldingFeatureObserver = this.mFoldingFeatureObserver;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.mPostedRunnables.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mPostedRunnables.get(i5).run();
        }
        this.mPostedRunnables.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = this.mDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.mCanSlide && (!this.mIsUnableToDrag || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x4 = motionEvent.getX();
                        float y4 = motionEvent.getY();
                        float abs = Math.abs(x4 - this.mInitialMotionX);
                        float abs2 = Math.abs(y4 - this.mInitialMotionY);
                        if (abs > this.mDragHelper.getTouchSlop() && abs2 > abs) {
                            this.mDragHelper.cancel();
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                    }
                } else {
                    this.mIsUnableToDrag = false;
                    float x5 = motionEvent.getX();
                    float y5 = motionEvent.getY();
                    this.mInitialMotionX = x5;
                    this.mInitialMotionY = y5;
                    if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x5, (int) y5) && isDimmed(this.mSlideableView)) {
                        z4 = true;
                        if (this.mDragHelper.shouldInterceptTouchEvent(motionEvent) && !z4) {
                            return false;
                        }
                    }
                }
                z4 = false;
                return this.mDragHelper.shouldInterceptTouchEvent(motionEvent) ? true : true;
            }
            this.mDragHelper.cancel();
            return false;
        }
        this.mDragHelper.cancel();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int paddingLeft;
        int paddingRight;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        float f5;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int i16 = i7 - i5;
        if (isLayoutRtlSupport) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtlSupport) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mPreservedOpenState) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            this.mSlideOffset = f5;
        }
        int i17 = paddingLeft;
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i9 = i17;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i19 = i16 - paddingRight;
                    int min = (Math.min(paddingLeft, i19) - i17) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.mSlideRange = min;
                    if (isLayoutRtlSupport) {
                        i15 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }
                    if (i17 + i15 + min + (measuredWidth / 2) > i19) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    layoutParams.dimWhenOffset = z5;
                    int i20 = (int) (min * this.mSlideOffset);
                    this.mSlideOffset = i20 / min;
                    i9 = i17 + i15 + i20;
                    i10 = 0;
                } else if (this.mCanSlide && (i11 = this.mParallaxBy) != 0) {
                    i10 = (int) ((1.0f - this.mSlideOffset) * i11);
                    i9 = paddingLeft;
                } else {
                    i9 = paddingLeft;
                    i10 = 0;
                }
                if (isLayoutRtlSupport) {
                    i13 = (i16 - i9) + i10;
                    i12 = i13 - measuredWidth;
                } else {
                    i12 = i9 - i10;
                    i13 = i12 + measuredWidth;
                }
                childAt.layout(i12, paddingTop, i13, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature = this.mFoldingFeature;
                if (foldingFeature != null && foldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.mFoldingFeature.isSeparating()) {
                    i14 = this.mFoldingFeature.getBounds().width();
                } else {
                    i14 = 0;
                }
                paddingLeft += childAt.getWidth() + Math.abs(i14);
            }
            i18++;
            i17 = i9;
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mParallaxBy != 0) {
                parallaxOtherViews(this.mSlideOffset);
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int paddingTop;
        int i7;
        int i8;
        boolean z4;
        int measuredWidth;
        int i9;
        int i10;
        int makeMeasureSpec;
        boolean z5;
        int i11;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        ?? r8 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i7 = 0;
            } else {
                i7 = (size2 - getPaddingTop()) - getPaddingBottom();
            }
            paddingTop = i7;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i7 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i12 = 0;
        boolean z6 = false;
        int i13 = max;
        float f5 = 0.0f;
        while (true) {
            i8 = 8;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i14 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = r8;
            } else {
                float f6 = layoutParams.weight;
                if (f6 > 0.0f) {
                    f5 += f6;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r8);
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i15 == -2) {
                    if (mode == 0) {
                        i11 = mode;
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, i11);
                } else if (i15 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, mode);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                }
                childAt.measure(makeMeasureSpec, ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i7) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i7 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i7 = measuredHeight;
                    }
                }
                i13 -= measuredWidth2;
                if (i12 != 0) {
                    if (i13 < 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    layoutParams.slideable = z5;
                    z6 |= z5;
                    if (z5) {
                        this.mSlideableView = childAt;
                    }
                }
            }
            i12++;
            size = i14;
            r8 = 0;
        }
        int i16 = size;
        int i17 = i13;
        if (z6 || f5 > 0.0f) {
            int i18 = 0;
            while (i18 < childCount) {
                View childAt2 = getChildAt(i18);
                if (childAt2.getVisibility() != i8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.weight > 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        measuredWidth = 0;
                    } else {
                        measuredWidth = childAt2.getMeasuredWidth();
                    }
                    if (z6) {
                        i9 = max - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        i10 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        i9 = measuredWidth + ((int) ((layoutParams2.weight * Math.max(0, i17)) / f5));
                        i10 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else {
                        i9 = measuredWidth;
                        i10 = 0;
                    }
                    int measureChildHeight = measureChildHeight(childAt2, i6, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth != i9) {
                        childAt2.measure(i10, measureChildHeight);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i7) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i7 = measuredHeight2;
                        }
                    }
                }
                i18++;
                i8 = 8;
            }
        }
        ArrayList<Rect> splitViewPositions = splitViewPositions();
        if (splitViewPositions != null && !z6) {
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = splitViewPositions.get(i19);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i20 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), makeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1 && (getMinimumWidth(childAt3) == 0 || rect.width() >= getMinimumWidth(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), makeMeasureSpec2);
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i20, 1073741824), makeMeasureSpec2);
                        if (i19 != 0) {
                            layoutParams3.slideable = true;
                            this.mSlideableView = childAt3;
                            z6 = true;
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i16, i7 + getPaddingTop() + getPaddingBottom());
        this.mCanSlide = z6;
        if (this.mDragHelper.getViewDragState() != 0 && !z6) {
            this.mDragHelper.abort();
        }
    }

    void onPanelDragged(int i5) {
        int paddingLeft;
        int i6;
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (isLayoutRtlSupport) {
            i5 = (getWidth() - i5) - width;
        }
        if (isLayoutRtlSupport) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtlSupport) {
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        float f5 = (i5 - (paddingLeft + i6)) / this.mSlideRange;
        this.mSlideOffset = f5;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(f5);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        setLockMode(savedState.mLockMode);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z4;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (isSlideable()) {
            z4 = isOpen();
        } else {
            z4 = this.mPreservedOpenState;
        }
        savedState.isOpen = z4;
        savedState.mLockMode = this.mLockMode;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 != i7) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                float f5 = x4 - this.mInitialMotionX;
                float f6 = y4 - this.mInitialMotionY;
                int touchSlop = this.mDragHelper.getTouchSlop();
                if ((f5 * f5) + (f6 * f6) < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x4, (int) y4)) {
                    closePane(0);
                }
            }
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.mInitialMotionX = x5;
            this.mInitialMotionY = y5;
        }
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    public void removePanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.remove(panelSlideListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z4;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.mCanSlide) {
            if (view == this.mSlideableView) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.mPreservedOpenState = z4;
        }
    }

    void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i5) {
        this.mCoveredFadeColor = i5;
    }

    public final void setLockMode(int i5) {
        this.mLockMode = i5;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.mPanelSlideListener;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.mPanelSlideListener = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i5) {
        this.mParallaxBy = i5;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i5) {
        setShadowDrawableLeft(getResources().getDrawable(i5));
    }

    public void setShadowResourceLeft(int i5) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i5));
    }

    public void setShadowResourceRight(int i5) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i5));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i5) {
        this.mSliderFadeColor = i5;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    boolean smoothSlideTo(float f5, int i5) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtlSupport) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f5 * this.mSlideRange)) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f5 * this.mSlideRange));
        }
        ViewDragHelper viewDragHelper = this.mDragHelper;
        View view = this.mSlideableView;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    void updateObscuredViewsVisibility(View view) {
        int paddingLeft;
        int width;
        int i5;
        int i6;
        int i7;
        int i8;
        View childAt;
        int i9;
        boolean z4;
        int i10;
        int i11;
        View view2 = view;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        if (isLayoutRtlSupport) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtlSupport) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && viewIsOpaque(view)) {
            i5 = view.getLeft();
            i6 = view.getRight();
            i7 = view.getTop();
            i8 = view.getBottom();
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount && (childAt = getChildAt(i12)) != view2) {
            if (childAt.getVisibility() == 8) {
                z4 = isLayoutRtlSupport;
            } else {
                if (isLayoutRtlSupport) {
                    i9 = width;
                } else {
                    i9 = paddingLeft;
                }
                int max = Math.max(i9, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z4 = isLayoutRtlSupport;
                if (isLayoutRtlSupport) {
                    i10 = paddingLeft;
                } else {
                    i10 = width;
                }
                int min = Math.min(i10, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i5 && max2 >= i7 && min <= i6 && min2 <= i8) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                childAt.setVisibility(i11);
            }
            i12++;
            view2 = view;
            isLayoutRtlSupport = z4;
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {R.attr.layout_weight};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void onFoldingFeatureChange(@NonNull FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.mFoldingFeature = foldingFeature;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(300L);
                changeBounds.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.beginDelayedTransition(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f5 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper create = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.mDragHelper = create;
        create.setMinVelocity(f5 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context), ContextCompat.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean closePane() {
        return closePane(0);
    }

    public boolean openPane() {
        return openPane(0);
    }
}
