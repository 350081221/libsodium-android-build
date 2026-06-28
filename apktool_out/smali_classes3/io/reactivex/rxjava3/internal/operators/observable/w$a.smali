.class final Lio/reactivex/rxjava3/internal/operators/observable/w$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/core/p0;
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;",
        "Lio/reactivex/rxjava3/disposables/e;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6077449f877ccfe7L


# instance fields
.field volatile active:Z

.field final bufferSize:I

.field volatile cancelled:Z

.field volatile done:Z

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final observer:Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/operators/observable/w$a$a<",
            "TR;>;"
        }
    .end annotation
.end field

.field queue:Lio/reactivex/rxjava3/internal/fuseable/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field sourceMode:I

.field final tillTheEnd:Z

.field upstream:Lio/reactivex/rxjava3/disposables/e;

.field final worker:Lio/reactivex/rxjava3/core/q0$c;


# direct methods
.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lm3/o;IZLio/reactivex/rxjava3/core/q0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TR;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TR;>;>;IZ",
            "Lio/reactivex/rxjava3/core/q0$c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->mapper:Lm3/o;

    .line 7
    .line 8
    iput p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->bufferSize:I

    .line 9
    .line 10
    iput-boolean p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->tillTheEnd:Z

    .line 11
    .line 12
    new-instance p2, Lio/reactivex/rxjava3/internal/util/c;

    .line 13
    .line 14
    invoke-direct {p2}, Lio/reactivex/rxjava3/internal/util/c;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 18
    .line 19
    new-instance p2, Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;

    .line 20
    .line 21
    invoke-direct {p2, p1, p0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;-><init>(Lio/reactivex/rxjava3/core/p0;Lio/reactivex/rxjava3/internal/operators/observable/w$a;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->observer:Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;

    .line 25
    .line 26
    iput-object p5, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

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
.method public dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 3
    .line 4
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 5
    .line 6
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->observer:Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;->dispose()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

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
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lio/reactivex/rxjava3/core/q0$c;->b(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/e;

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
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->done:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->drain()V

    .line 5
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
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->done:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->drain()V

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

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->sourceMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->drain()V

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
.end method

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    instance-of v0, p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lio/reactivex/rxjava3/internal/fuseable/l;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/internal/fuseable/m;->requestFusion(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->sourceMode:I

    .line 26
    .line 27
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 28
    .line 29
    iput-boolean v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->done:Z

    .line 30
    .line 31
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 32
    .line 33
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->drain()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 v1, 0x2

    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->sourceMode:I

    .line 44
    .line 45
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 46
    .line 47
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 48
    .line 49
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 54
    .line 55
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->bufferSize:I

    .line 56
    .line 57
    invoke-direct {p1, v0}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 61
    .line 62
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 63
    .line 64
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
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

.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 4
    .line 5
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->active:Z

    .line 8
    .line 9
    if-nez v3, :cond_6

    .line 10
    .line 11
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->tillTheEnd:Z

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Throwable;

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 33
    .line 34
    .line 35
    iput-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 41
    .line 42
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->done:Z

    .line 47
    .line 48
    :try_start_0
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 52
    if-nez v5, :cond_3

    .line 53
    .line 54
    move v6, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/4 v6, 0x0

    .line 57
    :goto_1
    if-eqz v3, :cond_4

    .line 58
    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    iput-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 67
    .line 68
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    if-nez v6, :cond_6

    .line 73
    .line 74
    :try_start_1
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->mapper:Lm3/o;

    .line 75
    .line 76
    invoke-interface {v3, v5}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const-string v5, "The mapper returned a null ObservableSource"

    .line 81
    .line 82
    invoke-static {v3, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    check-cast v3, Lio/reactivex/rxjava3/core/n0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 86
    .line 87
    instance-of v5, v3, Lm3/s;

    .line 88
    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    :try_start_2
    check-cast v3, Lm3/s;

    .line 92
    .line 93
    invoke-interface {v3}, Lm3/s;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    if-eqz v3, :cond_0

    .line 98
    .line 99
    iget-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 100
    .line 101
    if-nez v4, :cond_0

    .line 102
    .line 103
    invoke-interface {v0, v3}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v3

    .line 108
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    iput-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->active:Z

    .line 116
    .line 117
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->observer:Lio/reactivex/rxjava3/internal/operators/observable/w$a$a;

    .line 118
    .line 119
    invoke-interface {v3, v4}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v3

    .line 124
    invoke-static {v3}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    iput-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 128
    .line 129
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 130
    .line 131
    invoke-interface {v4}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1}, Lio/reactivex/rxjava3/internal/fuseable/q;->clear()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v3}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 144
    .line 145
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :catchall_2
    move-exception v1

    .line 150
    invoke-static {v1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    iput-boolean v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->cancelled:Z

    .line 154
    .line 155
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 156
    .line 157
    invoke-interface {v3}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w$a;->worker:Lio/reactivex/rxjava3/core/q0$c;

    .line 167
    .line 168
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_6
    :goto_2
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_0

    .line 177
    .line 178
    return-void
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
.end method
