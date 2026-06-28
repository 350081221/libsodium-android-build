.class Lcom/google/android/material/search/SearchViewAnimationHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CONTENT_FROM_SCALE:F = 0.95f

.field private static final HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS:J = 0x2aL

.field private static final HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS:J = 0x0L

.field private static final HIDE_CONTENT_ALPHA_DURATION_MS:J = 0x53L

.field private static final HIDE_CONTENT_ALPHA_START_DELAY_MS:J = 0x0L

.field private static final HIDE_CONTENT_SCALE_DURATION_MS:J = 0xfaL

.field private static final HIDE_DURATION_MS:J = 0xfaL

.field private static final HIDE_TRANSLATE_DURATION_MS:J = 0x12cL

.field private static final SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS:J = 0x32L

.field private static final SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS:J = 0xfaL

.field private static final SHOW_CONTENT_ALPHA_DURATION_MS:J = 0x96L

.field private static final SHOW_CONTENT_ALPHA_START_DELAY_MS:J = 0x4bL

.field private static final SHOW_CONTENT_SCALE_DURATION_MS:J = 0x12cL

.field private static final SHOW_DURATION_MS:J = 0x12cL

.field private static final SHOW_TRANSLATE_DURATION_MS:J = 0x15eL

.field private static final SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS:J = 0x96L


# instance fields
.field private final backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

.field private backProgressAnimatorSet:Landroid/animation/AnimatorSet;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final clearButton:Landroid/widget/ImageButton;

.field private final contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

.field private final divider:Landroid/view/View;

.field private final dummyToolbar:Landroidx/appcompat/widget/Toolbar;

.field private final editText:Landroid/widget/EditText;

.field private final headerContainer:Landroid/widget/FrameLayout;

.field private final rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

.field private final scrim:Landroid/view/View;

.field private searchBar:Lcom/google/android/material/search/SearchBar;

.field private final searchPrefix:Landroid/widget/TextView;

.field private final searchView:Lcom/google/android/material/search/SearchView;

.field private final toolbar:Landroidx/appcompat/widget/Toolbar;

.field private final toolbarContainer:Landroid/widget/FrameLayout;


