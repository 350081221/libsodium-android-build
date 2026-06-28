.class public final Lcom/yuanqi/master/addapp/home/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006\u0012\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\t0\tX\u008a\u008e\u0002"
    }
    d2 = {
        "LanguageSwitchScreen",
        "",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "addAppViewModel",
        "Lcom/yuanqi/master/addapp/AddAppViewModel;",
        "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V",
        "LanguageToggleButton",
        "text",
        "",
        "selected",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "app_release",
        "selectedLanguage",
        "Ljava/util/Locale;",
        "kotlin.jvm.PlatformType",
        "localValue"
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
        "SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,176:1\n81#2,11:177\n25#3:188\n36#3:196\n456#3,8:221\n464#3,3:235\n467#3,3:239\n1116#4,6:189\n1116#4,6:197\n74#5:195\n154#6:203\n154#6:204\n154#6:205\n154#6:206\n154#6:207\n91#7,2:208\n93#7:238\n97#7:243\n79#8,11:210\n92#8:242\n3737#9,6:229\n81#10:244\n107#10,2:245\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt\n*L\n51#1:177,11\n55#1:188\n143#1:196\n141#1:221,8\n141#1:235,3\n141#1:239,3\n55#1:189,6\n143#1:197,6\n63#1:195\n145#1:203\n146#1:204\n147#1:205\n149#1:206\n150#1:207\n141#1:208,2\n141#1:238\n141#1:243\n141#1:210,11\n141#1:242\n141#1:229,6\n55#1:244\n55#1:245,2\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic a:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v2, Lkotlin/jvm/internal/v0;

    .line 5
    .line 6
    const-string v3, "localValue"

    .line 7
    .line 8
    const-string v4, "<v#1>"

    .line 9
    .line 10
    const-class v5, Lcom/yuanqi/master/addapp/home/j;

    .line 11
    .line 12
    invoke-direct {v2, v5, v3, v4, v0}, Lkotlin/jvm/internal/v0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/l1;->j(Lkotlin/jvm/internal/u0;)Lkotlin/reflect/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    aput-object v0, v1, v2

    .line 21
    .line 22
    sput-object v1, Lcom/yuanqi/master/addapp/home/j;->a:[Lkotlin/reflect/o;

    .line 23
    .line 24
    return-void
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public static final a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 28
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
    const v3, -0x6a132f24

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
    and-int/lit8 v4, v2, 0x3

    .line 22
    .line 23
    const/4 v5, 0x3

    .line 24
    if-ne v4, v5, :cond_1

    .line 25
    .line 26
    and-int/lit8 v4, v1, 0x1

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 38
    .line 39
    .line 40
    move-object/from16 v3, p1

    .line 41
    .line 42
    move-object/from16 v20, v15

    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 47
    .line 48
    .line 49
    and-int/lit8 v4, v1, 0x1

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    :goto_1
    and-int/lit8 v4, v2, 0x2

    .line 65
    .line 66
    if-eqz v4, :cond_6

    .line 67
    .line 68
    invoke-static {}, Lcom/yuanqi/master/ViewModelFactoryKt;->a()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const v4, 0x671a9c9b

    .line 73
    .line 74
    .line 75
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 76
    .line 77
    .line 78
    sget-object v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 79
    .line 80
    const/4 v5, 0x6

    .line 81
    invoke-virtual {v4, v15, v5}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_5

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    instance-of v4, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 89
    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    move-object v4, v5

    .line 93
    check-cast v4, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 94
    .line 95
    invoke-interface {v4}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    sget-object v4, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 101
    .line 102
    :goto_2
    move-object v8, v4

    .line 103
    const-class v4, Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 104
    .line 105
    const v10, 0x9048

    .line 106
    .line 107
    .line 108
    const/4 v11, 0x0

    .line 109
    move-object v9, v15

    .line 110
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 115
    .line 116
    .line 117
    check-cast v4, Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 118
    .line 119
    move-object/from16 v19, v4

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 123
    .line 124
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_6
    :goto_3
    move-object/from16 v19, p1

    .line 135
    .line 136
    :goto_4
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    const/4 v4, -0x1

    .line 146
    const-string v5, "com.yuanqi.master.addapp.home.LanguageSwitchScreen (LanguageSwitchScreen.kt:53)"

    .line 147
    .line 148
    invoke-static {v3, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    const v3, -0x1d58f75c

    .line 152
    .line 153
    .line 154
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 162
    .line 163
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    const/4 v5, 0x0

    .line 168
    if-ne v3, v4, :cond_8

    .line 169
    .line 170
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const/4 v4, 0x2

    .line 175
    invoke-static {v3, v5, v4, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_8
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 183
    .line 184
    .line 185
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 186
    .line 187
    new-instance v4, Lcom/yuanqi/master/tools/x0;

    .line 188
    .line 189
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    const-string v7, "local"

    .line 198
    .line 199
    invoke-direct {v4, v7, v6}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    const/4 v6, 0x0

    .line 203
    const/4 v7, 0x1

    .line 204
    invoke-static {v5, v15, v6, v7}, Lcom/google/accompanist/systemuicontroller/d;->e(Landroid/view/Window;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/systemuicontroller/c;

    .line 205
    .line 206
    .line 207
    move-result-object v20

    .line 208
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 209
    .line 210
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide v9

    .line 214
    const/4 v11, 0x0

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x6

    .line 217
    const/4 v14, 0x0

    .line 218
    move-object/from16 v8, v20

    .line 219
    .line 220
    invoke-static/range {v8 .. v14}, Lcom/google/accompanist/systemuicontroller/c;->t(Lcom/google/accompanist/systemuicontroller/c;JZLv3/l;ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 224
    .line 225
    .line 226
    move-result-wide v21

    .line 227
    const/16 v23, 0x0

    .line 228
    .line 229
    const/16 v24, 0x0

    .line 230
    .line 231
    const/16 v25, 0x0

    .line 232
    .line 233
    const/16 v26, 0xe

    .line 234
    .line 235
    const/16 v27, 0x0

    .line 236
    .line 237
    invoke-static/range {v20 .. v27}, Lcom/google/accompanist/systemuicontroller/c;->g(Lcom/google/accompanist/systemuicontroller/c;JZZLv3/l;ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, Landroid/content/Context;

    .line 249
    .line 250
    const/4 v8, 0x0

    .line 251
    new-instance v9, Lcom/yuanqi/master/addapp/home/j$a;

    .line 252
    .line 253
    invoke-direct {v9, v6}, Lcom/yuanqi/master/addapp/home/j$a;-><init>(Landroid/content/Context;)V

    .line 254
    .line 255
    .line 256
    const v10, -0x58a3ad68

    .line 257
    .line 258
    .line 259
    invoke-static {v15, v10, v7, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    const/4 v10, 0x0

    .line 264
    const/4 v11, 0x0

    .line 265
    const/4 v13, 0x0

    .line 266
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v16

    .line 270
    const-wide/16 v20, 0x0

    .line 271
    .line 272
    new-instance v5, Lcom/yuanqi/master/addapp/home/j$b;

    .line 273
    .line 274
    invoke-direct {v5, v3, v6, v4}, Lcom/yuanqi/master/addapp/home/j$b;-><init>(Landroidx/compose/runtime/MutableState;Landroid/content/Context;Lcom/yuanqi/master/tools/x0;)V

    .line 275
    .line 276
    .line 277
    const v3, 0x6393dfad

    .line 278
    .line 279
    .line 280
    invoke-static {v15, v3, v7, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    const v18, 0x30180030

    .line 285
    .line 286
    .line 287
    const/16 v22, 0x1bd

    .line 288
    .line 289
    move-object v4, v8

    .line 290
    move-object v5, v9

    .line 291
    move-object v6, v10

    .line 292
    move-object v7, v11

    .line 293
    move-object v8, v12

    .line 294
    move v9, v13

    .line 295
    move-wide/from16 v10, v16

    .line 296
    .line 297
    move-wide/from16 v12, v20

    .line 298
    .line 299
    move-object/from16 v20, v15

    .line 300
    .line 301
    move-object v15, v3

    .line 302
    move-object/from16 v16, v20

    .line 303
    .line 304
    move/from16 v17, v18

    .line 305
    .line 306
    move/from16 v18, v22

    .line 307
    .line 308
    invoke-static/range {v4 .. v18}, Landroidx/compose/material3/ScaffoldKt;->Scaffold-TvnljyQ(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Lv3/p;IJJLandroidx/compose/foundation/layout/WindowInsets;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-eqz v3, :cond_9

    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 318
    .line 319
    .line 320
    :cond_9
    move-object/from16 v3, v19

    .line 321
    .line 322
    :goto_5
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    if-nez v4, :cond_a

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_a
    new-instance v5, Lcom/yuanqi/master/addapp/home/j$c;

    .line 330
    .line 331
    invoke-direct {v5, v0, v3, v1, v2}, Lcom/yuanqi/master/addapp/home/j$c;-><init>(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;II)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 335
    .line 336
    .line 337
    :goto_6
    return-void
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

.method private static final b(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;)",
            "Ljava/util/Locale;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Locale;

    return-object p0
.end method

.method private static final c(Landroidx/compose/runtime/MutableState;Ljava/util/Locale;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Locale;",
            ">;",
            "Ljava/util/Locale;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final d(Lcom/yuanqi/master/tools/x0;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Lcom/yuanqi/master/addapp/home/j;->a:[Lkotlin/reflect/o;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final e(Lcom/yuanqi/master/tools/x0;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/yuanqi/master/addapp/home/j;->a:[Lkotlin/reflect/o;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final f(Ljava/lang/String;ZLv3/a;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
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

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v13, p2

    .line 6
    .line 7
    move/from16 v14, p4

    .line 8
    .line 9
    const-string v1, "text"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "onClick"

    .line 15
    .line 16
    invoke-static {v13, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v1, 0x1c8f5d34

    .line 20
    .line 21
    .line 22
    move-object/from16 v2, p3

    .line 23
    .line 24
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v12

    .line 28
    and-int/lit8 v2, v14, 0xe

    .line 29
    .line 30
    const/4 v10, 0x4

    .line 31
    const/4 v11, 0x2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    move v2, v10

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v2, v11

    .line 43
    :goto_0
    or-int/2addr v2, v14

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v2, v14

    .line 46
    :goto_1
    and-int/lit8 v3, v14, 0x70

    .line 47
    .line 48
    const/16 v16, 0x10

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const/16 v3, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move/from16 v3, v16

    .line 62
    .line 63
    :goto_2
    or-int/2addr v2, v3

    .line 64
    :cond_3
    and-int/lit16 v3, v14, 0x380

    .line 65
    .line 66
    if-nez v3, :cond_5

    .line 67
    .line 68
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    const/16 v3, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v3, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v2, v3

    .line 80
    :cond_5
    move v9, v2

    .line 81
    and-int/lit16 v2, v9, 0x2db

    .line 82
    .line 83
    const/16 v3, 0x92

    .line 84
    .line 85
    if-ne v2, v3, :cond_7

    .line 86
    .line 87
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 95
    .line 96
    .line 97
    move-object/from16 v27, v12

    .line 98
    .line 99
    goto/16 :goto_7

    .line 100
    .line 101
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_8

    .line 106
    .line 107
    const/4 v2, -0x1

    .line 108
    const-string v3, "com.yuanqi.master.addapp.home.LanguageToggleButton (LanguageSwitchScreen.kt:138)"

    .line 109
    .line 110
    invoke-static {v1, v9, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    if-eqz v15, :cond_9

    .line 114
    .line 115
    invoke-static {}, Lcom/yuanqi/master/theme/b;->F2()J

    .line 116
    .line 117
    .line 118
    move-result-wide v1

    .line 119
    goto :goto_5

    .line 120
    :cond_9
    invoke-static {}, Lcom/yuanqi/master/theme/b;->O()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    :goto_5
    move-wide v2, v1

    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v8, 0x0

    .line 129
    const/16 v1, 0xe

    .line 130
    .line 131
    move-object v7, v12

    .line 132
    move/from16 v25, v9

    .line 133
    .line 134
    move v9, v1

    .line 135
    invoke-static/range {v2 .. v9}, Landroidx/compose/animation/SingleValueAnimationKt;->animateColorAsState-euL9pac(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v18, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    const v2, 0x44faf204

    .line 143
    .line 144
    .line 145
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    if-nez v2, :cond_a

    .line 157
    .line 158
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-ne v6, v2, :cond_b

    .line 165
    .line 166
    :cond_a
    new-instance v6, Lcom/yuanqi/master/addapp/home/j$d;

    .line 167
    .line 168
    invoke-direct {v6, v13}, Lcom/yuanqi/master/addapp/home/j$d;-><init>(Lv3/a;)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 175
    .line 176
    .line 177
    check-cast v6, Lv3/a;

    .line 178
    .line 179
    const/4 v7, 0x7

    .line 180
    const/4 v8, 0x0

    .line 181
    move-object/from16 v2, v18

    .line 182
    .line 183
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/4 v3, 0x0

    .line 188
    const/4 v4, 0x1

    .line 189
    const/4 v5, 0x0

    .line 190
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const/16 v6, 0x37

    .line 195
    .line 196
    int-to-float v6, v6

    .line 197
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    int-to-float v6, v10

    .line 206
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    const/16 v7, 0x8

    .line 211
    .line 212
    int-to-float v7, v7

    .line 213
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    invoke-static {v2, v7, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/4 v6, 0x6

    .line 222
    int-to-float v6, v6

    .line 223
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-static {v2, v7}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 232
    .line 233
    .line 234
    move-result-object v19

    .line 235
    invoke-static {}, Lcom/yuanqi/master/theme/b;->O()J

    .line 236
    .line 237
    .line 238
    move-result-wide v20

    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    const/16 v23, 0x2

    .line 242
    .line 243
    const/16 v24, 0x0

    .line 244
    .line 245
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    int-to-float v4, v4

    .line 250
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Landroidx/compose/ui/graphics/Color;

    .line 259
    .line 260
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 261
    .line 262
    .line 263
    move-result-wide v7

    .line 264
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-static {v2, v4, v7, v8, v1}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const/16 v2, 0x14

    .line 277
    .line 278
    int-to-float v2, v2

    .line 279
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-static {v1, v2, v3, v11, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 288
    .line 289
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 294
    .line 295
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    const v4, 0x2952b718

    .line 300
    .line 301
    .line 302
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 303
    .line 304
    .line 305
    const/16 v4, 0x36

    .line 306
    .line 307
    invoke-static {v2, v3, v12, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const v3, -0x4ee9b9da

    .line 312
    .line 313
    .line 314
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 315
    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 327
    .line 328
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 341
    .line 342
    if-nez v8, :cond_c

    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 345
    .line 346
    .line 347
    :cond_c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 348
    .line 349
    .line 350
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    if-eqz v8, :cond_d

    .line 355
    .line 356
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 357
    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 361
    .line 362
    .line 363
    :goto_6
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    invoke-static {v7, v2, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-static {v7, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-nez v5, :cond_e

    .line 390
    .line 391
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    if-nez v5, :cond_f

    .line 404
    .line 405
    :cond_e
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-interface {v7, v4, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 417
    .line 418
    .line 419
    :cond_f
    invoke-static {v12}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-interface {v1, v2, v12, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    const v1, 0x7ab4aae9

    .line 435
    .line 436
    .line 437
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 438
    .line 439
    .line 440
    sget-object v26, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 441
    .line 442
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 443
    .line 444
    .line 445
    move-result-wide v4

    .line 446
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 447
    .line 448
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 449
    .line 450
    .line 451
    move-result-wide v2

    .line 452
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 453
    .line 454
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 455
    .line 456
    .line 457
    move-result-object v7

    .line 458
    const/high16 v19, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/16 v20, 0x0

    .line 461
    .line 462
    const/16 v21, 0x2

    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    move-object/from16 v17, v26

    .line 467
    .line 468
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    const/4 v6, 0x0

    .line 473
    const/4 v8, 0x0

    .line 474
    const-wide/16 v9, 0x0

    .line 475
    .line 476
    const/4 v11, 0x0

    .line 477
    const/16 v16, 0x0

    .line 478
    .line 479
    move-object/from16 v27, v12

    .line 480
    .line 481
    move-object/from16 v12, v16

    .line 482
    .line 483
    const-wide/16 v16, 0x0

    .line 484
    .line 485
    move-wide/from16 v13, v16

    .line 486
    .line 487
    const/16 v16, 0x0

    .line 488
    .line 489
    move/from16 v15, v16

    .line 490
    .line 491
    const/16 v17, 0x0

    .line 492
    .line 493
    const/16 v18, 0x0

    .line 494
    .line 495
    const/16 v19, 0x0

    .line 496
    .line 497
    const/16 v20, 0x0

    .line 498
    .line 499
    const v21, 0x30d80

    .line 500
    .line 501
    .line 502
    and-int/lit8 v22, v25, 0xe

    .line 503
    .line 504
    or-int v22, v22, v21

    .line 505
    .line 506
    const/16 v23, 0x0

    .line 507
    .line 508
    const v24, 0x1ffd0

    .line 509
    .line 510
    .line 511
    move-object/from16 v0, p0

    .line 512
    .line 513
    move-object/from16 v21, v27

    .line 514
    .line 515
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 516
    .line 517
    .line 518
    const/4 v2, 0x0

    .line 519
    const/4 v3, 0x0

    .line 520
    const/4 v4, 0x0

    .line 521
    const/4 v5, 0x0

    .line 522
    sget-object v0, Lcom/yuanqi/master/addapp/home/d;->a:Lcom/yuanqi/master/addapp/home/d;

    .line 523
    .line 524
    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/home/d;->b()Lv3/q;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    const v0, 0x180006

    .line 529
    .line 530
    .line 531
    and-int/lit8 v1, v25, 0x70

    .line 532
    .line 533
    or-int v8, v0, v1

    .line 534
    .line 535
    const/16 v9, 0x1e

    .line 536
    .line 537
    move-object/from16 v0, v26

    .line 538
    .line 539
    move/from16 v1, p1

    .line 540
    .line 541
    move-object/from16 v7, v27

    .line 542
    .line 543
    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 544
    .line 545
    .line 546
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 547
    .line 548
    .line 549
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 550
    .line 551
    .line 552
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 553
    .line 554
    .line 555
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_10

    .line 563
    .line 564
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 565
    .line 566
    .line 567
    :cond_10
    :goto_7
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    if-nez v0, :cond_11

    .line 572
    .line 573
    goto :goto_8

    .line 574
    :cond_11
    new-instance v1, Lcom/yuanqi/master/addapp/home/j$e;

    .line 575
    .line 576
    move-object/from16 v2, p0

    .line 577
    .line 578
    move/from16 v3, p1

    .line 579
    .line 580
    move-object/from16 v4, p2

    .line 581
    .line 582
    move/from16 v5, p4

    .line 583
    .line 584
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/yuanqi/master/addapp/home/j$e;-><init>(Ljava/lang/String;ZLv3/a;I)V

    .line 585
    .line 586
    .line 587
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 588
    .line 589
    .line 590
    :goto_8
    return-void
.end method

.method public static final synthetic g(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;
    .locals 0

    invoke-static {p0}, Lcom/yuanqi/master/addapp/home/j;->b(Landroidx/compose/runtime/MutableState;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Landroidx/compose/runtime/MutableState;Ljava/util/Locale;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/home/j;->c(Landroidx/compose/runtime/MutableState;Ljava/util/Locale;)V

    return-void
.end method

.method public static final synthetic i(Lcom/yuanqi/master/tools/x0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/yuanqi/master/addapp/home/j;->e(Lcom/yuanqi/master/tools/x0;Ljava/lang/String;)V

    return-void
.end method
