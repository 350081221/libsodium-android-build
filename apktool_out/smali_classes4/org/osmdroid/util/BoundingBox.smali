.class public Lorg/osmdroid/util/BoundingBox;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lorg/osmdroid/util/BoundingBox;",
            ">;"
        }
    .end annotation
.end field

.field static final serialVersionUID:J = 0x2L


# instance fields
.field private mLatNorth:D

.field private mLatSouth:D

.field private mLonEast:D

.field private mLonWest:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/osmdroid/util/BoundingBox$1;

    invoke-direct {v0}, Lorg/osmdroid/util/BoundingBox$1;-><init>()V

    sput-object v0, Lorg/osmdroid/util/BoundingBox;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(DDDD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual/range {p0 .. p8}, Lorg/osmdroid/util/BoundingBox;->set(DDDD)V

    return-void
.end method

.method static synthetic access$000(Landroid/os/Parcel;)Lorg/osmdroid/util/BoundingBox;
    .locals 0

    invoke-static {p0}, Lorg/osmdroid/util/BoundingBox;->readFromParcel(Landroid/os/Parcel;)Lorg/osmdroid/util/BoundingBox;

    move-result-object p0

    return-object p0
.end method

.method public static fromGeoPoints(Ljava/util/List;)Lorg/osmdroid/util/BoundingBox;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/osmdroid/api/IGeoPoint;",
            ">;)",
            "Lorg/osmdroid/util/BoundingBox;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v2, -0x10000000000001L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    move-wide v9, v0

    .line 16
    move-wide v11, v9

    .line 17
    move-wide v5, v2

    .line 18
    move-wide v7, v5

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lorg/osmdroid/api/IGeoPoint;

    .line 30
    .line 31
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-interface {v0}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v9, v10, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 44
    .line 45
    .line 46
    move-result-wide v11

    .line 47
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(DD)D

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance p0, Lorg/osmdroid/util/BoundingBox;

    .line 57
    .line 58
    move-object v4, p0

    .line 59
    invoke-direct/range {v4 .. v12}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 60
    .line 61
    .line 62
    return-object p0
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
.end method

.method public static fromGeoPointsSafe(Ljava/util/List;)Lorg/osmdroid/util/BoundingBox;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/GeoPoint;",
            ">;)",
            "Lorg/osmdroid/util/BoundingBox;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lorg/osmdroid/util/BoundingBox;->fromGeoPoints(Ljava/util/List;)Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    new-instance v9, Lorg/osmdroid/util/BoundingBox;

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLatitude()D

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMaxLongitude()D

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLatitude()D

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    invoke-virtual {p0}, Lorg/osmdroid/util/TileSystem;->getMinLongitude()D

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    move-object v0, v9

    .line 29
    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 30
    .line 31
    .line 32
    return-object v9
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

.method public static getCenterLongitude(DD)D
    .locals 4

    add-double v0, p2, p0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    cmpg-double p0, p2, p0

    if-gez p0, :cond_0

    const-wide p0, 0x4066800000000000L    # 180.0

    add-double/2addr v0, p0

    .line 2
    :cond_0
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static readFromParcel(Landroid/os/Parcel;)Lorg/osmdroid/util/BoundingBox;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D

    .line 14
    .line 15
    .line 16
    move-result-wide v7

    .line 17
    new-instance p0, Lorg/osmdroid/util/BoundingBox;

    .line 18
    .line 19
    move-object v0, p0

    .line 20
    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 21
    .line 22
    .line 23
    return-object p0
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


# virtual methods
.method public bringToBoundingBox(DD)Lorg/osmdroid/util/GeoPoint;
    .locals 5

    .line 1
    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    .line 2
    .line 3
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 4
    .line 5
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 6
    .line 7
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->min(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(DD)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 16
    .line 17
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 18
    .line 19
    invoke-static {v3, v4, p3, p4}, Ljava/lang/Math;->min(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide p3

    .line 23
    invoke-static {v1, v2, p3, p4}, Ljava/lang/Math;->max(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide p3

    .line 27
    invoke-direct {v0, p1, p2, p3, p4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 28
    .line 29
    .line 30
    return-object v0
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

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->clone()Lorg/osmdroid/util/BoundingBox;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/osmdroid/util/BoundingBox;
    .locals 10

    .line 2
    new-instance v9, Lorg/osmdroid/util/BoundingBox;

    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    iget-wide v5, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    iget-wide v7, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    return-object v9
.end method

.method public concat(Lorg/osmdroid/util/BoundingBox;)Lorg/osmdroid/util/BoundingBox;
    .locals 12

    .line 1
    new-instance v9, Lorg/osmdroid/util/BoundingBox;

    .line 2
    .line 3
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatNorth()D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonEast()D

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-wide v5, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 24
    .line 25
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLatSouth()D

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(DD)D

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    iget-wide v7, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 34
    .line 35
    invoke-virtual {p1}, Lorg/osmdroid/util/BoundingBox;->getLonWest()D

    .line 36
    .line 37
    .line 38
    move-result-wide v10

    .line 39
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(DD)D

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    move-object v0, v9

    .line 44
    invoke-direct/range {v0 .. v8}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 45
    .line 46
    .line 47
    return-object v9
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

.method public contains(DD)Z
    .locals 7

    .line 2
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    cmpg-double v4, v0, v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-gez v4, :cond_0

    :goto_0
    move p1, v6

    goto :goto_1

    :cond_0
    cmpg-double v0, p1, v0

    if-gez v0, :cond_1

    cmpl-double p1, p1, v2

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v5

    .line 3
    :goto_1
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    cmpg-double p2, v0, v2

    if-gez p2, :cond_3

    cmpg-double p2, p3, v0

    if-gtz p2, :cond_2

    cmpl-double p2, p3, v2

    if-ltz p2, :cond_2

    :goto_2
    move p2, v6

    goto :goto_3

    :cond_2
    move p2, v5

    goto :goto_3

    :cond_3
    cmpg-double p2, p3, v0

    if-gez p2, :cond_2

    cmpl-double p2, p3, v2

    if-lez p2, :cond_2

    goto :goto_2

    :goto_3
    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    move v5, v6

    :cond_4
    return v5
.end method

.method public contains(Lorg/osmdroid/api/IGeoPoint;)Z
    .locals 4

    .line 1
    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLatitude()D

    move-result-wide v0

    invoke-interface {p1}, Lorg/osmdroid/api/IGeoPoint;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/osmdroid/util/BoundingBox;->contains(DD)Z

    move-result p1

    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    check-cast p1, Lorg/osmdroid/util/BoundingBox;

    .line 20
    .line 21
    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 22
    .line 23
    iget-wide v4, p1, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 24
    .line 25
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 33
    .line 34
    iget-wide v4, p1, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 35
    .line 36
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 44
    .line 45
    iget-wide v4, p1, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 46
    .line 47
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    return v1

    .line 54
    :cond_4
    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 55
    .line 56
    iget-wide v4, p1, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 57
    .line 58
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_5

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_5
    move v0, v1

    .line 66
    :goto_0
    return v0

    .line 67
    :cond_6
    :goto_1
    return v1
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
.end method

.method public getActualNorth()D
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public getActualSouth()D
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public getCenter()Lorg/osmdroid/util/GeoPoint;
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    add-double/2addr v1, v3

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    iget-wide v5, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    iget-wide v7, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    add-double/2addr v5, v7

    div-double/2addr v5, v3

    invoke-direct {v0, v1, v2, v5, v6}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    return-object v0
.end method

.method public getCenterLatitude()D
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public getCenterLongitude()D
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    invoke-static {v0, v1, v2, v3}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public getCenterWithDateLine()Lorg/osmdroid/util/GeoPoint;
    .locals 5

    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getCenterLatitude()D

    move-result-wide v1

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    return-object v0
.end method

.method public getDiagonalLengthInMeters()D
    .locals 6

    new-instance v0, Lorg/osmdroid/util/GeoPoint;

    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    new-instance v1, Lorg/osmdroid/util/GeoPoint;

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    iget-wide v4, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    invoke-virtual {v0, v1}, Lorg/osmdroid/util/GeoPoint;->distanceToAsDouble(Lorg/osmdroid/api/IGeoPoint;)D

    move-result-wide v0

    return-wide v0
.end method

.method public getGeoPointOfRelativePositionWithExactGudermannInterpolation(FF)Lorg/osmdroid/util/GeoPoint;
    .locals 7

    .line 1
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 6
    .line 7
    invoke-static {v1, v2}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 12
    .line 13
    invoke-static {v3, v4}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const/high16 v5, 0x3f800000    # 1.0f

    .line 18
    .line 19
    sub-float/2addr v5, p2

    .line 20
    float-to-double v5, v5

    .line 21
    sub-double/2addr v1, v3

    .line 22
    mul-double/2addr v5, v1

    .line 23
    add-double/2addr v3, v5

    .line 24
    invoke-static {v3, v4}, Lorg/osmdroid/util/MyMath;->gudermann(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 29
    .line 30
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    float-to-double p1, p1

    .line 35
    mul-double/2addr v5, p1

    .line 36
    add-double/2addr v3, v5

    .line 37
    new-instance p1, Lorg/osmdroid/util/GeoPoint;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-direct {p1, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 48
    .line 49
    .line 50
    return-object p1
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

.method public getGeoPointOfRelativePositionWithLinearInterpolation(FF)Lorg/osmdroid/util/GeoPoint;
    .locals 7

    .line 1
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    float-to-double v5, p2

    .line 12
    mul-double/2addr v3, v5

    .line 13
    sub-double/2addr v1, v3

    .line 14
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    float-to-double p1, p1

    .line 21
    mul-double/2addr v5, p1

    .line 22
    add-double/2addr v3, v5

    .line 23
    new-instance p1, Lorg/osmdroid/util/GeoPoint;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0, v3, v4}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-direct {p1, v1, v2, v3, v4}, Lorg/osmdroid/util/GeoPoint;-><init>(DD)V

    .line 34
    .line 35
    .line 36
    return-object p1
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

.method public getLatNorth()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    return-wide v0
.end method

.method public getLatSouth()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    return-wide v0
.end method

.method public getLatitudeSpan()D
    .locals 4

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public getLatitudeSpanE6()I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    move-result-wide v0

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getLonEast()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    return-wide v0
.end method

.method public getLonWest()D
    .locals 2

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    return-wide v0
.end method

.method public getLongitudeSpan()D
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public getLongitudeSpanE6()I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    move-result-wide v0

    const-wide v2, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public getLongitudeSpanWithDateLine()D
    .locals 5

    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    cmpl-double v4, v0, v2

    if-lez v4, :cond_0

    sub-double/2addr v0, v2

    return-wide v0

    :cond_0
    sub-double/2addr v0, v2

    const-wide v2, 0x4076800000000000L    # 360.0

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public getRelativePositionOfGeoPointInBoundingBoxWithExactGudermannInterpolation(DDLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 4

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p5, Landroid/graphics/PointF;

    .line 5
    .line 6
    invoke-direct {p5}, Landroid/graphics/PointF;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 10
    .line 11
    invoke-static {v0, v1}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {p1, p2}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    sub-double/2addr v0, p1

    .line 20
    iget-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 21
    .line 22
    invoke-static {p1, p2}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    iget-wide v2, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 27
    .line 28
    invoke-static {v2, v3}, Lorg/osmdroid/util/MyMath;->gudermannInverse(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    sub-double/2addr p1, v2

    .line 33
    div-double/2addr v0, p1

    .line 34
    double-to-float p1, v0

    .line 35
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 36
    .line 37
    sub-double/2addr v0, p3

    .line 38
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    div-double/2addr v0, p2

    .line 43
    double-to-float p2, v0

    .line 44
    const/high16 p3, 0x3f800000    # 1.0f

    .line 45
    .line 46
    sub-float/2addr p3, p2

    .line 47
    invoke-virtual {p5, p3, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 48
    .line 49
    .line 50
    return-object p5
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

.method public getRelativePositionOfGeoPointInBoundingBoxWithLinearInterpolation(DDLandroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p5, Landroid/graphics/PointF;

    .line 5
    .line 6
    invoke-direct {p5}, Landroid/graphics/PointF;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 10
    .line 11
    sub-double/2addr v0, p1

    .line 12
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    div-double/2addr v0, p1

    .line 17
    double-to-float p1, v0

    .line 18
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 19
    .line 20
    sub-double/2addr v0, p3

    .line 21
    invoke-virtual {p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpan()D

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    div-double/2addr v0, p2

    .line 26
    double-to-float p2, v0

    .line 27
    const/high16 p3, 0x3f800000    # 1.0f

    .line 28
    .line 29
    sub-float/2addr p3, p2

    .line 30
    invoke-virtual {p5, p3, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 31
    .line 32
    .line 33
    return-object p5
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

.method public hashCode()I
    .locals 7

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    ushr-long v3, v0, v2

    .line 10
    .line 11
    xor-long/2addr v0, v3

    .line 12
    long-to-int v0, v0

    .line 13
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 14
    .line 15
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    ushr-long v5, v3, v2

    .line 22
    .line 23
    xor-long/2addr v3, v5

    .line 24
    long-to-int v1, v3

    .line 25
    add-int/2addr v0, v1

    .line 26
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    ushr-long v5, v3, v2

    .line 35
    .line 36
    xor-long/2addr v3, v5

    .line 37
    long-to-int v1, v3

    .line 38
    add-int/2addr v0, v1

    .line 39
    iget-wide v3, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 40
    .line 41
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    ushr-long v1, v3, v2

    .line 48
    .line 49
    xor-long/2addr v1, v3

    .line 50
    long-to-int v1, v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    return v0
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

.method public increaseByScale(F)Lorg/osmdroid/util/BoundingBox;
    .locals 21

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v1, v0, v1

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/util/BoundingBox;->getCenterLatitude()D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/util/BoundingBox;->getLatitudeSpan()D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 21
    .line 22
    div-double/2addr v4, v6

    .line 23
    float-to-double v8, v0

    .line 24
    mul-double/2addr v4, v8

    .line 25
    add-double v10, v2, v4

    .line 26
    .line 27
    invoke-virtual {v1, v10, v11}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v13

    .line 31
    sub-double/2addr v2, v4

    .line 32
    invoke-virtual {v1, v2, v3}, Lorg/osmdroid/util/TileSystem;->cleanLatitude(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide v17

    .line 36
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/util/BoundingBox;->getCenterLongitude()D

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual/range {p0 .. p0}, Lorg/osmdroid/util/BoundingBox;->getLongitudeSpanWithDateLine()D

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    div-double/2addr v4, v6

    .line 45
    mul-double/2addr v4, v8

    .line 46
    add-double v6, v2, v4

    .line 47
    .line 48
    invoke-virtual {v1, v6, v7}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v15

    .line 52
    sub-double/2addr v2, v4

    .line 53
    invoke-virtual {v1, v2, v3}, Lorg/osmdroid/util/TileSystem;->cleanLongitude(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v19

    .line 57
    new-instance v0, Lorg/osmdroid/util/BoundingBox;

    .line 58
    .line 59
    move-object v12, v0

    .line 60
    invoke-direct/range {v12 .. v20}, Lorg/osmdroid/util/BoundingBox;-><init>(DDDD)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string v1, "pBoundingboxPaddingRelativeScale must be positive"

    .line 67
    .line 68
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
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

.method public overlaps(Lorg/osmdroid/util/BoundingBox;D)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 6
    .line 7
    cmpg-double v2, p2, v2

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-gez v2, :cond_0

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    iget-wide v4, v1, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 14
    .line 15
    iget-wide v6, v0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 16
    .line 17
    cmpg-double v2, v4, v6

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    iget-wide v9, v0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 23
    .line 24
    cmpl-double v2, v4, v9

    .line 25
    .line 26
    if-ltz v2, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v8

    .line 31
    :goto_0
    iget-wide v9, v0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 32
    .line 33
    iget-wide v11, v1, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 34
    .line 35
    cmpl-double v13, v9, v11

    .line 36
    .line 37
    if-ltz v13, :cond_2

    .line 38
    .line 39
    iget-wide v13, v1, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 40
    .line 41
    cmpg-double v13, v9, v13

    .line 42
    .line 43
    if-gtz v13, :cond_2

    .line 44
    .line 45
    move v13, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v13, v8

    .line 48
    :goto_1
    iget-wide v14, v0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 49
    .line 50
    cmpl-double v16, v14, v11

    .line 51
    .line 52
    move-wide/from16 v17, v4

    .line 53
    .line 54
    if-ltz v16, :cond_3

    .line 55
    .line 56
    iget-wide v3, v1, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 57
    .line 58
    cmpg-double v3, v9, v3

    .line 59
    .line 60
    if-gtz v3, :cond_3

    .line 61
    .line 62
    const/4 v13, 0x1

    .line 63
    :cond_3
    cmpg-double v3, v9, v11

    .line 64
    .line 65
    if-gtz v3, :cond_4

    .line 66
    .line 67
    iget-wide v3, v1, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 68
    .line 69
    cmpl-double v3, v14, v3

    .line 70
    .line 71
    if-ltz v3, :cond_4

    .line 72
    .line 73
    iget-wide v3, v1, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 74
    .line 75
    cmpl-double v3, v6, v3

    .line 76
    .line 77
    if-ltz v3, :cond_4

    .line 78
    .line 79
    iget-wide v3, v0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 80
    .line 81
    cmpg-double v3, v3, v17

    .line 82
    .line 83
    if-gtz v3, :cond_4

    .line 84
    .line 85
    const/4 v3, 0x1

    .line 86
    return v3

    .line 87
    :cond_4
    const/4 v3, 0x1

    .line 88
    cmpl-double v4, v6, v17

    .line 89
    .line 90
    if-ltz v4, :cond_5

    .line 91
    .line 92
    iget-wide v4, v0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 93
    .line 94
    cmpg-double v4, v6, v4

    .line 95
    .line 96
    if-gtz v4, :cond_5

    .line 97
    .line 98
    move v2, v3

    .line 99
    :cond_5
    iget-wide v4, v0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 100
    .line 101
    cmpl-double v6, v4, v17

    .line 102
    .line 103
    if-ltz v6, :cond_6

    .line 104
    .line 105
    cmpg-double v4, v4, v4

    .line 106
    .line 107
    if-gtz v4, :cond_6

    .line 108
    .line 109
    move v2, v3

    .line 110
    :cond_6
    cmpl-double v4, v9, v14

    .line 111
    .line 112
    if-lez v4, :cond_b

    .line 113
    .line 114
    iget-wide v4, v1, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 115
    .line 116
    cmpg-double v1, v14, v4

    .line 117
    .line 118
    if-gtz v1, :cond_7

    .line 119
    .line 120
    cmpl-double v1, v11, v9

    .line 121
    .line 122
    if-ltz v1, :cond_7

    .line 123
    .line 124
    move v13, v3

    .line 125
    :cond_7
    cmpl-double v1, v9, v4

    .line 126
    .line 127
    if-ltz v1, :cond_a

    .line 128
    .line 129
    cmpg-double v1, v14, v4

    .line 130
    .line 131
    if-gtz v1, :cond_a

    .line 132
    .line 133
    cmpg-double v1, v4, v9

    .line 134
    .line 135
    if-gez v1, :cond_8

    .line 136
    .line 137
    cmpg-double v1, v11, v9

    .line 138
    .line 139
    if-gez v1, :cond_8

    .line 140
    .line 141
    move v1, v8

    .line 142
    goto :goto_2

    .line 143
    :cond_8
    move v1, v3

    .line 144
    :goto_2
    cmpl-double v6, v4, v14

    .line 145
    .line 146
    if-lez v6, :cond_9

    .line 147
    .line 148
    cmpl-double v6, v11, v14

    .line 149
    .line 150
    if-lez v6, :cond_9

    .line 151
    .line 152
    move v13, v8

    .line 153
    goto :goto_3

    .line 154
    :cond_9
    move v13, v1

    .line 155
    :cond_a
    :goto_3
    cmpl-double v1, v9, v4

    .line 156
    .line 157
    if-ltz v1, :cond_b

    .line 158
    .line 159
    cmpl-double v1, v14, v4

    .line 160
    .line 161
    if-ltz v1, :cond_b

    .line 162
    .line 163
    move v13, v3

    .line 164
    :cond_b
    if-eqz v2, :cond_c

    .line 165
    .line 166
    if-eqz v13, :cond_c

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_c
    move v3, v8

    .line 170
    :goto_4
    return v3
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

.method public set(DDDD)V
    .locals 1

    .line 1
    iput-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 2
    .line 3
    iput-wide p3, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 4
    .line 5
    iput-wide p5, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 6
    .line 7
    iput-wide p7, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 8
    .line 9
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lorg/osmdroid/config/c;->O()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    invoke-static {}, Lorg/osmdroid/views/MapView;->getTileSystem()Lorg/osmdroid/util/TileSystem;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/util/TileSystem;->isValidLatitude(D)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0, p5, p6}, Lorg/osmdroid/util/TileSystem;->isValidLatitude(D)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, p7, p8}, Lorg/osmdroid/util/TileSystem;->isValidLongitude(D)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p3, p4}, Lorg/osmdroid/util/TileSystem;->isValidLongitude(D)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string p3, "east must be in "

    .line 56
    .line 57
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->toStringLongitudeSpan()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string p3, "west must be in "

    .line 83
    .line 84
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->toStringLongitudeSpan()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    new-instance p2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string p3, "south must be in "

    .line 110
    .line 111
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->toStringLatitudeSpan()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    new-instance p2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string p3, "north must be in "

    .line 137
    .line 138
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lorg/osmdroid/util/TileSystem;->toStringLatitudeSpan()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_4
    :goto_0
    return-void
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

.method public setLatNorth(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    return-void
.end method

.method public setLatSouth(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    return-void
.end method

.method public setLonEast(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    return-void
.end method

.method public setLonWest(D)V
    .locals 0

    iput-wide p1, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "N:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 14
    .line 15
    .line 16
    const-string v1, "; E:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 19
    .line 20
    .line 21
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 24
    .line 25
    .line 26
    const-string v1, "; S:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 34
    .line 35
    .line 36
    const-string v1, "; W:"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 39
    .line 40
    .line 41
    iget-wide v1, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatNorth:D

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonEast:D

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 9
    .line 10
    .line 11
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLatSouth:D

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Lorg/osmdroid/util/BoundingBox;->mLonWest:D

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 19
    .line 20
    .line 21
    return-void
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