# direct methods
.method constructor <init>(Lcom/google/android/material/search/SearchView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/material/search/SearchView;->scrim:Landroid/view/View;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->scrim:Landroid/view/View;

    .line 9
    .line 10
    iget-object v0, p1, Lcom/google/android/material/search/SearchView;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 13
    .line 14
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->headerContainer:Landroid/widget/FrameLayout;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->headerContainer:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->toolbarContainer:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbarContainer:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->toolbar:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 25
    .line 26
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 27
    .line 28
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 29
    .line 30
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->searchPrefix:Landroid/widget/TextView;

    .line 31
    .line 32
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchPrefix:Landroid/widget/TextView;

    .line 33
    .line 34
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->editText:Landroid/widget/EditText;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->editText:Landroid/widget/EditText;

    .line 37
    .line 38
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->clearButton:Landroid/widget/ImageButton;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->clearButton:Landroid/widget/ImageButton;

    .line 41
    .line 42
    iget-object v1, p1, Lcom/google/android/material/search/SearchView;->divider:Landroid/view/View;

    .line 43
    .line 44
    iput-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->divider:Landroid/view/View;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/google/android/material/search/SearchView;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 47
    .line 48
    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 49
    .line 50
    new-instance p1, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 51
    .line 52
    invoke-direct {p1, v0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;-><init>(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static synthetic a(Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/material/search/SearchViewAnimationHelper;)Lcom/google/android/material/search/SearchView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/android/material/search/SearchViewAnimationHelper;)Lcom/google/android/material/internal/ClippableRoundedCornerLayout;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/android/material/search/SearchViewAnimationHelper;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setContentViewsAlpha(F)V

    return-void
.end method

.method static synthetic access$300(Lcom/google/android/material/search/SearchViewAnimationHelper;)Lcom/google/android/material/search/SearchBar;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    return-object p0
.end method

.method private addActionMenuViewAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuView(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    new-array v2, v1, [F

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationXEnd(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    const/4 v4, 0x0

    .line 19
    aput v3, v2, v4

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    aput v5, v2, v3

    .line 24
    .line 25
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-array v6, v3, [Landroid/view/View;

    .line 30
    .line 31
    aput-object v0, v6, v4

    .line 32
    .line 33
    invoke-static {v6}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationXListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v2, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    new-array v6, v1, [F

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationY()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    int-to-float v7, v7

    .line 47
    aput v7, v6, v4

    .line 48
    .line 49
    aput v5, v6, v3

    .line 50
    .line 51
    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    new-array v6, v3, [Landroid/view/View;

    .line 56
    .line 57
    aput-object v0, v6, v4

    .line 58
    .line 59
    invoke-static {v6}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationYListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v5, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 64
    .line 65
    .line 66
    new-array v0, v1, [Landroid/animation/Animator;

    .line 67
    .line 68
    aput-object v2, v0, v4

    .line 69
    .line 70
    aput-object v5, v0, v3

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 73
    .line 74
    .line 75
    return-void
    .line 76
    .line 77
    .line 78
.end method

.method private addBackButtonProgressAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/internal/ToolbarUtils;->getNavigationIconButton(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Landroidx/core/graphics/drawable/DrawableCompat;->unwrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchView;->isAnimatedNavigationIcon()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addDrawerArrowDrawableAnimatorIfNeeded(Landroid/animation/AnimatorSet;Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addFadeThroughDrawableAnimatorIfNeeded(Landroid/animation/AnimatorSet;Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setFullDrawableProgressIfNeeded(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private addBackButtonTranslationAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/material/internal/ToolbarUtils;->getNavigationIconButton(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    new-array v2, v1, [F

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationXStart(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    const/4 v4, 0x0

    .line 19
    aput v3, v2, v4

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    aput v5, v2, v3

    .line 24
    .line 25
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-array v6, v3, [Landroid/view/View;

    .line 30
    .line 31
    aput-object v0, v6, v4

    .line 32
    .line 33
    invoke-static {v6}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationXListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v2, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    new-array v6, v1, [F

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationY()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    int-to-float v7, v7

    .line 47
    aput v7, v6, v4

    .line 48
    .line 49
    aput v5, v6, v3

    .line 50
    .line 51
    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    new-array v6, v3, [Landroid/view/View;

    .line 56
    .line 57
    aput-object v0, v6, v4

    .line 58
    .line 59
    invoke-static {v6}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationYListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v5, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 64
    .line 65
    .line 66
    new-array v0, v1, [Landroid/animation/Animator;

    .line 67
    .line 68
    aput-object v2, v0, v4

    .line 69
    .line 70
    aput-object v5, v0, v3

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 73
    .line 74
    .line 75
    return-void
    .line 76
    .line 77
    .line 78
.end method

.method private addDrawerArrowDrawableAnimatorIfNeeded(Landroid/animation/AnimatorSet;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    instance-of v0, p2, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [F

    .line 9
    .line 10
    fill-array-data v0, :array_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/google/android/material/search/v;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Lcom/google/android/material/search/v;-><init>(Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    new-array p2, p2, [Landroid/animation/Animator;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aput-object v0, p2, v1

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private addFadeThroughDrawableAnimatorIfNeeded(Landroid/animation/AnimatorSet;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    instance-of v0, p2, Lcom/google/android/material/internal/FadeThroughDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/google/android/material/internal/FadeThroughDrawable;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [F

    .line 9
    .line 10
    fill-array-data v0, :array_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/google/android/material/search/u;

    .line 18
    .line 19
    invoke-direct {v1, p2}, Lcom/google/android/material/search/u;-><init>(Lcom/google/android/material/internal/FadeThroughDrawable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    new-array p2, p2, [Landroid/animation/Animator;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aput-object v0, p2, v1

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static synthetic b(Lcom/google/android/material/search/SearchViewAnimationHelper;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->lambda$startShowAnimationExpand$0()V

    return-void
.end method

.method public static synthetic c(Lcom/google/android/material/internal/FadeThroughDrawable;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->lambda$addFadeThroughDrawableAnimatorIfNeeded$4(Lcom/google/android/material/internal/FadeThroughDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic d(Lcom/google/android/material/search/SearchViewAnimationHelper;FFLandroid/graphics/Rect;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/material/search/SearchViewAnimationHelper;->lambda$getRootViewAnimator$2(FFLandroid/graphics/Rect;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(Lcom/google/android/material/search/SearchViewAnimationHelper;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->lambda$startShowAnimationTranslate$1()V

    return-void
.end method

.method private getActionMenuViewsAlphaAnimator(Z)Landroid/animation/Animator;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-wide/16 v1, 0x12c

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v1, 0xfa

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 22
    .line 23
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->isMenuItemsAnimated()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuView(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuView(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Lcom/google/android/material/internal/FadeThroughUpdateListener;

    .line 51
    .line 52
    invoke-direct {v2, p1, v1}, Lcom/google/android/material/internal/FadeThroughUpdateListener;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-object v0

    .line 59
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getButtonsProgressAnimator(Z)Landroid/animation/AnimatorSet;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addBackButtonProgressAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v1, 0x12c

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v1, 0xfa

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 17
    .line 18
    .line 19
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 20
    .line 21
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 26
    .line 27
    .line 28
    return-object v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getButtonsTranslationAnimator(Z)Landroid/animation/AnimatorSet;
    .locals 3

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addBackButtonTranslationAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addActionMenuViewAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const-wide/16 v1, 0x12c

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 v1, 0xfa

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    .line 31
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getClearButtonAnimator(Z)Landroid/animation/Animator;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-wide/16 v1, 0x32

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v1, 0x2a

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-wide/16 v1, 0xfa

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    :goto_1
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->LINEAR_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 32
    .line 33
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    new-array p1, p1, [Landroid/view/View;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->clearButton:Landroid/widget/ImageButton;

    .line 45
    .line 46
    aput-object v2, p1, v1

    .line 47
    .line 48
    invoke-static {p1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->alphaListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    nop

    .line 57
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getContentAlphaAnimator(Z)Landroid/animation/Animator;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-wide/16 v2, 0x96

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v2, 0x53

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-wide/16 v2, 0x4b

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    :goto_1
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lcom/google/android/material/animation/AnimationUtils;->LINEAR_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 32
    .line 33
    invoke-static {p1, v2}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v1, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 38
    .line 39
    .line 40
    new-array p1, v0, [Landroid/view/View;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->divider:Landroid/view/View;

    .line 44
    .line 45
    aput-object v2, p1, v0

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 49
    .line 50
    aput-object v2, p1, v0

    .line 51
    .line 52
    invoke-static {p1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->alphaListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getContentAnimator(Z)Landroid/animation/Animator;
    .locals 4

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    new-array v1, v1, [Landroid/animation/Animator;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getContentAlphaAnimator(Z)Landroid/animation/Animator;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getDividerAnimator(Z)Landroid/animation/Animator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getContentScaleAnimator(Z)Landroid/animation/Animator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    aput-object p1, v1, v2

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 31
    .line 32
    .line 33
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getContentScaleAnimator(Z)Landroid/animation/Animator;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const-wide/16 v1, 0x12c

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v1, 0xfa

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 22
    .line 23
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    new-array p1, p1, [Landroid/view/View;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 35
    .line 36
    aput-object v2, p1, v1

    .line 37
    .line 38
    invoke-static {p1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->scaleListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    nop

    .line 47
    :array_0
    .array-data 4
        0x3f733333    # 0.95f
        0x3f800000    # 1.0f
    .end array-data
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getDividerAnimator(Z)Landroid/animation/Animator;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    const v1, 0x3d4cccd0    # 0.050000012f

    .line 9
    .line 10
    .line 11
    mul-float/2addr v0, v1

    .line 12
    const/high16 v1, 0x40000000    # 2.0f

    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    const/4 v1, 0x2

    .line 16
    new-array v1, v1, [F

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aput v0, v1, v2

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    aput v0, v1, v3

    .line 24
    .line 25
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const-wide/16 v4, 0x12c

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-wide/16 v4, 0xfa

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 37
    .line 38
    .line 39
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 40
    .line 41
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 46
    .line 47
    .line 48
    new-array p1, v3, [Landroid/view/View;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->divider:Landroid/view/View;

    .line 51
    .line 52
    aput-object v1, p1, v2

    .line 53
    .line 54
    invoke-static {p1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationYListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    .line 60
    .line 61
    return-object v0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getDummyToolbarAnimator(Z)Landroid/animation/Animator;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslationAnimator(ZZLandroid/view/View;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method private getEditTextAnimator(Z)Landroid/animation/Animator;
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->editText:Landroid/widget/EditText;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslationAnimator(ZZLandroid/view/View;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method private getExpandCollapseAnimatorSet(Z)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move v1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v3

    .line 15
    :goto_0
    const/4 v4, 0x2

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-array v1, v4, [Landroid/animation/Animator;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getButtonsProgressAnimator(Z)Landroid/animation/AnimatorSet;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    aput-object v5, v1, v3

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getButtonsTranslationAnimator(Z)Landroid/animation/AnimatorSet;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    aput-object v5, v1, v2

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/16 v1, 0x9

    .line 36
    .line 37
    new-array v1, v1, [Landroid/animation/Animator;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getScrimAlphaAnimator(Z)Landroid/animation/Animator;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    aput-object v5, v1, v3

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getRootViewAnimator(Z)Landroid/animation/Animator;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    aput-object v3, v1, v2

    .line 50
    .line 51
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getClearButtonAnimator(Z)Landroid/animation/Animator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    aput-object v2, v1, v4

    .line 56
    .line 57
    const/4 v2, 0x3

    .line 58
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getContentAnimator(Z)Landroid/animation/Animator;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    aput-object v3, v1, v2

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getHeaderContainerAnimator(Z)Landroid/animation/Animator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    aput-object v3, v1, v2

    .line 70
    .line 71
    const/4 v2, 0x5

    .line 72
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getDummyToolbarAnimator(Z)Landroid/animation/Animator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    aput-object v3, v1, v2

    .line 77
    .line 78
    const/4 v2, 0x6

    .line 79
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getActionMenuViewsAlphaAnimator(Z)Landroid/animation/Animator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    aput-object v3, v1, v2

    .line 84
    .line 85
    const/4 v2, 0x7

    .line 86
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getEditTextAnimator(Z)Landroid/animation/Animator;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    aput-object v3, v1, v2

    .line 91
    .line 92
    const/16 v2, 0x8

    .line 93
    .line 94
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getSearchPrefixAnimator(Z)Landroid/animation/Animator;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    aput-object v3, v1, v2

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lcom/google/android/material/search/SearchViewAnimationHelper$5;

    .line 104
    .line 105
    invoke-direct {v1, p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper$5;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 109
    .line 110
    .line 111
    return-object v0
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method private getFromTranslationXEnd(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/google/android/material/internal/ViewUtils;->isLayoutRtl(Landroid/view/View;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-int/2addr v0, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v0, v1

    .line 40
    add-int/2addr v0, p1

    .line 41
    :goto_0
    return v0
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getFromTranslationXStart(Landroid/view/View;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/core/view/ViewCompat;->getPaddingStart(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/google/android/material/internal/ViewUtils;->isLayoutRtl(Landroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sub-int/2addr v1, v2

    .line 38
    add-int/2addr v1, p1

    .line 39
    sub-int/2addr v1, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-int/2addr v1, p1

    .line 48
    add-int/2addr v1, v0

    .line 49
    :goto_0
    return v1
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getFromTranslationY()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbarContainer:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbarContainer:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    div-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v1, v2

    .line 29
    div-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    sub-int/2addr v1, v0

    .line 32
    return v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private getHeaderContainerAnimator(Z)Landroid/animation/Animator;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->headerContainer:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslationAnimator(ZZLandroid/view/View;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method private getRootViewAnimator(Z)Landroid/animation/Animator;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getInitialHideToClipBounds()Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getInitialHideFromClipBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/google/android/material/internal/ViewUtils;->calculateRectFromBounds(Landroid/view/View;)Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 28
    .line 29
    invoke-static {v1, v2}, Lcom/google/android/material/internal/ViewUtils;->calculateOffsetRectFromBounds(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_1
    new-instance v2, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/google/android/material/search/SearchBar;->getCornerSize()F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget-object v4, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->getCornerRadius()F

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 51
    .line 52
    invoke-virtual {v5}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getExpandedCornerSize()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    int-to-float v5, v5

    .line 57
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    new-instance v5, Lcom/google/android/material/internal/RectEvaluator;

    .line 62
    .line 63
    invoke-direct {v5, v2}, Lcom/google/android/material/internal/RectEvaluator;-><init>(Landroid/graphics/Rect;)V

    .line 64
    .line 65
    .line 66
    const/4 v6, 0x2

    .line 67
    new-array v6, v6, [Ljava/lang/Object;

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    aput-object v1, v6, v7

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    aput-object v0, v6, v1

    .line 74
    .line 75
    invoke-static {v5, v6}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, Lcom/google/android/material/search/z;

    .line 80
    .line 81
    invoke-direct {v1, p0, v3, v4, v2}, Lcom/google/android/material/search/z;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;FFLandroid/graphics/Rect;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 85
    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    const-wide/16 v1, 0x12c

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const-wide/16 v1, 0xfa

    .line 93
    .line 94
    :goto_2
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 95
    .line 96
    .line 97
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 98
    .line 99
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 104
    .line 105
    .line 106
    return-object v0
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method private getScrimAlphaAnimator(Z)Landroid/animation/Animator;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/material/animation/AnimationUtils;->LINEAR_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 7
    .line 8
    :goto_0
    const/4 v1, 0x2

    .line 9
    new-array v1, v1, [F

    .line 10
    .line 11
    fill-array-data v1, :array_0

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-wide/16 v2, 0x12c

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-wide/16 v2, 0xfa

    .line 24
    .line 25
    :goto_1
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    new-array p1, p1, [Landroid/view/View;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->scrim:Landroid/view/View;

    .line 40
    .line 41
    aput-object v2, p1, v0

    .line 42
    .line 43
    invoke-static {p1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->alphaListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v1, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getSearchPrefixAnimator(Z)Landroid/animation/Animator;
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchPrefix:Landroid/widget/TextView;

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslationAnimator(ZZLandroid/view/View;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method private getTranslateAnimatorSet(Z)Landroid/animation/AnimatorSet;
    .locals 4

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Landroid/animation/Animator;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslationYAnimator()Landroid/animation/Animator;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    aput-object v3, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->addBackButtonProgressAnimatorIfNeeded(Landroid/animation/AnimatorSet;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const-wide/16 v1, 0x15e

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-wide/16 v1, 0x12c

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 39
    .line 40
    .line 41
    return-object v0
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private getTranslationAnimator(ZZLandroid/view/View;)Landroid/animation/Animator;
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationXStart(Landroid/view/View;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationXEnd(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :goto_0
    const/4 v0, 0x2

    .line 13
    new-array v1, v0, [F

    .line 14
    .line 15
    int-to-float p2, p2

    .line 16
    const/4 v2, 0x0

    .line 17
    aput p2, v1, v2

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    aput v3, v1, p2

    .line 22
    .line 23
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-array v4, p2, [Landroid/view/View;

    .line 28
    .line 29
    aput-object p3, v4, v2

    .line 30
    .line 31
    invoke-static {v4}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationXListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 36
    .line 37
    .line 38
    new-array v4, v0, [F

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getFromTranslationY()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    int-to-float v5, v5

    .line 45
    aput v5, v4, v2

    .line 46
    .line 47
    aput v3, v4, p2

    .line 48
    .line 49
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-array v4, p2, [Landroid/view/View;

    .line 54
    .line 55
    aput-object p3, v4, v2

    .line 56
    .line 57
    invoke-static {v4}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationYListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {v3, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 62
    .line 63
    .line 64
    new-instance p3, Landroid/animation/AnimatorSet;

    .line 65
    .line 66
    invoke-direct {p3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 67
    .line 68
    .line 69
    new-array v0, v0, [Landroid/animation/Animator;

    .line 70
    .line 71
    aput-object v1, v0, v2

    .line 72
    .line 73
    aput-object v3, v0, p2

    .line 74
    .line 75
    invoke-virtual {p3, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 76
    .line 77
    .line 78
    if-eqz p1, :cond_1

    .line 79
    .line 80
    const-wide/16 v0, 0x12c

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const-wide/16 v0, 0xfa

    .line 84
    .line 85
    :goto_1
    invoke-virtual {p3, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 86
    .line 87
    .line 88
    sget-object p2, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 89
    .line 90
    invoke-static {p1, p2}, Lcom/google/android/material/internal/ReversableAnimatedValueInterpolator;->of(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p3, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 95
    .line 96
    .line 97
    return-object p3
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method private getTranslationYAnimator()Landroid/animation/Animator;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput v1, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    aput v1, v0, v3

    .line 17
    .line 18
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-array v1, v3, [Landroid/view/View;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 25
    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    invoke-static {v1}, Lcom/google/android/material/internal/MultiViewUpdateListener;->translationYListener([Landroid/view/View;)Lcom/google/android/material/internal/MultiViewUpdateListener;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 33
    .line 34
    .line 35
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private static synthetic lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;->setProgress(F)V

    return-void
.end method

.method private static synthetic lambda$addFadeThroughDrawableAnimatorIfNeeded$4(Lcom/google/android/material/internal/FadeThroughDrawable;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/FadeThroughDrawable;->setProgress(F)V

    return-void
.end method

.method private synthetic lambda$getRootViewAnimator$2(FFLandroid/graphics/Rect;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    invoke-static {p1, p2, p4}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFF)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 10
    .line 11
    invoke-virtual {p2, p3, p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->updateClipBoundsAndCornerRadius(Landroid/graphics/Rect;F)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
.end method

.method private synthetic lambda$startShowAnimationExpand$0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getExpandCollapseAnimatorSet(Z)Landroid/animation/AnimatorSet;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Lcom/google/android/material/search/SearchViewAnimationHelper$1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchViewAnimationHelper$1;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private synthetic lambda$startShowAnimationTranslate$1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslateAnimatorSet(Z)Landroid/animation/AnimatorSet;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/android/material/search/SearchViewAnimationHelper$3;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchViewAnimationHelper$3;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private setActionMenuViewAlphaIfNeeded(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isMenuItemsAnimated()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->toolbar:Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuView(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private setContentViewsAlpha(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->clearButton:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->divider:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->contentContainer:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setActionMenuViewAlphaIfNeeded(F)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private setFullDrawableProgressIfNeeded(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;->setProgress(F)V

    .line 11
    .line 12
    .line 13
    :cond_0
    instance-of v0, p1, Lcom/google/android/material/internal/FadeThroughDrawable;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p1, Lcom/google/android/material/internal/FadeThroughDrawable;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/FadeThroughDrawable;->setProgress(F)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
.end method

.method private setMenuItemsNotClickable(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/material/internal/ToolbarUtils;->getActionMenuView(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method private setUpDummyToolbarIfNeeded()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getMenuResId()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, -0x1

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isMenuItemsAnimated()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchBar;->getMenuResId()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->inflateMenu(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 41
    .line 42
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setMenuItemsNotClickable(Landroidx/appcompat/widget/Toolbar;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->dummyToolbar:Landroidx/appcompat/widget/Toolbar;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startHideAnimationCollapse()Landroid/animation/AnimatorSet;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->clearFocusAndHideKeyboard()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getExpandCollapseAnimatorSet(Z)Landroid/animation/AnimatorSet;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/google/android/material/search/SearchViewAnimationHelper$2;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchViewAnimationHelper$2;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startHideAnimationTranslate()Landroid/animation/AnimatorSet;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->clearFocusAndHideKeyboard()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getTranslateAnimatorSet(Z)Landroid/animation/AnimatorSet;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lcom/google/android/material/search/SearchViewAnimationHelper$4;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/google/android/material/search/SearchViewAnimationHelper$4;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startShowAnimationExpand()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->requestFocusAndShowKeyboardIfNeeded()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 15
    .line 16
    sget-object v1, Lcom/google/android/material/search/SearchView$TransitionState;->SHOWING:Lcom/google/android/material/search/SearchView$TransitionState;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Lcom/google/android/material/search/SearchView$TransitionState;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->setUpDummyToolbarIfNeeded()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->editText:Landroid/widget/EditText;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchBar;->getText()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->editText:Landroid/widget/EditText;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 55
    .line 56
    new-instance v1, Lcom/google/android/material/search/w;

    .line 57
    .line 58
    invoke-direct {v1, p0}, Lcom/google/android/material/search/w;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    return-void
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private startShowAnimationTranslate()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    new-instance v1, Lcom/google/android/material/search/x;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lcom/google/android/material/search/x;-><init>(Lcom/google/android/material/search/SearchView;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v2, 0x96

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->rootView:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 31
    .line 32
    new-instance v1, Lcom/google/android/material/search/y;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/google/android/material/search/y;-><init>(Lcom/google/android/material/search/SearchViewAnimationHelper;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public cancelBackProgress()V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->cancelBackProgress(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lcom/google/android/material/search/t;->a(Landroid/animation/AnimatorSet;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public finishBackProgress()V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->hide()Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->getTotalDuration()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->finishBackProgress(JLandroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getButtonsTranslationAnimator(Z)Landroid/animation/AnimatorSet;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->resume()V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method getBackHelper()Lcom/google/android/material/motion/MaterialMainContainerBackHelper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    return-object v0
.end method

.method hide()Landroid/animation/AnimatorSet;
    .locals 1
    .annotation build Lo1/a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->startHideAnimationCollapse()Landroid/animation/AnimatorSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->startHideAnimationTranslate()Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onHandleBackInvoked()Landroidx/activity/BackEventCompat;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    invoke-virtual {v0}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->onHandleBackInvoked()Landroidx/activity/BackEventCompat;

    move-result-object v0

    return-object v0
.end method

.method setSearchBar(Lcom/google/android/material/search/SearchBar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    return-void
.end method

.method show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->startShowAnimationExpand()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchViewAnimationHelper;->startShowAnimationTranslate()V

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method startBackProgress(Landroidx/activity/BackEventCompat;)V
    .locals 2
    .param p1    # Landroidx/activity/BackEventCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->startBackProgress(Landroidx/activity/BackEventCompat;Landroid/view/View;)V

    return-void
.end method

.method public updateBackProgress(Landroidx/activity/BackEventCompat;)V
    .locals 3
    .param p1    # Landroidx/activity/BackEventCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getProgress()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpg-float v0, v0, v1

    .line 7
    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backHelper:Lcom/google/android/material/motion/MaterialMainContainerBackHelper;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchBar:Lcom/google/android/material/search/SearchBar;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/android/material/search/SearchBar;->getCornerSize()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->updateBackProgress(Landroidx/activity/BackEventCompat;Landroid/view/View;F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 23
    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->isAdjustNothingSoftInputMode()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->clearFocusAndHideKeyboard()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->searchView:Lcom/google/android/material/search/SearchView;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/google/android/material/search/SearchView;->isAnimatedNavigationIcon()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    const/4 p1, 0x0

    .line 49
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchViewAnimationHelper;->getButtonsProgressAnimator(Z)Landroid/animation/AnimatorSet;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->pause()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getProgress()F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object v1, p0, Lcom/google/android/material/search/SearchViewAnimationHelper;->backProgressAnimatorSet:Landroid/animation/AnimatorSet;

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->getDuration()J

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    long-to-float v1, v1

    .line 75
    mul-float/2addr p1, v1

    .line 76
    float-to-long v1, p1

    .line 77
    invoke-static {v0, v1, v2}, Landroidx/transition/c;->a(Landroid/animation/AnimatorSet;J)V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method
