.class public Lcom/airbnb/lottie/utils/i;
.super Lcom/airbnb/lottie/utils/c;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field private d:F

.field private e:Z

.field private f:J

.field private g:F

.field private h:F

.field private i:I

.field private j:F

.field private k:F

.field private l:Lcom/airbnb/lottie/k;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field protected m:Z
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private n:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->d:F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->e:Z

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 17
    .line 18
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 19
    .line 20
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->i:I

    .line 21
    .line 22
    const/high16 v1, -0x31000000

    .line 23
    .line 24
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 25
    .line 26
    const/high16 v1, 0x4f000000

    .line 27
    .line 28
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->m:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->n:Z

    .line 33
    .line 34
    return-void
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

.method private E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 7
    .line 8
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 9
    .line 10
    cmpg-float v1, v0, v1

    .line 11
    .line 12
    if-ltz v1, :cond_1

    .line 13
    .line 14
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    new-array v1, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    iget v2, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    aput-object v2, v1, v3

    .line 34
    .line 35
    iget v2, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x1

    .line 42
    aput-object v2, v1, v3

    .line 43
    .line 44
    iget v2, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x2

    .line 51
    aput-object v2, v1, v3

    .line 52
    .line 53
    const-string v2, "Frame must be [%f,%f]. It is %f"

    .line 54
    .line 55
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0
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

.method private l()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const v1, 0x4e6e6b28    # 1.0E9f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->i()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    div-float/2addr v1, v0

    .line 17
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->d:F

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-float/2addr v1, v0

    .line 24
    return v1
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

.method private p()Z
    .locals 2

    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->o()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public A(FF)V
    .locals 3

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, -0x800001

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->r()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {v1}, Lcom/airbnb/lottie/k;->f()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_1
    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/utils/k;->c(FFF)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p2, v0, v1}, Lcom/airbnb/lottie/utils/k;->c(FFF)F

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 38
    .line 39
    cmpl-float v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 44
    .line 45
    cmpl-float v0, p2, v0

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    :cond_2
    iput p1, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 50
    .line 51
    iput p2, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 52
    .line 53
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 54
    .line 55
    invoke-static {v0, p1, p2}, Lcom/airbnb/lottie/utils/k;->c(FFF)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    float-to-int p1, p1

    .line 60
    int-to-float p1, p1

    .line 61
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/utils/i;->y(F)V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    aput-object p1, v1, v2

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    aput-object p2, v1, p1

    .line 83
    .line 84
    const-string p1, "minFrame (%s) must be <= maxFrame (%s)"

    .line 85
    .line 86
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
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
.end method

.method public B(I)V
    .locals 1

    int-to-float p1, p1

    iget v0, p0, Lcom/airbnb/lottie/utils/i;->k:F

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/airbnb/lottie/utils/i;->A(FF)V

    return-void
.end method

.method public C(F)V
    .locals 0

    iput p1, p0, Lcom/airbnb/lottie/utils/i;->d:F

    return-void
.end method

