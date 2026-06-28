package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* loaded from: classes2.dex */
public class CarouselSnapHelper extends SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z4) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) layoutManager, z4);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{distanceToFirstFocalKeyline, 0};
        }
        if (layoutManager.canScrollVertically()) {
            return new int[]{0, distanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z4) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z4);
    }

    @Nullable
    private View findViewNearestFirstKeyline(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int abs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(childAt), false));
                if (abs < i5) {
                    view = childAt;
                    i5 = abs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        return layoutManager.canScrollHorizontally() ? i5 > 0 : i6 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    protected RecyclerView.SmoothScroller createScroller(@NonNull final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f5;
                    float f6;
                    if (layoutManager.canScrollVertically()) {
                        f5 = displayMetrics.densityDpi;
                        f6 = 50.0f;
                    } else {
                        f5 = displayMetrics.densityDpi;
                        f6 = 100.0f;
                    }
                    return f6 / f5;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] calculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i5 = calculateDistanceToSnap[0];
                        int i6 = calculateDistanceToSnap[1];
                        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i5), Math.abs(i6)));
                        if (calculateTimeForDeceleration > 0) {
                            action.update(i5, i6, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        int itemCount;
        int i7;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            if (childAt != null) {
                int distanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) layoutManager, false);
                if (distanceToFirstFocalKeyline <= 0 && distanceToFirstFocalKeyline > i9) {
                    view2 = childAt;
                    i9 = distanceToFirstFocalKeyline;
                }
                if (distanceToFirstFocalKeyline >= 0 && distanceToFirstFocalKeyline < i8) {
                    view = childAt;
                    i8 = distanceToFirstFocalKeyline;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i5, i6);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!isForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (isReverseLayout(layoutManager) == isForwardFling) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        int i11 = position + i7;
        if (i11 < 0 || i11 >= itemCount) {
            return -1;
        }
        return i11;
    }

    public CarouselSnapHelper(boolean z4) {
        this.disableFling = z4;
    }
}
