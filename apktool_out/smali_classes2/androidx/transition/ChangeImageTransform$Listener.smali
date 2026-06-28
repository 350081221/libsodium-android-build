.class Landroidx/transition/ChangeImageTransform$Listener;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$TransitionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Listener"
.end annotation


# instance fields
.field private final mEndMatrix:Landroid/graphics/Matrix;

.field private final mImageView:Landroid/widget/ImageView;

.field private mIsBeforeAnimator:Z

.field private final mStartMatrix:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/transition/ChangeImageTransform$Listener;->mStartMatrix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object p3, p0, Landroidx/transition/ChangeImageTransform$Listener;->mEndMatrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    return-void
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
.end method

.method private restoreMatrix()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 2
    .line 3
    sget v1, Landroidx/transition/R$id;->transition_image_transform:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/graphics/Matrix;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-static {v2, v0}, Landroidx/transition/ImageViewUtils;->animateTransform(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
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
.end method

.method private saveMatrix(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 2
    .line 3
    sget v1, Landroidx/transition/R$id;->transition_image_transform:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mImageView:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$Listener;->mEndMatrix:Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-static {p1, v0}, Landroidx/transition/ImageViewUtils;->animateTransform(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    .line 13
    .line 14
    .line 15
    return-void
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
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-boolean p2, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/transition/ChangeImageTransform$Listener;->saveMatrix(Landroid/graphics/Matrix;)V

    .line 10
    .line 11
    .line 12
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
    .line 22
    .line 23
    .line 24
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 0

    invoke-direct {p0}, Landroidx/transition/ChangeImageTransform$Listener;->restoreMatrix()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    return-void
.end method

.method public onTransitionCancel(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onTransitionPause(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-boolean p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mIsBeforeAnimator:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/transition/ChangeImageTransform$Listener;->mStartMatrix:Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/transition/ChangeImageTransform$Listener;->saveMatrix(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public onTransitionResume(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/transition/ChangeImageTransform$Listener;->restoreMatrix()V

    return-void
.end method

.method public onTransitionStart(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method
