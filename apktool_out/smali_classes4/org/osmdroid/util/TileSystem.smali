.class public abstract Lorg/osmdroid/util/TileSystem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EarthRadius:D = 6378137.0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final MaxLatitude:D = 85.05112877980659
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final MaxLongitude:D = 180.0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final MinLatitude:D = -85.05112877980659
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final MinLongitude:D = -180.0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static mMaxZoomLevel:I = 0x1d

.field private static mTileSize:I = 0x100

.field public static final primaryKeyMaxZoomLevel:I = 0x1d

.field public static final projectionZoomLevel:I = 0x1e
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Clip(DDD)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    invoke-static {p0, p1, p4, p5}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static Clip(JJJ)J
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {p0, p1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ClipToLong(DDZ)J
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lorg/osmdroid/util/MyMath;->floorToLong(D)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    return-wide p0

    .line 8
    :cond_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p4, p0, v0

    .line 11
    .line 12
    if-gtz p4, :cond_1

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 16
    .line 17
    sub-double v0, p2, v0

    .line 18
    .line 19
    invoke-static {v0, v1}, Lorg/osmdroid/util/MyMath;->floorToLong(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    long-to-double v2, p0

    .line 24
    cmpl-double p2, v2, p2

    .line 25
    .line 26
    if-ltz p2, :cond_2

    .line 27
    .line 28
    move-wide p0, v0

    .line 29
    :cond_2
    return-wide p0
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
.end method

.method public static GroundResolution(DD)D
    .locals 8

    const-wide v2, -0x3fa9800000000000L    # -90.0

    const-wide v4, 0x4056800000000000L    # 90.0

    const-wide v6, 0x4066800000000000L    # 180.0

    move-wide v0, p0

    .line 2
    invoke-static/range {v0 .. v7}, Lorg/osmdroid/util/TileSystem;->wrap(DDDD)D

    move-result-wide p0

    invoke-static {p2, p3}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Lorg/osmdroid/util/TileSystem;->GroundResolutionMapSize(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static GroundResolution(DI)D
    .locals 2

    int-to-double v0, p2

    .line 1
    invoke-static {p0, p1, v0, v1}, Lorg/osmdroid/util/TileSystem;->GroundResolution(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static GroundResolutionMapSize(DD)D
    .locals 6

    .line 1
    const-wide v2, -0x3fa9800000000000L    # -90.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v4, 0x4056800000000000L    # 90.0

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    move-wide v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    mul-double/2addr p0, v0

    .line 22
    const-wide v2, 0x4066800000000000L    # 180.0

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    div-double/2addr p0, v2

    .line 28
    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 33
    .line 34
    mul-double/2addr p0, v2

    .line 35
    mul-double/2addr p0, v0

    .line 36
    const-wide v0, 0x415854a640000000L    # 6378137.0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    mul-double/2addr p0, v0

    .line 42
    div-double/2addr p0, p2

    .line 43
    return-wide p0
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

.method public static MapScale(DII)D
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->GroundResolution(DI)D

    move-result-wide p0

    int-to-double p2, p3

    mul-double/2addr p0, p2

    const-wide p2, 0x3f9a027525460aa6L    # 0.0254

    div-double/2addr p0, p2

    return-wide p0
.end method

.method public static MapSize(D)D
    .locals 2

    .line 2
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p0, p1}, Lorg/osmdroid/util/TileSystem;->getFactor(D)D

    move-result-wide p0

    mul-double/2addr v0, p0

    return-wide v0
.end method

.method public static MapSize(I)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    int-to-double v0, p0

    .line 1
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int p0, v0

    return p0
.end method

.method public static QuadKeyToTileXY(Ljava/lang/String;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/graphics/Point;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const-string v0, "Invalid QuadKey: "

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    move v4, v3

    .line 25
    :goto_0
    if-ge v2, v1, :cond_1

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    shl-int v6, v5, v2

    .line 29
    .line 30
    sub-int v7, v1, v2

    .line 31
    .line 32
    sub-int/2addr v7, v5

    .line 33
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    packed-switch v5, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :pswitch_0
    add-int/2addr v3, v6

    .line 62
    :pswitch_1
    add-int/2addr v4, v6

    .line 63
    goto :goto_1

    .line 64
    :pswitch_2
    add-int/2addr v3, v6

    .line 65
    :goto_1
    :pswitch_3
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iput v3, p1, Landroid/graphics/Point;->x:I

    .line 69
    .line 70
    iput v4, p1, Landroid/graphics/Point;->y:I

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
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

.method public static TileXYToQuadKey(III)Ljava/lang/String;
    .locals 5

    .line 1
    new-array v0, p2, [C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p2, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    shl-int v3, v2, v1

    .line 8
    .line 9
    and-int v4, p0, v3

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    const/16 v4, 0x31

    .line 14
    .line 15
    int-to-char v4, v4

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/16 v4, 0x30

    .line 18
    .line 19
    :goto_1
    and-int/2addr v3, p1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    int-to-char v3, v4

    .line 25
    add-int/2addr v3, v2

    .line 26
    int-to-char v4, v3

    .line 27
    :cond_1
    sub-int v3, p2, v1

    .line 28
    .line 29
    sub-int/2addr v3, v2

    .line 30
    aput-char v4, v0, v3

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 38
    .line 39
    .line 40
    return-object p0
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
.end method

.method private clipTile(II)I
    .locals 1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    shl-int p2, v0, p2

    if-lt p1, p2, :cond_1

    sub-int/2addr p2, v0

    return p2

    :cond_1
    return p1
.end method

.method public static getFactor(D)D
    .locals 2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static getInputTileZoomLevel(D)I
    .locals 0

    invoke-static {p0, p1}, Lorg/osmdroid/util/MyMath;->floorToInt(D)I

    move-result p0

    return p0
.end method

.method public static getMaximumZoomLevel()I
    .locals 1

    sget v0, Lorg/osmdroid/util/TileSystem;->mMaxZoomLevel:I

    return v0
.end method

.method public static getMercatorFromTile(ID)J
    .locals 2

    int-to-double v0, p0

    mul-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    return-wide p0
.end method

.method public static getTileFromMercator(JD)I
    .locals 0

    long-to-double p0, p0

    div-double/2addr p0, p2

    .line 1
    invoke-static {p0, p1}, Lorg/osmdroid/util/MyMath;->floorToInt(D)I

    move-result p0

    return p0
.end method

.method public static getTileFromMercator(Lorg/osmdroid/util/RectL;DLandroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 2

    if-nez p3, :cond_0

    .line 2
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 3
    :cond_0
    iget-wide v0, p0, Lorg/osmdroid/util/RectL;->left:J

    invoke-static {v0, v1, p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p3, Landroid/graphics/Rect;->left:I

    .line 4
    iget-wide v0, p0, Lorg/osmdroid/util/RectL;->top:J

    invoke-static {v0, v1, p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p3, Landroid/graphics/Rect;->top:I

    .line 5
    iget-wide v0, p0, Lorg/osmdroid/util/RectL;->right:J

    invoke-static {v0, v1, p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p3, Landroid/graphics/Rect;->right:I

    .line 6
    iget-wide v0, p0, Lorg/osmdroid/util/RectL;->bottom:J

    invoke-static {v0, v1, p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result p0

    iput p0, p3, Landroid/graphics/Rect;->bottom:I

    return-object p3
.end method

.method public static getTileSize(D)D
    .locals 2

    .line 2
    invoke-static {p0, p1}, Lorg/osmdroid/util/TileSystem;->getInputTileZoomLevel(D)I

    move-result v0

    int-to-double v0, v0

    sub-double/2addr p0, v0

    invoke-static {p0, p1}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static getTileSize()I
    .locals 1

    .line 1
    sget v0, Lorg/osmdroid/util/TileSystem;->mTileSize:I

    return v0
.end method

.method public static setTileSize(I)V
    .locals 4

    .line 1
    int-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 7
    .line 8
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    div-double/2addr v0, v2

    .line 13
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 14
    .line 15
    add-double/2addr v0, v2

    .line 16
    double-to-int v0, v0

    .line 17
    rsub-int/lit8 v0, v0, 0x3f

    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    const/16 v1, 0x1d

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sput v0, Lorg/osmdroid/util/TileSystem;->mMaxZoomLevel:I

    .line 28
    .line 29
    sput p0, Lorg/osmdroid/util/TileSystem;->mTileSize:I

    .line 30
    .line 31
    return-void
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

.method public static truncateToInt(J)I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    const-wide/32 v0, -0x80000000

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method private static wrap(DDDD)D
    .locals 4

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_3

    .line 4
    .line 5
    sub-double v0, p4, p2

    .line 6
    .line 7
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 8
    .line 9
    add-double/2addr v0, v2

    .line 10
    cmpl-double v0, p6, v0

    .line 11
    .line 12
    if-gtz v0, :cond_2

    .line 13
    .line 14
    :goto_0
    cmpg-double v0, p0, p2

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    add-double/2addr p0, p6

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :goto_1
    cmpl-double p2, p0, p4

    .line 21
    .line 22
    if-lez p2, :cond_1

    .line 23
    .line 24
    sub-double/2addr p0, p6

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    return-wide p0

    .line 27
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v0, "interval must be equal or smaller than maxValue-minValue: min: "

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p2, " max:"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p2, " int:"

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p6, p7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string p6, "minValue must be smaller than maxValue: "

    .line 74
    .line 75
    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p2, ">"

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0
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
.end method


# virtual methods
.method public LatLongToPixelXY(DDILandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p6, :cond_0

    .line 1
    new-instance p6, Landroid/graphics/Point;

    invoke-direct {p6}, Landroid/graphics/Point;-><init>()V

    .line 2
    :cond_0
    invoke-static {p5}, Lorg/osmdroid/util/TileSystem;->MapSize(I)I

    move-result p5

    int-to-double v6, p5

    const/4 v5, 0x1

    move-object v0, p0

    move-wide v1, p3

    move-wide v3, v6

    .line 3
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorXFromLongitude(DDZ)J

    move-result-wide p3

    invoke-static {p3, p4}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result p3

    iput p3, p6, Landroid/graphics/Point;->x:I

    move-wide v1, p1

    .line 4
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorYFromLatitude(DDZ)J

    move-result-wide p1

    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result p1

    iput p1, p6, Landroid/graphics/Point;->y:I

    return-object p6
.end method

.method public LatLongToPixelXY(DDDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 16
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide v2, -0x3fa9800000000000L    # -90.0

    const-wide v4, 0x4056800000000000L    # 90.0

    const-wide v6, 0x4066800000000000L    # 180.0

    move-wide/from16 v0, p1

    .line 5
    invoke-static/range {v0 .. v7}, Lorg/osmdroid/util/TileSystem;->wrap(DDDD)D

    move-result-wide v9

    const-wide v2, -0x3f99800000000000L    # -180.0

    const-wide v4, 0x4066800000000000L    # 180.0

    const-wide v6, 0x4076800000000000L    # 360.0

    move-wide/from16 v0, p3

    .line 6
    invoke-static/range {v0 .. v7}, Lorg/osmdroid/util/TileSystem;->wrap(DDDD)D

    move-result-wide v11

    .line 7
    invoke-static/range {p5 .. p6}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide v13

    move-object/from16 v8, p0

    move-object/from16 v15, p7

    .line 8
    invoke-virtual/range {v8 .. v15}, Lorg/osmdroid/util/TileSystem;->LatLongToPixelXYMapSize(DDDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    move-result-object v0

    return-object v0
.end method

.method public LatLongToPixelXYMapSize(DDDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v8, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-object/from16 v7, p7

    invoke-virtual/range {v0 .. v8}, Lorg/osmdroid/util/TileSystem;->getMercatorFromGeo(DDDLorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    move-result-object v0

    return-object v0
.end method

.method public PixelXYToLatLong(IIDLorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    int-to-long v1, p1

    int-to-long v3, p2

    .line 2
    invoke-static {p3, p4}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide v5

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v0, p0

    move-object v7, p5

    invoke-virtual/range {v0 .. v9}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public PixelXYToLatLong(IIILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    int-to-long v1, p1

    int-to-long v3, p2

    .line 1
    invoke-static {p3}, Lorg/osmdroid/util/TileSystem;->MapSize(I)I

    move-result p1

    int-to-double v5, p1

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v0, p0

    move-object v7, p4

    invoke-virtual/range {v0 .. v9}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public PixelXYToLatLongMapSize(IIDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move v0, p1

    int-to-long v1, v0

    move v0, p2

    int-to-long v3, v0

    move-object v0, p0

    move-wide v5, p3

    move-object v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v0 .. v9}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public PixelXYToLatLongMapSizeWithoutWrap(IIDLorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;
    .locals 4

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    new-instance p5, Lorg/osmdroid/util/GeoPoint;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-direct {p5, v0, v1, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 8
    .line 9
    .line 10
    :cond_0
    int-to-double v0, p1

    .line 11
    div-double/2addr v0, p3

    .line 12
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 13
    .line 14
    sub-double/2addr v0, v2

    .line 15
    int-to-double p1, p2

    .line 16
    div-double/2addr p1, p3

    .line 17
    sub-double/2addr v2, p1

    .line 18
    neg-double p1, v2

    .line 19
    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    .line 20
    .line 21
    mul-double/2addr p1, p3

    .line 22
    const-wide p3, 0x400921fb54442d18L    # Math.PI

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    mul-double/2addr p1, p3

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->exp(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    const-wide v2, 0x4076800000000000L    # 360.0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    mul-double/2addr p1, v2

    .line 42
    div-double/2addr p1, p3

    .line 43
    const-wide p3, 0x4056800000000000L    # 90.0

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    sub-double/2addr p3, p1

    .line 49
    mul-double/2addr v0, v2

    .line 50
    invoke-virtual {p5, p3, p4}, Lorg/osmdroid/util/GeoPoint;->setLatitude(D)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p5, v0, v1}, Lorg/osmdroid/util/GeoPoint;->setLongitude(D)V

    .line 54
    .line 55
    .line 56
    return-object p5
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
.end method

.method public PixelXYToLatLongWithoutWrap(IIDLorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;
    .locals 6

    .line 1
    invoke-static {p3, p4}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v3

    .line 5
    move-object v0, p0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v5, p5

    .line 9
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->PixelXYToLatLongMapSizeWithoutWrap(IIDLorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public PixelXYToTileXY(IIDLandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p5, :cond_0

    .line 2
    new-instance p5, Landroid/graphics/Point;

    invoke-direct {p5}, Landroid/graphics/Point;-><init>()V

    :cond_0
    int-to-long v0, p1

    .line 3
    invoke-static {v0, v1, p3, p4}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result p1

    iput p1, p5, Landroid/graphics/Point;->x:I

    int-to-long p1, p2

    .line 4
    invoke-static {p1, p2, p3, p4}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result p1

    iput p1, p5, Landroid/graphics/Point;->y:I

    return-object p5
.end method

.method public PixelXYToTileXY(IILandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    move-result v0

    int-to-double v4, v0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/util/TileSystem;->PixelXYToTileXY(IIDLandroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public PixelXYToTileXY(Landroid/graphics/Rect;DLandroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p4, :cond_0

    .line 5
    new-instance p4, Landroid/graphics/Rect;

    invoke-direct {p4}, Landroid/graphics/Rect;-><init>()V

    .line 6
    :cond_0
    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-long v0, v0

    invoke-static {v0, v1, p2, p3}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p4, Landroid/graphics/Rect;->left:I

    .line 7
    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-long v0, v0

    invoke-static {v0, v1, p2, p3}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p4, Landroid/graphics/Rect;->top:I

    .line 8
    iget v0, p1, Landroid/graphics/Rect;->right:I

    int-to-long v0, v0

    invoke-static {v0, v1, p2, p3}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result v0

    iput v0, p4, Landroid/graphics/Rect;->right:I

    .line 9
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-long v0, p1

    invoke-static {v0, v1, p2, p3}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result p1

    iput p1, p4, Landroid/graphics/Rect;->bottom:I

    return-object p4
.end method

.method public TileXYToPixelXY(IILandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p3, :cond_0

    .line 1
    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    .line 2
    :cond_0
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    move-result v0

    int-to-double v0, v0

    .line 3
    invoke-static {p1, v0, v1}, Lorg/osmdroid/util/TileSystem;->getMercatorFromTile(ID)J

    move-result-wide v2

    invoke-static {v2, v3}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result p1

    iput p1, p3, Landroid/graphics/Point;->x:I

    .line 4
    invoke-static {p2, v0, v1}, Lorg/osmdroid/util/TileSystem;->getMercatorFromTile(ID)J

    move-result-wide p1

    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result p1

    iput p1, p3, Landroid/graphics/Point;->y:I

    return-object p3
.end method

.method public TileXYToPixelXY(IIDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p5, :cond_0

    .line 5
    new-instance p5, Lorg/osmdroid/util/PointL;

    invoke-direct {p5}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 6
    :cond_0
    invoke-static {p1, p3, p4}, Lorg/osmdroid/util/TileSystem;->getMercatorFromTile(ID)J

    move-result-wide v0

    iput-wide v0, p5, Lorg/osmdroid/util/PointL;->x:J

    .line 7
    invoke-static {p2, p3, p4}, Lorg/osmdroid/util/TileSystem;->getMercatorFromTile(ID)J

    move-result-wide p1

    iput-wide p1, p5, Lorg/osmdroid/util/PointL;->y:J

    return-object p5
.end method

.method public cleanLatitude(D)D
    .locals 6

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    move-result-wide v4

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    move-result-wide p1

    return-wide p1
.end method

.method public cleanLongitude(D)D
    .locals 6

    :goto_0
    const-wide v0, -0x3f99800000000000L    # -180.0

    cmpg-double v0, p1, v0

    const-wide v1, 0x4076800000000000L    # 360.0

    if-gez v0, :cond_0

    add-double/2addr p1, v1

    goto :goto_0

    :cond_0
    :goto_1
    const-wide v3, 0x4066800000000000L    # 180.0

    cmpl-double v0, p1, v3

    if-lez v0, :cond_1

    sub-double/2addr p1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    move-result-wide v2

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    move-result-wide v4

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    move-result-wide p1

    return-wide p1
.end method

.method public getBoundingBoxZoom(Lorg/osmdroid/util/BoundingBox;II)D
    .locals 8

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    move-object v0, p0

    .line 10
    move v5, p2

    .line 11
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getLongitudeZoom(DDI)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    move-object v2, p0

    .line 24
    move v7, p3

    .line 25
    invoke-virtual/range {v2 .. v7}, Lorg/osmdroid/util/TileSystem;->getLatitudeZoom(DDI)D

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    const-wide/16 v2, 0x1

    .line 30
    .line 31
    cmpl-double p3, v0, v2

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    return-wide p1

    .line 36
    :cond_0
    cmpl-double p3, p1, v2

    .line 37
    .line 38
    if-nez p3, :cond_1

    .line 39
    .line 40
    return-wide v0

    .line 41
    :cond_1
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    return-wide p1
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
.end method

.method public getCleanMercator(JDZ)J
    .locals 8

    if-eqz p5, :cond_0

    long-to-double v0, p1

    const-wide/16 v2, 0x0

    move-wide v4, p3

    move-wide v6, p3

    invoke-static/range {v0 .. v7}, Lorg/osmdroid/util/TileSystem;->wrap(DDDD)D

    move-result-wide p1

    goto :goto_0

    :cond_0
    long-to-double p1, p1

    :goto_0
    invoke-static {p1, p2, p3, p4, p5}, Lorg/osmdroid/util/TileSystem;->ClipToLong(DDZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;
    .locals 6

    .line 1
    if-nez p7, :cond_0

    .line 2
    .line 3
    new-instance p7, Lorg/osmdroid/util/GeoPoint;

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    invoke-direct {p7, v0, v1, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 8
    .line 9
    .line 10
    :cond_0
    move-object v0, p0

    .line 11
    move-wide v1, p3

    .line 12
    move-wide v3, p5

    .line 13
    move v5, p9

    .line 14
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getXY01FromMercator(JDZ)D

    .line 15
    .line 16
    .line 17
    move-result-wide p3

    .line 18
    invoke-virtual {p0, p3, p4, p9}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromY01(DZ)D

    .line 19
    .line 20
    .line 21
    move-result-wide p3

    .line 22
    invoke-virtual {p7, p3, p4}, Lorg/osmdroid/util/GeoPoint;->setLatitude(D)V

    .line 23
    .line 24
    .line 25
    move-wide v1, p1

    .line 26
    move v5, p8

    .line 27
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getXY01FromMercator(JDZ)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    invoke-virtual {p0, p1, p2, p8}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromX01(DZ)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    invoke-virtual {p7, p1, p2}, Lorg/osmdroid/util/GeoPoint;->setLongitude(D)V

    .line 36
    .line 37
    .line 38
    return-object p7
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
.end method

.method public getLatitudeFromTileY(II)D
    .locals 2

    invoke-direct {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->clipTile(II)I

    move-result p1

    int-to-double v0, p1

    const/4 p1, 0x1

    shl-int/2addr p1, p2

    int-to-double p1, p1

    div-double/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromY01(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public abstract getLatitudeFromY01(D)D
.end method

.method public getLatitudeFromY01(DZ)D
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    move-wide v0, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getLatitudeFromY01(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :cond_1
    return-wide v0
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

.method public getLatitudeZoom(DDI)D
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/util/TileSystem;->getY01FromLatitude(DZ)D

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    invoke-virtual {p0, p3, p4, v0}, Lorg/osmdroid/util/TileSystem;->getY01FromLatitude(DZ)D

    .line 7
    .line 8
    .line 9
    move-result-wide p3

    .line 10
    sub-double/2addr p3, p1

    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    cmpg-double p1, p3, p1

    .line 14
    .line 15
    if-gtz p1, :cond_0

    .line 16
    .line 17
    const-wide/16 p1, 0x1

    .line 18
    .line 19
    return-wide p1

    .line 20
    :cond_0
    int-to-double p1, p5

    .line 21
    div-double/2addr p1, p3

    .line 22
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    int-to-double p3, p3

    .line 27
    div-double/2addr p1, p3

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    .line 33
    .line 34
    invoke-static {p3, p4}, Ljava/lang/Math;->log(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide p3

    .line 38
    div-double/2addr p1, p3

    .line 39
    return-wide p1
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
.end method

.method public getLongitudeFromTileX(II)D
    .locals 2

    invoke-direct {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->clipTile(II)I

    move-result p1

    int-to-double v0, p1

    const/4 p1, 0x1

    shl-int/2addr p1, p2

    int-to-double p1, p1

    div-double/2addr v0, p1

    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromX01(D)D

    move-result-wide p1

    return-wide p1
.end method

.method public abstract getLongitudeFromX01(D)D
.end method

.method public getLongitudeFromX01(DZ)D
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    move-wide v0, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getLongitudeFromX01(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :cond_1
    return-wide v0
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

.method public getLongitudeZoom(DDI)D
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p3, p4, v0}, Lorg/osmdroid/util/TileSystem;->getX01FromLongitude(DZ)D

    .line 3
    .line 4
    .line 5
    move-result-wide p3

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/util/TileSystem;->getX01FromLongitude(DZ)D

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    sub-double/2addr p1, p3

    .line 11
    const-wide/16 p3, 0x0

    .line 12
    .line 13
    cmpg-double v0, p1, p3

    .line 14
    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 18
    .line 19
    add-double/2addr p1, v0

    .line 20
    :cond_0
    cmpl-double p3, p1, p3

    .line 21
    .line 22
    if-nez p3, :cond_1

    .line 23
    .line 24
    const-wide/16 p1, 0x1

    .line 25
    .line 26
    return-wide p1

    .line 27
    :cond_1
    int-to-double p3, p5

    .line 28
    div-double/2addr p3, p1

    .line 29
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-double p1, p1

    .line 34
    div-double/2addr p3, p1

    .line 35
    invoke-static {p3, p4}, Ljava/lang/Math;->log(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    .line 40
    .line 41
    invoke-static {p3, p4}, Ljava/lang/Math;->log(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    div-double/2addr p1, p3

    .line 46
    return-wide p1
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
.end method

.method public abstract getMaxLatitude()D
.end method

.method public abstract getMaxLongitude()D
.end method

.method public getMercatorFromGeo(DDDLorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;
    .locals 6

    .line 1
    if-nez p7, :cond_0

    .line 2
    .line 3
    new-instance p7, Lorg/osmdroid/util/PointL;

    .line 4
    .line 5
    invoke-direct {p7}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    move-wide v1, p3

    .line 10
    move-wide v3, p5

    .line 11
    move v5, p8

    .line 12
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorXFromLongitude(DDZ)J

    .line 13
    .line 14
    .line 15
    move-result-wide p3

    .line 16
    iput-wide p3, p7, Lorg/osmdroid/util/PointL;->x:J

    .line 17
    .line 18
    move-wide v1, p1

    .line 19
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorYFromLatitude(DDZ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iput-wide p1, p7, Lorg/osmdroid/util/PointL;->y:J

    .line 24
    .line 25
    return-object p7
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
.end method

.method public getMercatorFromXY01(DDZ)J
    .locals 0

    mul-double/2addr p1, p3

    invoke-static {p1, p2, p3, p4, p5}, Lorg/osmdroid/util/TileSystem;->ClipToLong(DDZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getMercatorXFromLongitude(DDZ)J
    .locals 6

    invoke-virtual {p0, p1, p2, p5}, Lorg/osmdroid/util/TileSystem;->getX01FromLongitude(DZ)D

    move-result-wide v1

    move-object v0, p0

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorFromXY01(DDZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getMercatorYFromLatitude(DDZ)J
    .locals 6

    invoke-virtual {p0, p1, p2, p5}, Lorg/osmdroid/util/TileSystem;->getY01FromLatitude(DZ)D

    move-result-wide v1

    move-object v0, p0

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorFromXY01(DDZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public abstract getMinLatitude()D
.end method

.method public abstract getMinLongitude()D
.end method

.method public getRandomLatitude(D)D
    .locals 2

    .line 2
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/osmdroid/util/TileSystem;->getRandomLatitude(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method public getRandomLatitude(DD)D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    move-result-wide v0

    sub-double/2addr v0, p3

    mul-double/2addr p1, v0

    add-double/2addr p1, p3

    return-wide p1
.end method

.method public getRandomLongitude(D)D
    .locals 4

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    move-result-wide v0

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    move-result-wide v2

    sub-double/2addr v0, v2

    mul-double/2addr p1, v0

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    move-result-wide v0

    add-double/2addr p1, v0

    return-wide p1
.end method

.method public getTileXFromLongitude(DI)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getX01FromLongitude(D)D

    move-result-wide p1

    const/4 v0, 0x1

    shl-int/2addr v0, p3

    int-to-double v0, v0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    move-result-wide p1

    double-to-int p1, p1

    invoke-direct {p0, p1, p3}, Lorg/osmdroid/util/TileSystem;->clipTile(II)I

    move-result p1

    return p1
.end method

.method public getTileYFromLatitude(DI)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getY01FromLatitude(D)D

    move-result-wide p1

    const/4 v0, 0x1

    shl-int/2addr v0, p3

    int-to-double v0, v0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    move-result-wide p1

    double-to-int p1, p1

    invoke-direct {p0, p1, p3}, Lorg/osmdroid/util/TileSystem;->clipTile(II)I

    move-result p1

    return p1
.end method

.method public abstract getX01FromLongitude(D)D
.end method

.method public getX01FromLongitude(DZ)D
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-wide v0, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getX01FromLongitude(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :cond_1
    return-wide v0
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

.method public getXY01FromMercator(JDZ)D
    .locals 6

    long-to-double p1, p1

    if-eqz p5, :cond_0

    div-double v0, p1, p3

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    move-result-wide p1

    goto :goto_0

    :cond_0
    div-double/2addr p1, p3

    :goto_0
    return-wide p1
.end method

.method public abstract getY01FromLatitude(D)D
.end method

.method public getY01FromLatitude(DZ)D
    .locals 6

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-wide v0, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/util/TileSystem;->getY01FromLatitude(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->Clip(DDD)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :cond_1
    return-wide v0
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

.method public isValidLatitude(D)Z
    .locals 2

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    move-result-wide v0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    move-result-wide v0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isValidLongitude(D)Z
    .locals 2

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    move-result-wide v0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    move-result-wide v0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toStringLatitudeSpan()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toStringLongitudeSpan()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
