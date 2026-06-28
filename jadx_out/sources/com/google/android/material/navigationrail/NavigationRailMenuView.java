package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i5, int i6, int i7) {
        int max = i6 / Math.max(1, i7);
        int i8 = this.itemMinimumHeight;
        if (i8 == -1) {
            i8 = View.MeasureSpec.getSize(i5);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i8, max), 0);
    }

    private int measureChildHeight(View view, int i5, int i6) {
        if (view.getVisibility() != 8) {
            view.measure(i5, i6);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i5, int i6, int i7, View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = makeSharedHeightSpec(i5, i6, i7);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != view) {
                i8 += measureChildHeight(childAt, i5, makeMeasureSpec);
            }
        }
        return i8;
    }

    private int measureShiftingChildHeights(int i5, int i6, int i7) {
        int i8;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i8 = measureChildHeight(childAt, i5, makeSharedHeightSpec(i5, i6, i7));
            i6 -= i8;
            i7--;
        } else {
            i8 = 0;
        }
        return i8 + measureSharedChildHeights(i5, i6, i7, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isTopGravity() {
        return (this.layoutParams.gravity & 112) == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int i9 = i7 - i5;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                childAt.layout(0, i10, i9, measuredHeight);
                i10 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int measureSharedChildHeights;
        int size = View.MeasureSpec.getSize(i6);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 > 1 && isShifting(getLabelVisibilityMode(), size2)) {
            measureSharedChildHeights = measureShiftingChildHeights(i5, size, size2);
        } else {
            measureSharedChildHeights = measureSharedChildHeights(i5, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i5), View.resolveSizeAndState(measureSharedChildHeights, i6, 0));
    }

    public void setItemMinimumHeight(@Px int i5) {
        if (this.itemMinimumHeight != i5) {
            this.itemMinimumHeight = i5;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuGravity(int i5) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i5) {
            layoutParams.gravity = i5;
            setLayoutParams(layoutParams);
        }
    }
}
