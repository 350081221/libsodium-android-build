.class public Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/percentlayout/widget/PercentLayoutHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PercentLayoutInfo"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public aspectRatio:F

.field public bottomMarginPercent:F

.field public endMarginPercent:F

.field public heightPercent:F

.field public leftMarginPercent:F

.field final mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

.field public rightMarginPercent:F

.field public startMarginPercent:F

.field public topMarginPercent:F

.field public widthPercent:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->widthPercent:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->heightPercent:F

    .line 9
    .line 10
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->leftMarginPercent:F

    .line 11
    .line 12
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->topMarginPercent:F

    .line 13
    .line 14
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->rightMarginPercent:F

    .line 15
    .line 16
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->bottomMarginPercent:F

    .line 17
    .line 18
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->startMarginPercent:F

    .line 19
    .line 20
    iput v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->endMarginPercent:F

    .line 21
    .line 22
    new-instance v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1, v1}, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 29
    .line 30
    return-void
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


# virtual methods
.method public fillLayoutParams(Landroid/view/ViewGroup$LayoutParams;II)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 2
    .line 3
    iget v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4
    .line 5
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 6
    .line 7
    iget v2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 8
    .line 9
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 10
    .line 11
    iget-boolean v3, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsWidthComputedFromAspectRatio:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    const/4 v6, 0x0

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    :cond_0
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->widthPercent:F

    .line 21
    .line 22
    cmpg-float v1, v1, v6

    .line 23
    .line 24
    if-gez v1, :cond_1

    .line 25
    .line 26
    move v1, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_0
    iget-boolean v0, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsHeightComputedFromAspectRatio:Z

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    :cond_2
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->heightPercent:F

    .line 36
    .line 37
    cmpg-float v0, v0, v6

    .line 38
    .line 39
    if-gez v0, :cond_3

    .line 40
    .line 41
    move v4, v5

    .line 42
    :cond_3
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->widthPercent:F

    .line 43
    .line 44
    cmpl-float v2, v0, v6

    .line 45
    .line 46
    if-ltz v2, :cond_4

    .line 47
    .line 48
    int-to-float p2, p2

    .line 49
    mul-float/2addr p2, v0

    .line 50
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 55
    .line 56
    :cond_4
    iget p2, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->heightPercent:F

    .line 57
    .line 58
    cmpl-float v0, p2, v6

    .line 59
    .line 60
    if-ltz v0, :cond_5

    .line 61
    .line 62
    int-to-float p3, p3

    .line 63
    mul-float/2addr p3, p2

    .line 64
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 69
    .line 70
    :cond_5
    iget p2, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->aspectRatio:F

    .line 71
    .line 72
    cmpl-float p3, p2, v6

    .line 73
    .line 74
    if-ltz p3, :cond_7

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    iget p3, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 79
    .line 80
    int-to-float p3, p3

    .line 81
    mul-float/2addr p3, p2

    .line 82
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 87
    .line 88
    iget-object p2, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 89
    .line 90
    iput-boolean v5, p2, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsWidthComputedFromAspectRatio:Z

    .line 91
    .line 92
    :cond_6
    if-eqz v4, :cond_7

    .line 93
    .line 94
    iget p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 95
    .line 96
    int-to-float p2, p2

    .line 97
    iget p3, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->aspectRatio:F

    .line 98
    .line 99
    div-float/2addr p2, p3

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 105
    .line 106
    iget-object p1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 107
    .line 108
    iput-boolean v5, p1, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsHeightComputedFromAspectRatio:Z

    .line 109
    .line 110
    :cond_7
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public fillMarginLayoutParams(Landroid/view/View;Landroid/view/ViewGroup$MarginLayoutParams;II)V
    .locals 3

    .line 2
    invoke-virtual {p0, p2, p3, p4}, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->fillLayoutParams(Landroid/view/ViewGroup$LayoutParams;II)V

    .line 3
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    iget v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 4
    iget v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 5
    iget v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 6
    iget v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 7
    invoke-static {p2}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v1

    .line 8
    invoke-static {v0, v1}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 9
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 10
    invoke-static {p2}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v1

    .line 11
    invoke-static {v0, v1}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 12
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->leftMarginPercent:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_0

    int-to-float v2, p3

    mul-float/2addr v2, v0

    .line 13
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 14
    :cond_0
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->topMarginPercent:F

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_1

    int-to-float v2, p4

    mul-float/2addr v2, v0

    .line 15
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 16
    :cond_1
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->rightMarginPercent:F

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_2

    int-to-float v2, p3

    mul-float/2addr v2, v0

    .line 17
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 18
    :cond_2
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->bottomMarginPercent:F

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_3

    int-to-float p4, p4

    mul-float/2addr p4, v0

    .line 19
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    iput p4, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 20
    :cond_3
    iget p4, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->startMarginPercent:F

    cmpl-float v0, p4, v1

    const/4 v2, 0x1

    if-ltz v0, :cond_4

    int-to-float v0, p3

    mul-float/2addr v0, p4

    .line 21
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p4

    .line 22
    invoke-static {p2, p4}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    move p4, v2

    goto :goto_0

    :cond_4
    const/4 p4, 0x0

    .line 23
    :goto_0
    iget v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->endMarginPercent:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_5

    int-to-float p3, p3

    mul-float/2addr p3, v0

    .line 24
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    .line 25
    invoke-static {p2, p3}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    goto :goto_1

    :cond_5
    move v2, p4

    :goto_1
    if-eqz v2, :cond_6

    if-eqz p1, :cond_6

    .line 26
    invoke-static {p1}, Landroidx/core/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result p1

    .line 27
    invoke-static {p2, p1}, Landroidx/core/view/MarginLayoutParamsCompat;->resolveLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    :cond_6
    return-void
