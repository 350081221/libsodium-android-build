.class public final Landroidx/compose/material/pullrefresh/PullRefreshStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a<\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "refreshing",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onRefresh",
        "Landroidx/compose/ui/unit/Dp;",
        "refreshThreshold",
        "refreshingOffset",
        "Landroidx/compose/material/pullrefresh/PullRefreshState;",
        "rememberPullRefreshState-UuyPYSY",
        "(ZLv3/a;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;",
        "rememberPullRefreshState",
        "",
        "DragMultiplier",
        "F",
        "material_release"
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
        "SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,234:1\n154#2:235\n1#3:236\n487#4,4:237\n491#4,2:245\n495#4:251\n25#5:241\n36#5:253\n1116#6,3:242\n1119#6,3:248\n1116#6,6:254\n487#7:247\n74#8:252\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:235\n65#1:237,4\n65#1:245,2\n65#1:251\n65#1:241\n75#1:253\n65#1:242,3\n65#1:248,3\n75#1:254,6\n65#1:247\n70#1:252\n*E\n"
    }
.end annotation


# static fields
.field private static final DragMultiplier:F = 0.5f


# direct methods
.method public static final rememberPullRefreshState-UuyPYSY(ZLv3/a;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;
    .locals 4
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;FF",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material/pullrefresh/PullRefreshState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, -0xa6df1e8

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p6, 0x4

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p2, Landroidx/compose/material/pullrefresh/PullRefreshDefaults;->INSTANCE:Landroidx/compose/material/pullrefresh/PullRefreshDefaults;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/compose/material/pullrefresh/PullRefreshDefaults;->getRefreshThreshold-D9Ej5fM()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    :cond_0
    and-int/lit8 p6, p6, 0x8

    .line 18
    .line 19
    if-eqz p6, :cond_1

    .line 20
    .line 21
    sget-object p3, Landroidx/compose/material/pullrefresh/PullRefreshDefaults;->INSTANCE:Landroidx/compose/material/pullrefresh/PullRefreshDefaults;

    .line 22
    .line 23
    invoke-virtual {p3}, Landroidx/compose/material/pullrefresh/PullRefreshDefaults;->getRefreshingOffset-D9Ej5fM()F

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    :cond_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p6

    .line 31
    if-eqz p6, :cond_2

    .line 32
    .line 33
    const/4 p6, -0x1

    .line 34
    const-string v1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)"

    .line 35
    .line 36
    invoke-static {v0, p5, p6, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    const/4 p6, 0x0

    .line 40
    int-to-float v0, p6

    .line 41
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {p2, v0}, Landroidx/compose/ui/unit/Dp;->compareTo-0680j_4(FF)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-lez v0, :cond_3

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move v0, p6

    .line 54
    :goto_0
    if-eqz v0, :cond_8

    .line 55
    .line 56
    const v0, 0x2e20b340

    .line 57
    .line 58
    .line 59
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 60
    .line 61
    .line 62
    const v0, -0x1d58f75c

    .line 63
    .line 64
    .line 65
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v0, v2, :cond_4

    .line 79
    .line 80
    sget-object v0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 81
    .line 82
    invoke-static {v0, p4}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v2

    .line 95
    :cond_4
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 96
    .line 97
    .line 98
    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 105
    .line 106
    .line 107
    shr-int/lit8 p5, p5, 0x3

    .line 108
    .line 109
    and-int/lit8 p5, p5, 0xe

    .line 110
    .line 111
    invoke-static {p1, p4, p5}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance p5, Lkotlin/jvm/internal/k1$e;

    .line 116
    .line 117
    invoke-direct {p5}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v2, Lkotlin/jvm/internal/k1$e;

    .line 121
    .line 122
    invoke-direct {v2}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-interface {p4, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 134
    .line 135
    invoke-interface {v3, p2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    iput p2, p5, Lkotlin/jvm/internal/k1$e;->element:F

    .line 140
    .line 141
    invoke-interface {v3, p3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    iput p2, v2, Lkotlin/jvm/internal/k1$e;->element:F

    .line 146
    .line 147
    const p2, 0x44faf204

    .line 148
    .line 149
    .line 150
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    if-nez p2, :cond_5

    .line 162
    .line 163
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-ne p3, p2, :cond_6

    .line 168
    .line 169
    :cond_5
    new-instance p3, Landroidx/compose/material/pullrefresh/PullRefreshState;

    .line 170
    .line 171
    iget p2, v2, Lkotlin/jvm/internal/k1$e;->element:F

    .line 172
    .line 173
    iget v1, p5, Lkotlin/jvm/internal/k1$e;->element:F

    .line 174
    .line 175
    invoke-direct {p3, v0, p1, p2, v1}, Landroidx/compose/material/pullrefresh/PullRefreshState;-><init>(Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;FF)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 182
    .line 183
    .line 184
    check-cast p3, Landroidx/compose/material/pullrefresh/PullRefreshState;

    .line 185
    .line 186
    new-instance p1, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;

    .line 187
    .line 188
    invoke-direct {p1, p3, p0, p5, v2}, Landroidx/compose/material/pullrefresh/PullRefreshStateKt$rememberPullRefreshState$3;-><init>(Landroidx/compose/material/pullrefresh/PullRefreshState;ZLkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1, p4, p6}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_7

    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 201
    .line 202
    .line 203
    :cond_7
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 204
    .line 205
    .line 206
    return-object p3

    .line 207
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    const-string p1, "The refresh trigger must be greater than zero!"

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw p0
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
.end method
