.class Lcom/google/android/material/carousel/CarouselOrientationHelper$2;
.super Lcom/google/android/material/carousel/CarouselOrientationHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/carousel/CarouselOrientationHelper;->createHorizontalHelper(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lcom/google/android/material/carousel/CarouselOrientationHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;


# direct methods
.method constructor <init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/carousel/CarouselOrientationHelper;-><init>(ILcom/google/android/material/carousel/CarouselOrientationHelper$1;)V

    return-void
.end method


# virtual methods
.method public containMaskWithinBounds(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 2
    .line 3
    iget v1, p3, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    cmpg-float v2, v0, v1

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    iget v2, p2, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    cmpl-float v2, v2, v1

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    sub-float/2addr v1, v0

    .line 16
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    add-float/2addr v0, v1

    .line 19
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 20
    .line 21
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    add-float/2addr v0, v1

    .line 24
    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    :cond_0
    iget v0, p2, Landroid/graphics/RectF;->right:F

    .line 27
    .line 28
    iget p3, p3, Landroid/graphics/RectF;->right:F

    .line 29
    .line 30
    cmpl-float v1, v0, p3

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    iget v1, p2, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    cmpg-float v1, v1, p3

    .line 37
    .line 38
    if-gez v1, :cond_1

    .line 39
    .line 40
    sub-float/2addr v0, p3

    .line 41
    iget p3, p1, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    sub-float/2addr p3, v0

    .line 44
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    invoke-static {p3, v1}, Ljava/lang/Math;->max(FF)F

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    iput p3, p1, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    iget p1, p2, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    sub-float/2addr p1, v0

    .line 55
    iget p3, p2, Landroid/graphics/RectF;->left:F

    .line 56
    .line 57
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput p1, p2, Landroid/graphics/RectF;->right:F

    .line 62
    .line 63
    :cond_1
    return-void
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

.method getDecoratedCrossAxisMeasurement(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedMeasuredHeight(Landroid/view/View;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getMaskMargins(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)F
    .locals 1

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p1

    int-to-float p1, v0

    return p1
.end method

.method public getMaskRect(FFFF)Landroid/graphics/RectF;
    .locals 1

    new-instance p3, Landroid/graphics/RectF;

    const/4 v0, 0x0

    sub-float/2addr p2, p4

    invoke-direct {p3, p4, v0, p2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p3
.end method

.method getParentBottom()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method getParentEnd()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getParentLeft()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getParentRight()I

    move-result v0

    :goto_0
    return v0
.end method

.method getParentLeft()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method getParentRight()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getWidth()I

    move-result v0

    return v0
.end method

.method getParentStart()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->isLayoutRtl()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getParentRight()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getParentLeft()I

    move-result v0

    :goto_0
    return v0
.end method

.method getParentTop()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPaddingTop()I

    move-result v0

    return v0
.end method

.method public layoutDecoratedWithMargins(Landroid/view/View;II)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getParentTop()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->getDecoratedCrossAxisMeasurement(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int v5, v3, v0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;->val$carouselLayoutManager:Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    move v2, p2

    .line 15
    move v4, p3

    .line 16
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public moveMaskOnEdgeOutsideBounds(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 4

    .line 1
    iget v0, p2, Landroid/graphics/RectF;->right:F

    .line 2
    .line 3
    iget v1, p3, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    cmpg-float v0, v0, v1

    .line 6
    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 12
    .line 13
    float-to-double v2, v0

    .line 14
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    double-to-float v0, v2

    .line 19
    sub-float/2addr v0, v1

    .line 20
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 21
    .line 22
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    :cond_0
    iget p2, p2, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    iget p3, p3, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    cmpl-float p2, p2, p3

    .line 35
    .line 36
    if-ltz p2, :cond_1

    .line 37
    .line 38
    iget p2, p1, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    float-to-double p2, p2

    .line 41
    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    double-to-float p2, p2

    .line 46
    add-float/2addr p2, v1

    .line 47
    iput p2, p1, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    iget p3, p1, Landroid/graphics/RectF;->right:F

    .line 50
    .line 51
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 56
    .line 57
    :cond_1
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

.method public offsetChild(Landroid/view/View;Landroid/graphics/Rect;FF)V
    .locals 0

    .line 1
    iget p2, p2, Landroid/graphics/Rect;->left:I

    .line 2
    .line 3
    int-to-float p2, p2

    .line 4
    add-float/2addr p2, p3

    .line 5
    sub-float/2addr p4, p2

    .line 6
    float-to-int p2, p4

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 8
    .line 9
    .line 10
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
