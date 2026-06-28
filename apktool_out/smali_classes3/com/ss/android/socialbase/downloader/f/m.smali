.class Lcom/ss/android/socialbase/downloader/f/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private A:Ljava/lang/Thread;

.field private volatile B:Z

.field private C:I

.field private D:I

.field private E:I

.field private F:J

.field private G:I

.field private H:Z

.field private I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private J:Z

.field private K:Z

.field private L:Lcom/ss/android/socialbase/downloader/i/e;

.field volatile a:Lcom/ss/android/socialbase/downloader/f/i;

.field b:Lcom/ss/android/socialbase/downloader/f/q;

.field final c:I

.field volatile d:J

.field volatile e:J

.field volatile f:J

.field volatile g:J

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field private final k:Lcom/ss/android/socialbase/downloader/f/f;

.field private final l:Lcom/ss/android/socialbase/downloader/f/c;

.field private final m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private final n:Lcom/ss/android/socialbase/downloader/g/a;

.field private o:Lcom/ss/android/socialbase/downloader/network/i;

.field private p:Lcom/ss/android/socialbase/downloader/model/d;

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;"
        }
    .end annotation
.end field

.field private r:J

.field private volatile s:J

.field private volatile t:J

.field private volatile u:J

.field private volatile v:J

.field private w:Ljava/util/concurrent/Future;

.field private volatile x:Z

.field private volatile y:Z

.field private volatile z:Z


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/k;Lcom/ss/android/socialbase/downloader/f/c;Lcom/ss/android/socialbase/downloader/f/q;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->q:Ljava/util/List;

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 14
    .line 15
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 18
    .line 19
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/f/m;->l:Lcom/ss/android/socialbase/downloader/f/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 32
    .line 33
    iput p5, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 34
    .line 35
    return-void
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

