.class public final Lcom/google/android/material/progressindicator/DeterminateDrawable;
.super Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;",
        ">",
        "Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;"
    }
.end annotation


# static fields
.field static final GAP_RAMP_DOWN_THRESHOLD:F = 0.01f

.field private static final INDICATOR_LENGTH_IN_LEVEL:Landroidx/dynamicanimation/animation/FloatPropertyCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/dynamicanimation/animation/FloatPropertyCompat<",
            "Lcom/google/android/material/progressindicator/DeterminateDrawable<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final MAX_DRAWABLE_LEVEL:I = 0x2710

.field private static final SPRING_FORCE_STIFFNESS:F = 50.0f


# instance fields
.field private final activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

.field private drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/progressindicator/DrawingDelegate<",
            "TS;>;"
        }
    .end annotation
.end field

.field private skipAnimationOnLevelChange:Z

.field private final springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

.field private final springForce:Landroidx/dynamicanimation/animation/SpringForce;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/material/progressindicator/DeterminateDrawable$1;

    const-string v1, "indicatorLevel"

    invoke-direct {v0, v1}, Lcom/google/android/material/progressindicator/DeterminateDrawable$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->INDICATOR_LENGTH_IN_LEVEL:Landroidx/dynamicanimation/animation/FloatPropertyCompat;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;Lcom/google/android/material/progressindicator/DrawingDelegate;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/material/progressindicator/DrawingDelegate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;",
            "Lcom/google/android/material/progressindicator/DrawingDelegate<",
            "TS;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->skipAnimationOnLevelChange:Z

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->setDrawingDelegate(Lcom/google/android/material/progressindicator/DrawingDelegate;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 16
    .line 17
    new-instance p1, Landroidx/dynamicanimation/animation/SpringForce;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/dynamicanimation/animation/SpringForce;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springForce:Landroidx/dynamicanimation/animation/SpringForce;

    .line 23
    .line 24
    const/high16 p2, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 27
    .line 28
    .line 29
    const/high16 p3, 0x42480000    # 50.0f

    .line 30
    .line 31
    invoke-virtual {p1, p3}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 32
    .line 33
    .line 34
    new-instance p3, Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 35
    .line 36
    sget-object v0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->INDICATOR_LENGTH_IN_LEVEL:Landroidx/dynamicanimation/animation/FloatPropertyCompat;

    .line 37
    .line 38
    invoke-direct {p3, p0, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 42
    .line 43
    invoke-virtual {p3, p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->setSpring(Landroidx/dynamicanimation/animation/SpringForce;)Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setGrowFraction(F)V

    .line 47
    .line 48
    .line 49
    return-void
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
.end method

.method static synthetic access$000(Lcom/google/android/material/progressindicator/DeterminateDrawable;)F
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getIndicatorFraction()F

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/google/android/material/progressindicator/DeterminateDrawable;F)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->setIndicatorFraction(F)V

    return-void
.end method

.method public static createCircularDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)Lcom/google/android/material/progressindicator/DeterminateDrawable;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ")",
            "Lcom/google/android/material/progressindicator/DeterminateDrawable<",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/material/progressindicator/CircularDrawingDelegate;

    invoke-direct {v0, p1}, Lcom/google/android/material/progressindicator/CircularDrawingDelegate;-><init>(Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;)V

    invoke-static {p0, p1, v0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->createCircularDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;Lcom/google/android/material/progressindicator/CircularDrawingDelegate;)Lcom/google/android/material/progressindicator/DeterminateDrawable;

    move-result-object p0

    return-object p0
.end method

.method static createCircularDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;Lcom/google/android/material/progressindicator/CircularDrawingDelegate;)Lcom/google/android/material/progressindicator/DeterminateDrawable;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/progressindicator/CircularDrawingDelegate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            "Lcom/google/android/material/progressindicator/CircularDrawingDelegate;",
            ")",
            "Lcom/google/android/material/progressindicator/DeterminateDrawable<",
            "Lcom/google/android/material/progressindicator/CircularProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/material/progressindicator/DeterminateDrawable;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/material/progressindicator/DeterminateDrawable;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;Lcom/google/android/material/progressindicator/DrawingDelegate;)V

    return-object v0
