.class public final Landroidx/compose/material3/FloatingActionButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ao\u0010\u0012\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u000eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001ao\u0010\u0014\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u000eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0011\u001ao\u0010\u0016\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u000eH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0011\u001az\u0010\u001c\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u00a2\u0006\u0002\u0008\u000e\u00a2\u0006\u0002\u0008\u0019H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u008c\u0001\u0010\u001c\u001a\u00020\u00012\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u000e2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0002\u0008\u000e2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"\"\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010%\"\u0014\u0010\'\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010%\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006/"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onClick",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "contentColor",
        "Landroidx/compose/material3/FloatingActionButtonElevation;",
        "elevation",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "FloatingActionButton-X-z6DiA",
        "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "FloatingActionButton",
        "SmallFloatingActionButton-X-z6DiA",
        "SmallFloatingActionButton",
        "LargeFloatingActionButton-X-z6DiA",
        "LargeFloatingActionButton",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Lkotlin/u;",
        "ExtendedFloatingActionButton-X-z6DiA",
        "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V",
        "ExtendedFloatingActionButton",
        "text",
        "icon",
        "",
        "expanded",
        "ExtendedFloatingActionButton-ElI5-7k",
        "(Lv3/p;Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/unit/Dp;",
        "ExtendedFabStartIconPadding",
        "F",
        "ExtendedFabEndIconPadding",
        "ExtendedFabTextPadding",
        "ExtendedFabMinimumWidth",
        "Landroidx/compose/animation/ExitTransition;",
        "ExtendedFabCollapseAnimation",
        "Landroidx/compose/animation/ExitTransition;",
        "Landroidx/compose/animation/EnterTransition;",
        "ExtendedFabExpandAnimation",
        "Landroidx/compose/animation/EnterTransition;",
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
        "SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n1116#2,6:672\n1116#2,6:678\n1116#2,6:684\n1116#2,6:690\n1116#2,6:696\n154#3:702\n154#3:703\n154#3:704\n154#3:705\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n101#1:672,6\n164#1:678,6\n216#1:684,6\n271#1:690,6\n341#1:696,6\n637#1:702\n639#1:703\n641#1:704\n643#1:705\n*E\n"
    }
.end annotation


# static fields
.field private static final ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ExtendedFabEndIconPadding:F

.field private static final ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ExtendedFabMinimumWidth:F

.field private static final ExtendedFabStartIconPadding:F

.field private static final ExtendedFabTextPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabStartIconPadding:F

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabEndIconPadding:F

    .line 18
    .line 19
    const/16 v0, 0x14

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabTextPadding:F

    .line 27
    .line 28
    const/16 v0, 0x50

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    sput v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabMinimumWidth:F

    .line 36
    .line 37
    sget-object v0, Landroidx/compose/material3/tokens/MotionTokens;->INSTANCE:Landroidx/compose/material3/tokens/MotionTokens;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingLinearCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v2, 0x64

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-static {v2, v3, v1, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v6, 0x0

    .line 53
    invoke-static {v1, v6, v4, v5}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingEmphasizedCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const/16 v8, 0x1f4

    .line 62
    .line 63
    invoke-static {v8, v3, v7, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 68
    .line 69
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    const/16 v13, 0xc

    .line 76
    .line 77
    const/4 v14, 0x0

    .line 78
    invoke-static/range {v9 .. v14}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v1, v9}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sput-object v1, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;

    .line 87
    .line 88
    const/16 v1, 0xc8

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingLinearCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-static {v1, v2, v9}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1, v6, v4, v5}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingEmphasizedCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v8, v3, v0, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-static/range {v9 .. v14}, Landroidx/compose/animation/EnterExitTransitionKt;->expandHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v1, v0}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;

    .line 123
    .line 124
    return-void
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
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
.end method

