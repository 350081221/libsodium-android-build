.class public Landroidx/constraintlayout/core/motion/utils/Oscillator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BOUNCE:I = 0x6

.field public static final COS_WAVE:I = 0x5

.field public static final CUSTOM:I = 0x7

.field public static final REVERSE_SAW_WAVE:I = 0x4

.field public static final SAW_WAVE:I = 0x3

.field public static final SIN_WAVE:I = 0x0

.field public static final SQUARE_WAVE:I = 0x1

.field public static TAG:Ljava/lang/String; = "Oscillator"

.field public static final TRIANGLE_WAVE:I = 0x2


# instance fields
.field PI2:D

.field mArea:[D

.field mCustomCurve:Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;

.field mCustomType:Ljava/lang/String;

.field private mNormalized:Z

.field mPeriod:[F

.field mPosition:[D

.field mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [F

    .line 6
    .line 7
    iput-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 8
    .line 9
    new-array v1, v0, [D

    .line 10
    .line 11
    iput-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 12
    .line 13
    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->PI2:D

    .line 19
    .line 20
    iput-boolean v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mNormalized:Z

    .line 21
    .line 22
    return-void
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
.end method


# virtual methods
.method public addPoint(DF)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 7
    .line 8
    invoke-static {v1, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    neg-int v1, v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 18
    .line 19
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 26
    .line 27
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 32
    .line 33
    new-array v2, v0, [D

    .line 34
    .line 35
    iput-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mArea:[D

    .line 36
    .line 37
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 38
    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    sub-int/2addr v0, v1

    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    invoke-static {v2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 48
    .line 49
    aput-wide p1, v0, v1

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 52
    .line 53
    aput p3, p1, v1

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mNormalized:Z

    .line 57
    .line 58
    return-void
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

.method getDP(D)D
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p1, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    const-wide p1, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    cmpl-double v2, p1, v2

    .line 16
    .line 17
    if-ltz v2, :cond_1

    .line 18
    .line 19
    const-wide p1, 0x3feffffde7210be9L    # 0.999999

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 25
    .line 26
    invoke-static {v2, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-lez v2, :cond_2

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    if-eqz v2, :cond_3

    .line 34
    .line 35
    neg-int v0, v2

    .line 36
    add-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 39
    .line 40
    aget v2, v1, v0

    .line 41
    .line 42
    add-int/lit8 v3, v0, -0x1

    .line 43
    .line 44
    aget v1, v1, v3

    .line 45
    .line 46
    sub-float/2addr v2, v1

    .line 47
    float-to-double v4, v2

    .line 48
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 49
    .line 50
    aget-wide v6, v2, v0

    .line 51
    .line 52
    aget-wide v8, v2, v3

    .line 53
    .line 54
    sub-double/2addr v6, v8

    .line 55
    div-double/2addr v4, v6

    .line 56
    mul-double/2addr p1, v4

    .line 57
    float-to-double v0, v1

    .line 58
    mul-double/2addr v4, v8

    .line 59
    sub-double/2addr v0, v4

    .line 60
    add-double/2addr v0, p1

    .line 61
    :cond_3
    return-wide v0
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

.method getP(D)D
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p1, v0

    .line 4
    .line 5
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    move-wide p1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    cmpl-double v2, p1, v3

    .line 12
    .line 13
    if-lez v2, :cond_1

    .line 14
    .line 15
    move-wide p1, v3

    .line 16
    :cond_1
    :goto_0
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 17
    .line 18
    invoke-static {v2, p1, p2}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-lez v2, :cond_2

    .line 23
    .line 24
    move-wide v0, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    if-eqz v2, :cond_3

    .line 27
    .line 28
    neg-int v0, v2

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 32
    .line 33
    aget v2, v1, v0

    .line 34
    .line 35
    add-int/lit8 v3, v0, -0x1

    .line 36
    .line 37
    aget v1, v1, v3

    .line 38
    .line 39
    sub-float/2addr v2, v1

    .line 40
    float-to-double v4, v2

    .line 41
    iget-object v2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 42
    .line 43
    aget-wide v6, v2, v0

    .line 44
    .line 45
    aget-wide v8, v2, v3

    .line 46
    .line 47
    sub-double/2addr v6, v8

    .line 48
    div-double/2addr v4, v6

    .line 49
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mArea:[D

    .line 50
    .line 51
    aget-wide v2, v0, v3

    .line 52
    .line 53
    float-to-double v0, v1

    .line 54
    mul-double v6, v4, v8

    .line 55
    .line 56
    sub-double/2addr v0, v6

    .line 57
    sub-double v6, p1, v8

    .line 58
    .line 59
    mul-double/2addr v0, v6

    .line 60
    add-double/2addr v2, v0

    .line 61
    mul-double/2addr p1, p1

    .line 62
    mul-double/2addr v8, v8

    .line 63
    sub-double/2addr p1, v8

    .line 64
    mul-double/2addr v4, p1

    .line 65
    const-wide/high16 p1, 0x4000000000000000L    # 2.0

    .line 66
    .line 67
    div-double/2addr v4, p1

    .line 68
    add-double v0, v2, v4

    .line 69
    .line 70
    :cond_3
    :goto_1
    return-wide v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public getSlope(DDD)D
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/motion/utils/Oscillator;->getP(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-double/2addr p3, v0

    .line 6
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/motion/utils/Oscillator;->getDP(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    add-double/2addr p1, p5

    .line 11
    iget p5, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mType:I

    .line 12
    .line 13
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 14
    .line 15
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 16
    .line 17
    packed-switch p5, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-wide p5, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->PI2:D

    .line 21
    .line 22
    mul-double/2addr p1, p5

    .line 23
    mul-double/2addr p5, p3

    .line 24
    invoke-static {p5, p6}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    mul-double/2addr p1, p3

    .line 29
    return-wide p1

    .line 30
    :pswitch_0
    iget-object p1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mCustomCurve:Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;

    .line 31
    .line 32
    const-wide/high16 p5, 0x3ff0000000000000L    # 1.0

    .line 33
    .line 34
    rem-double/2addr p3, p5

    .line 35
    const/4 p2, 0x0

    .line 36
    invoke-virtual {p1, p3, p4, p2}, Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;->getSlope(DI)D

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1

    .line 41
    :pswitch_1
    mul-double/2addr p1, v2

    .line 42
    mul-double/2addr p3, v2

    .line 43
    add-double/2addr p3, v0

    .line 44
    rem-double/2addr p3, v2

    .line 45
    sub-double/2addr p3, v0

    .line 46
    mul-double/2addr p1, p3

    .line 47
    return-wide p1

    .line 48
    :pswitch_2
    iget-wide p5, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->PI2:D

    .line 49
    .line 50
    neg-double v0, p5

    .line 51
    mul-double/2addr v0, p1

    .line 52
    mul-double/2addr p5, p3

    .line 53
    invoke-static {p5, p6}, Ljava/lang/Math;->sin(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    mul-double/2addr v0, p1

    .line 58
    return-wide v0

    .line 59
    :pswitch_3
    neg-double p1, p1

    .line 60
    mul-double/2addr p1, v0

    .line 61
    return-wide p1

    .line 62
    :pswitch_4
    mul-double/2addr p1, v0

    .line 63
    return-wide p1

    .line 64
    :pswitch_5
    mul-double/2addr p1, v2

    .line 65
    mul-double/2addr p3, v2

    .line 66
    const-wide/high16 p5, 0x4008000000000000L    # 3.0

    .line 67
    .line 68
    add-double/2addr p3, p5

    .line 69
    rem-double/2addr p3, v2

    .line 70
    sub-double/2addr p3, v0

    .line 71
    invoke-static {p3, p4}, Ljava/lang/Math;->signum(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide p3

    .line 75
    mul-double/2addr p1, p3

    .line 76
    return-wide p1

    .line 77
    :pswitch_6
    const-wide/16 p1, 0x0

    .line 78
    .line 79
    return-wide p1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public getValue(DD)D
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/core/motion/utils/Oscillator;->getP(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    add-double/2addr p1, p3

    .line 6
    iget v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mType:I

    .line 7
    .line 8
    const-wide/high16 v1, 0x4010000000000000L    # 4.0

    .line 9
    .line 10
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 11
    .line 12
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-wide p3, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->PI2:D

    .line 18
    .line 19
    mul-double/2addr p3, p1

    .line 20
    invoke-static {p3, p4}, Ljava/lang/Math;->sin(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    return-wide p1

    .line 25
    :pswitch_0
    iget-object p3, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mCustomCurve:Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;

    .line 26
    .line 27
    rem-double/2addr p1, v5

    .line 28
    const/4 p4, 0x0

    .line 29
    invoke-virtual {p3, p1, p2, p4}, Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;->getPos(DI)D

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :pswitch_1
    mul-double/2addr p1, v1

    .line 35
    rem-double/2addr p1, v1

    .line 36
    sub-double/2addr p1, v3

    .line 37
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    sub-double p1, v5, p1

    .line 42
    .line 43
    mul-double/2addr p1, p1

    .line 44
    :goto_0
    sub-double/2addr v5, p1

    .line 45
    return-wide v5

    .line 46
    :pswitch_2
    iget-wide v0, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->PI2:D

    .line 47
    .line 48
    add-double/2addr p3, p1

    .line 49
    mul-double/2addr v0, p3

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    return-wide p1

    .line 55
    :pswitch_3
    mul-double/2addr p1, v3

    .line 56
    add-double/2addr p1, v5

    .line 57
    rem-double/2addr p1, v3

    .line 58
    goto :goto_0

    .line 59
    :pswitch_4
    mul-double/2addr p1, v3

    .line 60
    add-double/2addr p1, v5

    .line 61
    rem-double/2addr p1, v3

    .line 62
    sub-double/2addr p1, v5

    .line 63
    return-wide p1

    .line 64
    :pswitch_5
    mul-double/2addr p1, v1

    .line 65
    add-double/2addr p1, v5

    .line 66
    rem-double/2addr p1, v1

    .line 67
    sub-double/2addr p1, v3

    .line 68
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    goto :goto_0

    .line 73
    :pswitch_6
    const-wide/high16 p3, 0x3fe0000000000000L    # 0.5

    .line 74
    .line 75
    rem-double/2addr p1, v5

    .line 76
    sub-double/2addr p3, p1

    .line 77
    invoke-static {p3, p4}, Ljava/lang/Math;->signum(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    return-wide p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public normalize()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-wide v5, v1

    .line 7
    move v4, v3

    .line 8
    :goto_0
    iget-object v7, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 9
    .line 10
    array-length v8, v7

    .line 11
    if-ge v4, v8, :cond_0

    .line 12
    .line 13
    aget v7, v7, v4

    .line 14
    .line 15
    float-to-double v7, v7

    .line 16
    add-double/2addr v5, v7

    .line 17
    add-int/lit8 v4, v4, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v4, 0x1

    .line 21
    move-wide v8, v1

    .line 22
    move v7, v4

    .line 23
    :goto_1
    iget-object v10, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 24
    .line 25
    array-length v11, v10

    .line 26
    const/high16 v12, 0x40000000    # 2.0f

    .line 27
    .line 28
    if-ge v7, v11, :cond_1

    .line 29
    .line 30
    add-int/lit8 v11, v7, -0x1

    .line 31
    .line 32
    aget v13, v10, v11

    .line 33
    .line 34
    aget v10, v10, v7

    .line 35
    .line 36
    add-float/2addr v13, v10

    .line 37
    div-float/2addr v13, v12

    .line 38
    iget-object v10, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 39
    .line 40
    aget-wide v14, v10, v7

    .line 41
    .line 42
    aget-wide v11, v10, v11

    .line 43
    .line 44
    sub-double/2addr v14, v11

    .line 45
    float-to-double v10, v13

    .line 46
    mul-double/2addr v14, v10

    .line 47
    add-double/2addr v8, v14

    .line 48
    add-int/lit8 v7, v7, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v7, v3

    .line 52
    :goto_2
    iget-object v10, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 53
    .line 54
    array-length v11, v10

    .line 55
    if-ge v7, v11, :cond_2

    .line 56
    .line 57
    aget v11, v10, v7

    .line 58
    .line 59
    float-to-double v13, v11

    .line 60
    div-double v15, v5, v8

    .line 61
    .line 62
    mul-double/2addr v13, v15

    .line 63
    double-to-float v11, v13

    .line 64
    aput v11, v10, v7

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v5, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mArea:[D

    .line 70
    .line 71
    aput-wide v1, v5, v3

    .line 72
    .line 73
    move v1, v4

    .line 74
    :goto_3
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    .line 75
    .line 76
    array-length v3, v2

    .line 77
    if-ge v1, v3, :cond_3

    .line 78
    .line 79
    add-int/lit8 v3, v1, -0x1

    .line 80
    .line 81
    aget v5, v2, v3

    .line 82
    .line 83
    aget v2, v2, v1

    .line 84
    .line 85
    add-float/2addr v5, v2

    .line 86
    div-float/2addr v5, v12

    .line 87
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    .line 88
    .line 89
    aget-wide v6, v2, v1

    .line 90
    .line 91
    aget-wide v8, v2, v3

    .line 92
    .line 93
    sub-double/2addr v6, v8

    .line 94
    iget-object v2, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mArea:[D

    .line 95
    .line 96
    aget-wide v8, v2, v3

    .line 97
    .line 98
    float-to-double v10, v5

    .line 99
    mul-double/2addr v6, v10

    .line 100
    add-double/2addr v8, v6

    .line 101
    aput-wide v8, v2, v1

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    iput-boolean v4, v0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mNormalized:Z

    .line 107
    .line 108
    return-void
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
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
.end method

.method public setType(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mType:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mCustomType:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;->buildWave(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mCustomCurve:Landroidx/constraintlayout/core/motion/utils/MonotonicCurveFit;

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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pos ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPosition:[D

    invoke-static {v1}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " period="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/constraintlayout/core/motion/utils/Oscillator;->mPeriod:[F

    invoke-static {v1}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
