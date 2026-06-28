.class public Lcom/ss/android/socialbase/downloader/f/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/f/f;
.implements Lcom/ss/android/socialbase/downloader/network/c$a;


# instance fields
.field private A:I

.field private final B:Z

.field private final C:Lcom/ss/android/socialbase/downloader/h/e$b;

.field private final D:Lcom/ss/android/socialbase/downloader/h/e$b;

.field private final a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private final b:Lcom/ss/android/socialbase/downloader/f/n;

.field private final c:Lcom/ss/android/socialbase/downloader/f/b;

.field private final d:Lcom/ss/android/socialbase/downloader/h/f;

.field private final e:Lcom/ss/android/socialbase/downloader/f/g;

.field private volatile f:Z

.field private volatile g:Z

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/m;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/q;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/ss/android/socialbase/downloader/model/d;

.field private k:Lcom/ss/android/socialbase/downloader/model/d;

.field private volatile l:Z

.field private m:J

.field private final n:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private volatile r:Z

.field private final s:Ljava/lang/Object;

.field private final t:Lcom/ss/android/socialbase/downloader/i/e;

.field private final u:Lcom/ss/android/socialbase/downloader/h/e;

.field private volatile v:Z

.field private w:J

.field private x:J

.field private y:J

.field private z:F


# direct methods
.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/n;Lcom/ss/android/socialbase/downloader/h/f;)V
    .locals 4
    .param p1    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/socialbase/downloader/f/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->l:Z

    .line 25
    .line 26
    new-instance v2, Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/Object;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    .line 46
    .line 47
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->v:Z

    .line 48
    .line 49
    new-instance v2, Lcom/ss/android/socialbase/downloader/f/k$1;

    .line 50
    .line 51
    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/downloader/f/k$1;-><init>(Lcom/ss/android/socialbase/downloader/f/k;)V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->C:Lcom/ss/android/socialbase/downloader/h/e$b;

    .line 55
    .line 56
    new-instance v2, Lcom/ss/android/socialbase/downloader/f/k$2;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/downloader/f/k$2;-><init>(Lcom/ss/android/socialbase/downloader/f/k;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->D:Lcom/ss/android/socialbase/downloader/h/e$b;

    .line 62
    .line 63
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 64
    .line 65
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    .line 66
    .line 67
    new-instance v2, Lcom/ss/android/socialbase/downloader/f/b;

    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/n;->d()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/n;->e()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-direct {v2, v3, p2}, Lcom/ss/android/socialbase/downloader/f/b;-><init>(II)V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    .line 81
    .line 82
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/f/k;->d:Lcom/ss/android/socialbase/downloader/h/f;

    .line 83
    .line 84
    new-instance p2, Lcom/ss/android/socialbase/downloader/f/g;

    .line 85
    .line 86
    invoke-direct {p2, p1, p3, v2}, Lcom/ss/android/socialbase/downloader/f/g;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/h/f;Lcom/ss/android/socialbase/downloader/f/c;)V

    .line 87
    .line 88
    .line 89
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->e:Lcom/ss/android/socialbase/downloader/f/g;

    .line 90
    .line 91
    new-instance p2, Lcom/ss/android/socialbase/downloader/h/e;

    .line 92
    .line 93
    invoke-direct {p2}, Lcom/ss/android/socialbase/downloader/h/e;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    .line 97
    .line 98
    new-instance p2, Lcom/ss/android/socialbase/downloader/i/e;

    .line 99
    .line 100
    invoke-direct {p2}, Lcom/ss/android/socialbase/downloader/i/e;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->t:Lcom/ss/android/socialbase/downloader/i/e;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string p2, "debug"

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-ne p1, v1, :cond_0

    .line 120
    .line 121
    move v0, v1

    .line 122
    :cond_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    .line 123
    .line 124
    return-void
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
    .line 1148
    .line 1149
.end method

.method private a(J)I
    .locals 5

    .line 126
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 127
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/f/i;

    .line 128
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_0

    return v1

    .line 129
    :cond_0
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

.method private a(Ljava/lang/String;)I
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 44
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/f/q;

    .line 45
    iget-object v2, v2, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private a(II)J
    .locals 5

    .line 130
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/i;

    .line 131
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/i;)J

    move-result-wide v1

    add-int/lit8 p1, p1, 0x1

    if-ge p1, p2, :cond_0

    .line 132
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/socialbase/downloader/f/i;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return-wide v1

    .line 133
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide p1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v3

    sub-long/2addr p1, v3

    const-wide/16 v3, -0x1

    cmp-long v0, v1, v3

    if-nez v0, :cond_2

    return-wide p1

    .line 134
    :cond_2
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/f/i;)J
    .locals 6

    .line 135
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    .line 136
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    .line 137
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v0

    sub-long v0, v2, v0

    :cond_0
    return-wide v0
.end method

.method private a(JJJI)Lcom/ss/android/socialbase/downloader/f/m;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 160
    iget-object v3, v0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide v4, 0x7fffffffffffffffL

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, ", threadIndex = "

    const-string v11, "SegmentDispatcher"

    if-eqz v9, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ss/android/socialbase/downloader/f/m;

    .line 161
    iget-wide v12, v9, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    const-wide/16 v14, 0x0

    cmp-long v12, v12, v14

    if-lez v12, :cond_3

    add-int/lit8 v7, v7, 0x1

    .line 162
    iget-wide v12, v9, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    cmp-long v12, v12, v1

    if-gez v12, :cond_1

    move-wide/from16 v12, p3

    move/from16 v16, v7

    .line 163
    invoke-virtual {v9, v1, v2, v12, v13}, Lcom/ss/android/socialbase/downloader/f/m;->a(JJ)J

    move-result-wide v6

    .line 164
    iget-boolean v14, v0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    if-eqz v14, :cond_0

    .line 165
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "findPoorReadThread: speed = "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, v9, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-wide/16 v10, 0x0

    cmp-long v10, v6, v10

    if-ltz v10, :cond_2

    cmp-long v10, v6, v4

    if-gez v10, :cond_2

    move-wide v4, v6

    move-object v8, v9

    goto :goto_1

    :cond_1
    move-wide/from16 v12, p3

    move/from16 v16, v7

    :cond_2
    :goto_1
    move/from16 v7, v16

    goto :goto_0

    :cond_3
    move-wide/from16 v12, p3

    goto :goto_0

    :cond_4
    if-eqz v8, :cond_5

    move/from16 v1, p7

    if-lt v7, v1, :cond_5

    cmp-long v1, v4, p5

    if-gez v1, :cond_5

    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "findPoorReadThread: ----------- minSpeed = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v8, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v8

    :cond_5
    const/4 v1, 0x0

    return-object v1
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/f/k;ZJJ)Lcom/ss/android/socialbase/downloader/f/m;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/ss/android/socialbase/downloader/f/k;->a(ZJJ)Lcom/ss/android/socialbase/downloader/f/m;

    move-result-object p0

    return-object p0
.end method

