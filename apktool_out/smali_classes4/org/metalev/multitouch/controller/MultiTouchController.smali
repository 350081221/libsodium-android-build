.class public Lorg/metalev/multitouch/controller/MultiTouchController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;,
        Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;,
        Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static ACTION_POINTER_INDEX_SHIFT:I = 0x8

.field private static ACTION_POINTER_UP:I = 0x6

.field public static final DEBUG:Z = false

.field private static final EVENT_SETTLE_TIME_INTERVAL:J = 0x14L

.field private static final MAX_MULTITOUCH_DIM_JUMP_SIZE:F = 40.0f

.field private static final MAX_MULTITOUCH_POS_JUMP_SIZE:F = 30.0f

.field public static final MAX_TOUCH_POINTS:I = 0x14

.field private static final MIN_MULTITOUCH_SEPARATION:F = 30.0f

.field private static final MODE_DRAG:I = 0x1

.field private static final MODE_NOTHING:I = 0x0

.field private static final MODE_PINCH:I = 0x2

.field private static m_getHistoricalPressure:Ljava/lang/reflect/Method;

.field private static m_getHistoricalX:Ljava/lang/reflect/Method;

.field private static m_getHistoricalY:Ljava/lang/reflect/Method;

.field private static m_getPointerCount:Ljava/lang/reflect/Method;

.field private static m_getPointerId:Ljava/lang/reflect/Method;

.field private static m_getPressure:Ljava/lang/reflect/Method;

.field private static m_getX:Ljava/lang/reflect/Method;

.field private static m_getY:Ljava/lang/reflect/Method;

.field public static final multiTouchSupported:Z