.end method

.method public static createLinearDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)Lcom/google/android/material/progressindicator/DeterminateDrawable;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ")",
            "Lcom/google/android/material/progressindicator/DeterminateDrawable<",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;

    invoke-direct {v0, p1}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;-><init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V

    invoke-static {p0, p1, v0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->createLinearDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;Lcom/google/android/material/progressindicator/LinearDrawingDelegate;)Lcom/google/android/material/progressindicator/DeterminateDrawable;

    move-result-object p0

    return-object p0
.end method

.method static createLinearDrawable(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;Lcom/google/android/material/progressindicator/LinearDrawingDelegate;)Lcom/google/android/material/progressindicator/DeterminateDrawable;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/progressindicator/LinearDrawingDelegate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            "Lcom/google/android/material/progressindicator/LinearDrawingDelegate;",
            ")",
            "Lcom/google/android/material/progressindicator/DeterminateDrawable<",
            "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/google/android/material/progressindicator/DeterminateDrawable;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/material/progressindicator/DeterminateDrawable;-><init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;Lcom/google/android/material/progressindicator/DrawingDelegate;)V

    return-object v0
.end method

.method private getIndicatorFraction()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    iget v0, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    return v0
.end method

.method private setIndicatorFraction(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 2
    .line 3
    iput p1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
.end method


# virtual methods
.method public addSpringAnimationEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)V
    .locals 1
    .param p1    # Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    invoke-virtual {v0, p1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    return-void
.end method

