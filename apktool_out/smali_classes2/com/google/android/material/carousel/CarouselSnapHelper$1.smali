.class Lcom/google/android/material/carousel/CarouselSnapHelper$1;
.super Landroidx/recyclerview/widget/LinearSmoothScroller;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/carousel/CarouselSnapHelper;->createScroller(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

.field final synthetic val$layoutManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;


# direct methods
.method constructor <init>(Lcom/google/android/material/carousel/CarouselSnapHelper;Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->val$layoutManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearSmoothScroller;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->val$layoutManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 10
    .line 11
    int-to-float p1, p1

    .line 12
    const/high16 v0, 0x42480000    # 50.0f

    .line 13
    .line 14
    :goto_0
    div-float/2addr v0, p1

    .line 15
    return v0

    .line 16
    :cond_0
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 17
    .line 18
    int-to-float p1, p1

    .line 19
    const/high16 v0, 0x42c80000    # 100.0f

    .line 20
    .line 21
    goto :goto_0
    .line 22
    .line 23
    .line 24
.end method

.method protected onTargetFound(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$State;Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$000(Lcom/google/android/material/carousel/CarouselSnapHelper;)Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    .line 10
    .line 11
    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$000(Lcom/google/android/material/carousel/CarouselSnapHelper;)Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p2, v0, p1, v1}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$100(Lcom/google/android/material/carousel/CarouselSnapHelper;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Landroid/view/View;Z)[I

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 p2, 0x0

    .line 25
    aget p2, p1, p2

    .line 26
    .line 27
    aget p1, p1, v1

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearSmoothScroller;->calculateTimeForDeceleration(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-lez v0, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearSmoothScroller;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 48
    .line 49
    invoke-virtual {p3, p2, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;->update(IIILandroid/view/animation/Interpolator;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
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
