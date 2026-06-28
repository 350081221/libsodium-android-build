.class public final Lcom/yuanqi/master/addapp/home/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r\u00b2\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002"
    }
    d2 = {
        "DataManagerScreen",
        "",
        "navController",
        "Landroidx/navigation/NavController;",
        "addAppViewModel",
        "Lcom/yuanqi/master/addapp/AddAppViewModel;",
        "(Landroidx/navigation/NavController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V",
        "TextWithBlueBorder",
        "text",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "app_release",
        "storagePermissionState",
        "",
        "allFilesAccessPermissionState"
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
        "SMAP\nDataManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n81#2,11:193\n74#3:204\n25#4:205\n25#4:212\n36#4:219\n36#4:226\n456#4,8:252\n464#4,3:266\n467#4,3:271\n1116#5,6:206\n1116#5,6:213\n1116#5,6:220\n1116#5,6:227\n154#6:233\n154#6:234\n154#6:235\n154#6:270\n69#7,5:236\n74#7:269\n78#7:275\n79#8,11:241\n92#8:274\n3737#9,6:260\n81#10:276\n107#10,2:277\n81#10:279\n107#10,2:280\n*S KotlinDebug\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt\n*L\n57#1:193,11\n61#1:204\n64#1:205\n67#1:212\n72#1:219\n80#1:226\n177#1:252,8\n177#1:266,3\n177#1:271,3\n64#1:206,6\n67#1:213,6\n72#1:220,6\n80#1:227,6\n179#1:233\n180#1:234\n181#1:235\n189#1:270\n177#1:236,5\n177#1:269\n177#1:275\n177#1:241,11\n177#1:274\n177#1:260,6\n64#1:276\n64#1:277,2\n67#1:279\n67#1:280,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroidx/navigation/NavController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0    # Landroidx/navigation/NavController;
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
    const v3, 0x60c1ecb8

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
    const-string v5, "com.yuanqi.master.addapp.home.DataManagerScreen (DataManagerScreen.kt:59)"

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
    const v4, -0x1d58f75c

    .line 169
    .line 170
    .line 171
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 179
    .line 180
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    const/4 v8, 0x0

    .line 185
    const/4 v9, 0x2

    .line 186
    if-ne v5, v7, :cond_9

    .line 187
    .line 188
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-static {v5, v8, v9, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 198
    .line 199
    .line 200
    check-cast v5, Landroidx/compose/runtime/MutableState;

    .line 201
    .line 202
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    if-ne v4, v7, :cond_a

    .line 214
    .line 215
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-static {v4, v8, v9, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

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
    check-cast v4, Landroidx/compose/runtime/MutableState;

    .line 228
    .line 229
    new-instance v7, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 230
    .line 231
    invoke-direct {v7}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 232
    .line 233
    .line 234
    const v8, 0x44faf204

    .line 235
    .line 236
    .line 237
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    if-nez v9, :cond_b

    .line 249
    .line 250
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    if-ne v10, v9, :cond_c

    .line 255
    .line 256
    :cond_b
    new-instance v10, Lcom/yuanqi/master/addapp/home/i$d;

    .line 257
    .line 258
    invoke-direct {v10, v4}, Lcom/yuanqi/master/addapp/home/i$d;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 265
    .line 266
    .line 267
    check-cast v10, Lv3/l;

    .line 268
    .line 269
    const/16 v4, 0x8

    .line 270
    .line 271
    invoke-static {v7, v10, v15, v4}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    new-instance v9, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 276
    .line 277
    invoke-direct {v9}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 278
    .line 279
    .line 280
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    if-nez v8, :cond_d

    .line 292
    .line 293
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    if-ne v10, v6, :cond_e

    .line 298
    .line 299
    :cond_d
    new-instance v10, Lcom/yuanqi/master/addapp/home/i$e;

    .line 300
    .line 301
    invoke-direct {v10, v5}, Lcom/yuanqi/master/addapp/home/i$e;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 308
    .line 309
    .line 310
    check-cast v10, Lv3/l;

    .line 311
    .line 312
    invoke-static {v9, v10, v15, v4}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    const/4 v5, 0x0

    .line 317
    new-instance v6, Lcom/yuanqi/master/addapp/home/i$a;

    .line 318
    .line 319
    invoke-direct {v6, v3}, Lcom/yuanqi/master/addapp/home/i$a;-><init>(Landroid/content/Context;)V

    .line 320
    .line 321
    .line 322
    const v8, -0x3ee6d68c

    .line 323
    .line 324
    .line 325
    const/4 v9, 0x1

    .line 326
    invoke-static {v15, v8, v9, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    const/4 v8, 0x0

    .line 331
    const/4 v10, 0x0

    .line 332
    const/4 v11, 0x0

    .line 333
    const/4 v12, 0x0

    .line 334
    const-wide/16 v16, 0x0

    .line 335
    .line 336
    const-wide/16 v18, 0x0

    .line 337
    .line 338
    const/16 v20, 0x0

    .line 339
    .line 340
    new-instance v13, Lcom/yuanqi/master/addapp/home/i$b;

    .line 341
    .line 342
    invoke-direct {v13, v14, v7, v3, v4}, Lcom/yuanqi/master/addapp/home/i$b;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    .line 343
    .line 344
    .line 345
    const v3, 0x6d751cc9

    .line 346
    .line 347
    .line 348
    invoke-static {v15, v3, v9, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    const v21, 0x30000030

    .line 353
    .line 354
    .line 355
    const/16 v22, 0x1fd

    .line 356
    .line 357
    move-object v4, v5

    .line 358
    move-object v5, v6

    .line 359
    move-object v6, v8

    .line 360
    move-object v7, v10

    .line 361
    move-object v8, v11

    .line 362
    move v9, v12

    .line 363
    move-wide/from16 v10, v16

    .line 364
    .line 365
    move-wide/from16 v12, v18

    .line 366
    .line 367
    move-object/from16 v19, v14

    .line 368
    .line 369
    move-object/from16 v14, v20

    .line 370
    .line 371
    move-object/from16 v20, v15

    .line 372
    .line 373
    move-object v15, v3

    .line 374
    move-object/from16 v16, v20

    .line 375
    .line 376
    move/from16 v17, v21

    .line 377
    .line 378
    move/from16 v18, v22

    .line 379
    .line 380
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 381
    .line 382
    .line 383
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-eqz v3, :cond_f

    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 390
    .line 391
    .line 392
    :cond_f
    move-object/from16 v3, v19

    .line 393
    .line 394
    :goto_6
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    if-nez v4, :cond_10

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_10
    new-instance v5, Lcom/yuanqi/master/addapp/home/i$c;

    .line 402
    .line 403
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/addapp/home/i$c;-><init>(Landroidx/navigation/NavController;Lcom/yuanqi/master/addapp/AddAppViewModel;II)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 407
    .line 408
    .line 409
    :goto_7
    return-void
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

.method private static final b(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final c(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private static final d(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final e(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static final f(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
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
    move/from16 v15, p3

    .line 4
    .line 5
    move/from16 v13, p4

    .line 6
    .line 7
    const-string v1, "text"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v1, 0x68e68397

    .line 13
    .line 14
    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    and-int/lit8 v2, v13, 0x1

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    or-int/lit8 v2, v15, 0x6

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v2, v15, 0xe

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x2

    .line 41
    :goto_0
    or-int/2addr v2, v15

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v2, v15

    .line 44
    :goto_1
    and-int/lit8 v3, v13, 0x2

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x30

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    and-int/lit8 v4, v15, 0x70

    .line 52
    .line 53
    if-nez v4, :cond_5

    .line 54
    .line 55
    move-object/from16 v4, p1

    .line 56
    .line 57
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    const/16 v5, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v5, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v2, v5

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object/from16 v4, p1

    .line 71
    .line 72
    :goto_4
    move v12, v2

    .line 73
    and-int/lit8 v2, v12, 0x5b

    .line 74
    .line 75
    const/16 v5, 0x12

    .line 76
    .line 77
    if-ne v2, v5, :cond_7

    .line 78
    .line 79
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_6

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 87
    .line 88
    .line 89
    move-object/from16 v26, v14

    .line 90
    .line 91
    goto/16 :goto_8

    .line 92
    .line 93
    :cond_7
    :goto_5
    if-eqz v3, :cond_8

    .line 94
    .line 95
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 96
    .line 97
    move-object v11, v2

    .line 98
    goto :goto_6

    .line 99
    :cond_8
    move-object v11, v4

    .line 100
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    const/4 v2, -0x1

    .line 107
    const-string v3, "com.yuanqi.master.addapp.home.TextWithBlueBorder (DataManagerScreen.kt:175)"

    .line 108
    .line 109
    invoke-static {v1, v12, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_9
    const/16 v1, 0xc8

    .line 113
    .line 114
    int-to-float v1, v1

    .line 115
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const/16 v2, 0x78

    .line 124
    .line 125
    int-to-float v2, v2

    .line 126
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const/16 v2, 0x8

    .line 135
    .line 136
    int-to-float v6, v2

    .line 137
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const v3, 0x2bb5b5d7

    .line 152
    .line 153
    .line 154
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 155
    .line 156
    .line 157
    const/4 v3, 0x0

    .line 158
    const/4 v4, 0x6

    .line 159
    invoke-static {v2, v3, v14, v4}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const v4, -0x4ee9b9da

    .line 164
    .line 165
    .line 166
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v14, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 178
    .line 179
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 192
    .line 193
    if-nez v10, :cond_a

    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_b

    .line 206
    .line 207
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    invoke-static {v9, v2, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v9, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-nez v7, :cond_c

    .line 241
    .line 242
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-nez v7, :cond_d

    .line 255
    .line 256
    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-interface {v9, v4, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 268
    .line 269
    .line 270
    :cond_d
    invoke-static {v14}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-interface {v1, v2, v14, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    const v1, 0x7ab4aae9

    .line 286
    .line 287
    .line 288
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 289
    .line 290
    .line 291
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 292
    .line 293
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    invoke-static {}, Lcom/yuanqi/master/theme/b;->L()J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 302
    .line 303
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 308
    .line 309
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const/4 v6, 0x0

    .line 318
    const/4 v8, 0x0

    .line 319
    const-wide/16 v9, 0x0

    .line 320
    .line 321
    const/16 v16, 0x0

    .line 322
    .line 323
    move-object/from16 v25, v11

    .line 324
    .line 325
    move-object/from16 v11, v16

    .line 326
    .line 327
    move/from16 v21, v12

    .line 328
    .line 329
    move-object/from16 v12, v16

    .line 330
    .line 331
    const-wide/16 v16, 0x0

    .line 332
    .line 333
    move-object/from16 v26, v14

    .line 334
    .line 335
    move-wide/from16 v13, v16

    .line 336
    .line 337
    const/16 v16, 0x0

    .line 338
    .line 339
    move/from16 v15, v16

    .line 340
    .line 341
    const/16 v17, 0x0

    .line 342
    .line 343
    const/16 v18, 0x0

    .line 344
    .line 345
    const/16 v19, 0x0

    .line 346
    .line 347
    const/16 v20, 0x0

    .line 348
    .line 349
    const v22, 0x30db0

    .line 350
    .line 351
    .line 352
    and-int/lit8 v21, v21, 0xe

    .line 353
    .line 354
    or-int v22, v21, v22

    .line 355
    .line 356
    const/16 v23, 0x0

    .line 357
    .line 358
    const v24, 0x1ffd0

    .line 359
    .line 360
    .line 361
    move-object/from16 v0, p0

    .line 362
    .line 363
    move-object/from16 v21, v26

    .line 364
    .line 365
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 366
    .line 367
    .line 368
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 369
    .line 370
    .line 371
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 372
    .line 373
    .line 374
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 375
    .line 376
    .line 377
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_e

    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 387
    .line 388
    .line 389
    :cond_e
    move-object/from16 v4, v25

    .line 390
    .line 391
    :goto_8
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-nez v0, :cond_f

    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_f
    new-instance v1, Lcom/yuanqi/master/addapp/home/i$f;

    .line 399
    .line 400
    move-object/from16 v2, p0

    .line 401
    .line 402
    move/from16 v3, p3

    .line 403
    .line 404
    move/from16 v5, p4

    .line 405
    .line 406
    invoke-direct {v1, v2, v4, v3, v5}, Lcom/yuanqi/master/addapp/home/i$f;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 410
    .line 411
    .line 412
    :goto_9
    return-void
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

.method public static final synthetic g(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/home/i;->c(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method

.method public static final synthetic h(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/home/i;->e(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method
