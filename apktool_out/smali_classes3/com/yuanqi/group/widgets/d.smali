.class public Lcom/yuanqi/group/widgets/d;
.super Lcom/yuanqi/group/widgets/i;
.source "SourceFile"


# static fields
.field public static final i:F = 1.0f


# instance fields
.field private h:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/i;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/yuanqi/group/widgets/d;->h:[F

    .line 11
    .line 12
    return-void

    .line 13
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
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
.end method

.method public static synthetic t(Lcom/yuanqi/group/widgets/d;ILandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/d;->u(ILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method private synthetic u(ILandroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/d;->h:[F

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    aput p2, v0, p1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->n()V

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


# virtual methods
.method public d(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->k()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    const/high16 v1, 0x41000000    # 8.0f

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    const/high16 v1, 0x40c00000    # 6.0f

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->k()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    div-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    int-to-float v1, v1

    .line 27
    const/high16 v2, 0x40000000    # 2.0f

    .line 28
    .line 29
    mul-float/2addr v2, v0

    .line 30
    const/high16 v3, 0x40800000    # 4.0f

    .line 31
    .line 32
    add-float v4, v2, v3

    .line 33
    .line 34
    sub-float/2addr v1, v4

    .line 35
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->j()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    div-int/lit8 v4, v4, 0x2

    .line 40
    .line 41
    int-to-float v4, v4

    .line 42
    const/4 v5, 0x0

    .line 43
    :goto_0
    const/4 v6, 0x3

    .line 44
    if-ge v5, v6, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 47
    .line 48
    .line 49
    int-to-float v6, v5

    .line 50
    mul-float v7, v2, v6

    .line 51
    .line 52
    add-float/2addr v7, v1

    .line 53
    mul-float/2addr v6, v3

    .line 54
    add-float/2addr v7, v6

    .line 55
    invoke-virtual {p1, v7, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, Lcom/yuanqi/group/widgets/d;->h:[F

    .line 59
    .line 60
    aget v6, v6, v5

    .line 61
    .line 62
    invoke-virtual {p1, v6, v6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 63
    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-virtual {p1, v6, v6, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-void
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
.end method

.method public m()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/animation/ValueAnimator;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    new-array v2, v1, [I

    .line 8
    .line 9
    fill-array-data v2, :array_0

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v1, :cond_0

    .line 14
    .line 15
    new-array v4, v1, [F

    .line 16
    .line 17
    fill-array-data v4, :array_1

    .line 18
    .line 19
    .line 20
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-wide/16 v5, 0x2ee

    .line 25
    .line 26
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    const/4 v5, -0x1

    .line 30
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 31
    .line 32
    .line 33
    aget v5, v2, v3

    .line 34
    .line 35
    int-to-long v5, v5

    .line 36
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 37
    .line 38
    .line 39
    new-instance v5, Lcom/yuanqi/group/widgets/c;

    .line 40
    .line 41
    invoke-direct {v5, p0, v3}, Lcom/yuanqi/group/widgets/c;-><init>(Lcom/yuanqi/group/widgets/d;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lcom/yuanqi/group/widgets/i;->a(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-object v0

    .line 54
    nop

    .line 55
    :array_0
    .array-data 4
        0x78
        0xf0
        0x168
    .end array-data

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
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3e99999a    # 0.3f
        0x3f800000    # 1.0f
    .end array-data
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
.end method
