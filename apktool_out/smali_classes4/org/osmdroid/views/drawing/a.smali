.class public Lorg/osmdroid/views/drawing/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/drawing/a$a;,
        Lorg/osmdroid/views/drawing/a$b;
    }
.end annotation


# static fields
.field public static final o:I = 0x1

.field public static final p:I = 0x2

.field public static final q:I = 0x4

.field public static final r:I = 0x8

.field public static final s:I = 0xf


# instance fields
.field private final a:Lorg/osmdroid/util/RectL;

.field private final b:I

.field private c:Lorg/osmdroid/views/Projection;

.field private d:Lorg/osmdroid/views/drawing/b;

.field private e:Lorg/osmdroid/views/drawing/a$a;

.field private f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

.field private g:Lorg/osmdroid/views/overlay/TilesOverlay;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lorg/osmdroid/views/drawing/a$b;

.field private j:Landroid/graphics/Bitmap;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/drawing/a$a;ILorg/osmdroid/tileprovider/MapTileProviderBase;Ljava/util/List;Lorg/osmdroid/views/Projection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/osmdroid/views/drawing/a$a;",
            "I",
            "Lorg/osmdroid/tileprovider/MapTileProviderBase;",
            "Ljava/util/List<",
            "Lorg/osmdroid/views/overlay/Overlay;",
            ">;",
            "Lorg/osmdroid/views/Projection;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lorg/osmdroid/util/RectL;

    invoke-direct {v0}, Lorg/osmdroid/util/RectL;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->a:Lorg/osmdroid/util/RectL;

    .line 7
    sget-object v1, Lorg/osmdroid/views/drawing/a$b;->NOTHING:Lorg/osmdroid/views/drawing/a$b;

    iput-object v1, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    .line 8
    iput-object p1, p0, Lorg/osmdroid/views/drawing/a;->e:Lorg/osmdroid/views/drawing/a$a;

    .line 9
    iput p2, p0, Lorg/osmdroid/views/drawing/a;->b:I

    .line 10
    iput-object p3, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 11
    iput-object p4, p0, Lorg/osmdroid/views/drawing/a;->h:Ljava/util/List;

    .line 12
    iput-object p5, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 13
    invoke-virtual {p5, v0}, Lorg/osmdroid/views/Projection;->getMercatorViewPort(Lorg/osmdroid/util/RectL;)Lorg/osmdroid/util/RectL;

    .line 14
    new-instance p1, Lorg/osmdroid/views/overlay/TilesOverlay;

    iget-object p2, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lorg/osmdroid/views/overlay/TilesOverlay;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;)V

    iput-object p1, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 15
    iget-object p2, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->isHorizontalWrapEnabled()Z

    move-result p2

    invoke-virtual {p1, p2}, Lorg/osmdroid/views/overlay/TilesOverlay;->setHorizontalWrapEnabled(Z)V

    .line 16
    iget-object p1, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    iget-object p2, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->isVerticalWrapEnabled()Z

    move-result p2

    invoke-virtual {p1, p2}, Lorg/osmdroid/views/overlay/TilesOverlay;->setVerticalWrapEnabled(Z)V

    .line 17
    new-instance p1, Lorg/osmdroid/views/drawing/b;

    invoke-direct {p1, p0}, Lorg/osmdroid/views/drawing/b;-><init>(Lorg/osmdroid/views/drawing/a;)V

    iput-object p1, p0, Lorg/osmdroid/views/drawing/a;->d:Lorg/osmdroid/views/drawing/b;

    .line 18
    iget-object p1, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileRequestCompleteHandlers()Ljava/util/Collection;

    move-result-object p1

    iget-object p2, p0, Lorg/osmdroid/views/drawing/a;->d:Lorg/osmdroid/views/drawing/b;

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/drawing/a$a;ILorg/osmdroid/views/MapView;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    move-result-object v3

    .line 2
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->getOverlays()Ljava/util/List;

    move-result-object v4

    .line 3
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 4
    invoke-direct/range {v0 .. v5}, Lorg/osmdroid/views/drawing/a;-><init>(Lorg/osmdroid/views/drawing/a$a;ILorg/osmdroid/tileprovider/MapTileProviderBase;Ljava/util/List;Lorg/osmdroid/views/Projection;)V

    return-void
