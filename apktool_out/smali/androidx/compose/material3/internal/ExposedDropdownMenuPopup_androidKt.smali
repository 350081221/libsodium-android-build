.class public final Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u0005H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\u0008\u0008\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u0005H\u0083\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002\u00b2\u0006\u0017\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onDismissRequest",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "popupPositionProvider",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "ExposedDropdownMenuPopup",
        "(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "SimpleStack",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isTouchExplorationEnabled",
        "currentContent",
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
        "SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,436:1\n74#2:437\n74#2:438\n74#2:439\n1116#3,6:440\n1116#3,6:446\n1116#3,6:452\n1116#3,6:458\n1116#3,6:464\n78#4,11:470\n91#4:501\n78#4,11:502\n91#4:533\n456#5,8:481\n464#5,6:495\n456#5,8:513\n464#5,6:527\n3737#6,6:489\n3737#6,6:521\n81#7:534\n81#7:535\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n*L\n86#1:437\n87#1:438\n88#1:439\n94#1:440,6\n121#1:446,6\n134#1:452,6\n146#1:458,6\n157#1:464,6\n144#1:470,11\n144#1:501\n168#1:502,11\n168#1:533\n144#1:481,8\n144#1:495,6\n168#1:513,8\n168#1:527,6\n144#1:489,6\n168#1:521,6\n89#1:534\n92#1:535\n*E\n"
    }
.end annotation