.method public static final ExtendedFloatingActionButton-ElI5-7k(Lv3/p;Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .param p0    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/material3/FloatingActionButtonElevation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v13, p13

    .line 6
    .line 7
    move/from16 v14, p14

    .line 8
    .line 9
    const v0, -0x52b21272

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p12

    .line 13
    .line 14
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    and-int/lit8 v4, v14, 0x1

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    or-int/lit8 v4, v13, 0x6

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v4, v13, 0x6

    .line 26
    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v4, 0x2

    .line 38
    :goto_0
    or-int/2addr v4, v13

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v4, v13

    .line 41
    :goto_1
    and-int/lit8 v5, v14, 0x2

    .line 42
    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    or-int/lit8 v4, v4, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v5, v13, 0x30

    .line 49
    .line 50
    if-nez v5, :cond_5

    .line 51
    .line 52
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    :cond_5
    :goto_3
    and-int/lit8 v5, v14, 0x4

    .line 65
    .line 66
    if-eqz v5, :cond_6

    .line 67
    .line 68
    or-int/lit16 v4, v4, 0x180

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_6
    and-int/lit16 v5, v13, 0x180

    .line 72
    .line 73
    if-nez v5, :cond_8

    .line 74
    .line 75
    move-object/from16 v5, p2

    .line 76
    .line 77
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_7

    .line 82
    .line 83
    const/16 v6, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    const/16 v6, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v4, v6

    .line 89
    goto :goto_6

    .line 90
    :cond_8
    :goto_5
    move-object/from16 v5, p2

    .line 91
    .line 92
    :goto_6
    and-int/lit8 v6, v14, 0x8

    .line 93
    .line 94
    if-eqz v6, :cond_9

    .line 95
    .line 96
    or-int/lit16 v4, v4, 0xc00

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_9
    and-int/lit16 v7, v13, 0xc00

    .line 100
    .line 101
    if-nez v7, :cond_b

    .line 102
    .line 103
    move-object/from16 v7, p3

    .line 104
    .line 105
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_a

    .line 110
    .line 111
    const/16 v8, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v8, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v4, v8

    .line 117
    goto :goto_9

    .line 118
    :cond_b
    :goto_8
    move-object/from16 v7, p3

    .line 119
    .line 120
    :goto_9
    and-int/lit8 v8, v14, 0x10

    .line 121
    .line 122
    if-eqz v8, :cond_c

    .line 123
    .line 124
    or-int/lit16 v4, v4, 0x6000

    .line 125
    .line 126
    goto :goto_b

    .line 127
    :cond_c
    and-int/lit16 v9, v13, 0x6000

    .line 128
    .line 129
    if-nez v9, :cond_e

    .line 130
    .line 131
    move/from16 v9, p4

    .line 132
    .line 133
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-eqz v10, :cond_d

    .line 138
    .line 139
    const/16 v10, 0x4000

    .line 140
    .line 141
    goto :goto_a

    .line 142
    :cond_d
    const/16 v10, 0x2000

    .line 143
    .line 144
    :goto_a
    or-int/2addr v4, v10

    .line 145
    goto :goto_c

    .line 146
    :cond_e
    :goto_b
    move/from16 v9, p4

    .line 147
    .line 148
    :goto_c
    const/high16 v10, 0x30000

    .line 149
    .line 150
    and-int/2addr v10, v13

    .line 151
    if-nez v10, :cond_11

    .line 152
    .line 153
    and-int/lit8 v10, v14, 0x20

    .line 154
    .line 155
    if-nez v10, :cond_f

    .line 156
    .line 157
    move-object/from16 v10, p5

    .line 158
    .line 159
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_10

    .line 164
    .line 165
    const/high16 v11, 0x20000

    .line 166
    .line 167
    goto :goto_d

    .line 168
    :cond_f
    move-object/from16 v10, p5

    .line 169
    .line 170
    :cond_10
    const/high16 v11, 0x10000

    .line 171
    .line 172
    :goto_d
    or-int/2addr v4, v11

    .line 173
    goto :goto_e

    .line 174
    :cond_11
    move-object/from16 v10, p5

    .line 175
    .line 176
    :goto_e
    const/high16 v11, 0x180000

    .line 177
    .line 178
    and-int/2addr v11, v13

    .line 179
    if-nez v11, :cond_14

    .line 180
    .line 181
    and-int/lit8 v11, v14, 0x40

    .line 182
    .line 183
    if-nez v11, :cond_12

    .line 184
    .line 185
    move-wide/from16 v11, p6

    .line 186
    .line 187
    invoke-interface {v3, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_13

    .line 192
    .line 193
    const/high16 v15, 0x100000

    .line 194
    .line 195
    goto :goto_f

    .line 196
    :cond_12
    move-wide/from16 v11, p6

    .line 197
    .line 198
    :cond_13
    const/high16 v15, 0x80000

    .line 199
    .line 200
    :goto_f
    or-int/2addr v4, v15

    .line 201
    goto :goto_10

    .line 202
    :cond_14
    move-wide/from16 v11, p6

    .line 203
    .line 204
    :goto_10
    const/high16 v15, 0xc00000

    .line 205
    .line 206
    and-int v16, v13, v15

    .line 207
    .line 208
    if-nez v16, :cond_16

    .line 209
    .line 210
    and-int/lit16 v15, v14, 0x80

    .line 211
    .line 212
    move-wide/from16 v0, p8

    .line 213
    .line 214
    if-nez v15, :cond_15

    .line 215
    .line 216
    invoke-interface {v3, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 217
    .line 218
    .line 219
    move-result v16

    .line 220
    if-eqz v16, :cond_15

    .line 221
    .line 222
    const/high16 v16, 0x800000

    .line 223
    .line 224
    goto :goto_11

    .line 225
    :cond_15
    const/high16 v16, 0x400000

    .line 226
    .line 227
    :goto_11
    or-int v4, v4, v16

    .line 228
    .line 229
    goto :goto_12

    .line 230
    :cond_16
    move-wide/from16 v0, p8

    .line 231
    .line 232
    :goto_12
    const/high16 v16, 0x6000000

    .line 233
    .line 234
    and-int v16, v13, v16

    .line 235
    .line 236
    if-nez v16, :cond_19

    .line 237
    .line 238
    and-int/lit16 v15, v14, 0x100

    .line 239
    .line 240
    if-nez v15, :cond_17

    .line 241
    .line 242
    move-object/from16 v15, p10

    .line 243
    .line 244
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v17

    .line 248
    if-eqz v17, :cond_18

    .line 249
    .line 250
    const/high16 v17, 0x4000000

    .line 251
    .line 252
    goto :goto_13

    .line 253
    :cond_17
    move-object/from16 v15, p10

    .line 254
    .line 255
    :cond_18
    const/high16 v17, 0x2000000

    .line 256
    .line 257
    :goto_13
    or-int v4, v4, v17

    .line 258
    .line 259
    goto :goto_14

    .line 260
    :cond_19
    move-object/from16 v15, p10

    .line 261
    .line 262
    :goto_14
    and-int/lit16 v0, v14, 0x200

    .line 263
    .line 264
    const/high16 v1, 0x30000000

    .line 265
    .line 266
    if-eqz v0, :cond_1a

    .line 267
    .line 268
    or-int/2addr v4, v1

    .line 269
    goto :goto_16

    .line 270
    :cond_1a
    and-int/2addr v1, v13

    .line 271
    if-nez v1, :cond_1c

    .line 272
    .line 273
    move-object/from16 v1, p11

    .line 274
    .line 275
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v17

    .line 279
    if-eqz v17, :cond_1b

    .line 280
    .line 281
    const/high16 v17, 0x20000000

    .line 282
    .line 283
    goto :goto_15

    .line 284
    :cond_1b
    const/high16 v17, 0x10000000

    .line 285
    .line 286
    :goto_15
    or-int v4, v4, v17

    .line 287
    .line 288
    goto :goto_17

    .line 289
    :cond_1c
    :goto_16
    move-object/from16 v1, p11

    .line 290
    .line 291
    :goto_17
    const v17, 0x12492493

    .line 292
    .line 293
    .line 294
    and-int v1, v4, v17

    .line 295
    .line 296
    const v5, 0x12492492

    .line 297
    .line 298
    .line 299
    if-ne v1, v5, :cond_1e

    .line 300
    .line 301
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_1d

    .line 306
    .line 307
    goto :goto_18

    .line 308
    :cond_1d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 309
    .line 310
    .line 311
    move-object/from16 v13, p0

    .line 312
    .line 313
    move-object v4, v7

    .line 314
    move v5, v9

    .line 315
    move-object v6, v10

    .line 316
    move-wide v7, v11

    .line 317
    move-object v11, v15

    .line 318
    move-wide/from16 v9, p8

    .line 319
    .line 320
    move-object/from16 v12, p11

    .line 321
    .line 322
    goto/16 :goto_20

    .line 323
    .line 324
    :cond_1e
    :goto_18
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 325
    .line 326
    .line 327
    and-int/lit8 v1, v13, 0x1

    .line 328
    .line 329
    const v17, -0x1c00001

    .line 330
    .line 331
    .line 332
    const v18, -0x380001

    .line 333
    .line 334
    .line 335
    const v19, -0x70001

    .line 336
    .line 337
    .line 338
    if-eqz v1, :cond_24

    .line 339
    .line 340
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v1, :cond_1f

    .line 345
    .line 346
    goto :goto_19

    .line 347
    :cond_1f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 348
    .line 349
    .line 350
    and-int/lit8 v0, v14, 0x20

    .line 351
    .line 352
    if-eqz v0, :cond_20

    .line 353
    .line 354
    and-int v4, v4, v19

    .line 355
    .line 356
    :cond_20
    and-int/lit8 v0, v14, 0x40

    .line 357
    .line 358
    if-eqz v0, :cond_21

    .line 359
    .line 360
    and-int v4, v4, v18

    .line 361
    .line 362
    :cond_21
    and-int/lit16 v0, v14, 0x80

    .line 363
    .line 364
    if-eqz v0, :cond_22

    .line 365
    .line 366
    and-int v4, v4, v17

    .line 367
    .line 368
    :cond_22
    and-int/lit16 v0, v14, 0x100

    .line 369
    .line 370
    if-eqz v0, :cond_23

    .line 371
    .line 372
    const v0, -0xe000001

    .line 373
    .line 374
    .line 375
    and-int/2addr v4, v0

    .line 376
    :cond_23
    move-object/from16 v0, p11

    .line 377
    .line 378
    move-object v1, v7

    .line 379
    move-object v6, v10

    .line 380
    move-wide v7, v11

    .line 381
    move-object v12, v15

    .line 382
    move-wide/from16 v10, p8

    .line 383
    .line 384
    goto/16 :goto_1f

    .line 385
    .line 386
    :cond_24
    :goto_19
    if-eqz v6, :cond_25

    .line 387
    .line 388
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 389
    .line 390
    goto :goto_1a

    .line 391
    :cond_25
    move-object v1, v7

    .line 392
    :goto_1a
    if-eqz v8, :cond_26

    .line 393
    .line 394
    const/4 v9, 0x1

    .line 395
    :cond_26
    and-int/lit8 v6, v14, 0x20

    .line 396
    .line 397
    const/4 v7, 0x6

    .line 398
    if-eqz v6, :cond_27

    .line 399
    .line 400
    sget-object v6, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 401
    .line 402
    invoke-virtual {v6, v3, v7}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getExtendedFabShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    and-int v4, v4, v19

    .line 407
    .line 408
    goto :goto_1b

    .line 409
    :cond_27
    move-object v6, v10

    .line 410
    :goto_1b
    and-int/lit8 v8, v14, 0x40

    .line 411
    .line 412
    if-eqz v8, :cond_28

    .line 413
    .line 414
    sget-object v8, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 415
    .line 416
    invoke-virtual {v8, v3, v7}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 417
    .line 418
    .line 419
    move-result-wide v7

    .line 420
    and-int v4, v4, v18

    .line 421
    .line 422
    goto :goto_1c

    .line 423
    :cond_28
    move-wide v7, v11

    .line 424
    :goto_1c
    and-int/lit16 v10, v14, 0x80

    .line 425
    .line 426
    if-eqz v10, :cond_29

    .line 427
    .line 428
    shr-int/lit8 v10, v4, 0x12

    .line 429
    .line 430
    and-int/lit8 v10, v10, 0xe

    .line 431
    .line 432
    invoke-static {v7, v8, v3, v10}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 433
    .line 434
    .line 435
    move-result-wide v10

    .line 436
    and-int v4, v4, v17

    .line 437
    .line 438
    goto :goto_1d

    .line 439
    :cond_29
    move-wide/from16 v10, p8

    .line 440
    .line 441
    :goto_1d
    and-int/lit16 v12, v14, 0x100

    .line 442
    .line 443
    if-eqz v12, :cond_2a

    .line 444
    .line 445
    sget-object v12, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 446
    .line 447
    const/4 v15, 0x0

    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    const/16 v19, 0x0

    .line 453
    .line 454
    const/16 v21, 0x6000

    .line 455
    .line 456
    const/16 v22, 0xf

    .line 457
    .line 458
    move-object/from16 p3, v12

    .line 459
    .line 460
    move/from16 p4, v15

    .line 461
    .line 462
    move/from16 p5, v17

    .line 463
    .line 464
    move/from16 p6, v18

    .line 465
    .line 466
    move/from16 p7, v19

    .line 467
    .line 468
    move-object/from16 p8, v3

    .line 469
    .line 470
    move/from16 p9, v21

    .line 471
    .line 472
    move/from16 p10, v22

    .line 473
    .line 474
    invoke-virtual/range {p3 .. p10}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    const v15, -0xe000001

    .line 479
    .line 480
    .line 481
    and-int/2addr v4, v15

    .line 482
    goto :goto_1e

    .line 483
    :cond_2a
    move-object v12, v15

    .line 484
    :goto_1e
    if-eqz v0, :cond_2c

    .line 485
    .line 486
    const v0, -0x798dc215

    .line 487
    .line 488
    .line 489
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 497
    .line 498
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v15

    .line 502
    if-ne v0, v15, :cond_2b

    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :cond_2b
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 512
    .line 513
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 514
    .line 515
    .line 516
    goto :goto_1f

    .line 517
    :cond_2c
    move-object/from16 v0, p11

    .line 518
    .line 519
    :goto_1f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 520
    .line 521
    .line 522
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 523
    .line 524
    .line 525
    move-result v15

    .line 526
    if-eqz v15, :cond_2d

    .line 527
    .line 528
    const/4 v15, -0x1

    .line 529
    const-string v5, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:341)"

    .line 530
    .line 531
    const v13, -0x52b21272

    .line 532
    .line 533
    .line 534
    invoke-static {v13, v4, v15, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :cond_2d
    new-instance v5, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5;

    .line 538
    .line 539
    move-object/from16 v13, p0

    .line 540
    .line 541
    invoke-direct {v5, v9, v2, v13}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5;-><init>(ZLv3/p;Lv3/p;)V

    .line 542
    .line 543
    .line 544
    const v15, 0x45dd1a10

    .line 545
    .line 546
    .line 547
    const/4 v2, 0x1

    .line 548
    invoke-static {v3, v15, v2, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 549
    .line 550
    .line 551
    move-result-object v24

    .line 552
    shr-int/lit8 v2, v4, 0x6

    .line 553
    .line 554
    and-int/lit8 v5, v2, 0xe

    .line 555
    .line 556
    const/high16 v15, 0xc00000

    .line 557
    .line 558
    or-int/2addr v5, v15

    .line 559
    and-int/lit8 v2, v2, 0x70

    .line 560
    .line 561
    or-int/2addr v2, v5

    .line 562
    shr-int/lit8 v4, v4, 0x9

    .line 563
    .line 564
    and-int/lit16 v5, v4, 0x380

    .line 565
    .line 566
    or-int/2addr v2, v5

    .line 567
    and-int/lit16 v5, v4, 0x1c00

    .line 568
    .line 569
    or-int/2addr v2, v5

    .line 570
    const v5, 0xe000

    .line 571
    .line 572
    .line 573
    and-int/2addr v5, v4

    .line 574
    or-int/2addr v2, v5

    .line 575
    const/high16 v5, 0x70000

    .line 576
    .line 577
    and-int/2addr v5, v4

    .line 578
    or-int/2addr v2, v5

    .line 579
    const/high16 v5, 0x380000

    .line 580
    .line 581
    and-int/2addr v4, v5

    .line 582
    or-int v26, v2, v4

    .line 583
    .line 584
    const/16 v27, 0x0

    .line 585
    .line 586
    move-object/from16 v15, p2

    .line 587
    .line 588
    move-object/from16 v16, v1

    .line 589
    .line 590
    move-object/from16 v17, v6

    .line 591
    .line 592
    move-wide/from16 v18, v7

    .line 593
    .line 594
    move-wide/from16 v20, v10

    .line 595
    .line 596
    move-object/from16 v22, v12

    .line 597
    .line 598
    move-object/from16 v23, v0

    .line 599
    .line 600
    move-object/from16 v25, v3

    .line 601
    .line 602
    invoke-static/range {v15 .. v27}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 603
    .line 604
    .line 605
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-eqz v2, :cond_2e

    .line 610
    .line 611
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 612
    .line 613
    .line 614
    :cond_2e
    move-object v4, v1

    .line 615
    move v5, v9

    .line 616
    move-wide v9, v10

    .line 617
    move-object v11, v12

    .line 618
    move-object v12, v0

    .line 619
    :goto_20
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 620
    .line 621
    .line 622
    move-result-object v15

    .line 623
    if-eqz v15, :cond_2f

    .line 624
    .line 625
    new-instance v3, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$6;

    .line 626
    .line 627
    move-object v0, v3

    .line 628
    move-object/from16 v1, p0

    .line 629
    .line 630
    move-object/from16 v2, p1

    .line 631
    .line 632
    move-object v13, v3

    .line 633
    move-object/from16 v3, p2

    .line 634
    .line 635
    move-object/from16 v28, v13

    .line 636
    .line 637
    move/from16 v13, p13

    .line 638
    .line 639
    move/from16 v14, p14

    .line 640
    .line 641
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$6;-><init>(Lv3/p;Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 642
    .line 643
    .line 644
    move-object/from16 v0, v28

    .line 645
    .line 646
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 647
    .line 648
    .line 649
    :cond_2f
    return-void
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
.end method

.method public static final ExtendedFloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/FloatingActionButtonElevation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
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
    move-object/from16 v10, p9

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x1372af63

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v1, v12, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v1, v11, 0x6

    .line 21
    .line 22
    move-object/from16 v15, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 26
    .line 27
    move-object/from16 v15, p0

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v11

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v11

    .line 43
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    move-object/from16 v3, p1

    .line 55
    .line 56
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    const/16 v4, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v4, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v1, v4

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v4, v11, 0x180

    .line 72
    .line 73
    if-nez v4, :cond_8

    .line 74
    .line 75
    and-int/lit8 v4, v12, 0x4

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    move-object/from16 v4, p2

    .line 80
    .line 81
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    const/16 v5, 0x100

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    move-object/from16 v4, p2

    .line 91
    .line 92
    :cond_7
    const/16 v5, 0x80

    .line 93
    .line 94
    :goto_5
    or-int/2addr v1, v5

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    move-object/from16 v4, p2

    .line 97
    .line 98
    :goto_6
    and-int/lit16 v5, v11, 0xc00

    .line 99
    .line 100
    if-nez v5, :cond_b

    .line 101
    .line 102
    and-int/lit8 v5, v12, 0x8

    .line 103
    .line 104
    if-nez v5, :cond_9

    .line 105
    .line 106
    move-wide/from16 v5, p3

    .line 107
    .line 108
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_a

    .line 113
    .line 114
    const/16 v7, 0x800

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    move-wide/from16 v5, p3

    .line 118
    .line 119
    :cond_a
    const/16 v7, 0x400

    .line 120
    .line 121
    :goto_7
    or-int/2addr v1, v7

    .line 122
    goto :goto_8

    .line 123
    :cond_b
    move-wide/from16 v5, p3

    .line 124
    .line 125
    :goto_8
    and-int/lit16 v7, v11, 0x6000

    .line 126
    .line 127
    if-nez v7, :cond_e

    .line 128
    .line 129
    and-int/lit8 v7, v12, 0x10

    .line 130
    .line 131
    if-nez v7, :cond_c

    .line 132
    .line 133
    move-wide/from16 v7, p5

    .line 134
    .line 135
    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    goto :goto_9

    .line 144
    :cond_c
    move-wide/from16 v7, p5

    .line 145
    .line 146
    :cond_d
    const/16 v13, 0x2000

    .line 147
    .line 148
    :goto_9
    or-int/2addr v1, v13

    .line 149
    goto :goto_a

    .line 150
    :cond_e
    move-wide/from16 v7, p5

    .line 151
    .line 152
    :goto_a
    const/high16 v13, 0x30000

    .line 153
    .line 154
    and-int/2addr v13, v11

    .line 155
    if-nez v13, :cond_11

    .line 156
    .line 157
    and-int/lit8 v13, v12, 0x20

    .line 158
    .line 159
    if-nez v13, :cond_f

    .line 160
    .line 161
    move-object/from16 v13, p7

    .line 162
    .line 163
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_10

    .line 168
    .line 169
    const/high16 v14, 0x20000

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_f
    move-object/from16 v13, p7

    .line 173
    .line 174
    :cond_10
    const/high16 v14, 0x10000

    .line 175
    .line 176
    :goto_b
    or-int/2addr v1, v14

    .line 177
    goto :goto_c

    .line 178
    :cond_11
    move-object/from16 v13, p7

    .line 179
    .line 180
    :goto_c
    and-int/lit8 v14, v12, 0x40

    .line 181
    .line 182
    const/high16 v16, 0x180000

    .line 183
    .line 184
    if-eqz v14, :cond_12

    .line 185
    .line 186
    or-int v1, v1, v16

    .line 187
    .line 188
    move-object/from16 v0, p8

    .line 189
    .line 190
    goto :goto_e

    .line 191
    :cond_12
    and-int v16, v11, v16

    .line 192
    .line 193
    move-object/from16 v0, p8

    .line 194
    .line 195
    if-nez v16, :cond_14

    .line 196
    .line 197
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v17

    .line 201
    if-eqz v17, :cond_13

    .line 202
    .line 203
    const/high16 v17, 0x100000

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_13
    const/high16 v17, 0x80000

    .line 207
    .line 208
    :goto_d
    or-int v1, v1, v17

    .line 209
    .line 210
    :cond_14
    :goto_e
    and-int/lit16 v0, v12, 0x80

    .line 211
    .line 212
    const/high16 v17, 0xc00000

    .line 213
    .line 214
    if-eqz v0, :cond_15

    .line 215
    .line 216
    or-int v1, v1, v17

    .line 217
    .line 218
    goto :goto_10

    .line 219
    :cond_15
    and-int v0, v11, v17

    .line 220
    .line 221
    if-nez v0, :cond_17

    .line 222
    .line 223
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_16

    .line 228
    .line 229
    const/high16 v0, 0x800000

    .line 230
    .line 231
    goto :goto_f

    .line 232
    :cond_16
    const/high16 v0, 0x400000

    .line 233
    .line 234
    :goto_f
    or-int/2addr v1, v0

    .line 235
    :cond_17
    :goto_10
    const v0, 0x492493

    .line 236
    .line 237
    .line 238
    and-int/2addr v0, v1

    .line 239
    const v3, 0x492492

    .line 240
    .line 241
    .line 242
    if-ne v0, v3, :cond_19

    .line 243
    .line 244
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_18

    .line 249
    .line 250
    goto :goto_11

    .line 251
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 252
    .line 253
    .line 254
    move-object/from16 v2, p1

    .line 255
    .line 256
    move-object/from16 v11, p8

    .line 257
    .line 258
    move-object v3, v4

    .line 259
    move-wide v4, v5

    .line 260
    move-wide v6, v7

    .line 261
    move-object v8, v13

    .line 262
    goto/16 :goto_19

    .line 263
    .line 264
    :cond_19
    :goto_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 265
    .line 266
    .line 267
    and-int/lit8 v0, v11, 0x1

    .line 268
    .line 269
    const v18, -0x70001

    .line 270
    .line 271
    .line 272
    const v3, -0xe001

    .line 273
    .line 274
    .line 275
    if-eqz v0, :cond_1f

    .line 276
    .line 277
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_1a

    .line 282
    .line 283
    goto :goto_12

    .line 284
    :cond_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 285
    .line 286
    .line 287
    and-int/lit8 v0, v12, 0x4

    .line 288
    .line 289
    if-eqz v0, :cond_1b

    .line 290
    .line 291
    and-int/lit16 v1, v1, -0x381

    .line 292
    .line 293
    :cond_1b
    and-int/lit8 v0, v12, 0x8

    .line 294
    .line 295
    if-eqz v0, :cond_1c

    .line 296
    .line 297
    and-int/lit16 v1, v1, -0x1c01

    .line 298
    .line 299
    :cond_1c
    and-int/lit8 v0, v12, 0x10

    .line 300
    .line 301
    if-eqz v0, :cond_1d

    .line 302
    .line 303
    and-int/2addr v1, v3

    .line 304
    :cond_1d
    and-int/lit8 v0, v12, 0x20

    .line 305
    .line 306
    if-eqz v0, :cond_1e

    .line 307
    .line 308
    and-int v1, v1, v18

    .line 309
    .line 310
    :cond_1e
    move-object/from16 v0, p1

    .line 311
    .line 312
    move-object/from16 v2, p8

    .line 313
    .line 314
    move v3, v1

    .line 315
    move-object v1, v13

    .line 316
    goto/16 :goto_18

    .line 317
    .line 318
    :cond_1f
    :goto_12
    if-eqz v2, :cond_20

    .line 319
    .line 320
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 321
    .line 322
    goto :goto_13

    .line 323
    :cond_20
    move-object/from16 v0, p1

    .line 324
    .line 325
    :goto_13
    and-int/lit8 v2, v12, 0x4

    .line 326
    .line 327
    const/4 v3, 0x6

    .line 328
    if-eqz v2, :cond_21

    .line 329
    .line 330
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 331
    .line 332
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getExtendedFabShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    and-int/lit16 v1, v1, -0x381

    .line 337
    .line 338
    move-object/from16 v19, v2

    .line 339
    .line 340
    goto :goto_14

    .line 341
    :cond_21
    move-object/from16 v19, v4

    .line 342
    .line 343
    :goto_14
    and-int/lit8 v2, v12, 0x8

    .line 344
    .line 345
    if-eqz v2, :cond_22

    .line 346
    .line 347
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 348
    .line 349
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v2

    .line 353
    and-int/lit16 v1, v1, -0x1c01

    .line 354
    .line 355
    move-wide v5, v2

    .line 356
    :cond_22
    and-int/lit8 v2, v12, 0x10

    .line 357
    .line 358
    if-eqz v2, :cond_23

    .line 359
    .line 360
    shr-int/lit8 v2, v1, 0x9

    .line 361
    .line 362
    and-int/lit8 v2, v2, 0xe

    .line 363
    .line 364
    invoke-static {v5, v6, v9, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 365
    .line 366
    .line 367
    move-result-wide v2

    .line 368
    const v4, -0xe001

    .line 369
    .line 370
    .line 371
    and-int/2addr v1, v4

    .line 372
    move/from16 v22, v1

    .line 373
    .line 374
    move-wide/from16 v20, v2

    .line 375
    .line 376
    goto :goto_15

    .line 377
    :cond_23
    move/from16 v22, v1

    .line 378
    .line 379
    move-wide/from16 v20, v7

    .line 380
    .line 381
    :goto_15
    and-int/lit8 v1, v12, 0x20

    .line 382
    .line 383
    if-eqz v1, :cond_24

    .line 384
    .line 385
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 386
    .line 387
    const/4 v2, 0x0

    .line 388
    const/4 v3, 0x0

    .line 389
    const/4 v4, 0x0

    .line 390
    const/4 v7, 0x0

    .line 391
    const/16 v8, 0x6000

    .line 392
    .line 393
    const/16 v13, 0xf

    .line 394
    .line 395
    move-wide/from16 v23, v5

    .line 396
    .line 397
    move v5, v7

    .line 398
    move-object v6, v9

    .line 399
    move v7, v8

    .line 400
    move v8, v13

    .line 401
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    and-int v2, v22, v18

    .line 406
    .line 407
    move-object v13, v1

    .line 408
    move v1, v2

    .line 409
    goto :goto_16

    .line 410
    :cond_24
    move-wide/from16 v23, v5

    .line 411
    .line 412
    move/from16 v1, v22

    .line 413
    .line 414
    :goto_16
    if-eqz v14, :cond_26

    .line 415
    .line 416
    const v2, -0x798dcfeb

    .line 417
    .line 418
    .line 419
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 427
    .line 428
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    if-ne v2, v3, :cond_25

    .line 433
    .line 434
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_25
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 442
    .line 443
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 444
    .line 445
    .line 446
    goto :goto_17

    .line 447
    :cond_26
    move-object/from16 v2, p8

    .line 448
    .line 449
    :goto_17
    move v3, v1

    .line 450
    move-object v1, v13

    .line 451
    move-object/from16 v4, v19

    .line 452
    .line 453
    move-wide/from16 v7, v20

    .line 454
    .line 455
    move-wide/from16 v5, v23

    .line 456
    .line 457
    :goto_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 458
    .line 459
    .line 460
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_27

    .line 465
    .line 466
    const/4 v13, -0x1

    .line 467
    const-string v14, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:272)"

    .line 468
    .line 469
    const v11, -0x1372af63

    .line 470
    .line 471
    .line 472
    invoke-static {v11, v3, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :cond_27
    new-instance v11, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2;

    .line 476
    .line 477
    invoke-direct {v11, v10}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$2;-><init>(Lv3/q;)V

    .line 478
    .line 479
    .line 480
    const v13, 0x17bff99f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x1

    .line 484
    invoke-static {v9, v13, v14, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 485
    .line 486
    .line 487
    move-result-object v22

    .line 488
    and-int/lit8 v11, v3, 0xe

    .line 489
    .line 490
    or-int v11, v11, v17

    .line 491
    .line 492
    and-int/lit8 v13, v3, 0x70

    .line 493
    .line 494
    or-int/2addr v11, v13

    .line 495
    and-int/lit16 v13, v3, 0x380

    .line 496
    .line 497
    or-int/2addr v11, v13

    .line 498
    and-int/lit16 v13, v3, 0x1c00

    .line 499
    .line 500
    or-int/2addr v11, v13

    .line 501
    const v13, 0xe000

    .line 502
    .line 503
    .line 504
    and-int/2addr v13, v3

    .line 505
    or-int/2addr v11, v13

    .line 506
    const/high16 v13, 0x70000

    .line 507
    .line 508
    and-int/2addr v13, v3

    .line 509
    or-int/2addr v11, v13

    .line 510
    const/high16 v13, 0x380000

    .line 511
    .line 512
    and-int/2addr v3, v13

    .line 513
    or-int v24, v11, v3

    .line 514
    .line 515
    const/16 v25, 0x0

    .line 516
    .line 517
    move-object/from16 v13, p0

    .line 518
    .line 519
    move-object v14, v0

    .line 520
    move-object v15, v4

    .line 521
    move-wide/from16 v16, v5

    .line 522
    .line 523
    move-wide/from16 v18, v7

    .line 524
    .line 525
    move-object/from16 v20, v1

    .line 526
    .line 527
    move-object/from16 v21, v2

    .line 528
    .line 529
    move-object/from16 v23, v9

    .line 530
    .line 531
    invoke-static/range {v13 .. v25}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 532
    .line 533
    .line 534
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-eqz v3, :cond_28

    .line 539
    .line 540
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 541
    .line 542
    .line 543
    :cond_28
    move-object v11, v2

    .line 544
    move-object v3, v4

    .line 545
    move-wide v4, v5

    .line 546
    move-wide v6, v7

    .line 547
    move-object v2, v0

    .line 548
    move-object v8, v1

    .line 549
    :goto_19
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    if-eqz v13, :cond_29

    .line 554
    .line 555
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3;

    .line 556
    .line 557
    move-object v0, v14

    .line 558
    move-object/from16 v1, p0

    .line 559
    .line 560
    move-object v9, v11

    .line 561
    move-object/from16 v10, p9

    .line 562
    .line 563
    move/from16 v11, p11

    .line 564
    .line 565
    move/from16 v12, p12

    .line 566
    .line 567
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$3;-><init>(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;II)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 571
    .line 572
    .line 573
    :cond_29
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final FloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/FloatingActionButtonElevation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
    move-object/from16 v10, p9

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, -0x2b9d3889

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v1, v12, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v1, v11, 0x6

    .line 21
    .line 22
    move-object/from16 v13, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 26
    .line 27
    move-object/from16 v13, p0

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v11

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v11

    .line 43
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    move-object/from16 v3, p1

    .line 55
    .line 56
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    const/16 v4, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v4, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v1, v4

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v4, v11, 0x180

    .line 72
    .line 73
    if-nez v4, :cond_8

    .line 74
    .line 75
    and-int/lit8 v4, v12, 0x4

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    move-object/from16 v4, p2

    .line 80
    .line 81
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    const/16 v5, 0x100

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_6
    move-object/from16 v4, p2

    .line 91
    .line 92
    :cond_7
    const/16 v5, 0x80

    .line 93
    .line 94
    :goto_5
    or-int/2addr v1, v5

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    move-object/from16 v4, p2

    .line 97
    .line 98
    :goto_6
    and-int/lit16 v5, v11, 0xc00

    .line 99
    .line 100
    if-nez v5, :cond_b

    .line 101
    .line 102
    and-int/lit8 v5, v12, 0x8

    .line 103
    .line 104
    if-nez v5, :cond_9

    .line 105
    .line 106
    move-wide/from16 v5, p3

    .line 107
    .line 108
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_a

    .line 113
    .line 114
    const/16 v7, 0x800

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    move-wide/from16 v5, p3

    .line 118
    .line 119
    :cond_a
    const/16 v7, 0x400

    .line 120
    .line 121
    :goto_7
    or-int/2addr v1, v7

    .line 122
    goto :goto_8

    .line 123
    :cond_b
    move-wide/from16 v5, p3

    .line 124
    .line 125
    :goto_8
    and-int/lit16 v7, v11, 0x6000

    .line 126
    .line 127
    if-nez v7, :cond_e

    .line 128
    .line 129
    and-int/lit8 v7, v12, 0x10

    .line 130
    .line 131
    if-nez v7, :cond_c

    .line 132
    .line 133
    move-wide/from16 v7, p5

    .line 134
    .line 135
    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    if-eqz v14, :cond_d

    .line 140
    .line 141
    const/16 v14, 0x4000

    .line 142
    .line 143
    goto :goto_9

    .line 144
    :cond_c
    move-wide/from16 v7, p5

    .line 145
    .line 146
    :cond_d
    const/16 v14, 0x2000

    .line 147
    .line 148
    :goto_9
    or-int/2addr v1, v14

    .line 149
    goto :goto_a

    .line 150
    :cond_e
    move-wide/from16 v7, p5

    .line 151
    .line 152
    :goto_a
    const/high16 v14, 0x30000

    .line 153
    .line 154
    and-int/2addr v14, v11

    .line 155
    if-nez v14, :cond_11

    .line 156
    .line 157
    and-int/lit8 v14, v12, 0x20

    .line 158
    .line 159
    if-nez v14, :cond_f

    .line 160
    .line 161
    move-object/from16 v14, p7

    .line 162
    .line 163
    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    if-eqz v15, :cond_10

    .line 168
    .line 169
    const/high16 v15, 0x20000

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_f
    move-object/from16 v14, p7

    .line 173
    .line 174
    :cond_10
    const/high16 v15, 0x10000

    .line 175
    .line 176
    :goto_b
    or-int/2addr v1, v15

    .line 177
    goto :goto_c

    .line 178
    :cond_11
    move-object/from16 v14, p7

    .line 179
    .line 180
    :goto_c
    and-int/lit8 v15, v12, 0x40

    .line 181
    .line 182
    const/high16 v16, 0x180000

    .line 183
    .line 184
    if-eqz v15, :cond_12

    .line 185
    .line 186
    or-int v1, v1, v16

    .line 187
    .line 188
    move-object/from16 v0, p8

    .line 189
    .line 190
    goto :goto_e

    .line 191
    :cond_12
    and-int v16, v11, v16

    .line 192
    .line 193
    move-object/from16 v0, p8

    .line 194
    .line 195
    if-nez v16, :cond_14

    .line 196
    .line 197
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v17

    .line 201
    if-eqz v17, :cond_13

    .line 202
    .line 203
    const/high16 v17, 0x100000

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_13
    const/high16 v17, 0x80000

    .line 207
    .line 208
    :goto_d
    or-int v1, v1, v17

    .line 209
    .line 210
    :cond_14
    :goto_e
    and-int/lit16 v0, v12, 0x80

    .line 211
    .line 212
    const/high16 v17, 0xc00000

    .line 213
    .line 214
    if-eqz v0, :cond_15

    .line 215
    .line 216
    or-int v1, v1, v17

    .line 217
    .line 218
    goto :goto_10

    .line 219
    :cond_15
    and-int v0, v11, v17

    .line 220
    .line 221
    if-nez v0, :cond_17

    .line 222
    .line 223
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_16

    .line 228
    .line 229
    const/high16 v0, 0x800000

    .line 230
    .line 231
    goto :goto_f

    .line 232
    :cond_16
    const/high16 v0, 0x400000

    .line 233
    .line 234
    :goto_f
    or-int/2addr v1, v0

    .line 235
    :cond_17
    :goto_10
    const v0, 0x492493

    .line 236
    .line 237
    .line 238
    and-int/2addr v0, v1

    .line 239
    const v3, 0x492492

    .line 240
    .line 241
    .line 242
    if-ne v0, v3, :cond_19

    .line 243
    .line 244
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-nez v0, :cond_18

    .line 249
    .line 250
    goto :goto_11

    .line 251
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 252
    .line 253
    .line 254
    move-object/from16 v2, p1

    .line 255
    .line 256
    move-object/from16 v11, p8

    .line 257
    .line 258
    move-object v3, v4

    .line 259
    move-wide v4, v5

    .line 260
    move-wide v6, v7

    .line 261
    move-object v8, v14

    .line 262
    goto/16 :goto_19

    .line 263
    .line 264
    :cond_19
    :goto_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 265
    .line 266
    .line 267
    and-int/lit8 v0, v11, 0x1

    .line 268
    .line 269
    const v17, -0x70001

    .line 270
    .line 271
    .line 272
    const v3, -0xe001

    .line 273
    .line 274
    .line 275
    if-eqz v0, :cond_1f

    .line 276
    .line 277
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_1a

    .line 282
    .line 283
    goto :goto_12

    .line 284
    :cond_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 285
    .line 286
    .line 287
    and-int/lit8 v0, v12, 0x4

    .line 288
    .line 289
    if-eqz v0, :cond_1b

    .line 290
    .line 291
    and-int/lit16 v1, v1, -0x381

    .line 292
    .line 293
    :cond_1b
    and-int/lit8 v0, v12, 0x8

    .line 294
    .line 295
    if-eqz v0, :cond_1c

    .line 296
    .line 297
    and-int/lit16 v1, v1, -0x1c01

    .line 298
    .line 299
    :cond_1c
    and-int/lit8 v0, v12, 0x10

    .line 300
    .line 301
    if-eqz v0, :cond_1d

    .line 302
    .line 303
    and-int/2addr v1, v3

    .line 304
    :cond_1d
    and-int/lit8 v0, v12, 0x20

    .line 305
    .line 306
    if-eqz v0, :cond_1e

    .line 307
    .line 308
    and-int v1, v1, v17

    .line 309
    .line 310
    :cond_1e
    move-object/from16 v0, p1

    .line 311
    .line 312
    move-object/from16 v2, p8

    .line 313
    .line 314
    move v3, v1

    .line 315
    move-object v1, v14

    .line 316
    goto/16 :goto_18

    .line 317
    .line 318
    :cond_1f
    :goto_12
    if-eqz v2, :cond_20

    .line 319
    .line 320
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 321
    .line 322
    goto :goto_13

    .line 323
    :cond_20
    move-object/from16 v0, p1

    .line 324
    .line 325
    :goto_13
    and-int/lit8 v2, v12, 0x4

    .line 326
    .line 327
    const/4 v3, 0x6

    .line 328
    if-eqz v2, :cond_21

    .line 329
    .line 330
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 331
    .line 332
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    and-int/lit16 v1, v1, -0x381

    .line 337
    .line 338
    move-object/from16 v18, v2

    .line 339
    .line 340
    goto :goto_14

    .line 341
    :cond_21
    move-object/from16 v18, v4

    .line 342
    .line 343
    :goto_14
    and-int/lit8 v2, v12, 0x8

    .line 344
    .line 345
    if-eqz v2, :cond_22

    .line 346
    .line 347
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 348
    .line 349
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v2

    .line 353
    and-int/lit16 v1, v1, -0x1c01

    .line 354
    .line 355
    move-wide v5, v2

    .line 356
    :cond_22
    and-int/lit8 v2, v12, 0x10

    .line 357
    .line 358
    if-eqz v2, :cond_23

    .line 359
    .line 360
    shr-int/lit8 v2, v1, 0x9

    .line 361
    .line 362
    and-int/lit8 v2, v2, 0xe

    .line 363
    .line 364
    invoke-static {v5, v6, v9, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 365
    .line 366
    .line 367
    move-result-wide v2

    .line 368
    const v4, -0xe001

    .line 369
    .line 370
    .line 371
    and-int/2addr v1, v4

    .line 372
    move/from16 v21, v1

    .line 373
    .line 374
    move-wide/from16 v19, v2

    .line 375
    .line 376
    goto :goto_15

    .line 377
    :cond_23
    move/from16 v21, v1

    .line 378
    .line 379
    move-wide/from16 v19, v7

    .line 380
    .line 381
    :goto_15
    and-int/lit8 v1, v12, 0x20

    .line 382
    .line 383
    if-eqz v1, :cond_24

    .line 384
    .line 385
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 386
    .line 387
    const/4 v2, 0x0

    .line 388
    const/4 v3, 0x0

    .line 389
    const/4 v4, 0x0

    .line 390
    const/4 v7, 0x0

    .line 391
    const/16 v8, 0x6000

    .line 392
    .line 393
    const/16 v14, 0xf

    .line 394
    .line 395
    move-wide/from16 v22, v5

    .line 396
    .line 397
    move v5, v7

    .line 398
    move-object v6, v9

    .line 399
    move v7, v8

    .line 400
    move v8, v14

    .line 401
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    and-int v2, v21, v17

    .line 406
    .line 407
    move-object v14, v1

    .line 408
    move v1, v2

    .line 409
    goto :goto_16

    .line 410
    :cond_24
    move-wide/from16 v22, v5

    .line 411
    .line 412
    move/from16 v1, v21

    .line 413
    .line 414
    :goto_16
    if-eqz v15, :cond_26

    .line 415
    .line 416
    const v2, 0x7cdecb46

    .line 417
    .line 418
    .line 419
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 427
    .line 428
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    if-ne v2, v3, :cond_25

    .line 433
    .line 434
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_25
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 442
    .line 443
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 444
    .line 445
    .line 446
    goto :goto_17

    .line 447
    :cond_26
    move-object/from16 v2, p8

    .line 448
    .line 449
    :goto_17
    move v3, v1

    .line 450
    move-object v1, v14

    .line 451
    move-object/from16 v4, v18

    .line 452
    .line 453
    move-wide/from16 v7, v19

    .line 454
    .line 455
    move-wide/from16 v5, v22

    .line 456
    .line 457
    :goto_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 458
    .line 459
    .line 460
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 461
    .line 462
    .line 463
    move-result v14

    .line 464
    if-eqz v14, :cond_27

    .line 465
    .line 466
    const/4 v14, -0x1

    .line 467
    const-string v15, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:102)"

    .line 468
    .line 469
    const v11, -0x2b9d3889

    .line 470
    .line 471
    .line 472
    invoke-static {v11, v3, v14, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :cond_27
    sget-object v11, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$2;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$2;

    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const/4 v15, 0x0

    .line 479
    const/4 v12, 0x1

    .line 480
    invoke-static {v0, v15, v11, v12, v14}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 481
    .line 482
    .line 483
    move-result-object v14

    .line 484
    invoke-virtual {v1}, Landroidx/compose/material3/FloatingActionButtonElevation;->tonalElevation-D9Ej5fM$material3_release()F

    .line 485
    .line 486
    .line 487
    move-result v21

    .line 488
    shr-int/lit8 v11, v3, 0x12

    .line 489
    .line 490
    and-int/lit8 v11, v11, 0xe

    .line 491
    .line 492
    shr-int/lit8 v16, v3, 0xc

    .line 493
    .line 494
    and-int/lit8 v16, v16, 0x70

    .line 495
    .line 496
    or-int v11, v11, v16

    .line 497
    .line 498
    invoke-virtual {v1, v2, v9, v11}, Landroidx/compose/material3/FloatingActionButtonElevation;->shadowElevation$material3_release(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 499
    .line 500
    .line 501
    move-result-object v11

    .line 502
    invoke-interface {v11}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v11

    .line 506
    check-cast v11, Landroidx/compose/ui/unit/Dp;

    .line 507
    .line 508
    invoke-virtual {v11}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 509
    .line 510
    .line 511
    move-result v22

    .line 512
    const/16 v23, 0x0

    .line 513
    .line 514
    new-instance v11, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3;

    .line 515
    .line 516
    invoke-direct {v11, v7, v8, v10}, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$3;-><init>(JLv3/p;)V

    .line 517
    .line 518
    .line 519
    const v15, 0x4a770e02    # 4047744.5f

    .line 520
    .line 521
    .line 522
    invoke-static {v9, v15, v12, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 523
    .line 524
    .line 525
    move-result-object v25

    .line 526
    and-int/lit8 v11, v3, 0xe

    .line 527
    .line 528
    shl-int/lit8 v12, v3, 0x3

    .line 529
    .line 530
    and-int/lit16 v15, v12, 0x1c00

    .line 531
    .line 532
    or-int/2addr v11, v15

    .line 533
    const v15, 0xe000

    .line 534
    .line 535
    .line 536
    and-int/2addr v15, v12

    .line 537
    or-int/2addr v11, v15

    .line 538
    const/high16 v15, 0x70000

    .line 539
    .line 540
    and-int/2addr v12, v15

    .line 541
    or-int/2addr v11, v12

    .line 542
    const/high16 v12, 0x70000000

    .line 543
    .line 544
    shl-int/lit8 v3, v3, 0x9

    .line 545
    .line 546
    and-int/2addr v3, v12

    .line 547
    or-int v27, v11, v3

    .line 548
    .line 549
    const/16 v28, 0x6

    .line 550
    .line 551
    const/16 v29, 0x104

    .line 552
    .line 553
    move-object/from16 v13, p0

    .line 554
    .line 555
    move-object/from16 v16, v4

    .line 556
    .line 557
    move-wide/from16 v17, v5

    .line 558
    .line 559
    move-wide/from16 v19, v7

    .line 560
    .line 561
    move-object/from16 v24, v2

    .line 562
    .line 563
    move-object/from16 v26, v9

    .line 564
    .line 565
    const/4 v15, 0x0

    .line 566
    invoke-static/range {v13 .. v29}, Landroidx/compose/material3/SurfaceKt;->Surface-o_FOJdg(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V

    .line 567
    .line 568
    .line 569
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    if-eqz v3, :cond_28

    .line 574
    .line 575
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 576
    .line 577
    .line 578
    :cond_28
    move-object v11, v2

    .line 579
    move-object v3, v4

    .line 580
    move-wide v4, v5

    .line 581
    move-wide v6, v7

    .line 582
    move-object v2, v0

    .line 583
    move-object v8, v1

    .line 584
    :goto_19
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 585
    .line 586
    .line 587
    move-result-object v13

    .line 588
    if-eqz v13, :cond_29

    .line 589
    .line 590
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$4;

    .line 591
    .line 592
    move-object v0, v14

    .line 593
    move-object/from16 v1, p0

    .line 594
    .line 595
    move-object v9, v11

    .line 596
    move-object/from16 v10, p9

    .line 597
    .line 598
    move/from16 v11, p11

    .line 599
    .line 600
    move/from16 v12, p12

    .line 601
    .line 602
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$FloatingActionButton$4;-><init>(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;II)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 606
    .line 607
    .line 608
    :cond_29
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final LargeFloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/FloatingActionButtonElevation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
    move/from16 v11, p11

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, -0x62663aa8

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p10

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v9

    .line 14
    and-int/lit8 v1, v12, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v1, v11, 0x6

    .line 19
    .line 20
    move-object/from16 v10, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 24
    .line 25
    move-object/from16 v10, p0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x2

    .line 38
    :goto_0
    or-int/2addr v1, v11

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v11

    .line 41
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_5

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v4, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v1, v4

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 68
    .line 69
    :goto_4
    and-int/lit16 v4, v11, 0x180

    .line 70
    .line 71
    if-nez v4, :cond_8

    .line 72
    .line 73
    and-int/lit8 v4, v12, 0x4

    .line 74
    .line 75
    if-nez v4, :cond_6

    .line 76
    .line 77
    move-object/from16 v4, p2

    .line 78
    .line 79
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    const/16 v5, 0x100

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    move-object/from16 v4, p2

    .line 89
    .line 90
    :cond_7
    const/16 v5, 0x80

    .line 91
    .line 92
    :goto_5
    or-int/2addr v1, v5

    .line 93
    goto :goto_6

    .line 94
    :cond_8
    move-object/from16 v4, p2

    .line 95
    .line 96
    :goto_6
    and-int/lit16 v5, v11, 0xc00

    .line 97
    .line 98
    if-nez v5, :cond_b

    .line 99
    .line 100
    and-int/lit8 v5, v12, 0x8

    .line 101
    .line 102
    if-nez v5, :cond_9

    .line 103
    .line 104
    move-wide/from16 v5, p3

    .line 105
    .line 106
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_a

    .line 111
    .line 112
    const/16 v7, 0x800

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_9
    move-wide/from16 v5, p3

    .line 116
    .line 117
    :cond_a
    const/16 v7, 0x400

    .line 118
    .line 119
    :goto_7
    or-int/2addr v1, v7

    .line 120
    goto :goto_8

    .line 121
    :cond_b
    move-wide/from16 v5, p3

    .line 122
    .line 123
    :goto_8
    and-int/lit16 v7, v11, 0x6000

    .line 124
    .line 125
    if-nez v7, :cond_e

    .line 126
    .line 127
    and-int/lit8 v7, v12, 0x10

    .line 128
    .line 129
    if-nez v7, :cond_c

    .line 130
    .line 131
    move-wide/from16 v7, p5

    .line 132
    .line 133
    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_d

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_c
    move-wide/from16 v7, p5

    .line 143
    .line 144
    :cond_d
    const/16 v13, 0x2000

    .line 145
    .line 146
    :goto_9
    or-int/2addr v1, v13

    .line 147
    goto :goto_a

    .line 148
    :cond_e
    move-wide/from16 v7, p5

    .line 149
    .line 150
    :goto_a
    const/high16 v13, 0x30000

    .line 151
    .line 152
    and-int/2addr v13, v11

    .line 153
    if-nez v13, :cond_11

    .line 154
    .line 155
    and-int/lit8 v13, v12, 0x20

    .line 156
    .line 157
    if-nez v13, :cond_f

    .line 158
    .line 159
    move-object/from16 v13, p7

    .line 160
    .line 161
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-eqz v14, :cond_10

    .line 166
    .line 167
    const/high16 v14, 0x20000

    .line 168
    .line 169
    goto :goto_b

    .line 170
    :cond_f
    move-object/from16 v13, p7

    .line 171
    .line 172
    :cond_10
    const/high16 v14, 0x10000

    .line 173
    .line 174
    :goto_b
    or-int/2addr v1, v14

    .line 175
    goto :goto_c

    .line 176
    :cond_11
    move-object/from16 v13, p7

    .line 177
    .line 178
    :goto_c
    and-int/lit8 v14, v12, 0x40

    .line 179
    .line 180
    const/high16 v15, 0x180000

    .line 181
    .line 182
    if-eqz v14, :cond_12

    .line 183
    .line 184
    or-int/2addr v1, v15

    .line 185
    goto :goto_e

    .line 186
    :cond_12
    and-int/2addr v15, v11

    .line 187
    if-nez v15, :cond_14

    .line 188
    .line 189
    move-object/from16 v15, p8

    .line 190
    .line 191
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v16

    .line 195
    if-eqz v16, :cond_13

    .line 196
    .line 197
    const/high16 v16, 0x100000

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_13
    const/high16 v16, 0x80000

    .line 201
    .line 202
    :goto_d
    or-int v1, v1, v16

    .line 203
    .line 204
    goto :goto_f

    .line 205
    :cond_14
    :goto_e
    move-object/from16 v15, p8

    .line 206
    .line 207
    :goto_f
    and-int/lit16 v0, v12, 0x80

    .line 208
    .line 209
    const/high16 v17, 0xc00000

    .line 210
    .line 211
    if-eqz v0, :cond_15

    .line 212
    .line 213
    or-int v1, v1, v17

    .line 214
    .line 215
    goto :goto_11

    .line 216
    :cond_15
    and-int v0, v11, v17

    .line 217
    .line 218
    if-nez v0, :cond_17

    .line 219
    .line 220
    move-object/from16 v0, p9

    .line 221
    .line 222
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v17

    .line 226
    if-eqz v17, :cond_16

    .line 227
    .line 228
    const/high16 v17, 0x800000

    .line 229
    .line 230
    goto :goto_10

    .line 231
    :cond_16
    const/high16 v17, 0x400000

    .line 232
    .line 233
    :goto_10
    or-int v1, v1, v17

    .line 234
    .line 235
    goto :goto_12

    .line 236
    :cond_17
    :goto_11
    move-object/from16 v0, p9

    .line 237
    .line 238
    :goto_12
    const v17, 0x492493

    .line 239
    .line 240
    .line 241
    and-int v0, v1, v17

    .line 242
    .line 243
    const v3, 0x492492

    .line 244
    .line 245
    .line 246
    if-ne v0, v3, :cond_19

    .line 247
    .line 248
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_18

    .line 253
    .line 254
    goto :goto_13

    .line 255
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 256
    .line 257
    .line 258
    move-object/from16 v2, p1

    .line 259
    .line 260
    move-object v3, v4

    .line 261
    move-wide v4, v5

    .line 262
    move-wide v6, v7

    .line 263
    move-object v8, v13

    .line 264
    goto/16 :goto_1b

    .line 265
    .line 266
    :cond_19
    :goto_13
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 267
    .line 268
    .line 269
    and-int/lit8 v0, v11, 0x1

    .line 270
    .line 271
    const v17, -0x70001

    .line 272
    .line 273
    .line 274
    const v3, -0xe001

    .line 275
    .line 276
    .line 277
    if-eqz v0, :cond_1f

    .line 278
    .line 279
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_1a

    .line 284
    .line 285
    goto :goto_14

    .line 286
    :cond_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 287
    .line 288
    .line 289
    and-int/lit8 v0, v12, 0x4

    .line 290
    .line 291
    if-eqz v0, :cond_1b

    .line 292
    .line 293
    and-int/lit16 v1, v1, -0x381

    .line 294
    .line 295
    :cond_1b
    and-int/lit8 v0, v12, 0x8

    .line 296
    .line 297
    if-eqz v0, :cond_1c

    .line 298
    .line 299
    and-int/lit16 v1, v1, -0x1c01

    .line 300
    .line 301
    :cond_1c
    and-int/lit8 v0, v12, 0x10

    .line 302
    .line 303
    if-eqz v0, :cond_1d

    .line 304
    .line 305
    and-int/2addr v1, v3

    .line 306
    :cond_1d
    and-int/lit8 v0, v12, 0x20

    .line 307
    .line 308
    if-eqz v0, :cond_1e

    .line 309
    .line 310
    and-int v1, v1, v17

    .line 311
    .line 312
    :cond_1e
    move-object/from16 v0, p1

    .line 313
    .line 314
    move v3, v1

    .line 315
    move-object v1, v13

    .line 316
    move-object v2, v15

    .line 317
    goto/16 :goto_1a

    .line 318
    .line 319
    :cond_1f
    :goto_14
    if-eqz v2, :cond_20

    .line 320
    .line 321
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 322
    .line 323
    goto :goto_15

    .line 324
    :cond_20
    move-object/from16 v0, p1

    .line 325
    .line 326
    :goto_15
    and-int/lit8 v2, v12, 0x4

    .line 327
    .line 328
    const/4 v3, 0x6

    .line 329
    if-eqz v2, :cond_21

    .line 330
    .line 331
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 332
    .line 333
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getLargeShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    and-int/lit16 v1, v1, -0x381

    .line 338
    .line 339
    move-object/from16 v18, v2

    .line 340
    .line 341
    goto :goto_16

    .line 342
    :cond_21
    move-object/from16 v18, v4

    .line 343
    .line 344
    :goto_16
    and-int/lit8 v2, v12, 0x8

    .line 345
    .line 346
    if-eqz v2, :cond_22

    .line 347
    .line 348
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 349
    .line 350
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 351
    .line 352
    .line 353
    move-result-wide v2

    .line 354
    and-int/lit16 v1, v1, -0x1c01

    .line 355
    .line 356
    move-wide v5, v2

    .line 357
    :cond_22
    and-int/lit8 v2, v12, 0x10

    .line 358
    .line 359
    if-eqz v2, :cond_23

    .line 360
    .line 361
    shr-int/lit8 v2, v1, 0x9

    .line 362
    .line 363
    and-int/lit8 v2, v2, 0xe

    .line 364
    .line 365
    invoke-static {v5, v6, v9, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    const v4, -0xe001

    .line 370
    .line 371
    .line 372
    and-int/2addr v1, v4

    .line 373
    move/from16 v21, v1

    .line 374
    .line 375
    move-wide/from16 v19, v2

    .line 376
    .line 377
    goto :goto_17

    .line 378
    :cond_23
    move/from16 v21, v1

    .line 379
    .line 380
    move-wide/from16 v19, v7

    .line 381
    .line 382
    :goto_17
    and-int/lit8 v1, v12, 0x20

    .line 383
    .line 384
    if-eqz v1, :cond_24

    .line 385
    .line 386
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 387
    .line 388
    const/4 v2, 0x0

    .line 389
    const/4 v3, 0x0

    .line 390
    const/4 v4, 0x0

    .line 391
    const/4 v7, 0x0

    .line 392
    const/16 v8, 0x6000

    .line 393
    .line 394
    const/16 v13, 0xf

    .line 395
    .line 396
    move-wide/from16 v22, v5

    .line 397
    .line 398
    move v5, v7

    .line 399
    move-object v6, v9

    .line 400
    move v7, v8

    .line 401
    move v8, v13

    .line 402
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    and-int v2, v21, v17

    .line 407
    .line 408
    move-object v13, v1

    .line 409
    move v1, v2

    .line 410
    goto :goto_18

    .line 411
    :cond_24
    move-wide/from16 v22, v5

    .line 412
    .line 413
    move/from16 v1, v21

    .line 414
    .line 415
    :goto_18
    if-eqz v14, :cond_26

    .line 416
    .line 417
    const v2, 0x7f260393

    .line 418
    .line 419
    .line 420
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 428
    .line 429
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    if-ne v2, v3, :cond_25

    .line 434
    .line 435
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    :cond_25
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 443
    .line 444
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 445
    .line 446
    .line 447
    move v3, v1

    .line 448
    move-object v1, v13

    .line 449
    goto :goto_19

    .line 450
    :cond_26
    move v3, v1

    .line 451
    move-object v1, v13

    .line 452
    move-object v2, v15

    .line 453
    :goto_19
    move-object/from16 v4, v18

    .line 454
    .line 455
    move-wide/from16 v7, v19

    .line 456
    .line 457
    move-wide/from16 v5, v22

    .line 458
    .line 459
    :goto_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 460
    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 463
    .line 464
    .line 465
    move-result v13

    .line 466
    if-eqz v13, :cond_27

    .line 467
    .line 468
    const/4 v13, -0x1

    .line 469
    const-string v14, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:217)"

    .line 470
    .line 471
    const v15, -0x62663aa8

    .line 472
    .line 473
    .line 474
    invoke-static {v15, v3, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_27
    sget-object v13, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->INSTANCE:Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;

    .line 478
    .line 479
    invoke-virtual {v13}, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->getContainerWidth-D9Ej5fM()F

    .line 480
    .line 481
    .line 482
    move-result v14

    .line 483
    invoke-virtual {v13}, Landroidx/compose/material3/tokens/FabPrimaryLargeTokens;->getContainerHeight-D9Ej5fM()F

    .line 484
    .line 485
    .line 486
    move-result v13

    .line 487
    const/4 v15, 0x0

    .line 488
    const/16 v16, 0x0

    .line 489
    .line 490
    const/16 v17, 0xc

    .line 491
    .line 492
    const/16 v18, 0x0

    .line 493
    .line 494
    move-object/from16 p1, v0

    .line 495
    .line 496
    move/from16 p2, v14

    .line 497
    .line 498
    move/from16 p3, v13

    .line 499
    .line 500
    move/from16 p4, v15

    .line 501
    .line 502
    move/from16 p5, v16

    .line 503
    .line 504
    move/from16 p6, v17

    .line 505
    .line 506
    move-object/from16 p7, v18

    .line 507
    .line 508
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 509
    .line 510
    .line 511
    move-result-object v14

    .line 512
    and-int/lit8 v13, v3, 0xe

    .line 513
    .line 514
    and-int/lit16 v15, v3, 0x380

    .line 515
    .line 516
    or-int/2addr v13, v15

    .line 517
    and-int/lit16 v15, v3, 0x1c00

    .line 518
    .line 519
    or-int/2addr v13, v15

    .line 520
    const v15, 0xe000

    .line 521
    .line 522
    .line 523
    and-int/2addr v15, v3

    .line 524
    or-int/2addr v13, v15

    .line 525
    const/high16 v15, 0x70000

    .line 526
    .line 527
    and-int/2addr v15, v3

    .line 528
    or-int/2addr v13, v15

    .line 529
    const/high16 v15, 0x380000

    .line 530
    .line 531
    and-int/2addr v15, v3

    .line 532
    or-int/2addr v13, v15

    .line 533
    const/high16 v15, 0x1c00000

    .line 534
    .line 535
    and-int/2addr v3, v15

    .line 536
    or-int v24, v13, v3

    .line 537
    .line 538
    const/16 v25, 0x0

    .line 539
    .line 540
    move-object/from16 v13, p0

    .line 541
    .line 542
    move-object v15, v4

    .line 543
    move-wide/from16 v16, v5

    .line 544
    .line 545
    move-wide/from16 v18, v7

    .line 546
    .line 547
    move-object/from16 v20, v1

    .line 548
    .line 549
    move-object/from16 v21, v2

    .line 550
    .line 551
    move-object/from16 v22, p9

    .line 552
    .line 553
    move-object/from16 v23, v9

    .line 554
    .line 555
    invoke-static/range {v13 .. v25}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_28

    .line 563
    .line 564
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 565
    .line 566
    .line 567
    :cond_28
    move-object v15, v2

    .line 568
    move-object v3, v4

    .line 569
    move-wide v4, v5

    .line 570
    move-wide v6, v7

    .line 571
    move-object v2, v0

    .line 572
    move-object v8, v1

    .line 573
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 574
    .line 575
    .line 576
    move-result-object v13

    .line 577
    if-eqz v13, :cond_29

    .line 578
    .line 579
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$LargeFloatingActionButton$2;

    .line 580
    .line 581
    move-object v0, v14

    .line 582
    move-object/from16 v1, p0

    .line 583
    .line 584
    move-object v9, v15

    .line 585
    move-object/from16 v10, p9

    .line 586
    .line 587
    move/from16 v11, p11

    .line 588
    .line 589
    move/from16 v12, p12

    .line 590
    .line 591
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$LargeFloatingActionButton$2;-><init>(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;II)V

    .line 592
    .line 593
    .line 594
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 595
    .line 596
    .line 597
    :cond_29
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final SmallFloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/FloatingActionButtonElevation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/runtime/Composer;
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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJ",
            "Landroidx/compose/material3/FloatingActionButtonElevation;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
    move/from16 v11, p11

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, 0x561d1c0c

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p10

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v9

    .line 14
    and-int/lit8 v1, v12, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v1, v11, 0x6

    .line 19
    .line 20
    move-object/from16 v10, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 24
    .line 25
    move-object/from16 v10, p0

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x2

    .line 38
    :goto_0
    or-int/2addr v1, v11

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v11

    .line 41
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    or-int/lit8 v1, v1, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_5

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v4, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v1, v4

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 68
    .line 69
    :goto_4
    and-int/lit16 v4, v11, 0x180

    .line 70
    .line 71
    if-nez v4, :cond_8

    .line 72
    .line 73
    and-int/lit8 v4, v12, 0x4

    .line 74
    .line 75
    if-nez v4, :cond_6

    .line 76
    .line 77
    move-object/from16 v4, p2

    .line 78
    .line 79
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_7

    .line 84
    .line 85
    const/16 v5, 0x100

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    move-object/from16 v4, p2

    .line 89
    .line 90
    :cond_7
    const/16 v5, 0x80

    .line 91
    .line 92
    :goto_5
    or-int/2addr v1, v5

    .line 93
    goto :goto_6

    .line 94
    :cond_8
    move-object/from16 v4, p2

    .line 95
    .line 96
    :goto_6
    and-int/lit16 v5, v11, 0xc00

    .line 97
    .line 98
    if-nez v5, :cond_b

    .line 99
    .line 100
    and-int/lit8 v5, v12, 0x8

    .line 101
    .line 102
    if-nez v5, :cond_9

    .line 103
    .line 104
    move-wide/from16 v5, p3

    .line 105
    .line 106
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_a

    .line 111
    .line 112
    const/16 v7, 0x800

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_9
    move-wide/from16 v5, p3

    .line 116
    .line 117
    :cond_a
    const/16 v7, 0x400

    .line 118
    .line 119
    :goto_7
    or-int/2addr v1, v7

    .line 120
    goto :goto_8

    .line 121
    :cond_b
    move-wide/from16 v5, p3

    .line 122
    .line 123
    :goto_8
    and-int/lit16 v7, v11, 0x6000

    .line 124
    .line 125
    if-nez v7, :cond_e

    .line 126
    .line 127
    and-int/lit8 v7, v12, 0x10

    .line 128
    .line 129
    if-nez v7, :cond_c

    .line 130
    .line 131
    move-wide/from16 v7, p5

    .line 132
    .line 133
    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_d

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_c
    move-wide/from16 v7, p5

    .line 143
    .line 144
    :cond_d
    const/16 v13, 0x2000

    .line 145
    .line 146
    :goto_9
    or-int/2addr v1, v13

    .line 147
    goto :goto_a

    .line 148
    :cond_e
    move-wide/from16 v7, p5

    .line 149
    .line 150
    :goto_a
    const/high16 v13, 0x30000

    .line 151
    .line 152
    and-int/2addr v13, v11

    .line 153
    if-nez v13, :cond_11

    .line 154
    .line 155
    and-int/lit8 v13, v12, 0x20

    .line 156
    .line 157
    if-nez v13, :cond_f

    .line 158
    .line 159
    move-object/from16 v13, p7

    .line 160
    .line 161
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    if-eqz v14, :cond_10

    .line 166
    .line 167
    const/high16 v14, 0x20000

    .line 168
    .line 169
    goto :goto_b

    .line 170
    :cond_f
    move-object/from16 v13, p7

    .line 171
    .line 172
    :cond_10
    const/high16 v14, 0x10000

    .line 173
    .line 174
    :goto_b
    or-int/2addr v1, v14

    .line 175
    goto :goto_c

    .line 176
    :cond_11
    move-object/from16 v13, p7

    .line 177
    .line 178
    :goto_c
    and-int/lit8 v14, v12, 0x40

    .line 179
    .line 180
    const/high16 v15, 0x180000

    .line 181
    .line 182
    if-eqz v14, :cond_12

    .line 183
    .line 184
    or-int/2addr v1, v15

    .line 185
    goto :goto_e

    .line 186
    :cond_12
    and-int/2addr v15, v11

    .line 187
    if-nez v15, :cond_14

    .line 188
    .line 189
    move-object/from16 v15, p8

    .line 190
    .line 191
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v16

    .line 195
    if-eqz v16, :cond_13

    .line 196
    .line 197
    const/high16 v16, 0x100000

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_13
    const/high16 v16, 0x80000

    .line 201
    .line 202
    :goto_d
    or-int v1, v1, v16

    .line 203
    .line 204
    goto :goto_f

    .line 205
    :cond_14
    :goto_e
    move-object/from16 v15, p8

    .line 206
    .line 207
    :goto_f
    and-int/lit16 v0, v12, 0x80

    .line 208
    .line 209
    const/high16 v17, 0xc00000

    .line 210
    .line 211
    if-eqz v0, :cond_15

    .line 212
    .line 213
    or-int v1, v1, v17

    .line 214
    .line 215
    goto :goto_11

    .line 216
    :cond_15
    and-int v0, v11, v17

    .line 217
    .line 218
    if-nez v0, :cond_17

    .line 219
    .line 220
    move-object/from16 v0, p9

    .line 221
    .line 222
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v17

    .line 226
    if-eqz v17, :cond_16

    .line 227
    .line 228
    const/high16 v17, 0x800000

    .line 229
    .line 230
    goto :goto_10

    .line 231
    :cond_16
    const/high16 v17, 0x400000

    .line 232
    .line 233
    :goto_10
    or-int v1, v1, v17

    .line 234
    .line 235
    goto :goto_12

    .line 236
    :cond_17
    :goto_11
    move-object/from16 v0, p9

    .line 237
    .line 238
    :goto_12
    const v17, 0x492493

    .line 239
    .line 240
    .line 241
    and-int v0, v1, v17

    .line 242
    .line 243
    const v3, 0x492492

    .line 244
    .line 245
    .line 246
    if-ne v0, v3, :cond_19

    .line 247
    .line 248
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_18

    .line 253
    .line 254
    goto :goto_13

    .line 255
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 256
    .line 257
    .line 258
    move-object/from16 v2, p1

    .line 259
    .line 260
    move-object v3, v4

    .line 261
    move-wide v4, v5

    .line 262
    move-wide v6, v7

    .line 263
    move-object v8, v13

    .line 264
    goto/16 :goto_1b

    .line 265
    .line 266
    :cond_19
    :goto_13
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 267
    .line 268
    .line 269
    and-int/lit8 v0, v11, 0x1

    .line 270
    .line 271
    const v17, -0x70001

    .line 272
    .line 273
    .line 274
    const v3, -0xe001

    .line 275
    .line 276
    .line 277
    if-eqz v0, :cond_1f

    .line 278
    .line 279
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_1a

    .line 284
    .line 285
    goto :goto_14

    .line 286
    :cond_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 287
    .line 288
    .line 289
    and-int/lit8 v0, v12, 0x4

    .line 290
    .line 291
    if-eqz v0, :cond_1b

    .line 292
    .line 293
    and-int/lit16 v1, v1, -0x381

    .line 294
    .line 295
    :cond_1b
    and-int/lit8 v0, v12, 0x8

    .line 296
    .line 297
    if-eqz v0, :cond_1c

    .line 298
    .line 299
    and-int/lit16 v1, v1, -0x1c01

    .line 300
    .line 301
    :cond_1c
    and-int/lit8 v0, v12, 0x10

    .line 302
    .line 303
    if-eqz v0, :cond_1d

    .line 304
    .line 305
    and-int/2addr v1, v3

    .line 306
    :cond_1d
    and-int/lit8 v0, v12, 0x20

    .line 307
    .line 308
    if-eqz v0, :cond_1e

    .line 309
    .line 310
    and-int v1, v1, v17

    .line 311
    .line 312
    :cond_1e
    move-object/from16 v0, p1

    .line 313
    .line 314
    move v3, v1

    .line 315
    move-object v1, v13

    .line 316
    move-object v2, v15

    .line 317
    goto/16 :goto_1a

    .line 318
    .line 319
    :cond_1f
    :goto_14
    if-eqz v2, :cond_20

    .line 320
    .line 321
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 322
    .line 323
    goto :goto_15

    .line 324
    :cond_20
    move-object/from16 v0, p1

    .line 325
    .line 326
    :goto_15
    and-int/lit8 v2, v12, 0x4

    .line 327
    .line 328
    const/4 v3, 0x6

    .line 329
    if-eqz v2, :cond_21

    .line 330
    .line 331
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 332
    .line 333
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getSmallShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    and-int/lit16 v1, v1, -0x381

    .line 338
    .line 339
    move-object/from16 v18, v2

    .line 340
    .line 341
    goto :goto_16

    .line 342
    :cond_21
    move-object/from16 v18, v4

    .line 343
    .line 344
    :goto_16
    and-int/lit8 v2, v12, 0x8

    .line 345
    .line 346
    if-eqz v2, :cond_22

    .line 347
    .line 348
    sget-object v2, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 349
    .line 350
    invoke-virtual {v2, v9, v3}, Landroidx/compose/material3/FloatingActionButtonDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 351
    .line 352
    .line 353
    move-result-wide v2

    .line 354
    and-int/lit16 v1, v1, -0x1c01

    .line 355
    .line 356
    move-wide v5, v2

    .line 357
    :cond_22
    and-int/lit8 v2, v12, 0x10

    .line 358
    .line 359
    if-eqz v2, :cond_23

    .line 360
    .line 361
    shr-int/lit8 v2, v1, 0x9

    .line 362
    .line 363
    and-int/lit8 v2, v2, 0xe

    .line 364
    .line 365
    invoke-static {v5, v6, v9, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    const v4, -0xe001

    .line 370
    .line 371
    .line 372
    and-int/2addr v1, v4

    .line 373
    move/from16 v21, v1

    .line 374
    .line 375
    move-wide/from16 v19, v2

    .line 376
    .line 377
    goto :goto_17

    .line 378
    :cond_23
    move/from16 v21, v1

    .line 379
    .line 380
    move-wide/from16 v19, v7

    .line 381
    .line 382
    :goto_17
    and-int/lit8 v1, v12, 0x20

    .line 383
    .line 384
    if-eqz v1, :cond_24

    .line 385
    .line 386
    sget-object v1, Landroidx/compose/material3/FloatingActionButtonDefaults;->INSTANCE:Landroidx/compose/material3/FloatingActionButtonDefaults;

    .line 387
    .line 388
    const/4 v2, 0x0

    .line 389
    const/4 v3, 0x0

    .line 390
    const/4 v4, 0x0

    .line 391
    const/4 v7, 0x0

    .line 392
    const/16 v8, 0x6000

    .line 393
    .line 394
    const/16 v13, 0xf

    .line 395
    .line 396
    move-wide/from16 v22, v5

    .line 397
    .line 398
    move v5, v7

    .line 399
    move-object v6, v9

    .line 400
    move v7, v8

    .line 401
    move v8, v13

    .line 402
    invoke-virtual/range {v1 .. v8}, Landroidx/compose/material3/FloatingActionButtonDefaults;->elevation-xZ9-QkE(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    and-int v2, v21, v17

    .line 407
    .line 408
    move-object v13, v1

    .line 409
    move v1, v2

    .line 410
    goto :goto_18

    .line 411
    :cond_24
    move-wide/from16 v22, v5

    .line 412
    .line 413
    move/from16 v1, v21

    .line 414
    .line 415
    :goto_18
    if-eqz v14, :cond_26

    .line 416
    .line 417
    const v2, 0x22e076f1

    .line 418
    .line 419
    .line 420
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 428
    .line 429
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    if-ne v2, v3, :cond_25

    .line 434
    .line 435
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    :cond_25
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 443
    .line 444
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 445
    .line 446
    .line 447
    move v3, v1

    .line 448
    move-object v1, v13

    .line 449
    goto :goto_19

    .line 450
    :cond_26
    move v3, v1

    .line 451
    move-object v1, v13

    .line 452
    move-object v2, v15

    .line 453
    :goto_19
    move-object/from16 v4, v18

    .line 454
    .line 455
    move-wide/from16 v7, v19

    .line 456
    .line 457
    move-wide/from16 v5, v22

    .line 458
    .line 459
    :goto_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 460
    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 463
    .line 464
    .line 465
    move-result v13

    .line 466
    if-eqz v13, :cond_27

    .line 467
    .line 468
    const/4 v13, -0x1

    .line 469
    const-string v14, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:165)"

    .line 470
    .line 471
    const v15, 0x561d1c0c

    .line 472
    .line 473
    .line 474
    invoke-static {v15, v3, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_27
    sget-object v13, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->INSTANCE:Landroidx/compose/material3/tokens/FabPrimarySmallTokens;

    .line 478
    .line 479
    invoke-virtual {v13}, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->getContainerWidth-D9Ej5fM()F

    .line 480
    .line 481
    .line 482
    move-result v14

    .line 483
    invoke-virtual {v13}, Landroidx/compose/material3/tokens/FabPrimarySmallTokens;->getContainerHeight-D9Ej5fM()F

    .line 484
    .line 485
    .line 486
    move-result v13

    .line 487
    const/4 v15, 0x0

    .line 488
    const/16 v16, 0x0

    .line 489
    .line 490
    const/16 v17, 0xc

    .line 491
    .line 492
    const/16 v18, 0x0

    .line 493
    .line 494
    move-object/from16 p1, v0

    .line 495
    .line 496
    move/from16 p2, v14

    .line 497
    .line 498
    move/from16 p3, v13

    .line 499
    .line 500
    move/from16 p4, v15

    .line 501
    .line 502
    move/from16 p5, v16

    .line 503
    .line 504
    move/from16 p6, v17

    .line 505
    .line 506
    move-object/from16 p7, v18

    .line 507
    .line 508
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 509
    .line 510
    .line 511
    move-result-object v14

    .line 512
    and-int/lit8 v13, v3, 0xe

    .line 513
    .line 514
    and-int/lit16 v15, v3, 0x380

    .line 515
    .line 516
    or-int/2addr v13, v15

    .line 517
    and-int/lit16 v15, v3, 0x1c00

    .line 518
    .line 519
    or-int/2addr v13, v15

    .line 520
    const v15, 0xe000

    .line 521
    .line 522
    .line 523
    and-int/2addr v15, v3

    .line 524
    or-int/2addr v13, v15

    .line 525
    const/high16 v15, 0x70000

    .line 526
    .line 527
    and-int/2addr v15, v3

    .line 528
    or-int/2addr v13, v15

    .line 529
    const/high16 v15, 0x380000

    .line 530
    .line 531
    and-int/2addr v15, v3

    .line 532
    or-int/2addr v13, v15

    .line 533
    const/high16 v15, 0x1c00000

    .line 534
    .line 535
    and-int/2addr v3, v15

    .line 536
    or-int v24, v13, v3

    .line 537
    .line 538
    const/16 v25, 0x0

    .line 539
    .line 540
    move-object/from16 v13, p0

    .line 541
    .line 542
    move-object v15, v4

    .line 543
    move-wide/from16 v16, v5

    .line 544
    .line 545
    move-wide/from16 v18, v7

    .line 546
    .line 547
    move-object/from16 v20, v1

    .line 548
    .line 549
    move-object/from16 v21, v2

    .line 550
    .line 551
    move-object/from16 v22, p9

    .line 552
    .line 553
    move-object/from16 v23, v9

    .line 554
    .line 555
    invoke-static/range {v13 .. v25}, Landroidx/compose/material3/FloatingActionButtonKt;->FloatingActionButton-X-z6DiA(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_28

    .line 563
    .line 564
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 565
    .line 566
    .line 567
    :cond_28
    move-object v15, v2

    .line 568
    move-object v3, v4

    .line 569
    move-wide v4, v5

    .line 570
    move-wide v6, v7

    .line 571
    move-object v2, v0

    .line 572
    move-object v8, v1

    .line 573
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 574
    .line 575
    .line 576
    move-result-object v13

    .line 577
    if-eqz v13, :cond_29

    .line 578
    .line 579
    new-instance v14, Landroidx/compose/material3/FloatingActionButtonKt$SmallFloatingActionButton$2;

    .line 580
    .line 581
    move-object v0, v14

    .line 582
    move-object/from16 v1, p0

    .line 583
    .line 584
    move-object v9, v15

    .line 585
    move-object/from16 v10, p9

    .line 586
    .line 587
    move/from16 v11, p11

    .line 588
    .line 589
    move/from16 v12, p12

    .line 590
    .line 591
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/FloatingActionButtonKt$SmallFloatingActionButton$2;-><init>(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;II)V

    .line 592
    .line 593
    .line 594
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 595
    .line 596
    .line 597
    :cond_29
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final synthetic access$getExtendedFabCollapseAnimation$p()Landroidx/compose/animation/ExitTransition;
    .locals 1

    sget-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabCollapseAnimation:Landroidx/compose/animation/ExitTransition;

    return-object v0
.end method

.method public static final synthetic access$getExtendedFabEndIconPadding$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabEndIconPadding:F

    return v0
.end method

.method public static final synthetic access$getExtendedFabExpandAnimation$p()Landroidx/compose/animation/EnterTransition;
    .locals 1

    sget-object v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabExpandAnimation:Landroidx/compose/animation/EnterTransition;

    return-object v0
.end method

.method public static final synthetic access$getExtendedFabMinimumWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabMinimumWidth:F

    return v0
.end method

.method public static final synthetic access$getExtendedFabStartIconPadding$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabStartIconPadding:F

    return v0
.end method

.method public static final synthetic access$getExtendedFabTextPadding$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/FloatingActionButtonKt;->ExtendedFabTextPadding:F

    return v0
.end method