.end method

.method private a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/osmdroid/views/Projection;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->j:Landroid/graphics/Bitmap;

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/Canvas;

    .line 22
    .line 23
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->j:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-virtual {v1, v0, v2, v7}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 36
    .line 37
    iget-object v3, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 38
    .line 39
    invoke-virtual {v3}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    iget-object v6, p0, Lorg/osmdroid/views/drawing/a;->a:Lorg/osmdroid/util/RectL;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/overlay/TilesOverlay;->drawTiles(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;DLorg/osmdroid/util/RectL;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->h:Ljava/util/List;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Lorg/osmdroid/views/overlay/Overlay;

    .line 68
    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    invoke-virtual {v2}, Lorg/osmdroid/views/overlay/Overlay;->isEnabled()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    iget-object v3, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 78
    .line 79
    invoke-virtual {v2, v0, v3}, Lorg/osmdroid/views/overlay/Overlay;->draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 84
    .line 85
    invoke-virtual {v1, v0, v7}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    .line 86
    .line 87
    .line 88
    return-void
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

.method public static d()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getTileStates()Lorg/osmdroid/tileprovider/TileStates;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 18
    .line 19
    invoke-virtual {v3}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object v6, p0, Lorg/osmdroid/views/drawing/a;->a:Lorg/osmdroid/util/RectL;

    .line 24
    .line 25
    invoke-virtual/range {v1 .. v6}, Lorg/osmdroid/views/overlay/TilesOverlay;->drawTiles(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;DLorg/osmdroid/util/RectL;)V

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lorg/osmdroid/views/drawing/a;->b:I

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    const/16 v3, 0xf

    .line 34
    .line 35
    if-eq v1, v3, :cond_5

    .line 36
    .line 37
    and-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->getUpToDate()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    move v2, v3

    .line 49
    :cond_2
    if-eqz v2, :cond_3

    .line 50
    .line 51
    iget v1, p0, Lorg/osmdroid/views/drawing/a;->b:I

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x2

    .line 54
    .line 55
    if-nez v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->getExpired()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    move v2, v3

    .line 64
    :cond_3
    if-eqz v2, :cond_4

    .line 65
    .line 66
    iget v1, p0, Lorg/osmdroid/views/drawing/a;->b:I

    .line 67
    .line 68
    and-int/lit8 v1, v1, 0x4

    .line 69
    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->getScaled()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    move v2, v3

    .line 79
    :cond_4
    if-eqz v2, :cond_5

    .line 80
    .line 81
    iget v1, p0, Lorg/osmdroid/views/drawing/a;->b:I

    .line 82
    .line 83
    and-int/lit8 v1, v1, 0x8

    .line 84
    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->getNotFound()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_5
    if-eqz v2, :cond_a

    .line 95
    .line 96
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    .line 97
    .line 98
    sget-object v2, Lorg/osmdroid/views/drawing/a$b;->CANVAS_OK:Lorg/osmdroid/views/drawing/a$b;

    .line 99
    .line 100
    if-eq v1, v2, :cond_9

    .line 101
    .line 102
    sget-object v3, Lorg/osmdroid/views/drawing/a$b;->PAINTING:Lorg/osmdroid/views/drawing/a$b;

    .line 103
    .line 104
    if-ne v1, v3, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->j()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_7

    .line 112
    .line 113
    return-void

    .line 114
    :cond_7
    iput-object v3, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    .line 115
    .line 116
    iget-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->k:Z

    .line 117
    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    return-void

    .line 121
    :cond_8
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->a()V

    .line 122
    .line 123
    .line 124
    iput-object v2, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    .line 125
    .line 126
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->e:Lorg/osmdroid/views/drawing/a$a;

    .line 127
    .line 128
    if-eqz v1, :cond_a

    .line 129
    .line 130
    invoke-interface {v1, p0}, Lorg/osmdroid/views/drawing/a$a;->callback(Lorg/osmdroid/views/drawing/a;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_9
    :goto_0
    return-void

    .line 135
    :cond_a
    :goto_1
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->i()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_1

    .line 140
    .line 141
    return-void
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

.method private declared-synchronized h()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->l:Z

    .line 4
    .line 5
    iget-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    xor-int/2addr v0, v1

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
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

.method private declared-synchronized i()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return v1

    .line 15
    :cond_1
    :try_start_2
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->l:Z

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iput-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->m:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return v1

    .line 23
    :cond_2
    :try_start_3
    iput-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->l:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    monitor-exit p0

    .line 30
    throw v0
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

.method private declared-synchronized j()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->n:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    iput-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    monitor-exit p0

    .line 16
    throw v0
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

.method private declared-synchronized k()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return v1

    .line 15
    :cond_1
    :try_start_2
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return v1

    .line 21
    :cond_2
    :try_start_3
    iget-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->m:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return v1

    .line 27
    :cond_3
    :try_start_4
    iput-boolean v1, p0, Lorg/osmdroid/views/drawing/a;->l:Z

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->m:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return v0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    monitor-exit p0

    .line 36
    throw v0
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

.method private static l(Landroid/graphics/Bitmap;Ljava/io/File;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 12
    .line 13
    const/16 v0, 0x64

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    move-object v0, v1

    .line 30
    goto :goto_3

    .line 31
    :catch_1
    move-exception p0

    .line 32
    move-object v0, v1

    .line 33
    goto :goto_1

    .line 34
    :catchall_1
    move-exception p0

    .line 35
    goto :goto_3

    .line 36
    :catch_2
    move-exception p0

    .line 37
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 38
    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_3
    move-exception p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_2
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :goto_3
    if-eqz v0, :cond_1

    .line 53
    .line 54
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :catch_4
    move-exception p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_4
    throw p0
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
.method public b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/drawing/a;->j:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()Lorg/osmdroid/views/drawing/a$b;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/drawing/a;->k:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->c:Lorg/osmdroid/views/Projection;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileRequestCompleteHandlers()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lorg/osmdroid/views/drawing/a;->d:Lorg/osmdroid/views/drawing/b;

    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 19
    .line 20
    invoke-virtual {v1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->detach()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->f:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 24
    .line 25
    iget-object v1, p0, Lorg/osmdroid/views/drawing/a;->d:Lorg/osmdroid/views/drawing/b;

    .line 26
    .line 27
    invoke-virtual {v1}, Lorg/osmdroid/views/drawing/b;->a()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->d:Lorg/osmdroid/views/drawing/b;

    .line 31
    .line 32
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->e:Lorg/osmdroid/views/drawing/a$a;

    .line 33
    .line 34
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->g:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 35
    .line 36
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->h:Ljava/util/List;

    .line 37
    .line 38
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->j:Landroid/graphics/Bitmap;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public g()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/osmdroid/views/drawing/a;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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

.method public m(Ljava/io/File;)Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/drawing/a;->j:Landroid/graphics/Bitmap;

    invoke-static {v0, p1}, Lorg/osmdroid/views/drawing/a;->l(Landroid/graphics/Bitmap;Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public run()V
    .locals 1

    .line 1
    sget-object v0, Lorg/osmdroid/views/drawing/a$b;->STARTED:Lorg/osmdroid/views/drawing/a$b;

    .line 2
    .line 3
    iput-object v0, p0, Lorg/osmdroid/views/drawing/a;->i:Lorg/osmdroid/views/drawing/a$b;

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/osmdroid/views/drawing/a;->g()V

    .line 6
    .line 7
    .line 8
    return-void
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
