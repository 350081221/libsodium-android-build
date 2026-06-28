.class public Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;
.super Lorg/osmdroid/views/overlay/ItemizedIconOverlay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Item:",
        "Lorg/osmdroid/views/overlay/OverlayItem;",
        ">",
        "Lorg/osmdroid/views/overlay/ItemizedIconOverlay<",
        "TItem;>;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final DEFAULTMARKER_BACKGROUNDCOLOR:I

.field private DESCRIPTION_BOX_CORNERWIDTH:I

.field private DESCRIPTION_BOX_PADDING:I

.field private DESCRIPTION_LINE_HEIGHT:I

.field private DESCRIPTION_MAXWIDTH:I

.field private DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT:I

.field private FONT_SIZE_DP:I

.field private UNKNOWN:Ljava/lang/String;

.field private fontSizePixels:I

.field private mContext:Landroid/content/Context;

.field protected mDescriptionPaint:Landroid/graphics/Paint;

.field protected mFocusItemsOnTap:Z

.field protected mFocusedItemIndex:I

.field private final mFocusedScreenCoords:Landroid/graphics/Point;

.field protected mMarkerBackgroundPaint:Landroid/graphics/Paint;

.field protected mMarkerFocusedBackgroundColor:I

.field protected mMarkerFocusedBase:Landroid/graphics/drawable/Drawable;

.field private final mRect:Landroid/graphics/Rect;

