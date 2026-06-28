.class Lcom/google/android/material/transition/MaterialContainerTransform$2;
.super Lcom/google/android/material/transition/TransitionListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/transition/MaterialContainerTransform;->createAnimator(Landroid/view/ViewGroup;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/transition/MaterialContainerTransform;

.field final synthetic val$drawingView:Landroid/view/View;

.field final synthetic val$endView:Landroid/view/View;

.field final synthetic val$startView:Landroid/view/View;

.field final synthetic val$transitionDrawable:Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;


# direct methods
.method constructor <init>(Lcom/google/android/material/transition/MaterialContainerTransform;Landroid/view/View;Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->this$0:Lcom/google/android/material/transition/MaterialContainerTransform;

    iput-object p2, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$drawingView:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$transitionDrawable:Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;

    iput-object p4, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$startView:Landroid/view/View;

    iput-object p5, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$endView:Landroid/view/View;

    invoke-direct {p0}, Lcom/google/android/material/transition/TransitionListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionEnd(Landroidx/transition/Transition;)V
    .locals 1
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->this$0:Lcom/google/android/material/transition/MaterialContainerTransform;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->removeListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->this$0:Lcom/google/android/material/transition/MaterialContainerTransform;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/android/material/transition/MaterialContainerTransform;->access$300(Lcom/google/android/material/transition/MaterialContainerTransform;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$startView:Landroid/view/View;

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$endView:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$drawingView:Landroid/view/View;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/google/android/material/internal/ViewUtils;->getOverlay(Landroid/view/View;)Lcom/google/android/material/internal/ViewOverlayImpl;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$transitionDrawable:Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;

    .line 34
    .line 35
    invoke-interface {p1, v0}, Lcom/google/android/material/internal/ViewOverlayImpl;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public onTransitionStart(Landroidx/transition/Transition;)V
    .locals 1
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$drawingView:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/material/internal/ViewUtils;->getOverlay(Landroid/view/View;)Lcom/google/android/material/internal/ViewOverlayImpl;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$transitionDrawable:Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/google/android/material/internal/ViewOverlayImpl;->add(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$startView:Landroid/view/View;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform$2;->val$endView:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
.end method
