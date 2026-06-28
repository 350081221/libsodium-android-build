package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;

    @Nullable
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;

    @Nullable
    private Integer navigationIconTint;

    @Nullable
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* loaded from: classes2.dex */
    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeString(this.text);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private int defaultIfZero(int i5, int i6) {
        return i5 == 0 ? i6 : i5;
    }

    private ColorStateList getCompatBackgroundColorStateList(@ColorInt int i5, @ColorInt int i6) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int layer = MaterialColors.layer(i5, i6);
        return new ColorStateList(iArr, new int[]{layer, layer, i5});
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, @ColorInt int i5, float f5, float f6, @ColorInt int i6) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f5);
        if (f6 >= 0.0f) {
            this.backgroundShape.setStroke(f6, i6);
        }
        int color = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(ColorStateList.valueOf(i5));
        ColorStateList valueOf = ColorStateList.valueOf(color);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        ViewCompat.setBackground(this, new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private void initNavigationIcon() {
        Drawable navigationIcon;
        if (getNavigationIcon() == null) {
            navigationIcon = this.defaultNavigationIcon;
        } else {
            navigationIcon = getNavigationIcon();
        }
        setNavigationIcon(navigationIcon);
        setNavigationIconDecorative(true);
    }

    private void initTextView(@StyleRes int i5, String str, String str2) {
        if (i5 != -1) {
            TextViewCompat.setTextAppearance(this.textView, i5);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z4) {
        setFocusableInTouchMode(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnLoadAnimation$1() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i5 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, i5, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(View view, int i5, int i6, int i7, int i8) {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i7, i6, getMeasuredWidth() - i5, i8);
        } else {
            view.layout(i5, i6, i7, i8);
        }
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
        int i5;
        int color;
        if (this.tintNavigationIcon && drawable != null) {
            Integer num = this.navigationIconTint;
            if (num != null) {
                color = num.intValue();
            } else {
                if (drawable == this.defaultNavigationIcon) {
                    i5 = R.attr.colorOnSurfaceVariant;
                } else {
                    i5 = R.attr.colorOnSurface;
                }
                color = MaterialColors.getColor(this, i5);
            }
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(wrap, color);
            return wrap;
        }
        return drawable;
    }

    private void measureCenterView(int i5, int i6) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i5, i6);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setHandwritingBoundsInsets() {
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z4 = true;
        int i7 = 0;
        if (getLayoutDirection() != 1) {
            z4 = false;
        }
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton != null && navigationIconButton.isClickable()) {
            if (z4) {
                i5 = getWidth() - navigationIconButton.getLeft();
            } else {
                i5 = navigationIconButton.getRight();
            }
        } else {
            i5 = 0;
        }
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        if (actionMenuView != null) {
            if (z4) {
                i7 = actionMenuView.getRight();
            } else {
                i7 = getWidth() - actionMenuView.getLeft();
            }
        }
        if (z4) {
            i6 = i7;
        } else {
            i6 = i5;
        }
        float f5 = -i6;
        if (!z4) {
            i5 = i7;
        }
        setHandwritingBoundsOffsets(f5, 0.0f, -i5, 0.0f);
    }

    private void setNavigationIconDecorative(boolean z4) {
        Drawable drawable;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z4);
        navigationIconButton.setFocusable(!z4);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        if (z4) {
            drawable = null;
        } else {
            drawable = this.originalNavigationIconBackground;
        }
        navigationIconButton.setBackgroundDrawable(drawable);
        setHandwritingBoundsInsets();
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void setupTouchExplorationStateChangeListener() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    AccessibilityManagerCompat.addTouchExplorationStateChangeListener(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }
            });
        }
    }

    private void validateAttributes(@Nullable AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, com.alipay.sdk.m.x.d.f3030v) == null) {
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") == null) {
                return;
            } else {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
    }

    public void addCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i5, layoutParams);
    }

    public void clearText() {
        this.textView.setText("");
    }

    @o1.a
    public boolean collapse(@NonNull View view) {
        return collapse(view, null);
    }

    @o1.a
    public boolean expand(@NonNull View view) {
        return expand(view, null);
    }

    @Nullable
    public View getCenterView() {
        return this.centerView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : ViewCompat.getElevation(this);
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.textView.getHint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuResId() {
        return this.menuResId;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    @NonNull
    public CharSequence getText() {
        return this.textView.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@MenuRes int i5) {
        Menu menu = getMenu();
        boolean z4 = menu instanceof MenuBuilder;
        if (z4) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i5);
        this.menuResId = i5;
        if (z4) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i5 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (i5 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        layoutCenterView();
        setHandwritingBoundsInsets();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        measureCenterView(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.text = charSequence;
        return savedState;
    }

    public boolean removeCollapseAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@NonNull OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z4) {
        this.defaultScrollFlagsEnabled = z4;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f5);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z4;
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        setNavigationIconDecorative(z4);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z4) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z4);
    }

    public void setStrokeColor(@ColorInt int i5) {
        if (getStrokeColor() != i5) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i5));
        }
    }

    public void setStrokeWidth(@Dimension float f5) {
        if (getStrokeWidth() != f5) {
            this.backgroundShape.setStrokeWidth(f5);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar.this.lambda$startOnLoadAnimation$1();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @o1.a
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @o1.a
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(@StringRes int i5) {
        this.textView.setHint(i5);
    }

    public void setText(@StringRes int i5) {
        this.textView.setText(i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchBar(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = com.google.android.material.search.SearchBar.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.menuResId = r11
            com.google.android.material.search.a r0 = new com.google.android.material.search.a
            r0.<init>()
            r10.touchExplorationStateChangeListener = r0
            android.content.Context r7 = r10.getContext()
            r10.validateAttributes(r12)
            int r0 = r10.getDefaultNavigationIconResource()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r0)
            r10.defaultNavigationIcon = r0
            com.google.android.material.search.SearchBarAnimationHelper r0 = new com.google.android.material.search.SearchBarAnimationHelper
            r0.<init>()
            r10.searchBarAnimationHelper = r0
            int[] r2 = com.google.android.material.R.styleable.SearchBar
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r12 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r12, r13, r6)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r12.build()
            int r12 = com.google.android.material.R.styleable.SearchBar_backgroundTint
            int r3 = r0.getColor(r12, r8)
            int r12 = com.google.android.material.R.styleable.SearchBar_elevation
            r13 = 0
            float r4 = r0.getDimension(r12, r13)
            int r12 = com.google.android.material.R.styleable.SearchBar_defaultMarginsEnabled
            r13 = 1
            boolean r12 = r0.getBoolean(r12, r13)
            r10.defaultMarginsEnabled = r12
            int r12 = com.google.android.material.R.styleable.SearchBar_defaultScrollFlagsEnabled
            boolean r12 = r0.getBoolean(r12, r13)
            r10.defaultScrollFlagsEnabled = r12
            int r12 = com.google.android.material.R.styleable.SearchBar_hideNavigationIcon
            boolean r12 = r0.getBoolean(r12, r8)
            int r1 = com.google.android.material.R.styleable.SearchBar_forceDefaultNavigationOnClickListener
            boolean r1 = r0.getBoolean(r1, r8)
            r10.forceDefaultNavigationOnClickListener = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_tintNavigationIcon
            boolean r1 = r0.getBoolean(r1, r13)
            r10.tintNavigationIcon = r1
            int r1 = com.google.android.material.R.styleable.SearchBar_navigationIconTint
            boolean r5 = r0.hasValue(r1)
            if (r5 == 0) goto L86
            int r1 = r0.getColor(r1, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.navigationIconTint = r1
        L86:
            int r1 = com.google.android.material.R.styleable.SearchBar_android_textAppearance
            int r11 = r0.getResourceId(r1, r11)
            int r1 = com.google.android.material.R.styleable.SearchBar_android_text
            java.lang.String r1 = r0.getString(r1)
            int r5 = com.google.android.material.R.styleable.SearchBar_android_hint
            java.lang.String r5 = r0.getString(r5)
            int r6 = com.google.android.material.R.styleable.SearchBar_strokeWidth
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r0.getDimension(r6, r9)
            int r9 = com.google.android.material.R.styleable.SearchBar_strokeColor
            int r8 = r0.getColor(r9, r8)
            r0.recycle()
            if (r12 != 0) goto Lae
            r10.initNavigationIcon()
        Lae:
            r10.setClickable(r13)
            r10.setFocusable(r13)
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_search_bar
            r12.inflate(r0, r10)
            r10.layoutInflated = r13
            int r12 = com.google.android.material.R.id.open_search_bar_text_view
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r10.textView = r12
            androidx.core.view.ViewCompat.setElevation(r10, r4)
            r10.initTextView(r11, r1, r5)
            r1 = r10
            r5 = r6
            r6 = r8
            r1.initBackground(r2, r3, r4, r5, r6)
            android.content.Context r11 = r10.getContext()
            java.lang.String r12 = "accessibility"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            r10.accessibilityManager = r11
            r10.setupTouchExplorationStateChangeListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @o1.a
    public boolean collapse(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z4) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z4);
        return true;
    }

    @o1.a
    public boolean expand(@NonNull View view, @Nullable AppBarLayout appBarLayout, boolean z4) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z4);
        return true;
    }
}