.end method

.method public fillMarginLayoutParams(Landroid/view/ViewGroup$MarginLayoutParams;II)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->fillMarginLayoutParams(Landroid/view/View;Landroid/view/ViewGroup$MarginLayoutParams;II)V

    return-void
.end method

.method public restoreLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsWidthComputedFromAspectRatio:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 8
    .line 9
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 10
    .line 11
    :cond_0
    iget-boolean v1, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsHeightComputedFromAspectRatio:Z

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 16
    .line 17
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsWidthComputedFromAspectRatio:Z

    .line 21
    .line 22
    iput-boolean p1, v0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;->mIsHeightComputedFromAspectRatio:Z

    .line 23
    .line 24
    return-void
.end method

.method public restoreMarginLayoutParams(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->restoreLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 5
    .line 6
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 7
    .line 8
    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 9
    .line 10
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 11
    .line 12
    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 13
    .line 14
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 15
    .line 16
    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 17
    .line 18
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 19
    .line 20
    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 21
    .line 22
    invoke-static {v0}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->mPreservedParams:Landroidx/percentlayout/widget/PercentLayoutHelper$PercentMarginLayoutParams;

    .line 30
    .line 31
    invoke-static {v0}, Landroidx/core/view/MarginLayoutParamsCompat;->getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {p1, v0}, Landroidx/core/view/MarginLayoutParamsCompat;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V

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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->widthPercent:F

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->heightPercent:F

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object v1, v0, v2

    .line 22
    .line 23
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->leftMarginPercent:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x2

    .line 30
    aput-object v1, v0, v2

    .line 31
    .line 32
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->topMarginPercent:F

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x3

    .line 39
    aput-object v1, v0, v2

    .line 40
    .line 41
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->rightMarginPercent:F

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x4

    .line 48
    aput-object v1, v0, v2

    .line 49
    .line 50
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->bottomMarginPercent:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v2, 0x5

    .line 57
    aput-object v1, v0, v2

    .line 58
    .line 59
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->startMarginPercent:F

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v2, 0x6

    .line 66
    aput-object v1, v0, v2

    .line 67
    .line 68
    iget v1, p0, Landroidx/percentlayout/widget/PercentLayoutHelper$PercentLayoutInfo;->endMarginPercent:F

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v2, 0x7

    .line 75
    aput-object v1, v0, v2

    .line 76
    .line 77
    const-string v1, "PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)"

    .line 78
    .line 79
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method
