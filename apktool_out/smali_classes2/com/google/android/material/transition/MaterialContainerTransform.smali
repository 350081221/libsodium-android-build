.class public final Lcom/google/android/material/transition/MaterialContainerTransform;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;,
        Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;,
        Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;,
        Lcom/google/android/material/transition/MaterialContainerTransform$FitMode;,
        Lcom/google/android/material/transition/MaterialContainerTransform$FadeMode;,
        Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDirection;
    }
.end annotation


# static fields
.field private static final DEFAULT_ENTER_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

.field private static final DEFAULT_ENTER_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

.field private static final DEFAULT_RETURN_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

.field private static final DEFAULT_RETURN_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

.field private static final ELEVATION_NOT_SET:F = -1.0f

.field public static final FADE_MODE_CROSS:I = 0x2

.field public static final FADE_MODE_IN:I = 0x0

.field public static final FADE_MODE_OUT:I = 0x1

.field public static final FADE_MODE_THROUGH:I = 0x3

.field public static final FIT_MODE_AUTO:I = 0x0

.field public static final FIT_MODE_HEIGHT:I = 0x2

.field public static final FIT_MODE_WIDTH:I = 0x1

.field private static final PROP_BOUNDS:Ljava/lang/String; = "materialContainerTransition:bounds"

.field private static final PROP_SHAPE_APPEARANCE:Ljava/lang/String; = "materialContainerTransition:shapeAppearance"

.field private static final TAG:Ljava/lang/String; = "MaterialContainerTransform"

.field public static final TRANSITION_DIRECTION_AUTO:I = 0x0

.field public static final TRANSITION_DIRECTION_ENTER:I = 0x1

.field public static final TRANSITION_DIRECTION_RETURN:I = 0x2