.field private static final pointerIds:[I

.field private static final pressureVals:[F

.field private static final xVals:[F

.field private static final yVals:[F


# instance fields
.field private handleSingleTouchEvents:Z

.field private mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

.field private mCurrPtAng:F

.field private mCurrPtDiam:F

.field private mCurrPtHeight:F

.field private mCurrPtWidth:F

.field private mCurrPtX:F

.field private mCurrPtY:F

.field private mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

.field private mMode:I

.field private mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

.field private mSettleEndTime:J

.field private mSettleStartTime:J

.field objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas<",
            "TT;>;"
        }
    .end annotation
.end field

.field private selectedObject:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private startAngleMinusPinchAngle:F

.field private startPosX:F

.field private startPosY:F

.field private startScaleOverPinchDiam:F

.field private startScaleXOverPinchWidth:F

.field private startScaleYOverPinchHeight:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-class v0, Landroid/view/MotionEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "getPointerCount"

    .line 5
    .line 6
    new-array v3, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPointerCount:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    const-string v2, "getPointerId"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    new-array v4, v3, [Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    aput-object v5, v4, v1

    .line 22
    .line 23
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPointerId:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    const-string v2, "getPressure"

    .line 30
    .line 31
    new-array v4, v3, [Ljava/lang/Class;

    .line 32
    .line 33
    aput-object v5, v4, v1

    .line 34
    .line 35
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPressure:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    const-string v2, "getHistoricalX"

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    new-array v6, v4, [Ljava/lang/Class;

    .line 45
    .line 46
    aput-object v5, v6, v1

    .line 47
    .line 48
    aput-object v5, v6, v3

    .line 49
    .line 50
    invoke-virtual {v0, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalX:Ljava/lang/reflect/Method;

    .line 55
    .line 56
    const-string v2, "getHistoricalY"

    .line 57
    .line 58
    new-array v6, v4, [Ljava/lang/Class;

    .line 59
    .line 60
    aput-object v5, v6, v1

    .line 61
    .line 62
    aput-object v5, v6, v3

    .line 63
    .line 64
    invoke-virtual {v0, v2, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalY:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    const-string v2, "getHistoricalPressure"

    .line 71
    .line 72
    new-array v4, v4, [Ljava/lang/Class;

    .line 73
    .line 74
    aput-object v5, v4, v1

    .line 75
    .line 76
    aput-object v5, v4, v3

    .line 77
    .line 78
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalPressure:Ljava/lang/reflect/Method;

    .line 83
    .line 84
    const-string v2, "getX"

    .line 85
    .line 86
    new-array v4, v3, [Ljava/lang/Class;

    .line 87
    .line 88
    aput-object v5, v4, v1

    .line 89
    .line 90
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getX:Ljava/lang/reflect/Method;

    .line 95
    .line 96
    const-string v2, "getY"

    .line 97
    .line 98
    new-array v4, v3, [Ljava/lang/Class;

    .line 99
    .line 100
    aput-object v5, v4, v1

    .line 101
    .line 102
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sput-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getY:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    move v1, v3

    .line 109
    goto :goto_0

    .line 110
    :catch_0
    move-exception v2

    .line 111
    const-string v3, "MultiTouchController"

    .line 112
    .line 113
    const-string v4, "static initializer failed"

    .line 114
    .line 115
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    :goto_0
    sput-boolean v1, Lorg/metalev/multitouch/controller/MultiTouchController;->multiTouchSupported:Z

    .line 119
    .line 120
    if-eqz v1, :cond_0

    .line 121
    .line 122
    :try_start_1
    const-string v1, "ACTION_POINTER_UP"

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    sput v1, Lorg/metalev/multitouch/controller/MultiTouchController;->ACTION_POINTER_UP:I

    .line 134
    .line 135
    const-string v1, "ACTION_POINTER_INDEX_SHIFT"

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    sput v0, Lorg/metalev/multitouch/controller/MultiTouchController;->ACTION_POINTER_INDEX_SHIFT:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 146
    .line 147
    :catch_1
    :cond_0
    const/16 v0, 0x14

    .line 148
    .line 149
    new-array v1, v0, [F

    .line 150
    .line 151
    sput-object v1, Lorg/metalev/multitouch/controller/MultiTouchController;->xVals:[F

    .line 152
    .line 153
    new-array v1, v0, [F

    .line 154
    .line 155
    sput-object v1, Lorg/metalev/multitouch/controller/MultiTouchController;->yVals:[F

    .line 156
    .line 157
    new-array v1, v0, [F

    .line 158
    .line 159
    sput-object v1, Lorg/metalev/multitouch/controller/MultiTouchController;->pressureVals:[F

    .line 160
    .line 161
    new-array v0, v0, [I

    .line 162
    .line 163
    sput-object v0, Lorg/metalev/multitouch/controller/MultiTouchController;->pointerIds:[I

    .line 164
    .line 165
    return-void
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

.method public constructor <init>(Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/metalev/multitouch/controller/MultiTouchController;-><init>(Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas<",
            "TT;>;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 4
    new-instance v0, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    invoke-direct {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;-><init>()V

    iput-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 6
    new-instance v0, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    invoke-direct {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;-><init>()V

    iput-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 7
    new-instance v0, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    invoke-direct {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;-><init>()V

    iput-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 8
    iput-boolean p2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->handleSingleTouchEvents:Z

    .line 9
    iput-object p1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    return-void
.end method

.method private anchorAtThisPositionAndScale()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 7
    .line 8
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 9
    .line 10
    invoke-interface {v1, v0, v2}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->getPositionAndScale(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 14
    .line 15
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$000(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :goto_0
    move v0, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 26
    .line 27
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$400(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v2, 0x0

    .line 32
    cmpl-float v0, v0, v2

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 38
    .line 39
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$400(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :goto_1
    div-float/2addr v1, v0

    .line 44
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->extractCurrPtInfo()V

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtX:F

    .line 48
    .line 49
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 50
    .line 51
    invoke-static {v2}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$500(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sub-float/2addr v0, v2

    .line 56
    mul-float/2addr v0, v1

    .line 57
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startPosX:F

    .line 58
    .line 59
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtY:F

    .line 60
    .line 61
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 62
    .line 63
    invoke-static {v2}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$600(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sub-float/2addr v0, v2

    .line 68
    mul-float/2addr v0, v1

    .line 69
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startPosY:F

    .line 70
    .line 71
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 72
    .line 73
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$400(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtDiam:F

    .line 78
    .line 79
    div-float/2addr v0, v1

    .line 80
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleOverPinchDiam:F

    .line 81
    .line 82
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 83
    .line 84
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$700(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtWidth:F

    .line 89
    .line 90
    div-float/2addr v0, v1

    .line 91
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleXOverPinchWidth:F

    .line 92
    .line 93
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 94
    .line 95
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$800(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtHeight:F

    .line 100
    .line 101
    div-float/2addr v0, v1

    .line 102
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleYOverPinchHeight:F

    .line 103
    .line 104
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 105
    .line 106
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$900(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtAng:F

    .line 111
    .line 112
    sub-float/2addr v0, v1

    .line 113
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startAngleMinusPinchAngle:F

    .line 114
    .line 115
    return-void
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

.method private decodeTouchEvent(I[F[F[F[IIZJ)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 3
    .line 4
    iget-object v2, v0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 5
    .line 6
    iput-object v2, v0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 7
    .line 8
    iput-object v1, v0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 9
    .line 10
    move v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object/from16 v6, p5

    .line 15
    .line 16
    move/from16 v7, p6

    .line 17
    .line 18
    move/from16 v8, p7

    .line 19
    .line 20
    move-wide/from16 v9, p8

    .line 21
    .line 22
    invoke-static/range {v1 .. v10}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->access$300(Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;I[F[F[F[IIZJ)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->multiTouchController()V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method private extractCurrPtInfo()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtX:F

    .line 8
    .line 9
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getY()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtY:F

    .line 16
    .line 17
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 18
    .line 19
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$000(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 29
    .line 30
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchDiameter()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :goto_0
    const v2, 0x41aa6666    # 21.3f

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtDiam:F

    .line 42
    .line 43
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 44
    .line 45
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$100(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    move v0, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 54
    .line 55
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchWidth()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    :goto_1
    const/high16 v2, 0x41f00000    # 30.0f

    .line 60
    .line 61
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtWidth:F

    .line 66
    .line 67
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 68
    .line 69
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$100(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    move v0, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 78
    .line 79
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchHeight()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :goto_2
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtHeight:F

    .line 88
    .line 89
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 90
    .line 91
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$200(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_3

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 99
    .line 100
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchAngle()F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :goto_3
    iput v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtAng:F

    .line 105
    .line 106
    return-void
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

.method private multiTouchController()V
    .locals 7

    .line 1
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const-wide/16 v5, 0x14

    .line 10
    .line 11
    if-eq v0, v1, :cond_7

    .line 12
    .line 13
    if-eq v0, v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isMultiTouch()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isDown()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 36
    .line 37
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 42
    .line 43
    invoke-virtual {v1}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getX()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-float/2addr v0, v1

    .line 48
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/high16 v1, 0x41f00000    # 30.0f

    .line 53
    .line 54
    cmpl-float v0, v0, v1

    .line 55
    .line 56
    if-gtz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 59
    .line 60
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getY()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 65
    .line 66
    invoke-virtual {v2}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getY()F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sub-float/2addr v0, v2

    .line 71
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    cmpl-float v0, v0, v1

    .line 76
    .line 77
    if-gtz v0, :cond_4

    .line 78
    .line 79
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 80
    .line 81
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchWidth()F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 86
    .line 87
    invoke-virtual {v1}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchWidth()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    sub-float/2addr v0, v1

    .line 92
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const/high16 v1, 0x3f000000    # 0.5f

    .line 97
    .line 98
    mul-float/2addr v0, v1

    .line 99
    const/high16 v2, 0x42200000    # 40.0f

    .line 100
    .line 101
    cmpl-float v0, v0, v2

    .line 102
    .line 103
    if-gtz v0, :cond_4

    .line 104
    .line 105
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 106
    .line 107
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchHeight()F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iget-object v3, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mPrevPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 112
    .line 113
    invoke-virtual {v3}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getMultiTouchHeight()F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    sub-float/2addr v0, v3

    .line 118
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    mul-float/2addr v0, v1

    .line 123
    cmpl-float v0, v0, v2

    .line 124
    .line 125
    if-lez v0, :cond_2

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_2
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 129
    .line 130
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->access$1000(Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    iget-wide v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 135
    .line 136
    cmp-long v0, v0, v2

    .line 137
    .line 138
    if-gez v0, :cond_3

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :cond_3
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->performDragOrPinch()V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :cond_4
    :goto_0
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 154
    .line 155
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getEventTime()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleStartTime:J

    .line 160
    .line 161
    add-long/2addr v0, v5

    .line 162
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 163
    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :cond_5
    :goto_1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 167
    .line 168
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isDown()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_6

    .line 173
    .line 174
    iput v3, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 175
    .line 176
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 177
    .line 178
    iput-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 179
    .line 180
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 181
    .line 182
    invoke-interface {v0, v2, v1}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->selectObject(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :cond_6
    iput v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 188
    .line 189
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 193
    .line 194
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getEventTime()J

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleStartTime:J

    .line 199
    .line 200
    add-long/2addr v0, v5

    .line 201
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 205
    .line 206
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isDown()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-nez v0, :cond_8

    .line 211
    .line 212
    iput v3, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 213
    .line 214
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 215
    .line 216
    iput-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 217
    .line 218
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 219
    .line 220
    invoke-interface {v0, v2, v1}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->selectObject(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_8
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 225
    .line 226
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isMultiTouch()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    iput v4, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 233
    .line 234
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 235
    .line 236
    .line 237
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 238
    .line 239
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getEventTime()J

    .line 240
    .line 241
    .line 242
    move-result-wide v0

    .line 243
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleStartTime:J

    .line 244
    .line 245
    add-long/2addr v0, v5

    .line 246
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_9
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 250
    .line 251
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getEventTime()J

    .line 252
    .line 253
    .line 254
    move-result-wide v0

    .line 255
    iget-wide v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 256
    .line 257
    cmp-long v0, v0, v2

    .line 258
    .line 259
    if-gez v0, :cond_a

    .line 260
    .line 261
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_a
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->performDragOrPinch()V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_b
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 270
    .line 271
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->isDown()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_c

    .line 276
    .line 277
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 278
    .line 279
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 280
    .line 281
    invoke-interface {v0, v2}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->getDraggableObjectAtPoint(Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iput-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 286
    .line 287
    if-eqz v0, :cond_c

    .line 288
    .line 289
    iput v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 290
    .line 291
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 292
    .line 293
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 294
    .line 295
    invoke-interface {v1, v0, v2}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->selectObject(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)V

    .line 296
    .line 297
    .line 298
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->anchorAtThisPositionAndScale()V

    .line 299
    .line 300
    .line 301
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 302
    .line 303
    invoke-virtual {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;->getEventTime()J

    .line 304
    .line 305
    .line 306
    move-result-wide v0

    .line 307
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleEndTime:J

    .line 308
    .line 309
    iput-wide v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mSettleStartTime:J

    .line 310
    .line 311
    :cond_c
    :goto_2
    return-void
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

.method private performDragOrPinch()V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 7
    .line 8
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$000(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 18
    .line 19
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$400(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x0

    .line 24
    cmpl-float v0, v0, v2

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 30
    .line 31
    invoke-static {v0}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->access$400(Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :goto_0
    invoke-direct {p0}, Lorg/metalev/multitouch/controller/MultiTouchController;->extractCurrPtInfo()V

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtX:F

    .line 39
    .line 40
    iget v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startPosX:F

    .line 41
    .line 42
    mul-float/2addr v2, v1

    .line 43
    sub-float v4, v0, v2

    .line 44
    .line 45
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtY:F

    .line 46
    .line 47
    iget v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startPosY:F

    .line 48
    .line 49
    mul-float/2addr v2, v1

    .line 50
    sub-float v5, v0, v2

    .line 51
    .line 52
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleOverPinchDiam:F

    .line 53
    .line 54
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtDiam:F

    .line 55
    .line 56
    mul-float v6, v0, v1

    .line 57
    .line 58
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleXOverPinchWidth:F

    .line 59
    .line 60
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtWidth:F

    .line 61
    .line 62
    mul-float v7, v0, v1

    .line 63
    .line 64
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startScaleYOverPinchHeight:F

    .line 65
    .line 66
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtHeight:F

    .line 67
    .line 68
    mul-float v8, v0, v1

    .line 69
    .line 70
    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->startAngleMinusPinchAngle:F

    .line 71
    .line 72
    iget v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPtAng:F

    .line 73
    .line 74
    add-float v9, v0, v1

    .line 75
    .line 76
    iget-object v3, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 77
    .line 78
    invoke-virtual/range {v3 .. v9}, Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;->set(FFFFFF)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->objectCanvas:Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;

    .line 82
    .line 83
    iget-object v1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->selectedObject:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v2, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrXform:Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;

    .line 86
    .line 87
    iget-object v3, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mCurrPt:Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;

    .line 88
    .line 89
    invoke-interface {v0, v1, v2, v3}, Lorg/metalev/multitouch/controller/MultiTouchController$MultiTouchObjectCanvas;->setPositionAndScale(Ljava/lang/Object;Lorg/metalev/multitouch/controller/MultiTouchController$PositionAndScale;Lorg/metalev/multitouch/controller/MultiTouchController$PointInfo;)Z

    .line 90
    .line 91
    .line 92
    return-void
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


# virtual methods
.method protected getHandleSingleTouchEvents()Z
    .locals 1

    iget-boolean v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->handleSingleTouchEvents:Z

    return v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    return v0
.end method

.method public isPinching()Z
    .locals 2

    iget v0, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 20

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v12, 0x0

    .line 6
    :try_start_0
    sget-boolean v1, Lorg/metalev/multitouch/controller/MultiTouchController;->multiTouchSupported:Z

    .line 7
    .line 8
    const/4 v13, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPointerCount:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    new-array v2, v12, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    move v14, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v14, v13

    .line 28
    :goto_0
    iget v1, v11, Lorg/metalev/multitouch/controller/MultiTouchController;->mMode:I

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-boolean v1, v11, Lorg/metalev/multitouch/controller/MultiTouchController;->handleSingleTouchEvents:Z

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-ne v14, v13, :cond_1

    .line 37
    .line 38
    return v12

    .line 39
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 40
    .line 41
    .line 42
    move-result v15

    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    div-int v9, v1, v14

    .line 48
    .line 49
    move v10, v12

    .line 50
    :goto_1
    if-gt v10, v9, :cond_10

    .line 51
    .line 52
    if-ge v10, v9, :cond_2

    .line 53
    .line 54
    move v1, v13

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v1, v12

    .line 57
    :goto_2
    sget-boolean v2, Lorg/metalev/multitouch/controller/MultiTouchController;->multiTouchSupported:Z

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    if-eqz v2, :cond_7

    .line 61
    .line 62
    if-ne v14, v13, :cond_3

    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_3
    const/16 v2, 0x14

    .line 67
    .line 68
    invoke-static {v14, v2}, Ljava/lang/Math;->min(II)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    move v4, v12

    .line 73
    :goto_3
    if-ge v4, v2, :cond_b

    .line 74
    .line 75
    sget-object v5, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPointerId:Ljava/lang/reflect/Method;

    .line 76
    .line 77
    new-array v6, v13, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    aput-object v7, v6, v12

    .line 84
    .line 85
    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->pointerIds:[I

    .line 96
    .line 97
    aput v5, v6, v4

    .line 98
    .line 99
    sget-object v5, Lorg/metalev/multitouch/controller/MultiTouchController;->xVals:[F

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalX:Ljava/lang/reflect/Method;

    .line 104
    .line 105
    new-array v7, v3, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    aput-object v8, v7, v12

    .line 112
    .line 113
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    aput-object v8, v7, v13

    .line 118
    .line 119
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_4

    .line 124
    :cond_4
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getX:Ljava/lang/reflect/Method;

    .line 125
    .line 126
    new-array v7, v13, [Ljava/lang/Object;

    .line 127
    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    aput-object v8, v7, v12

    .line 133
    .line 134
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    :goto_4
    check-cast v6, Ljava/lang/Float;

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    aput v6, v5, v4

    .line 145
    .line 146
    sget-object v5, Lorg/metalev/multitouch/controller/MultiTouchController;->yVals:[F

    .line 147
    .line 148
    if-eqz v1, :cond_5

    .line 149
    .line 150
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalY:Ljava/lang/reflect/Method;

    .line 151
    .line 152
    new-array v7, v3, [Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    aput-object v8, v7, v12

    .line 159
    .line 160
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    aput-object v8, v7, v13

    .line 165
    .line 166
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    goto :goto_5

    .line 171
    :cond_5
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getY:Ljava/lang/reflect/Method;

    .line 172
    .line 173
    new-array v7, v13, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    aput-object v8, v7, v12

    .line 180
    .line 181
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    :goto_5
    check-cast v6, Ljava/lang/Float;

    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    aput v6, v5, v4

    .line 192
    .line 193
    sget-object v5, Lorg/metalev/multitouch/controller/MultiTouchController;->pressureVals:[F

    .line 194
    .line 195
    if-eqz v1, :cond_6

    .line 196
    .line 197
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getHistoricalPressure:Ljava/lang/reflect/Method;

    .line 198
    .line 199
    new-array v7, v3, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    aput-object v8, v7, v12

    .line 206
    .line 207
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    aput-object v8, v7, v13

    .line 212
    .line 213
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    goto :goto_6

    .line 218
    :cond_6
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->m_getPressure:Ljava/lang/reflect/Method;

    .line 219
    .line 220
    new-array v7, v13, [Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    aput-object v8, v7, v12

    .line 227
    .line 228
    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    :goto_6
    check-cast v6, Ljava/lang/Float;

    .line 233
    .line 234
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    aput v6, v5, v4

    .line 239
    .line 240
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    goto/16 :goto_3

    .line 243
    .line 244
    :cond_7
    :goto_7
    sget-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->xVals:[F

    .line 245
    .line 246
    if-eqz v1, :cond_8

    .line 247
    .line 248
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalX(I)F

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    goto :goto_8

    .line 253
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    :goto_8
    aput v4, v2, v12

    .line 258
    .line 259
    sget-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->yVals:[F

    .line 260
    .line 261
    if-eqz v1, :cond_9

    .line 262
    .line 263
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalY(I)F

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    goto :goto_9

    .line 268
    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    :goto_9
    aput v4, v2, v12

    .line 273
    .line 274
    sget-object v2, Lorg/metalev/multitouch/controller/MultiTouchController;->pressureVals:[F

    .line 275
    .line 276
    if-eqz v1, :cond_a

    .line 277
    .line 278
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalPressure(I)F

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    goto :goto_a

    .line 283
    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPressure()F

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    :goto_a
    aput v4, v2, v12

    .line 288
    .line 289
    :cond_b
    sget-object v4, Lorg/metalev/multitouch/controller/MultiTouchController;->xVals:[F

    .line 290
    .line 291
    sget-object v5, Lorg/metalev/multitouch/controller/MultiTouchController;->yVals:[F

    .line 292
    .line 293
    sget-object v6, Lorg/metalev/multitouch/controller/MultiTouchController;->pressureVals:[F

    .line 294
    .line 295
    sget-object v7, Lorg/metalev/multitouch/controller/MultiTouchController;->pointerIds:[I

    .line 296
    .line 297
    if-eqz v1, :cond_c

    .line 298
    .line 299
    move v8, v3

    .line 300
    goto :goto_b

    .line 301
    :cond_c
    move v8, v15

    .line 302
    :goto_b
    if-eqz v1, :cond_d

    .line 303
    .line 304
    :goto_c
    move/from16 v16, v13

    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_d
    if-eq v15, v13, :cond_e

    .line 308
    .line 309
    sget v2, Lorg/metalev/multitouch/controller/MultiTouchController;->ACTION_POINTER_INDEX_SHIFT:I

    .line 310
    .line 311
    shl-int v2, v13, v2

    .line 312
    .line 313
    sub-int/2addr v2, v13

    .line 314
    and-int/2addr v2, v15

    .line 315
    sget v3, Lorg/metalev/multitouch/controller/MultiTouchController;->ACTION_POINTER_UP:I

    .line 316
    .line 317
    if-eq v2, v3, :cond_e

    .line 318
    .line 319
    const/4 v2, 0x3

    .line 320
    if-eq v15, v2, :cond_e

    .line 321
    .line 322
    goto :goto_c

    .line 323
    :cond_e
    move/from16 v16, v12

    .line 324
    .line 325
    :goto_d
    if-eqz v1, :cond_f

    .line 326
    .line 327
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    .line 328
    .line 329
    .line 330
    move-result-wide v1

    .line 331
    goto :goto_e

    .line 332
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 333
    .line 334
    .line 335
    move-result-wide v1

    .line 336
    :goto_e
    move-wide/from16 v17, v1

    .line 337
    .line 338
    move-object/from16 v1, p0

    .line 339
    .line 340
    move v2, v14

    .line 341
    move-object v3, v4

    .line 342
    move-object v4, v5

    .line 343
    move-object v5, v6

    .line 344
    move-object v6, v7

    .line 345
    move v7, v8

    .line 346
    move/from16 v8, v16

    .line 347
    .line 348
    move/from16 v16, v9

    .line 349
    .line 350
    move/from16 v19, v10

    .line 351
    .line 352
    move-wide/from16 v9, v17

    .line 353
    .line 354
    invoke-direct/range {v1 .. v10}, Lorg/metalev/multitouch/controller/MultiTouchController;->decodeTouchEvent(I[F[F[F[IIZJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    .line 356
    .line 357
    add-int/lit8 v10, v19, 0x1

    .line 358
    .line 359
    move/from16 v9, v16

    .line 360
    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :cond_10
    return v13

    .line 364
    :catch_0
    move-exception v0

    .line 365
    const-string v1, "MultiTouchController"

    .line 366
    .line 367
    const-string v2, "onTouchEvent() failed"

    .line 368
    .line 369
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 370
    .line 371
    .line 372
    return v12
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

.method protected setHandleSingleTouchEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/metalev/multitouch/controller/MultiTouchController;->handleSingleTouchEvents:Z

    return-void
.end method
