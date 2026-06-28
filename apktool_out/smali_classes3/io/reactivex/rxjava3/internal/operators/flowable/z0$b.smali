.class final Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/t;
.implements Lorg/reactivestreams/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/flowable/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/t<",
        "TT;>;",
        "Lorg/reactivestreams/q;"
    }
.end annotation


# static fields
.field static final CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "**>;"
        }
    .end annotation
.end field

.field static final EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "**>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x1d634c9cafb5cc5aL


# instance fields
.field final bufferSize:I

.field volatile cancelled:Z

.field final delayErrors:Z

.field volatile done:Z

.field final downstream:Lorg/reactivestreams/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/reactivestreams/p<",
            "-TU;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field lastId:J

.field lastIndex:I

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field final maxConcurrency:I

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TU;>;"
        }
    .end annotation
.end field

.field final requested:Ljava/util/concurrent/atomic/AtomicLong;

.field scalarEmitted:I

.field final scalarLimit:I

.field final subscribers:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "**>;>;"
        }
    .end annotation
.end field

.field uniqueId:J

.field upstream:Lorg/reactivestreams/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 3
    .line 4
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 5
    .line 6
    new-array v0, v0, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 7
    .line 8
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 9
    .line 10
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
.end method

.method constructor <init>(Lorg/reactivestreams/p;Lm3/o;ZII)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TU;>;",
            "Lm3/o<",
            "-TT;+",
            "Lorg/reactivestreams/o<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/reactivex/rxjava3/internal/util/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 26
    .line 27
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->mapper:Lm3/o;

    .line 28
    .line 29
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->delayErrors:Z

    .line 30
    .line 31
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 32
    .line 33
    iput p5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->bufferSize:I

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    shr-int/lit8 p2, p4, 0x1

    .line 37
    .line 38
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarLimit:I

    .line 43
    .line 44
    sget-object p1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
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
.end method


