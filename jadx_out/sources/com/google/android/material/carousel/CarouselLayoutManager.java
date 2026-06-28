package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @NonNull
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;

    @Nullable
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @Nullable
    private KeylineStateList keylineStateList;

    @Nullable
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;

    @VisibleForTesting
    int maxScroll;

    @VisibleForTesting
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    @VisibleForTesting
    int scrollOffset;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        ChildCalculations(View view, float f5, float f6, KeylineRange keylineRange) {
            this.child = view;
            this.center = f5;
            this.offsetCenter = f6;
            this.range = keylineRange;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            boolean z4;
            if (keyline.loc <= keyline2.loc) {
                z4 = true;
            } else {
                z4 = false;
            }
            Preconditions.checkArgument(z4);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    /* loaded from: classes2.dex */
    private static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i5, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i5);
        float f5 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f5 - itemSize), (int) (f5 + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f5, float f6) {
        return isLayoutRtl() ? f5 - f6 : f5 + f6;
    }

    private float addStart(float f5, float f6) {
        return isLayoutRtl() ? f5 + f6 : f5 - f6;
    }

    private void addViewAtPosition(@NonNull RecyclerView.Recycler recycler, int i5, int i6) {
        if (i5 >= 0 && i5 < getItemCount()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill(i5), i5);
            addAndLayoutView(makeChildCalculations.child, i6, makeChildCalculations);
        }
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int i5) {
        float calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 < state.getItemCount()) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i5);
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, -1, makeChildCalculations);
                }
                i5++;
            } else {
                return;
            }
        }
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int i5) {
        float calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 >= 0) {
            ChildCalculations makeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill, i5);
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                calculateChildStartForFill = addStart(calculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.offsetCenter, makeChildCalculations.range)) {
                    addAndLayoutView(makeChildCalculations.child, 0, makeChildCalculations);
                }
                i5--;
            } else {
                return;
            }
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f5, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f6 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f6, keyline2.locOffset, keyline.loc, keyline2.loc, f5);
        if (keylineRange.rightOrBottom == this.currentKeylineState.getFirstKeyline() || keylineRange.leftOrTop == this.currentKeylineState.getLastKeyline()) {
            float maskMargins = this.orientationHelper.getMaskMargins((RecyclerView.LayoutParams) view.getLayoutParams()) / this.currentKeylineState.getItemSize();
            KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
            return lerp + ((f5 - keyline3.loc) * ((1.0f - keyline3.mask) + maskMargins));
        }
        return lerp;
    }

    private float calculateChildStartForFill(int i5) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i5);
    }

    private int calculateEndScroll(RecyclerView.State state, KeylineStateList keylineStateList) {
        KeylineState endState;
        KeylineState.Keyline lastFocalKeyline;
        float f5;
        float f6;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            endState = keylineStateList.getStartState();
        } else {
            endState = keylineStateList.getEndState();
        }
        if (isLayoutRtl) {
            lastFocalKeyline = endState.getFirstFocalKeyline();
        } else {
            lastFocalKeyline = endState.getLastFocalKeyline();
        }
        float itemCount = (state.getItemCount() - 1) * endState.getItemSize();
        if (isLayoutRtl) {
            f5 = -1.0f;
        } else {
            f5 = 1.0f;
        }
        float f7 = itemCount * f5;
        if (isLayoutRtl) {
            f6 = -lastFocalKeyline.leftOrTopPaddingShift;
        } else {
            f6 = lastFocalKeyline.rightOrBottomPaddingShift;
        }
        int parentStart = (int) ((f7 - (lastFocalKeyline.loc - getParentStart())) + (getParentEnd() - lastFocalKeyline.loc) + f6);
        if (isLayoutRtl) {
            return Math.min(0, parentStart);
        }
        return Math.max(0, parentStart);
    }

    private static int calculateShouldScrollBy(int i5, int i6, int i7, int i8) {
        int i9 = i6 + i5;
        return i9 < i7 ? i7 - i6 : i9 > i8 ? i8 - i6 : i5;
    }

    private int calculateStartScroll(@NonNull KeylineStateList keylineStateList) {
        KeylineState startState;
        KeylineState.Keyline firstFocalKeyline;
        boolean isLayoutRtl = isLayoutRtl();
        if (isLayoutRtl) {
            startState = keylineStateList.getEndState();
        } else {
            startState = keylineStateList.getStartState();
        }
        if (isLayoutRtl) {
            firstFocalKeyline = startState.getLastFocalKeyline();
        } else {
            firstFocalKeyline = startState.getFirstFocalKeyline();
        }
        return (int) (getParentStart() - addStart(firstFocalKeyline.loc, startState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i5) {
        int orientation = getOrientation();
        if (i5 == 1) {
            return -1;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        Log.d(TAG, "Unknown focus request:" + i5);
                        return Integer.MIN_VALUE;
                    }
                    if (orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (orientation != 0) {
                    return Integer.MIN_VALUE;
                }
                if (isLayoutRtl()) {
                    return -1;
                }
                return 1;
            }
            if (orientation == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (orientation != 0) {
            return Integer.MIN_VALUE;
        }
        if (!isLayoutRtl()) {
            return -1;
        }
        return 1;
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view) {
        int centerY;
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        if (isHorizontal()) {
            centerY = rect.centerX();
        } else {
            centerY = rect.centerY();
        }
        return centerY;
    }

    private int getItemMargins() {
        int i5;
        int i6;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i5 + i6;
    }

    private KeylineState getKeylineStateForPosition(int i5) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        if (map != null && (keylineState = map.get(Integer.valueOf(MathUtils.clamp(i5, 0, Math.max(0, getItemCount() - 1))))) != null) {
            return keylineState;
        }
        return this.keylineStateList.getDefaultState();
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (!getClipToPadding() && this.carouselStrategy.isContained()) {
            if (getOrientation() == 1) {
                return getPaddingTop();
            }
            return getPaddingLeft();
        }
        return 0;
    }

    private float getMaskedItemSizeForLocOffset(float f5, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f6 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f6, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (!getClipToPadding() && this.carouselStrategy.isContained()) {
            if (getOrientation() == 1) {
                return getPaddingBottom();
            }
            return getPaddingRight();
        }
        return 0;
    }

    private int getScrollOffsetForPosition(int i5, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i5 * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((i5 * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i5, @NonNull KeylineState keylineState) {
        int i6;
        int i7 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (i5 * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            if (isLayoutRtl()) {
                i6 = (int) ((getContainerSize() - keyline.loc) - itemSize);
            } else {
                i6 = (int) (itemSize - keyline.loc);
            }
            int i8 = i6 - this.scrollOffset;
            if (Math.abs(i7) > Math.abs(i8)) {
                i7 = i8;
            }
        }
        return i7;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f5, boolean z4) {
        float f6;
        float f7 = Float.MAX_VALUE;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        float f8 = -3.4028235E38f;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        for (int i9 = 0; i9 < list.size(); i9++) {
            KeylineState.Keyline keyline = list.get(i9);
            if (z4) {
                f6 = keyline.locOffset;
            } else {
                f6 = keyline.loc;
            }
            float abs = Math.abs(f6 - f5);
            if (f6 <= f5 && abs <= f7) {
                i5 = i9;
                f7 = abs;
            }
            if (f6 > f5 && abs <= f9) {
                i7 = i9;
                f9 = abs;
            }
            if (f6 <= f10) {
                i6 = i9;
                f10 = f6;
            }
            if (f6 > f8) {
                i8 = i9;
                f8 = f6;
            }
        }
        if (i5 == -1) {
            i5 = i6;
        }
        if (i7 == -1) {
            i7 = i8;
        }
        return new KeylineRange(list.get(i5), list.get(i7));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f5, KeylineRange keylineRange) {
        float addStart = addStart(f5, getMaskedItemSizeForLocOffset(f5, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (addStart < 0.0f) {
                return true;
            }
        } else if (addStart > getContainerSize()) {
            return true;
        }
        return false;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f5, KeylineRange keylineRange) {
        float addEnd = addEnd(f5, getMaskedItemSizeForLocOffset(f5, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (addEnd > getContainerSize()) {
                return true;
            }
        } else if (addEnd < 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i5 == i9 && i6 == i10 && i7 == i11 && i8 == i12) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.material.carousel.a
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.refreshKeylineState();
            }
        });
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterWithMargins(childAt) + ", child index:" + i5);
            }
            Log.d(TAG, "==============");
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float f5, int i5) {
        View viewForPosition = recycler.getViewForPosition(i5);
        measureChildWithMargins(viewForPosition, 0, 0);
        float addEnd = addEnd(f5, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        return new ChildCalculations(viewForPosition, addEnd, calculateChildOffsetCenterForLocation(viewForPosition, addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f5, float f6, Rect rect) {
        float addEnd = addEnd(f5, f6);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f6, calculateChildOffsetCenterForLocation);
        return calculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        KeylineState onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (isLayoutRtl()) {
            onFirstChildMeasuredWithMargins = KeylineState.reverse(onFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, onFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                removeAndRecycleView(childAt2, recycler);
            } else {
                return;
            }
        }
    }

    private void scrollBy(RecyclerView recyclerView, int i5) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i5, 0);
        } else {
            recyclerView.scrollBy(0, i5);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(obtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f5, KeylineRange keylineRange) {
        if (!(view instanceof Maskable)) {
            return;
        }
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f6 = keyline.mask;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float lerp = AnimationUtils.lerp(f6, keyline2.mask, keyline.loc, keyline2.loc, f5);
        float height = view.getHeight();
        float width = view.getWidth();
        RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f5, keylineRange);
        RectF rectF = new RectF(calculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), calculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), calculateChildOffsetCenterForLocation + (maskRect.width() / 2.0f), (maskRect.height() / 2.0f) + calculateChildOffsetCenterForLocation);
        RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
        if (this.carouselStrategy.isContained()) {
            this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
        }
        this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
        ((Maskable) view).setMaskRectF(maskRect);
    }

    private void updateCurrentKeylineStateForScrollOffset(@NonNull KeylineStateList keylineStateList) {
        KeylineState startState;
        int i5 = this.maxScroll;
        int i6 = this.minScroll;
        if (i5 <= i6) {
            if (isLayoutRtl()) {
                startState = keylineStateList.getEndState();
            } else {
                startState = keylineStateList.getStartState();
            }
            this.currentKeylineState = startState;
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i6, i5);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i5 = this.lastItemCount;
        if (itemCount != i5 && this.keylineStateList != null) {
            if (this.carouselStrategy.shouldRefreshKeylineState(this, i5)) {
                refreshKeylineState();
            }
            this.lastItemCount = itemCount;
        }
    }

    private void validateChildOrderIfDebugging() {
        if (this.isDebuggingEnabled && getChildCount() >= 1) {
            int i5 = 0;
            while (i5 < getChildCount() - 1) {
                int position = getPosition(getChildAt(i5));
                int i6 = i5 + 1;
                int position2 = getPosition(getChildAt(i6));
                if (position <= position2) {
                    i5 = i6;
                } else {
                    logChildrenIfDebugging();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i5 + "] had adapter position [" + position + "] and child at index [" + i6 + "] had adapter position [" + position2 + "].");
                }
            }
        }
    }

    int calculateScrollDeltaToMakePositionVisible(int i5) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i5) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5));
        if (isHorizontal()) {
            return new PointF(offsetToScrollToPosition, 0.0f);
        }
        return new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        float f5;
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (isHorizontal()) {
            centerY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(centerY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), centerY, true));
        float f6 = 0.0f;
        if (isHorizontal()) {
            f5 = (rect.width() - maskedItemSizeForLocOffset) / 2.0f;
        } else {
            f5 = 0.0f;
        }
        if (!isHorizontal()) {
            f6 = (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        }
        rect.set((int) (rect.left + f5), (int) (rect.top + f6), (int) (rect.right - f5), (int) (rect.bottom - f6));
    }

    int getOffsetToScrollToPosition(int i5, @NonNull KeylineState keylineState) {
        return getScrollOffsetForPosition(i5, keylineState) - this.scrollOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getOffsetToScrollToPositionForSnap(int i5, boolean z4) {
        int i6;
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        if (this.keylineStatePositionMap != null) {
            i6 = getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5));
        } else {
            i6 = offsetToScrollToPosition;
        }
        if (z4 && Math.abs(i6) < Math.abs(offsetToScrollToPosition)) {
            return i6;
        }
        return offsetToScrollToPosition;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i5, int i6) {
        float f5;
        float f6;
        if (view instanceof Maskable) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            calculateItemDecorationsForChild(view, rect);
            int i7 = i5 + rect.left + rect.right;
            int i8 = i6 + rect.top + rect.bottom;
            KeylineStateList keylineStateList = this.keylineStateList;
            if (keylineStateList != null && this.orientationHelper.orientation == 0) {
                f5 = keylineStateList.getDefaultState().getItemSize();
            } else {
                f5 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            }
            KeylineStateList keylineStateList2 = this.keylineStateList;
            if (keylineStateList2 != null && this.orientationHelper.orientation == 1) {
                f6 = keylineStateList2.getDefaultState().getItemSize();
            } else {
                f6 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            }
            view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i7, (int) f5, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i8, (int) f6, canScrollVertically()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i5, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i5, int i6) {
        super.onItemsAdded(recyclerView, i5, i6);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i5, int i6) {
        super.onItemsRemoved(recyclerView, i5, i6);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z4;
        int i5;
        if (state.getItemCount() > 0 && getContainerSize() > 0.0f) {
            boolean isLayoutRtl = isLayoutRtl();
            if (this.keylineStateList == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                recalculateKeylineStateList(recycler);
            }
            int calculateStartScroll = calculateStartScroll(this.keylineStateList);
            int calculateEndScroll = calculateEndScroll(state, this.keylineStateList);
            if (isLayoutRtl) {
                i5 = calculateEndScroll;
            } else {
                i5 = calculateStartScroll;
            }
            this.minScroll = i5;
            if (isLayoutRtl) {
                calculateEndScroll = calculateStartScroll;
            }
            this.maxScroll = calculateEndScroll;
            if (z4) {
                this.scrollOffset = calculateStartScroll;
                this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
                int i6 = this.currentEstimatedPosition;
                if (i6 != -1) {
                    this.scrollOffset = getScrollOffsetForPosition(i6, getKeylineStateForPosition(i6));
                }
            }
            int i7 = this.scrollOffset;
            this.scrollOffset = i7 + calculateShouldScrollBy(0, i7, this.minScroll, this.maxScroll);
            this.currentFillStartPosition = MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
            updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
            detachAndScrapAttachedViews(recycler);
            fill(recycler, state);
            this.lastItemCount = getItemCount();
            return;
        }
        removeAndRecycleAllViews(recycler);
        this.currentFillStartPosition = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z4, boolean z5) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i5, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i5) {
        this.currentEstimatedPosition = i5;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5));
        this.currentFillStartPosition = MathUtils.clamp(i5, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i5, recycler, state);
        }
        return 0;
    }

    public void setCarouselAlignment(int i5) {
        this.carouselAlignment = i5;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z4) {
        this.isDebuggingEnabled = z4;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z4) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i5);
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i5 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i5);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i5) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i6) {
                if (CarouselLayoutManager.this.keylineStateList != null && CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i6) {
                if (CarouselLayoutManager.this.keylineStateList != null && !CarouselLayoutManager.this.isHorizontal()) {
                    CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                    return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
                }
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            @Nullable
            public PointF computeScrollVectorForPosition(int i6) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i6);
            }
        };
        linearSmoothScroller.setTargetPosition(i5);
        startSmoothScroll(linearSmoothScroller);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i5) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                CarouselLayoutManager.this.lambda$new$0(view, i6, i7, i8, i9, i10, i11, i12, i13);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i5);
    }

    private int scrollBy(int i5, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f5;
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i5, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f5 = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f5 = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f6 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            float abs = Math.abs(f5 - offsetChild(childAt, calculateChildStartForFill, itemSize, rect));
            if (childAt != null && abs < f6) {
                this.currentEstimatedPosition = getPosition(childAt);
                f6 = abs;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return calculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i62, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                CarouselLayoutManager.this.lambda$new$0(view, i62, i7, i8, i9, i10, i11, i12, i13);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
