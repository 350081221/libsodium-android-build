.class public Lcom/uc/crashsdk/export/CrashApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/uc/crashsdk/export/CrashApi; = null

.field private static c:Z = true

.field private static d:Z = false


# instance fields
.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;ZZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/uc/crashsdk/export/CrashApi;->b:Z

    .line 6
    .line 7
    invoke-static {p1}, Lcom/uc/crashsdk/export/CrashApi;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/uc/crashsdk/export/CrashApi;->b(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    sput-boolean p6, Lcom/uc/crashsdk/b;->g:Z

    .line 15
    .line 16
    sput-boolean p7, Lcom/uc/crashsdk/b;->h:Z

    .line 17
    .line 18
    invoke-static {}, Lcom/uc/crashsdk/b;->L()Z

    .line 19
    .line 20
    .line 21
    move-result p6

    .line 22
    const/4 p7, 0x1

    .line 23
    if-eqz p6, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Lcom/uc/crashsdk/export/CrashApi;->b(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2, p3, p4}, Lcom/uc/crashsdk/export/CrashApi;->a(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;)V

    .line 29
    .line 30
    .line 31
    if-eqz p5, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->a()V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-boolean p1, Lcom/uc/crashsdk/b;->g:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const-string p1, "libcrashsdk.so"

    .line 41
    .line 42
    invoke-static {p1}, Lcom/uc/crashsdk/e;->e(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    sput-boolean p7, Lcom/uc/crashsdk/b;->f:Z

    .line 49
    .line 50
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->b()V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :cond_2
    const-string p6, "crashsdk"

    .line 55
    .line 56
    if-eqz p2, :cond_6

    .line 57
    .line 58
    if-eqz p3, :cond_6

    .line 59
    .line 60
    invoke-static {p2}, Lcom/uc/crashsdk/g;->a(Lcom/uc/crashsdk/export/CustomInfo;)V

    .line 61
    .line 62
    .line 63
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lcom/uc/crashsdk/export/CrashApi;->a(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p2

    .line 68
    invoke-static {p2}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    if-eqz p5, :cond_3

    .line 72
    .line 73
    :try_start_1
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception p2

    .line 78
    invoke-static {p2}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    :try_start_2
    invoke-static {}, Lcom/uc/crashsdk/b;->M()V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/uc/crashsdk/a/h;->a()V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/uc/crashsdk/a/d;->a()V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lcom/uc/crashsdk/a/g;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_2
    move-exception p2

    .line 95
    invoke-static {p2}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    :try_start_3
    invoke-static {p1}, Lcom/uc/crashsdk/b;->a(Landroid/content/Context;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_4

    .line 103
    .line 104
    const-string p1, "registerLifecycleCallbacks failed!"

    .line 105
    .line 106
    invoke-static {p6, p1}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :catchall_3
    move-exception p1

    .line 111
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_3
    :try_start_4
    invoke-static {}, Lcom/uc/crashsdk/a;->n()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 115
    .line 116
    .line 117
    :try_start_5
    invoke-static {}, Lcom/uc/crashsdk/e;->A()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :catchall_4
    move-exception p1

    .line 122
    :try_start_6
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->b(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :goto_4
    invoke-static {}, Lcom/uc/crashsdk/e;->B()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :catchall_5
    move-exception p1

    .line 130
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :goto_5
    :try_start_7
    invoke-static {}, Lcom/uc/crashsdk/g;->r()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_5

    .line 138
    .line 139
    invoke-static {}, Lcom/uc/crashsdk/b;->F()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    iget-boolean p1, p0, Lcom/uc/crashsdk/export/CrashApi;->b:Z

    .line 146
    .line 147
    if-nez p1, :cond_5

    .line 148
    .line 149
    invoke-static {}, Lcom/uc/crashsdk/e;->G()V

    .line 150
    .line 151
    .line 152
    iput-boolean p7, p0, Lcom/uc/crashsdk/export/CrashApi;->b:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 153
    .line 154
    :cond_5
    return-void

    .line 155
    :catchall_6
    move-exception p1

    .line 156
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->b(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_6
    const-string p1, "VersionInfo and CustomInfo can not be null!"

    .line 161
    .line 162
    invoke-static {p6, p1}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    throw p1
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
.end method

.method private static a(Landroid/content/Context;)Landroid/content/Context;
    .locals 2

    const-string v0, "crashsdk"

    if-eqz p0, :cond_2

    .line 12
    sget-boolean v1, Lcom/uc/crashsdk/export/CrashApi;->c:Z

    if-eqz v1, :cond_1

    instance-of v1, p0, Landroid/app/Application;

    if-nez v1, :cond_1

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 14
    instance-of v1, p0, Landroid/app/Application;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "Can not get Application context from given context!"

    .line 15
    invoke-static {v0, p0}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-object p0

    :cond_2
    const-string p0, "context can not be null!"

    .line 17
    invoke-static {v0, p0}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method private static a()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/uc/crashsdk/b;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "Has enabled java log!"

    .line 2
    invoke-static {v0}, Lcom/uc/crashsdk/a/a;->b(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/e;->s()V

    .line 4
    invoke-static {}, Lcom/uc/crashsdk/e;->o()V

    const/4 v0, 0x1

    .line 5
    sput-boolean v0, Lcom/uc/crashsdk/b;->a:Z

    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;)V
    .locals 0

    .line 6
    invoke-static {p3}, Lcom/uc/crashsdk/d;->a(Lcom/uc/crashsdk/export/ICrashClient;)V

    .line 7
    invoke-static {p1, p2}, Lcom/uc/crashsdk/g;->a(Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;)V

    .line 8
    invoke-static {}, Lcom/uc/crashsdk/b;->L()Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    invoke-static {}, Lcom/uc/crashsdk/e;->p()V

    .line 10
    invoke-static {p0}, Lcom/uc/crashsdk/e;->a(Landroid/content/Context;)V

    .line 11
    invoke-static {p0}, Lcom/uc/crashsdk/e;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/Throwable;)V
    .locals 3

    .line 19
    new-instance v0, Lcom/uc/crashsdk/e;

    invoke-direct {v0}, Lcom/uc/crashsdk/e;-><init>()V

    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/uc/crashsdk/e;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 2

    .line 21
    invoke-static {}, Lcom/uc/crashsdk/b;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can not call \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' in isolated process!"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "crashsdk"

    invoke-static {v0, p0}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b()V
    .locals 2

    .line 1
    sget-object v0, Lcom/uc/crashsdk/b;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-boolean v1, Lcom/uc/crashsdk/b;->g:Z

    if-eqz v1, :cond_2

    sget-boolean v1, Lcom/uc/crashsdk/b;->f:Z

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-boolean v1, Lcom/uc/crashsdk/b;->b:Z

    if-eqz v1, :cond_1

    const-string v1, "Has enabled native log!"

    .line 4
    invoke-static {v1}, Lcom/uc/crashsdk/a/a;->b(Ljava/lang/String;)V

    .line 5
    monitor-exit v0

    return-void

    .line 6
    :cond_1
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->c()V

    .line 7
    invoke-static {}, Lcom/uc/crashsdk/e;->D()V

    const/4 v1, 0x1

    .line 8
    sput-boolean v1, Lcom/uc/crashsdk/b;->b:Z

    const/4 v1, 0x6

    .line 9
    invoke-static {v1}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    .line 10
    invoke-static {}, Lcom/uc/crashsdk/g;->d()V

    .line 11
    monitor-exit v0

    return-void

    .line 12
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static b(Landroid/content/Context;)V
    .locals 1

    .line 14
    :try_start_0
    sget-boolean v0, Lcom/uc/crashsdk/export/CrashApi;->d:Z

    if-nez v0, :cond_0

    .line 15
    invoke-static {p0}, Lcom/uc/crashsdk/a/g;->a(Landroid/content/Context;)V

    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/uc/crashsdk/a;->a:Ljava/lang/String;

    const/4 p0, 0x1

    .line 17
    sput-boolean p0, Lcom/uc/crashsdk/export/CrashApi;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static c()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/uc/crashsdk/b;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/g;->b()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    invoke-static {v0}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/uc/crashsdk/g;->c()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    sput-boolean v0, Lcom/uc/crashsdk/b;->d:Z

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static declared-synchronized createInstance(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;ZZZ)Lcom/uc/crashsdk/export/CrashApi;
    .locals 10

    .line 1
    const-class v1, Lcom/uc/crashsdk/export/CrashApi;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Lcom/uc/crashsdk/export/CrashApi;->a:Lcom/uc/crashsdk/export/CrashApi;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/uc/crashsdk/export/CrashApi;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    move-object v3, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    move-object v6, p3

    .line 15
    move v7, p4

    .line 16
    move v8, p5

    .line 17
    move/from16 v9, p6

    .line 18
    .line 19
    invoke-direct/range {v2 .. v9}, Lcom/uc/crashsdk/export/CrashApi;-><init>(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;ZZZ)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/uc/crashsdk/export/CrashApi;->a:Lcom/uc/crashsdk/export/CrashApi;

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lcom/uc/crashsdk/export/CrashApi;->a:Lcom/uc/crashsdk/export/CrashApi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-object v0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    monitor-exit v1

    .line 30
    throw v0
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
.end method

.method public static createInstanceEx(Landroid/content/Context;Ljava/lang/String;Z)Lcom/uc/crashsdk/export/CrashApi;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Lcom/uc/crashsdk/export/CrashApi;->createInstanceEx(Landroid/content/Context;Ljava/lang/String;ZLandroid/os/Bundle;)Lcom/uc/crashsdk/export/CrashApi;

    move-result-object p0

    return-object p0
.end method

.method public static createInstanceEx(Landroid/content/Context;Ljava/lang/String;ZLandroid/os/Bundle;)Lcom/uc/crashsdk/export/CrashApi;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, p3, v0}, Lcom/uc/crashsdk/export/CrashApi;->createInstanceEx(Landroid/content/Context;Ljava/lang/String;ZLandroid/os/Bundle;Lcom/uc/crashsdk/export/ICrashClient;)Lcom/uc/crashsdk/export/CrashApi;

    move-result-object p0

    return-object p0
.end method

.method public static createInstanceEx(Landroid/content/Context;Ljava/lang/String;ZLandroid/os/Bundle;Lcom/uc/crashsdk/export/ICrashClient;)Lcom/uc/crashsdk/export/CrashApi;
    .locals 9

    .line 3
    sget-object v0, Lcom/uc/crashsdk/export/CrashApi;->a:Lcom/uc/crashsdk/export/CrashApi;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    if-nez p3, :cond_1

    .line 4
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_1
    const-string v0, "useApplicationContext"

    const/4 v1, 0x1

    .line 5
    invoke-virtual {p3, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/uc/crashsdk/export/CrashApi;->c:Z

    .line 6
    invoke-static {p0}, Lcom/uc/crashsdk/export/CrashApi;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v2

    .line 7
    invoke-static {v2}, Lcom/uc/crashsdk/export/CrashApi;->b(Landroid/content/Context;)V

    .line 8
    new-instance p0, Lcom/uc/crashsdk/export/CustomInfo;

    invoke-direct {p0, p1}, Lcom/uc/crashsdk/export/CustomInfo;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mEnableStatReport:Z

    .line 10
    iput-boolean v1, p0, Lcom/uc/crashsdk/export/CustomInfo;->mZipLog:Z

    .line 11
    iput-boolean p2, p0, Lcom/uc/crashsdk/export/CustomInfo;->mPrintStackInfos:Z

    const-string p1, "crver"

    const-string p2, "2.0"

    .line 12
    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {p0, p3}, Lcom/uc/crashsdk/g;->a(Lcom/uc/crashsdk/export/CustomInfo;Landroid/os/Bundle;)Lcom/uc/crashsdk/export/CustomInfo;

    move-result-object v3

    .line 14
    invoke-static {p3}, Lcom/uc/crashsdk/g;->a(Landroid/os/Bundle;)Lcom/uc/crashsdk/export/VersionInfo;

    move-result-object v4

    const-string p0, "enableJavaLog"

    .line 15
    invoke-virtual {p3, p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    const-string p0, "enableNativeLog"

    .line 16
    invoke-virtual {p3, p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    const-string p1, "enableUnexpLog"

    .line 17
    invoke-static {}, Lcom/uc/crashsdk/b;->F()Z

    move-result p2

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const-string p2, "enableANRLog"

    .line 18
    invoke-virtual {p3, p2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    move-object v5, p4

    move v7, p0

    move v8, p1

    .line 19
    invoke-static/range {v2 .. v8}, Lcom/uc/crashsdk/export/CrashApi;->createInstance(Landroid/content/Context;Lcom/uc/crashsdk/export/CustomInfo;Lcom/uc/crashsdk/export/VersionInfo;Lcom/uc/crashsdk/export/ICrashClient;ZZZ)Lcom/uc/crashsdk/export/CrashApi;

    move-result-object p4

    const/high16 v0, 0x30000000

    .line 20
    invoke-virtual {p4, v0}, Lcom/uc/crashsdk/export/CrashApi;->disableLog(I)V

    .line 21
    invoke-static {p2}, Lcom/uc/crashsdk/b;->a(Z)V

    if-nez p0, :cond_2

    if-eqz p1, :cond_4

    :cond_2
    const-string p0, "libcrashsdk.so"

    .line 22
    invoke-static {p0}, Lcom/uc/crashsdk/e;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 23
    invoke-virtual {p4}, Lcom/uc/crashsdk/export/CrashApi;->crashSoLoaded()V

    goto :goto_0

    :cond_3
    const-string p0, "crashsdk"

    const-string p1, "load libcrashsdk.so failed!"

    .line 24
    invoke-static {p0, p1}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    const-string p0, "uploadLogDelaySeconds"

    const/16 p1, 0xf

    .line 25
    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz p0, :cond_5

    .line 26
    invoke-static {}, Lcom/uc/crashsdk/b;->F()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 27
    invoke-static {p0}, Lcom/uc/crashsdk/e;->b(I)V

    :cond_5
    return-object p4
.end method

.method public static getInstance()Lcom/uc/crashsdk/export/CrashApi;
    .locals 1

    sget-object v0, Lcom/uc/crashsdk/export/CrashApi;->a:Lcom/uc/crashsdk/export/CrashApi;

    return-object v0
.end method


# virtual methods
.method public addCachedInfo(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/uc/crashsdk/a;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    throw p1
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
.end method

.method public addDumpFile(Lcom/uc/crashsdk/export/DumpFileInfo;)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mCategory:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mFileTobeDump:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 3
    iget v4, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mLogType:I

    const v2, 0x100111

    and-int/2addr v2, v4

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 4
    :cond_0
    iget-boolean v2, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mIsEncrypted:Z

    iget-boolean v3, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mWriteCategory:Z

    iget-boolean v5, p1, Lcom/uc/crashsdk/export/DumpFileInfo;->mDeleteAfterDump:Z

    invoke-static/range {v0 .. v5}, Lcom/uc/crashsdk/a;->a(Ljava/lang/String;Ljava/lang/String;ZZIZ)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method public addDumpFile(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)I
    .locals 1

    .line 6
    new-instance v0, Lcom/uc/crashsdk/export/DumpFileInfo;

    invoke-direct {v0, p1, p2, p3}, Lcom/uc/crashsdk/export/DumpFileInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    if-eqz p4, :cond_0

    const-string p1, "mIsEncrypted"

    .line 7
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mIsEncrypted:Z

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mIsEncrypted:Z

    const-string p1, "mWriteCategory"

    .line 8
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mWriteCategory:Z

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mWriteCategory:Z

    const-string p1, "mDeleteAfterDump"

    .line 9
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mDeleteAfterDump:Z

    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/DumpFileInfo;->mDeleteAfterDump:Z

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Lcom/uc/crashsdk/export/CrashApi;->addDumpFile(Lcom/uc/crashsdk/export/DumpFileInfo;)I

    move-result p1

    return p1
.end method

.method public addHeaderInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lcom/uc/crashsdk/a;->a(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public addStatInfo(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "addStatInfo"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/uc/crashsdk/a/g;->a(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v2, 0x18

    .line 22
    .line 23
    if-gt v0, v2, :cond_2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v2, 0x200

    .line 32
    .line 33
    if-le v0, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_1
    invoke-static {p1, p2}, Lcom/uc/crashsdk/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string p2, "key is too long!"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_3
    const/4 p1, 0x0

    .line 53
    throw p1
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

.method public crashSoLoaded()V
    .locals 3

    .line 1
    const-string v0, "crashSoLoaded"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    sput-boolean v0, Lcom/uc/crashsdk/b;->f:Z

    .line 12
    .line 13
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->b()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/uc/crashsdk/b;->e:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    sget-boolean v2, Lcom/uc/crashsdk/b;->h:Z

    .line 20
    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    sget-boolean v2, Lcom/uc/crashsdk/b;->f:Z

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-boolean v2, Lcom/uc/crashsdk/b;->c:Z

    .line 29
    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    sget-boolean v2, Lcom/uc/crashsdk/b;->d:Z

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    invoke-static {}, Lcom/uc/crashsdk/export/CrashApi;->c()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/uc/crashsdk/g;->d()V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-static {}, Lcom/uc/crashsdk/e;->x()V

    .line 43
    .line 44
    .line 45
    sput-boolean v0, Lcom/uc/crashsdk/b;->c:Z

    .line 46
    .line 47
    :cond_3
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-static {}, Lcom/uc/crashsdk/a;->n()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/uc/crashsdk/e;->m()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public createCachedInfo(Ljava/lang/String;II)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-lez p2, :cond_1

    .line 5
    .line 6
    const v0, 0x100111

    .line 7
    .line 8
    .line 9
    and-int/2addr v0, p3

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    invoke-static {p1, p2, p3}, Lcom/uc/crashsdk/a;->a(Ljava/lang/String;II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p2, "capacity must > 0!"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
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
.end method

.method public disableLog(I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/uc/crashsdk/b;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, Lcom/uc/crashsdk/b;->b(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/uc/crashsdk/export/LogType;->isForJava(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-boolean v1, Lcom/uc/crashsdk/b;->a:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lcom/uc/crashsdk/e;->t()V

    .line 19
    .line 20
    .line 21
    sput-boolean v2, Lcom/uc/crashsdk/b;->a:Z

    .line 22
    .line 23
    :cond_0
    invoke-static {p1}, Lcom/uc/crashsdk/export/LogType;->isForNative(I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    sget-boolean v1, Lcom/uc/crashsdk/b;->b:Z

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    invoke-static {v1}, Lcom/uc/crashsdk/JNIBridge;->cmd(I)J

    .line 36
    .line 37
    .line 38
    sput-boolean v2, Lcom/uc/crashsdk/b;->b:Z

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sput-boolean v2, Lcom/uc/crashsdk/b;->g:Z

    .line 42
    .line 43
    :cond_2
    :goto_0
    invoke-static {p1}, Lcom/uc/crashsdk/export/LogType;->isForANR(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-static {v2}, Lcom/uc/crashsdk/b;->a(Z)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-static {p1}, Lcom/uc/crashsdk/export/LogType;->isForUnexp(I)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    sget-boolean p1, Lcom/uc/crashsdk/b;->c:Z

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    invoke-static {}, Lcom/uc/crashsdk/e;->z()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    sput-boolean v2, Lcom/uc/crashsdk/b;->c:Z

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    sput-boolean v2, Lcom/uc/crashsdk/b;->h:Z

    .line 72
    .line 73
    :cond_5
    :goto_1
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    throw p1
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public generateCustomLog(Lcom/uc/crashsdk/export/CustomLogInfo;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object v0, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mData:Ljava/lang/StringBuffer;

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mLogType:Ljava/lang/String;

    if-eqz v0, :cond_a

    const-string v1, "_"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mLogType:Ljava/lang/String;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 4
    iget-object v0, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mDumpTids:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    iget-object v3, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mDumpTids:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 7
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 9
    :cond_1
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddHeader:Z

    if-eqz v1, :cond_2

    const-wide/16 v3, 0x1

    goto :goto_1

    :cond_2
    const-wide/16 v3, 0x0

    .line 10
    :goto_1
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddFooter:Z

    if-eqz v1, :cond_3

    const-wide/16 v5, 0x2

    or-long/2addr v3, v5

    .line 11
    :cond_3
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddLogcat:Z

    if-eqz v1, :cond_4

    const-wide/16 v5, 0x4

    or-long/2addr v3, v5

    .line 12
    :cond_4
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddThreadsDump:Z

    if-eqz v1, :cond_5

    const-wide/16 v5, 0x8

    or-long/2addr v3, v5

    .line 13
    :cond_5
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddBuildId:Z

    if-eqz v1, :cond_6

    const-wide/16 v5, 0x10

    or-long/2addr v3, v5

    .line 14
    :cond_6
    iget-boolean v1, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mUploadNow:Z

    if-eqz v1, :cond_7

    const-wide/16 v5, 0x20

    or-long/2addr v3, v5

    :cond_7
    move-wide v7, v3

    .line 15
    iget-object v5, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mData:Ljava/lang/StringBuffer;

    iget-object v6, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mLogType:Ljava/lang/String;

    iget-object v9, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mDumpFiles:Ljava/util/ArrayList;

    iget-object v10, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mCallbacks:Ljava/util/ArrayList;

    iget-object v11, p1, Lcom/uc/crashsdk/export/CustomLogInfo;->mCachedInfos:Ljava/util/ArrayList;

    if-eqz v0, :cond_8

    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_8
    move-object v12, v2

    .line 17
    invoke-static/range {v5 .. v12}, Lcom/uc/crashsdk/e;->a(Ljava/lang/StringBuffer;Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 18
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mLogType can not contain char \'_\' and \' \'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "mData or mLogType is null!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public generateCustomLog(Ljava/lang/StringBuffer;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    .line 20
    new-instance v0, Lcom/uc/crashsdk/export/CustomLogInfo;

    invoke-direct {v0, p1, p2}, Lcom/uc/crashsdk/export/CustomLogInfo;-><init>(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    const-string p1, "mAddHeader"

    .line 21
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddHeader:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddHeader:Z

    const-string p1, "mAddFooter"

    .line 22
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddFooter:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddFooter:Z

    const-string p1, "mAddLogcat"

    .line 23
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddLogcat:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddLogcat:Z

    const-string p1, "mUploadNow"

    .line 24
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mUploadNow:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mUploadNow:Z

    const-string p1, "mAddThreadsDump"

    .line 25
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddThreadsDump:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddThreadsDump:Z

    const-string p1, "mAddBuildId"

    .line 26
    iget-boolean p2, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddBuildId:Z

    invoke-virtual {p3, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mAddBuildId:Z

    const-string p1, "mDumpFiles"

    .line 27
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mDumpFiles:Ljava/util/ArrayList;

    const-string p1, "mCallbacks"

    .line 28
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mCallbacks:Ljava/util/ArrayList;

    const-string p1, "mCachedInfos"

    .line 29
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mCachedInfos:Ljava/util/ArrayList;

    const-string p1, "mDumpTids"

    .line 30
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Lcom/uc/crashsdk/export/CustomLogInfo;->mDumpTids:Ljava/util/ArrayList;

    .line 31
    :cond_0
    invoke-virtual {p0, v0}, Lcom/uc/crashsdk/export/CrashApi;->generateCustomLog(Lcom/uc/crashsdk/export/CustomLogInfo;)Z

    move-result p1

    return p1
.end method

.method public generateTraces(Ljava/lang/String;J)Z
    .locals 4

    .line 1
    const-string v0, "generateTraces"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    sget-boolean v0, Lcom/uc/crashsdk/b;->d:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string p1, "crashsdk"

    .line 16
    .line 17
    const-string p2, "Crash so is not loaded!"

    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/uc/crashsdk/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/16 v0, 0xc

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v0, p2, p3, p1, v2}, Lcom/uc/crashsdk/JNIBridge;->nativeCmd(IJLjava/lang/String;[Ljava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    const-wide/16 v2, 0x1

    .line 31
    .line 32
    cmp-long p1, p1, v2

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_2
    return v1
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
.end method

.method public getCrashLogUploadUrl()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "getCrashLogUploadUrl"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/e;->k()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getHostFd()Landroid/os/ParcelFileDescriptor;
    .locals 1

    invoke-static {}, Lcom/uc/crashsdk/e;->E()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public getIsolatedHostFd()Landroid/os/ParcelFileDescriptor;
    .locals 1

    invoke-static {}, Lcom/uc/crashsdk/e;->E()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public getLastExitType()I
    .locals 1

    .line 1
    const-string v0, "getLastExitType"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/b;->I()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getLastExitTypeEx()I
    .locals 1

    .line 1
    const-string v0, "getLastExitTypeEx"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/b;->J()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getUncaughtException()Ljava/lang/Throwable;
    .locals 1

    invoke-static {}, Lcom/uc/crashsdk/e;->v()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public getUnexpReason()I
    .locals 1

    .line 1
    const-string v0, "getUnexpReason"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x64

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/e;->w()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public onExit()V
    .locals 0

    invoke-static {}, Lcom/uc/crashsdk/b;->w()V

    return-void
.end method

.method public registerCallback(ILandroid/webkit/ValueCallback;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/webkit/ValueCallback<",
            "Landroid/os/Bundle;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lcom/uc/crashsdk/d;->b(Landroid/webkit/ValueCallback;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "Unknown event type: "

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p2

    .line 41
    :cond_1
    invoke-static {p2}, Lcom/uc/crashsdk/d;->d(Landroid/webkit/ValueCallback;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    invoke-static {p2}, Lcom/uc/crashsdk/d;->c(Landroid/webkit/ValueCallback;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_3
    invoke-static {p2}, Lcom/uc/crashsdk/d;->a(Landroid/webkit/ValueCallback;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1
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

.method public registerInfoCallback(Ljava/lang/String;I)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x100111

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move v1, p2

    .line 2
    invoke-static/range {v0 .. v5}, Lcom/uc/crashsdk/a;->a(Ljava/lang/String;ILjava/util/concurrent/Callable;JI)I

    move-result p1

    return p1
.end method

.method public registerInfoCallback(Ljava/lang/String;ILjava/util/concurrent/Callable;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p3, :cond_1

    const v0, 0x100111

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move v1, p2

    move-object v2, p3

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/uc/crashsdk/a;->a(Ljava/lang/String;ILjava/util/concurrent/Callable;JI)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 4
    throw p1
.end method

.method public registerThread(ILjava/lang/String;)I
    .locals 0

    invoke-static {p1, p2}, Lcom/uc/crashsdk/a;->a(ILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public reportCrashStats(Z)I
    .locals 2

    .line 1
    const-string v0, "reportCrashStats"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/g;->O()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "CrashApi::reportCrashStats. currentProcessOnly: "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lcom/uc/crashsdk/e;->d(Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/uc/crashsdk/e;->e(Z)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
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

.method public resetCrashStats(Z)I
    .locals 2

    .line 1
    const-string v0, "resetCrashStats"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/g;->O()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "CrashApi::resetCrashStats. currentProcessOnly: "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lcom/uc/crashsdk/a/a;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, Lcom/uc/crashsdk/e;->f(Z)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
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

.method public setForeground(Z)V
    .locals 0

    invoke-static {p1}, Lcom/uc/crashsdk/b;->b(Z)V

    return-void
.end method

.method public setHostFd(Landroid/os/ParcelFileDescriptor;)Z
    .locals 0

    invoke-static {p1}, Lcom/uc/crashsdk/e;->a(Landroid/os/ParcelFileDescriptor;)Z

    move-result p1

    return p1
.end method

.method public setIsolatedHostFd(Landroid/os/ParcelFileDescriptor;)Z
    .locals 0

    invoke-static {p1}, Lcom/uc/crashsdk/e;->a(Landroid/os/ParcelFileDescriptor;)Z

    move-result p1

    return p1
.end method

.method public setNewInstall()V
    .locals 1

    .line 1
    const-string v0, "setNewInstall"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {}, Lcom/uc/crashsdk/b;->v()V

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

.method public updateCustomInfo(Landroid/os/Bundle;)I
    .locals 1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 4
    invoke-static {v0, p1}, Lcom/uc/crashsdk/g;->a(Lcom/uc/crashsdk/export/CustomInfo;Landroid/os/Bundle;)Lcom/uc/crashsdk/export/CustomInfo;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/uc/crashsdk/export/CrashApi;->updateCustomInfo(Lcom/uc/crashsdk/export/CustomInfo;)I

    move-result p1

    return p1
.end method

.method public updateCustomInfo(Lcom/uc/crashsdk/export/CustomInfo;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-static {p1}, Lcom/uc/crashsdk/g;->b(Lcom/uc/crashsdk/export/CustomInfo;)I

    move-result p1

    return p1
.end method

.method public updateUnexpInfo()Z
    .locals 1

    .line 1
    const-string v0, "updateUnexpInfo"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    invoke-static {v0}, Lcom/uc/crashsdk/a;->a(Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public updateVersionInfo(Landroid/os/Bundle;)V
    .locals 0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-static {p1}, Lcom/uc/crashsdk/g;->a(Landroid/os/Bundle;)Lcom/uc/crashsdk/export/VersionInfo;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/uc/crashsdk/export/CrashApi;->updateVersionInfo(Lcom/uc/crashsdk/export/VersionInfo;)V

    return-void
.end method

.method public updateVersionInfo(Lcom/uc/crashsdk/export/VersionInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-static {p1}, Lcom/uc/crashsdk/g;->a(Lcom/uc/crashsdk/export/VersionInfo;)V

    return-void
.end method

.method public uploadCrashLogs()V
    .locals 2

    .line 1
    const-string v0, "uploadCrashLogs"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/uc/crashsdk/export/CrashApi;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v0, v1}, Lcom/uc/crashsdk/e;->a(ZZ)Z

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
.end method
