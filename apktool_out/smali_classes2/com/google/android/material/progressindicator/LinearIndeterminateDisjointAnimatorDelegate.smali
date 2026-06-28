.class final Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;
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
            "Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final DELAY_TO_MOVE_SEGMENT_ENDS:[I

.field private static final DURATION_TO_MOVE_SEGMENT_ENDS:[I

.field private static final TOTAL_DURATION_IN_MS:I = 0x708


# instance fields
.field private animationFraction:F

.field private animator:Landroid/animation/ObjectAnimator;

.field animatorCompleteCallback:Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;

.field private final baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

.field private completeEndAnimator:Landroid/animation/ObjectAnimator;

.field private dirtyColors:Z

.field private indicatorColorIndex:I

.field private final interpolatorArray:[Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->DURATION_TO_MOVE_SEGMENT_ENDS:[I

    .line 8
    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    fill-array-data v0, :array_1

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->DELAY_TO_MOVE_SEGMENT_ENDS:[I

    .line 15
    .line 16
    new-instance v0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$3;

    .line 17
    .line 18
    const-class v1, Ljava/lang/Float;

    .line 19
    .line 20
    const-string v2, "animationFraction"

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :array_0
    .array-data 4
        0x215
        0x237
        0x352
        0x2ee
    .end array-data

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
    :array_1
    .array-data 4
        0x4f3
        0x3e8
        0x14d
        0x0
    .end array-data
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

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput v1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->indicatorColorIndex:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animatorCompleteCallback:Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    new-array p2, p2, [Landroid/view/animation/Interpolator;

    .line 15
    .line 16
    sget v2, Lcom/google/android/material/R$anim;->linear_indeterminate_line1_head_interpolator:I

    .line 17
    .line 18
    invoke-static {p1, v2}, Landroidx/vectordrawable/graphics/drawable/AnimationUtilsCompat;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    aput-object v2, p2, v1

    .line 23
    .line 24
    sget v1, Lcom/google/android/material/R$anim;->linear_indeterminate_line1_tail_interpolator:I

    .line 25
    .line 26
    invoke-static {p1, v1}, Landroidx/vectordrawable/graphics/drawable/AnimationUtilsCompat;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v1, p2, v2

    .line 32
    .line 33
    sget v1, Lcom/google/android/material/R$anim;->linear_indeterminate_line2_head_interpolator:I

    .line 34
    .line 35
    invoke-static {p1, v1}, Landroidx/vectordrawable/graphics/drawable/AnimationUtilsCompat;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    aput-object v1, p2, v0

    .line 40
    .line 41
    sget v0, Lcom/google/android/material/R$anim;->linear_indeterminate_line2_tail_interpolator:I

    .line 42
    .line 43
    invoke-static {p1, v0}, Landroidx/vectordrawable/graphics/drawable/AnimationUtilsCompat;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v0, 0x3

    .line 48
    aput-object p1, p2, v0

    .line 49
    .line 50
    iput-object p2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->interpolatorArray:[Landroid/view/animation/Interpolator;

    .line 51
    .line 52
    return-void
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

.method static synthetic access$000(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;)I
    .locals 0

    iget p0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->indicatorColorIndex:I

    return p0
.end method

.method static synthetic access$002(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->indicatorColorIndex:I

    return p1
.end method

.method static synthetic access$100(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;)Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    return-object p0
.end method

.method static synthetic access$202(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->dirtyColors:Z

    return p1
.end method

.method static synthetic access$300(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;)F
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->getAnimationFraction()F

    move-result p0

    return p0
.end method

.method private getAnimationFraction()F
    .locals 1

    iget v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animationFraction:F

    return v0
.end method

.method private maybeInitializeAnimators()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x708

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    new-array v4, v4, [F

    .line 12
    .line 13
    fill-array-data v4, :array_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 21
    .line 22
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 31
    .line 32
    const/4 v4, -0x1

    .line 33
    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    new-instance v4, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$1;

    .line 39
    .line 40
    invoke-direct {v4, p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$1;-><init>(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    sget-object v0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->ANIMATION_FRACTION:Landroid/util/Property;

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    new-array v4, v4, [F

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/high16 v6, 0x3f800000    # 1.0f

    .line 57
    .line 58
    aput v6, v4, v5

    .line 59
    .line 60
    invoke-static {p0, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 65
    .line 66
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 75
    .line 76
    new-instance v1, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$2;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate$2;-><init>(Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void

    .line 85
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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

.method private maybeUpdateSegmentColors()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->dirtyColors:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 24
    .line 25
    iget-object v2, v2, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 26
    .line 27
    iget v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->indicatorColorIndex:I

    .line 28
    .line 29
    aget v2, v2, v3

    .line 30
    .line 31
    iput v2, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->dirtyColors:Z

    .line 36
    .line 37
    :cond_1
    return-void
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
.end method

.method private updateSegmentPositions(I)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 17
    .line 18
    sget-object v2, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->DELAY_TO_MOVE_SEGMENT_ENDS:[I

    .line 19
    .line 20
    mul-int/lit8 v3, v0, 0x2

    .line 21
    .line 22
    aget v4, v2, v3

    .line 23
    .line 24
    sget-object v5, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->DURATION_TO_MOVE_SEGMENT_ENDS:[I

    .line 25
    .line 26
    aget v6, v5, v3

    .line 27
    .line 28
    invoke-virtual {p0, p1, v4, v6}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object v6, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->interpolatorArray:[Landroid/view/animation/Interpolator;

    .line 33
    .line 34
    aget-object v6, v6, v3

    .line 35
    .line 36
    invoke-interface {v6, v4}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v6, 0x0

    .line 41
    const/high16 v7, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-static {v4, v6, v7}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iput v4, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->startFraction:F

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    aget v2, v2, v3

    .line 52
    .line 53
    aget v4, v5, v3

    .line 54
    .line 55
    invoke-virtual {p0, p1, v2, v4}, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->getFractionInRange(III)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v4, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->interpolatorArray:[Landroid/view/animation/Interpolator;

    .line 60
    .line 61
    aget-object v3, v4, v3

    .line 62
    .line 63
    invoke-interface {v3, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2, v6, v7}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iput v2, v1, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->endFraction:F

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
    .line 77
    .line 78
.end method


# virtual methods
.method public cancelAnimatorImmediately()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

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

    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->resetPropertiesForNewStart()V

    return-void
.end method

.method public registerAnimatorsCompleteCallback(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;)V
    .locals 0
    .param p1    # Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animatorCompleteCallback:Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;

    return-void
.end method

.method public requestCancelAnimatorAfterCurrentCycle()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->cancelAnimatorImmediately()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->drawable:Lcom/google/android/material/progressindicator/IndeterminateDrawable;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    new-array v1, v1, [F

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iget v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animationFraction:F

    .line 30
    .line 31
    aput v3, v1, v2

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/high16 v3, 0x3f800000    # 1.0f

    .line 35
    .line 36
    aput v3, v1, v2

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 42
    .line 43
    iget v1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animationFraction:F

    .line 44
    .line 45
    sub-float/2addr v3, v1

    .line 46
    const/high16 v1, 0x44e10000    # 1800.0f

    .line 47
    .line 48
    mul-float/2addr v3, v1

    .line 49
    float-to-long v1, v3

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->completeEndAnimator:Landroid/animation/ObjectAnimator;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    return-void
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

.method resetPropertiesForNewStart()V
    .locals 4
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->indicatorColorIndex:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->activeIndicators:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->baseSpec:Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;

    .line 23
    .line 24
    iget-object v3, v3, Lcom/google/android/material/progressindicator/BaseProgressIndicatorSpec;->indicatorColors:[I

    .line 25
    .line 26
    aget v3, v3, v0

    .line 27
    .line 28
    iput v3, v2, Lcom/google/android/material/progressindicator/DrawingDelegate$ActiveIndicator;->color:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
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
.end method

.method setAnimationFraction(F)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iput p1, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animationFraction:F

    .line 2
    .line 3
    const/high16 v0, 0x44e10000    # 1800.0f

    .line 4
    .line 5
    mul-float/2addr p1, v0

    .line 6
    float-to-int p1, p1

    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->updateSegmentPositions(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->maybeUpdateSegmentColors()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/progressindicator/IndeterminateAnimatorDelegate;->drawable:Lcom/google/android/material/progressindicator/IndeterminateDrawable;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public startAnimator()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->maybeInitializeAnimators()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->resetPropertiesForNewStart()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animator:Landroid/animation/ObjectAnimator;

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
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/progressindicator/LinearIndeterminateDisjointAnimatorDelegate;->animatorCompleteCallback:Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;

    return-void
.end method
