package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    protected NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i13 = i9 - i11;
                    childAt.layout(i13 - childAt.getMeasuredWidth(), 0, i13, i10);
                } else {
                    childAt.layout(i11, 0, childAt.getMeasuredWidth() + i11, i10);
                }
                i11 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i5);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = View.MeasureSpec.getSize(i6);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i10 = 1;
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i11 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i11 = Math.max(i11, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            int i12 = size2 - i8;
            int min = Math.min(size - (this.inactiveItemMinWidth * i12), Math.min(i11, this.activeItemMaxWidth));
            int i13 = size - min;
            if (i12 != 0) {
                i10 = i12;
            }
            int min2 = Math.min(i13 / i10, this.inactiveItemMaxWidth);
            int i14 = i13 - (i12 * min2);
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).getVisibility() != 8) {
                    if (i15 == getSelectedItemPosition()) {
                        i9 = min;
                    } else {
                        i9 = min2;
                    }
                    if (i14 > 0) {
                        i9++;
                        i14--;
                    }
                } else {
                    i9 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i9));
            }
        } else {
            if (size2 != 0) {
                i10 = size2;
            }
            int min3 = Math.min(size / i10, this.activeItemMaxWidth);
            int i16 = size - (size2 * min3);
            for (int i17 = 0; i17 < childCount; i17++) {
                if (getChildAt(i17).getVisibility() != 8) {
                    if (i16 > 0) {
                        i7 = min3 + 1;
                        i16--;
                    } else {
                        i7 = min3;
                    }
                } else {
                    i7 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i7));
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i19).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i18 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i18, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z4) {
        this.itemHorizontalTranslationEnabled = z4;
    }
}
