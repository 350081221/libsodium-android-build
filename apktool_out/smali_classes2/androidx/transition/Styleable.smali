.class Landroidx/transition/Styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Styleable$PatternPathMotion;,
        Landroidx/transition/Styleable$ArcMotion;,
        Landroidx/transition/Styleable$TransitionSet;,
        Landroidx/transition/Styleable$Slide;,
        Landroidx/transition/Styleable$ChangeTransform;,
        Landroidx/transition/Styleable$Fade;,
        Landroidx/transition/Styleable$VisibilityTransition;,
        Landroidx/transition/Styleable$ChangeBounds;,
        Landroidx/transition/Styleable$Transition;,
        Landroidx/transition/Styleable$TransitionManager;,
        Landroidx/transition/Styleable$TransitionTarget;
    }
.end annotation


# static fields
.field static final ARC_MOTION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final CHANGE_BOUNDS:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final CHANGE_TRANSFORM:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final FADE:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final PATTERN_PATH_MOTION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final SLIDE:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_MANAGER:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_SET:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final TRANSITION_TARGET:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field

.field static final VISIBILITY_TRANSITION:[I
    .annotation build Landroidx/annotation/StyleableRes;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/transition/Styleable;->TRANSITION_TARGET:[I

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v1, Landroidx/transition/Styleable;->TRANSITION_MANAGER:[I

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    new-array v1, v1, [I

    .line 19
    .line 20
    fill-array-data v1, :array_2

    .line 21
    .line 22
    .line 23
    sput-object v1, Landroidx/transition/Styleable;->TRANSITION:[I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    new-array v2, v1, [I

    .line 27
    .line 28
    const v3, 0x10104cf

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    aput v3, v2, v4

    .line 33
    .line 34
    sput-object v2, Landroidx/transition/Styleable;->CHANGE_BOUNDS:[I

    .line 35
    .line 36
    new-array v2, v1, [I

    .line 37
    .line 38
    const v3, 0x101047c

    .line 39
    .line 40
    .line 41
    aput v3, v2, v4

    .line 42
    .line 43
    sput-object v2, Landroidx/transition/Styleable;->VISIBILITY_TRANSITION:[I

    .line 44
    .line 45
    new-array v2, v1, [I

    .line 46
    .line 47
    const v3, 0x10103e1

    .line 48
    .line 49
    .line 50
    aput v3, v2, v4

    .line 51
    .line 52
    sput-object v2, Landroidx/transition/Styleable;->FADE:[I

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    new-array v2, v2, [I

    .line 56
    .line 57
    fill-array-data v2, :array_3

    .line 58
    .line 59
    .line 60
    sput-object v2, Landroidx/transition/Styleable;->CHANGE_TRANSFORM:[I

    .line 61
    .line 62
    new-array v2, v1, [I

    .line 63
    .line 64
    const v3, 0x1010430

    .line 65
    .line 66
    .line 67
    aput v3, v2, v4

    .line 68
    .line 69
    sput-object v2, Landroidx/transition/Styleable;->SLIDE:[I

    .line 70
    .line 71
    new-array v2, v1, [I

    .line 72
    .line 73
    const v3, 0x10103e0

    .line 74
    .line 75
    .line 76
    aput v3, v2, v4

    .line 77
    .line 78
    sput-object v2, Landroidx/transition/Styleable;->TRANSITION_SET:[I

    .line 79
    .line 80
    new-array v0, v0, [I

    .line 81
    .line 82
    fill-array-data v0, :array_4

    .line 83
    .line 84
    .line 85
    sput-object v0, Landroidx/transition/Styleable;->ARC_MOTION:[I

    .line 86
    .line 87
    new-array v0, v1, [I

    .line 88
    .line 89
    const v1, 0x10104ca

    .line 90
    .line 91
    .line 92
    aput v1, v0, v4

    .line 93
    .line 94
    sput-object v0, Landroidx/transition/Styleable;->PATTERN_PATH_MOTION:[I

    .line 95
    .line 96
    return-void

    .line 97
    :array_0
    .array-data 4
        0x101002f
        0x10103dc
        0x1010441
        0x1010442
        0x101044d
        0x101044e
    .end array-data

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
    :array_1
    .array-data 4
        0x10103dd
        0x10103de
        0x10103df
    .end array-data

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
    :array_2
    .array-data 4
        0x1010141
        0x1010198
        0x10103e2
        0x101044f
    .end array-data

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
    :array_3
    .array-data 4
        0x10104bc
        0x10104bd
    .end array-data

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :array_4
    .array-data 4
        0x101047d
        0x101047e
        0x101047f
    .end array-data
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
