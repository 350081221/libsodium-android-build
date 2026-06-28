.class public final Lcom/yuanqi/master/mine/account/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LoginScreen",
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
        "SMAP\nLoginScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n81#2,11:251\n74#3:262\n74#3:326\n25#4:263\n25#4:270\n25#4:277\n25#4:284\n25#4:291\n25#4:298\n25#4:305\n25#4:312\n25#4:319\n36#4:327\n36#4:334\n1116#5,6:264\n1116#5,6:271\n1116#5,6:278\n1116#5,6:285\n1116#5,6:292\n1116#5,6:299\n1116#5,6:306\n1116#5,6:313\n1116#5,6:320\n1116#5,6:328\n1116#5,6:335\n*S KotlinDebug\n*F\n+ 1 LoginScreen.kt\ncom/yuanqi/master/mine/account/LoginScreenKt\n*L\n68#1:251,11\n71#1:262\n105#1:326\n73#1:263\n77#1:270\n81#1:277\n85#1:284\n89#1:291\n93#1:298\n97#1:305\n102#1:312\n103#1:319\n244#1:327\n246#1:334\n73#1:264,6\n77#1:271,6\n81#1:278,6\n85#1:285,6\n89#1:292,6\n93#1:299,6\n97#1:306,6\n102#1:313,6\n103#1:320,6\n244#1:328,6\n246#1:335,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 55
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
    const v3, 0x1efa3e10

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
    move-object v5, v15

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_2
    :goto_1
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 56
    .line 57
    .line 58
    and-int/lit8 v5, v1, 0x1

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    :goto_2
    if-eqz v4, :cond_7

    .line 74
    .line 75
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const v4, 0x671a9c9b

    .line 80
    .line 81
    .line 82
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 83
    .line 84
    .line 85
    sget-object v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 86
    .line 87
    const/4 v5, 0x6

    .line 88
    invoke-virtual {v4, v15, v5}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    instance-of v4, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    move-object v4, v5

    .line 100
    check-cast v4, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 101
    .line 102
    invoke-interface {v4}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    sget-object v4, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 108
    .line 109
    :goto_3
    move-object v8, v4

    .line 110
    const-class v4, Lcom/yuanqi/master/mine/MineViewModel;

    .line 111
    .line 112
    const v10, 0x9048

    .line 113
    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    move-object v9, v15

    .line 117
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 122
    .line 123
    .line 124
    check-cast v4, Lcom/yuanqi/master/mine/MineViewModel;

    .line 125
    .line 126
    move-object/from16 v19, v4

    .line 127
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
    move-object/from16 v19, p1

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
    const-string v5, "com.yuanqi.master.mine.account.LoginScreen (LoginScreen.kt:68)"

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
    move-object v14, v3

    .line 167
    check-cast v14, Landroid/content/Context;

    .line 168
    .line 169
    const v3, -0x1d58f75c

    .line 170
    .line 171
    .line 172
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    const-string v6, ""

    .line 186
    .line 187
    const/4 v7, 0x0

    .line 188
    const/4 v8, 0x2

    .line 189
    if-ne v4, v5, :cond_9

    .line 190
    .line 191
    invoke-static {v6, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 199
    .line 200
    .line 201
    move-object v5, v4

    .line 202
    check-cast v5, Landroidx/compose/runtime/MutableState;

    .line 203
    .line 204
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    if-ne v4, v9, :cond_a

    .line 216
    .line 217
    invoke-static {v6, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 225
    .line 226
    .line 227
    move-object v9, v4

    .line 228
    check-cast v9, Landroidx/compose/runtime/MutableState;

    .line 229
    .line 230
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    if-ne v4, v10, :cond_b

    .line 242
    .line 243
    const/16 v4, 0x3c

    .line 244
    .line 245
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-static {v4, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 257
    .line 258
    .line 259
    move-object v10, v4

    .line 260
    check-cast v10, Landroidx/compose/runtime/MutableState;

    .line 261
    .line 262
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    if-ne v4, v11, :cond_c

    .line 274
    .line 275
    invoke-static {v6, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 283
    .line 284
    .line 285
    move-object v11, v4

    .line 286
    check-cast v11, Landroidx/compose/runtime/MutableState;

    .line 287
    .line 288
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    if-ne v4, v12, :cond_d

    .line 300
    .line 301
    invoke-static {v6, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 309
    .line 310
    .line 311
    check-cast v4, Landroidx/compose/runtime/MutableState;

    .line 312
    .line 313
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    if-ne v4, v6, :cond_e

    .line 325
    .line 326
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-static {v4, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 336
    .line 337
    .line 338
    move-object v13, v4

    .line 339
    check-cast v13, Landroidx/compose/runtime/MutableState;

    .line 340
    .line 341
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    if-ne v4, v6, :cond_f

    .line 353
    .line 354
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 355
    .line 356
    invoke-static {v4, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_f
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 364
    .line 365
    .line 366
    move-object v12, v4

    .line 367
    check-cast v12, Landroidx/compose/runtime/MutableState;

    .line 368
    .line 369
    new-instance v4, Landroidx/compose/ui/text/TextStyle;

    .line 370
    .line 371
    move-object/from16 v21, v4

    .line 372
    .line 373
    const-wide/16 v22, 0x0

    .line 374
    .line 375
    const/16 v6, 0xe

    .line 376
    .line 377
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v24

    .line 381
    const/16 v26, 0x0

    .line 382
    .line 383
    const/16 v27, 0x0

    .line 384
    .line 385
    const/16 v28, 0x0

    .line 386
    .line 387
    const/16 v29, 0x0

    .line 388
    .line 389
    const/16 v30, 0x0

    .line 390
    .line 391
    const-wide/16 v31, 0x0

    .line 392
    .line 393
    const/16 v33, 0x0

    .line 394
    .line 395
    const/16 v34, 0x0

    .line 396
    .line 397
    const/16 v35, 0x0

    .line 398
    .line 399
    const-wide/16 v36, 0x0

    .line 400
    .line 401
    const/16 v38, 0x0

    .line 402
    .line 403
    const/16 v39, 0x0

    .line 404
    .line 405
    const/16 v40, 0x0

    .line 406
    .line 407
    const/16 v41, 0x0

    .line 408
    .line 409
    const/16 v42, 0x0

    .line 410
    .line 411
    const-wide/16 v43, 0x0

    .line 412
    .line 413
    const/16 v45, 0x0

    .line 414
    .line 415
    const/16 v46, 0x0

    .line 416
    .line 417
    const/16 v47, 0x0

    .line 418
    .line 419
    const/16 v48, 0x0

    .line 420
    .line 421
    const/16 v49, 0x0

    .line 422
    .line 423
    const/16 v50, 0x0

    .line 424
    .line 425
    const v51, 0xfffffd

    .line 426
    .line 427
    .line 428
    const/16 v52, 0x0

    .line 429
    .line 430
    invoke-direct/range {v21 .. v52}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/w;)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    if-ne v6, v3, :cond_10

    .line 445
    .line 446
    invoke-static {v4, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 454
    .line 455
    .line 456
    check-cast v6, Landroidx/compose/runtime/MutableState;

    .line 457
    .line 458
    const v3, -0x1d58f75c

    .line 459
    .line 460
    .line 461
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    if-ne v3, v4, :cond_11

    .line 473
    .line 474
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-static {v3, v7, v8, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :cond_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 484
    .line 485
    .line 486
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 487
    .line 488
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalSoftwareKeyboardController()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    move-object v4, v3

    .line 497
    check-cast v4, Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 498
    .line 499
    const/16 v16, 0x0

    .line 500
    .line 501
    sget-object v3, Lcom/yuanqi/master/mine/account/f;->a:Lcom/yuanqi/master/mine/account/f;

    .line 502
    .line 503
    invoke-virtual {v3}, Lcom/yuanqi/master/mine/account/f;->a()Lv3/p;

    .line 504
    .line 505
    .line 506
    move-result-object v17

    .line 507
    const/16 v18, 0x0

    .line 508
    .line 509
    const/16 v21, 0x0

    .line 510
    .line 511
    const/16 v22, 0x0

    .line 512
    .line 513
    const/16 v23, 0x0

    .line 514
    .line 515
    const-wide/16 v24, 0x0

    .line 516
    .line 517
    const-wide/16 v26, 0x0

    .line 518
    .line 519
    const/16 v28, 0x0

    .line 520
    .line 521
    new-instance v8, Lcom/yuanqi/master/mine/account/i$a;

    .line 522
    .line 523
    move-object v3, v8

    .line 524
    move-object/from16 v6, v19

    .line 525
    .line 526
    move-object v7, v11

    .line 527
    move-object v11, v8

    .line 528
    move-object v8, v9

    .line 529
    move-object v9, v10

    .line 530
    move-object v10, v13

    .line 531
    move-object/from16 p1, v13

    .line 532
    .line 533
    move-object v13, v11

    .line 534
    move-object v11, v14

    .line 535
    move-object/from16 p2, v12

    .line 536
    .line 537
    invoke-direct/range {v3 .. v12}, Lcom/yuanqi/master/mine/account/i$a;-><init>(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V

    .line 538
    .line 539
    .line 540
    const v3, 0x117a86df

    .line 541
    .line 542
    .line 543
    const/4 v4, 0x1

    .line 544
    invoke-static {v15, v3, v4, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    const v29, 0x30000030

    .line 549
    .line 550
    .line 551
    const/16 v30, 0x1fd

    .line 552
    .line 553
    move-object/from16 v4, v16

    .line 554
    .line 555
    move-object/from16 v5, v17

    .line 556
    .line 557
    move-object/from16 v6, v18

    .line 558
    .line 559
    move-object/from16 v7, v21

    .line 560
    .line 561
    move-object/from16 v8, v22

    .line 562
    .line 563
    move/from16 v9, v23

    .line 564
    .line 565
    move-wide/from16 v10, v24

    .line 566
    .line 567
    move-object/from16 v53, p1

    .line 568
    .line 569
    move-wide/from16 v12, v26

    .line 570
    .line 571
    move-object/from16 v54, v14

    .line 572
    .line 573
    move-object/from16 v14, v28

    .line 574
    .line 575
    move-object/from16 p1, v15

    .line 576
    .line 577
    move-object v15, v3

    .line 578
    move-object/from16 v16, p1

    .line 579
    .line 580
    move/from16 v17, v29

    .line 581
    .line 582
    move/from16 v18, v30

    .line 583
    .line 584
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 585
    .line 586
    .line 587
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    check-cast v3, Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    if-eqz v3, :cond_16

    .line 598
    .line 599
    sget-object v3, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 600
    .line 601
    const v4, 0x44faf204

    .line 602
    .line 603
    .line 604
    move-object/from16 v5, p1

    .line 605
    .line 606
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 607
    .line 608
    .line 609
    move-object/from16 v6, p2

    .line 610
    .line 611
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    if-nez v7, :cond_12

    .line 620
    .line 621
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v7

    .line 625
    if-ne v8, v7, :cond_13

    .line 626
    .line 627
    :cond_12
    new-instance v8, Lcom/yuanqi/master/mine/account/i$b;

    .line 628
    .line 629
    invoke-direct {v8, v6}, Lcom/yuanqi/master/mine/account/i$b;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 636
    .line 637
    .line 638
    check-cast v8, Lv3/a;

    .line 639
    .line 640
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 641
    .line 642
    .line 643
    move-object/from16 v4, v53

    .line 644
    .line 645
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    if-nez v6, :cond_14

    .line 654
    .line 655
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v6

    .line 659
    if-ne v7, v6, :cond_15

    .line 660
    .line 661
    :cond_14
    new-instance v7, Lcom/yuanqi/master/mine/account/i$c;

    .line 662
    .line 663
    invoke-direct {v7, v4}, Lcom/yuanqi/master/mine/account/i$c;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 664
    .line 665
    .line 666
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    :cond_15
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 670
    .line 671
    .line 672
    check-cast v7, Lv3/a;

    .line 673
    .line 674
    move-object/from16 v4, v54

    .line 675
    .line 676
    invoke-virtual {v3, v4, v8, v7}, Lcom/yuanqi/master/tools/o0;->r0(Landroid/content/Context;Lv3/a;Lv3/a;)V

    .line 677
    .line 678
    .line 679
    goto :goto_6

    .line 680
    :cond_16
    move-object/from16 v5, p1

    .line 681
    .line 682
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    if-eqz v3, :cond_17

    .line 687
    .line 688
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 689
    .line 690
    .line 691
    :cond_17
    move-object/from16 v3, v19

    .line 692
    .line 693
    :goto_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    if-nez v4, :cond_18

    .line 698
    .line 699
    goto :goto_8

    .line 700
    :cond_18
    new-instance v5, Lcom/yuanqi/master/mine/account/i$d;

    .line 701
    .line 702
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/mine/account/i$d;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;II)V

    .line 703
    .line 704
    .line 705
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 706
    .line 707
    .line 708
    :goto_8
    return-void
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
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
.end method
