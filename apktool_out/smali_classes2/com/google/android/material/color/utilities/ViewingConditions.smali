.class public final Lcom/google/android/material/color/utilities/ViewingConditions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;


# instance fields
.field private final aw:D

.field private final c:D

.field private final fl:D

.field private final flRoot:D

.field private final n:D

.field private final nbb:D

.field private final nc:D

.field private final ncb:D

.field private final rgbD:[D

.field private final z:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {v0, v1}, Lcom/google/android/material/color/utilities/ViewingConditions;->defaultWithBackgroundLstar(D)Lcom/google/android/material/color/utilities/ViewingConditions;

    move-result-object v0

    sput-object v0, Lcom/google/android/material/color/utilities/ViewingConditions;->DEFAULT:Lcom/google/android/material/color/utilities/ViewingConditions;

    return-void
.end method

.method private constructor <init>(DDDDDD[DDDD)V
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-wide v1, p1

    .line 6
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->n:D

    .line 7
    .line 8
    move-wide v1, p3

    .line 9
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->aw:D

    .line 10
    .line 11
    move-wide v1, p5

    .line 12
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->nbb:D

    .line 13
    .line 14
    move-wide v1, p7

    .line 15
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->ncb:D

    .line 16
    .line 17
    move-wide v1, p9

    .line 18
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->c:D

    .line 19
    .line 20
    move-wide v1, p11

    .line 21
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->nc:D

    .line 22
    .line 23
    move-object/from16 v1, p13

    .line 24
    .line 25
    iput-object v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->rgbD:[D

    .line 26
    .line 27
    move-wide/from16 v1, p14

    .line 28
    .line 29
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->fl:D

    .line 30
    .line 31
    move-wide/from16 v1, p16

    .line 32
    .line 33
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->flRoot:D

    .line 34
    .line 35
    move-wide/from16 v1, p18

    .line 36
    .line 37
    iput-wide v1, v0, Lcom/google/android/material/color/utilities/ViewingConditions;->z:D

    .line 38
    .line 39
    return-void
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
.end method

.method public static defaultWithBackgroundLstar(D)Lcom/google/android/material/color/utilities/ViewingConditions;
    .locals 8

    .line 1
    invoke-static {}, Lcom/google/android/material/color/utilities/ColorUtils;->whitePointD65()[D

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    .line 6
    .line 7
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide v3, 0x404fd4bbab8b494cL    # 63.66197723675813

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    mul-double/2addr v1, v3

    .line 17
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 18
    .line 19
    div-double/2addr v1, v3

    .line 20
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-wide v3, p0

    .line 24
    invoke-static/range {v0 .. v7}, Lcom/google/android/material/color/utilities/ViewingConditions;->make([DDDDZ)Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.end method

.method public static make([DDDDZ)Lcom/google/android/material/color/utilities/ViewingConditions;
    .locals 43

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    move-wide/from16 v4, p3

    .line 9
    .line 10
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    sget-object v6, Lcom/google/android/material/color/utilities/Cam16;->XYZ_TO_CAM16RGB:[[D

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    aget-wide v8, p0, v7

    .line 18
    .line 19
    aget-object v10, v6, v7

    .line 20
    .line 21
    aget-wide v11, v10, v7

    .line 22
    .line 23
    mul-double/2addr v11, v8

    .line 24
    const/4 v13, 0x1

    .line 25
    aget-wide v14, p0, v13

    .line 26
    .line 27
    aget-wide v16, v10, v13

    .line 28
    .line 29
    mul-double v16, v16, v14

    .line 30
    .line 31
    add-double v11, v11, v16

    .line 32
    .line 33
    const/16 v16, 0x2

    .line 34
    .line 35
    aget-wide v17, p0, v16

    .line 36
    .line 37
    aget-wide v19, v10, v16

    .line 38
    .line 39
    mul-double v19, v19, v17

    .line 40
    .line 41
    add-double v11, v11, v19

    .line 42
    .line 43
    aget-object v10, v6, v13

    .line 44
    .line 45
    aget-wide v19, v10, v7

    .line 46
    .line 47
    mul-double v19, v19, v8

    .line 48
    .line 49
    aget-wide v21, v10, v13

    .line 50
    .line 51
    mul-double v21, v21, v14

    .line 52
    .line 53
    add-double v19, v19, v21

    .line 54
    .line 55
    aget-wide v21, v10, v16

    .line 56
    .line 57
    mul-double v21, v21, v17

    .line 58
    .line 59
    add-double v19, v19, v21

    .line 60
    .line 61
    aget-object v6, v6, v16

    .line 62
    .line 63
    aget-wide v21, v6, v7

    .line 64
    .line 65
    mul-double v8, v8, v21

    .line 66
    .line 67
    aget-wide v21, v6, v13

    .line 68
    .line 69
    mul-double v14, v14, v21

    .line 70
    .line 71
    add-double/2addr v8, v14

    .line 72
    aget-wide v14, v6, v16

    .line 73
    .line 74
    mul-double v17, v17, v14

    .line 75
    .line 76
    add-double v8, v8, v17

    .line 77
    .line 78
    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    .line 79
    .line 80
    div-double v17, p5, v14

    .line 81
    .line 82
    const-wide v21, 0x3fe999999999999aL    # 0.8

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    add-double v34, v17, v21

    .line 88
    .line 89
    const-wide v17, 0x3feccccccccccccdL    # 0.9

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    cmpl-double v6, v34, v17

    .line 95
    .line 96
    if-ltz v6, :cond_0

    .line 97
    .line 98
    const-wide v23, 0x3fe2e147ae147ae1L    # 0.59

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    const-wide v25, 0x3fe6147ae147ae14L    # 0.69

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    sub-double v17, v34, v17

    .line 109
    .line 110
    mul-double v27, v17, v14

    .line 111
    .line 112
    invoke-static/range {v23 .. v28}, Lcom/google/android/material/color/utilities/MathUtils;->lerp(DDD)D

    .line 113
    .line 114
    .line 115
    move-result-wide v14

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const-wide v17, 0x3fe0cccccccccccdL    # 0.525

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    const-wide v23, 0x3fe2e147ae147ae1L    # 0.59

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    sub-double v21, v34, v21

    .line 128
    .line 129
    mul-double v25, v21, v14

    .line 130
    .line 131
    move-wide/from16 v21, v17

    .line 132
    .line 133
    invoke-static/range {v21 .. v26}, Lcom/google/android/material/color/utilities/MathUtils;->lerp(DDD)D

    .line 134
    .line 135
    .line 136
    move-result-wide v14

    .line 137
    :goto_0
    move-wide/from16 v32, v14

    .line 138
    .line 139
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 140
    .line 141
    if-eqz p7, :cond_1

    .line 142
    .line 143
    move-wide/from16 v25, v14

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_1
    neg-double v2, v0

    .line 147
    const-wide/high16 v21, 0x4045000000000000L    # 42.0

    .line 148
    .line 149
    sub-double v2, v2, v21

    .line 150
    .line 151
    const-wide/high16 v21, 0x4057000000000000L    # 92.0

    .line 152
    .line 153
    div-double v2, v2, v21

    .line 154
    .line 155
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    const-wide v21, 0x3fd1c71c71c71c72L    # 0.2777777777777778

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    mul-double v2, v2, v21

    .line 165
    .line 166
    sub-double v2, v14, v2

    .line 167
    .line 168
    mul-double v2, v2, v34

    .line 169
    .line 170
    move-wide/from16 v25, v2

    .line 171
    .line 172
    :goto_1
    const-wide/16 v21, 0x0

    .line 173
    .line 174
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 175
    .line 176
    invoke-static/range {v21 .. v26}, Lcom/google/android/material/color/utilities/MathUtils;->clampDouble(DDD)D

    .line 177
    .line 178
    .line 179
    move-result-wide v2

    .line 180
    const/4 v6, 0x3

    .line 181
    new-array v10, v6, [D

    .line 182
    .line 183
    move-object/from16 v36, v10

    .line 184
    .line 185
    const-wide/high16 v21, 0x4059000000000000L    # 100.0

    .line 186
    .line 187
    div-double v23, v21, v11

    .line 188
    .line 189
    mul-double v23, v23, v2

    .line 190
    .line 191
    add-double v23, v23, v14

    .line 192
    .line 193
    sub-double v23, v23, v2

    .line 194
    .line 195
    aput-wide v23, v10, v7

    .line 196
    .line 197
    div-double v23, v21, v19

    .line 198
    .line 199
    mul-double v23, v23, v2

    .line 200
    .line 201
    add-double v23, v23, v14

    .line 202
    .line 203
    sub-double v23, v23, v2

    .line 204
    .line 205
    aput-wide v23, v10, v13

    .line 206
    .line 207
    div-double v23, v21, v8

    .line 208
    .line 209
    mul-double v23, v23, v2

    .line 210
    .line 211
    add-double v23, v23, v14

    .line 212
    .line 213
    sub-double v23, v23, v2

    .line 214
    .line 215
    aput-wide v23, v10, v16

    .line 216
    .line 217
    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    .line 218
    .line 219
    mul-double/2addr v2, v0

    .line 220
    add-double v23, v2, v14

    .line 221
    .line 222
    div-double v23, v14, v23

    .line 223
    .line 224
    mul-double v25, v23, v23

    .line 225
    .line 226
    mul-double v25, v25, v23

    .line 227
    .line 228
    mul-double v25, v25, v23

    .line 229
    .line 230
    sub-double v14, v14, v25

    .line 231
    .line 232
    mul-double v25, v25, v0

    .line 233
    .line 234
    const-wide v0, 0x3fb999999999999aL    # 0.1

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    mul-double/2addr v0, v14

    .line 240
    mul-double/2addr v0, v14

    .line 241
    invoke-static {v2, v3}, Ljava/lang/Math;->cbrt(D)D

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    mul-double/2addr v0, v2

    .line 246
    add-double v0, v25, v0

    .line 247
    .line 248
    move-wide/from16 v37, v0

    .line 249
    .line 250
    invoke-static {v4, v5}, Lcom/google/android/material/color/utilities/ColorUtils;->yFromLstar(D)D

    .line 251
    .line 252
    .line 253
    move-result-wide v2

    .line 254
    aget-wide v4, p0, v13

    .line 255
    .line 256
    div-double/2addr v2, v4

    .line 257
    move-wide/from16 v24, v2

    .line 258
    .line 259
    const-wide v4, 0x3ff7ae147ae147aeL    # 1.48

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 265
    .line 266
    .line 267
    move-result-wide v14

    .line 268
    add-double v41, v14, v4

    .line 269
    .line 270
    const-wide v4, 0x3fc999999999999aL    # 0.2

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 276
    .line 277
    .line 278
    move-result-wide v2

    .line 279
    const-wide v4, 0x3fe7333333333333L    # 0.725

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    div-double/2addr v4, v2

    .line 285
    move-wide/from16 v28, v4

    .line 286
    .line 287
    move-wide/from16 v30, v4

    .line 288
    .line 289
    new-array v2, v6, [D

    .line 290
    .line 291
    aget-wide v14, v10, v7

    .line 292
    .line 293
    mul-double/2addr v14, v0

    .line 294
    mul-double/2addr v14, v11

    .line 295
    div-double v14, v14, v21

    .line 296
    .line 297
    const-wide v11, 0x3fdae147ae147ae1L    # 0.42

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 303
    .line 304
    .line 305
    move-result-wide v14

    .line 306
    aput-wide v14, v2, v7

    .line 307
    .line 308
    aget-wide v14, v10, v13

    .line 309
    .line 310
    mul-double/2addr v14, v0

    .line 311
    mul-double v14, v14, v19

    .line 312
    .line 313
    div-double v14, v14, v21

    .line 314
    .line 315
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 316
    .line 317
    .line 318
    move-result-wide v14

    .line 319
    aput-wide v14, v2, v13

    .line 320
    .line 321
    aget-wide v14, v10, v16

    .line 322
    .line 323
    mul-double/2addr v14, v0

    .line 324
    mul-double/2addr v14, v8

    .line 325
    div-double v14, v14, v21

    .line 326
    .line 327
    invoke-static {v14, v15, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 328
    .line 329
    .line 330
    move-result-wide v8

    .line 331
    aput-wide v8, v2, v16

    .line 332
    .line 333
    aget-wide v6, v2, v7

    .line 334
    .line 335
    const-wide/high16 v10, 0x4079000000000000L    # 400.0

    .line 336
    .line 337
    mul-double v14, v6, v10

    .line 338
    .line 339
    const-wide v16, 0x403b2147ae147ae1L    # 27.13

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    add-double v6, v6, v16

    .line 345
    .line 346
    div-double/2addr v14, v6

    .line 347
    aget-wide v6, v2, v13

    .line 348
    .line 349
    mul-double v2, v6, v10

    .line 350
    .line 351
    add-double v6, v6, v16

    .line 352
    .line 353
    div-double/2addr v2, v6

    .line 354
    mul-double/2addr v10, v8

    .line 355
    add-double v8, v8, v16

    .line 356
    .line 357
    div-double/2addr v10, v8

    .line 358
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 359
    .line 360
    mul-double/2addr v14, v6

    .line 361
    add-double/2addr v14, v2

    .line 362
    const-wide v2, 0x3fa999999999999aL    # 0.05

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    mul-double/2addr v10, v2

    .line 368
    add-double/2addr v14, v10

    .line 369
    mul-double v26, v14, v4

    .line 370
    .line 371
    new-instance v2, Lcom/google/android/material/color/utilities/ViewingConditions;

    .line 372
    .line 373
    move-object/from16 v23, v2

    .line 374
    .line 375
    const-wide/high16 v3, 0x3fd0000000000000L    # 0.25

    .line 376
    .line 377
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 378
    .line 379
    .line 380
    move-result-wide v39

    .line 381
    invoke-direct/range {v23 .. v42}, Lcom/google/android/material/color/utilities/ViewingConditions;-><init>(DDDDDD[DDDD)V

    .line 382
    .line 383
    .line 384
    return-object v2
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
.end method


# virtual methods
.method public getAw()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->aw:D

    return-wide v0
.end method

.method getC()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->c:D

    return-wide v0
.end method

.method getFl()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->fl:D

    return-wide v0
.end method

.method public getFlRoot()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->flRoot:D

    return-wide v0
.end method

.method public getN()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->n:D

    return-wide v0
.end method

.method public getNbb()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nbb:D

    return-wide v0
.end method

.method getNc()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->nc:D

    return-wide v0
.end method

.method getNcb()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->ncb:D

    return-wide v0
.end method

.method public getRgbD()[D
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->rgbD:[D

    return-object v0
.end method

.method getZ()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/material/color/utilities/ViewingConditions;->z:D

    return-wide v0
.end method
