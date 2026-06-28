.class public Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:J

.field private g:I

.field private h:I

.field private i:Landroid/graphics/Paint;

.field private final j:Landroid/graphics/PorterDuffXfermode;

.field private k:F

.field private l:Z

.field private m:Z

.field private n:I

.field private o:Z

.field private p:J

.field private q:I

.field private r:F

.field private s:F

.field private t:F

.field private u:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->b(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->b(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p2, 0x3e800000    # 0.25f

    .line 6
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->a:F

    const/high16 p2, 0x3ec00000    # 0.375f

    .line 7
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->b:F

    const p2, 0x3e23d70a    # 0.16f

    .line 8
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->c:F

    const p2, 0x3ea3d70a    # 0.32f

    .line 9
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->d:F

    const/high16 p2, 0x43c80000    # 400.0f

    .line 10
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->e:F

    const-wide/16 p2, 0x11

    .line 11
    iput-wide p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->f:J

    const p2, -0x1d3ab

    .line 12
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->g:I

    const p2, -0xda0b12

    .line 13
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->h:I

    .line 14
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->j:Landroid/graphics/PorterDuffXfermode;

    const/4 p2, 0x0

    .line 15
    iput-boolean p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->l:Z

    .line 16
    iput-boolean p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->m:Z

    .line 17
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->n:I

    .line 18
    iput-boolean p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->o:Z

    const-wide/16 p2, -0x1

    .line 19
    iput-wide p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->p:J

    const/4 p2, -0x1

    .line 20
    iput p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 21
    invoke-direct {p0, p1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->b(Landroid/content/Context;)V

    return-void
.end method

.method private a(F)F
    .locals 4

    float-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    const/high16 v1, 0x40000000    # 2.0f

    if-gez v0, :cond_0

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    return v1

    :cond_0
    mul-float v0, p1, v1

    sub-float/2addr v1, p1

    mul-float/2addr v0, v1

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method private f()Landroid/graphics/Paint;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method private g()V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->p:J

    .line 4
    .line 5
    iget v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/high16 v1, 0x42700000    # 60.0f

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bytedance/tools/d/k;->b(Landroid/content/Context;F)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    float-to-int v0, v0

    .line 20
    invoke-virtual {p0, v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->setProgressBarInfo(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 36
    .line 37
    if-le v1, v0, :cond_1

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->setProgressBarInfo(I)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->f()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 53
    .line 54
    :cond_2
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->m:Z

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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->o:Z

    return v0
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->o:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->l:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->o:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->m:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->k:F

    .line 8
    .line 9
    return-void
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
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->e()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->l:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->m:Z

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    :cond_1
    return-void

    .line 19
    :cond_2
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->l:Z

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/32 v4, 0xf4240

    .line 29
    .line 30
    .line 31
    div-long/2addr v2, v4

    .line 32
    iget-wide v4, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->p:J

    .line 33
    .line 34
    const-wide/16 v6, 0x0

    .line 35
    .line 36
    cmp-long v0, v4, v6

    .line 37
    .line 38
    if-gez v0, :cond_3

    .line 39
    .line 40
    iput-wide v2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->p:J

    .line 41
    .line 42
    :cond_3
    iget-wide v4, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->p:J

    .line 43
    .line 44
    sub-long/2addr v2, v4

    .line 45
    long-to-float v0, v2

    .line 46
    const/high16 v2, 0x43c80000    # 400.0f

    .line 47
    .line 48
    div-float/2addr v0, v2

    .line 49
    iput v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->k:F

    .line 50
    .line 51
    float-to-int v2, v0

    .line 52
    iget v3, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->n:I

    .line 53
    .line 54
    add-int/2addr v3, v2

    .line 55
    const/4 v4, 0x1

    .line 56
    and-int/2addr v3, v4

    .line 57
    if-ne v3, v4, :cond_4

    .line 58
    .line 59
    move v1, v4

    .line 60
    :cond_4
    int-to-float v2, v2

    .line 61
    sub-float/2addr v0, v2

    .line 62
    iput v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->k:F

    .line 63
    .line 64
    :cond_5
    iget v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->k:F

    .line 65
    .line 66
    invoke-direct {p0, v0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->a(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    iget v2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 73
    .line 74
    int-to-float v5, v2

    .line 75
    int-to-float v6, v2

    .line 76
    iget-object v7, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 77
    .line 78
    const/16 v8, 0x1f

    .line 79
    .line 80
    move-object v2, p1

    .line 81
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget v3, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->u:F

    .line 86
    .line 87
    mul-float/2addr v3, v0

    .line 88
    iget v4, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->t:F

    .line 89
    .line 90
    add-float/2addr v3, v4

    .line 91
    float-to-double v4, v0

    .line 92
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 93
    .line 94
    cmpg-double v4, v4, v6

    .line 95
    .line 96
    const/high16 v5, 0x40000000    # 2.0f

    .line 97
    .line 98
    if-gez v4, :cond_6

    .line 99
    .line 100
    mul-float/2addr v0, v5

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    mul-float/2addr v0, v5

    .line 103
    sub-float v0, v5, v0

    .line 104
    .line 105
    :goto_0
    const/high16 v4, 0x3e800000    # 0.25f

    .line 106
    .line 107
    mul-float/2addr v4, v0

    .line 108
    iget v5, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->s:F

    .line 109
    .line 110
    mul-float/2addr v4, v5

    .line 111
    add-float/2addr v4, v5

    .line 112
    iget-object v5, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    iget v6, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->h:I

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    iget v6, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->g:I

    .line 120
    .line 121
    :goto_1
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 122
    .line 123
    .line 124
    iget v5, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->r:F

    .line 125
    .line 126
    iget-object v6, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 127
    .line 128
    invoke-virtual {p1, v3, v5, v4, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    iget v4, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 132
    .line 133
    int-to-float v4, v4

    .line 134
    sub-float/2addr v4, v3

    .line 135
    iget v3, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->s:F

    .line 136
    .line 137
    const/high16 v5, 0x3ec00000    # 0.375f

    .line 138
    .line 139
    mul-float/2addr v0, v5

    .line 140
    mul-float/2addr v0, v3

    .line 141
    sub-float/2addr v3, v0

    .line 142
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 143
    .line 144
    if-eqz v1, :cond_8

    .line 145
    .line 146
    iget v1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->g:I

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    iget v1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->h:I

    .line 150
    .line 151
    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 155
    .line 156
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->j:Landroid/graphics/PorterDuffXfermode;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 159
    .line 160
    .line 161
    iget v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->r:F

    .line 162
    .line 163
    iget-object v1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {p1, v4, v0, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->i:Landroid/graphics/Paint;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 175
    .line 176
    .line 177
    const-wide/16 v0, 0x11

    .line 178
    .line 179
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 180
    .line 181
    .line 182
    return-void
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

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget p2, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 17
    .line 18
    if-le p2, p1, :cond_0

    .line 19
    .line 20
    if-lez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->setProgressBarInfo(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
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

.method public setCycleBias(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->n:I

    return-void
.end method

.method public setProgress(F)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->g()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->k:F

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->o:Z

    .line 12
    .line 13
    iput-boolean p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->l:Z

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setProgressBarInfo(I)V
    .locals 4

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->q:I

    .line 4
    .line 5
    int-to-float v0, p1

    .line 6
    const/high16 v1, 0x40000000    # 2.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    iput v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->r:F

    .line 10
    .line 11
    shr-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    const v2, 0x3ea3d70a    # 0.32f

    .line 15
    .line 16
    .line 17
    mul-float/2addr v0, v2

    .line 18
    iput v0, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->s:F

    .line 19
    .line 20
    const v2, 0x3e23d70a    # 0.16f

    .line 21
    .line 22
    .line 23
    int-to-float v3, p1

    .line 24
    mul-float/2addr v3, v2

    .line 25
    add-float/2addr v3, v0

    .line 26
    iput v3, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->t:F

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    mul-float/2addr v3, v1

    .line 30
    sub-float/2addr p1, v3

    .line 31
    iput p1, p0, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->u:F

    .line 32
    .line 33
    :cond_0
    return-void
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

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->d()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/tools/ui/view/DoubleColorBallAnimationView;->e()V

    .line 11
    .line 12
    .line 13
    :goto_0
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
.end method
