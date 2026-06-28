.class public final Lcom/google/android/material/color/utilities/Contrast;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field private static final CONTRAST_RATIO_EPSILON:D = 0.04

.field private static final LUMINANCE_GAMUT_MAP_TOLERANCE:D = 0.4

.field public static final RATIO_30:D = 3.0

.field public static final RATIO_45:D = 4.5

.field public static final RATIO_70:D = 7.0

.field public static final RATIO_MAX:D = 21.0

.field public static final RATIO_MIN:D = 1.0


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static darker(DD)D
    .locals 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 6
    .line 7
    if-ltz v2, :cond_4

    .line 8
    .line 9
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 10
    .line 11
    cmpl-double v2, p0, v5

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    const-wide/high16 v7, 0x4014000000000000L    # 5.0

    .line 21
    .line 22
    add-double v9, p0, v7

    .line 23
    .line 24
    div-double/2addr v9, p2

    .line 25
    sub-double/2addr v9, v7

    .line 26
    cmpg-double v2, v9, v0

    .line 27
    .line 28
    if-ltz v2, :cond_4

    .line 29
    .line 30
    cmpl-double v2, v9, v5

    .line 31
    .line 32
    if-lez v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p0, p1, v9, v10}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfYs(DD)D

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    sub-double v7, p0, p2

    .line 40
    .line 41
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    cmpg-double p0, p0, p2

    .line 46
    .line 47
    if-gez p0, :cond_2

    .line 48
    .line 49
    const-wide p0, 0x3fa47ae147ae147bL    # 0.04

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmpl-double p0, v7, p0

    .line 55
    .line 56
    if-lez p0, :cond_2

    .line 57
    .line 58
    return-wide v3

    .line 59
    :cond_2
    invoke-static {v9, v10}, Lcom/google/android/material/color/utilities/ColorUtils;->lstarFromY(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    const-wide p2, 0x3fd999999999999aL    # 0.4

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    sub-double/2addr p0, p2

    .line 69
    cmpg-double p2, p0, v0

    .line 70
    .line 71
    if-ltz p2, :cond_4

    .line 72
    .line 73
    cmpl-double p2, p0, v5

    .line 74
    .line 75
    if-lez p2, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-wide p0

    .line 79
    :cond_4
    :goto_0
    return-wide v3
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

.method public static darkerUnsafe(DD)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/color/utilities/Contrast;->darker(DD)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->max(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
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
.end method

.method public static lighter(DD)D
    .locals 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 6
    .line 7
    if-ltz v2, :cond_4

    .line 8
    .line 9
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 10
    .line 11
    cmpl-double v2, p0, v5

    .line 12
    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    const-wide/high16 v7, 0x4014000000000000L    # 5.0

    .line 21
    .line 22
    add-double v9, p0, v7

    .line 23
    .line 24
    mul-double/2addr v9, p2

    .line 25
    sub-double/2addr v9, v7

    .line 26
    cmpg-double v2, v9, v0

    .line 27
    .line 28
    if-ltz v2, :cond_4

    .line 29
    .line 30
    cmpl-double v2, v9, v5

    .line 31
    .line 32
    if-lez v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {v9, v10, p0, p1}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfYs(DD)D

    .line 36
    .line 37
    .line 38
    move-result-wide p0

    .line 39
    sub-double v7, p0, p2

    .line 40
    .line 41
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    cmpg-double p0, p0, p2

    .line 46
    .line 47
    if-gez p0, :cond_2

    .line 48
    .line 49
    const-wide p0, 0x3fa47ae147ae147bL    # 0.04

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmpl-double p0, v7, p0

    .line 55
    .line 56
    if-lez p0, :cond_2

    .line 57
    .line 58
    return-wide v3

    .line 59
    :cond_2
    invoke-static {v9, v10}, Lcom/google/android/material/color/utilities/ColorUtils;->lstarFromY(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    const-wide p2, 0x3fd999999999999aL    # 0.4

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    add-double/2addr p0, p2

    .line 69
    cmpg-double p2, p0, v0

    .line 70
    .line 71
    if-ltz p2, :cond_4

    .line 72
    .line 73
    cmpl-double p2, p0, v5

    .line 74
    .line 75
    if-lez p2, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-wide p0

    .line 79
    :cond_4
    :goto_0
    return-wide v3
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

.method public static lighterUnsafe(DD)D
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/color/utilities/Contrast;->lighter(DD)D

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmpg-double p2, p0, p2

    if-gez p2, :cond_0

    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    :cond_0
    return-wide p0
.end method

.method public static ratioOfTones(DD)D
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    move-result-wide p0

    invoke-static {p2, p3}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/color/utilities/Contrast;->ratioOfYs(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static ratioOfYs(DD)D
    .locals 3

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    cmpl-double v2, v0, p2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, p2

    :goto_0
    const-wide/high16 p2, 0x4014000000000000L    # 5.0

    add-double/2addr v0, p2

    add-double/2addr p0, p2

    div-double/2addr v0, p0

    return-wide v0
.end method
