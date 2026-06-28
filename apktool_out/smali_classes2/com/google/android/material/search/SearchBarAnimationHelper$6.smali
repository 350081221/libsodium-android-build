.class Lcom/google/android/material/search/SearchBarAnimationHelper$6;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/search/SearchBarAnimationHelper;->getCollapseAnimator(Lcom/google/android/material/search/SearchBar;Landroid/view/View;Lcom/google/android/material/appbar/AppBarLayout;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

.field final synthetic val$searchBar:Lcom/google/android/material/search/SearchBar;


# direct methods
.method constructor <init>(Lcom/google/android/material/search/SearchBarAnimationHelper;Lcom/google/android/material/search/SearchBar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$6;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    iput-object p2, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$6;->val$searchBar:Lcom/google/android/material/search/SearchBar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$6;->val$searchBar:Lcom/google/android/material/search/SearchBar;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$6;->this$0:Lcom/google/android/material/search/SearchBarAnimationHelper;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lcom/google/android/material/search/SearchBarAnimationHelper;->access$302(Lcom/google/android/material/search/SearchBarAnimationHelper;Z)Z

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

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/search/SearchBarAnimationHelper$6;->val$searchBar:Lcom/google/android/material/search/SearchBar;

    invoke-virtual {p1}, Lcom/google/android/material/search/SearchBar;->stopOnLoadAnimation()V

    return-void
.end method
