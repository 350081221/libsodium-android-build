.class public final Landroidx/compose/ui/graphics/vector/PathParserKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0014\n\u0002\u0008\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u001aX\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u001aX\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002\u001a\r\u0010\u001a\u001a\u00020\u0006*\u00020\u0006H\u0082\u0008\"\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "Landroidx/compose/ui/graphics/Path;",
        "target",
        "toPath",
        "p",
        "",
        "x0",
        "y0",
        "x1",
        "y1",
        "a",
        "b",
        "theta",
        "",
        "isMoreThanHalf",
        "isPositiveArc",
        "Lkotlin/r2;",
        "drawArc",
        "cx",
        "cy",
        "e1x",
        "e1y",
        "start",
        "sweep",
        "arcToBezier",
        "toRadians",
        "",
        "EmptyArray",
        "[F",
        "getEmptyArray",
        "()[F",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,555:1\n554#1:562\n33#2,6:556\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n407#1:562\n176#1:556,6\n*E\n"
    }
.end annotation


# static fields
.field private static final EmptyArray:[F
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    sput-object v0, Landroidx/compose/ui/graphics/vector/PathParserKt;->EmptyArray:[F

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
.end method

.method private static final arcToBezier(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V
    .locals 48

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    const/4 v2, 0x4

    .line 4
    int-to-double v2, v2

    .line 5
    mul-double v4, p17, v2

    .line 6
    .line 7
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    div-double/2addr v4, v6

    .line 13
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    double-to-int v4, v4

    .line 22
    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->cos(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->sin(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v7

    .line 30
    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->cos(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v9

    .line 34
    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->sin(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v11

    .line 38
    neg-double v13, v0

    .line 39
    mul-double v15, v13, v5

    .line 40
    .line 41
    mul-double v17, v15, v11

    .line 42
    .line 43
    mul-double v19, p7, v7

    .line 44
    .line 45
    mul-double v21, v19, v9

    .line 46
    .line 47
    sub-double v17, v17, v21

    .line 48
    .line 49
    mul-double/2addr v13, v7

    .line 50
    mul-double/2addr v11, v13

    .line 51
    mul-double v21, p7, v5

    .line 52
    .line 53
    mul-double v9, v9, v21

    .line 54
    .line 55
    add-double/2addr v11, v9

    .line 56
    int-to-double v9, v4

    .line 57
    div-double v9, p17, v9

    .line 58
    .line 59
    const/16 v23, 0x0

    .line 60
    .line 61
    move-wide/from16 p7, p9

    .line 62
    .line 63
    move-wide/from16 v25, v11

    .line 64
    .line 65
    move-wide/from16 v27, v17

    .line 66
    .line 67
    move/from16 v11, v23

    .line 68
    .line 69
    move-wide/from16 v17, p11

    .line 70
    .line 71
    move-wide/from16 v23, p15

    .line 72
    .line 73
    :goto_0
    if-ge v11, v4, :cond_0

    .line 74
    .line 75
    add-double v29, v23, v9

    .line 76
    .line 77
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v31

    .line 81
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->cos(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v33

    .line 85
    mul-double v35, v0, v5

    .line 86
    .line 87
    mul-double v35, v35, v33

    .line 88
    .line 89
    add-double v35, p1, v35

    .line 90
    .line 91
    mul-double v37, v19, v31

    .line 92
    .line 93
    move v12, v4

    .line 94
    move-wide/from16 v39, v5

    .line 95
    .line 96
    sub-double v4, v35, v37

    .line 97
    .line 98
    mul-double v35, v0, v7

    .line 99
    .line 100
    mul-double v35, v35, v33

    .line 101
    .line 102
    add-double v35, p3, v35

    .line 103
    .line 104
    mul-double v37, v21, v31

    .line 105
    .line 106
    add-double v0, v35, v37

    .line 107
    .line 108
    mul-double v35, v15, v31

    .line 109
    .line 110
    mul-double v37, v19, v33

    .line 111
    .line 112
    sub-double v35, v35, v37

    .line 113
    .line 114
    mul-double v31, v31, v13

    .line 115
    .line 116
    mul-double v33, v33, v21

    .line 117
    .line 118
    add-double v31, v31, v33

    .line 119
    .line 120
    sub-double v23, v29, v23

    .line 121
    .line 122
    const/4 v6, 0x2

    .line 123
    move-wide/from16 p13, v7

    .line 124
    .line 125
    int-to-double v6, v6

    .line 126
    div-double v6, v23, v6

    .line 127
    .line 128
    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->sin(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v23

    .line 136
    const-wide/high16 v33, 0x4008000000000000L    # 3.0

    .line 137
    .line 138
    mul-double v33, v33, v6

    .line 139
    .line 140
    mul-double v33, v33, v6

    .line 141
    .line 142
    add-double v33, v2, v33

    .line 143
    .line 144
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->sqrt(D)D

    .line 145
    .line 146
    .line 147
    move-result-wide v6

    .line 148
    const/4 v8, 0x1

    .line 149
    move-wide/from16 v33, v2

    .line 150
    .line 151
    int-to-double v2, v8

    .line 152
    sub-double/2addr v6, v2

    .line 153
    mul-double v23, v23, v6

    .line 154
    .line 155
    const/4 v2, 0x3

    .line 156
    int-to-double v2, v2

    .line 157
    div-double v23, v23, v2

    .line 158
    .line 159
    mul-double v27, v27, v23

    .line 160
    .line 161
    move-wide/from16 v2, p7

    .line 162
    .line 163
    add-double v2, v2, v27

    .line 164
    .line 165
    mul-double v25, v25, v23

    .line 166
    .line 167
    add-double v6, v17, v25

    .line 168
    .line 169
    mul-double v17, v23, v35

    .line 170
    .line 171
    move-wide/from16 p7, v9

    .line 172
    .line 173
    sub-double v8, v4, v17

    .line 174
    .line 175
    mul-double v23, v23, v31

    .line 176
    .line 177
    move/from16 p9, v12

    .line 178
    .line 179
    move-wide/from16 v17, v13

    .line 180
    .line 181
    sub-double v12, v0, v23

    .line 182
    .line 183
    double-to-float v2, v2

    .line 184
    double-to-float v3, v6

    .line 185
    double-to-float v6, v8

    .line 186
    double-to-float v7, v12

    .line 187
    double-to-float v8, v4

    .line 188
    double-to-float v9, v0

    .line 189
    move-object/from16 v41, p0

    .line 190
    .line 191
    move/from16 v42, v2

    .line 192
    .line 193
    move/from16 v43, v3

    .line 194
    .line 195
    move/from16 v44, v6

    .line 196
    .line 197
    move/from16 v45, v7

    .line 198
    .line 199
    move/from16 v46, v8

    .line 200
    .line 201
    move/from16 v47, v9

    .line 202
    .line 203
    invoke-interface/range {v41 .. v47}, Landroidx/compose/ui/graphics/Path;->cubicTo(FFFFFF)V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v11, v11, 0x1

    .line 207
    .line 208
    move-wide/from16 v9, p7

    .line 209
    .line 210
    move-wide/from16 v7, p13

    .line 211
    .line 212
    move-wide/from16 p7, v4

    .line 213
    .line 214
    move-wide/from16 v13, v17

    .line 215
    .line 216
    move-wide/from16 v23, v29

    .line 217
    .line 218
    move-wide/from16 v25, v31

    .line 219
    .line 220
    move-wide/from16 v2, v33

    .line 221
    .line 222
    move-wide/from16 v27, v35

    .line 223
    .line 224
    move-wide/from16 v5, v39

    .line 225
    .line 226
    move/from16 v4, p9

    .line 227
    .line 228
    move-wide/from16 v17, v0

    .line 229
    .line 230
    move-wide/from16 v0, p5

    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_0
    return-void
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
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
.end method

.method private static final drawArc(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V
    .locals 34

    .line 1
    move-wide/from16 v13, p1

    .line 2
    .line 3
    move-wide/from16 v5, p5

    .line 4
    .line 5
    move/from16 v15, p16

    .line 6
    .line 7
    const/16 v0, 0xb4

    .line 8
    .line 9
    int-to-double v0, v0

    .line 10
    div-double v0, p13, v0

    .line 11
    .line 12
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double v16, v0, v2

    .line 18
    .line 19
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    mul-double v0, v13, v3

    .line 28
    .line 29
    mul-double v9, p3, v7

    .line 30
    .line 31
    add-double/2addr v0, v9

    .line 32
    div-double v0, v0, p9

    .line 33
    .line 34
    neg-double v9, v13

    .line 35
    mul-double/2addr v9, v7

    .line 36
    mul-double v11, p3, v3

    .line 37
    .line 38
    add-double/2addr v9, v11

    .line 39
    div-double v9, v9, p11

    .line 40
    .line 41
    mul-double v11, v5, v3

    .line 42
    .line 43
    mul-double v18, p7, v7

    .line 44
    .line 45
    add-double v11, v11, v18

    .line 46
    .line 47
    div-double v11, v11, p9

    .line 48
    .line 49
    neg-double v13, v5

    .line 50
    mul-double/2addr v13, v7

    .line 51
    mul-double v18, p7, v3

    .line 52
    .line 53
    add-double v13, v13, v18

    .line 54
    .line 55
    div-double v13, v13, p11

    .line 56
    .line 57
    sub-double v18, v0, v11

    .line 58
    .line 59
    sub-double v20, v9, v13

    .line 60
    .line 61
    add-double v22, v0, v11

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    int-to-double v5, v2

    .line 65
    div-double v22, v22, v5

    .line 66
    .line 67
    add-double v24, v9, v13

    .line 68
    .line 69
    div-double v24, v24, v5

    .line 70
    .line 71
    mul-double v5, v18, v18

    .line 72
    .line 73
    mul-double v26, v20, v20

    .line 74
    .line 75
    add-double v5, v5, v26

    .line 76
    .line 77
    const-wide/16 v26, 0x0

    .line 78
    .line 79
    cmpg-double v2, v5, v26

    .line 80
    .line 81
    const/16 v28, 0x1

    .line 82
    .line 83
    const/16 v29, 0x0

    .line 84
    .line 85
    if-nez v2, :cond_0

    .line 86
    .line 87
    move/from16 v2, v28

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move/from16 v2, v29

    .line 91
    .line 92
    :goto_0
    if-eqz v2, :cond_1

    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    const-wide/high16 v30, 0x3ff0000000000000L    # 1.0

    .line 96
    .line 97
    div-double v30, v30, v5

    .line 98
    .line 99
    const-wide/high16 v32, 0x3fd0000000000000L    # 0.25

    .line 100
    .line 101
    sub-double v30, v30, v32

    .line 102
    .line 103
    cmpg-double v2, v30, v26

    .line 104
    .line 105
    if-gez v2, :cond_2

    .line 106
    .line 107
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    const-wide v2, 0x3ffffff583a53b8eL    # 1.99999

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    div-double/2addr v0, v2

    .line 117
    double-to-float v0, v0

    .line 118
    float-to-double v0, v0

    .line 119
    mul-double v9, p9, v0

    .line 120
    .line 121
    mul-double v11, p11, v0

    .line 122
    .line 123
    move-object/from16 v0, p0

    .line 124
    .line 125
    move-wide/from16 v1, p1

    .line 126
    .line 127
    move-wide/from16 v3, p3

    .line 128
    .line 129
    move-wide/from16 v5, p5

    .line 130
    .line 131
    move-wide/from16 v7, p7

    .line 132
    .line 133
    move-wide/from16 v13, p13

    .line 134
    .line 135
    move/from16 v15, p15

    .line 136
    .line 137
    move/from16 v16, p16

    .line 138
    .line 139
    invoke-static/range {v0 .. v16}, Landroidx/compose/ui/graphics/vector/PathParserKt;->drawArc(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_2
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->sqrt(D)D

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    mul-double v18, v18, v5

    .line 148
    .line 149
    mul-double v5, v5, v20

    .line 150
    .line 151
    move/from16 v2, p15

    .line 152
    .line 153
    move/from16 v15, p16

    .line 154
    .line 155
    if-ne v2, v15, :cond_3

    .line 156
    .line 157
    sub-double v22, v22, v5

    .line 158
    .line 159
    add-double v24, v24, v18

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    add-double v22, v22, v5

    .line 163
    .line 164
    sub-double v24, v24, v18

    .line 165
    .line 166
    :goto_1
    sub-double v9, v9, v24

    .line 167
    .line 168
    sub-double v0, v0, v22

    .line 169
    .line 170
    invoke-static {v9, v10, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 171
    .line 172
    .line 173
    move-result-wide v18

    .line 174
    sub-double v13, v13, v24

    .line 175
    .line 176
    sub-double v11, v11, v22

    .line 177
    .line 178
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    sub-double v0, v0, v18

    .line 183
    .line 184
    cmpl-double v2, v0, v26

    .line 185
    .line 186
    if-ltz v2, :cond_4

    .line 187
    .line 188
    move/from16 v5, v28

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_4
    move/from16 v5, v29

    .line 192
    .line 193
    :goto_2
    if-eq v15, v5, :cond_6

    .line 194
    .line 195
    const-wide v5, 0x401921fb54442d18L    # 6.283185307179586

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    if-lez v2, :cond_5

    .line 201
    .line 202
    sub-double/2addr v0, v5

    .line 203
    goto :goto_3

    .line 204
    :cond_5
    add-double/2addr v0, v5

    .line 205
    :cond_6
    :goto_3
    move-wide/from16 v20, v0

    .line 206
    .line 207
    mul-double v22, v22, p9

    .line 208
    .line 209
    mul-double v24, v24, p11

    .line 210
    .line 211
    mul-double v0, v22, v3

    .line 212
    .line 213
    mul-double v5, v24, v7

    .line 214
    .line 215
    sub-double v1, v0, v5

    .line 216
    .line 217
    mul-double v22, v22, v7

    .line 218
    .line 219
    mul-double v24, v24, v3

    .line 220
    .line 221
    add-double v3, v22, v24

    .line 222
    .line 223
    move-object/from16 v0, p0

    .line 224
    .line 225
    move-wide/from16 v5, p9

    .line 226
    .line 227
    move-wide/from16 v7, p11

    .line 228
    .line 229
    move-wide/from16 v9, p1

    .line 230
    .line 231
    move-wide/from16 v11, p3

    .line 232
    .line 233
    move-wide/from16 v13, v16

    .line 234
    .line 235
    move-wide/from16 v15, v18

    .line 236
    .line 237
    move-wide/from16 v17, v20

    .line 238
    .line 239
    invoke-static/range {v0 .. v18}, Landroidx/compose/ui/graphics/vector/PathParserKt;->arcToBezier(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V

    .line 240
    .line 241
    .line 242
    return-void
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
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
.end method

.method public static final getEmptyArray()[F
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/ui/graphics/vector/PathParserKt;->EmptyArray:[F

    return-object v0
.end method

.method public static final toPath(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;
    .locals 25
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/graphics/Path;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;",
            "Landroidx/compose/ui/graphics/Path;",
            ")",
            "Landroidx/compose/ui/graphics/Path;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/Path;->getFillType-Rg-k1Os()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/Path;->rewind()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v14, v1}, Landroidx/compose/ui/graphics/Path;->setFillType-oQ8Xj4U(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Landroidx/compose/ui/graphics/vector/PathNode$Close;->INSTANCE:Landroidx/compose/ui/graphics/vector/PathNode$Close;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 30
    .line 31
    :goto_0
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v15

    .line 35
    const/4 v12, 0x0

    .line 36
    move v13, v2

    .line 37
    move v2, v12

    .line 38
    move v3, v2

    .line 39
    move v8, v3

    .line 40
    move v9, v8

    .line 41
    move v10, v9

    .line 42
    move v11, v10

    .line 43
    :goto_1
    if-ge v13, v15, :cond_18

    .line 44
    .line 45
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v7, v4

    .line 50
    check-cast v7, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 51
    .line 52
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$Close;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v14, v10, v11}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v19, v7

    .line 63
    .line 64
    move v2, v10

    .line 65
    move v8, v2

    .line 66
    move v3, v11

    .line 67
    move v9, v3

    .line 68
    :goto_2
    move/from16 v23, v12

    .line 69
    .line 70
    move/from16 v22, v13

    .line 71
    .line 72
    move v0, v15

    .line 73
    goto/16 :goto_b

    .line 74
    .line 75
    :cond_1
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    move-object v1, v7

    .line 80
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;->getDx()F

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    add-float/2addr v8, v4

    .line 87
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;->getDy()F

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    add-float/2addr v9, v4

    .line 92
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;->getDx()F

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;->getDy()F

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-interface {v14, v4, v1}, Landroidx/compose/ui/graphics/Path;->relativeMoveTo(FF)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v19, v7

    .line 104
    .line 105
    move v10, v8

    .line 106
    move v11, v9

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 109
    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    move-object v1, v7

    .line 113
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 114
    .line 115
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;->getX()F

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;->getY()F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;->getX()F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;->getY()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-interface {v14, v6, v1}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 132
    .line 133
    .line 134
    move v8, v4

    .line 135
    move v10, v8

    .line 136
    move v9, v5

    .line 137
    move v11, v9

    .line 138
    :goto_3
    move-object/from16 v19, v7

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 142
    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    move-object v1, v7

    .line 146
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;->getDx()F

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;->getDy()F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    invoke-interface {v14, v4, v5}, Landroidx/compose/ui/graphics/Path;->relativeLineTo(FF)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;->getDx()F

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    add-float/2addr v8, v4

    .line 164
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;->getDy()F

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    :goto_4
    add-float/2addr v9, v1

    .line 169
    goto :goto_3

    .line 170
    :cond_4
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 171
    .line 172
    if-eqz v4, :cond_5

    .line 173
    .line 174
    move-object v1, v7

    .line 175
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 176
    .line 177
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;->getX()F

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;->getY()F

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    invoke-interface {v14, v4, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;->getX()F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;->getY()F

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    move v9, v1

    .line 197
    move v8, v4

    .line 198
    goto :goto_3

    .line 199
    :cond_5
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    .line 200
    .line 201
    if-eqz v4, :cond_6

    .line 202
    .line 203
    move-object v1, v7

    .line 204
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    .line 205
    .line 206
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;->getDx()F

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-interface {v14, v4, v12}, Landroidx/compose/ui/graphics/Path;->relativeLineTo(FF)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;->getDx()F

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    add-float/2addr v8, v1

    .line 218
    goto :goto_3

    .line 219
    :cond_6
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    .line 220
    .line 221
    if-eqz v4, :cond_7

    .line 222
    .line 223
    move-object v1, v7

    .line 224
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;->getX()F

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    invoke-interface {v14, v4, v9}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;->getX()F

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    move v8, v1

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    .line 240
    .line 241
    if-eqz v4, :cond_8

    .line 242
    .line 243
    move-object v1, v7

    .line 244
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    .line 245
    .line 246
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;->getDy()F

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-interface {v14, v12, v4}, Landroidx/compose/ui/graphics/Path;->relativeLineTo(FF)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;->getDy()F

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    goto :goto_4

    .line 258
    :cond_8
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    .line 259
    .line 260
    if-eqz v4, :cond_9

    .line 261
    .line 262
    move-object v1, v7

    .line 263
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    .line 264
    .line 265
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;->getY()F

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-interface {v14, v8, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;->getY()F

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    move v9, v1

    .line 277
    goto/16 :goto_3

    .line 278
    .line 279
    :cond_9
    instance-of v4, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 280
    .line 281
    if-eqz v4, :cond_a

    .line 282
    .line 283
    move-object/from16 v16, v7

    .line 284
    .line 285
    check-cast v16, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 286
    .line 287
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDx1()F

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDy1()F

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDx2()F

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDy2()F

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDx3()F

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDy3()F

    .line 308
    .line 309
    .line 310
    move-result v17

    .line 311
    move-object/from16 v1, p1

    .line 312
    .line 313
    move-object v0, v7

    .line 314
    move/from16 v7, v17

    .line 315
    .line 316
    invoke-interface/range {v1 .. v7}, Landroidx/compose/ui/graphics/Path;->relativeCubicTo(FFFFFF)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDx2()F

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    add-float/2addr v1, v8

    .line 324
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDy2()F

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    add-float/2addr v2, v9

    .line 329
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDx3()F

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    add-float/2addr v8, v3

    .line 334
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;->getDy3()F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    :goto_5
    add-float/2addr v9, v3

    .line 339
    move-object/from16 v19, v0

    .line 340
    .line 341
    move v3, v2

    .line 342
    move/from16 v23, v12

    .line 343
    .line 344
    move/from16 v22, v13

    .line 345
    .line 346
    move v0, v15

    .line 347
    :goto_6
    move v2, v1

    .line 348
    goto/16 :goto_b

    .line 349
    .line 350
    :cond_a
    move-object v0, v7

    .line 351
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 352
    .line 353
    if-eqz v4, :cond_b

    .line 354
    .line 355
    move-object v8, v0

    .line 356
    check-cast v8, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 357
    .line 358
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getX1()F

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getY1()F

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getX2()F

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getY2()F

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getX3()F

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getY3()F

    .line 379
    .line 380
    .line 381
    move-result v7

    .line 382
    move-object/from16 v1, p1

    .line 383
    .line 384
    invoke-interface/range {v1 .. v7}, Landroidx/compose/ui/graphics/Path;->cubicTo(FFFFFF)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getX2()F

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getY2()F

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getX3()F

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;->getY3()F

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    :goto_7
    move-object/from16 v19, v0

    .line 404
    .line 405
    move v8, v3

    .line 406
    move v9, v4

    .line 407
    move/from16 v23, v12

    .line 408
    .line 409
    move/from16 v22, v13

    .line 410
    .line 411
    move v0, v15

    .line 412
    move v3, v2

    .line 413
    goto :goto_6

    .line 414
    :cond_b
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 415
    .line 416
    if-eqz v4, :cond_d

    .line 417
    .line 418
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode;->isCurve()Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_c

    .line 423
    .line 424
    sub-float v1, v8, v2

    .line 425
    .line 426
    sub-float v2, v9, v3

    .line 427
    .line 428
    move v3, v2

    .line 429
    move v2, v1

    .line 430
    goto :goto_8

    .line 431
    :cond_c
    move v2, v12

    .line 432
    move v3, v2

    .line 433
    :goto_8
    move-object/from16 v16, v0

    .line 434
    .line 435
    check-cast v16, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 436
    .line 437
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDx1()F

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDy1()F

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDx2()F

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDy2()F

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    move-object/from16 v1, p1

    .line 454
    .line 455
    invoke-interface/range {v1 .. v7}, Landroidx/compose/ui/graphics/Path;->relativeCubicTo(FFFFFF)V

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDx1()F

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    add-float/2addr v1, v8

    .line 463
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDy1()F

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    add-float/2addr v2, v9

    .line 468
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDx2()F

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    add-float/2addr v8, v3

    .line 473
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;->getDy2()F

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    goto/16 :goto_5

    .line 478
    .line 479
    :cond_d
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 480
    .line 481
    const/4 v5, 0x2

    .line 482
    if-eqz v4, :cond_f

    .line 483
    .line 484
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode;->isCurve()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-eqz v1, :cond_e

    .line 489
    .line 490
    int-to-float v1, v5

    .line 491
    mul-float/2addr v8, v1

    .line 492
    sub-float/2addr v8, v2

    .line 493
    mul-float/2addr v1, v9

    .line 494
    sub-float/2addr v1, v3

    .line 495
    move v3, v1

    .line 496
    move v2, v8

    .line 497
    goto :goto_9

    .line 498
    :cond_e
    move v2, v8

    .line 499
    move v3, v9

    .line 500
    :goto_9
    move-object v8, v0

    .line 501
    check-cast v8, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 502
    .line 503
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getX1()F

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getY1()F

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getX2()F

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getY2()F

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    move-object/from16 v1, p1

    .line 520
    .line 521
    invoke-interface/range {v1 .. v7}, Landroidx/compose/ui/graphics/Path;->cubicTo(FFFFFF)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getX1()F

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getY1()F

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getX2()F

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;->getY2()F

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    goto/16 :goto_7

    .line 541
    .line 542
    :cond_f
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 543
    .line 544
    if-eqz v4, :cond_10

    .line 545
    .line 546
    move-object v7, v0

    .line 547
    check-cast v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 548
    .line 549
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDx1()F

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDy1()F

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDx2()F

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDy2()F

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    invoke-interface {v14, v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Path;->relativeQuadraticBezierTo(FFFF)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDx1()F

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    add-float/2addr v1, v8

    .line 573
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDy1()F

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    add-float/2addr v2, v9

    .line 578
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDx2()F

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    add-float/2addr v8, v3

    .line 583
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;->getDy2()F

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    goto/16 :goto_5

    .line 588
    .line 589
    :cond_10
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 590
    .line 591
    if-eqz v4, :cond_11

    .line 592
    .line 593
    move-object v7, v0

    .line 594
    check-cast v7, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 595
    .line 596
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getX1()F

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getY1()F

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getX2()F

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getY2()F

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    invoke-interface {v14, v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Path;->quadraticBezierTo(FFFF)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getX1()F

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getY1()F

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getX2()F

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;->getY2()F

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    goto/16 :goto_7

    .line 632
    .line 633
    :cond_11
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    .line 634
    .line 635
    if-eqz v4, :cond_13

    .line 636
    .line 637
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode;->isQuad()Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-eqz v1, :cond_12

    .line 642
    .line 643
    sub-float v1, v8, v2

    .line 644
    .line 645
    sub-float v2, v9, v3

    .line 646
    .line 647
    goto :goto_a

    .line 648
    :cond_12
    move v1, v12

    .line 649
    move v2, v1

    .line 650
    :goto_a
    move-object v7, v0

    .line 651
    check-cast v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    .line 652
    .line 653
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;->getDx()F

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;->getDy()F

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    invoke-interface {v14, v1, v2, v3, v4}, Landroidx/compose/ui/graphics/Path;->relativeQuadraticBezierTo(FFFF)V

    .line 662
    .line 663
    .line 664
    add-float/2addr v1, v8

    .line 665
    add-float/2addr v2, v9

    .line 666
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;->getDx()F

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    add-float/2addr v8, v3

    .line 671
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;->getDy()F

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    goto/16 :goto_5

    .line 676
    .line 677
    :cond_13
    instance-of v4, v0, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    .line 678
    .line 679
    if-eqz v4, :cond_15

    .line 680
    .line 681
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode;->isQuad()Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-eqz v1, :cond_14

    .line 686
    .line 687
    int-to-float v1, v5

    .line 688
    mul-float/2addr v8, v1

    .line 689
    sub-float/2addr v8, v2

    .line 690
    mul-float/2addr v1, v9

    .line 691
    sub-float v9, v1, v3

    .line 692
    .line 693
    :cond_14
    move-object v7, v0

    .line 694
    check-cast v7, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    .line 695
    .line 696
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;->getX()F

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;->getY()F

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    invoke-interface {v14, v8, v9, v1, v2}, Landroidx/compose/ui/graphics/Path;->quadraticBezierTo(FFFF)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;->getX()F

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;->getY()F

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    move-object/from16 v19, v0

    .line 716
    .line 717
    move v3, v9

    .line 718
    move/from16 v23, v12

    .line 719
    .line 720
    move/from16 v22, v13

    .line 721
    .line 722
    move v0, v15

    .line 723
    move v9, v2

    .line 724
    move v2, v8

    .line 725
    move v8, v1

    .line 726
    goto/16 :goto_b

    .line 727
    .line 728
    :cond_15
    instance-of v1, v0, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 729
    .line 730
    if-eqz v1, :cond_16

    .line 731
    .line 732
    move-object v1, v0

    .line 733
    check-cast v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 734
    .line 735
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->getArcStartDx()F

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    add-float v6, v2, v8

    .line 740
    .line 741
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->getArcStartDy()F

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    add-float v7, v2, v9

    .line 746
    .line 747
    float-to-double v2, v8

    .line 748
    float-to-double v4, v9

    .line 749
    float-to-double v8, v6

    .line 750
    move-object/from16 v19, v0

    .line 751
    .line 752
    move/from16 v18, v6

    .line 753
    .line 754
    move v0, v7

    .line 755
    move-wide v6, v8

    .line 756
    float-to-double v8, v0

    .line 757
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->getHorizontalEllipseRadius()F

    .line 758
    .line 759
    .line 760
    move-result v12

    .line 761
    move/from16 v17, v10

    .line 762
    .line 763
    move/from16 v20, v11

    .line 764
    .line 765
    float-to-double v10, v12

    .line 766
    move/from16 v21, v20

    .line 767
    .line 768
    move/from16 v20, v17

    .line 769
    .line 770
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->getVerticalEllipseRadius()F

    .line 771
    .line 772
    .line 773
    move-result v12

    .line 774
    move/from16 v17, v13

    .line 775
    .line 776
    float-to-double v12, v12

    .line 777
    move/from16 v22, v17

    .line 778
    .line 779
    const/16 v23, 0x0

    .line 780
    .line 781
    move/from16 v24, v0

    .line 782
    .line 783
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->getTheta()F

    .line 784
    .line 785
    .line 786
    move-result v0

    .line 787
    move/from16 v16, v15

    .line 788
    .line 789
    float-to-double v14, v0

    .line 790
    move/from16 v0, v16

    .line 791
    .line 792
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->isMoreThanHalf()Z

    .line 793
    .line 794
    .line 795
    move-result v16

    .line 796
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;->isPositiveArc()Z

    .line 797
    .line 798
    .line 799
    move-result v17

    .line 800
    move-object/from16 v1, p1

    .line 801
    .line 802
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/PathParserKt;->drawArc(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V

    .line 803
    .line 804
    .line 805
    move/from16 v2, v18

    .line 806
    .line 807
    move v8, v2

    .line 808
    move/from16 v10, v20

    .line 809
    .line 810
    move/from16 v11, v21

    .line 811
    .line 812
    move/from16 v3, v24

    .line 813
    .line 814
    move v9, v3

    .line 815
    goto :goto_b

    .line 816
    :cond_16
    move-object v1, v0

    .line 817
    move/from16 v20, v10

    .line 818
    .line 819
    move/from16 v21, v11

    .line 820
    .line 821
    move/from16 v23, v12

    .line 822
    .line 823
    move/from16 v22, v13

    .line 824
    .line 825
    move v0, v15

    .line 826
    instance-of v4, v1, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 827
    .line 828
    if-eqz v4, :cond_17

    .line 829
    .line 830
    float-to-double v2, v8

    .line 831
    float-to-double v4, v9

    .line 832
    move-object/from16 v18, v1

    .line 833
    .line 834
    check-cast v18, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 835
    .line 836
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getArcStartX()F

    .line 837
    .line 838
    .line 839
    move-result v6

    .line 840
    float-to-double v6, v6

    .line 841
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getArcStartY()F

    .line 842
    .line 843
    .line 844
    move-result v8

    .line 845
    float-to-double v8, v8

    .line 846
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getHorizontalEllipseRadius()F

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    float-to-double v10, v10

    .line 851
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getVerticalEllipseRadius()F

    .line 852
    .line 853
    .line 854
    move-result v12

    .line 855
    float-to-double v12, v12

    .line 856
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getTheta()F

    .line 857
    .line 858
    .line 859
    move-result v14

    .line 860
    float-to-double v14, v14

    .line 861
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->isMoreThanHalf()Z

    .line 862
    .line 863
    .line 864
    move-result v16

    .line 865
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->isPositiveArc()Z

    .line 866
    .line 867
    .line 868
    move-result v17

    .line 869
    move-object/from16 v19, v1

    .line 870
    .line 871
    move-object/from16 v1, p1

    .line 872
    .line 873
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/PathParserKt;->drawArc(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V

    .line 874
    .line 875
    .line 876
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getArcStartX()F

    .line 877
    .line 878
    .line 879
    move-result v1

    .line 880
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;->getArcStartY()F

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    move v8, v1

    .line 885
    move v3, v2

    .line 886
    move v9, v3

    .line 887
    move/from16 v10, v20

    .line 888
    .line 889
    move/from16 v11, v21

    .line 890
    .line 891
    move v2, v8

    .line 892
    goto :goto_b

    .line 893
    :cond_17
    move-object/from16 v19, v1

    .line 894
    .line 895
    move/from16 v10, v20

    .line 896
    .line 897
    move/from16 v11, v21

    .line 898
    .line 899
    :goto_b
    add-int/lit8 v13, v22, 0x1

    .line 900
    .line 901
    move-object/from16 v14, p1

    .line 902
    .line 903
    move v15, v0

    .line 904
    move-object/from16 v1, v19

    .line 905
    .line 906
    move/from16 v12, v23

    .line 907
    .line 908
    move-object/from16 v0, p0

    .line 909
    .line 910
    goto/16 :goto_1

    .line 911
    .line 912
    :cond_18
    return-object p1
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public static synthetic toPath$default(Ljava/util/List;Landroidx/compose/ui/graphics/Path;ILjava/lang/Object;)Landroidx/compose/ui/graphics/Path;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/vector/PathParserKt;->toPath(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;

    move-result-object p0

    return-object p0
.end method

.method private static final toRadians(D)D
    .locals 2

    const/16 v0, 0xb4

    int-to-double v0, v0

    div-double/2addr p0, v0

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr p0, v0

    return-wide p0
.end method
