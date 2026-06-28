package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.isOverflowButton = false;
        }

        LayoutParams(int i5, int i6, boolean z4) {
            super(i5, i6);
            this.isOverflowButton = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int measureChildForCells(View view, int i5, int i6, int i7, int i8) {
        ActionMenuItemView actionMenuItemView;
        boolean z4;
        int i9;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - i8, View.MeasureSpec.getMode(i7));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z5 = true;
        if (actionMenuItemView != null && actionMenuItemView.hasText()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i6 > 0) {
            i9 = 2;
            if (!z4 || i6 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i10 = measuredWidth / i5;
                if (measuredWidth % i5 != 0) {
                    i10++;
                }
                if (!z4 || i10 >= 2) {
                    i9 = i10;
                }
                if (!layoutParams.isOverflowButton || !z4) {
                    z5 = false;
                }
                layoutParams.expandable = z5;
                layoutParams.cellsUsed = i9;
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i9, 1073741824), makeMeasureSpec);
                return i9;
            }
        }
        i9 = 0;
        if (!layoutParams.isOverflowButton) {
        }
        z5 = false;
        layoutParams.expandable = z5;
        layoutParams.cellsUsed = i9;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i9, 1073741824), makeMeasureSpec);
        return i9;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void onMeasureExactFormat(int i5, int i6) {
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        int i11;
        int i12;
        boolean z8;
        int i13;
        ?? r14;
        boolean z9;
        int i14;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.mMinCellSize;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j5 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            int i25 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i26 = i22 + 1;
                if (z11) {
                    int i27 = this.mGeneratedItemPadding;
                    i13 = i26;
                    r14 = 0;
                    childAt.setPadding(i27, 0, i27, 0);
                } else {
                    i13 = i26;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r14;
                layoutParams.extraPixels = r14;
                layoutParams.cellsUsed = r14;
                layoutParams.expandable = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                if (z11 && ((ActionMenuItemView) childAt).hasText()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                layoutParams.preventEdgeOffset = z9;
                if (layoutParams.isOverflowButton) {
                    i14 = 1;
                } else {
                    i14 = i17;
                }
                int measureChildForCells = measureChildForCells(childAt, i19, i14, childMeasureSpec, paddingTop);
                i23 = Math.max(i23, measureChildForCells);
                if (layoutParams.expandable) {
                    i24++;
                }
                if (layoutParams.isOverflowButton) {
                    z10 = true;
                }
                i17 -= measureChildForCells;
                i20 = Math.max(i20, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j5 |= 1 << i21;
                    i20 = i20;
                }
                i22 = i13;
            }
            i21++;
            size2 = i25;
        }
        int i28 = size2;
        if (z10 && i22 == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z12 = false;
        while (i24 > 0 && i17 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j6 = 0;
            while (i31 < childCount) {
                boolean z13 = z12;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i31).getLayoutParams();
                int i32 = i20;
                if (layoutParams2.expandable) {
                    int i33 = layoutParams2.cellsUsed;
                    if (i33 < i29) {
                        j6 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        i30++;
                        j6 |= 1 << i31;
                    }
                }
                i31++;
                i20 = i32;
                z12 = z13;
            }
            z5 = z12;
            i9 = i20;
            j5 |= j6;
            if (i30 > i17) {
                i7 = mode;
                i8 = i15;
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount) {
                View childAt2 = getChildAt(i35);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i36 = i15;
                int i37 = mode;
                long j7 = 1 << i35;
                if ((j6 & j7) == 0) {
                    if (layoutParams3.cellsUsed == i34) {
                        j5 |= j7;
                    }
                    z8 = z4;
                } else {
                    if (z4 && layoutParams3.preventEdgeOffset && i17 == 1) {
                        int i38 = this.mGeneratedItemPadding;
                        z8 = z4;
                        childAt2.setPadding(i38 + i19, 0, i38, 0);
                    } else {
                        z8 = z4;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i17--;
                }
                i35++;
                mode = i37;
                i15 = i36;
                z4 = z8;
            }
            i20 = i9;
            z12 = true;
        }
        i7 = mode;
        i8 = i15;
        z5 = z12;
        i9 = i20;
        if (!z10 && i22 == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i17 > 0 && j5 != 0 && (i17 < i22 - 1 || z6 || i23 > 1)) {
            float bitCount = Long.bitCount(j5);
            if (!z6) {
                i10 = 0;
                if ((j5 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount - 1;
                if ((j5 & (1 << i39)) != 0 && !((LayoutParams) getChildAt(i39).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            } else {
                i10 = 0;
            }
            if (bitCount > 0.0f) {
                i12 = (int) ((i17 * i19) / bitCount);
            } else {
                i12 = i10;
            }
            z7 = z5;
            for (int i40 = i10; i40 < childCount; i40++) {
                if ((j5 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i12;
                        layoutParams4.expanded = true;
                        if (i40 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i12) / 2;
                        }
                        z7 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i12;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i12) / 2;
                        z7 = true;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i12 / 2;
                        }
                        if (i40 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i12 / 2;
                        }
                    }
                }
            }
        } else {
            i10 = 0;
            z7 = z5;
        }
        if (z7) {
            for (int i41 = i10; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i19) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i7 != 1073741824) {
            i11 = i9;
        } else {
            i11 = i28;
        }
        setMeasuredDimension(i8, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected boolean hasSupportDividerBeforeChildAt(int i5) {
        boolean z4 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z4 = false | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i5 > 0 && (childAt2 instanceof ActionMenuChildView)) {
            return z4 | ((ActionMenuChildView) childAt2).needsDividerBefore();
        }
        return z4;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        int width;
        int i10;
        if (!this.mFormatItems) {
            super.onLayout(z4, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i7 - i5;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i10 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        if (i19 > 0) {
            i9 = paddingRight / i19;
        } else {
            i9 = 0;
        }
        int max = Math.max(0, i9);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i24 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = i24 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i5, int i6) {
        boolean z4;
        MenuBuilder menuBuilder;
        boolean z5 = this.mFormatItems;
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mFormatItems = z4;
        if (z5 != z4) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i5, i6);
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i5, i6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z4) {
        this.mPresenter.setExpandedActionViewsExclusive(z4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z4) {
        this.mReserveOverflow = z4;
    }

    public void setPopupTheme(@StyleRes int i5) {
        if (this.mPopupTheme != i5) {
            this.mPopupTheme = i5;
            if (i5 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f5);
        this.mGeneratedItemPadding = (int) (f5 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }
}
