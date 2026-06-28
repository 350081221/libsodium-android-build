.class public Lorg/osmdroid/tileprovider/MapTileCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;
    }
.end annotation


# instance fields
.field private final mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

.field private mAutoEnsureCapacity:Z

.field private final mCachedTiles:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private mCapacity:I

.field private final mComputers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/util/MapTileAreaComputer;",
            ">;"
        }
    .end annotation
.end field

.field private final mGC:Lorg/osmdroid/util/MapTileList;

.field private final mMapTileArea:Lorg/osmdroid/util/MapTileArea;

.field private final mPreCache:Lorg/osmdroid/tileprovider/MapTilePreCache;

.field private final mProtectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/util/MapTileContainer;",
            ">;"
        }
    .end annotation
.end field

.field private mStressedMemory:Z

.field private mTileRemovedListener:Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    move-result-object v0

    invoke-interface {v0}, Lorg/osmdroid/config/c;->C()S

    move-result v0

    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/MapTileCache;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 4
    new-instance v0, Lorg/osmdroid/util/MapTileArea;

    invoke-direct {v0}, Lorg/osmdroid/util/MapTileArea;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mMapTileArea:Lorg/osmdroid/util/MapTileArea;

    .line 5
    new-instance v0, Lorg/osmdroid/util/MapTileAreaList;

    invoke-direct {v0}, Lorg/osmdroid/util/MapTileAreaList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 6
    new-instance v0, Lorg/osmdroid/util/MapTileList;

    invoke-direct {v0}, Lorg/osmdroid/util/MapTileList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mGC:Lorg/osmdroid/util/MapTileList;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mComputers:Ljava/util/List;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mProtectors:Ljava/util/List;

    .line 9
    invoke-virtual {p0, p1}, Lorg/osmdroid/tileprovider/MapTileCache;->ensureCapacity(I)Z

    .line 10
    new-instance p1, Lorg/osmdroid/tileprovider/MapTilePreCache;

    invoke-direct {p1, p0}, Lorg/osmdroid/tileprovider/MapTilePreCache;-><init>(Lorg/osmdroid/tileprovider/MapTileCache;)V

    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mPreCache:Lorg/osmdroid/tileprovider/MapTilePreCache;

    return-void
.end method

.method private populateSyncCachedTiles(Lorg/osmdroid/util/MapTileList;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1, v1}, Lorg/osmdroid/util/MapTileList;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/osmdroid/util/MapTileList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {p1, v2, v3}, Lorg/osmdroid/util/MapTileList;->put(J)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method private refreshAdditionalLists()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mComputers:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lorg/osmdroid/util/MapTileAreaComputer;

    .line 19
    .line 20
    iget-object v3, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 21
    .line 22
    invoke-virtual {v3}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v1, v3, :cond_0

    .line 31
    .line 32
    iget-object v3, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 33
    .line 34
    invoke-virtual {v3}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lorg/osmdroid/util/MapTileArea;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    new-instance v3, Lorg/osmdroid/util/MapTileArea;

    .line 46
    .line 47
    invoke-direct {v3}, Lorg/osmdroid/util/MapTileArea;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 51
    .line 52
    invoke-virtual {v4}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :goto_1
    iget-object v4, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mMapTileArea:Lorg/osmdroid/util/MapTileArea;

    .line 60
    .line 61
    invoke-interface {v2, v4, v3}, Lorg/osmdroid/util/MapTileAreaComputer;->computeFromSource(Lorg/osmdroid/util/MapTileArea;Lorg/osmdroid/util/MapTileArea;)Lorg/osmdroid/util/MapTileArea;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    :goto_2
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 68
    .line 69
    invoke-virtual {v0}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ge v1, v0, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 80
    .line 81
    invoke-virtual {v0}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 86
    .line 87
    invoke-virtual {v2}, Lorg/osmdroid/util/MapTileAreaList;->getList()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    add-int/lit8 v2, v2, -0x1

    .line 96
    .line 97
    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    return-void
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

