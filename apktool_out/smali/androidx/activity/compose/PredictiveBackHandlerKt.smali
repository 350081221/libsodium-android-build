.class public final Landroidx/activity/compose/PredictiveBackHandlerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u001a\\\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002A\u0010\u000c\u001a=\u0008\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n\u00a2\u0006\u0002\u0008\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010\u00b2\u0006G\u0010\u000f\u001a=\u0008\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n\u00a2\u0006\u0002\u0008\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "enabled",
        "Lkotlin/Function2;",
        "Lkotlinx/coroutines/flow/i;",
        "Landroidx/activity/BackEventCompat;",
        "Lu3/n;",
        "Lkotlin/v0;",
        "name",
        "progress",
        "Lkotlin/coroutines/d;",
        "Lkotlin/r2;",
        "",
        "onBack",
        "PredictiveBackHandler",
        "(ZLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "currentOnBack",
        "activity-compose_release"
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
        "SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,172:1\n473#2,4:173\n477#2,2:181\n481#2:187\n25#3:177\n955#4,3:178\n958#4,3:184\n955#4,6:188\n955#4,6:194\n955#4,6:201\n473#5:183\n76#6:200\n89#7:207\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n79#1:173,4\n79#1:181,2\n79#1:187\n79#1:177\n79#1:178,3\n79#1:184,3\n81#1:188,6\n127#1:194,6\n137#1:201,6\n79#1:183\n135#1:200\n78#1:207\n*E\n"
    }
.end annotation


# direct methods
.method public static final PredictiveBackHandler(ZLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 6
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/p<",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/activity/BackEventCompat;",
            ">;-",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    const v0, -0x264426c9

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v0, p4, 0x1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    or-int/lit8 v1, p3, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v1, p3, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, p3

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v1, p3

    .line 31
    :goto_1
    and-int/lit8 v2, p4, 0x2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v2, p3, 0x30

    .line 39
    .line 40
    if-nez v2, :cond_5

    .line 41
    .line 42
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v2, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v1, v2

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v2, v1, 0x13

    .line 55
    .line 56
    const/16 v3, 0x12

    .line 57
    .line 58
    if-ne v2, v3, :cond_7

    .line 59
    .line 60
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_6

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    .line 73
    .line 74
    const/4 p0, 0x1

    .line 75
    :cond_8
    shr-int/lit8 v0, v1, 0x3

    .line 76
    .line 77
    and-int/lit8 v0, v0, 0xe

    .line 78
    .line 79
    invoke-static {p1, p2, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const v2, -0x2b2019d8

    .line 84
    .line 85
    .line 86
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 87
    .line 88
    .line 89
    const v2, -0x384349

    .line 90
    .line 91
    .line 92
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 100
    .line 101
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-ne v2, v4, :cond_9

    .line 106
    .line 107
    sget-object v2, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 108
    .line 109
    invoke-static {v2, p2}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v4, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 114
    .line 115
    invoke-direct {v4, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object v2, v4

    .line 122
    :cond_9
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 123
    .line 124
    .line 125
    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 132
    .line 133
    .line 134
    const v4, -0x3fdeff16

    .line 135
    .line 136
    .line 137
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-ne v4, v5, :cond_a

    .line 149
    .line 150
    new-instance v4, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;

    .line 151
    .line 152
    invoke-direct {v4, p0, v2, v0}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;-><init>(ZLkotlinx/coroutines/s0;Landroidx/compose/runtime/State;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_a
    check-cast v4, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;

    .line 159
    .line 160
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const v2, -0x3fdef756

    .line 168
    .line 169
    .line 170
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    or-int/2addr v2, v5

    .line 182
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-nez v2, :cond_b

    .line 187
    .line 188
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-ne v5, v2, :cond_c

    .line 193
    .line 194
    :cond_b
    new-instance v5, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$1$1;

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-direct {v5, v4, p0, v2}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$1$1;-><init>(Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;ZLkotlin/coroutines/d;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_c
    check-cast v5, Lv3/p;

    .line 204
    .line 205
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 206
    .line 207
    .line 208
    and-int/lit8 v1, v1, 0xe

    .line 209
    .line 210
    invoke-static {v0, v5, p2, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 211
    .line 212
    .line 213
    sget-object v0, Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;->INSTANCE:Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;

    .line 214
    .line 215
    const/4 v1, 0x6

    .line 216
    invoke-virtual {v0, p2, v1}, Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_10

    .line 221
    .line 222
    invoke-interface {v0}, Landroidx/activity/OnBackPressedDispatcherOwner;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 235
    .line 236
    const v2, -0x3fdef5e2

    .line 237
    .line 238
    .line 239
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    or-int/2addr v2, v5

    .line 251
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    or-int/2addr v2, v5

    .line 256
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    if-nez v2, :cond_d

    .line 261
    .line 262
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    if-ne v5, v2, :cond_e

    .line 267
    .line 268
    :cond_d
    new-instance v5, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2$1;

    .line 269
    .line 270
    invoke-direct {v5, v0, v1, v4}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$2$1;-><init>(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_e
    check-cast v5, Lv3/l;

    .line 277
    .line 278
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 279
    .line 280
    .line 281
    const/4 v2, 0x0

    .line 282
    invoke-static {v1, v0, v5, p2, v2}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 283
    .line 284
    .line 285
    :goto_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    if-eqz p2, :cond_f

    .line 290
    .line 291
    new-instance v0, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;

    .line 292
    .line 293
    invoke-direct {v0, p0, p1, p3, p4}, Landroidx/activity/compose/PredictiveBackHandlerKt$PredictiveBackHandler$3;-><init>(ZLv3/p;II)V

    .line 294
    .line 295
    .line 296
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 297
    .line 298
    .line 299
    :cond_f
    return-void

    .line 300
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 301
    .line 302
    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    .line 303
    .line 304
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p0
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
.end method

.method private static final PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/p<",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/activity/BackEventCompat;",
            ">;-",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lv3/p<",
            "Lkotlinx/coroutines/flow/i<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Lkotlin/coroutines/d<",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv3/p;

    return-object p0
.end method

.method public static final synthetic access$PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0

    invoke-static {p0}, Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler$lambda$0(Landroidx/compose/runtime/State;)Lv3/p;

    move-result-object p0

    return-object p0
.end method