.method public D(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/airbnb/lottie/utils/i;->n:Z

    return-void
.end method

.method a()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/airbnb/lottie/utils/c;->a()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/c;->b(Z)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public cancel()V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->t()V

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

.method public doFrame(J)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 5
    .line 6
    if-eqz v0, :cond_b

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->isRunning()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_0
    const-string v0, "LottieValueAnimator#doFrame"

    .line 17
    .line 18
    invoke-static {v0}, Lcom/airbnb/lottie/f;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v5, v1, v3

    .line 26
    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sub-long v3, p1, v1

    .line 31
    .line 32
    :goto_0
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->l()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    long-to-float v2, v3

    .line 37
    div-float/2addr v2, v1

    .line 38
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 39
    .line 40
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    neg-float v2, v2

    .line 47
    :cond_2
    add-float/2addr v1, v2

    .line 48
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v1, v2, v3}, Lcom/airbnb/lottie/utils/k;->e(FFF)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    xor-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    iget v3, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v1, v4, v5}, Lcom/airbnb/lottie/utils/k;->c(FFF)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 77
    .line 78
    iget-boolean v4, p0, Lcom/airbnb/lottie/utils/i;->n:Z

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    float-to-double v4, v1

    .line 83
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    double-to-float v1, v4

    .line 88
    :cond_3
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 89
    .line 90
    iput-wide p1, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 91
    .line 92
    iget-boolean v1, p0, Lcom/airbnb/lottie/utils/i;->n:Z

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 97
    .line 98
    cmpl-float v1, v1, v3

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    :cond_4
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->g()V

    .line 103
    .line 104
    .line 105
    :cond_5
    if-eqz v2, :cond_a

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/4 v2, -0x1

    .line 112
    if-eq v1, v2, :cond_7

    .line 113
    .line 114
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->i:I

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-lt v1, v2, :cond_7

    .line 121
    .line 122
    iget p1, p0, Lcom/airbnb/lottie/utils/i;->d:F

    .line 123
    .line 124
    const/4 p2, 0x0

    .line 125
    cmpg-float p1, p1, p2

    .line 126
    .line 127
    if-gez p1, :cond_6

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    goto :goto_1

    .line 134
    :cond_6
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    :goto_1
    iput p1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 139
    .line 140
    iput p1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->t()V

    .line 143
    .line 144
    .line 145
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/utils/c;->b(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->d()V

    .line 154
    .line 155
    .line 156
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->i:I

    .line 157
    .line 158
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->i:I

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    const/4 v2, 0x2

    .line 167
    if-ne v1, v2, :cond_8

    .line 168
    .line 169
    iget-boolean v1, p0, Lcom/airbnb/lottie/utils/i;->e:Z

    .line 170
    .line 171
    xor-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    iput-boolean v1, p0, Lcom/airbnb/lottie/utils/i;->e:Z

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->w()V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_8
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    goto :goto_2

    .line 190
    :cond_9
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    :goto_2
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 195
    .line 196
    iput v1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 197
    .line 198
    :goto_3
    iput-wide p1, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 199
    .line 200
    :cond_a
    :goto_4
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->E()V

    .line 201
    .line 202
    .line 203
    invoke-static {v0}, Lcom/airbnb/lottie/f;->c(Ljava/lang/String;)F

    .line 204
    .line 205
    .line 206
    :cond_b
    :goto_5
    return-void
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

.method public getAnimatedFraction()F
    .locals 3
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 18
    .line 19
    sub-float/2addr v0, v1

    .line 20
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    :goto_0
    sub-float/2addr v1, v2

    .line 29
    div-float/2addr v0, v1

    .line 30
    return v0

    .line 31
    :cond_1
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-float/2addr v0, v1

    .line 38
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    goto :goto_0
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

.method public getAnimatedValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->j()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public getDuration()J
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->d()F

    move-result v0

    float-to-long v0, v0

    :goto_0
    return-wide v0
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 3
    .line 4
    const/high16 v0, -0x31000000

    .line 5
    .line 6
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 7
    .line 8
    const/high16 v0, 0x4f000000

    .line 9
    .line 10
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->k:F

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

.method public i()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->t()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/c;->b(Z)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->m:Z

    return v0
.end method

.method public j()F
    .locals 3
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->r()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sub-float/2addr v1, v0

    .line 14
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->f()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/airbnb/lottie/k;->r()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-float/2addr v0, v2

    .line 27
    div-float/2addr v1, v0

    .line 28
    return v1
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

.method public k()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/utils/i;->h:F

    return v0
.end method

.method public m()F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 8
    .line 9
    const/high16 v2, 0x4f000000

    .line 10
    .line 11
    cmpl-float v2, v1, v2

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->f()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :cond_1
    return v1
    .line 20
    .line 21
.end method

.method public n()F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 8
    .line 9
    const/high16 v2, -0x31000000

    .line 10
    .line 11
    cmpl-float v2, v1, v2

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/airbnb/lottie/k;->r()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :cond_1
    return v1
    .line 20
    .line 21
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/utils/i;->d:F

    return v0
.end method

.method public q()V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->t()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->c()V

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

.method public r()V
    .locals 2
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->m:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/c;->f(Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    float-to-int v0, v0

    .line 27
    int-to-float v0, v0

    .line 28
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->y(F)V

    .line 29
    .line 30
    .line 31
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    iput-wide v0, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->i:I

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->s()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method protected s()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->isRunning()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->u(Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public setRepeatMode(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/airbnb/lottie/utils/i;->e:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lcom/airbnb/lottie/utils/i;->e:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->w()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method protected t()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->u(Z)V

    return-void
.end method

.method protected u(Z)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/airbnb/lottie/utils/i;->m:Z

    .line 12
    .line 13
    :cond_0
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

.method public v()V
    .locals 2
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->m:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->s()V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->k()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    cmpl-float v0, v0, v1

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->y(F)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-direct {p0}, Lcom/airbnb/lottie/utils/i;->p()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->k()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    cmpl-float v0, v0, v1

    .line 52
    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->y(F)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->e()V

    .line 63
    .line 64
    .line 65
    return-void
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

.method public w()V
    .locals 1

    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->o()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/utils/i;->C(F)V

    return-void
.end method

.method public x(Lcom/airbnb/lottie/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-object p1, p0, Lcom/airbnb/lottie/utils/i;->l:Lcom/airbnb/lottie/k;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->j:F

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->r()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, Lcom/airbnb/lottie/utils/i;->k:F

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p0, v0, p1}, Lcom/airbnb/lottie/utils/i;->A(FF)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->r()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    float-to-int v0, v0

    .line 41
    int-to-float v0, v0

    .line 42
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    float-to-int p1, p1

    .line 47
    int-to-float p1, p1

    .line 48
    invoke-virtual {p0, v0, p1}, Lcom/airbnb/lottie/utils/i;->A(FF)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iget p1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 55
    .line 56
    iput v0, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 57
    .line 58
    float-to-int p1, p1

    .line 59
    int-to-float p1, p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/utils/i;->y(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->g()V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public y(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->n()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/i;->m()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p1, v0, v1}, Lcom/airbnb/lottie/utils/k;->c(FFF)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lcom/airbnb/lottie/utils/i;->g:F

    .line 21
    .line 22
    iget-boolean v0, p0, Lcom/airbnb/lottie/utils/i;->n:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    float-to-double v0, p1

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    double-to-float p1, v0

    .line 32
    :cond_1
    iput p1, p0, Lcom/airbnb/lottie/utils/i;->h:F

    .line 33
    .line 34
    const-wide/16 v0, 0x0

    .line 35
    .line 36
    iput-wide v0, p0, Lcom/airbnb/lottie/utils/i;->f:J

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/airbnb/lottie/utils/c;->g()V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public z(F)V
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/utils/i;->j:F

    invoke-virtual {p0, v0, p1}, Lcom/airbnb/lottie/utils/i;->A(FF)V

    return-void
.end method
