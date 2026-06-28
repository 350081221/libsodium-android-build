.class final Lcom/google/android/material/progressindicator/LinearDrawingDelegate;
.super Lcom/google/android/material/progressindicator/DrawingDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/progressindicator/DrawingDelegate<",
        "Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;",
        ">;"
    }
.end annotation


# instance fields
.field private displayedCornerRadius:F

.field private displayedTrackThickness:F

.field private totalTrackLengthFraction:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private trackLength:F

.field private useStrokeCap:Z


# direct methods
.method constructor <init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 0
    .param p1    # Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/DrawingDelegate;-><init>(Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, 0x43960000    # 300.0f

    .line 5
    .line 6
    iput p1, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

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
.end method

.method private drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V
    .locals 14
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p6    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p7    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param

    .line 1
    move-object v7, p0

    .line 2
    move-object/from16 v6, p2

    .line 3
    .line 4
    const/4 v8, 0x0

    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    move/from16 v1, p3

    .line 8
    .line 9
    invoke-static {v1, v8, v0}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move/from16 v2, p4

    .line 14
    .line 15
    invoke-static {v2, v8, v0}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->totalTrackLengthFraction:F

    .line 20
    .line 21
    sub-float v3, v0, v3

    .line 22
    .line 23
    invoke-static {v3, v0, v1}, Lcom/google/android/material/math/MathUtils;->lerp(FFF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget v3, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->totalTrackLengthFraction:F

    .line 28
    .line 29
    sub-float v3, v0, v3

    .line 30
    .line 31
    invoke-static {v3, v0, v2}, Lcom/google/android/material/math/MathUtils;->lerp(FFF)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    move/from16 v3, p6

    .line 36
    .line 37
    int-to-float v3, v3

    .line 38
    const v4, 0x3c23d70a    # 0.01f

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v8, v4}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    mul-float/2addr v3, v5

    .line 46
    div-float/2addr v3, v4

    .line 47
    float-to-int v3, v3

    .line 48
    move/from16 v5, p7

    .line 49
    .line 50
    int-to-float v5, v5

    .line 51
    const v9, 0x3f7d70a4    # 0.99f

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v9, v0}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    sub-float/2addr v0, v9

    .line 59
    mul-float/2addr v5, v0

    .line 60
    div-float/2addr v5, v4

    .line 61
    float-to-int v0, v5

    .line 62
    iget v4, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

    .line 63
    .line 64
    mul-float/2addr v1, v4

    .line 65
    int-to-float v3, v3

    .line 66
    add-float/2addr v1, v3

    .line 67
    float-to-int v1, v1

    .line 68
    mul-float/2addr v2, v4

    .line 69
    int-to-float v0, v0

    .line 70
    sub-float/2addr v2, v0

    .line 71
    float-to-int v0, v2

    .line 72
    neg-float v2, v4

    .line 73
    const/high16 v3, 0x40000000    # 2.0f

    .line 74
    .line 75
    div-float/2addr v2, v3

    .line 76
    if-gt v1, v0, :cond_3

    .line 77
    .line 78
    int-to-float v1, v1

    .line 79
    iget v4, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedCornerRadius:F

    .line 80
    .line 81
    add-float v9, v1, v4

    .line 82
    .line 83
    int-to-float v0, v0

    .line 84
    sub-float v10, v0, v4

    .line 85
    .line 86
    mul-float v11, v4, v3

    .line 87
    .line 88
    move/from16 v0, p5

    .line 89
    .line 90
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 95
    .line 96
    .line 97
    iget v0, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 98
    .line 99
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 100
    .line 101
    .line 102
    cmpl-float v0, v9, v10

    .line 103
    .line 104
    if-ltz v0, :cond_0

    .line 105
    .line 106
    new-instance v3, Landroid/graphics/PointF;

    .line 107
    .line 108
    add-float/2addr v9, v2

    .line 109
    invoke-direct {v3, v9, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 110
    .line 111
    .line 112
    new-instance v4, Landroid/graphics/PointF;

    .line 113
    .line 114
    add-float/2addr v10, v2

    .line 115
    invoke-direct {v4, v10, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 116
    .line 117
    .line 118
    iget v8, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 119
    .line 120
    move-object v0, p0

    .line 121
    move-object v1, p1

    .line 122
    move-object/from16 v2, p2

    .line 123
    .line 124
    move v5, v11

    .line 125
    move v6, v8

    .line 126
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;Landroid/graphics/PointF;FF)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_0
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 131
    .line 132
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 133
    .line 134
    .line 135
    iget-boolean v0, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->useStrokeCap:Z

    .line 136
    .line 137
    if-eqz v0, :cond_1

    .line 138
    .line 139
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_1
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 143
    .line 144
    :goto_0
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 145
    .line 146
    .line 147
    add-float v12, v9, v2

    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    add-float v13, v10, v2

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    move-object v0, p1

    .line 154
    move v1, v12

    .line 155
    move v2, v3

    .line 156
    move v3, v13

    .line 157
    move-object/from16 v5, p2

    .line 158
    .line 159
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v0, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->useStrokeCap:Z

    .line 163
    .line 164
    if-nez v0, :cond_3

    .line 165
    .line 166
    iget v0, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedCornerRadius:F

    .line 167
    .line 168
    cmpl-float v0, v0, v8

    .line 169
    .line 170
    if-lez v0, :cond_3

    .line 171
    .line 172
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 173
    .line 174
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 175
    .line 176
    .line 177
    cmpl-float v0, v9, v8

    .line 178
    .line 179
    if-lez v0, :cond_2

    .line 180
    .line 181
    new-instance v3, Landroid/graphics/PointF;

    .line 182
    .line 183
    invoke-direct {v3, v12, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 184
    .line 185
    .line 186
    iget v5, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 187
    .line 188
    move-object v0, p0

    .line 189
    move-object v1, p1

    .line 190
    move-object/from16 v2, p2

    .line 191
    .line 192
    move v4, v11

    .line 193
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;FF)V

    .line 194
    .line 195
    .line 196
    :cond_2
    iget v0, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

    .line 197
    .line 198
    cmpg-float v0, v10, v0

    .line 199
    .line 200
    if-gez v0, :cond_3

    .line 201
    .line 202
    new-instance v3, Landroid/graphics/PointF;

    .line 203
    .line 204
    invoke-direct {v3, v13, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 205
    .line 206
    .line 207
    iget v5, v7, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 208
    .line 209
    move-object v0, p0

    .line 210
    move-object v1, p1

    .line 211
    move-object/from16 v2, p2

    .line 212
    .line 213
    move v4, v11

    .line 214
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;FF)V

    .line 215
    .line 216
    .line 217
    :cond_3
    :goto_1
    return-void
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
.end method

.method private drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;FF)V
    .locals 7
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/PointF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move v6, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;Landroid/graphics/PointF;FF)V

    return-void
