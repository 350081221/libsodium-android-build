.class public Lcom/yuanqi/group/widgets/LabelView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final n:I = 0x2d


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:F

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:I

.field private h:F

.field private i:F

.field private j:I

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/group/widgets/LabelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/LabelView;->h(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    iget-object p1, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method

.method private b(IFLandroid/graphics/Canvas;FZ)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    int-to-float v0, p1

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-virtual {p3, p2, v0, v0}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/yuanqi/group/widgets/LabelView;->i:F

    .line 12
    .line 13
    mul-float/2addr p2, v1

    .line 14
    add-float/2addr p4, p2

    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    neg-float p2, p4

    .line 18
    div-float/2addr p2, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    div-float p2, p4, v1

    .line 21
    .line 22
    :goto_0
    div-int/lit8 p4, p1, 0x2

    .line 23
    .line 24
    int-to-float p4, p4

    .line 25
    iget-object p5, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {p5}, Landroid/graphics/Paint;->descent()F

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-float/2addr p5, v0

    .line 38
    div-float/2addr p5, v1

    .line 39
    sub-float/2addr p4, p5

    .line 40
    add-float/2addr p4, p2

    .line 41
    iget-boolean p2, p0, Lcom/yuanqi/group/widgets/LabelView;->f:Z

    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    iget-object p2, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object p2, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 53
    .line 54
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    sub-int/2addr p1, v0

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sub-int/2addr p1, v0

    .line 68
    div-int/lit8 p1, p1, 0x2

    .line 69
    .line 70
    add-int/2addr p5, p1

    .line 71
    int-to-float p1, p5

    .line 72
    iget-object p5, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-virtual {p3, p2, p1, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Landroid/graphics/Canvas;->restore()V

    .line 78
    .line 79
    .line 80
    return-void
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

.method private c(IFLandroid/graphics/Canvas;Z)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    int-to-float v0, p1

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-virtual {p3, p2, v0, v0}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 9
    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    neg-int p2, p1

    .line 14
    div-int/lit8 p2, p2, 0x4

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    div-int/lit8 p2, p1, 0x4

    .line 18
    .line 19
    :goto_0
    int-to-float p2, p2

    .line 20
    div-int/lit8 p4, p1, 0x2

    .line 21
    .line 22
    int-to-float p4, p4

    .line 23
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/graphics/Paint;->ascent()F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-float/2addr v0, v2

    .line 36
    div-float/2addr v0, v1

    .line 37
    sub-float/2addr p4, v0

    .line 38
    add-float/2addr p4, p2

    .line 39
    iget-boolean p2, p0, Lcom/yuanqi/group/widgets/LabelView;->f:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iget-object p2, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p2, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 51
    .line 52
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    sub-int/2addr p1, v1

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sub-int/2addr p1, v1

    .line 66
    div-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    add-int/2addr v0, p1

    .line 69
    int-to-float p1, v0

    .line 70
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-virtual {p3, p2, p1, p4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Landroid/graphics/Canvas;->restore()V

    .line 76
    .line 77
    .line 78
    return-void
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
.end method

.method private g(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/high16 v1, 0x40000000    # 2.0f

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v1, v2

    .line 23
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 24
    .line 25
    iget v3, p0, Lcom/yuanqi/group/widgets/LabelView;->b:I

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 31
    .line 32
    iget v3, p0, Lcom/yuanqi/group/widgets/LabelView;->c:F

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v4, ""

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    float-to-int v2, v2

    .line 63
    add-int/2addr v1, v2

    .line 64
    int-to-double v1, v1

    .line 65
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 66
    .line 67
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    mul-double/2addr v1, v3

    .line 72
    double-to-int v1, v1

    .line 73
    const/high16 v2, -0x80000000

    .line 74
    .line 75
    if-ne v0, v2, :cond_1

    .line 76
    .line 77
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    :cond_1
    iget p1, p0, Lcom/yuanqi/group/widgets/LabelView;->h:F

    .line 82
    .line 83
    float-to-int p1, p1

    .line 84
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :goto_0
    return p1
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

.method private h(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/yqtech/multiapp/R$styleable;->LabelView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x5

    .line 8
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iput-object p2, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "#ffffff"

    .line 15
    .line 16
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->b:I

    .line 27
    .line 28
    const/high16 p2, 0x41300000    # 11.0f

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/LabelView;->i(F)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    int-to-float p2, p2

    .line 35
    const/16 v0, 0x9

    .line 36
    .line 37
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->c:F

    .line 42
    .line 43
    const/4 p2, 0x7

    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/LabelView;->d:Z

    .line 50
    .line 51
    const/4 p2, 0x6

    .line 52
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/LabelView;->f:Z

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LabelView;->e:Z

    .line 64
    .line 65
    const-string v0, "#FF4081"

    .line 66
    .line 67
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->g:I

    .line 76
    .line 77
    iget-boolean p2, p0, Lcom/yuanqi/group/widgets/LabelView;->e:Z

    .line 78
    .line 79
    if-eqz p2, :cond_0

    .line 80
    .line 81
    const/high16 p2, 0x420c0000    # 35.0f

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const/high16 p2, 0x42480000    # 50.0f

    .line 85
    .line 86
    :goto_0
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/LabelView;->a(F)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    int-to-float p2, p2

    .line 91
    const/4 v0, 0x3

    .line 92
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->h:F

    .line 97
    .line 98
    const/high16 p2, 0x40600000    # 3.5f

    .line 99
    .line 100
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/LabelView;->a(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    int-to-float p2, p2

    .line 105
    const/4 v0, 0x4

    .line 106
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->i:F

    .line 111
    .line 112
    const/4 p2, 0x2

    .line 113
    const/16 v0, 0x33

    .line 114
    .line 115
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    iput p2, p0, Lcom/yuanqi/group/widgets/LabelView;->j:I

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 122
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
.end method


# virtual methods
.method protected a(F)I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/LabelView;->e:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/LabelView;->f:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/LabelView;->d:Z

    return v0
.end method

.method public getBgColor()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->g:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->j:I

    return v0
.end method

.method public getMinSize()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->h:F

    return v0
.end method

.method public getPadding()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->i:F

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->b:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->c:F

    return v0
.end method

.method protected i(F)I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget v2, p0, Lcom/yuanqi/group/widgets/LabelView;->b:I

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 13
    .line 14
    iget v2, p0, Lcom/yuanqi/group/widgets/LabelView;->c:F

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/yuanqi/group/widgets/LabelView;->d:Z

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 27
    .line 28
    iget v2, p0, Lcom/yuanqi/group/widgets/LabelView;->g:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->k:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/graphics/Paint;->ascent()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-float v4, v0, v2

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/LabelView;->e:Z

    .line 48
    .line 49
    const/16 v2, 0x55

    .line 50
    .line 51
    const/16 v3, 0x53

    .line 52
    .line 53
    const/16 v5, 0x35

    .line 54
    .line 55
    const/16 v6, 0x33

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->j:I

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    const/high16 v8, -0x3dcc0000    # -45.0f

    .line 64
    .line 65
    if-ne v0, v6, :cond_0

    .line 66
    .line 67
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 73
    .line 74
    invoke-virtual {v0, v7, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 78
    .line 79
    int-to-float v2, v1

    .line 80
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 84
    .line 85
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v1, v8, p1, v4}, Lcom/yuanqi/group/widgets/LabelView;->c(IFLandroid/graphics/Canvas;Z)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_0
    const/high16 v6, 0x42340000    # 45.0f

    .line 106
    .line 107
    if-ne v0, v5, :cond_1

    .line 108
    .line 109
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 115
    .line 116
    int-to-float v2, v1

    .line 117
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 121
    .line 122
    invoke-virtual {v0, v7, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 126
    .line 127
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 136
    .line 137
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 138
    .line 139
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p0, v1, v6, p1, v4}, Lcom/yuanqi/group/widgets/LabelView;->c(IFLandroid/graphics/Canvas;Z)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_1
    const/4 v4, 0x0

    .line 148
    if-ne v0, v3, :cond_2

    .line 149
    .line 150
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 156
    .line 157
    int-to-float v2, v1

    .line 158
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 162
    .line 163
    invoke-virtual {v0, v7, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 167
    .line 168
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 177
    .line 178
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    invoke-direct {p0, v1, v6, p1, v4}, Lcom/yuanqi/group/widgets/LabelView;->c(IFLandroid/graphics/Canvas;Z)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_2
    if-ne v0, v2, :cond_7

    .line 189
    .line 190
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 196
    .line 197
    int-to-float v2, v1

    .line 198
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 202
    .line 203
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 207
    .line 208
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 214
    .line 215
    .line 216
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 217
    .line 218
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 219
    .line 220
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {p0, v1, v8, p1, v4}, Lcom/yuanqi/group/widgets/LabelView;->c(IFLandroid/graphics/Canvas;Z)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_3
    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->i:F

    .line 229
    .line 230
    const/high16 v8, 0x40000000    # 2.0f

    .line 231
    .line 232
    mul-float/2addr v0, v8

    .line 233
    add-float/2addr v0, v4

    .line 234
    float-to-double v8, v0

    .line 235
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 236
    .line 237
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 238
    .line 239
    .line 240
    move-result-wide v10

    .line 241
    mul-double/2addr v8, v10

    .line 242
    iget v0, p0, Lcom/yuanqi/group/widgets/LabelView;->j:I

    .line 243
    .line 244
    if-ne v0, v6, :cond_4

    .line 245
    .line 246
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 252
    .line 253
    int-to-double v2, v1

    .line 254
    sub-double/2addr v2, v8

    .line 255
    double-to-float v2, v2

    .line 256
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 260
    .line 261
    int-to-float v3, v1

    .line 262
    invoke-virtual {v0, v7, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 266
    .line 267
    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 271
    .line 272
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 281
    .line 282
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 283
    .line 284
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 285
    .line 286
    .line 287
    const/high16 v2, -0x3dcc0000    # -45.0f

    .line 288
    .line 289
    const/4 v5, 0x1

    .line 290
    move-object v0, p0

    .line 291
    move-object v3, p1

    .line 292
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/widgets/LabelView;->b(IFLandroid/graphics/Canvas;FZ)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_4
    if-ne v0, v5, :cond_5

    .line 298
    .line 299
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 302
    .line 303
    .line 304
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 305
    .line 306
    invoke-virtual {v0, v7, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 307
    .line 308
    .line 309
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 310
    .line 311
    double-to-float v2, v8

    .line 312
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 313
    .line 314
    .line 315
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 316
    .line 317
    int-to-float v2, v1

    .line 318
    int-to-double v5, v1

    .line 319
    sub-double/2addr v5, v8

    .line 320
    double-to-float v3, v5

    .line 321
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 325
    .line 326
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 327
    .line 328
    .line 329
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 332
    .line 333
    .line 334
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 335
    .line 336
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 337
    .line 338
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 339
    .line 340
    .line 341
    const/high16 v2, 0x42340000    # 45.0f

    .line 342
    .line 343
    const/4 v5, 0x1

    .line 344
    move-object v0, p0

    .line 345
    move-object v3, p1

    .line 346
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/widgets/LabelView;->b(IFLandroid/graphics/Canvas;FZ)V

    .line 347
    .line 348
    .line 349
    goto :goto_0

    .line 350
    :cond_5
    if-ne v0, v3, :cond_6

    .line 351
    .line 352
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 355
    .line 356
    .line 357
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 358
    .line 359
    invoke-virtual {v0, v7, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 360
    .line 361
    .line 362
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 363
    .line 364
    double-to-float v2, v8

    .line 365
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 366
    .line 367
    .line 368
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 369
    .line 370
    int-to-double v2, v1

    .line 371
    sub-double/2addr v2, v8

    .line 372
    double-to-float v2, v2

    .line 373
    int-to-float v3, v1

    .line 374
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 375
    .line 376
    .line 377
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 378
    .line 379
    invoke-virtual {v0, v3, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 380
    .line 381
    .line 382
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 385
    .line 386
    .line 387
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 388
    .line 389
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 390
    .line 391
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x42340000    # 45.0f

    .line 395
    .line 396
    const/4 v5, 0x0

    .line 397
    move-object v0, p0

    .line 398
    move-object v3, p1

    .line 399
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/widgets/LabelView;->b(IFLandroid/graphics/Canvas;FZ)V

    .line 400
    .line 401
    .line 402
    goto :goto_0

    .line 403
    :cond_6
    if-ne v0, v2, :cond_7

    .line 404
    .line 405
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 406
    .line 407
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 408
    .line 409
    .line 410
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 411
    .line 412
    int-to-float v2, v1

    .line 413
    invoke-virtual {v0, v7, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 414
    .line 415
    .line 416
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 417
    .line 418
    double-to-float v3, v8

    .line 419
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 420
    .line 421
    .line 422
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 423
    .line 424
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 425
    .line 426
    .line 427
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 428
    .line 429
    invoke-virtual {v0, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 430
    .line 431
    .line 432
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 433
    .line 434
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 435
    .line 436
    .line 437
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LabelView;->m:Landroid/graphics/Path;

    .line 438
    .line 439
    iget-object v2, p0, Lcom/yuanqi/group/widgets/LabelView;->l:Landroid/graphics/Paint;

    .line 440
    .line 441
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 442
    .line 443
    .line 444
    const/high16 v2, -0x3dcc0000    # -45.0f

    .line 445
    .line 446
    const/4 v5, 0x0

    .line 447
    move-object v0, p0

    .line 448
    move-object v3, p1

    .line 449
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/group/widgets/LabelView;->b(IFLandroid/graphics/Canvas;FZ)V

    .line 450
    .line 451
    .line 452
    :cond_7
    :goto_0
    return-void
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
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/yuanqi/group/widgets/LabelView;->g(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 6
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

.method public setBgColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->g:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setFillTriangle(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LabelView;->e:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setGravity(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->j:I

    return-void
.end method

.method public setMinSize(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LabelView;->a(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->h:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public setPadding(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LabelView;->a(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->i:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/LabelView;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LabelView;->f:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setTextBold(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LabelView;->d:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public setTextSize(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LabelView;->i(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/yuanqi/group/widgets/LabelView;->c:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method
