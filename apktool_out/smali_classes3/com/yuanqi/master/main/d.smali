.class public final Lcom/yuanqi/master/main/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LaunchItem",
        "",
        "info",
        "Lcom/yuanqi/group/home/models/AppData;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "mainViewModel",
        "Lcom/yuanqi/master/main/MainViewModel;",
        "(Lcom/yuanqi/group/home/models/AppData;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V",
        "MainScreen",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V",
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
        "SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,349:1\n81#2,11:350\n81#2,11:361\n154#3:372\n154#3:373\n154#3:374\n154#3:445\n154#3:446\n69#4,5:375\n74#4:408\n67#4,7:452\n74#4:487\n78#4:492\n78#4:497\n79#5,11:380\n79#5,11:416\n92#5:450\n79#5,11:459\n92#5:491\n92#5:496\n456#6,8:391\n464#6,3:405\n456#6,8:427\n464#6,3:441\n467#6,3:447\n456#6,8:470\n464#6,3:484\n467#6,3:488\n467#6,3:493\n3737#7,6:399\n3737#7,6:435\n3737#7,6:478\n73#8,7:409\n80#8:444\n84#8:451\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt\n*L\n66#1:350,11\n258#1:361,11\n264#1:372\n265#1:373\n267#1:374\n280#1:445\n281#1:446\n262#1:375,5\n262#1:408\n305#1:452,7\n305#1:487\n305#1:492\n262#1:497\n262#1:380,11\n271#1:416,11\n271#1:450\n305#1:459,11\n305#1:491\n262#1:496\n262#1:391,8\n262#1:405,3\n271#1:427,8\n271#1:441,3\n271#1:447,3\n305#1:470,8\n305#1:484,3\n305#1:488,3\n262#1:493,3\n262#1:399,6\n271#1:435,6\n305#1:478,6\n271#1:409,7\n271#1:444\n271#1:451\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lcom/yuanqi/group/home/models/b;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0    # Lcom/yuanqi/group/home/models/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lcom/yuanqi/master/main/MainViewModel;
        .annotation build Lp4/m;
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
    const v0, -0x549f4923

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
    const/4 v11, 0x6

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const v3, 0x671a9c9b

    .line 34
    .line 35
    .line 36
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 37
    .line 38
    .line 39
    sget-object v3, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 40
    .line 41
    invoke-virtual {v3, v15, v11}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    instance-of v3, v4, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    move-object v3, v4

    .line 53
    check-cast v3, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 54
    .line 55
    invoke-interface {v3}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    sget-object v3, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 61
    .line 62
    :goto_0
    move-object v7, v3

    .line 63
    const-class v3, Lcom/yuanqi/master/main/MainViewModel;

    .line 64
    .line 65
    const v9, 0x9048

    .line 66
    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v8, v15

    .line 70
    invoke-static/range {v3 .. v10}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 75
    .line 76
    .line 77
    check-cast v3, Lcom/yuanqi/master/main/MainViewModel;

    .line 78
    .line 79
    move-object v14, v3

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_2
    move-object/from16 v14, p2

    .line 94
    .line 95
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_3

    .line 100
    .line 101
    const/4 v3, -0x1

    .line 102
    const-string v4, "com.yuanqi.master.main.LaunchItem (MainScreen.kt:260)"

    .line 103
    .line 104
    move/from16 v13, p4

    .line 105
    .line 106
    invoke-static {v0, v13, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    move/from16 v13, p4

    .line 111
    .line 112
    :goto_2
    const/4 v0, 0x5

    .line 113
    int-to-float v0, v0

    .line 114
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    const/4 v0, 0x1

    .line 123
    int-to-float v3, v0

    .line 124
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 125
    .line 126
    .line 127
    move-result v17

    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    const-wide/16 v20, 0x0

    .line 133
    .line 134
    const-wide/16 v22, 0x0

    .line 135
    .line 136
    const/16 v24, 0x1e

    .line 137
    .line 138
    const/16 v25, 0x0

    .line 139
    .line 140
    invoke-static/range {v16 .. v25}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {}, Lcom/yuanqi/master/theme/b;->U()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x2

    .line 150
    const/4 v8, 0x0

    .line 151
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    const/16 v4, 0x78

    .line 156
    .line 157
    int-to-float v4, v4

    .line 158
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 167
    .line 168
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    const v12, 0x2bb5b5d7

    .line 173
    .line 174
    .line 175
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 176
    .line 177
    .line 178
    const/4 v10, 0x0

    .line 179
    invoke-static {v5, v10, v15, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const v11, -0x4ee9b9da

    .line 184
    .line 185
    .line 186
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v15, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 198
    .line 199
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 212
    .line 213
    if-nez v12, :cond_4

    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 216
    .line 217
    .line 218
    :cond_4
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-eqz v12, :cond_5

    .line 226
    .line 227
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 232
    .line 233
    .line 234
    :goto_3
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-static {v9, v5, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-static {v9, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-nez v7, :cond_6

    .line 261
    .line 262
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    invoke-static {v7, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-nez v7, :cond_7

    .line 275
    .line 276
    :cond_6
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-interface {v9, v6, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 288
    .line 289
    .line 290
    :cond_7
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-interface {v3, v5, v15, v6}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const v12, 0x7ab4aae9

    .line 306
    .line 307
    .line 308
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 309
    .line 310
    .line 311
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 312
    .line 313
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    const v4, -0x1cd0f17e

    .line 318
    .line 319
    .line 320
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 321
    .line 322
    .line 323
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 324
    .line 325
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 326
    .line 327
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    const/16 v6, 0x30

    .line 332
    .line 333
    invoke-static {v5, v3, v15, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 338
    .line 339
    .line 340
    invoke-static {v15, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 357
    .line 358
    .line 359
    move-result-object v11

    .line 360
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 361
    .line 362
    if-nez v11, :cond_8

    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 365
    .line 366
    .line 367
    :cond_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 368
    .line 369
    .line 370
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    if-eqz v11, :cond_9

    .line 375
    .line 376
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 381
    .line 382
    .line 383
    :goto_4
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 388
    .line 389
    .line 390
    move-result-object v11

    .line 391
    invoke-static {v7, v3, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-static {v7, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    if-nez v6, :cond_a

    .line 410
    .line 411
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-nez v6, :cond_b

    .line 424
    .line 425
    :cond_a
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-interface {v7, v5, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 437
    .line 438
    .line 439
    :cond_b
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    invoke-interface {v9, v3, v15, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 455
    .line 456
    .line 457
    sget-object v28, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 458
    .line 459
    new-instance v3, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    .line 460
    .line 461
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 462
    .line 463
    .line 464
    move-result-object v16

    .line 465
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/16 v18, 0x0

    .line 471
    .line 472
    const/16 v19, 0x0

    .line 473
    .line 474
    const/16 v20, 0x7

    .line 475
    .line 476
    const/16 v21, 0x0

    .line 477
    .line 478
    invoke-static/range {v16 .. v21}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-static {v5}, Landroidx/compose/ui/graphics/AndroidImageBitmap_androidKt;->asImageBitmap(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;

    .line 483
    .line 484
    .line 485
    move-result-object v17

    .line 486
    const-wide/16 v18, 0x0

    .line 487
    .line 488
    const-wide/16 v20, 0x0

    .line 489
    .line 490
    const/16 v22, 0x6

    .line 491
    .line 492
    const/16 v23, 0x0

    .line 493
    .line 494
    move-object/from16 v16, v3

    .line 495
    .line 496
    invoke-direct/range {v16 .. v23}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Landroidx/compose/ui/graphics/ImageBitmap;JJILkotlin/jvm/internal/w;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getName()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    const/16 v6, 0x28

    .line 508
    .line 509
    int-to-float v6, v6

    .line 510
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 511
    .line 512
    .line 513
    move-result v6

    .line 514
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 515
    .line 516
    .line 517
    move-result-object v16

    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/16 v18, 0x0

    .line 521
    .line 522
    const/16 v19, 0x0

    .line 523
    .line 524
    const/16 v4, 0x8

    .line 525
    .line 526
    int-to-float v4, v4

    .line 527
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 528
    .line 529
    .line 530
    move-result v20

    .line 531
    const/16 v21, 0x7

    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    const/4 v7, 0x0

    .line 540
    const/4 v8, 0x0

    .line 541
    const/4 v9, 0x0

    .line 542
    const/4 v11, 0x0

    .line 543
    const/16 v16, 0x188

    .line 544
    .line 545
    const/16 v17, 0x78

    .line 546
    .line 547
    move-object v4, v5

    .line 548
    move-object v5, v6

    .line 549
    move-object v6, v7

    .line 550
    move-object v7, v8

    .line 551
    move v8, v9

    .line 552
    move-object v9, v11

    .line 553
    move v11, v10

    .line 554
    move-object v10, v15

    .line 555
    move/from16 v11, v16

    .line 556
    .line 557
    move/from16 v12, v17

    .line 558
    .line 559
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    add-int/2addr v3, v0

    .line 567
    new-instance v4, Ljava/lang/StringBuilder;

    .line 568
    .line 569
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getName()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const/16 v5, 0x5f

    .line 580
    .line 581
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    sget-object v4, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    .line 592
    .line 593
    invoke-virtual {v4}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    .line 594
    .line 595
    .line 596
    move-result-wide v4

    .line 597
    const/high16 v6, 0x41200000    # 10.0f

    .line 598
    .line 599
    invoke-static {v6, v4, v5}, Landroidx/compose/ui/unit/TextUnitKt;->TextUnit-anM5pPY(FJ)J

    .line 600
    .line 601
    .line 602
    move-result-wide v7

    .line 603
    sget-object v4, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 604
    .line 605
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 606
    .line 607
    .line 608
    move-result v18

    .line 609
    sget-object v4, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 610
    .line 611
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 612
    .line 613
    .line 614
    move-result v16

    .line 615
    const/4 v4, 0x0

    .line 616
    const-wide/16 v5, 0x0

    .line 617
    .line 618
    const/4 v9, 0x0

    .line 619
    const/4 v10, 0x0

    .line 620
    const/4 v11, 0x0

    .line 621
    const-wide/16 v19, 0x0

    .line 622
    .line 623
    move-wide/from16 v12, v19

    .line 624
    .line 625
    const/16 v17, 0x0

    .line 626
    .line 627
    move-object/from16 p2, v14

    .line 628
    .line 629
    move-object/from16 v14, v17

    .line 630
    .line 631
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 632
    .line 633
    .line 634
    move-result-object v16

    .line 635
    move-object/from16 p3, v15

    .line 636
    .line 637
    move-object/from16 v15, v16

    .line 638
    .line 639
    const-wide/16 v16, 0x0

    .line 640
    .line 641
    const/16 v19, 0x0

    .line 642
    .line 643
    const/16 v20, 0x1

    .line 644
    .line 645
    const/16 v21, 0x0

    .line 646
    .line 647
    const/16 v25, 0x0

    .line 648
    .line 649
    const/16 v26, 0xc30

    .line 650
    .line 651
    const v27, 0x1d5f6

    .line 652
    .line 653
    .line 654
    move-object/from16 v24, p3

    .line 655
    .line 656
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {p2 .. p2}, Lcom/yuanqi/master/main/MainViewModel;->I()Landroidx/lifecycle/MutableLiveData;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    check-cast v3, Ljava/util/List;

    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    if-eqz v3, :cond_f

    .line 671
    .line 672
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    check-cast v3, Ljava/lang/Iterable;

    .line 676
    .line 677
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    if-eqz v4, :cond_e

    .line 686
    .line 687
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    move-object v5, v4

    .line 692
    check-cast v5, Lv2/b;

    .line 693
    .line 694
    invoke-virtual {v5}, Lv2/b;->getUserId()I

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    .line 699
    .line 700
    .line 701
    move-result v7

    .line 702
    if-ne v6, v7, :cond_d

    .line 703
    .line 704
    invoke-virtual {v5}, Lv2/b;->getPackageName()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getPackageName()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eqz v5, :cond_d

    .line 717
    .line 718
    move v10, v0

    .line 719
    goto :goto_5

    .line 720
    :cond_d
    const/4 v10, 0x0

    .line 721
    :goto_5
    if-eqz v10, :cond_c

    .line 722
    .line 723
    goto :goto_6

    .line 724
    :cond_e
    move-object v4, v13

    .line 725
    :goto_6
    check-cast v4, Lv2/b;

    .line 726
    .line 727
    goto :goto_7

    .line 728
    :cond_f
    move-object v4, v13

    .line 729
    :goto_7
    if-eqz v4, :cond_10

    .line 730
    .line 731
    move v5, v0

    .line 732
    goto :goto_8

    .line 733
    :cond_10
    const/4 v5, 0x0

    .line 734
    :goto_8
    const/4 v6, 0x0

    .line 735
    const/4 v7, 0x0

    .line 736
    const/4 v8, 0x0

    .line 737
    const/4 v9, 0x0

    .line 738
    new-instance v3, Lcom/yuanqi/master/main/d$a;

    .line 739
    .line 740
    invoke-direct {v3, v4}, Lcom/yuanqi/master/main/d$a;-><init>(Lv2/b;)V

    .line 741
    .line 742
    .line 743
    const v4, 0x5a775189

    .line 744
    .line 745
    .line 746
    move-object/from16 v14, p3

    .line 747
    .line 748
    invoke-static {v14, v4, v0, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    const v11, 0x180006

    .line 753
    .line 754
    .line 755
    const/16 v12, 0x1e

    .line 756
    .line 757
    move-object/from16 v3, v28

    .line 758
    .line 759
    move v4, v5

    .line 760
    move-object v5, v6

    .line 761
    move-object v6, v7

    .line 762
    move-object v7, v8

    .line 763
    move-object v8, v9

    .line 764
    move-object v9, v10

    .line 765
    move-object v10, v14

    .line 766
    invoke-static/range {v3 .. v12}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 767
    .line 768
    .line 769
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 770
    .line 771
    .line 772
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 773
    .line 774
    .line 775
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 776
    .line 777
    .line 778
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 779
    .line 780
    .line 781
    const v3, -0x62287a51

    .line 782
    .line 783
    .line 784
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {p2 .. p2}, Lcom/yuanqi/master/main/MainViewModel;->Q()Landroidx/compose/runtime/MutableState;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    check-cast v3, Ljava/lang/Boolean;

    .line 796
    .line 797
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    if-eqz v3, :cond_17

    .line 802
    .line 803
    invoke-virtual/range {p2 .. p2}, Lcom/yuanqi/master/main/MainViewModel;->L()Landroidx/compose/runtime/MutableState;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    check-cast v3, Lcom/yuanqi/group/home/models/b;

    .line 812
    .line 813
    if-eqz v3, :cond_11

    .line 814
    .line 815
    invoke-virtual {v3}, Lcom/yuanqi/group/home/models/b;->getPackageName()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v13

    .line 819
    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getPackageName()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    invoke-static {v13, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-eqz v3, :cond_17

    .line 828
    .line 829
    invoke-virtual/range {p2 .. p2}, Lcom/yuanqi/master/main/MainViewModel;->L()Landroidx/compose/runtime/MutableState;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    check-cast v3, Lcom/yuanqi/group/home/models/b;

    .line 838
    .line 839
    if-eqz v3, :cond_12

    .line 840
    .line 841
    invoke-virtual {v3}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    .line 842
    .line 843
    .line 844
    move-result v3

    .line 845
    invoke-virtual/range {p0 .. p0}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    .line 846
    .line 847
    .line 848
    move-result v4

    .line 849
    if-ne v3, v4, :cond_12

    .line 850
    .line 851
    move v10, v0

    .line 852
    goto :goto_9

    .line 853
    :cond_12
    const/4 v10, 0x0

    .line 854
    :goto_9
    if-eqz v10, :cond_17

    .line 855
    .line 856
    const v3, 0x2bb5b5d7

    .line 857
    .line 858
    .line 859
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 860
    .line 861
    .line 862
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 863
    .line 864
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 865
    .line 866
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    const/4 v5, 0x0

    .line 871
    invoke-static {v4, v5, v14, v5}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    const v6, -0x4ee9b9da

    .line 876
    .line 877
    .line 878
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 879
    .line 880
    .line 881
    invoke-static {v14, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 882
    .line 883
    .line 884
    move-result v6

    .line 885
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 890
    .line 891
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 900
    .line 901
    .line 902
    move-result-object v10

    .line 903
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 904
    .line 905
    if-nez v10, :cond_13

    .line 906
    .line 907
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 908
    .line 909
    .line 910
    :cond_13
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 911
    .line 912
    .line 913
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 914
    .line 915
    .line 916
    move-result v10

    .line 917
    if-eqz v10, :cond_14

    .line 918
    .line 919
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 920
    .line 921
    .line 922
    goto :goto_a

    .line 923
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 924
    .line 925
    .line 926
    :goto_a
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 931
    .line 932
    .line 933
    move-result-object v10

    .line 934
    invoke-static {v9, v4, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    invoke-static {v9, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 949
    .line 950
    .line 951
    move-result v7

    .line 952
    if-nez v7, :cond_15

    .line 953
    .line 954
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 959
    .line 960
    .line 961
    move-result-object v8

    .line 962
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v7

    .line 966
    if-nez v7, :cond_16

    .line 967
    .line 968
    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 969
    .line 970
    .line 971
    move-result-object v7

    .line 972
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 976
    .line 977
    .line 978
    move-result-object v6

    .line 979
    invoke-interface {v9, v6, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 980
    .line 981
    .line 982
    :cond_16
    invoke-static {v14}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 983
    .line 984
    .line 985
    move-result-object v4

    .line 986
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 987
    .line 988
    .line 989
    move-result-object v4

    .line 990
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 991
    .line 992
    .line 993
    move-result-object v5

    .line 994
    invoke-interface {v3, v4, v14, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    const v3, 0x7ab4aae9

    .line 998
    .line 999
    .line 1000
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1004
    .line 1005
    const/4 v3, 0x1

    .line 1006
    new-instance v4, Lcom/yuanqi/master/main/d$b;

    .line 1007
    .line 1008
    move-object/from16 v15, p2

    .line 1009
    .line 1010
    invoke-direct {v4, v15}, Lcom/yuanqi/master/main/d$b;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    .line 1011
    .line 1012
    .line 1013
    const/4 v5, 0x0

    .line 1014
    const-wide/16 v6, 0x0

    .line 1015
    .line 1016
    const/4 v8, 0x0

    .line 1017
    const/4 v9, 0x0

    .line 1018
    new-instance v10, Lcom/yuanqi/master/main/d$c;

    .line 1019
    .line 1020
    invoke-direct {v10, v15, v1}, Lcom/yuanqi/master/main/d$c;-><init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;)V

    .line 1021
    .line 1022
    .line 1023
    const v11, 0x6322543

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v14, v11, v0, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v10

    .line 1030
    const v12, 0x180006

    .line 1031
    .line 1032
    .line 1033
    const/16 v13, 0x3c

    .line 1034
    .line 1035
    move-object v11, v14

    .line 1036
    invoke-static/range {v3 .. v13}, Landroidx/compose/material3/AndroidMenu_androidKt;->DropdownMenu-4kj-_NE(ZLv3/a;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 1037
    .line 1038
    .line 1039
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1040
    .line 1041
    .line 1042
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1043
    .line 1044
    .line 1045
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1046
    .line 1047
    .line 1048
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1049
    .line 1050
    .line 1051
    goto :goto_b

    .line 1052
    :cond_17
    move-object/from16 v15, p2

    .line 1053
    .line 1054
    :goto_b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1055
    .line 1056
    .line 1057
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1058
    .line 1059
    .line 1060
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1064
    .line 1065
    .line 1066
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v0

    .line 1073
    if-eqz v0, :cond_18

    .line 1074
    .line 1075
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1076
    .line 1077
    .line 1078
    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v6

    .line 1082
    if-nez v6, :cond_19

    .line 1083
    .line 1084
    goto :goto_c

    .line 1085
    :cond_19
    new-instance v7, Lcom/yuanqi/master/main/d$d;

    .line 1086
    .line 1087
    move-object v0, v7

    .line 1088
    move-object/from16 v1, p0

    .line 1089
    .line 1090
    move-object/from16 v2, p1

    .line 1091
    .line 1092
    move-object v3, v15

    .line 1093
    move/from16 v4, p4

    .line 1094
    .line 1095
    move/from16 v5, p5

    .line 1096
    .line 1097
    invoke-direct/range {v0 .. v5}, Lcom/yuanqi/master/main/d$d;-><init>(Lcom/yuanqi/group/home/models/b;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;II)V

    .line 1098
    .line 1099
    .line 1100
    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 1101
    .line 1102
    .line 1103
    :goto_c
    return-void
.end method

.method public static final b(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0    # Landroidx/navigation/NavHostController;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lcom/yuanqi/master/main/MainViewModel;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnusedMaterial3ScaffoldPaddingParameter"
        }
    .end annotation

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
    const v3, -0x1a05b029

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
    move-object/from16 v20, v15

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
    const-class v4, Lcom/yuanqi/master/main/MainViewModel;

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
    check-cast v4, Lcom/yuanqi/master/main/MainViewModel;

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
    const-string v5, "com.yuanqi.master.main.MainScreen (MainScreen.kt:68)"

    .line 154
    .line 155
    invoke-static {v3, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_8
    const/4 v4, 0x0

    .line 159
    new-instance v3, Lcom/yuanqi/master/main/d$e;

    .line 160
    .line 161
    invoke-direct {v3, v14}, Lcom/yuanqi/master/main/d$e;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    .line 162
    .line 163
    .line 164
    const v5, -0x1774b65

    .line 165
    .line 166
    .line 167
    const/4 v6, 0x1

    .line 168
    invoke-static {v15, v5, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    const/4 v3, 0x0

    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    const/4 v9, 0x0

    .line 176
    const-wide/16 v10, 0x0

    .line 177
    .line 178
    const/16 v16, 0x0

    .line 179
    .line 180
    new-instance v12, Lcom/yuanqi/master/main/d$f;

    .line 181
    .line 182
    invoke-direct {v12, v14}, Lcom/yuanqi/master/main/d$f;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    .line 183
    .line 184
    .line 185
    const v13, 0x7ea97f66

    .line 186
    .line 187
    .line 188
    invoke-static {v15, v13, v6, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 189
    .line 190
    .line 191
    move-result-object v17

    .line 192
    const v18, 0x30000030

    .line 193
    .line 194
    .line 195
    const/16 v19, 0x1fd

    .line 196
    .line 197
    move-object v6, v3

    .line 198
    const-wide/16 v12, 0x0

    .line 199
    .line 200
    move-object v3, v14

    .line 201
    move-object/from16 v14, v16

    .line 202
    .line 203
    move-object/from16 v20, v15

    .line 204
    .line 205
    move-object/from16 v15, v17

    .line 206
    .line 207
    move-object/from16 v16, v20

    .line 208
    .line 209
    move/from16 v17, v18

    .line 210
    .line 211
    move/from16 v18, v19

    .line 212
    .line 213
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 214
    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 223
    .line 224
    .line 225
    :cond_9
    :goto_6
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-nez v4, :cond_a

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_a
    new-instance v5, Lcom/yuanqi/master/main/d$g;

    .line 233
    .line 234
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/main/d$g;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/main/MainViewModel;II)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 238
    .line 239
    .line 240
    :goto_7
    return-void
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
