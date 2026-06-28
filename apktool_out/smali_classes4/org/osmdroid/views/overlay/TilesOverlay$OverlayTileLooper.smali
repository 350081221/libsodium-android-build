.class public Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;
.super Lorg/osmdroid/util/TileLooper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/osmdroid/views/overlay/TilesOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "OverlayTileLooper"
.end annotation


# instance fields
.field private mCanvas:Landroid/graphics/Canvas;

.field final synthetic this$0:Lorg/osmdroid/views/overlay/TilesOverlay;


# direct methods
.method public constructor <init>(Lorg/osmdroid/views/overlay/TilesOverlay;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/util/TileLooper;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/osmdroid/views/overlay/TilesOverlay;ZZ)V
    .locals 0

    .line 3
    iput-object p1, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 4
    invoke-direct {p0, p2, p3}, Lorg/osmdroid/util/TileLooper;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public finaliseLoop()V
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$000(Lorg/osmdroid/views/overlay/TilesOverlay;)Lorg/osmdroid/tileprovider/TileStates;

    move-result-object v0

    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->finaliseLoop()V

    return-void
.end method

.method public handleTile(JII)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 8
    .line 9
    iget-object v3, v3, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 10
    .line 11
    move-wide/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v3, v4, v5}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->getMapTile(J)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v6, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 18
    .line 19
    invoke-static {v6}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$000(Lorg/osmdroid/views/overlay/TilesOverlay;)Lorg/osmdroid/tileprovider/TileStates;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {v6, v3}, Lorg/osmdroid/tileprovider/TileStates;->handleTile(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    iget-object v6, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    instance-of v6, v3, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    move-object v7, v3

    .line 36
    check-cast v7, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v7, 0x0

    .line 40
    :goto_0
    if-nez v3, :cond_2

    .line 41
    .line 42
    iget-object v3, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 43
    .line 44
    invoke-static {v3}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$100(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_2
    if-eqz v3, :cond_6

    .line 49
    .line 50
    iget-object v8, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 51
    .line 52
    iget-object v9, v8, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    .line 53
    .line 54
    invoke-static {v8}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {v9, v0, v2, v8}, Lorg/osmdroid/views/Projection;->getPixelFromTile(IILandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    if-eqz v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v7}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->beginUsingDrawable()V

    .line 64
    .line 65
    .line 66
    :cond_3
    if-eqz v6, :cond_4

    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v7}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->isBitmapValid()Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-nez v8, :cond_4

    .line 73
    .line 74
    iget-object v3, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 75
    .line 76
    invoke-static {v3}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$100(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const/4 v6, 0x0

    .line 81
    :cond_4
    iget-object v8, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 82
    .line 83
    iget-object v9, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 84
    .line 85
    invoke-static {v8}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v8, v9, v3, v10}, Lorg/osmdroid/views/overlay/TilesOverlay;->onTileReadyToDraw(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    if-eqz v6, :cond_6

    .line 93
    .line 94
    invoke-virtual {v7}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->finishUsingDrawable()V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    if-eqz v6, :cond_5

    .line 100
    .line 101
    invoke-virtual {v7}, Lorg/osmdroid/tileprovider/ReusableBitmapDrawable;->finishUsingDrawable()V

    .line 102
    .line 103
    .line 104
    :cond_5
    throw v0

    .line 105
    :cond_6
    :goto_1
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v3}, Lorg/osmdroid/config/c;->k()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    iget-object v3, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 116
    .line 117
    iget-object v6, v3, Lorg/osmdroid/views/overlay/TilesOverlay;->mProjection:Lorg/osmdroid/views/Projection;

    .line 118
    .line 119
    invoke-static {v3}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v6, v0, v2, v3}, Lorg/osmdroid/views/Projection;->getPixelFromTile(IILandroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 124
    .line 125
    .line 126
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 127
    .line 128
    invoke-static/range {p1 .. p2}, Lorg/osmdroid/util/MapTileIndex;->toString(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v3, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 133
    .line 134
    invoke-static {v3}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 139
    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    int-to-float v3, v3

    .line 143
    iget-object v4, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 144
    .line 145
    invoke-static {v4}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 150
    .line 151
    int-to-float v4, v4

    .line 152
    iget-object v5, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 153
    .line 154
    iget-object v5, v5, Lorg/osmdroid/views/overlay/TilesOverlay;->mDebugPaint:Landroid/graphics/Paint;

    .line 155
    .line 156
    invoke-virtual {v5}, Landroid/graphics/Paint;->getTextSize()F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    add-float/2addr v4, v5

    .line 161
    iget-object v5, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 162
    .line 163
    iget-object v5, v5, Lorg/osmdroid/views/overlay/TilesOverlay;->mDebugPaint:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    iget-object v6, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 169
    .line 170
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 171
    .line 172
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 177
    .line 178
    int-to-float v7, v0

    .line 179
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 180
    .line 181
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 186
    .line 187
    int-to-float v8, v0

    .line 188
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 189
    .line 190
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 195
    .line 196
    int-to-float v9, v0

    .line 197
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 198
    .line 199
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 204
    .line 205
    int-to-float v10, v0

    .line 206
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 207
    .line 208
    iget-object v11, v0, Lorg/osmdroid/views/overlay/TilesOverlay;->mDebugPaint:Landroid/graphics/Paint;

    .line 209
    .line 210
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 211
    .line 212
    .line 213
    iget-object v12, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 214
    .line 215
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 216
    .line 217
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 222
    .line 223
    int-to-float v13, v0

    .line 224
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 225
    .line 226
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 231
    .line 232
    int-to-float v14, v0

    .line 233
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 234
    .line 235
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 240
    .line 241
    int-to-float v15, v0

    .line 242
    iget-object v0, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 243
    .line 244
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$200(Lorg/osmdroid/views/overlay/TilesOverlay;)Landroid/graphics/Rect;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 249
    .line 250
    int-to-float v0, v0

    .line 251
    iget-object v2, v1, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 252
    .line 253
    iget-object v2, v2, Lorg/osmdroid/views/overlay/TilesOverlay;->mDebugPaint:Landroid/graphics/Paint;

    .line 254
    .line 255
    move/from16 v16, v0

    .line 256
    .line 257
    move-object/from16 v17, v2

    .line 258
    .line 259
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 260
    .line 261
    .line 262
    :cond_7
    return-void
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

.method public initialiseLoop()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/osmdroid/util/TileLooper;->mTiles:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 4
    .line 5
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 6
    .line 7
    sub-int/2addr v1, v2

    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 11
    .line 12
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    sub-int/2addr v2, v0

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 19
    .line 20
    iget-object v0, v0, Lorg/osmdroid/views/overlay/TilesOverlay;->mTileProvider:Lorg/osmdroid/tileprovider/MapTileProviderBase;

    .line 21
    .line 22
    invoke-static {}, Lorg/osmdroid/config/a;->a()Lorg/osmdroid/config/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Lorg/osmdroid/config/c;->W()S

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v2, v1

    .line 31
    invoke-virtual {v0, v2}, Lorg/osmdroid/tileprovider/MapTileProviderBase;->ensureCapacity(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->this$0:Lorg/osmdroid/views/overlay/TilesOverlay;

    .line 35
    .line 36
    invoke-static {v0}, Lorg/osmdroid/views/overlay/TilesOverlay;->access$000(Lorg/osmdroid/views/overlay/TilesOverlay;)Lorg/osmdroid/tileprovider/TileStates;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lorg/osmdroid/tileprovider/TileStates;->initialiseLoop()V

    .line 41
    .line 42
    .line 43
    invoke-super {p0}, Lorg/osmdroid/util/TileLooper;->initialiseLoop()V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public loop(DLorg/osmdroid/util/RectL;Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lorg/osmdroid/views/overlay/TilesOverlay$OverlayTileLooper;->mCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lorg/osmdroid/util/TileLooper;->loop(DLorg/osmdroid/util/RectL;)V

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
