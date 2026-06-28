.class public final Landroidx/compose/material/DividerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a:\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/graphics/Color;",
        "color",
        "Landroidx/compose/ui/unit/Dp;",
        "thickness",
        "startIndent",
        "Lkotlin/r2;",
        "Divider-oMI9zvI",
        "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V",
        "Divider",
        "",
        "DividerAlpha",
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
        "SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:71\n174#2:73\n74#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n47#1:70\n48#1:71\n56#1:73\n56#1:72\n*E\n"
    }
.end annotation


# static fields
.field private static final DividerAlpha:F = 0.12f


# direct methods
.method public static final Divider-oMI9zvI(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x4a783646

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    and-int/lit8 v2, p7, 0x1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    or-int/lit8 v3, v6, 0x6

    .line 17
    .line 18
    move v4, v3

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v3, v6, 0xe

    .line 23
    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v4, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v3, p0

    .line 40
    .line 41
    move v4, v6

    .line 42
    :goto_1
    and-int/lit8 v5, v6, 0x70

    .line 43
    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    and-int/lit8 v5, p7, 0x2

    .line 47
    .line 48
    move-wide/from16 v7, p1

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    invoke-interface {v1, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-wide/from16 v7, p1

    .line 66
    .line 67
    :goto_3
    and-int/lit8 v5, p7, 0x4

    .line 68
    .line 69
    if-eqz v5, :cond_5

    .line 70
    .line 71
    or-int/lit16 v4, v4, 0x180

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_5
    and-int/lit16 v9, v6, 0x380

    .line 75
    .line 76
    if-nez v9, :cond_7

    .line 77
    .line 78
    move/from16 v9, p3

    .line 79
    .line 80
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_6

    .line 85
    .line 86
    const/16 v10, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v10, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v4, v10

    .line 92
    goto :goto_6

    .line 93
    :cond_7
    :goto_5
    move/from16 v9, p3

    .line 94
    .line 95
    :goto_6
    and-int/lit8 v10, p7, 0x8

    .line 96
    .line 97
    if-eqz v10, :cond_8

    .line 98
    .line 99
    or-int/lit16 v4, v4, 0xc00

    .line 100
    .line 101
    goto :goto_8

    .line 102
    :cond_8
    and-int/lit16 v11, v6, 0x1c00

    .line 103
    .line 104
    if-nez v11, :cond_a

    .line 105
    .line 106
    move/from16 v11, p4

    .line 107
    .line 108
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_9

    .line 113
    .line 114
    const/16 v12, 0x800

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    const/16 v12, 0x400

    .line 118
    .line 119
    :goto_7
    or-int/2addr v4, v12

    .line 120
    goto :goto_9

    .line 121
    :cond_a
    :goto_8
    move/from16 v11, p4

    .line 122
    .line 123
    :goto_9
    and-int/lit16 v12, v4, 0x16db

    .line 124
    .line 125
    const/16 v13, 0x492

    .line 126
    .line 127
    if-ne v12, v13, :cond_d

    .line 128
    .line 129
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    if-nez v12, :cond_b

    .line 134
    .line 135
    goto :goto_b

    .line 136
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 137
    .line 138
    .line 139
    move-object v2, v3

    .line 140
    :cond_c
    :goto_a
    move v4, v9

    .line 141
    move v5, v11

    .line 142
    goto/16 :goto_12

    .line 143
    .line 144
    :cond_d
    :goto_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 145
    .line 146
    .line 147
    and-int/lit8 v12, v6, 0x1

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const/4 v14, 0x1

    .line 151
    if-eqz v12, :cond_10

    .line 152
    .line 153
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_e

    .line 158
    .line 159
    goto :goto_c

    .line 160
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 161
    .line 162
    .line 163
    and-int/lit8 v2, p7, 0x2

    .line 164
    .line 165
    if-eqz v2, :cond_f

    .line 166
    .line 167
    and-int/lit8 v4, v4, -0x71

    .line 168
    .line 169
    :cond_f
    move-object v2, v3

    .line 170
    goto :goto_e

    .line 171
    :cond_10
    :goto_c
    if-eqz v2, :cond_11

    .line 172
    .line 173
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 174
    .line 175
    goto :goto_d

    .line 176
    :cond_11
    move-object v2, v3

    .line 177
    :goto_d
    and-int/lit8 v3, p7, 0x2

    .line 178
    .line 179
    if-eqz v3, :cond_12

    .line 180
    .line 181
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 182
    .line 183
    const/4 v7, 0x6

    .line 184
    invoke-virtual {v3, v1, v7}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v15

    .line 192
    const v17, 0x3df5c28f    # 0.12f

    .line 193
    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    const/16 v19, 0x0

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    const/16 v21, 0xe

    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v7

    .line 209
    and-int/lit8 v4, v4, -0x71

    .line 210
    .line 211
    :cond_12
    if-eqz v5, :cond_13

    .line 212
    .line 213
    int-to-float v3, v14

    .line 214
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    move v9, v3

    .line 219
    :cond_13
    if-eqz v10, :cond_14

    .line 220
    .line 221
    int-to-float v3, v13

    .line 222
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    move v11, v3

    .line 227
    :cond_14
    :goto_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_15

    .line 235
    .line 236
    const/4 v3, -0x1

    .line 237
    const-string v5, "androidx.compose.material.Divider (Divider.kt:48)"

    .line 238
    .line 239
    invoke-static {v0, v4, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_15
    const/4 v0, 0x0

    .line 243
    cmpg-float v3, v11, v0

    .line 244
    .line 245
    if-nez v3, :cond_16

    .line 246
    .line 247
    move v3, v14

    .line 248
    goto :goto_f

    .line 249
    :cond_16
    move v3, v13

    .line 250
    :goto_f
    if-nez v3, :cond_17

    .line 251
    .line 252
    sget-object v15, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const/16 v18, 0x0

    .line 257
    .line 258
    const/16 v19, 0x0

    .line 259
    .line 260
    const/16 v20, 0xe

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    move/from16 v16, v11

    .line 265
    .line 266
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    goto :goto_10

    .line 271
    :cond_17
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 272
    .line 273
    :goto_10
    const v4, 0x493fbe0d

    .line 274
    .line 275
    .line 276
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 277
    .line 278
    .line 279
    sget-object v4, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    .line 280
    .line 281
    invoke-virtual {v4}, Landroidx/compose/ui/unit/Dp$Companion;->getHairline-D9Ej5fM()F

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    invoke-static {v9, v4}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_18

    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 300
    .line 301
    invoke-interface {v4}, Landroidx/compose/ui/unit/Density;->getDensity()F

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    const/high16 v5, 0x3f800000    # 1.0f

    .line 306
    .line 307
    div-float/2addr v5, v4

    .line 308
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    goto :goto_11

    .line 313
    :cond_18
    move v4, v9

    .line 314
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 315
    .line 316
    .line 317
    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    const/4 v5, 0x0

    .line 322
    invoke-static {v3, v0, v14, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const/4 v3, 0x0

    .line 331
    const/4 v4, 0x2

    .line 332
    move-object/from16 p0, v0

    .line 333
    .line 334
    move-wide/from16 p1, v7

    .line 335
    .line 336
    move-object/from16 p3, v3

    .line 337
    .line 338
    move/from16 p4, v4

    .line 339
    .line 340
    move-object/from16 p5, v5

    .line 341
    .line 342
    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {v0, v1, v13}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-eqz v0, :cond_c

    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_a

    .line 359
    .line 360
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    if-eqz v9, :cond_19

    .line 365
    .line 366
    new-instance v10, Landroidx/compose/material/DividerKt$Divider$1;

    .line 367
    .line 368
    move-object v0, v10

    .line 369
    move-object v1, v2

    .line 370
    move-wide v2, v7

    .line 371
    move/from16 v6, p6

    .line 372
    .line 373
    move/from16 v7, p7

    .line 374
    .line 375
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/DividerKt$Divider$1;-><init>(Landroidx/compose/ui/Modifier;JFFII)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 379
    .line 380
    .line 381
    :cond_19
    return-void
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
