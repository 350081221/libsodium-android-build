.class final Lio/reactivex/rxjava3/internal/operators/observable/w0$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/rxjava3/disposables/e;
.implements Lio/reactivex/rxjava3/core/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/internal/operators/observable/w0;
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
        "Lio/reactivex/rxjava3/disposables/e;",
        "Lio/reactivex/rxjava3/core/p0<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final CANCELLED:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
            "**>;"
        }
    .end annotation
.end field

.field static final EMPTY:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
            "**>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x1d634c9cafb5cc5aL


# instance fields
.field final bufferSize:I

.field final delayErrors:Z

.field volatile disposed:Z

.field volatile done:Z

.field final downstream:Lio/reactivex/rxjava3/core/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/core/p0<",
            "-TU;>;"
        }
    .end annotation
.end field

.field final errors:Lio/reactivex/rxjava3/internal/util/c;

.field lastIndex:I

.field final mapper:Lm3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field final maxConcurrency:I

.field final observers:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
            "**>;>;"
        }
    .end annotation
.end field

.field volatile queue:Lio/reactivex/rxjava3/internal/fuseable/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/internal/fuseable/p<",
            "TU;>;"
        }
    .end annotation
.end field

.field sources:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field uniqueId:J

.field upstream:Lio/reactivex/rxjava3/disposables/e;

.field wip:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 3
    .line 4
    sput-object v1, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 5
    .line 6
    new-array v0, v0, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 7
    .line 8
    sput-object v0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

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

