.class public Lorg/osmdroid/views/overlay/TilesOverlay;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/IOverlayMenuProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;
    }
.end annotation


# static fields
.field public static final INVERT_COLORS:Landroid/graphics/ColorFilter;

.field public static final MENU_MAP_MODE:I

.field public static final MENU_OFFLINE:I

.field public static final MENU_SNAPSHOT:I

.field public static final MENU_STATES:I

.field public static final MENU_TILE_SOURCE_STARTING_ID:I

.field static final negate:[F


# instance fields
.field private ctx:Landroid/content/Context;

.field private currentColorFilter:Landroid/graphics/ColorFilter;

.field private horizontalWrapEnabled:Z

.field private mCanvasRect:Landroid/graphics/Rect;

.field protected final mDebugPaint:Landroid/graphics/Paint;

.field private final mIntersectionRect:Landroid/graphics/Rect;

.field private mLoadingBackgroundColor:I

.field private mLoadingLineColor:I

.field private mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

.field private mOptionsMenuEnabled:Z

.field protected mProjection:Lorg/osmdroid/views/Projection;

.field private final mProtectedTiles:Landroid/graphics/Rect;

.field private final mTileLooper:Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

.field protected final mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

.field private final mTileRect:Landroid/graphics/Rect;

.field private final mTileStates:Lorg/osmdroid/tileprovider/TileStates;

.field protected final mViewPort:Lorg/osmdroid/util/RectL;

.field protected userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

.field private verticalWrapEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_MAP_MODE:I

    .line 6
    .line 7
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuIdSequence(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_TILE_SOURCE_STARTING_ID:I

    .line 20
    .line 21
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_OFFLINE:I

    .line 26
    .line 27
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sput v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_SNAPSHOT:I

    .line 32
    .line 33
    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sput v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_STATES:I

    .line 38
    .line 39
    const/16 v0, 0x14

    .line 40
    .line 41
    new-array v0, v0, [F

    .line 42
    .line 43
    fill-array-data v0, :array_0

    .line 44
    .line 45
    .line 46
    sput-object v0, Lorg/osmdroid/views/overlay/TilesOverlay;->negate:[F

    .line 47
    .line 48
    new-instance v1, Landroid/graphics/ColorMatrixColorFilter;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Landroid/graphics/ColorMatrixColorFilter;-><init>([F)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lorg/osmdroid/views/overlay/TilesOverlay;->INVERT_COLORS:Landroid/graphics/ColorFilter;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        0x437f0000    # 255.0f
        0x0
        -0x40800000    # -1.0f
        0x0
        0x0
        0x437f0000    # 255.0f
        0x0
        0x0
        -0x40800000    # -1.0f
        0x0
        0x437f0000    # 255.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
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

.method public constructor <init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0, v0}, Lorg/osmdroid/views/overlay/TilesOverlay;-><init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;ZZ)V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/tileprovider/MapTileProviderBase;Landroid/content/Context;ZZ)V
    .locals 4

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

    .line 4
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mDebugPaint:Landroid/graphics/Paint;

    .line 5
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileRect:Landroid/graphics/Rect;

    .line 6
    new-instance v1, Lorg/osmdroid/util/RectL;

    invoke-direct {v1}, Lorg/osmdroid/util/RectL;-><init>()V

    iput-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mViewPort:Lorg/osmdroid/util/RectL;

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mOptionsMenuEnabled:Z

    .line 8
    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    const/16 v2, 0xd8

    const/16 v3, 0xd0

    .line 9
    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    iput v2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    const/16 v2, 0xc8

    const/16 v3, 0xc0

    .line 10
    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    iput v2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingLineColor:I

    .line 11
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->horizontalWrapEnabled:Z

    .line 12
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->verticalWrapEnabled:Z

    .line 13
    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->currentColorFilter:Landroid/graphics/ColorFilter;

    .line 14
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProtectedTiles:Landroid/graphics/Rect;

    .line 15
    new-instance v0, Lorg/osmdroid/tileprovider/TileStates;

    invoke-direct {v0}, Lorg/osmdroid/tileprovider/TileStates;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileStates:Lorg/osmdroid/tileprovider/TileStates;

    .line 16
    new-instance v0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

    invoke-direct {v0, p0}, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;-><init>(Lorg/osmdroid/views/overlay/TilesOverlay;)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileLooper:Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

    .line 17
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mIntersectionRect:Landroid/graphics/Rect;

    .line 18
    iput-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->ctx:Landroid/content/Context;

    if-eqz p1, :cond_0

    .line 19
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 20
    invoke-virtual {p0, p3}, Lorg/osmdroid/views/overlay/TilesOverlay;->setHorizontalWrapEnabled(Z)V

    .line 21
    invoke-virtual {p0, p4}, Lorg/osmdroid/views/overlay/TilesOverlay;->setVerticalWrapEnabled(Z)V

    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must pass a valid tile provider to the tiles overlay."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lorg/osmdroid/views/overlay/TilesOverlay;)Lorg/osmdroid/tileprovider/TileStates;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileStates:Lorg/osmdroid/tileprovider/TileStates;

    return-object p0
.end method

.method static synthetic access$100(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-direct {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getLoadingTile()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileRect:Landroid/graphics/Rect;

    return-object p0
.end method

.method private clearLoadingTile()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 5
    .line 6
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Lorg/osmdroid/tileprovider/BitmapPool;->asyncRecycle(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
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
.end method

.method private getLoadingTile()Landroid/graphics/drawable/Drawable;
    .locals 15

    .line 1
    const-string v0, "OsmDroid"

    .line 2
    .line 3
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    iget v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 17
    .line 18
    invoke-virtual {v1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 25
    .line 26
    invoke-virtual {v1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Lorg/osmdroid/tileprovider/tilesource/e;->getTileSizePixels()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/16 v1, 0x100

    .line 36
    .line 37
    :goto_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 38
    .line 39
    invoke-static {v1, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v9, Landroid/graphics/Canvas;

    .line 44
    .line 45
    invoke-direct {v9, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 46
    .line 47
    .line 48
    new-instance v10, Landroid/graphics/Paint;

    .line 49
    .line 50
    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 51
    .line 52
    .line 53
    iget v3, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    .line 54
    .line 55
    invoke-virtual {v9, v3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 56
    .line 57
    .line 58
    iget v3, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingLineColor:I

    .line 59
    .line 60
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    .line 66
    .line 67
    div-int/lit8 v11, v1, 0x10

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    move v12, v3

    .line 71
    :goto_1
    if-ge v12, v1, :cond_2

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    int-to-float v13, v12

    .line 75
    int-to-float v14, v1

    .line 76
    move-object v3, v9

    .line 77
    move v5, v13

    .line 78
    move v6, v14

    .line 79
    move v7, v13

    .line 80
    move-object v8, v10

    .line 81
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    move-object v3, v9

    .line 86
    move v4, v13

    .line 87
    move v6, v13

    .line 88
    move v7, v14

    .line 89
    move-object v8, v10

    .line 90
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    add-int/2addr v12, v11

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 96
    .line 97
    invoke-direct {v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catch_0
    const-string v1, "NullPointerException getting loading tile"

    .line 104
    .line 105
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catch_1
    const-string v1, "OutOfMemoryError getting loading tile"

    .line 113
    .line 114
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_2
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 121
    .line 122
    return-object v0
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


# virtual methods
.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 6

    .line 1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lorg/osmdroid/config/c;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "OsmDroid"

    .line 12
    .line 13
    const-string v1, "onDraw"

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/overlay/TilesOverlay;->setViewPort(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getProjection()Lorg/osmdroid/views/Projection;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getProjection()Lorg/osmdroid/views/Projection;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    iget-object v5, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mViewPort:Lorg/osmdroid/util/RectL;

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    move-object v1, p1

    .line 41
    invoke-virtual/range {v0 .. v5}, Lorg/osmdroid/views/overlay/TilesOverlay;->drawTiles(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;DLorg/osmdroid/util/RectL;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public drawTiles(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;DLorg/osmdroid/util/RectL;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    .line 2
    .line 3
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileLooper:Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

    .line 4
    .line 5
    invoke-virtual {p2, p3, p4, p5, p1}, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->loop(DLorg/osmdroid/util/RectL;Landroid/graphics/Canvas;)V

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

.method protected getCanvasRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mCanvasRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getLoadingBackgroundColor()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    return v0
.end method

.method public getLoadingLineColor()I
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingLineColor:I

    return v0
.end method

.method public getMaximumZoomLevel()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getMaximumZoomLevel()I

    move-result v0

    return v0
.end method

.method public getMinimumZoomLevel()I
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getMinimumZoomLevel()I

    move-result v0

    return v0
.end method

.method protected getProjection()Lorg/osmdroid/views/Projection;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    return-object v0
.end method

.method public getTileStates()Lorg/osmdroid/tileprovider/TileStates;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileStates:Lorg/osmdroid/tileprovider/TileStates;

    return-object v0
.end method

.method public isHorizontalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->horizontalWrapEnabled:Z

    return v0
.end method

.method public isOptionsMenuEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mOptionsMenuEnabled:Z

    return v0
.end method

.method public isVerticalWrapEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->verticalWrapEnabled:Z

    return v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 6

    .line 1
    sget v0, Lorg/osmdroid/library/R$string;->F:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v1, v1, v1, v0}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v2, Lorg/osmdroid/library/R$drawable;->e:I

    .line 9
    .line 10
    invoke-interface {v0, v2}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 34
    .line 35
    sget v4, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_MAP_MODE:I

    .line 36
    .line 37
    add-int/2addr v4, p2

    .line 38
    sget v5, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_TILE_SOURCE_STARTING_ID:I

    .line 39
    .line 40
    add-int/2addr v5, v2

    .line 41
    add-int/2addr v5, p2

    .line 42
    invoke-interface {v3}, Lorg/osmdroid/tileprovider/tilesource/e;->name()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v0, v4, v5, v1, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget v2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_MAP_MODE:I

    .line 53
    .line 54
    add-int/2addr v2, p2

    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-interface {v0, v2, v3, v3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->ctx:Landroid/content/Context;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->useDataConnection()Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-eqz p3, :cond_1

    .line 68
    .line 69
    sget p3, Lorg/osmdroid/library/R$string;->Q:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    sget p3, Lorg/osmdroid/library/R$string;->R:I

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->ctx:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget v2, Lorg/osmdroid/library/R$drawable;->g:I

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget v2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_OFFLINE:I

    .line 91
    .line 92
    add-int/2addr v2, p2

    .line 93
    invoke-interface {p1, v1, v2, v1, p3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-interface {p3, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 98
    .line 99
    .line 100
    sget p3, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_SNAPSHOT:I

    .line 101
    .line 102
    add-int/2addr p3, p2

    .line 103
    sget v0, Lorg/osmdroid/library/R$string;->T:I

    .line 104
    .line 105
    invoke-interface {p1, v1, p3, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 106
    .line 107
    .line 108
    sget p3, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_STATES:I

    .line 109
    .line 110
    add-int/2addr p3, p2

    .line 111
    sget p2, Lorg/osmdroid/library/R$string;->U:I

    .line 112
    .line 113
    invoke-interface {p1, v1, p3, v1, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 114
    .line 115
    .line 116
    :cond_2
    return v3
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->detach()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->ctx:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/osmdroid/tileprovider/BitmapPool;->asyncRecycle(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingTile:Landroid/graphics/drawable/BitmapDrawable;

    .line 19
    .line 20
    invoke-static {}, Lorg/osmdroid/tileprovider/BitmapPool;->getInstance()Lorg/osmdroid/tileprovider/BitmapPool;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lorg/osmdroid/tileprovider/BitmapPool;->asyncRecycle(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

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

.method public onOptionsItemSelected(Landroid/view/MenuItem;ILorg/osmdroid/views/MapView;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sub-int/2addr p1, p2

    .line 6
    sget p2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_TILE_SOURCE_STARTING_ID:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-lt p1, p2, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, p2

    .line 20
    if-ge p1, v1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sub-int/2addr p1, p2

    .line 27
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lorg/osmdroid/tileprovider/tilesource/e;

    .line 32
    .line 33
    invoke-virtual {p3, p1}, Lorg/osmdroid/views/MapView;->setTileSource(Lorg/osmdroid/tileprovider/tilesource/e;)V

    .line 34
    .line 35
    .line 36
    return v0

    .line 37
    :cond_0
    sget p2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_OFFLINE:I

    .line 38
    .line 39
    if-ne p1, p2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->useDataConnection()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    xor-int/2addr p1, v0

    .line 46
    invoke-virtual {p3, p1}, Lorg/osmdroid/views/MapView;->setUseDataConnection(Z)V

    .line 47
    .line 48
    .line 49
    return v0

    .line 50
    :cond_1
    sget p2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_STATES:I

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-ne p1, p2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileStates:Lorg/osmdroid/tileprovider/TileStates;

    .line 60
    .line 61
    invoke-virtual {p2}, Lorg/osmdroid/tileprovider/TileStates;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 70
    .line 71
    .line 72
    return v0

    .line 73
    :cond_2
    sget p2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_SNAPSHOT:I

    .line 74
    .line 75
    if-ne p1, p2, :cond_3

    .line 76
    .line 77
    new-instance p1, Lorg/osmdroid/views/drawing/a;

    .line 78
    .line 79
    new-instance p2, Lorg/osmdroid/views/overlay/TilesOverlay$1;

    .line 80
    .line 81
    invoke-direct {p2, p0}, Lorg/osmdroid/views/overlay/TilesOverlay$1;-><init>(Lorg/osmdroid/views/overlay/TilesOverlay;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, p2, v0, p3}, Lorg/osmdroid/views/drawing/a;-><init>(Lorg/osmdroid/views/drawing/a$a;ILorg/osmdroid/views/MapView;)V

    .line 85
    .line 86
    .line 87
    new-instance p2, Ljava/lang/Thread;

    .line 88
    .line 89
    invoke-direct {p2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    const-string p1, "TilesOverlaySnapShotThread"

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 98
    .line 99
    .line 100
    return v0

    .line 101
    :cond_3
    return v1
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

.method public onPrepareOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 3

    .line 1
    invoke-static {}, Lorg/osmdroid/tileprovider/tilesource/TileSourceFactory;->getTileSources()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->getTileProvider()Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileSource()Lorg/osmdroid/tileprovider/tilesource/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    sget v2, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_TILE_SOURCE_STARTING_ID:I

    .line 21
    .line 22
    add-int/2addr v2, v0

    .line 23
    add-int/2addr v2, p2

    .line 24
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 29
    .line 30
    .line 31
    :cond_0
    sget v0, Lorg/osmdroid/views/overlay/TilesOverlay;->MENU_OFFLINE:I

    .line 32
    .line 33
    add-int/2addr v0, p2

    .line 34
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->useDataConnection()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    sget p2, Lorg/osmdroid/library/R$string;->Q:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget p2, Lorg/osmdroid/library/R$string;->R:I

    .line 48
    .line 49
    :goto_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 50
    .line 51
    .line 52
    return v1
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

.method protected onTileReadyToDraw(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->currentColorFilter:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 4
    .line 5
    .line 6
    iget v0, p3, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    iget v1, p3, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    iget v2, p3, Landroid/graphics/Rect;->right:I

    .line 11
    .line 12
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 13
    .line 14
    invoke-virtual {p2, v0, v1, v2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getCanvasRect()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mIntersectionRect:Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getClipBounds()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1, p3}, Landroid/graphics/Rect;->setIntersect(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    if-nez p3, :cond_1

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 41
    .line 42
    .line 43
    iget-object p3, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mIntersectionRect:Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 52
    .line 53
    .line 54
    return-void
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

.method public protectDisplayedTilesForCache(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/osmdroid/views/overlay/TilesOverlay;->setViewPort(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mViewPort:Lorg/osmdroid/util/RectL;

    .line 9
    .line 10
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    .line 11
    .line 12
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Lorg/osmdroid/util/TileSystem;->getTileSize(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProtectedTiles:Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-static {p1, v0, v1, p2}, Lorg/osmdroid/util/TileSystem;->getTileFromMercator(Lorg/osmdroid/util/RectL;DLandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    .line 26
    .line 27
    invoke-virtual {p1}, Lorg/osmdroid/views/Projection;->getZoomLevel()D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    invoke-static {p1, p2}, Lorg/osmdroid/util/TileSystem;->getInputTileZoomLevel(D)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 36
    .line 37
    invoke-virtual {p2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileCache()Lorg/osmdroid/tileprovider/MapTileCache;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Lorg/osmdroid/tileprovider/MapTileCache;->getMapTileArea()Lorg/osmdroid/util/MapTileArea;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProtectedTiles:Landroid/graphics/Rect;

    .line 46
    .line 47
    invoke-virtual {p2, p1, v0}, Lorg/osmdroid/util/MapTileArea;->set(ILandroid/graphics/Rect;)Lorg/osmdroid/util/MapTileArea;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 51
    .line 52
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getTileCache()Lorg/osmdroid/tileprovider/MapTileCache;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lorg/osmdroid/tileprovider/MapTileCache;->maintenance()V

    .line 57
    .line 58
    .line 59
    return-void
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

.method protected setCanvasRect(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mCanvasRect:Landroid/graphics/Rect;

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->currentColorFilter:Landroid/graphics/ColorFilter;

    return-void
.end method

.method public setHorizontalWrapEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->horizontalWrapEnabled:Z

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileLooper:Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/osmdroid/util/TileLooper;->setHorizontalWrapEnabled(Z)V

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

.method public setLoadingBackgroundColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingBackgroundColor:I

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->clearLoadingTile()V

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

.method public setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->userSelectedLoadingDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setLoadingLineColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingLineColor:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mLoadingLineColor:I

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->clearLoadingTile()V

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

.method public setOptionsMenuEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mOptionsMenuEnabled:Z

    return-void
.end method

.method protected setProjection(Lorg/osmdroid/views/Projection;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    return-void
.end method

.method public setUseDataConnection(Z)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {v0, p1}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->setUseDataConnection(Z)V

    return-void
.end method

.method public setVerticalWrapEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->verticalWrapEnabled:Z

    .line 2
    .line 3
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileLooper:Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/osmdroid/util/TileLooper;->setVerticalWrapEnabled(Z)V

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

.method protected setViewPort(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/TilesOverlay;->setProjection(Lorg/osmdroid/views/Projection;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/TilesOverlay;->getProjection()Lorg/osmdroid/views/Projection;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mViewPort:Lorg/osmdroid/util/RectL;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lorg/osmdroid/views/Projection;->getMercatorViewPort(Lorg/osmdroid/util/RectL;)Lorg/osmdroid/util/RectL;

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
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

.method public useDataConnection()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->useDataConnection()Z

    move-result v0

    return v0
.end method
