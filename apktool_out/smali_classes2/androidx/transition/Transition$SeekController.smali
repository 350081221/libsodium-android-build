.class Landroidx/transition/Transition$SeekController;
.super Landroidx/transition/TransitionListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/TransitionSeekController;
.implements Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationUpdateListener;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x22
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SeekController"
.end annotation


# instance fields
.field private mCurrentPlayTime:J

.field private mIsCanceled:Z

.field private mIsReady:Z

.field private mListenerCache:[Landroidx/core/util/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;"
        }
    .end annotation
.end field

.field private mOnProgressListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;>;"
        }
    .end annotation
.end field

.field private mOnReadyListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;>;"
        }
    .end annotation
.end field

.field private mResetToStartState:Ljava/lang/Runnable;

.field private mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

.field private final mVelocityTracker:Landroidx/transition/VelocityTracker1D;

.field final synthetic this$0:Landroidx/transition/Transition;


# direct methods
.method constructor <init>(Landroidx/transition/Transition;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/transition/TransitionListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 16
    .line 17
    new-instance p1, Landroidx/transition/VelocityTracker1D;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/transition/VelocityTracker1D;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mVelocityTracker:Landroidx/transition/VelocityTracker1D;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Landroidx/transition/Transition$SeekController;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/transition/Transition$SeekController;->lambda$ensureAnimation$0(Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V

    return-void
.end method

.method private callProgressListeners()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    new-array v1, v0, [Landroidx/core/util/Consumer;

    .line 23
    .line 24
    iput-object v1, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, [Landroidx/core/util/Consumer;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-object v2, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    if-ge v3, v0, :cond_2

    .line 41
    .line 42
    aget-object v4, v1, v3

    .line 43
    .line 44
    invoke-interface {v4, p0}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    aput-object v2, v1, v3

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iput-object v1, p0, Landroidx/transition/Transition$SeekController;->mListenerCache:[Landroidx/core/util/Consumer;

    .line 53
    .line 54
    :cond_3
    :goto_1
    return-void
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

.method private ensureAnimation()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mVelocityTracker:Landroidx/transition/VelocityTracker1D;

    .line 7
    .line 8
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-wide v3, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 13
    .line 14
    long-to-float v3, v3

    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroidx/transition/VelocityTracker1D;->addDataPoint(JF)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 19
    .line 20
    new-instance v1, Landroidx/dynamicanimation/animation/FloatValueHolder;

    .line 21
    .line 22
    invoke-direct {v1}, Landroidx/dynamicanimation/animation/FloatValueHolder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Landroidx/dynamicanimation/animation/FloatValueHolder;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 29
    .line 30
    new-instance v0, Landroidx/dynamicanimation/animation/SpringForce;

    .line 31
    .line 32
    invoke-direct {v0}, Landroidx/dynamicanimation/animation/SpringForce;-><init>()V

    .line 33
    .line 34
    .line 35
    const/high16 v1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 38
    .line 39
    .line 40
    const/high16 v1, 0x43480000    # 200.0f

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->setSpring(Landroidx/dynamicanimation/animation/SpringForce;)Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 51
    .line 52
    iget-wide v1, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 53
    .line 54
    long-to-float v1, v1

    .line 55
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setStartValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addUpdateListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationUpdateListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 64
    .line 65
    iget-object v1, p0, Landroidx/transition/Transition$SeekController;->mVelocityTracker:Landroidx/transition/VelocityTracker1D;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/transition/VelocityTracker1D;->calculateVelocity()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setStartVelocity(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    const-wide/16 v3, 0x1

    .line 81
    .line 82
    add-long/2addr v1, v3

    .line 83
    long-to-float v1, v1

    .line 84
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMaxValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 88
    .line 89
    const/high16 v1, -0x40800000    # -1.0f

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMinValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 95
    .line 96
    const/high16 v1, 0x40800000    # 4.0f

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMinimumVisibleChange(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 102
    .line 103
    new-instance v1, Landroidx/transition/d;

    .line 104
    .line 105
    invoke-direct {v1, p0}, Landroidx/transition/d;-><init>(Landroidx/transition/Transition$SeekController;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 109
    .line 110
    .line 111
    return-void
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

.method private synthetic lambda$ensureAnimation$0(Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 6

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    cmpg-float p1, p3, p1

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    const/4 p3, 0x0

    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    move p1, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, p3

    .line 14
    :goto_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 21
    .line 22
    check-cast p1, Landroidx/transition/TransitionSet;

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Landroidx/transition/TransitionSet;->getTransitionAt(I)Landroidx/transition/Transition;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Landroidx/transition/Transition;->access$000(Landroidx/transition/Transition;)Landroidx/transition/Transition;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const/4 p4, 0x0

    .line 33
    invoke-static {p1, p4}, Landroidx/transition/Transition;->access$002(Landroidx/transition/Transition;Landroidx/transition/Transition;)Landroidx/transition/Transition;

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 37
    .line 38
    iget-wide v2, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 39
    .line 40
    const-wide/16 v4, -0x1

    .line 41
    .line 42
    invoke-virtual {p1, v4, v5, v2, v3}, Landroidx/transition/Transition;->setCurrentPlayTimeMillis(JJ)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 46
    .line 47
    invoke-virtual {p1, v0, v1, v4, v5}, Landroidx/transition/Transition;->setCurrentPlayTimeMillis(JJ)V

    .line 48
    .line 49
    .line 50
    iput-wide v0, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 51
    .line 52
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->mResetToStartState:Ljava/lang/Runnable;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/transition/Transition;->mAnimators:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 64
    .line 65
    .line 66
    if-eqz p3, :cond_3

    .line 67
    .line 68
    sget-object p1, Landroidx/transition/Transition$TransitionNotification;->ON_END:Landroidx/transition/Transition$TransitionNotification;

    .line 69
    .line 70
    invoke-virtual {p3, p1, p2}, Landroidx/transition/Transition;->notifyListeners(Landroidx/transition/Transition$TransitionNotification;Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 75
    .line 76
    sget-object p2, Landroidx/transition/Transition$TransitionNotification;->ON_END:Landroidx/transition/Transition$TransitionNotification;

    .line 77
    .line 78
    invoke-virtual {p1, p2, p3}, Landroidx/transition/Transition;->notifyListeners(Landroidx/transition/Transition$TransitionNotification;Z)V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void
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


# virtual methods
.method public addOnProgressChangedListener(Landroidx/core/util/Consumer;)V
    .locals 1
    .param p1    # Landroidx/core/util/Consumer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
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

.method public addOnReadyListener(Landroidx/core/util/Consumer;)V
    .locals 1
    .param p1    # Landroidx/core/util/Consumer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->isReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
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

.method public animateToEnd()V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/transition/Transition$SeekController;->ensureAnimation()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    add-long/2addr v1, v3

    .line 13
    long-to-float v1, v1

    .line 14
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public animateToStart(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mResetToStartState:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/transition/Transition$SeekController;->ensureAnimation()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

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
    .line 22
    .line 23
    .line 24
.end method

.method public getCurrentFraction()F
    .locals 3

    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getCurrentPlayTimeMillis()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public getCurrentPlayTimeMillis()J
    .locals 6

    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDurationMillis()J
    .locals 2

    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    invoke-virtual {v0}, Landroidx/transition/Transition;->getTotalDurationMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method initPlayTime()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v2, 0x1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 14
    .line 15
    iget-wide v4, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3, v4, v5}, Landroidx/transition/Transition;->setCurrentPlayTimeMillis(JJ)V

    .line 18
    .line 19
    .line 20
    iput-wide v2, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 21
    .line 22
    return-void
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
.end method

.method public isReady()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/transition/Transition$SeekController;->mIsReady:Z

    return v0
.end method

.method public onAnimationUpdate(Landroidx/dynamicanimation/animation/DynamicAnimation;FF)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    float-to-double p1, p2

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    const-wide/16 v0, -0x1

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iget-object p3, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 24
    .line 25
    iget-wide v0, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 26
    .line 27
    invoke-virtual {p3, p1, p2, v0, v1}, Landroidx/transition/Transition;->setCurrentPlayTimeMillis(JJ)V

    .line 28
    .line 29
    .line 30
    iput-wide p1, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 31
    .line 32
    invoke-direct {p0}, Landroidx/transition/Transition$SeekController;->callProgressListeners()V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public onTransitionCancel(Landroidx/transition/Transition;)V
    .locals 0
    .param p1    # Landroidx/transition/Transition;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/transition/Transition$SeekController;->mIsCanceled:Z

    return-void
.end method

.method public ready()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/transition/Transition$SeekController;->mIsReady:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Landroidx/core/util/Consumer;

    .line 23
    .line 24
    invoke-interface {v2, p0}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-direct {p0}, Landroidx/transition/Transition$SeekController;->callProgressListeners()V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public removeOnProgressChangedListener(Landroidx/core/util/Consumer;)V
    .locals 1
    .param p1    # Landroidx/core/util/Consumer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnProgressListeners:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

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
    .line 22
    .line 23
    .line 24
.end method

.method public removeOnReadyListener(Landroidx/core/util/Consumer;)V
    .locals 1
    .param p1    # Landroidx/core/util/Consumer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Consumer<",
            "Landroidx/transition/TransitionSeekController;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Landroidx/transition/Transition$SeekController;->mOnReadyListeners:Ljava/util/ArrayList;

    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setCurrentFraction(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    long-to-float v0, v0

    .line 10
    mul-float/2addr p1, v0

    .line 11
    float-to-long v0, p1

    .line 12
    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition$SeekController;->setCurrentPlayTimeMillis(J)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "setCurrentFraction() called after animation has been started"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
.end method

.method public setCurrentPlayTimeMillis(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mSpringAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    iget-wide v0, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 6
    .line 7
    cmp-long v0, p1, v0

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->isReady()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-boolean v0, p0, Landroidx/transition/Transition$SeekController;->mIsCanceled:Z

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    cmp-long v2, p1, v0

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    iget-wide v2, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 29
    .line 30
    cmp-long v0, v2, v0

    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    const-wide/16 p1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroidx/transition/Transition$SeekController;->getDurationMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    cmp-long v2, p1, v0

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    iget-wide v2, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 46
    .line 47
    cmp-long v2, v2, v0

    .line 48
    .line 49
    if-gez v2, :cond_2

    .line 50
    .line 51
    const-wide/16 p1, 0x1

    .line 52
    .line 53
    add-long/2addr v0, p1

    .line 54
    move-wide p1, v0

    .line 55
    :cond_2
    :goto_0
    iget-wide v0, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 56
    .line 57
    cmp-long v2, p1, v0

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, Landroidx/transition/Transition$SeekController;->this$0:Landroidx/transition/Transition;

    .line 62
    .line 63
    invoke-virtual {v2, p1, p2, v0, v1}, Landroidx/transition/Transition;->setCurrentPlayTimeMillis(JJ)V

    .line 64
    .line 65
    .line 66
    iput-wide p1, p0, Landroidx/transition/Transition$SeekController;->mCurrentPlayTime:J

    .line 67
    .line 68
    :cond_3
    invoke-direct {p0}, Landroidx/transition/Transition$SeekController;->callProgressListeners()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Landroidx/transition/Transition$SeekController;->mVelocityTracker:Landroidx/transition/VelocityTracker1D;

    .line 72
    .line 73
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    long-to-float p1, p1

    .line 78
    invoke-virtual {v0, v1, v2, p1}, Landroidx/transition/VelocityTracker1D;->addDataPoint(JF)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_1
    return-void

    .line 82
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string p2, "setCurrentPlayTimeMillis() called after animation has been started"

    .line 85
    .line 86
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
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
