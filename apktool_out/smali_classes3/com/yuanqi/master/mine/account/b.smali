.class public final Lcom/yuanqi/master/mine/account/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "AccountScreen",
        "",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "mineViewModel",
        "Lcom/yuanqi/master/mine/MineViewModel;",
        "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V",
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
        "SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n81#2,11:262\n74#3:273\n25#4:274\n25#4:281\n1116#5,6:275\n1116#5,6:282\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt\n*L\n60#1:262,11\n63#1:273\n65#1:274\n68#1:281\n65#1:275,6\n68#1:282,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .param p0    # Landroidx/navigation/NavHostController;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lcom/yuanqi/master/mine/MineViewModel;
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
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p3

    .line 4
    .line 5
    move/from16 v8, p4

    .line 6
    .line 7
    const-string v0, "navController"

    .line 8
    .line 9
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x433a2f70

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    and-int/lit8 v1, v8, 0x2

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    const v1, 0x671a9c9b

    .line 30
    .line 31
    .line 32
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-virtual {v1, v5, v2}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    if-eqz v10, :cond_1

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    instance-of v1, v10, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    move-object v1, v10

    .line 50
    check-cast v1, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 51
    .line 52
    invoke-interface {v1}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v1, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 58
    .line 59
    :goto_0
    move-object v13, v1

    .line 60
    const-class v9, Lcom/yuanqi/master/mine/MineViewModel;

    .line 61
    .line 62
    const v15, 0x9048

    .line 63
    .line 64
    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    move-object v14, v5

    .line 68
    invoke-static/range {v9 .. v16}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 73
    .line 74
    .line 75
    check-cast v1, Lcom/yuanqi/master/mine/MineViewModel;

    .line 76
    .line 77
    move-object v15, v1

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_2
    move-object/from16 v15, p1

    .line 92
    .line 93
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    const/4 v1, -0x1

    .line 100
    const-string v2, "com.yuanqi.master.mine.account.AccountScreen (AccountScreen.kt:60)"

    .line 101
    .line 102
    invoke-static {v0, v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    move-object v2, v0

    .line 114
    check-cast v2, Landroid/content/Context;

    .line 115
    .line 116
    const v0, -0x1d58f75c

    .line 117
    .line 118
    .line 119
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v10, 0x2

    .line 134
    if-ne v1, v4, :cond_4

    .line 135
    .line 136
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-static {v1, v9, v10, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 146
    .line 147
    .line 148
    check-cast v1, Landroidx/compose/runtime/MutableState;

    .line 149
    .line 150
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    if-ne v0, v3, :cond_5

    .line 162
    .line 163
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-static {v0, v9, v10, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 173
    .line 174
    .line 175
    move-object v3, v0

    .line 176
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 177
    .line 178
    sget-object v0, Lcom/yuanqi/master/mine/account/b$a;->INSTANCE:Lcom/yuanqi/master/mine/account/b$a;

    .line 179
    .line 180
    const/16 v4, 0x30

    .line 181
    .line 182
    const/4 v9, 0x0

    .line 183
    const/4 v10, 0x1

    .line 184
    invoke-static {v9, v0, v5, v4, v10}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLv3/a;Landroidx/compose/runtime/Composer;II)V

    .line 185
    .line 186
    .line 187
    const/4 v9, 0x0

    .line 188
    sget-object v0, Lcom/yuanqi/master/mine/account/c;->a:Lcom/yuanqi/master/mine/account/c;

    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/c;->a()Lv3/p;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const-wide/16 v17, 0x0

    .line 199
    .line 200
    const-wide/16 v19, 0x0

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    new-instance v4, Lcom/yuanqi/master/mine/account/b$b;

    .line 205
    .line 206
    move-object v0, v4

    .line 207
    move-object v14, v4

    .line 208
    move-object v4, v15

    .line 209
    move-object/from16 p2, v15

    .line 210
    .line 211
    move-object v15, v5

    .line 212
    move-object/from16 v5, p0

    .line 213
    .line 214
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/mine/account/b$b;-><init>(Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/navigation/NavHostController;)V

    .line 215
    .line 216
    .line 217
    const v0, 0x714719df

    .line 218
    .line 219
    .line 220
    invoke-static {v15, v0, v10, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const v22, 0x30000030

    .line 225
    .line 226
    .line 227
    const/16 v23, 0x1fd

    .line 228
    .line 229
    move-object v10, v11

    .line 230
    move-object v11, v12

    .line 231
    move-object v12, v13

    .line 232
    const/4 v1, 0x0

    .line 233
    move-object v13, v1

    .line 234
    move/from16 v14, v16

    .line 235
    .line 236
    move-object/from16 v2, p2

    .line 237
    .line 238
    move-object v1, v15

    .line 239
    move-wide/from16 v15, v17

    .line 240
    .line 241
    move-wide/from16 v17, v19

    .line 242
    .line 243
    move-object/from16 v19, v21

    .line 244
    .line 245
    move-object/from16 v20, v0

    .line 246
    .line 247
    move-object/from16 v21, v1

    .line 248
    .line 249
    invoke-static/range {v9 .. v23}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 250
    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_6

    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 259
    .line 260
    .line 261
    :cond_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-nez v0, :cond_7

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_7
    new-instance v1, Lcom/yuanqi/master/mine/account/b$c;

    .line 269
    .line 270
    invoke-direct {v1, v6, v2, v7, v8}, Lcom/yuanqi/master/mine/account/b$c;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;II)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 274
    .line 275
    .line 276
    :goto_2
    return-void
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
