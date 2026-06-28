package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i5, int i6, int i7) {
        return i6 != Integer.MIN_VALUE ? i6 != 1073741824 ? i7 : i5 : Math.min(i7, i5);
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.itemSpacing;
    }

    protected int getLineSpacing() {
        return this.lineSpacing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        boolean z5;
        int paddingLeft;
        int paddingRight;
        int i9;
        int i10;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z5) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i11 = (i7 - i5) - paddingRight;
        int i12 = paddingLeft;
        int i13 = paddingTop;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    i9 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int measuredWidth = i12 + i10 + childAt.getMeasuredWidth();
                if (!this.singleLine && measuredWidth > i11) {
                    i13 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    i12 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i15 = i12 + i10;
                int measuredWidth2 = childAt.getMeasuredWidth() + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (z5) {
                    childAt.layout(i11 - measuredWidth2, i13, (i11 - i12) - i10, measuredHeight);
                } else {
                    childAt.layout(i15, i13, measuredWidth2, measuredHeight);
                }
                i12 += i10 + i9 + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i7 - getPaddingRight();
        int i11 = paddingTop;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.leftMargin + 0;
                    i9 = marginLayoutParams.rightMargin + 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                int i14 = paddingLeft;
                if (paddingLeft + i8 + childAt.getMeasuredWidth() > paddingRight && !isSingleLine()) {
                    i10 = getPaddingLeft();
                    i11 = this.lineSpacing + paddingTop;
                } else {
                    i10 = i14;
                }
                int measuredWidth = i10 + i8 + childAt.getMeasuredWidth();
                int measuredHeight = i11 + childAt.getMeasuredHeight();
                if (measuredWidth > i12) {
                    i12 = measuredWidth;
                }
                paddingLeft = i10 + i8 + i9 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i13 == getChildCount() - 1) {
                    i12 += i9;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i12 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i5) {
        this.itemSpacing = i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i5) {
        this.lineSpacing = i5;
    }

    public void setSingleLine(boolean z4) {
        this.singleLine = z4;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
