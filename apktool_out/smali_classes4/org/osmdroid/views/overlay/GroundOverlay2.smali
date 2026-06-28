.class public Lorg/osmdroid/views/overlay/GroundOverlay2;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field protected mBearing:F

.field private mImage:Landroid/graphics/Bitmap;

.field private mLatD:F

.field private mLatU:F

.field private mLonL:F

.field private mLonR:F

.field private mMatrix:Landroid/graphics/Matrix;

.field private final mPaint:Landroid/graphics/Paint;

.field protected mTransparency:F


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
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mPaint:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mMatrix:Landroid/graphics/Matrix;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mBearing:F

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->setTransparency(F)V

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


# virtual methods
.method protected computeMatrix(Lorg/osmdroid/views/Projection;)V
    .locals 8

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLonL:F

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    invoke-virtual {p1, v0, v1}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget v2, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLatU:F

    .line 9
    .line 10
    float-to-double v2, v2

    .line 11
    invoke-virtual {p1, v2, v3}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget v4, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLonR:F

    .line 16
    .line 17
    float-to-double v4, v4

    .line 18
    invoke-virtual {p1, v4, v5}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    iget v6, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLatD:F

    .line 23
    .line 24
    float-to-double v6, v6

    .line 25
    invoke-virtual {p1, v6, v7}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    sub-long/2addr v4, v0

    .line 30
    long-to-float p1, v4

    .line 31
    sub-long/2addr v6, v2

    .line 32
    long-to-float v4, v6

    .line 33
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getImage()Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    int-to-float v5, v5

    .line 42
    div-float/2addr p1, v5

    .line 43
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getImage()Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    int-to-float v5, v5

    .line 52
    div-float/2addr v4, v5

    .line 53
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getMatrix()Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5, p1, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getMatrix()Landroid/graphics/Matrix;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    long-to-float v0, v0

    .line 65
    long-to-float v1, v2

    .line 66
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 67
    .line 68
    .line 69
    return-void
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

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mImage:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/GroundOverlay2;->computeMatrix(Lorg/osmdroid/views/Projection;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getImage()Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getMatrix()Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/GroundOverlay2;->getPaint()Landroid/graphics/Paint;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

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

    iget v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mBearing:F

    return v0
.end method

.method public getImage()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mImage:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method protected getMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mMatrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method protected getPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method public getTransparency()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mTransparency:F

    return v0
.end method

.method public setBearing(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mBearing:F

    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mImage:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setPosition(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-float v0, v0

    .line 6
    iput v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLatU:F

    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    double-to-float p1, v0

    .line 13
    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLonL:F

    .line 14
    .line 15
    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    double-to-float p1, v0

    .line 20
    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLatD:F

    .line 21
    .line 22
    invoke-virtual {p2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    double-to-float p1, p1

    .line 27
    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mLonR:F

    .line 28
    .line 29
    return-void
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

.method public setTransparency(F)V
    .locals 2

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mTransparency:F

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/GroundOverlay2;->mPaint:Landroid/graphics/Paint;

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
