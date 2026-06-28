package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
abstract class CarouselOrientationHelper {
    final int orientation;

    private static CarouselOrientationHelper createHorizontalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f5 = rectF2.left;
                float f6 = rectF3.left;
                if (f5 < f6 && rectF2.right > f6) {
                    float f7 = f6 - f5;
                    rectF.left += f7;
                    rectF2.left += f7;
                }
                float f8 = rectF2.right;
                float f9 = rectF3.right;
                if (f8 > f9 && rectF2.left < f9) {
                    float f10 = f8 - f9;
                    rectF.right = Math.max(rectF.right - f10, rectF.left);
                    rectF2.right = Math.max(rectF2.right - f10, rectF2.left);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f5, float f6, float f7, float f8) {
                return new RectF(f8, 0.0f, f6 - f8, f5);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i5, int i6) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i5, parentTop, i6, parentTop + getDecoratedCrossAxisMeasurement(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    float floor = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.right = floor;
                    rectF.left = Math.min(rectF.left, floor);
                }
                if (rectF2.left >= rectF3.right) {
                    float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.left = ceil;
                    rectF.right = Math.max(ceil, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f5, float f6) {
                view.offsetLeftAndRight((int) (f6 - (rect.left + f5)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager carouselLayoutManager, int i5) {
        if (i5 != 0) {
            if (i5 == 1) {
                return createVerticalHelper(carouselLayoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return createHorizontalHelper(carouselLayoutManager);
    }

    private static CarouselOrientationHelper createVerticalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f5 = rectF2.top;
                float f6 = rectF3.top;
                if (f5 < f6 && rectF2.bottom > f6) {
                    float f7 = f6 - f5;
                    rectF.top += f7;
                    rectF3.top += f7;
                }
                float f8 = rectF2.bottom;
                float f9 = rectF3.bottom;
                if (f8 > f9 && rectF2.top < f9) {
                    float f10 = f8 - f9;
                    rectF.bottom = Math.max(rectF.bottom - f10, rectF.top);
                    rectF2.bottom = Math.max(rectF2.bottom - f10, rectF2.top);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f5, float f6, float f7, float f8) {
                return new RectF(0.0f, f7, f6, f5 - f7);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return getParentBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return getParentTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i5, int i6) {
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i5, parentLeft + getDecoratedCrossAxisMeasurement(view), i6);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.bottom = floor;
                    rectF.top = Math.min(rectF.top, floor);
                }
                if (rectF2.top >= rectF3.bottom) {
                    float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.top = ceil;
                    rectF.bottom = Math.max(ceil, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f5, float f6) {
                view.offsetTopAndBottom((int) (f6 - (rect.top + f5)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract int getDecoratedCrossAxisMeasurement(View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float getMaskMargins(RecyclerView.LayoutParams layoutParams);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract RectF getMaskRect(float f5, float f6, float f7, float f8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentBottom();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentEnd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentLeft();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentRight();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentStart();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getParentTop();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void layoutDecoratedWithMargins(View view, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void offsetChild(View view, Rect rect, float f5, float f6);

    private CarouselOrientationHelper(int i5) {
        this.orientation = i5;
    }
}
