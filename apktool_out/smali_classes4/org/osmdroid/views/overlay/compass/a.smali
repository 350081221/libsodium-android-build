.class public Lorg/osmdroid/views/overlay/compass/a;
.super Lorg/osmdroid/views/overlay/Overlay;
.source "SourceFile"

# interfaces
.implements Lorg/osmdroid/views/overlay/IOverlayMenuProvider;
.implements Lorg/osmdroid/views/overlay/compass/b;


# static fields
.field public static final z:I


# instance fields
.field private a:Landroid/graphics/Paint;

.field protected b:Lorg/osmdroid/views/MapView;

.field private final c:Landroid/view/Display;

.field public d:Lorg/osmdroid/views/overlay/compass/c;

.field protected e:Landroid/graphics/Bitmap;

.field protected f:Landroid/graphics/Bitmap;

.field private final g:Landroid/graphics/Matrix;

.field private h:Z

.field private i:Z

.field private j:I

.field private k:F

.field private l:F

.field private m:Z

.field private n:F

.field private o:F

.field private final p:F

.field protected final q:F

.field protected final r:F

.field protected final s:F

.field protected final t:F

.field protected u:J

.field private v:Z

.field protected final w:F

.field private x:I

.field private y:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lorg/osmdroid/views/overlay/Overlay;->getSafeMenuId()I

    move-result v0

    sput v0, Lorg/osmdroid/views/overlay/compass/a;->z:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/views/MapView;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/osmdroid/views/overlay/compass/d;

    invoke-direct {v0, p1}, Lorg/osmdroid/views/overlay/compass/d;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, p2}, Lorg/osmdroid/views/overlay/compass/a;-><init>(Landroid/content/Context;Lorg/osmdroid/views/overlay/compass/c;Lorg/osmdroid/views/MapView;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/osmdroid/views/overlay/compass/c;Lorg/osmdroid/views/MapView;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/Overlay;-><init>()V

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->a:Landroid/graphics/Paint;

    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->i:Z

    const/4 v1, 0x1

    .line 6
    iput v1, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 7
    iput v2, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    const/4 v2, 0x0

    .line 8
    iput v2, p0, Lorg/osmdroid/views/overlay/compass/a;->l:F

    .line 9
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->m:Z

    const/high16 v0, 0x420c0000    # 35.0f

    .line 10
    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->n:F

    .line 11
    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->o:F

    const/high16 v0, 0x41a00000    # 20.0f

    .line 12
    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->p:F

    const-wide/16 v3, 0x0

    .line 13
    iput-wide v3, p0, Lorg/osmdroid/views/overlay/compass/a;->u:J

    .line 14
    iput-boolean v1, p0, Lorg/osmdroid/views/overlay/compass/a;->v:Z

    const/16 v0, 0x1f4

    .line 15
    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->x:I

    .line 16
    iput v2, p0, Lorg/osmdroid/views/overlay/compass/a;->y:F

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 18
    iput-object p3, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    const-string p3, "window"

    .line 19
    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 20
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iput-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->c:Landroid/view/Display;

    .line 21
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->d()V

    .line 22
    iget p1, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    if-lez p1, :cond_0

    .line 23
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->e()V

    goto :goto_0

    .line 24
    :cond_0
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->f()V

    .line 25
    :goto_0
    iget-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p1, p3

    const/high16 v0, 0x3f000000    # 0.5f

    sub-float/2addr p1, v0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 26
    iget-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, p3

    sub-float/2addr p1, v0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 27
    iget-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, p3

    sub-float/2addr p1, v0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->s:F

    .line 28
    iget-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, p3

    sub-float/2addr p1, v0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->t:F

    .line 29
    invoke-virtual {p0, p2}, Lorg/osmdroid/views/overlay/compass/a;->y(Lorg/osmdroid/views/overlay/compass/c;)V

    return-void
.end method

.method private c(FFFF)Landroid/graphics/Point;
    .locals 4

    .line 1
    neg-float p4, p4

    .line 2
    const/high16 v0, 0x42b40000    # 90.0f

    .line 3
    .line 4
    add-float/2addr p4, v0

    .line 5
    float-to-double v0, p4

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    float-to-double p3, p3

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    mul-double/2addr v2, p3

    .line 16
    double-to-int v2, v2

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    mul-double/2addr p3, v0

    .line 22
    double-to-int p3, p3

    .line 23
    new-instance p4, Landroid/graphics/Point;

    .line 24
    .line 25
    float-to-int p1, p1

    .line 26
    add-int/2addr p1, v2

    .line 27
    float-to-int p2, p2

    .line 28
    sub-int/2addr p2, p3

    .line 29
    invoke-direct {p4, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 30
    .line 31
    .line 32
    return-object p4
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

.method private d()V
    .locals 12

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xc8

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 22
    .line 23
    .line 24
    new-instance v10, Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    .line 27
    .line 28
    .line 29
    const v3, -0x777778

    .line 30
    .line 31
    .line 32
    invoke-virtual {v10, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    .line 42
    .line 43
    const/high16 v1, 0x40000000    # 2.0f

    .line 44
    .line 45
    invoke-virtual {v10, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 49
    .line 50
    .line 51
    const/high16 v1, 0x42480000    # 50.0f

    .line 52
    .line 53
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 54
    .line 55
    mul-float/2addr v2, v1

    .line 56
    float-to-int v1, v2

    .line 57
    div-int/lit8 v2, v1, 0x2

    .line 58
    .line 59
    iget-object v3, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    .line 60
    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 64
    .line 65
    .line 66
    :cond_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    invoke-static {v1, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iput-object v1, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    new-instance v1, Landroid/graphics/Canvas;

    .line 75
    .line 76
    iget-object v3, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    .line 77
    .line 78
    invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 79
    .line 80
    .line 81
    int-to-float v2, v2

    .line 82
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 83
    .line 84
    const/high16 v11, 0x41a00000    # 20.0f

    .line 85
    .line 86
    mul-float/2addr v3, v11

    .line 87
    invoke-virtual {v1, v2, v2, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 91
    .line 92
    mul-float/2addr v0, v11

    .line 93
    invoke-virtual {v1, v2, v2, v0, v10}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 94
    .line 95
    .line 96
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 97
    .line 98
    mul-float v7, v0, v11

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    move-object v3, p0

    .line 102
    move-object v4, v1

    .line 103
    move v5, v2

    .line 104
    move v6, v2

    .line 105
    move-object v9, v10

    .line 106
    invoke-direct/range {v3 .. v9}, Lorg/osmdroid/views/overlay/compass/a;->i(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;)V

    .line 107
    .line 108
    .line 109
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 110
    .line 111
    mul-float v7, v0, v11

    .line 112
    .line 113
    const/high16 v8, 0x42b40000    # 90.0f

    .line 114
    .line 115
    invoke-direct/range {v3 .. v9}, Lorg/osmdroid/views/overlay/compass/a;->i(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;)V

    .line 116
    .line 117
    .line 118
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 119
    .line 120
    mul-float v7, v0, v11

    .line 121
    .line 122
    const/high16 v8, 0x43340000    # 180.0f

    .line 123
    .line 124
    invoke-direct/range {v3 .. v9}, Lorg/osmdroid/views/overlay/compass/a;->i(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;)V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 128
    .line 129
    mul-float v7, v0, v11

    .line 130
    .line 131
    const/high16 v8, 0x43870000    # 270.0f

    .line 132
    .line 133
    invoke-direct/range {v3 .. v9}, Lorg/osmdroid/views/overlay/compass/a;->i(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    return-void
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

.method private e()V
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, -0x600000

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    const/16 v2, 0xdc

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 28
    .line 29
    .line 30
    const/high16 v4, -0x1000000

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    .line 37
    .line 38
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 44
    .line 45
    .line 46
    new-instance v4, Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v5, -0x1

    .line 52
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 59
    .line 60
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 64
    .line 65
    .line 66
    const/high16 v1, 0x42480000    # 50.0f

    .line 67
    .line 68
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 69
    .line 70
    mul-float/2addr v2, v1

    .line 71
    float-to-int v1, v2

    .line 72
    div-int/lit8 v2, v1, 0x2

    .line 73
    .line 74
    iget-object v5, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 79
    .line 80
    .line 81
    :cond_0
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 82
    .line 83
    invoke-static {v1, v1, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 88
    .line 89
    new-instance v1, Landroid/graphics/Canvas;

    .line 90
    .line 91
    iget-object v5, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    invoke-direct {v1, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 94
    .line 95
    .line 96
    new-instance v5, Landroid/graphics/Path;

    .line 97
    .line 98
    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 99
    .line 100
    .line 101
    int-to-float v2, v2

    .line 102
    iget v6, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 103
    .line 104
    const/high16 v7, 0x41880000    # 17.0f

    .line 105
    .line 106
    mul-float/2addr v6, v7

    .line 107
    sub-float v6, v2, v6

    .line 108
    .line 109
    invoke-virtual {v5, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 110
    .line 111
    .line 112
    iget v6, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 113
    .line 114
    const/high16 v8, 0x40800000    # 4.0f

    .line 115
    .line 116
    mul-float/2addr v6, v8

    .line 117
    add-float/2addr v6, v2

    .line 118
    invoke-virtual {v5, v6, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 119
    .line 120
    .line 121
    iget v6, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 122
    .line 123
    mul-float/2addr v6, v8

    .line 124
    sub-float v6, v2, v6

    .line 125
    .line 126
    invoke-virtual {v5, v6, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 127
    .line 128
    .line 129
    iget v6, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 130
    .line 131
    mul-float/2addr v6, v7

    .line 132
    sub-float v6, v2, v6

    .line 133
    .line 134
    invoke-virtual {v5, v2, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v5, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Landroid/graphics/Path;

    .line 144
    .line 145
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 146
    .line 147
    .line 148
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 149
    .line 150
    mul-float/2addr v5, v7

    .line 151
    add-float/2addr v5, v2

    .line 152
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 153
    .line 154
    .line 155
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 156
    .line 157
    mul-float/2addr v5, v8

    .line 158
    add-float/2addr v5, v2

    .line 159
    invoke-virtual {v0, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 160
    .line 161
    .line 162
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 163
    .line 164
    mul-float/2addr v5, v8

    .line 165
    sub-float v5, v2, v5

    .line 166
    .line 167
    invoke-virtual {v0, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 168
    .line 169
    .line 170
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 171
    .line 172
    mul-float/2addr v5, v7

    .line 173
    add-float/2addr v5, v2

    .line 174
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x40000000    # 2.0f

    .line 184
    .line 185
    invoke-virtual {v1, v2, v2, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 186
    .line 187
    .line 188
    return-void
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

.method private f()V
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, -0x1000000

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    const/16 v2, 0xdc

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 28
    .line 29
    .line 30
    const/4 v4, -0x1

    .line 31
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 43
    .line 44
    .line 45
    const/high16 v1, 0x42480000    # 50.0f

    .line 46
    .line 47
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 48
    .line 49
    mul-float/2addr v2, v1

    .line 50
    float-to-int v1, v2

    .line 51
    div-int/lit8 v2, v1, 0x2

    .line 52
    .line 53
    iget-object v4, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 58
    .line 59
    .line 60
    :cond_0
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 61
    .line 62
    invoke-static {v1, v1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    new-instance v1, Landroid/graphics/Canvas;

    .line 69
    .line 70
    iget-object v4, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    invoke-direct {v1, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Landroid/graphics/Path;

    .line 76
    .line 77
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 78
    .line 79
    .line 80
    int-to-float v2, v2

    .line 81
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 82
    .line 83
    const/high16 v6, 0x41880000    # 17.0f

    .line 84
    .line 85
    mul-float/2addr v5, v6

    .line 86
    sub-float v5, v2, v5

    .line 87
    .line 88
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 89
    .line 90
    .line 91
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 92
    .line 93
    const/high16 v7, 0x40800000    # 4.0f

    .line 94
    .line 95
    mul-float v8, v5, v7

    .line 96
    .line 97
    add-float/2addr v8, v2

    .line 98
    mul-float/2addr v5, v6

    .line 99
    add-float/2addr v5, v2

    .line 100
    invoke-virtual {v4, v8, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 101
    .line 102
    .line 103
    const/high16 v5, 0x41080000    # 8.5f

    .line 104
    .line 105
    iget v8, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 106
    .line 107
    mul-float/2addr v8, v5

    .line 108
    add-float/2addr v8, v2

    .line 109
    invoke-virtual {v4, v2, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 110
    .line 111
    .line 112
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 113
    .line 114
    mul-float/2addr v7, v5

    .line 115
    sub-float v7, v2, v7

    .line 116
    .line 117
    mul-float/2addr v5, v6

    .line 118
    add-float/2addr v5, v2

    .line 119
    invoke-virtual {v4, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 120
    .line 121
    .line 122
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 123
    .line 124
    mul-float/2addr v5, v6

    .line 125
    sub-float v5, v2, v5

    .line 126
    .line 127
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v4, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40000000    # 2.0f

    .line 137
    .line 138
    invoke-virtual {v1, v2, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 139
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

.method private i(Landroid/graphics/Canvas;FFFFLandroid/graphics/Paint;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p3, p4, p5}, Lorg/osmdroid/views/overlay/compass/a;->c(FFFF)Landroid/graphics/Point;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, Landroid/graphics/Point;->x:I

    .line 9
    .line 10
    int-to-float p3, p3

    .line 11
    iget p4, p2, Landroid/graphics/Point;->y:I

    .line 12
    .line 13
    int-to-float p4, p4

    .line 14
    invoke-virtual {p1, p5, p3, p4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 15
    .line 16
    .line 17
    new-instance p3, Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    .line 20
    .line 21
    .line 22
    iget p4, p2, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    int-to-float p4, p4

    .line 25
    iget p5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 26
    .line 27
    const/high16 v0, 0x40000000    # 2.0f

    .line 28
    .line 29
    mul-float/2addr p5, v0

    .line 30
    sub-float/2addr p4, p5

    .line 31
    iget p5, p2, Landroid/graphics/Point;->y:I

    .line 32
    .line 33
    int-to-float p5, p5

    .line 34
    invoke-virtual {p3, p4, p5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 35
    .line 36
    .line 37
    iget p4, p2, Landroid/graphics/Point;->x:I

    .line 38
    .line 39
    int-to-float p4, p4

    .line 40
    iget p5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 41
    .line 42
    mul-float/2addr p5, v0

    .line 43
    add-float/2addr p4, p5

    .line 44
    iget p5, p2, Landroid/graphics/Point;->y:I

    .line 45
    .line 46
    int-to-float p5, p5

    .line 47
    invoke-virtual {p3, p4, p5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    iget p4, p2, Landroid/graphics/Point;->x:I

    .line 51
    .line 52
    int-to-float p4, p4

    .line 53
    iget p2, p2, Landroid/graphics/Point;->y:I

    .line 54
    .line 55
    int-to-float p2, p2

    .line 56
    const/high16 p5, 0x40a00000    # 5.0f

    .line 57
    .line 58
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 59
    .line 60
    mul-float/2addr v0, p5

    .line 61
    sub-float/2addr p2, v0

    .line 62
    invoke-virtual {p3, p4, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p3, p6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 72
    .line 73
    .line 74
    return-void
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
.end method

.method private m()I
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->c:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v0, 0x10e

    return v0

    :cond_1
    const/16 v0, 0xb4

    return v0

    :cond_2
    const/16 v0, 0x5a

    return v0
.end method

.method private p()V
    .locals 7

    .line 1
    iget-wide v0, p0, Lorg/osmdroid/views/overlay/compass/a;->u:J

    .line 2
    .line 3
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->x:I

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    add-long/2addr v0, v2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Lorg/osmdroid/views/overlay/compass/a;->u:J

    .line 21
    .line 22
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lorg/osmdroid/views/Projection;->getScreenRect()Landroid/graphics/Rect;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v1, p0, Lorg/osmdroid/views/overlay/compass/a;->m:Z

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 43
    .line 44
    sub-float/2addr v2, v3

    .line 45
    float-to-double v2, v2

    .line 46
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    double-to-int v2, v2

    .line 51
    add-int/2addr v1, v2

    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 59
    .line 60
    sub-float/2addr v3, v4

    .line 61
    float-to-double v3, v3

    .line 62
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    double-to-int v3, v3

    .line 67
    add-int/2addr v2, v3

    .line 68
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 75
    .line 76
    add-float/2addr v4, v5

    .line 77
    float-to-double v4, v4

    .line 78
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    double-to-int v4, v4

    .line 83
    add-int/2addr v3, v4

    .line 84
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 91
    .line 92
    add-float/2addr v0, v5

    .line 93
    float-to-double v5, v0

    .line 94
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    double-to-int v0, v5

    .line 99
    add-int/2addr v4, v0

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 102
    .line 103
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->n:F

    .line 104
    .line 105
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 106
    .line 107
    mul-float/2addr v2, v3

    .line 108
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 109
    .line 110
    sub-float/2addr v2, v3

    .line 111
    float-to-double v2, v2

    .line 112
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    double-to-int v2, v2

    .line 117
    add-int/2addr v1, v2

    .line 118
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 119
    .line 120
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->o:F

    .line 121
    .line 122
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 123
    .line 124
    mul-float/2addr v3, v4

    .line 125
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 126
    .line 127
    sub-float/2addr v3, v4

    .line 128
    float-to-double v3, v3

    .line 129
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v3

    .line 133
    double-to-int v3, v3

    .line 134
    add-int/2addr v2, v3

    .line 135
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->n:F

    .line 138
    .line 139
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 140
    .line 141
    mul-float/2addr v4, v5

    .line 142
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 143
    .line 144
    add-float/2addr v4, v5

    .line 145
    float-to-double v4, v4

    .line 146
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 147
    .line 148
    .line 149
    move-result-wide v4

    .line 150
    double-to-int v4, v4

    .line 151
    add-int/2addr v3, v4

    .line 152
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 153
    .line 154
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->o:F

    .line 155
    .line 156
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 157
    .line 158
    mul-float/2addr v4, v5

    .line 159
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 160
    .line 161
    add-float/2addr v4, v5

    .line 162
    float-to-double v4, v4

    .line 163
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    double-to-int v4, v4

    .line 168
    add-int/2addr v4, v0

    .line 169
    :goto_0
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 170
    .line 171
    add-int/lit8 v1, v1, -0x2

    .line 172
    .line 173
    add-int/lit8 v2, v2, -0x2

    .line 174
    .line 175
    add-int/lit8 v3, v3, 0x2

    .line 176
    .line 177
    add-int/lit8 v4, v4, 0x2

    .line 178
    .line 179
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/osmdroid/views/MapView;->postInvalidateMapCoordinates(IIII)V

    .line 180
    .line 181
    .line 182
    return-void
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
.method public a(FLorg/osmdroid/views/overlay/compass/c;)V
    .locals 1

    .line 1
    iget p2, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    iget p2, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 10
    .line 11
    sub-float/2addr p2, p1

    .line 12
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->y:F

    .line 17
    .line 18
    cmpl-float p2, p2, v0

    .line 19
    .line 20
    if-ltz p2, :cond_1

    .line 21
    .line 22
    :cond_0
    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 23
    .line 24
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->p()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
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

.method public draw(Landroid/graphics/Canvas;Lorg/osmdroid/views/Projection;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    .line 16
    .line 17
    int-to-float v0, v0

    .line 18
    iget v1, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 19
    .line 20
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->l:F

    .line 21
    .line 22
    add-float/2addr v1, v2

    .line 23
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->m()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-float v2, v2

    .line 28
    add-float/2addr v1, v2

    .line 29
    mul-float/2addr v0, v1

    .line 30
    invoke-virtual {p2}, Lorg/osmdroid/views/Projection;->getScreenRect()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p1, v0, p2}, Lorg/osmdroid/views/overlay/compass/a;->h(Landroid/graphics/Canvas;FLandroid/graphics/Rect;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
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

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->h:Z

    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/compass/c;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 12
    .line 13
    iput v0, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    .line 14
    .line 15
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->p()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
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

.method protected h(Landroid/graphics/Canvas;FLandroid/graphics/Rect;)V
    .locals 9

    .line 1
    iget-object p3, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 2
    .line 3
    invoke-virtual {p3}, Lorg/osmdroid/views/MapView;->getProjection()Lorg/osmdroid/views/Projection;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3}, Lorg/osmdroid/views/Projection;->getScreenRect()Landroid/graphics/Rect;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->n:F

    .line 25
    .line 26
    iget v1, p0, Lorg/osmdroid/views/overlay/compass/a;->w:F

    .line 27
    .line 28
    mul-float/2addr v0, v1

    .line 29
    iget v2, p0, Lorg/osmdroid/views/overlay/compass/a;->o:F

    .line 30
    .line 31
    mul-float/2addr v1, v2

    .line 32
    move v8, v1

    .line 33
    move v1, v0

    .line 34
    move v0, v8

    .line 35
    :goto_0
    iget-object v2, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 36
    .line 37
    iget v3, p0, Lorg/osmdroid/views/overlay/compass/a;->q:F

    .line 38
    .line 39
    neg-float v3, v3

    .line 40
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->r:F

    .line 41
    .line 42
    neg-float v4, v4

    .line 43
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-virtual {p3, p1, v2, v3}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 57
    .line 58
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 59
    .line 60
    .line 61
    iget-object v4, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    .line 62
    .line 63
    iget-object v5, p0, Lorg/osmdroid/views/overlay/compass/a;->a:Landroid/graphics/Paint;

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-virtual {p1, v4, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, p1, v3}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v4, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 73
    .line 74
    neg-float p2, p2

    .line 75
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->s:F

    .line 76
    .line 77
    iget v7, p0, Lorg/osmdroid/views/overlay/compass/a;->t:F

    .line 78
    .line 79
    invoke-virtual {v4, p2, v5, v7}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 80
    .line 81
    .line 82
    iget-object p2, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 83
    .line 84
    iget v4, p0, Lorg/osmdroid/views/overlay/compass/a;->s:F

    .line 85
    .line 86
    neg-float v4, v4

    .line 87
    iget v5, p0, Lorg/osmdroid/views/overlay/compass/a;->t:F

    .line 88
    .line 89
    neg-float v5, v5

    .line 90
    invoke-virtual {p2, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 91
    .line 92
    .line 93
    iget-object p2, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 94
    .line 95
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, p1, v2, v3}, Lorg/osmdroid/views/Projection;->save(Landroid/graphics/Canvas;ZZ)V

    .line 99
    .line 100
    .line 101
    iget-object p2, p0, Lorg/osmdroid/views/overlay/compass/a;->g:Landroid/graphics/Matrix;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 107
    .line 108
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->a:Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-virtual {p1, p2, v6, v6, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3, p1, v3}, Lorg/osmdroid/views/Projection;->restore(Landroid/graphics/Canvas;Z)V

    .line 114
    .line 115
    .line 116
    return-void
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

.method public isOptionsMenuEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->v:Z

    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    invoke-virtual {p0, v0}, Lorg/osmdroid/views/overlay/compass/a;->k(Lorg/osmdroid/views/overlay/compass/c;)Z

    move-result v0

    return v0
.end method

.method public k(Lorg/osmdroid/views/overlay/compass/c;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/osmdroid/views/overlay/compass/a;->y(Lorg/osmdroid/views/overlay/compass/c;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Lorg/osmdroid/views/overlay/compass/c;->b(Lorg/osmdroid/views/overlay/compass/b;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/compass/a;->h:Z

    .line 11
    .line 12
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->p()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return p1
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

.method public l()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->l:F

    return v0
.end method

.method public n()F
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->k:F

    return v0
.end method

.method public o()Lorg/osmdroid/views/overlay/compass/c;
    .locals 1

    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    return-object v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 2

    .line 1
    sget v0, Lorg/osmdroid/views/overlay/compass/a;->z:I

    .line 2
    .line 3
    add-int/2addr v0, p2

    .line 4
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget v1, Lorg/osmdroid/library/R$string;->p:I

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-interface {p1, v1, v0, v1, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    sget p3, Lorg/osmdroid/library/R$drawable;->d:I

    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 43
    .line 44
    .line 45
    return p2
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

.method public onDetach(Lorg/osmdroid/views/MapView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->b:Lorg/osmdroid/views/MapView;

    .line 3
    .line 4
    iput-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->a:Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->g()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 10
    .line 11
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->e:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->f:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 19
    .line 20
    .line 21
    invoke-super {p0, p1}, Lorg/osmdroid/views/overlay/Overlay;->onDetach(Lorg/osmdroid/views/MapView;)V

    .line 22
    .line 23
    .line 24
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

.method public onOptionsItemSelected(Landroid/view/MenuItem;ILorg/osmdroid/views/MapView;)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sub-int/2addr p1, p2

    .line 6
    sget p2, Lorg/osmdroid/views/overlay/compass/a;->z:I

    .line 7
    .line 8
    if-ne p1, p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->q()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->g()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->j()Z

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
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

.method public onPause()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->h:Z

    .line 2
    .line 3
    iput-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->i:Z

    .line 4
    .line 5
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/compass/c;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0}, Lorg/osmdroid/views/overlay/Overlay;->onPause()V

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
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;ILorg/osmdroid/views/MapView;)Z
    .locals 0

    sget p3, Lorg/osmdroid/views/overlay/compass/a;->z:I

    add-int/2addr p3, p2

    invoke-interface {p1, p3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->q()Z

    move-result p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const/4 p1, 0x0

    return p1
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lorg/osmdroid/views/overlay/Overlay;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->j()Z

    .line 9
    .line 10
    .line 11
    :cond_0
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

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->h:Z

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lorg/osmdroid/views/overlay/compass/a;->m:Z

    return v0
.end method

.method public s()Z
    .locals 1

    iget v0, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setOptionsMenuEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/compass/a;->v:Z

    return-void
.end method

.method public t(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->l:F

    return-void
.end method

.method public u(F)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->y:F

    return-void
.end method

.method public v(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->n:F

    .line 2
    .line 3
    iput p2, p0, Lorg/osmdroid/views/overlay/compass/a;->o:F

    .line 4
    .line 5
    return-void
    .line 6
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
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/osmdroid/views/overlay/compass/a;->m:Z

    return-void
.end method

.method public x(I)V
    .locals 0

    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->x:I

    return-void
.end method

.method public y(Lorg/osmdroid/views/overlay/compass/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/osmdroid/views/overlay/compass/a;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 10
    .line 11
    invoke-interface {v0}, Lorg/osmdroid/views/overlay/compass/c;->a()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object p1, p0, Lorg/osmdroid/views/overlay/compass/a;->d:Lorg/osmdroid/views/overlay/compass/c;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    const-string v0, "You must pass an IOrientationProvider to setOrientationProvider()"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
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

.method public z(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->f()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x1

    .line 11
    iput p1, p0, Lorg/osmdroid/views/overlay/compass/a;->j:I

    .line 12
    .line 13
    invoke-direct {p0}, Lorg/osmdroid/views/overlay/compass/a;->e()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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