.field private static final TRANSITION_PROPS:[Ljava/lang/String;


# instance fields
.field private appliedThemeValues:Z

.field private containerColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private drawDebugEnabled:Z

.field private drawingViewId:I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end field

.field private elevationShadowEnabled:Z

.field private endContainerColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private endElevation:F

.field private endShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private endView:Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private endViewId:I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end field

.field private fadeMode:I

.field private fadeProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private fitMode:I

.field private holdAtEndEnabled:Z

.field private pathMotionCustom:Z

.field private scaleMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private scaleProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private scrimColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private shapeMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private startContainerColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field

.field private startElevation:F

.field private startShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private startView:Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private startViewId:I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end field

.field private transitionDirection:I


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const-string v0, "materialContainerTransition:bounds"

    .line 2
    .line 3
    const-string v1, "materialContainerTransition:shapeAppearance"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->TRANSITION_PROPS:[Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 14
    .line 15
    const/high16 v1, 0x3e800000    # 0.25f

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-direct {v2, v7, v1}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 22
    .line 23
    const/high16 v8, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-direct {v3, v7, v8}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 29
    .line 30
    invoke-direct {v4, v7, v8}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 31
    .line 32
    .line 33
    new-instance v5, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 34
    .line 35
    const/high16 v1, 0x3f400000    # 0.75f

    .line 36
    .line 37
    invoke-direct {v5, v7, v1}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    move-object v1, v0

    .line 42
    invoke-direct/range {v1 .. v6}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_ENTER_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 46
    .line 47
    new-instance v0, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 48
    .line 49
    new-instance v10, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 50
    .line 51
    const v1, 0x3f19999a    # 0.6f

    .line 52
    .line 53
    .line 54
    const v2, 0x3f666666    # 0.9f

    .line 55
    .line 56
    .line 57
    invoke-direct {v10, v1, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 58
    .line 59
    .line 60
    new-instance v11, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 61
    .line 62
    invoke-direct {v11, v7, v8}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 63
    .line 64
    .line 65
    new-instance v12, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 66
    .line 67
    invoke-direct {v12, v7, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 68
    .line 69
    .line 70
    new-instance v13, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 71
    .line 72
    const v3, 0x3e99999a    # 0.3f

    .line 73
    .line 74
    .line 75
    invoke-direct {v13, v3, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 76
    .line 77
    .line 78
    const/4 v14, 0x0

    .line 79
    move-object v9, v0

    .line 80
    invoke-direct/range {v9 .. v14}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_RETURN_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 84
    .line 85
    new-instance v0, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 86
    .line 87
    new-instance v3, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 88
    .line 89
    const v4, 0x3ecccccd    # 0.4f

    .line 90
    .line 91
    .line 92
    const v5, 0x3dcccccd    # 0.1f

    .line 93
    .line 94
    .line 95
    invoke-direct {v3, v5, v4}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 96
    .line 97
    .line 98
    new-instance v4, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 99
    .line 100
    invoke-direct {v4, v5, v8}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    new-instance v6, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 104
    .line 105
    invoke-direct {v6, v5, v8}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 106
    .line 107
    .line 108
    new-instance v8, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 109
    .line 110
    invoke-direct {v8, v5, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 111
    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    move-object v15, v0

    .line 116
    move-object/from16 v16, v3

    .line 117
    .line 118
    move-object/from16 v17, v4

    .line 119
    .line 120
    move-object/from16 v18, v6

    .line 121
    .line 122
    move-object/from16 v19, v8

    .line 123
    .line 124
    invoke-direct/range {v15 .. v20}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 125
    .line 126
    .line 127
    sput-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_ENTER_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 128
    .line 129
    new-instance v0, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 130
    .line 131
    new-instance v10, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 132
    .line 133
    invoke-direct {v10, v1, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 134
    .line 135
    .line 136
    new-instance v11, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 137
    .line 138
    invoke-direct {v11, v7, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 139
    .line 140
    .line 141
    new-instance v12, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 142
    .line 143
    invoke-direct {v12, v7, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 144
    .line 145
    .line 146
    new-instance v13, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 147
    .line 148
    const v1, 0x3e4ccccd    # 0.2f

    .line 149
    .line 150
    .line 151
    invoke-direct {v13, v1, v2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;-><init>(FF)V

    .line 152
    .line 153
    .line 154
    move-object v9, v0

    .line 155
    invoke-direct/range {v9 .. v14}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 156
    .line 157
    .line 158
    sput-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_RETURN_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 159
    .line 160
    return-void
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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawDebugEnabled:Z

    .line 3
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->holdAtEndEnabled:Z

    .line 4
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->pathMotionCustom:Z

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->appliedThemeValues:Z

    const v1, 0x1020002

    .line 6
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    const/4 v1, -0x1

    .line 7
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startViewId:I

    .line 8
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endViewId:I

    .line 9
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    .line 10
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    .line 11
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    const/high16 v1, 0x52000000

    .line 12
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scrimColor:I

    .line 13
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    .line 14
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeMode:I

    .line 15
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fitMode:I

    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->elevationShadowEnabled:Z

    const/high16 v0, -0x40800000    # -1.0f

    .line 17
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startElevation:F

    .line 18
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endElevation:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawDebugEnabled:Z

    .line 21
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->holdAtEndEnabled:Z

    .line 22
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->pathMotionCustom:Z

    .line 23
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->appliedThemeValues:Z

    const v1, 0x1020002

    .line 24
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    const/4 v1, -0x1

    .line 25
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startViewId:I

    .line 26
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endViewId:I

    .line 27
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    .line 28
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    .line 29
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    const/high16 v1, 0x52000000

    .line 30
    iput v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scrimColor:I

    .line 31
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    .line 32
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeMode:I

    .line 33
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fitMode:I

    .line 34
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    const/4 v3, 0x1

    if-lt v1, v2, :cond_0

    move v0, v3

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->elevationShadowEnabled:Z

    const/high16 v0, -0x40800000    # -1.0f

    .line 35
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startElevation:F

    .line 36
    iput v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endElevation:F

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transition/MaterialContainerTransform;->maybeApplyThemeValues(Landroid/content/Context;Z)V

    .line 38
    iput-boolean v3, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->appliedThemeValues:Z

    return-void
.end method

.method static synthetic access$300(Lcom/google/android/material/transition/MaterialContainerTransform;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->holdAtEndEnabled:Z

    return p0
.end method

.method private buildThresholdsGroup(Z)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroidx/transition/ArcMotion;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    instance-of v0, v0, Lcom/google/android/material/transition/MaterialArcMotion;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_ENTER_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 15
    .line 16
    sget-object v1, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_RETURN_THRESHOLDS:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 17
    .line 18
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/transition/MaterialContainerTransform;->getThresholdsOrDefault(ZLcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_ENTER_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 24
    .line 25
    sget-object v1, Lcom/google/android/material/transition/MaterialContainerTransform;->DEFAULT_RETURN_THRESHOLDS_ARC:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 26
    .line 27
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/material/transition/MaterialContainerTransform;->getThresholdsOrDefault(ZLcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
.end method

.method private static calculateDrawableBounds(Landroid/view/View;Landroid/view/View;FF)Landroid/graphics/RectF;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/material/transition/TransitionUtils;->getLocationOnScreen(Landroid/view/View;)Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p2, p3}, Landroid/graphics/RectF;->offset(FF)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p1, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    int-to-float p2, p2

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-float p0, p0

    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-direct {p1, p3, p3, p2, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    return-object p1
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
.end method

.method private static captureShapeAppearance(Landroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;)Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/shape/ShapeAppearanceModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p2}, Lcom/google/android/material/transition/MaterialContainerTransform;->getShapeAppearance(Landroid/view/View;Lcom/google/android/material/shape/ShapeAppearanceModel;)Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1}, Lcom/google/android/material/transition/TransitionUtils;->convertToRelativeCornerSizes(Lcom/google/android/material/shape/ShapeAppearanceModel;Landroid/graphics/RectF;)Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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
    .line 112
    .line 113
    .line 114
.end method

.method private static captureValues(Landroidx/transition/TransitionValues;Landroid/view/View;ILcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 2
    .param p0    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/material/shape/ShapeAppearanceModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 5
    .line 6
    invoke-static {p1, p2}, Lcom/google/android/material/transition/TransitionUtils;->findDescendantOrAncestorById(Landroid/view/View;I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 19
    .line 20
    sget p2, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of p1, p1, Landroid/view/View;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, p2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 45
    .line 46
    :cond_2
    :goto_0
    iget-object p1, p0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 47
    .line 48
    invoke-static {p1}, Landroidx/core/view/ViewCompat;->isLaidOut(Landroid/view/View;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-nez p2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-nez p2, :cond_4

    .line 71
    .line 72
    invoke-static {p1}, Lcom/google/android/material/transition/TransitionUtils;->getRelativeBounds(Landroid/view/View;)Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-static {p1}, Lcom/google/android/material/transition/TransitionUtils;->getLocationOnScreen(Landroid/view/View;)Landroid/graphics/RectF;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :goto_1
    iget-object v0, p0, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 82
    .line 83
    const-string v1, "materialContainerTransition:bounds"

    .line 84
    .line 85
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 89
    .line 90
    const-string v0, "materialContainerTransition:shapeAppearance"

    .line 91
    .line 92
    invoke-static {p1, p2, p3}, Lcom/google/android/material/transition/MaterialContainerTransform;->captureShapeAppearance(Landroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;)Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_5
    return-void
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
.end method

.method private static getElevationOrDefault(FLandroid/view/View;)F
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p0, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/view/ViewCompat;->getElevation(Landroid/view/View;)F

    move-result p0

    :goto_0
    return p0
.end method

.method private static getShapeAppearance(Landroid/view/View;Lcom/google/android/material/shape/ShapeAppearanceModel;)Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/material/shape/ShapeAppearanceModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    sget p1, Lcom/google/android/material/R$id;->mtrl_motion_snapshot_view:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v0, v0, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/google/android/material/transition/MaterialContainerTransform;->getTransitionShapeAppearanceResId(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, -0x1

    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    invoke-static {p1, v0, p0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    instance-of p1, p0, Lcom/google/android/material/shape/Shapeable;

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    check-cast p0, Lcom/google/android/material/shape/Shapeable;

    .line 47
    .line 48
    invoke-interface {p0}, Lcom/google/android/material/shape/Shapeable;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    invoke-static {}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
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
.end method

.method private getThresholdsOrDefault(ZLcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    move-object p2, p3

    .line 5
    :goto_0
    new-instance p1, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 6
    .line 7
    iget-object p3, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;->access$400(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p3, v0}, Lcom/google/android/material/transition/TransitionUtils;->defaultIfNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    move-object v1, p3

    .line 18
    check-cast v1, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 19
    .line 20
    iget-object p3, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 21
    .line 22
    invoke-static {p2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;->access$500(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p3, v0}, Lcom/google/android/material/transition/TransitionUtils;->defaultIfNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    move-object v2, p3

    .line 31
    check-cast v2, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 32
    .line 33
    iget-object p3, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 34
    .line 35
    invoke-static {p2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;->access$600(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p3, v0}, Lcom/google/android/material/transition/TransitionUtils;->defaultIfNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    move-object v3, p3

    .line 44
    check-cast v3, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 45
    .line 46
    iget-object p3, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->shapeMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 47
    .line 48
    invoke-static {p2}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;->access$700(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p3, p2}, Lcom/google/android/material/transition/TransitionUtils;->defaultIfNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    move-object v4, p2

    .line 57
    check-cast v4, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v0, p1

    .line 61
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;Lcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 62
    .line 63
    .line 64
    return-object p1
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
    .line 112
    .line 113
    .line 114
.end method

.method private static getTransitionShapeAppearanceResId(Landroid/content/Context;)I
    .locals 3
    .annotation build Landroidx/annotation/StyleRes;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sget v1, Lcom/google/android/material/R$attr;->transitionShapeAppearance:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput v1, v0, v2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return v0
    .line 22
    .line 23
    .line 24
.end method

.method private isEntering(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 3
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v0, "Invalid transition direction: "

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    return v2

    .line 39
    :cond_2
    invoke-static {p2}, Lcom/google/android/material/transition/TransitionUtils;->calculateArea(Landroid/graphics/RectF;)F

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-static {p1}, Lcom/google/android/material/transition/TransitionUtils;->calculateArea(Landroid/graphics/RectF;)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    cmpl-float p1, p2, p1

    .line 48
    .line 49
    if-lez p1, :cond_3

    .line 50
    .line 51
    move v1, v2

    .line 52
    :cond_3
    return v1
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
.end method

.method private maybeApplyThemeValues(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    sget v0, Lcom/google/android/material/R$attr;->motionEasingEmphasizedInterpolator:I

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 4
    .line 5
    invoke-static {p0, p1, v0, v1}, Lcom/google/android/material/transition/TransitionUtils;->maybeApplyThemeInterpolator(Landroidx/transition/Transition;Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Z

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget p2, Lcom/google/android/material/R$attr;->motionDurationLong2:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p2, Lcom/google/android/material/R$attr;->motionDurationMedium4:I

    .line 14
    .line 15
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/google/android/material/transition/TransitionUtils;->maybeApplyThemeDuration(Landroidx/transition/Transition;Landroid/content/Context;I)Z

    .line 16
    .line 17
    .line 18
    iget-boolean p2, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->pathMotionCustom:Z

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    sget p2, Lcom/google/android/material/R$attr;->motionPath:I

    .line 23
    .line 24
    invoke-static {p0, p1, p2}, Lcom/google/android/material/transition/TransitionUtils;->maybeApplyThemePath(Landroidx/transition/Transition;Landroid/content/Context;I)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
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


# virtual methods
.method public captureEndValues(Landroidx/transition/TransitionValues;)V
    .locals 3
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endView:Landroid/view/View;

    iget v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endViewId:I

    iget-object v2, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/transition/MaterialContainerTransform;->captureValues(Landroidx/transition/TransitionValues;Landroid/view/View;ILcom/google/android/material/shape/ShapeAppearanceModel;)V

    return-void
.end method

.method public captureStartValues(Landroidx/transition/TransitionValues;)V
    .locals 3
    .param p1    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startView:Landroid/view/View;

    iget v1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startViewId:I

    iget-object v2, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/material/transition/MaterialContainerTransform;->captureValues(Landroidx/transition/TransitionValues;Landroid/view/View;ILcom/google/android/material/shape/ShapeAppearanceModel;)V

    return-void
.end method

.method public createAnimator(Landroid/view/ViewGroup;Landroidx/transition/TransitionValues;Landroidx/transition/TransitionValues;)Landroid/animation/Animator;
    .locals 29
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroidx/transition/TransitionValues;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    iget-object v3, v0, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 15
    .line 16
    const-string v4, "materialContainerTransition:bounds"

    .line 17
    .line 18
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v10, v3

    .line 23
    check-cast v10, Landroid/graphics/RectF;

    .line 24
    .line 25
    iget-object v3, v0, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 26
    .line 27
    const-string v5, "materialContainerTransition:shapeAppearance"

    .line 28
    .line 29
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v11, v3

    .line 34
    check-cast v11, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 35
    .line 36
    if-eqz v10, :cond_7

    .line 37
    .line 38
    if-nez v11, :cond_1

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    iget-object v3, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    move-object v14, v3

    .line 49
    check-cast v14, Landroid/graphics/RectF;

    .line 50
    .line 51
    iget-object v3, v1, Landroidx/transition/TransitionValues;->values:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v15, v3

    .line 58
    check-cast v15, Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 59
    .line 60
    if-eqz v14, :cond_6

    .line 61
    .line 62
    if-nez v15, :cond_2

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_2
    iget-object v4, v0, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 67
    .line 68
    iget-object v5, v1, Landroidx/transition/TransitionValues;->view:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    move-object v0, v5

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move-object v0, v4

    .line 79
    :goto_0
    iget v1, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ne v1, v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroid/view/View;

    .line 92
    .line 93
    move-object v2, v1

    .line 94
    move-object v1, v0

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    iget v1, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    .line 97
    .line 98
    invoke-static {v0, v1}, Lcom/google/android/material/transition/TransitionUtils;->findAncestorById(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object/from16 v28, v2

    .line 103
    .line 104
    move-object v2, v1

    .line 105
    move-object/from16 v1, v28

    .line 106
    .line 107
    :goto_1
    invoke-static {v2}, Lcom/google/android/material/transition/TransitionUtils;->getLocationOnScreen(Landroid/view/View;)Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget v7, v3, Landroid/graphics/RectF;->left:F

    .line 112
    .line 113
    neg-float v7, v7

    .line 114
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 115
    .line 116
    neg-float v3, v3

    .line 117
    invoke-static {v2, v1, v7, v3}, Lcom/google/android/material/transition/MaterialContainerTransform;->calculateDrawableBounds(Landroid/view/View;Landroid/view/View;FF)Landroid/graphics/RectF;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v10, v7, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v14, v7, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v6, v10, v14}, Lcom/google/android/material/transition/MaterialContainerTransform;->isEntering(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    iget-boolean v7, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->appliedThemeValues:Z

    .line 132
    .line 133
    if-nez v7, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {v6, v0, v3}, Lcom/google/android/material/transition/MaterialContainerTransform;->maybeApplyThemeValues(Landroid/content/Context;Z)V

    .line 140
    .line 141
    .line 142
    :cond_5
    new-instance v0, Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;

    .line 143
    .line 144
    move-object v7, v0

    .line 145
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->getPathMotion()Landroidx/transition/PathMotion;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->startElevation:F

    .line 150
    .line 151
    invoke-static {v9, v4}, Lcom/google/android/material/transition/MaterialContainerTransform;->getElevationOrDefault(FLandroid/view/View;)F

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->endElevation:F

    .line 156
    .line 157
    invoke-static {v9, v5}, Lcom/google/android/material/transition/MaterialContainerTransform;->getElevationOrDefault(FLandroid/view/View;)F

    .line 158
    .line 159
    .line 160
    move-result v16

    .line 161
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    .line 162
    .line 163
    move/from16 v17, v9

    .line 164
    .line 165
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    .line 166
    .line 167
    move/from16 v18, v9

    .line 168
    .line 169
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    .line 170
    .line 171
    move/from16 v19, v9

    .line 172
    .line 173
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->scrimColor:I

    .line 174
    .line 175
    move/from16 v20, v9

    .line 176
    .line 177
    iget-boolean v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->elevationShadowEnabled:Z

    .line 178
    .line 179
    move/from16 v22, v9

    .line 180
    .line 181
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeMode:I

    .line 182
    .line 183
    invoke-static {v9, v3}, Lcom/google/android/material/transition/FadeModeEvaluators;->get(IZ)Lcom/google/android/material/transition/FadeModeEvaluator;

    .line 184
    .line 185
    .line 186
    move-result-object v23

    .line 187
    iget v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->fitMode:I

    .line 188
    .line 189
    invoke-static {v9, v3, v10, v14}, Lcom/google/android/material/transition/FitModeEvaluators;->get(IZLandroid/graphics/RectF;Landroid/graphics/RectF;)Lcom/google/android/material/transition/FitModeEvaluator;

    .line 190
    .line 191
    .line 192
    move-result-object v24

    .line 193
    invoke-direct {v6, v3}, Lcom/google/android/material/transition/MaterialContainerTransform;->buildThresholdsGroup(Z)Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;

    .line 194
    .line 195
    .line 196
    move-result-object v25

    .line 197
    iget-boolean v9, v6, Lcom/google/android/material/transition/MaterialContainerTransform;->drawDebugEnabled:Z

    .line 198
    .line 199
    move/from16 v26, v9

    .line 200
    .line 201
    const/16 v27, 0x0

    .line 202
    .line 203
    move-object v9, v4

    .line 204
    move-object v13, v5

    .line 205
    move/from16 v21, v3

    .line 206
    .line 207
    invoke-direct/range {v7 .. v27}, Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;-><init>(Landroidx/transition/PathMotion;Landroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/view/View;Landroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearanceModel;FIIIIZZLcom/google/android/material/transition/FadeModeEvaluator;Lcom/google/android/material/transition/FitModeEvaluator;Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholdsGroup;ZLcom/google/android/material/transition/MaterialContainerTransform$1;)V

    .line 208
    .line 209
    .line 210
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 211
    .line 212
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    iget v7, v1, Landroid/graphics/RectF;->top:F

    .line 217
    .line 218
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    iget v8, v1, Landroid/graphics/RectF;->right:F

    .line 223
    .line 224
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 229
    .line 230
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v0, v3, v7, v8, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 235
    .line 236
    .line 237
    const/4 v1, 0x2

    .line 238
    new-array v1, v1, [F

    .line 239
    .line 240
    fill-array-data v1, :array_0

    .line 241
    .line 242
    .line 243
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    new-instance v1, Lcom/google/android/material/transition/MaterialContainerTransform$1;

    .line 248
    .line 249
    invoke-direct {v1, v6, v0}, Lcom/google/android/material/transition/MaterialContainerTransform$1;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform;Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 253
    .line 254
    .line 255
    new-instance v8, Lcom/google/android/material/transition/MaterialContainerTransform$2;

    .line 256
    .line 257
    move-object v3, v0

    .line 258
    move-object v0, v8

    .line 259
    move-object/from16 v1, p0

    .line 260
    .line 261
    invoke-direct/range {v0 .. v5}, Lcom/google/android/material/transition/MaterialContainerTransform$2;-><init>(Lcom/google/android/material/transition/MaterialContainerTransform;Landroid/view/View;Lcom/google/android/material/transition/MaterialContainerTransform$TransitionDrawable;Landroid/view/View;Landroid/view/View;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v6, v8}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$TransitionListener;)Landroidx/transition/Transition;

    .line 265
    .line 266
    .line 267
    return-object v7

    .line 268
    :cond_6
    :goto_2
    sget-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->TAG:Ljava/lang/String;

    .line 269
    .line 270
    const-string v1, "Skipping due to null end bounds. Ensure end view is laid out and measured."

    .line 271
    .line 272
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    return-object v2

    .line 276
    :cond_7
    :goto_3
    sget-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->TAG:Ljava/lang/String;

    .line 277
    .line 278
    const-string v1, "Skipping due to null start bounds. Ensure start view is laid out and measured."

    .line 279
    .line 280
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    :cond_8
    :goto_4
    return-object v2

    .line 284
    nop

    .line 285
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
.end method

.method public getContainerColor()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    return v0
.end method

.method public getDrawingViewId()I
    .locals 1
    .annotation build Landroidx/annotation/IdRes;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    return v0
.end method

.method public getEndContainerColor()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    return v0
.end method

.method public getEndElevation()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endElevation:F

    return v0
.end method

.method public getEndShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    return-object v0
.end method

.method public getEndView()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endView:Landroid/view/View;

    return-object v0
.end method

.method public getEndViewId()I
    .locals 1
    .annotation build Landroidx/annotation/IdRes;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endViewId:I

    return v0
.end method

.method public getFadeMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeMode:I

    return v0
.end method

.method public getFadeProgressThresholds()Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-object v0
.end method

.method public getFitMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fitMode:I

    return v0
.end method

.method public getScaleMaskProgressThresholds()Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-object v0
.end method

.method public getScaleProgressThresholds()Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-object v0
.end method

.method public getScrimColor()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scrimColor:I

    return v0
.end method

.method public getShapeMaskProgressThresholds()Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->shapeMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-object v0
.end method

.method public getStartContainerColor()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    return v0
.end method

.method public getStartElevation()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startElevation:F

    return v0
.end method

.method public getStartShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    return-object v0
.end method

.method public getStartView()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startView:Landroid/view/View;

    return-object v0
.end method

.method public getStartViewId()I
    .locals 1
    .annotation build Landroidx/annotation/IdRes;
    .end annotation

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startViewId:I

    return v0
.end method

.method public getTransitionDirection()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    return v0
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/google/android/material/transition/MaterialContainerTransform;->TRANSITION_PROPS:[Ljava/lang/String;

    return-object v0
.end method

.method public isDrawDebugEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawDebugEnabled:Z

    return v0
.end method

.method public isElevationShadowEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->elevationShadowEnabled:Z

    return v0
.end method

.method public isHoldAtEndEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->holdAtEndEnabled:Z

    return v0
.end method

.method public setAllContainerColors(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public setContainerColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->containerColor:I

    return-void
.end method

.method public setDrawDebugEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawDebugEnabled:Z

    return-void
.end method

.method public setDrawingViewId(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->drawingViewId:I

    return-void
.end method

.method public setElevationShadowEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->elevationShadowEnabled:Z

    return-void
.end method

.method public setEndContainerColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endContainerColor:I

    return-void
.end method

.method public setEndElevation(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endElevation:F

    return-void
.end method

.method public setEndShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 0
    .param p1    # Lcom/google/android/material/shape/ShapeAppearanceModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    return-void
.end method

.method public setEndView(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endView:Landroid/view/View;

    return-void
.end method

.method public setEndViewId(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->endViewId:I

    return-void
.end method

.method public setFadeMode(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeMode:I

    return-void
.end method

.method public setFadeProgressThresholds(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;)V
    .locals 0
    .param p1    # Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fadeProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-void
.end method

.method public setFitMode(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->fitMode:I

    return-void
.end method

.method public setHoldAtEndEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->holdAtEndEnabled:Z

    return-void
.end method

.method public setPathMotion(Landroidx/transition/PathMotion;)V
    .locals 0
    .param p1    # Landroidx/transition/PathMotion;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/transition/Transition;->setPathMotion(Landroidx/transition/PathMotion;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->pathMotionCustom:Z

    .line 6
    .line 7
    return-void
    .line 8
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
.end method

.method public setScaleMaskProgressThresholds(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;)V
    .locals 0
    .param p1    # Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-void
.end method

.method public setScaleProgressThresholds(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;)V
    .locals 0
    .param p1    # Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scaleProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-void
.end method

.method public setScrimColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->scrimColor:I

    return-void
.end method

.method public setShapeMaskProgressThresholds(Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;)V
    .locals 0
    .param p1    # Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->shapeMaskProgressThresholds:Lcom/google/android/material/transition/MaterialContainerTransform$ProgressThresholds;

    return-void
.end method

.method public setStartContainerColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startContainerColor:I

    return-void
.end method

.method public setStartElevation(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startElevation:F

    return-void
.end method

.method public setStartShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 0
    .param p1    # Lcom/google/android/material/shape/ShapeAppearanceModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startShapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    return-void
.end method

.method public setStartView(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startView:Landroid/view/View;

    return-void
.end method

.method public setStartViewId(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->startViewId:I

    return-void
.end method

.method public setTransitionDirection(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/transition/MaterialContainerTransform;->transitionDirection:I

    return-void
.end method
