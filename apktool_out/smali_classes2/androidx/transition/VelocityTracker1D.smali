.class Landroidx/transition/VelocityTracker1D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ASSUME_POINTER_MOVE_STOPPED_MILLIS:I = 0x28

.field private static final HISTORY_SIZE:I = 0x14

.field private static final HORIZON_MILLIS:I = 0x64


# instance fields
.field private mDataSamples:[F

.field private mIndex:I

.field private mTimeSamples:[J


# direct methods
.method constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    new-array v1, v0, [J

    .line 7
    .line 8
    iput-object v1, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 9
    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 16
    .line 17
    const-wide/high16 v2, -0x8000000000000000L

    .line 18
    .line 19
    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 20
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

.method private kineticEnergyToVelocity(F)F
    .locals 4

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v0

    float-to-double v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    mul-float/2addr p1, v2

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method


# virtual methods
.method public addDataPoint(JF)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit8 v0, v0, 0x14

    .line 6
    .line 7
    iput v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 10
    .line 11
    aput-wide p1, v1, v0

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 14
    .line 15
    aput p3, p1, v0

    .line 16
    .line 17
    return-void
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

.method calculateVelocity()F
    .locals 15

    .line 1
    iget v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 2
    .line 3
    const-wide/high16 v1, -0x8000000000000000L

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v4, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 9
    .line 10
    aget-wide v5, v4, v0

    .line 11
    .line 12
    cmp-long v4, v5, v1

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    return v3

    .line 17
    :cond_0
    iget-object v4, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 18
    .line 19
    aget-wide v5, v4, v0

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move-wide v7, v5

    .line 23
    :goto_0
    iget-object v9, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 24
    .line 25
    aget-wide v10, v9, v0

    .line 26
    .line 27
    cmp-long v9, v10, v1

    .line 28
    .line 29
    const/16 v12, 0x14

    .line 30
    .line 31
    if-nez v9, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    sub-long v13, v5, v10

    .line 35
    .line 36
    long-to-float v9, v13

    .line 37
    sub-long v7, v10, v7

    .line 38
    .line 39
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    long-to-float v7, v7

    .line 44
    const/high16 v8, 0x42c80000    # 100.0f

    .line 45
    .line 46
    cmpl-float v8, v9, v8

    .line 47
    .line 48
    if-gtz v8, :cond_5

    .line 49
    .line 50
    const/high16 v8, 0x42200000    # 40.0f

    .line 51
    .line 52
    cmpl-float v7, v7, v8

    .line 53
    .line 54
    if-lez v7, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-nez v0, :cond_3

    .line 58
    .line 59
    move v0, v12

    .line 60
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    if-lt v4, v12, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    move-wide v7, v10

    .line 68
    goto :goto_0

    .line 69
    :cond_5
    :goto_1
    const/4 v0, 0x2

    .line 70
    if-ge v4, v0, :cond_6

    .line 71
    .line 72
    return v3

    .line 73
    :cond_6
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 74
    .line 75
    if-ne v4, v0, :cond_9

    .line 76
    .line 77
    iget v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 78
    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    const/16 v2, 0x13

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_7
    add-int/lit8 v2, v0, -0x1

    .line 85
    .line 86
    :goto_2
    iget-object v4, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 87
    .line 88
    aget-wide v5, v4, v0

    .line 89
    .line 90
    aget-wide v7, v4, v2

    .line 91
    .line 92
    sub-long/2addr v5, v7

    .line 93
    long-to-float v4, v5

    .line 94
    cmpl-float v5, v4, v3

    .line 95
    .line 96
    if-nez v5, :cond_8

    .line 97
    .line 98
    return v3

    .line 99
    :cond_8
    iget-object v3, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 100
    .line 101
    aget v0, v3, v0

    .line 102
    .line 103
    aget v2, v3, v2

    .line 104
    .line 105
    sub-float/2addr v0, v2

    .line 106
    div-float/2addr v0, v4

    .line 107
    :goto_3
    mul-float/2addr v0, v1

    .line 108
    return v0

    .line 109
    :cond_9
    iget v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 110
    .line 111
    sub-int v2, v0, v4

    .line 112
    .line 113
    add-int/2addr v2, v12

    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    rem-int/2addr v2, v12

    .line 117
    add-int/lit8 v0, v0, 0x1

    .line 118
    .line 119
    add-int/2addr v0, v12

    .line 120
    rem-int/2addr v0, v12

    .line 121
    iget-object v4, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 122
    .line 123
    aget-wide v5, v4, v2

    .line 124
    .line 125
    iget-object v4, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 126
    .line 127
    aget v4, v4, v2

    .line 128
    .line 129
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    rem-int/lit8 v7, v2, 0x14

    .line 132
    .line 133
    move v8, v3

    .line 134
    :goto_4
    if-eq v7, v0, :cond_c

    .line 135
    .line 136
    iget-object v9, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 137
    .line 138
    aget-wide v10, v9, v7

    .line 139
    .line 140
    sub-long v13, v10, v5

    .line 141
    .line 142
    long-to-float v9, v13

    .line 143
    cmpl-float v13, v9, v3

    .line 144
    .line 145
    if-nez v13, :cond_a

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_a
    iget-object v5, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 149
    .line 150
    aget v5, v5, v7

    .line 151
    .line 152
    invoke-direct {p0, v8}, Landroidx/transition/VelocityTracker1D;->kineticEnergyToVelocity(F)F

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    sub-float v4, v5, v4

    .line 157
    .line 158
    div-float/2addr v4, v9

    .line 159
    sub-float v6, v4, v6

    .line 160
    .line 161
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    mul-float/2addr v6, v4

    .line 166
    add-float/2addr v8, v6

    .line 167
    if-ne v7, v2, :cond_b

    .line 168
    .line 169
    const/high16 v4, 0x3f000000    # 0.5f

    .line 170
    .line 171
    mul-float/2addr v8, v4

    .line 172
    :cond_b
    move v4, v5

    .line 173
    move-wide v5, v10

    .line 174
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 175
    .line 176
    rem-int/2addr v7, v12

    .line 177
    goto :goto_4

    .line 178
    :cond_c
    invoke-direct {p0, v8}, Landroidx/transition/VelocityTracker1D;->kineticEnergyToVelocity(F)F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    goto :goto_3
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

.method public resetTracking()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/transition/VelocityTracker1D;->mIndex:I

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/transition/VelocityTracker1D;->mTimeSamples:[J

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/transition/VelocityTracker1D;->mDataSamples:[F

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method
