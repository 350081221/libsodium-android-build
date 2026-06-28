.class public Lcom/yuanqi/group/widgets/b;
.super Lcom/yuanqi/group/widgets/i;
.source "SourceFile"


# static fields
.field private static final h:I = 0xff

.field private static final i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/yuanqi/group/widgets/b;->i:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
        0xff
    .end array-data
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/widgets/i;-><init>()V

    return-void
.end method

.method public static synthetic t(Lcom/yuanqi/group/widgets/b;ILandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/b;->u(ILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method private synthetic u(ILandroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/yuanqi/group/widgets/b;->i:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

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
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->k()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x41800000    # 16.0f

    .line 7
    .line 8
    sub-float/2addr v0, v1

    .line 9
    const/high16 v1, 0x40c00000    # 6.0f

    .line 10
    .line 11
    div-float/2addr v0, v1

    .line 12
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->k()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    div-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    int-to-float v1, v1

    .line 19
    const/high16 v2, 0x40000000    # 2.0f

    .line 20
    .line 21
    mul-float/2addr v2, v0

    .line 22
    const/high16 v3, 0x40800000    # 4.0f

    .line 23
    .line 24
    add-float v4, v2, v3

    .line 25
    .line 26
    sub-float/2addr v1, v4

    .line 27
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/i;->k()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    div-int/lit8 v5, v5, 0x2

    .line 32
    .line 33
    int-to-float v5, v5

    .line 34
    sub-float/2addr v5, v4

    .line 35
    const/4 v4, 0x0

    .line 36
    move v6, v4

    .line 37
    :goto_0
    const/4 v7, 0x3

    .line 38
    if-ge v6, v7, :cond_1

    .line 39
    .line 40
    move v8, v4

    .line 41
    :goto_1
    if-ge v8, v7, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 44
    .line 45
    .line 46
    int-to-float v9, v8

    .line 47
    mul-float v10, v2, v9

    .line 48
    .line 49
    add-float/2addr v10, v1

    .line 50
    mul-float/2addr v9, v3

    .line 51
    add-float/2addr v10, v9

    .line 52
    int-to-float v9, v6

    .line 53
    mul-float v11, v2, v9

    .line 54
    .line 55
    add-float/2addr v11, v5

    .line 56
    mul-float/2addr v9, v3

    .line 57
    add-float/2addr v11, v9

    .line 58
    invoke-virtual {p1, v10, v11}, Landroid/graphics/Canvas;->translate(FF)V

    .line 59
    .line 60
    .line 61
    sget-object v9, Lcom/yuanqi/group/widgets/b;->i:[I

    .line 62
    .line 63
    mul-int/lit8 v10, v6, 0x3

    .line 64
    .line 65
    add-int/2addr v10, v8

    .line 66
    aget v9, v9, v10

    .line 67
    .line 68
    invoke-virtual {p2, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 69
    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    invoke-virtual {p1, v9, v9, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    return-void
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
    .locals 8
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
    const/16 v1, 0x9

    .line 7
    .line 8
    new-array v2, v1, [I

    .line 9
    .line 10
    fill-array-data v2, :array_0

    .line 11
    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    fill-array-data v3, :array_1

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v1, :cond_0

    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    new-array v5, v5, [I

    .line 23
    .line 24
    fill-array-data v5, :array_2

    .line 25
    .line 26
    .line 27
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    aget v6, v2, v4

    .line 32
    .line 33
    int-to-long v6, v6

    .line 34
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 39
    .line 40
    .line 41
    aget v6, v3, v4

    .line 42
    .line 43
    int-to-long v6, v6

    .line 44
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lcom/yuanqi/group/widgets/a;

    .line 48
    .line 49
    invoke-direct {v6, p0, v4}, Lcom/yuanqi/group/widgets/a;-><init>(Lcom/yuanqi/group/widgets/b;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v5, v6}, Lcom/yuanqi/group/widgets/i;->a(Landroid/animation/ValueAnimator;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object v0

    .line 62
    nop

    .line 63
    :array_0
    .array-data 4
        0x3c0
        0x3a2
        0x4a6
        0x46a
        0x53c
        0x3ac
        0x4b0
        0x334
        0x4a6
    .end array-data

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
    :array_1
    .array-data 4
        0x168
        0x190
        0x2a8
        0x19a
        0x2c6
        -0x96
        -0x78
        0xa
        0x140
    .end array-data

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
    :array_2
    .array-data 4
        0xff
        0xa8
        0xff
    .end array-data
.end method
