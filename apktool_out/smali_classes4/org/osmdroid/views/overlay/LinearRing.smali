.class public Lorg/osmdroid/views/overlay/LinearRing;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isHorizontalRepeating:Z

.field private isVerticalRepeating:Z

.field private final mBoundingBox:Lorg/osmdroid/util/BoundingBox;

.field private final mClosed:Z

.field private mDistances:[D

.field private mDistancesPrecomputed:Z

.field private mDowngradePixelSize:I

.field private mDowngradePointList:[F

.field private mGeodesic:Z

.field private final mIntegerAccepter:Lorg/osmdroid/util/IntegerAccepter;

.field private final mOriginalPoints:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation
.end field

.field private final mPath:Landroid/graphics/Path;

.field private final mPointAccepter:Lorg/osmdroid/util/PointAccepter;

.field private final mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

.field private final mProjectedCenter:Lorg/osmdroid/util/PointL;

.field private mProjectedHeight:J

.field private mProjectedPoints:[J

.field private mProjectedPrecomputed:Z

.field private mProjectedWidth:J

.field private final mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/osmdroid/views/overlay/LinearRing;-><init>(Landroid/graphics/Path;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Path;Z)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Lorg/osmdroid/util/PointL;

    invoke-direct {v0}, Lorg/osmdroid/util/PointL;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 22
    new-instance v0, Lorg/osmdroid/util/SegmentClipper;

    invoke-direct {v0}, Lorg/osmdroid/util/SegmentClipper;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 23
    new-instance v0, Lorg/osmdroid/util/BoundingBox;

    invoke-direct {v0}, Lorg/osmdroid/util/BoundingBox;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mBoundingBox:Lorg/osmdroid/util/BoundingBox;

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isHorizontalRepeating:Z

    .line 25
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isVerticalRepeating:Z

    .line 26
    new-instance v0, Lorg/osmdroid/util/ListPointL;

    invoke-direct {v0}, Lorg/osmdroid/util/ListPointL;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mGeodesic:Z

    .line 28
    iput-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPath:Landroid/graphics/Path;

    .line 29
    new-instance v0, Lorg/osmdroid/util/SideOptimizationPointAccepter;

    new-instance v1, Lorg/osmdroid/util/PathBuilder;

    invoke-direct {v1, p1}, Lorg/osmdroid/util/PathBuilder;-><init>(Landroid/graphics/Path;)V

    invoke-direct {v0, v1}, Lorg/osmdroid/util/SideOptimizationPointAccepter;-><init>(Lorg/osmdroid/util/PointAccepter;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointAccepter:Lorg/osmdroid/util/PointAccepter;

    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mIntegerAccepter:Lorg/osmdroid/util/IntegerAccepter;

    .line 31
    iput-boolean p2, p0, Lorg/osmdroid/views/overlay/LinearRing;->mClosed:Z

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/util/LineBuilder;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0}, Lorg/osmdroid/views/overlay/LinearRing;-><init>(Lorg/osmdroid/util/LineBuilder;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/util/LineBuilder;Z)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Lorg/osmdroid/util/PointL;

    invoke-direct {v0}, Lorg/osmdroid/util/PointL;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 5
    new-instance v0, Lorg/osmdroid/util/SegmentClipper;

    invoke-direct {v0}, Lorg/osmdroid/util/SegmentClipper;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 6
    new-instance v0, Lorg/osmdroid/util/BoundingBox;

    invoke-direct {v0}, Lorg/osmdroid/util/BoundingBox;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mBoundingBox:Lorg/osmdroid/util/BoundingBox;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isHorizontalRepeating:Z

    .line 8
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isVerticalRepeating:Z

    .line 9
    new-instance v0, Lorg/osmdroid/util/ListPointL;

    invoke-direct {v0}, Lorg/osmdroid/util/ListPointL;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mGeodesic:Z

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPath:Landroid/graphics/Path;

    .line 12
    iput-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointAccepter:Lorg/osmdroid/util/PointAccepter;

    .line 13
    instance-of v1, p1, Lorg/osmdroid/views/overlay/LineDrawer;

    if-eqz v1, :cond_0

    .line 14
    new-instance v0, Lorg/osmdroid/util/IntegerAccepter;

    invoke-virtual {p1}, Lorg/osmdroid/util/LineBuilder;->getLines()[F

    move-result-object v1

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Lorg/osmdroid/util/IntegerAccepter;-><init>(I)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mIntegerAccepter:Lorg/osmdroid/util/IntegerAccepter;

    .line 15
    check-cast p1, Lorg/osmdroid/views/overlay/LineDrawer;

    invoke-virtual {p1, v0}, Lorg/osmdroid/views/overlay/LineDrawer;->setIntegerAccepter(Lorg/osmdroid/util/IntegerAccepter;)V

    goto :goto_0

    .line 16
    :cond_0
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mIntegerAccepter:Lorg/osmdroid/util/IntegerAccepter;

    .line 17
    :goto_0
    iput-boolean p2, p0, Lorg/osmdroid/views/overlay/LinearRing;->mClosed:Z

    return-void
.end method

.method private clipAndStore(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;ZZLorg/osmdroid/util/SegmentClipper;)V
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v1, p2

    .line 3
    .line 4
    move-object/from16 v2, p5

    .line 5
    .line 6
    iget-object v3, v0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    .line 7
    .line 8
    invoke-virtual {v3}, Lorg/osmdroid/util/ListPointL;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getProjectedPowerDifference()D

    .line 12
    .line 13
    .line 14
    move-result-wide v10

    .line 15
    new-instance v3, Lorg/osmdroid/util/PointL;

    .line 16
    .line 17
    invoke-direct {v3}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v12, Lorg/osmdroid/util/PointL;

    .line 21
    .line 22
    invoke-direct {v12}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v13, Lorg/osmdroid/util/PointL;

    .line 26
    .line 27
    invoke-direct {v13}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move v14, v4

    .line 32
    :goto_0
    iget-object v4, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 33
    .line 34
    array-length v5, v4

    .line 35
    if-ge v14, v5, :cond_3

    .line 36
    .line 37
    aget-wide v5, v4, v14

    .line 38
    .line 39
    add-int/lit8 v7, v14, 0x1

    .line 40
    .line 41
    aget-wide v7, v4, v7

    .line 42
    .line 43
    invoke-virtual {v3, v5, v6, v7, v8}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    move-object/from16 v4, p1

    .line 48
    .line 49
    move-object v5, v3

    .line 50
    move-wide v6, v10

    .line 51
    move-object v9, v12

    .line 52
    invoke-virtual/range {v4 .. v9}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    .line 53
    .line 54
    .line 55
    iget-wide v4, v12, Lorg/osmdroid/util/PointL;->x:J

    .line 56
    .line 57
    iget-wide v6, v1, Lorg/osmdroid/util/PointL;->x:J

    .line 58
    .line 59
    add-long/2addr v4, v6

    .line 60
    iget-wide v6, v12, Lorg/osmdroid/util/PointL;->y:J

    .line 61
    .line 62
    iget-wide v8, v1, Lorg/osmdroid/util/PointL;->y:J

    .line 63
    .line 64
    add-long/2addr v6, v8

    .line 65
    if-eqz p4, :cond_0

    .line 66
    .line 67
    iget-object v8, v0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    .line 68
    .line 69
    invoke-virtual {v8, v4, v5, v6, v7}, Lorg/osmdroid/util/ListPointL;->add(JJ)V

    .line 70
    .line 71
    .line 72
    :cond_0
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {v2, v4, v5, v6, v7}, Lorg/osmdroid/util/SegmentClipper;->add(JJ)V

    .line 75
    .line 76
    .line 77
    :cond_1
    if-nez v14, :cond_2

    .line 78
    .line 79
    invoke-virtual {v13, v4, v5, v6, v7}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 80
    .line 81
    .line 82
    :cond_2
    add-int/lit8 v14, v14, 0x2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    if-eqz p3, :cond_5

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    iget-wide v3, v13, Lorg/osmdroid/util/PointL;->x:J

    .line 90
    .line 91
    iget-wide v5, v13, Lorg/osmdroid/util/PointL;->y:J

    .line 92
    .line 93
    invoke-virtual {v2, v3, v4, v5, v6}, Lorg/osmdroid/util/SegmentClipper;->add(JJ)V

    .line 94
    .line 95
    .line 96
    :cond_4
    if-eqz p4, :cond_5

    .line 97
    .line 98
    iget-object v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    .line 99
    .line 100
    iget-wide v2, v13, Lorg/osmdroid/util/PointL;->x:J

    .line 101
    .line 102
    iget-wide v4, v13, Lorg/osmdroid/util/PointL;->y:J

    .line 103
    .line 104
    invoke-virtual {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/ListPointL;->add(JJ)V

    .line 105
    .line 106
    .line 107
    :cond_5
    return-void
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

.method private computeDistances()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistancesPrecomputed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistancesPrecomputed:Z

    .line 8
    .line 9
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    iget-object v1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-array v0, v0, [D

    .line 29
    .line 30
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 31
    .line 32
    :cond_2
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    invoke-direct {v0, v1, v2, v1, v2}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x0

    .line 46
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lorg/osmdroid/util/GeoPoint;

    .line 57
    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    iget-object v6, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 61
    .line 62
    aput-wide v1, v6, v4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object v6, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 66
    .line 67
    invoke-virtual {v5, v0}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    aput-wide v7, v6, v4

    .line 72
    .line 73
    :goto_1
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    invoke-virtual {v5}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    invoke-virtual {v0, v6, v7, v8, v9}, Lorg/osmdroid/util/GeoPoint;->setCoords(DD)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    return-void
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

.method private computeProjected()V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPrecomputed:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPrecomputed:Z

    .line 10
    .line 11
    iget-object v2, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    iget-object v3, v0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    mul-int/lit8 v3, v3, 0x2

    .line 23
    .line 24
    if-eq v2, v3, :cond_2

    .line 25
    .line 26
    :cond_1
    iget-object v2, v0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    mul-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    new-array v2, v2, [J

    .line 35
    .line 36
    iput-object v2, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 37
    .line 38
    :cond_2
    new-instance v2, Lorg/osmdroid/util/PointL;

    .line 39
    .line 40
    invoke-direct {v2}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Lorg/osmdroid/util/PointL;

    .line 44
    .line 45
    invoke-direct {v12}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 49
    .line 50
    .line 51
    move-result-object v13

    .line 52
    iget-object v3, v0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v14

    .line 58
    const-wide/16 v3, 0x0

    .line 59
    .line 60
    const-wide/16 v5, 0x0

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    move-wide/from16 v16, v3

    .line 64
    .line 65
    move-wide/from16 v26, v16

    .line 66
    .line 67
    move-wide/from16 v28, v26

    .line 68
    .line 69
    move-wide/from16 v30, v28

    .line 70
    .line 71
    move-wide/from16 v18, v5

    .line 72
    .line 73
    move-wide/from16 v20, v18

    .line 74
    .line 75
    move-wide/from16 v22, v20

    .line 76
    .line 77
    move-wide/from16 v24, v22

    .line 78
    .line 79
    move v15, v7

    .line 80
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_8

    .line 85
    .line 86
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lorg/osmdroid/util/GeoPoint;

    .line 91
    .line 92
    invoke-virtual {v3}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 93
    .line 94
    .line 95
    move-result-wide v32

    .line 96
    invoke-virtual {v3}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 97
    .line 98
    .line 99
    move-result-wide v34

    .line 100
    const-wide/high16 v8, 0x43b0000000000000L    # 1.15292150460684698E18

    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    move-object v3, v13

    .line 104
    move-wide/from16 v4, v32

    .line 105
    .line 106
    move-wide/from16 v6, v34

    .line 107
    .line 108
    move-object v10, v12

    .line 109
    invoke-virtual/range {v3 .. v11}, Lorg/osmdroid/util/TileSystem;->getMercatorFromGeo(DDDLorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;

    .line 110
    .line 111
    .line 112
    if-nez v15, :cond_3

    .line 113
    .line 114
    iget-wide v3, v12, Lorg/osmdroid/util/PointL;->x:J

    .line 115
    .line 116
    iget-wide v5, v12, Lorg/osmdroid/util/PointL;->y:J

    .line 117
    .line 118
    move-wide/from16 v18, v3

    .line 119
    .line 120
    move-wide/from16 v20, v18

    .line 121
    .line 122
    move-wide/from16 v22, v5

    .line 123
    .line 124
    move-wide/from16 v24, v22

    .line 125
    .line 126
    move-wide/from16 v16, v32

    .line 127
    .line 128
    move-wide/from16 v28, v16

    .line 129
    .line 130
    move-wide/from16 v26, v34

    .line 131
    .line 132
    move-wide/from16 v30, v26

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const-wide/high16 v3, 0x43b0000000000000L    # 1.15292150460684698E18

    .line 136
    .line 137
    invoke-direct {v0, v2, v12, v3, v4}, Lorg/osmdroid/views/overlay/LinearRing;->setCloserPoint(Lorg/osmdroid/util/PointL;Lorg/osmdroid/util/PointL;D)V

    .line 138
    .line 139
    .line 140
    iget-wide v3, v12, Lorg/osmdroid/util/PointL;->x:J

    .line 141
    .line 142
    cmp-long v5, v20, v3

    .line 143
    .line 144
    if-lez v5, :cond_4

    .line 145
    .line 146
    move-wide/from16 v20, v3

    .line 147
    .line 148
    move-wide/from16 v30, v34

    .line 149
    .line 150
    :cond_4
    cmp-long v5, v18, v3

    .line 151
    .line 152
    if-gez v5, :cond_5

    .line 153
    .line 154
    move-wide/from16 v18, v3

    .line 155
    .line 156
    move-wide/from16 v26, v34

    .line 157
    .line 158
    :cond_5
    iget-wide v3, v12, Lorg/osmdroid/util/PointL;->y:J

    .line 159
    .line 160
    cmp-long v5, v24, v3

    .line 161
    .line 162
    if-lez v5, :cond_6

    .line 163
    .line 164
    move-wide/from16 v24, v3

    .line 165
    .line 166
    move-wide/from16 v16, v32

    .line 167
    .line 168
    :cond_6
    cmp-long v5, v22, v3

    .line 169
    .line 170
    if-gez v5, :cond_7

    .line 171
    .line 172
    move-wide/from16 v22, v3

    .line 173
    .line 174
    move-wide/from16 v28, v32

    .line 175
    .line 176
    :cond_7
    :goto_1
    iget-object v3, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 177
    .line 178
    mul-int/lit8 v4, v15, 0x2

    .line 179
    .line 180
    iget-wide v5, v12, Lorg/osmdroid/util/PointL;->x:J

    .line 181
    .line 182
    aput-wide v5, v3, v4

    .line 183
    .line 184
    add-int/2addr v4, v1

    .line 185
    iget-wide v7, v12, Lorg/osmdroid/util/PointL;->y:J

    .line 186
    .line 187
    aput-wide v7, v3, v4

    .line 188
    .line 189
    invoke-virtual {v2, v5, v6, v7, v8}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 190
    .line 191
    .line 192
    add-int/lit8 v15, v15, 0x1

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_8
    sub-long v1, v18, v20

    .line 196
    .line 197
    iput-wide v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedWidth:J

    .line 198
    .line 199
    sub-long v1, v22, v24

    .line 200
    .line 201
    iput-wide v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedHeight:J

    .line 202
    .line 203
    iget-object v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 204
    .line 205
    add-long v20, v20, v18

    .line 206
    .line 207
    const-wide/16 v2, 0x2

    .line 208
    .line 209
    div-long v4, v20, v2

    .line 210
    .line 211
    add-long v24, v24, v22

    .line 212
    .line 213
    div-long v2, v24, v2

    .line 214
    .line 215
    invoke-virtual {v1, v4, v5, v2, v3}, Lorg/osmdroid/util/PointL;->set(JJ)V

    .line 216
    .line 217
    .line 218
    iget-object v15, v0, Lorg/osmdroid/views/overlay/LinearRing;->mBoundingBox:Lorg/osmdroid/util/BoundingBox;

    .line 219
    .line 220
    move-wide/from16 v18, v26

    .line 221
    .line 222
    move-wide/from16 v20, v28

    .line 223
    .line 224
    move-wide/from16 v22, v30

    .line 225
    .line 226
    invoke-virtual/range {v15 .. v23}, Lorg/osmdroid/util/BoundingBox;->set(DDDD)V

    .line 227
    .line 228
    .line 229
    return-void
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

.method private getBestOffset(DDDDJJ)I
    .locals 15

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    int-to-long v3, v2

    mul-long v5, v3, p9

    long-to-double v5, v5

    add-double v7, p1, v5

    mul-long v3, v3, p11

    long-to-double v3, v3

    add-double v9, p3, v3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    .line 18
    invoke-static/range {v7 .. v14}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToPoint(DDDD)D

    move-result-wide v3

    if-eqz v2, :cond_1

    cmpl-double v0, v0, v3

    if-lez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    return v2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    move-wide v0, v3

    goto :goto_0
.end method

.method private getBestOffset(DDDDDLorg/osmdroid/util/PointL;)V
    .locals 20

    move-object/from16 v13, p0

    move-object/from16 v14, p11

    .line 9
    invoke-static/range {p9 .. p10}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    .line 10
    iget-boolean v0, v13, Lorg/osmdroid/views/overlay/LinearRing;->isVerticalRepeating:Z

    const/4 v15, 0x0

    if-nez v0, :cond_0

    move-wide v13, v11

    move v0, v15

    move v1, v0

    goto :goto_0

    :cond_0
    const-wide/16 v9, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 p9, v11

    .line 11
    invoke-direct/range {v0 .. v12}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(DDDDJJ)I

    move-result v16

    neg-long v7, v11

    move-wide/from16 v17, v7

    move-wide/from16 v7, p7

    move-wide v13, v11

    move-wide/from16 v11, v17

    .line 12
    invoke-direct/range {v0 .. v12}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(DDDDJJ)I

    move-result v0

    move/from16 v1, v16

    :goto_0
    if-le v1, v0, :cond_1

    goto :goto_1

    :cond_1
    neg-int v1, v0

    :goto_1
    int-to-long v0, v1

    mul-long v11, v13, v0

    move-wide v7, v13

    move-object/from16 v13, p11

    .line 13
    iput-wide v11, v13, Lorg/osmdroid/util/PointL;->y:J

    move-object/from16 v14, p0

    .line 14
    iget-boolean v0, v14, Lorg/osmdroid/views/overlay/LinearRing;->isHorizontalRepeating:Z

    if-nez v0, :cond_2

    move-wide/from16 v18, v7

    move v0, v15

    goto :goto_2

    :cond_2
    const-wide/16 v11, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 p9, v7

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    .line 15
    invoke-direct/range {v0 .. v12}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(DDDDJJ)I

    move-result v15

    move-wide/from16 v11, p9

    neg-long v9, v11

    const-wide/16 v16, 0x0

    move-wide/from16 v18, v11

    move-wide/from16 v11, v16

    .line 16
    invoke-direct/range {v0 .. v12}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(DDDDJJ)I

    move-result v0

    :goto_2
    if-le v15, v0, :cond_3

    goto :goto_3

    :cond_3
    neg-int v15, v0

    :goto_3
    int-to-long v0, v15

    mul-long v11, v18, v0

    .line 17
    iput-wide v11, v13, Lorg/osmdroid/util/PointL;->x:J

    return-void
.end method

.method private getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getProjectedPowerDifference()D

    move-result-wide v2

    .line 2
    iget-object v1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/Projection;->getLongPixelsFromProjected(Lorg/osmdroid/util/PointL;DZLorg/osmdroid/util/PointL;)Lorg/osmdroid/util/PointL;

    move-result-object v0

    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Lorg/osmdroid/util/PointL;)V

    return-void
.end method

.method public static getCloserValue(DDD)D
    .locals 6

    .line 1
    :goto_0
    sub-double v0, p2, p4

    .line 2
    .line 3
    sub-double v2, v0, p0

    .line 4
    .line 5
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-double v4, p2, p0

    .line 10
    .line 11
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    cmpg-double v2, v2, v4

    .line 16
    .line 17
    if-gez v2, :cond_0

    .line 18
    .line 19
    move-wide p2, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :goto_1
    add-double v0, p2, p4

    .line 22
    .line 23
    sub-double v2, v0, p0

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    sub-double v4, p2, p0

    .line 30
    .line 31
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmpg-double v2, v2, v4

    .line 36
    .line 37
    if-gez v2, :cond_1

    .line 38
    .line 39
    move-wide p2, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return-wide p2
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

.method private resetPrecomputations()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPrecomputed:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistancesPrecomputed:Z

    .line 5
    .line 6
    iput v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePixelSize:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePointList:[F

    .line 10
    .line 11
    return-void
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
.end method

.method private setCloserPoint(Lorg/osmdroid/util/PointL;Lorg/osmdroid/util/PointL;D)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isHorizontalRepeating:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p1, Lorg/osmdroid/util/PointL;->x:J

    .line 6
    .line 7
    long-to-double v2, v0

    .line 8
    iget-wide v0, p2, Lorg/osmdroid/util/PointL;->x:J

    .line 9
    .line 10
    long-to-double v4, v0

    .line 11
    move-wide v6, p3

    .line 12
    invoke-static/range {v2 .. v7}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p2, Lorg/osmdroid/util/PointL;->x:J

    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isVerticalRepeating:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-wide v0, p1, Lorg/osmdroid/util/PointL;->y:J

    .line 27
    .line 28
    long-to-double v2, v0

    .line 29
    iget-wide v0, p2, Lorg/osmdroid/util/PointL;->y:J

    .line 30
    .line 31
    long-to-double v4, v0

    .line 32
    move-wide v6, p3

    .line 33
    invoke-static/range {v2 .. v7}, Lorg/osmdroid/views/overlay/LinearRing;->getCloserValue(DDD)D

    .line 34
    .line 35
    .line 36
    move-result-wide p3

    .line 37
    invoke-static {p3, p4}, Ljava/lang/Math;->round(D)J

    .line 38
    .line 39
    .line 40
    move-result-wide p3

    .line 41
    iput-wide p3, p2, Lorg/osmdroid/util/PointL;->y:J

    .line 42
    .line 43
    :cond_1
    return-void
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


# virtual methods
.method protected addGreatCircle(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;I)V
    .locals 25

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide v3, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    mul-double/2addr v1, v3

    .line 13
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    mul-double/2addr v5, v3

    .line 18
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/util/GeoPoint;->getLatitude()D

    .line 19
    .line 20
    .line 21
    move-result-wide v7

    .line 22
    mul-double/2addr v7, v3

    .line 23
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/util/GeoPoint;->getLongitude()D

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    mul-double/2addr v9, v3

    .line 28
    sub-double v3, v1, v7

    .line 29
    .line 30
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 31
    .line 32
    div-double/2addr v3, v11

    .line 33
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v15

    .line 49
    mul-double/2addr v13, v15

    .line 50
    sub-double v15, v5, v9

    .line 51
    .line 52
    div-double/2addr v15, v11

    .line 53
    move-wide/from16 p1, v9

    .line 54
    .line 55
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    mul-double/2addr v13, v9

    .line 64
    add-double/2addr v3, v13

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    invoke-static {v3, v4}, Ljava/lang/Math;->asin(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    mul-double/2addr v3, v11

    .line 74
    const/4 v9, 0x1

    .line 75
    :goto_0
    if-gt v9, v0, :cond_0

    .line 76
    .line 77
    int-to-double v13, v9

    .line 78
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 79
    .line 80
    mul-double/2addr v13, v15

    .line 81
    add-int/lit8 v10, v0, 0x1

    .line 82
    .line 83
    int-to-double v11, v10

    .line 84
    div-double/2addr v13, v11

    .line 85
    sub-double/2addr v15, v13

    .line 86
    mul-double/2addr v15, v3

    .line 87
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v15

    .line 95
    div-double/2addr v10, v15

    .line 96
    mul-double/2addr v13, v3

    .line 97
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v12

    .line 101
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v14

    .line 105
    div-double/2addr v12, v14

    .line 106
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v14

    .line 110
    mul-double/2addr v14, v10

    .line 111
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 112
    .line 113
    .line 114
    move-result-wide v19

    .line 115
    mul-double v14, v14, v19

    .line 116
    .line 117
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v19

    .line 121
    mul-double v19, v19, v12

    .line 122
    .line 123
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->cos(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide v21

    .line 127
    mul-double v19, v19, v21

    .line 128
    .line 129
    add-double v14, v14, v19

    .line 130
    .line 131
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v19

    .line 135
    mul-double v19, v19, v10

    .line 136
    .line 137
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 138
    .line 139
    .line 140
    move-result-wide v21

    .line 141
    mul-double v19, v19, v21

    .line 142
    .line 143
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 144
    .line 145
    .line 146
    move-result-wide v21

    .line 147
    mul-double v21, v21, v12

    .line 148
    .line 149
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->sin(D)D

    .line 150
    .line 151
    .line 152
    move-result-wide v23

    .line 153
    mul-double v21, v21, v23

    .line 154
    .line 155
    move-wide/from16 v23, v3

    .line 156
    .line 157
    add-double v3, v19, v21

    .line 158
    .line 159
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 160
    .line 161
    .line 162
    move-result-wide v19

    .line 163
    mul-double v10, v10, v19

    .line 164
    .line 165
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 166
    .line 167
    .line 168
    move-result-wide v19

    .line 169
    mul-double v12, v12, v19

    .line 170
    .line 171
    add-double/2addr v10, v12

    .line 172
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 173
    .line 174
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 175
    .line 176
    .line 177
    move-result-wide v16

    .line 178
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 179
    .line 180
    .line 181
    move-result-wide v18

    .line 182
    add-double v16, v16, v18

    .line 183
    .line 184
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    .line 185
    .line 186
    .line 187
    move-result-wide v12

    .line 188
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 189
    .line 190
    .line 191
    move-result-wide v10

    .line 192
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    .line 193
    .line 194
    .line 195
    move-result-wide v3

    .line 196
    new-instance v12, Lorg/osmdroid/util/GeoPoint;

    .line 197
    .line 198
    const-wide v13, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    mul-double/2addr v10, v13

    .line 204
    mul-double/2addr v3, v13

    .line 205
    invoke-direct {v12, v10, v11, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 206
    .line 207
    .line 208
    move-object/from16 v3, p0

    .line 209
    .line 210
    iget-object v4, v3, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    add-int/lit8 v9, v9, 0x1

    .line 216
    .line 217
    move-wide/from16 v3, v23

    .line 218
    .line 219
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_0
    move-object/from16 v3, p0

    .line 224
    .line 225
    return-void
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
.end method

.method public addPoint(Lorg/osmdroid/util/GeoPoint;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mGeodesic:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lorg/osmdroid/util/GeoPoint;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    double-to-int v1, v1

    .line 32
    const v2, 0x186a0

    .line 33
    .line 34
    .line 35
    div-int/2addr v1, v2

    .line 36
    invoke-virtual {p0, v0, p1, v1}, Lorg/osmdroid/views/overlay/LinearRing;->addGreatCircle(Lorg/osmdroid/util/GeoPoint;Lorg/osmdroid/util/GeoPoint;I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->resetPrecomputations()V

    .line 45
    .line 46
    .line 47
    return-void
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

.method buildLinePortion(Lorg/osmdroid/views/Projection;Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeProjected()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeDistances()V

    .line 15
    .line 16
    .line 17
    new-instance v4, Lorg/osmdroid/util/PointL;

    .line 18
    .line 19
    invoke-direct {v4}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, v4}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/osmdroid/util/SegmentClipper;->init()V

    .line 28
    .line 29
    .line 30
    iget-boolean v5, p0, Lorg/osmdroid/views/overlay/LinearRing;->mClosed:Z

    .line 31
    .line 32
    iget-object v7, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 33
    .line 34
    move-object v2, p0

    .line 35
    move-object v3, p1

    .line 36
    move v6, p2

    .line 37
    invoke-direct/range {v2 .. v7}, Lorg/osmdroid/views/overlay/LinearRing;->clipAndStore(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;ZZLorg/osmdroid/util/SegmentClipper;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 41
    .line 42
    invoke-virtual {p1}, Lorg/osmdroid/util/SegmentClipper;->end()V

    .line 43
    .line 44
    .line 45
    return-void
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

.method buildPathPortion(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Z)Lorg/osmdroid/util/PointL;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_0
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeProjected()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeDistances()V

    .line 15
    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance p2, Lorg/osmdroid/util/PointL;

    .line 21
    .line 22
    invoke-direct {p2}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1, p2}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 29
    .line 30
    invoke-virtual {v0}, Lorg/osmdroid/util/SegmentClipper;->init()V

    .line 31
    .line 32
    .line 33
    iget-boolean v3, p0, Lorg/osmdroid/views/overlay/LinearRing;->mClosed:Z

    .line 34
    .line 35
    iget-object v5, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 36
    .line 37
    move-object v0, p0

    .line 38
    move-object v1, p1

    .line 39
    move-object v2, p2

    .line 40
    move v4, p3

    .line 41
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/overlay/LinearRing;->clipAndStore(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;ZZLorg/osmdroid/util/SegmentClipper;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    .line 45
    .line 46
    invoke-virtual {p1}, Lorg/osmdroid/util/SegmentClipper;->end()V

    .line 47
    .line 48
    .line 49
    iget-boolean p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mClosed:Z

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPath:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-object p2
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

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPath:Landroid/graphics/Path;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/osmdroid/util/ListPointL;->clear()V

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
.end method

.method clearPath()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 10
    .line 11
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->resetPrecomputations()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointAccepter:Lorg/osmdroid/util/PointAccepter;

    .line 15
    .line 16
    invoke-interface {v0}, Lorg/osmdroid/util/PointAccepter;->init()V

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method computeDowngradePointList(I)[F
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    iget v1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePixelSize:I

    .line 6
    .line 7
    if-ne v1, p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePointList:[F

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeProjected()V

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedWidth:J

    .line 16
    .line 17
    iget-wide v3, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedHeight:J

    .line 18
    .line 19
    cmp-long v5, v1, v3

    .line 20
    .line 21
    if-lez v5, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move-wide v1, v3

    .line 25
    :goto_0
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v3, v1, v3

    .line 28
    .line 29
    if-nez v3, :cond_3

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_3
    new-instance v0, Lorg/osmdroid/util/ListPointAccepter;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v0, v3}, Lorg/osmdroid/util/ListPointAccepter;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Lorg/osmdroid/util/SideOptimizationPointAccepter;

    .line 39
    .line 40
    invoke-direct {v3, v0}, Lorg/osmdroid/util/SideOptimizationPointAccepter;-><init>(Lorg/osmdroid/util/PointAccepter;)V

    .line 41
    .line 42
    .line 43
    long-to-double v1, v1

    .line 44
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 45
    .line 46
    mul-double/2addr v1, v4

    .line 47
    int-to-double v4, p1

    .line 48
    div-double/2addr v1, v4

    .line 49
    const/4 v4, 0x0

    .line 50
    move v5, v4

    .line 51
    :goto_1
    iget-object v6, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 52
    .line 53
    array-length v7, v6

    .line 54
    if-ge v5, v7, :cond_4

    .line 55
    .line 56
    add-int/lit8 v7, v5, 0x1

    .line 57
    .line 58
    aget-wide v8, v6, v5

    .line 59
    .line 60
    add-int/lit8 v5, v7, 0x1

    .line 61
    .line 62
    aget-wide v10, v6, v7

    .line 63
    .line 64
    iget-object v6, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 65
    .line 66
    iget-wide v6, v6, Lorg/osmdroid/util/PointL;->x:J

    .line 67
    .line 68
    sub-long/2addr v8, v6

    .line 69
    long-to-double v6, v8

    .line 70
    div-double/2addr v6, v1

    .line 71
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    iget-object v8, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedCenter:Lorg/osmdroid/util/PointL;

    .line 76
    .line 77
    iget-wide v8, v8, Lorg/osmdroid/util/PointL;->y:J

    .line 78
    .line 79
    sub-long/2addr v10, v8

    .line 80
    long-to-double v8, v10

    .line 81
    div-double/2addr v8, v1

    .line 82
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    invoke-interface {v3, v6, v7, v8, v9}, Lorg/osmdroid/util/PointAccepter;->add(JJ)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    iput p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePixelSize:I

    .line 91
    .line 92
    invoke-virtual {v0}, Lorg/osmdroid/util/ListPointAccepter;->getList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    new-array p1, p1, [F

    .line 101
    .line 102
    iput-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePointList:[F

    .line 103
    .line 104
    :goto_2
    iget-object p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDowngradePointList:[F

    .line 105
    .line 106
    array-length v1, p1

    .line 107
    if-ge v4, v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {v0}, Lorg/osmdroid/util/ListPointAccepter;->getList()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    long-to-float v1, v1

    .line 124
    aput v1, p1, v4

    .line 125
    .line 126
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    return-object p1
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

.method public getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;Lorg/osmdroid/util/PointL;)V
    .locals 18

    move-object/from16 v0, p3

    .line 4
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getIntrinsicScreenRect()Landroid/graphics/Rect;

    move-result-object v1

    .line 5
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    int-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double v11, v2, v4

    .line 6
    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v1

    int-to-double v1, v2

    div-double v13, v1, v4

    .line 7
    invoke-virtual/range {p1 .. p1}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    move-result-wide v15

    .line 8
    iget-wide v1, v0, Lorg/osmdroid/util/PointL;->x:J

    long-to-double v7, v1

    iget-wide v0, v0, Lorg/osmdroid/util/PointL;->y:J

    long-to-double v9, v0

    move-object/from16 v6, p0

    move-object/from16 v17, p2

    invoke-direct/range {v6 .. v17}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(DDDDDLorg/osmdroid/util/PointL;)V

    return-void
.end method

.method public getBoundingBox()Lorg/osmdroid/util/BoundingBox;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPrecomputed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeProjected()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mBoundingBox:Lorg/osmdroid/util/BoundingBox;

    .line 9
    .line 10
    return-object v0
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
.end method

.method public getCenter(Lorg/osmdroid/util/GeoPoint;)Lorg/osmdroid/util/GeoPoint;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lorg/osmdroid/util/GeoPoint;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-direct {p1, v0, v1, v0, v1}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/LinearRing;->getBoundingBox()Lorg/osmdroid/util/BoundingBox;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getCenterLatitude()D

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-virtual {p1, v1, v2}, Lorg/osmdroid/util/GeoPoint;->setLatitude(D)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude()D

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    invoke-virtual {p1, v0, v1}, Lorg/osmdroid/util/GeoPoint;->setLongitude(D)V

    .line 27
    .line 28
    .line 29
    return-object p1
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

.method getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/Projection;Z)Lorg/osmdroid/util/GeoPoint;
    .locals 41

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p4

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeProjected()V

    .line 6
    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    move-object/from16 v0, p1

    .line 10
    .line 11
    invoke-virtual {v7, v0, v8}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    new-instance v2, Lorg/osmdroid/util/PointL;

    .line 16
    .line 17
    invoke-direct {v2}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {v6, v7, v2}, Lorg/osmdroid/views/overlay/LinearRing;->getBestOffset(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;)V

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object/from16 v0, p0

    .line 26
    .line 27
    move-object/from16 v1, p4

    .line 28
    .line 29
    move/from16 v3, p5

    .line 30
    .line 31
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/overlay/LinearRing;->clipAndStore(Lorg/osmdroid/views/Projection;Lorg/osmdroid/util/PointL;ZZLorg/osmdroid/util/SegmentClipper;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {p4 .. p4}, Lorg/osmdroid/views/Projection;->getWorldMapSize()D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-virtual/range {p4 .. p4}, Lorg/osmdroid/views/Projection;->getIntrinsicScreenRect()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget v4, v9, Landroid/graphics/Point;->x:I

    .line 51
    .line 52
    int-to-double v4, v4

    .line 53
    :goto_0
    sub-double v10, v4, v0

    .line 54
    .line 55
    const-wide/16 v12, 0x0

    .line 56
    .line 57
    cmpl-double v7, v10, v12

    .line 58
    .line 59
    if-ltz v7, :cond_0

    .line 60
    .line 61
    move-wide v4, v10

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget v7, v9, Landroid/graphics/Point;->y:I

    .line 64
    .line 65
    int-to-double v9, v7

    .line 66
    :goto_1
    sub-double v14, v9, v0

    .line 67
    .line 68
    cmpl-double v7, v14, v12

    .line 69
    .line 70
    if-ltz v7, :cond_1

    .line 71
    .line 72
    move-wide v9, v14

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    mul-double v11, p2, p2

    .line 75
    .line 76
    new-instance v7, Lorg/osmdroid/util/PointL;

    .line 77
    .line 78
    invoke-direct {v7}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 79
    .line 80
    .line 81
    new-instance v13, Lorg/osmdroid/util/PointL;

    .line 82
    .line 83
    invoke-direct {v13}, Lorg/osmdroid/util/PointL;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v14, v6, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    .line 87
    .line 88
    invoke-virtual {v14}, Lorg/osmdroid/util/ListPointL;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    const/16 v16, 0x1

    .line 93
    .line 94
    move/from16 v17, v16

    .line 95
    .line 96
    const/16 v18, 0x0

    .line 97
    .line 98
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v19

    .line 102
    if-eqz v19, :cond_6

    .line 103
    .line 104
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v19

    .line 108
    move-object/from16 v15, v19

    .line 109
    .line 110
    check-cast v15, Lorg/osmdroid/util/PointL;

    .line 111
    .line 112
    invoke-virtual {v13, v15}, Lorg/osmdroid/util/PointL;->set(Lorg/osmdroid/util/PointL;)V

    .line 113
    .line 114
    .line 115
    if-eqz v17, :cond_2

    .line 116
    .line 117
    move-wide/from16 v37, v0

    .line 118
    .line 119
    move-wide/from16 v35, v4

    .line 120
    .line 121
    move-wide/from16 p4, v9

    .line 122
    .line 123
    move-wide/from16 v39, v11

    .line 124
    .line 125
    move-object/from16 p2, v14

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    :goto_3
    move v12, v3

    .line 130
    move-object v3, v6

    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_2
    move-wide/from16 v33, v4

    .line 134
    .line 135
    move-wide/from16 p4, v9

    .line 136
    .line 137
    :goto_4
    int-to-double v8, v3

    .line 138
    cmpg-double v8, v33, v8

    .line 139
    .line 140
    if-gez v8, :cond_5

    .line 141
    .line 142
    move-wide/from16 v8, p4

    .line 143
    .line 144
    move v10, v3

    .line 145
    move-wide/from16 v35, v4

    .line 146
    .line 147
    :goto_5
    int-to-double v3, v2

    .line 148
    cmpg-double v3, v8, v3

    .line 149
    .line 150
    if-gez v3, :cond_4

    .line 151
    .line 152
    iget-wide v3, v7, Lorg/osmdroid/util/PointL;->x:J

    .line 153
    .line 154
    long-to-double v3, v3

    .line 155
    move-object/from16 p2, v14

    .line 156
    .line 157
    iget-wide v14, v7, Lorg/osmdroid/util/PointL;->y:J

    .line 158
    .line 159
    long-to-double v14, v14

    .line 160
    move-wide/from16 v37, v0

    .line 161
    .line 162
    iget-wide v0, v13, Lorg/osmdroid/util/PointL;->x:J

    .line 163
    .line 164
    long-to-double v0, v0

    .line 165
    iget-wide v5, v13, Lorg/osmdroid/util/PointL;->y:J

    .line 166
    .line 167
    long-to-double v5, v5

    .line 168
    move-wide/from16 v19, v33

    .line 169
    .line 170
    move-wide/from16 v21, v8

    .line 171
    .line 172
    move-wide/from16 v23, v3

    .line 173
    .line 174
    move-wide/from16 v25, v14

    .line 175
    .line 176
    move-wide/from16 v27, v0

    .line 177
    .line 178
    move-wide/from16 v29, v5

    .line 179
    .line 180
    invoke-static/range {v19 .. v30}, Lorg/osmdroid/util/Distance;->getProjectionFactorToSegment(DDDDDD)D

    .line 181
    .line 182
    .line 183
    move-result-wide v0

    .line 184
    iget-wide v3, v7, Lorg/osmdroid/util/PointL;->x:J

    .line 185
    .line 186
    long-to-double v3, v3

    .line 187
    iget-wide v5, v7, Lorg/osmdroid/util/PointL;->y:J

    .line 188
    .line 189
    long-to-double v5, v5

    .line 190
    iget-wide v14, v13, Lorg/osmdroid/util/PointL;->x:J

    .line 191
    .line 192
    long-to-double v14, v14

    .line 193
    move-wide/from16 v39, v11

    .line 194
    .line 195
    move v12, v10

    .line 196
    iget-wide v10, v13, Lorg/osmdroid/util/PointL;->y:J

    .line 197
    .line 198
    long-to-double v10, v10

    .line 199
    move-wide/from16 v23, v3

    .line 200
    .line 201
    move-wide/from16 v25, v5

    .line 202
    .line 203
    move-wide/from16 v27, v14

    .line 204
    .line 205
    move-wide/from16 v29, v10

    .line 206
    .line 207
    move-wide/from16 v31, v0

    .line 208
    .line 209
    invoke-static/range {v19 .. v32}, Lorg/osmdroid/util/Distance;->getSquaredDistanceToProjection(DDDDDDD)D

    .line 210
    .line 211
    .line 212
    move-result-wide v3

    .line 213
    cmpl-double v3, v39, v3

    .line 214
    .line 215
    if-lez v3, :cond_3

    .line 216
    .line 217
    move-object/from16 v3, p0

    .line 218
    .line 219
    iget-object v2, v3, Lorg/osmdroid/views/overlay/LinearRing;->mProjectedPoints:[J

    .line 220
    .line 221
    add-int/lit8 v4, v18, -0x1

    .line 222
    .line 223
    mul-int/lit8 v4, v4, 0x2

    .line 224
    .line 225
    aget-wide v5, v2, v4

    .line 226
    .line 227
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    aget-wide v7, v2, v4

    .line 230
    .line 231
    mul-int/lit8 v18, v18, 0x2

    .line 232
    .line 233
    aget-wide v9, v2, v18

    .line 234
    .line 235
    add-int/lit8 v18, v18, 0x1

    .line 236
    .line 237
    aget-wide v11, v2, v18

    .line 238
    .line 239
    long-to-double v13, v5

    .line 240
    sub-long/2addr v9, v5

    .line 241
    long-to-double v4, v9

    .line 242
    mul-double/2addr v4, v0

    .line 243
    add-double/2addr v13, v4

    .line 244
    double-to-long v4, v13

    .line 245
    long-to-double v9, v7

    .line 246
    sub-long/2addr v11, v7

    .line 247
    long-to-double v6, v11

    .line 248
    mul-double/2addr v6, v0

    .line 249
    add-double/2addr v9, v6

    .line 250
    double-to-long v0, v9

    .line 251
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 252
    .line 253
    .line 254
    move-result-object v15

    .line 255
    const-wide/high16 v20, 0x43b0000000000000L    # 1.15292150460684698E18

    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    const/16 v23, 0x0

    .line 260
    .line 261
    const/16 v24, 0x0

    .line 262
    .line 263
    move-wide/from16 v16, v4

    .line 264
    .line 265
    move-wide/from16 v18, v0

    .line 266
    .line 267
    invoke-virtual/range {v15 .. v24}, Lorg/osmdroid/util/TileSystem;->getGeoFromMercator(JJDLorg/osmdroid/util/GeoPoint;ZZ)Lorg/osmdroid/util/GeoPoint;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :cond_3
    move-object/from16 v3, p0

    .line 273
    .line 274
    add-double v8, v8, v37

    .line 275
    .line 276
    move-object/from16 v14, p2

    .line 277
    .line 278
    move-object v6, v3

    .line 279
    move v10, v12

    .line 280
    move-wide/from16 v0, v37

    .line 281
    .line 282
    move-wide/from16 v11, v39

    .line 283
    .line 284
    goto/16 :goto_5

    .line 285
    .line 286
    :cond_4
    move-wide/from16 v37, v0

    .line 287
    .line 288
    move-object v3, v6

    .line 289
    move-wide/from16 v39, v11

    .line 290
    .line 291
    move-object/from16 p2, v14

    .line 292
    .line 293
    move v12, v10

    .line 294
    add-double v33, v33, v37

    .line 295
    .line 296
    move v3, v12

    .line 297
    move-wide/from16 v4, v35

    .line 298
    .line 299
    move-wide/from16 v11, v39

    .line 300
    .line 301
    goto/16 :goto_4

    .line 302
    .line 303
    :cond_5
    move-wide/from16 v37, v0

    .line 304
    .line 305
    move-wide/from16 v35, v4

    .line 306
    .line 307
    move-wide/from16 v39, v11

    .line 308
    .line 309
    move-object/from16 p2, v14

    .line 310
    .line 311
    goto/16 :goto_3

    .line 312
    .line 313
    :goto_6
    invoke-virtual {v7, v13}, Lorg/osmdroid/util/PointL;->set(Lorg/osmdroid/util/PointL;)V

    .line 314
    .line 315
    .line 316
    add-int/lit8 v18, v18, 0x1

    .line 317
    .line 318
    move-object/from16 v14, p2

    .line 319
    .line 320
    move-wide/from16 v9, p4

    .line 321
    .line 322
    move-object v6, v3

    .line 323
    move v3, v12

    .line 324
    move-wide/from16 v4, v35

    .line 325
    .line 326
    move-wide/from16 v0, v37

    .line 327
    .line 328
    move-wide/from16 v11, v39

    .line 329
    .line 330
    const/4 v8, 0x0

    .line 331
    goto/16 :goto_2

    .line 332
    .line 333
    :cond_6
    move-object v3, v6

    .line 334
    move-object v0, v8

    .line 335
    return-object v0
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

.method public getDistance()D
    .locals 7

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/LinearRing;->getDistances()[D

    move-result-object v0

    array-length v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-wide v5, v0, v4

    add-double/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method getDistances()[D
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/LinearRing;->computeDistances()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mDistances:[D

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getPoints()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mOriginalPoints:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPointsForMilestones()Lorg/osmdroid/util/ListPointL;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mPointsForMilestones:Lorg/osmdroid/util/ListPointL;

    return-object v0
.end method

.method isCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/Projection;Z)Z
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lorg/osmdroid/views/overlay/LinearRing;->getCloseTo(Lorg/osmdroid/util/GeoPoint;DLorg/osmdroid/views/Projection;Z)Lorg/osmdroid/util/GeoPoint;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isGeodesic()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->mGeodesic:Z

    return v0
.end method

.method public setClipArea(JJJJ)V
    .locals 13

    move-object v0, p0

    .line 1
    iget-object v1, v0, Lorg/osmdroid/views/overlay/LinearRing;->mSegmentClipper:Lorg/osmdroid/util/SegmentClipper;

    iget-object v10, v0, Lorg/osmdroid/views/overlay/LinearRing;->mPointAccepter:Lorg/osmdroid/util/PointAccepter;

    iget-object v11, v0, Lorg/osmdroid/views/overlay/LinearRing;->mIntegerAccepter:Lorg/osmdroid/util/IntegerAccepter;

    iget-object v2, v0, Lorg/osmdroid/views/overlay/LinearRing;->mPath:Landroid/graphics/Path;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    move v12, v2

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-virtual/range {v1 .. v12}, Lorg/osmdroid/util/SegmentClipper;->set(JJJJLorg/osmdroid/util/PointAccepter;Lorg/osmdroid/util/IntegerAccepter;Z)V

    return-void
.end method

.method public setClipArea(Lorg/osmdroid/views/Projection;)V
    .locals 13

    .line 2
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getIntrinsicScreenRect()Landroid/graphics/Rect;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 4
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    mul-int v2, v1, v1

    mul-int v3, v0, v0

    add-int/2addr v2, v3

    int-to-double v2, v2

    .line 5
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    const-wide v4, 0x3ff199999999999aL    # 1.1

    mul-double/2addr v2, v4

    double-to-int v2, v2

    sub-int v3, v1, v2

    int-to-long v5, v3

    sub-int v3, v0, v2

    int-to-long v7, v3

    add-int/2addr v1, v2

    int-to-long v9, v1

    add-int/2addr v0, v2

    int-to-long v11, v0

    move-object v4, p0

    .line 6
    invoke-virtual/range {v4 .. v12}, Lorg/osmdroid/views/overlay/LinearRing;->setClipArea(JJJJ)V

    .line 7
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->isHorizontalWrapEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/LinearRing;->isHorizontalRepeating:Z

    .line 8
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->isVerticalWrapEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->isVerticalRepeating:Z

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/LinearRing;->mGeodesic:Z

    return-void
.end method

.method public setPoints(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/LinearRing;->clearPath()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lorg/osmdroid/util/GeoPoint;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/LinearRing;->addPoint(Lorg/osmdroid/util/GeoPoint;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
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
.end method
