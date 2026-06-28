package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o1.a;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;

    @Dimension(unit = 0)
    static final int DEFAULT_GAP_TEXT_ICON = 8;

    @Dimension(unit = 0)
    private static final int DEFAULT_HEIGHT = 48;

    @Dimension(unit = 0)
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;

    @Dimension(unit = 0)
    static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    private static final int INVALID_WIDTH = -1;
    private static final String LOG_TAG = "TabLayout";
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = -1;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;

    @Dimension(unit = 0)
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private AdapterChangeListener adapterChangeListener;
    private int contentInsetStart;

    @Nullable
    private BaseOnTabSelectedListener currentVpSelectedListener;
    private final int defaultTabTextAppearance;
    int indicatorPosition;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;

    @Nullable
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;

    @Nullable
    private BaseOnTabSelectedListener selectedListener;
    private final ArrayList<BaseOnTabSelectedListener> selectedListeners;

    @Nullable
    private Tab selectedTab;
    private int selectedTabTextAppearance;
    float selectedTabTextSize;
    private boolean setupViewPagerImplicitly;

    @NonNull
    final SlidingTabIndicator slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    PorterDuff.Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    int tabIndicatorAnimationMode;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabIndicatorHeight;
    private TabIndicatorInterpolator tabIndicatorInterpolator;
    private final TimeInterpolator tabIndicatorTimeInterpolator;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;

    @NonNull
    Drawable tabSelectedIndicator;
    private int tabSelectedIndicatorColor;
    private final int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    private final Pools.Pool<TabView> tabViewPool;
    private final ArrayList<Tab> tabs;
    boolean unboundedRipple;

    @Nullable
    ViewPager viewPager;
    private int viewPagerScrollState;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
    private static final Pools.Pool<Tab> tabPool = new Pools.SynchronizedPool(16);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {
        private boolean autoRefresh;

        AdapterChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.viewPager == viewPager) {
                tabLayout.setPagerAdapter(pagerAdapter2, this.autoRefresh);
            }
        }

        void setAutoRefresh(boolean z4) {
            this.autoRefresh = z4;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface BaseOnTabSelectedListener<T extends Tab> {
        void onTabReselected(T t5);

        void onTabSelected(T t5);

        void onTabUnselected(T t5);
    }

    /* loaded from: classes2.dex */
    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface Mode {
    }

    /* loaded from: classes2.dex */
    public interface OnTabSelectedListener extends BaseOnTabSelectedListener<Tab> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class PagerAdapterObserver extends DataSetObserver {
        PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class SlidingTabIndicator extends LinearLayout {
        ValueAnimator indicatorAnimator;
        private int layoutDirection;

        SlidingTabIndicator(Context context) {
            super(context);
            this.layoutDirection = -1;
            setWillNotDraw(false);
        }

        private void jumpIndicatorToIndicatorPosition() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == -1) {
                tabLayout.indicatorPosition = tabLayout.getSelectedTabPosition();
            }
            jumpIndicatorToPosition(TabLayout.this.indicatorPosition);
        }

        private void jumpIndicatorToPosition(int i5) {
            if (TabLayout.this.viewPagerScrollState != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i5);
            TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
            TabLayout tabLayout = TabLayout.this;
            tabIndicatorInterpolator.setIndicatorBoundsForTab(tabLayout, childAt, tabLayout.tabSelectedIndicator);
            TabLayout.this.indicatorPosition = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jumpIndicatorToSelectedPosition() {
            jumpIndicatorToPosition(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tweenIndicatorPosition(View view, View view2, float f5) {
            boolean z4;
            if (view != null && view.getWidth() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                TabIndicatorInterpolator tabIndicatorInterpolator = TabLayout.this.tabIndicatorInterpolator;
                TabLayout tabLayout = TabLayout.this;
                tabIndicatorInterpolator.updateIndicatorForOffset(tabLayout, view, view2, f5, tabLayout.tabSelectedIndicator);
            } else {
                Drawable drawable = TabLayout.this.tabSelectedIndicator;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.tabSelectedIndicator.getBounds().bottom);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }

        private void updateOrRecreateIndicatorAnimation(boolean z4, int i5, int i6) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.indicatorPosition == i5) {
                return;
            }
            final View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            final View childAt2 = getChildAt(i5);
            if (childAt2 == null) {
                jumpIndicatorToSelectedPosition();
                return;
            }
            TabLayout.this.indicatorPosition = i5;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.SlidingTabIndicator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    SlidingTabIndicator.this.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z4) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.indicatorAnimator = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.tabIndicatorTimeInterpolator);
                valueAnimator.setDuration(i6);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.start();
                return;
            }
            this.indicatorAnimator.removeAllUpdateListeners();
            this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
        }

        void animateIndicatorToPosition(int i5, int i6) {
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.indicatorPosition != i5) {
                this.indicatorAnimator.cancel();
            }
            updateOrRecreateIndicatorAnimation(true, i5, i6);
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            int height;
            int height2 = TabLayout.this.tabSelectedIndicator.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            }
            int i5 = TabLayout.this.tabIndicatorGravity;
            if (i5 != 0) {
                if (i5 != 1) {
                    height = 0;
                    if (i5 != 2) {
                        if (i5 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.tabSelectedIndicator.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
                TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.tabSelectedIndicator.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
            super.onLayout(z4, i5, i6, i7, i8);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                updateOrRecreateIndicatorAnimation(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                jumpIndicatorToIndicatorPosition();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            if (View.MeasureSpec.getMode(i5) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z4 = true;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() == 0) {
                        i7 = Math.max(i7, childAt.getMeasuredWidth());
                    }
                }
                if (i7 <= 0) {
                    return;
                }
                if (i7 * childCount <= getMeasuredWidth() - (((int) ViewUtils.dpToPx(getContext(), 16)) * 2)) {
                    boolean z5 = false;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i9).getLayoutParams();
                        if (layoutParams.width != i7 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i7;
                            layoutParams.weight = 0.0f;
                            z5 = true;
                        }
                    }
                    z4 = z5;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.tabGravity = 0;
                    tabLayout2.updateTabViews(false);
                }
                if (z4) {
                    super.onMeasure(i5, i6);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i5) {
            super.onRtlPropertiesChanged(i5);
        }

        void setIndicatorPositionFromTabPosition(int i5, float f5) {
            TabLayout.this.indicatorPosition = Math.round(i5 + f5);
            ValueAnimator valueAnimator = this.indicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.indicatorAnimator.cancel();
            }
            tweenIndicatorPosition(getChildAt(i5), getChildAt(i5 + 1), f5);
        }

        void setSelectedIndicatorHeight(int i5) {
            Rect bounds = TabLayout.this.tabSelectedIndicator.getBounds();
            TabLayout.this.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i5);
            requestLayout();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface TabIndicatorAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface TabIndicatorGravity {
    }

    /* loaded from: classes2.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private int previousScrollState;
        private int scrollState;

        @NonNull
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i5) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i5;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i5, float f5, int i6) {
            boolean z4;
            boolean z5;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i7 = this.scrollState;
                if (i7 == 2 && this.previousScrollState != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i7 == 2 && this.previousScrollState == 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                tabLayout.setScrollPosition(i5, f5, z4, z5, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i5) {
            boolean z4;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i5 && i5 < tabLayout.getTabCount()) {
                int i6 = this.scrollState;
                if (i6 != 0 && (i6 != 2 || this.previousScrollState != 0)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i5), z4);
            }
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes2.dex */
    public final class TabView extends LinearLayout {

        @Nullable
        private View badgeAnchorView;

        @Nullable
        private BadgeDrawable badgeDrawable;

        @Nullable
        private Drawable baseBackgroundDrawable;

        @Nullable
        private ImageView customIconView;

        @Nullable
        private TextView customTextView;

        @Nullable
        private View customView;
        private int defaultMaxLines;
        private ImageView iconView;
        private Tab tab;
        private TextView textView;

        public TabView(@NonNull Context context) {
            super(context);
            this.defaultMaxLines = 2;
            updateBackgroundDrawable(context);
            ViewCompat.setPaddingRelative(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        private void addOnLayoutChangeListener(@Nullable final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    if (view.getVisibility() == 0) {
                        TabView.this.tryUpdateBadgeDrawableBounds(view);
                    }
                }
            });
        }

        private float approximateLineWidth(@NonNull Layout layout, int i5, float f5) {
            return layout.getLineWidth(i5) * (f5 / layout.getPaint().getTextSize());
        }

        private void clipViewToPaddingForBadge(boolean z4) {
            setClipChildren(z4);
            setClipToPadding(z4);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z4);
                viewGroup.setClipToPadding(z4);
            }
        }

        @NonNull
        private FrameLayout createPreApi18BadgeAnchorRoot() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void drawBackground(@NonNull Canvas canvas) {
            Drawable drawable = this.baseBackgroundDrawable;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public BadgeDrawable getBadge() {
            return this.badgeDrawable;
        }

        @Nullable
        private FrameLayout getCustomParentForBadge(@NonNull View view) {
            if ((view != this.iconView && view != this.textView) || !BadgeUtils.USE_COMPAT_PARENT) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            if (this.badgeDrawable == null) {
                this.badgeDrawable = BadgeDrawable.create(getContext());
            }
            tryUpdateBadgeAnchor();
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasBadgeDrawable() {
            return this.badgeDrawable != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultIconView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.iconView = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void inflateAndAddDefaultTextView() {
            FrameLayout frameLayout;
            if (BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout = createPreApi18BadgeAnchorRoot();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.textView = textView;
            frameLayout.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBadge() {
            if (this.badgeAnchorView != null) {
                tryRemoveBadgeFromAnchor();
            }
            this.badgeDrawable = null;
        }

        private void tryAttachBadgeToAnchor(@Nullable View view) {
            if (hasBadgeDrawable() && view != null) {
                clipViewToPaddingForBadge(false);
                BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
                this.badgeAnchorView = view;
            }
        }

        private void tryRemoveBadgeFromAnchor() {
            if (!hasBadgeDrawable()) {
                return;
            }
            clipViewToPaddingForBadge(true);
            View view = this.badgeAnchorView;
            if (view != null) {
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
                this.badgeAnchorView = null;
            }
        }

        private void tryUpdateBadgeAnchor() {
            Tab tab;
            Tab tab2;
            if (!hasBadgeDrawable()) {
                return;
            }
            if (this.customView != null) {
                tryRemoveBadgeFromAnchor();
                return;
            }
            if (this.iconView != null && (tab2 = this.tab) != null && tab2.getIcon() != null) {
                View view = this.badgeAnchorView;
                ImageView imageView = this.iconView;
                if (view != imageView) {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.iconView);
                    return;
                } else {
                    tryUpdateBadgeDrawableBounds(imageView);
                    return;
                }
            }
            if (this.textView != null && (tab = this.tab) != null && tab.getTabLabelVisibility() == 1) {
                View view2 = this.badgeAnchorView;
                TextView textView = this.textView;
                if (view2 != textView) {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.textView);
                    return;
                } else {
                    tryUpdateBadgeDrawableBounds(textView);
                    return;
                }
            }
            tryRemoveBadgeFromAnchor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tryUpdateBadgeDrawableBounds(@NonNull View view) {
            if (hasBadgeDrawable() && view == this.badgeAnchorView) {
                BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void updateBackgroundDrawable(Context context) {
            int i5 = TabLayout.this.tabBackgroundResId;
            GradientDrawable gradientDrawable = null;
            if (i5 != 0) {
                Drawable drawable = AppCompatResources.getDrawable(context, i5);
                this.baseBackgroundDrawable = drawable;
                if (drawable != null && drawable.isStateful()) {
                    this.baseBackgroundDrawable.setState(getDrawableState());
                }
            } else {
                this.baseBackgroundDrawable = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.tabRippleColorStateList != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList convertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(TabLayout.this.tabRippleColorStateList);
                boolean z4 = TabLayout.this.unboundedRipple;
                if (z4) {
                    gradientDrawable2 = null;
                }
                if (!z4) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(convertToRippleDrawableColor, gradientDrawable2, gradientDrawable);
            }
            ViewCompat.setBackground(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void updateTextAndIcon(@Nullable TextView textView, @Nullable ImageView imageView, boolean z4) {
            Drawable drawable;
            CharSequence charSequence;
            int i5;
            CharSequence charSequence2;
            int i6;
            Tab tab = this.tab;
            CharSequence charSequence3 = null;
            if (tab != null && tab.getIcon() != null) {
                drawable = DrawableCompat.wrap(this.tab.getIcon()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, TabLayout.this.tabIconTint);
                PorterDuff.Mode mode = TabLayout.this.tabIconTintMode;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawable, mode);
                }
            }
            Tab tab2 = this.tab;
            if (tab2 != null) {
                charSequence = tab2.getText();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z5 = true;
            boolean z6 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!z6 || this.tab.labelVisibilityMode != 1) {
                    z5 = false;
                }
                if (z6) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z5) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                textView.setVisibility(i6);
                if (z6) {
                    setVisibility(0);
                }
            } else {
                z5 = false;
            }
            if (z4 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z5 && imageView.getVisibility() == 0) {
                    i5 = (int) ViewUtils.dpToPx(getContext(), 8);
                } else {
                    i5 = 0;
                }
                if (TabLayout.this.inlineLabel) {
                    if (i5 != MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) {
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, i5);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i5 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i5;
                    MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            Tab tab3 = this.tab;
            if (tab3 != null) {
                charSequence3 = tab3.contentDesc;
            }
            if (!z6) {
                charSequence = charSequence3;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.baseBackgroundDrawable;
            boolean z4 = false;
            if (drawable != null && drawable.isStateful()) {
                z4 = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (z4) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentHeight() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i5 = 0;
            int i6 = 0;
            boolean z4 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    if (z4) {
                        i6 = Math.min(i6, view.getTop());
                    } else {
                        i6 = view.getTop();
                    }
                    if (z4) {
                        i5 = Math.max(i5, view.getBottom());
                    } else {
                        i5 = view.getBottom();
                    }
                    z4 = true;
                }
            }
            return i5 - i6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i5 = 0;
            int i6 = 0;
            boolean z4 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0) {
                    if (z4) {
                        i6 = Math.min(i6, view.getLeft());
                    } else {
                        i6 = view.getLeft();
                    }
                    if (z4) {
                        i5 = Math.max(i5, view.getRight());
                    } else {
                        i5 = view.getRight();
                    }
                    z4 = true;
                }
            }
            return i5 - i6;
        }

        @Nullable
        public Tab getTab() {
            return this.tab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                wrap.setContentDescription(this.badgeDrawable.getContentDescription());
            }
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, this.tab.getPosition(), 1, false, isSelected()));
            if (isSelected()) {
                wrap.setClickable(false);
                wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
            wrap.setRoleDescription(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i5, int i6) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i5);
            int mode = View.MeasureSpec.getMode(i5);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i5 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i5, i6);
            if (this.textView != null) {
                float f5 = TabLayout.this.tabTextSize;
                int i7 = this.defaultMaxLines;
                ImageView imageView = this.iconView;
                boolean z4 = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i7 = 1;
                } else {
                    TextView textView = this.textView;
                    if (textView != null && textView.getLineCount() > 1) {
                        f5 = TabLayout.this.tabTextMultiLineSize;
                    }
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.textView);
                if (f5 != textSize || (maxLines >= 0 && i7 != maxLines)) {
                    if (TabLayout.this.mode == 1 && f5 > textSize && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f5) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z4 = false;
                    }
                    if (z4) {
                        this.textView.setTextSize(0, f5);
                        this.textView.setMaxLines(i7);
                        super.onMeasure(i5, i6);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.tab.select();
                return true;
            }
            return performClick;
        }

        void reset() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void setSelected(boolean z4) {
            if (isSelected() != z4) {
            }
            super.setSelected(z4);
            TextView textView = this.textView;
            if (textView != null) {
                textView.setSelected(z4);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setSelected(z4);
            }
            View view = this.customView;
            if (view != null) {
                view.setSelected(z4);
            }
        }

        void setTab(@Nullable Tab tab) {
            if (tab != this.tab) {
                this.tab = tab;
                update();
            }
        }

        final void update() {
            boolean z4;
            updateTab();
            Tab tab = this.tab;
            if (tab != null && tab.isSelected()) {
                z4 = true;
            } else {
                z4 = false;
            }
            setSelected(z4);
        }

        final void updateOrientation() {
            setOrientation(!TabLayout.this.inlineLabel ? 1 : 0);
            TextView textView = this.customTextView;
            if (textView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView, true);
            } else {
                updateTextAndIcon(textView, this.customIconView, false);
            }
        }

        final void updateTab() {
            View view;
            ViewParent parent;
            Tab tab = this.tab;
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.customView;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.customView);
                    }
                    addView(view);
                }
                this.customView = view;
                TextView textView = this.textView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.iconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.customTextView = textView2;
                if (textView2 != null) {
                    this.defaultMaxLines = TextViewCompat.getMaxLines(textView2);
                }
                this.customIconView = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view3 = this.customView;
                if (view3 != null) {
                    removeView(view3);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            if (this.customView == null) {
                if (this.iconView == null) {
                    inflateAndAddDefaultIconView();
                }
                if (this.textView == null) {
                    inflateAndAddDefaultTextView();
                    this.defaultMaxLines = TextViewCompat.getMaxLines(this.textView);
                }
                TextViewCompat.setTextAppearance(this.textView, TabLayout.this.defaultTabTextAppearance);
                if (isSelected() && TabLayout.this.selectedTabTextAppearance != -1) {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.this.selectedTabTextAppearance);
                } else {
                    TextViewCompat.setTextAppearance(this.textView, TabLayout.this.tabTextAppearance);
                }
                ColorStateList colorStateList = TabLayout.this.tabTextColors;
                if (colorStateList != null) {
                    this.textView.setTextColor(colorStateList);
                }
                updateTextAndIcon(this.textView, this.iconView, true);
                tryUpdateBadgeAnchor();
                addOnLayoutChangeListener(this.iconView);
                addOnLayoutChangeListener(this.textView);
            } else {
                TextView textView3 = this.customTextView;
                if (textView3 != null || this.customIconView != null) {
                    updateTextAndIcon(textView3, this.customIconView, false);
                }
            }
            if (tab != null && !TextUtils.isEmpty(tab.contentDesc)) {
                setContentDescription(tab.contentDesc);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager viewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.viewPager = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }

    private void addTabFromItemView(@NonNull TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        Drawable drawable = tabItem.icon;
        if (drawable != null) {
            newTab.setIcon(drawable);
        }
        int i5 = tabItem.customLayout;
        if (i5 != 0) {
            newTab.setCustomView(i5);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.setContentDescription(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    private void addTabView(@NonNull Tab tab) {
        TabView tabView = tab.view;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.slidingTabIndicator.addView(tabView, tab.getPosition(), createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i5) {
        if (i5 == -1) {
            return;
        }
        if (getWindowToken() != null && ViewCompat.isLaidOut(this) && !this.slidingTabIndicator.childrenNeedLayout()) {
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i5, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                this.scrollAnimator.start();
            }
            this.slidingTabIndicator.animateIndicatorToPosition(i5, this.tabIndicatorAnimationDuration);
            return;
        }
        setScrollPosition(i5, 0.0f, true);
    }

    private void applyGravityForModeScrollable(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    return;
                }
            } else {
                this.slidingTabIndicator.setGravity(1);
                return;
            }
        } else {
            Log.w(LOG_TAG, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.slidingTabIndicator.setGravity(GravityCompat.START);
    }

    private void applyModeAndGravity() {
        int max;
        int i5 = this.mode;
        if (i5 != 0 && i5 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        }
        ViewCompat.setPaddingRelative(this.slidingTabIndicator, max, 0, 0, 0);
        int i6 = this.mode;
        if (i6 != 0) {
            if (i6 == 1 || i6 == 2) {
                if (this.tabGravity == 2) {
                    Log.w(LOG_TAG, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.slidingTabIndicator.setGravity(1);
            }
        } else {
            applyGravityForModeScrollable(this.tabGravity);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i5, float f5) {
        View childAt;
        View view;
        int i6 = this.mode;
        int i7 = 0;
        if ((i6 != 0 && i6 != 2) || (childAt = this.slidingTabIndicator.getChildAt(i5)) == null) {
            return 0;
        }
        int i8 = i5 + 1;
        if (i8 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i8);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i7 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i9 = (int) ((width + i7) * 0.5f * f5);
        if (ViewCompat.getLayoutDirection(this) == 0) {
            return left + i9;
        }
        return left - i9;
    }

    private void configureTab(@NonNull Tab tab, int i5) {
        tab.setPosition(i5);
        this.tabs.add(i5, tab);
        int size = this.tabs.size();
        int i6 = -1;
        for (int i7 = i5 + 1; i7 < size; i7++) {
            if (this.tabs.get(i7).getPosition() == this.indicatorPosition) {
                i6 = i7;
            }
            this.tabs.get(i7).setPosition(i7);
        }
        this.indicatorPosition = i6;
    }

    @NonNull
    private static ColorStateList createColorStateList(int i5, int i6) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i6, i5});
    }

    @NonNull
    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    @NonNull
    private TabView createTabView(@NonNull Tab tab) {
        TabView tabView;
        Pools.Pool<TabView> pool = this.tabViewPool;
        if (pool != null) {
            tabView = pool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(tab);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(tab.contentDesc)) {
            tabView.setContentDescription(tab.text);
        } else {
            tabView.setContentDescription(tab.contentDesc);
        }
        return tabView;
    }

    private void dispatchTabReselected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabReselected(tab);
        }
    }

    private void dispatchTabSelected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabSelected(tab);
        }
    }

    private void dispatchTabUnselected(@NonNull Tab tab) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size).onTabUnselected(tab);
        }
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(this.tabIndicatorTimeInterpolator);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                Tab tab = this.tabs.get(i5);
                if (tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText())) {
                    z4 = true;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        if (z4 && !this.inlineLabel) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i5 = this.requestedTabMinWidth;
        if (i5 != -1) {
            return i5;
        }
        int i6 = this.mode;
        if (i6 != 0 && i6 != 2) {
            return 0;
        }
        return this.scrollableTabMinWidth;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private boolean isScrollingEnabled() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void removeTabViewAt(int i5) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i5);
        this.slidingTabIndicator.removeViewAt(i5);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i5) {
        boolean z4;
        boolean z5;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i5 < childCount) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.slidingTabIndicator.getChildAt(i6);
                boolean z6 = true;
                if ((i6 == i5 && !childAt.isSelected()) || (i6 != i5 && childAt.isSelected())) {
                    if (i6 == i5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    childAt.setSelected(z5);
                    if (i6 != i5) {
                        z6 = false;
                    }
                    childAt.setActivated(z6);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).updateTab();
                    }
                } else {
                    if (i6 == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    childAt.setSelected(z4);
                    if (i6 != i5) {
                        z6 = false;
                    }
                    childAt.setActivated(z6);
                }
            }
        }
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.tabs.get(i5).updateView();
        }
    }

    private void updateTabViewLayoutParams(@NonNull LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        addOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    protected Tab createTabFromPool() {
        Tab acquire = tabPool.acquire();
        if (acquire == null) {
            return new Tab();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.selectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @Nullable
    public Tab getTabAt(int i5) {
        if (i5 < 0 || i5 >= getTabCount()) {
            return null;
        }
        return this.tabs.get(i5);
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    @NonNull
    public Tab newTab() {
        Tab createTabFromPool = createTabFromPool();
        createTabFromPool.parent = this;
        createTabFromPool.view = createTabView(createTabFromPool);
        if (createTabFromPool.id != -1) {
            createTabFromPool.view.setId(createTabFromPool.id);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        for (int i5 = 0; i5 < this.slidingTabIndicator.getChildCount(); i5++) {
            View childAt = this.slidingTabIndicator.getChildAt(i5);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isScrollingEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L29;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.ViewUtils.dpToPx(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.requestedTabMaxWidth
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.ViewUtils.dpToPx(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.tabMaxWidth = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.mode
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !isScrollingEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i5 = 0; i5 < count; i5++) {
                addTab(newTab().setText(this.pagerAdapter.getPageTitle(i5)), false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    protected boolean releaseFromTabPool(Tab tab) {
        return tabPool.release(tab);
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<Tab> it = this.tabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener onTabSelectedListener) {
        removeOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    public void removeTab(@NonNull Tab tab) {
        if (tab.parent == this) {
            removeTabAt(tab.getPosition());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i5) {
        int i6;
        Tab tab;
        Tab tab2 = this.selectedTab;
        if (tab2 != null) {
            i6 = tab2.getPosition();
        } else {
            i6 = 0;
        }
        removeTabViewAt(i5);
        Tab remove = this.tabs.remove(i5);
        if (remove != null) {
            remove.reset();
            releaseFromTabPool(remove);
        }
        int size = this.tabs.size();
        int i7 = -1;
        for (int i8 = i5; i8 < size; i8++) {
            if (this.tabs.get(i8).getPosition() == this.indicatorPosition) {
                i7 = i8;
            }
            this.tabs.get(i8).setPosition(i8);
        }
        this.indicatorPosition = i7;
        if (i6 == i5) {
            if (this.tabs.isEmpty()) {
                tab = null;
            } else {
                tab = this.tabs.get(Math.max(0, i5 - 1));
            }
            selectTab(tab);
        }
    }

    public void selectTab(@Nullable Tab tab) {
        selectTab(tab, true);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setInlineLabel(boolean z4) {
        if (this.inlineLabel != z4) {
            this.inlineLabel = z4;
            for (int i5 = 0; i5 < this.slidingTabIndicator.getChildCount(); i5++) {
                View childAt = this.slidingTabIndicator.getChildAt(i5);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(@BoolRes int i5) {
        setInlineLabel(getResources().getBoolean(i5));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener onTabSelectedListener) {
        setOnTabSelectedListener((BaseOnTabSelectedListener) onTabSelectedListener);
    }

    void setPagerAdapter(@Nullable PagerAdapter pagerAdapter, boolean z4) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter;
        if (z4 && pagerAdapter != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new PagerAdapterObserver();
            }
            pagerAdapter.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setScrollPosition(int i5, float f5, boolean z4) {
        setScrollPosition(i5, f5, z4, true);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.tabSelectedIndicator = mutate;
        DrawableUtils.setTint(mutate, this.tabSelectedIndicatorColor);
        int i5 = this.tabIndicatorHeight;
        if (i5 == -1) {
            i5 = this.tabSelectedIndicator.getIntrinsicHeight();
        }
        this.slidingTabIndicator.setSelectedIndicatorHeight(i5);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i5) {
        this.tabSelectedIndicatorColor = i5;
        DrawableUtils.setTint(this.tabSelectedIndicator, i5);
        updateTabViews(false);
    }

    public void setSelectedTabIndicatorGravity(int i5) {
        if (this.tabIndicatorGravity != i5) {
            this.tabIndicatorGravity = i5;
            ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i5) {
        this.tabIndicatorHeight = i5;
        this.slidingTabIndicator.setSelectedIndicatorHeight(i5);
    }

    public void setTabGravity(int i5) {
        if (this.tabGravity != i5) {
            this.tabGravity = i5;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(@ColorRes int i5) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i5));
    }

    public void setTabIndicatorAnimationMode(int i5) {
        this.tabIndicatorAnimationMode = i5;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    this.tabIndicatorInterpolator = new FadeTabIndicatorInterpolator();
                    return;
                }
                throw new IllegalArgumentException(i5 + " is not a valid TabIndicatorAnimationMode");
            }
            this.tabIndicatorInterpolator = new ElasticTabIndicatorInterpolator();
            return;
        }
        this.tabIndicatorInterpolator = new TabIndicatorInterpolator();
    }

    public void setTabIndicatorFullWidth(boolean z4) {
        this.tabIndicatorFullWidth = z4;
        this.slidingTabIndicator.jumpIndicatorToSelectedPosition();
        ViewCompat.postInvalidateOnAnimation(this.slidingTabIndicator);
    }

    public void setTabMode(int i5) {
        if (i5 != this.mode) {
            this.mode = i5;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i5 = 0; i5 < this.slidingTabIndicator.getChildCount(); i5++) {
                View childAt = this.slidingTabIndicator.getChildAt(i5);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i5) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i5));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z4) {
        if (this.unboundedRipple != z4) {
            this.unboundedRipple = z4;
            for (int i5 = 0; i5 < this.slidingTabIndicator.getChildCount(); i5++) {
                View childAt = this.slidingTabIndicator.getChildAt(i5);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i5) {
        setUnboundedRipple(getResources().getBoolean(i5));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    void updateTabViews(boolean z4) {
        for (int i5 = 0; i5 < this.slidingTabIndicator.getChildCount(); i5++) {
            View childAt = this.slidingTabIndicator.getChildAt(i5);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z4) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateViewPagerScrollState(int i5) {
        this.viewPagerScrollState = i5;
    }

    /* loaded from: classes2.dex */
    public static class Tab {
        public static final int INVALID_POSITION = -1;

        @Nullable
        private CharSequence contentDesc;

        @Nullable
        private View customView;

        @Nullable
        private Drawable icon;

        @Nullable
        public TabLayout parent;

        @Nullable
        private Object tag;

        @Nullable
        private CharSequence text;

        @NonNull
        public TabView view;
        private int position = -1;

        @LabelVisibility
        private int labelVisibilityMode = 1;
        private int id = -1;

        @Nullable
        public BadgeDrawable getBadge() {
            return this.view.getBadge();
        }

        @Nullable
        public CharSequence getContentDescription() {
            TabView tabView = this.view;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.customView;
        }

        @Nullable
        public Drawable getIcon() {
            return this.icon;
        }

        public int getId() {
            return this.id;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return this.view.getOrCreateBadge();
        }

        public int getPosition() {
            return this.position;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.labelVisibilityMode;
        }

        @Nullable
        public Object getTag() {
            return this.tag;
        }

        @Nullable
        public CharSequence getText() {
            return this.text;
        }

        public boolean isSelected() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.position) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void removeBadge() {
            this.view.removeBadge();
        }

        void reset() {
            this.parent = null;
            this.view = null;
            this.tag = null;
            this.icon = null;
            this.id = -1;
            this.text = null;
            this.contentDesc = null;
            this.position = -1;
            this.customView = null;
        }

        public void select() {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                tabLayout.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @a
        public Tab setContentDescription(@StringRes int i5) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setContentDescription(tabLayout.getResources().getText(i5));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @a
        public Tab setCustomView(@Nullable View view) {
            this.customView = view;
            updateView();
            return this;
        }

        @NonNull
        @a
        public Tab setIcon(@Nullable Drawable drawable) {
            this.icon = drawable;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @a
        public Tab setId(int i5) {
            this.id = i5;
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.setId(i5);
            }
            return this;
        }

        void setPosition(int i5) {
            this.position = i5;
        }

        @NonNull
        @a
        public Tab setTabLabelVisibility(@LabelVisibility int i5) {
            this.labelVisibilityMode = i5;
            TabLayout tabLayout = this.parent;
            if (tabLayout.tabGravity == 1 || tabLayout.mode == 2) {
                tabLayout.updateTabViews(true);
            }
            updateView();
            if (BadgeUtils.USE_COMPAT_PARENT && this.view.hasBadgeDrawable() && this.view.badgeDrawable.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @a
        public Tab setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }

        @NonNull
        @a
        public Tab setText(@Nullable CharSequence charSequence) {
            if (TextUtils.isEmpty(this.contentDesc) && !TextUtils.isEmpty(charSequence)) {
                this.view.setContentDescription(charSequence);
            }
            this.text = charSequence;
            updateView();
            return this;
        }

        void updateView() {
            TabView tabView = this.view;
            if (tabView != null) {
                tabView.update();
            }
        }

        @NonNull
        @a
        public Tab setCustomView(@LayoutRes int i5) {
            return setCustomView(LayoutInflater.from(this.view.getContext()).inflate(i5, (ViewGroup) this.view, false));
        }

        @NonNull
        @a
        public Tab setContentDescription(@Nullable CharSequence charSequence) {
            this.contentDesc = charSequence;
            updateView();
            return this;
        }

        @NonNull
        @a
        public Tab setText(@StringRes int i5) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setText(tabLayout.getResources().getText(i5));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        @a
        public Tab setIcon(@DrawableRes int i5) {
            TabLayout tabLayout = this.parent;
            if (tabLayout != null) {
                return setIcon(AppCompatResources.getDrawable(tabLayout.getContext(), i5));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        if (this.selectedListeners.contains(baseOnTabSelectedListener)) {
            return;
        }
        this.selectedListeners.add(baseOnTabSelectedListener);
    }

    public void addTab(@NonNull Tab tab, int i5) {
        addTab(tab, i5, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i5) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        this.selectedListeners.remove(baseOnTabSelectedListener);
    }

    public void selectTab(@Nullable Tab tab, boolean z4) {
        Tab tab2 = this.selectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                dispatchTabReselected(tab);
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        int position = tab != null ? tab.getPosition() : -1;
        if (z4) {
            if ((tab2 == null || tab2.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
            if (position != -1) {
                setSelectedTabView(position);
            }
        }
        this.selectedTab = tab;
        if (tab2 != null && tab2.parent != null) {
            dispatchTabUnselected(tab2);
        }
        if (tab != null) {
            dispatchTabSelected(tab);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener baseOnTabSelectedListener) {
        BaseOnTabSelectedListener baseOnTabSelectedListener2 = this.selectedListener;
        if (baseOnTabSelectedListener2 != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener2);
        }
        this.selectedListener = baseOnTabSelectedListener;
        if (baseOnTabSelectedListener != null) {
            addOnTabSelectedListener(baseOnTabSelectedListener);
        }
    }

    public void setScrollPosition(int i5, float f5, boolean z4, boolean z5) {
        setScrollPosition(i5, f5, z4, z5, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, boolean z4) {
        setupWithViewPager(viewPager, z4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.Nullable android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setupWithViewPager(@Nullable ViewPager viewPager, boolean z4, boolean z5) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.pageChangeListener;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            AdapterChangeListener adapterChangeListener = this.adapterChangeListener;
            if (adapterChangeListener != null) {
                this.viewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        BaseOnTabSelectedListener baseOnTabSelectedListener = this.currentVpSelectedListener;
        if (baseOnTabSelectedListener != null) {
            removeOnTabSelectedListener(baseOnTabSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.reset();
            viewPager.addOnPageChangeListener(this.pageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.currentVpSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener((BaseOnTabSelectedListener) viewPagerOnTabSelectedListener);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z4);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new AdapterChangeListener();
            }
            this.adapterChangeListener.setAutoRefresh(z4);
            viewPager.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z5;
    }

    public void addTab(@NonNull Tab tab, boolean z4) {
        addTab(tab, this.tabs.size(), z4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrollPosition(int i5, float f5, boolean z4, boolean z5, boolean z6) {
        int round = Math.round(i5 + f5);
        if (round < 0 || round >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z5) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i5, f5);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        int calculateScrollXForTab = calculateScrollXForTab(i5, f5);
        int scrollX = getScrollX();
        boolean z7 = (i5 < getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || (i5 > getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || i5 == getSelectedTabPosition();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z7 = (i5 < getSelectedTabPosition() && calculateScrollXForTab <= scrollX) || (i5 > getSelectedTabPosition() && calculateScrollXForTab >= scrollX) || i5 == getSelectedTabPosition();
        }
        if (z7 || this.viewPagerScrollState == 1 || z6) {
            if (i5 < 0) {
                calculateScrollXForTab = 0;
            }
            scrollTo(calculateScrollXForTab, 0);
        }
        if (z4) {
            setSelectedTabView(round);
        }
    }

    public void addTab(@NonNull Tab tab, int i5, boolean z4) {
        if (tab.parent == this) {
            configureTab(tab, i5);
            addTabView(tab);
            if (z4) {
                tab.select();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i5, int i6) {
        setTabTextColors(createColorStateList(i5, i6));
    }

    public void setSelectedTabIndicator(@DrawableRes int i5) {
        if (i5 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i5));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