# virtual methods
.method addInner(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "TT;TU;>;)Z"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 8
    .line 9
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->dispose()V

    .line 15
    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    array-length v1, v0

    .line 19
    add-int/lit8 v3, v1, 0x1

    .line 20
    .line 21
    new-array v3, v3, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 22
    .line 23
    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    aput-object p1, v3, v1

    .line 27
    .line 28
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-static {v1, v0, v3}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1
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
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 9
    .line 10
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->disposeAll()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
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
.end method

.method checkTerminate()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->clearScalarQueue()V

    .line 7
    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->delayErrors:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->clearScalarQueue()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 26
    .line 27
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    return v0
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
.end method

.method clearScalarQueue()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
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
.end method

.method disposeAll()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    aget-object v3, v0, v2

    .line 18
    .line 19
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->dispose()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
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
.end method

.method drain()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drainLoop()V

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
.end method

.method drainLoop()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 4
    .line 5
    const/4 v4, 0x1

    .line 6
    :cond_0
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 14
    .line 15
    iget-object v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    const-wide v7, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v9, v5, v7

    .line 27
    .line 28
    if-nez v9, :cond_2

    .line 29
    .line 30
    const/4 v9, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v9, 0x0

    .line 33
    :goto_1
    const-wide/16 v11, 0x1

    .line 34
    .line 35
    const-wide/16 v13, 0x0

    .line 36
    .line 37
    if-eqz v0, :cond_7

    .line 38
    .line 39
    move-wide v7, v13

    .line 40
    move-wide v15, v7

    .line 41
    :goto_2
    cmp-long v17, v5, v13

    .line 42
    .line 43
    if-eqz v17, :cond_5

    .line 44
    .line 45
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/p;->poll()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 50
    .line 51
    .line 52
    move-result v18

    .line 53
    if-eqz v18, :cond_3

    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    if-nez v10, :cond_4

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    invoke-interface {v2, v10}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    add-long/2addr v15, v11

    .line 63
    add-long/2addr v7, v11

    .line 64
    sub-long/2addr v5, v11

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    :goto_3
    cmp-long v0, v7, v13

    .line 67
    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    if-eqz v9, :cond_6

    .line 71
    .line 72
    const-wide v5, 0x7fffffffffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_6
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 79
    .line 80
    neg-long v5, v7

    .line 81
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    goto :goto_4

    .line 86
    :cond_7
    move-wide v15, v13

    .line 87
    :cond_8
    :goto_4
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

    .line 88
    .line 89
    iget-object v7, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 90
    .line 91
    iget-object v8, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 98
    .line 99
    array-length v10, v8

    .line 100
    if-eqz v0, :cond_a

    .line 101
    .line 102
    if-eqz v7, :cond_9

    .line 103
    .line 104
    invoke-interface {v7}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    :cond_9
    if-nez v10, :cond_a

    .line 111
    .line 112
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 113
    .line 114
    iget-object v2, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lorg/reactivestreams/p;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_a
    move/from16 v18, v4

    .line 121
    .line 122
    if-eqz v10, :cond_22

    .line 123
    .line 124
    iget-wide v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastId:J

    .line 125
    .line 126
    iget v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastIndex:I

    .line 127
    .line 128
    if-le v10, v0, :cond_b

    .line 129
    .line 130
    aget-object v7, v8, v0

    .line 131
    .line 132
    iget-wide v11, v7, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->id:J

    .line 133
    .line 134
    cmp-long v7, v11, v3

    .line 135
    .line 136
    if-eqz v7, :cond_10

    .line 137
    .line 138
    :cond_b
    if-gt v10, v0, :cond_c

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    :cond_c
    const/4 v7, 0x0

    .line 142
    :goto_5
    if-ge v7, v10, :cond_f

    .line 143
    .line 144
    aget-object v11, v8, v0

    .line 145
    .line 146
    iget-wide v11, v11, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->id:J

    .line 147
    .line 148
    cmp-long v11, v11, v3

    .line 149
    .line 150
    if-nez v11, :cond_d

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 154
    .line 155
    if-ne v0, v10, :cond_e

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_f
    :goto_6
    iput v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastIndex:I

    .line 162
    .line 163
    aget-object v3, v8, v0

    .line 164
    .line 165
    iget-wide v3, v3, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->id:J

    .line 166
    .line 167
    iput-wide v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastId:J

    .line 168
    .line 169
    :cond_10
    move v3, v0

    .line 170
    const/4 v0, 0x0

    .line 171
    const/4 v4, 0x0

    .line 172
    :goto_7
    if-ge v4, v10, :cond_21

    .line 173
    .line 174
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_11

    .line 179
    .line 180
    return-void

    .line 181
    :cond_11
    aget-object v7, v8, v3

    .line 182
    .line 183
    const/4 v11, 0x0

    .line 184
    :goto_8
    iget-object v12, v7, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 185
    .line 186
    if-nez v12, :cond_12

    .line 187
    .line 188
    move/from16 v21, v10

    .line 189
    .line 190
    goto/16 :goto_d

    .line 191
    .line 192
    :cond_12
    move/from16 v21, v10

    .line 193
    .line 194
    move-object/from16 v22, v11

    .line 195
    .line 196
    move-wide v10, v13

    .line 197
    :goto_9
    cmp-long v23, v5, v13

    .line 198
    .line 199
    if-eqz v23, :cond_17

    .line 200
    .line 201
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 202
    .line 203
    .line 204
    move-result v22

    .line 205
    if-eqz v22, :cond_13

    .line 206
    .line 207
    return-void

    .line 208
    :cond_13
    :try_start_0
    invoke-interface {v12}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    if-nez v13, :cond_14

    .line 213
    .line 214
    move-object/from16 v22, v13

    .line 215
    .line 216
    const-wide/16 v12, 0x0

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_14
    invoke-interface {v2, v13}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    const-wide/16 v19, 0x1

    .line 223
    .line 224
    sub-long v5, v5, v19

    .line 225
    .line 226
    add-long v10, v10, v19

    .line 227
    .line 228
    move-object/from16 v22, v13

    .line 229
    .line 230
    const-wide/16 v13, 0x0

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :catchall_0
    move-exception v0

    .line 234
    move-object v10, v0

    .line 235
    invoke-static {v10}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->dispose()V

    .line 239
    .line 240
    .line 241
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 242
    .line 243
    invoke-virtual {v0, v10}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 244
    .line 245
    .line 246
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->delayErrors:Z

    .line 247
    .line 248
    if-nez v0, :cond_15

    .line 249
    .line 250
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 251
    .line 252
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 253
    .line 254
    .line 255
    :cond_15
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_16

    .line 260
    .line 261
    return-void

    .line 262
    :cond_16
    invoke-virtual {v1, v7}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->removeInner(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)V

    .line 263
    .line 264
    .line 265
    add-int/lit8 v4, v4, 0x1

    .line 266
    .line 267
    move/from16 v7, v21

    .line 268
    .line 269
    const/4 v0, 0x1

    .line 270
    const-wide/16 v10, 0x1

    .line 271
    .line 272
    goto :goto_f

    .line 273
    :cond_17
    move-wide v12, v13

    .line 274
    :goto_a
    cmp-long v14, v10, v12

    .line 275
    .line 276
    if-eqz v14, :cond_19

    .line 277
    .line 278
    if-nez v9, :cond_18

    .line 279
    .line 280
    iget-object v5, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 281
    .line 282
    neg-long v12, v10

    .line 283
    invoke-virtual {v5, v12, v13}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v5

    .line 287
    goto :goto_b

    .line 288
    :cond_18
    const-wide v5, 0x7fffffffffffffffL

    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :goto_b
    invoke-virtual {v7, v10, v11}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->requestMore(J)V

    .line 294
    .line 295
    .line 296
    const-wide/16 v10, 0x0

    .line 297
    .line 298
    goto :goto_c

    .line 299
    :cond_19
    move-wide v10, v12

    .line 300
    :goto_c
    cmp-long v12, v5, v10

    .line 301
    .line 302
    if-eqz v12, :cond_1b

    .line 303
    .line 304
    if-nez v22, :cond_1a

    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_1a
    move/from16 v10, v21

    .line 308
    .line 309
    move-object/from16 v11, v22

    .line 310
    .line 311
    const-wide/16 v13, 0x0

    .line 312
    .line 313
    goto/16 :goto_8

    .line 314
    .line 315
    :cond_1b
    :goto_d
    iget-boolean v10, v7, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->done:Z

    .line 316
    .line 317
    iget-object v11, v7, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 318
    .line 319
    if-eqz v10, :cond_1e

    .line 320
    .line 321
    if-eqz v11, :cond_1c

    .line 322
    .line 323
    invoke-interface {v11}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-eqz v10, :cond_1e

    .line 328
    .line 329
    :cond_1c
    invoke-virtual {v1, v7}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->removeInner(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {p0 .. p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->checkTerminate()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_1d

    .line 337
    .line 338
    return-void

    .line 339
    :cond_1d
    const-wide/16 v10, 0x1

    .line 340
    .line 341
    add-long/2addr v15, v10

    .line 342
    const/4 v0, 0x1

    .line 343
    goto :goto_e

    .line 344
    :cond_1e
    const-wide/16 v10, 0x1

    .line 345
    .line 346
    :goto_e
    const-wide/16 v12, 0x0

    .line 347
    .line 348
    cmp-long v7, v5, v12

    .line 349
    .line 350
    if-nez v7, :cond_1f

    .line 351
    .line 352
    move v10, v0

    .line 353
    const/4 v12, 0x1

    .line 354
    goto :goto_10

    .line 355
    :cond_1f
    add-int/lit8 v3, v3, 0x1

    .line 356
    .line 357
    move/from16 v7, v21

    .line 358
    .line 359
    if-ne v3, v7, :cond_20

    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    :cond_20
    :goto_f
    const/4 v12, 0x1

    .line 363
    add-int/2addr v4, v12

    .line 364
    move v10, v7

    .line 365
    const-wide/16 v13, 0x0

    .line 366
    .line 367
    goto/16 :goto_7

    .line 368
    .line 369
    :cond_21
    const/4 v12, 0x1

    .line 370
    move v10, v0

    .line 371
    :goto_10
    iput v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastIndex:I

    .line 372
    .line 373
    aget-object v0, v8, v3

    .line 374
    .line 375
    iget-wide v3, v0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->id:J

    .line 376
    .line 377
    iput-wide v3, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->lastId:J

    .line 378
    .line 379
    move-wide v3, v15

    .line 380
    const-wide/16 v5, 0x0

    .line 381
    .line 382
    goto :goto_11

    .line 383
    :cond_22
    const/4 v12, 0x1

    .line 384
    move-wide v5, v13

    .line 385
    move-wide v3, v15

    .line 386
    const/4 v10, 0x0

    .line 387
    :goto_11
    cmp-long v0, v3, v5

    .line 388
    .line 389
    if-eqz v0, :cond_23

    .line 390
    .line 391
    iget-boolean v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 392
    .line 393
    if-nez v0, :cond_23

    .line 394
    .line 395
    iget-object v0, v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 396
    .line 397
    invoke-interface {v0, v3, v4}, Lorg/reactivestreams/q;->request(J)V

    .line 398
    .line 399
    .line 400
    :cond_23
    if-eqz v10, :cond_24

    .line 401
    .line 402
    move/from16 v4, v18

    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_24
    move/from16 v3, v18

    .line 407
    .line 408
    neg-int v0, v3

    .line 409
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-nez v4, :cond_0

    .line 414
    .line 415
    return-void
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
.end method

.method getMainQueue()Lio/reactivex/rxjava3/internal/fuseable/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TU;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 6
    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/c;

    .line 13
    .line 14
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->bufferSize:I

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 21
    .line 22
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 28
    .line 29
    :cond_1
    return-object v0
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
.end method

.method innerError(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "TT;TU;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->done:Z

    .line 11
    .line 12
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->delayErrors:Z

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 17
    .line 18
    invoke-interface {p1}, Lorg/reactivestreams/q;->cancel()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    sget-object p2, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 30
    .line 31
    array-length p2, p1

    .line 32
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-ge v0, p2, :cond_0

    .line 34
    .line 35
    aget-object v1, p1, v0

    .line 36
    .line 37
    invoke-virtual {v1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->dispose()V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drain()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drain()V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

    .line 19
    .line 20
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->delayErrors:Z

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    sget-object v0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 33
    .line 34
    array-length v0, p1

    .line 35
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-ge v1, v0, :cond_1

    .line 37
    .line 38
    aget-object v2, p1, v1

    .line 39
    .line 40
    invoke-virtual {v2}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->dispose()V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drain()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
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
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->mapper:Lm3/o;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "The mapper returned a null Publisher"

    .line 13
    .line 14
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    check-cast p1, Lorg/reactivestreams/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    instance-of v0, p1, Lm3/s;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :try_start_1
    check-cast p1, Lm3/s;

    .line 24
    .line 25
    invoke-interface {p1}, Lm3/s;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->tryEmitScalar(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 36
    .line 37
    const v0, 0x7fffffff

    .line 38
    .line 39
    .line 40
    if-eq p1, v0, :cond_3

    .line 41
    .line 42
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 51
    .line 52
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarLimit:I

    .line 53
    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 58
    .line 59
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 60
    .line 61
    int-to-long v0, v0

    .line 62
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drain()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 80
    .line 81
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->bufferSize:I

    .line 82
    .line 83
    iget-wide v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->uniqueId:J

    .line 84
    .line 85
    const-wide/16 v4, 0x1

    .line 86
    .line 87
    add-long/2addr v4, v2

    .line 88
    iput-wide v4, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->uniqueId:J

    .line 89
    .line 90
    invoke-direct {v0, p0, v1, v2, v3}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;-><init>(Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;IJ)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->addInner(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    invoke-interface {p1, v0}, Lorg/reactivestreams/o;->subscribe(Lorg/reactivestreams/p;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_0
    return-void

    .line 103
    :catchall_1
    move-exception p1

    .line 104
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 108
    .line 109
    invoke-interface {v0}, Lorg/reactivestreams/q;->cancel()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->onError(Ljava/lang/Throwable;)V

    .line 113
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
.end method

.method public onSubscribe(Lorg/reactivestreams/q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(Lorg/reactivestreams/q;Lorg/reactivestreams/q;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 21
    .line 22
    const v1, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    const-wide v0, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    int-to-long v0, v0

    .line 37
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
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
.end method

.method removeInner(Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "TT;TU;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_3

    .line 16
    .line 17
    aget-object v4, v0, v3

    .line 18
    .line 19
    if-ne v4, p1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_4

    .line 27
    .line 28
    return-void

    .line 29
    :cond_4
    const/4 v4, 0x1

    .line 30
    if-ne v1, v4, :cond_5

    .line 31
    .line 32
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_5
    add-int/lit8 v5, v1, -0x1

    .line 36
    .line 37
    new-array v5, v5, [Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;

    .line 38
    .line 39
    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v3, 0x1

    .line 43
    .line 44
    sub-int/2addr v1, v3

    .line 45
    sub-int/2addr v1, v4

    .line 46
    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    move-object v1, v5

    .line 50
    :goto_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->subscribers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    return-void
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
.end method

.method public request(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lio/reactivex/rxjava3/internal/subscriptions/j;->validate(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Lio/reactivex/rxjava3/internal/util/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drain()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
.end method

.method tryEmit(Ljava/lang/Object;Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Lio/reactivex/rxjava3/internal/operators/flowable/z0$a<",
            "TT;TU;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Inner queue full?!"

    .line 6
    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    iget-object v0, p2, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 24
    .line 25
    const-wide/16 v4, 0x0

    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-wide v0, 0x7fffffffffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long p1, v2, v0

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 56
    .line 57
    .line 58
    :cond_1
    const-wide/16 v0, 0x1

    .line 59
    .line 60
    invoke-virtual {p2, v0, v1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->requestMore(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-nez v0, :cond_3

    .line 65
    .line 66
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 67
    .line 68
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->bufferSize:I

    .line 69
    .line 70
    invoke-direct {v0, v2}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p2, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 74
    .line 75
    :cond_3
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->onError(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_8

    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    iget-object v0, p2, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/b;

    .line 101
    .line 102
    iget v2, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->bufferSize:I

    .line 103
    .line 104
    invoke-direct {v0, v2}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p2, Lio/reactivex/rxjava3/internal/operators/flowable/z0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 108
    .line 109
    :cond_6
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_7

    .line 114
    .line 115
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 116
    .line 117
    invoke-direct {p1, v1}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->onError(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_8

    .line 129
    .line 130
    return-void

    .line 131
    :cond_8
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drainLoop()V

    .line 132
    .line 133
    .line 134
    return-void
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
.end method

.method tryEmitScalar(Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Scalar queue full?!"

    .line 6
    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 24
    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    cmp-long v6, v3, v6

    .line 28
    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-interface {v5}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->downstream:Lorg/reactivestreams/p;

    .line 40
    .line 41
    invoke-interface {v1, p1}, Lorg/reactivestreams/p;->onNext(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-wide v5, 0x7fffffffffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long p1, v3, v5

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->requested:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 56
    .line 57
    .line 58
    :cond_1
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->maxConcurrency:I

    .line 59
    .line 60
    const v1, 0x7fffffff

    .line 61
    .line 62
    .line 63
    if-eq p1, v1, :cond_4

    .line 64
    .line 65
    iget-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->cancelled:Z

    .line 66
    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 70
    .line 71
    add-int/2addr p1, v2

    .line 72
    iput p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 73
    .line 74
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarLimit:I

    .line 75
    .line 76
    if-ne p1, v1, :cond_4

    .line 77
    .line 78
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->scalarEmitted:I

    .line 79
    .line 80
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->upstream:Lorg/reactivestreams/q;

    .line 81
    .line 82
    int-to-long v0, v1

    .line 83
    invoke-interface {p1, v0, v1}, Lorg/reactivestreams/q;->request(J)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    if-nez v5, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->getMainQueue()Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    :cond_3
    invoke-interface {v5, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 100
    .line 101
    invoke-direct {p1, v1}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->onError(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->getMainQueue()Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    new-instance p1, Lio/reactivex/rxjava3/exceptions/c;

    .line 125
    .line 126
    invoke-direct {p1, v1}, Lio/reactivex/rxjava3/exceptions/c;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->onError(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    return-void

    .line 140
    :cond_7
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/flowable/z0$b;->drainLoop()V

    .line 141
    .line 142
    .line 143
    return-void
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
.end method
