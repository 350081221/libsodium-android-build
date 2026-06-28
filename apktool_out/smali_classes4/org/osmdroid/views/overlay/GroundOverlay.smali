.class public Lorg/osmdroid/views/overlay/GroundOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field private mBearing:F

.field private mBottomLeft:Lorg/osmdroid/util/GeoPoint;

.field private mBottomRight:Lorg/osmdroid/util/GeoPoint;

.field private mImage:Landroid/graphics/Bitmap;

.field private final mMatrix:Landroid/graphics/Matrix;

.field private mMatrixDst:[F

.field private mMatrixSrc:[F

.field private final mPaint:Landroid/graphics/Paint;

.field private mTopLeft:Lorg/osmdroid/util/GeoPoint;

.field private mTopRight:Lorg/osmdroid/util/GeoPoint;

.field private mTransparency:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mPaint:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBearing:F

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/GroundOverlay;->setTransparency(F)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method private computeMatrix(Lorg/osmdroid/views/Projection;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 10
    .line 11
    invoke-virtual {v2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {v1, v2, v3}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v4, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 20
    .line 21
    invoke-virtual {v4}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    invoke-virtual {v1, v4, v5}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    iget-object v6, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 30
    .line 31
    invoke-virtual {v6}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    invoke-virtual {v1, v6, v7}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    iget-object v8, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 40
    .line 41
    invoke-virtual {v8}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-virtual {v1, v8, v9}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    sub-long/2addr v6, v2

    .line 50
    long-to-float v1, v6

    .line 51
    sub-long/2addr v8, v4

    .line 52
    long-to-float v6, v8

    .line 53
    iget-object v7, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    int-to-float v7, v7

    .line 60
    div-float/2addr v1, v7

    .line 61
    iget-object v7, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    int-to-float v7, v7

    .line 68
    div-float/2addr v6, v7

    .line 69
    iget-object v7, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-virtual {v7, v1, v6}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    .line 75
    .line 76
    long-to-float v2, v2

    .line 77
    long-to-float v3, v4

    .line 78
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 83
    .line 84
    const/4 v3, 0x7

    .line 85
    const/4 v4, 0x6

    .line 86
    const/4 v5, 0x5

    .line 87
    const/4 v6, 0x4

    .line 88
    const/4 v7, 0x3

    .line 89
    const/4 v8, 0x2

    .line 90
    const/4 v9, 0x1

    .line 91
    const/4 v10, 0x0

    .line 92
    const/16 v11, 0x8

    .line 93
    .line 94
    if-nez v2, :cond_1

    .line 95
    .line 96
    new-array v2, v11, [F

    .line 97
    .line 98
    iput-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 99
    .line 100
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    iget-object v12, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 107
    .line 108
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    iget-object v13, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    aput v14, v13, v10

    .line 116
    .line 117
    aput v14, v13, v9

    .line 118
    .line 119
    int-to-float v2, v2

    .line 120
    aput v2, v13, v8

    .line 121
    .line 122
    aput v14, v13, v7

    .line 123
    .line 124
    aput v2, v13, v6

    .line 125
    .line 126
    int-to-float v2, v12

    .line 127
    aput v2, v13, v5

    .line 128
    .line 129
    aput v14, v13, v4

    .line 130
    .line 131
    aput v2, v13, v3

    .line 132
    .line 133
    :cond_1
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixDst:[F

    .line 134
    .line 135
    if-nez v2, :cond_2

    .line 136
    .line 137
    new-array v2, v11, [F

    .line 138
    .line 139
    iput-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixDst:[F

    .line 140
    .line 141
    :cond_2
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 142
    .line 143
    invoke-virtual {v2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    invoke-virtual {v1, v11, v12}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 148
    .line 149
    .line 150
    move-result-wide v11

    .line 151
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 152
    .line 153
    invoke-virtual {v2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 154
    .line 155
    .line 156
    move-result-wide v13

    .line 157
    invoke-virtual {v1, v13, v14}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 158
    .line 159
    .line 160
    move-result-wide v13

    .line 161
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    .line 162
    .line 163
    invoke-virtual {v2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    invoke-virtual {v1, v3, v4}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 168
    .line 169
    .line 170
    move-result-wide v2

    .line 171
    iget-object v4, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    .line 172
    .line 173
    invoke-virtual {v4}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    invoke-virtual {v1, v5, v6}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    iget-object v6, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 182
    .line 183
    invoke-virtual {v6}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 184
    .line 185
    .line 186
    move-result-wide v7

    .line 187
    invoke-virtual {v1, v7, v8}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    iget-object v8, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 192
    .line 193
    invoke-virtual {v8}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 194
    .line 195
    .line 196
    move-result-wide v9

    .line 197
    invoke-virtual {v1, v9, v10}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 198
    .line 199
    .line 200
    move-result-wide v8

    .line 201
    iget-object v10, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomLeft:Lorg/osmdroid/util/GeoPoint;

    .line 202
    .line 203
    move-wide v15, v8

    .line 204
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 205
    .line 206
    .line 207
    move-result-wide v8

    .line 208
    invoke-virtual {v1, v8, v9}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 209
    .line 210
    .line 211
    move-result-wide v8

    .line 212
    iget-object v10, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomLeft:Lorg/osmdroid/util/GeoPoint;

    .line 213
    .line 214
    move-wide/from16 v17, v8

    .line 215
    .line 216
    invoke-virtual {v10}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 217
    .line 218
    .line 219
    move-result-wide v8

    .line 220
    invoke-virtual {v1, v8, v9}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 221
    .line 222
    .line 223
    move-result-wide v8

    .line 224
    iget-object v1, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixDst:[F

    .line 225
    .line 226
    long-to-float v10, v11

    .line 227
    const/4 v11, 0x0

    .line 228
    aput v10, v1, v11

    .line 229
    .line 230
    long-to-float v10, v13

    .line 231
    const/4 v11, 0x1

    .line 232
    aput v10, v1, v11

    .line 233
    .line 234
    long-to-float v2, v2

    .line 235
    const/4 v3, 0x2

    .line 236
    aput v2, v1, v3

    .line 237
    .line 238
    long-to-float v2, v4

    .line 239
    const/4 v3, 0x3

    .line 240
    aput v2, v1, v3

    .line 241
    .line 242
    long-to-float v2, v6

    .line 243
    const/4 v3, 0x4

    .line 244
    aput v2, v1, v3

    .line 245
    .line 246
    move-wide v2, v15

    .line 247
    long-to-float v2, v2

    .line 248
    const/4 v3, 0x5

    .line 249
    aput v2, v1, v3

    .line 250
    .line 251
    move-wide/from16 v2, v17

    .line 252
    .line 253
    long-to-float v2, v2

    .line 254
    const/4 v3, 0x6

    .line 255
    aput v2, v1, v3

    .line 256
    .line 257
    long-to-float v2, v8

    .line 258
    const/4 v3, 0x7

    .line 259
    aput v2, v1, v3

    .line 260
    .line 261
    iget-object v2, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    .line 262
    .line 263
    iget-object v3, v0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 264
    .line 265
    const/16 v21, 0x0

    .line 266
    .line 267
    const/16 v23, 0x0

    .line 268
    .line 269
    const/16 v24, 0x4

    .line 270
    .line 271
    move-object/from16 v19, v2

    .line 272
    .line 273
    move-object/from16 v20, v3

    .line 274
    .line 275
    move-object/from16 v22, v1

    .line 276
    .line 277
    invoke-virtual/range {v19 .. v24}, Landroid/graphics/Matrix;->setPolyToPoly([FI[FII)Z

    .line 278
    .line 279
    .line 280
    return-void
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
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p2}, Lorg/osmdroid/views/overlay/GroundOverlay;->computeMatrix(Lorg/osmdroid/views/Projection;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mPaint:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

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
.end method

.method public getBearing()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBearing:F

    return v0
.end method

.method public getBottomLeft()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomLeft:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getBottomRight()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getImage()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTopLeft()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getTopRight()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getTransparency()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTransparency:F

    return v0
.end method

.method public setBearing(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBearing:F

    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mImage:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public setPosition(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;)V
    .locals 11

    .line 8
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixSrc:[F

    .line 10
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrixDst:[F

    .line 11
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v1, p1}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 12
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    .line 13
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v1, p2}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 14
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomLeft:Lorg/osmdroid/util/GeoPoint;

    .line 15
    new-instance v0, Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v5

    .line 16
    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v7

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v9

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/Overlay;->mBounds:Lorg/osmdroid/util/BoundingBox;

    return-void
.end method

.method public setPosition(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 2
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p1}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopLeft:Lorg/osmdroid/util/GeoPoint;

    .line 3
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p2}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTopRight:Lorg/osmdroid/util/GeoPoint;

    .line 4
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p3}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomRight:Lorg/osmdroid/util/GeoPoint;

    .line 5
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v0, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(Lorg/osmdroid/util/GeoPoint;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mBottomLeft:Lorg/osmdroid/util/GeoPoint;

    .line 6
    new-instance p4, Lorg/osmdroid/util/BoundingBox;

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v4

    .line 7
    invoke-virtual {p3}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v8

    move-object v1, p4

    invoke-direct/range {v1 .. v9}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    iput-object p4, p0, Lorg/osmdroid/views/overlay/Overlay;->mBounds:Lorg/osmdroid/util/BoundingBox;

    return-void
.end method

.method public setTransparency(F)V
    .locals 2

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mTransparency:F

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay;->mPaint:Landroid/graphics/Paint;

    .line 4
    .line 5
    const/high16 v1, 0x437f0000    # 255.0f

    .line 6
    .line 7
    mul-float/2addr p1, v1

    .line 8
    float-to-int p1, p1

    .line 9
    rsub-int p1, p1, 0xff

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method
