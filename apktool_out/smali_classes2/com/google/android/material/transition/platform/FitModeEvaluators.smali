.class Lcom/google/android/material/transition/platform/FitModeEvaluators;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x15
.end annotation


# static fields
.field private static final HEIGHT:Lcom/google/android/material/transition/platform/FitModeEvaluator;

.field private static final WIDTH:Lcom/google/android/material/transition/platform/FitModeEvaluator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/transition/platform/FitModeEvaluators$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/transition/platform/FitModeEvaluators$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->WIDTH:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/material/transition/platform/FitModeEvaluators$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/material/transition/platform/FitModeEvaluators$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->HEIGHT:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static get(IZLandroid/graphics/RectF;Landroid/graphics/RectF;)Lcom/google/android/material/transition/platform/FitModeEvaluator;
    .locals 0

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    if-eq p0, p1, :cond_1

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->HEIGHT:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string p3, "Invalid fit mode: "

    .line 20
    .line 21
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    sget-object p0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->WIDTH:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    invoke-static {p1, p2, p3}, Lcom/google/android/material/transition/platform/FitModeEvaluators;->shouldAutoFitToWidth(ZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    sget-object p0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->WIDTH:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    sget-object p0, Lcom/google/android/material/transition/platform/FitModeEvaluators;->HEIGHT:Lcom/google/android/material/transition/platform/FitModeEvaluator;

    .line 48
    .line 49
    :goto_0
    return-object p0
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

.method private static shouldAutoFitToWidth(ZLandroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    mul-float v2, p2, v0

    .line 18
    .line 19
    div-float/2addr v2, v1

    .line 20
    mul-float/2addr v1, p1

    .line 21
    div-float/2addr v1, v0

    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    cmpl-float p0, v2, p1

    .line 27
    .line 28
    if-ltz p0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    cmpl-float p0, v1, p2

    .line 32
    .line 33
    if-ltz p0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v0, v3

    .line 37
    :goto_0
    return v0
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
