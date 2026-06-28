.class public final Landroidx/compose/material3/Tooltip_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aq\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0008\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a@\u0010\u001e\u001a\u00020\u001b*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/material3/CaretScope;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/material3/CaretProperties;",
        "caretProperties",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "containerColor",
        "Landroidx/compose/ui/unit/Dp;",
        "tonalElevation",
        "shadowElevation",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "PlainTooltip-Fg7CxbU",
        "(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "PlainTooltip",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroid/content/res/Configuration;",
        "configuration",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "anchorLayoutCoordinates",
        "Landroidx/compose/ui/draw/DrawResult;",
        "drawCaretWithPath-Bx497Mc",
        "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;",
        "drawCaretWithPath",
        "material3_release"
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
        "SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,185:1\n154#2:186\n154#2:195\n74#3:187\n74#3:188\n1116#4,6:189\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n185#1:186\n129#1:195\n71#1:187\n72#1:188\n73#1:189,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final PlainTooltip-Fg7CxbU(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .param p0    # Landroidx/compose/material3/CaretScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/CaretProperties;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/CaretScope;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/CaretProperties;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p10

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    move/from16 v13, p13

    .line 8
    .line 9
    const v0, 0x18fb1bb3

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p11

    .line 13
    .line 14
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/high16 v3, -0x80000000

    .line 19
    .line 20
    and-int/2addr v3, v13

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    or-int/lit8 v3, v12, 0x6

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    and-int/lit8 v3, v12, 0x6

    .line 27
    .line 28
    if-nez v3, :cond_3

    .line 29
    .line 30
    and-int/lit8 v3, v12, 0x8

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_0
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v3, 0x2

    .line 48
    :goto_1
    or-int/2addr v3, v12

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move v3, v12

    .line 51
    :goto_2
    and-int/lit8 v4, v13, 0x1

    .line 52
    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    or-int/lit8 v3, v3, 0x30

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_4
    and-int/lit8 v5, v12, 0x30

    .line 59
    .line 60
    if-nez v5, :cond_6

    .line 61
    .line 62
    move-object/from16 v5, p1

    .line 63
    .line 64
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    const/16 v6, 0x20

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    const/16 v6, 0x10

    .line 74
    .line 75
    :goto_3
    or-int/2addr v3, v6

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    :goto_4
    move-object/from16 v5, p1

    .line 78
    .line 79
    :goto_5
    and-int/lit8 v6, v13, 0x2

    .line 80
    .line 81
    if-eqz v6, :cond_7

    .line 82
    .line 83
    or-int/lit16 v3, v3, 0x180

    .line 84
    .line 85
    goto :goto_7

    .line 86
    :cond_7
    and-int/lit16 v8, v12, 0x180

    .line 87
    .line 88
    if-nez v8, :cond_9

    .line 89
    .line 90
    move-object/from16 v8, p2

    .line 91
    .line 92
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_8

    .line 97
    .line 98
    const/16 v9, 0x100

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_8
    const/16 v9, 0x80

    .line 102
    .line 103
    :goto_6
    or-int/2addr v3, v9

    .line 104
    goto :goto_8

    .line 105
    :cond_9
    :goto_7
    move-object/from16 v8, p2

    .line 106
    .line 107
    :goto_8
    and-int/lit16 v9, v12, 0xc00

    .line 108
    .line 109
    if-nez v9, :cond_c

    .line 110
    .line 111
    and-int/lit8 v9, v13, 0x4

    .line 112
    .line 113
    if-nez v9, :cond_a

    .line 114
    .line 115
    move-object/from16 v9, p3

    .line 116
    .line 117
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_b

    .line 122
    .line 123
    const/16 v10, 0x800

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_a
    move-object/from16 v9, p3

    .line 127
    .line 128
    :cond_b
    const/16 v10, 0x400

    .line 129
    .line 130
    :goto_9
    or-int/2addr v3, v10

    .line 131
    goto :goto_a

    .line 132
    :cond_c
    move-object/from16 v9, p3

    .line 133
    .line 134
    :goto_a
    and-int/lit16 v10, v12, 0x6000

    .line 135
    .line 136
    if-nez v10, :cond_e

    .line 137
    .line 138
    and-int/lit8 v10, v13, 0x8

    .line 139
    .line 140
    move-wide/from16 v14, p4

    .line 141
    .line 142
    if-nez v10, :cond_d

    .line 143
    .line 144
    invoke-interface {v2, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_d

    .line 149
    .line 150
    const/16 v10, 0x4000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_d
    const/16 v10, 0x2000

    .line 154
    .line 155
    :goto_b
    or-int/2addr v3, v10

    .line 156
    goto :goto_c

    .line 157
    :cond_e
    move-wide/from16 v14, p4

    .line 158
    .line 159
    :goto_c
    const/high16 v10, 0x30000

    .line 160
    .line 161
    and-int v16, v12, v10

    .line 162
    .line 163
    if-nez v16, :cond_10

    .line 164
    .line 165
    and-int/lit8 v16, v13, 0x10

    .line 166
    .line 167
    move-wide/from16 v7, p6

    .line 168
    .line 169
    if-nez v16, :cond_f

    .line 170
    .line 171
    invoke-interface {v2, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 172
    .line 173
    .line 174
    move-result v17

    .line 175
    if-eqz v17, :cond_f

    .line 176
    .line 177
    const/high16 v17, 0x20000

    .line 178
    .line 179
    goto :goto_d

    .line 180
    :cond_f
    const/high16 v17, 0x10000

    .line 181
    .line 182
    :goto_d
    or-int v3, v3, v17

    .line 183
    .line 184
    goto :goto_e

    .line 185
    :cond_10
    move-wide/from16 v7, p6

    .line 186
    .line 187
    :goto_e
    and-int/lit8 v17, v13, 0x20

    .line 188
    .line 189
    const/high16 v18, 0x180000

    .line 190
    .line 191
    if-eqz v17, :cond_11

    .line 192
    .line 193
    or-int v3, v3, v18

    .line 194
    .line 195
    move/from16 v10, p8

    .line 196
    .line 197
    goto :goto_10

    .line 198
    :cond_11
    and-int v18, v12, v18

    .line 199
    .line 200
    move/from16 v10, p8

    .line 201
    .line 202
    if-nez v18, :cond_13

    .line 203
    .line 204
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 205
    .line 206
    .line 207
    move-result v19

    .line 208
    if-eqz v19, :cond_12

    .line 209
    .line 210
    const/high16 v19, 0x100000

    .line 211
    .line 212
    goto :goto_f

    .line 213
    :cond_12
    const/high16 v19, 0x80000

    .line 214
    .line 215
    :goto_f
    or-int v3, v3, v19

    .line 216
    .line 217
    :cond_13
    :goto_10
    and-int/lit8 v19, v13, 0x40

    .line 218
    .line 219
    const/high16 v20, 0xc00000

    .line 220
    .line 221
    if-eqz v19, :cond_14

    .line 222
    .line 223
    or-int v3, v3, v20

    .line 224
    .line 225
    move/from16 v0, p9

    .line 226
    .line 227
    goto :goto_12

    .line 228
    :cond_14
    and-int v21, v12, v20

    .line 229
    .line 230
    move/from16 v0, p9

    .line 231
    .line 232
    if-nez v21, :cond_16

    .line 233
    .line 234
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 235
    .line 236
    .line 237
    move-result v22

    .line 238
    if-eqz v22, :cond_15

    .line 239
    .line 240
    const/high16 v22, 0x800000

    .line 241
    .line 242
    goto :goto_11

    .line 243
    :cond_15
    const/high16 v22, 0x400000

    .line 244
    .line 245
    :goto_11
    or-int v3, v3, v22

    .line 246
    .line 247
    :cond_16
    :goto_12
    and-int/lit16 v0, v13, 0x80

    .line 248
    .line 249
    const/high16 v22, 0x6000000

    .line 250
    .line 251
    if-eqz v0, :cond_17

    .line 252
    .line 253
    or-int v3, v3, v22

    .line 254
    .line 255
    goto :goto_14

    .line 256
    :cond_17
    and-int v0, v12, v22

    .line 257
    .line 258
    if-nez v0, :cond_19

    .line 259
    .line 260
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_18

    .line 265
    .line 266
    const/high16 v0, 0x4000000

    .line 267
    .line 268
    goto :goto_13

    .line 269
    :cond_18
    const/high16 v0, 0x2000000

    .line 270
    .line 271
    :goto_13
    or-int/2addr v3, v0

    .line 272
    :cond_19
    :goto_14
    const v0, 0x2492493

    .line 273
    .line 274
    .line 275
    and-int/2addr v0, v3

    .line 276
    const v5, 0x2492492

    .line 277
    .line 278
    .line 279
    if-ne v0, v5, :cond_1b

    .line 280
    .line 281
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_1a

    .line 286
    .line 287
    goto :goto_15

    .line 288
    :cond_1a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 289
    .line 290
    .line 291
    move-object/from16 v3, p1

    .line 292
    .line 293
    move-object/from16 v4, p2

    .line 294
    .line 295
    move/from16 v27, p9

    .line 296
    .line 297
    move-wide v5, v14

    .line 298
    goto/16 :goto_21

    .line 299
    .line 300
    :cond_1b
    :goto_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 301
    .line 302
    .line 303
    and-int/lit8 v0, v12, 0x1

    .line 304
    .line 305
    const v22, -0xe001

    .line 306
    .line 307
    .line 308
    if-eqz v0, :cond_20

    .line 309
    .line 310
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_1c

    .line 315
    .line 316
    goto :goto_17

    .line 317
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 318
    .line 319
    .line 320
    and-int/lit8 v0, v13, 0x4

    .line 321
    .line 322
    if-eqz v0, :cond_1d

    .line 323
    .line 324
    and-int/lit16 v3, v3, -0x1c01

    .line 325
    .line 326
    :cond_1d
    and-int/lit8 v0, v13, 0x8

    .line 327
    .line 328
    if-eqz v0, :cond_1e

    .line 329
    .line 330
    and-int v3, v3, v22

    .line 331
    .line 332
    :cond_1e
    and-int/lit8 v0, v13, 0x10

    .line 333
    .line 334
    if-eqz v0, :cond_1f

    .line 335
    .line 336
    const v0, -0x70001

    .line 337
    .line 338
    .line 339
    and-int/2addr v3, v0

    .line 340
    :cond_1f
    move-object/from16 v0, p1

    .line 341
    .line 342
    move-object/from16 v4, p2

    .line 343
    .line 344
    move/from16 v27, p9

    .line 345
    .line 346
    move-object v6, v9

    .line 347
    const/4 v5, 0x0

    .line 348
    move-wide/from16 v29, v14

    .line 349
    .line 350
    move v14, v3

    .line 351
    move v3, v10

    .line 352
    :goto_16
    move-wide v9, v7

    .line 353
    move-wide/from16 v7, v29

    .line 354
    .line 355
    goto :goto_1d

    .line 356
    :cond_20
    :goto_17
    if-eqz v4, :cond_21

    .line 357
    .line 358
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 359
    .line 360
    goto :goto_18

    .line 361
    :cond_21
    move-object/from16 v0, p1

    .line 362
    .line 363
    :goto_18
    if-eqz v6, :cond_22

    .line 364
    .line 365
    const/4 v4, 0x0

    .line 366
    goto :goto_19

    .line 367
    :cond_22
    move-object/from16 v4, p2

    .line 368
    .line 369
    :goto_19
    and-int/lit8 v6, v13, 0x4

    .line 370
    .line 371
    const/4 v5, 0x6

    .line 372
    if-eqz v6, :cond_23

    .line 373
    .line 374
    sget-object v6, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 375
    .line 376
    invoke-virtual {v6, v2, v5}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContainerShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    and-int/lit16 v3, v3, -0x1c01

    .line 381
    .line 382
    goto :goto_1a

    .line 383
    :cond_23
    move-object v6, v9

    .line 384
    :goto_1a
    and-int/lit8 v9, v13, 0x8

    .line 385
    .line 386
    if-eqz v9, :cond_24

    .line 387
    .line 388
    sget-object v9, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 389
    .line 390
    invoke-virtual {v9, v2, v5}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 391
    .line 392
    .line 393
    move-result-wide v14

    .line 394
    and-int v3, v3, v22

    .line 395
    .line 396
    :cond_24
    and-int/lit8 v9, v13, 0x10

    .line 397
    .line 398
    if-eqz v9, :cond_25

    .line 399
    .line 400
    sget-object v7, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 401
    .line 402
    invoke-virtual {v7, v2, v5}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v7

    .line 406
    const v5, -0x70001

    .line 407
    .line 408
    .line 409
    and-int/2addr v3, v5

    .line 410
    :cond_25
    const/4 v5, 0x0

    .line 411
    if-eqz v17, :cond_26

    .line 412
    .line 413
    int-to-float v9, v5

    .line 414
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 415
    .line 416
    .line 417
    move-result v9

    .line 418
    goto :goto_1b

    .line 419
    :cond_26
    move v9, v10

    .line 420
    :goto_1b
    if-eqz v19, :cond_27

    .line 421
    .line 422
    int-to-float v10, v5

    .line 423
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    move/from16 v27, v10

    .line 428
    .line 429
    goto :goto_1c

    .line 430
    :cond_27
    move/from16 v27, p9

    .line 431
    .line 432
    :goto_1c
    move-wide/from16 v29, v14

    .line 433
    .line 434
    move v14, v3

    .line 435
    move v3, v9

    .line 436
    goto :goto_16

    .line 437
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 438
    .line 439
    .line 440
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 441
    .line 442
    .line 443
    move-result v15

    .line 444
    if-eqz v15, :cond_28

    .line 445
    .line 446
    const/4 v15, -0x1

    .line 447
    const-string v5, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)"

    .line 448
    .line 449
    const v12, 0x18fb1bb3

    .line 450
    .line 451
    .line 452
    invoke-static {v12, v14, v15, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 453
    .line 454
    .line 455
    :cond_28
    const v5, 0x7b3aa24b

    .line 456
    .line 457
    .line 458
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 459
    .line 460
    .line 461
    if-eqz v4, :cond_2f

    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 464
    .line 465
    .line 466
    move-result-object v15

    .line 467
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v15

    .line 471
    check-cast v15, Landroidx/compose/ui/unit/Density;

    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 474
    .line 475
    .line 476
    move-result-object v12

    .line 477
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    check-cast v12, Landroid/content/res/Configuration;

    .line 482
    .line 483
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 484
    .line 485
    const v13, 0x7b3aa2f3

    .line 486
    .line 487
    .line 488
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v13

    .line 495
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v17

    .line 499
    or-int v13, v13, v17

    .line 500
    .line 501
    const/high16 v17, 0x70000

    .line 502
    .line 503
    and-int v19, v14, v17

    .line 504
    .line 505
    move/from16 p9, v3

    .line 506
    .line 507
    const/high16 v17, 0x30000

    .line 508
    .line 509
    xor-int v3, v19, v17

    .line 510
    .line 511
    move-object/from16 v28, v6

    .line 512
    .line 513
    const/high16 v6, 0x20000

    .line 514
    .line 515
    if-le v3, v6, :cond_29

    .line 516
    .line 517
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    if-nez v3, :cond_2a

    .line 522
    .line 523
    :cond_29
    and-int v3, v14, v17

    .line 524
    .line 525
    if-ne v3, v6, :cond_2b

    .line 526
    .line 527
    :cond_2a
    const/4 v3, 0x1

    .line 528
    goto :goto_1e

    .line 529
    :cond_2b
    const/4 v3, 0x0

    .line 530
    :goto_1e
    or-int/2addr v3, v13

    .line 531
    and-int/lit16 v6, v14, 0x380

    .line 532
    .line 533
    const/16 v13, 0x100

    .line 534
    .line 535
    if-ne v6, v13, :cond_2c

    .line 536
    .line 537
    const/16 v24, 0x1

    .line 538
    .line 539
    goto :goto_1f

    .line 540
    :cond_2c
    const/16 v24, 0x0

    .line 541
    .line 542
    :goto_1f
    or-int v3, v3, v24

    .line 543
    .line 544
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    if-nez v3, :cond_2d

    .line 549
    .line 550
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 551
    .line 552
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    if-ne v6, v3, :cond_2e

    .line 557
    .line 558
    :cond_2d
    new-instance v6, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$customModifier$1$1;

    .line 559
    .line 560
    move-object/from16 p1, v6

    .line 561
    .line 562
    move-object/from16 p2, v15

    .line 563
    .line 564
    move-object/from16 p3, v12

    .line 565
    .line 566
    move-wide/from16 p4, v9

    .line 567
    .line 568
    move-object/from16 p6, v4

    .line 569
    .line 570
    invoke-direct/range {p1 .. p6}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$customModifier$1$1;-><init>(Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;)V

    .line 571
    .line 572
    .line 573
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    :cond_2e
    check-cast v6, Lv3/p;

    .line 577
    .line 578
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 579
    .line 580
    .line 581
    invoke-interface {v1, v5, v6}, Landroidx/compose/material3/CaretScope;->drawCaret(Landroidx/compose/ui/Modifier;Lv3/p;)Landroidx/compose/ui/Modifier;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    goto :goto_20

    .line 590
    :cond_2f
    move/from16 p9, v3

    .line 591
    .line 592
    move-object/from16 v28, v6

    .line 593
    .line 594
    move-object v3, v0

    .line 595
    :goto_20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 596
    .line 597
    .line 598
    const-wide/16 v18, 0x0

    .line 599
    .line 600
    const/16 v22, 0x0

    .line 601
    .line 602
    new-instance v5, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1;

    .line 603
    .line 604
    invoke-direct {v5, v7, v8, v11}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1;-><init>(JLv3/p;)V

    .line 605
    .line 606
    .line 607
    const v6, -0x2a131d08

    .line 608
    .line 609
    .line 610
    const/4 v12, 0x1

    .line 611
    invoke-static {v2, v6, v12, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 612
    .line 613
    .line 614
    move-result-object v23

    .line 615
    shr-int/lit8 v5, v14, 0x6

    .line 616
    .line 617
    and-int/lit8 v6, v5, 0x70

    .line 618
    .line 619
    or-int v6, v6, v20

    .line 620
    .line 621
    shr-int/lit8 v12, v14, 0x9

    .line 622
    .line 623
    and-int/lit16 v12, v12, 0x380

    .line 624
    .line 625
    or-int/2addr v6, v12

    .line 626
    const v12, 0xe000

    .line 627
    .line 628
    .line 629
    and-int/2addr v12, v5

    .line 630
    or-int/2addr v6, v12

    .line 631
    const/high16 v12, 0x70000

    .line 632
    .line 633
    and-int/2addr v5, v12

    .line 634
    or-int v25, v6, v5

    .line 635
    .line 636
    const/16 v26, 0x48

    .line 637
    .line 638
    move-object v14, v3

    .line 639
    move-object/from16 v15, v28

    .line 640
    .line 641
    move-wide/from16 v16, v9

    .line 642
    .line 643
    move/from16 v20, p9

    .line 644
    .line 645
    move/from16 v21, v27

    .line 646
    .line 647
    move-object/from16 v24, v2

    .line 648
    .line 649
    invoke-static/range {v14 .. v26}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 650
    .line 651
    .line 652
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    if-eqz v3, :cond_30

    .line 657
    .line 658
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 659
    .line 660
    .line 661
    :cond_30
    move-object v3, v0

    .line 662
    move-wide v5, v7

    .line 663
    move-wide v7, v9

    .line 664
    move-object/from16 v9, v28

    .line 665
    .line 666
    move/from16 v10, p9

    .line 667
    .line 668
    :goto_21
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 669
    .line 670
    .line 671
    move-result-object v14

    .line 672
    if-eqz v14, :cond_31

    .line 673
    .line 674
    new-instance v15, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$2;

    .line 675
    .line 676
    move-object v0, v15

    .line 677
    move-object/from16 v1, p0

    .line 678
    .line 679
    move-object v2, v3

    .line 680
    move-object v3, v4

    .line 681
    move-object v4, v9

    .line 682
    move v9, v10

    .line 683
    move/from16 v10, v27

    .line 684
    .line 685
    move-object/from16 v11, p10

    .line 686
    .line 687
    move/from16 v12, p12

    .line 688
    .line 689
    move/from16 v13, p13

    .line 690
    .line 691
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$2;-><init>(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLv3/p;II)V

    .line 692
    .line 693
    .line 694
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 695
    .line 696
    .line 697
    :cond_31
    return-void
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
.end method

.method public static final synthetic access$drawCaretWithPath-Bx497Mc(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/Tooltip_androidKt;->drawCaretWithPath-Bx497Mc(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object p0

    return-object p0
.end method

.method private static final drawCaretWithPath-Bx497Mc(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;
    .locals 16
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/material3/CaretProperties;->getCaretHeight-D9Ej5fM()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-interface {v0, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/material3/CaretProperties;->getCaretWidth-D9Ej5fM()F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    move-object/from16 v5, p2

    .line 28
    .line 29
    iget v5, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 30
    .line 31
    int-to-float v5, v5

    .line 32
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-interface {v0, v5}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {}, Landroidx/compose/material3/TooltipKt;->getSpacingBetweenTooltipAndAnchor()F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static/range {p6 .. p6}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    add-float v9, v8, v7

    .line 65
    .line 66
    const/4 v10, 0x2

    .line 67
    int-to-float v11, v10

    .line 68
    div-float/2addr v9, v11

    .line 69
    sub-float/2addr v8, v7

    .line 70
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 71
    .line 72
    .line 73
    move-result-wide v12

    .line 74
    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 79
    .line 80
    .line 81
    move-result-wide v13

    .line 82
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    sub-float/2addr v6, v13

    .line 87
    int-to-float v0, v0

    .line 88
    sub-float/2addr v6, v0

    .line 89
    const/4 v0, 0x0

    .line 90
    cmpg-float v6, v6, v0

    .line 91
    .line 92
    if-gez v6, :cond_0

    .line 93
    .line 94
    const/4 v6, 0x1

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    const/4 v6, 0x0

    .line 97
    :goto_0
    if-eqz v6, :cond_1

    .line 98
    .line 99
    move v13, v0

    .line 100
    :cond_1
    div-float v14, v12, v11

    .line 101
    .line 102
    add-float/2addr v14, v9

    .line 103
    int-to-float v5, v5

    .line 104
    cmpl-float v14, v14, v5

    .line 105
    .line 106
    if-lez v14, :cond_2

    .line 107
    .line 108
    sub-float/2addr v5, v9

    .line 109
    sub-float/2addr v12, v5

    .line 110
    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 116
    .line 117
    .line 118
    move-result-wide v14

    .line 119
    invoke-static {v14, v15}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    div-float/2addr v5, v11

    .line 124
    div-float/2addr v8, v11

    .line 125
    sub-float/2addr v5, v8

    .line 126
    sub-float/2addr v7, v5

    .line 127
    invoke-static {v7, v0}, Ljava/lang/Math;->max(FF)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    sub-float/2addr v9, v0

    .line 132
    invoke-static {v9, v13}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    :goto_1
    if-eqz v6, :cond_3

    .line 137
    .line 138
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 147
    .line 148
    .line 149
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    div-int/2addr v4, v10

    .line 154
    int-to-float v4, v4

    .line 155
    add-float/2addr v0, v4

    .line 156
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 161
    .line 162
    .line 163
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    int-to-float v3, v3

    .line 172
    sub-float/2addr v5, v3

    .line 173
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 174
    .line 175
    .line 176
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    sub-float/2addr v0, v4

    .line 181
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    invoke-interface {v2, v0, v3}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v2}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_3
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 201
    .line 202
    .line 203
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    div-int/2addr v4, v10

    .line 208
    int-to-float v4, v4

    .line 209
    add-float/2addr v0, v4

    .line 210
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 215
    .line 216
    .line 217
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    int-to-float v3, v3

    .line 226
    add-float/2addr v5, v3

    .line 227
    invoke-interface {v2, v0, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 228
    .line 229
    .line 230
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    sub-float/2addr v0, v4

    .line 235
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    invoke-interface {v2, v0, v3}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v2}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 243
    .line 244
    .line 245
    :cond_4
    :goto_2
    new-instance v0, Landroidx/compose/material3/Tooltip_androidKt$drawCaretWithPath$4;

    .line 246
    .line 247
    move-wide/from16 v3, p3

    .line 248
    .line 249
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/material3/Tooltip_androidKt$drawCaretWithPath$4;-><init>(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/graphics/Path;J)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v1, p0

    .line 253
    .line 254
    invoke-virtual {v1, v0}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lv3/l;)Landroidx/compose/ui/draw/DrawResult;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0
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
.end method