.method constructor <init>(Lio/reactivex/rxjava3/core/p0;Lm3/o;ZII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/p0<",
            "-TU;>;",
            "Lm3/o<",
            "-TT;+",
            "Lio/reactivex/rxjava3/core/n0<",
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
    iput-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->mapper:Lm3/o;

    .line 14
    .line 15
    iput-boolean p3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->delayErrors:Z

    .line 16
    .line 17
    iput p4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 18
    .line 19
    iput p5, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->bufferSize:I

    .line 20
    .line 21
    const p1, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-eq p4, p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-direct {p1, p4}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->sources:Ljava/util/Queue;

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    sget-object p2, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    return-void
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
.method addInner(Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
            "TT;TU;>;)Z"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 8
    .line 9
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->dispose()V

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
    new-array v3, v3, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 22
    .line 23
    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    aput-object p1, v3, v1

    .line 27
    .line 28
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

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

.method checkTerminate()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->disposed:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Throwable;

    .line 14
    .line 15
    iget-boolean v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->delayErrors:Z

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->disposeAll()Z

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 25
    .line 26
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    return v0
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

.method public dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->disposed:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->disposeAll()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateAndReport()V

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
.end method

.method disposeAll()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->CANCELLED:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    array-length v1, v0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    aget-object v3, v0, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->dispose()V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1
    return v2
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
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drainLoop()V

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
    .locals 13

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move v2, v1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->checkTerminate()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    iget-object v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 13
    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->checkTerminate()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-interface {v3}, Lio/reactivex/rxjava3/internal/fuseable/p;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v4, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    invoke-interface {v0, v4}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    :goto_1
    iget-boolean v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

    .line 35
    .line 36
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 37
    .line 38
    iget-object v5, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 45
    .line 46
    array-length v6, v5

    .line 47
    iget v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 48
    .line 49
    const v8, 0x7fffffff

    .line 50
    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    if-eq v7, v8, :cond_5

    .line 54
    .line 55
    monitor-enter p0

    .line 56
    :try_start_0
    iget-object v7, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->sources:Ljava/util/Queue;

    .line 57
    .line 58
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    monitor-exit p0

    .line 63
    goto :goto_2

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw v0

    .line 67
    :cond_5
    move v7, v9

    .line 68
    :goto_2
    if-eqz v3, :cond_7

    .line 69
    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    invoke-interface {v4}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    :cond_6
    if-nez v6, :cond_7

    .line 79
    .line 80
    if-nez v7, :cond_7

    .line 81
    .line 82
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 83
    .line 84
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lio/reactivex/rxjava3/internal/util/c;->tryTerminateConsumer(Lio/reactivex/rxjava3/core/p0;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_7
    if-eqz v6, :cond_11

    .line 91
    .line 92
    add-int/lit8 v3, v6, -0x1

    .line 93
    .line 94
    iget v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->lastIndex:I

    .line 95
    .line 96
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    move v4, v9

    .line 101
    move v7, v4

    .line 102
    :goto_3
    if-ge v4, v6, :cond_10

    .line 103
    .line 104
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->checkTerminate()Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_8

    .line 109
    .line 110
    return-void

    .line 111
    :cond_8
    aget-object v10, v5, v3

    .line 112
    .line 113
    iget-object v11, v10, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 114
    .line 115
    if-eqz v11, :cond_c

    .line 116
    .line 117
    :cond_9
    :try_start_1
    invoke-interface {v11}, Lio/reactivex/rxjava3/internal/fuseable/q;->poll()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    if-nez v12, :cond_a

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_a
    invoke-interface {v0, v12}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->checkTerminate()Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-eqz v12, :cond_9

    .line 132
    .line 133
    return-void

    .line 134
    :catchall_1
    move-exception v11

    .line 135
    invoke-static {v11}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10}, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->dispose()V

    .line 139
    .line 140
    .line 141
    iget-object v12, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 142
    .line 143
    invoke-virtual {v12, v11}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->checkTerminate()Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-eqz v11, :cond_b

    .line 151
    .line 152
    return-void

    .line 153
    :cond_b
    invoke-virtual {p0, v10}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->removeInner(Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)V

    .line 154
    .line 155
    .line 156
    add-int/lit8 v7, v7, 0x1

    .line 157
    .line 158
    add-int/lit8 v3, v3, 0x1

    .line 159
    .line 160
    if-ne v3, v6, :cond_f

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_c
    :goto_4
    iget-boolean v11, v10, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->done:Z

    .line 164
    .line 165
    iget-object v12, v10, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 166
    .line 167
    if-eqz v11, :cond_e

    .line 168
    .line 169
    if-eqz v12, :cond_d

    .line 170
    .line 171
    invoke-interface {v12}, Lio/reactivex/rxjava3/internal/fuseable/q;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    if-eqz v11, :cond_e

    .line 176
    .line 177
    :cond_d
    invoke-virtual {p0, v10}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->removeInner(Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v7, v7, 0x1

    .line 181
    .line 182
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    if-ne v3, v6, :cond_f

    .line 185
    .line 186
    :goto_5
    move v3, v9

    .line 187
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_10
    iput v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->lastIndex:I

    .line 191
    .line 192
    move v9, v7

    .line 193
    :cond_11
    if-eqz v9, :cond_13

    .line 194
    .line 195
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 196
    .line 197
    if-eq v3, v8, :cond_0

    .line 198
    .line 199
    :goto_6
    add-int/lit8 v3, v9, -0x1

    .line 200
    .line 201
    if-eqz v9, :cond_0

    .line 202
    .line 203
    monitor-enter p0

    .line 204
    :try_start_2
    iget-object v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->sources:Ljava/util/Queue;

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lio/reactivex/rxjava3/core/n0;

    .line 211
    .line 212
    if-nez v4, :cond_12

    .line 213
    .line 214
    iget v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 215
    .line 216
    sub-int/2addr v4, v1

    .line 217
    iput v4, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 218
    .line 219
    monitor-exit p0

    .line 220
    goto :goto_7

    .line 221
    :cond_12
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 222
    invoke-virtual {p0, v4}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->subscribeInner(Lio/reactivex/rxjava3/core/n0;)V

    .line 223
    .line 224
    .line 225
    :goto_7
    move v9, v3

    .line 226
    goto :goto_6

    .line 227
    :catchall_2
    move-exception v0

    .line 228
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 229
    throw v0

    .line 230
    :cond_13
    neg-int v2, v2

    .line 231
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_0

    .line 236
    .line 237
    return-void
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

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->disposed:Z

    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

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
    iput-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drain()V

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
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

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
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drain()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->done:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->mapper:Lm3/o;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lm3/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "The mapper returned a null ObservableSource"

    .line 13
    .line 14
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    check-cast p1, Lio/reactivex/rxjava3/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 20
    .line 21
    const v1, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    monitor-enter p0

    .line 27
    :try_start_1
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 28
    .line 29
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->sources:Ljava/util/Queue;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->subscribeInner(Lio/reactivex/rxjava3/core/n0;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_1
    move-exception p1

    .line 54
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 58
    .line 59
    invoke-interface {v0}, Lio/reactivex/rxjava3/disposables/e;->dispose()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->onError(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method public onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/rxjava3/internal/disposables/c;->validate(Lio/reactivex/rxjava3/disposables/e;Lio/reactivex/rxjava3/disposables/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->upstream:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lio/reactivex/rxjava3/core/p0;->onSubscribe(Lio/reactivex/rxjava3/disposables/e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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
.end method

.method removeInner(Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
            "TT;TU;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_2

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    if-ne v4, p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 v3, -0x1

    .line 23
    :goto_1
    if-gez v3, :cond_3

    .line 24
    .line 25
    return-void

    .line 26
    :cond_3
    const/4 v4, 0x1

    .line 27
    if-ne v1, v4, :cond_4

    .line 28
    .line 29
    sget-object v1, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->EMPTY:[Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_4
    add-int/lit8 v5, v1, -0x1

    .line 33
    .line 34
    new-array v5, v5, [Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 35
    .line 36
    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v3, 0x1

    .line 40
    .line 41
    sub-int/2addr v1, v3

    .line 42
    sub-int/2addr v1, v4

    .line 43
    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    move-object v1, v5

    .line 47
    :goto_2
    iget-object v2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->observers:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    invoke-static {v2, v0, v1}, Landroidx/compose/animation/core/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    return-void
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

.method subscribeInner(Lio/reactivex/rxjava3/core/n0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/core/n0<",
            "+TU;>;)V"
        }
    .end annotation

    .line 1
    :cond_0
    instance-of v0, p1, Lm3/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lm3/s;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->tryEmitScalar(Lm3/s;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    iget p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 14
    .line 15
    const v0, 0x7fffffff

    .line 16
    .line 17
    .line 18
    if-eq p1, v0, :cond_3

    .line 19
    .line 20
    monitor-enter p0

    .line 21
    :try_start_0
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->sources:Ljava/util/Queue;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lio/reactivex/rxjava3/core/n0;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    sub-int/2addr v0, v1

    .line 35
    iput v0, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->wip:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drain()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_2
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;

    .line 50
    .line 51
    iget-wide v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->uniqueId:J

    .line 52
    .line 53
    const-wide/16 v3, 0x1

    .line 54
    .line 55
    add-long/2addr v3, v1

    .line 56
    iput-wide v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->uniqueId:J

    .line 57
    .line 58
    invoke-direct {v0, p0, v1, v2}, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;-><init>(Lio/reactivex/rxjava3/internal/operators/observable/w0$b;J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->addInner(Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    invoke-interface {p1, v0}, Lio/reactivex/rxjava3/core/n0;->subscribe(Lio/reactivex/rxjava3/core/p0;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void
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

.method tryEmit(Ljava/lang/Object;Lio/reactivex/rxjava3/internal/operators/observable/w0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Lio/reactivex/rxjava3/internal/operators/observable/w0$a<",
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
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 16
    .line 17
    invoke-interface {p2, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p2, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lio/reactivex/rxjava3/internal/queue/c;

    .line 32
    .line 33
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->bufferSize:I

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p2, Lio/reactivex/rxjava3/internal/operators/observable/w0$a;->queue:Lio/reactivex/rxjava3/internal/fuseable/q;

    .line 39
    .line 40
    :cond_1
    invoke-interface {v0, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drainLoop()V

    .line 51
    .line 52
    .line 53
    return-void
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
.end method

.method tryEmitScalar(Lm3/s;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/s<",
            "+TU;>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-interface {p1}, Lm3/s;->get()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->downstream:Lio/reactivex/rxjava3/core/p0;

    .line 23
    .line 24
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/core/p0;->onNext(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_4

    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    iget v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 39
    .line 40
    const v3, 0x7fffffff

    .line 41
    .line 42
    .line 43
    if-ne v1, v3, :cond_2

    .line 44
    .line 45
    new-instance v1, Lio/reactivex/rxjava3/internal/queue/c;

    .line 46
    .line 47
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->bufferSize:I

    .line 48
    .line 49
    invoke-direct {v1, v3}, Lio/reactivex/rxjava3/internal/queue/c;-><init>(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v1, Lio/reactivex/rxjava3/internal/queue/b;

    .line 54
    .line 55
    iget v3, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->maxConcurrency:I

    .line 56
    .line 57
    invoke-direct {v1, v3}, Lio/reactivex/rxjava3/internal/queue/b;-><init>(I)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->queue:Lio/reactivex/rxjava3/internal/fuseable/p;

    .line 61
    .line 62
    :cond_3
    invoke-interface {v1, p1}, Lio/reactivex/rxjava3/internal/fuseable/q;->offer(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    return v2

    .line 72
    :cond_4
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drainLoop()V

    .line 73
    .line 74
    .line 75
    return v0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    invoke-static {p1}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->errors:Lio/reactivex/rxjava3/internal/util/c;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Lio/reactivex/rxjava3/internal/util/c;->tryAddThrowableOrReport(Ljava/lang/Throwable;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lio/reactivex/rxjava3/internal/operators/observable/w0$b;->drain()V

    .line 86
    .line 87
    .line 88
    return v0
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
.end method
