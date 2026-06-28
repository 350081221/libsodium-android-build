package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    @NonNull
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;

    @Nullable
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;

    @NonNull
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;

    @Nullable
    WindowInsetsCompat lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @Nullable
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;

    @Nullable
    private ViewGroup toolbar;

    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    /* loaded from: classes2.dex */
    private class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i5) {
            int i6;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i5;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.lastInsets;
            if (windowInsetsCompat != null) {
                i6 = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i6 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i7);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i8 = layoutParams.collapseMode;
                if (i8 != 1) {
                    if (i8 == 2) {
                        viewOffsetHelper.setTopAndBottomOffset(Math.round((-i5) * layoutParams.parallaxMult));
                    }
                } else {
                    viewOffsetHelper.setTopAndBottomOffset(MathUtils.clamp(-i5, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && i6 > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - i6;
            float f5 = height;
            CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f5));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout3.currentOffset + height);
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i5) / f5);
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void animateScrim(int i5) {
        TimeInterpolator timeInterpolator;
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            if (i5 > this.scrimAlpha) {
                timeInterpolator = this.scrimAnimationFadeInInterpolator;
            } else {
                timeInterpolator = this.scrimAnimationFadeOutInterpolator;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i5);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 3) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (!this.refreshToolbar) {
            return;
        }
        ViewGroup viewGroup = null;
        this.toolbar = null;
        this.toolbarDirectChild = null;
        int i5 = this.toolbarId;
        if (i5 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i5);
            this.toolbar = viewGroup2;
            if (viewGroup2 != null) {
                this.toolbarDirectChild = findDirectChild(viewGroup2);
            }
        }
        if (this.toolbar == null) {
            int childCount = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i6);
                if (isToolbar(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i6++;
            }
            this.toolbar = viewGroup;
        }
        updateDummyView();
        this.refreshToolbar = false;
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(R.dimen.design_appbar_elevation));
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        int i5 = R.id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(i5);
        if (viewOffsetHelper == null) {
            ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
            view.setTag(i5, viewOffsetHelper2);
            return viewOffsetHelper2;
        }
        return viewOffsetHelper;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 != null && view2 != this) {
            if (view == view2) {
                return true;
            }
        } else if (view == this.toolbar) {
            return true;
        }
        return false;
    }

    private void updateCollapsedBounds(boolean z4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i5 = toolbar.getTitleMarginStart();
            i7 = toolbar.getTitleMarginEnd();
            i8 = toolbar.getTitleMarginTop();
            i6 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i5 = toolbar2.getTitleMarginStart();
            i7 = toolbar2.getTitleMarginEnd();
            i8 = toolbar2.getTitleMarginTop();
            i6 = toolbar2.getTitleMarginBottom();
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i10 = rect.left;
        if (z4) {
            i9 = i7;
        } else {
            i9 = i5;
        }
        int i11 = i10 + i9;
        int i12 = rect.top + maxOffsetForPinChild + i8;
        int i13 = rect.right;
        if (!z4) {
            i5 = i7;
        }
        collapsingTextHelper.setCollapsedBounds(i11, i12, i13 - i5, (rect.bottom + maxOffsetForPinChild) - i6);
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, int i5, int i6) {
        updateContentScrimBounds(drawable, this.toolbar, i5, i6);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (this.collapsingTitleEnabled && this.toolbar != null) {
            if (this.dummyView == null) {
                this.dummyView = new View(getContext());
            }
            if (this.dummyView.getParent() == null) {
                this.toolbar.addView(this.dummyView, -1, -1);
            }
        }
    }

    private void updateTextBounds(int i5, int i6, int i7, int i8, boolean z4) {
        View view;
        boolean z5;
        int i9;
        int i10;
        if (this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            boolean z6 = false;
            if (ViewCompat.isAttachedToWindow(view) && this.dummyView.getVisibility() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.drawCollapsingTitle = z5;
            if (z5 || z4) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    z6 = true;
                }
                updateCollapsedBounds(z6);
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                if (z6) {
                    i9 = this.expandedMarginEnd;
                } else {
                    i9 = this.expandedMarginStart;
                }
                int i11 = this.tmpRect.top + this.expandedMarginTop;
                int i12 = i7 - i5;
                if (z6) {
                    i10 = this.expandedMarginStart;
                } else {
                    i10 = this.expandedMarginEnd;
                }
                collapsingTextHelper.setExpandedBounds(i9, i11, i12 - i10, (i8 - i6) - this.expandedMarginBottom);
                this.collapsingTextHelper.recalculate(z4);
            }
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i5;
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar != null && this.contentScrim != null && this.scrimAlpha > 0 && isTitleCollapseFadeMode() && this.collapsingTextHelper.getExpansionFraction() < this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                int save = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                this.collapsingTextHelper.draw(canvas);
            }
        }
        if (this.statusBarScrim != null && this.scrimAlpha > 0) {
            WindowInsetsCompat windowInsetsCompat = this.lastInsets;
            if (windowInsetsCompat != null) {
                i5 = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                i5 = 0;
            }
            if (i5 > 0) {
                this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), i5 - this.currentOffset);
                this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
                this.statusBarScrim.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        boolean z4;
        if (this.contentScrim != null && this.scrimAlpha > 0 && isToolbarChild(view)) {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z4 = true;
        } else {
            z4 = false;
        }
        if (super.drawChild(canvas, view, j5) || z4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean z4 = false;
        if (drawable != null && drawable.isStateful()) {
            z4 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            z4 |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            z4 |= collapsingTextHelper.setState(drawableState);
        }
        if (z4) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i5;
        int i6 = this.scrimVisibleHeightTrigger;
        if (i6 >= 0) {
            return i6 + this.topInsetApplied + this.extraMultilineHeight;
        }
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            i5 = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i5 = 0;
        }
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i5, getHeight());
        }
        return getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            getViewOffsetHelper(getChildAt(i10)).onViewLayout();
        }
        updateTextBounds(i5, i6, i7, i8, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i11 = 0; i11 < childCount3; i11++) {
            getViewOffsetHelper(getChildAt(i11)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        ensureToolbar();
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            i7 = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            i7 = 0;
        }
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && i7 > 0) {
            this.topInsetApplied = i7;
            super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i7, 1073741824));
        }
        if (this.extraMultilineHeightEnabled && this.collapsingTextHelper.getMaxLines() > 1) {
            updateTitleFromToolbarIfNeeded();
            updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = this.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                this.extraMultilineHeight = Math.round(this.collapsingTextHelper.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            if (view != null && view != this) {
                setMinimumHeight(getHeightWithMargins(view));
            } else {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i5, i6);
        }
    }

    WindowInsetsCompat onWindowInsetChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        if (ViewCompat.getFitsSystemWindows(this)) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setCollapsedTitleGravity(int i5) {
        this.collapsingTextHelper.setCollapsedTextGravity(i5);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i5) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i5);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i5) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setCollapsedTitleTextSize(float f5) {
        this.collapsingTextHelper.setCollapsedTextSize(f5);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.contentScrim = drawable3;
            if (drawable3 != null) {
                updateContentScrimBounds(drawable3, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i5) {
        setContentScrim(new ColorDrawable(i5));
    }

    public void setContentScrimResource(@DrawableRes int i5) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i5));
    }

    public void setExpandedTitleColor(@ColorInt int i5) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setExpandedTitleGravity(int i5) {
        this.collapsingTextHelper.setExpandedTextGravity(i5);
    }

    public void setExpandedTitleMargin(int i5, int i6, int i7, int i8) {
        this.expandedMarginStart = i5;
        this.expandedMarginTop = i6;
        this.expandedMarginEnd = i7;
        this.expandedMarginBottom = i8;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i5) {
        this.expandedMarginBottom = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i5) {
        this.expandedMarginEnd = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i5) {
        this.expandedMarginStart = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i5) {
        this.expandedMarginTop = i5;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i5) {
        this.collapsingTextHelper.setExpandedTextAppearance(i5);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f5) {
        this.collapsingTextHelper.setExpandedTextSize(f5);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z4) {
        this.extraMultilineHeightEnabled = z4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z4) {
        this.forceApplySystemWindowInsetTop = z4;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i5) {
        this.collapsingTextHelper.setHyphenationFrequency(i5);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f5) {
        this.collapsingTextHelper.setLineSpacingAdd(f5);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f5) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i5) {
        this.collapsingTextHelper.setMaxLines(i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z4) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z4);
    }

    void setScrimAlpha(int i5) {
        ViewGroup viewGroup;
        if (i5 != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.scrimAlpha = i5;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j5) {
        this.scrimAnimationDuration = j5;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i5) {
        if (this.scrimVisibleHeightTrigger != i5) {
            this.scrimVisibleHeightTrigger = i5;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z4) {
        setScrimsShown(z4, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        boolean z4;
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarScrim = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarScrim, ViewCompat.getLayoutDirection(this));
                Drawable drawable4 = this.statusBarScrim;
                if (getVisibility() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                drawable4.setVisible(z4, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i5) {
        setStatusBarScrim(new ColorDrawable(i5));
    }

    public void setStatusBarScrimResource(@DrawableRes int i5) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i5));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i5) {
        this.titleCollapseMode = i5;
        boolean isTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(isTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (isTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z4) {
        if (z4 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z4;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        boolean z4;
        super.setVisibility(i5);
        if (i5 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z4) {
            this.statusBarScrim.setVisible(z4, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isVisible() != z4) {
            this.contentScrim.setVisible(z4, false);
        }
    }

    final void updateScrimVisibility() {
        boolean z4;
        if (this.contentScrim != null || this.statusBarScrim != null) {
            if (getHeight() + this.currentOffset < getScrimVisibleHeightTrigger()) {
                z4 = true;
            } else {
                z4 = false;
            }
            setScrimsShown(z4);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, @Nullable View view, int i5, int i6) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i6 = view.getBottom();
        }
        drawable.setBounds(0, 0, i5, i6);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z4, boolean z5) {
        if (this.scrimsAreShown != z4) {
            if (z5) {
                animateScrim(z4 ? 255 : 0);
            } else {
                setScrimAlpha(z4 ? 255 : 0);
            }
            this.scrimsAreShown = z4;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i5) {
            this.collapseMode = i5;
        }

        public void setParallaxMultiplier(float f5) {
            this.parallaxMult = f5;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i5, int i6, int i7) {
            super(i5, i6, i7);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }
}
