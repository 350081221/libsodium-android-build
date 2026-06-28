.class final Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;
.super Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate<",
        "Landroid/animation/ObjectAnimator;",
        ">;"
    }
.end annotation


# static fields
.field private static final ANIMATION_FRACTION:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final DURATION_PER_CYCLE_IN_MS:I = 0x14d

.field private static final TOTAL_DURATION_IN_MS:I = 0x29b


# instance fields
.field private animationFraction:F

.field private animator:Landroid/animation/ObjectAnimator;

.field private final baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

.field private dirtyColors:Z

.field private interpolator:Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

.field private newIndicatorColorIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate$2;

    const-class v1, Ljava/lang/Float;

    const-string v2, "animationFraction"

    invoke-direct {v0, v1, v2}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 1
    .param p1    # Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->newIndicatorColorIndex:I

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 9
    .line 10
    new-instance p1, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 11
    .line 12
    invoke-direct {p1}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->interpolator:Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method static synthetic access$000(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;)I
    .locals 0

    iget p0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->newIndicatorColorIndex:I

    return p0
.end method

.method static synthetic access$002(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->newIndicatorColorIndex:I

    return p1
.end method

.method static synthetic access$100(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;)Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    return-object p0
.end method

.method static synthetic access$202(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->dirtyColors:Z

    return p1
.end method

.method static synthetic access$300(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;)F
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->getAnimationFraction()F

    move-result p0

    return p0
.end method

.method private getAnimationFraction()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animationFraction:F

    return v0
.end method

.method private maybeInitializeAnimators()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [F

    .line 9
    .line 10
    fill-array-data v1, :array_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    const-wide/16 v1, 0x14d

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    new-instance v1, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate$1;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate$1;-><init>(Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void

    .line 47
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
.end method

.method private maybeUpdateSegmentColors()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->dirtyColors:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 15
    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    cmpg-float v0, v0, v2

    .line 19
    .line 20
    if-gez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 38
    .line 39
    iget v2, v2, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 40
    .line 41
    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 59
    .line 60
    iget v1, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 61
    .line 62
    iput v1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 73
    .line 74
    iget-object v1, v1, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 75
    .line 76
    iget v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->newIndicatorColorIndex:I

    .line 77
    .line 78
    aget v1, v1, v3

    .line 79
    .line 80
    iput v1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 81
    .line 82
    iput-boolean v2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->dirtyColors:Z

    .line 83
    .line 84
    :cond_0
    return-void
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

.method private updateSegmentPositions(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput v2, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    .line 12
    .line 13
    const/16 v0, 0x29b

    .line 14
    .line 15
    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->interpolator:Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 37
    .line 38
    invoke-virtual {v3, p1}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;->getInterpolation(F)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iput v3, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    .line 43
    .line 44
    iput v3, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 45
    .line 46
    const v0, 0x3eff9dbf

    .line 47
    .line 48
    .line 49
    add-float/2addr p1, v0

    .line 50
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->interpolator:Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 68
    .line 69
    invoke-virtual {v3, p1}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;->getInterpolation(F)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput p1, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    .line 74
    .line 75
    iput p1, v0, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 76
    .line 77
    iget-object p1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 84
    .line 85
    const/high16 v0, 0x3f800000    # 1.0f

    .line 86
    .line 87
    iput v0, p1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 88
    .line 89
    return-void
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
.end method


# virtual methods
.method public cancelAnimatorImmediately()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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
.end method

.method public invalidateSpecValues()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->resetPropertiesForNewStart()V

    return-void
.end method

.method public registerAnimatorsCompleteCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V
    .locals 0
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public requestCancelAnimatorAfterCurrentCycle()V
    .locals 0

    return-void
.end method

.method resetPropertiesForNewStart()V
    .locals 5
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->dirtyColors:Z

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->newIndicatorColorIndex:I

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 25
    .line 26
    iget-object v3, v2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aget v3, v3, v4

    .line 30
    .line 31
    iput v3, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 32
    .line 33
    iget v2, v2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorTrackGapSize:I

    .line 34
    .line 35
    div-int/lit8 v2, v2, 0x2

    .line 36
    .line 37
    iput v2, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->gapSize:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
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
.end method

.method setAnimationFraction(F)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iput p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animationFraction:F

    .line 2
    .line 3
    const v0, 0x43a68000    # 333.0f

    .line 4
    .line 5
    .line 6
    mul-float/2addr p1, v0

    .line 7
    float-to-int p1, p1

    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->updateSegmentPositions(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->maybeUpdateSegmentColors()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->drawable:Lcom/google/android/material/progressindicator/IndeterminateDrawable;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public startAnimator()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->maybeInitializeAnimators()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->resetPropertiesForNewStart()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateContiguousAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public unregisterAnimatorsCompleteCallback()V
    .locals 0

    return-void
.end method
