package com.yuanqi.group.abs.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.percentlayout.widget.PercentLayoutHelper;

/* loaded from: classes3.dex */
public class PercentLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private PercentLayoutHelper f13734a;

    public PercentLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13734a = new PercentLayoutHelper(this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        this.f13734a.restoreOriginalParams();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        this.f13734a.adjustChildren(i5, i6);
        super.onMeasure(i5, i6);
        if (this.f13734a.handleMeasuredStateTooSmall()) {
            super.onMeasure(i5, i6);
        }
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams implements PercentLayoutHelper.PercentLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        private PercentLayoutHelper.PercentLayoutInfo f13735a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13735a = PercentLayoutHelper.getPercentLayoutInfo(context, attributeSet);
        }

        @Override // androidx.percentlayout.widget.PercentLayoutHelper.PercentLayoutParams
        public PercentLayoutHelper.PercentLayoutInfo getPercentLayoutInfo() {
            return this.f13735a;
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i5, int i6) {
            PercentLayoutHelper.fetchWidthAndHeight(this, typedArray, i5, i6);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
