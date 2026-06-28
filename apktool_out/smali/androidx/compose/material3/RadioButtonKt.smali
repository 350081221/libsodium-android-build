.class public final Landroidx/compose/material3/RadioButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aO\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "",
        "selected",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "enabled",
        "Landroidx/compose/material3/RadioButtonColors;",
        "colors",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "RadioButton",
        "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "",
        "RadioAnimationDuration",
        "I",
        "Landroidx/compose/ui/unit/Dp;",
        "RadioButtonPadding",
        "F",
        "RadioButtonDotSize",
        "RadioStrokeWidth",
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
        "SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n1116#2,6:269\n1116#2,6:278\n75#3:275\n75#3:277\n154#4:276\n154#4:284\n154#4:285\n154#4:286\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:269,6\n116#1:278,6\n82#1:275\n97#1:277\n82#1:276\n265#1:284\n266#1:285\n267#1:286\n*E\n"
    }
.end annotation


# static fields
.field private static final RadioAnimationDuration:I = 0x64

.field private static final RadioButtonDotSize:F

.field private static final RadioButtonPadding:F

.field private static final RadioStrokeWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonPadding:F

    .line 8
    .line 9
    const/16 v1, 0xc

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sput v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonDotSize:F

    .line 17
    .line 18
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Landroidx/compose/material3/RadioButtonKt;->RadioStrokeWidth:F

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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public static final RadioButton(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .param p1    # Lv3/a;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/material3/RadioButtonColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
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
            "(Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/RadioButtonColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p7

    .line 6
    .line 7
    const v0, 0x185a72e8

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    and-int/lit8 v1, p8, 0x1

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    or-int/lit8 v1, v9, 0x6

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v1, v9, 0x6

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    move v1, v5

    .line 37
    :goto_0
    or-int/2addr v1, v9

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v1, v9

    .line 40
    :goto_1
    and-int/lit8 v2, p8, 0x2

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    or-int/lit8 v1, v1, 0x30

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    and-int/lit8 v2, v9, 0x30

    .line 48
    .line 49
    if-nez v2, :cond_5

    .line 50
    .line 51
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    const/16 v2, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v2, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v1, v2

    .line 63
    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x4

    .line 64
    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    or-int/lit16 v1, v1, 0x180

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_6
    and-int/lit16 v3, v9, 0x180

    .line 71
    .line 72
    if-nez v3, :cond_8

    .line 73
    .line 74
    move-object/from16 v3, p2

    .line 75
    .line 76
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_7

    .line 81
    .line 82
    const/16 v4, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_7
    const/16 v4, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v1, v4

    .line 88
    goto :goto_6

    .line 89
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 90
    .line 91
    :goto_6
    and-int/lit8 v4, p8, 0x8

    .line 92
    .line 93
    if-eqz v4, :cond_9

    .line 94
    .line 95
    or-int/lit16 v1, v1, 0xc00

    .line 96
    .line 97
    goto :goto_8

    .line 98
    :cond_9
    and-int/lit16 v10, v9, 0xc00

    .line 99
    .line 100
    if-nez v10, :cond_b

    .line 101
    .line 102
    move/from16 v10, p3

    .line 103
    .line 104
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-eqz v11, :cond_a

    .line 109
    .line 110
    const/16 v11, 0x800

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_a
    const/16 v11, 0x400

    .line 114
    .line 115
    :goto_7
    or-int/2addr v1, v11

    .line 116
    goto :goto_9

    .line 117
    :cond_b
    :goto_8
    move/from16 v10, p3

    .line 118
    .line 119
    :goto_9
    and-int/lit16 v11, v9, 0x6000

    .line 120
    .line 121
    if-nez v11, :cond_e

    .line 122
    .line 123
    and-int/lit8 v11, p8, 0x10

    .line 124
    .line 125
    if-nez v11, :cond_c

    .line 126
    .line 127
    move-object/from16 v11, p4

    .line 128
    .line 129
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    if-eqz v12, :cond_d

    .line 134
    .line 135
    const/16 v12, 0x4000

    .line 136
    .line 137
    goto :goto_a

    .line 138
    :cond_c
    move-object/from16 v11, p4

    .line 139
    .line 140
    :cond_d
    const/16 v12, 0x2000

    .line 141
    .line 142
    :goto_a
    or-int/2addr v1, v12

    .line 143
    goto :goto_b

    .line 144
    :cond_e
    move-object/from16 v11, p4

    .line 145
    .line 146
    :goto_b
    and-int/lit8 v12, p8, 0x20

    .line 147
    .line 148
    const/high16 v13, 0x30000

    .line 149
    .line 150
    if-eqz v12, :cond_f

    .line 151
    .line 152
    or-int/2addr v1, v13

    .line 153
    goto :goto_d

    .line 154
    :cond_f
    and-int/2addr v13, v9

    .line 155
    if-nez v13, :cond_11

    .line 156
    .line 157
    move-object/from16 v13, p5

    .line 158
    .line 159
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_10

    .line 164
    .line 165
    const/high16 v14, 0x20000

    .line 166
    .line 167
    goto :goto_c

    .line 168
    :cond_10
    const/high16 v14, 0x10000

    .line 169
    .line 170
    :goto_c
    or-int/2addr v1, v14

    .line 171
    goto :goto_e

    .line 172
    :cond_11
    :goto_d
    move-object/from16 v13, p5

    .line 173
    .line 174
    :goto_e
    const v14, 0x12493

    .line 175
    .line 176
    .line 177
    and-int/2addr v14, v1

    .line 178
    const v15, 0x12492

    .line 179
    .line 180
    .line 181
    if-ne v14, v15, :cond_13

    .line 182
    .line 183
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-nez v14, :cond_12

    .line 188
    .line 189
    goto :goto_f

    .line 190
    :cond_12
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    move v4, v10

    .line 194
    move-object v5, v11

    .line 195
    move-object v11, v6

    .line 196
    move-object v6, v13

    .line 197
    goto/16 :goto_17

    .line 198
    .line 199
    :cond_13
    :goto_f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 200
    .line 201
    .line 202
    and-int/lit8 v14, v9, 0x1

    .line 203
    .line 204
    const v15, -0xe001

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x6

    .line 208
    if-eqz v14, :cond_16

    .line 209
    .line 210
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_14

    .line 215
    .line 216
    goto :goto_11

    .line 217
    :cond_14
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 218
    .line 219
    .line 220
    and-int/lit8 v2, p8, 0x10

    .line 221
    .line 222
    if-eqz v2, :cond_15

    .line 223
    .line 224
    and-int/2addr v1, v15

    .line 225
    :cond_15
    move-object/from16 v17, p5

    .line 226
    .line 227
    move-object v4, v3

    .line 228
    :goto_10
    move v3, v10

    .line 229
    move-object v2, v11

    .line 230
    goto :goto_13

    .line 231
    :cond_16
    :goto_11
    if-eqz v2, :cond_17

    .line 232
    .line 233
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 234
    .line 235
    goto :goto_12

    .line 236
    :cond_17
    move-object v2, v3

    .line 237
    :goto_12
    if-eqz v4, :cond_18

    .line 238
    .line 239
    const/4 v3, 0x1

    .line 240
    move v10, v3

    .line 241
    :cond_18
    and-int/lit8 v3, p8, 0x10

    .line 242
    .line 243
    if-eqz v3, :cond_19

    .line 244
    .line 245
    sget-object v3, Landroidx/compose/material3/RadioButtonDefaults;->INSTANCE:Landroidx/compose/material3/RadioButtonDefaults;

    .line 246
    .line 247
    invoke-virtual {v3, v6, v13}, Landroidx/compose/material3/RadioButtonDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RadioButtonColors;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    and-int/2addr v1, v15

    .line 252
    move-object v11, v3

    .line 253
    :cond_19
    if-eqz v12, :cond_1b

    .line 254
    .line 255
    const v3, 0x2bd78adb

    .line 256
    .line 257
    .line 258
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 266
    .line 267
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    if-ne v3, v4, :cond_1a

    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_1a
    check-cast v3, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 281
    .line 282
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 283
    .line 284
    .line 285
    move-object v4, v2

    .line 286
    move-object/from16 v17, v3

    .line 287
    .line 288
    goto :goto_10

    .line 289
    :cond_1b
    move-object/from16 v17, p5

    .line 290
    .line 291
    move-object v4, v2

    .line 292
    goto :goto_10

    .line 293
    :goto_13
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-eqz v10, :cond_1c

    .line 301
    .line 302
    const/4 v10, -0x1

    .line 303
    const-string v11, "androidx.compose.material3.RadioButton (RadioButton.kt:79)"

    .line 304
    .line 305
    invoke-static {v0, v1, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :cond_1c
    const/4 v0, 0x0

    .line 309
    if-eqz v7, :cond_1d

    .line 310
    .line 311
    sget v10, Landroidx/compose/material3/RadioButtonKt;->RadioButtonDotSize:F

    .line 312
    .line 313
    int-to-float v11, v5

    .line 314
    div-float/2addr v10, v11

    .line 315
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    goto :goto_14

    .line 320
    :cond_1d
    int-to-float v10, v0

    .line 321
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    :goto_14
    const/16 v11, 0x64

    .line 326
    .line 327
    const/4 v15, 0x0

    .line 328
    invoke-static {v11, v0, v15, v13, v15}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 329
    .line 330
    .line 331
    move-result-object v11

    .line 332
    const/4 v12, 0x0

    .line 333
    const/4 v14, 0x0

    .line 334
    const/16 v16, 0x30

    .line 335
    .line 336
    const/16 v18, 0xc

    .line 337
    .line 338
    move/from16 v19, v13

    .line 339
    .line 340
    move-object v13, v14

    .line 341
    move-object v14, v6

    .line 342
    move/from16 v15, v16

    .line 343
    .line 344
    move/from16 v16, v18

    .line 345
    .line 346
    invoke-static/range {v10 .. v16}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateDpAsState-AjpBEmI(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    shr-int/lit8 v10, v1, 0x9

    .line 351
    .line 352
    and-int/lit8 v10, v10, 0xe

    .line 353
    .line 354
    shl-int/lit8 v11, v1, 0x3

    .line 355
    .line 356
    and-int/lit8 v11, v11, 0x70

    .line 357
    .line 358
    or-int/2addr v10, v11

    .line 359
    shr-int/lit8 v1, v1, 0x6

    .line 360
    .line 361
    and-int/lit16 v1, v1, 0x380

    .line 362
    .line 363
    or-int/2addr v1, v10

    .line 364
    invoke-virtual {v2, v3, v7, v6, v1}, Landroidx/compose/material3/RadioButtonColors;->radioColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    const v10, 0x2bd78c1f

    .line 369
    .line 370
    .line 371
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 372
    .line 373
    .line 374
    if-eqz v8, :cond_1e

    .line 375
    .line 376
    sget-object v18, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 377
    .line 378
    sget-object v10, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 379
    .line 380
    invoke-virtual {v10}, Landroidx/compose/ui/semantics/Role$Companion;->getRadioButton-o7Vup1c()I

    .line 381
    .line 382
    .line 383
    move-result v19

    .line 384
    const/4 v10, 0x0

    .line 385
    sget-object v11, Landroidx/compose/material3/tokens/RadioButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/RadioButtonTokens;

    .line 386
    .line 387
    invoke-virtual {v11}, Landroidx/compose/material3/tokens/RadioButtonTokens;->getStateLayerSize-D9Ej5fM()F

    .line 388
    .line 389
    .line 390
    move-result v11

    .line 391
    int-to-float v12, v5

    .line 392
    div-float/2addr v11, v12

    .line 393
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    const-wide/16 v12, 0x0

    .line 398
    .line 399
    const/16 v16, 0x36

    .line 400
    .line 401
    const/16 v20, 0x4

    .line 402
    .line 403
    move-object v14, v6

    .line 404
    move-object/from16 v21, v15

    .line 405
    .line 406
    move/from16 v15, v16

    .line 407
    .line 408
    move/from16 v16, v20

    .line 409
    .line 410
    invoke-static/range {v10 .. v16}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 411
    .line 412
    .line 413
    move-result-object v10

    .line 414
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    move v12, v0

    .line 419
    move-object/from16 v0, v18

    .line 420
    .line 421
    move-object v13, v1

    .line 422
    move/from16 v1, p0

    .line 423
    .line 424
    move-object v14, v2

    .line 425
    move-object/from16 v2, v17

    .line 426
    .line 427
    move v15, v3

    .line 428
    move-object v3, v10

    .line 429
    move-object v10, v4

    .line 430
    move v4, v15

    .line 431
    move v7, v5

    .line 432
    move-object v5, v11

    .line 433
    move-object v11, v6

    .line 434
    move-object/from16 v6, p1

    .line 435
    .line 436
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lv3/a;)Landroidx/compose/ui/Modifier;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    goto :goto_15

    .line 441
    :cond_1e
    move v12, v0

    .line 442
    move-object v13, v1

    .line 443
    move-object v14, v2

    .line 444
    move-object v10, v4

    .line 445
    move v7, v5

    .line 446
    move-object v11, v6

    .line 447
    move-object/from16 v21, v15

    .line 448
    .line 449
    move v15, v3

    .line 450
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 451
    .line 452
    :goto_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 453
    .line 454
    .line 455
    if-eqz v8, :cond_1f

    .line 456
    .line 457
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 458
    .line 459
    invoke-static {v1}, Landroidx/compose/material3/InteractiveComponentSizeKt;->minimumInteractiveComponentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    goto :goto_16

    .line 464
    :cond_1f
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 465
    .line 466
    :goto_16
    invoke-interface {v10, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 475
    .line 476
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    const/4 v2, 0x0

    .line 481
    invoke-static {v0, v1, v12, v7, v2}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sget v1, Landroidx/compose/material3/RadioButtonKt;->RadioButtonPadding:F

    .line 486
    .line 487
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    sget-object v1, Landroidx/compose/material3/tokens/RadioButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/RadioButtonTokens;

    .line 492
    .line 493
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/RadioButtonTokens;->getIconSize-D9Ej5fM()F

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->requiredSize-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const v1, 0x2bd78ff8

    .line 502
    .line 503
    .line 504
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    move-object/from16 v2, v21

    .line 512
    .line 513
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    or-int/2addr v1, v3

    .line 518
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    if-nez v1, :cond_20

    .line 523
    .line 524
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 525
    .line 526
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    if-ne v3, v1, :cond_21

    .line 531
    .line 532
    :cond_20
    new-instance v3, Landroidx/compose/material3/RadioButtonKt$RadioButton$2$1;

    .line 533
    .line 534
    invoke-direct {v3, v13, v2}, Landroidx/compose/material3/RadioButtonKt$RadioButton$2$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    :cond_21
    check-cast v3, Lv3/l;

    .line 541
    .line 542
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 543
    .line 544
    .line 545
    invoke-static {v0, v3, v11, v12}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 546
    .line 547
    .line 548
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_22

    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 555
    .line 556
    .line 557
    :cond_22
    move-object v3, v10

    .line 558
    move-object v5, v14

    .line 559
    move v4, v15

    .line 560
    move-object/from16 v6, v17

    .line 561
    .line 562
    :goto_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 563
    .line 564
    .line 565
    move-result-object v10

    .line 566
    if-eqz v10, :cond_23

    .line 567
    .line 568
    new-instance v11, Landroidx/compose/material3/RadioButtonKt$RadioButton$3;

    .line 569
    .line 570
    move-object v0, v11

    .line 571
    move/from16 v1, p0

    .line 572
    .line 573
    move-object/from16 v2, p1

    .line 574
    .line 575
    move/from16 v7, p7

    .line 576
    .line 577
    move/from16 v8, p8

    .line 578
    .line 579
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/RadioButtonKt$RadioButton$3;-><init>(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 583
    .line 584
    .line 585
    :cond_23
    return-void
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
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
.end method

.method public static final synthetic access$getRadioStrokeWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/RadioButtonKt;->RadioStrokeWidth:F

    return v0
.end method
