package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final MaterialMainContainerBackHelper backHelper;

    @Nullable
    private AnimatorSet backProgressAnimatorSet;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchViewAnimationHelper(SearchView searchView) {
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.backHelper = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getFromTranslationXEnd(actionMenuView), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        Drawable unwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (this.searchView.isAnimatedNavigationIcon()) {
            addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, unwrap);
            addFadeThroughDrawableAnimatorIfNeeded(animatorSet, unwrap);
        } else {
            setFullDrawableProgressIfNeeded(unwrap);
        }
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getFromTranslationXStart(navigationIconButton), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            final DrawerArrowDrawable drawerArrowDrawable = (DrawerArrowDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.v
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(DrawerArrowDrawable.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            final FadeThroughDrawable fadeThroughDrawable = (FadeThroughDrawable) drawable;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4(FadeThroughDrawable.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
        }
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean z4) {
        long j5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        ofFloat.setDuration(j5);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.searchView.isMenuItemsAnimated()) {
            ofFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.dummyToolbar), ToolbarUtils.getActionMenuView(this.toolbar)));
        }
        return ofFloat;
    }

    private AnimatorSet getButtonsProgressAnimator(boolean z4) {
        long j5;
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        animatorSet.setDuration(j5);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getButtonsTranslationAnimator(boolean z4) {
        long j5;
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        addActionMenuViewAnimatorIfNeeded(animatorSet);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        animatorSet.setDuration(j5);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getClearButtonAnimator(boolean z4) {
        long j5;
        long j6;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            j5 = SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS;
        } else {
            j5 = HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS;
        }
        ofFloat.setDuration(j5);
        if (z4) {
            j6 = 250;
        } else {
            j6 = 0;
        }
        ofFloat.setStartDelay(j6);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.clearButton));
        return ofFloat;
    }

    private Animator getContentAlphaAnimator(boolean z4) {
        long j5;
        long j6;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            j5 = 150;
        } else {
            j5 = HIDE_CONTENT_ALPHA_DURATION_MS;
        }
        ofFloat.setDuration(j5);
        if (z4) {
            j6 = 75;
        } else {
            j6 = 0;
        }
        ofFloat.setStartDelay(j6);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.divider, this.contentContainer));
        return ofFloat;
    }

    private Animator getContentAnimator(boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getContentAlphaAnimator(z4), getDividerAnimator(z4), getContentScaleAnimator(z4));
        return animatorSet;
    }

    private Animator getContentScaleAnimator(boolean z4) {
        long j5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(CONTENT_FROM_SCALE, 1.0f);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        ofFloat.setDuration(j5);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.contentContainer));
        return ofFloat;
    }

    private Animator getDividerAnimator(boolean z4) {
        long j5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.contentContainer.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        ofFloat.setDuration(j5);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.divider));
        return ofFloat;
    }

    private Animator getDummyToolbarAnimator(boolean z4) {
        return getTranslationAnimator(z4, false, this.dummyToolbar);
    }

    private Animator getEditTextAnimator(boolean z4) {
        return getTranslationAnimator(z4, true, this.editText);
    }

    private AnimatorSet getExpandCollapseAnimatorSet(final boolean z4) {
        boolean z5;
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.backProgressAnimatorSet != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            animatorSet.playTogether(getButtonsProgressAnimator(z4), getButtonsTranslationAnimator(z4));
        }
        animatorSet.playTogether(getScrimAlphaAnimator(z4), getRootViewAnimator(z4), getClearButtonAnimator(z4), getContentAnimator(z4), getHeaderContainerAnimator(z4), getDummyToolbarAnimator(z4), getActionMenuViewsAlphaAnimator(z4), getEditTextAnimator(z4), getSearchPrefixAnimator(z4));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                float f5;
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                if (z4) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                searchViewAnimationHelper.setContentViewsAlpha(f5);
                SearchViewAnimationHelper.this.rootView.resetClipBoundsAndCornerRadius();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.setContentViewsAlpha(z4 ? 0.0f : 1.0f);
            }
        });
        return animatorSet;
    }

    private int getFromTranslationXEnd(View view) {
        int marginEnd = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (ViewUtils.isLayoutRtl(this.searchBar)) {
            return this.searchBar.getLeft() - marginEnd;
        }
        return (this.searchBar.getRight() - this.searchView.getWidth()) + marginEnd;
    }

    private int getFromTranslationXStart(View view) {
        int marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int paddingStart = ViewCompat.getPaddingStart(this.searchBar);
        if (ViewUtils.isLayoutRtl(this.searchBar)) {
            return ((this.searchBar.getWidth() - this.searchBar.getRight()) + marginStart) - paddingStart;
        }
        return (this.searchBar.getLeft() - marginStart) + paddingStart;
    }

    private int getFromTranslationY() {
        return ((this.searchBar.getTop() + this.searchBar.getBottom()) / 2) - ((this.toolbarContainer.getTop() + this.toolbarContainer.getBottom()) / 2);
    }

    private Animator getHeaderContainerAnimator(boolean z4) {
        return getTranslationAnimator(z4, false, this.headerContainer);
    }

    private Animator getRootViewAnimator(boolean z4) {
        long j5;
        Rect initialHideToClipBounds = this.backHelper.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.backHelper.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.searchView);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.rootView, this.searchBar);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.searchBar.getCornerSize();
        final float max = Math.max(this.rootView.getCornerRadius(), this.backHelper.getExpandedCornerSize());
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper.this.lambda$getRootViewAnimator$2(cornerSize, max, rect, valueAnimator);
            }
        });
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        ofObject.setDuration(j5);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    private Animator getScrimAlphaAnimator(boolean z4) {
        TimeInterpolator timeInterpolator;
        long j5;
        if (z4) {
            timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        } else {
            timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        ofFloat.setDuration(j5);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.scrim));
        return ofFloat;
    }

    private Animator getSearchPrefixAnimator(boolean z4) {
        return getTranslationAnimator(z4, true, this.searchPrefix);
    }

    private AnimatorSet getTranslateAnimatorSet(boolean z4) {
        long j5;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getTranslationYAnimator());
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (z4) {
            j5 = SHOW_TRANSLATE_DURATION_MS;
        } else {
            j5 = 300;
        }
        animatorSet.setDuration(j5);
        return animatorSet;
    }

    private Animator getTranslationAnimator(boolean z4, boolean z5, View view) {
        int fromTranslationXEnd;
        long j5;
        if (z5) {
            fromTranslationXEnd = getFromTranslationXStart(view);
        } else {
            fromTranslationXEnd = getFromTranslationXEnd(view);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromTranslationXEnd, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z4) {
            j5 = 300;
        } else {
            j5 = 250;
        }
        animatorSet.setDuration(j5);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z4, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getTranslationYAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.rootView.getHeight(), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.rootView));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        drawerArrowDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$4(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRootViewAnimator$2(float f5, float f6, Rect rect, ValueAnimator valueAnimator) {
        this.rootView.updateClipBoundsAndCornerRadius(rect, AnimationUtils.lerp(f5, f6, valueAnimator.getAnimatedFraction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShowAnimationExpand$0() {
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(true);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchBar.stopOnLoadAnimation();
            }
        });
        expandCollapseAnimatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShowAnimationTranslate$1() {
        this.rootView.setTranslationY(r0.getHeight());
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(true);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
            }
        });
        translateAnimatorSet.start();
    }

    private void setActionMenuViewAlphaIfNeeded(float f5) {
        ActionMenuView actionMenuView;
        if (this.searchView.isMenuItemsAnimated() && (actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar)) != null) {
            actionMenuView.setAlpha(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentViewsAlpha(float f5) {
        this.clearButton.setAlpha(f5);
        this.divider.setAlpha(f5);
        this.contentContainer.setAlpha(f5);
        setActionMenuViewAlphaIfNeeded(f5);
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    private void setMenuItemsNotClickable(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i5 = 0; i5 < actionMenuView.getChildCount(); i5++) {
                View childAt = actionMenuView.getChildAt(i5);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void setUpDummyToolbarIfNeeded() {
        Menu menu = this.dummyToolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.searchBar.getMenuResId() != -1 && this.searchView.isMenuItemsAnimated()) {
            this.dummyToolbar.inflateMenu(this.searchBar.getMenuResId());
            setMenuItemsNotClickable(this.dummyToolbar);
            this.dummyToolbar.setVisibility(0);
            return;
        }
        this.dummyToolbar.setVisibility(8);
    }

    private AnimatorSet startHideAnimationCollapse() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(false);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        expandCollapseAnimatorSet.start();
        return expandCollapseAnimatorSet;
    }

    private AnimatorSet startHideAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        translateAnimatorSet.start();
        return translateAnimatorSet;
    }

    private void startShowAnimationExpand() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
        setUpDummyToolbarIfNeeded();
        this.editText.setText(this.searchBar.getText());
        EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
        this.rootView.setVisibility(4);
        this.rootView.post(new Runnable() { // from class: com.google.android.material.search.w
            @Override // java.lang.Runnable
            public final void run() {
                SearchViewAnimationHelper.this.lambda$startShowAnimationExpand$0();
            }
        });
    }

    private void startShowAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            final SearchView searchView = this.searchView;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.x
                @Override // java.lang.Runnable
                public final void run() {
                    SearchView.this.requestFocusAndShowKeyboardIfNeeded();
                }
            }, 150L);
        }
        this.rootView.setVisibility(4);
        this.rootView.post(new Runnable() { // from class: com.google.android.material.search.y
            @Override // java.lang.Runnable
            public final void run() {
                SearchViewAnimationHelper.this.lambda$startShowAnimationTranslate$1();
            }
        });
    }

    @RequiresApi(34)
    public void cancelBackProgress() {
        this.backHelper.cancelBackProgress(this.searchBar);
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.backProgressAnimatorSet = null;
    }

    @RequiresApi(34)
    public void finishBackProgress() {
        this.backHelper.finishBackProgress(hide().getTotalDuration(), this.searchBar);
        if (this.backProgressAnimatorSet != null) {
            getButtonsTranslationAnimator(false).start();
            this.backProgressAnimatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @o1.a
    public AnimatorSet hide() {
        if (this.searchBar != null) {
            return startHideAnimationCollapse();
        }
        return startHideAnimationTranslate();
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void show() {
        if (this.searchBar != null) {
            startShowAnimationExpand();
        } else {
            startShowAnimationTranslate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.backHelper.startBackProgress(backEventCompat, this.searchBar);
    }

    @RequiresApi(34)
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (backEventCompat.getProgress() <= 0.0f) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet == null) {
            if (this.searchView.isAdjustNothingSoftInputMode()) {
                this.searchView.clearFocusAndHideKeyboard();
            }
            if (!this.searchView.isAnimatedNavigationIcon()) {
                return;
            }
            AnimatorSet buttonsProgressAnimator = getButtonsProgressAnimator(false);
            this.backProgressAnimatorSet = buttonsProgressAnimator;
            buttonsProgressAnimator.start();
            this.backProgressAnimatorSet.pause();
            return;
        }
        animatorSet.setCurrentPlayTime(backEventCompat.getProgress() * ((float) this.backProgressAnimatorSet.getDuration()));
    }
}
