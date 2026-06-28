.class public interface abstract Landroidx/compose/material/ExposedDropdownMenuBoxScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material/ExperimentalMaterialApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material/ExposedDropdownMenuBoxScope$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H&JW\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00032\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00080\r\u00a2\u0006\u0002\u0008\u000f\u00a2\u0006\u0002\u0008\u0010H\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/material/ExposedDropdownMenuBoxScope;",
        "",
        "Landroidx/compose/ui/Modifier;",
        "",
        "matchTextFieldWidth",
        "exposedDropdownSize",
        "expanded",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onDismissRequest",
        "modifier",
        "Landroidx/compose/foundation/ScrollState;",
        "scrollState",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "content",
        "ExposedDropdownMenu",
        "(ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,740:1\n25#2:741\n25#2:748\n1116#3,6:742\n1116#3,6:749\n1116#3,6:756\n74#4:755\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n249#1:741\n253#1:748\n249#1:742,6\n253#1:749,6\n258#1:756,6\n254#1:755\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic access$ExposedDropdownMenu$jd(Landroidx/compose/material/ExposedDropdownMenuBoxScope;ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-super/range {p0 .. p8}, Landroidx/compose/material/ExposedDropdownMenuBoxScope;->ExposedDropdownMenu(ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static synthetic exposedDropdownSize$default(Landroidx/compose/material/ExposedDropdownMenuBoxScope;Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    if-nez p4, :cond_1

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    move p2, p4

    :cond_0
    invoke-interface {p0, p1, p2}, Landroidx/compose/material/ExposedDropdownMenuBoxScope;->exposedDropdownSize(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: exposedDropdownSize"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public ExposedDropdownMenu(ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/ScrollState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/ScrollState;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
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
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, 0x3cffbe8

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    and-int/lit8 v1, p8, 0x1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    or-int/lit8 v1, v7, 0x6

    .line 18
    .line 19
    move/from16 v9, p1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v1, v7, 0xe

    .line 23
    .line 24
    move/from16 v9, p1

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v2

    .line 37
    :goto_0
    or-int/2addr v1, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v1, v7

    .line 40
    :goto_1
    and-int/lit8 v3, p8, 0x2

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    or-int/lit8 v1, v1, 0x30

    .line 45
    .line 46
    move-object/from16 v10, p2

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    and-int/lit8 v3, v7, 0x70

    .line 50
    .line 51
    move-object/from16 v10, p2

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/16 v3, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v1, v3

    .line 67
    :cond_5
    :goto_3
    and-int/lit8 v3, p8, 0x4

    .line 68
    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    or-int/lit16 v1, v1, 0x180

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_6
    and-int/lit16 v4, v7, 0x380

    .line 75
    .line 76
    if-nez v4, :cond_8

    .line 77
    .line 78
    move-object/from16 v4, p3

    .line 79
    .line 80
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    const/16 v5, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v5, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v1, v5

    .line 92
    goto :goto_6

    .line 93
    :cond_8
    :goto_5
    move-object/from16 v4, p3

    .line 94
    .line 95
    :goto_6
    and-int/lit16 v5, v7, 0x1c00

    .line 96
    .line 97
    if-nez v5, :cond_b

    .line 98
    .line 99
    and-int/lit8 v5, p8, 0x8

    .line 100
    .line 101
    if-nez v5, :cond_9

    .line 102
    .line 103
    move-object/from16 v5, p4

    .line 104
    .line 105
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    const/16 v6, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_9
    move-object/from16 v5, p4

    .line 115
    .line 116
    :cond_a
    const/16 v6, 0x400

    .line 117
    .line 118
    :goto_7
    or-int/2addr v1, v6

    .line 119
    goto :goto_8

    .line 120
    :cond_b
    move-object/from16 v5, p4

    .line 121
    .line 122
    :goto_8
    and-int/lit8 v6, p8, 0x10

    .line 123
    .line 124
    if-eqz v6, :cond_c

    .line 125
    .line 126
    or-int/lit16 v1, v1, 0x6000

    .line 127
    .line 128
    goto :goto_a

    .line 129
    :cond_c
    const v6, 0xe000

    .line 130
    .line 131
    .line 132
    and-int/2addr v6, v7

    .line 133
    if-nez v6, :cond_e

    .line 134
    .line 135
    move-object/from16 v6, p5

    .line 136
    .line 137
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_d

    .line 142
    .line 143
    const/16 v11, 0x4000

    .line 144
    .line 145
    goto :goto_9

    .line 146
    :cond_d
    const/16 v11, 0x2000

    .line 147
    .line 148
    :goto_9
    or-int/2addr v1, v11

    .line 149
    goto :goto_b

    .line 150
    :cond_e
    :goto_a
    move-object/from16 v6, p5

    .line 151
    .line 152
    :goto_b
    and-int/lit8 v11, p8, 0x20

    .line 153
    .line 154
    if-eqz v11, :cond_f

    .line 155
    .line 156
    const/high16 v11, 0x30000

    .line 157
    .line 158
    or-int/2addr v1, v11

    .line 159
    move-object/from16 v15, p0

    .line 160
    .line 161
    goto :goto_d

    .line 162
    :cond_f
    const/high16 v11, 0x70000

    .line 163
    .line 164
    and-int/2addr v11, v7

    .line 165
    move-object/from16 v15, p0

    .line 166
    .line 167
    if-nez v11, :cond_11

    .line 168
    .line 169
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    if-eqz v11, :cond_10

    .line 174
    .line 175
    const/high16 v11, 0x20000

    .line 176
    .line 177
    goto :goto_c

    .line 178
    :cond_10
    const/high16 v11, 0x10000

    .line 179
    .line 180
    :goto_c
    or-int/2addr v1, v11

    .line 181
    :cond_11
    :goto_d
    const v11, 0x5b6db

    .line 182
    .line 183
    .line 184
    and-int/2addr v11, v1

    .line 185
    const v12, 0x12492

    .line 186
    .line 187
    .line 188
    if-ne v11, v12, :cond_13

    .line 189
    .line 190
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-nez v11, :cond_12

    .line 195
    .line 196
    goto :goto_e

    .line 197
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_13

    .line 201
    .line 202
    :cond_13
    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v11, v7, 0x1

    .line 206
    .line 207
    const/4 v14, 0x1

    .line 208
    if-eqz v11, :cond_16

    .line 209
    .line 210
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v11, :cond_14

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 218
    .line 219
    .line 220
    and-int/lit8 v3, p8, 0x8

    .line 221
    .line 222
    if-eqz v3, :cond_15

    .line 223
    .line 224
    and-int/lit16 v1, v1, -0x1c01

    .line 225
    .line 226
    :cond_15
    move-object/from16 v18, v4

    .line 227
    .line 228
    goto :goto_11

    .line 229
    :cond_16
    :goto_f
    if-eqz v3, :cond_17

    .line 230
    .line 231
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 232
    .line 233
    goto :goto_10

    .line 234
    :cond_17
    move-object v3, v4

    .line 235
    :goto_10
    and-int/lit8 v4, p8, 0x8

    .line 236
    .line 237
    if-eqz v4, :cond_18

    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    invoke-static {v4, v8, v4, v14}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    and-int/lit16 v1, v1, -0x1c01

    .line 245
    .line 246
    move-object/from16 v18, v3

    .line 247
    .line 248
    move-object/from16 v19, v4

    .line 249
    .line 250
    goto :goto_12

    .line 251
    :cond_18
    move-object/from16 v18, v3

    .line 252
    .line 253
    :goto_11
    move-object/from16 v19, v5

    .line 254
    .line 255
    :goto_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 256
    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_19

    .line 263
    .line 264
    const/4 v3, -0x1

    .line 265
    const-string v4, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:238)"

    .line 266
    .line 267
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_19
    const v0, -0x1d58f75c

    .line 271
    .line 272
    .line 273
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 281
    .line 282
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    if-ne v3, v5, :cond_1a

    .line 287
    .line 288
    new-instance v3, Landroidx/compose/animation/core/MutableTransitionState;

    .line 289
    .line 290
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 291
    .line 292
    invoke-direct {v3, v5}, Landroidx/compose/animation/core/MutableTransitionState;-><init>(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_1a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 299
    .line 300
    .line 301
    move-object v12, v3

    .line 302
    check-cast v12, Landroidx/compose/animation/core/MutableTransitionState;

    .line 303
    .line 304
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v12, v3}, Landroidx/compose/animation/core/MutableTransitionState;->setTargetState(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/animation/core/MutableTransitionState;->getCurrentState()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    check-cast v3, Ljava/lang/Boolean;

    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-nez v3, :cond_1b

    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/animation/core/MutableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    check-cast v3, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_1f

    .line 334
    .line 335
    :cond_1b
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    if-ne v0, v3, :cond_1c

    .line 347
    .line 348
    sget-object v0, Landroidx/compose/ui/graphics/TransformOrigin;->Companion:Landroidx/compose/ui/graphics/TransformOrigin$Companion;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/TransformOrigin$Companion;->getCenter-SzJe1aQ()J

    .line 351
    .line 352
    .line 353
    move-result-wide v16

    .line 354
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/TransformOrigin;->box-impl(J)Landroidx/compose/ui/graphics/TransformOrigin;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const/4 v3, 0x0

    .line 359
    invoke-static {v0, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_1c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 367
    .line 368
    .line 369
    move-object v13, v0

    .line 370
    check-cast v13, Landroidx/compose/runtime/MutableState;

    .line 371
    .line 372
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    move-object/from16 v23, v0

    .line 381
    .line 382
    check-cast v23, Landroidx/compose/ui/unit/Density;

    .line 383
    .line 384
    sget-object v0, Landroidx/compose/ui/unit/DpOffset;->Companion:Landroidx/compose/ui/unit/DpOffset$Companion;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpOffset$Companion;->getZero-RKDOV3M()J

    .line 387
    .line 388
    .line 389
    move-result-wide v21

    .line 390
    const v0, 0x74c68b73

    .line 391
    .line 392
    .line 393
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    if-nez v0, :cond_1d

    .line 405
    .line 406
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-ne v2, v0, :cond_1e

    .line 411
    .line 412
    :cond_1d
    new-instance v2, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1;

    .line 413
    .line 414
    invoke-direct {v2, v13}, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 415
    .line 416
    .line 417
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    :cond_1e
    move-object/from16 v24, v2

    .line 421
    .line 422
    check-cast v24, Lv3/p;

    .line 423
    .line 424
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 425
    .line 426
    .line 427
    const/16 v25, 0x0

    .line 428
    .line 429
    new-instance v2, Landroidx/compose/material/DropdownMenuPositionProvider;

    .line 430
    .line 431
    move-object/from16 v20, v2

    .line 432
    .line 433
    invoke-direct/range {v20 .. v25}, Landroidx/compose/material/DropdownMenuPositionProvider;-><init>(JLandroidx/compose/ui/unit/Density;Lv3/p;Lkotlin/jvm/internal/w;)V

    .line 434
    .line 435
    .line 436
    new-instance v0, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1;

    .line 437
    .line 438
    move-object v11, v0

    .line 439
    move v3, v14

    .line 440
    move-object/from16 v14, v19

    .line 441
    .line 442
    move-object/from16 v15, p0

    .line 443
    .line 444
    move-object/from16 v16, v18

    .line 445
    .line 446
    move-object/from16 v17, p5

    .line 447
    .line 448
    invoke-direct/range {v11 .. v17}, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1;-><init>(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/material/ExposedDropdownMenuBoxScope;Landroidx/compose/ui/Modifier;Lv3/q;)V

    .line 449
    .line 450
    .line 451
    const v4, 0x3baf5f8e

    .line 452
    .line 453
    .line 454
    invoke-static {v8, v4, v3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    shr-int/lit8 v0, v1, 0x3

    .line 459
    .line 460
    and-int/lit8 v0, v0, 0xe

    .line 461
    .line 462
    or-int/lit16 v5, v0, 0x180

    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    move-object/from16 v1, p2

    .line 466
    .line 467
    move-object v4, v8

    .line 468
    move v6, v0

    .line 469
    invoke-static/range {v1 .. v6}, Landroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 470
    .line 471
    .line 472
    :cond_1f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_20

    .line 477
    .line 478
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 479
    .line 480
    .line 481
    :cond_20
    move-object/from16 v4, v18

    .line 482
    .line 483
    move-object/from16 v5, v19

    .line 484
    .line 485
    :goto_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 486
    .line 487
    .line 488
    move-result-object v11

    .line 489
    if-eqz v11, :cond_21

    .line 490
    .line 491
    new-instance v12, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2;

    .line 492
    .line 493
    move-object v0, v12

    .line 494
    move-object/from16 v1, p0

    .line 495
    .line 496
    move/from16 v2, p1

    .line 497
    .line 498
    move-object/from16 v3, p2

    .line 499
    .line 500
    move-object/from16 v6, p5

    .line 501
    .line 502
    move/from16 v7, p7

    .line 503
    .line 504
    move/from16 v8, p8

    .line 505
    .line 506
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2;-><init>(Landroidx/compose/material/ExposedDropdownMenuBoxScope;ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;II)V

    .line 507
    .line 508
    .line 509
    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 510
    .line 511
    .line 512
    :cond_21
    return-void
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
.end method

.method public abstract exposedDropdownSize(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation
.end method
