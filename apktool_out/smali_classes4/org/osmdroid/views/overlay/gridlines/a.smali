.class public Lorg/osmdroid/views/overlay/gridlines/a;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"


# instance fields
.field protected a:Ljava/text/DecimalFormat;

.field protected b:F

.field protected c:Landroid/graphics/Paint;

.field protected d:Landroid/graphics/Paint;

.field protected e:Landroid/graphics/Paint;

.field protected f:Lorg/osmdroid/util/GeoPoint;

.field protected g:Landroid/graphics/Point;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/text/DecimalFormat;

    .line 5
    .line 6
    const-string v1, "#.#####"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->a:Ljava/text/DecimalFormat;

    .line 12
    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    .line 14
    .line 15
    iput v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Paint;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->d:Landroid/graphics/Paint;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 37
    .line 38
    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    .line 39
    .line 40
    const-wide/16 v2, 0x0

    .line 41
    .line 42
    invoke-direct {v1, v2, v3, v2, v3}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->f:Lorg/osmdroid/util/GeoPoint;

    .line 46
    .line 47
    new-instance v1, Landroid/graphics/Point;

    .line 48
    .line 49
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 53
    .line 54
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    .line 61
    .line 62
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->d:Landroid/graphics/Paint;

    .line 68
    .line 69
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 70
    .line 71
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 80
    .line 81
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 87
    .line 88
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 94
    .line 95
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 98
    .line 99
    .line 100
    const/high16 v1, -0x1000000

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/gridlines/a;->j(I)V

    .line 103
    .line 104
    .line 105
    const/4 v2, -0x1

    .line 106
    invoke-virtual {p0, v2}, Lorg/osmdroid/views/overlay/gridlines/a;->h(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Lorg/osmdroid/views/overlay/gridlines/a;->f(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/gridlines/a;->setLineWidth(F)V

    .line 113
    .line 114
    .line 115
    const/16 v0, 0x20

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/gridlines/a;->i(S)V

    .line 118
    .line 119
    .line 120
    return-void
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
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
.end method

.method private c(DD)D
    .locals 2

    .line 1
    div-double/2addr p1, p3

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    long-to-double p1, p1

    .line 7
    mul-double/2addr p1, p3

    .line 8
    :goto_0
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    cmpl-double v0, p1, v0

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    sub-double/2addr p1, p3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :goto_1
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    cmpg-double v0, p1, v0

    .line 31
    .line 32
    if-gez v0, :cond_1

    .line 33
    .line 34
    add-double/2addr p1, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    return-wide p1
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

.method private d(DZ)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->a:Ljava/text/DecimalFormat;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    cmpl-double p1, p1, v1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-lez p1, :cond_2

    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    const-string p1, "N"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string p1, "E"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-eqz p3, :cond_3

    .line 35
    .line 36
    const-string p1, "S"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const-string p1, "W"

    .line 40
    .line 41
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
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


# virtual methods
.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/overlay/Overlay;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    double-to-int v1, v1

    .line 17
    invoke-virtual {v0, v1}, Lorg/osmdroid/views/overlay/gridlines/a;->e(I)D

    .line 18
    .line 19
    .line 20
    move-result-wide v8

    .line 21
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getCurrentCenter()Lorg/osmdroid/util/GeoPoint;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    div-double/2addr v2, v8

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    long-to-double v2, v2

    .line 35
    mul-double v10, v8, v2

    .line 36
    .line 37
    invoke-virtual {v1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-direct {v0, v1, v2, v8, v9}, Lorg/osmdroid/views/overlay/gridlines/a;->c(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v12

    .line 45
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    .line 46
    .line 47
    .line 48
    move-result-wide v14

    .line 49
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    int-to-float v1, v1

    .line 54
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    int-to-float v5, v2

    .line 59
    const/high16 v16, 0x40000000    # 2.0f

    .line 60
    .line 61
    div-float v17, v1, v16

    .line 62
    .line 63
    div-float v18, v5, v16

    .line 64
    .line 65
    mul-float v2, v1, v1

    .line 66
    .line 67
    mul-float v3, v5, v5

    .line 68
    .line 69
    add-float/2addr v2, v3

    .line 70
    float-to-double v2, v2

    .line 71
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    double-to-float v6, v2

    .line 76
    div-float v2, v6, v16

    .line 77
    .line 78
    float-to-double v2, v2

    .line 79
    mul-double v19, v2, v2

    .line 80
    .line 81
    const/high16 v2, 0x40a00000    # 5.0f

    .line 82
    .line 83
    div-float v21, v1, v2

    .line 84
    .line 85
    div-float v22, v5, v2

    .line 86
    .line 87
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    neg-float v1, v1

    .line 94
    const/high16 v23, 0x3f000000    # 0.5f

    .line 95
    .line 96
    add-float v1, v1, v23

    .line 97
    .line 98
    iget-object v2, v0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/graphics/Paint;->descent()F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    add-float v24, v2, v23

    .line 105
    .line 106
    add-float v25, v1, v24

    .line 107
    .line 108
    const/16 v26, 0x0

    .line 109
    .line 110
    move/from16 v3, v26

    .line 111
    .line 112
    :goto_0
    const/4 v4, 0x1

    .line 113
    if-gt v3, v4, :cond_1a

    .line 114
    .line 115
    move/from16 v1, v26

    .line 116
    .line 117
    :goto_1
    if-gt v1, v4, :cond_19

    .line 118
    .line 119
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    neg-float v2, v2

    .line 124
    if-nez v1, :cond_1

    .line 125
    .line 126
    move/from16 v4, v26

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_1
    const/16 v27, 0x5a

    .line 130
    .line 131
    move/from16 v4, v27

    .line 132
    .line 133
    :goto_2
    int-to-float v4, v4

    .line 134
    add-float/2addr v4, v2

    .line 135
    move/from16 v27, v3

    .line 136
    .line 137
    move/from16 v2, v26

    .line 138
    .line 139
    :goto_3
    const/4 v3, 0x1

    .line 140
    if-gt v2, v3, :cond_18

    .line 141
    .line 142
    move/from16 v29, v2

    .line 143
    .line 144
    if-nez v2, :cond_2

    .line 145
    .line 146
    move-wide/from16 v30, v8

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_2
    neg-double v2, v8

    .line 150
    move-wide/from16 v30, v2

    .line 151
    .line 152
    :goto_4
    if-nez v1, :cond_3

    .line 153
    .line 154
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    goto :goto_5

    .line 159
    :cond_3
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    :goto_5
    move v3, v2

    .line 164
    move-wide/from16 v36, v10

    .line 165
    .line 166
    move-wide/from16 v34, v12

    .line 167
    .line 168
    move/from16 v33, v26

    .line 169
    .line 170
    const/16 v32, 0x1

    .line 171
    .line 172
    :goto_6
    if-eqz v32, :cond_17

    .line 173
    .line 174
    if-lez v33, :cond_7

    .line 175
    .line 176
    const/4 v2, 0x1

    .line 177
    if-ne v1, v2, :cond_5

    .line 178
    .line 179
    add-double v36, v36, v30

    .line 180
    .line 181
    :goto_7
    const-wide v38, -0x3f99800000000000L    # -180.0

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    cmpg-double v28, v36, v38

    .line 187
    .line 188
    const-wide v38, 0x4076800000000000L    # 360.0

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    if-gez v28, :cond_4

    .line 194
    .line 195
    add-double v36, v36, v38

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_4
    :goto_8
    const-wide v40, 0x4066800000000000L    # 180.0

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    cmpl-double v28, v36, v40

    .line 204
    .line 205
    if-lez v28, :cond_7

    .line 206
    .line 207
    sub-double v36, v36, v38

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_5
    add-double v34, v34, v30

    .line 211
    .line 212
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 213
    .line 214
    .line 215
    move-result-object v28

    .line 216
    invoke-virtual/range {v28 .. v28}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 217
    .line 218
    .line 219
    move-result-wide v38

    .line 220
    cmpl-double v28, v34, v38

    .line 221
    .line 222
    if-lez v28, :cond_6

    .line 223
    .line 224
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 225
    .line 226
    .line 227
    move-result-object v28

    .line 228
    move/from16 v38, v3

    .line 229
    .line 230
    invoke-virtual/range {v28 .. v28}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    invoke-direct {v0, v2, v3, v8, v9}, Lorg/osmdroid/views/overlay/gridlines/a;->c(DD)D

    .line 235
    .line 236
    .line 237
    move-result-wide v34

    .line 238
    goto :goto_9

    .line 239
    :cond_6
    move/from16 v38, v3

    .line 240
    .line 241
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v2}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 246
    .line 247
    .line 248
    move-result-wide v2

    .line 249
    cmpg-double v2, v34, v2

    .line 250
    .line 251
    if-gez v2, :cond_8

    .line 252
    .line 253
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 258
    .line 259
    .line 260
    move-result-wide v2

    .line 261
    invoke-direct {v0, v2, v3, v8, v9}, Lorg/osmdroid/views/overlay/gridlines/a;->c(DD)D

    .line 262
    .line 263
    .line 264
    move-result-wide v34

    .line 265
    goto :goto_9

    .line 266
    :cond_7
    move/from16 v38, v3

    .line 267
    .line 268
    :cond_8
    :goto_9
    move/from16 v28, v4

    .line 269
    .line 270
    move-wide/from16 v2, v34

    .line 271
    .line 272
    move-wide/from16 v34, v8

    .line 273
    .line 274
    move-wide/from16 v8, v36

    .line 275
    .line 276
    iget-object v4, v0, Lorg/osmdroid/views/overlay/gridlines/a;->f:Lorg/osmdroid/util/GeoPoint;

    .line 277
    .line 278
    invoke-virtual {v4, v2, v3, v8, v9}, Lorg/osmdroid/util/GeoPoint;->setCoords(DD)V

    .line 279
    .line 280
    .line 281
    iget-object v4, v0, Lorg/osmdroid/views/overlay/gridlines/a;->f:Lorg/osmdroid/util/GeoPoint;

    .line 282
    .line 283
    move-wide/from16 v36, v2

    .line 284
    .line 285
    iget-object v2, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 286
    .line 287
    move-object/from16 v3, p2

    .line 288
    .line 289
    invoke-virtual {v3, v4, v2}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 290
    .line 291
    .line 292
    if-nez v1, :cond_b

    .line 293
    .line 294
    iget-object v4, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 295
    .line 296
    move/from16 v40, v6

    .line 297
    .line 298
    move/from16 v2, v38

    .line 299
    .line 300
    move/from16 v38, v5

    .line 301
    .line 302
    int-to-double v5, v2

    .line 303
    move/from16 v41, v1

    .line 304
    .line 305
    iget v1, v4, Landroid/graphics/Point;->y:I

    .line 306
    .line 307
    move-object/from16 v42, v4

    .line 308
    .line 309
    int-to-double v3, v1

    .line 310
    move-wide/from16 v43, v8

    .line 311
    .line 312
    move/from16 v8, v29

    .line 313
    .line 314
    move/from16 v29, v41

    .line 315
    .line 316
    const/16 v39, 0x1

    .line 317
    .line 318
    move v9, v2

    .line 319
    move-wide v1, v5

    .line 320
    move/from16 v5, v28

    .line 321
    .line 322
    move-object/from16 v6, v42

    .line 323
    .line 324
    move/from16 v39, v40

    .line 325
    .line 326
    move-wide/from16 v40, v10

    .line 327
    .line 328
    move v10, v5

    .line 329
    move-object v11, v6

    .line 330
    move-wide v5, v14

    .line 331
    invoke-static/range {v1 .. v6}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 332
    .line 333
    .line 334
    move-result-wide v1

    .line 335
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    .line 336
    .line 337
    .line 338
    move-result-wide v1

    .line 339
    long-to-int v1, v1

    .line 340
    iput v1, v11, Landroid/graphics/Point;->y:I

    .line 341
    .line 342
    if-lez v33, :cond_a

    .line 343
    .line 344
    const-wide/16 v1, 0x0

    .line 345
    .line 346
    cmpg-double v1, v30, v1

    .line 347
    .line 348
    if-gez v1, :cond_9

    .line 349
    .line 350
    :goto_a
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 351
    .line 352
    iget v2, v1, Landroid/graphics/Point;->y:I

    .line 353
    .line 354
    if-ge v2, v9, :cond_a

    .line 355
    .line 356
    int-to-double v2, v2

    .line 357
    add-double/2addr v2, v14

    .line 358
    double-to-int v2, v2

    .line 359
    iput v2, v1, Landroid/graphics/Point;->y:I

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_9
    :goto_b
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 363
    .line 364
    iget v2, v1, Landroid/graphics/Point;->y:I

    .line 365
    .line 366
    if-le v2, v9, :cond_a

    .line 367
    .line 368
    int-to-double v2, v2

    .line 369
    sub-double/2addr v2, v14

    .line 370
    double-to-int v2, v2

    .line 371
    iput v2, v1, Landroid/graphics/Point;->y:I

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_a
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 375
    .line 376
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_b
    move/from16 v39, v6

    .line 380
    .line 381
    move-wide/from16 v43, v8

    .line 382
    .line 383
    move-wide/from16 v40, v10

    .line 384
    .line 385
    move/from16 v10, v28

    .line 386
    .line 387
    move/from16 v8, v29

    .line 388
    .line 389
    move/from16 v9, v38

    .line 390
    .line 391
    move/from16 v29, v1

    .line 392
    .line 393
    move/from16 v38, v5

    .line 394
    .line 395
    iget-object v11, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 396
    .line 397
    int-to-double v1, v9

    .line 398
    iget v3, v11, Landroid/graphics/Point;->x:I

    .line 399
    .line 400
    int-to-double v3, v3

    .line 401
    move-wide v5, v14

    .line 402
    invoke-static/range {v1 .. v6}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 403
    .line 404
    .line 405
    move-result-wide v1

    .line 406
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    .line 407
    .line 408
    .line 409
    move-result-wide v1

    .line 410
    long-to-int v1, v1

    .line 411
    iput v1, v11, Landroid/graphics/Point;->x:I

    .line 412
    .line 413
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 414
    .line 415
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 416
    .line 417
    :goto_c
    move v9, v1

    .line 418
    const/4 v11, 0x1

    .line 419
    if-nez v33, :cond_d

    .line 420
    .line 421
    if-ne v8, v11, :cond_d

    .line 422
    .line 423
    :cond_c
    :goto_d
    move/from16 v47, v9

    .line 424
    .line 425
    goto/16 :goto_14

    .line 426
    .line 427
    :cond_d
    if-nez v29, :cond_e

    .line 428
    .line 429
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 430
    .line 431
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 432
    .line 433
    int-to-float v2, v1

    .line 434
    sub-float v3, v17, v39

    .line 435
    .line 436
    add-float v6, v17, v39

    .line 437
    .line 438
    int-to-float v4, v1

    .line 439
    sub-float v4, v4, v18

    .line 440
    .line 441
    int-to-float v1, v1

    .line 442
    sub-float v1, v1, v18

    .line 443
    .line 444
    mul-float/2addr v4, v1

    .line 445
    float-to-double v4, v4

    .line 446
    move/from16 v28, v2

    .line 447
    .line 448
    move v2, v3

    .line 449
    move/from16 v3, v28

    .line 450
    .line 451
    goto :goto_e

    .line 452
    :cond_e
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->g:Landroid/graphics/Point;

    .line 453
    .line 454
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 455
    .line 456
    int-to-float v2, v1

    .line 457
    sub-float v3, v18, v39

    .line 458
    .line 459
    add-float v6, v18, v39

    .line 460
    .line 461
    int-to-float v4, v1

    .line 462
    sub-float v4, v4, v17

    .line 463
    .line 464
    int-to-float v1, v1

    .line 465
    sub-float v1, v1, v17

    .line 466
    .line 467
    mul-float/2addr v4, v1

    .line 468
    float-to-double v4, v4

    .line 469
    move/from16 v28, v6

    .line 470
    .line 471
    move v6, v2

    .line 472
    :goto_e
    cmpg-double v1, v4, v19

    .line 473
    .line 474
    if-gtz v1, :cond_f

    .line 475
    .line 476
    move/from16 v32, v11

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_f
    move/from16 v32, v26

    .line 480
    .line 481
    :goto_f
    if-eqz v32, :cond_c

    .line 482
    .line 483
    if-nez v27, :cond_10

    .line 484
    .line 485
    iget-object v5, v0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    .line 486
    .line 487
    move-object/from16 v1, p1

    .line 488
    .line 489
    move v4, v6

    .line 490
    move-object v6, v5

    .line 491
    move/from16 v5, v28

    .line 492
    .line 493
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 494
    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_10
    if-nez v29, :cond_11

    .line 498
    .line 499
    move-wide/from16 v4, v36

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_11
    move-wide/from16 v4, v43

    .line 503
    .line 504
    :goto_10
    if-nez v29, :cond_12

    .line 505
    .line 506
    move v1, v11

    .line 507
    goto :goto_11

    .line 508
    :cond_12
    move/from16 v1, v26

    .line 509
    .line 510
    :goto_11
    invoke-direct {v0, v4, v5, v1}, Lorg/osmdroid/views/overlay/gridlines/a;->d(DZ)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    if-nez v29, :cond_13

    .line 515
    .line 516
    move/from16 v5, v21

    .line 517
    .line 518
    goto :goto_12

    .line 519
    :cond_13
    move v5, v2

    .line 520
    :goto_12
    if-nez v29, :cond_14

    .line 521
    .line 522
    goto :goto_13

    .line 523
    :cond_14
    sub-float v3, v38, v22

    .line 524
    .line 525
    :goto_13
    iget-object v1, v0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 526
    .line 527
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    add-float v1, v1, v23

    .line 532
    .line 533
    const/4 v2, 0x0

    .line 534
    cmpl-float v28, v10, v2

    .line 535
    .line 536
    if-eqz v28, :cond_15

    .line 537
    .line 538
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 539
    .line 540
    .line 541
    invoke-virtual {v7, v10, v5, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 542
    .line 543
    .line 544
    :cond_15
    div-float v1, v1, v16

    .line 545
    .line 546
    sub-float v2, v5, v1

    .line 547
    .line 548
    div-float v4, v25, v16

    .line 549
    .line 550
    sub-float v42, v3, v4

    .line 551
    .line 552
    add-float v45, v5, v1

    .line 553
    .line 554
    add-float v46, v3, v4

    .line 555
    .line 556
    iget-object v4, v0, Lorg/osmdroid/views/overlay/gridlines/a;->d:Landroid/graphics/Paint;

    .line 557
    .line 558
    move-object/from16 v1, p1

    .line 559
    .line 560
    move/from16 v3, v42

    .line 561
    .line 562
    move-object/from16 v42, v4

    .line 563
    .line 564
    move/from16 v4, v45

    .line 565
    .line 566
    move v11, v5

    .line 567
    move/from16 v5, v46

    .line 568
    .line 569
    move/from16 v47, v9

    .line 570
    .line 571
    move-object v9, v6

    .line 572
    move-object/from16 v6, v42

    .line 573
    .line 574
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 575
    .line 576
    .line 577
    sub-float v1, v46, v24

    .line 578
    .line 579
    iget-object v2, v0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    .line 580
    .line 581
    invoke-virtual {v7, v9, v11, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 582
    .line 583
    .line 584
    if-eqz v28, :cond_16

    .line 585
    .line 586
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 587
    .line 588
    .line 589
    :cond_16
    :goto_14
    add-int/lit8 v33, v33, 0x1

    .line 590
    .line 591
    move v4, v10

    .line 592
    move/from16 v1, v29

    .line 593
    .line 594
    move/from16 v5, v38

    .line 595
    .line 596
    move/from16 v6, v39

    .line 597
    .line 598
    move-wide/from16 v10, v40

    .line 599
    .line 600
    move/from16 v3, v47

    .line 601
    .line 602
    move/from16 v29, v8

    .line 603
    .line 604
    move-wide/from16 v8, v34

    .line 605
    .line 606
    move-wide/from16 v34, v36

    .line 607
    .line 608
    move-wide/from16 v36, v43

    .line 609
    .line 610
    goto/16 :goto_6

    .line 611
    .line 612
    :cond_17
    move/from16 v38, v5

    .line 613
    .line 614
    move/from16 v39, v6

    .line 615
    .line 616
    move-wide/from16 v34, v8

    .line 617
    .line 618
    move-wide/from16 v40, v10

    .line 619
    .line 620
    move/from16 v8, v29

    .line 621
    .line 622
    move/from16 v29, v1

    .line 623
    .line 624
    move v10, v4

    .line 625
    add-int/lit8 v2, v8, 0x1

    .line 626
    .line 627
    move-wide/from16 v8, v34

    .line 628
    .line 629
    move-wide/from16 v10, v40

    .line 630
    .line 631
    goto/16 :goto_3

    .line 632
    .line 633
    :cond_18
    move/from16 v29, v1

    .line 634
    .line 635
    move/from16 v38, v5

    .line 636
    .line 637
    move/from16 v39, v6

    .line 638
    .line 639
    move-wide/from16 v34, v8

    .line 640
    .line 641
    move-wide/from16 v40, v10

    .line 642
    .line 643
    add-int/lit8 v1, v29, 0x1

    .line 644
    .line 645
    move/from16 v3, v27

    .line 646
    .line 647
    const/4 v4, 0x1

    .line 648
    goto/16 :goto_1

    .line 649
    .line 650
    :cond_19
    move/from16 v27, v3

    .line 651
    .line 652
    move/from16 v38, v5

    .line 653
    .line 654
    move/from16 v39, v6

    .line 655
    .line 656
    move-wide/from16 v34, v8

    .line 657
    .line 658
    move-wide/from16 v40, v10

    .line 659
    .line 660
    add-int/lit8 v3, v27, 0x1

    .line 661
    .line 662
    goto/16 :goto_0

    .line 663
    .line 664
    :cond_1a
    return-void
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
.end method

.method protected e(I)D
    .locals 4

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 5
    .line 6
    float-to-double v0, p1

    .line 7
    const-wide v2, 0x3e8999999999999aL    # 1.9073486328125E-7

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    mul-double/2addr v0, v2

    .line 13
    return-wide v0

    .line 14
    :pswitch_0
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 15
    .line 16
    float-to-double v0, p1

    .line 17
    const-wide v2, 0x3e9999999999999aL    # 3.814697265625E-7

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_1
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 24
    .line 25
    float-to-double v0, p1

    .line 26
    const-wide v2, 0x3ea999999999999aL    # 7.62939453125E-7

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_2
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 33
    .line 34
    float-to-double v0, p1

    .line 35
    const-wide v2, 0x3eb999999999999aL    # 1.52587890625E-6

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_3
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 42
    .line 43
    float-to-double v0, p1

    .line 44
    const-wide v2, 0x3ec999999999999aL    # 3.0517578125E-6

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_4
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 51
    .line 52
    float-to-double v0, p1

    .line 53
    const-wide v2, 0x3ed999999999999aL    # 6.103515625E-6

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_5
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 60
    .line 61
    float-to-double v0, p1

    .line 62
    const-wide v2, 0x3ee999999999999aL    # 1.220703125E-5

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_6
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 69
    .line 70
    float-to-double v0, p1

    .line 71
    const-wide v2, 0x3ef999999999999aL    # 2.44140625E-5

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_7
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 78
    .line 79
    float-to-double v0, p1

    .line 80
    const-wide v2, 0x3f0999999999999aL    # 4.8828125E-5

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_8
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 87
    .line 88
    float-to-double v0, p1

    .line 89
    const-wide v2, 0x3f1999999999999aL    # 9.765625E-5

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_9
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 96
    .line 97
    float-to-double v0, p1

    .line 98
    const-wide v2, 0x3f2999999999999aL    # 1.953125E-4

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_a
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 105
    .line 106
    float-to-double v0, p1

    .line 107
    const-wide v2, 0x3f3999999999999aL    # 3.90625E-4

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_b
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 114
    .line 115
    float-to-double v0, p1

    .line 116
    const-wide v2, 0x3f4999999999999aL    # 7.8125E-4

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_c
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 123
    .line 124
    float-to-double v0, p1

    .line 125
    const-wide v2, 0x3f5999999999999aL    # 0.0015625

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_d
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 132
    .line 133
    float-to-double v0, p1

    .line 134
    const-wide v2, 0x3f6999999999999aL    # 0.003125

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :pswitch_e
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 141
    .line 142
    float-to-double v0, p1

    .line 143
    const-wide v2, 0x3f7999999999999aL    # 0.00625

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :pswitch_f
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 151
    .line 152
    float-to-double v0, p1

    .line 153
    const-wide v2, 0x3f8999999999999aL    # 0.0125

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :pswitch_10
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 161
    .line 162
    float-to-double v0, p1

    .line 163
    const-wide v2, 0x3f9999999999999aL    # 0.025

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :pswitch_11
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 171
    .line 172
    float-to-double v0, p1

    .line 173
    const-wide v2, 0x3fa999999999999aL    # 0.05

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :pswitch_12
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 181
    .line 182
    float-to-double v0, p1

    .line 183
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :pswitch_13
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 191
    .line 192
    float-to-double v0, p1

    .line 193
    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :pswitch_14
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 198
    .line 199
    float-to-double v0, p1

    .line 200
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :pswitch_15
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 205
    .line 206
    float-to-double v0, p1

    .line 207
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :pswitch_16
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 212
    .line 213
    float-to-double v0, p1

    .line 214
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :pswitch_17
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 219
    .line 220
    float-to-double v0, p1

    .line 221
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :pswitch_18
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 226
    .line 227
    float-to-double v0, p1

    .line 228
    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :pswitch_19
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 233
    .line 234
    float-to-double v0, p1

    .line 235
    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :pswitch_1a
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 240
    .line 241
    float-to-double v0, p1

    .line 242
    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :pswitch_1b
    iget p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    .line 247
    .line 248
    float-to-double v0, p1

    .line 249
    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public g(Ljava/text/DecimalFormat;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->a:Ljava/text/DecimalFormat;

    return-void
.end method

.method public getTextPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    return-object v0
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public i(S)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->b:F

    return-void
.end method

.method public l(Landroid/graphics/Paint$Style;)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method public setLineWidth(F)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/gridlines/a;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setTextPaint(Landroid/graphics/Paint;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/gridlines/a;->e:Landroid/graphics/Paint;

    return-void
.end method
