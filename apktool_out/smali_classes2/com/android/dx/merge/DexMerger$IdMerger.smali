.class abstract Lcom/android/dx/merge/DexMerger$IdMerger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/DexMerger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "IdMerger"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/lang/Comparable<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final out:Lcom/android/dex/Dex$Section;

.field final synthetic this$0:Lcom/android/dx/merge/DexMerger;


# direct methods
.method protected constructor <init>(Lcom/android/dx/merge/DexMerger;Lcom/android/dex/Dex$Section;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->out:Lcom/android/dex/Dex$Section;

    .line 7
    .line 8
    return-void
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

.method private readIntoMap(Lcom/android/dex/Dex$Section;Lcom/android/dex/TableOfContents$Section;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dex/Dex$Section;",
            "Lcom/android/dex/TableOfContents$Section;",
            "Lcom/android/dx/merge/IndexMap;",
            "I",
            "Ljava/util/TreeMap<",
            "TT;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;I)I"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dex/Dex$Section;->getPosition()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, -0x1

    .line 9
    :goto_0
    iget p2, p2, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 10
    .line 11
    if-ge p4, p2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p4}, Lcom/android/dx/merge/DexMerger$IdMerger;->read(Lcom/android/dex/Dex$Section;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p5, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Ljava/util/List;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p5, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_2
    return v0
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
.end method

.method private readUnsortedValues(Lcom/android/dex/Dex;Lcom/android/dx/merge/IndexMap;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dex/Dex;",
            "Lcom/android/dx/merge/IndexMap;",
            ")",
            "Ljava/util/List<",
            "Lcom/android/dx/merge/DexMerger$IdMerger<",
            "TT;>.UnsortedValue;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/android/dex/Dex;->getTableOfContents()Lcom/android/dex/TableOfContents;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/android/dex/TableOfContents$Section;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iget v2, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 26
    .line 27
    invoke-virtual {p1, v2}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/4 v3, 0x0

    .line 32
    move v11, v3

    .line 33
    :goto_0
    iget v4, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 34
    .line 35
    if-ge v11, v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/android/dex/Dex$Section;->getPosition()I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-virtual {p0, v2, p2, v3}, Lcom/android/dx/merge/DexMerger$IdMerger;->read(Lcom/android/dex/Dex$Section;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    new-instance v12, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 46
    .line 47
    move-object v4, v12

    .line 48
    move-object v5, p0

    .line 49
    move-object v6, p1

    .line 50
    move-object v7, p2

    .line 51
    move v9, v11

    .line 52
    invoke-direct/range {v4 .. v10}, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;-><init>(Lcom/android/dx/merge/DexMerger$IdMerger;Lcom/android/dex/Dex;Lcom/android/dx/merge/IndexMap;Ljava/lang/Comparable;II)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v11, v11, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-object v1
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
.end method


# virtual methods
.method abstract getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;
.end method

.method public final mergeSorted()V
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v0, v0

    .line 10
    new-array v8, v0, [Lcom/android/dex/TableOfContents$Section;

    .line 11
    .line 12
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    array-length v0, v0

    .line 19
    new-array v9, v0, [Lcom/android/dex/Dex$Section;

    .line 20
    .line 21
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    array-length v0, v0

    .line 28
    new-array v10, v0, [I

    .line 29
    .line 30
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    array-length v0, v0

    .line 37
    new-array v11, v0, [I

    .line 38
    .line 39
    new-instance v12, Ljava/util/TreeMap;

    .line 40
    .line 41
    invoke-direct {v12}, Ljava/util/TreeMap;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    move v14, v13

    .line 46
    :goto_0
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    array-length v0, v0

    .line 53
    if-ge v14, v0, :cond_1

    .line 54
    .line 55
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    aget-object v0, v0, v14

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/android/dex/Dex;->getTableOfContents()Lcom/android/dex/TableOfContents;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    aput-object v0, v8, v14

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/android/dex/TableOfContents$Section;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    aget-object v0, v0, v14

    .line 86
    .line 87
    aget-object v1, v8, v14

    .line 88
    .line 89
    iget v1, v1, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/android/dex/Dex;->open(I)Lcom/android/dex/Dex$Section;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_1

    .line 96
    :cond_0
    const/4 v0, 0x0

    .line 97
    :goto_1
    move-object v1, v0

    .line 98
    aput-object v1, v9, v14

    .line 99
    .line 100
    aget-object v2, v8, v14

    .line 101
    .line 102
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 103
    .line 104
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    aget-object v3, v0, v14

    .line 109
    .line 110
    aget v4, v11, v14

    .line 111
    .line 112
    move-object/from16 v0, p0

    .line 113
    .line 114
    move-object v5, v12

    .line 115
    move v6, v14

    .line 116
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/merge/DexMerger$IdMerger;->readIntoMap(Lcom/android/dex/Dex$Section;Lcom/android/dex/TableOfContents$Section;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    aput v0, v10, v14

    .line 121
    .line 122
    add-int/lit8 v14, v14, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {v12}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_2

    .line 130
    .line 131
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 132
    .line 133
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput v13, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 142
    .line 143
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 144
    .line 145
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iput v13, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 154
    .line 155
    return-void

    .line 156
    :cond_2
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 157
    .line 158
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v1, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->out:Lcom/android/dex/Dex$Section;

    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/android/dex/Dex$Section;->getPosition()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iput v1, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 173
    .line 174
    :goto_2
    invoke-virtual {v12}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_4

    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/util/TreeMap;->pollFirstEntry()Ljava/util/Map$Entry;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_3

    .line 199
    .line 200
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Ljava/lang/Integer;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    aget v1, v10, v1

    .line 211
    .line 212
    iget-object v2, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 213
    .line 214
    invoke-static {v2}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    aget-object v2, v2, v3

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    aget v4, v11, v3

    .line 229
    .line 230
    add-int/lit8 v5, v4, 0x1

    .line 231
    .line 232
    aput v5, v11, v3

    .line 233
    .line 234
    invoke-virtual {v7, v1, v2, v4, v13}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v16

    .line 241
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    aget-object v1, v9, v1

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    aget-object v2, v8, v2

    .line 252
    .line 253
    iget-object v3, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 254
    .line 255
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    aget-object v3, v3, v4

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    aget v4, v11, v4

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    move-object/from16 v0, p0

    .line 276
    .line 277
    move-object v5, v12

    .line 278
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/merge/DexMerger$IdMerger;->readIntoMap(Lcom/android/dex/Dex$Section;Lcom/android/dex/TableOfContents$Section;Lcom/android/dx/merge/IndexMap;ILjava/util/TreeMap;I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    aput v0, v10, v16

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_3
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/Comparable;

    .line 290
    .line 291
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->write(Ljava/lang/Comparable;)V

    .line 292
    .line 293
    .line 294
    add-int/lit8 v13, v13, 0x1

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_4
    iget-object v0, v7, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 298
    .line 299
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v7, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iput v13, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 308
    .line 309
    return-void
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
.end method

.method public final mergeUnsorted()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->out:Lcom/android/dex/Dex$Section;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dex/Dex$Section;->getPosition()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iput v1, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move v2, v1

    .line 26
    :goto_0
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 27
    .line 28
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    array-length v3, v3

    .line 33
    if-ge v2, v3, :cond_0

    .line 34
    .line 35
    iget-object v3, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 36
    .line 37
    invoke-static {v3}, Lcom/android/dx/merge/DexMerger;->access$1300(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dex/Dex;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    aget-object v3, v3, v2

    .line 42
    .line 43
    iget-object v4, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/android/dx/merge/DexMerger;->access$1400(Lcom/android/dx/merge/DexMerger;)[Lcom/android/dx/merge/IndexMap;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    aget-object v4, v4, v2

    .line 50
    .line 51
    invoke-direct {p0, v3, v4}, Lcom/android/dx/merge/DexMerger$IdMerger;->readUnsortedValues(Lcom/android/dex/Dex;Lcom/android/dx/merge/IndexMap;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput v1, v0, Lcom/android/dex/TableOfContents$Section;->off:I

    .line 78
    .line 79
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput v1, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    move v2, v1

    .line 96
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-ge v1, v3, :cond_3

    .line 101
    .line 102
    add-int/lit8 v3, v1, 0x1

    .line 103
    .line 104
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 109
    .line 110
    iget v4, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->offset:I

    .line 111
    .line 112
    iget-object v5, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 113
    .line 114
    iget v6, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->index:I

    .line 115
    .line 116
    add-int/lit8 v7, v2, -0x1

    .line 117
    .line 118
    invoke-virtual {p0, v4, v5, v6, v7}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-ge v3, v4, :cond_2

    .line 126
    .line 127
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 132
    .line 133
    invoke-virtual {v1, v4}, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->compareTo(Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_2

    .line 138
    .line 139
    add-int/lit8 v4, v3, 0x1

    .line 140
    .line 141
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    .line 146
    .line 147
    iget v5, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->offset:I

    .line 148
    .line 149
    iget-object v6, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 150
    .line 151
    iget v3, v3, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->index:I

    .line 152
    .line 153
    invoke-virtual {p0, v5, v6, v3, v7}, Lcom/android/dx/merge/DexMerger$IdMerger;->updateIndex(ILcom/android/dx/merge/IndexMap;II)V

    .line 154
    .line 155
    .line 156
    move v3, v4

    .line 157
    goto :goto_2

    .line 158
    :cond_2
    iget-object v1, v1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->value:Ljava/lang/Comparable;

    .line 159
    .line 160
    invoke-virtual {p0, v1}, Lcom/android/dx/merge/DexMerger$IdMerger;->write(Ljava/lang/Comparable;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v2, v2, 0x1

    .line 164
    .line 165
    move v1, v3

    .line 166
    goto :goto_1

    .line 167
    :cond_3
    iget-object v0, p0, Lcom/android/dx/merge/DexMerger$IdMerger;->this$0:Lcom/android/dx/merge/DexMerger;

    .line 168
    .line 169
    invoke-static {v0}, Lcom/android/dx/merge/DexMerger;->access$1500(Lcom/android/dx/merge/DexMerger;)Lcom/android/dex/TableOfContents;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p0, v0}, Lcom/android/dx/merge/DexMerger$IdMerger;->getSection(Lcom/android/dex/TableOfContents;)Lcom/android/dex/TableOfContents$Section;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput v2, v0, Lcom/android/dex/TableOfContents$Section;->size:I

    .line 178
    .line 179
    return-void
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
.end method

.method abstract read(Lcom/android/dex/Dex$Section;Lcom/android/dx/merge/IndexMap;I)Ljava/lang/Comparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dex/Dex$Section;",
            "Lcom/android/dx/merge/IndexMap;",
            "I)TT;"
        }
    .end annotation
.end method

.method abstract updateIndex(ILcom/android/dx/merge/IndexMap;II)V
.end method

.method abstract write(Ljava/lang/Comparable;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
