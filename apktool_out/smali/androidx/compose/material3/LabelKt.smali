.class public final Landroidx/compose/material3/LabelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a^\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a2\u0006\u0002\u0008\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00020\u000c\u00a2\u0006\u0002\u0008\u0003H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017\u00b2\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Landroidx/compose/material3/CaretScope;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "label",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "",
        "isPersistent",
        "Lkotlin/Function0;",
        "content",
        "Label",
        "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "enabled",
        "Landroidx/compose/material3/BasicTooltipState;",
        "state",
        "HandleInteractions",
        "(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "anchorBounds",
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
        "SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1116#2,6:147\n1116#2,6:153\n1116#2,6:159\n1116#2,6:165\n1116#2,6:171\n81#3:177\n107#3,2:178\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n*L\n67#1:147,6\n74#1:153,6\n78#1:159,6\n79#1:165,6\n120#1:171,6\n78#1:177\n78#1:178,2\n*E\n"
    }
.end annotation


# direct methods
.method private static final HandleInteractions(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    const v0, -0x582ba681

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v2, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v1, v2

    .line 41
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 42
    .line 43
    const/16 v4, 0x100

    .line 44
    .line 45
    if-nez v2, :cond_5

    .line 46
    .line 47
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    move v2, v4

    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/16 v2, 0x80

    .line 56
    .line 57
    :goto_3
    or-int/2addr v1, v2

    .line 58
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 59
    .line 60
    const/16 v5, 0x92

    .line 61
    .line 62
    if-ne v2, v5, :cond_7

    .line 63
    .line 64
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 72
    .line 73
    .line 74
    goto :goto_7

    .line 75
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_8

    .line 80
    .line 81
    const/4 v2, -0x1

    .line 82
    const-string v5, "androidx.compose.material3.HandleInteractions (Label.kt:117)"

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_8
    if-eqz p0, :cond_d

    .line 88
    .line 89
    const v0, -0x1817ab41

    .line 90
    .line 91
    .line 92
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 93
    .line 94
    .line 95
    and-int/lit16 v0, v1, 0x380

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    const/4 v5, 0x0

    .line 99
    if-ne v0, v4, :cond_9

    .line 100
    .line 101
    move v0, v2

    .line 102
    goto :goto_5

    .line 103
    :cond_9
    move v0, v5

    .line 104
    :goto_5
    and-int/lit8 v4, v1, 0x70

    .line 105
    .line 106
    if-ne v4, v3, :cond_a

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_a
    move v2, v5

    .line 110
    :goto_6
    or-int/2addr v0, v2

    .line 111
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v0, :cond_b

    .line 116
    .line 117
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-ne v2, v0, :cond_c

    .line 124
    .line 125
    :cond_b
    new-instance v2, Landroidx/compose/material3/LabelKt$HandleInteractions$1$1;

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-direct {v2, p2, p1, v0}, Landroidx/compose/material3/LabelKt$HandleInteractions$1$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/BasicTooltipState;Lkotlin/coroutines/d;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_c
    check-cast v2, Lv3/p;

    .line 135
    .line 136
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 137
    .line 138
    .line 139
    shr-int/lit8 v0, v1, 0x6

    .line 140
    .line 141
    and-int/lit8 v0, v0, 0xe

    .line 142
    .line 143
    invoke-static {p2, v2, p3, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 144
    .line 145
    .line 146
    :cond_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_e

    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 153
    .line 154
    .line 155
    :cond_e
    :goto_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    if-eqz p3, :cond_f

    .line 160
    .line 161
    new-instance v0, Landroidx/compose/material3/LabelKt$HandleInteractions$2;

    .line 162
    .line 163
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/material3/LabelKt$HandleInteractions$2;-><init>(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 167
    .line 168
    .line 169
    :cond_f
    return-void
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
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
.end method

.method public static final Label(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .param p0    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/CaretScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
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
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const v0, -0x2072dfde

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p5

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, p7, 0x1

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    or-int/lit8 v3, v6, 0x6

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v6, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v3, v4

    .line 37
    :goto_0
    or-int/2addr v3, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v3, v6

    .line 40
    :goto_1
    and-int/lit8 v7, p7, 0x2

    .line 41
    .line 42
    if-eqz v7, :cond_3

    .line 43
    .line 44
    or-int/lit8 v3, v3, 0x30

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    and-int/lit8 v8, v6, 0x30

    .line 48
    .line 49
    if-nez v8, :cond_5

    .line 50
    .line 51
    move-object/from16 v8, p1

    .line 52
    .line 53
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_4

    .line 58
    .line 59
    const/16 v9, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/16 v9, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v3, v9

    .line 65
    goto :goto_4

    .line 66
    :cond_5
    :goto_3
    move-object/from16 v8, p1

    .line 67
    .line 68
    :goto_4
    and-int/lit8 v9, p7, 0x4

    .line 69
    .line 70
    if-eqz v9, :cond_6

    .line 71
    .line 72
    or-int/lit16 v3, v3, 0x180

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_6
    and-int/lit16 v10, v6, 0x180

    .line 76
    .line 77
    if-nez v10, :cond_8

    .line 78
    .line 79
    move-object/from16 v10, p2

    .line 80
    .line 81
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-eqz v11, :cond_7

    .line 86
    .line 87
    const/16 v11, 0x100

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_7
    const/16 v11, 0x80

    .line 91
    .line 92
    :goto_5
    or-int/2addr v3, v11

    .line 93
    goto :goto_7

    .line 94
    :cond_8
    :goto_6
    move-object/from16 v10, p2

    .line 95
    .line 96
    :goto_7
    and-int/lit8 v11, p7, 0x8

    .line 97
    .line 98
    if-eqz v11, :cond_9

    .line 99
    .line 100
    or-int/lit16 v3, v3, 0xc00

    .line 101
    .line 102
    goto :goto_9

    .line 103
    :cond_9
    and-int/lit16 v12, v6, 0xc00

    .line 104
    .line 105
    if-nez v12, :cond_b

    .line 106
    .line 107
    move/from16 v12, p3

    .line 108
    .line 109
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    if-eqz v13, :cond_a

    .line 114
    .line 115
    const/16 v13, 0x800

    .line 116
    .line 117
    goto :goto_8

    .line 118
    :cond_a
    const/16 v13, 0x400

    .line 119
    .line 120
    :goto_8
    or-int/2addr v3, v13

    .line 121
    goto :goto_a

    .line 122
    :cond_b
    :goto_9
    move/from16 v12, p3

    .line 123
    .line 124
    :goto_a
    and-int/lit8 v13, p7, 0x10

    .line 125
    .line 126
    if-eqz v13, :cond_c

    .line 127
    .line 128
    or-int/lit16 v3, v3, 0x6000

    .line 129
    .line 130
    goto :goto_c

    .line 131
    :cond_c
    and-int/lit16 v13, v6, 0x6000

    .line 132
    .line 133
    if-nez v13, :cond_e

    .line 134
    .line 135
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_d

    .line 140
    .line 141
    const/16 v13, 0x4000

    .line 142
    .line 143
    goto :goto_b

    .line 144
    :cond_d
    const/16 v13, 0x2000

    .line 145
    .line 146
    :goto_b
    or-int/2addr v3, v13

    .line 147
    :cond_e
    :goto_c
    and-int/lit16 v13, v3, 0x2493

    .line 148
    .line 149
    const/16 v14, 0x2492

    .line 150
    .line 151
    if-ne v13, v14, :cond_10

    .line 152
    .line 153
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-nez v13, :cond_f

    .line 158
    .line 159
    goto :goto_d

    .line 160
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 161
    .line 162
    .line 163
    move-object v3, v10

    .line 164
    move v4, v12

    .line 165
    goto/16 :goto_12

    .line 166
    .line 167
    :cond_10
    :goto_d
    if-eqz v7, :cond_11

    .line 168
    .line 169
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 170
    .line 171
    move-object/from16 v17, v7

    .line 172
    .line 173
    goto :goto_e

    .line 174
    :cond_11
    move-object/from16 v17, v8

    .line 175
    .line 176
    :goto_e
    if-eqz v9, :cond_13

    .line 177
    .line 178
    const v7, -0x7adf75b3

    .line 179
    .line 180
    .line 181
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 189
    .line 190
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    if-ne v7, v8, :cond_12

    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_12
    check-cast v7, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 204
    .line 205
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 206
    .line 207
    .line 208
    move-object v15, v7

    .line 209
    goto :goto_f

    .line 210
    :cond_13
    move-object v15, v10

    .line 211
    :goto_f
    const/4 v7, 0x0

    .line 212
    if-eqz v11, :cond_14

    .line 213
    .line 214
    move/from16 v18, v7

    .line 215
    .line 216
    goto :goto_10

    .line 217
    :cond_14
    move/from16 v18, v12

    .line 218
    .line 219
    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eqz v8, :cond_15

    .line 224
    .line 225
    const/4 v8, -0x1

    .line 226
    const-string v9, "androidx.compose.material3.Label (Label.kt:69)"

    .line 227
    .line 228
    invoke-static {v0, v3, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_15
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    const/16 v9, 0x30

    .line 235
    .line 236
    const/4 v13, 0x1

    .line 237
    invoke-virtual {v0, v8, v2, v9, v13}, Landroidx/compose/material3/TooltipDefaults;->rememberPlainTooltipPositionProvider-kHDZbjc(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const/4 v14, 0x0

    .line 242
    if-eqz v18, :cond_17

    .line 243
    .line 244
    const v8, -0x7adf748c

    .line 245
    .line 246
    .line 247
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 258
    .line 259
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    if-ne v8, v9, :cond_16

    .line 264
    .line 265
    new-instance v8, Landroidx/compose/material3/LabelStateImpl;

    .line 266
    .line 267
    const/4 v9, 0x3

    .line 268
    invoke-direct {v8, v7, v7, v9, v14}, Landroidx/compose/material3/LabelStateImpl;-><init>(ZZILkotlin/jvm/internal/w;)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_16
    check-cast v8, Landroidx/compose/material3/LabelStateImpl;

    .line 275
    .line 276
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 277
    .line 278
    .line 279
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 280
    .line 281
    .line 282
    goto :goto_11

    .line 283
    :cond_17
    const v7, -0x7adf745d

    .line 284
    .line 285
    .line 286
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 287
    .line 288
    .line 289
    const/4 v7, 0x0

    .line 290
    const/4 v8, 0x0

    .line 291
    new-instance v9, Landroidx/compose/foundation/MutatorMutex;

    .line 292
    .line 293
    invoke-direct {v9}, Landroidx/compose/foundation/MutatorMutex;-><init>()V

    .line 294
    .line 295
    .line 296
    const/4 v11, 0x0

    .line 297
    const/4 v12, 0x3

    .line 298
    move-object v10, v2

    .line 299
    invoke-static/range {v7 .. v12}, Landroidx/compose/material3/BasicTooltipKt;->rememberBasicTooltipState(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BasicTooltipState;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 304
    .line 305
    .line 306
    :goto_11
    move-object v12, v8

    .line 307
    const v7, -0x7adf73f7

    .line 308
    .line 309
    .line 310
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 318
    .line 319
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    if-ne v7, v9, :cond_18

    .line 324
    .line 325
    invoke-static {v14, v14, v4, v14}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_18
    check-cast v7, Landroidx/compose/runtime/MutableState;

    .line 333
    .line 334
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 335
    .line 336
    .line 337
    const v4, -0x7adf73c5

    .line 338
    .line 339
    .line 340
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    if-ne v4, v8, :cond_19

    .line 352
    .line 353
    new-instance v4, Landroidx/compose/material3/LabelKt$Label$scope$1$1;

    .line 354
    .line 355
    invoke-direct {v4, v7}, Landroidx/compose/material3/LabelKt$Label$scope$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_19
    check-cast v4, Landroidx/compose/material3/LabelKt$Label$scope$1$1;

    .line 362
    .line 363
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 364
    .line 365
    .line 366
    new-instance v8, Landroidx/compose/material3/LabelKt$Label$wrappedContent$1;

    .line 367
    .line 368
    invoke-direct {v8, v7, v5}, Landroidx/compose/material3/LabelKt$Label$wrappedContent$1;-><init>(Landroidx/compose/runtime/MutableState;Lv3/p;)V

    .line 369
    .line 370
    .line 371
    const v7, 0x7445ac90

    .line 372
    .line 373
    .line 374
    invoke-static {v2, v7, v13, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 375
    .line 376
    .line 377
    move-result-object v14

    .line 378
    new-instance v7, Landroidx/compose/material3/LabelKt$Label$2;

    .line 379
    .line 380
    invoke-direct {v7, v1, v4}, Landroidx/compose/material3/LabelKt$Label$2;-><init>(Lv3/q;Landroidx/compose/material3/LabelKt$Label$scope$1$1;)V

    .line 381
    .line 382
    .line 383
    const v4, 0x2ebde4ac

    .line 384
    .line 385
    .line 386
    invoke-static {v2, v4, v13, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    const/4 v11, 0x0

    .line 391
    const/4 v4, 0x0

    .line 392
    shl-int/lit8 v7, v3, 0x6

    .line 393
    .line 394
    and-int/lit16 v7, v7, 0x1c00

    .line 395
    .line 396
    const v9, 0x1b6030

    .line 397
    .line 398
    .line 399
    or-int v16, v7, v9

    .line 400
    .line 401
    const/16 v19, 0x0

    .line 402
    .line 403
    move-object v7, v0

    .line 404
    move-object v9, v12

    .line 405
    move-object/from16 v10, v17

    .line 406
    .line 407
    move-object v0, v12

    .line 408
    move v12, v4

    .line 409
    move-object v13, v14

    .line 410
    move-object v14, v2

    .line 411
    move-object v4, v15

    .line 412
    move/from16 v15, v16

    .line 413
    .line 414
    move/from16 v16, v19

    .line 415
    .line 416
    invoke-static/range {v7 .. v16}, Landroidx/compose/material3/BasicTooltip_androidKt;->BasicTooltipBox(Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/material3/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 417
    .line 418
    .line 419
    xor-int/lit8 v7, v18, 0x1

    .line 420
    .line 421
    and-int/lit16 v3, v3, 0x380

    .line 422
    .line 423
    invoke-static {v7, v0, v4, v2, v3}, Landroidx/compose/material3/LabelKt;->HandleInteractions(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V

    .line 424
    .line 425
    .line 426
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-eqz v0, :cond_1a

    .line 431
    .line 432
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 433
    .line 434
    .line 435
    :cond_1a
    move-object v3, v4

    .line 436
    move-object/from16 v8, v17

    .line 437
    .line 438
    move/from16 v4, v18

    .line 439
    .line 440
    :goto_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    if-eqz v9, :cond_1b

    .line 445
    .line 446
    new-instance v10, Landroidx/compose/material3/LabelKt$Label$3;

    .line 447
    .line 448
    move-object v0, v10

    .line 449
    move-object/from16 v1, p0

    .line 450
    .line 451
    move-object v2, v8

    .line 452
    move-object/from16 v5, p4

    .line 453
    .line 454
    move/from16 v6, p6

    .line 455
    .line 456
    move/from16 v7, p7

    .line 457
    .line 458
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/LabelKt$Label$3;-><init>(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;II)V

    .line 459
    .line 460
    .line 461
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 462
    .line 463
    .line 464
    :cond_1b
    return-void
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

.method private static final Label$lambda$3(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            ">;)",
            "Landroidx/compose/ui/layout/LayoutCoordinates;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/layout/LayoutCoordinates;

    return-object p0
.end method

.method private static final Label$lambda$4(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            ">;",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$HandleInteractions(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/LabelKt;->HandleInteractions(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$Label$lambda$3(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material3/LabelKt;->Label$lambda$3(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$Label$lambda$4(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material3/LabelKt;->Label$lambda$4(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    return-void
.end method