.method private a(ZJJ)Lcom/ss/android/socialbase/downloader/f/m;
    .locals 7

    .line 138
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/f/m;

    .line 139
    iget v3, v2, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    if-nez v3, :cond_1

    if-nez p1, :cond_1

    goto :goto_0

    .line 140
    :cond_1
    iget-wide v3, v2, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_0

    iget-wide v3, v2, Lcom/ss/android/socialbase/downloader/f/m;->e:J

    cmp-long v3, v3, v5

    if-gtz v3, :cond_0

    iget-wide v3, v2, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    sub-long v3, p2, v3

    cmp-long v3, v3, p4

    if-lez v3, :cond_0

    if-nez v1, :cond_2

    :goto_1
    move-object v1, v2

    goto :goto_0

    .line 141
    :cond_2
    iget-wide v3, v2, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/f/m;->d:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 3

    const-string v0, "SegmentDispatcher"

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError, e = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 96
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/b;->c()V

    .line 97
    monitor-enter p0

    .line 98
    :try_start_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/m;

    .line 99
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/m;->e()V

    goto :goto_0

    .line 100
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/f/q;)V
    .locals 7

    .line 51
    new-instance v6, Lcom/ss/android/socialbase/downloader/f/m;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    move-object v0, v6

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/f/m;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/k;Lcom/ss/android/socialbase/downloader/f/c;Lcom/ss/android/socialbase/downloader/f/q;I)V

    .line 52
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->q()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 54
    invoke-interface {p1, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-virtual {v6, p1}, Lcom/ss/android/socialbase/downloader/f/m;->a(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private a(Lcom/ss/android/socialbase/downloader/model/d;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v0, :cond_0

    return-void

    .line 103
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide v1

    .line 104
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide v3

    cmp-long v5, v1, v3

    const/16 v6, 0x432

    const-string v7, "SegmentDispatcher"

    if-eqz v5, :cond_2

    .line 105
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "total len not equals,len="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ",sLen="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ",code="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, p1, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ",sCode="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, v0, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ",range="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/d;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ",sRange = "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/d;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ",url = "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p1, Lcom/ss/android/socialbase/downloader/model/d;->a:Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ",sUrl="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v0, Lcom/ss/android/socialbase/downloader/model/d;->a:Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 107
    invoke-static {v7, v5}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v8, 0x0

    cmp-long v1, v1, v8

    if-lez v1, :cond_2

    cmp-long v1, v3, v8

    if-gtz v1, :cond_1

    goto :goto_0

    .line 108
    :cond_1
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {p1, v6, v5}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw p1

    .line 109
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/d;->c()Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/d;->c()Ljava/lang/String;

    move-result-object v0

    .line 111
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "etag not equals with main url, etag = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", mainEtag = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-static {v7, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 116
    :cond_3
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {p1, v6, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void
.end method

.method private a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            "Z)V"
        }
    .end annotation

    .line 46
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v0

    .line 47
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 48
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v4

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {p1, v3, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    if-eqz p3, :cond_1

    .line 50
    invoke-virtual {p2, v2}, Lcom/ss/android/socialbase/downloader/f/i;->a(I)V

    :cond_1
    return-void
.end method

.method private a(JJ)Z
    .locals 9

    .line 148
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->t:Lcom/ss/android/socialbase/downloader/i/e;

    sub-long v2, p1, p3

    invoke-virtual {v0, v2, v3, p1, p2}, Lcom/ss/android/socialbase/downloader/i/e;->b(JJ)J

    move-result-wide v0

    .line 149
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    int-to-long v5, v4

    .line 150
    div-long/2addr v0, v5

    :cond_0
    long-to-float v0, v0

    .line 151
    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->z:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-long v6, v0

    .line 152
    div-int/lit8 v8, v4, 0x2

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/ss/android/socialbase/downloader/f/k;->a(JJJI)Lcom/ss/android/socialbase/downloader/f/m;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "SegmentDispatcher"

    if-eqz v0, :cond_1

    .line 153
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->c(Lcom/ss/android/socialbase/downloader/f/m;)Z

    .line 154
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "handlePoorReadThread: reconnect for poor speed, threadIndex = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, v0, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/m;->f()V

    return v1

    :cond_1
    const/4 v4, 0x1

    move-object v3, p0

    move-wide v5, p1

    move-wide v7, p3

    .line 156
    invoke-direct/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/f/k;->a(ZJJ)Lcom/ss/android/socialbase/downloader/f/m;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 157
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->c(Lcom/ss/android/socialbase/downloader/f/m;)Z

    .line 158
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "handlePoorReadThread: reconnect for connect timeout, threadIndex = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/m;->f()V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/f/k;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    return p0
.end method

.method static synthetic a(Lcom/ss/android/socialbase/downloader/f/k;Lcom/ss/android/socialbase/downloader/f/m;)Z
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->c(Lcom/ss/android/socialbase/downloader/f/m;)Z

    move-result p0

    return p0
.end method

.method private a(Lcom/ss/android/socialbase/downloader/f/m;JJJD)Z
    .locals 6

    .line 142
    iget-wide v0, p1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 143
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->t:Lcom/ss/android/socialbase/downloader/i/e;

    invoke-virtual {v0, p2, p3, p4, p5}, Lcom/ss/android/socialbase/downloader/i/e;->b(JJ)J

    move-result-wide v0

    .line 144
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    int-to-long v2, v2

    .line 145
    div-long v2, v0, v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    .line 146
    :goto_0
    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/ss/android/socialbase/downloader/f/m;->a(JJ)J

    move-result-wide p2

    cmp-long p4, p2, p6

    if-ltz p4, :cond_1

    long-to-double p4, p2

    long-to-double v4, v2

    mul-double/2addr v4, p8

    cmpg-double p4, p4, v4

    if-gez p4, :cond_2

    .line 147
    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "isDownloadSpeedPoor: totalSpeed = "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p5, ", threadAvgSpeed = "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p5, ", poorSpeed = "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6, p7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p5, ", speed = "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ",threadIndex = "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SegmentDispatcher"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;
    .locals 6

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    if-nez v0, :cond_3

    .line 24
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/i;

    if-nez v0, :cond_1

    goto :goto_0

    .line 25
    :cond_1
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-direct {p0, v4, v0, v1}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    .line 26
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/i;)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-gtz v1, :cond_2

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    cmp-long v1, v4, v2

    if-gtz v1, :cond_0

    :cond_2
    return-object v0

    .line 27
    :cond_3
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->m()V

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/f/k;->c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 29
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/i;)J

    move-result-wide v4

    cmp-long p2, v4, v2

    if-lez p2, :cond_4

    .line 30
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-direct {p0, p2, p1, v1}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    return-object p1

    .line 31
    :cond_4
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->p()Lcom/ss/android/socialbase/downloader/f/i;

    move-result-object p1

    if-eqz p1, :cond_5

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method private b(J)V
    .locals 3

    .line 90
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->t:Lcom/ss/android/socialbase/downloader/i/e;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/ss/android/socialbase/downloader/i/e;->a(JJ)Z

    .line 91
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/m;

    .line 92
    invoke-virtual {v1, p1, p2}, Lcom/ss/android/socialbase/downloader/f/m;->b(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/model/d;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 48
    iget-object v0, p2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-eqz v0, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 p2, 0x1

    const-string p3, "segment already has an owner"

    invoke-direct {p1, p2, p3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw p1

    .line 50
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/m;->h()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_b

    .line 51
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/d;->b()Z

    move-result p1

    const-wide/16 v0, 0x0

    if-nez p1, :cond_4

    .line 52
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v2

    cmp-long p1, v2, v0

    const/16 v2, 0x3ec

    if-gtz p1, :cond_3

    const-string p1, "SegmentDispatcher"

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parseHttpResponse: segment.getCurrentOffsetRead = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 55
    :cond_2
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/b;

    iget p3, p4, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "2: response code error : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p4, p4, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " segment="

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v2, p3, p2}, Lcom/ss/android/socialbase/downloader/exception/b;-><init>(IILjava/lang/String;)V

    throw p1

    .line 56
    :cond_3
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/b;

    iget p3, p4, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "1: response code error : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p4, p4, Lcom/ss/android/socialbase/downloader/model/d;->c:I

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " segment="

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v2, p3, p2}, Lcom/ss/android/socialbase/downloader/exception/b;-><init>(IILjava/lang/String;)V

    throw p1

    .line 57
    :cond_4
    :goto_1
    iget-boolean p1, p3, Lcom/ss/android/socialbase/downloader/f/q;->d:Z

    if-eqz p1, :cond_8

    .line 58
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez p1, :cond_a

    .line 59
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    .line 60
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    monitor-enter p1

    .line 61
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 62
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->d:Lcom/ss/android/socialbase/downloader/h/f;

    if-eqz p1, :cond_5

    .line 64
    iget-object p3, p3, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    iget-object v2, p4, Lcom/ss/android/socialbase/downloader/model/d;->b:Lcom/ss/android/socialbase/downloader/network/g;

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v3

    invoke-interface {p1, p3, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/h/f;->a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/g;J)V

    .line 65
    :cond_5
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-lez p3, :cond_a

    .line 66
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_6
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_a

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ss/android/socialbase/downloader/f/i;

    .line 67
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v2

    cmp-long v2, v2, v0

    const-wide/16 v3, 0x1

    if-lez v2, :cond_7

    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v5

    sub-long v7, p1, v3

    cmp-long v2, v5, v7

    if-lez v2, :cond_6

    :cond_7
    sub-long v2, p1, v3

    .line 68
    invoke-virtual {p4, v2, v3}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    goto :goto_2

    :catchall_0
    move-exception p2

    .line 69
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    .line 70
    :cond_8
    invoke-direct {p0, p4}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/model/d;)V

    .line 71
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez p1, :cond_a

    .line 72
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    .line 73
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide p1

    cmp-long p1, p1, v0

    if-gtz p1, :cond_9

    .line 74
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide p1

    const-string p4, "SegmentDispatcher"

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkSegmentHttpResponse:len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p3, Lcom/ss/android/socialbase/downloader/f/q;->a:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p4, p3}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 77
    :cond_9
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    monitor-enter p1

    .line 78
    :try_start_2
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notify()V

    .line 79
    monitor-exit p1

    goto :goto_3

    :catchall_1
    move-exception p2

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p2

    :cond_a
    :goto_3
    return-void

    .line 80
    :cond_b
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 p2, 0x5

    const-string p3, "applySegment"

    invoke-direct {p1, p2, p3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method private b(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/q;",
            ">;)V"
        }
    .end annotation

    .line 15
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/q;

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addIpListLocked: urlRecord = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SegmentDispatcher"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->l()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    .line 19
    :cond_1
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_2

    .line 20
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 21
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    add-int/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    return-void

    .line 22
    :cond_2
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    const-string v0, "SegmentDispatcher"

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initSegments: getExpectFileLength = "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_0
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/i;

    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    new-instance v3, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-direct {v3, v1}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(Lcom/ss/android/socialbase/downloader/f/i;)V

    invoke-direct {p0, v2, v3, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->d(Ljava/util/List;)V

    .line 11
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->c(Ljava/util/List;)V

    goto :goto_2

    .line 12
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    new-instance v1, Lcom/ss/android/socialbase/downloader/f/i;

    const-wide/16 v4, -0x1

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(JJ)V

    invoke-direct {p0, p1, v1, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    :goto_2
    const-string p1, "SegmentDispatcher"

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initSegments: totalLength = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic b(Lcom/ss/android/socialbase/downloader/f/k;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    return p0
.end method

.method private c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 48
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const-wide/16 v3, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_1

    .line 49
    invoke-direct {v0, v6, v2}, Lcom/ss/android/socialbase/downloader/f/k;->a(II)J

    move-result-wide v7

    cmp-long v9, v7, v3

    if-lez v9, :cond_0

    move v5, v6

    move-wide v3, v7

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 50
    :cond_1
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/n;->g()J

    move-result-wide v6

    .line 51
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/n;->i()J

    move-result-wide v8

    if-ltz v5, :cond_10

    cmp-long v2, v3, v6

    if-lez v2, :cond_10

    .line 52
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/f/i;

    .line 53
    iget-object v5, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    iget-object v10, v0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-ge v5, v10, :cond_2

    const/4 v5, 0x2

    goto :goto_1

    .line 54
    :cond_2
    iget-object v5, v0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/f/n;->n()I

    move-result v5

    :goto_1
    const-string v10, ", threadIndex = "

    const-string v12, ", ratio = "

    const-string v13, ", childLength = "

    const-string v14, ", maxRemainBytes = "

    const-string v15, ", child = "

    const-string v11, "obtainSegment: parent = "

    const-string v0, "SegmentDispatcher"

    const-wide/16 v18, 0x2

    const-wide/16 v20, 0x0

    move-object/from16 v22, v0

    const/4 v0, 0x1

    if-ne v5, v0, :cond_a

    .line 55
    iget-object v0, v2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-eqz v0, :cond_9

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const-wide/16 v23, 0xfa0

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    sub-long v14, v12, v23

    .line 57
    invoke-virtual {v0, v14, v15, v12, v13}, Lcom/ss/android/socialbase/downloader/f/m;->a(JJ)J

    move-result-wide v23

    .line 58
    invoke-virtual {v1, v14, v15, v12, v13}, Lcom/ss/android/socialbase/downloader/f/m;->a(JJ)J

    move-result-wide v12

    cmp-long v5, v23, v20

    const/high16 v14, -0x40800000    # -1.0f

    if-lez v5, :cond_3

    cmp-long v5, v12, v20

    if-lez v5, :cond_3

    long-to-float v5, v12

    add-long v12, v23, v12

    long-to-float v12, v12

    div-float/2addr v5, v12

    goto :goto_2

    :cond_3
    move v5, v14

    :goto_2
    cmpl-float v12, v5, v14

    if-nez v12, :cond_4

    .line 59
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/m;->b()J

    move-result-wide v12

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/m;->b()J

    move-result-wide v14

    cmp-long v0, v12, v20

    if-lez v0, :cond_4

    cmp-long v0, v14, v20

    if-lez v0, :cond_4

    long-to-float v0, v14

    add-long/2addr v12, v14

    long-to-float v5, v12

    div-float v5, v0, v5

    :cond_4
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_9

    const v0, 0x3f666666    # 0.9f

    mul-float/2addr v5, v0

    long-to-float v0, v3

    mul-float/2addr v0, v5

    float-to-long v12, v0

    cmp-long v0, v12, v6

    if-gez v0, :cond_5

    move-wide v12, v6

    :cond_5
    cmp-long v0, v8, v20

    if-lez v0, :cond_6

    cmp-long v0, v12, v8

    if-lez v0, :cond_6

    goto :goto_3

    :cond_6
    move-wide v8, v12

    .line 61
    :goto_3
    div-long v6, v6, v18

    sub-long v12, v3, v6

    cmp-long v0, v8, v12

    if-lez v0, :cond_7

    move-wide v8, v12

    goto :goto_4

    :cond_7
    cmp-long v0, v8, v6

    if-gez v0, :cond_8

    move-wide v8, v6

    .line 62
    :cond_8
    :goto_4
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v6

    sub-long v12, v3, v8

    add-long/2addr v6, v12

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v12

    invoke-direct {v0, v6, v7, v12, v13}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(JJ)V

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v12, v26

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v13, v25

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v14, v17

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v15, v16

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v5, v22

    invoke-static {v5, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_9
    move-object/from16 v5, v22

    move-object v1, v5

    goto/16 :goto_7

    :cond_a
    move-object/from16 v16, v22

    const/4 v0, 0x2

    move-object/from16 v27, v15

    move-object v15, v12

    move-object/from16 v12, v27

    move-object/from16 v28, v14

    move-object v14, v13

    move-object/from16 v13, v28

    if-ne v5, v0, :cond_f

    move-object/from16 v0, p0

    move-object/from16 v17, v14

    move-object/from16 v5, v16

    move-object/from16 v16, v15

    .line 64
    iget-wide v14, v0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    move-object/from16 v22, v5

    iget-object v5, v0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v23

    sub-long v14, v14, v23

    .line 65
    invoke-direct/range {p0 .. p2}, Lcom/ss/android/socialbase/downloader/f/k;->d(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)F

    move-result v5

    long-to-float v14, v14

    mul-float/2addr v14, v5

    float-to-long v14, v14

    cmp-long v23, v14, v6

    if-gez v23, :cond_b

    move-wide v14, v6

    :cond_b
    cmp-long v20, v8, v20

    if-lez v20, :cond_c

    cmp-long v20, v14, v8

    if-lez v20, :cond_c

    goto :goto_5

    :cond_c
    move-wide v8, v14

    .line 66
    :goto_5
    div-long v6, v6, v18

    sub-long v14, v3, v6

    cmp-long v18, v8, v14

    if-lez v18, :cond_d

    move-wide v8, v14

    goto :goto_6

    :cond_d
    cmp-long v14, v8, v6

    if-gez v14, :cond_e

    move-wide v8, v6

    .line 67
    :cond_e
    :goto_6
    new-instance v6, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v14

    sub-long v18, v3, v8

    add-long v14, v14, v18

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v0

    invoke-direct {v6, v14, v15, v0, v1}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(JJ)V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p1

    iget v1, v1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v6

    :cond_f
    move-object/from16 v1, v16

    .line 69
    :goto_7
    new-instance v0, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v5

    div-long v3, v3, v18

    add-long/2addr v5, v3

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v3

    invoke-direct {v0, v5, v6, v3, v4}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(JJ)V

    .line 70
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",child = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_10
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Lcom/ss/android/socialbase/downloader/f/k;)Lcom/ss/android/socialbase/downloader/model/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    return-object p0
.end method

.method private c(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/q;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_9

    .line 18
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 19
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/InetAddress;

    if-eqz v4, :cond_1

    .line 21
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 23
    iget-boolean v5, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    if-eqz v5, :cond_2

    .line 24
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onDnsResolved: ip = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "SegmentDispatcher"

    invoke-static {v6, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    :cond_2
    new-instance v5, Lcom/ss/android/socialbase/downloader/f/q;

    invoke-direct {v5, p1, v4}, Lcom/ss/android/socialbase/downloader/f/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v4, v5, Lcom/ss/android/socialbase/downloader/f/q;->c:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/LinkedList;

    if-nez v4, :cond_3

    .line 27
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 28
    iget-object v6, v5, Lcom/ss/android/socialbase/downloader/f/q;->c:Ljava/lang/String;

    invoke-interface {v1, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_3
    invoke-virtual {v4, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-lez v3, :cond_9

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    :cond_5
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v0, v2

    :cond_6
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/LinkedList;

    if-eqz v4, :cond_6

    .line 33
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    .line 34
    invoke-virtual {v4}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/q;

    .line 35
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    if-lez v3, :cond_8

    if-nez v0, :cond_5

    :cond_8
    return-object p1

    :cond_9
    :goto_2
    return-object v0
.end method

.method private c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 5
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->j:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    if-nez v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-nez v0, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    throw v0

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;)V"
        }
    .end annotation

    .line 10
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/f/o;->b(Ljava/util/List;)J

    move-result-wide v0

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkDownloadBytes: getCurBytes = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", totalBytes = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", downloadedBytes = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "SegmentDispatcher"

    .line 13
    invoke-static {v2, p1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_0

    .line 15
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-eqz p1, :cond_1

    .line 17
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    :cond_1
    return-void
.end method

.method private c(Lcom/ss/android/socialbase/downloader/f/m;)Z
    .locals 1

    .line 43
    monitor-enter p0

    .line 44
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->d(Lcom/ss/android/socialbase/downloader/f/m;)Lcom/ss/android/socialbase/downloader/f/q;

    move-result-object v0

    if-nez v0, :cond_0

    .line 45
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    .line 46
    :cond_0
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/f/m;->a(Lcom/ss/android/socialbase/downloader/f/q;)Z

    move-result p1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    .line 47
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private d(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)F
    .locals 5

    .line 50
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/m;->b()J

    move-result-wide v0

    .line 51
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v2, 0x1

    if-gt p2, v2, :cond_0

    .line 52
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/n;->a()I

    move-result p2

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-gtz v3, :cond_5

    .line 53
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->m()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-lez v1, :cond_1

    cmpl-float v1, v0, v4

    if-ltz v1, :cond_2

    :cond_1
    int-to-float v0, p2

    div-float v0, v4, v0

    .line 54
    :cond_2
    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    if-nez p1, :cond_3

    return v0

    :cond_3
    if-le p2, v2, :cond_4

    sub-float/2addr v4, v0

    sub-int/2addr p2, v2

    :cond_4
    int-to-float p1, p2

    div-float/2addr v4, p1

    return v4

    .line 55
    :cond_5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->o()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-lez p1, :cond_4

    long-to-float p1, v0

    long-to-float p2, v2

    div-float/2addr p1, p2

    return p1
.end method

.method private d(Lcom/ss/android/socialbase/downloader/f/m;)Lcom/ss/android/socialbase/downloader/f/q;
    .locals 5

    .line 45
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/f/q;

    .line 46
    iget-object v4, p1, Lcom/ss/android/socialbase/downloader/f/m;->b:Lcom/ss/android/socialbase/downloader/f/q;

    if-eq v3, v4, :cond_0

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/f/q;->d()Z

    move-result v4

    if-nez v4, :cond_0

    if-nez v2, :cond_1

    move-object v2, v3

    .line 47
    :cond_1
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/f/q;->a()I

    move-result v4

    if-gtz v4, :cond_0

    goto :goto_0

    :cond_2
    move-object v3, v1

    .line 48
    :goto_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/n;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz v3, :cond_3

    return-object v3

    .line 49
    :cond_3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/n;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v1

    :cond_4
    return-object v2
.end method

.method static synthetic d(Lcom/ss/android/socialbase/downloader/f/k;)Lcom/ss/android/socialbase/downloader/model/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/f/k;->k:Lcom/ss/android/socialbase/downloader/model/d;

    return-object p0
.end method

.method private d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->e:Lcom/ss/android/socialbase/downloader/f/g;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/f/g;->a(Lcom/ss/android/socialbase/downloader/f/d;)V
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/f/p; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "SegmentDispatcher"

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dispatchSegments: loopAndWrite e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 5
    throw v0

    .line 6
    :catch_1
    :goto_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-eqz v0, :cond_0

    goto :goto_4

    .line 7
    :cond_0
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/i;

    if-nez v0, :cond_1

    goto :goto_1

    .line 10
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    goto :goto_1

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->c(Ljava/util/List;)V

    .line 12
    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    :goto_2
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->v:Z

    if-eqz v0, :cond_4

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const-string v0, "SegmentDispatcher"

    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dispatchSegments: loopAndWrite  failedException = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    throw v0

    .line 18
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/d/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/util/List;)V

    :cond_5
    const-string v0, "SegmentDispatcher"

    const-string v1, "dispatchSegments::download finished"

    .line 20
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 21
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/i;

    .line 22
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    const-string v7, "SegmentDispatcher"

    const-wide/16 v8, 0x1

    if-lez v5, :cond_0

    .line 23
    new-instance v5, Lcom/ss/android/socialbase/downloader/f/i;

    sub-long/2addr v1, v8

    invoke-direct {v5, v3, v4, v1, v2}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(JJ)V

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fixSegmentsLocked: first = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", add new first = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-direct {p0, p1, v5, v6}, Lcom/ss/android/socialbase/downloader/f/k;->a(Ljava/util/List;Lcom/ss/android/socialbase/downloader/f/i;Z)V

    .line 26
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/i;

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/f/i;

    .line 31
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v10

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v12

    sub-long/2addr v12, v8

    cmp-long v5, v10, v12

    if-gez v5, :cond_1

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "fixSegment: segment = "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", new end = "

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v10

    sub-long/2addr v10, v8

    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v10

    sub-long/2addr v10, v8

    invoke-virtual {v1, v10, v11}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    :cond_1
    move-object v1, v2

    goto :goto_0

    .line 34
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v6

    .line 35
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/socialbase/downloader/f/i;

    .line 36
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    cmp-long v2, v0, v3

    const-wide/16 v3, -0x1

    if-lez v2, :cond_3

    .line 37
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v5

    sub-long/2addr v0, v8

    cmp-long v0, v5, v0

    if-gez v0, :cond_4

    .line 38
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fixSegment: last segment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new end=-1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1, v3, v4}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    :cond_4
    return-void
.end method

.method static synthetic e(Lcom/ss/android/socialbase/downloader/f/k;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->w:J

    return-wide v0
.end method

.method private e()V
    .locals 6

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->l:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->a()I

    move-result v0

    .line 4
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/f/n;->h()J

    move-result-wide v4

    div-long/2addr v2, v4

    long-to-int v2, v2

    if-le v0, v2, :cond_2

    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :cond_2
    :goto_1
    const-string v2, "SegmentDispatcher"

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dispatchReadThread: totalLength = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", threadCount = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    move v1, v0

    .line 6
    :goto_2
    monitor-enter p0

    .line 7
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v1, :cond_7

    .line 8
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-eqz v0, :cond_5

    goto :goto_3

    .line 9
    :cond_5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->j()Lcom/ss/android/socialbase/downloader/f/q;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/q;)V

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    .line 11
    :cond_6
    :goto_3
    monitor-exit p0

    return-void

    .line 12
    :cond_7
    :goto_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private e(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/f/j;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "applySegment: start "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "SegmentDispatcher"

    invoke-static {v4, v3}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    const-string v5, "applySegment: "

    if-ne v3, v1, :cond_0

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is already the owner of "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 16
    :cond_0
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-nez v3, :cond_18

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/f/m;->h()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v9

    cmp-long v3, v7, v9

    if-nez v3, :cond_17

    .line 18
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v7

    .line 19
    invoke-direct {v0, v7, v8}, Lcom/ss/android/socialbase/downloader/f/k;->a(J)I

    move-result v3

    const/4 v9, 0x2

    const/4 v10, -0x1

    if-eq v3, v10, :cond_16

    .line 20
    iget-object v10, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ss/android/socialbase/downloader/f/i;

    if-eqz v10, :cond_16

    const-wide/16 v11, 0x0

    if-eq v10, v2, :cond_7

    .line 21
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v13

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v15

    cmp-long v13, v13, v15

    if-nez v13, :cond_5

    .line 22
    invoke-direct {v0, v10}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/i;)J

    move-result-wide v13

    cmp-long v15, v13, v11

    if-lez v15, :cond_5

    .line 23
    iget-object v15, v10, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-eqz v15, :cond_3

    const-wide/32 v16, 0x80000

    cmp-long v16, v13, v16

    if-gez v16, :cond_1

    .line 24
    iget-wide v11, v1, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    move-wide/from16 v18, v7

    iget-wide v6, v15, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    sub-long/2addr v11, v6

    const-wide/16 v6, 0x3e8

    cmp-long v6, v11, v6

    if-lez v6, :cond_2

    .line 25
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v6

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v11

    sub-long/2addr v6, v11

    const-wide/16 v11, 0x2

    div-long/2addr v13, v11

    cmp-long v6, v6, v13

    if-gez v6, :cond_2

    goto :goto_0

    :cond_1
    move-wide/from16 v18, v7

    .line 26
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "applySegmentLocked: has same segment, but owner is normal, abort. segmentInList = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    move-wide/from16 v18, v7

    :goto_0
    if-eqz v15, :cond_4

    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "applySegmentLocked: has same segment,and owner too slow, segmentInList = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v6, 0x1

    .line 28
    invoke-virtual {v15, v6}, Lcom/ss/android/socialbase/downloader/f/m;->a(Z)V

    goto :goto_1

    .line 29
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "applySegmentLocked: has same segment and no owner, segmentInList = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    :goto_1
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    .line 31
    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/f/i;->j()I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/ss/android/socialbase/downloader/f/i;->b(I)V

    .line 32
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v6, v3, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    move-wide/from16 v18, v7

    :goto_2
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    goto :goto_4

    .line 33
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not exist! but has another same segment, segmentInList = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const-string v2, "segment not exist, but has another same segment"

    invoke-direct {v1, v9, v2}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_7
    move-wide/from16 v18, v7

    .line 35
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->a()J

    move-result-wide v6

    add-int/lit8 v8, v3, -0x1

    :goto_5
    const-wide/16 v9, 0x1

    if-ltz v8, :cond_e

    .line 36
    iget-object v11, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/ss/android/socialbase/downloader/f/i;

    .line 37
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v16, v12, v14

    if-lez v16, :cond_8

    cmp-long v12, v12, v18

    if-ltz v12, :cond_b

    :cond_8
    cmp-long v12, v6, v14

    if-gtz v12, :cond_a

    .line 38
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v12

    cmp-long v12, v12, v18

    if-gtz v12, :cond_9

    goto :goto_6

    .line 39
    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applySegment:prev\'s current has over this start, prev = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", segment = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 41
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 v2, 0x3

    const-string v3, "prev overstep"

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    .line 42
    :cond_a
    :goto_6
    iget-object v12, v11, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-nez v12, :cond_c

    sub-long v12, v18, v9

    .line 43
    invoke-virtual {v11, v12, v13}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    .line 44
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "applySegment: prev set end, prev = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v12}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/f/i;->a()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v11, v11, v13

    if-lez v11, :cond_b

    const-string v6, "applySegmentLocked:q break"

    .line 46
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    :cond_b
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_5

    .line 47
    :cond_c
    iget-object v6, v11, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    sub-long v7, v18, v9

    invoke-virtual {v6, v7, v8}, Lcom/ss/android/socialbase/downloader/f/m;->a(J)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 48
    invoke-virtual {v11, v7, v8}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    .line 49
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "applySegment: adjustSegmentEndOffset succeed, prev = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    .line 50
    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "applySegment: adjustSegmentEndOffset filed, prev = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 v2, 0x4

    const-string v3, "prev end adjust fail"

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    :cond_e
    :goto_7
    const/4 v6, 0x1

    add-int/2addr v3, v6

    .line 52
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_8
    if-ge v3, v6, :cond_13

    .line 53
    iget-object v7, v0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ss/android/socialbase/downloader/f/i;

    .line 54
    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/f/i;->a()J

    move-result-wide v11

    const-wide/16 v13, 0x0

    cmp-long v8, v11, v13

    if-gtz v8, :cond_10

    iget-object v8, v7, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-eqz v8, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 55
    :cond_10
    :goto_9
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v11

    .line 56
    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    move-result-wide v20

    cmp-long v3, v11, v13

    if-lez v3, :cond_11

    cmp-long v3, v11, v20

    if-ltz v3, :cond_12

    :cond_11
    sub-long v8, v20, v9

    .line 57
    invoke-virtual {v2, v8, v9}, Lcom/ss/android/socialbase/downloader/f/i;->c(J)V

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "applySegment: segment set end:"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", later = "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    const-string v3, "applySegmentLocked: break 2"

    .line 59
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    :cond_13
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->f()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_15

    cmp-long v3, v18, v6

    if-gtz v3, :cond_14

    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    move-result-wide v8

    cmp-long v3, v8, v6

    if-gtz v3, :cond_14

    goto :goto_a

    .line 62
    :cond_14
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    .line 63
    :cond_15
    :goto_a
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applySegment: OK "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 65
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not exist! segmentIndex = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const-string v2, "segment not exist"

    invoke-direct {v1, v9, v2}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    .line 67
    :cond_17
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const/4 v2, 0x5

    const-string v3, "applySegment"

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1

    .line 68
    :cond_18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is already has an owner:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v1, Lcom/ss/android/socialbase/downloader/f/j;

    const-string v2, "segment already has an owner"

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Lcom/ss/android/socialbase/downloader/f/j;-><init>(ILjava/lang/String;)V

    throw v1
.end method

.method static synthetic f(Lcom/ss/android/socialbase/downloader/f/k;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    return-object p0
.end method

.method private f()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    new-instance v1, Lcom/ss/android/socialbase/downloader/f/q;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/f/q;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrls()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    new-instance v3, Lcom/ss/android/socialbase/downloader/f/q;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lcom/ss/android/socialbase/downloader/f/q;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/f/n;->a(I)V

    return-void
.end method

.method static synthetic g(Lcom/ss/android/socialbase/downloader/f/k;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method private g()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->j()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->w:J

    .line 4
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->k()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->x:J

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->o()F

    move-result v0

    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->z:F

    .line 6
    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->A:I

    if-lez v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->C:Lcom/ss/android/socialbase/downloader/h/e$b;

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/h/e;->a(Lcom/ss/android/socialbase/downloader/h/e$b;J)V

    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->x:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->y:J

    .line 14
    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->D:Lcom/ss/android/socialbase/downloader/h/e$b;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/h/e;->a(Lcom/ss/android/socialbase/downloader/h/e$b;J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
.end method

.method private i()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/n;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->l:Z

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->e()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/c;->a()Lcom/ss/android/socialbase/downloader/network/c;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-wide/16 v3, 0x7d0

    .line 27
    .line 28
    invoke-virtual {v1, v2, p0, v3, v4}, Lcom/ss/android/socialbase/downloader/network/c;->a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/c$a;J)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    if-le v0, v2, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrls()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v2, p0, v3, v4}, Lcom/ss/android/socialbase/downloader/network/c;->a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/c$a;J)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
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

.method private j()Lcom/ss/android/socialbase/downloader/f/q;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->p:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    rem-int/2addr v0, v1

    .line 11
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/n;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->p:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iput v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->p:I

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/ss/android/socialbase/downloader/f/q;

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    throw v0
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
    .locals 2

    .line 1
    const-string v0, "SegmentDispatcher"

    .line 2
    .line 3
    const-string v1, "onComplete"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/b;->c()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->s:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
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

.method private l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/ss/android/socialbase/downloader/f/m;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/m;->g()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    return v0
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

.method private m()V
    .locals 14

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-gt v0, v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move v6, v1

    .line 23
    :goto_0
    const-string v7, "SegmentDispatcher"

    .line 24
    .line 25
    if-ge v6, v0, :cond_5

    .line 26
    .line 27
    iget-object v8, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    check-cast v8, Lcom/ss/android/socialbase/downloader/f/i;

    .line 34
    .line 35
    iget-object v9, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    check-cast v9, Lcom/ss/android/socialbase/downloader/f/i;

    .line 42
    .line 43
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    .line 44
    .line 45
    .line 46
    move-result-wide v10

    .line 47
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/f/i;->c()J

    .line 48
    .line 49
    .line 50
    move-result-wide v12

    .line 51
    cmp-long v10, v10, v12

    .line 52
    .line 53
    if-lez v10, :cond_3

    .line 54
    .line 55
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/f/i;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v10

    .line 59
    cmp-long v10, v10, v2

    .line 60
    .line 61
    if-gtz v10, :cond_3

    .line 62
    .line 63
    iget-object v10, v9, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    .line 64
    .line 65
    if-nez v10, :cond_3

    .line 66
    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    new-instance v4, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-boolean v10, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    .line 78
    .line 79
    if-eqz v10, :cond_4

    .line 80
    .line 81
    new-instance v10, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v11, "clearCovered, covered = "

    .line 87
    .line 88
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v9, ", prev = "

    .line 95
    .line 96
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-virtual {v9}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    .line 111
    .line 112
    .line 113
    move-result-wide v9

    .line 114
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/f/i;->e()J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    cmp-long v7, v9, v7

    .line 119
    .line 120
    if-lez v7, :cond_4

    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    if-eqz v4, :cond_9

    .line 128
    .line 129
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Lcom/ss/android/socialbase/downloader/f/i;

    .line 144
    .line 145
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {v3, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_6

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Lcom/ss/android/socialbase/downloader/f/m;

    .line 167
    .line 168
    iget-object v5, v4, Lcom/ss/android/socialbase/downloader/f/m;->a:Lcom/ss/android/socialbase/downloader/f/i;

    .line 169
    .line 170
    if-ne v5, v2, :cond_7

    .line 171
    .line 172
    iget-boolean v5, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    .line 173
    .line 174
    if-eqz v5, :cond_8

    .line 175
    .line 176
    new-instance v5, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v6, "clearCoveredSegmentLocked: reconnect, segment = "

    .line 182
    .line 183
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v6, ", threadIndex = "

    .line 190
    .line 191
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    iget v6, v4, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 195
    .line 196
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    :cond_8
    invoke-virtual {v4, v1}, Lcom/ss/android/socialbase/downloader/f/m;->a(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_9
    return-void
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

.method private n()Z
    .locals 8

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->r:Z

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/f/o;->a(Ljava/util/List;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-string v2, "SegmentDispatcher"

    .line 21
    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v7, "isAllContentDownloaded: firstOffset = "

    .line 28
    .line 29
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v2, v6}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    cmp-long v0, v4, v0

    .line 43
    .line 44
    if-ltz v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->r:Z

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return v0

    .line 51
    :cond_1
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->r:Z

    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return v3

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    throw v0
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

.method private o()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/ss/android/socialbase/downloader/f/m;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/f/m;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    add-long/2addr v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-wide v1
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

.method private p()Lcom/ss/android/socialbase/downloader/f/i;
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->q()Lcom/ss/android/socialbase/downloader/f/i;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    .line 11
    .line 12
    if-nez v13, :cond_1

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_1
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/i;->j()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v14, 0x2

    .line 20
    if-lt v3, v14, :cond_2

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    invoke-direct {p0, v7, v8}, Lcom/ss/android/socialbase/downloader/f/k;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-wide v3, v13, Lcom/ss/android/socialbase/downloader/f/m;->f:J

    .line 31
    .line 32
    sub-long v3, v7, v3

    .line 33
    .line 34
    const-wide/16 v5, 0x7d0

    .line 35
    .line 36
    cmp-long v3, v3, v5

    .line 37
    .line 38
    if-lez v3, :cond_4

    .line 39
    .line 40
    sub-long v5, v7, v5

    .line 41
    .line 42
    const-wide/16 v9, 0x1f4

    .line 43
    .line 44
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 45
    .line 46
    move-object v3, p0

    .line 47
    move-object v4, v13

    .line 48
    invoke-direct/range {v3 .. v12}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/m;JJJD)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const-string v0, "SegmentDispatcher"

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v3, "obtainSegmentWhenNoNewSegment: isDownloadSpeedPoor segment = "

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v3, ", owner.threadIndex = "

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v3, v13, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    :cond_3
    return-object v1

    .line 91
    :cond_4
    add-int/lit8 v3, v0, 0x1

    .line 92
    .line 93
    if-le v0, v14, :cond_6

    .line 94
    .line 95
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    const-string v0, "SegmentDispatcher"

    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v3, "obtainSegmentWhenNoNewSegment: waitCount > 2, return segment = "

    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    :cond_5
    return-object v1

    .line 122
    :cond_6
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    const-wide/16 v0, 0x1f4

    .line 124
    .line 125
    :try_start_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 126
    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v0, v3

    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :catchall_0
    move-exception v0

    .line 133
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 135
    :catch_0
    return-object v2
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

.method private q()Lcom/ss/android/socialbase/downloader/f/i;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const v2, 0x7fffffff

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/ss/android/socialbase/downloader/f/i;

    .line 22
    .line 23
    invoke-direct {p0, v3}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/f/i;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    cmp-long v4, v4, v6

    .line 30
    .line 31
    if-lez v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/f/i;->j()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ge v4, v2, :cond_0

    .line 38
    .line 39
    move-object v1, v3

    .line 40
    move v2, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v1
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

.method private r()J
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    invoke-direct {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/f/k;->b(J)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/f/n;->k()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v6, v2, v4

    .line 27
    .line 28
    if-lez v6, :cond_1

    .line 29
    .line 30
    iget-wide v6, p0, Lcom/ss/android/socialbase/downloader/f/k;->y:J

    .line 31
    .line 32
    cmp-long v4, v6, v4

    .line 33
    .line 34
    if-lez v4, :cond_1

    .line 35
    .line 36
    sub-long v4, v0, v6

    .line 37
    .line 38
    cmp-long v4, v4, v2

    .line 39
    .line 40
    if-lez v4, :cond_1

    .line 41
    .line 42
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/f/k;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->y:J

    .line 49
    .line 50
    iget v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->A:I

    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->A:I

    .line 55
    .line 56
    :cond_1
    monitor-exit p0

    .line 57
    const-wide/16 v0, 0x7d0

    .line 58
    .line 59
    return-wide v0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw v0

    .line 63
    :cond_2
    :goto_0
    const-wide/16 v0, -0x1

    .line 64
    .line 65
    return-wide v0
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


# virtual methods
.method public a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    monitor-enter p0

    .line 58
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/f/k;->b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;)Lcom/ss/android/socialbase/downloader/f/i;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 59
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->h()V

    .line 60
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/i;->j()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_1

    .line 61
    new-instance p2, Lcom/ss/android/socialbase/downloader/f/i;

    invoke-direct {p2, p1}, Lcom/ss/android/socialbase/downloader/f/i;-><init>(Lcom/ss/android/socialbase/downloader/f/i;)V

    monitor-exit p0

    return-object p2

    .line 62
    :cond_1
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 2

    const-string v0, "SegmentDispatcher"

    const-string v1, "cancel"

    .line 117
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 118
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    .line 119
    monitor-enter p0

    .line 120
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/m;

    .line 121
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/m;->e()V

    goto :goto_0

    .line 122
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->e:Lcom/ss/android/socialbase/downloader/f/g;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/g;->a()V

    .line 124
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/b;->c()V

    return-void

    :catchall_0
    move-exception v0

    .line 125
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/m;)V
    .locals 2

    .line 55
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->B:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onReaderRun, threadIndex = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SegmentDispatcher"

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 0

    .line 64
    monitor-enter p0

    .line 65
    :try_start_0
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/f/i;->i()V

    .line 66
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/model/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/i;
        }
    .end annotation

    .line 67
    monitor-enter p0

    .line 68
    :try_start_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez v0, :cond_3

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/f/k;->b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/model/d;)V

    const/4 p2, 0x0

    .line 70
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/f/m;->b(Z)V

    .line 71
    iget-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-gtz p1, :cond_1

    .line 72
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    cmp-long p1, p1, v0

    if-gtz p1, :cond_0

    .line 73
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/d;->j()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->e()V

    goto :goto_0

    .line 75
    :cond_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/n;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 76
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->e()V

    .line 77
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    .line 78
    :cond_3
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/p;

    const-string p2, "connected"

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/f/p;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 79
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2

    .line 83
    monitor-enter p0

    :try_start_0
    const-string p2, "SegmentDispatcher"

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSegmentFailed: segment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", e = "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/ss/android/socialbase/downloader/c/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 85
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/f/m;->b(Z)V

    .line 86
    iget p1, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    if-nez p1, :cond_0

    .line 87
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 88
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->l()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 89
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-nez p1, :cond_1

    .line 90
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 91
    :cond_1
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->v:Z

    .line 92
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->q:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 93
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/q;Lcom/ss/android/socialbase/downloader/f/i;Lcom/ss/android/socialbase/downloader/exception/BaseException;II)V
    .locals 0

    .line 80
    invoke-static {p4}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p2

    .line 81
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result p3

    const/16 p4, 0x417

    if-eq p3, p4, :cond_0

    const/16 p4, 0x432

    if-eq p3, p4, :cond_0

    const/16 p4, 0x41f

    if-ne p3, p4, :cond_1

    :cond_0
    const/4 p2, 0x1

    :cond_1
    if-nez p2, :cond_2

    if-lt p5, p6, :cond_3

    .line 82
    :cond_2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->c(Lcom/ss/android/socialbase/downloader/f/m;)Z

    :cond_3
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;)V"
        }
    .end annotation

    .line 33
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/f/k;->c(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p2, 0x0

    .line 36
    :goto_0
    monitor-enter p0

    if-eqz p2, :cond_1

    .line 37
    :try_start_1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/f/k;->b(Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->l:Z

    .line 39
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->b:Lcom/ss/android/socialbase/downloader/f/n;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->i:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/f/n;->a(I)V

    const-string p1, "SegmentDispatcher"

    const-string p2, "onDnsResolved: dispatchReadThread"

    .line 40
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->e()V

    .line 42
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/f/i;",
            ">;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "finally pause"

    const-string v1, "SegmentDispatcher"

    .line 4
    :try_start_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->f()V

    .line 5
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/f/k;->b(Ljava/util/List;)V

    .line 6
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->e()V

    .line 7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->g()V

    .line 8
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->i()V

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 12
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 13
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    .line 14
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    const/4 v2, 0x1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->d:Lcom/ss/android/socialbase/downloader/h/f;

    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/f/k;->m:J

    invoke-interface {p1, v3, v4}, Lcom/ss/android/socialbase/downloader/h/f;->a(J)V

    .line 16
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->h()V

    .line 17
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 18
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-nez p1, :cond_1

    .line 19
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/k;->b()V

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/h/e;->b()V

    return v2

    .line 22
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-nez p1, :cond_3

    .line 23
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/k;->b()V

    .line 25
    :cond_3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/h/e;->b()V

    return v2

    :catchall_0
    move-exception p1

    .line 26
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 27
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 28
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 29
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/f/k;->f:Z

    if-nez v2, :cond_4

    .line 30
    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/f/k;->b()V

    .line 32
    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->u:Lcom/ss/android/socialbase/downloader/h/e;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/h/e;->b()V

    throw p1
.end method

.method public b()V
    .locals 2

    const-string v0, "SegmentDispatcher"

    const-string v1, "pause1"

    .line 81
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->g:Z

    .line 83
    monitor-enter p0

    .line 84
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/f/m;

    .line 85
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/f/m;->e()V

    goto :goto_0

    .line 86
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->e:Lcom/ss/android/socialbase/downloader/f/g;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/g;->b()V

    .line 88
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/b;->c()V

    return-void

    :catchall_0
    move-exception v0

    .line 89
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(Lcom/ss/android/socialbase/downloader/f/m;)V
    .locals 3

    const-string v0, "SegmentDispatcher"

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReaderExit: threadIndex = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lcom/ss/android/socialbase/downloader/f/m;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    monitor-enter p0

    const/4 v0, 0x1

    .line 37
    :try_start_0
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/f/m;->c(Z)V

    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 39
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->m()V

    .line 40
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 41
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->k()V

    goto :goto_1

    .line 42
    :cond_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "SegmentDispatcher"

    const-string v0, "onReaderExit: allContentDownloaded"

    .line 43
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/f/k;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/f/m;

    .line 45
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/f/m;->e()V

    goto :goto_0

    .line 46
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/f/k;->k()V

    .line 47
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 32
    monitor-enter p0

    .line 33
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/f/k;->e(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 34
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)V
    .locals 3

    .line 36
    monitor-enter p0

    .line 37
    :try_start_0
    iget-object v0, p2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    if-ne v0, p1, :cond_0

    const-string v0, "SegmentDispatcher"

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unApplySegment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/m;->d()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/ss/android/socialbase/downloader/f/i;->d(J)V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p2, Lcom/ss/android/socialbase/downloader/f/i;->a:Lcom/ss/android/socialbase/downloader/f/m;

    .line 41
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/m;->a()V

    .line 42
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Lcom/ss/android/socialbase/downloader/f/m;Lcom/ss/android/socialbase/downloader/f/i;)Lcom/ss/android/socialbase/downloader/f/e;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 40
    monitor-enter p0

    .line 41
    :try_start_0
    new-instance p1, Lcom/ss/android/socialbase/downloader/f/l;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/f/k;->a:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/f/k;->c:Lcom/ss/android/socialbase/downloader/f/b;

    invoke-direct {p1, v0, v1, p2}, Lcom/ss/android/socialbase/downloader/f/l;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/f/b;Lcom/ss/android/socialbase/downloader/f/i;)V

    .line 42
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/f/k;->e:Lcom/ss/android/socialbase/downloader/f/g;

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/f/g;->a(Lcom/ss/android/socialbase/downloader/f/l;)V

    .line 43
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/f/l;->a()Lcom/ss/android/socialbase/downloader/f/e;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 44
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
