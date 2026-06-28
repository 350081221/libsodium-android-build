package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {
    private static final String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;
    ConstraintLayout mContainer;
    private float mGroupRotateAngle;
    boolean mNeedBounds;
    private float mRotationCenterX;
    private float mRotationCenterY;
    private float mScaleX;
    private float mScaleY;
    private float mShiftX;
    private float mShiftY;
    View[] mViews;

    public Layer(Context context) {
        super(context);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    private void reCacheViews() {
        int i5;
        if (this.mContainer == null || (i5 = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != i5) {
            this.mViews = new View[i5];
        }
        for (int i6 = 0; i6 < this.mCount; i6++) {
            this.mViews[i6] = this.mContainer.getViewById(this.mIds[i6]);
        }
    }

    private void transform() {
        double radians;
        if (this.mContainer == null) {
            return;
        }
        if (this.mViews == null) {
            reCacheViews();
        }
        calcCenters();
        if (Float.isNaN(this.mGroupRotateAngle)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.mGroupRotateAngle);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f5 = this.mScaleX;
        float f6 = f5 * cos;
        float f7 = this.mScaleY;
        float f8 = (-f7) * sin;
        float f9 = f5 * sin;
        float f10 = f7 * cos;
        for (int i5 = 0; i5 < this.mCount; i5++) {
            View view = this.mViews[i5];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f11 = left - this.mComputedCenterX;
            float f12 = top - this.mComputedCenterY;
            float f13 = (((f6 * f11) + (f8 * f12)) - f11) + this.mShiftX;
            float f14 = (((f11 * f9) + (f10 * f12)) - f12) + this.mShiftY;
            view.setTranslationX(f13);
            view.setTranslationY(f14);
            view.setScaleY(this.mScaleY);
            view.setScaleX(this.mScaleX);
            if (!Float.isNaN(this.mGroupRotateAngle)) {
                view.setRotation(this.mGroupRotateAngle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    protected void calcCenters() {
        if (this.mContainer == null) {
            return;
        }
        if (!this.mNeedBounds && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
            return;
        }
        if (!Float.isNaN(this.mRotationCenterX) && !Float.isNaN(this.mRotationCenterY)) {
            this.mComputedCenterY = this.mRotationCenterY;
            this.mComputedCenterX = this.mRotationCenterX;
            return;
        }
        View[] views = getViews(this.mContainer);
        int left = views[0].getLeft();
        int top = views[0].getTop();
        int right = views[0].getRight();
        int bottom = views[0].getBottom();
        for (int i5 = 0; i5 < this.mCount; i5++) {
            View view = views[i5];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.mComputedMaxX = right;
        this.mComputedMaxY = bottom;
        this.mComputedMinX = left;
        this.mComputedMinY = top;
        if (Float.isNaN(this.mRotationCenterX)) {
            this.mComputedCenterX = (left + right) / 2;
        } else {
            this.mComputedCenterX = this.mRotationCenterX;
        }
        if (Float.isNaN(this.mRotationCenterY)) {
            this.mComputedCenterY = (top + bottom) / 2;
        } else {
            this.mComputedCenterY = this.mRotationCenterY;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.mApplyVisibilityOnAttach = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.mApplyElevationOnAttach = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i5 = 0; i5 < this.mCount; i5++) {
                View viewById = this.mContainer.getViewById(this.mIds[i5]);
                if (viewById != null) {
                    if (this.mApplyVisibilityOnAttach) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f5) {
        this.mRotationCenterX = f5;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float f5) {
        this.mRotationCenterY = f5;
        transform();
    }

    @Override // android.view.View
    public void setRotation(float f5) {
        this.mGroupRotateAngle = f5;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        this.mScaleX = f5;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        this.mScaleY = f5;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        this.mShiftX = f5;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        this.mShiftY = f5;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        reCacheViews();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        transform();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.mGroupRotateAngle)) {
                this.mGroupRotateAngle = rotation;
                return;
            }
            return;
        }
        this.mGroupRotateAngle = rotation;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }
}