.method private shouldKeepTile(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mMapTileArea:Lorg/osmdroid/util/MapTileArea;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/util/MapTileArea;->contains(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lorg/osmdroid/util/MapTileAreaList;->contains(J)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mProtectors:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lorg/osmdroid/util/MapTileContainer;

    .line 37
    .line 38
    invoke-interface {v2, p1, p2}, Lorg/osmdroid/util/MapTileContainer;->contains(J)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    return v1

    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    return p1
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
.method public clear()V
    .locals 4

    .line 1
    new-instance v0, Lorg/osmdroid/util/MapTileList;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/osmdroid/util/MapTileList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/MapTileCache;->populateSyncCachedTiles(Lorg/osmdroid/util/MapTileList;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0}, Lorg/osmdroid/util/MapTileList;->getSize()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lorg/osmdroid/util/MapTileList;->get(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual {p0, v2, v3}, Lorg/osmdroid/tileprovider/MapTileCache;->remove(J)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 29
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
.end method

.method public containsTile(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    monitor-exit v0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
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

.method public ensureCapacity(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCapacity:I

    .line 2
    .line 3
    if-ge v0, p1, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "Tile cache increased from "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCapacity:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " to "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "OsmDroid"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCapacity:I

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
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

.method public garbageCollection()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mStressedMemory:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCapacity:I

    .line 12
    .line 13
    sub-int v1, v0, v1

    .line 14
    .line 15
    if-gtz v1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const v1, 0x7fffffff

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-direct {p0}, Lorg/osmdroid/tileprovider/MapTileCache;->refreshAdditionalLists()V

    .line 22
    .line 23
    .line 24
    iget-boolean v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAutoEnsureCapacity:Z

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iget-object v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mMapTileArea:Lorg/osmdroid/util/MapTileArea;

    .line 29
    .line 30
    invoke-virtual {v2}, Lorg/osmdroid/util/MapTileArea;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget-object v3, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    .line 35
    .line 36
    invoke-virtual {v3}, Lorg/osmdroid/util/MapTileAreaList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    invoke-virtual {p0, v2}, Lorg/osmdroid/tileprovider/MapTileCache;->ensureCapacity(I)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    iget-boolean v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mStressedMemory:Z

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCapacity:I

    .line 52
    .line 53
    sub-int v1, v0, v1

    .line 54
    .line 55
    if-gtz v1, :cond_2

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mGC:Lorg/osmdroid/util/MapTileList;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lorg/osmdroid/tileprovider/MapTileCache;->populateSyncCachedTiles(Lorg/osmdroid/util/MapTileList;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    :goto_0
    iget-object v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mGC:Lorg/osmdroid/util/MapTileList;

    .line 65
    .line 66
    invoke-virtual {v2}, Lorg/osmdroid/util/MapTileList;->getSize()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ge v0, v2, :cond_5

    .line 71
    .line 72
    iget-object v2, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mGC:Lorg/osmdroid/util/MapTileList;

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Lorg/osmdroid/util/MapTileList;->get(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    invoke-direct {p0, v2, v3}, Lorg/osmdroid/tileprovider/MapTileCache;->shouldKeepTile(J)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {p0, v2, v3}, Lorg/osmdroid/tileprovider/MapTileCache;->remove(J)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v1, v1, -0x1

    .line 89
    .line 90
    if-nez v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    :goto_2
    return-void
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

.method public getAdditionalMapTileList()Lorg/osmdroid/util/MapTileAreaList;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAdditionalMapTileList:Lorg/osmdroid/util/MapTileAreaList;

    return-object v0
.end method

.method public getMapTile(J)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p1
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

.method public getMapTileArea()Lorg/osmdroid/util/MapTileArea;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mMapTileArea:Lorg/osmdroid/util/MapTileArea;

    return-object v0
.end method

.method public getPreCache()Lorg/osmdroid/tileprovider/MapTilePreCache;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mPreCache:Lorg/osmdroid/tileprovider/MapTilePreCache;

    return-object v0
.end method

.method public getProtectedTileComputers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/MapTileAreaComputer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mComputers:Ljava/util/List;

    return-object v0
.end method

.method public getProtectedTileContainers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/osmdroid/util/MapTileContainer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mProtectors:Ljava/util/List;

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public getTileRemovedListener()Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mTileRemovedListener:Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;

    return-object v0
.end method

.method public maintenance()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileCache;->garbageCollection()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mPreCache:Lorg/osmdroid/tileprovider/MapTilePreCache;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTilePreCache;->fill()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public putTile(JLandroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p1

    .line 20
    :cond_0
    :goto_0
    return-void
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

.method protected remove(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mCachedTiles:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileCache;->getTileRemovedListener()Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/osmdroid/tileprovider/MapTileCache;->getTileRemovedListener()Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0, p1, p2}, Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;->onTileRemoved(J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, v1}, Lorg/osmdroid/tileprovider/BitmapPool;->asyncRecycle(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
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

.method public setAutoEnsureCapacity(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mAutoEnsureCapacity:Z

    return-void
.end method

.method public setStressedMemory(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mStressedMemory:Z

    return-void
.end method

.method public setTileRemovedListener(Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/MapTileCache;->mTileRemovedListener:Lorg/osmdroid/tileprovider/MapTileCache$TileRemovedListener;

    return-void
.end method