.method private a(Lcom/ss/android/socialbase/downloader/f/c;Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/f/a;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v0

    const/4 v1, -0x1

    .line 48
    :try_start_0
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->a:[B

    invoke-virtual {p2, v2}, Ljava/io/InputStream;->read([B)I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eq p2, v1, :cond_1

    .line 49
    :try_start_1
    iput p2, v0, Lcom/ss/android/socialbase/downloader/f/a;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p2, v1, :cond_0

    .line 50
    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    :cond_0
    return-object v0

    :catchall_0
    move-exception v2

    goto :goto_0

    .line 51
    :cond_1
    :try_start_2
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "probe"

    const/16 v4, 0x431

    invoke-direct {v2, v4, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception v2

    move p2, v1

    :goto_0
    if-ne p2, v1, :cond_2

    .line 52
    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    :cond_2
    throw v2
.end method

.method private a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 2

    .line 40
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/f;->c(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget-object p1, p1, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    .line 42
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "https"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 43
    :cond_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedHttpsToHttpRetry()Z

    move-result p1

    if-nez p1, :cond_2

    return v0

    .line 44
    :cond_2
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->H:Z

    if-eqz p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->H:Z

    .line 46
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->l()V

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method private a(Lcom/ss/android/socialbase/downloader/f/i;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->k()V

    .line 2
    :goto_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/m;->b(Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/m;->d(Lcom/ss/android/socialbase/downloader/f/i;)V
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/f/j; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->i()V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception v0

    :try_start_1
    const-string v1, "SegmentReader"

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download: e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", threadIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", reconnect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", closed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->i()V

    return v2

    .line 8
    :cond_0
    :try_start_2
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v3, "download"

    if-eqz v1, :cond_2

    .line 9
    :try_start_3
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->y:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 10
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 11
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    :goto_1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->z:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-nez v0, :cond_1

    .line 13
    :goto_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->i()V

    goto :goto_0

    .line 14
    :cond_1
    :try_start_6
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->z:Z

    .line 15
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 v0, 0x5

    invoke-direct {p1, v0, v3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw p1

    .line 16
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-eqz v1, :cond_3

    .line 18
    check-cast v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_3

    .line 19
    :cond_3
    :try_start_7
    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/4 v0, 0x0

    goto :goto_3

    :catch_0
    move-exception v0

    :goto_3
    if-eqz v0, :cond_4

    .line 20
    :try_start_8
    invoke-direct {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/f/m;->a(Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v0, :cond_4

    goto :goto_2

    .line 21
    :cond_4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->i()V

    return v2

    :catch_1
    move-exception p1

    .line 22
    :try_start_9
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 23
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception p1

    .line 24
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->i()V

    throw p1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 8

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleDownloadFailed:  e = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", curRetryCount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->E:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retryCount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->D:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SegmentReader"

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 34
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/q;->b()V

    .line 35
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget v6, p0, Lcom/ss/android/socialbase/downloader/f/m;->E:I

    iget v7, p0, Lcom/ss/android/socialbase/downloader/f/m;->D:I

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-interface/range {v1 .. v7}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;II)V

    .line 36
    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->E:I

    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->D:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    add-int/2addr v0, v2

    .line 37
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->E:I

    return v2

    .line 38
    :cond_0
    invoke-direct {p0, p2}, Lcom/ss/android/socialbase/downloader/f/m;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    invoke-interface {v0, p0, v1, p1, p2}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    const/4 p1, 0x0

    return p1
.end method

.method private b(Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/m;->c(Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->p:Lcom/ss/android/socialbase/downloader/model/d;

    invoke-interface {v0, p0, p1, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/model/d;)V

    .line 3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/q;->c()V

    return-void
.end method

.method private c(Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, ", threadIndex = "

    const-string v3, ", ip = "

    const-string v4, "https"

    const-string v5, "SegmentReader"

    const-string v6, "createConn"

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    .line 2
    iput-wide v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->e:J

    .line 3
    iput-wide v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v11

    iput-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->r:J

    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v11

    iput-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->t:J

    .line 6
    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->t:J

    cmp-long v9, v11, v9

    if-lez v9, :cond_1

    iget-wide v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->r:J

    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->t:J

    cmp-long v9, v9, v11

    if-gtz v9, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v2, Lcom/ss/android/socialbase/downloader/f/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "createConn, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x6

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v2

    .line 8
    :cond_1
    :goto_0
    new-instance v9, Lcom/ss/android/socialbase/downloader/i/e;

    invoke-direct {v9}, Lcom/ss/android/socialbase/downloader/i/e;-><init>()V

    iput-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->L:Lcom/ss/android/socialbase/downloader/i/e;

    .line 9
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtraHeaders()Ljava/util/List;

    move-result-object v10

    .line 10
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v11

    iget-wide v12, v1, Lcom/ss/android/socialbase/downloader/f/m;->r:J

    iget-wide v14, v1, Lcom/ss/android/socialbase/downloader/f/m;->t:J

    invoke-static/range {v10 .. v15}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Ljava/lang/String;JJ)Ljava/util/List;

    move-result-object v9

    .line 11
    new-instance v10, Lcom/ss/android/socialbase/downloader/model/c;

    const-string v11, "Segment-Index"

    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/i;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance v10, Lcom/ss/android/socialbase/downloader/model/c;

    const-string v11, "Thread-Index"

    iget v12, v1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Lcom/ss/android/socialbase/downloader/model/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v9, v10}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 14
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v9, v10}, Lcom/ss/android/socialbase/downloader/i/f;->b(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 15
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget-object v10, v10, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    .line 16
    iget-boolean v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->H:Z

    if-eqz v11, :cond_2

    .line 17
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2

    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2

    const-string v11, "http"

    .line 18
    invoke-virtual {v10, v4, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 19
    :cond_2
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget-object v4, v4, Lcom/ss/android/socialbase/downloader/f/q;->b:Ljava/lang/String;

    .line 20
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "createConnectionBegin: url = "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ", segment = "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iput-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->h:Ljava/lang/String;

    .line 22
    iput-object v4, v1, Lcom/ss/android/socialbase/downloader/f/m;->i:Ljava/lang/String;

    .line 23
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 24
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedDefaultHttpServiceBackUp()Z

    move-result v16

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMaxBytes()I

    move-result v17

    const/16 v21, 0x0

    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->F:J

    sub-long/2addr v7, v11

    const-wide/16 v11, 0xbb8

    cmp-long v0, v7, v11

    if-lez v0, :cond_3

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v7, "monitor_download_connect"

    .line 25
    invoke-virtual {v0, v7}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    move/from16 v22, v0

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-object/from16 v18, v10

    move-object/from16 v19, v4

    move-object/from16 v20, v9

    move-object/from16 v23, v0

    .line 26
    invoke-static/range {v16 .. v23}, Lcom/ss/android/socialbase/downloader/downloader/c;->a(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/i;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 27
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    .line 28
    new-instance v7, Lcom/ss/android/socialbase/downloader/model/d;

    invoke-direct {v7, v10, v0}, Lcom/ss/android/socialbase/downloader/model/d;-><init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;)V

    iput-object v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->p:Lcom/ss/android/socialbase/downloader/model/d;

    .line 29
    iget-boolean v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v7, :cond_5

    .line 30
    instance-of v7, v0, Lcom/ss/android/socialbase/downloader/network/a;

    if-eqz v7, :cond_4

    .line 31
    check-cast v0, Lcom/ss/android/socialbase/downloader/network/a;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/a;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    .line 32
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "createConnectionSuccess: url = "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", hostRealIp = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 33
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/p;

    invoke-direct {v0, v6}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "download can\'t continue, chunk connection is null"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x3fe

    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    .line 35
    :try_start_1
    invoke-static {v0, v6}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/f/m;->e:J

    return-void

    :catch_0
    move-exception v0

    .line 37
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/f/m;->e:J

    throw v0
.end method

.method private d(Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 31
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->l:Lcom/ss/android/socialbase/downloader/f/c;

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v4

    const/4 v6, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 4
    :try_start_0
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->a()Ljava/io/InputStream;

    move-result-object v10
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    if-eqz v10, :cond_19

    .line 5
    :try_start_1
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->p:Lcom/ss/android/socialbase/downloader/model/d;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/d;->h()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v0, v11, v13

    if-eqz v0, :cond_18

    .line 6
    invoke-direct {v1, v3, v10}, Lcom/ss/android/socialbase/downloader/f/m;->a(Lcom/ss/android/socialbase/downloader/f/c;Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v15
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 7
    :try_start_2
    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-nez v9, :cond_17

    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v9, :cond_17

    .line 8
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    invoke-interface {v9, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 9
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    invoke-interface {v9, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->d(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)Lcom/ss/android/socialbase/downloader/f/e;

    move-result-object v9
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 10
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v17

    cmp-long v19, v17, v13

    const-wide v20, 0x7fffffffffffffffL

    const-wide/16 v22, 0x1

    if-lez v19, :cond_0

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    add-long/2addr v11, v4

    sub-long v17, v11, v22

    goto :goto_0

    :cond_1
    move-wide/from16 v17, v20

    .line 11
    :goto_0
    iget v0, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    int-to-long v11, v0

    add-long v13, v4, v11

    cmp-long v19, v13, v17

    if-lez v19, :cond_7

    add-long v17, v17, v22

    cmp-long v19, v13, v17

    if-lez v19, :cond_2

    sub-long v19, v13, v17

    sub-long v11, v11, v19

    long-to-int v11, v11

    if-lez v11, :cond_2

    if-ge v11, v0, :cond_2

    .line 12
    :try_start_4
    iput v11, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    move-wide/from16 v13, v17

    .line 13
    :cond_2
    iput-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 14
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_4
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    new-array v0, v7, [Ljava/io/Closeable;

    aput-object v10, v0, v8

    .line 15
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 16
    :try_start_5
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 17
    :try_start_6
    iput v6, v0, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 18
    invoke-interface {v9, v0}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_0
    const/4 v9, 0x0

    goto :goto_1

    :catchall_1
    move-object v9, v0

    :goto_1
    if-eqz v9, :cond_3

    .line 19
    invoke-interface {v3, v9}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 20
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    cmp-long v0, v13, v4

    if-lez v0, :cond_6

    .line 21
    iget-object v15, v1, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->h:Ljava/lang/String;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->i:Ljava/lang/String;

    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    iget-boolean v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v10, :cond_5

    iget-boolean v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-eqz v10, :cond_4

    goto :goto_2

    :cond_4
    move/from16 v20, v8

    goto :goto_3

    :cond_5
    :goto_2
    move/from16 v20, v7

    :goto_3
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    sub-long v23, v13, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    iget-wide v12, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    sub-long/2addr v10, v12

    .line 22
    invoke-virtual {v4, v10, v11}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v25

    move-object/from16 v16, v0

    move-object/from16 v17, v3

    move-object/from16 v18, v6

    move-object/from16 v19, v9

    move-object/from16 v21, v7

    move-object/from16 v22, v8

    .line 23
    invoke-static/range {v15 .. v26}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;JJ)V

    .line 24
    :cond_6
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    return-void

    .line 25
    :cond_7
    :try_start_7
    iput-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 26
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    move-wide/from16 v11, v17

    .line 27
    :goto_4
    :try_start_8
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->B:Z
    :try_end_8
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    if-eqz v0, :cond_c

    .line 28
    :try_start_9
    monitor-enter p0
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 29
    :try_start_a
    iput-boolean v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->B:Z

    .line 30
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-nez v0, :cond_b

    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v0, :cond_b

    .line 31
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 32
    :try_start_b
    iget-object v15, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    monitor-enter v15
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 33
    :try_start_c
    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->s:J

    const-wide/16 v24, 0x0

    cmp-long v0, v7, v24

    if-eqz v0, :cond_a

    const-string v0, "SegmentReader"

    .line 34
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "loopAndRead:  change readEnd = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", segmentNewEndOffset = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->s:J

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", segment = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/f/m;->m()J

    move-result-wide v11

    cmp-long v0, v13, v11

    if-lez v0, :cond_9

    add-long v7, v11, v22

    move-wide/from16 v26, v11

    sub-long v11, v13, v7

    const-wide/16 v22, 0x0

    cmp-long v0, v11, v22

    if-lez v0, :cond_8

    const-string v0, "SegmentReader"

    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loopAndRead: redundant = "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 37
    :cond_8
    :try_start_d
    iput-wide v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 38
    monitor-exit v15
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    move-wide v13, v7

    move-wide/from16 v11, v26

    goto :goto_7

    :catchall_2
    move-exception v0

    move-wide v13, v7

    goto :goto_5

    :cond_9
    move-wide/from16 v26, v11

    .line 39
    :cond_a
    :try_start_e
    monitor-exit v15

    goto :goto_6

    :catchall_3
    move-exception v0

    :goto_5
    monitor-exit v15
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :try_start_f
    throw v0
    :try_end_f
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 40
    :cond_b
    :try_start_10
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/p;

    const-string v2, "loopAndRead"

    invoke-direct {v0, v2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_4
    move-exception v0

    .line 41
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :try_start_11
    throw v0

    .line 42
    :cond_c
    :goto_6
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v15
    :try_end_11
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 43
    :try_start_12
    iget-object v0, v15, Lcom/ss/android/socialbase/downloader/f/a;->a:[B

    invoke-virtual {v10, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .line 44
    iput v0, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_d

    .line 45
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    goto :goto_8

    :cond_d
    int-to-long v6, v0

    add-long/2addr v13, v6

    cmp-long v2, v13, v11

    if-lez v2, :cond_16

    add-long v22, v11, v22

    cmp-long v2, v13, v22

    if-lez v2, :cond_e

    sub-long v26, v13, v22

    sub-long v6, v6, v26

    long-to-int v2, v6

    if-lez v2, :cond_e

    if-ge v2, v0, :cond_e

    .line 46
    iput v2, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    move-wide/from16 v13, v22

    .line 47
    :cond_e
    iput-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 48
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_12
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_12 .. :try_end_12} :catch_0
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    :try_start_13
    const-string v0, "SegmentReader"

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "loopAndRead: bytesRead = "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long v6, v13, v4

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", url = "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    iget-object v6, v6, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    const-wide/16 v6, 0x0

    :goto_8
    cmp-long v0, v11, v6

    if-lez v0, :cond_10

    cmp-long v0, v11, v20

    if-eqz v0, :cond_10

    cmp-long v0, v13, v11

    if-lez v0, :cond_f

    goto :goto_9

    .line 50
    :cond_f
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v2, "range[%d, %d] , but readCurrent[%d] , readStart[%d]"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    .line 51
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x1

    aput-object v7, v6, v8

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x2

    aput-object v7, v6, v8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x3

    aput-object v7, v6, v8

    .line 52
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0x41b

    invoke-direct {v0, v6, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_13
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :cond_10
    :goto_9
    const/4 v2, 0x1

    new-array v0, v2, [Ljava/io/Closeable;

    const/4 v2, 0x0

    aput-object v10, v0, v2

    .line 53
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    if-eqz v9, :cond_11

    .line 54
    :try_start_14
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    const/4 v2, -0x1

    .line 55
    :try_start_15
    iput v2, v0, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 56
    invoke-interface {v9, v0}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    goto :goto_a

    :catchall_5
    move-object v9, v0

    goto :goto_b

    :catchall_6
    :cond_11
    :goto_a
    const/4 v9, 0x0

    :goto_b
    if-eqz v9, :cond_12

    .line 57
    invoke-interface {v3, v9}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 58
    :cond_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    cmp-long v0, v13, v4

    if-lez v0, :cond_15

    .line 59
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->h:Ljava/lang/String;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->i:Ljava/lang/String;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    iget-boolean v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v8, :cond_14

    iget-boolean v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-eqz v8, :cond_13

    goto :goto_c

    :cond_13
    const/16 v24, 0x0

    goto :goto_d

    :cond_14
    :goto_c
    const/16 v24, 0x1

    :goto_d
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    sub-long v27, v13, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    iget-wide v12, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    sub-long/2addr v10, v12

    .line 60
    invoke-virtual {v4, v10, v11}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v29

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v6

    move-object/from16 v23, v7

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    .line 61
    invoke-static/range {v19 .. v30}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;JJ)V

    .line 62
    :cond_15
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    move-object/from16 v2, p1

    goto/16 :goto_13

    :cond_16
    move-object/from16 v2, p1

    const-wide/16 v6, 0x0

    .line 63
    :try_start_16
    iput-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 64
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_16
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_16 .. :try_end_16} :catch_3
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    const/4 v6, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    goto/16 :goto_4

    :catchall_7
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_f

    :catch_0
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_15

    :catchall_8
    move-exception v0

    move-object/from16 v2, p1

    goto :goto_e

    :catch_1
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_14

    :catchall_9
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    goto/16 :goto_14

    :catchall_a
    move-exception v0

    goto :goto_f

    :catch_3
    move-exception v0

    goto/16 :goto_15

    :catchall_b
    move-exception v0

    move-wide v13, v4

    goto :goto_f

    :catch_4
    move-exception v0

    move-wide v13, v4

    goto/16 :goto_15

    .line 65
    :cond_17
    :try_start_17
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/p;

    const-string v6, "probe"

    invoke-direct {v0, v6}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_17
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_17 .. :try_end_17} :catch_5
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    :catchall_c
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    goto :goto_f

    :catch_5
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    goto/16 :goto_15

    .line 66
    :cond_18
    :try_start_18
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "the content-length is 0, contentLength = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x3ec

    invoke-direct {v0, v7, v6}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    throw v0

    :catchall_d
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    goto :goto_e

    :catch_6
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    goto/16 :goto_14

    .line 67
    :cond_19
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v6, Ljava/io/IOException;

    const-string v7, "inputStream is null"

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/16 v7, 0x412

    invoke-direct {v0, v7, v6}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
    :try_end_18
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_18 .. :try_end_18} :catch_6
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :catchall_e
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_e
    const/4 v15, 0x0

    :goto_f
    :try_start_19
    const-string v6, "SegmentReader"

    .line 68
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "loopAndRead: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ",stack = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    :try_start_1a
    const-string v6, "loopAndRead"

    .line 70
    invoke-static {v0, v6}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1a
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1a .. :try_end_1a} :catch_7
    .catchall {:try_start_1a .. :try_end_1a} :catchall_10

    const/4 v6, 0x1

    new-array v0, v6, [Ljava/io/Closeable;

    const/4 v6, 0x0

    aput-object v10, v0, v6

    .line 71
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    if-eqz v9, :cond_1b

    if-nez v15, :cond_1a

    .line 72
    :try_start_1b
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v15

    :cond_1a
    const/4 v6, -0x1

    .line 73
    iput v6, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 74
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_f

    const/4 v9, 0x0

    goto :goto_10

    :catchall_f
    :cond_1b
    move-object v9, v15

    :goto_10
    if-eqz v9, :cond_1c

    .line 75
    invoke-interface {v3, v9}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 76
    :cond_1c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    cmp-long v0, v13, v4

    if-lez v0, :cond_1f

    .line 77
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->h:Ljava/lang/String;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->i:Ljava/lang/String;

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v9, :cond_1e

    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-eqz v9, :cond_1d

    goto :goto_11

    :cond_1d
    const/16 v24, 0x0

    goto :goto_12

    :cond_1e
    :goto_11
    const/16 v24, 0x1

    :goto_12
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    sub-long v27, v13, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    iget-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    sub-long/2addr v11, v13

    .line 78
    invoke-virtual {v4, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v29

    move-object/from16 v19, v0

    move-object/from16 v20, v3

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    .line 79
    invoke-static/range {v19 .. v30}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;JJ)V

    .line 80
    :cond_1f
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    :goto_13
    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    return-void

    :catch_7
    move-exception v0

    .line 81
    :try_start_1c
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 82
    throw v0

    :catch_8
    move-exception v0

    move-wide v13, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_14
    const/4 v15, 0x0

    .line 83
    :goto_15
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 84
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_10

    :catchall_10
    move-exception v0

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/io/Closeable;

    const/4 v8, 0x0

    aput-object v10, v7, v8

    .line 85
    invoke-static {v7}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    if-eqz v9, :cond_21

    if-nez v15, :cond_20

    .line 86
    :try_start_1d
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/f/c;->b()Lcom/ss/android/socialbase/downloader/f/a;

    move-result-object v15

    :cond_20
    const/4 v7, -0x1

    .line 87
    iput v7, v15, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 88
    invoke-interface {v9, v15}, Lcom/ss/android/socialbase/downloader/f/e;->b(Lcom/ss/android/socialbase/downloader/f/a;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_11

    const/4 v9, 0x0

    goto :goto_16

    :catchall_11
    :cond_21
    move-object v9, v15

    :goto_16
    if-eqz v9, :cond_22

    .line 89
    invoke-interface {v3, v9}, Lcom/ss/android/socialbase/downloader/f/c;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 90
    :cond_22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    cmp-long v3, v13, v4

    if-lez v3, :cond_25

    .line 91
    iget-object v15, v1, Lcom/ss/android/socialbase/downloader/f/m;->n:Lcom/ss/android/socialbase/downloader/g/a;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/f/m;->h:Ljava/lang/String;

    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/f/m;->i:Ljava/lang/String;

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/f/m;->j:Ljava/lang/String;

    iget-boolean v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    if-nez v11, :cond_24

    iget-boolean v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    if-eqz v11, :cond_23

    goto :goto_17

    :cond_23
    move/from16 v20, v8

    goto :goto_18

    :cond_24
    :goto_17
    move/from16 v20, v6

    :goto_18
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    sub-long v23, v13, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    iget-wide v13, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    sub-long/2addr v11, v13

    .line 92
    invoke-virtual {v4, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v25

    move-object/from16 v16, v3

    move-object/from16 v17, v7

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v21, v6

    move-object/from16 v22, v8

    .line 93
    invoke-static/range {v15 .. v26}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;JJ)V

    .line 94
    :cond_25
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    invoke-interface {v3, v1, v2}, Lcom/ss/android/socialbase/downloader/f/f;->c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    throw v0
.end method

.method private i()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->F:J

    .line 4
    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->e:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->g:J

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->j()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->o:Lcom/ss/android/socialbase/downloader/network/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v1, "SegmentReader"

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "closeConnection: thread = "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v1, v2}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/g;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_0
    return-void
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

.method private k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->H:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->l()V

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

.method private l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/ss/android/socialbase/downloader/f/q;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlRetryCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->D:I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->E:I

    .line 24
    .line 25
    return-void
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

.method private m()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->s:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->s:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    const-wide v0, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :cond_0
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method a(JJ)J
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->L:Lcom/ss/android/socialbase/downloader/i/e;

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    .line 76
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/i/e;->b(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method a()V
    .locals 6

    .line 56
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 57
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    :try_start_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/m;->c()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    .line 59
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->v:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->v:J

    .line 60
    invoke-virtual {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/f/q;->a(J)V

    :cond_0
    const-wide/16 v2, -0x1

    .line 61
    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 62
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :goto_0
    return-void
.end method

.method a(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->w:Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Z)V
    .locals 3

    const-string v0, "SegmentReader"

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reconnect: threadIndex = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    monitor-enter p0

    .line 65
    :try_start_0
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->z:Z

    const/4 p1, 0x1

    .line 66
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->y:Z

    .line 67
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->B:Z

    .line 68
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->j()V

    .line 70
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->A:Ljava/lang/Thread;

    if-eqz p1, :cond_0

    :try_start_1
    const-string v0, "SegmentReader"

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reconnect: t.interrupt threadIndex = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_0
    return-void

    :catchall_1
    move-exception p1

    .line 73
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public a(J)Z
    .locals 6

    .line 53
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->t:J

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    const/4 v5, 0x0

    if-gtz v4, :cond_0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return v5

    :cond_0
    cmp-long v4, p1, v0

    if-lez v4, :cond_1

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    return v5

    .line 54
    :cond_1
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->s:J

    const/4 p1, 0x1

    .line 55
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->B:Z

    return p1
.end method

.method a(Lcom/ss/android/socialbase/downloader/f/q;)Z
    .locals 2

    .line 25
    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->G:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 26
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->G:I

    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/f/q;->b(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 29
    :cond_1
    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/downloader/f/q;->a(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 30
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 31
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->l()V

    return v1
.end method

.method public b()J
    .locals 5

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->v:J

    .line 6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/m;->c()J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 7
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method b(J)V
    .locals 5

    .line 10
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 11
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->L:Lcom/ss/android/socialbase/downloader/i/e;

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-ltz v3, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "markProgress: curSegmentReadOffset = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", threadIndex = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "SegmentReader"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {v2, v0, v1, p1, p2}, Lcom/ss/android/socialbase/downloader/i/e;->a(JJ)Z

    :cond_1
    :goto_0
    return-void
.end method

.method b(Z)V
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->J:Z

    return-void
.end method

.method public c()J
    .locals 8

    .line 39
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    monitor-enter v0

    .line 40
    :try_start_0
    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    .line 41
    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->r:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_0

    cmp-long v7, v1, v3

    if-lez v7, :cond_0

    sub-long/2addr v1, v3

    .line 42
    monitor-exit v0

    return-wide v1

    .line 43
    :cond_0
    monitor-exit v0

    return-wide v5

    :catchall_0
    move-exception v1

    .line 44
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/m;->K:Z

    return-void
.end method

.method public d()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->u:J

    return-wide v0
.end method

.method public e()V
    .locals 3

    .line 1
    const-string v0, "SegmentReader"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "close: threadIndex = "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    monitor-enter p0

    .line 26
    const/4 v0, 0x1

    .line 27
    :try_start_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->B:Z

    .line 30
    .line 31
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/m;->j()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->w:Ljava/util/concurrent/Future;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->w:Ljava/util/concurrent/Future;

    .line 41
    .line 42
    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_0
    return-void

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    throw v0
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

.method public f()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/f/m;->a(Z)V

    return-void
.end method

.method g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->J:Z

    return v0
.end method

.method h()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->r:J

    return-wide v0
.end method

.method public run()V
    .locals 6

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->A:Ljava/lang/Thread;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 14
    .line 15
    invoke-interface {v1, p0}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Lcom/ss/android/socialbase/downloader/f/q;->a(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 26
    .line 27
    invoke-interface {v1, p0, v2}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    const-string v2, "SegmentReader"

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "no more segment, thread_index = "

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v2, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_0
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    :try_start_2
    invoke-direct {p0, v1}, Lcom/ss/android/socialbase/downloader/f/m;->a(Lcom/ss/android/socialbase/downloader/f/i;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->q:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/f/j; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 73
    .line 74
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 75
    .line 76
    :goto_1
    invoke-interface {v2, p0, v1}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    :try_start_4
    iget-boolean v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->x:Z

    .line 81
    .line 82
    if-nez v3, :cond_2

    .line 83
    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v4, "download segment failed, segment = "

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v4, ", thread_index = "

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v4, ", failedException = "

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->I:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 113
    .line 114
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Lcom/ss/android/socialbase/downloader/f/j; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    .line 123
    .line 124
    :cond_2
    :try_start_5
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 125
    .line 126
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 127
    .line 128
    :goto_2
    invoke-interface {v2, p0, v1}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catchall_0
    move-exception v2

    .line 133
    goto :goto_4

    .line 134
    :catch_0
    move-exception v3

    .line 135
    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v5, "run: SegmentApplyException, e = "

    .line 141
    .line 142
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->C:I

    .line 156
    .line 157
    const/16 v4, 0x32

    .line 158
    .line 159
    if-lt v3, v4, :cond_3

    .line 160
    .line 161
    new-instance v3, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v4, "segment apply failed "

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->C:I

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v4, "times, thread_index = "

    .line 177
    .line 178
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    iget v4, p0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 182
    .line 183
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 191
    .line 192
    .line 193
    :try_start_7
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 194
    .line 195
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :goto_3
    :try_start_8
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 199
    .line 200
    invoke-virtual {v1, p0}, Lcom/ss/android/socialbase/downloader/f/q;->b(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 201
    .line 202
    .line 203
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 207
    .line 208
    :try_start_9
    iput v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->C:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 209
    .line 210
    :try_start_a
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 211
    .line 212
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :goto_4
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 217
    .line 218
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 219
    .line 220
    invoke-interface {v3, p0, v1}, Lcom/ss/android/socialbase/downloader/f/f;->a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 221
    .line 222
    .line 223
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 224
    :catchall_1
    move-exception v1

    .line 225
    :try_start_b
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 226
    .line 227
    .line 228
    :try_start_c
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 229
    .line 230
    invoke-virtual {v1, p0}, Lcom/ss/android/socialbase/downloader/f/q;->b(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 234
    .line 235
    :goto_5
    invoke-interface {v1, p0}, Lcom/ss/android/socialbase/downloader/f/f;->b(Lcom/ss/android/socialbase/downloader/f/m;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 236
    .line 237
    .line 238
    :catchall_2
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->A:Ljava/lang/Thread;

    .line 239
    .line 240
    return-void

    .line 241
    :catchall_3
    move-exception v1

    .line 242
    :try_start_d
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    .line 243
    .line 244
    invoke-virtual {v2, p0}, Lcom/ss/android/socialbase/downloader/f/q;->b(Lcom/ss/android/socialbase/downloader/f/m;)V

    .line 245
    .line 246
    .line 247
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/m;->k:Lcom/ss/android/socialbase/downloader/f/f;

    .line 248
    .line 249
    invoke-interface {v2, p0}, Lcom/ss/android/socialbase/downloader/f/f;->b(Lcom/ss/android/socialbase/downloader/f/m;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 250
    .line 251
    .line 252
    :catchall_4
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/f/m;->A:Ljava/lang/Thread;

    .line 253
    .line 254
    throw v1
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
