.class public Lcom/ss/android/socialbase/appdownloader/e/a;
.super Lcom/ss/android/socialbase/downloader/notification/a;
.source "SourceFile"


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/content/res/Resources;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/ss/android/socialbase/downloader/notification/a;-><init>(ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->e:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->d:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->c:Landroid/content/res/Resources;

    .line 21
    .line 22
    return-void
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
.end method

.method private a(I)I
    .locals 1

    .line 24
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p1

    const-string v0, "enable_notification_ui"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 25
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->h()I

    move-result p1

    return p1

    .line 26
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->g()I

    move-result p1

    return p1
.end method

.method private a(II)I
    .locals 1

    .line 13
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    move-result-object p2

    const-string v0, "notification_opt_2"

    invoke-virtual {p2, v0}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 14
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->v()I

    move-result p1

    return p1

    :cond_0
    if-eq p1, v0, :cond_4

    const/4 p2, 0x4

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    .line 15
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->u()I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p2, 0x3

    if-ne p1, p2, :cond_3

    .line 16
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->v()I

    move-result p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    .line 17
    :cond_4
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->t()I

    move-result p1

    :goto_1
    return p1
.end method

.method private a(Ljava/lang/String;II)Landroid/app/PendingIntent;
    .locals 3

    .line 18
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    const-class v2, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 19
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "extra_click_download_ids"

    .line 20
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "extra_click_download_type"

    .line 21
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "extra_from_notification"

    const/4 p2, 0x1

    .line 22
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 23
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    const/high16 p2, 0xc000000

    invoke-static {p1, p3, v0, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v1

    const/16 v2, 0x3f5

    if-eq v1, v2, :cond_0

    .line 10
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result p1

    const/16 v1, 0x419

    if-ne p1, v1, :cond_1

    :cond_0
    if-eqz p3, :cond_1

    const-string p1, "application/vnd.android.package-archive"

    .line 11
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "notification_text_opt"

    .line 12
    invoke-virtual {p2, p1, v0}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    move v0, p2

    :cond_1
    return v0
.end method

.method private b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)Landroid/app/Notification;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/c;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/appdownloader/e/a;->j()Landroidx/core/app/NotificationCompat$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->f()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    invoke-virtual {v4, v5, v6}, Landroidx/core/app/NotificationCompat$Builder;->setWhen(J)Landroidx/core/app/NotificationCompat$Builder;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->a()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "set_notification_group"

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    invoke-virtual {v6, v7, v8}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/4 v9, 0x1

    .line 44
    if-ne v7, v9, :cond_1

    .line 45
    .line 46
    const-string v7, "com.ss.android.socialbase.APP_DOWNLOADER"

    .line 47
    .line 48
    invoke-virtual {v4, v7}, Landroidx/core/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v8}, Landroidx/core/app/NotificationCompat$Builder;->setGroupSummary(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->w()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4, v7}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 61
    .line 62
    .line 63
    move v7, v8

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v7, v9

    .line 66
    :goto_0
    new-instance v10, Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;

    .line 67
    .line 68
    invoke-direct {v10}, Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v10}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v3, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(II)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    if-eqz v10, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v10}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 83
    .line 84
    .line 85
    :cond_3
    const/4 v7, -0x3

    .line 86
    const/4 v11, -0x4

    .line 87
    const/4 v12, 0x3

    .line 88
    const/4 v13, 0x4

    .line 89
    const-string v14, "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT"

    .line 90
    .line 91
    const/4 v15, -0x1

    .line 92
    const/4 v8, 0x2

    .line 93
    if-eq v3, v9, :cond_8

    .line 94
    .line 95
    if-eq v3, v13, :cond_8

    .line 96
    .line 97
    if-ne v3, v8, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    if-ne v3, v12, :cond_9

    .line 101
    .line 102
    invoke-virtual {v4, v9}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 103
    .line 104
    .line 105
    if-eq v2, v15, :cond_7

    .line 106
    .line 107
    if-ne v2, v11, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    if-ne v2, v7, :cond_6

    .line 111
    .line 112
    const-string v2, "notification_click_install_auto_cancel"

    .line 113
    .line 114
    invoke-virtual {v6, v2, v9}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_6

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 122
    .line 123
    .line 124
    :cond_6
    const-string v14, "android.ss.intent.action.DOWNLOAD_OPEN"

    .line 125
    .line 126
    :cond_7
    :goto_1
    invoke-direct {v0, v14, v3, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(Ljava/lang/String;II)Landroid/app/PendingIntent;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 131
    .line 132
    .line 133
    const-string v2, "android.ss.intent.action.DOWNLOAD_HIDE"

    .line 134
    .line 135
    invoke-direct {v0, v2, v3, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(Ljava/lang/String;II)Landroid/app/PendingIntent;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_8
    :goto_2
    invoke-direct {v0, v14, v3, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(Ljava/lang/String;II)Landroid/app/PendingIntent;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 152
    .line 153
    .line 154
    :cond_9
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->b()J

    .line 155
    .line 156
    .line 157
    move-result-wide v11

    .line 158
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->c()J

    .line 159
    .line 160
    .line 161
    move-result-wide v7

    .line 162
    const-wide/16 v17, 0x0

    .line 163
    .line 164
    cmp-long v17, v7, v17

    .line 165
    .line 166
    if-lez v17, :cond_a

    .line 167
    .line 168
    const-wide/16 v17, 0x64

    .line 169
    .line 170
    mul-long v17, v17, v11

    .line 171
    .line 172
    div-long v13, v17, v7

    .line 173
    .line 174
    long-to-int v13, v13

    .line 175
    goto :goto_4

    .line 176
    :cond_a
    const/4 v13, 0x0

    .line 177
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->d()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v17

    .line 185
    if-eqz v17, :cond_b

    .line 186
    .line 187
    const-string v14, "tt_appdownloader_download_unknown_title"

    .line 188
    .line 189
    invoke-static {v14}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    iget-object v2, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->c:Landroid/content/res/Resources;

    .line 194
    .line 195
    invoke-virtual {v2, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    :cond_b
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/appdownloader/e/a;->i()Landroid/widget/RemoteViews;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    const-string v1, "notification_opt_2"

    .line 212
    .line 213
    invoke-virtual {v9, v1}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    move-object/from16 v22, v4

    .line 218
    .line 219
    const/4 v4, 0x1

    .line 220
    if-eq v9, v4, :cond_c

    .line 221
    .line 222
    const-string v9, "android.ss.intent.action.DOWNLOAD_CLICK_BTN"

    .line 223
    .line 224
    invoke-direct {v0, v9, v3, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(Ljava/lang/String;II)Landroid/app/PendingIntent;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    invoke-virtual {v2, v15, v9}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 229
    .line 230
    .line 231
    :cond_c
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    const-string v4, "enable_notification_ui"

    .line 236
    .line 237
    invoke-virtual {v9, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    move-object/from16 v23, v1

    .line 242
    .line 243
    const-string v1, "setBackgroundResource"

    .line 244
    .line 245
    move-object/from16 v24, v6

    .line 246
    .line 247
    const/4 v6, 0x1

    .line 248
    if-lt v9, v6, :cond_d

    .line 249
    .line 250
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->s()I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    invoke-virtual {v2, v15, v1, v6}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 255
    .line 256
    .line 257
    const/4 v6, -0x1

    .line 258
    invoke-virtual {v2, v15, v6}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 259
    .line 260
    .line 261
    :cond_d
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->m()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-virtual {v2, v6, v14}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 266
    .line 267
    .line 268
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    const/4 v9, 0x0

    .line 273
    invoke-virtual {v2, v6, v9}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 274
    .line 275
    .line 276
    const/16 v9, 0x64

    .line 277
    .line 278
    move/from16 v14, p2

    .line 279
    .line 280
    invoke-virtual {v2, v6, v9, v13, v14}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 281
    .line 282
    .line 283
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->l()I

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v10, :cond_e

    .line 288
    .line 289
    invoke-virtual {v2, v6, v10}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 290
    .line 291
    .line 292
    :cond_e
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/g/a;->a(I)Lcom/ss/android/socialbase/downloader/g/a;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    invoke-virtual {v9, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    const/4 v10, 0x1

    .line 301
    if-lt v9, v10, :cond_10

    .line 302
    .line 303
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e/c;->a()Lcom/ss/android/socialbase/appdownloader/e/c;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-virtual {v9, v5}, Lcom/ss/android/socialbase/appdownloader/e/c;->a(I)Landroid/graphics/Bitmap;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    if-eqz v9, :cond_f

    .line 312
    .line 313
    const-string v1, "setBackgroundColor"

    .line 314
    .line 315
    const/4 v10, 0x0

    .line 316
    invoke-virtual {v2, v6, v1, v10}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v6, v9}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_f
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->s()I

    .line 324
    .line 325
    .line 326
    move-result v9

    .line 327
    invoke-virtual {v2, v6, v1, v9}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 328
    .line 329
    .line 330
    :cond_10
    :goto_5
    const-string v1, "/"

    .line 331
    .line 332
    const/4 v9, 0x1

    .line 333
    if-eq v3, v9, :cond_2d

    .line 334
    .line 335
    const/4 v9, 0x4

    .line 336
    if-ne v3, v9, :cond_11

    .line 337
    .line 338
    goto/16 :goto_15

    .line 339
    .line 340
    :cond_11
    const-string v9, "tt_appdownloader_notification_download_resume"

    .line 341
    .line 342
    const/4 v10, 0x2

    .line 343
    if-ne v3, v10, :cond_16

    .line 344
    .line 345
    new-instance v3, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-static {v11, v12}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-static {v7, v8}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    const-string v10, "tt_appdownloader_notification_pausing"

    .line 372
    .line 373
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    iget-object v14, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 378
    .line 379
    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 380
    .line 381
    .line 382
    move-result-object v14

    .line 383
    invoke-virtual {v14, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-static {v9}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    iget-object v14, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 392
    .line 393
    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    invoke-virtual {v14, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    move-object/from16 v15, v23

    .line 402
    .line 403
    move-object/from16 v14, v24

    .line 404
    .line 405
    invoke-virtual {v14, v15}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    move-result v15

    .line 409
    const/4 v6, 0x1

    .line 410
    if-ne v15, v6, :cond_13

    .line 411
    .line 412
    const-string v6, "noti_progress_show_th"

    .line 413
    .line 414
    const/16 v15, 0x46

    .line 415
    .line 416
    invoke-virtual {v14, v6, v15}, Lcom/ss/android/socialbase/downloader/g/a;->a(Ljava/lang/String;I)I

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    if-lt v13, v6, :cond_12

    .line 421
    .line 422
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    const/4 v6, 0x0

    .line 427
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 428
    .line 429
    .line 430
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 435
    .line 436
    .line 437
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    const/16 v13, 0x8

    .line 442
    .line 443
    invoke-virtual {v2, v5, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 444
    .line 445
    .line 446
    move v6, v13

    .line 447
    goto :goto_7

    .line 448
    :cond_12
    const/4 v6, 0x0

    .line 449
    const/16 v13, 0x8

    .line 450
    .line 451
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    invoke-virtual {v2, v5, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    invoke-virtual {v2, v5, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 463
    .line 464
    .line 465
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 470
    .line 471
    .line 472
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->o()I

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    invoke-virtual {v2, v5, v13}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 477
    .line 478
    .line 479
    const-string v5, "tt_appdownloader_notification_download_continue"

    .line 480
    .line 481
    invoke-static {v5}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    iget-object v10, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->c:Landroid/content/res/Resources;

    .line 486
    .line 487
    invoke-virtual {v10, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    const/16 v6, 0x8

    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_13
    const/4 v6, 0x0

    .line 495
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 496
    .line 497
    .line 498
    move-result v13

    .line 499
    invoke-virtual {v2, v13, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 500
    .line 501
    .line 502
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 507
    .line 508
    .line 509
    move-result v13

    .line 510
    const/4 v15, 0x2

    .line 511
    if-lt v13, v15, :cond_14

    .line 512
    .line 513
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 514
    .line 515
    .line 516
    const/16 v6, 0x8

    .line 517
    .line 518
    goto :goto_6

    .line 519
    :cond_14
    const/16 v6, 0x8

    .line 520
    .line 521
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 522
    .line 523
    .line 524
    :goto_6
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 529
    .line 530
    .line 531
    :goto_7
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    iget-object v13, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->f:Ljava/lang/String;

    .line 536
    .line 537
    invoke-static {v13}, Lcom/ss/android/socialbase/appdownloader/c;->a(Ljava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result v13

    .line 541
    if-eqz v13, :cond_15

    .line 542
    .line 543
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 544
    .line 545
    .line 546
    goto/16 :goto_18

    .line 547
    .line 548
    :cond_15
    const/4 v6, 0x0

    .line 549
    invoke-virtual {v2, v5, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    const/4 v5, 0x2

    .line 557
    if-lt v4, v5, :cond_32

    .line 558
    .line 559
    new-instance v3, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 562
    .line 563
    .line 564
    invoke-static {v11, v12, v6}, Lcom/ss/android/socialbase/appdownloader/c;->a(JZ)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-static {v7, v8, v6}, Lcom/ss/android/socialbase/appdownloader/c;->a(JZ)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    goto/16 :goto_18

    .line 586
    .line 587
    :cond_16
    move-object/from16 v15, v23

    .line 588
    .line 589
    move-object/from16 v14, v24

    .line 590
    .line 591
    const-string v6, ""

    .line 592
    .line 593
    const/4 v10, 0x3

    .line 594
    if-ne v3, v10, :cond_2c

    .line 595
    .line 596
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->O()Landroid/content/Context;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-virtual {v3, v5}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    const/4 v13, -0x1

    .line 613
    if-eq v10, v13, :cond_1e

    .line 614
    .line 615
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 616
    .line 617
    .line 618
    move-result v10

    .line 619
    const/4 v13, -0x4

    .line 620
    if-ne v10, v13, :cond_17

    .line 621
    .line 622
    goto/16 :goto_c

    .line 623
    .line 624
    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 625
    .line 626
    .line 627
    move-result v9

    .line 628
    const/4 v10, -0x3

    .line 629
    if-ne v9, v10, :cond_1d

    .line 630
    .line 631
    invoke-static {v7, v8}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v9

    .line 635
    if-eqz v3, :cond_19

    .line 636
    .line 637
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v10

    .line 641
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 642
    .line 643
    .line 644
    move-result v10

    .line 645
    if-nez v10, :cond_19

    .line 646
    .line 647
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v10

    .line 651
    const-string v13, "application/vnd.android.package-archive"

    .line 652
    .line 653
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    if-eqz v10, :cond_19

    .line 658
    .line 659
    iget-object v10, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    invoke-static {v10, v3, v13}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)Z

    .line 663
    .line 664
    .line 665
    move-result v10

    .line 666
    if-eqz v10, :cond_18

    .line 667
    .line 668
    const-string v10, "tt_appdownloader_notification_install_finished_open"

    .line 669
    .line 670
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    const-string v13, "tt_appdownloader_notification_download_open"

    .line 675
    .line 676
    invoke-static {v13}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 677
    .line 678
    .line 679
    move-result v13

    .line 680
    goto :goto_8

    .line 681
    :cond_18
    const-string v10, "tt_appdownloader_notification_download_complete_with_install"

    .line 682
    .line 683
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 684
    .line 685
    .line 686
    move-result v10

    .line 687
    const-string v13, "tt_appdownloader_notification_download_install"

    .line 688
    .line 689
    invoke-static {v13}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 690
    .line 691
    .line 692
    move-result v13

    .line 693
    :goto_8
    move-object/from16 v16, v6

    .line 694
    .line 695
    goto :goto_9

    .line 696
    :cond_19
    const-string v10, "tt_appdownloader_notification_download_complete_without_install"

    .line 697
    .line 698
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 699
    .line 700
    .line 701
    move-result v10

    .line 702
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/d;->a()Lcom/ss/android/socialbase/downloader/downloader/d;

    .line 703
    .line 704
    .line 705
    move-result-object v13

    .line 706
    invoke-virtual {v13, v5}, Lcom/ss/android/socialbase/downloader/downloader/d;->m(I)Lcom/ss/android/socialbase/downloader/depend/af;

    .line 707
    .line 708
    .line 709
    move-result-object v13

    .line 710
    if-eqz v13, :cond_1a

    .line 711
    .line 712
    const-string v10, "tt_appdownloader_notification_download_complete_open"

    .line 713
    .line 714
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 715
    .line 716
    .line 717
    move-result v10

    .line 718
    :cond_1a
    move-object/from16 v16, v6

    .line 719
    .line 720
    const/4 v13, 0x0

    .line 721
    :goto_9
    iget-object v6, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->c:Landroid/content/res/Resources;

    .line 722
    .line 723
    invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v6

    .line 727
    move-object/from16 v10, v22

    .line 728
    .line 729
    invoke-virtual {v10, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 730
    .line 731
    .line 732
    move-object/from16 v17, v6

    .line 733
    .line 734
    if-eqz v13, :cond_1b

    .line 735
    .line 736
    iget-object v6, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->c:Landroid/content/res/Resources;

    .line 737
    .line 738
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v6

    .line 742
    goto :goto_a

    .line 743
    :cond_1b
    move-object/from16 v6, v16

    .line 744
    .line 745
    :goto_a
    invoke-virtual {v14, v15}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 746
    .line 747
    .line 748
    move-result v13

    .line 749
    const/4 v15, 0x1

    .line 750
    if-ne v13, v15, :cond_1c

    .line 751
    .line 752
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 753
    .line 754
    .line 755
    move-result v13

    .line 756
    invoke-virtual {v2, v13, v6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 757
    .line 758
    .line 759
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->o()I

    .line 760
    .line 761
    .line 762
    move-result v13

    .line 763
    const/16 v15, 0x8

    .line 764
    .line 765
    invoke-virtual {v2, v13, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 766
    .line 767
    .line 768
    goto :goto_b

    .line 769
    :cond_1c
    const/16 v15, 0x8

    .line 770
    .line 771
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 772
    .line 773
    .line 774
    move-result v13

    .line 775
    invoke-virtual {v2, v13, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 776
    .line 777
    .line 778
    :goto_b
    move-object/from16 v13, p1

    .line 779
    .line 780
    move-object/from16 v16, v9

    .line 781
    .line 782
    move-object/from16 v22, v10

    .line 783
    .line 784
    const/4 v10, 0x0

    .line 785
    move-object v9, v6

    .line 786
    goto/16 :goto_13

    .line 787
    .line 788
    :cond_1d
    move-object/from16 v16, v6

    .line 789
    .line 790
    move-object/from16 v13, p1

    .line 791
    .line 792
    move-object/from16 v9, v16

    .line 793
    .line 794
    move-object/from16 v17, v9

    .line 795
    .line 796
    const/4 v10, 0x0

    .line 797
    goto/16 :goto_13

    .line 798
    .line 799
    :cond_1e
    :goto_c
    move-object/from16 v16, v6

    .line 800
    .line 801
    move-object/from16 v10, v22

    .line 802
    .line 803
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 804
    .line 805
    .line 806
    move-result v6

    .line 807
    const/4 v13, 0x2

    .line 808
    if-lt v6, v13, :cond_20

    .line 809
    .line 810
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 811
    .line 812
    .line 813
    move-result v6

    .line 814
    const/4 v13, -0x1

    .line 815
    if-ne v6, v13, :cond_20

    .line 816
    .line 817
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/Throwable;)Z

    .line 818
    .line 819
    .line 820
    move-result v6

    .line 821
    if-nez v6, :cond_1f

    .line 822
    .line 823
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/Throwable;)Z

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    if-eqz v6, :cond_20

    .line 828
    .line 829
    :cond_1f
    new-instance v6, Ljava/lang/StringBuilder;

    .line 830
    .line 831
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 832
    .line 833
    .line 834
    invoke-static {v11, v12}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v13

    .line 838
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    .line 843
    .line 844
    invoke-static {v7, v8}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v13

    .line 848
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    goto :goto_d

    .line 856
    :cond_20
    move-object/from16 v6, v16

    .line 857
    .line 858
    :goto_d
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->o()I

    .line 859
    .line 860
    .line 861
    move-result v13

    .line 862
    const/16 v15, 0x8

    .line 863
    .line 864
    invoke-virtual {v2, v13, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 865
    .line 866
    .line 867
    move-object/from16 v13, p1

    .line 868
    .line 869
    if-eqz v13, :cond_21

    .line 870
    .line 871
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    .line 872
    .line 873
    .line 874
    move-result v15

    .line 875
    move-object/from16 v16, v6

    .line 876
    .line 877
    const/16 v6, 0x3ee

    .line 878
    .line 879
    if-ne v15, v6, :cond_22

    .line 880
    .line 881
    const-string v6, "tt_appdownloader_notification_download_space_failed"

    .line 882
    .line 883
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 884
    .line 885
    .line 886
    move-result v6

    .line 887
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 888
    .line 889
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 890
    .line 891
    .line 892
    move-result-object v15

    .line 893
    invoke-virtual {v15, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v6

    .line 897
    goto :goto_10

    .line 898
    :cond_21
    move-object/from16 v16, v6

    .line 899
    .line 900
    :cond_22
    invoke-direct {v0, v13, v14, v3}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/g/a;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 901
    .line 902
    .line 903
    move-result v6

    .line 904
    if-eqz v6, :cond_25

    .line 905
    .line 906
    if-eqz v3, :cond_23

    .line 907
    .line 908
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    .line 909
    .line 910
    .line 911
    move-result v6

    .line 912
    if-eqz v6, :cond_23

    .line 913
    .line 914
    const/4 v6, 0x1

    .line 915
    goto :goto_e

    .line 916
    :cond_23
    const/4 v6, 0x0

    .line 917
    :goto_e
    if-eqz v6, :cond_24

    .line 918
    .line 919
    const-string v6, "tt_appdownloader_notification_download_waiting_wifi"

    .line 920
    .line 921
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 922
    .line 923
    .line 924
    move-result v6

    .line 925
    goto :goto_f

    .line 926
    :cond_24
    const-string v6, "tt_appdownloader_notification_download_waiting_net"

    .line 927
    .line 928
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    :goto_f
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 933
    .line 934
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 935
    .line 936
    .line 937
    move-result-object v15

    .line 938
    invoke-virtual {v15, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v6

    .line 942
    goto :goto_10

    .line 943
    :cond_25
    const-string v6, "tt_appdownloader_notification_download_failed"

    .line 944
    .line 945
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 946
    .line 947
    .line 948
    move-result v6

    .line 949
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 950
    .line 951
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 952
    .line 953
    .line 954
    move-result-object v15

    .line 955
    invoke-virtual {v15, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v6

    .line 959
    :goto_10
    const-string v15, "tt_appdownloader_notification_download_restart"

    .line 960
    .line 961
    invoke-static {v15}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 962
    .line 963
    .line 964
    move-result v15

    .line 965
    move-object/from16 v17, v6

    .line 966
    .line 967
    iget-object v6, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 968
    .line 969
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 970
    .line 971
    .line 972
    move-result-object v6

    .line 973
    invoke-virtual {v6, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 978
    .line 979
    .line 980
    move-result v15

    .line 981
    move-object/from16 v19, v6

    .line 982
    .line 983
    const/16 v6, 0x8

    .line 984
    .line 985
    invoke-virtual {v2, v15, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 989
    .line 990
    .line 991
    move-result v6

    .line 992
    const/4 v15, 0x2

    .line 993
    if-lt v6, v15, :cond_28

    .line 994
    .line 995
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 996
    .line 997
    .line 998
    move-result v6

    .line 999
    const/4 v15, -0x1

    .line 1000
    if-ne v6, v15, :cond_28

    .line 1001
    .line 1002
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/Throwable;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v6

    .line 1006
    if-eqz v6, :cond_27

    .line 1007
    .line 1008
    invoke-static {v13, v3}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v6

    .line 1012
    if-eqz v6, :cond_26

    .line 1013
    .line 1014
    const-string v6, "tt_appdownloader_notification_no_wifi_and_in_net"

    .line 1015
    .line 1016
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1017
    .line 1018
    .line 1019
    move-result v6

    .line 1020
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1021
    .line 1022
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v15

    .line 1026
    invoke-virtual {v15, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v6

    .line 1030
    invoke-static {v9}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1031
    .line 1032
    .line 1033
    move-result v9

    .line 1034
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1035
    .line 1036
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v15

    .line 1040
    invoke-virtual {v15, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v9

    .line 1044
    move-object/from16 v19, v9

    .line 1045
    .line 1046
    goto :goto_11

    .line 1047
    :cond_26
    const-string v6, "tt_appdownloader_notification_no_internet_error"

    .line 1048
    .line 1049
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1050
    .line 1051
    .line 1052
    move-result v6

    .line 1053
    iget-object v9, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1054
    .line 1055
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v9

    .line 1059
    invoke-virtual {v9, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v6

    .line 1063
    :goto_11
    move-object/from16 v22, v10

    .line 1064
    .line 1065
    const/4 v10, 0x0

    .line 1066
    goto :goto_12

    .line 1067
    :cond_27
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/Throwable;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v6

    .line 1071
    if-eqz v6, :cond_28

    .line 1072
    .line 1073
    const-string v6, "tt_appdownloader_notification_insufficient_space_error"

    .line 1074
    .line 1075
    invoke-static {v6}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    iget-object v9, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1080
    .line 1081
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v9

    .line 1085
    const/4 v15, 0x1

    .line 1086
    new-array v15, v15, [Ljava/lang/Object;

    .line 1087
    .line 1088
    sub-long v20, v7, v11

    .line 1089
    .line 1090
    invoke-static/range {v20 .. v21}, Lcom/ss/android/socialbase/appdownloader/c;->b(J)Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v17

    .line 1094
    move-object/from16 v22, v10

    .line 1095
    .line 1096
    const/4 v10, 0x0

    .line 1097
    aput-object v17, v15, v10

    .line 1098
    .line 1099
    invoke-virtual {v9, v6, v15}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v6

    .line 1103
    goto :goto_12

    .line 1104
    :cond_28
    move-object/from16 v22, v10

    .line 1105
    .line 1106
    const/4 v10, 0x0

    .line 1107
    move-object/from16 v6, v17

    .line 1108
    .line 1109
    :goto_12
    move-object/from16 v17, v6

    .line 1110
    .line 1111
    move-object/from16 v9, v19

    .line 1112
    .line 1113
    :goto_13
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v6

    .line 1117
    const/16 v15, 0x8

    .line 1118
    .line 1119
    invoke-virtual {v2, v6, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 1123
    .line 1124
    .line 1125
    move-result v6

    .line 1126
    invoke-virtual {v2, v6, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1127
    .line 1128
    .line 1129
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 1130
    .line 1131
    .line 1132
    move-result v6

    .line 1133
    invoke-virtual {v2, v6, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 1137
    .line 1138
    .line 1139
    move-result v4

    .line 1140
    const/4 v6, 0x2

    .line 1141
    if-lt v4, v6, :cond_2b

    .line 1142
    .line 1143
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 1144
    .line 1145
    .line 1146
    move-result v4

    .line 1147
    const/4 v6, -0x1

    .line 1148
    if-ne v4, v6, :cond_2b

    .line 1149
    .line 1150
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->i(Ljava/lang/Throwable;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v4

    .line 1154
    if-nez v4, :cond_29

    .line 1155
    .line 1156
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/i/f;->h(Ljava/lang/Throwable;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v4

    .line 1160
    if-eqz v4, :cond_2b

    .line 1161
    .line 1162
    :cond_29
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 1163
    .line 1164
    .line 1165
    move-result v4

    .line 1166
    const/4 v5, 0x0

    .line 1167
    invoke-virtual {v2, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1168
    .line 1169
    .line 1170
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 1171
    .line 1172
    .line 1173
    move-result v4

    .line 1174
    const/16 v6, 0x8

    .line 1175
    .line 1176
    invoke-virtual {v2, v4, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1177
    .line 1178
    .line 1179
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 1180
    .line 1181
    .line 1182
    move-result v4

    .line 1183
    invoke-virtual {v2, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1184
    .line 1185
    .line 1186
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    invoke-static {v13, v3}, Lcom/ss/android/socialbase/downloader/i/f;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    if-eqz v3, :cond_2a

    .line 1195
    .line 1196
    invoke-virtual {v2, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1197
    .line 1198
    .line 1199
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1200
    .line 1201
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1202
    .line 1203
    .line 1204
    invoke-static {v11, v12, v5}, Lcom/ss/android/socialbase/appdownloader/c;->a(JZ)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v4

    .line 1208
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v7, v8, v5}, Lcom/ss/android/socialbase/appdownloader/c;->a(JZ)Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    goto :goto_14

    .line 1226
    :cond_2a
    const/16 v1, 0x8

    .line 1227
    .line 1228
    invoke-virtual {v2, v4, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1229
    .line 1230
    .line 1231
    :cond_2b
    move-object/from16 v3, v16

    .line 1232
    .line 1233
    :goto_14
    move-object/from16 v10, v17

    .line 1234
    .line 1235
    goto/16 :goto_18

    .line 1236
    .line 1237
    :cond_2c
    move-object/from16 v16, v6

    .line 1238
    .line 1239
    move-object/from16 v3, v16

    .line 1240
    .line 1241
    move-object v9, v3

    .line 1242
    move-object v10, v9

    .line 1243
    goto/16 :goto_18

    .line 1244
    .line 1245
    :cond_2d
    :goto_15
    move-object/from16 v14, v24

    .line 1246
    .line 1247
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1248
    .line 1249
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1250
    .line 1251
    .line 1252
    invoke-static {v11, v12}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v9

    .line 1256
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    invoke-static {v7, v8}, Lcom/ss/android/socialbase/appdownloader/c;->a(J)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    const/4 v6, 0x1

    .line 1274
    if-ne v3, v6, :cond_2f

    .line 1275
    .line 1276
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/a;->e()I

    .line 1277
    .line 1278
    .line 1279
    move-result v3

    .line 1280
    const/16 v6, 0xb

    .line 1281
    .line 1282
    if-ne v3, v6, :cond_2e

    .line 1283
    .line 1284
    const-string v3, "tt_appdownloader_notification_waiting_download_complete_handler"

    .line 1285
    .line 1286
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1287
    .line 1288
    .line 1289
    move-result v3

    .line 1290
    goto :goto_16

    .line 1291
    :cond_2e
    const-string v3, "tt_appdownloader_notification_downloading"

    .line 1292
    .line 1293
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    goto :goto_16

    .line 1298
    :cond_2f
    const-string v3, "tt_appdownloader_notification_prepare"

    .line 1299
    .line 1300
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v3

    .line 1304
    :goto_16
    iget-object v6, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1305
    .line 1306
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v10

    .line 1314
    const-string v3, "tt_appdownloader_notification_download_pause"

    .line 1315
    .line 1316
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/i;->b(Ljava/lang/String;)I

    .line 1317
    .line 1318
    .line 1319
    move-result v3

    .line 1320
    iget-object v6, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 1321
    .line 1322
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v6

    .line 1326
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v9

    .line 1330
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/e/a;->a(I)I

    .line 1331
    .line 1332
    .line 1333
    move-result v3

    .line 1334
    const/4 v5, 0x0

    .line 1335
    invoke-virtual {v2, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1336
    .line 1337
    .line 1338
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->i()I

    .line 1339
    .line 1340
    .line 1341
    move-result v3

    .line 1342
    const/16 v6, 0x8

    .line 1343
    .line 1344
    invoke-virtual {v2, v3, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1345
    .line 1346
    .line 1347
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->j()I

    .line 1348
    .line 1349
    .line 1350
    move-result v3

    .line 1351
    invoke-virtual {v2, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1352
    .line 1353
    .line 1354
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 1355
    .line 1356
    .line 1357
    move-result v3

    .line 1358
    iget-object v7, v0, Lcom/ss/android/socialbase/appdownloader/e/a;->f:Ljava/lang/String;

    .line 1359
    .line 1360
    invoke-static {v7}, Lcom/ss/android/socialbase/appdownloader/c;->a(Ljava/lang/String;)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v7

    .line 1364
    if-eqz v7, :cond_30

    .line 1365
    .line 1366
    invoke-virtual {v2, v3, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1367
    .line 1368
    .line 1369
    goto :goto_17

    .line 1370
    :cond_30
    invoke-virtual {v2, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1371
    .line 1372
    .line 1373
    :goto_17
    invoke-virtual {v14, v4}, Lcom/ss/android/socialbase/downloader/g/a;->b(Ljava/lang/String;)I

    .line 1374
    .line 1375
    .line 1376
    move-result v4

    .line 1377
    const/4 v5, 0x2

    .line 1378
    if-lt v4, v5, :cond_31

    .line 1379
    .line 1380
    invoke-virtual {v2, v3, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1381
    .line 1382
    .line 1383
    :cond_31
    move-object v3, v1

    .line 1384
    :cond_32
    :goto_18
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->n()I

    .line 1385
    .line 1386
    .line 1387
    move-result v1

    .line 1388
    invoke-virtual {v2, v1, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1389
    .line 1390
    .line 1391
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->p()I

    .line 1392
    .line 1393
    .line 1394
    move-result v1

    .line 1395
    invoke-virtual {v2, v1, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1396
    .line 1397
    .line 1398
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->o()I

    .line 1399
    .line 1400
    .line 1401
    move-result v1

    .line 1402
    invoke-virtual {v2, v1, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->q()I

    .line 1406
    .line 1407
    .line 1408
    move-result v1

    .line 1409
    invoke-virtual {v2, v1, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1410
    .line 1411
    .line 1412
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->k()I

    .line 1413
    .line 1414
    .line 1415
    move-result v1

    .line 1416
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v3

    .line 1420
    if-eqz v3, :cond_33

    .line 1421
    .line 1422
    const/16 v3, 0x8

    .line 1423
    .line 1424
    invoke-virtual {v2, v1, v3}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1425
    .line 1426
    .line 1427
    goto :goto_19

    .line 1428
    :cond_33
    invoke-virtual {v2, v1, v9}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1429
    .line 1430
    .line 1431
    :goto_19
    invoke-virtual/range {v22 .. v22}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    iput-object v2, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 1436
    .line 1437
    return-object v1
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
.end method

.method private i()Landroid/widget/RemoteViews;
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroid/widget/RemoteViews;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2, v0}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/c;->a(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->f()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/e;->r()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "setBackgroundColor"

    .line 33
    .line 34
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, v0, v3, v2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    :cond_0
    return-object v1
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

.method private j()Landroidx/core/app/NotificationCompat$Builder;
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/d;->i()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1a

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/c;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/d;->m()Lcom/ss/android/socialbase/appdownloader/c/m;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->j()Lcom/ss/android/socialbase/appdownloader/d;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/d;->m()Lcom/ss/android/socialbase/appdownloader/c/m;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 54
    .line 55
    invoke-interface {v1, v2, v0}, Lcom/ss/android/socialbase/appdownloader/c/m;->a(Landroid/content/Context;Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 63
    .line 64
    invoke-direct {v1, v2, v0}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    move-object v0, v1

    .line 68
    goto :goto_0

    .line 69
    :catch_0
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    .line 72
    .line 73
    invoke-direct {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-object v0
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
.method public a(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/e/a;->b(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)Landroid/app/Notification;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/notification/a;->a:Landroid/app/Notification;

    .line 7
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/notification/a;->a(Landroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/notification/a;->a(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->e:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->d:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtra()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/e/a;->f:Ljava/lang/String;

    return-void
.end method
