.class public final Landroidx/compose/material3/MaterialThemeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a@\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0008\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/material3/ColorScheme;",
        "colorScheme",
        "Landroidx/compose/material3/Shapes;",
        "shapes",
        "Landroidx/compose/material3/Typography;",
        "typography",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "MaterialTheme",
        "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "rememberTextSelectionColors",
        "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "Landroidx/compose/material/ripple/RippleAlpha;",
        "DefaultRippleAlpha",
        "Landroidx/compose/material/ripple/RippleAlpha;",
        "",
        "TextSelectionBackgroundOpacity",
        "F",
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
        "SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,139:1\n1116#2,6:140\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n129#1:140,6\n*E\n"
    }
.end annotation


# static fields
.field private static final DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final TextSelectionBackgroundOpacity:F = 0.4f


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroidx/compose/material/ripple/RippleAlpha;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3da3d70a    # 0.08f

    const v3, 0x3e23d70a    # 0.16f

    invoke-direct {v0, v3, v1, v2, v1}, Landroidx/compose/material/ripple/RippleAlpha;-><init>(FFFF)V

    sput-object v0, Landroidx/compose/material3/MaterialThemeKt;->DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;

    return-void
.end method

.method public static final MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .param p0    # Landroidx/compose/material3/ColorScheme;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material3/Shapes;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/Typography;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/ColorScheme;",
            "Landroidx/compose/material3/Shapes;",
            "Landroidx/compose/material3/Typography;",
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
    move-object/from16 v4, p3

    .line 2
    .line 3
    move/from16 v5, p5

    .line 4
    .line 5
    const v0, -0x7ec9fb7e

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v5, 0x6

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    const/4 v13, 0x2

    .line 18
    if-nez v2, :cond_2

    .line 19
    .line 20
    and-int/lit8 v2, p6, 0x1

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    move v6, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object/from16 v2, p0

    .line 35
    .line 36
    :cond_1
    move v6, v13

    .line 37
    :goto_0
    or-int/2addr v6, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v2, p0

    .line 40
    .line 41
    move v6, v5

    .line 42
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 43
    .line 44
    if-nez v7, :cond_5

    .line 45
    .line 46
    and-int/lit8 v7, p6, 0x2

    .line 47
    .line 48
    if-nez v7, :cond_3

    .line 49
    .line 50
    move-object/from16 v7, p1

    .line 51
    .line 52
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-object/from16 v7, p1

    .line 62
    .line 63
    :cond_4
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v6, v8

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    move-object/from16 v7, p1

    .line 68
    .line 69
    :goto_3
    and-int/lit16 v8, v5, 0x180

    .line 70
    .line 71
    if-nez v8, :cond_8

    .line 72
    .line 73
    and-int/lit8 v8, p6, 0x4

    .line 74
    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    move-object/from16 v8, p2

    .line 78
    .line 79
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_7

    .line 84
    .line 85
    const/16 v9, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move-object/from16 v8, p2

    .line 89
    .line 90
    :cond_7
    const/16 v9, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v6, v9

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    move-object/from16 v8, p2

    .line 95
    .line 96
    :goto_5
    and-int/lit8 v9, p6, 0x8

    .line 97
    .line 98
    if-eqz v9, :cond_9

    .line 99
    .line 100
    or-int/lit16 v6, v6, 0xc00

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_9
    and-int/lit16 v9, v5, 0xc00

    .line 104
    .line 105
    if-nez v9, :cond_b

    .line 106
    .line 107
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_a

    .line 112
    .line 113
    const/16 v9, 0x800

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_a
    const/16 v9, 0x400

    .line 117
    .line 118
    :goto_6
    or-int/2addr v6, v9

    .line 119
    :cond_b
    :goto_7
    and-int/lit16 v9, v6, 0x493

    .line 120
    .line 121
    const/16 v10, 0x492

    .line 122
    .line 123
    if-ne v9, v10, :cond_d

    .line 124
    .line 125
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-nez v9, :cond_c

    .line 130
    .line 131
    goto :goto_8

    .line 132
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 133
    .line 134
    .line 135
    move-object v15, v7

    .line 136
    move-object v3, v8

    .line 137
    goto/16 :goto_b

    .line 138
    .line 139
    :cond_d
    :goto_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 140
    .line 141
    .line 142
    and-int/lit8 v9, v5, 0x1

    .line 143
    .line 144
    const/4 v14, 0x6

    .line 145
    if-eqz v9, :cond_11

    .line 146
    .line 147
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_e

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 155
    .line 156
    .line 157
    and-int/lit8 v9, p6, 0x1

    .line 158
    .line 159
    if-eqz v9, :cond_f

    .line 160
    .line 161
    and-int/lit8 v6, v6, -0xf

    .line 162
    .line 163
    :cond_f
    and-int/lit8 v9, p6, 0x2

    .line 164
    .line 165
    if-eqz v9, :cond_10

    .line 166
    .line 167
    and-int/lit8 v6, v6, -0x71

    .line 168
    .line 169
    :cond_10
    and-int/lit8 v9, p6, 0x4

    .line 170
    .line 171
    if-eqz v9, :cond_14

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_11
    :goto_9
    and-int/lit8 v9, p6, 0x1

    .line 175
    .line 176
    if-eqz v9, :cond_12

    .line 177
    .line 178
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 179
    .line 180
    invoke-virtual {v2, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    and-int/lit8 v6, v6, -0xf

    .line 185
    .line 186
    :cond_12
    and-int/lit8 v9, p6, 0x2

    .line 187
    .line 188
    if-eqz v9, :cond_13

    .line 189
    .line 190
    sget-object v7, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 191
    .line 192
    invoke-virtual {v7, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    and-int/lit8 v6, v6, -0x71

    .line 197
    .line 198
    :cond_13
    and-int/lit8 v9, p6, 0x4

    .line 199
    .line 200
    if-eqz v9, :cond_14

    .line 201
    .line 202
    sget-object v8, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 203
    .line 204
    invoke-virtual {v8, v1, v14}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    :goto_a
    and-int/lit16 v6, v6, -0x381

    .line 209
    .line 210
    :cond_14
    move v11, v6

    .line 211
    move-object v15, v7

    .line 212
    move-object v12, v8

    .line 213
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 214
    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_15

    .line 221
    .line 222
    const/4 v6, -0x1

    .line 223
    const-string v7, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:60)"

    .line 224
    .line 225
    invoke-static {v0, v11, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :cond_15
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const-wide/16 v8, 0x0

    .line 231
    .line 232
    const/4 v0, 0x0

    .line 233
    const/16 v16, 0x7

    .line 234
    .line 235
    move-object v10, v1

    .line 236
    move/from16 v17, v11

    .line 237
    .line 238
    move v11, v0

    .line 239
    move-object v0, v12

    .line 240
    move/from16 v12, v16

    .line 241
    .line 242
    invoke-static/range {v6 .. v12}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    and-int/lit8 v7, v17, 0xe

    .line 247
    .line 248
    invoke-static {v2, v1, v7}, Landroidx/compose/material3/MaterialThemeKt;->rememberTextSelectionColors(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    new-array v8, v14, [Landroidx/compose/runtime/ProvidedValue;

    .line 253
    .line 254
    invoke-static {}, Landroidx/compose/material3/ColorSchemeKt;->getLocalColorScheme()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-virtual {v9, v2}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    const/4 v10, 0x0

    .line 263
    aput-object v9, v8, v10

    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/foundation/IndicationKt;->getLocalIndication()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-virtual {v9, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    const/4 v9, 0x1

    .line 274
    aput-object v6, v8, v9

    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/material/ripple/RippleThemeKt;->getLocalRippleTheme()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    sget-object v10, Landroidx/compose/material3/MaterialRippleTheme;->INSTANCE:Landroidx/compose/material3/MaterialRippleTheme;

    .line 281
    .line 282
    invoke-virtual {v6, v10}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    aput-object v6, v8, v13

    .line 287
    .line 288
    invoke-static {}, Landroidx/compose/material3/ShapesKt;->getLocalShapes()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-virtual {v6, v15}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    const/4 v10, 0x3

    .line 297
    aput-object v6, v8, v10

    .line 298
    .line 299
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    aput-object v6, v8, v3

    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/material3/TypographyKt;->getLocalTypography()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v3, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    const/4 v6, 0x5

    .line 318
    aput-object v3, v8, v6

    .line 319
    .line 320
    new-instance v3, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$1;

    .line 321
    .line 322
    invoke-direct {v3, v0, v4}, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$1;-><init>(Landroidx/compose/material3/Typography;Lv3/p;)V

    .line 323
    .line 324
    .line 325
    const v6, -0x3f9276be

    .line 326
    .line 327
    .line 328
    invoke-static {v1, v6, v9, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    const/16 v6, 0x30

    .line 333
    .line 334
    invoke-static {v8, v3, v1, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 335
    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_16

    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 344
    .line 345
    .line 346
    :cond_16
    move-object v3, v0

    .line 347
    :goto_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    if-eqz v7, :cond_17

    .line 352
    .line 353
    new-instance v8, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$2;

    .line 354
    .line 355
    move-object v0, v8

    .line 356
    move-object v1, v2

    .line 357
    move-object v2, v15

    .line 358
    move-object/from16 v4, p3

    .line 359
    .line 360
    move/from16 v5, p5

    .line 361
    .line 362
    move/from16 v6, p6

    .line 363
    .line 364
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/MaterialThemeKt$MaterialTheme$2;-><init>(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lv3/p;II)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 368
    .line 369
    .line 370
    :cond_17
    return-void
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
.end method

.method public static final synthetic access$getDefaultRippleAlpha$p()Landroidx/compose/material/ripple/RippleAlpha;
    .locals 1

    sget-object v0, Landroidx/compose/material3/MaterialThemeKt;->DefaultRippleAlpha:Landroidx/compose/material/ripple/RippleAlpha;

    return-object v0
.end method

.method public static final rememberTextSelectionColors(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;
    .locals 11
    .param p0    # Landroidx/compose/material3/ColorScheme;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x6f3fd9d8

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:126)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const p0, -0x12bf2a22

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-ne p2, p0, :cond_2

    .line 46
    .line 47
    :cond_1
    new-instance p2, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 48
    .line 49
    const v5, 0x3ecccccd    # 0.4f

    .line 50
    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const/16 v9, 0xe

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    move-wide v3, v0

    .line 59
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    const/4 v8, 0x0

    .line 64
    move-object v3, p2

    .line 65
    move-wide v4, v0

    .line 66
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/text/selection/TextSelectionColors;-><init>(JJLkotlin/jvm/internal/w;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    check-cast p2, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 73
    .line 74
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 87
    .line 88
    .line 89
    return-object p2
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method