.end method

.method private drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;Landroid/graphics/PointF;FF)V
    .locals 5
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/PointF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/PointF;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    invoke-static {p6, v0}, Ljava/lang/Math;->min(FF)F

    move-result p6

    .line 3
    iget v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedCornerRadius:F

    mul-float/2addr v0, p6

    iget v1, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, p5, v1

    .line 4
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 5
    new-instance v3, Landroid/graphics/RectF;

    neg-float p5, p5

    div-float/2addr p5, v1

    neg-float v4, p6

    div-float/2addr v4, v1

    div-float/2addr p6, v1

    invoke-direct {v3, p5, v4, v2, p6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 6
    sget-object p5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    if-eqz p4, :cond_0

    .line 8
    iget p5, p4, Landroid/graphics/PointF;->x:F

    iget p6, p4, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, p5, p6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 9
    new-instance p5, Landroid/graphics/Path;

    invoke-direct {p5}, Landroid/graphics/Path;-><init>()V

    .line 10
    sget-object p6, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {p5, v3, v0, v0, p6}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 11
    invoke-virtual {p1, p5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 12
    iget p5, p4, Landroid/graphics/PointF;->x:F

    neg-float p5, p5

    iget p4, p4, Landroid/graphics/PointF;->y:F

    neg-float p4, p4

    invoke-virtual {p1, p5, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 13
    :cond_0
    iget p4, p3, Landroid/graphics/PointF;->x:F

    iget p3, p3, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, p4, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 14
    invoke-virtual {p1, v3, v0, v0, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method


# virtual methods
.method adjustCanvas(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iput v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 11
    .line 12
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    iget v1, p2, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-float v2, v2

    .line 23
    const/high16 v3, 0x40000000    # 2.0f

    .line 24
    .line 25
    div-float/2addr v2, v3

    .line 26
    add-float/2addr v1, v2

    .line 27
    iget v2, p2, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    int-to-float v2, v2

    .line 30
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    int-to-float v4, v4

    .line 35
    div-float/2addr v4, v3

    .line 36
    add-float/2addr v2, v4

    .line 37
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    int-to-float p2, p2

    .line 42
    sub-float/2addr p2, v0

    .line 43
    div-float/2addr p2, v3

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static {v4, p2}, Ljava/lang/Math;->max(FF)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    add-float/2addr v2, p2

    .line 50
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 54
    .line 55
    check-cast p2, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 56
    .line 57
    iget-boolean p2, p2, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;->drawHorizontallyInverse:Z

    .line 58
    .line 59
    const/high16 v1, -0x40800000    # -1.0f

    .line 60
    .line 61
    const/high16 v2, 0x3f800000    # 1.0f

    .line 62
    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget p2, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

    .line 69
    .line 70
    div-float/2addr p2, v3

    .line 71
    div-float/2addr v0, v3

    .line 72
    neg-float v5, p2

    .line 73
    neg-float v6, v0

    .line 74
    invoke-virtual {p1, v5, v6, p2, v0}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 78
    .line 79
    move-object v0, p2

    .line 80
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 81
    .line 82
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    .line 83
    .line 84
    const/4 v5, 0x2

    .line 85
    div-int/2addr v0, v5

    .line 86
    move-object v6, p2

    .line 87
    check-cast v6, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 88
    .line 89
    iget v6, v6, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackCornerRadius:I

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    if-ne v0, v6, :cond_1

    .line 93
    .line 94
    move v0, v7

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const/4 v0, 0x0

    .line 97
    :goto_0
    iput-boolean v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->useStrokeCap:Z

    .line 98
    .line 99
    move-object v0, p2

    .line 100
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 101
    .line 102
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    .line 103
    .line 104
    int-to-float v0, v0

    .line 105
    mul-float/2addr v0, p3

    .line 106
    iput v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 107
    .line 108
    move-object v0, p2

    .line 109
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 110
    .line 111
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    .line 112
    .line 113
    div-int/2addr v0, v5

    .line 114
    check-cast p2, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 115
    .line 116
    iget p2, p2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackCornerRadius:I

    .line 117
    .line 118
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    int-to-float p2, p2

    .line 123
    mul-float/2addr p2, p3

    .line 124
    iput p2, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedCornerRadius:F

    .line 125
    .line 126
    const/4 p2, 0x3

    .line 127
    if-nez p4, :cond_2

    .line 128
    .line 129
    if-eqz p5, :cond_7

    .line 130
    .line 131
    :cond_2
    if-eqz p4, :cond_3

    .line 132
    .line 133
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 134
    .line 135
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 136
    .line 137
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->showAnimationBehavior:I

    .line 138
    .line 139
    if-eq v0, v5, :cond_4

    .line 140
    .line 141
    :cond_3
    if-eqz p5, :cond_5

    .line 142
    .line 143
    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 144
    .line 145
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 146
    .line 147
    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->hideAnimationBehavior:I

    .line 148
    .line 149
    if-ne v0, v7, :cond_5

    .line 150
    .line 151
    :cond_4
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 152
    .line 153
    .line 154
    :cond_5
    if-nez p4, :cond_6

    .line 155
    .line 156
    if-eqz p5, :cond_7

    .line 157
    .line 158
    iget-object p4, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 159
    .line 160
    check-cast p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 161
    .line 162
    iget p4, p4, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->hideAnimationBehavior:I

    .line 163
    .line 164
    if-eq p4, p2, :cond_7

    .line 165
    .line 166
    :cond_6
    iget-object p4, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 167
    .line 168
    check-cast p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 169
    .line 170
    iget p4, p4, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    .line 171
    .line 172
    int-to-float p4, p4

    .line 173
    sub-float v0, v2, p3

    .line 174
    .line 175
    mul-float/2addr p4, v0

    .line 176
    div-float/2addr p4, v3

    .line 177
    invoke-virtual {p1, v4, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 178
    .line 179
    .line 180
    :cond_7
    if-eqz p5, :cond_8

    .line 181
    .line 182
    iget-object p1, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 183
    .line 184
    check-cast p1, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 185
    .line 186
    iget p1, p1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->hideAnimationBehavior:I

    .line 187
    .line 188
    if-ne p1, p2, :cond_8

    .line 189
    .line 190
    iput p3, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->totalTrackLengthFraction:F

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_8
    iput v2, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->totalTrackLengthFraction:F

    .line 194
    .line 195
    :goto_1
    return-void
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
.end method

.method drawStopIndicator(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0xffL
        .end annotation
    .end param

    .line 1
    invoke-static {p3, p4}, Lcom/google/android/material/color/MaterialColors;->compositeARGBWithAlpha(II)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    iget-object p4, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 6
    .line 7
    check-cast p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 8
    .line 9
    iget p4, p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;->trackStopIndicatorSize:I

    .line 10
    .line 11
    if-lez p4, :cond_0

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    sget-object p4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Landroid/graphics/PointF;

    .line 24
    .line 25
    iget p3, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->trackLength:F

    .line 26
    .line 27
    const/high16 p4, 0x40000000    # 2.0f

    .line 28
    .line 29
    div-float/2addr p3, p4

    .line 30
    iget v0, p0, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->displayedTrackThickness:F

    .line 31
    .line 32
    div-float/2addr v0, p4

    .line 33
    sub-float/2addr p3, v0

    .line 34
    const/4 p4, 0x0

    .line 35
    invoke-direct {v3, p3, p4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    iget-object p3, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 39
    .line 40
    move-object p4, p3

    .line 41
    check-cast p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 42
    .line 43
    iget p4, p4, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;->trackStopIndicatorSize:I

    .line 44
    .line 45
    int-to-float v4, p4

    .line 46
    check-cast p3, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    .line 47
    .line 48
    iget p3, p3, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;->trackStopIndicatorSize:I

    .line 49
    .line 50
    int-to-float v5, p3

    .line 51
    move-object v0, p0

    .line 52
    move-object v1, p1

    .line 53
    move-object v2, p2

    .line 54
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawRoundedBlock(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;FF)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
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
.end method

.method fillIndicator(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;I)V
    .locals 9
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p3, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 2
    .line 3
    invoke-static {v0, p4}, Lcom/google/android/material/color/MaterialColors;->compositeARGBWithAlpha(II)I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    iget v4, p3, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    .line 8
    .line 9
    iget v5, p3, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 10
    .line 11
    iget v8, p3, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->gapSize:I

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move v7, v8

    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 18
    .line 19
    .line 20
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
.end method

.method fillTrack(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param

    .line 1
    invoke-static {p5, p6}, Lcom/google/android/material/color/MaterialColors;->compositeARGBWithAlpha(II)I

    .line 2
    .line 3
    .line 4
    move-result v5

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-object v2, p2

    .line 8
    move v3, p3

    .line 9
    move v4, p4

    .line 10
    move v6, p7

    .line 11
    move v7, p7

    .line 12
    invoke-direct/range {v0 .. v7}, Lcom/google/android/material/progressindicator/LinearDrawingDelegate;->drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 13
    .line 14
    .line 15
    return-void
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
.end method

.method getPreferredHeight()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/progressindicator/DrawingDelegate;->spec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;

    iget v0, v0, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->trackThickness:I

    return v0
.end method

.method getPreferredWidth()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
