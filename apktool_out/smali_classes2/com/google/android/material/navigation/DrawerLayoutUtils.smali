.class public Lcom/google/android/material/navigation/DrawerLayoutUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field private static final DEFAULT_SCRIM_ALPHA:I

.field private static final DEFAULT_SCRIM_COLOR:I = -0x67000000


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, -0x67000000

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    sput v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils;->lambda$getScrimCloseAnimatorUpdateListener$0(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static getScrimCloseAnimatorListener(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/view/View;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Landroidx/drawerlayout/widget/DrawerLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/view/View;)V

    return-object v0
.end method

.method public static getScrimCloseAnimatorUpdateListener(Landroidx/drawerlayout/widget/DrawerLayout;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1
    .param p0    # Landroidx/drawerlayout/widget/DrawerLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/material/navigation/a;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/a;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;)V

    return-object v0
.end method

.method private static synthetic lambda$getScrimCloseAnimatorUpdateListener$0(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    sget v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, v1, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/high16 v0, -0x67000000

    .line 13
    .line 14
    invoke-static {v0, p1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->setScrimColor(I)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method
