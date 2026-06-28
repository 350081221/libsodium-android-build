.class public final Lcom/yuanqi/master/main/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "GridItems",
        "",
        "info",
        "Lcom/yuanqi/group/home/models/AppInfo;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "isSelect",
        "",
        "(Lcom/yuanqi/group/home/models/AppInfo;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V",
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
        "SMAP\nGridItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItems.kt\ncom/yuanqi/master/main/GridItemsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,68:1\n154#2:69\n154#2:70\n164#2:71\n154#2:72\n154#2:143\n69#3,5:73\n74#3:106\n78#3:153\n79#4,11:78\n79#4,11:114\n92#4:147\n92#4:152\n456#5,8:89\n464#5,3:103\n456#5,8:125\n464#5,3:139\n467#5,3:144\n467#5,3:149\n3737#6,6:97\n3737#6,6:133\n73#7,7:107\n80#7:142\n84#7:148\n*S KotlinDebug\n*F\n+ 1 GridItems.kt\ncom/yuanqi/master/main/GridItemsKt\n*L\n40#1:69\n41#1:70\n42#1:71\n44#1:72\n56#1:143\n38#1:73,5\n38#1:106\n38#1:153\n38#1:78,11\n50#1:114,11\n50#1:147\n38#1:152\n38#1:89,8\n38#1:103,3\n50#1:125,8\n50#1:139,3\n50#1:144,3\n38#1:149,3\n38#1:97,6\n50#1:133,6\n50#1:107,7\n50#1:142\n50#1:148\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lcom/yuanqi/group/home/models/c;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 30
    .param p0    # Lcom/yuanqi/group/home/models/c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "info"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "modifier"

    .line 11
    .line 12
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v0, 0xe14fff3

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p3

    .line 19
    .line 20
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v15

    .line 24
    and-int/lit8 v3, p5, 0x4

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move/from16 v28, v4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move/from16 v28, p2

    .line 37
    .line 38
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const/4 v3, -0x1

    .line 45
    const-string v6, "com.yuanqi.master.main.GridItems (GridItems.kt:31)"

    .line 46
    .line 47
    move/from16 v14, p4

    .line 48
    .line 49
    invoke-static {v0, v14, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move/from16 v14, p4

    .line 54
    .line 55
    :goto_1
    if-eqz v28, :cond_2

    .line 56
    .line 57
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlue-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static {}, Lcom/yuanqi/master/theme/b;->U()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    :goto_2
    const/4 v0, 0x5

    .line 69
    int-to-float v0, v0

    .line 70
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 75
    .line 76
    .line 77
    move-result-object v16

    .line 78
    const/4 v0, 0x1

    .line 79
    int-to-float v3, v0

    .line 80
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 81
    .line 82
    .line 83
    move-result v17

    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const/16 v19, 0x0

    .line 87
    .line 88
    const-wide/16 v20, 0x0

    .line 89
    .line 90
    const-wide/16 v22, 0x0

    .line 91
    .line 92
    const/16 v24, 0x1e

    .line 93
    .line 94
    const/16 v25, 0x0

    .line 95
    .line 96
    invoke-static/range {v16 .. v25}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 101
    .line 102
    double-to-float v8, v8

    .line 103
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-static {}, Landroidx/compose/ui/graphics/RectangleShapeKt;->getRectangleShape()Landroidx/compose/ui/graphics/Shape;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-static {v3, v8, v6, v7, v9}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 112
    .line 113
    .line 114
    move-result-object v16

    .line 115
    invoke-static {}, Lcom/yuanqi/master/theme/b;->U()J

    .line 116
    .line 117
    .line 118
    move-result-wide v17

    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    const/16 v20, 0x2

    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    const/16 v6, 0x14

    .line 130
    .line 131
    int-to-float v6, v6

    .line 132
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    invoke-static {v3, v8, v6, v0, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 143
    .line 144
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const v7, 0x2bb5b5d7

    .line 149
    .line 150
    .line 151
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 152
    .line 153
    .line 154
    const/4 v7, 0x6

    .line 155
    invoke-static {v6, v4, v15, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    const v7, -0x4ee9b9da

    .line 160
    .line 161
    .line 162
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v15, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 174
    .line 175
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 188
    .line 189
    if-nez v12, :cond_3

    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 192
    .line 193
    .line 194
    :cond_3
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 195
    .line 196
    .line 197
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-eqz v12, :cond_4

    .line 202
    .line 203
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_4
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 208
    .line 209
    .line 210
    :goto_3
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-static {v11, v6, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v11, v9, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    if-nez v9, :cond_5

    .line 237
    .line 238
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    invoke-static {v9, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    if-nez v9, :cond_6

    .line 251
    .line 252
    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-interface {v11, v8, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 264
    .line 265
    .line 266
    :cond_6
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-static {v6}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-interface {v0, v6, v15, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    const v0, 0x7ab4aae9

    .line 278
    .line 279
    .line 280
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 281
    .line 282
    .line 283
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 284
    .line 285
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    const v6, -0x1cd0f17e

    .line 290
    .line 291
    .line 292
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 293
    .line 294
    .line 295
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 296
    .line 297
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 298
    .line 299
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    const/16 v9, 0x30

    .line 304
    .line 305
    invoke-static {v8, v3, v15, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v15, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 333
    .line 334
    if-nez v11, :cond_7

    .line 335
    .line 336
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 337
    .line 338
    .line 339
    :cond_7
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 340
    .line 341
    .line 342
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-eqz v11, :cond_8

    .line 347
    .line 348
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 349
    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 353
    .line 354
    .line 355
    :goto_4
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    invoke-static {v8, v3, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-static {v8, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    if-nez v7, :cond_9

    .line 382
    .line 383
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 388
    .line 389
    .line 390
    move-result-object v10

    .line 391
    invoke-static {v7, v10}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-nez v7, :cond_a

    .line 396
    .line 397
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-interface {v8, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 409
    .line 410
    .line 411
    :cond_a
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-interface {v9, v3, v15, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 423
    .line 424
    .line 425
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 426
    .line 427
    new-instance v3, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 428
    .line 429
    iget-object v7, v1, Lcom/yuanqi/group/home/models/c;->d:Landroid/graphics/drawable/Drawable;

    .line 430
    .line 431
    invoke-static {v7}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    const/4 v8, 0x0

    .line 435
    const/4 v9, 0x0

    .line 436
    const/4 v10, 0x0

    .line 437
    const/4 v11, 0x7

    .line 438
    const/4 v12, 0x0

    .line 439
    invoke-static/range {v7 .. v12}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-static {v0}, Landroidx/compose/ui/graphics/AndroidImageBitmap_androidKt;->asImageBitmap(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;

    .line 444
    .line 445
    .line 446
    move-result-object v17

    .line 447
    const-wide/16 v18, 0x0

    .line 448
    .line 449
    const-wide/16 v20, 0x0

    .line 450
    .line 451
    const/16 v22, 0x6

    .line 452
    .line 453
    const/16 v23, 0x0

    .line 454
    .line 455
    move-object/from16 v16, v3

    .line 456
    .line 457
    invoke-direct/range {v16 .. v23}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Landroidx/compose/ui/graphics/ImageBitmap;JJILkotlin/jvm/internal/w;)V

    .line 458
    .line 459
    .line 460
    iget-object v0, v1, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    const/16 v0, 0x32

    .line 467
    .line 468
    int-to-float v0, v0

    .line 469
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    const/4 v6, 0x0

    .line 478
    const/4 v7, 0x0

    .line 479
    const/4 v8, 0x0

    .line 480
    const/4 v9, 0x0

    .line 481
    const/16 v11, 0x188

    .line 482
    .line 483
    const/16 v12, 0x78

    .line 484
    .line 485
    move-object v10, v15

    .line 486
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 487
    .line 488
    .line 489
    iget-object v0, v1, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 490
    .line 491
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    sget-object v0, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    .line 496
    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    .line 498
    .line 499
    .line 500
    move-result-wide v4

    .line 501
    const/high16 v0, 0x41400000    # 12.0f

    .line 502
    .line 503
    invoke-static {v0, v4, v5}, Landroidx/compose/ui/unit/TextUnitKt;->TextUnit-anM5pPY(FJ)J

    .line 504
    .line 505
    .line 506
    move-result-wide v7

    .line 507
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 508
    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 510
    .line 511
    .line 512
    move-result v18

    .line 513
    const/4 v4, 0x0

    .line 514
    const-wide/16 v5, 0x0

    .line 515
    .line 516
    const/4 v10, 0x0

    .line 517
    const/4 v11, 0x0

    .line 518
    const-wide/16 v12, 0x0

    .line 519
    .line 520
    const/4 v0, 0x0

    .line 521
    move-object v14, v0

    .line 522
    move-object/from16 v29, v15

    .line 523
    .line 524
    move-object v15, v0

    .line 525
    const-wide/16 v16, 0x0

    .line 526
    .line 527
    const/16 v19, 0x0

    .line 528
    .line 529
    const/16 v20, 0x1

    .line 530
    .line 531
    const/16 v21, 0x0

    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    const/16 v25, 0x0

    .line 536
    .line 537
    const/16 v26, 0xc30

    .line 538
    .line 539
    const v27, 0x1d7f6

    .line 540
    .line 541
    .line 542
    move-object/from16 v24, v29

    .line 543
    .line 544
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 545
    .line 546
    .line 547
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 548
    .line 549
    .line 550
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 551
    .line 552
    .line 553
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 554
    .line 555
    .line 556
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 557
    .line 558
    .line 559
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 560
    .line 561
    .line 562
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 563
    .line 564
    .line 565
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 566
    .line 567
    .line 568
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 569
    .line 570
    .line 571
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-eqz v0, :cond_b

    .line 576
    .line 577
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 578
    .line 579
    .line 580
    :cond_b
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    if-nez v6, :cond_c

    .line 585
    .line 586
    goto :goto_5

    .line 587
    :cond_c
    new-instance v7, Lcom/yuanqi/master/main/c$a;

    .line 588
    .line 589
    move-object v0, v7

    .line 590
    move-object/from16 v1, p0

    .line 591
    .line 592
    move-object/from16 v2, p1

    .line 593
    .line 594
    move/from16 v3, v28

    .line 595
    .line 596
    move/from16 v4, p4

    .line 597
    .line 598
    move/from16 v5, p5

    .line 599
    .line 600
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/main/c$a;-><init>(Lcom/yuanqi/group/home/models/c;Landroidx/compose/ui/Modifier;ZII)V

    .line 601
    .line 602
    .line 603
    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 604
    .line 605
    .line 606
    :goto_5
    return-void
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
