.class public Lorg/osmdroid/views/Projection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/api/IProjection;


# static fields
.field public static final mProjectedMapSize:D = 1.15292150460684698E18


# instance fields
.field private horizontalWrapEnabled:Z

.field private final mBoundingBoxProjection:Lorg/osmdroid/util/BoundingBox;

.field private final mCurrentCenter:Lorg/osmdroid/util/GeoPoint;

.field private final mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

.field private final mMapCenterOffsetX:I

.field private final mMapCenterOffsetY:I

.field private final mMercatorMapSize:D

.field private mOffsetX:J

.field private mOffsetY:J

.field private final mOrientation:F

.field private final mRotateAndScaleMatrix:Landroid/graphics/Matrix;

.field private final mRotateScalePoints:[F

.field private final mScreenRectProjection:Landroid/graphics/Rect;

.field private mScrollX:J

.field private mScrollY:J

.field private final mTileSize:D

.field private final mTileSystem:Lorg/osmdroid/util/TileSystem;

.field private final mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

.field private final mZoomLevelProjection:D

.field private verticalWrapEnabled:Z


# direct methods
.method public constructor <init>(DIILorg/osmdroid/util/GeoPoint;FZZII)V
    .locals 15

    .line 35
    new-instance v3, Landroid/graphics/Rect;

    const/4 v0, 0x0

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-direct {v3, v0, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    .line 36
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    move-result-object v12

    move-object v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v4, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v13, p9

    move/from16 v14, p10

    .line 37
    invoke-direct/range {v0 .. v14}, Lorg/osmdroid/views/Projection;-><init>(DLandroid/graphics/Rect;Lorg/osmdroid/util/GeoPoint;JJFZZLorg/osmdroid/util/TileSystem;II)V

    return-void
.end method

.method public constructor <init>(DLandroid/graphics/Rect;Lorg/osmdroid/util/GeoPoint;JJFZZLorg/osmdroid/util/TileSystem;II)V
    .locals 13

    move-object v0, p0

    move/from16 v1, p9

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, v0, Lorg/osmdroid/views/Projection;->mRotateAndScaleMatrix:Landroid/graphics/Matrix;

    .line 12
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, v0, Lorg/osmdroid/views/Projection;->mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 13
    iput-object v4, v0, Lorg/osmdroid/views/Projection;->mRotateScalePoints:[F

    .line 14
    new-instance v4, Lorg/osmdroid/util/BoundingBox;

    invoke-direct {v4}, Lorg/osmdroid/util/BoundingBox;-><init>()V

    iput-object v4, v0, Lorg/osmdroid/views/Projection;->mBoundingBoxProjection:Lorg/osmdroid/util/BoundingBox;

    .line 15
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, v0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    .line 16
    new-instance v4, Lorg/osmdroid/util/GeoPoint;

    const-wide/16 v5, 0x0

    invoke-direct {v4, v5, v6, v5, v6}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    iput-object v4, v0, Lorg/osmdroid/views/Projection;->mCurrentCenter:Lorg/osmdroid/util/GeoPoint;

    move/from16 v4, p13

    .line 17
    iput v4, v0, Lorg/osmdroid/views/Projection;->mMapCenterOffsetX:I

    move/from16 v4, p14

    .line 18
    iput v4, v0, Lorg/osmdroid/views/Projection;->mMapCenterOffsetY:I

    move-wide v7, p1

    .line 19
    iput-wide v7, v0, Lorg/osmdroid/views/Projection;->mZoomLevelProjection:D

    move/from16 v4, p10

    .line 20
    iput-boolean v4, v0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    move/from16 v4, p11

    .line 21
    iput-boolean v4, v0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    move-object/from16 v4, p12

    .line 22
    iput-object v4, v0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    .line 23
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->MapSize(D)D

    move-result-wide v9

    iput-wide v9, v0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    .line 24
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->getTileSize(D)D

    move-result-wide v7

    iput-wide v7, v0, Lorg/osmdroid/views/Projection;->mTileSize:D

    move-object/from16 v7, p3

    .line 25
    iput-object v7, v0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    if-eqz p4, :cond_0

    move-object/from16 v7, p4

    goto :goto_0

    .line 26
    :cond_0
    new-instance v7, Lorg/osmdroid/util/GeoPoint;

    invoke-direct {v7, v5, v6, v5, v6}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    :goto_0
    move-wide/from16 v5, p5

    .line 27
    iput-wide v5, v0, Lorg/osmdroid/views/Projection;->mScrollX:J

    move-wide/from16 v5, p7

    .line 28
    iput-wide v5, v0, Lorg/osmdroid/views/Projection;->mScrollY:J

    .line 29
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterX()I

    move-result v5

    int-to-long v5, v5

    iget-wide v11, v0, Lorg/osmdroid/views/Projection;->mScrollX:J

    sub-long/2addr v5, v11

    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v11

    iget-boolean v8, v0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    move-object/from16 p1, p12

    move-wide p2, v11

    move-wide/from16 p4, v9

    move/from16 p6, v8

    invoke-virtual/range {p1 .. p6}, Lorg/osmdroid/util/TileSystem;->getMercatorXFromLongitude(DDZ)J

    move-result-wide v11

    sub-long/2addr v5, v11

    iput-wide v5, v0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    .line 30
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterY()I

    move-result v5

    int-to-long v5, v5

    iget-wide v11, v0, Lorg/osmdroid/views/Projection;->mScrollY:J

    sub-long/2addr v5, v11

    invoke-virtual {v7}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v7

    iget-boolean v11, v0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    move-wide p2, v7

    move/from16 p6, v11

    invoke-virtual/range {p1 .. p6}, Lorg/osmdroid/util/TileSystem;->getMercatorYFromLatitude(DDZ)J

    move-result-wide v7

    sub-long/2addr v5, v7

    iput-wide v5, v0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    .line 31
    iput v1, v0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 32
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterX()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterY()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v2, v1, v4, v5}, Landroid/graphics/Matrix;->preRotate(FFF)Z

    .line 33
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 34
    invoke-direct {p0}, Lorg/osmdroid/views/Projection;->refresh()V

    return-void
.end method

.method constructor <init>(Lorg/osmdroid/views/MapView;)V
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getZoomLevelDouble()D

    move-result-wide v1

    const/4 v0, 0x0

    move-object/from16 v3, p1

    invoke-virtual {v3, v0}, Lorg/osmdroid/views/MapView;->getIntrinsicScreenRect(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v4

    .line 2
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getExpectedCenter()Lorg/osmdroid/util/GeoPoint;

    move-result-object v5

    .line 3
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getMapScrollX()J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getMapScrollY()J

    move-result-wide v8

    .line 4
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getMapOrientation()F

    move-result v10

    .line 5
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->isHorizontalMapRepetitionEnabled()Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->isVerticalMapRepetitionEnabled()Z

    move-result v12

    .line 6
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    move-result-object v13

    .line 7
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getMapCenterOffsetX()I

    move-result v14

    .line 8
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/MapView;->getMapCenterOffsetY()I

    move-result v15

    move-object/from16 v0, p0

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v6

    move-wide v7, v8

    move v9, v10

    move v10, v11

    move v11, v12

    move-object v12, v13

    move v13, v14

    move v14, v15

    .line 9
    invoke-direct/range {v0 .. v14}, Lorg/osmdroid/views/Projection;-><init>(DLandroid/graphics/Rect;Lorg/osmdroid/util/GeoPoint;JJFZZLorg/osmdroid/util/TileSystem;II)V

    return-void
.end method

.method private applyMatrixToPoint(IILandroid/graphics/Point;Landroid/graphics/Matrix;Z)Landroid/graphics/Point;
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p3, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p5, p0, Lorg/osmdroid/views/Projection;->mRotateScalePoints:[F

    .line 12
    .line 13
    int-to-float p1, p1

    .line 14
    const/4 v0, 0x0

    .line 15
    aput p1, p5, v0

    .line 16
    .line 17
    int-to-float p1, p2

    .line 18
    const/4 p2, 0x1

    .line 19
    aput p1, p5, p2

    .line 20
    .line 21
    invoke-virtual {p4, p5}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lorg/osmdroid/views/Projection;->mRotateScalePoints:[F

    .line 25
    .line 26
    aget p4, p1, v0

    .line 27
    .line 28
    float-to-int p4, p4

    .line 29
    iput p4, p3, Landroid/graphics/Point;->x:I

    .line 30
    .line 31
    aget p1, p1, p2

    .line 32
    .line 33
    float-to-int p1, p1

    .line 34
    iput p1, p3, Landroid/graphics/Point;->y:I

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iput p1, p3, Landroid/graphics/Point;->x:I

    .line 38
    .line 39
    iput p2, p3, Landroid/graphics/Point;->y:I

    .line 40
    .line 41
    :goto_1
    return-object p3
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

.method private getCloserPixel(JIID)J
    .locals 8

    .line 1
    add-int v0, p3, p4

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    int-to-long v2, p3

    .line 7
    cmp-long p3, p1, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    if-gez p3, :cond_3

    .line 12
    .line 13
    :goto_0
    cmp-long p3, p1, v2

    .line 14
    .line 15
    if-gez p3, :cond_0

    .line 16
    .line 17
    long-to-double v4, p1

    .line 18
    add-double/2addr v4, p5

    .line 19
    double-to-long v4, v4

    .line 20
    move-wide v6, p1

    .line 21
    move-wide p1, v4

    .line 22
    move-wide v4, v6

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    int-to-long p3, p4

    .line 25
    cmp-long p3, p1, p3

    .line 26
    .line 27
    if-gez p3, :cond_1

    .line 28
    .line 29
    return-wide p1

    .line 30
    :cond_1
    sub-long p3, v0, p1

    .line 31
    .line 32
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    sub-long/2addr v0, v4

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p5

    .line 41
    cmp-long p3, p3, p5

    .line 42
    .line 43
    if-gez p3, :cond_2

    .line 44
    .line 45
    return-wide p1

    .line 46
    :cond_2
    return-wide v4

    .line 47
    :cond_3
    :goto_1
    cmp-long p3, p1, v2

    .line 48
    .line 49
    if-ltz p3, :cond_4

    .line 50
    .line 51
    long-to-double v4, p1

    .line 52
    sub-double/2addr v4, p5

    .line 53
    double-to-long v4, v4

    .line 54
    move-wide v6, p1

    .line 55
    move-wide p1, v4

    .line 56
    move-wide v4, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_4
    int-to-long p3, p4

    .line 59
    cmp-long p3, v4, p3

    .line 60
    .line 61
    if-gez p3, :cond_5

    .line 62
    .line 63
    return-wide v4

    .line 64
    :cond_5
    sub-long p3, v0, p1

    .line 65
    .line 66
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p3

    .line 70
    sub-long/2addr v0, v4

    .line 71
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide p5

    .line 75
    cmp-long p3, p3, p5

    .line 76
    .line 77
    if-gez p3, :cond_6

    .line 78
    .line 79
    return-wide p1

    .line 80
    :cond_6
    return-wide v4
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

.method private getLongPixelFromMercator(JZJII)J
    .locals 7

    add-long v1, p1, p4

    if-eqz p3, :cond_0

    iget-wide v5, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    move-object v0, p0

    move v3, p6

    move v4, p7

    invoke-direct/range {v0 .. v6}, Lorg/osmdroid/views/Projection;->getCloserPixel(JIID)J

    move-result-wide v1

    :cond_0
    return-wide v1
.end method

.method private getLongPixelXFromMercator(JZ)J
    .locals 8

    iget-wide v4, p0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v6, v0, Landroid/graphics/Rect;->left:I

    iget v7, v0, Landroid/graphics/Rect;->right:I

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/Projection;->getLongPixelFromMercator(JZJII)J

    move-result-wide p1

    return-wide p1
.end method

.method private getLongPixelYFromMercator(JZ)J
    .locals 8

    iget-wide v4, p0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v6, v0, Landroid/graphics/Rect;->top:I

    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lorg/osmdroid/views/Projection;->getLongPixelFromMercator(JZJII)J

    move-result-wide p1

    return-wide p1
.end method

.method public static getScrollableOffset(JJDII)J
    .locals 5

    .line 1
    :goto_0
    sub-long v0, p2, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gez v4, :cond_0

    .line 8
    .line 9
    long-to-double p2, p2

    .line 10
    add-double/2addr p2, p4

    .line 11
    double-to-long p2, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    mul-int/lit8 p4, p7, 0x2

    .line 14
    .line 15
    sub-int p4, p6, p4

    .line 16
    .line 17
    int-to-long p4, p4

    .line 18
    cmp-long p4, v0, p4

    .line 19
    .line 20
    if-gez p4, :cond_3

    .line 21
    .line 22
    const-wide/16 p4, 0x2

    .line 23
    .line 24
    div-long/2addr v0, p4

    .line 25
    div-int/lit8 p6, p6, 0x2

    .line 26
    .line 27
    int-to-long p4, p6

    .line 28
    sub-long p6, p4, v0

    .line 29
    .line 30
    sub-long/2addr p6, p0

    .line 31
    cmp-long p0, p6, v2

    .line 32
    .line 33
    if-lez p0, :cond_1

    .line 34
    .line 35
    return-wide p6

    .line 36
    :cond_1
    add-long/2addr p4, v0

    .line 37
    sub-long/2addr p4, p2

    .line 38
    cmp-long p0, p4, v2

    .line 39
    .line 40
    if-gez p0, :cond_2

    .line 41
    .line 42
    return-wide p4

    .line 43
    :cond_2
    return-wide v2

    .line 44
    :cond_3
    int-to-long p4, p7

    .line 45
    sub-long/2addr p4, p0

    .line 46
    cmp-long p0, p4, v2

    .line 47
    .line 48
    if-gez p0, :cond_4

    .line 49
    .line 50
    return-wide p4

    .line 51
    :cond_4
    sub-int/2addr p6, p7

    .line 52
    int-to-long p0, p6

    .line 53
    sub-long/2addr p0, p2

    .line 54
    cmp-long p2, p0, v2

    .line 55
    .line 56
    if-lez p2, :cond_5

    .line 57
    .line 58
    return-wide p0

    .line 59
    :cond_5
    return-wide v2
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

.method private refresh()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterX()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterY()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lorg/osmdroid/views/Projection;->mCurrentCenter:Lorg/osmdroid/util/GeoPoint;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    cmpl-float v1, v0, v1

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/high16 v1, 0x43340000    # 180.0f

    .line 22
    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterX()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getScreenCenterY()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget v3, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 38
    .line 39
    iget-object v4, p0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3, v4}, Lorg/osmdroid/util/GeometryMath;->getBoundingBoxForRotatatedRectangle(Landroid/graphics/Rect;IIFLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget-object v1, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    .line 48
    .line 49
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 54
    .line 55
    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 58
    .line 59
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 62
    .line 63
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 64
    .line 65
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 68
    .line 69
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-virtual {p0, v1, v0, v2, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    cmpl-double v4, v4, v6

    .line 90
    .line 91
    if-lez v4, :cond_1

    .line 92
    .line 93
    new-instance v4, Lorg/osmdroid/util/GeoPoint;

    .line 94
    .line 95
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 100
    .line 101
    .line 102
    move-result-wide v7

    .line 103
    invoke-direct {v4, v5, v6, v7, v8}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 104
    .line 105
    .line 106
    move-object v0, v4

    .line 107
    :cond_1
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    cmpg-double v4, v4, v6

    .line 116
    .line 117
    if-gez v4, :cond_2

    .line 118
    .line 119
    new-instance v4, Lorg/osmdroid/util/GeoPoint;

    .line 120
    .line 121
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    invoke-direct {v4, v5, v6, v7, v8}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 130
    .line 131
    .line 132
    move-object v0, v4

    .line 133
    :cond_2
    iget-object v4, p0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    .line 134
    .line 135
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 138
    .line 139
    invoke-virtual {p0, v5, v4, v2, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 144
    .line 145
    .line 146
    move-result-wide v3

    .line 147
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    cmpl-double v3, v3, v5

    .line 152
    .line 153
    if-lez v3, :cond_3

    .line 154
    .line 155
    new-instance v3, Lorg/osmdroid/util/GeoPoint;

    .line 156
    .line 157
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 158
    .line 159
    .line 160
    move-result-wide v4

    .line 161
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 162
    .line 163
    .line 164
    move-result-wide v6

    .line 165
    invoke-direct {v3, v4, v5, v6, v7}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 166
    .line 167
    .line 168
    move-object v2, v3

    .line 169
    :cond_3
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    cmpg-double v3, v3, v5

    .line 178
    .line 179
    if-gez v3, :cond_4

    .line 180
    .line 181
    new-instance v3, Lorg/osmdroid/util/GeoPoint;

    .line 182
    .line 183
    invoke-virtual {v1}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    invoke-direct {v3, v4, v5, v1, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 192
    .line 193
    .line 194
    move-object v2, v3

    .line 195
    :cond_4
    iget-object v3, p0, Lorg/osmdroid/views/Projection;->mBoundingBoxProjection:Lorg/osmdroid/util/BoundingBox;

    .line 196
    .line 197
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 206
    .line 207
    .line 208
    move-result-wide v8

    .line 209
    invoke-interface {v2}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 210
    .line 211
    .line 212
    move-result-wide v10

    .line 213
    invoke-virtual/range {v3 .. v11}, Lorg/osmdroid/util/BoundingBox;->set(DDDD)V

    .line 214
    .line 215
    .line 216
    return-void
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


# virtual methods
.method adjustOffsets(DDZI)V
    .locals 15

    move-object v0, p0

    move-wide/from16 v1, p3

    const-wide/16 v3, 0x0

    if-eqz p5, :cond_0

    .line 8
    invoke-virtual/range {p0 .. p2}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    move-result-wide v5

    .line 9
    invoke-virtual {p0, v1, v2}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(D)J

    move-result-wide v7

    .line 10
    iget-wide v9, v0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    iget-object v1, v0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v11

    move/from16 v12, p6

    invoke-static/range {v5 .. v12}, Lorg/osmdroid/views/Projection;->getScrollableOffset(JJDII)J

    move-result-wide v1

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual/range {p0 .. p2}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    move-result-wide v5

    .line 12
    invoke-virtual {p0, v1, v2}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(D)J

    move-result-wide v7

    .line 13
    iget-wide v9, v0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    iget-object v1, v0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v11

    move/from16 v12, p6

    invoke-static/range {v5 .. v12}, Lorg/osmdroid/views/Projection;->getScrollableOffset(JJDII)J

    move-result-wide v1

    move-wide v13, v1

    move-wide v1, v3

    move-wide v3, v13

    .line 14
    :goto_0
    invoke-virtual {p0, v3, v4, v1, v2}, Lorg/osmdroid/views/Projection;->adjustOffsets(JJ)V

    return-void
.end method

.method adjustOffsets(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-void

    .line 15
    :cond_0
    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    .line 16
    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    add-long/2addr v0, p3

    iput-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    .line 17
    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mScrollX:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lorg/osmdroid/views/Projection;->mScrollX:J

    .line 18
    iget-wide p1, p0, Lorg/osmdroid/views/Projection;->mScrollY:J

    sub-long/2addr p1, p3

    iput-wide p1, p0, Lorg/osmdroid/views/Projection;->mScrollY:J

    .line 19
    invoke-direct {p0}, Lorg/osmdroid/views/Projection;->refresh()V

    return-void
.end method

.method public adjustOffsets(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/PointF;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 1
    :cond_1
    iget v0, p2, Landroid/graphics/PointF;->x:F

    float-to-int v0, v0

    iget p2, p2, Landroid/graphics/PointF;->y:F

    float-to-int p2, p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p2, v1}, Lorg/osmdroid/views/Projection;->unrotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p1, v1}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    .line 3
    iget v0, p2, Landroid/graphics/Point;->x:I

    iget v1, p1, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    .line 4
    iget p2, p2, Landroid/graphics/Point;->y:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    sub-int/2addr p2, p1

    int-to-long p1, p2

    .line 5
    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/osmdroid/views/Projection;->adjustOffsets(JJ)V

    return-void
.end method

.method public adjustOffsets(Lorg/osmdroid/util/BoundingBox;)V
    .locals 14
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    move-result-wide v1

    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    move-result-wide v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lorg/osmdroid/views/Projection;->adjustOffsets(DDZI)V

    .line 7
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getActualNorth()D

    move-result-wide v8

    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getActualSouth()D

    move-result-wide v10

    const/4 v12, 0x1

    const/4 v13, 0x0

    move-object v7, p0

    invoke-virtual/range {v7 .. v13}, Lorg/osmdroid/views/Projection;->adjustOffsets(DDZI)V

    return-void
.end method

.method public detach()V
    .locals 0

    return-void
.end method

.method public fromPixels(II)Lorg/osmdroid/api/IGeoPoint;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public fromPixels(IILorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/api/IGeoPoint;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;
    .locals 10

    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    invoke-virtual {p0, p1}, Lorg/osmdroid/views/Projection;->getMercatorXFromPixel(I)J

    move-result-wide v1

    iget-boolean p1, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    invoke-virtual {p0, v1, v2, p1}, Lorg/osmdroid/views/Projection;->getCleanMercator(JZ)J

    move-result-wide v1

    .line 4
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/Projection;->getMercatorYFromPixel(I)J

    move-result-wide p1

    iget-boolean v3, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    invoke-virtual {p0, p1, p2, v3}, Lorg/osmdroid/views/Projection;->getCleanMercator(JZ)J

    move-result-wide v3

    iget-wide v5, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    iget-boolean p1, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    const/4 p2, 0x0

    const/4 v7, 0x1

    if-nez p1, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    move v8, p2

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v7

    :goto_1
    iget-boolean p1, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    if-nez p1, :cond_3

    if-eqz p4, :cond_2

    goto :goto_2

    :cond_2
    move v9, p2

    goto :goto_3

    :cond_3
    :goto_2
    move v9, v7

    :goto_3
    move-object v7, p3

    .line 5
    invoke-virtual/range {v0 .. v9}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    return-object p1
.end method

.method public getBoundingBox()Lorg/osmdroid/util/BoundingBox;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mBoundingBoxProjection:Lorg/osmdroid/util/BoundingBox;

    return-object v0
.end method

.method public getCleanMercator(JZ)J
    .locals 6

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    iget-wide v3, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    move-wide v1, p1

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getCleanMercator(JDZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getCurrentCenter()Lorg/osmdroid/util/GeoPoint;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mCurrentCenter:Lorg/osmdroid/util/GeoPoint;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public getIntrinsicScreenRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getInvertedScaleRotateCanvasMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getLongPixelXFromLongitude(D)J
    .locals 6

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    iget-wide v3, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    const/4 v5, 0x0

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorXFromLongitude(DDZ)J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getLongPixelXFromLongitude(DZ)J
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    iget-wide v3, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    iget-boolean v1, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    if-nez v1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p3, 0x1

    :goto_1
    move v5, p3

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorXFromLongitude(DDZ)J

    move-result-wide p1

    iget-boolean p3, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    invoke-direct {p0, p1, p2, p3}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getLongPixelYFromLatitude(D)J
    .locals 6

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    iget-wide v3, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    const/4 v5, 0x0

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorYFromLatitude(DDZ)J

    move-result-wide p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getLongPixelYFromLatitude(DZ)J
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    iget-wide v3, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    iget-boolean v1, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    if-nez v1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p3, 0x1

    :goto_1
    move v5, p3

    move-wide v1, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/util/TileSystem;->getMercatorYFromLatitude(DDZ)J

    move-result-wide p1

    iget-boolean p3, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    invoke-direct {p0, p1, p2, p3}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p5, Lorg/osmdroid/util/PointL;

    .line 5
    .line 6
    invoke-direct {p5}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-wide v0, p1, Lorg/osmdroid/util/PointL;->x:J

    .line 10
    .line 11
    long-to-double v0, v0

    .line 12
    div-double/2addr v0, p2

    .line 13
    double-to-long v0, v0

    .line 14
    invoke-direct {p0, v0, v1, p4}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p5, Lorg/osmdroid/util/PointL;->x:J

    .line 19
    .line 20
    iget-wide v0, p1, Lorg/osmdroid/util/PointL;->y:J

    .line 21
    .line 22
    long-to-double v0, v0

    .line 23
    div-double/2addr v0, p2

    .line 24
    double-to-long p1, v0

    .line 25
    invoke-direct {p0, p1, p2, p4}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iput-wide p1, p5, Lorg/osmdroid/util/PointL;->y:J

    .line 30
    .line 31
    return-object p5
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

.method public getMercatorFromTile(I)J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mTileSize:D

    invoke-static {p1, v0, v1}, Lorg/osmdroid/util/TileSystem;->getMercatorFromTile(ID)J

    move-result-wide v0

    return-wide v0
.end method

.method public getMercatorViewPort(Lorg/osmdroid/util/RectL;)Lorg/osmdroid/util/RectL;
    .locals 13

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lorg/osmdroid/util/RectL;

    .line 5
    .line 6
    invoke-direct {p1}, Lorg/osmdroid/util/RectL;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 12
    .line 13
    int-to-float v2, v1

    .line 14
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 15
    .line 16
    int-to-float v4, v3

    .line 17
    iget v5, v0, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    int-to-float v6, v5

    .line 20
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 21
    .line 22
    int-to-float v7, v0

    .line 23
    iget v8, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    cmpl-float v8, v8, v9

    .line 27
    .line 28
    if-eqz v8, :cond_5

    .line 29
    .line 30
    const/16 v8, 0x8

    .line 31
    .line 32
    new-array v9, v8, [F

    .line 33
    .line 34
    int-to-float v10, v1

    .line 35
    const/4 v11, 0x0

    .line 36
    aput v10, v9, v11

    .line 37
    .line 38
    int-to-float v10, v5

    .line 39
    const/4 v12, 0x1

    .line 40
    aput v10, v9, v12

    .line 41
    .line 42
    int-to-float v10, v3

    .line 43
    const/4 v12, 0x2

    .line 44
    aput v10, v9, v12

    .line 45
    .line 46
    const/4 v10, 0x3

    .line 47
    int-to-float v12, v0

    .line 48
    aput v12, v9, v10

    .line 49
    .line 50
    const/4 v10, 0x4

    .line 51
    int-to-float v1, v1

    .line 52
    aput v1, v9, v10

    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    int-to-float v0, v0

    .line 56
    aput v0, v9, v1

    .line 57
    .line 58
    const/4 v0, 0x6

    .line 59
    int-to-float v1, v3

    .line 60
    aput v1, v9, v0

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    int-to-float v1, v5

    .line 64
    aput v1, v9, v0

    .line 65
    .line 66
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 69
    .line 70
    .line 71
    :goto_1
    if-ge v11, v8, :cond_5

    .line 72
    .line 73
    aget v0, v9, v11

    .line 74
    .line 75
    cmpl-float v1, v2, v0

    .line 76
    .line 77
    if-lez v1, :cond_1

    .line 78
    .line 79
    move v2, v0

    .line 80
    :cond_1
    cmpg-float v1, v4, v0

    .line 81
    .line 82
    if-gez v1, :cond_2

    .line 83
    .line 84
    move v4, v0

    .line 85
    :cond_2
    add-int/lit8 v0, v11, 0x1

    .line 86
    .line 87
    aget v0, v9, v0

    .line 88
    .line 89
    cmpl-float v1, v6, v0

    .line 90
    .line 91
    if-lez v1, :cond_3

    .line 92
    .line 93
    move v6, v0

    .line 94
    :cond_3
    cmpg-float v1, v7, v0

    .line 95
    .line 96
    if-gez v1, :cond_4

    .line 97
    .line 98
    move v7, v0

    .line 99
    :cond_4
    add-int/lit8 v11, v11, 0x2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    float-to-int v0, v2

    .line 103
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/Projection;->getMercatorXFromPixel(I)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    iput-wide v0, p1, Lorg/osmdroid/util/RectL;->left:J

    .line 108
    .line 109
    float-to-int v0, v6

    .line 110
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/Projection;->getMercatorYFromPixel(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    iput-wide v0, p1, Lorg/osmdroid/util/RectL;->top:J

    .line 115
    .line 116
    float-to-int v0, v4

    .line 117
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/Projection;->getMercatorXFromPixel(I)J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    iput-wide v0, p1, Lorg/osmdroid/util/RectL;->right:J

    .line 122
    .line 123
    float-to-int v0, v7

    .line 124
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/Projection;->getMercatorYFromPixel(I)J

    .line 125
    .line 126
    .line 127
    move-result-wide v0

    .line 128
    iput-wide v0, p1, Lorg/osmdroid/util/RectL;->bottom:J

    .line 129
    .line 130
    return-object p1
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

.method public getMercatorXFromPixel(I)J
    .locals 4

    int-to-long v0, p1

    iget-wide v2, p0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getMercatorYFromPixel(I)J
    .locals 4

    int-to-long v0, p1

    iget-wide v2, p0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getNorthEast()Lorg/osmdroid/api/IGeoPoint;
    .locals 4

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v0, v2, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public getOffsetX()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetX:J

    return-wide v0
.end method

.method public getOffsetY()J
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mOffsetY:J

    return-wide v0
.end method

.method public getOffspring(DLandroid/graphics/Rect;)Lorg/osmdroid/views/Projection;
    .locals 17

    move-object/from16 v0, p0

    new-instance v16, Lorg/osmdroid/views/Projection;

    iget-object v5, v0, Lorg/osmdroid/views/Projection;->mCurrentCenter:Lorg/osmdroid/util/GeoPoint;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    iget v10, v0, Lorg/osmdroid/views/Projection;->mOrientation:F

    iget-boolean v11, v0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    iget-boolean v12, v0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    iget-object v13, v0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, v16

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v15}, Lorg/osmdroid/views/Projection;-><init>(DLandroid/graphics/Rect;Lorg/osmdroid/util/GeoPoint;JJFZZLorg/osmdroid/util/TileSystem;II)V

    return-object v16
.end method

.method public getOrientation()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    return v0
.end method

.method public getPixelFromTile(IILandroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p3, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, v0, v1, v2}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p3, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-direct {p0, v0, v1, v2}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p3, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-direct {p0, v0, v1, v2}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p3, Landroid/graphics/Rect;->right:I

    .line 53
    .line 54
    add-int/lit8 p2, p2, 0x1

    .line 55
    .line 56
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/Projection;->getMercatorFromTile(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    invoke-direct {p0, p1, p2, v2}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput p1, p3, Landroid/graphics/Rect;->bottom:I

    .line 69
    .line 70
    return-object p3
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

.method public getPixelsFromProjected(Lorg/osmdroid/util/PointL;DLandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p4, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {p4}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    new-instance v6, Lorg/osmdroid/util/PointL;

    .line 10
    .line 11
    invoke-direct {v6}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move-wide v2, p2

    .line 18
    move-object v5, v6

    .line 19
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 20
    .line 21
    .line 22
    iget-wide p1, v6, Lorg/osmdroid/util/PointL;->x:J

    .line 23
    .line 24
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p4, Landroid/graphics/Point;->x:I

    .line 29
    .line 30
    iget-wide p1, v6, Lorg/osmdroid/util/PointL;->y:J

    .line 31
    .line 32
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p4, Landroid/graphics/Point;->y:I

    .line 37
    .line 38
    return-object p4
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

.method public getProjectedPowerDifference()D
    .locals 4

    const-wide/high16 v0, 0x43b0000000000000L    # 1.15292150460684698E18

    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    move-result-wide v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public getScaleRotateCanvasMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mRotateAndScaleMatrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getScreenCenterX()I
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    iget v0, p0, Lorg/osmdroid/views/Projection;->mMapCenterOffsetX:I

    add-int/2addr v1, v0

    return v1
.end method

.method public getScreenCenterY()I
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    iget v0, p0, Lorg/osmdroid/views/Projection;->mMapCenterOffsetY:I

    add-int/2addr v1, v0

    return v1
.end method

.method public getScreenRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mScreenRectProjection:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getSouthWest()Lorg/osmdroid/api/IGeoPoint;
    .locals 4

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v0, v2, v3}, Lorg/osmdroid/views/Projection;->fromPixels(IILorg/osmdroid/util/GeoPoint;Z)Lorg/osmdroid/api/IGeoPoint;

    move-result-object v0

    return-object v0
.end method

.method public getTileFromMercator(J)I
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mTileSize:D

    invoke-static {p1, p2, v0, v1}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(JD)I

    move-result p1

    return p1
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mIntrinsicScreenRectProjection:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public getWorldMapSize()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mMercatorMapSize:D

    return-wide v0
.end method

.method public getZoomLevel()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mZoomLevelProjection:D

    return-wide v0
.end method

.method public isHorizontalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    return v0
.end method

.method public isVerticalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    return v0
.end method

.method public metersToEquatorPixels(F)F
    .locals 6

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lorg/osmdroid/views/Projection;->mZoomLevelProjection:D

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->metersToPixels(FDD)F

    move-result p1

    return p1
.end method

.method public metersToPixels(F)F
    .locals 7

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getCenterWithDateLine()Lorg/osmdroid/util/GeoPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v3

    iget-wide v5, p0, Lorg/osmdroid/views/Projection;->mZoomLevelProjection:D

    move-object v1, p0

    move v2, p1

    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/Projection;->metersToPixels(FDD)F

    move-result p1

    return p1
.end method

.method public metersToPixels(FDD)F
    .locals 2

    float-to-double v0, p1

    .line 2
    invoke-static {p2, p3, p4, p5}, Lorg/osmdroid/util/TileSystem;->GroundResolution(DD)D

    move-result-wide p1

    div-double/2addr v0, p1

    double-to-float p1, v0

    return p1
.end method

.method public restore(Landroid/graphics/Canvas;Z)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 11
    .line 12
    .line 13
    :cond_1
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

.method public rotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 6

    iget-object v4, p0, Lorg/osmdroid/views/Projection;->mRotateAndScaleMatrix:Landroid/graphics/Matrix;

    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->applyMatrixToPoint(IILandroid/graphics/Point;Landroid/graphics/Matrix;Z)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public save(Landroid/graphics/Canvas;ZZ)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lorg/osmdroid/views/Projection;->mRotateAndScaleMatrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p2, p0, Lorg/osmdroid/views/Projection;->mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    return-void
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
.end method

.method setMapScroll(Lorg/osmdroid/views/MapView;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMapScrollX()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lorg/osmdroid/views/Projection;->mScrollX:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lorg/osmdroid/views/MapView;->getMapScrollY()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, Lorg/osmdroid/views/Projection;->mScrollY:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_0
    iget-wide v0, p0, Lorg/osmdroid/views/Projection;->mScrollX:J

    .line 24
    .line 25
    iget-wide v2, p0, Lorg/osmdroid/views/Projection;->mScrollY:J

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1, v2, v3}, Lorg/osmdroid/views/MapView;->setMapScroll(JJ)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1
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

.method public toMercatorPixels(IILorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p3, Lorg/osmdroid/util/PointL;

    .line 5
    .line 6
    invoke-direct {p3}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/Projection;->getMercatorXFromPixel(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-boolean p1, p0, Lorg/osmdroid/views/Projection;->horizontalWrapEnabled:Z

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, p1}, Lorg/osmdroid/views/Projection;->getCleanMercator(JZ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p3, Lorg/osmdroid/util/PointL;->x:J

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/Projection;->getMercatorYFromPixel(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iget-boolean v0, p0, Lorg/osmdroid/views/Projection;->verticalWrapEnabled:Z

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/Projection;->getCleanMercator(JZ)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p3, Lorg/osmdroid/util/PointL;->y:J

    .line 32
    .line 33
    return-object p3
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

.method public toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;Z)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;Z)Landroid/graphics/Point;
    .locals 2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    .line 3
    :goto_0
    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p3}, Lorg/osmdroid/views/Projection;->getLongPixelXFromLongitude(DZ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result v0

    iput v0, p2, Landroid/graphics/Point;->x:I

    .line 4
    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p3}, Lorg/osmdroid/views/Projection;->getLongPixelYFromLatitude(DZ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    move-result p1

    iput p1, p2, Landroid/graphics/Point;->y:I

    return-object p2
.end method

.method public toPixelsFromMercator(JJLandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p5, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {p5}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, p2, v0}, Lorg/osmdroid/views/Projection;->getLongPixelXFromMercator(JZ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p5, Landroid/graphics/Point;->x:I

    .line 19
    .line 20
    invoke-direct {p0, p3, p4, v0}, Lorg/osmdroid/views/Projection;->getLongPixelYFromMercator(JZ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p5, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    return-object p5
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

.method public toPixelsFromProjected(Lorg/osmdroid/util/PointL;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lorg/osmdroid/views/Projection;->getProjectedPowerDifference()D

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    new-instance v6, Lorg/osmdroid/util/PointL;

    .line 14
    .line 15
    invoke-direct {v6}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v5, v6

    .line 22
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 23
    .line 24
    .line 25
    iget-wide v0, v6, Lorg/osmdroid/util/PointL;->x:J

    .line 26
    .line 27
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p2, Landroid/graphics/Point;->x:I

    .line 32
    .line 33
    iget-wide v0, v6, Lorg/osmdroid/util/PointL;->y:J

    .line 34
    .line 35
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->truncateToInt(J)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p2, Landroid/graphics/Point;->y:I

    .line 40
    .line 41
    return-object p2
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

.method public toProjectedPixels(DDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 7

    const/4 v5, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v6, p5

    .line 3
    invoke-virtual/range {v0 .. v6}, Lorg/osmdroid/views/Projection;->toProjectedPixels(DDZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    move-result-object p1

    return-object p1
.end method

.method public toProjectedPixels(DDZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 9

    .line 4
    iget-object v0, p0, Lorg/osmdroid/views/Projection;->mTileSystem:Lorg/osmdroid/util/TileSystem;

    const-wide/high16 v5, 0x43b0000000000000L    # 1.15292150460684698E18

    move-wide v1, p1

    move-wide v3, p3

    move-object v7, p6

    move v8, p5

    invoke-virtual/range {v0 .. v8}, Lorg/osmdroid/util/TileSystem;->getMercatorFromGeo(DDDLorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    move-result-object p1

    return-object p1
.end method

.method public toProjectedPixels(JJLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    long-to-double p1, p1

    const-wide v0, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    mul-double v3, p1, v0

    long-to-double p1, p3

    mul-double v5, p1, v0

    move-object v2, p0

    move-object v7, p5

    .line 2
    invoke-virtual/range {v2 .. v7}, Lorg/osmdroid/views/Projection;->toProjectedPixels(DDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    move-result-object p1

    return-object p1
.end method

.method public toProjectedPixels(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->toProjectedPixels(DDLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    move-result-object p1

    return-object p1
.end method

.method public unrotateAndScalePoint(IILandroid/graphics/Point;)Landroid/graphics/Point;
    .locals 6

    iget-object v4, p0, Lorg/osmdroid/views/Projection;->mUnrotateAndScaleMatrix:Landroid/graphics/Matrix;

    iget v0, p0, Lorg/osmdroid/views/Projection;->mOrientation:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->applyMatrixToPoint(IILandroid/graphics/Point;Landroid/graphics/Matrix;Z)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method
