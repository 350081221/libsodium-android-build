.class public Lcom/uyumao/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uyumao/r;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/uyumao/r;


# direct methods
.method public constructor <init>(Lcom/uyumao/r;Landroid/content/Context;IILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    iput-object p2, p0, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    iput p3, p0, Lcom/uyumao/r$a;->b:I

    iput p4, p0, Lcom/uyumao/r$a;->c:I

    iput-object p5, p0, Lcom/uyumao/r$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    new-instance v0, Ljava/util/TreeSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 12
    .line 13
    .line 14
    const/16 v4, 0xbb

    .line 15
    .line 16
    :try_start_1
    new-array v5, v4, [B

    .line 17
    .line 18
    const/16 v6, 0x12

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    aput-byte v6, v5, v7

    .line 22
    .line 23
    const/16 v6, -0x77

    .line 24
    .line 25
    const/4 v8, 0x1

    .line 26
    aput-byte v6, v5, v8

    .line 27
    .line 28
    const/16 v6, 0x1f

    .line 29
    .line 30
    const/4 v9, 0x2

    .line 31
    aput-byte v6, v5, v9

    .line 32
    .line 33
    const/4 v10, 0x3

    .line 34
    const/16 v11, 0x16

    .line 35
    .line 36
    aput-byte v11, v5, v10

    .line 37
    .line 38
    const/4 v10, 0x4

    .line 39
    const/16 v11, 0x8

    .line 40
    .line 41
    aput-byte v11, v5, v10

    .line 42
    .line 43
    const/16 v10, 0x2d

    .line 44
    .line 45
    const/4 v12, 0x5

    .line 46
    aput-byte v10, v5, v12

    .line 47
    .line 48
    const/4 v10, 0x6

    .line 49
    aput-byte v11, v5, v10

    .line 50
    .line 51
    const/4 v10, 0x7

    .line 52
    const/16 v13, 0x1a

    .line 53
    .line 54
    aput-byte v13, v5, v10

    .line 55
    .line 56
    aput-byte v12, v5, v11

    .line 57
    .line 58
    const/16 v10, 0x9

    .line 59
    .line 60
    const/16 v13, 0xa

    .line 61
    .line 62
    aput-byte v13, v5, v10

    .line 63
    .line 64
    const/16 v10, 0xa

    .line 65
    .line 66
    const/16 v13, 0x62

    .line 67
    .line 68
    aput-byte v13, v5, v10

    .line 69
    .line 70
    const/16 v10, 0xb

    .line 71
    .line 72
    const/16 v14, 0x4e

    .line 73
    .line 74
    aput-byte v14, v5, v10

    .line 75
    .line 76
    const/16 v10, -0x33

    .line 77
    .line 78
    const/16 v14, 0xc

    .line 79
    .line 80
    aput-byte v10, v5, v14

    .line 81
    .line 82
    const/16 v10, 0xd

    .line 83
    .line 84
    const/16 v15, 0x2f

    .line 85
    .line 86
    aput-byte v15, v5, v10

    .line 87
    .line 88
    const/16 v10, -0x7d

    .line 89
    .line 90
    const/16 v15, 0xe

    .line 91
    .line 92
    aput-byte v10, v5, v15

    .line 93
    .line 94
    const/16 v10, 0xf

    .line 95
    .line 96
    const/16 v16, 0x22

    .line 97
    .line 98
    aput-byte v16, v5, v10

    .line 99
    .line 100
    const/16 v10, 0x10

    .line 101
    .line 102
    const/16 v17, 0x11

    .line 103
    .line 104
    aput-byte v17, v5, v10

    .line 105
    .line 106
    const/16 v10, 0x11

    .line 107
    .line 108
    const/16 v17, 0x6c

    .line 109
    .line 110
    aput-byte v17, v5, v10

    .line 111
    .line 112
    const/16 v10, 0x12

    .line 113
    .line 114
    const/16 v17, -0x70

    .line 115
    .line 116
    aput-byte v17, v5, v10

    .line 117
    .line 118
    const/16 v10, 0x13

    .line 119
    .line 120
    const/16 v17, -0x68

    .line 121
    .line 122
    aput-byte v17, v5, v10

    .line 123
    .line 124
    const/16 v10, 0x14

    .line 125
    .line 126
    const/16 v17, 0x5f

    .line 127
    .line 128
    aput-byte v17, v5, v10

    .line 129
    .line 130
    const/16 v10, 0x15

    .line 131
    .line 132
    aput-byte v16, v5, v10

    .line 133
    .line 134
    const/16 v17, 0x16

    .line 135
    .line 136
    const/16 v18, 0x78

    .line 137
    .line 138
    aput-byte v18, v5, v17

    .line 139
    .line 140
    const/16 v17, 0x17

    .line 141
    .line 142
    const/16 v19, 0x3d

    .line 143
    .line 144
    aput-byte v19, v5, v17

    .line 145
    .line 146
    const/16 v17, 0x18

    .line 147
    .line 148
    const/16 v19, -0x34

    .line 149
    .line 150
    aput-byte v19, v5, v17

    .line 151
    .line 152
    const/16 v17, 0x19

    .line 153
    .line 154
    const/16 v19, -0x4d

    .line 155
    .line 156
    aput-byte v19, v5, v17

    .line 157
    .line 158
    const/16 v17, 0x1a

    .line 159
    .line 160
    aput-byte v11, v5, v17

    .line 161
    .line 162
    const/16 v17, 0x1b

    .line 163
    .line 164
    const/16 v19, 0x6b

    .line 165
    .line 166
    aput-byte v19, v5, v17

    .line 167
    .line 168
    const/16 v17, -0x4

    .line 169
    .line 170
    const/16 v19, 0x1c

    .line 171
    .line 172
    aput-byte v17, v5, v19

    .line 173
    .line 174
    const/16 v17, 0x38

    .line 175
    .line 176
    const/16 v20, 0x1d

    .line 177
    .line 178
    aput-byte v17, v5, v20

    .line 179
    .line 180
    const/16 v17, 0x1e

    .line 181
    .line 182
    const/16 v21, 0x52

    .line 183
    .line 184
    aput-byte v21, v5, v17

    .line 185
    .line 186
    const/16 v17, -0x31

    .line 187
    .line 188
    aput-byte v17, v5, v6

    .line 189
    .line 190
    const/16 v17, 0x20

    .line 191
    .line 192
    const/16 v22, -0x77

    .line 193
    .line 194
    aput-byte v22, v5, v17

    .line 195
    .line 196
    const/16 v17, 0x21

    .line 197
    .line 198
    const/16 v22, -0x12

    .line 199
    .line 200
    aput-byte v22, v5, v17

    .line 201
    .line 202
    const/16 v17, -0x6f

    .line 203
    .line 204
    aput-byte v17, v5, v16

    .line 205
    .line 206
    const/16 v17, -0x14

    .line 207
    .line 208
    const/16 v22, 0x23

    .line 209
    .line 210
    aput-byte v17, v5, v22

    .line 211
    .line 212
    const/16 v17, 0x24

    .line 213
    .line 214
    const/16 v23, 0x6e

    .line 215
    .line 216
    aput-byte v23, v5, v17

    .line 217
    .line 218
    const/16 v17, 0x25

    .line 219
    .line 220
    const/16 v23, -0x6c

    .line 221
    .line 222
    aput-byte v23, v5, v17

    .line 223
    .line 224
    const/16 v17, 0x26

    .line 225
    .line 226
    const/16 v24, -0x20

    .line 227
    .line 228
    aput-byte v24, v5, v17

    .line 229
    .line 230
    const/16 v17, 0x27

    .line 231
    .line 232
    const/16 v25, -0x1c

    .line 233
    .line 234
    aput-byte v25, v5, v17

    .line 235
    .line 236
    const/16 v17, 0x28

    .line 237
    .line 238
    const/16 v25, 0x58

    .line 239
    .line 240
    aput-byte v25, v5, v17

    .line 241
    .line 242
    const/16 v17, 0x29

    .line 243
    .line 244
    const/16 v26, -0x5

    .line 245
    .line 246
    aput-byte v26, v5, v17

    .line 247
    .line 248
    const/16 v17, 0x2a

    .line 249
    .line 250
    const/16 v26, 0x45

    .line 251
    .line 252
    aput-byte v26, v5, v17

    .line 253
    .line 254
    const/16 v17, 0x2b

    .line 255
    .line 256
    const/16 v26, -0x1a

    .line 257
    .line 258
    aput-byte v26, v5, v17

    .line 259
    .line 260
    const/16 v17, 0x2c

    .line 261
    .line 262
    aput-byte v18, v5, v17

    .line 263
    .line 264
    const/16 v17, 0x2d

    .line 265
    .line 266
    const/16 v26, -0x24

    .line 267
    .line 268
    aput-byte v26, v5, v17

    .line 269
    .line 270
    const/16 v17, 0x2e

    .line 271
    .line 272
    aput-byte v12, v5, v17

    .line 273
    .line 274
    const/16 v17, 0x2f

    .line 275
    .line 276
    const/16 v26, -0x4d

    .line 277
    .line 278
    aput-byte v26, v5, v17

    .line 279
    .line 280
    const/16 v17, 0x30

    .line 281
    .line 282
    const/16 v26, -0x2e

    .line 283
    .line 284
    aput-byte v26, v5, v17

    .line 285
    .line 286
    const/16 v17, 0x31

    .line 287
    .line 288
    aput-byte v20, v5, v17

    .line 289
    .line 290
    const/16 v17, 0x32

    .line 291
    .line 292
    const/16 v26, 0x18

    .line 293
    .line 294
    aput-byte v26, v5, v17

    .line 295
    .line 296
    const/16 v17, 0x33

    .line 297
    .line 298
    const/16 v26, -0x73

    .line 299
    .line 300
    aput-byte v26, v5, v17

    .line 301
    .line 302
    const/16 v17, 0x34

    .line 303
    .line 304
    const/16 v26, -0x76

    .line 305
    .line 306
    aput-byte v26, v5, v17

    .line 307
    .line 308
    const/16 v17, 0x35

    .line 309
    .line 310
    const/16 v26, -0x9

    .line 311
    .line 312
    aput-byte v26, v5, v17

    .line 313
    .line 314
    const/16 v17, 0x36

    .line 315
    .line 316
    aput-byte v23, v5, v17

    .line 317
    .line 318
    const/16 v17, 0x37

    .line 319
    .line 320
    const/16 v26, -0x56

    .line 321
    .line 322
    aput-byte v26, v5, v17

    .line 323
    .line 324
    const/16 v17, 0x38

    .line 325
    .line 326
    const/16 v27, -0x11

    .line 327
    .line 328
    aput-byte v27, v5, v17

    .line 329
    .line 330
    const/16 v17, 0x39

    .line 331
    .line 332
    aput-byte v16, v5, v17

    .line 333
    .line 334
    const/16 v16, 0x3a

    .line 335
    .line 336
    const/16 v17, 0x73

    .line 337
    .line 338
    aput-byte v17, v5, v16

    .line 339
    .line 340
    const/16 v16, 0x3b

    .line 341
    .line 342
    const/16 v17, -0x7b

    .line 343
    .line 344
    aput-byte v17, v5, v16

    .line 345
    .line 346
    const/16 v16, 0x3c

    .line 347
    .line 348
    const/16 v17, 0x5d

    .line 349
    .line 350
    aput-byte v17, v5, v16

    .line 351
    .line 352
    const/16 v16, 0x3d

    .line 353
    .line 354
    const/16 v17, 0x35

    .line 355
    .line 356
    aput-byte v17, v5, v16

    .line 357
    .line 358
    const/16 v16, 0x3e

    .line 359
    .line 360
    const/16 v17, 0x76

    .line 361
    .line 362
    aput-byte v17, v5, v16

    .line 363
    .line 364
    const/16 v16, 0x3f

    .line 365
    .line 366
    const/16 v17, 0x40

    .line 367
    .line 368
    aput-byte v17, v5, v16

    .line 369
    .line 370
    const/16 v16, 0x40

    .line 371
    .line 372
    const/16 v17, 0x30

    .line 373
    .line 374
    aput-byte v17, v5, v16

    .line 375
    .line 376
    const/16 v16, 0x41

    .line 377
    .line 378
    const/16 v17, -0x65

    .line 379
    .line 380
    aput-byte v17, v5, v16

    .line 381
    .line 382
    const/16 v16, 0x42

    .line 383
    .line 384
    const/16 v17, -0x53

    .line 385
    .line 386
    aput-byte v17, v5, v16

    .line 387
    .line 388
    const/16 v16, 0x43

    .line 389
    .line 390
    const/16 v17, -0x3b

    .line 391
    .line 392
    aput-byte v17, v5, v16

    .line 393
    .line 394
    const/16 v16, 0x44

    .line 395
    .line 396
    const/16 v17, -0x63

    .line 397
    .line 398
    aput-byte v17, v5, v16

    .line 399
    .line 400
    const/16 v16, 0x45

    .line 401
    .line 402
    const/16 v17, 0x24

    .line 403
    .line 404
    aput-byte v17, v5, v16

    .line 405
    .line 406
    const/16 v16, 0x46

    .line 407
    .line 408
    const/16 v17, 0x45

    .line 409
    .line 410
    aput-byte v17, v5, v16

    .line 411
    .line 412
    const/16 v16, 0x47

    .line 413
    .line 414
    const/16 v17, -0x68

    .line 415
    .line 416
    aput-byte v17, v5, v16

    .line 417
    .line 418
    const/16 v16, 0x48

    .line 419
    .line 420
    const/16 v17, 0x33

    .line 421
    .line 422
    aput-byte v17, v5, v16

    .line 423
    .line 424
    const/16 v16, 0x49

    .line 425
    .line 426
    const/16 v17, -0x7e

    .line 427
    .line 428
    aput-byte v17, v5, v16

    .line 429
    .line 430
    const/16 v16, 0x4a

    .line 431
    .line 432
    aput-byte v11, v5, v16

    .line 433
    .line 434
    const/16 v16, 0x4b

    .line 435
    .line 436
    const/16 v17, -0x12

    .line 437
    .line 438
    aput-byte v17, v5, v16

    .line 439
    .line 440
    const/16 v16, 0x4c

    .line 441
    .line 442
    const/16 v17, 0x4f

    .line 443
    .line 444
    aput-byte v17, v5, v16

    .line 445
    .line 446
    const/16 v16, 0x4d

    .line 447
    .line 448
    const/16 v17, -0x73

    .line 449
    .line 450
    aput-byte v17, v5, v16

    .line 451
    .line 452
    const/16 v16, 0x4e

    .line 453
    .line 454
    const/16 v17, -0x10

    .line 455
    .line 456
    aput-byte v17, v5, v16

    .line 457
    .line 458
    const/16 v16, 0x4f

    .line 459
    .line 460
    const/16 v17, 0x54

    .line 461
    .line 462
    aput-byte v17, v5, v16

    .line 463
    .line 464
    const/16 v16, 0x50

    .line 465
    .line 466
    const/16 v17, -0x31

    .line 467
    .line 468
    aput-byte v17, v5, v16

    .line 469
    .line 470
    const/16 v16, 0x51

    .line 471
    .line 472
    const/16 v17, 0x48

    .line 473
    .line 474
    aput-byte v17, v5, v16

    .line 475
    .line 476
    const/16 v16, 0x42

    .line 477
    .line 478
    aput-byte v16, v5, v21

    .line 479
    .line 480
    const/16 v16, 0x53

    .line 481
    .line 482
    const/16 v17, 0x31

    .line 483
    .line 484
    aput-byte v17, v5, v16

    .line 485
    .line 486
    const/16 v16, 0x54

    .line 487
    .line 488
    const/16 v17, 0x5d

    .line 489
    .line 490
    aput-byte v17, v5, v16

    .line 491
    .line 492
    const/16 v16, 0x55

    .line 493
    .line 494
    const/16 v17, -0x16

    .line 495
    .line 496
    aput-byte v17, v5, v16

    .line 497
    .line 498
    const/16 v16, 0x56

    .line 499
    .line 500
    const/16 v17, -0x7f

    .line 501
    .line 502
    aput-byte v17, v5, v16

    .line 503
    .line 504
    const/16 v16, 0x57

    .line 505
    .line 506
    const/16 v17, -0x2f

    .line 507
    .line 508
    aput-byte v17, v5, v16

    .line 509
    .line 510
    const/16 v16, -0x3b

    .line 511
    .line 512
    aput-byte v16, v5, v25

    .line 513
    .line 514
    const/16 v16, 0x59

    .line 515
    .line 516
    aput-byte v26, v5, v16

    .line 517
    .line 518
    const/16 v16, 0x5a

    .line 519
    .line 520
    aput-byte v15, v5, v16

    .line 521
    .line 522
    const/16 v16, 0x5b

    .line 523
    .line 524
    const/16 v17, -0xc

    .line 525
    .line 526
    aput-byte v17, v5, v16

    .line 527
    .line 528
    const/16 v16, 0x5c

    .line 529
    .line 530
    const/16 v17, -0x64

    .line 531
    .line 532
    aput-byte v17, v5, v16

    .line 533
    .line 534
    const/16 v16, 0x5d

    .line 535
    .line 536
    const/16 v27, -0xc

    .line 537
    .line 538
    aput-byte v27, v5, v16

    .line 539
    .line 540
    const/16 v16, 0x5e

    .line 541
    .line 542
    const/16 v27, 0x35

    .line 543
    .line 544
    aput-byte v27, v5, v16

    .line 545
    .line 546
    const/16 v16, 0x5f

    .line 547
    .line 548
    const/16 v27, 0x55

    .line 549
    .line 550
    aput-byte v27, v5, v16

    .line 551
    .line 552
    const/16 v16, 0x60

    .line 553
    .line 554
    const/16 v27, 0x25

    .line 555
    .line 556
    aput-byte v27, v5, v16

    .line 557
    .line 558
    const/16 v16, 0x61

    .line 559
    .line 560
    const/16 v27, -0x4b

    .line 561
    .line 562
    aput-byte v27, v5, v16

    .line 563
    .line 564
    const/16 v16, -0x1e

    .line 565
    .line 566
    aput-byte v16, v5, v13

    .line 567
    .line 568
    const/16 v16, 0x63

    .line 569
    .line 570
    aput-byte v6, v5, v16

    .line 571
    .line 572
    const/16 v6, 0x64

    .line 573
    .line 574
    const/16 v16, 0x2c

    .line 575
    .line 576
    aput-byte v16, v5, v6

    .line 577
    .line 578
    const/16 v6, 0x65

    .line 579
    .line 580
    const/16 v16, -0x53

    .line 581
    .line 582
    aput-byte v16, v5, v6

    .line 583
    .line 584
    const/16 v6, 0x66

    .line 585
    .line 586
    const/16 v16, 0x63

    .line 587
    .line 588
    aput-byte v16, v5, v6

    .line 589
    .line 590
    const/16 v6, 0x67

    .line 591
    .line 592
    aput-byte v23, v5, v6

    .line 593
    .line 594
    const/16 v6, 0x68

    .line 595
    .line 596
    const/16 v16, -0x5c

    .line 597
    .line 598
    aput-byte v16, v5, v6

    .line 599
    .line 600
    const/16 v6, 0x69

    .line 601
    .line 602
    const/16 v16, -0x7f

    .line 603
    .line 604
    aput-byte v16, v5, v6

    .line 605
    .line 606
    const/16 v6, 0x6a

    .line 607
    .line 608
    aput-byte v24, v5, v6

    .line 609
    .line 610
    const/16 v6, 0x6b

    .line 611
    .line 612
    const/16 v16, 0x57

    .line 613
    .line 614
    aput-byte v16, v5, v6

    .line 615
    .line 616
    const/16 v6, 0x6c

    .line 617
    .line 618
    const/16 v16, -0x3d

    .line 619
    .line 620
    aput-byte v16, v5, v6

    .line 621
    .line 622
    const/16 v6, 0x6d

    .line 623
    .line 624
    const/16 v16, -0x53

    .line 625
    .line 626
    aput-byte v16, v5, v6

    .line 627
    .line 628
    const/16 v6, 0x6e

    .line 629
    .line 630
    const/16 v16, -0x5a

    .line 631
    .line 632
    aput-byte v16, v5, v6

    .line 633
    .line 634
    const/16 v6, 0x6f

    .line 635
    .line 636
    const/16 v16, 0x7b

    .line 637
    .line 638
    aput-byte v16, v5, v6

    .line 639
    .line 640
    const/16 v6, 0x70

    .line 641
    .line 642
    const/16 v16, -0x62

    .line 643
    .line 644
    aput-byte v16, v5, v6

    .line 645
    .line 646
    const/16 v6, 0x71

    .line 647
    .line 648
    aput-byte v24, v5, v6

    .line 649
    .line 650
    const/16 v6, 0x72

    .line 651
    .line 652
    const/16 v16, -0x3c

    .line 653
    .line 654
    aput-byte v16, v5, v6

    .line 655
    .line 656
    const/16 v6, 0x73

    .line 657
    .line 658
    const/16 v16, 0x4d

    .line 659
    .line 660
    aput-byte v16, v5, v6

    .line 661
    .line 662
    const/16 v6, 0x74

    .line 663
    .line 664
    const/16 v16, 0x71

    .line 665
    .line 666
    aput-byte v16, v5, v6

    .line 667
    .line 668
    const/16 v6, 0x75

    .line 669
    .line 670
    const/16 v16, -0x3c

    .line 671
    .line 672
    aput-byte v16, v5, v6

    .line 673
    .line 674
    const/16 v6, 0x76

    .line 675
    .line 676
    const/16 v16, 0x65

    .line 677
    .line 678
    aput-byte v16, v5, v6

    .line 679
    .line 680
    const/16 v6, 0x77

    .line 681
    .line 682
    const/16 v16, 0x51

    .line 683
    .line 684
    aput-byte v16, v5, v6

    .line 685
    .line 686
    const/16 v6, 0x39

    .line 687
    .line 688
    aput-byte v6, v5, v18

    .line 689
    .line 690
    const/16 v6, 0x79

    .line 691
    .line 692
    const/16 v16, -0x48

    .line 693
    .line 694
    aput-byte v16, v5, v6

    .line 695
    .line 696
    const/16 v6, 0x7a

    .line 697
    .line 698
    aput-byte v26, v5, v6

    .line 699
    .line 700
    const/16 v6, 0x7b

    .line 701
    .line 702
    aput-byte v19, v5, v6

    .line 703
    .line 704
    const/16 v6, 0x7c

    .line 705
    .line 706
    const/16 v16, -0x4a

    .line 707
    .line 708
    aput-byte v16, v5, v6

    .line 709
    .line 710
    const/16 v6, 0x7d

    .line 711
    .line 712
    aput-byte v25, v5, v6

    .line 713
    .line 714
    const/16 v6, 0x7e

    .line 715
    .line 716
    aput-byte v22, v5, v6

    .line 717
    .line 718
    const/16 v6, 0x7f

    .line 719
    .line 720
    const/16 v16, -0x76

    .line 721
    .line 722
    aput-byte v16, v5, v6

    .line 723
    .line 724
    const/16 v6, 0x80

    .line 725
    .line 726
    const/16 v16, -0x16

    .line 727
    .line 728
    aput-byte v16, v5, v6

    .line 729
    .line 730
    const/16 v6, 0x81

    .line 731
    .line 732
    const/16 v16, -0x4a

    .line 733
    .line 734
    aput-byte v16, v5, v6

    .line 735
    .line 736
    const/16 v6, 0x82

    .line 737
    .line 738
    const/16 v16, -0x1d

    .line 739
    .line 740
    aput-byte v16, v5, v6

    .line 741
    .line 742
    const/16 v6, 0x83

    .line 743
    .line 744
    const/16 v16, -0x67

    .line 745
    .line 746
    aput-byte v16, v5, v6

    .line 747
    .line 748
    const/16 v6, 0x84

    .line 749
    .line 750
    aput-byte v26, v5, v6

    .line 751
    .line 752
    const/16 v6, 0x85

    .line 753
    .line 754
    const/16 v16, -0x19

    .line 755
    .line 756
    aput-byte v16, v5, v6

    .line 757
    .line 758
    const/16 v6, 0x86

    .line 759
    .line 760
    const/16 v16, 0x13

    .line 761
    .line 762
    aput-byte v16, v5, v6

    .line 763
    .line 764
    const/16 v6, 0x87

    .line 765
    .line 766
    const/16 v16, -0x4e

    .line 767
    .line 768
    aput-byte v16, v5, v6

    .line 769
    .line 770
    const/16 v6, 0x88

    .line 771
    .line 772
    const/16 v16, 0x3e

    .line 773
    .line 774
    aput-byte v16, v5, v6

    .line 775
    .line 776
    const/16 v6, 0x89

    .line 777
    .line 778
    aput-byte v19, v5, v6

    .line 779
    .line 780
    const/16 v6, 0x8a

    .line 781
    .line 782
    aput-byte v17, v5, v6

    .line 783
    .line 784
    const/16 v6, 0x8b

    .line 785
    .line 786
    const/16 v16, -0x44

    .line 787
    .line 788
    aput-byte v16, v5, v6

    .line 789
    .line 790
    const/16 v6, 0x8c

    .line 791
    .line 792
    aput-byte v8, v5, v6

    .line 793
    .line 794
    const/16 v6, 0x8d

    .line 795
    .line 796
    aput-byte v22, v5, v6

    .line 797
    .line 798
    const/16 v6, 0x8e

    .line 799
    .line 800
    const/16 v16, -0x44

    .line 801
    .line 802
    aput-byte v16, v5, v6

    .line 803
    .line 804
    const/16 v6, 0x8f

    .line 805
    .line 806
    const/16 v16, 0x3a

    .line 807
    .line 808
    aput-byte v16, v5, v6

    .line 809
    .line 810
    const/16 v6, 0x90

    .line 811
    .line 812
    aput-byte v17, v5, v6

    .line 813
    .line 814
    const/16 v6, 0x91

    .line 815
    .line 816
    aput-byte v20, v5, v6

    .line 817
    .line 818
    const/16 v6, 0x92

    .line 819
    .line 820
    aput-byte v12, v5, v6

    .line 821
    .line 822
    const/16 v6, 0x93

    .line 823
    .line 824
    const/16 v12, -0xa

    .line 825
    .line 826
    aput-byte v12, v5, v6

    .line 827
    .line 828
    const/16 v6, 0x94

    .line 829
    .line 830
    const/16 v12, -0x5f

    .line 831
    .line 832
    aput-byte v12, v5, v6

    .line 833
    .line 834
    const/16 v6, 0x95

    .line 835
    .line 836
    const/16 v12, 0x14

    .line 837
    .line 838
    aput-byte v12, v5, v6

    .line 839
    .line 840
    const/16 v6, 0x96

    .line 841
    .line 842
    aput-byte v13, v5, v6

    .line 843
    .line 844
    const/16 v6, 0x97

    .line 845
    .line 846
    const/16 v12, 0x7c

    .line 847
    .line 848
    aput-byte v12, v5, v6

    .line 849
    .line 850
    const/16 v6, 0x98

    .line 851
    .line 852
    const/16 v12, -0x28

    .line 853
    .line 854
    aput-byte v12, v5, v6

    .line 855
    .line 856
    const/16 v6, 0x99

    .line 857
    .line 858
    const/16 v12, 0x63

    .line 859
    .line 860
    aput-byte v12, v5, v6

    .line 861
    .line 862
    const/16 v6, 0x9a

    .line 863
    .line 864
    aput-byte v17, v5, v6

    .line 865
    .line 866
    const/16 v6, 0x9b

    .line 867
    .line 868
    aput-byte v11, v5, v6

    .line 869
    .line 870
    const/16 v6, 0x9c

    .line 871
    .line 872
    const/16 v11, -0x7e

    .line 873
    .line 874
    aput-byte v11, v5, v6

    .line 875
    .line 876
    const/16 v6, 0x9d

    .line 877
    .line 878
    const/16 v11, -0xa

    .line 879
    .line 880
    aput-byte v11, v5, v6

    .line 881
    .line 882
    const/16 v6, 0x9e

    .line 883
    .line 884
    const/16 v11, 0x4f

    .line 885
    .line 886
    aput-byte v11, v5, v6

    .line 887
    .line 888
    const/16 v6, 0x9f

    .line 889
    .line 890
    const/16 v11, -0x1f

    .line 891
    .line 892
    aput-byte v11, v5, v6

    .line 893
    .line 894
    const/16 v6, 0xa0

    .line 895
    .line 896
    const/16 v11, -0x2a

    .line 897
    .line 898
    aput-byte v11, v5, v6

    .line 899
    .line 900
    const/16 v6, 0xa1

    .line 901
    .line 902
    const/16 v11, -0x72

    .line 903
    .line 904
    aput-byte v11, v5, v6

    .line 905
    .line 906
    const/16 v6, 0xa2

    .line 907
    .line 908
    aput-byte v14, v5, v6

    .line 909
    .line 910
    const/16 v6, 0xa3

    .line 911
    .line 912
    const/16 v11, 0x1b

    .line 913
    .line 914
    aput-byte v11, v5, v6

    .line 915
    .line 916
    const/16 v6, 0xa4

    .line 917
    .line 918
    const/16 v11, -0x66

    .line 919
    .line 920
    aput-byte v11, v5, v6

    .line 921
    .line 922
    const/16 v6, 0xa5

    .line 923
    .line 924
    const/16 v11, 0x72

    .line 925
    .line 926
    aput-byte v11, v5, v6

    .line 927
    .line 928
    const/16 v6, 0xa6

    .line 929
    .line 930
    const/16 v11, -0x6b

    .line 931
    .line 932
    aput-byte v11, v5, v6

    .line 933
    .line 934
    const/16 v6, 0xa7

    .line 935
    .line 936
    const/16 v11, -0x23

    .line 937
    .line 938
    aput-byte v11, v5, v6

    .line 939
    .line 940
    const/16 v6, 0xa8

    .line 941
    .line 942
    aput-byte v21, v5, v6

    .line 943
    .line 944
    const/16 v6, 0xa9

    .line 945
    .line 946
    aput-byte v10, v5, v6

    .line 947
    .line 948
    const/16 v6, 0xaa

    .line 949
    .line 950
    const/16 v11, 0x61

    .line 951
    .line 952
    aput-byte v11, v5, v6

    .line 953
    .line 954
    const/16 v6, 0xab

    .line 955
    .line 956
    const/16 v11, -0x9

    .line 957
    .line 958
    aput-byte v11, v5, v6

    .line 959
    .line 960
    const/16 v6, 0xac

    .line 961
    .line 962
    const/16 v11, 0x27

    .line 963
    .line 964
    aput-byte v11, v5, v6

    .line 965
    .line 966
    const/16 v6, 0xad

    .line 967
    .line 968
    const/16 v11, -0x14

    .line 969
    .line 970
    aput-byte v11, v5, v6

    .line 971
    .line 972
    const/16 v6, 0xae

    .line 973
    .line 974
    const/16 v11, 0x7b

    .line 975
    .line 976
    aput-byte v11, v5, v6

    .line 977
    .line 978
    const/16 v6, 0xaf

    .line 979
    .line 980
    const/16 v11, -0x25

    .line 981
    .line 982
    aput-byte v11, v5, v6

    .line 983
    .line 984
    const/16 v6, 0xb0

    .line 985
    .line 986
    const/16 v11, -0x44

    .line 987
    .line 988
    aput-byte v11, v5, v6

    .line 989
    .line 990
    const/16 v6, 0xb1

    .line 991
    .line 992
    const/16 v11, -0x4e

    .line 993
    .line 994
    aput-byte v11, v5, v6

    .line 995
    .line 996
    const/16 v6, 0xb2

    .line 997
    .line 998
    const/16 v11, -0x59

    .line 999
    .line 1000
    aput-byte v11, v5, v6

    .line 1001
    .line 1002
    const/16 v6, 0xb3

    .line 1003
    .line 1004
    const/16 v11, 0xd

    .line 1005
    .line 1006
    aput-byte v11, v5, v6

    .line 1007
    .line 1008
    const/16 v6, 0xb4

    .line 1009
    .line 1010
    const/4 v11, 0x3

    .line 1011
    aput-byte v11, v5, v6

    .line 1012
    .line 1013
    const/16 v6, 0xb5

    .line 1014
    .line 1015
    aput-byte v10, v5, v6

    .line 1016
    .line 1017
    const/16 v6, 0xb6

    .line 1018
    .line 1019
    aput-byte v10, v5, v6

    .line 1020
    .line 1021
    const/16 v6, 0xb7

    .line 1022
    .line 1023
    aput-byte v14, v5, v6

    .line 1024
    .line 1025
    const/16 v6, 0xb8

    .line 1026
    .line 1027
    const/16 v10, 0x28

    .line 1028
    .line 1029
    aput-byte v10, v5, v6

    .line 1030
    .line 1031
    const/16 v6, 0xb9

    .line 1032
    .line 1033
    aput-byte v15, v5, v6

    .line 1034
    .line 1035
    const/16 v6, 0xba

    .line 1036
    .line 1037
    aput-byte v20, v5, v6

    .line 1038
    .line 1039
    const/16 v6, 0xb3

    .line 1040
    .line 1041
    invoke-static {v5, v6, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1042
    .line 1043
    .line 1044
    move-result-object v4

    .line 1045
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 1046
    .line 1047
    .line 1048
    move-result-object v5

    .line 1049
    invoke-static {v5, v4}, Lcom/uyumao/e;->a([B[B)[B

    .line 1050
    .line 1051
    .line 1052
    invoke-static {v5, v3}, Lcom/uyumao/e;->a([BLjava/io/OutputStream;)V

    .line 1053
    .line 1054
    .line 1055
    new-instance v4, Lorg/json/JSONObject;

    .line 1056
    .line 1057
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v5

    .line 1061
    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1062
    .line 1063
    .line 1064
    const-string v5, "c"

    .line 1065
    .line 1066
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    const-string v6, "p"

    .line 1071
    .line 1072
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v6

    .line 1076
    iget-object v10, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1077
    .line 1078
    invoke-static {v5, v6, v2, v10, v2}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v2

    .line 1082
    iget v5, v1, Lcom/uyumao/r$a;->b:I

    .line 1083
    .line 1084
    if-ne v8, v5, :cond_1

    .line 1085
    .line 1086
    const-string v5, "i"

    .line 1087
    .line 1088
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v5

    .line 1092
    new-array v6, v8, [Ljava/lang/Class;

    .line 1093
    .line 1094
    const-class v10, Ljava/lang/String;

    .line 1095
    .line 1096
    aput-object v10, v6, v7

    .line 1097
    .line 1098
    new-array v10, v8, [Ljava/lang/Object;

    .line 1099
    .line 1100
    const-string v11, "a"

    .line 1101
    .line 1102
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v11

    .line 1106
    aput-object v11, v10, v7

    .line 1107
    .line 1108
    invoke-static {v5, v6, v10}, Lcom/uyumao/t;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v5

    .line 1112
    const-string v6, "m"

    .line 1113
    .line 1114
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v6

    .line 1118
    const-string v10, "q"

    .line 1119
    .line 1120
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v10

    .line 1124
    new-array v11, v9, [Ljava/lang/Class;

    .line 1125
    .line 1126
    const-string v12, "i"

    .line 1127
    .line 1128
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v12

    .line 1132
    invoke-static {v12}, Lcom/uyumao/t;->a(Ljava/lang/String;)Ljava/lang/Class;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v12

    .line 1136
    aput-object v12, v11, v7

    .line 1137
    .line 1138
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1139
    .line 1140
    aput-object v12, v11, v8

    .line 1141
    .line 1142
    new-array v9, v9, [Ljava/lang/Object;

    .line 1143
    .line 1144
    aput-object v5, v9, v7

    .line 1145
    .line 1146
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v5

    .line 1150
    aput-object v5, v9, v8

    .line 1151
    .line 1152
    invoke-static {v6, v10, v11, v2, v9}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v5

    .line 1156
    instance-of v6, v5, Ljava/util/List;

    .line 1157
    .line 1158
    if-eqz v6, :cond_3

    .line 1159
    .line 1160
    const-string v6, "r"

    .line 1161
    .line 1162
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v6

    .line 1166
    const-string v9, "s"

    .line 1167
    .line 1168
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v9

    .line 1172
    invoke-static {v6, v9}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v6

    .line 1176
    const-string v9, "t"

    .line 1177
    .line 1178
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v9

    .line 1182
    const-string v10, "n"

    .line 1183
    .line 1184
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v4

    .line 1188
    invoke-static {v9, v4}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v4

    .line 1192
    check-cast v5, Ljava/util/List;

    .line 1193
    .line 1194
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v5

    .line 1198
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v9

    .line 1202
    if-eqz v9, :cond_3

    .line 1203
    .line 1204
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v9

    .line 1208
    invoke-static {v6, v9}, Lcom/uyumao/t;->a(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v9

    .line 1212
    invoke-static {v4, v9}, Lcom/uyumao/t;->a(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v9

    .line 1216
    if-eqz v9, :cond_0

    .line 1217
    .line 1218
    check-cast v9, Ljava/lang/String;

    .line 1219
    .line 1220
    invoke-virtual {v0, v9}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 1221
    .line 1222
    .line 1223
    goto :goto_0

    .line 1224
    :cond_1
    const-string v5, "m"

    .line 1225
    .line 1226
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v5

    .line 1230
    const-string v6, "u"

    .line 1231
    .line 1232
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v6

    .line 1236
    new-array v9, v8, [Ljava/lang/Class;

    .line 1237
    .line 1238
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1239
    .line 1240
    aput-object v10, v9, v7

    .line 1241
    .line 1242
    new-array v10, v8, [Ljava/lang/Object;

    .line 1243
    .line 1244
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v11

    .line 1248
    aput-object v11, v10, v7

    .line 1249
    .line 1250
    invoke-static {v5, v6, v9, v2, v10}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v5

    .line 1254
    instance-of v6, v5, Ljava/util/List;

    .line 1255
    .line 1256
    if-eqz v6, :cond_3

    .line 1257
    .line 1258
    const-string v6, "v"

    .line 1259
    .line 1260
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v6

    .line 1264
    const-string v9, "n"

    .line 1265
    .line 1266
    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v4

    .line 1270
    invoke-static {v6, v4}, Lcom/uyumao/t;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v4

    .line 1274
    check-cast v5, Ljava/util/List;

    .line 1275
    .line 1276
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1281
    .line 1282
    .line 1283
    move-result v6

    .line 1284
    if-eqz v6, :cond_3

    .line 1285
    .line 1286
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v6

    .line 1290
    invoke-static {v4, v6}, Lcom/uyumao/t;->a(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v6

    .line 1294
    if-eqz v6, :cond_2

    .line 1295
    .line 1296
    check-cast v6, Ljava/lang/String;

    .line 1297
    .line 1298
    invoke-virtual {v0, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    goto :goto_1

    .line 1302
    :cond_3
    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 1306
    if-eqz v4, :cond_4

    .line 1307
    .line 1308
    invoke-static {v3}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1309
    .line 1310
    .line 1311
    return-void

    .line 1312
    :cond_4
    if-nez v2, :cond_5

    .line 1313
    .line 1314
    invoke-static {v3}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1315
    .line 1316
    .line 1317
    return-void

    .line 1318
    :cond_5
    :try_start_2
    new-instance v4, Ljava/util/ArrayList;

    .line 1319
    .line 1320
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1321
    .line 1322
    .line 1323
    new-instance v5, Lorg/json/JSONArray;

    .line 1324
    .line 1325
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    move v6, v7

    .line 1333
    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v9

    .line 1337
    if-eqz v9, :cond_8

    .line 1338
    .line 1339
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v9

    .line 1343
    check-cast v9, Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-static {v2, v9, v7}, Lcom/uyumao/n;->a(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v9

    .line 1349
    if-nez v9, :cond_7

    .line 1350
    .line 1351
    goto :goto_2

    .line 1352
    :cond_7
    new-instance v10, Lcom/uyumao/p;

    .line 1353
    .line 1354
    invoke-direct {v10, v2, v9}, Lcom/uyumao/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    new-instance v9, Lorg/json/JSONObject;

    .line 1358
    .line 1359
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 1360
    .line 1361
    .line 1362
    const-string v11, "a"

    .line 1363
    .line 1364
    :try_start_3
    iget-object v12, v10, Lcom/uyumao/p;->b:Ljava/lang/String;

    .line 1365
    .line 1366
    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 1367
    .line 1368
    .line 1369
    const-string v11, "p"

    .line 1370
    .line 1371
    :try_start_4
    iget-object v12, v10, Lcom/uyumao/p;->a:Ljava/lang/String;

    .line 1372
    .line 1373
    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 1374
    .line 1375
    .line 1376
    const-string v11, "v"

    .line 1377
    .line 1378
    :try_start_5
    iget-object v12, v10, Lcom/uyumao/p;->c:Ljava/lang/String;

    .line 1379
    .line 1380
    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 1381
    .line 1382
    .line 1383
    const-string v11, "t"

    .line 1384
    .line 1385
    :try_start_6
    iget v12, v10, Lcom/uyumao/p;->f:I

    .line 1386
    .line 1387
    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1388
    .line 1389
    .line 1390
    const-string v11, "i"

    .line 1391
    .line 1392
    :try_start_7
    iget-wide v12, v10, Lcom/uyumao/p;->d:J

    .line 1393
    .line 1394
    invoke-virtual {v9, v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1395
    .line 1396
    .line 1397
    const-string v11, "u"

    .line 1398
    .line 1399
    :try_start_8
    iget-wide v12, v10, Lcom/uyumao/p;->e:J

    .line 1400
    .line 1401
    invoke-virtual {v9, v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1405
    .line 1406
    .line 1407
    add-int/lit8 v6, v6, 0x1

    .line 1408
    .line 1409
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 1410
    .line 1411
    .line 1412
    move-result v9

    .line 1413
    iget v10, v1, Lcom/uyumao/r$a;->c:I

    .line 1414
    .line 1415
    if-ne v9, v10, :cond_6

    .line 1416
    .line 1417
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    new-instance v5, Lorg/json/JSONArray;

    .line 1421
    .line 1422
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1423
    .line 1424
    .line 1425
    goto :goto_2

    .line 1426
    :cond_8
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 1427
    .line 1428
    .line 1429
    move-result v0

    .line 1430
    if-lez v0, :cond_9

    .line 1431
    .line 1432
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 1439
    if-eqz v0, :cond_a

    .line 1440
    .line 1441
    invoke-static {v3}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1442
    .line 1443
    .line 1444
    return-void

    .line 1445
    :cond_a
    :try_start_9
    new-instance v0, Lorg/json/JSONObject;

    .line 1446
    .line 1447
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1448
    .line 1449
    .line 1450
    const-string v2, "zid"

    .line 1451
    .line 1452
    :try_start_a
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1453
    .line 1454
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getZid(Landroid/content/Context;)Ljava/lang/String;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v5

    .line 1458
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1459
    .line 1460
    .line 1461
    const-string v2, "appkey"

    .line 1462
    .line 1463
    :try_start_b
    iget-object v5, v1, Lcom/uyumao/r$a;->d:Ljava/lang/String;

    .line 1464
    .line 1465
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1466
    .line 1467
    .line 1468
    const-string v2, "umid"

    .line 1469
    .line 1470
    :try_start_c
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1471
    .line 1472
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v5

    .line 1476
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1477
    .line 1478
    .line 1479
    const-string v2, "v"

    .line 1480
    .line 1481
    const-string v5, "3.0"

    .line 1482
    .line 1483
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1484
    .line 1485
    .line 1486
    const-string v2, "sdk_v"

    .line 1487
    .line 1488
    const-string v5, "1.1.2"

    .line 1489
    .line 1490
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1491
    .line 1492
    .line 1493
    const-string v2, "os_v"

    .line 1494
    .line 1495
    :try_start_d
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 1496
    .line 1497
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1498
    .line 1499
    .line 1500
    const-string v2, "brand"

    .line 1501
    .line 1502
    :try_start_e
    invoke-static {}, Lcom/uyumao/n;->b()Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v5

    .line 1506
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 1507
    .line 1508
    .line 1509
    const-string v2, "model"

    .line 1510
    .line 1511
    :try_start_f
    invoke-static {}, Lcom/uyumao/n;->c()Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v5

    .line 1515
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1516
    .line 1517
    .line 1518
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v2

    .line 1522
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v2

    .line 1526
    const-string v5, "uuid"

    .line 1527
    .line 1528
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1529
    .line 1530
    .line 1531
    const-string v5, "smart_id"

    .line 1532
    .line 1533
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1534
    .line 1535
    .line 1536
    const-string v2, "src"

    .line 1537
    .line 1538
    const-string v5, "risk"

    .line 1539
    .line 1540
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1541
    .line 1542
    .line 1543
    const-string v2, "imei"

    .line 1544
    .line 1545
    :try_start_10
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1546
    .line 1547
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getImeiNew(Landroid/content/Context;)Ljava/lang/String;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v5

    .line 1551
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 1552
    .line 1553
    .line 1554
    const-string v2, "oaid"

    .line 1555
    .line 1556
    :try_start_11
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1557
    .line 1558
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getOaid(Landroid/content/Context;)Ljava/lang/String;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v5

    .line 1562
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 1563
    .line 1564
    .line 1565
    :catchall_0
    const-string v2, "idfa"

    .line 1566
    .line 1567
    :try_start_12
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1568
    .line 1569
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getIdfa(Landroid/content/Context;)Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v5

    .line 1573
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 1574
    .line 1575
    .line 1576
    :catchall_1
    const-string v2, "android_id"

    .line 1577
    .line 1578
    :try_start_13
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1579
    .line 1580
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v5

    .line 1584
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 1585
    .line 1586
    .line 1587
    const-string v2, "pkg"

    .line 1588
    .line 1589
    :try_start_14
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1590
    .line 1591
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v5

    .line 1595
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 1596
    .line 1597
    .line 1598
    const-string v2, "app_v"

    .line 1599
    .line 1600
    :try_start_15
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1601
    .line 1602
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v5

    .line 1606
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 1607
    .line 1608
    .line 1609
    const-string v2, "board"

    .line 1610
    .line 1611
    :try_start_16
    invoke-static {}, Lcom/uyumao/n;->a()Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v5

    .line 1615
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 1616
    .line 1617
    .line 1618
    :try_start_17
    iget-object v2, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1619
    .line 1620
    invoke-static {v2}, Lcom/umeng/commonsdk/utils/UMUtils;->getLocale(Landroid/content/Context;)Ljava/util/Locale;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 1624
    if-eqz v2, :cond_b

    .line 1625
    .line 1626
    const-string v5, "os_lang"

    .line 1627
    .line 1628
    :try_start_18
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 1633
    .line 1634
    .line 1635
    :catchall_2
    :cond_b
    const-string v2, "c_ts"

    .line 1636
    .line 1637
    :try_start_19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v9

    .line 1641
    invoke-virtual {v0, v2, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1642
    .line 1643
    .line 1644
    const-string v2, "total"

    .line 1645
    .line 1646
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    .line 1647
    .line 1648
    .line 1649
    const-string v2, "os_i"

    .line 1650
    .line 1651
    :try_start_1a
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1652
    .line 1653
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    .line 1654
    .line 1655
    .line 1656
    const-string v2, "os_t"

    .line 1657
    .line 1658
    :try_start_1b
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1659
    .line 1660
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v5

    .line 1664
    iget v5, v5, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 1665
    .line 1666
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    .line 1667
    .line 1668
    .line 1669
    const-string v2, "grant"

    .line 1670
    .line 1671
    :try_start_1c
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1672
    .line 1673
    invoke-static {v5}, Lcom/uyumao/n;->a(Landroid/content/Context;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v5

    .line 1677
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    .line 1678
    .line 1679
    .line 1680
    :catchall_3
    :try_start_1d
    const-string v2, "os"

    .line 1681
    .line 1682
    const-string v5, "Android"

    .line 1683
    .line 1684
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1685
    .line 1686
    .line 1687
    iget-object v2, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1688
    .line 1689
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v2
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    .line 1693
    const-string v5, "Wi-Fi"

    .line 1694
    .line 1695
    :try_start_1e
    aget-object v6, v2, v7

    .line 1696
    .line 1697
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result v5

    .line 1701
    if-eqz v5, :cond_c

    .line 1702
    .line 1703
    const-string v5, "access"

    .line 1704
    .line 1705
    const-string v6, "wifi"

    .line 1706
    .line 1707
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    .line 1708
    .line 1709
    .line 1710
    goto :goto_3

    .line 1711
    :cond_c
    const-string v5, "2G/3G"

    .line 1712
    .line 1713
    :try_start_1f
    aget-object v6, v2, v7

    .line 1714
    .line 1715
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1716
    .line 1717
    .line 1718
    move-result v5

    .line 1719
    if-eqz v5, :cond_d

    .line 1720
    .line 1721
    const-string v5, "access"

    .line 1722
    .line 1723
    const-string v6, "2G/3G"

    .line 1724
    .line 1725
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1726
    .line 1727
    .line 1728
    goto :goto_3

    .line 1729
    :cond_d
    const-string v5, "access"

    .line 1730
    .line 1731
    const-string v6, "unknown"

    .line 1732
    .line 1733
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    .line 1734
    .line 1735
    .line 1736
    :goto_3
    const-string v5, ""

    .line 1737
    .line 1738
    :try_start_20
    aget-object v6, v2, v8

    .line 1739
    .line 1740
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v5
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_4

    .line 1744
    if-nez v5, :cond_e

    .line 1745
    .line 1746
    const-string v5, "sub_access"

    .line 1747
    .line 1748
    :try_start_21
    aget-object v2, v2, v8

    .line 1749
    .line 1750
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    .line 1751
    .line 1752
    .line 1753
    :cond_e
    const-string v2, "display_name"

    .line 1754
    .line 1755
    :try_start_22
    iget-object v5, v1, Lcom/uyumao/r$a;->a:Landroid/content/Context;

    .line 1756
    .line 1757
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v5

    .line 1761
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_4

    .line 1762
    .line 1763
    .line 1764
    :catchall_4
    :try_start_23
    iget-object v2, v1, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    .line 1765
    .line 1766
    invoke-static {v2}, Lcom/uyumao/r;->a(Lcom/uyumao/r;)Lorg/json/JSONObject;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v2

    .line 1770
    const-string v5, "sdk"

    .line 1771
    .line 1772
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v2

    .line 1776
    const-string v5, ","

    .line 1777
    .line 1778
    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v2

    .line 1782
    new-instance v5, Lorg/json/JSONArray;

    .line 1783
    .line 1784
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1785
    .line 1786
    .line 1787
    move v6, v7

    .line 1788
    :goto_4
    array-length v9, v2

    .line 1789
    if-ge v6, v9, :cond_f

    .line 1790
    .line 1791
    aget-object v9, v2, v6

    .line 1792
    .line 1793
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1794
    .line 1795
    .line 1796
    add-int/lit8 v6, v6, 0x1

    .line 1797
    .line 1798
    goto :goto_4

    .line 1799
    :cond_f
    const-string v2, "sdk"

    .line 1800
    .line 1801
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_5

    .line 1802
    .line 1803
    .line 1804
    const-string v2, "hit_sdk"

    .line 1805
    .line 1806
    :try_start_24
    iget-object v5, v1, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    .line 1807
    .line 1808
    invoke-static {v5}, Lcom/uyumao/r;->a(Lcom/uyumao/r;)Lorg/json/JSONObject;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v5

    .line 1812
    const-string v6, "hit_sdk"

    .line 1813
    .line 1814
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v5

    .line 1818
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_5

    .line 1819
    .line 1820
    .line 1821
    const-string v2, "local_hit_sdk"

    .line 1822
    .line 1823
    :try_start_25
    iget-object v5, v1, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    .line 1824
    .line 1825
    invoke-static {v5}, Lcom/uyumao/r;->a(Lcom/uyumao/r;)Lorg/json/JSONObject;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v5

    .line 1829
    const-string v6, "local_hit_sdk"

    .line 1830
    .line 1831
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v5

    .line 1835
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1836
    .line 1837
    .line 1838
    iget-object v2, v1, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    .line 1839
    .line 1840
    invoke-static {v2}, Lcom/uyumao/r;->a(Lcom/uyumao/r;)Lorg/json/JSONObject;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v2

    .line 1844
    const-string v5, "actionName"

    .line 1845
    .line 1846
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v2

    .line 1850
    new-instance v5, Lorg/json/JSONArray;

    .line 1851
    .line 1852
    iget-object v6, v1, Lcom/uyumao/r$a;->e:Lcom/uyumao/r;

    .line 1853
    .line 1854
    invoke-static {v6}, Lcom/uyumao/r;->a(Lcom/uyumao/r;)Lorg/json/JSONObject;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v6

    .line 1858
    const-string v9, "forbid_sdk"

    .line 1859
    .line 1860
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v6

    .line 1864
    invoke-direct {v5, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    new-instance v6, Lorg/json/JSONObject;

    .line 1868
    .line 1869
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v6, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1873
    .line 1874
    .line 1875
    const-string v2, "forbid_sdk"

    .line 1876
    .line 1877
    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_5

    .line 1878
    .line 1879
    .line 1880
    :catchall_5
    :try_start_26
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1881
    .line 1882
    .line 1883
    move-result v2

    .line 1884
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v4

    .line 1888
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1889
    .line 1890
    .line 1891
    move-result v5

    .line 1892
    if-eqz v5, :cond_10

    .line 1893
    .line 1894
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v5

    .line 1898
    check-cast v5, Lorg/json/JSONArray;

    .line 1899
    .line 1900
    add-int/2addr v7, v8

    .line 1901
    const-string v6, "batch"

    .line 1902
    .line 1903
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1904
    .line 1905
    .line 1906
    const-string v6, "batch_num"

    .line 1907
    .line 1908
    invoke-virtual {v0, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_6

    .line 1909
    .line 1910
    .line 1911
    const-string v6, "batch_pkg_num"

    .line 1912
    .line 1913
    :try_start_27
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 1914
    .line 1915
    .line 1916
    move-result v9

    .line 1917
    invoke-virtual {v0, v6, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1918
    .line 1919
    .line 1920
    const-string v6, "apl"

    .line 1921
    .line 1922
    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_6

    .line 1923
    .line 1924
    .line 1925
    const-string v5, "https://yumao.puata.info/cc_info"

    .line 1926
    .line 1927
    :try_start_28
    iget-object v6, v1, Lcom/uyumao/r$a;->d:Ljava/lang/String;

    .line 1928
    .line 1929
    invoke-static {v0, v5, v6}, Lcom/uyumao/e;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_0
    .catchall {:try_start_28 .. :try_end_28} :catchall_6

    .line 1930
    .line 1931
    .line 1932
    goto :goto_5

    .line 1933
    :catch_0
    move-exception v0

    .line 1934
    :try_start_29
    throw v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_6

    .line 1935
    :cond_10
    invoke-static {v3}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1936
    .line 1937
    .line 1938
    goto :goto_7

    .line 1939
    :catchall_6
    move-exception v0

    .line 1940
    move-object v2, v3

    .line 1941
    goto :goto_6

    .line 1942
    :catchall_7
    move-exception v0

    .line 1943
    :goto_6
    :try_start_2a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_8

    .line 1944
    .line 1945
    .line 1946
    invoke-static {v2}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1947
    .line 1948
    .line 1949
    :goto_7
    return-void

    .line 1950
    :catchall_8
    move-exception v0

    .line 1951
    move-object v3, v0

    .line 1952
    invoke-static {v2}, Lcom/uyumao/n;->a(Ljava/io/Closeable;)V

    .line 1953
    .line 1954
    .line 1955
    throw v3
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
