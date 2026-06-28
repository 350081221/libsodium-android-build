.class final Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/stub/ResolverActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ResolveListAdapter"
.end annotation


# instance fields
.field private final mBaseResolveList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mInflater:Landroid/view/LayoutInflater;

.field private mInitialHighlight:I

.field private final mInitialIntents:[Landroid/content/Intent;

.field private final mIntent:Landroid/content/Intent;

.field private mLastChosen:Landroid/content/pm/ResolveInfo;

.field private final mLaunchedFromUid:I

.field mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field mOrigResolveList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/lody/virtual/client/stub/ResolverActivity;


# direct methods
.method public constructor <init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/Context;Landroid/content/Intent;[Landroid/content/Intent;Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "[",
            "Landroid/content/Intent;",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialHighlight:I

    .line 8
    .line 9
    new-instance p1, Landroid/content/Intent;

    .line 10
    .line 11
    invoke-direct {p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mIntent:Landroid/content/Intent;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialIntents:[Landroid/content/Intent;

    .line 17
    .line 18
    iput-object p5, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mBaseResolveList:Ljava/util/List;

    .line 19
    .line 20
    iput p6, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mLaunchedFromUid:I

    .line 21
    .line 22
    const-string p1, "layout_inflater"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroid/view/LayoutInflater;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->rebuildList()V

    .line 40
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

.method private final bindView(Landroid/view/View;Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;

    .line 6
    .line 7
    iget-object v0, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->text:Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object v1, p2, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->displayLabel:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$200(Lcom/lody/virtual/client/stub/ResolverActivity;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->text2:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->text2:Landroid/widget/TextView;

    .line 29
    .line 30
    iget-object v2, p2, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->extendedInfo:Ljava/lang/CharSequence;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->text2:Landroid/widget/TextView;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, p2, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->displayIcon:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Lcom/lody/virtual/client/stub/ResolverActivity$LoadIconTask;

    .line 48
    .line 49
    iget-object v2, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 50
    .line 51
    invoke-direct {v0, v2}, Lcom/lody/virtual/client/stub/ResolverActivity$LoadIconTask;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    new-array v2, v2, [Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 56
    .line 57
    aput-object p2, v2, v1

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object p1, p1, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->icon:Landroid/widget/ImageView;

    .line 63
    .line 64
    iget-object p2, p2, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->displayIcon:Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    .line 68
    .line 69
    return-void
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

.method private processGroup(Ljava/util/List;IILandroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;II",
            "Landroid/content/pm/ResolveInfo;",
            "Ljava/lang/CharSequence;",
            ")V"
        }
    .end annotation

    .line 1
    sub-int v0, p3, p2

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mLastChosen:Landroid/content/pm/ResolveInfo;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 12
    .line 13
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p2, p4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 16
    .line 17
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mLastChosen:Landroid/content/pm/ResolveInfo;

    .line 26
    .line 27
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 28
    .line 29
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p2, p4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 32
    .line 33
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialHighlight:I

    .line 48
    .line 49
    :cond_0
    iget-object p1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 50
    .line 51
    new-instance p2, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    move-object v0, p2

    .line 58
    move-object v2, p4

    .line 59
    move-object v3, p5

    .line 60
    invoke-direct/range {v0 .. v5}, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 69
    .line 70
    invoke-static {v0, v1}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$202(Lcom/lody/virtual/client/stub/ResolverActivity;Z)Z

    .line 71
    .line 72
    .line 73
    iget-object p4, p4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 74
    .line 75
    iget-object p4, p4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 76
    .line 77
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p4, v0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    if-nez p4, :cond_2

    .line 88
    .line 89
    move v0, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const/4 v0, 0x0

    .line 92
    :goto_0
    if-nez v0, :cond_6

    .line 93
    .line 94
    new-instance v2, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, p4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    add-int/lit8 p4, p2, 0x1

    .line 103
    .line 104
    :goto_1
    if-gt p4, p3, :cond_4

    .line 105
    .line 106
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 111
    .line 112
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 113
    .line 114
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 115
    .line 116
    iget-object v4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 117
    .line 118
    invoke-static {v4}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_3

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 p4, p4, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    move v1, v0

    .line 142
    :cond_5
    :goto_2
    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 143
    .line 144
    .line 145
    move v0, v1

    .line 146
    :cond_6
    :goto_3
    if-gt p2, p3, :cond_9

    .line 147
    .line 148
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p4

    .line 152
    move-object v3, p4

    .line 153
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 154
    .line 155
    iget-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mLastChosen:Landroid/content/pm/ResolveInfo;

    .line 156
    .line 157
    if-eqz p4, :cond_7

    .line 158
    .line 159
    iget-object p4, p4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 160
    .line 161
    iget-object p4, p4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v1, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 164
    .line 165
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    if-eqz p4, :cond_7

    .line 172
    .line 173
    iget-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mLastChosen:Landroid/content/pm/ResolveInfo;

    .line 174
    .line 175
    iget-object p4, p4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 176
    .line 177
    iget-object p4, p4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v1, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 180
    .line 181
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p4

    .line 187
    if-eqz p4, :cond_7

    .line 188
    .line 189
    iget-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result p4

    .line 195
    iput p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialHighlight:I

    .line 196
    .line 197
    :cond_7
    if-eqz v0, :cond_8

    .line 198
    .line 199
    iget-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 200
    .line 201
    new-instance v7, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 202
    .line 203
    iget-object v2, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 204
    .line 205
    iget-object v1, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 206
    .line 207
    iget-object v5, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 208
    .line 209
    const/4 v6, 0x0

    .line 210
    move-object v1, v7

    .line 211
    move-object v4, p5

    .line 212
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_8
    iget-object p4, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 220
    .line 221
    new-instance v7, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 222
    .line 223
    iget-object v2, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 224
    .line 225
    iget-object v1, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 226
    .line 227
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 228
    .line 229
    invoke-static {v2}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    const/4 v6, 0x0

    .line 238
    move-object v1, v7

    .line 239
    move-object v4, p5

    .line 240
    invoke-direct/range {v1 .. v6}, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    :goto_4
    add-int/lit8 p2, p2, 0x1

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    :goto_5
    return-void
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

.method private rebuildList()V
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mBaseResolveList:Ljava/util/List;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 15
    .line 16
    :goto_0
    move-object v7, v0

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mIntent:Landroid/content/Intent;

    .line 25
    .line 26
    iget-object v3, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 27
    .line 28
    invoke-static {v3}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$000(Lcom/lody/virtual/client/stub/ResolverActivity;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/16 v3, 0x40

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v1

    .line 38
    :goto_1
    const/high16 v4, 0x10000

    .line 39
    .line 40
    or-int/2addr v3, v4

    .line 41
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_2
    if-eqz v7, :cond_12

    .line 49
    .line 50
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_12

    .line 55
    .line 56
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    move v3, v8

    .line 64
    :goto_3
    if-ge v3, v0, :cond_5

    .line 65
    .line 66
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 71
    .line 72
    iget v5, v2, Landroid/content/pm/ResolveInfo;->priority:I

    .line 73
    .line 74
    iget v9, v4, Landroid/content/pm/ResolveInfo;->priority:I

    .line 75
    .line 76
    if-ne v5, v9, :cond_2

    .line 77
    .line 78
    iget-boolean v5, v2, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 79
    .line 80
    iget-boolean v4, v4, Landroid/content/pm/ResolveInfo;->isDefault:Z

    .line 81
    .line 82
    if-eq v5, v4, :cond_4

    .line 83
    .line 84
    :cond_2
    :goto_4
    if-ge v3, v0, :cond_4

    .line 85
    .line 86
    iget-object v4, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 87
    .line 88
    if-ne v4, v7, :cond_3

    .line 89
    .line 90
    new-instance v4, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v5, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 93
    .line 94
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 95
    .line 96
    .line 97
    iput-object v4, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mOrigResolveList:Ljava/util/List;

    .line 98
    .line 99
    :cond_3
    invoke-interface {v7, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v0, v0, -0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    invoke-interface {v7}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    move v9, v0

    .line 113
    :goto_5
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 124
    .line 125
    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 126
    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-nez v3, :cond_6

    .line 136
    .line 137
    iget-object v3, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 138
    .line 139
    iget-object v4, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 140
    .line 141
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual {v3, v4, v5, v10}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_6
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    iget-boolean v0, v0, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 166
    .line 167
    if-nez v0, :cond_7

    .line 168
    .line 169
    invoke-interface {v2}, Ljava/util/ListIterator;->remove()V

    .line 170
    .line 171
    .line 172
    :cond_7
    :goto_6
    add-int/lit8 v9, v9, -0x1

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    if-le v9, v8, :cond_9

    .line 176
    .line 177
    new-instance v0, Landroid/content/pm/ResolveInfo$DisplayNameComparator;

    .line 178
    .line 179
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 180
    .line 181
    invoke-static {v2}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-direct {v0, v2}, Landroid/content/pm/ResolveInfo$DisplayNameComparator;-><init>(Landroid/content/pm/PackageManager;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 189
    .line 190
    .line 191
    :cond_9
    iget-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialIntents:[Landroid/content/Intent;

    .line 192
    .line 193
    if-eqz v0, :cond_d

    .line 194
    .line 195
    move v0, v1

    .line 196
    :goto_7
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialIntents:[Landroid/content/Intent;

    .line 197
    .line 198
    array-length v3, v2

    .line 199
    if-ge v0, v3, :cond_d

    .line 200
    .line 201
    aget-object v15, v2, v0

    .line 202
    .line 203
    if-nez v15, :cond_a

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_a
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 207
    .line 208
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v15, v2, v1}, Landroid/content/Intent;->resolveActivityInfo(Landroid/content/pm/PackageManager;I)Landroid/content/pm/ActivityInfo;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    if-nez v2, :cond_b

    .line 217
    .line 218
    new-instance v2, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string v3, "No activity found for "

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    new-array v3, v1, [Ljava/lang/Object;

    .line 236
    .line 237
    const-string v4, "ResolverActivity"

    .line 238
    .line 239
    invoke-static {v4, v2, v3}, Lcom/lody/virtual/helper/utils/VLog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_b
    new-instance v12, Landroid/content/pm/ResolveInfo;

    .line 244
    .line 245
    invoke-direct {v12}, Landroid/content/pm/ResolveInfo;-><init>()V

    .line 246
    .line 247
    .line 248
    iput-object v2, v12, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 249
    .line 250
    instance-of v2, v15, Landroid/content/pm/LabeledIntent;

    .line 251
    .line 252
    if-eqz v2, :cond_c

    .line 253
    .line 254
    move-object v2, v15

    .line 255
    check-cast v2, Landroid/content/pm/LabeledIntent;

    .line 256
    .line 257
    invoke-virtual {v2}, Landroid/content/pm/LabeledIntent;->getSourcePackage()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iput-object v3, v12, Landroid/content/pm/ResolveInfo;->resolvePackageName:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v2}, Landroid/content/pm/LabeledIntent;->getLabelResource()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    iput v3, v12, Landroid/content/pm/ResolveInfo;->labelRes:I

    .line 268
    .line 269
    invoke-virtual {v2}, Landroid/content/pm/LabeledIntent;->getNonLocalizedLabel()Ljava/lang/CharSequence;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    iput-object v3, v12, Landroid/content/pm/ResolveInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 274
    .line 275
    invoke-virtual {v2}, Landroid/content/pm/LabeledIntent;->getIconResource()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    iput v2, v12, Landroid/content/pm/ResolveInfo;->icon:I

    .line 280
    .line 281
    :cond_c
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 282
    .line 283
    new-instance v3, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 284
    .line 285
    iget-object v11, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 286
    .line 287
    invoke-virtual {v11}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v12, v4}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    const/4 v14, 0x0

    .line 296
    move-object v10, v3

    .line 297
    invoke-direct/range {v10 .. v15}, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;-><init>(Lcom/lody/virtual/client/stub/ResolverActivity;Landroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    :goto_8
    add-int/lit8 v0, v0, 0x1

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_d
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 311
    .line 312
    iget-object v2, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 313
    .line 314
    invoke-static {v2}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v0, v2}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    iget-object v3, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 323
    .line 324
    invoke-static {v3, v1}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$202(Lcom/lody/virtual/client/stub/ResolverActivity;Z)Z

    .line 325
    .line 326
    .line 327
    move-object v4, v0

    .line 328
    move-object v5, v2

    .line 329
    move v10, v8

    .line 330
    move v2, v1

    .line 331
    :goto_9
    if-ge v10, v9, :cond_11

    .line 332
    .line 333
    if-nez v5, :cond_e

    .line 334
    .line 335
    iget-object v0, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 336
    .line 337
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 338
    .line 339
    move-object v5, v0

    .line 340
    :cond_e
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    move-object v11, v0

    .line 345
    check-cast v11, Landroid/content/pm/ResolveInfo;

    .line 346
    .line 347
    iget-object v0, v6, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 348
    .line 349
    invoke-static {v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$100(Lcom/lody/virtual/client/stub/ResolverActivity;)Landroid/content/pm/PackageManager;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v11, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-nez v0, :cond_f

    .line 358
    .line 359
    iget-object v0, v11, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 360
    .line 361
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 362
    .line 363
    :cond_f
    move-object v12, v0

    .line 364
    invoke-virtual {v12, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-eqz v0, :cond_10

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_10
    add-int/lit8 v3, v10, -0x1

    .line 372
    .line 373
    move-object/from16 v0, p0

    .line 374
    .line 375
    move-object v1, v7

    .line 376
    invoke-direct/range {v0 .. v5}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->processGroup(Ljava/util/List;IILandroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;)V

    .line 377
    .line 378
    .line 379
    move v2, v10

    .line 380
    move-object v4, v11

    .line 381
    move-object v5, v12

    .line 382
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_11
    add-int/lit8 v3, v9, -0x1

    .line 386
    .line 387
    move-object/from16 v0, p0

    .line 388
    .line 389
    move-object v1, v7

    .line 390
    invoke-direct/range {v0 .. v5}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->processGroup(Ljava/util/List;IILandroid/content/pm/ResolveInfo;Ljava/lang/CharSequence;)V

    .line 391
    .line 392
    .line 393
    :cond_12
    return-void
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
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getInitialHighlight()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInitialHighlight:I

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 4
    .line 5
    sget v0, Lcom/lody/virtual/R$layout;->resolve_list_item:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance p3, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;

    .line 13
    .line 14
    invoke-direct {p3, p2}, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;-><init>(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p3, Lcom/lody/virtual/client/stub/ResolverActivity$ViewHolder;->icon:Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/lody/virtual/client/stub/ResolverActivity;->access$300(Lcom/lody/virtual/client/stub/ResolverActivity;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    iput v0, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 35
    .line 36
    :cond_0
    iget-object p3, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 43
    .line 44
    invoke-direct {p0, p2, p1}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->bindView(Landroid/view/View;Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;)V

    .line 45
    .line 46
    .line 47
    return-object p2
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

.method public handlePackagesChanged()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->getCount()I

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->rebuildList()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->getCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->this$0:Lcom/lody/virtual/client/stub/ResolverActivity;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
.end method

.method public intentForPosition(I)Landroid/content/Intent;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    .line 8
    .line 9
    new-instance v0, Landroid/content/Intent;

    .line 10
    .line 11
    iget-object v1, p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->origIntent:Landroid/content/Intent;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mIntent:Landroid/content/Intent;

    .line 17
    .line 18
    :goto_0
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    const/high16 v1, 0x3000000

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->ri:Landroid/content/pm/ResolveInfo;

    .line 27
    .line 28
    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 29
    .line 30
    new-instance v1, Landroid/content/ComponentName;

    .line 31
    .line 32
    iget-object v2, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 35
    .line 36
    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v1, v2, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    return-object v0
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

.method public resolveInfoForPosition(I)Landroid/content/pm/ResolveInfo;
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/client/stub/ResolverActivity$ResolveListAdapter;->mList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;

    iget-object p1, p1, Lcom/lody/virtual/client/stub/ResolverActivity$DisplayResolveInfo;->ri:Landroid/content/pm/ResolveInfo;

    return-object p1
.end method
