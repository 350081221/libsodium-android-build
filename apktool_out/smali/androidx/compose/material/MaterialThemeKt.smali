.class public final Landroidx/compose/material/MaterialThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a@\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/material/Colors;",
        "colors",
        "Landroidx/compose/material/Typography;",
        "typography",
        "Landroidx/compose/material/Shapes;",
        "shapes",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "MaterialTheme",
        "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
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
        "SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1116#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final MaterialTheme(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .param p0    # Landroidx/compose/material/Colors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material/Typography;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material/Shapes;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/Colors;",
            "Landroidx/compose/material/Typography;",
            "Landroidx/compose/material/Shapes;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move/from16 v5, p5

    .line 4
    .line 5
    const v0, -0x3521f1f7    # -7276292.5f

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v5, 0xe

    .line 15
    .line 16
    const/4 v13, 0x2

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    and-int/lit8 v2, p6, 0x1

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    move-object/from16 v2, p0

    .line 24
    .line 25
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object/from16 v2, p0

    .line 34
    .line 35
    :cond_1
    move v6, v13

    .line 36
    :goto_0
    or-int/2addr v6, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object/from16 v2, p0

    .line 39
    .line 40
    move v6, v5

    .line 41
    :goto_1
    and-int/lit8 v7, v5, 0x70

    .line 42
    .line 43
    if-nez v7, :cond_5

    .line 44
    .line 45
    and-int/lit8 v7, p6, 0x2

    .line 46
    .line 47
    if-nez v7, :cond_3

    .line 48
    .line 49
    move-object/from16 v7, p1

    .line 50
    .line 51
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_4

    .line 56
    .line 57
    const/16 v8, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object/from16 v7, p1

    .line 61
    .line 62
    :cond_4
    const/16 v8, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v6, v8

    .line 65
    goto :goto_3

    .line 66
    :cond_5
    move-object/from16 v7, p1

    .line 67
    .line 68
    :goto_3
    and-int/lit16 v8, v5, 0x380

    .line 69
    .line 70
    if-nez v8, :cond_8

    .line 71
    .line 72
    and-int/lit8 v8, p6, 0x4

    .line 73
    .line 74
    if-nez v8, :cond_6

    .line 75
    .line 76
    move-object/from16 v8, p2

    .line 77
    .line 78
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_7

    .line 83
    .line 84
    const/16 v9, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    move-object/from16 v8, p2

    .line 88
    .line 89
    :cond_7
    const/16 v9, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v6, v9

    .line 92
    goto :goto_5

    .line 93
    :cond_8
    move-object/from16 v8, p2

    .line 94
    .line 95
    :goto_5
    and-int/lit8 v9, p6, 0x8

    .line 96
    .line 97
    if-eqz v9, :cond_9

    .line 98
    .line 99
    or-int/lit16 v6, v6, 0xc00

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_9
    and-int/lit16 v9, v5, 0x1c00

    .line 103
    .line 104
    if-nez v9, :cond_b

    .line 105
    .line 106
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_a

    .line 111
    .line 112
    const/16 v9, 0x800

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_a
    const/16 v9, 0x400

    .line 116
    .line 117
    :goto_6
    or-int/2addr v6, v9

    .line 118
    :cond_b
    :goto_7
    and-int/lit16 v9, v6, 0x16db

    .line 119
    .line 120
    const/16 v10, 0x492

    .line 121
    .line 122
    if-ne v9, v10, :cond_d

    .line 123
    .line 124
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_c

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 132
    .line 133
    .line 134
    move-object v15, v7

    .line 135
    move-object v3, v8

    .line 136
    goto/16 :goto_b

    .line 137
    .line 138
    :cond_d
    :goto_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 139
    .line 140
    .line 141
    and-int/lit8 v9, v5, 0x1

    .line 142
    .line 143
    const/4 v14, 0x6

    .line 144
    if-eqz v9, :cond_11

    .line 145
    .line 146
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_e

    .line 151
    .line 152
    goto :goto_9

    .line 153
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 154
    .line 155
    .line 156
    and-int/lit8 v9, p6, 0x1

    .line 157
    .line 158
    if-eqz v9, :cond_f

    .line 159
    .line 160
    and-int/lit8 v6, v6, -0xf

    .line 161
    .line 162
    :cond_f
    and-int/lit8 v9, p6, 0x2

    .line 163
    .line 164
    if-eqz v9, :cond_10

    .line 165
    .line 166
    and-int/lit8 v6, v6, -0x71

    .line 167
    .line 168
    :cond_10
    and-int/lit8 v9, p6, 0x4

    .line 169
    .line 170
    if-eqz v9, :cond_14

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_11
    :goto_9
    and-int/lit8 v9, p6, 0x1

    .line 174
    .line 175
    if-eqz v9, :cond_12

    .line 176
    .line 177
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 178
    .line 179
    invoke-virtual {v2, v1, v14}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    and-int/lit8 v6, v6, -0xf

    .line 184
    .line 185
    :cond_12
    and-int/lit8 v9, p6, 0x2

    .line 186
    .line 187
    if-eqz v9, :cond_13

    .line 188
    .line 189
    sget-object v7, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 190
    .line 191
    invoke-virtual {v7, v1, v14}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    and-int/lit8 v6, v6, -0x71

    .line 196
    .line 197
    :cond_13
    and-int/lit8 v9, p6, 0x4

    .line 198
    .line 199
    if-eqz v9, :cond_14

    .line 200
    .line 201
    sget-object v8, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 202
    .line 203
    invoke-virtual {v8, v1, v14}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    :goto_a
    and-int/lit16 v6, v6, -0x381

    .line 208
    .line 209
    :cond_14
    move-object v12, v7

    .line 210
    move-object v11, v8

    .line 211
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_15

    .line 219
    .line 220
    const/4 v7, -0x1

    .line 221
    const-string v8, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)"

    .line 222
    .line 223
    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_15
    const v0, -0x1d58f75c

    .line 227
    .line 228
    .line 229
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 237
    .line 238
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    if-ne v0, v6, :cond_16

    .line 243
    .line 244
    const-wide/16 v16, 0x0

    .line 245
    .line 246
    const-wide/16 v18, 0x0

    .line 247
    .line 248
    const-wide/16 v20, 0x0

    .line 249
    .line 250
    const-wide/16 v22, 0x0

    .line 251
    .line 252
    const-wide/16 v24, 0x0

    .line 253
    .line 254
    const-wide/16 v26, 0x0

    .line 255
    .line 256
    const-wide/16 v28, 0x0

    .line 257
    .line 258
    const-wide/16 v30, 0x0

    .line 259
    .line 260
    const-wide/16 v32, 0x0

    .line 261
    .line 262
    const-wide/16 v34, 0x0

    .line 263
    .line 264
    const-wide/16 v36, 0x0

    .line 265
    .line 266
    const-wide/16 v38, 0x0

    .line 267
    .line 268
    const/16 v40, 0x0

    .line 269
    .line 270
    const/16 v41, 0x1fff

    .line 271
    .line 272
    const/16 v42, 0x0

    .line 273
    .line 274
    move-object v15, v2

    .line 275
    invoke-static/range {v15 .. v42}, Landroidx/compose/material/Colors;->copy-pvPzIIM$default(Landroidx/compose/material/Colors;JJJJJJJJJJJJZILjava/lang/Object;)Landroidx/compose/material/Colors;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 283
    .line 284
    .line 285
    check-cast v0, Landroidx/compose/material/Colors;

    .line 286
    .line 287
    invoke-static {v0, v2}, Landroidx/compose/material/ColorsKt;->updateColorsFrom(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V

    .line 288
    .line 289
    .line 290
    const/4 v6, 0x0

    .line 291
    const/4 v7, 0x0

    .line 292
    const-wide/16 v8, 0x0

    .line 293
    .line 294
    const/4 v15, 0x0

    .line 295
    const/16 v16, 0x7

    .line 296
    .line 297
    move-object v10, v1

    .line 298
    move-object v3, v11

    .line 299
    move v11, v15

    .line 300
    move-object v15, v12

    .line 301
    move/from16 v12, v16

    .line 302
    .line 303
    invoke-static/range {v6 .. v12}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    const/4 v7, 0x0

    .line 308
    invoke-static {v0, v1, v7}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->rememberTextSelectionColors(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    const/4 v9, 0x7

    .line 313
    new-array v9, v9, [Landroidx/compose/runtime/ProvidedValue;

    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/material/ColorsKt;->getLocalColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-virtual {v10, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    aput-object v0, v9, v7

    .line 324
    .line 325
    invoke-static {}, Landroidx/compose/material/ContentAlphaKt;->getLocalContentAlpha()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget-object v7, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    .line 330
    .line 331
    invoke-virtual {v7, v1, v14}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    const/4 v7, 0x1

    .line 344
    aput-object v0, v9, v7

    .line 345
    .line 346
    invoke-static {}, Landroidx/compose/foundation/IndicationKt;->getLocalIndication()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    aput-object v0, v9, v13

    .line 355
    .line 356
    invoke-static {}, Landroidx/compose/material/ripple/RippleThemeKt;->getLocalRippleTheme()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    sget-object v6, Landroidx/compose/material/MaterialRippleTheme;->INSTANCE:Landroidx/compose/material/MaterialRippleTheme;

    .line 361
    .line 362
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const/4 v6, 0x3

    .line 367
    aput-object v0, v9, v6

    .line 368
    .line 369
    invoke-static {}, Landroidx/compose/material/ShapesKt;->getLocalShapes()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    const/4 v6, 0x4

    .line 378
    aput-object v0, v9, v6

    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0, v8}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/4 v6, 0x5

    .line 389
    aput-object v0, v9, v6

    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/material/TypographyKt;->getLocalTypography()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0, v15}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    aput-object v0, v9, v14

    .line 400
    .line 401
    new-instance v0, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$1;

    .line 402
    .line 403
    invoke-direct {v0, v15, v4}, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$1;-><init>(Landroidx/compose/material/Typography;Lv3/p;)V

    .line 404
    .line 405
    .line 406
    const v6, -0x67b7dd37

    .line 407
    .line 408
    .line 409
    invoke-static {v1, v6, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    const/16 v6, 0x38

    .line 414
    .line 415
    invoke-static {v9, v0, v1, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 416
    .line 417
    .line 418
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_17

    .line 423
    .line 424
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 425
    .line 426
    .line 427
    :cond_17
    :goto_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    if-eqz v7, :cond_18

    .line 432
    .line 433
    new-instance v8, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$2;

    .line 434
    .line 435
    move-object v0, v8

    .line 436
    move-object v1, v2

    .line 437
    move-object v2, v15

    .line 438
    move-object/from16 v4, p3

    .line 439
    .line 440
    move/from16 v5, p5

    .line 441
    .line 442
    move/from16 v6, p6

    .line 443
    .line 444
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$2;-><init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lv3/p;II)V

    .line 445
    .line 446
    .line 447
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 448
    .line 449
    .line 450
    :cond_18
    return-void
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
