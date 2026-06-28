.class public final Lcom/yuanqi/master/manager/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "ChangeDeviceScreen",
        "",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "managerViewModel",
        "Lcom/yuanqi/master/manager/ManagerViewModel;",
        "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/compose/runtime/Composer;II)V",
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
        "SMAP\nChangeDeviceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n81#2,11:102\n74#3:113\n*S KotlinDebug\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt\n*L\n34#1:102,11\n36#1:113\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0    # Landroidx/navigation/NavHostController;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lcom/yuanqi/master/manager/ManagerViewModel;
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
    const v3, 0x3c5f52c9

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
    if-eqz v4, :cond_2

    .line 24
    .line 25
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const v4, 0x671a9c9b

    .line 30
    .line 31
    .line 32
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 33
    .line 34
    .line 35
    sget-object v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 36
    .line 37
    const/4 v5, 0x6

    .line 38
    invoke-virtual {v4, v15, v5}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    instance-of v4, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 46
    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    move-object v4, v5

    .line 50
    check-cast v4, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 51
    .line 52
    invoke-interface {v4}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v4, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 58
    .line 59
    :goto_0
    move-object v8, v4

    .line 60
    const-class v4, Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 61
    .line 62
    const v10, 0x9048

    .line 63
    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    move-object v9, v15

    .line 67
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 72
    .line 73
    .line 74
    check-cast v4, Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 75
    .line 76
    move-object v14, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_2
    move-object/from16 v14, p1

    .line 91
    .line 92
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    const/4 v4, -0x1

    .line 99
    const-string v5, "com.yuanqi.master.manager.ChangeDeviceScreen (ChangeDeviceScreen.kt:34)"

    .line 100
    .line 101
    invoke-static {v3, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Landroid/content/Context;

    .line 113
    .line 114
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    new-instance v5, Lcom/yuanqi/master/manager/a$a;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    invoke-direct {v5, v14, v3, v6}, Lcom/yuanqi/master/manager/a$a;-><init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Lkotlin/coroutines/d;)V

    .line 120
    .line 121
    .line 122
    const/16 v6, 0x46

    .line 123
    .line 124
    invoke-static {v4, v5, v15, v6}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 125
    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    new-instance v5, Lcom/yuanqi/master/manager/a$b;

    .line 129
    .line 130
    invoke-direct {v5, v14, v3, v0}, Lcom/yuanqi/master/manager/a$b;-><init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Landroidx/navigation/NavHostController;)V

    .line 131
    .line 132
    .line 133
    const v3, -0x7bbbf373

    .line 134
    .line 135
    .line 136
    const/4 v6, 0x1

    .line 137
    invoke-static {v15, v3, v6, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    const/4 v3, 0x0

    .line 142
    const/4 v7, 0x0

    .line 143
    const/4 v8, 0x0

    .line 144
    const/4 v9, 0x0

    .line 145
    const-wide/16 v10, 0x0

    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    new-instance v12, Lcom/yuanqi/master/manager/a$c;

    .line 150
    .line 151
    invoke-direct {v12, v14}, Lcom/yuanqi/master/manager/a$c;-><init>(Lcom/yuanqi/master/manager/ManagerViewModel;)V

    .line 152
    .line 153
    .line 154
    const v13, 0x24a5dd18

    .line 155
    .line 156
    .line 157
    invoke-static {v15, v13, v6, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 158
    .line 159
    .line 160
    move-result-object v17

    .line 161
    const v18, 0x30000030

    .line 162
    .line 163
    .line 164
    const/16 v19, 0x1fd

    .line 165
    .line 166
    move-object v6, v3

    .line 167
    const-wide/16 v12, 0x0

    .line 168
    .line 169
    move-object v3, v14

    .line 170
    move-object/from16 v14, v16

    .line 171
    .line 172
    move-object/from16 v20, v15

    .line 173
    .line 174
    move-object/from16 v15, v17

    .line 175
    .line 176
    move-object/from16 v16, v20

    .line 177
    .line 178
    move/from16 v17, v18

    .line 179
    .line 180
    move/from16 v18, v19

    .line 181
    .line 182
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_4

    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 192
    .line 193
    .line 194
    :cond_4
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    if-nez v4, :cond_5

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_5
    new-instance v5, Lcom/yuanqi/master/manager/a$d;

    .line 202
    .line 203
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/manager/a$d;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/manager/ManagerViewModel;II)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 207
    .line 208
    .line 209
    :goto_2
    return-void
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
