.class public Lr4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/osmdroid/views/Projection;Ljava/util/List;Landroid/graphics/Path;)Landroid/graphics/Path;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/views/Projection;",
            "Ljava/util/List<",
            "+",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;",
            "Landroid/graphics/Path;",
            ")",
            "Landroid/graphics/Path;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lr4/b;->b(Lorg/osmdroid/views/Projection;Ljava/util/List;Landroid/graphics/Path;Z)Landroid/graphics/Path;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lorg/osmdroid/views/Projection;Ljava/util/List;Landroid/graphics/Path;Z)Landroid/graphics/Path;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/views/Projection;",
            "Ljava/util/List<",
            "+",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;",
            "Landroid/graphics/Path;",
            "Z)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    if-lt v1, v2, :cond_4

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v1, Landroid/graphics/Path;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/graphics/Path;->incReserve(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v13

    .line 35
    const/4 v3, 0x1

    .line 36
    move v14, v3

    .line 37
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v15, v3

    .line 48
    check-cast v15, Lorg/osmdroid/util/GeoPoint;

    .line 49
    .line 50
    new-instance v12, Landroid/graphics/Point;

    .line 51
    .line 52
    invoke-direct {v12}, Landroid/graphics/Point;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-static {v3, v4}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v16

    .line 63
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x1

    .line 73
    move-object v3, v2

    .line 74
    move-wide/from16 v8, v16

    .line 75
    .line 76
    invoke-virtual/range {v3 .. v11}, Lorg/osmdroid/util/TileSystem;->getMercatorFromGeo(DDDLorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-wide v4, v3, Lorg/osmdroid/util/PointL;->x:J

    .line 81
    .line 82
    invoke-virtual {v0, v4, v5}, Lorg/osmdroid/views/Projection;->getTileFromMercator(J)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    iput v4, v12, Landroid/graphics/Point;->x:I

    .line 87
    .line 88
    iget-wide v3, v3, Lorg/osmdroid/util/PointL;->y:J

    .line 89
    .line 90
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/views/Projection;->getTileFromMercator(J)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iput v3, v12, Landroid/graphics/Point;->y:I

    .line 95
    .line 96
    new-instance v3, Lorg/osmdroid/util/PointL;

    .line 97
    .line 98
    iget v4, v12, Landroid/graphics/Point;->x:I

    .line 99
    .line 100
    invoke-virtual {v0, v4}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    iget v6, v12, Landroid/graphics/Point;->y:I

    .line 105
    .line 106
    invoke-virtual {v0, v6}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    invoke-direct {v3, v4, v5, v6, v7}, Lorg/osmdroid/util/PointL;-><init>(JJ)V

    .line 111
    .line 112
    .line 113
    new-instance v11, Lorg/osmdroid/util/PointL;

    .line 114
    .line 115
    iget v4, v12, Landroid/graphics/Point;->x:I

    .line 116
    .line 117
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    add-int/2addr v4, v5

    .line 122
    invoke-virtual {v0, v4}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    iget v6, v12, Landroid/graphics/Point;->y:I

    .line 127
    .line 128
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    add-int/2addr v6, v7

    .line 133
    invoke-virtual {v0, v6}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    invoke-direct {v11, v4, v5, v6, v7}, Lorg/osmdroid/util/PointL;-><init>(JJ)V

    .line 138
    .line 139
    .line 140
    iget-wide v4, v3, Lorg/osmdroid/util/PointL;->x:J

    .line 141
    .line 142
    iget-wide v6, v3, Lorg/osmdroid/util/PointL;->y:J

    .line 143
    .line 144
    const/16 v18, 0x1

    .line 145
    .line 146
    const/16 v19, 0x1

    .line 147
    .line 148
    move-object v3, v2

    .line 149
    move-object/from16 v20, v11

    .line 150
    .line 151
    move/from16 v11, v18

    .line 152
    .line 153
    move-object/from16 p1, v13

    .line 154
    .line 155
    move-object v13, v12

    .line 156
    move/from16 v12, v19

    .line 157
    .line 158
    invoke-virtual/range {v3 .. v12}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    .line 159
    .line 160
    .line 161
    move-result-object v18

    .line 162
    move-object/from16 v3, v20

    .line 163
    .line 164
    iget-wide v4, v3, Lorg/osmdroid/util/PointL;->x:J

    .line 165
    .line 166
    iget-wide v6, v3, Lorg/osmdroid/util/PointL;->y:J

    .line 167
    .line 168
    const/4 v11, 0x1

    .line 169
    const/4 v12, 0x1

    .line 170
    move-object v3, v2

    .line 171
    invoke-virtual/range {v3 .. v12}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    new-instance v16, Lorg/osmdroid/util/BoundingBox;

    .line 176
    .line 177
    invoke-virtual/range {v18 .. v18}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    invoke-virtual/range {v18 .. v18}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 182
    .line 183
    .line 184
    move-result-wide v7

    .line 185
    invoke-virtual {v3}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v3}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 190
    .line 191
    .line 192
    move-result-wide v11

    .line 193
    move-object/from16 v4, v16

    .line 194
    .line 195
    invoke-direct/range {v4 .. v12}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 196
    .line 197
    .line 198
    if-eqz p3, :cond_1

    .line 199
    .line 200
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 201
    .line 202
    .line 203
    move-result-wide v3

    .line 204
    const-wide/high16 v5, 0x401c000000000000L    # 7.0

    .line 205
    .line 206
    cmpg-double v3, v3, v5

    .line 207
    .line 208
    if-gez v3, :cond_1

    .line 209
    .line 210
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 215
    .line 216
    .line 217
    move-result-wide v7

    .line 218
    const/4 v9, 0x0

    .line 219
    move-object/from16 v4, v16

    .line 220
    .line 221
    invoke-virtual/range {v4 .. v9}, Lorg/osmdroid/util/BoundingBox;->getRelativePositionOfGeoPointInBoundingBoxWithExactGudermannInterpolation(DDLandroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    goto :goto_2

    .line 226
    :cond_1
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 227
    .line 228
    .line 229
    move-result-wide v5

    .line 230
    invoke-virtual {v15}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 231
    .line 232
    .line 233
    move-result-wide v7

    .line 234
    const/4 v9, 0x0

    .line 235
    move-object/from16 v4, v16

    .line 236
    .line 237
    invoke-virtual/range {v4 .. v9}, Lorg/osmdroid/util/BoundingBox;->getRelativePositionOfGeoPointInBoundingBoxWithLinearInterpolation(DDLandroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/views/Projection;->getScreenRect()Landroid/graphics/Rect;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    new-instance v5, Landroid/graphics/Point;

    .line 246
    .line 247
    invoke-virtual {v4}, Landroid/graphics/Rect;->centerX()I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    int-to-long v6, v6

    .line 252
    invoke-virtual {v0, v6, v7}, Lorg/osmdroid/views/Projection;->getTileFromMercator(J)I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    int-to-long v7, v4

    .line 261
    invoke-virtual {v0, v7, v8}, Lorg/osmdroid/views/Projection;->getTileFromMercator(J)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    invoke-direct {v5, v6, v4}, Landroid/graphics/Point;-><init>(II)V

    .line 266
    .line 267
    .line 268
    new-instance v4, Lorg/osmdroid/util/PointL;

    .line 269
    .line 270
    iget v6, v5, Landroid/graphics/Point;->x:I

    .line 271
    .line 272
    invoke-virtual {v0, v6}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    iget v8, v5, Landroid/graphics/Point;->y:I

    .line 277
    .line 278
    invoke-virtual {v0, v8}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 279
    .line 280
    .line 281
    move-result-wide v8

    .line 282
    invoke-direct {v4, v6, v7, v8, v9}, Lorg/osmdroid/util/PointL;-><init>(JJ)V

    .line 283
    .line 284
    .line 285
    iget v6, v5, Landroid/graphics/Point;->x:I

    .line 286
    .line 287
    iget v7, v13, Landroid/graphics/Point;->x:I

    .line 288
    .line 289
    sub-int/2addr v6, v7

    .line 290
    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 291
    .line 292
    iget v7, v13, Landroid/graphics/Point;->y:I

    .line 293
    .line 294
    sub-int/2addr v5, v7

    .line 295
    iget-wide v7, v4, Lorg/osmdroid/util/PointL;->x:J

    .line 296
    .line 297
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    mul-int/2addr v9, v6

    .line 302
    int-to-long v9, v9

    .line 303
    sub-long/2addr v7, v9

    .line 304
    iget-wide v9, v4, Lorg/osmdroid/util/PointL;->y:J

    .line 305
    .line 306
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    mul-int/2addr v4, v5

    .line 311
    int-to-long v4, v4

    .line 312
    sub-long/2addr v9, v4

    .line 313
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 314
    .line 315
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    int-to-float v5, v5

    .line 320
    mul-float/2addr v4, v5

    .line 321
    float-to-long v4, v4

    .line 322
    add-long/2addr v7, v4

    .line 323
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 324
    .line 325
    invoke-static {}, Lorg/osmdroid/util/TileSystem;->getTileSize()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    int-to-float v4, v4

    .line 330
    mul-float/2addr v3, v4

    .line 331
    float-to-long v3, v3

    .line 332
    add-long/2addr v9, v3

    .line 333
    if-eqz v14, :cond_2

    .line 334
    .line 335
    long-to-float v3, v7

    .line 336
    long-to-float v4, v9

    .line 337
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 338
    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_2
    long-to-float v3, v7

    .line 342
    long-to-float v4, v9

    .line 343
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 344
    .line 345
    .line 346
    :goto_3
    const/4 v14, 0x0

    .line 347
    move-object/from16 v13, p1

    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_3
    return-object v1

    .line 352
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 353
    .line 354
    const-string v1, "List of GeoPoints needs to be at least 2."

    .line 355
    .line 356
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v0
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
