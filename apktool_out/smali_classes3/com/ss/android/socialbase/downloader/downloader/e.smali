.class public Lcom/ss/android/socialbase/downloader/downloader/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String; = "ResponseHandler"


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:J

.field private volatile E:J

.field private volatile F:J

.field a:Z

.field private final c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/ss/android/socialbase/downloader/model/b;

.field private final f:Lcom/ss/android/socialbase/downloader/network/i;

.field private g:Lcom/ss/android/socialbase/downloader/downloader/j;

.field private h:Lcom/ss/android/socialbase/downloader/impls/k;

.field private i:Lcom/ss/android/socialbase/downloader/downloader/t;

.field private j:Lcom/ss/android/socialbase/downloader/model/e;

.field private k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private volatile l:Z

.field private volatile m:Z

.field private final n:Lcom/ss/android/socialbase/downloader/h/f;

.field private o:J

.field private p:J

.field private volatile q:J

.field private volatile r:J

.field private final s:Z

.field private final t:Lcom/ss/android/socialbase/downloader/g/a;

.field private final u:Lcom/ss/android/socialbase/downloader/a/a;

.field private final v:Z

.field private final w:J

.field private final x:J

.field private final y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;Lcom/ss/android/socialbase/downloader/model/b;Lcom/ss/android/socialbase/downloader/h/f;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->a:Z

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->E:J

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->F:J

    .line 12
    .line 13
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->y()Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->g:Lcom/ss/android/socialbase/downloader/downloader/j;

    .line 22
    .line 23
    instance-of v3, p2, Lcom/ss/android/socialbase/downloader/impls/d;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast p2, Lcom/ss/android/socialbase/downloader/impls/d;

    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/impls/d;->a()Lcom/ss/android/socialbase/downloader/impls/k;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 34
    .line 35
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/impls/d;->f()Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->i:Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 40
    .line 41
    :cond_0
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 42
    .line 43
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    .line 44
    .line 45
    iput-object p5, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 46
    .line 47
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/b;->n()J

    .line 48
    .line 49
    .line 50
    move-result-wide p2

    .line 51
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 52
    .line 53
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 54
    .line 55
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/b;->q()J

    .line 62
    .line 63
    .line 64
    move-result-wide p2

    .line 65
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p4, v0}, Lcom/ss/android/socialbase/downloader/model/b;->c(Z)J

    .line 69
    .line 70
    .line 71
    move-result-wide p2

    .line 72
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 73
    .line 74
    :goto_0
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/b;->p()J

    .line 75
    .line 76
    .line 77
    move-result-wide p2

    .line 78
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->q:J

    .line 79
    .line 80
    invoke-static {}, Lcom/ss/android/socialbase/downloader/a/a;->a()Lcom/ss/android/socialbase/downloader/a/a;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->u:Lcom/ss/android/socialbase/downloader/a/a;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 95
    .line 96
    const-string p2, "sync_strategy"

    .line 97
    .line 98
    invoke-virtual {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    const/4 p3, 0x1

    .line 103
    if-ne p2, p3, :cond_2

    .line 104
    .line 105
    move p2, p3

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move p2, v0

    .line 108
    :goto_1
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->v:Z

    .line 109
    .line 110
    if-eqz p2, :cond_3

    .line 111
    .line 112
    const-string p2, "sync_interval_ms_fg"

    .line 113
    .line 114
    const/16 p4, 0x1388

    .line 115
    .line 116
    invoke-virtual {p1, p2, p4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    int-to-long p4, p2

    .line 121
    const-string p2, "sync_interval_ms_bg"

    .line 122
    .line 123
    const/16 v1, 0x3e8

    .line 124
    .line 125
    invoke-virtual {p1, p2, v1}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    int-to-long v1, p2

    .line 130
    const-wide/16 v3, 0x1f4

    .line 131
    .line 132
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide p4

    .line 136
    iput-wide p4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->w:J

    .line 137
    .line 138
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide p4

    .line 142
    iput-wide p4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->x:J

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_3
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->w:J

    .line 146
    .line 147
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->x:J

    .line 148
    .line 149
    :goto_2
    const-string p2, "monitor_rw"

    .line 150
    .line 151
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-ne p1, p3, :cond_4

    .line 156
    .line 157
    move v0, p3

    .line 158
    :cond_4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->y:Z

    .line 159
    .line 160
    const/high16 p1, 0x10000

    .line 161
    .line 162
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 167
    .line 168
    return-void
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

.method private a(Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/e/b;
    .locals 8

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->I()I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v2, "rw_concurrent"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 11
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    const-wide/32 v6, 0x1400000

    cmp-long v1, v4, v6

    if-lez v1, :cond_0

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    const-string v4, "rw_concurrent_max_buffer_count"

    const/4 v5, 0x4

    invoke-virtual {v1, v4, v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result v1

    .line 14
    :try_start_0
    new-instance v4, Lcom/ss/android/socialbase/downloader/e/a;

    invoke-direct {v4, p1, v0, v1}, Lcom/ss/android/socialbase/downloader/e/a;-><init>(Ljava/io/InputStream;II)V

    .line 15
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v4

    :catchall_0
    move-exception v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    :cond_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/e/c;

    invoke-direct {v1, p1, v0}, Lcom/ss/android/socialbase/downloader/e/c;-><init>(Ljava/io/InputStream;I)V

    .line 18
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->z:Z

    return-object v1
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/downloader/e;)Lcom/ss/android/socialbase/downloader/network/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    return-object p0
.end method

.method private a(Lcom/ss/android/socialbase/downloader/downloader/j;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    if-nez v7, :cond_0

    return-void

    .line 29
    :cond_0
    instance-of v8, v7, Lcom/ss/android/socialbase/downloader/b/e;

    if-eqz v8, :cond_1

    .line 30
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->b()Z

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/l;->a(Z)Lcom/ss/android/socialbase/downloader/downloader/m;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_1
    const/4 v1, 0x0

    :cond_2
    move-object v15, v1

    .line 31
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 32
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->e()Lcom/ss/android/socialbase/downloader/model/b;

    move-result-object v1

    goto :goto_0

    .line 33
    :cond_3
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    :goto_0
    move-object v5, v1

    if-eqz v5, :cond_8

    .line 34
    iget-wide v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    invoke-virtual {v5, v1, v2}, Lcom/ss/android/socialbase/downloader/model/b;->b(J)V

    if-eqz v8, :cond_4

    if-eqz v15, :cond_4

    .line 35
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v10

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v11

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v12

    iget-wide v13, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    move-object v9, v15

    invoke-interface/range {v9 .. v14}, Lcom/ss/android/socialbase/downloader/downloader/m;->a(IIIJ)V

    move-object v11, v5

    goto :goto_1

    .line 36
    :cond_4
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v2

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v3

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v4

    iget-wide v9, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    move-object/from16 v1, p1

    move-object v11, v5

    move-wide v5, v9

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIIJ)V

    .line 37
    :goto_1
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->h()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 38
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->i()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 39
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->j()J

    move-result-wide v1

    .line 40
    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    cmp-long v3, v1, v3

    if-lez v3, :cond_6

    if-eqz v8, :cond_5

    if-eqz v15, :cond_5

    .line 41
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v3

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v4

    invoke-interface {v15, v3, v4, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/m;->a(IIJ)V

    goto :goto_2

    .line 42
    :cond_5
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v3

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v4

    invoke-interface {v7, v3, v4, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIJ)V

    :goto_2
    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    if-nez v1, :cond_a

    if-eqz v8, :cond_7

    if-eqz v15, :cond_7

    .line 43
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    invoke-interface {v15, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/m;->a(IIJ)V

    goto :goto_4

    .line 44
    :cond_7
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/b;->b()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    invoke-interface {v7, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIJ)V

    goto :goto_4

    .line 45
    :cond_8
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->d()Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v8, :cond_9

    if-eqz v15, :cond_9

    .line 46
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    invoke-interface {v15, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/m;->a(IIJ)V

    goto :goto_4

    .line 47
    :cond_9
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    move-result v1

    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/b;->s()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    invoke-interface {v7, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IIJ)V

    :cond_a
    :goto_4
    return-void
.end method

.method private a(Z)V
    .locals 8

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 20
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->F:J

    sub-long v2, v0, v2

    .line 21
    iget-boolean v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->v:Z

    if-eqz v4, :cond_1

    .line 22
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->u:Lcom/ss/android/socialbase/downloader/a/a;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/a/a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->w:J

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->x:J

    :goto_0
    cmp-long p1, v2, v4

    if-lez p1, :cond_3

    .line 23
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 24
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->F:J

    goto :goto_1

    .line 25
    :cond_1
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    iget-wide v6, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->E:J

    sub-long/2addr v4, v6

    if-nez p1, :cond_2

    .line 26
    invoke-direct {p0, v4, v5, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/e;->b(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 27
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 28
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->F:J

    :cond_3
    :goto_1
    return-void
.end method

.method private b(JJ)Z
    .locals 2

    const-wide/32 v0, 0x10000

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const-wide/16 p1, 0x1f4

    cmp-long p1, p3, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->l()Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/e$1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/downloader/downloader/e$1;-><init>(Lcom/ss/android/socialbase/downloader/downloader/e;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method private h()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    :goto_0
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    :try_start_0
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 15
    .line 16
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/e;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    move v4, v3

    .line 20
    goto :goto_1

    .line 21
    :catch_0
    move v4, v2

    .line 22
    :goto_1
    if-eqz v4, :cond_5

    .line 23
    .line 24
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 25
    .line 26
    invoke-virtual {v4, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateRealDownloadTime(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 30
    .line 31
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-le v4, v3, :cond_1

    .line 36
    .line 37
    move v2, v3

    .line 38
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/i/f;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/l;->a(Z)Lcom/ss/android/socialbase/downloader/downloader/m;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->i:Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 51
    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 56
    .line 57
    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/m;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->i:Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 62
    .line 63
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    invoke-interface {v2, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    if-eqz v3, :cond_4

    .line 80
    .line 81
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 82
    .line 83
    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/m;->c(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->i:Lcom/ss/android/socialbase/downloader/downloader/t;

    .line 88
    .line 89
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/b;->k()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 96
    .line 97
    invoke-interface {v2, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/j;->a(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 98
    .line 99
    .line 100
    :goto_2
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 101
    .line 102
    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->E:J

    .line 103
    .line 104
    :cond_5
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->y:Z

    .line 105
    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    sub-long/2addr v2, v0

    .line 113
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->C:J

    .line 114
    .line 115
    add-long/2addr v0, v2

    .line 116
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->C:J

    .line 117
    .line 118
    :cond_6
    return-void
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
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    return-wide v0
.end method

.method public a(JJ)V
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->q:J

    .line 8
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    return-void
.end method

.method public a(JJJ)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 5
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->q:J

    .line 6
    iput-wide p5, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

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
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->g()V

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

.method public c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_0
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->g()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v1
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public d()V
    .locals 34
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_38

    .line 8
    .line 9
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_19

    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/network/g;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_37

    .line 26
    .line 27
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->e:Lcom/ss/android/socialbase/downloader/model/b;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/b;->l()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->y:Z

    .line 38
    .line 39
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 40
    .line 41
    instance-of v10, v0, Lcom/ss/android/socialbase/downloader/network/a;

    .line 42
    .line 43
    const/4 v14, 0x1

    .line 44
    :try_start_0
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 51
    .line 52
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 57
    .line 58
    const-string v5, "flush_buffer_size_byte"

    .line 59
    .line 60
    const/4 v13, -0x1

    .line 61
    invoke-virtual {v4, v5, v13}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v0, v12, v11, v4}, Lcom/ss/android/socialbase/downloader/i/f;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/e;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    .line 70
    .line 71
    :try_start_1
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 72
    .line 73
    invoke-virtual {v0, v4, v5}, Lcom/ss/android/socialbase/downloader/model/e;->a(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_e

    .line 74
    .line 75
    .line 76
    :try_start_2
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 77
    .line 78
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->a()Ljava/io/InputStream;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_1a

    .line 83
    .line 84
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateRealStartDownloadTime()V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/e/b;

    .line 90
    .line 91
    .line 92
    move-result-object v11
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    .line 93
    :try_start_3
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 94
    .line 95
    iget-boolean v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->z:Z

    .line 96
    .line 97
    invoke-virtual {v0, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setIsRwConcurrent(Z)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getOpenLimitSpeed()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iput-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->a:Z

    .line 107
    .line 108
    sget-wide v4, Lcom/ss/android/socialbase/downloader/constants/e;->d:J

    .line 109
    .line 110
    sget-wide v18, Lcom/ss/android/socialbase/downloader/constants/e;->e:J

    .line 111
    .line 112
    const-wide/16 v20, 0x3e8

    .line 113
    .line 114
    div-long v20, v20, v18

    .line 115
    .line 116
    div-long v4, v4, v20

    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v20

    .line 122
    const-wide/16 v22, 0x0

    .line 123
    .line 124
    const-wide/16 v24, 0x0

    .line 125
    .line 126
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->f()Z

    .line 127
    .line 128
    .line 129
    move-result v0
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 133
    .line 134
    if-eqz v0, :cond_1

    .line 135
    .line 136
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 137
    .line 138
    .line 139
    :cond_1
    if-eqz v11, :cond_2

    .line 140
    .line 141
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 142
    .line 143
    .line 144
    :cond_2
    :try_start_4
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 149
    .line 150
    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 151
    :try_start_5
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 152
    .line 153
    if-nez v0, :cond_3

    .line 154
    .line 155
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 156
    .line 157
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 161
    .line 162
    if-eqz v0, :cond_3

    .line 163
    .line 164
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 165
    .line 166
    .line 167
    :cond_3
    monitor-exit v2

    .line 168
    goto :goto_1

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 171
    :try_start_6
    throw v0

    .line 172
    :cond_4
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 173
    .line 174
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 178
    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 182
    .line 183
    .line 184
    :cond_5
    :goto_1
    new-array v0, v14, [Ljava/io/Closeable;

    .line 185
    .line 186
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 187
    .line 188
    const/4 v3, 0x0

    .line 189
    aput-object v2, v0, v3

    .line 190
    .line 191
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    sub-long/2addr v2, v8

    .line 199
    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 200
    .line 201
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 202
    .line 203
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 204
    .line 205
    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 208
    .line 209
    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 210
    .line 211
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 212
    .line 213
    move/from16 v29, v15

    .line 214
    .line 215
    move v15, v0

    .line 216
    :goto_2
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 217
    .line 218
    move-object/from16 v16, v0

    .line 219
    .line 220
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 221
    .line 222
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 223
    .line 224
    sub-long v17, v2, v4

    .line 225
    .line 226
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 227
    .line 228
    move-wide/from16 v19, v2

    .line 229
    .line 230
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->A:J

    .line 231
    .line 232
    move-wide/from16 v22, v2

    .line 233
    .line 234
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->B:J

    .line 235
    .line 236
    move-wide/from16 v24, v2

    .line 237
    .line 238
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->C:J

    .line 239
    .line 240
    move-wide/from16 v26, v2

    .line 241
    .line 242
    const/16 v28, 0x0

    .line 243
    .line 244
    move/from16 v21, v29

    .line 245
    .line 246
    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :catchall_1
    move-exception v0

    .line 251
    new-array v2, v14, [Ljava/io/Closeable;

    .line 252
    .line 253
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 254
    .line 255
    const/4 v4, 0x0

    .line 256
    aput-object v3, v2, v4

    .line 257
    .line 258
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_6
    move/from16 v29, v15

    .line 263
    .line 264
    if-eqz v29, :cond_7

    .line 265
    .line 266
    :try_start_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 267
    .line 268
    .line 269
    move-result-wide v22

    .line 270
    :cond_7
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->a()Lcom/ss/android/socialbase/downloader/f/a;

    .line 271
    .line 272
    .line 273
    move-result-object v0
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    .line 274
    if-eqz v29, :cond_8

    .line 275
    .line 276
    :try_start_8
    iget-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->A:J

    .line 277
    .line 278
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 279
    .line 280
    .line 281
    move-result-wide v27

    .line 282
    sub-long v27, v27, v22

    .line 283
    .line 284
    add-long v14, v14, v27

    .line 285
    .line 286
    iput-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->A:J

    .line 287
    .line 288
    :cond_8
    iget v12, v0, Lcom/ss/android/socialbase/downloader/f/a;->c:I

    .line 289
    .line 290
    if-ne v12, v13, :cond_9

    .line 291
    .line 292
    move-wide/from16 v30, v2

    .line 293
    .line 294
    move-wide/from16 v32, v6

    .line 295
    .line 296
    goto/16 :goto_5

    .line 297
    .line 298
    :cond_9
    iget-object v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 299
    .line 300
    invoke-virtual {v14}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    if-nez v14, :cond_b

    .line 305
    .line 306
    iget-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 307
    .line 308
    move-wide/from16 v30, v14

    .line 309
    .line 310
    iget-wide v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J
    :try_end_8
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 311
    .line 312
    move-wide/from16 v32, v6

    .line 313
    .line 314
    :try_start_9
    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 315
    .line 316
    sub-long/2addr v13, v6

    .line 317
    cmp-long v6, v30, v13

    .line 318
    .line 319
    if-lez v6, :cond_a

    .line 320
    .line 321
    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 322
    .line 323
    iget-wide v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 324
    .line 325
    move-wide/from16 v30, v2

    .line 326
    .line 327
    :try_start_a
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 328
    .line 329
    sub-long/2addr v13, v2

    .line 330
    int-to-long v2, v12

    .line 331
    add-long/2addr v13, v2

    .line 332
    cmp-long v2, v6, v13

    .line 333
    .line 334
    if-gez v2, :cond_c

    .line 335
    .line 336
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 337
    .line 338
    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 339
    .line 340
    iget-wide v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 341
    .line 342
    sub-long/2addr v6, v12

    .line 343
    sub-long/2addr v2, v6

    .line 344
    long-to-int v12, v2

    .line 345
    goto :goto_3

    .line 346
    :cond_a
    move-wide/from16 v30, v2

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :catchall_2
    move-exception v0

    .line 350
    move-wide/from16 v30, v2

    .line 351
    .line 352
    goto/16 :goto_9

    .line 353
    .line 354
    :cond_b
    move-wide/from16 v30, v2

    .line 355
    .line 356
    move-wide/from16 v32, v6

    .line 357
    .line 358
    :cond_c
    :goto_3
    if-eqz v29, :cond_d

    .line 359
    .line 360
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 361
    .line 362
    .line 363
    move-result-wide v2

    .line 364
    move-wide/from16 v22, v2

    .line 365
    .line 366
    :cond_d
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 367
    .line 368
    iget-object v3, v0, Lcom/ss/android/socialbase/downloader/f/a;->a:[B
    :try_end_a
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 369
    .line 370
    const/4 v6, 0x0

    .line 371
    :try_start_b
    invoke-virtual {v2, v3, v6, v12}, Lcom/ss/android/socialbase/downloader/model/e;->a([BII)V
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 372
    .line 373
    .line 374
    if-eqz v29, :cond_e

    .line 375
    .line 376
    :try_start_c
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->B:J

    .line 377
    .line 378
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 379
    .line 380
    .line 381
    move-result-wide v6

    .line 382
    sub-long v6, v6, v22

    .line 383
    .line 384
    add-long/2addr v2, v6

    .line 385
    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->B:J

    .line 386
    .line 387
    :cond_e
    invoke-interface {v11, v0}, Lcom/ss/android/socialbase/downloader/e/b;->a(Lcom/ss/android/socialbase/downloader/f/a;)V

    .line 388
    .line 389
    .line 390
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 391
    .line 392
    int-to-long v6, v12

    .line 393
    add-long/2addr v2, v6

    .line 394
    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 395
    .line 396
    add-long v24, v24, v6

    .line 397
    .line 398
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 399
    .line 400
    monitor-enter v2
    :try_end_c
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 401
    :try_start_d
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 402
    .line 403
    if-eqz v0, :cond_f

    .line 404
    .line 405
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 406
    .line 407
    if-nez v0, :cond_10

    .line 408
    .line 409
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 410
    .line 411
    invoke-interface {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/h/f;->b(J)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 416
    .line 417
    invoke-direct {v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 418
    .line 419
    .line 420
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Z)V

    .line 421
    .line 422
    .line 423
    goto :goto_4

    .line 424
    :cond_f
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 425
    .line 426
    invoke-interface {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/h/f;->b(J)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 431
    .line 432
    invoke-direct {v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 433
    .line 434
    .line 435
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Z)V

    .line 436
    .line 437
    .line 438
    :cond_10
    :goto_4
    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 439
    :try_start_e
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 440
    .line 441
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadWithWifiValid()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_19

    .line 446
    .line 447
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 448
    .line 449
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveWithWifiValid()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_18

    .line 454
    .line 455
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 456
    .line 457
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-nez v0, :cond_15

    .line 462
    .line 463
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 464
    .line 465
    const-wide/16 v6, 0x0

    .line 466
    .line 467
    cmp-long v0, v2, v6

    .line 468
    .line 469
    if-ltz v0, :cond_15

    .line 470
    .line 471
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 472
    .line 473
    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 474
    .line 475
    iget-wide v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J
    :try_end_e
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 476
    .line 477
    sub-long/2addr v6, v12

    .line 478
    cmp-long v0, v2, v6

    .line 479
    .line 480
    if-gtz v0, :cond_15

    .line 481
    .line 482
    :goto_5
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 483
    .line 484
    if-eqz v0, :cond_11

    .line 485
    .line 486
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 487
    .line 488
    .line 489
    :cond_11
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 490
    .line 491
    .line 492
    :try_start_f
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 493
    .line 494
    if-eqz v0, :cond_13

    .line 495
    .line 496
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 497
    .line 498
    monitor-enter v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 499
    :try_start_10
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 500
    .line 501
    if-nez v0, :cond_12

    .line 502
    .line 503
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 504
    .line 505
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 506
    .line 507
    .line 508
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 509
    .line 510
    if-eqz v0, :cond_12

    .line 511
    .line 512
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 513
    .line 514
    .line 515
    :cond_12
    monitor-exit v2

    .line 516
    goto :goto_6

    .line 517
    :catchall_3
    move-exception v0

    .line 518
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 519
    :try_start_11
    throw v0

    .line 520
    :cond_13
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 521
    .line 522
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 523
    .line 524
    .line 525
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 526
    .line 527
    if-eqz v0, :cond_14

    .line 528
    .line 529
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 530
    .line 531
    .line 532
    :cond_14
    :goto_6
    const/4 v2, 0x1

    .line 533
    new-array v0, v2, [Ljava/io/Closeable;

    .line 534
    .line 535
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 536
    .line 537
    const/4 v4, 0x0

    .line 538
    aput-object v3, v0, v4

    .line 539
    .line 540
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 541
    .line 542
    .line 543
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 544
    .line 545
    .line 546
    move-result-wide v5

    .line 547
    sub-long/2addr v5, v8

    .line 548
    iput-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 549
    .line 550
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 551
    .line 552
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 553
    .line 554
    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 555
    .line 556
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 557
    .line 558
    move v3, v4

    .line 559
    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 560
    .line 561
    move v6, v2

    .line 562
    goto/16 :goto_13

    .line 563
    .line 564
    :catchall_4
    move-exception v0

    .line 565
    const/4 v3, 0x0

    .line 566
    const/4 v6, 0x1

    .line 567
    new-array v2, v6, [Ljava/io/Closeable;

    .line 568
    .line 569
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 570
    .line 571
    aput-object v4, v2, v3

    .line 572
    .line 573
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 574
    .line 575
    .line 576
    throw v0

    .line 577
    :cond_15
    const/4 v3, 0x0

    .line 578
    const/4 v6, 0x1

    .line 579
    :try_start_12
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->a:Z

    .line 580
    .line 581
    if-eqz v0, :cond_17

    .line 582
    .line 583
    cmp-long v0, v24, v4

    .line 584
    .line 585
    if-lez v0, :cond_17

    .line 586
    .line 587
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 588
    .line 589
    .line 590
    move-result-wide v12
    :try_end_12
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 591
    sub-long v12, v12, v20

    .line 592
    .line 593
    cmp-long v0, v12, v18

    .line 594
    .line 595
    if-gez v0, :cond_16

    .line 596
    .line 597
    sub-long v12, v18, v12

    .line 598
    .line 599
    :try_start_13
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_13} :catch_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 600
    .line 601
    .line 602
    goto :goto_7

    .line 603
    :catch_0
    move-exception v0

    .line 604
    move-object v2, v0

    .line 605
    :try_start_14
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 606
    .line 607
    .line 608
    :cond_16
    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 609
    .line 610
    .line 611
    move-result-wide v12

    .line 612
    move-wide/from16 v20, v12

    .line 613
    .line 614
    const-wide/16 v24, 0x0

    .line 615
    .line 616
    :cond_17
    move v14, v6

    .line 617
    move/from16 v15, v29

    .line 618
    .line 619
    move-wide/from16 v2, v30

    .line 620
    .line 621
    move-wide/from16 v6, v32

    .line 622
    .line 623
    const/4 v13, -0x1

    .line 624
    goto/16 :goto_0

    .line 625
    .line 626
    :cond_18
    const/4 v3, 0x0

    .line 627
    const/4 v6, 0x1

    .line 628
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/e;

    .line 629
    .line 630
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/e;-><init>()V

    .line 631
    .line 632
    .line 633
    throw v0

    .line 634
    :cond_19
    const/4 v3, 0x0

    .line 635
    const/4 v6, 0x1

    .line 636
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/c;

    .line 637
    .line 638
    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/c;-><init>()V

    .line 639
    .line 640
    .line 641
    throw v0
    :try_end_14
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_14 .. :try_end_14} :catch_1
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 642
    :catchall_5
    move-exception v0

    .line 643
    const/4 v3, 0x0

    .line 644
    const/4 v6, 0x1

    .line 645
    :goto_8
    :try_start_15
    monitor-exit v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 646
    :try_start_16
    throw v0
    :try_end_16
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_16 .. :try_end_16} :catch_1
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 647
    :catchall_6
    move-exception v0

    .line 648
    goto/16 :goto_f

    .line 649
    .line 650
    :catch_1
    move-exception v0

    .line 651
    goto/16 :goto_16

    .line 652
    .line 653
    :catchall_7
    move-exception v0

    .line 654
    goto :goto_8

    .line 655
    :catchall_8
    move-exception v0

    .line 656
    move v3, v6

    .line 657
    goto :goto_a

    .line 658
    :catch_2
    move-exception v0

    .line 659
    move v3, v6

    .line 660
    goto :goto_b

    .line 661
    :catchall_9
    move-exception v0

    .line 662
    goto :goto_9

    .line 663
    :catchall_a
    move-exception v0

    .line 664
    move-wide/from16 v30, v2

    .line 665
    .line 666
    move-wide/from16 v32, v6

    .line 667
    .line 668
    :goto_9
    const/4 v3, 0x0

    .line 669
    :goto_a
    const/4 v6, 0x1

    .line 670
    goto/16 :goto_f

    .line 671
    .line 672
    :catch_3
    move-exception v0

    .line 673
    const/4 v3, 0x0

    .line 674
    :goto_b
    const/4 v6, 0x1

    .line 675
    goto/16 :goto_16

    .line 676
    .line 677
    :catchall_b
    move-exception v0

    .line 678
    move-wide/from16 v30, v2

    .line 679
    .line 680
    move-wide/from16 v32, v6

    .line 681
    .line 682
    move v6, v14

    .line 683
    goto :goto_c

    .line 684
    :catch_4
    move-exception v0

    .line 685
    move v6, v14

    .line 686
    goto :goto_d

    .line 687
    :catchall_c
    move-exception v0

    .line 688
    move-wide/from16 v30, v2

    .line 689
    .line 690
    move-wide/from16 v32, v6

    .line 691
    .line 692
    move v6, v14

    .line 693
    move/from16 v29, v15

    .line 694
    .line 695
    :goto_c
    const/4 v3, 0x0

    .line 696
    goto :goto_f

    .line 697
    :catch_5
    move-exception v0

    .line 698
    move v6, v14

    .line 699
    move/from16 v29, v15

    .line 700
    .line 701
    :goto_d
    const/4 v3, 0x0

    .line 702
    goto/16 :goto_16

    .line 703
    .line 704
    :cond_1a
    move-wide/from16 v30, v2

    .line 705
    .line 706
    move-wide/from16 v32, v6

    .line 707
    .line 708
    move v6, v14

    .line 709
    move/from16 v29, v15

    .line 710
    .line 711
    const/4 v3, 0x0

    .line 712
    :try_start_17
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 713
    .line 714
    new-instance v2, Ljava/io/IOException;

    .line 715
    .line 716
    const-string v4, "inputStream is null"

    .line 717
    .line 718
    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    const/16 v4, 0x412

    .line 722
    .line 723
    invoke-direct {v0, v4, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 724
    .line 725
    .line 726
    throw v0

    .line 727
    :catch_6
    move-exception v0

    .line 728
    move-wide/from16 v30, v2

    .line 729
    .line 730
    move-wide/from16 v32, v6

    .line 731
    .line 732
    move v6, v14

    .line 733
    move/from16 v29, v15

    .line 734
    .line 735
    const/4 v3, 0x0

    .line 736
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 737
    .line 738
    const/16 v4, 0x41e

    .line 739
    .line 740
    invoke-direct {v2, v4, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    .line 741
    .line 742
    .line 743
    throw v2
    :try_end_17
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 744
    :catchall_d
    move-exception v0

    .line 745
    goto :goto_e

    .line 746
    :catch_7
    move-exception v0

    .line 747
    goto/16 :goto_15

    .line 748
    .line 749
    :catchall_e
    move-exception v0

    .line 750
    move-wide/from16 v30, v2

    .line 751
    .line 752
    move-wide/from16 v32, v6

    .line 753
    .line 754
    move v6, v14

    .line 755
    move/from16 v29, v15

    .line 756
    .line 757
    const/4 v3, 0x0

    .line 758
    :goto_e
    const/4 v11, 0x0

    .line 759
    :goto_f
    if-eqz v10, :cond_1b

    .line 760
    .line 761
    :try_start_18
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 762
    .line 763
    check-cast v2, Lcom/ss/android/socialbase/downloader/network/a;

    .line 764
    .line 765
    invoke-virtual {v2, v0}, Lcom/ss/android/socialbase/downloader/network/a;->a(Ljava/lang/Throwable;)V

    .line 766
    .line 767
    .line 768
    :cond_1b
    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/e;->b:Ljava/lang/String;

    .line 769
    .line 770
    new-instance v4, Ljava/lang/StringBuilder;

    .line 771
    .line 772
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 773
    .line 774
    .line 775
    const-string v5, "handleResponse: e = "

    .line 776
    .line 777
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v4

    .line 787
    invoke-static {v2, v4}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->f()Z

    .line 791
    .line 792
    .line 793
    move-result v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_15

    .line 794
    if-eqz v2, :cond_21

    .line 795
    .line 796
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 797
    .line 798
    if-eqz v0, :cond_1c

    .line 799
    .line 800
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 801
    .line 802
    .line 803
    :cond_1c
    if-eqz v11, :cond_1d

    .line 804
    .line 805
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 806
    .line 807
    .line 808
    :cond_1d
    :try_start_19
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 809
    .line 810
    if-eqz v0, :cond_1f

    .line 811
    .line 812
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 813
    .line 814
    monitor-enter v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 815
    :try_start_1a
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 816
    .line 817
    if-nez v0, :cond_1e

    .line 818
    .line 819
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 820
    .line 821
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 822
    .line 823
    .line 824
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 825
    .line 826
    if-eqz v0, :cond_1e

    .line 827
    .line 828
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 829
    .line 830
    .line 831
    :cond_1e
    monitor-exit v2

    .line 832
    goto :goto_10

    .line 833
    :catchall_f
    move-exception v0

    .line 834
    monitor-exit v2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    .line 835
    :try_start_1b
    throw v0

    .line 836
    :cond_1f
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 837
    .line 838
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 842
    .line 843
    if-eqz v0, :cond_20

    .line 844
    .line 845
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 846
    .line 847
    .line 848
    :cond_20
    :goto_10
    new-array v0, v6, [Ljava/io/Closeable;

    .line 849
    .line 850
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 851
    .line 852
    aput-object v2, v0, v3

    .line 853
    .line 854
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 855
    .line 856
    .line 857
    :goto_11
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 858
    .line 859
    .line 860
    move-result-wide v2

    .line 861
    sub-long/2addr v2, v8

    .line 862
    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 863
    .line 864
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 865
    .line 866
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 867
    .line 868
    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 869
    .line 870
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 871
    .line 872
    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 873
    .line 874
    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 875
    .line 876
    goto/16 :goto_2

    .line 877
    .line 878
    :catchall_10
    move-exception v0

    .line 879
    new-array v2, v6, [Ljava/io/Closeable;

    .line 880
    .line 881
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 882
    .line 883
    aput-object v4, v2, v3

    .line 884
    .line 885
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 886
    .line 887
    .line 888
    throw v0

    .line 889
    :cond_21
    :try_start_1c
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    if-eqz v2, :cond_22

    .line 894
    .line 895
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_15

    .line 896
    .line 897
    .line 898
    :cond_22
    :try_start_1d
    const-string v2, "ResponseHandler"

    .line 899
    .line 900
    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_1d
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1d .. :try_end_1d} :catch_8
    .catchall {:try_start_1d .. :try_end_1d} :catchall_15

    .line 901
    .line 902
    .line 903
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 904
    .line 905
    if-eqz v0, :cond_23

    .line 906
    .line 907
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 908
    .line 909
    .line 910
    :cond_23
    if-eqz v11, :cond_24

    .line 911
    .line 912
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 913
    .line 914
    .line 915
    :cond_24
    :try_start_1e
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 916
    .line 917
    if-eqz v0, :cond_26

    .line 918
    .line 919
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 920
    .line 921
    monitor-enter v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_12

    .line 922
    :try_start_1f
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 923
    .line 924
    if-nez v0, :cond_25

    .line 925
    .line 926
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 927
    .line 928
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 929
    .line 930
    .line 931
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 932
    .line 933
    if-eqz v0, :cond_25

    .line 934
    .line 935
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 936
    .line 937
    .line 938
    :cond_25
    monitor-exit v2

    .line 939
    goto :goto_12

    .line 940
    :catchall_11
    move-exception v0

    .line 941
    monitor-exit v2
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_11

    .line 942
    :try_start_20
    throw v0

    .line 943
    :cond_26
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 944
    .line 945
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 946
    .line 947
    .line 948
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 949
    .line 950
    if-eqz v0, :cond_27

    .line 951
    .line 952
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_12

    .line 953
    .line 954
    .line 955
    :cond_27
    :goto_12
    new-array v0, v6, [Ljava/io/Closeable;

    .line 956
    .line 957
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 958
    .line 959
    aput-object v2, v0, v3

    .line 960
    .line 961
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 962
    .line 963
    .line 964
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 965
    .line 966
    .line 967
    move-result-wide v4

    .line 968
    sub-long/2addr v4, v8

    .line 969
    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 970
    .line 971
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 972
    .line 973
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 974
    .line 975
    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 976
    .line 977
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 978
    .line 979
    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 980
    .line 981
    :goto_13
    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 982
    .line 983
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 984
    .line 985
    move-object/from16 v16, v0

    .line 986
    .line 987
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 988
    .line 989
    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 990
    .line 991
    sub-long v17, v4, v7

    .line 992
    .line 993
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 994
    .line 995
    move-wide/from16 v19, v4

    .line 996
    .line 997
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->A:J

    .line 998
    .line 999
    move-wide/from16 v22, v4

    .line 1000
    .line 1001
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->B:J

    .line 1002
    .line 1003
    move-wide/from16 v24, v4

    .line 1004
    .line 1005
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->C:J

    .line 1006
    .line 1007
    move-wide/from16 v26, v4

    .line 1008
    .line 1009
    const/16 v28, 0x0

    .line 1010
    .line 1011
    move/from16 v21, v29

    .line 1012
    .line 1013
    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    .line 1014
    .line 1015
    .line 1016
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 1017
    .line 1018
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    if-eqz v0, :cond_28

    .line 1023
    .line 1024
    return-void

    .line 1025
    :cond_28
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 1026
    .line 1027
    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 1028
    .line 1029
    sub-long/2addr v4, v7

    .line 1030
    const-wide/16 v7, 0x0

    .line 1031
    .line 1032
    cmp-long v0, v4, v7

    .line 1033
    .line 1034
    if-ltz v0, :cond_2a

    .line 1035
    .line 1036
    iget-wide v9, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 1037
    .line 1038
    cmp-long v0, v9, v7

    .line 1039
    .line 1040
    if-ltz v0, :cond_2a

    .line 1041
    .line 1042
    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 1043
    .line 1044
    cmp-long v0, v7, v4

    .line 1045
    .line 1046
    if-nez v0, :cond_29

    .line 1047
    .line 1048
    goto :goto_14

    .line 1049
    :cond_29
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 1050
    .line 1051
    const-string v2, "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"

    .line 1052
    .line 1053
    const/4 v7, 0x7

    .line 1054
    new-array v7, v7, [Ljava/lang/Object;

    .line 1055
    .line 1056
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v4

    .line 1060
    aput-object v4, v7, v3

    .line 1061
    .line 1062
    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    aput-object v3, v7, v6

    .line 1067
    .line 1068
    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->r:J

    .line 1069
    .line 1070
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v3

    .line 1074
    const/4 v4, 0x2

    .line 1075
    aput-object v3, v7, v4

    .line 1076
    .line 1077
    const/4 v3, 0x3

    .line 1078
    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    aput-object v4, v7, v3

    .line 1083
    .line 1084
    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->q:J

    .line 1085
    .line 1086
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v3

    .line 1090
    const/4 v4, 0x4

    .line 1091
    aput-object v3, v7, v4

    .line 1092
    .line 1093
    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 1094
    .line 1095
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v3

    .line 1099
    const/4 v4, 0x5

    .line 1100
    aput-object v3, v7, v4

    .line 1101
    .line 1102
    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 1103
    .line 1104
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v3

    .line 1108
    const/4 v4, 0x6

    .line 1109
    aput-object v3, v7, v4

    .line 1110
    .line 1111
    invoke-static {v2, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    const/16 v3, 0x41b

    .line 1116
    .line 1117
    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    throw v0

    .line 1121
    :cond_2a
    :goto_14
    return-void

    .line 1122
    :catchall_12
    move-exception v0

    .line 1123
    new-array v2, v6, [Ljava/io/Closeable;

    .line 1124
    .line 1125
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1126
    .line 1127
    aput-object v4, v2, v3

    .line 1128
    .line 1129
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 1130
    .line 1131
    .line 1132
    throw v0

    .line 1133
    :catch_8
    move-exception v0

    .line 1134
    :try_start_21
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 1135
    .line 1136
    throw v0

    .line 1137
    :catch_9
    move-exception v0

    .line 1138
    move v6, v14

    .line 1139
    move/from16 v29, v15

    .line 1140
    .line 1141
    const/4 v3, 0x0

    .line 1142
    :goto_15
    const/4 v11, 0x0

    .line 1143
    :goto_16
    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/e;->b:Ljava/lang/String;

    .line 1144
    .line 1145
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1148
    .line 1149
    .line 1150
    const-string v5, "handleResponse: BaseException e = "

    .line 1151
    .line 1152
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v4

    .line 1162
    invoke-static {v2, v4}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 1166
    .line 1167
    const-string v4, "ignore_base_ex_on_stop_status"

    .line 1168
    .line 1169
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v2

    .line 1173
    if-eqz v2, :cond_30

    .line 1174
    .line 1175
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->f()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v2
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_15

    .line 1179
    if-eqz v2, :cond_30

    .line 1180
    .line 1181
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 1182
    .line 1183
    if-eqz v0, :cond_2b

    .line 1184
    .line 1185
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 1186
    .line 1187
    .line 1188
    :cond_2b
    if-eqz v11, :cond_2c

    .line 1189
    .line 1190
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 1191
    .line 1192
    .line 1193
    :cond_2c
    :try_start_22
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 1194
    .line 1195
    if-eqz v0, :cond_2e

    .line 1196
    .line 1197
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 1198
    .line 1199
    monitor-enter v2
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_14

    .line 1200
    :try_start_23
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 1201
    .line 1202
    if-nez v0, :cond_2d

    .line 1203
    .line 1204
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 1205
    .line 1206
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1210
    .line 1211
    if-eqz v0, :cond_2d

    .line 1212
    .line 1213
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 1214
    .line 1215
    .line 1216
    :cond_2d
    monitor-exit v2

    .line 1217
    goto :goto_17

    .line 1218
    :catchall_13
    move-exception v0

    .line 1219
    monitor-exit v2
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_13

    .line 1220
    :try_start_24
    throw v0

    .line 1221
    :cond_2e
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 1222
    .line 1223
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1227
    .line 1228
    if-eqz v0, :cond_2f

    .line 1229
    .line 1230
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_14

    .line 1231
    .line 1232
    .line 1233
    :cond_2f
    :goto_17
    new-array v0, v6, [Ljava/io/Closeable;

    .line 1234
    .line 1235
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1236
    .line 1237
    aput-object v2, v0, v3

    .line 1238
    .line 1239
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 1240
    .line 1241
    .line 1242
    goto/16 :goto_11

    .line 1243
    .line 1244
    :catchall_14
    move-exception v0

    .line 1245
    new-array v2, v6, [Ljava/io/Closeable;

    .line 1246
    .line 1247
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1248
    .line 1249
    aput-object v4, v2, v3

    .line 1250
    .line 1251
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 1252
    .line 1253
    .line 1254
    throw v0

    .line 1255
    :cond_30
    :try_start_25
    invoke-static {}, Lcom/ss/android/socialbase/downloader/c/a;->a()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v2

    .line 1259
    if-eqz v2, :cond_31

    .line 1260
    .line 1261
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1262
    .line 1263
    .line 1264
    :cond_31
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 1265
    .line 1266
    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_15

    .line 1267
    :catchall_15
    move-exception v0

    .line 1268
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 1269
    .line 1270
    if-eqz v2, :cond_32

    .line 1271
    .line 1272
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/network/i;->d()V

    .line 1273
    .line 1274
    .line 1275
    :cond_32
    if-eqz v11, :cond_33

    .line 1276
    .line 1277
    invoke-interface {v11}, Lcom/ss/android/socialbase/downloader/e/b;->b()V

    .line 1278
    .line 1279
    .line 1280
    :cond_33
    :try_start_26
    iget-boolean v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->s:Z

    .line 1281
    .line 1282
    if-eqz v2, :cond_35

    .line 1283
    .line 1284
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->n:Lcom/ss/android/socialbase/downloader/h/f;

    .line 1285
    .line 1286
    monitor-enter v2
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_17

    .line 1287
    :try_start_27
    iget-boolean v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 1288
    .line 1289
    if-nez v4, :cond_34

    .line 1290
    .line 1291
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 1292
    .line 1293
    invoke-direct {v1, v4}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 1294
    .line 1295
    .line 1296
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1297
    .line 1298
    if-eqz v4, :cond_34

    .line 1299
    .line 1300
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V

    .line 1301
    .line 1302
    .line 1303
    :cond_34
    monitor-exit v2

    .line 1304
    goto :goto_18

    .line 1305
    :catchall_16
    move-exception v0

    .line 1306
    monitor-exit v2
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_16

    .line 1307
    :try_start_28
    throw v0

    .line 1308
    :cond_35
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->h:Lcom/ss/android/socialbase/downloader/impls/k;

    .line 1309
    .line 1310
    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/e;->a(Lcom/ss/android/socialbase/downloader/downloader/j;)V

    .line 1311
    .line 1312
    .line 1313
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1314
    .line 1315
    if-eqz v2, :cond_36

    .line 1316
    .line 1317
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/e;->h()V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_17

    .line 1318
    .line 1319
    .line 1320
    :cond_36
    :goto_18
    new-array v2, v6, [Ljava/io/Closeable;

    .line 1321
    .line 1322
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1323
    .line 1324
    aput-object v4, v2, v3

    .line 1325
    .line 1326
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1330
    .line 1331
    .line 1332
    move-result-wide v2

    .line 1333
    sub-long/2addr v2, v8

    .line 1334
    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 1335
    .line 1336
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->t:Lcom/ss/android/socialbase/downloader/g/a;

    .line 1337
    .line 1338
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->c:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 1339
    .line 1340
    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->d:Ljava/lang/String;

    .line 1341
    .line 1342
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->f:Lcom/ss/android/socialbase/downloader/network/i;

    .line 1343
    .line 1344
    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->l:Z

    .line 1345
    .line 1346
    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->m:Z

    .line 1347
    .line 1348
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->k:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 1349
    .line 1350
    move-object/from16 v16, v2

    .line 1351
    .line 1352
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->o:J

    .line 1353
    .line 1354
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->p:J

    .line 1355
    .line 1356
    sub-long v17, v2, v4

    .line 1357
    .line 1358
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->D:J

    .line 1359
    .line 1360
    move-wide/from16 v19, v2

    .line 1361
    .line 1362
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->A:J

    .line 1363
    .line 1364
    move-wide/from16 v22, v2

    .line 1365
    .line 1366
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->B:J

    .line 1367
    .line 1368
    move-wide/from16 v24, v2

    .line 1369
    .line 1370
    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->C:J

    .line 1371
    .line 1372
    move-wide/from16 v26, v2

    .line 1373
    .line 1374
    const/16 v28, 0x0

    .line 1375
    .line 1376
    move/from16 v21, v29

    .line 1377
    .line 1378
    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/i;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    .line 1379
    .line 1380
    .line 1381
    throw v0

    .line 1382
    :catchall_17
    move-exception v0

    .line 1383
    new-array v2, v6, [Ljava/io/Closeable;

    .line 1384
    .line 1385
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/e;->j:Lcom/ss/android/socialbase/downloader/model/e;

    .line 1386
    .line 1387
    aput-object v4, v2, v3

    .line 1388
    .line 1389
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/i/f;->a([Ljava/io/Closeable;)V

    .line 1390
    .line 1391
    .line 1392
    throw v0

    .line 1393
    :cond_37
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/f;

    .line 1394
    .line 1395
    const/16 v2, 0x3ec

    .line 1396
    .line 1397
    const-string v3, "the content-length is 0"

    .line 1398
    .line 1399
    invoke-direct {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/f;-><init>(ILjava/lang/String;)V

    .line 1400
    .line 1401
    .line 1402
    throw v0

    .line 1403
    :cond_38
    :goto_19
    return-void
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/e;->E:J

    return-wide v0
.end method