.method public bridge synthetic clearAnimationCallbacks()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->clearAnimationCallbacks()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->getGrowFraction()F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->isShowing()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->isHiding()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    move-object v1, p1

    .line 52
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/progressindicator/DrawingDelegate;->validateSpecAndAdjustCanvas(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 56
    .line 57
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 69
    .line 70
    iget-object v1, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 71
    .line 72
    iget-object v2, v1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    aget v2, v2, v8

    .line 76
    .line 77
    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 78
    .line 79
    iget v0, v1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorTrackGapSize:I

    .line 80
    .line 81
    if-lez v0, :cond_2

    .line 82
    .line 83
    iget-object v1, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 84
    .line 85
    instance-of v1, v1, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    int-to-float v0, v0

    .line 91
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getIndicatorFraction()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/4 v2, 0x0

    .line 96
    const v3, 0x3c23d70a    # 0.01f

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2, v3}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    mul-float/2addr v0, v1

    .line 104
    div-float/2addr v0, v3

    .line 105
    float-to-int v0, v0

    .line 106
    :goto_0
    move v7, v0

    .line 107
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 108
    .line 109
    iget-object v2, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 110
    .line 111
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getIndicatorFraction()F

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    const/high16 v4, 0x3f800000    # 1.0f

    .line 116
    .line 117
    iget-object v1, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 118
    .line 119
    iget v5, v1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackColor:I

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getAlpha()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    move-object v1, p1

    .line 126
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/progressindicator/DrawingDelegate;->fillTrack(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 131
    .line 132
    iget-object v2, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    const/high16 v4, 0x3f800000    # 1.0f

    .line 136
    .line 137
    iget v5, v1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackColor:I

    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getAlpha()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v7, 0x0

    .line 144
    move-object v1, p1

    .line 145
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/progressindicator/DrawingDelegate;->fillTrack(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 146
    .line 147
    .line 148
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 149
    .line 150
    iget-object v1, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 151
    .line 152
    iget-object v2, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->activeIndicator:Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getAlpha()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/google/android/material/progressindicator/DrawingDelegate;->fillIndicator(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    .line 162
    .line 163
    iget-object v1, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->paint:Landroid/graphics/Paint;

    .line 164
    .line 165
    iget-object v2, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 166
    .line 167
    iget-object v2, v2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 168
    .line 169
    aget v2, v2, v8

    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getAlpha()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/google/android/material/progressindicator/DrawingDelegate;->drawStopIndicator(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 179
    .line 180
    .line 181
    :cond_3
    :goto_2
    return-void
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

.method public bridge synthetic getAlpha()I
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->getAlpha()I

    move-result v0

    return v0
.end method

.method getDrawingDelegate()Lcom/google/android/material/progressindicator/DrawingDelegate;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/progressindicator/DrawingDelegate<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/DrawingDelegate;->getPreferredHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    invoke-virtual {v0}, Lcom/google/android/material/progressindicator/DrawingDelegate;->getPreferredWidth()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic hideNow()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->hideNow()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isHiding()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->isHiding()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->isRunning()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isShowing()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->isShowing()Z

    move-result v0

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->skipToEnd()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    invoke-direct {p0, v0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->setIndicatorFraction(F)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method protected onLevelChange(I)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->skipAnimationOnLevelChange:Z

    .line 2
    .line 3
    const v1, 0x461c4000    # 10000.0f

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->skipToEnd()V

    .line 11
    .line 12
    .line 13
    int-to-float p1, p1

    .line 14
    div-float/2addr p1, v1

    .line 15
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->setIndicatorFraction(F)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/DeterminateDrawable;->getIndicatorFraction()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    mul-float/2addr v2, v1

    .line 26
    invoke-virtual {v0, v2}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setStartValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 30
    .line 31
    int-to-float p1, p1

    .line 32
    invoke-virtual {v0, p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 33
    .line 34
    .line 35
    :goto_0
    const/4 p1, 0x1

    .line 36
    return p1
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

.method public bridge synthetic registerAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V
    .locals 0
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->registerAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V

    return-void
.end method

.method public removeSpringAnimationEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)V
    .locals 1
    .param p1    # Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    invoke-virtual {v0, p1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->removeEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)V

    return-void
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0xffL
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0
    .param p1    # Landroid/graphics/ColorFilter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method setDrawingDelegate(Lcom/google/android/material/progressindicator/DrawingDelegate;)V
    .locals 0
    .param p1    # Lcom/google/android/material/progressindicator/DrawingDelegate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/progressindicator/DrawingDelegate<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->drawingDelegate:Lcom/google/android/material/progressindicator/DrawingDelegate;

    return-void
.end method

.method setLevelByFraction(F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setVisible(ZZZ)Z
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setVisible(ZZZ)Z

    move-result p1

    return p1
.end method

.method setVisibleInternal(ZZZ)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->setVisibleInternal(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->animatorDurationScaleProvider:Lcom/google/android/material/progressindicator/AnimatorDurationScaleProvider;

    .line 6
    .line 7
    iget-object p3, p0, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->context:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2, p3}, Lcom/google/android/material/progressindicator/AnimatorDurationScaleProvider;->getSystemAnimatorDurationScale(Landroid/content/ContentResolver;)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 p3, 0x0

    .line 18
    cmpl-float p3, p2, p3

    .line 19
    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    iput-boolean p2, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->skipAnimationOnLevelChange:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p3, 0x0

    .line 27
    iput-boolean p3, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->skipAnimationOnLevelChange:Z

    .line 28
    .line 29
    iget-object p3, p0, Lcom/google/android/material/progressindicator/DeterminateDrawable;->springForce:Landroidx/dynamicanimation/animation/SpringForce;

    .line 30
    .line 31
    const/high16 v0, 0x42480000    # 50.0f

    .line 32
    .line 33
    div-float/2addr v0, p2

    .line 34
    invoke-virtual {p3, v0}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 35
    .line 36
    .line 37
    :goto_0
    return p1
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
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->stop()V

    return-void
.end method

.method public bridge synthetic unregisterAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)Z
    .locals 0
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/google/android/material/progressindicator/DrawableWithAnimatedVisibilityChange;->unregisterAnimationCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)Z

    move-result p1

    return p1
.end method