# direct methods
.method public static final ExposedDropdownMenuPopup(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .param p0    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/window/PopupPositionProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
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
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/window/PopupPositionProvider;",
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
    move-object/from16 v3, p2

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    const v0, -0x2b63c465

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, p5, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v5, v4, 0x6

    .line 19
    .line 20
    move v6, v5

    .line 21
    move-object/from16 v5, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v5, v4, 0x6

    .line 25
    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    move-object/from16 v5, p0

    .line 29
    .line 30
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    const/4 v6, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v6, 0x2

    .line 39
    :goto_0
    or-int/2addr v6, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v5, p0

    .line 42
    .line 43
    move v6, v4

    .line 44
    :goto_1
    and-int/lit8 v7, p5, 0x2

    .line 45
    .line 46
    if-eqz v7, :cond_3

    .line 47
    .line 48
    or-int/lit8 v6, v6, 0x30

    .line 49
    .line 50
    move-object/from16 v15, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v7, v4, 0x30

    .line 54
    .line 55
    move-object/from16 v15, p1

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v7, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v6, v7

    .line 71
    :cond_5
    :goto_3
    and-int/lit8 v7, p5, 0x4

    .line 72
    .line 73
    if-eqz v7, :cond_6

    .line 74
    .line 75
    or-int/lit16 v6, v6, 0x180

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_6
    and-int/lit16 v7, v4, 0x180

    .line 79
    .line 80
    if-nez v7, :cond_8

    .line 81
    .line 82
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_7

    .line 87
    .line 88
    const/16 v7, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v7, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v6, v7

    .line 94
    :cond_8
    :goto_5
    move v14, v6

    .line 95
    and-int/lit16 v6, v14, 0x93

    .line 96
    .line 97
    const/16 v7, 0x92

    .line 98
    .line 99
    if-ne v6, v7, :cond_a

    .line 100
    .line 101
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-nez v6, :cond_9

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 109
    .line 110
    .line 111
    move-object v2, v5

    .line 112
    goto/16 :goto_d

    .line 113
    .line 114
    :cond_a
    :goto_6
    if-eqz v2, :cond_b

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    goto :goto_7

    .line 118
    :cond_b
    move-object v2, v5

    .line 119
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_c

    .line 124
    .line 125
    const/4 v5, -0x1

    .line 126
    const-string v6, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:84)"

    .line 127
    .line 128
    invoke-static {v0, v14, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_c
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Landroid/view/View;

    .line 140
    .line 141
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    move-object/from16 v18, v5

    .line 150
    .line 151
    check-cast v18, Landroidx/compose/ui/unit/Density;

    .line 152
    .line 153
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    move-object v13, v5

    .line 162
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 163
    .line 164
    const/4 v11, 0x0

    .line 165
    invoke-static {v1, v11}, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt;->touchExplorationState(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    invoke-static {v1, v11}, Landroidx/compose/runtime/ComposablesKt;->rememberCompositionContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    shr-int/lit8 v5, v14, 0x6

    .line 174
    .line 175
    and-int/lit8 v5, v5, 0xe

    .line 176
    .line 177
    invoke-static {v3, v1, v5}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    new-array v5, v11, [Ljava/lang/Object;

    .line 182
    .line 183
    const/4 v6, 0x0

    .line 184
    const/4 v7, 0x0

    .line 185
    sget-object v8, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1;->INSTANCE:Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1;

    .line 186
    .line 187
    const/16 v17, 0xc00

    .line 188
    .line 189
    const/16 v19, 0x6

    .line 190
    .line 191
    move-object v12, v9

    .line 192
    move-object v9, v1

    .line 193
    move-object/from16 v20, v10

    .line 194
    .line 195
    move/from16 v10, v17

    .line 196
    .line 197
    move v3, v11

    .line 198
    move/from16 v11, v19

    .line 199
    .line 200
    invoke-static/range {v5 .. v11}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    move-object/from16 v19, v5

    .line 205
    .line 206
    check-cast v19, Ljava/util/UUID;

    .line 207
    .line 208
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    const v6, -0xeb260ea

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    const/4 v11, 0x1

    .line 227
    if-nez v5, :cond_e

    .line 228
    .line 229
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 230
    .line 231
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    if-ne v6, v5, :cond_d

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_d
    move-object v5, v13

    .line 239
    move v7, v14

    .line 240
    goto :goto_9

    .line 241
    :cond_e
    :goto_8
    new-instance v6, Landroidx/compose/material3/internal/PopupLayout;

    .line 242
    .line 243
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Z

    .line 244
    .line 245
    .line 246
    move-result v17

    .line 247
    move-object v5, v13

    .line 248
    move-object v13, v6

    .line 249
    move v7, v14

    .line 250
    move-object v14, v2

    .line 251
    move-object v15, v0

    .line 252
    move-object/from16 v16, p1

    .line 253
    .line 254
    invoke-direct/range {v13 .. v19}, Landroidx/compose/material3/internal/PopupLayout;-><init>(Lv3/a;Landroid/view/View;Landroidx/compose/ui/window/PopupPositionProvider;ZLandroidx/compose/ui/unit/Density;Ljava/util/UUID;)V

    .line 255
    .line 256
    .line 257
    new-instance v0, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1;

    .line 258
    .line 259
    invoke-direct {v0, v6, v12}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1;-><init>(Landroidx/compose/material3/internal/PopupLayout;Landroidx/compose/runtime/State;)V

    .line 260
    .line 261
    .line 262
    const v8, -0x1d6fba3b

    .line 263
    .line 264
    .line 265
    invoke-static {v8, v11, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object/from16 v8, v20

    .line 270
    .line 271
    invoke-virtual {v6, v8, v0}, Landroidx/compose/material3/internal/PopupLayout;->setContent(Landroidx/compose/runtime/CompositionContext;Lv3/p;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_9
    check-cast v6, Landroidx/compose/material3/internal/PopupLayout;

    .line 278
    .line 279
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 280
    .line 281
    .line 282
    const v0, -0xeb25d02

    .line 283
    .line 284
    .line 285
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    and-int/lit8 v7, v7, 0xe

    .line 293
    .line 294
    const/4 v8, 0x4

    .line 295
    if-ne v7, v8, :cond_f

    .line 296
    .line 297
    move v8, v11

    .line 298
    goto :goto_a

    .line 299
    :cond_f
    move v8, v3

    .line 300
    :goto_a
    or-int/2addr v0, v8

    .line 301
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    or-int/2addr v0, v8

    .line 306
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    if-nez v0, :cond_10

    .line 311
    .line 312
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-ne v8, v0, :cond_11

    .line 319
    .line 320
    :cond_10
    new-instance v8, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1;

    .line 321
    .line 322
    invoke-direct {v8, v6, v2, v5}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1;-><init>(Landroidx/compose/material3/internal/PopupLayout;Lv3/a;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_11
    check-cast v8, Lv3/l;

    .line 329
    .line 330
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 331
    .line 332
    .line 333
    invoke-static {v6, v8, v1, v3}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 334
    .line 335
    .line 336
    const v0, -0xeb25bb2

    .line 337
    .line 338
    .line 339
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    const/4 v8, 0x4

    .line 347
    if-ne v7, v8, :cond_12

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_12
    move v11, v3

    .line 351
    :goto_b
    or-int/2addr v0, v11

    .line 352
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    or-int/2addr v0, v7

    .line 357
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    if-nez v0, :cond_13

    .line 362
    .line 363
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-ne v7, v0, :cond_14

    .line 370
    .line 371
    :cond_13
    new-instance v7, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1;

    .line 372
    .line 373
    invoke-direct {v7, v6, v2, v5}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1;-><init>(Landroidx/compose/material3/internal/PopupLayout;Lv3/a;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_14
    check-cast v7, Lv3/a;

    .line 380
    .line 381
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 382
    .line 383
    .line 384
    invoke-static {v7, v1, v3}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 385
    .line 386
    .line 387
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 388
    .line 389
    const v7, -0xeb25a1b

    .line 390
    .line 391
    .line 392
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    if-nez v7, :cond_15

    .line 404
    .line 405
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 406
    .line 407
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    if-ne v8, v7, :cond_16

    .line 412
    .line 413
    :cond_15
    new-instance v8, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$4$1;

    .line 414
    .line 415
    invoke-direct {v8, v6}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$4$1;-><init>(Landroidx/compose/material3/internal/PopupLayout;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_16
    check-cast v8, Lv3/l;

    .line 422
    .line 423
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 424
    .line 425
    .line 426
    invoke-static {v0, v8}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    const v7, -0xeb25846

    .line 431
    .line 432
    .line 433
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    or-int/2addr v7, v8

    .line 445
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    if-nez v7, :cond_17

    .line 450
    .line 451
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 452
    .line 453
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    if-ne v8, v7, :cond_18

    .line 458
    .line 459
    :cond_17
    new-instance v8, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1;

    .line 460
    .line 461
    invoke-direct {v8, v6, v5}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1;-><init>(Landroidx/compose/material3/internal/PopupLayout;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_18
    check-cast v8, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 468
    .line 469
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 470
    .line 471
    .line 472
    const v5, -0x4ee9b9da

    .line 473
    .line 474
    .line 475
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 476
    .line 477
    .line 478
    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 487
    .line 488
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 497
    .line 498
    .line 499
    move-result-object v10

    .line 500
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 501
    .line 502
    if-nez v10, :cond_19

    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 505
    .line 506
    .line 507
    :cond_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 508
    .line 509
    .line 510
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    if-eqz v10, :cond_1a

    .line 515
    .line 516
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 517
    .line 518
    .line 519
    goto :goto_c

    .line 520
    :cond_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 521
    .line 522
    .line 523
    :goto_c
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    invoke-static {v9, v8, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    invoke-static {v9, v6, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    if-nez v7, :cond_1b

    .line 550
    .line 551
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v7

    .line 555
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    if-nez v7, :cond_1c

    .line 564
    .line 565
    :cond_1b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 577
    .line 578
    .line 579
    :cond_1c
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    invoke-interface {v0, v5, v1, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    const v0, 0x7ab4aae9

    .line 595
    .line 596
    .line 597
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 601
    .line 602
    .line 603
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 604
    .line 605
    .line 606
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 607
    .line 608
    .line 609
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_1d

    .line 614
    .line 615
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 616
    .line 617
    .line 618
    :cond_1d
    :goto_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    if-eqz v6, :cond_1e

    .line 623
    .line 624
    new-instance v7, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6;

    .line 625
    .line 626
    move-object v0, v7

    .line 627
    move-object v1, v2

    .line 628
    move-object/from16 v2, p1

    .line 629
    .line 630
    move-object/from16 v3, p2

    .line 631
    .line 632
    move/from16 v4, p4

    .line 633
    .line 634
    move/from16 v5, p5

    .line 635
    .line 636
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6;-><init>(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;II)V

    .line 637
    .line 638
    .line 639
    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 640
    .line 641
    .line 642
    :cond_1e
    return-void
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
.end method

.method private static final ExposedDropdownMenuPopup$lambda$0(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
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

.method private static final ExposedDropdownMenuPopup$lambda$1(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;>;)",
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv3/p;

    return-object p0
.end method

.method private static final SimpleStack(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x1a197bfe

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1;->INSTANCE:Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1;

    .line 8
    .line 9
    shr-int/lit8 v1, p3, 0x3

    .line 10
    .line 11
    and-int/lit8 v1, v1, 0xe

    .line 12
    .line 13
    shl-int/lit8 p3, p3, 0x3

    .line 14
    .line 15
    and-int/lit8 p3, p3, 0x70

    .line 16
    .line 17
    or-int/2addr p3, v1

    .line 18
    const v1, -0x4ee9b9da

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p2, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    shl-int/lit8 p3, p3, 0x9

    .line 44
    .line 45
    and-int/lit16 p3, p3, 0x1c00

    .line 46
    .line 47
    or-int/lit8 p3, p3, 0x6

    .line 48
    .line 49
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    instance-of v5, v5, Landroidx/compose/runtime/Applier;

    .line 54
    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-static {p2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v4, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v4, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_2

    .line 103
    .line 104
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v4, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-static {p2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    shr-int/lit8 v1, p3, 0x3

    .line 141
    .line 142
    and-int/lit8 v1, v1, 0x70

    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {p0, v0, p2, v1}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    const p0, 0x7ab4aae9

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 155
    .line 156
    .line 157
    shr-int/lit8 p0, p3, 0x9

    .line 158
    .line 159
    and-int/lit8 p0, p0, 0xe

    .line 160
    .line 161
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p1, p2, p0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 169
    .line 170
    .line 171
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 172
    .line 173
    .line 174
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 175
    .line 176
    .line 177
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 178
    .line 179
    .line 180
    return-void
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static final synthetic access$ExposedDropdownMenuPopup$lambda$1(Landroidx/compose/runtime/State;)Lv3/p;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt;->ExposedDropdownMenuPopup$lambda$1(Landroidx/compose/runtime/State;)Lv3/p;

    move-result-object p0

    return-object p0
.end method