.field protected mTitlePaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "TItem;>;",
            "Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener<",
            "TItem;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p3, p1}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;-><init>(Ljava/util/List;Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TItem;>;",
            "Landroid/graphics/drawable/Drawable;",
            "Landroid/graphics/drawable/Drawable;",
            "I",
            "Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener<",
            "TItem;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2, p5, p6}, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;-><init>(Ljava/util/List;Landroid/graphics/drawable/Drawable;Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;Landroid/content/Context;)V

    const/16 p1, 0xb9

    const/16 p2, 0x4a

    const/16 p5, 0x65

    .line 5
    invoke-static {p5, p1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DEFAULTMARKER_BACKGROUNDCOLOR:I

    const/4 p2, 0x3

    .line 6
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_PADDING:I

    .line 7
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_CORNERWIDTH:I

    const/4 p2, 0x2

    .line 8
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT:I

    const/16 p2, 0xe

    .line 9
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->FONT_SIZE_DP:I

    const/16 p2, 0x258

    .line 10
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_MAXWIDTH:I

    const/16 p2, 0x1e

    .line 11
    iput p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_LINE_HEIGHT:I

    .line 12
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    iput-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedScreenCoords:Landroid/graphics/Point;

    .line 13
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 14
    iput-object p6, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mContext:Landroid/content/Context;

    if-nez p3, :cond_0

    .line 15
    invoke-virtual {p6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lorg/osmdroid/library/R$drawable;->i:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    sget-object p3, Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;->BOTTOM_CENTER:Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;

    .line 16
    invoke-virtual {p0, p2, p3}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->boundToHotspot(Landroid/graphics/drawable/Drawable;Lorg/osmdroid/views/overlay/OverlayItem$HotspotPlace;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBase:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 17
    :cond_0
    iput-object p3, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBase:Landroid/graphics/drawable/Drawable;

    :goto_0
    const/high16 p2, -0x80000000

    if-eq p4, p2, :cond_1

    goto :goto_1

    :cond_1
    move p4, p1

    .line 18
    :goto_1
    iput p4, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBackgroundColor:I

    .line 19
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->calculateDrawSettings()V

    .line 20
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->unSetFocusedItem()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;Landroid/content/Context;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TItem;>;",
            "Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener<",
            "TItem;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/osmdroid/library/R$drawable;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v5, 0x0

    const/high16 v6, -0x80000000

    move-object v2, p0

    move-object v3, p1

    move-object v7, p2

    move-object v8, p3

    .line 3
    invoke-direct/range {v2 .. v8}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;-><init>(Ljava/util/List;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;Landroid/content/Context;)V

    return-void
.end method

.method private calculateDrawSettings()V
    .locals 5

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->FONT_SIZE_DP:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    float-to-int v0, v0

    .line 20
    iput v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->fontSizePixels:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x5

    .line 23
    .line 24
    iput v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_LINE_HEIGHT:I

    .line 25
    .line 26
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mContext:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 37
    .line 38
    int-to-double v0, v0

    .line 39
    const-wide v3, 0x3fe999999999999aL    # 0.8

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    mul-double/2addr v0, v3

    .line 45
    double-to-int v0, v0

    .line 46
    iput v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_MAXWIDTH:I

    .line 47
    .line 48
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mContext:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget v1, Lorg/osmdroid/library/R$string;->W:I

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->UNKNOWN:Ljava/lang/String;

    .line 61
    .line 62
    new-instance v0, Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerBackgroundPaint:Landroid/graphics/Paint;

    .line 68
    .line 69
    new-instance v0, Landroid/graphics/Paint;

    .line 70
    .line 71
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 80
    .line 81
    iget v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->fontSizePixels:I

    .line 82
    .line 83
    int-to-float v1, v1

    .line 84
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 85
    .line 86
    .line 87
    new-instance v0, Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mTitlePaint:Landroid/graphics/Paint;

    .line 93
    .line 94
    iget v1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->fontSizePixels:I

    .line 95
    .line 96
    int-to-float v1, v1

    .line 97
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mTitlePaint:Landroid/graphics/Paint;

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mTitlePaint:Landroid/graphics/Paint;

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 108
    .line 109
    .line 110
    return-void
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


# virtual methods
.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p2}, Lorg/osmdroid/views/overlay/ItemizedOverlay;->draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V

    .line 6
    .line 7
    .line 8
    iget v1, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedItemIndex:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mItemList:Ljava/util/List;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lorg/osmdroid/views/overlay/OverlayItem;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-virtual {v1, v2}, Lorg/osmdroid/views/overlay/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBase:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    :cond_2
    move-object v8, v2

    .line 36
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getPoint()Lorg/osmdroid/api/IGeoPoint;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedScreenCoords:Landroid/graphics/Point;

    .line 41
    .line 42
    move-object/from16 v9, p2

    .line 43
    .line 44
    invoke-virtual {v9, v2, v3}, Lorg/osmdroid/views/Projection;->toPixels(Lorg/osmdroid/api/IGeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-virtual {v8, v2}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedScreenCoords:Landroid/graphics/Point;

    .line 55
    .line 56
    iget v4, v3, Landroid/graphics/Point;->x:I

    .line 57
    .line 58
    iget v3, v3, Landroid/graphics/Point;->y:I

    .line 59
    .line 60
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getTitle()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->UNKNOWN:Ljava/lang/String;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getTitle()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :goto_0
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getSnippet()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-nez v3, :cond_4

    .line 81
    .line 82
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->UNKNOWN:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {v1}, Lorg/osmdroid/views/overlay/OverlayItem;->getSnippet()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    new-array v4, v3, [F

    .line 94
    .line 95
    iget-object v5, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {v5, v1, v4}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 98
    .line 99
    .line 100
    new-instance v5, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    const/4 v13, 0x0

    .line 109
    const/4 v14, 0x0

    .line 110
    :goto_2
    if-ge v10, v3, :cond_b

    .line 111
    .line 112
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isLetter(C)Z

    .line 117
    .line 118
    .line 119
    move-result v16

    .line 120
    if-nez v16, :cond_5

    .line 121
    .line 122
    move v14, v10

    .line 123
    :cond_5
    aget v16, v4, v10

    .line 124
    .line 125
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    const/16 v15, 0xa

    .line 130
    .line 131
    if-ne v6, v15, :cond_6

    .line 132
    .line 133
    add-int/lit8 v6, v10, 0x1

    .line 134
    .line 135
    invoke-virtual {v1, v11, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    move v14, v6

    .line 147
    move v12, v11

    .line 148
    const/4 v13, 0x0

    .line 149
    move v11, v14

    .line 150
    :goto_3
    const/4 v6, 0x1

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    int-to-float v6, v13

    .line 153
    add-float v6, v6, v16

    .line 154
    .line 155
    iget v15, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_MAXWIDTH:I

    .line 156
    .line 157
    int-to-float v15, v15

    .line 158
    cmpl-float v6, v6, v15

    .line 159
    .line 160
    if-lez v6, :cond_a

    .line 161
    .line 162
    if-ne v11, v14, :cond_7

    .line 163
    .line 164
    const/4 v6, 0x1

    .line 165
    goto :goto_4

    .line 166
    :cond_7
    const/4 v6, 0x0

    .line 167
    :goto_4
    if-nez v6, :cond_8

    .line 168
    .line 169
    move v10, v14

    .line 170
    :cond_8
    invoke-virtual {v1, v11, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const/16 v11, 0xa

    .line 178
    .line 179
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-eqz v6, :cond_9

    .line 187
    .line 188
    add-int/lit8 v6, v10, -0x1

    .line 189
    .line 190
    move v11, v10

    .line 191
    move v14, v11

    .line 192
    const/4 v13, 0x0

    .line 193
    move v10, v6

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    move v11, v10

    .line 196
    move v14, v11

    .line 197
    const/4 v13, 0x0

    .line 198
    :cond_a
    int-to-float v6, v13

    .line 199
    add-float v6, v6, v16

    .line 200
    .line 201
    float-to-int v6, v6

    .line 202
    move v13, v6

    .line 203
    goto :goto_3

    .line 204
    :goto_5
    add-int/2addr v10, v6

    .line 205
    goto :goto_2

    .line 206
    :cond_b
    if-eq v10, v11, :cond_c

    .line 207
    .line 208
    invoke-virtual {v1, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget-object v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 213
    .line 214
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    float-to-int v3, v3

    .line 219
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    :cond_c
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const-string v3, "\n"

    .line 231
    .line 232
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iget-object v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 237
    .line 238
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    float-to-int v3, v3

    .line 243
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    iget v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_MAXWIDTH:I

    .line 248
    .line 249
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    iget-object v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 254
    .line 255
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 256
    .line 257
    div-int/lit8 v6, v3, 0x2

    .line 258
    .line 259
    sub-int/2addr v5, v6

    .line 260
    iget v6, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_PADDING:I

    .line 261
    .line 262
    sub-int/2addr v5, v6

    .line 263
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    div-int/lit8 v4, v4, 0x2

    .line 268
    .line 269
    add-int/2addr v5, v4

    .line 270
    add-int/2addr v3, v5

    .line 271
    iget v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_PADDING:I

    .line 272
    .line 273
    mul-int/lit8 v6, v4, 0x2

    .line 274
    .line 275
    add-int/2addr v3, v6

    .line 276
    iget-object v6, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 277
    .line 278
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 279
    .line 280
    iget v10, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT:I

    .line 281
    .line 282
    sub-int v10, v6, v10

    .line 283
    .line 284
    array-length v11, v1

    .line 285
    const/4 v12, 0x1

    .line 286
    add-int/2addr v11, v12

    .line 287
    iget v12, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_LINE_HEIGHT:I

    .line 288
    .line 289
    mul-int/2addr v11, v12

    .line 290
    sub-int/2addr v10, v11

    .line 291
    mul-int/lit8 v4, v4, 0x2

    .line 292
    .line 293
    sub-int/2addr v10, v4

    .line 294
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    const/4 v11, 0x0

    .line 299
    cmpl-float v4, v4, v11

    .line 300
    .line 301
    if-eqz v4, :cond_d

    .line 302
    .line 303
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    neg-float v4, v4

    .line 311
    iget-object v12, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedScreenCoords:Landroid/graphics/Point;

    .line 312
    .line 313
    iget v13, v12, Landroid/graphics/Point;->x:I

    .line 314
    .line 315
    int-to-float v13, v13

    .line 316
    iget v12, v12, Landroid/graphics/Point;->y:I

    .line 317
    .line 318
    int-to-float v12, v12

    .line 319
    invoke-virtual {v7, v4, v13, v12}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 320
    .line 321
    .line 322
    :cond_d
    iget-object v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerBackgroundPaint:Landroid/graphics/Paint;

    .line 323
    .line 324
    const/high16 v12, -0x1000000

    .line 325
    .line 326
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 327
    .line 328
    .line 329
    new-instance v4, Landroid/graphics/RectF;

    .line 330
    .line 331
    add-int/lit8 v12, v5, -0x1

    .line 332
    .line 333
    int-to-float v12, v12

    .line 334
    add-int/lit8 v13, v10, -0x1

    .line 335
    .line 336
    int-to-float v13, v13

    .line 337
    add-int/lit8 v14, v3, 0x1

    .line 338
    .line 339
    int-to-float v14, v14

    .line 340
    add-int/lit8 v15, v6, 0x1

    .line 341
    .line 342
    int-to-float v15, v15

    .line 343
    invoke-direct {v4, v12, v13, v14, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 344
    .line 345
    .line 346
    iget v12, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_CORNERWIDTH:I

    .line 347
    .line 348
    int-to-float v13, v12

    .line 349
    int-to-float v12, v12

    .line 350
    iget-object v14, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-virtual {v7, v4, v13, v12, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 353
    .line 354
    .line 355
    iget-object v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerBackgroundPaint:Landroid/graphics/Paint;

    .line 356
    .line 357
    iget v12, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBackgroundColor:I

    .line 358
    .line 359
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 360
    .line 361
    .line 362
    new-instance v4, Landroid/graphics/RectF;

    .line 363
    .line 364
    int-to-float v12, v5

    .line 365
    int-to-float v10, v10

    .line 366
    int-to-float v13, v3

    .line 367
    int-to-float v3, v6

    .line 368
    invoke-direct {v4, v12, v10, v13, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 369
    .line 370
    .line 371
    iget v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_CORNERWIDTH:I

    .line 372
    .line 373
    int-to-float v10, v3

    .line 374
    int-to-float v3, v3

    .line 375
    iget-object v14, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerBackgroundPaint:Landroid/graphics/Paint;

    .line 376
    .line 377
    invoke-virtual {v7, v4, v10, v3, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 378
    .line 379
    .line 380
    iget v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_PADDING:I

    .line 381
    .line 382
    add-int/2addr v5, v3

    .line 383
    sub-int/2addr v6, v3

    .line 384
    array-length v3, v1

    .line 385
    const/4 v4, 0x1

    .line 386
    sub-int/2addr v3, v4

    .line 387
    :goto_6
    if-ltz v3, :cond_e

    .line 388
    .line 389
    aget-object v4, v1, v3

    .line 390
    .line 391
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    int-to-float v10, v5

    .line 396
    int-to-float v14, v6

    .line 397
    iget-object v15, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 398
    .line 399
    invoke-virtual {v7, v4, v10, v14, v15}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 400
    .line 401
    .line 402
    iget v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_LINE_HEIGHT:I

    .line 403
    .line 404
    sub-int/2addr v6, v4

    .line 405
    add-int/lit8 v3, v3, -0x1

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_e
    int-to-float v1, v5

    .line 409
    iget v3, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT:I

    .line 410
    .line 411
    sub-int v3, v6, v3

    .line 412
    .line 413
    int-to-float v3, v3

    .line 414
    iget-object v4, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mTitlePaint:Landroid/graphics/Paint;

    .line 415
    .line 416
    invoke-virtual {v7, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 417
    .line 418
    .line 419
    int-to-float v5, v6

    .line 420
    iget-object v6, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    .line 421
    .line 422
    move-object/from16 v1, p1

    .line 423
    .line 424
    move v2, v12

    .line 425
    move v3, v5

    .line 426
    move v4, v13

    .line 427
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 428
    .line 429
    .line 430
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 431
    .line 432
    invoke-virtual {v8, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v8, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 436
    .line 437
    .line 438
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 439
    .line 440
    iget-object v2, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedScreenCoords:Landroid/graphics/Point;

    .line 441
    .line 442
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 443
    .line 444
    neg-int v3, v3

    .line 445
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 446
    .line 447
    neg-int v2, v2

    .line 448
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 449
    .line 450
    .line 451
    iget-object v1, v0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mRect:Landroid/graphics/Rect;

    .line 452
    .line 453
    invoke-virtual {v8, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {p2 .. p2}, Lorg/osmdroid/views/Projection;->getOrientation()F

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    cmpl-float v1, v1, v11

    .line 461
    .line 462
    if-eqz v1, :cond_f

    .line 463
    .line 464
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 465
    .line 466
    .line 467
    :cond_f
    return-void
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

.method public getFocusedItem()Lorg/osmdroid/views/overlay/OverlayItem;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TItem;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedItemIndex:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v1, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mItemList:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/osmdroid/views/overlay/OverlayItem;

    .line 16
    .line 17
    return-object v0
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->onDetach(Lorg/osmdroid/views/MapView;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    return-void
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

.method protected onSingleTapUpHelper(ILorg/osmdroid/views/overlay/OverlayItem;Lorg/osmdroid/views/MapView;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITItem;",
            "Lorg/osmdroid/views/MapView;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusItemsOnTap:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedItemIndex:I

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/view/View;->postInvalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p3, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mOnItemGestureListener:Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;

    .line 11
    .line 12
    invoke-interface {p3, p1, p2}, Lorg/osmdroid/views/overlay/ItemizedIconOverlay$OnItemGestureListener;->onItemSingleTapUp(ILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
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
.end method

.method public setDescriptionBoxCornerWidth(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_CORNERWIDTH:I

    return-void
.end method

.method public setDescriptionBoxPadding(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_BOX_PADDING:I

    return-void
.end method

.method public setDescriptionLineHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_LINE_HEIGHT:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->calculateDrawSettings()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public setDescriptionMaxWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_MAXWIDTH:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->calculateDrawSettings()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public setDescriptionTitleExtraLineHeight(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT:I

    return-void
.end method

.method public setFocusItemsOnTap(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusItemsOnTap:Z

    return-void
.end method

.method public setFocusedItem(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedItemIndex:I

    return-void
.end method

.method public setFocusedItem(Lorg/osmdroid/views/overlay/OverlayItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TItem;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedIconOverlay;->mItemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->setFocusedItem(I)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public setFontSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->FONT_SIZE_DP:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->calculateDrawSettings()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public setMarkerBackgroundColor(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mMarkerFocusedBackgroundColor:I

    return-void
.end method

.method public setMarkerDescriptionForegroundColor(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mDescriptionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setMarkerTitleForegroundColor(I)V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mTitlePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public unSetFocusedItem()V
    .locals 1

    const/high16 v0, -0x80000000

    iput v0, p0, Lorg/osmdroid/views/overlay/ItemizedOverlayWithFocus;->mFocusedItemIndex:I

    return-void
.end method
