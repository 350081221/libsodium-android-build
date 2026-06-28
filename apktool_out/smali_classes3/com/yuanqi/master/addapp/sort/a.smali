.class public final Lcom/yuanqi/master/addapp/sort/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "SortScreen",
        "",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "addAppViewModel",
        "Lcom/yuanqi/master/addapp/AddAppViewModel;",
        "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V",
        "back",
        "context",
        "Landroid/content/Context;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n81#2,11:213\n74#3:224\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt\n*L\n63#1:213,11\n68#1:224\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0    # Landroidx/navigation/NavHostController;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lcom/yuanqi/master/addapp/AddAppViewModel;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "navController"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v3, -0x5340d0c3

    .line 13
    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v15

    .line 21
    and-int/lit8 v4, v2, 0x2

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    or-int/lit8 v5, v1, 0x10

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v1

    .line 29
    :goto_0
    and-int/lit8 v6, v2, 0x3

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    if-ne v6, v7, :cond_2

    .line 33
    .line 34
    and-int/lit8 v5, v5, 0x51

    .line 35
    .line 36
    const/16 v6, 0x10

    .line 37
    .line 38
    if-ne v5, v6, :cond_2

    .line 39
    .line 40
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 48
    .line 49
    .line 50
    move-object/from16 v3, p1

    .line 51
    .line 52
    move-object/from16 v22, v15

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_2
    :goto_1
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 57
    .line 58
    .line 59
    and-int/lit8 v5, v1, 0x1

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_2
    if-eqz v4, :cond_7

    .line 75
    .line 76
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const v4, 0x671a9c9b

    .line 81
    .line 82
    .line 83
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 84
    .line 85
    .line 86
    sget-object v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 87
    .line 88
    const/4 v5, 0x6

    .line 89
    invoke-virtual {v4, v15, v5}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    instance-of v4, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    move-object v4, v5

    .line 101
    check-cast v4, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 102
    .line 103
    invoke-interface {v4}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    sget-object v4, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 109
    .line 110
    :goto_3
    move-object v8, v4

    .line 111
    const-class v4, Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 112
    .line 113
    const v10, 0x9048

    .line 114
    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    move-object v9, v15

    .line 118
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 123
    .line 124
    .line 125
    check-cast v4, Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 126
    .line 127
    move-object v14, v4

    .line 128
    goto :goto_5

    .line 129
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_7
    :goto_4
    move-object/from16 v14, p1

    .line 142
    .line 143
    :goto_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 144
    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_8

    .line 151
    .line 152
    const/4 v4, -0x1

    .line 153
    const-string v5, "com.yuanqi.master.addapp.sort.SortScreen (SortScreen.kt:65)"

    .line 154
    .line 155
    invoke-static {v3, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_8
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Landroid/content/Context;

    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    new-instance v5, Lcom/yuanqi/master/addapp/sort/a$a;

    .line 170
    .line 171
    invoke-direct {v5, v14, v3}, Lcom/yuanqi/master/addapp/sort/a$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    const v6, 0xc5be6f9

    .line 175
    .line 176
    .line 177
    const/4 v7, 0x1

    .line 178
    invoke-static {v15, v6, v7, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    const/4 v6, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 185
    const/4 v10, 0x0

    .line 186
    const-wide/16 v11, 0x0

    .line 187
    .line 188
    const-wide/16 v16, 0x0

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    new-instance v13, Lcom/yuanqi/master/addapp/sort/a$b;

    .line 193
    .line 194
    invoke-direct {v13, v14, v3}, Lcom/yuanqi/master/addapp/sort/a$b;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V

    .line 195
    .line 196
    .line 197
    const v3, 0x59bb108e

    .line 198
    .line 199
    .line 200
    invoke-static {v15, v3, v7, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const v19, 0x30000030

    .line 205
    .line 206
    .line 207
    const/16 v20, 0x1fd

    .line 208
    .line 209
    move-object v7, v8

    .line 210
    move-object v8, v9

    .line 211
    move v9, v10

    .line 212
    move-wide v10, v11

    .line 213
    move-wide/from16 v12, v16

    .line 214
    .line 215
    move-object/from16 v21, v14

    .line 216
    .line 217
    move-object/from16 v14, v18

    .line 218
    .line 219
    move-object/from16 v22, v15

    .line 220
    .line 221
    move-object v15, v3

    .line 222
    move-object/from16 v16, v22

    .line 223
    .line 224
    move/from16 v17, v19

    .line 225
    .line 226
    move/from16 v18, v20

    .line 227
    .line 228
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_9

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 238
    .line 239
    .line 240
    :cond_9
    move-object/from16 v3, v21

    .line 241
    .line 242
    :goto_6
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v4, :cond_a

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_a
    new-instance v5, Lcom/yuanqi/master/addapp/sort/a$c;

    .line 250
    .line 251
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/addapp/sort/a$c;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;II)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 255
    .line 256
    .line 257
    :goto_7
    return-void
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

.method public static final b(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V
    .locals 2
    .param p0    # Lcom/yuanqi/master/addapp/AddAppViewModel;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "addAppViewModel"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->f0()V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lcom/yuanqi/master/addapp/AddAppActivity;->e:Lcom/yuanqi/master/addapp/AddAppActivity$a;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppActivity$a;->a()Lcom/yuanqi/master/addapp/AddAppActivity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/AddAppActivity$a;->a()Lcom/yuanqi/master/addapp/AddAppActivity;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 35
    .line 36
    .line 37
    instance-of p0, p1, Lcom/yuanqi/master/addapp/AddAppActivity;

    .line 38
    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    check-cast p1, Lcom/yuanqi/master/addapp/AddAppActivity;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
.end method
